package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vp extends defpackage.s6 {
    public final defpackage.sp b;
    public defpackage.mw c;
    public final /* synthetic */ defpackage.wp d;
    public final /* synthetic */ defpackage.vo e;

    public vp(defpackage.sp r1, defpackage.wp r2, defpackage.vo r3) {
            r0 = this;
            r0.d = r2
            r0.e = r3
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // defpackage.s6
    public final void b(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            vr r5 = (defpackage.vr) r5
            if (r6 != 0) goto L6
            r6 = 1
            goto L7
        L6:
            r6 = 0
        L7:
            sp r0 = r4.b
            if (r6 == 0) goto Ld
            r1 = r0
            goto Lf
        Ld:
            mw r1 = r4.c
        Lf:
            if (r1 == 0) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.vr.a
        L13:
            boolean r3 = r2.compareAndSet(r5, r4, r1)
            if (r3 == 0) goto L24
            if (r6 == 0) goto L2a
            mw r5 = r4.c
            defpackage.ip.l(r5)
            r0.g(r5)
            return
        L24:
            java.lang.Object r3 = r2.get(r5)
            if (r3 == r4) goto L13
        L2a:
            return
    }

    @Override // defpackage.s6
    public final defpackage.l0 c(java.lang.Object r2) {
            r1 = this;
            vr r2 = (defpackage.vr) r2
            wp r2 = r1.d
            java.lang.Object r2 = r2.x()
            vo r0 = r1.e
            if (r2 != r0) goto Le
            r2 = 0
            return r2
        Le:
            l0 r2 = defpackage.a80.g
            return r2
    }
}
