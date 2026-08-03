package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.m f8170f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.n1 f8171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i.m f8173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8175e;

    static {
            i.m r0 = new i.m
            r1 = 0
            r0.<init>(r1)
            m.g3.f8170f = r0
            return
    }

    public g3(i.k r3) {
            r2 = this;
            r2.<init>()
            i.m1 r0 = i.d.f5628j
            i.n1 r3 = r3.a(r0)
            r2.f8171a = r3
            r0 = -9223372036854775808
            r2.f8172b = r0
            i.m r3 = m.g3.f8170f
            r2.f8173c = r3
            return
    }

    public final java.lang.Object a(b0.s r13, ab.e r14, yf.c r15) {
            r12 = this;
            boolean r0 = r15 instanceof m.f3
            if (r0 == 0) goto L13
            r0 = r15
            m.f3 r0 = (m.f3) r0
            int r1 = r0.f8157l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8157l = r1
            goto L18
        L13:
            m.f3 r0 = new m.f3
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f8155j
            int r1 = r0.f8157l
            i.m r2 = m.g3.f8170f
            r3 = -9223372036854775808
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1
            xf.a r9 = xf.a.f21579g
            if (r1 == 0) goto L4d
            if (r1 == r8) goto L3f
            if (r1 != r6) goto L38
            sf.b r13 = r0.f8152g
            fg.a r13 = (fg.a) r13
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> L35
            goto Lcf
        L35:
            r13 = move-exception
            goto Ldb
        L38:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r13)
            r13 = 0
            return r13
        L3f:
            float r13 = r0.f8154i
            fg.a r14 = r0.f8153h
            sf.b r1 = r0.f8152g
            fg.l r1 = (fg.l) r1
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> L35
            r15 = r14
            r14 = r1
            goto La0
        L4d:
            f8.i.I0(r15)
            boolean r15 = r12.f8174d
            if (r15 == 0) goto L59
            java.lang.String r15 = "animateToZero called while previous animation is running"
            o.b.c(r15)
        L59:
            wf.g r15 = r0.getContext()
            y0.b r1 = y0.b.f21807v
            wf.e r15 = r15.s(r1)
            y0.p r15 = (y0.p) r15
            if (r15 == 0) goto L6c
            float r15 = r15.i()
            goto L6e
        L6c:
            r15 = 1065353216(0x3f800000, float:1.0)
        L6e:
            r12.f8174d = r8
            r11 = r14
            r14 = r13
            r13 = r15
            r15 = r11
        L74:
            float r1 = r12.f8175e     // Catch: java.lang.Throwable -> L35
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L35
            r10 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L83
        L81:
            r13 = r15
            goto La8
        L83:
            m.e3 r1 = new m.e3     // Catch: java.lang.Throwable -> L35
            r10 = 0
            r1.<init>(r12, r13, r14, r10)     // Catch: java.lang.Throwable -> L35
            r0.f8152g = r14     // Catch: java.lang.Throwable -> L35
            r0.f8153h = r15     // Catch: java.lang.Throwable -> L35
            r0.f8154i = r13     // Catch: java.lang.Throwable -> L35
            r0.f8157l = r8     // Catch: java.lang.Throwable -> L35
            wf.g r10 = r0.getContext()     // Catch: java.lang.Throwable -> L35
            i0.d r10 = i0.r.s(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.d(r1, r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r9) goto La0
            goto Lce
        La0:
            r15.invoke()     // Catch: java.lang.Throwable -> L35
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto L74
            goto L81
        La8:
            float r15 = r12.f8175e     // Catch: java.lang.Throwable -> L35
            float r15 = java.lang.Math.abs(r15)     // Catch: java.lang.Throwable -> L35
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 != 0) goto Lb3
            goto Ld2
        Lb3:
            m.b r15 = new m.b     // Catch: java.lang.Throwable -> L35
            r1 = 3
            r15.<init>(r12, r1, r14)     // Catch: java.lang.Throwable -> L35
            r0.f8152g = r13     // Catch: java.lang.Throwable -> L35
            r14 = 0
            r0.f8153h = r14     // Catch: java.lang.Throwable -> L35
            r0.f8157l = r6     // Catch: java.lang.Throwable -> L35
            wf.g r14 = r0.getContext()     // Catch: java.lang.Throwable -> L35
            i0.d r14 = i0.r.s(r14)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r14 = r14.d(r15, r0)     // Catch: java.lang.Throwable -> L35
            if (r14 != r9) goto Lcf
        Lce:
            return r9
        Lcf:
            r13.invoke()     // Catch: java.lang.Throwable -> L35
        Ld2:
            r12.f8172b = r3
            r12.f8173c = r2
            r12.f8174d = r7
            sf.n r13 = sf.n.f12433a
            return r13
        Ldb:
            r12.f8172b = r3
            r12.f8173c = r2
            r12.f8174d = r7
            throw r13
    }
}
