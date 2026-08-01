package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends defpackage.wp implements defpackage.ld, defpackage.oe {
    public final defpackage.ge c;

    public g(defpackage.ge r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            vh r2 = defpackage.vh.h
            ee r2 = r1.b(r2)
            mp r2 = (defpackage.mp) r2
            r0.A(r2)
            ge r1 = r1.i(r0)
            r0.c = r1
            return
    }

    @Override // defpackage.wp
    public final void F(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.nb
            if (r0 == 0) goto Lb
            nb r2 = (defpackage.nb) r2
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.nb.b
            r0.get(r2)
        Lb:
            return
    }

    @Override // defpackage.ld
    public final defpackage.ge d() {
            r1 = this;
            ge r0 = r1.c
            return r0
    }

    @Override // defpackage.oe
    public final defpackage.ge e() {
            r1 = this;
            ge r0 = r1.c
            return r0
    }

    @Override // defpackage.ld
    public final void f(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = defpackage.f10.a(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            nb r3 = new nb
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            java.lang.Object r3 = r2.C(r3)
            l0 r0 = defpackage.ip.g
            if (r3 != r0) goto L16
            return
        L16:
            r2.l(r3)
            return
    }

    @Override // defpackage.wp
    public final java.lang.String o() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " was cancelled"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    @Override // defpackage.wp
    public final void z(defpackage.pb r2) {
            r1 = this;
            ge r0 = r1.c
            defpackage.ff.u(r0, r2)
            return
    }
}
