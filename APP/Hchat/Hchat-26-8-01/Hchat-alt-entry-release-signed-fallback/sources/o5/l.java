package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends o5.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.a f9526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k5.u f9527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9529e;

    public l(k5.u r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f9529e = r0
            r3.f9527c = r4
            androidx.lifecycle.x r4 = r4.f7264b
            r4.getClass()
            a5.a r1 = new a5.a
            r2 = 5
            r1.<init>(r5, r2, r4)
            r3.f9526b = r1
            int r4 = r1.o(r0)
            r3.f9528d = r4
            return
    }

    @Override // o5.m
    public final int a() {
            r1 = this;
            int r0 = r1.f9528d
            return r0
    }

    @Override // o5.m
    public final w5.a b() {
            r2 = this;
            int r0 = r2.f9529e
            int r1 = r2.f9528d
            if (r0 >= r1) goto L13
            int r0 = r0 + 1
            r2.f9529e = r0
            k5.u r0 = r2.f9527c
            a5.a r1 = r2.f9526b
            w5.a r0 = fb.v0.J(r0, r1)
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // o5.m
    public final int c() {
            r1 = this;
            a5.a r0 = r1.f9526b
            int r0 = r0.f56h
            return r0
    }

    @Override // o5.m
    public final void d() {
            r2 = this;
            int r0 = r2.f9529e
            int r1 = r2.f9528d
            if (r0 >= r1) goto Lf
            int r0 = r0 + 1
            r2.f9529e = r0
            a5.a r0 = r2.f9526b
            fb.v0.K(r0)
        Lf:
            return
    }
}
