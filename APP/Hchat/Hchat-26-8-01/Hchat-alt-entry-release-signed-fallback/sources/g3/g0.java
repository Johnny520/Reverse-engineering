package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.r0 f4201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b3.a[] f4202b;

    public g0() {
            r2 = this;
            g3.r0 r0 = new g3.r0
            r1 = 0
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    public g0(g3.r0 r1) {
            r0 = this;
            r0.<init>()
            r0.f4201a = r1
            return
    }

    public final void a() {
            r5 = this;
            b3.a[] r0 = r5.f4202b
            if (r0 == 0) goto L51
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            g3.r0 r3 = r5.f4201a
            if (r0 != 0) goto L15
            r0 = 2
            g3.n0 r4 = r3.f4230a
            b3.a r0 = r4.g(r0)
        L15:
            if (r1 != 0) goto L1d
            g3.n0 r1 = r3.f4230a
            b3.a r1 = r1.g(r2)
        L1d:
            b3.a r0 = b3.a.a(r1, r0)
            r5.g(r0)
            b3.a[] r0 = r5.f4202b
            r1 = 16
            int r1 = fb.v0.w(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L33
            r5.f(r0)
        L33:
            b3.a[] r0 = r5.f4202b
            r1 = 32
            int r1 = fb.v0.w(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L42
            r5.d(r0)
        L42:
            b3.a[] r0 = r5.f4202b
            r1 = 64
            int r1 = fb.v0.w(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L51
            r5.h(r0)
        L51:
            return
    }

    public abstract g3.r0 b();

    public void c(int r4, b3.a r5) {
            r3 = this;
            b3.a[] r0 = r3.f4202b
            if (r0 != 0) goto La
            r0 = 10
            b3.a[] r0 = new b3.a[r0]
            r3.f4202b = r0
        La:
            r0 = 1
        Lb:
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L1f
            r1 = r4 & r0
            if (r1 != 0) goto L14
            goto L1c
        L14:
            b3.a[] r1 = r3.f4202b
            int r2 = fb.v0.w(r0)
            r1[r2] = r5
        L1c:
            int r0 = r0 << 1
            goto Lb
        L1f:
            return
    }

    public void d(b3.a r1) {
            r0 = this;
            return
    }

    public abstract void e(b3.a r1);

    public void f(b3.a r1) {
            r0 = this;
            return
    }

    public abstract void g(b3.a r1);

    public void h(b3.a r1) {
            r0 = this;
            return
    }
}
