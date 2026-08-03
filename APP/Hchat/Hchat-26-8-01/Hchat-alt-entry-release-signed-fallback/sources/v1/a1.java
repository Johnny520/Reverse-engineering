package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 implements u2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13890g;

    public static /* synthetic */ void B(v1.a1 r1, v1.b1 r2, int r3, int r4) {
            r0 = 0
            r1.A(r2, r3, r4, r0)
            return
    }

    public static void C(v1.a1 r2, v1.b1 r3, long r4) {
            r2.getClass()
            e(r2, r3)
            long r0 = r3.f13904k
            long r4 = u2.j.d(r4, r0)
            r2 = 0
            r0 = 0
            r3.A0(r4, r2, r0)
            return
    }

    public static void E(v1.a1 r9, v1.b1 r10, int r11, int r12) {
            long r0 = (long) r11
            r11 = 32
            long r0 = r0 << r11
            long r2 = (long) r12
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.m r12 = r9.m()
            u2.m r2 = u2.m.f13354g
            r3 = 0
            r6 = 0
            if (r12 == r2) goto L3d
            int r12 = r9.w()
            if (r12 != 0) goto L1d
            goto L3d
        L1d:
            int r12 = r9.w()
            int r2 = r10.f13900g
            int r12 = r12 - r2
            long r7 = r0 >> r11
            int r2 = (int) r7
            int r12 = r12 - r2
            long r0 = r0 & r4
            int r0 = (int) r0
            long r1 = (long) r12
            long r11 = r1 << r11
            long r0 = (long) r0
            long r0 = r0 & r4
            long r11 = r11 | r0
            e(r9, r10)
            long r0 = r10.f13904k
            long r11 = u2.j.d(r11, r0)
            r10.A0(r11, r3, r6)
            return
        L3d:
            e(r9, r10)
            long r11 = r10.f13904k
            long r11 = u2.j.d(r0, r11)
            r10.A0(r11, r3, r6)
            return
    }

    public static void F(v1.a1 r9, v1.b1 r10, int r11, int r12) {
            int r0 = v1.d1.f13922b
            v1.c1 r0 = v1.c1.f13914h
            long r1 = (long) r11
            r11 = 32
            long r1 = r1 << r11
            long r3 = (long) r12
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            u2.m r12 = r9.m()
            u2.m r3 = u2.m.f13354g
            r4 = 0
            if (r12 == r3) goto L40
            int r12 = r9.w()
            if (r12 != 0) goto L20
            goto L40
        L20:
            int r12 = r9.w()
            int r3 = r10.f13900g
            int r12 = r12 - r3
            long r7 = r1 >> r11
            int r3 = (int) r7
            int r12 = r12 - r3
            long r1 = r1 & r5
            int r1 = (int) r1
            long r2 = (long) r12
            long r11 = r2 << r11
            long r1 = (long) r1
            long r1 = r1 & r5
            long r11 = r11 | r1
            e(r9, r10)
            long r1 = r10.f13904k
            long r11 = u2.j.d(r11, r1)
            r10.A0(r11, r4, r0)
            return
        L40:
            e(r9, r10)
            long r11 = r10.f13904k
            long r11 = u2.j.d(r1, r11)
            r10.A0(r11, r4, r0)
            return
    }

    public static void G(v1.a1 r4, v1.b1 r5, int r6, int r7, fg.l r8, int r9) {
            r9 = r9 & 8
            if (r9 == 0) goto L8
            int r8 = v1.d1.f13922b
            v1.c1 r8 = v1.c1.f13914h
        L8:
            r4.getClass()
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            long r6 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            long r6 = r6 | r0
            e(r4, r5)
            long r0 = r5.f13904k
            long r6 = u2.j.d(r6, r0)
            r4 = 0
            r5.A0(r6, r4, r8)
            return
    }

    public static void H(v1.a1 r2, v1.b1 r3, long r4, nb.a r6, int r7) {
            r7 = r7 & 4
            if (r7 == 0) goto L8
            int r6 = v1.d1.f13922b
            v1.c1 r6 = v1.c1.f13914h
        L8:
            r2.getClass()
            e(r2, r3)
            long r0 = r3.f13904k
            long r4 = u2.j.d(r4, r0)
            r2 = 0
            r3.A0(r4, r2, r6)
            return
    }

    public static final void e(v1.a1 r1, v1.b1 r2) {
            r1.getClass()
            boolean r0 = r2 instanceof x1.y0
            if (r0 == 0) goto Le
            x1.y0 r2 = (x1.y0) r2
            boolean r1 = r1.f13890g
            r2.f0(r1)
        Le:
            return
    }

    public final void A(v1.b1 r5, int r6, int r7, float r8) {
            r4 = this;
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            long r6 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            long r6 = r6 | r0
            e(r4, r5)
            long r0 = r5.f13904k
            long r6 = u2.j.d(r6, r0)
            r0 = 0
            r5.A0(r6, r8, r0)
            return
    }

    public float j(v1.l r1) {
            r0 = this;
            r1 = 2143289344(0x7fc00000, float:NaN)
            return r1
    }

    public abstract u2.m m();

    public abstract int w();
}
