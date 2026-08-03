package p073o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1022k {

    /* JADX INFO: renamed from: a */
    public AbstractC1024m f3758a;

    /* JADX INFO: renamed from: b */
    public ArrayList f3759b;

    /* JADX INFO: renamed from: a */
    public static long m2467a(C1017f r9, long r10) {
        AbstractC1024m r02 = r9.f3747d;
        if ((r02 instanceof C1020i) == false) goto L5;
        return r10;
    L5:
        ArrayList r1 = r9.f3754k;
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L15;
        InterfaceC1015d r6 = (InterfaceC1015d) r1.get(r3);
        if ((r6 instanceof C1017f) == false) goto L13;
        C1017f r62 = (C1017f) r6;
        if (r62.f3747d == r02) goto L13;
        r4 = Math.min(r4, m2467a(r62, ((long) r62.f3749f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L15:
        if (r9 != r02.f3770i) goto L22;
        long r12 = r02.mo2449j();
        C1017f r92 = r02.f3769h;
        long r102 = r10 - r12;
        return Math.min(Math.min(r4, m2467a(r92, r102)), r102 - ((long) r92.f3749f));
    L22:
        return r4;
    }

    /* JADX INFO: renamed from: b */
    public static long m2468b(C1017f r9, long r10) {
        AbstractC1024m r02 = r9.f3747d;
        if ((r02 instanceof C1020i) == false) goto L5;
        return r10;
    L5:
        ArrayList r1 = r9.f3754k;
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L15;
        InterfaceC1015d r6 = (InterfaceC1015d) r1.get(r3);
        if ((r6 instanceof C1017f) == false) goto L13;
        C1017f r62 = (C1017f) r6;
        if (r62.f3747d == r02) goto L13;
        r4 = Math.max(r4, m2468b(r62, ((long) r62.f3749f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L15:
        if (r9 != r02.f3769h) goto L22;
        long r12 = r02.mo2449j();
        C1017f r92 = r02.f3770i;
        long r102 = r10 + r12;
        return Math.max(Math.max(r4, m2468b(r92, r102)), r102 - ((long) r92.f3749f));
    L22:
        return r4;
    }
}
