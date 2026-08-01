package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ak extends IOException {
    public ak(File r3, File r4, String r5) {
        StringBuilder r0 = new StringBuilder(r3.toString());
        if (r4 == null) goto L5;
        r0.append(" -> " + r4);
    L5:
        r0.append(": ".concat(r5));
        String r32 = r0.toString();
        ip.n("toString(...)", r32);
        super(r32);
    }
}
