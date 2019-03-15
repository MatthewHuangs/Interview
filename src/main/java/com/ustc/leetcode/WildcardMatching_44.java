package com.ustc.leetcode;

import org.junit.Test;

/**
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.
 * @Author Matthew Huang
 * @Date 2019/3/15 23:02
 */
public class WildcardMatching_44 {
    @Test
    public void test(){
        String s = "";
        String p = "";
        System.out.println(isMatch(s, p));
    }

    public boolean isMatch(String s, String p){
        int sPosition = 0;
        int pPosition = 0;
        int star = 0;       // '*'��ʼ��λ��
        int match = -1;     //

        while (sPosition < s.length()){
            // ����1����s��p�ĵ�ǰλ���ַ���ͬ
            if (pPosition < p.length() && s.charAt(sPosition) == p.charAt(pPosition)){
                ++sPosition;
                ++pPosition;
            }
            // ����2����p�ĵ�ǰλ���ַ�Ϊ'*'
            else if (pPosition < p.length() && p.charAt(pPosition) == '*'){
                star = pPosition;   // ��¼'*'����ʼλ��
                match = sPosition;  // ��¼��'*'ƥ��ĵ�ǰλ��
                ++pPosition;        // p��λ�������ƶ�һλ
                // ע�⣺����'*'����ƥ����ַ�������s��λ����ʱ����
            }
            // ����3����p����'*'��s��֮�Ƚ�
            else if (match != -1){
                pPosition = star + 1;   // p��λ�������ƶ�һλ
                ++match;                // s�ĵ�ǰ�ַ���p�е�'*'ƥ�䣬'*'ƥ�������һ
                sPosition = match;      // s��λ�������ƶ���Ϊ
            }
            // ����4�� ��s��p�ĵ�ǰλ�ò�ƥ��
            else return false;
        }

        while (pPosition < p.length() && p.charAt(pPosition) == '*'){   // ���p����������ɸ�'*'
            ++pPosition;
        }
        return pPosition == p.length(); // �Ƿ�ƥ�伴p�Ƿ������ȫ
    }
}
