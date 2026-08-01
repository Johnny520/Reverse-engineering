package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z8 extends defpackage.s70 {
    public boolean a;
    public final /* synthetic */ android.view.ViewGroup b;

    public z8(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r1 = 0
            r0.a = r1
            return
    }

    @Override // defpackage.s70, defpackage.q70
    public final void a() {
            r2 = this;
            android.view.ViewGroup r0 = r2.b
            r1 = 0
            defpackage.zt.Q(r0, r1)
            r0 = 1
            r2.a = r0
            return
    }

    @Override // defpackage.s70, defpackage.q70
    public final void c() {
            r2 = this;
            android.view.ViewGroup r0 = r2.b
            r1 = 0
            defpackage.zt.Q(r0, r1)
            return
    }

    @Override // defpackage.s70, defpackage.q70
    public final void d() {
            r2 = this;
            android.view.ViewGroup r0 = r2.b
            r1 = 1
            defpackage.zt.Q(r0, r1)
            return
    }

    @Override // defpackage.q70
    public final void e(defpackage.r70 r3) {
            r2 = this;
            boolean r0 = r2.a
            if (r0 != 0) goto La
            android.view.ViewGroup r0 = r2.b
            r1 = 0
            defpackage.zt.Q(r0, r1)
        La:
            r3.u(r2)
            return
    }
}
