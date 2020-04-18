package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        for (int ext = array.length; ext >= 0; ext--)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                int current = array[i];
                int next = array[i + 1];

                if (Math.min(current, next) == current)
                {
                    array[i + 1] = current;
                    array[i] = next;
                }
            }
        }
    }
}