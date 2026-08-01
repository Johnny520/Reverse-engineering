package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s6 extends defpackage.dx {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;
    private volatile java.lang.Object _consensus;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_consensus"
            java.lang.Class<s6> r2 = defpackage.s6.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            defpackage.s6.a = r0
            return
    }

    public s6() {
            r1 = this;
            r1.<init>()
            l0 r0 = defpackage.ip.a
            r1._consensus = r0
            return
    }

    @Override // defpackage.dx
    public final java.lang.Object a(java.lang.Object r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.s6.a
            java.lang.Object r1 = r0.get(r4)
            l0 r2 = defpackage.ip.a
            if (r1 != r2) goto L28
            l0 r3 = r4.c(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L28
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = r3
            goto L28
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
        L28:
            r4.b(r5, r1)
            return r1
    }

    public abstract void b(java.lang.Object r1, java.lang.Object r2);

    public abstract defpackage.l0 c(java.lang.Object r1);
}
