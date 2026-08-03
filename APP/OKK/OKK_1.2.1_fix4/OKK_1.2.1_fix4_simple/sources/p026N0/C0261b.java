package p026N0;

import java.io.File;
import java.io.IOException;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: N0.b */
/* JADX INFO: loaded from: classes.dex */
public class C0261b extends IOException {
    public C0261b(File r3, File r4, String r5) {
        StringBuilder r02 = new StringBuilder(r3.toString());
        if (r4 == null) goto L5;
        r02.append(" -> " + r4);
    L5:
        if (r5 == null) goto L7;
        r02.append(": ".concat(r5));
    L7:
        String r32 = r02.toString();
        AbstractC0307g.m702d(r32, "toString(...)");
        super(r32);
    }
}
