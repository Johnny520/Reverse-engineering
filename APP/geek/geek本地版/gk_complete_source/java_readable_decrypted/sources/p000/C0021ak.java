package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ak */
/* JADX INFO: loaded from: classes.dex */
public class C0021ak extends IOException {
    public C0021ak(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        AbstractC0346ip.m1502n("toString(...)", string);
        super(string);
    }
}
