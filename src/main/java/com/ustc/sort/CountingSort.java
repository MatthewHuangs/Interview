package com.ustc.sort;

import java.util.Arrays;

/**
 * @Author Matthew Huang
 * @Date 2019/2/23 19:48
 */
public class CountingSort {
//    public static void countingSort(int[] array){
//        // ����������Сֵ
//        int min = array[0], max = array[0];
//        for (int i = 1; i < array.length; ++i){
//            min = Math.min(array[i], min);
//            max = Math.max(array[i], max);
//        }
//
//        // ����Ͱ
//        int base = 0 - min;
//        int[] bucket = new int[max - min + 1];
//        Arrays.fill(bucket, 0);
//        for (int i = 0; i < array.length; ++i){
//            ++bucket[array[i] + base];
//        }
//
//        // ���Ͱ�е����ݵ�����������
//        int i = 0, iBucket = 0;
//        while (i < array.length){// ����� for �����򲻺ñ�ʾ
//            if (bucket[iBucket] != 0){
//                array[i] = iBucket - base;
//                --bucket[iBucket];
//                ++i;// ֻ�в�������ʱ��i �ż�һ
//            }else {
//                ++iBucket;
//            }
//        }
//
//        for (int a: array) {
//            System.out.print(a + "  ");
//        }
//        System.out.println();
//    }
}

