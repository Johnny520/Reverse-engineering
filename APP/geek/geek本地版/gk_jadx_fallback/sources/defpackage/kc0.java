package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class kc0 extends defpackage.mc0 {
    public final android.view.WindowInsets.Builder c;

    public kc0() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets$Builder r0 = defpackage.jc0.b()
            r1.c = r0
            return
    }

    public kc0(defpackage.wc0 r1) {
            r0 = this;
            r0.<init>(r1)
            android.view.WindowInsets r1 = r1.f()
            if (r1 == 0) goto Le
            android.view.WindowInsets$Builder r1 = defpackage.jc0.c(r1)
            goto L12
        Le:
            android.view.WindowInsets$Builder r1 = defpackage.jc0.b()
        L12:
            r0.c = r1
            return
    }

    @Override // defpackage.mc0
    public defpackage.wc0 b() {
            r3 = this;
            r3.a()
            android.view.WindowInsets$Builder r0 = r3.c
            android.view.WindowInsets r0 = defpackage.f0.g(r0)
            r1 = 0
            wc0 r0 = defpackage.wc0.g(r1, r0)
            ep[] r1 = r3.b
            tc0 r2 = r0.a
            r2.o(r1)
            return r0
    }

    @Override // defpackage.mc0
    public void d(defpackage.ep r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.c
            android.graphics.Insets r2 = r2.d()
            defpackage.jc0.e(r0, r2)
            return
    }

    @Override // defpackage.mc0
    public void e(defpackage.ep r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.c
            android.graphics.Insets r2 = r2.d()
            defpackage.f0.y(r0, r2)
            return
    }

    @Override // defpackage.mc0
    public void f(defpackage.ep r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.c
            android.graphics.Insets r2 = r2.d()
            defpackage.f0.B(r0, r2)
            return
    }

    @Override // defpackage.mc0
    public void g(defpackage.ep r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.c
            android.graphics.Insets r2 = r2.d()
            defpackage.f0.p(r0, r2)
            return
    }

    @Override // defpackage.mc0
    public void h(defpackage.ep r2) {
            r1 = this;
            android.view.WindowInsets$Builder r0 = r1.c
            android.graphics.Insets r2 = r2.d()
            defpackage.jc0.g(r0, r2)
            return
    }
}
