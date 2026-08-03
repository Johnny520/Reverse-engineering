package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rw */
/* JADX INFO: loaded from: classes.dex */
public final class C0769Rw {

    /* JADX INFO: renamed from: a */
    public AbstractC1449gF f2441a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2442b;

    /* JADX INFO: renamed from: a */
    public static long m1564a(C2628vd r9, long r10) {
        AbstractC1449gF r0 = r9.f9113d;
        ArrayList r1 = r9.f9120k;
        if ((r0 instanceof C2549tk) == false) goto L5;
        return r10;
    L5:
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L14;
        InterfaceC2542td r6 = (InterfaceC2542td) r1.get(r3);
        if ((r6 instanceof C2628vd) == false) goto L13;
        C2628vd r62 = (C2628vd) r6;
        if (r62.f9113d == r0) goto L13;
        r4 = Math.min(r4, m1564a(r62, ((long) r62.f9115f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        C2628vd r12 = r0.f5065i;
        C2628vd r22 = r0.f5064h;
        if (r9 != r12) goto L18;
        long r102 = r10 - r0.mo2779j();
        return Math.min(Math.min(r4, m1564a(r22, r102)), r102 - ((long) r22.f9115f));
    L18:
        return r4;
    }

    /* JADX INFO: renamed from: b */
    public static long m1565b(C2628vd r9, long r10) {
        AbstractC1449gF r0 = r9.f9113d;
        ArrayList r1 = r9.f9120k;
        if ((r0 instanceof C2549tk) == false) goto L5;
        return r10;
    L5:
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L14;
        InterfaceC2542td r6 = (InterfaceC2542td) r1.get(r3);
        if ((r6 instanceof C2628vd) == false) goto L13;
        C2628vd r62 = (C2628vd) r6;
        if (r62.f9113d == r0) goto L13;
        r4 = Math.max(r4, m1565b(r62, ((long) r62.f9115f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        C2628vd r12 = r0.f5064h;
        C2628vd r22 = r0.f5065i;
        if (r9 != r12) goto L18;
        long r02 = r0.mo2779j() + r10;
        return Math.max(Math.max(r4, m1565b(r22, r02)), r02 - ((long) r22.f9115f));
    L18:
        return r4;
    }
}
