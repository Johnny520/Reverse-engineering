package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rc0 extends defpackage.qc0 {
    public defpackage.ep n;
    public defpackage.ep o;
    public defpackage.ep p;

    public rc0(defpackage.wc0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.n = r1
            r0.o = r1
            r0.p = r1
            return
    }

    @Override // defpackage.tc0
    public defpackage.ep g() {
            r1 = this;
            ep r0 = r1.o
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.c
            android.graphics.Insets r0 = defpackage.jc0.f(r0)
            ep r0 = defpackage.ep.c(r0)
            r1.o = r0
        L10:
            ep r0 = r1.o
            return r0
    }

    @Override // defpackage.tc0
    public defpackage.ep i() {
            r1 = this;
            ep r0 = r1.n
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.c
            android.graphics.Insets r0 = defpackage.jc0.h(r0)
            ep r0 = defpackage.ep.c(r0)
            r1.n = r0
        L10:
            ep r0 = r1.n
            return r0
    }

    @Override // defpackage.tc0
    public defpackage.ep k() {
            r1 = this;
            ep r0 = r1.p
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.c
            android.graphics.Insets r0 = defpackage.jc0.a(r0)
            ep r0 = defpackage.ep.c(r0)
            r1.p = r0
        L10:
            ep r0 = r1.p
            return r0
    }

    @Override // defpackage.nc0, defpackage.tc0
    public defpackage.wc0 l(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.view.WindowInsets r0 = r1.c
            android.view.WindowInsets r2 = defpackage.jc0.d(r0, r2, r3, r4, r5)
            r3 = 0
            wc0 r2 = defpackage.wc0.g(r3, r2)
            return r2
    }

    @Override // defpackage.oc0, defpackage.tc0
    public void q(defpackage.ep r1) {
            r0 = this;
            return
    }
}
