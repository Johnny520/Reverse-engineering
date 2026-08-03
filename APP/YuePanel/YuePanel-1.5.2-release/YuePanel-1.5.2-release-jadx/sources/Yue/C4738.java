package Yue;

import java.io.File;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4738 {
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1653(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        C5499.m17102(string, "sb.toString()");
        return string;
    }
}
