package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class u60 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    private volatile int _size;
    public defpackage.hj[] a;

    static {
            java.lang.Class<u60> r0 = defpackage.u60.class
            java.lang.String r1 = "_size"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.u60.b = r0
            return
    }

    public final void a(defpackage.hj r5) {
            r4 = this;
            r0 = r4
            ij r0 = (defpackage.ij) r0
            r5.d(r0)
            hj[] r0 = r4.a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.u60.b
            if (r0 != 0) goto L12
            r0 = 4
            hj[] r0 = new defpackage.hj[r0]
            r4.a = r0
            goto L2c
        L12:
            int r2 = r1.get(r4)
            int r3 = r0.length
            if (r2 < r3) goto L2c
            int r2 = r1.get(r4)
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(this, newSize)"
            defpackage.ip.n(r2, r0)
            hj[] r0 = (defpackage.hj[]) r0
            r4.a = r0
        L2c:
            int r2 = r1.get(r4)
            int r3 = r2 + 1
            r1.set(r4, r3)
            r0[r2] = r5
            r5.b = r2
            r4.c(r2)
            return
    }

    public final defpackage.hj b(int r9) {
            r8 = this;
            hj[] r0 = r8.a
            defpackage.ip.l(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.u60.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            defpackage.ip.l(r4)
            r5 = r0[r2]
            defpackage.ip.l(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            hj[] r5 = r8.a
            defpackage.ip.l(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            defpackage.ip.l(r6)
            r7 = r5[r4]
            defpackage.ip.l(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            defpackage.ip.l(r4)
            r5 = r5[r2]
            defpackage.ip.l(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            defpackage.ip.l(r9)
            r2 = 0
            r9.d(r2)
            r9.b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
    }

    public final void c(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            goto L1c
        L3:
            hj[] r0 = r3.a
            defpackage.ip.l(r0)
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            defpackage.ip.l(r2)
            r0 = r0[r4]
            defpackage.ip.l(r0)
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1d
        L1c:
            return
        L1d:
            r3.d(r4, r1)
            r4 = r1
            goto L0
    }

    public final void d(int r4, int r5) {
            r3 = this;
            hj[] r0 = r3.a
            defpackage.ip.l(r0)
            r1 = r0[r5]
            defpackage.ip.l(r1)
            r2 = r0[r4]
            defpackage.ip.l(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.b = r4
            r2.b = r5
            return
    }
}
