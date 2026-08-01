package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tp extends sp {
    public final wp e;
    public final up f;
    public final ea g;
    public final Object h;

    public tp(wp r1, up r2, ea r3, Object r4) {
        this.e = r1;
        this.f = r2;
        this.g = r3;
        this.h = r4;
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ Object f(Object r1) {
        l((Throwable) r1);
        return vh.n;
    }

    @Override // defpackage.sp
    public final void l(Throwable r7) {
        ea r72 = wp.D(this.g);
        wp r0 = this.e;
        up r1 = this.f;
        Object r2 = this.h;
        if (r72 != null) goto L5;
    L9:
        r0.k(r0.s(r1, r2));
        return;
    L5:
        if (a80.p(r72.e, new tp(r0, r1, r72, r2), 1) != nw.a) goto L6;
        r72 = wp.D(r72);
        if (r72 != null) goto L5;
    }
}
