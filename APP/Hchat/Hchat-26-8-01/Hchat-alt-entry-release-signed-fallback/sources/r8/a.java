package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements r8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f11594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f11595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f11596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r8.g f11597d;

    public a() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11594a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11595b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11596c = r0
            return
    }

    @Override // r8.f
    public final void c(r8.g r1) {
            r0 = this;
            r1.getClass()
            r0.f11597d = r1
            r0.g(r1)
            return
    }

    @Override // r8.f
    public final void d(r8.g r1) {
            r0 = this;
            r1.getClass()
            r0.f11597d = r1
            r0.f(r1)
            return
    }

    public final void e(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r5.getClass()
            java.lang.String r0 = r4.a()
            if (r6 == 0) goto L14
            java.lang.String r1 = r6.getMessage()
            java.lang.String r2 = ": "
            java.lang.String r1 = wb.en.g(r2, r1)
            goto L16
        L14:
            java.lang.String r1 = ""
        L16:
            java.lang.String r2 = "[Hchat:"
            java.lang.String r3 = "] "
            java.lang.String r5 = bc.e.k(r2, r0, r3, r5, r1)
            fb.v0.n(r5, r6)
            return
    }

    public abstract void f(r8.g r1);

    public abstract void g(r8.g r1);

    public final void h(vb.a r2) {
            r1 = this;
            r8.g r0 = r1.f11597d
            if (r0 == 0) goto L15
            vb.c r0 = r0.f11628i
            r0.getClass()
            vb.c.a(r2)
            java.util.ArrayList r0 = r1.f11596c
            java.lang.String r2 = r2.a()
            r0.add(r2)
        L15:
            return
    }

    public final void i(java.lang.Class r2, f8.d r3) {
            r1 = this;
            r8.g r0 = r1.f11597d
            if (r0 == 0) goto Lf
            f8.c r0 = r0.f11625f
            f8.b r2 = r0.c(r2, r3)
            java.util.ArrayList r3 = r1.f11594a
            r3.add(r2)
        Lf:
            return
    }

    public final void j(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.ArrayList r0 = r1.f11595b
            r0.add(r2)
        L7:
            return
    }
}
