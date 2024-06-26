package Pertemuan_7.mergeSort;
  
class MergeSortTest {
  
    // method mergeSort yang menerima parameter data array yang akan diurutkan
    public void mergeSort(int[] data) {
        sort(data, 0, data.length -1);
    }

    // method merge untuk penggabungan data dari bagian kiri dan kanan
    public void merge(int data[], int left, int middle, int right){
        int[] temp = new int[data.length];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a<= middle && b <= right){
            if (temp[a] <= temp[b]) {
                data[c] = temp [a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i=0; i<=s; i++){
            data[c + i] = temp[a + i];
        }
    }
    
    public void sort(int data[], int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
  }