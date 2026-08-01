package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wr {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;
    private volatile java.lang.Object _cur;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_cur"
            java.lang.Class<wr> r2 = defpackage.wr.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            defpackage.wr.a = r0
            return
    }

    public wr() {
            r3 = this;
            r3.<init>()
            yr r0 = new yr
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r3._cur = r0
            return
    }

    public final boolean a(java.lang.Runnable r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wr.a
            java.lang.Object r1 = r0.get(r4)
            yr r1 = (defpackage.yr) r1
            int r2 = r1.a(r5)
            r3 = 1
            if (r2 == 0) goto L29
            if (r2 == r3) goto L17
            r0 = 2
            if (r2 == r0) goto L15
            goto L0
        L15:
            r5 = 0
            return r5
        L17:
            yr r2 = r1.c()
        L1b:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L22
            goto L0
        L22:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L1b
            goto L0
        L29:
            return r3
    }

    public final void b() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wr.a
            java.lang.Object r1 = r0.get(r4)
            yr r1 = (defpackage.yr) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto Lf
            return
        Lf:
            yr r2 = r1.c()
        L13:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L1a
            goto L0
        L1a:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L13
            goto L0
    }

    public final int c() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wr.a
            java.lang.Object r0 = r0.get(r5)
            yr r0 = (defpackage.yr) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.yr.f
            long r0 = r1.get(r0)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r2 = (int) r2
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r3
            r3 = 30
            long r0 = r0 >> r3
            int r0 = (int) r0
            int r0 = r0 - r2
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            return r0
    }

    public final java.lang.Object d() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wr.a
            java.lang.Object r1 = r0.get(r4)
            yr r1 = (defpackage.yr) r1
            java.lang.Object r2 = r1.d()
            l0 r3 = defpackage.yr.g
            if (r2 == r3) goto L11
            return r2
        L11:
            yr r2 = r1.c()
        L15:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L1c
            goto L0
        L1c:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L15
            goto L0
    }
}
