package com.android.dx.command.grep;

import java.io.File;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import p292.C8566;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Main {
    public static void main(String[] strArr) {
        System.exit(new Grep(new C8566(new File(strArr[0])), Pattern.compile(strArr[1]), new PrintWriter(System.out)).grep() <= 0 ? 1 : 0);
    }
}
