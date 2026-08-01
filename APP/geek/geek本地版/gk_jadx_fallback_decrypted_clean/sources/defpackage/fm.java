package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements defpackage.lo, defpackage.u10, defpackage.sa0 {
    public final defpackage.ra0 a;
    public androidx.lifecycle.a b;
    public defpackage.gm c;

    public fm(defpackage.ra0 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.a = r2
            return
    }

    @Override // defpackage.u10
    public final defpackage.a3 b() {
            r1 = this;
            r1.f()
            gm r0 = r1.c
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            return r0
    }

    public final void c(defpackage.iq r2) {
            r1 = this;
            androidx.lifecycle.a r0 = r1.b
            r0.d(r2)
            return
    }

    @Override // defpackage.sa0
    public final defpackage.ra0 d() {
            r1 = this;
            r1.f()
            ra0 r0 = r1.a
            return r0
    }

    @Override // defpackage.oq
    public final androidx.lifecycle.a e() {
            r1 = this;
            r1.f()
            androidx.lifecycle.a r0 = r1.b
            return r0
    }

    public final void f() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.b
            if (r0 != 0) goto L12
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r1)
            r1.b = r0
            gm r0 = new gm
            r0.<init>(r1)
            r1.c = r0
        L12:
            return
    }
}
