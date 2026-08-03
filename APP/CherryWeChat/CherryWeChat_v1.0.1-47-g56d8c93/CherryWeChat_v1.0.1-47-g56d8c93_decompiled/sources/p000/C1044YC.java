package p000;

/* JADX INFO: renamed from: YC */
/* JADX INFO: loaded from: classes.dex */
public final class C1044YC {
    /* JADX INFO: renamed from: a */
    public static C1001XC m1993a(Object obj) {
        AbstractC2634vj abstractC2634vj = (AbstractC2634vj) obj;
        C1001XC c1001xc = abstractC2634vj.unknownFields;
        if (c1001xc != C1001XC.f3195f) {
            return c1001xc;
        }
        C1001XC c1001xcM1891c = C1001XC.m1891c();
        abstractC2634vj.unknownFields = c1001xcM1891c;
        return c1001xcM1891c;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1994b(Object obj, C2187la c2187la) throws C0673Pl {
        int i = c2187la.f7629b;
        AbstractC2140ka abstractC2140ka = c2187la.f7628a;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            c2187la.m4424v(0);
            ((C1001XC) obj).m1894d(i2 << 3, Long.valueOf(abstractC2140ka.mo2949u()));
            return true;
        }
        if (i3 == 1) {
            c2187la.m4424v(1);
            ((C1001XC) obj).m1894d((i2 << 3) | 1, Long.valueOf(abstractC2140ka.mo2946r()));
            return true;
        }
        if (i3 == 2) {
            ((C1001XC) obj).m1894d((i2 << 3) | 2, c2187la.m4407e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw C0673Pl.m1366c();
            }
            c2187la.m4424v(5);
            ((C1001XC) obj).m1894d((i2 << 3) | 5, Integer.valueOf(abstractC2140ka.mo2945q()));
            return true;
        }
        C1001XC c1001xcM1891c = C1001XC.m1891c();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (c2187la.m4403a() != Integer.MAX_VALUE && m1994b(c1001xcM1891c, c2187la)) {
        }
        if (i5 != c2187la.f7629b) {
            throw new C0673Pl("Protocol message end-group tag did not match expected tag.");
        }
        c1001xcM1891c.f3200e = false;
        ((C1001XC) obj).m1894d(i4 | 3, c1001xcM1891c);
        return true;
    }
}
