package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class rc0 extends qc0 {
    public ep n;
    public ep o;
    public ep p;

    public rc0(wc0 r1, WindowInsets r2) {
        super(r1, r2);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.tc0
    public ep g() {
        if (this.o != null) goto L6;
        this.o = ep.c(jc0.f(this.c));
    L6:
        return this.o;
    }

    @Override // defpackage.tc0
    public ep i() {
        if (this.n != null) goto L6;
        this.n = ep.c(jc0.h(this.c));
    L6:
        return this.n;
    }

    @Override // defpackage.tc0
    public ep k() {
        if (this.p != null) goto L6;
        this.p = ep.c(jc0.a(this.c));
    L6:
        return this.p;
    }

    @Override // defpackage.nc0, defpackage.tc0
    public wc0 l(int r2, int r3, int r4, int r5) {
        return wc0.g(null, jc0.d(this.c, r2, r3, r4, r5));
    }

    @Override // defpackage.oc0, defpackage.tc0
    public void q(ep r1) {
    }
}
