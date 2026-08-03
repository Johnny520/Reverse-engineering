package p026N0;

import java.io.File;
import java.io.IOException;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: N0.b */
/* JADX INFO: loaded from: classes.dex */
public class C0261b extends IOException {
    public C0261b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        super(string);
    }
}
