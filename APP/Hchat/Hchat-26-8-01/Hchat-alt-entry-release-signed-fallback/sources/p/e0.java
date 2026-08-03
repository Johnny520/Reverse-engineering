package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends y0.n implements x1.e2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p.r1 f9888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p.r1 f9889v;

    public e0() {
            r1 = this;
            r1.<init>()
            p.c0 r0 = p.d.f9874c
            r1.f9888u = r0
            r1.f9889v = r0
            return
    }

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            java.lang.String r0 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            return r0
    }

    @Override // y0.n
    public void c1() {
            r2 = this;
            p.d0 r0 = new p.d0
            r1 = 1
            r0.<init>(r2, r1)
            java.lang.String r1 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            x1.k.z(r2, r1, r0)
            r2.l1()
            return
    }

    @Override // y0.n
    public void d1() {
            r2 = this;
            p.r1 r0 = r2.f9888u
            r2.f9889v = r0
            p.d0 r0 = new p.d0
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.String r1 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            x1.k.C(r2, r1, r0)
            return
    }

    @Override // y0.n
    public final void e1() {
            r1 = this;
            p.c0 r0 = p.d.f9874c
            r1.f9888u = r0
            return
    }

    public abstract p.r1 k1(p.r1 r1);

    public void l1() {
            r2 = this;
            p.r1 r0 = r2.f9888u
            p.r1 r0 = r2.k1(r0)
            r2.f9889v = r0
            p.d0 r0 = new p.d0
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.String r1 = "androidx.compose.foundation.layout.ConsumedInsetsProvider"
            x1.k.C(r2, r1, r0)
            return
    }
}
