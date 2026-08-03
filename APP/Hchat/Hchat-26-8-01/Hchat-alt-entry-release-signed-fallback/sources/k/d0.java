package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends y0.n implements x1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n.k f6935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6938x;

    public d0(n.k r1) {
            r0 = this;
            r0.<init>()
            r0.f6935u = r1
            return
    }

    @Override // x1.m
    public final void B(x1.h0 r11) {
            r10 = this;
            r11.e()
            h1.b r1 = r11.f20932g
            boolean r2 = r10.f6936v
            if (r2 == 0) goto L22
            long r2 = f1.w.f3126b
            r4 = 1050253722(0x3e99999a, float:0.3)
            long r2 = f1.w.b(r2, r4)
            r8 = r2
            r3 = r1
            r1 = r8
            long r3 = r3.a()
            r6 = 0
            r7 = 122(0x7a, float:1.71E-43)
            r5 = 0
            r0 = r11
            h1.d.Z(r0, r1, r3, r5, r6, r7)
            return
        L22:
            r3 = r1
            boolean r0 = r10.f6937w
            if (r0 != 0) goto L2d
            boolean r0 = r10.f6938x
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            return
        L2d:
            long r0 = f1.w.f3126b
            r2 = 1036831949(0x3dcccccd, float:0.1)
            long r1 = f1.w.b(r0, r2)
            long r3 = r3.a()
            r6 = 0
            r7 = 122(0x7a, float:1.71E-43)
            r5 = 0
            r0 = r11
            h1.d.Z(r0, r1, r3, r5, r6, r7)
            return
    }

    @Override // y0.n
    public final void c1() {
            r4 = this;
            qg.t r0 = r4.Y0()
            ci.c r1 = new ci.c
            r2 = 4
            r3 = 0
            r1.<init>(r4, r3, r2)
            r2 = 3
            qg.v.q(r0, r3, r1, r2)
            return
    }
}
