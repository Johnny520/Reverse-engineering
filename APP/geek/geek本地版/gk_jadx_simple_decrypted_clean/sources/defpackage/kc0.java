package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class kc0 extends mc0 {
    public final WindowInsets.Builder c;

    public kc0() {
        this.c = jc0.b();
    }

    @Override // defpackage.mc0
    public wc0 b() {
        a();
        wc0 r0 = wc0.g(null, f0.g(this.c));
        ep[] r1 = this.b;
        r0.a.o(r1);
        return r0;
    }

    @Override // defpackage.mc0
    public void d(ep r2) {
        jc0.e(this.c, r2.d());
    }

    @Override // defpackage.mc0
    public void e(ep r2) {
        f0.y(this.c, r2.d());
    }

    @Override // defpackage.mc0
    public void f(ep r2) {
        f0.B(this.c, r2.d());
    }

    @Override // defpackage.mc0
    public void g(ep r2) {
        f0.p(this.c, r2.d());
    }

    @Override // defpackage.mc0
    public void h(ep r2) {
        jc0.g(this.c, r2.d());
    }

    public kc0(wc0 r1) {
        super(r1);
        WindowInsets r12 = r1.f();
        if (r12 == null) goto L5;
        WindowInsets.Builder r13 = jc0.c(r12);
    L6:
        this.c = r13;
        return;
    L5:
        r13 = jc0.b();
        goto L6
    }
}
