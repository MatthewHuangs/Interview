package com.ustc.sort;

/**
 * 堆排序
 * @Author Matthew Huang
 * @Date 2019/2/22 14:44
 */
public class HeapSort {
//    public static void heapSort(int[] array){
//        buildHeapMax(array);
//        while (com.ustc.test.Test.len > 0){
//            Util.swapInt(array, 0 , com.ustc.test.Test.len - 1);
//            --com.ustc.test.Test.len;
//            adjustHeapMax(array, 0);
//        }
//
//        for (int a: array) {
//            System.out.print(a + "  ");
//        }
//        System.out.println();
//    }
//
//
//    private static void buildHeapMax(int[] array){
//        for (int i = com.ustc.test.Test.len / 2 - 1; i >= 0; --i){
//            adjustHeapMax(array, i);
//        }
//    }
//
//    private static void adjustHeapMax(int[] array, int i){
//        int max = i;
//        // 如果存在左子树，且左子树大于父节点，则交换
//        if (2*(i+1)-1 < com.ustc.test.Test.len && array[2*(i+1)-1] > array[max]){
//            max = 2*(i+1)-1;
//        }
//        // 如果存在右子树，且右子树大于父节点，则交换
//        if (2*(i+1) < com.ustc.test.Test.len && array[2*(i+1)] > array[max]){
//            max = 2*(i+1);
//        }
//        if (max != i){
//            Util.swapInt(array, max, i);
//            adjustHeapMax(array, max);// 不能忘记！
//        }
//    }
}

