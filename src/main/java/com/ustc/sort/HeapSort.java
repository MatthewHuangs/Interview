package com.ustc.sort;

/**
 * ������
 * @Author Matthew Huang
 * @Date 2019/2/22 14:44
 */
public class HeapSort {
    public static void heapSort(int[] array){
        buildHeapMax(array);
        while (Test.len > 0){
            Util.swapInt(array, 0 , Test.len - 1);
            --Test.len;
            adjustHeapMax(array, 0);
        }

        Util.show(array);
    }


    private static void buildHeapMax(int[] array){
        for (int i = Test.len / 2 - 1; i >= 0; --i){
            adjustHeapMax(array, i);
        }
    }

    private static void adjustHeapMax(int[] array, int i){
        int max = i;
        // ��������������������������ڸ��ڵ㣬�򽻻�
        if (2*(i+1)-1 < Test.len && array[2*(i+1)-1] > array[max]){
            max = 2*(i+1)-1;
        }
        // ��������������������������ڸ��ڵ㣬�򽻻�
        if (2*(i+1) < Test.len && array[2*(i+1)] > array[max]){
            max = 2*(i+1);
        }
        if (max != i){
            Util.swapInt(array, max, i);
            adjustHeapMax(array, max);// �������ǣ�
        }
    }
}

