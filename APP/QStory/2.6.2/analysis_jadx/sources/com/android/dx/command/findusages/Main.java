package com.android.dx.command.findusages;

import java.io.File;
import java.io.PrintWriter;
import p292.C8566;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Main {
    public static void main(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        C8566 c8566 = new C8566(new File(str));
        PrintWriter printWriter = new PrintWriter(System.out);
        new FindUsages(c8566, str2, str3, printWriter).findUsages();
        printWriter.flush();
    }
}
