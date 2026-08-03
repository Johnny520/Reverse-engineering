package p009E0;

import java.util.LinkedHashMap;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0139e;

/* JADX INFO: renamed from: E0.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0193x extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static int m563g0(int r1) {
        if (r1 >= 0) goto L5;
        return r1;
    L5:
        if (r1 >= 3) goto L8;
        return r1 + 1;
    L8:
        if (r1 < 1073741824) goto L13;
        return Integer.MAX_VALUE;
    L13:
        return (int) ((r1 / 0.75f) + 1.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public static Map m564h0(C0139e... r2) {
        if (r2.length <= 0) goto L6;
        LinkedHashMap r02 = new LinkedHashMap(m563g0(r2.length));
        m565i0(r02, r2);
        return r02;
    L6:
        return C0191v.f402a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m565i0(LinkedHashMap r4, C0139e[] r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        C0139e r2 = r5[r1];
        r4.put(r2.f328a, r2.f329b);
        r1 = r1 + 1;
        goto L3
    }
}
