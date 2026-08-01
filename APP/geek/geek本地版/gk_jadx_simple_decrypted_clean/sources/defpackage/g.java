package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends wp implements ld, oe {
    public final ge c;

    public g(ge r1, boolean r2) {
        super(r2);
        A((mp) r1.b(vh.h));
        this.c = r1.i(this);
    }

    @Override // defpackage.wp
    public final void F(Object r2) {
        if ((r2 instanceof nb) == false) goto L6;
        AtomicIntegerFieldUpdater r0 = nb.b;
        r0.get((nb) r2);
        return;
    }

    @Override // defpackage.ld
    public final ge d() {
        return this.c;
    }

    @Override // defpackage.oe
    public final ge e() {
        return this.c;
    }

    @Override // defpackage.ld
    public final void f(Object r3) {
        Throwable r0 = f10.a(r3);
        if (r0 == null) goto L6;
        r3 = new nb(r0, false);
    L6:
        Object r32 = C(r3);
        if (r32 != ip.g) goto L9;
        return;
    L9:
        l(r32);
    }

    @Override // defpackage.wp
    public final String o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.wp
    public final void z(pb r2) {
        ff.u(this.c, r2);
    }
}
