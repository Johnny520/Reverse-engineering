package com.android.dx.command.findusages;

import java.io.File;
import java.io.PrintWriter;
import p292.C8558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Main {
    public static void main(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        C8558 c8558 = new C8558(new File(str));
        PrintWriter printWriter = new PrintWriter(System.out);
        new FindUsages(c8558, str2, str3, printWriter).findUsages();
        printWriter.flush();
    }
}
