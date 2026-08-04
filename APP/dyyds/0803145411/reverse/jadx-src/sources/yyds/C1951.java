package yyds;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲀᛲᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1951 extends IOException {
    public C1951(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        super(sb.toString());
    }

    public C1951(String str, int i, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
