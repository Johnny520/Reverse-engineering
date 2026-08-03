package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends g3.g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets.Builder f4195c;

    public d0() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets$Builder r0 = f1.a.e()
            r1.f4195c = r0
            return
    }

    public d0(g3.r0 r1) {
            r0 = this;
            r0.<init>(r1)
            android.view.WindowInsets r1 = r1.b()
            if (r1 == 0) goto Le
            android.view.WindowInsets$Builder r1 = f1.a.f(r1)
            goto L12
        Le:
            android.view.WindowInsets$Builder r1 = f1.a.e()
        L12:
            r0.f4195c = r1
            return
    }

    @Override // g3.g0
    public g3.r0 b() {
            r3 = this;
            r3.a()
            android.view.WindowInsets$Builder r0 = r3.f4195c
            android.view.WindowInsets r0 = f1.a.g(r0)
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            b3.a[] r1 = r3.f4202b
            g3.n0 r2 = r0.f4230a
            r2.r(r1)
            return r0
    }

    @Override // g3.g0
    public void d(b3.a r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.f4195c
            android.graphics.Insets r2 = r2.d()
            f1.a.y(r0, r2)
            return
    }

    @Override // g3.g0
    public void e(b3.a r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.f4195c
            android.graphics.Insets r2 = r2.d()
            f1.a.D(r0, r2)
            return
    }

    @Override // g3.g0
    public void f(b3.a r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.f4195c
            android.graphics.Insets r2 = r2.d()
            f1.a.u(r0, r2)
            return
    }

    @Override // g3.g0
    public void g(b3.a r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.f4195c
            android.graphics.Insets r2 = r2.d()
            f1.a.o(r0, r2)
            return
    }

    @Override // g3.g0
    public void h(b3.a r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.f4195c
            android.graphics.Insets r2 = r2.d()
            f1.a.B(r0, r2)
            return
    }
}
