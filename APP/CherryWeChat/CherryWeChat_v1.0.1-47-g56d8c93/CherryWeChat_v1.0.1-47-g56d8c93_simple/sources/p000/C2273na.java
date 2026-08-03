package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: na */
/* JADX INFO: loaded from: classes.dex */
public class C2273na extends IOException {
    public C2273na(File r3, File r4, String r5) {
        StringBuilder r0 = new StringBuilder(r3.toString());
        if (r4 == null) goto L5;
        r0.append(" -> " + r4);
    L5:
        if (r5 == null) goto L7;
        r0.append(": ".concat(r5));
    L7:
        super(r0.toString());
    }

    public C2273na(String r2, int r3, IOException r4) {
        super(r2 + ", status code: " + r3, r4);
    }

    public C2273na(IndexOutOfBoundsException r2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", r2);
    }

    public C2273na(String r2, IndexOutOfBoundsException r3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r2), r3);
    }
}
