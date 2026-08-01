package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ck */
/* JADX INFO: loaded from: classes.dex */
public class C0107ck extends IOException {
    public C0107ck(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        AbstractC0493mp.m1856f("toString(...)", string);
        super(string);
    }
}
