package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.a0 f9913a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.a0 f9914b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p.a0 f9915c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p.t1 f9916d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p.t1 f9917e = null;

    static {
            p.a0 r0 = new p.a0
            p.y r1 = p.y.f10037h
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2)
            p.h1.f9913a = r0
            p.a0 r0 = new p.a0
            p.y r1 = p.y.f10036g
            r0.<init>(r1, r2)
            p.h1.f9914b = r0
            p.a0 r0 = new p.a0
            p.y r1 = p.y.f10038i
            r0.<init>(r1, r2)
            p.h1.f9915c = r0
            y0.g r0 = y0.b.f21796k
            p.t1 r2 = new p.t1
            b0.t r3 = new b0.t
            r4 = 17
            r3.<init>(r0, r4)
            r2.<init>(r1, r3, r0)
            p.h1.f9916d = r2
            y0.g r0 = y0.b.f21792g
            p.t1 r2 = new p.t1
            b0.t r3 = new b0.t
            r3.<init>(r0, r4)
            r2.<init>(r1, r3, r0)
            p.h1.f9917e = r2
            return
    }

    public static final y0.o a(float r1, float r2) {
            p.m1 r0 = new p.m1
            r0.<init>(r1, r2)
            return r0
    }

    public static y0.o b(float r2) {
            p.m1 r0 = new p.m1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.<init>(r2, r1)
            return r0
    }

    public static y0.o c(y0.o r1) {
            p.a0 r0 = p.h1.f9915c
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o d(y0.o r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            p.a0 r3 = p.h1.f9913a
            goto L11
        L9:
            p.a0 r0 = new p.a0
            p.y r1 = p.y.f10037h
            r0.<init>(r1, r3)
            r3 = r0
        L11:
            y0.o r2 = r2.d(r3)
            return r2
    }

    public static final y0.o e(y0.o r6, float r7) {
            p.g1 r0 = new p.g1
            r3 = 0
            r5 = 5
            r1 = 0
            r4 = r7
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static final y0.o f(y0.o r6, float r7, float r8) {
            p.g1 r0 = new p.g1
            r3 = 0
            r5 = 5
            r1 = 0
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static /* synthetic */ y0.o g(y0.o r2, float r3, float r4, int r5) {
            r0 = r5 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r4 = r1
        Lc:
            y0.o r2 = f(r2, r3, r4)
            return r2
    }

    public static final y0.o h(y0.o r6, float r7) {
            p.g1 r0 = new p.g1
            r5 = 0
            r2 = r7
            r3 = r7
            r4 = r7
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static y0.o i(y0.o r8, float r9, float r10, float r11, float r12, int r13) {
            r0 = r13 & 2
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r4 = r1
            goto L9
        L8:
            r4 = r10
        L9:
            r10 = r13 & 4
            if (r10 == 0) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r11
        L10:
            r10 = r13 & 8
            if (r10 == 0) goto L16
            r6 = r1
            goto L17
        L16:
            r6 = r12
        L17:
            p.g1 r2 = new p.g1
            r7 = 0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            y0.o r8 = r8.d(r2)
            return r8
    }

    public static final y0.o j(y0.o r6, float r7) {
            p.g1 r0 = new p.g1
            r5 = 1
            r2 = r7
            r3 = r7
            r4 = r7
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static final y0.o k(y0.o r6, float r7, float r8) {
            p.g1 r0 = new p.g1
            r5 = 1
            r3 = r7
            r4 = r8
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static final y0.o l(y0.o r6, float r7, float r8, float r9, float r10) {
            p.g1 r0 = new p.g1
            r5 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static /* synthetic */ y0.o m(y0.o r2, float r3, float r4, int r5) {
            r0 = r5 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r5 = r5 & 4
            if (r5 == 0) goto Lc
            r4 = r1
        Lc:
            y0.o r2 = l(r2, r3, r1, r4, r1)
            return r2
    }

    public static final y0.o n(y0.o r6, float r7) {
            p.g1 r0 = new p.g1
            r4 = 0
            r5 = 10
            r2 = 0
            r3 = r7
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static y0.o o(y0.o r6, float r7) {
            p.g1 r0 = new p.g1
            r4 = 0
            r5 = 10
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static y0.o p(y0.o r4) {
            y0.g r0 = y0.b.f21796k
            boolean r1 = r0.equals(r0)
            if (r1 == 0) goto Lb
            p.t1 r0 = p.h1.f9916d
            goto L25
        Lb:
            y0.g r1 = y0.b.f21792g
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L16
            p.t1 r0 = p.h1.f9917e
            goto L25
        L16:
            p.t1 r1 = new p.t1
            b0.t r2 = new b0.t
            r3 = 17
            r2.<init>(r0, r3)
            p.y r3 = p.y.f10038i
            r1.<init>(r3, r2, r0)
            r0 = r1
        L25:
            y0.o r4 = r4.d(r0)
            return r4
    }
}
