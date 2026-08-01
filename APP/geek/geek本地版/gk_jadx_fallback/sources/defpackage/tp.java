package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tp extends defpackage.sp {
    public final defpackage.wp e;
    public final defpackage.up f;
    public final defpackage.ea g;
    public final java.lang.Object h;

    public tp(defpackage.wp r1, defpackage.up r2, defpackage.ea r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.f = r2
            r0.g = r3
            r0.h = r4
            return
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ java.lang.Object f(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.l(r1)
            vh r1 = defpackage.vh.n
            return r1
    }

    @Override // defpackage.sp
    public final void l(java.lang.Throwable r7) {
            r6 = this;
            ea r7 = r6.g
            ea r7 = defpackage.wp.D(r7)
            wp r0 = r6.e
            up r1 = r6.f
            java.lang.Object r2 = r6.h
            if (r7 == 0) goto L25
        Le:
            wp r3 = r7.e
            tp r4 = new tp
            r4.<init>(r0, r1, r7, r2)
            r5 = 1
            zg r3 = defpackage.a80.p(r3, r4, r5)
            nw r4 = defpackage.nw.a
            if (r3 == r4) goto L1f
            return
        L1f:
            ea r7 = defpackage.wp.D(r7)
            if (r7 != 0) goto Le
        L25:
            java.lang.Object r7 = r0.s(r1, r2)
            r0.k(r7)
            return
    }
}
