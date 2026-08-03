package p001;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ۟.v2 */
/* JADX INFO: loaded from: classes.dex */
public class C0424v2 extends IOException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0424v2(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        C0237h4.m1089("toString(...)", string);
        super(string);
    }
}
