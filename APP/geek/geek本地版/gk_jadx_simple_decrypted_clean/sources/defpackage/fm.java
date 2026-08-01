package defpackage;

import androidx.lifecycle.a;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements lo, u10, sa0 {
    public final ra0 a;
    public a b;
    public gm c;

    public fm(ra0 r2) {
        this.b = null;
        this.c = null;
        this.a = r2;
    }

    @Override // defpackage.u10
    public final a3 b() {
        f();
        return (a3) this.c.c;
    }

    public final void c(iq r2) {
        this.b.d(r2);
    }

    @Override // defpackage.sa0
    public final ra0 d() {
        f();
        return this.a;
    }

    @Override // defpackage.oq
    public final a e() {
        f();
        return this.b;
    }

    public final void f() {
        if (this.b != null) goto L6;
        this.b = new a(this);
        this.c = new gm(this);
        return;
    }
}
