import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

       SelectionSort ss = new SelectionSort();
       int [] store = ss.basicSelectionSort(arr);
       assertArrayEquals(Sortedarr,store);
    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -5;
        arr[1] = -7;
        arr[2] = -9;
        arr[3] = -10;
        arr[4] = -4;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -7;
        Sortedarr[3] = -5;
        Sortedarr[4] = -4;

        SelectionSort ss = new SelectionSort();
        int [] store = ss.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,store);

    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 0;
        arr[3] = -2;
        arr[4] = 11;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 9;
        Sortedarr[4] = 11;

        SelectionSort ss = new SelectionSort();
        int [] store = ss.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,store);

    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 6;
        arr[1] = 6;
        arr[2] = 9;
        arr[3] = 8;
        arr[4] = 8;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 6;
        Sortedarr[1] = 6;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 9;

        SelectionSort ss = new SelectionSort();
        int [] store = ss.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,store);
    }


}
