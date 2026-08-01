package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r8 implements java.lang.Runnable {
    public final /* synthetic */ defpackage.s8 a;
    public final /* synthetic */ defpackage.ou b;
    public final /* synthetic */ defpackage.ku c;
    public final /* synthetic */ defpackage.l0 d;

    public r8(defpackage.l0 r1, defpackage.s8 r2, defpackage.ou r3, defpackage.ku r4) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            l0 r0 = r4.d
            java.lang.Object r0 = r0.b
            t8 r0 = (defpackage.t8) r0
            s8 r1 = r4.a
            if (r1 == 0) goto L15
            r2 = 1
            r0.z = r2
            ku r1 = r1.b
            r2 = 0
            r1.c(r2)
            r0.z = r2
        L15:
            ou r0 = r4.b
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L2a
            boolean r1 = r0.hasSubMenu()
            if (r1 == 0) goto L2a
            r1 = 4
            r2 = 0
            ku r3 = r4.c
            r3.q(r0, r2, r1)
        L2a:
            return
    }
}
