package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0.q f6032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0.b f6034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fg.p f6035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f.b0 f6037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.k0 f6038g;

    public r1(i0.q r1) {
            r0 = this;
            r0.<init>()
            r0.f6032a = r1
            return
    }

    public final boolean a() {
            r2 = this;
            i0.q r0 = r2.f6032a
            r1 = 0
            if (r0 == 0) goto L13
            l0.b r0 = r2.f6034c
            if (r0 == 0) goto Le
            boolean r0 = r0.a()
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            return r1
    }

    public final i0.o0 b(java.lang.Object r2) {
            r1 = this;
            i0.q r0 = r1.f6032a
            if (r0 == 0) goto Lc
            i0.o0 r2 = r0.s(r1, r2)
            if (r2 != 0) goto Lb
            goto Lc
        Lb:
            return r2
        Lc:
            i0.o0 r2 = i0.o0.f5985g
            return r2
    }

    public final void c() {
            r2 = this;
            i0.q r0 = r2.f6032a
            if (r0 == 0) goto Lc
            r1 = 1
            r0.f6010u = r1
            androidx.lifecycle.x r0 = r0.f6015z
            r0.m()
        Lc:
            r0 = 0
            r2.f6032a = r0
            r2.f6037f = r0
            r2.f6038g = r0
            r2.f6035d = r0
            return
    }

    public final void d(boolean r2) {
            r1 = this;
            int r0 = r1.f6033b
            if (r2 == 0) goto L7
            r2 = r0 | 32
            goto L9
        L7:
            r2 = r0 & (-33)
        L9:
            r1.f6033b = r2
            return
    }

    public final void e(fg.p r1) {
            r0 = this;
            r0.f6035d = r1
            return
    }
}
