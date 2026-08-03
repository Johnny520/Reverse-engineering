package p000;

/* JADX INFO: renamed from: YC */
/* JADX INFO: loaded from: classes.dex */
public final class C1044YC {
    /* JADX INFO: renamed from: a */
    public static C1001XC m1993a(Object r2) {
        AbstractC2634vj r22 = (AbstractC2634vj) r2;
        C1001XC r0 = r22.unknownFields;
        if (r0 != C1001XC.f3195f) goto L6;
        C1001XC r02 = C1001XC.m1891c();
        r22.unknownFields = r02;
        return r02;
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1994b(Object r8, C2187la r9) {
        int r0 = r9.f7629b;
        AbstractC2140ka r1 = r9.f7628a;
        int r2 = r0 >>> 3;
        int r02 = r0 & 7;
        if (r02 == 0) goto L32;
        if (r02 != 1) goto L6;
        r9.m4424v(1);
        ((C1001XC) r8).m1894d((r2 << 3) | 1, Long.valueOf(r1.mo2946r()));
        return true;
    L6:
        if (r02 == 2) goto L28;
        if (r02 != 3) goto L9;
        C1001XC r03 = C1001XC.m1891c();
        int r12 = r2 << 3;
        int r22 = r12 | 4;
    L19:
        if (r9.m4403a() == Integer.MAX_VALUE) goto L23;
        if (m1994b(r03, r9) == true) goto L19;
    L23:
        if (r22 != r9.f7629b) goto L27;
        r03.f3200e = false;
        ((C1001XC) r8).m1894d(r12 | 3, r03);
        return true;
    L27:
        throw new C0673Pl("Protocol message end-group tag did not match expected tag.");
    L9:
        if (r02 != 4) goto L11;
        return false;
    L11:
        if (r02 != 5) goto L15;
        r9.m4424v(5);
        ((C1001XC) r8).m1894d((r2 << 3) | 5, Integer.valueOf(r1.mo2945q()));
        return true;
    L15:
        throw C0673Pl.m1366c();
    L28:
        C1001XC r82 = (C1001XC) r8;
        int r04 = (r2 << 3) | 2;
        r82.m1894d(r04, r9.m4407e());
        return true;
    L32:
        r9.m4424v(0);
        ((C1001XC) r8).m1894d(r2 << 3, Long.valueOf(r1.mo2949u()));
        return true;
    }
}
