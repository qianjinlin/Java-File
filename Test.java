package com.test;

import java.io.File;
import java.util.Objects;

public class Test {
    private static int time = 0;
    public static void main(String []args) {
        File file  = new File("E://");//这里可以填你需要清理的磁盘
        File[] fileList = file.listFiles();
        for (int i = 0; i < Objects.requireNonNull(fileList).length; i++) {
            checkFileAndDeleteNullDi(fileList[i].toString());
           }

    }

    private static void checkFileAndDeleteNullDi(String str) {
        File file = new File("E://");
        File[] files = file.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            if(Objects.equals(files[i].toString(), str)){
                File file1 = new File(str);
                if (file1.length() <= 0 && file1.isDirectory()){
                    time++;
                    System.out.println("删除的个数:"+time);
                    file1.delete();
                }
            }
        }
    }
}

