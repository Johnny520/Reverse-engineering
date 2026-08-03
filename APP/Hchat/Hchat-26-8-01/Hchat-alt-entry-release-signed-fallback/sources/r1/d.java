package r1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r1.i f11312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1.i f11313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gg.m f11314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qg.t f11315d;

    public d() {
            r2 = this;
            r2.<init>()
            d1.c0 r0 = new d1.c0
            r1 = 12
            r0.<init>(r2, r1)
            r2.f11314c = r0
            return
    }

    public final java.lang.Object a(long r11, long r13, yf.c r15) {
            r10 = this;
            boolean r0 = r15 instanceof r1.b
            if (r0 == 0) goto L14
            r0 = r15
            r1.b r0 = (r1.b) r0
            int r1 = r0.f11308i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f11308i = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            r1.b r0 = new r1.b
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f11306g
            int r0 = r6.f11308i
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2a
            f8.i.I0(r15)
            goto L75
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L31:
            f8.i.I0(r15)
            goto L58
        L35:
            f8.i.I0(r15)
            r1.i r15 = r10.f11312a
            r0 = 0
            if (r15 == 0) goto L42
            r1.i r15 = r15.l1()
            goto L43
        L42:
            r15 = r0
        L43:
            r3 = 0
            xf.a r7 = xf.a.f21579g
            if (r15 != 0) goto L5d
            r1.i r1 = r10.f11313b
            if (r1 == 0) goto L7b
            r6.f11308i = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.m0(r2, r4, r6)
            if (r15 != r7) goto L58
            goto L74
        L58:
            u2.q r15 = (u2.q) r15
            long r3 = r15.f13362a
            goto L7b
        L5d:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            r1.i r13 = r10.f11312a
            if (r13 == 0) goto L69
            r1.i r0 = r13.l1()
        L69:
            if (r0 == 0) goto L7a
            r6.f11308i = r1
            r1 = r0
            java.lang.Object r15 = r1.m0(r2, r4, r6)
            if (r15 != r7) goto L75
        L74:
            return r7
        L75:
            u2.q r15 = (u2.q) r15
            long r3 = r15.f13362a
            goto L7b
        L7a:
            r3 = r11
        L7b:
            u2.q r11 = new u2.q
            r11.<init>(r3)
            return r11
    }

    public final long b(long r8, long r10, int r12) {
            r7 = this;
            r1.i r0 = r7.f11312a
            if (r0 == 0) goto La
            r1.i r0 = r0.l1()
        L8:
            r1 = r0
            goto Lc
        La:
            r0 = 0
            goto L8
        Lc:
            if (r1 == 0) goto L16
            r2 = r8
            r4 = r10
            r6 = r12
            long r8 = r1.M0(r2, r4, r6)
            return r8
        L16:
            r8 = 0
            return r8
    }

    public final java.lang.Object c(long r5, yf.c r7) {
            r4 = this;
            boolean r0 = r7 instanceof r1.c
            if (r0 == 0) goto L13
            r0 = r7
            r1.c r0 = (r1.c) r0
            int r1 = r0.f11311i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11311i = r1
            goto L18
        L13:
            r1.c r0 = new r1.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f11309g
            int r1 = r0.f11311i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r7)
            goto L46
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r7)
            r1.i r7 = r4.f11312a
            if (r7 == 0) goto L38
            r1.i r7 = r7.l1()
            goto L39
        L38:
            r7 = 0
        L39:
            if (r7 == 0) goto L4b
            r0.f11311i = r2
            java.lang.Object r7 = r7.M(r5, r0)
            xf.a r5 = xf.a.f21579g
            if (r7 != r5) goto L46
            return r5
        L46:
            u2.q r7 = (u2.q) r7
            long r5 = r7.f13362a
            goto L4d
        L4b:
            r5 = 0
        L4d:
            u2.q r7 = new u2.q
            r7.<init>(r5)
            return r7
    }

    public final long d(int r2, long r3) {
            r1 = this;
            r1.i r0 = r1.f11312a
            if (r0 == 0) goto L9
            r1.i r0 = r0.l1()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            long r2 = r0.f0(r2, r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final qg.t e() {
            r1 = this;
            gg.m r0 = r1.f11314c
            java.lang.Object r0 = r0.invoke()
            qg.t r0 = (qg.t) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
