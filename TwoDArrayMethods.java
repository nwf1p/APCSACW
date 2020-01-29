public class TwoDArrayMethods
{

public static void main(String[] args)
{
// Decaling a 2D array in one line of code, to be used for testing
int[][] board = {{2, 4, 6, 8},
{1, 2, 7, 9},
{4, 6, 1, 10},
{1, 3, 11, 2}};

// These are the method calls for the static methods you will define
printMatrix(board);
findTotal(board);
findMax(board);
sumRows(board);
sumColumns(board);
largestinRows(board);
largestinColumns(board);
System.out.println(isSquare(board));
System.out.println(isRowMagic(board));
}

/* #1 Write a method for printing the elements in an array. Each row should
* be on its own line, so that the 2D array prints as a matrix of data

*/
public static void printMatrix(int[][] matrix)
{
    for (int a = 0; a < matrix.length; a++)
        for(int b = 0; b < matrix[0].length; b++)
            System.out.print(matrix[a][b] + " ");
}
/*
* #2 Write a method to print the sum of all elements in the array. The
* The output should read:
* &quot;The sum of all elements in the array is 77
*/
public static void findTotal(int[][] matrix)
{
    int sum = 0;
    for (int c = 0; c < matrix.length; c++)
        for(int d = 0; d < matrix[0].length; d++)
            sum += matrix[c][d];
    System.out.println("\nThe sum of all elements in the array is " + sum);
}
/*
* #3 Write a method that prints the maximum value in the entire 2D array.
* For example, this method call in our main method on page 1 should read:
* &quot;The maximum value in the entire matrix is 11
*/
public static void findMax(int[][] matrix)
{
    int max = -999999999;
    for (int e = 0; e < matrix.length; e++)
        for(int f = 0; f < matrix[0].length; f++)
            if (matrix[e][f] > max)
                max = matrix[e][f];
    System.out.println ("The maximum value in the entire matrix is " + max);
}

/* #4 Write a method for printing the sum of each row in the array

* For example, this method call in our main method should output:
* &quot;The sum of the elements in row 0 is 20.&quot;
* &quot;The sum of the elements in row 1 is 19.&quot; etc.
*/
public static void sumRows(int[][] matrix)
{
    int rowsum = 0;
    for (int g = 0; g < matrix.length; g++)
        {for(int h = 0; h < matrix[0].length; h++)
            rowsum += matrix[g][h];
        System.out.println(" The sum of the elements in row " + g + " is " + rowsum + ".");
    rowsum = 0;}
}

/* #5 Write a method for finding the sum of each column in the array
* For example, this method call in our main method should output:
* &quot;The sum of the elements in column 0 is 8&quot;
* &quot;The sum of the elements in column 1 is 15&quot; etc.
*/
public static void sumColumns(int[][] matrix)
{
    int colsum = 0;
    for (int i = 0; i < matrix[0].length; i++)
       {for(int j = 0; j < matrix.length; j++)
            colsum += matrix[j][i];
        System.out.println(" The sum of the elements in column " + i + " is " + colsum + ".");
    colsum = 0;
    }
}
/* #6 Write a method for printing the largest value in each row.
* For example, this method call in our main method should output:

* &quot;The largest value in row 0 is 8&quot; etc.
* &quot;The largest value in row 1 is 9&quot; etc.
*/
public static void largestinRows(int[][] matrix)
{
    int rowmax = -999999999;
    for (int k = 0; k < matrix.length; k++)
        {for(int l = 0; l < matrix[0].length; l++)
            if (matrix [k][l] > rowmax)
                rowmax = matrix [k][l];
        System.out.println ("The largest value in row " + k + " is " + rowmax);
        rowmax = -99999999;}
}
/* #7 Write a method for printing the largest value in each column.
* For example, this method call in our main method should output:
* &quot;The largest value in column 0 is 4&quot; etc.
* &quot;The largest value in column 1 is 6&quot; etc.
*/
public static void largestinColumns(int[][] matrix)
{
    int colmax = -999999999;
    for (int m = 0; m < matrix[0].length; m++)
        {for(int n = 0; n < matrix.length; n++)
            if (matrix [n][m] > colmax)
                colmax = matrix [n][m];
        System.out.println ("The largest value in column " + m + " is " + colmax);
        colmax = -99999999;}
}

/*
* #8 Write a method that checks if the array is a square matrix

* A square matrix has the same number of rows and columns!
*/
public static boolean isSquare(int[][] matrix)
{
    int numrows = matrix.length;
    int numcols = matrix[0].length;
    if (numrows == numcols)
        return true;
    return false;
}
/*
* #9 Write a method that checks if the array is &quot;row-magic&quot;, which means
* that every row has the same row sum. You will need to change the values of
* the test array in the main method to do this.
*/
public static boolean isRowMagic(int[][] matrix)
{
    int inrowsum = 0;
    int inrowsto = 0;
    for (int o = 0; o < matrix.length; o++)
        {inrowsum = 0;
         for(int p = 0; p < matrix[0].length; p++)
            inrowsum += matrix[o][p];
         if (o == 0 || (o != 0 && inrowsum == inrowsto/o))
            inrowsto += inrowsum;
        }
    if (inrowsto == inrowsum*matrix[0].length)
        return true;
    return false;

}
}