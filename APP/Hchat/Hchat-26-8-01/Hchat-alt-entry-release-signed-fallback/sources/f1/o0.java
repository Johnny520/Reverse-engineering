package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements f1.d0 {
    public f1.c0 A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f3093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f1.r0 f3094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u2.c f3098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u2.m f3099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f1.n f3100y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3101z;

    public o0() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f3083h = r0
            r2.f3084i = r0
            r2.f3085j = r0
            long r0 = f1.e0.f3045a
            r2.f3089n = r0
            r2.f3090o = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r2.f3092q = r0
            long r0 = f1.u0.f3122b
            r2.f3093r = r0
            f1.m0 r0 = f1.c0.f3038b
            r2.f3094s = r0
            r0 = 0
            r2.f3096u = r0
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f3097v = r0
            u2.d r0 = fb.v0.a()
            r2.f3098w = r0
            u2.m r0 = u2.m.f13354g
            r2.f3099x = r0
            r0 = 3
            r2.f3101z = r0
            return
    }

    @Override // f1.d0
    public final void H0(long r3) {
            r2 = this;
            long r0 = r2.f3093r
            boolean r0 = f1.u0.a(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.f3082g
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r2.f3082g = r0
            r2.f3093r = r3
        L10:
            return
    }

    @Override // f1.d0
    public final void I() {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void Q0(f1.r0 r2) {
            r1 = this;
            f1.r0 r0 = r1.f3094s
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L10
            int r0 = r1.f3082g
            r0 = r0 | 8192(0x2000, float:1.148E-41)
            r1.f3082g = r0
            r1.f3094s = r2
        L10:
            return
    }

    @Override // f1.d0
    public final void Y(int r3) {
            r2 = this;
            int r0 = r2.f3096u
            if (r0 != r3) goto L5
            return
        L5:
            int r0 = r2.f3082g
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r2.f3082g = r0
            r2.f3096u = r3
            return
    }

    @Override // f1.d0
    public final long a() {
            r2 = this;
            long r0 = r2.f3097v
            return r0
    }

    @Override // f1.d0
    public final float b() {
            r1 = this;
            float r0 = r1.f3083h
            return r0
    }

    @Override // f1.d0
    public final void c(float r2) {
            r1 = this;
            float r0 = r1.f3088m
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 32
            r1.f3082g = r0
            r1.f3088m = r2
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            u2.c r0 = r1.f3098w
            float r0 = r0.d()
            return r0
    }

    public final void e() {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.q(r0)
            r4.i(r0)
            r4.n(r0)
            r0 = 0
            r4.s(r0)
            r4.g(r0)
            r4.c(r0)
            long r1 = f1.e0.f3045a
            r4.p(r1)
            r4.t(r1)
            r4.f(r0)
            r0 = 1090519040(0x41000000, float:8.0)
            r4.u(r0)
            long r0 = f1.u0.f3122b
            r4.H0(r0)
            f1.m0 r0 = f1.c0.f3038b
            r4.Q0(r0)
            r0 = 0
            r4.r(r0)
            r1 = 0
            r4.k(r1)
            r2 = 3
            r4.h(r2)
            r4.Y(r0)
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r4.f3097v = r2
            r4.A = r1
            r4.f3082g = r0
            return
    }

    @Override // f1.d0
    public final void f(float r2) {
            r1 = this;
            float r0 = r1.f3091p
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.f3082g = r0
            r1.f3091p = r2
            return
    }

    @Override // f1.d0
    public final void g(float r2) {
            r1 = this;
            float r0 = r1.f3087l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 16
            r1.f3082g = r0
            r1.f3087l = r2
            return
    }

    @Override // f1.d0
    public final void h(int r3) {
            r2 = this;
            int r0 = r2.f3101z
            if (r0 != r3) goto L5
            return
        L5:
            int r0 = r2.f3082g
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
            r2.f3082g = r0
            r2.f3101z = r3
            return
    }

    @Override // f1.d0
    public final void i(float r2) {
            r1 = this;
            float r0 = r1.f3084i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 2
            r1.f3082g = r0
            r1.f3084i = r2
            return
    }

    @Override // f1.d0
    public final void k(f1.n r3) {
            r2 = this;
            f1.n r0 = r2.f3100y
            boolean r0 = gg.l.a(r0, r3)
            if (r0 != 0) goto L11
            int r0 = r2.f3082g
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r1
            r2.f3082g = r0
            r2.f3100y = r3
        L11:
            return
    }

    @Override // f1.d0
    public final void l() {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void n(float r2) {
            r1 = this;
            float r0 = r1.f3085j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 4
            r1.f3082g = r0
            r1.f3085j = r2
            return
    }

    @Override // f1.d0
    public final void o() {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void p(long r3) {
            r2 = this;
            long r0 = r2.f3089n
            boolean r0 = f1.w.c(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.f3082g
            r0 = r0 | 64
            r2.f3082g = r0
            r2.f3089n = r3
        L10:
            return
    }

    @Override // f1.d0
    public final void q(float r2) {
            r1 = this;
            float r0 = r1.f3083h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 1
            r1.f3082g = r0
            r1.f3083h = r2
            return
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            u2.c r0 = r1.f3098w
            float r0 = r0.q0()
            return r0
    }

    @Override // f1.d0
    public final void r(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3095t
            if (r0 == r2) goto Lc
            int r0 = r1.f3082g
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.f3082g = r0
            r1.f3095t = r2
        Lc:
            return
    }

    @Override // f1.d0
    public final void s(float r2) {
            r1 = this;
            float r0 = r1.f3086k
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 8
            r1.f3082g = r0
            r1.f3086k = r2
            return
    }

    @Override // f1.d0
    public final void t(long r3) {
            r2 = this;
            long r0 = r2.f3090o
            boolean r0 = f1.w.c(r0, r3)
            if (r0 != 0) goto L10
            int r0 = r2.f3082g
            r0 = r0 | 128(0x80, float:1.8E-43)
            r2.f3082g = r0
            r2.f3090o = r3
        L10:
            return
    }

    @Override // f1.d0
    public final void u(float r2) {
            r1 = this;
            float r0 = r1.f3092q
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r1.f3082g
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.f3082g = r0
            r1.f3092q = r2
            return
    }

    @Override // f1.d0
    public final float v() {
            r1 = this;
            float r0 = r1.f3084i
            return r0
    }
}
