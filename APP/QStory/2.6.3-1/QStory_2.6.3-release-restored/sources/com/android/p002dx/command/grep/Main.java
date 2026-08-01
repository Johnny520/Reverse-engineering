package com.android.p002dx.command.grep;

import java.io.File;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import p308.C9387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Main {
    public static void main(String[] strArr) {
        System.exit(new Grep(new C9387(new File(strArr[0])), Pattern.compile(strArr[1]), new PrintWriter(System.out)).grep() <= 0 ? 1 : 0);
    }
}
