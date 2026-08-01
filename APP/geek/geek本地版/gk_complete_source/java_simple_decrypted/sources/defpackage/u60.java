package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class u60 {
    public static final AtomicIntegerFieldUpdater b = null;
    private volatile int _size;
    public hj[] a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(u60.class, "_size");
    }

    public final void a(hj r5) {
        r5.d((ij) this);
        hj[] r0 = this.a;
        AtomicIntegerFieldUpdater r1 = b;
        if (r0 != null) goto L6;
        r0 = new hj[4];
        this.a = r0;
    L8:
        int r2 = r1.get(this);
        r1.set(this, r2 + 1);
        r0[r2] = r5;
        r5.b = r2;
        c(r2);
        return;
    L6:
        if (r1.get(this) < r0.length) goto L8;
        Object[] r02 = Arrays.copyOf(r0, r1.get(this) * 2);
        ip.n("copyOf(this, newSize)", r02);
        r0 = (hj[]) r02;
        this.a = r0;
        goto L8
    }

    public final hj b(int r9) {
        Object[] r0 = this.a;
        ip.l(r0);
        AtomicIntegerFieldUpdater r1 = b;
        r1.set(this, r1.get(this) - 1);
        if (r9 >= r1.get(this)) goto L22;
        d(r9, r1.get(this));
        int r2 = (r9 - 1) / 2;
        if (r9 <= 0) goto L9;
        hj r4 = r0[r9];
        ip.l(r4);
        Object r5 = r0[r2];
        ip.l(r5);
        if (r4.compareTo(r5) >= 0) goto L9;
        d(r9, r2);
        c(r2);
    L9:
        int r22 = r9 * 2;
        int r42 = r22 + 1;
        if (r42 >= r1.get(this)) goto L22;
        Object[] r52 = this.a;
        ip.l(r52);
        int r23 = r22 + 2;
        if (r23 >= r1.get(this)) goto L17;
        Comparable r6 = r52[r23];
        ip.l(r6);
        Object r7 = r52[r42];
        ip.l(r7);
        if (r6.compareTo(r7) >= 0) goto L17;
    L18:
        Comparable r43 = r52[r9];
        ip.l(r43);
        Comparable r53 = r52[r23];
        ip.l(r53);
        if (r43.compareTo(r53) <= 0) goto L22;
        d(r9, r23);
        r9 = r23;
    L17:
        r23 = r42;
    L22:
        hj r92 = r0[r1.get(this)];
        ip.l(r92);
        r92.d(null);
        r92.b = -1;
        r0[r1.get(this)] = null;
        return r92;
    }

    public final void c(int r4) {
    L2:
        if (r4 <= 0) goto L6;
        hj[] r0 = this.a;
        ip.l(r0);
        int r1 = (r4 - 1) / 2;
        hj r2 = r0[r1];
        ip.l(r2);
        hj r02 = r0[r4];
        ip.l(r02);
        if (r2.compareTo(r02) <= 0) goto L10;
        d(r4, r1);
        r4 = r1;
        goto L2
    L10:
        return;
    }

    public final void d(int r4, int r5) {
        hj[] r0 = this.a;
        ip.l(r0);
        hj r1 = r0[r5];
        ip.l(r1);
        hj r2 = r0[r4];
        ip.l(r2);
        r0[r4] = r1;
        r0[r5] = r2;
        r1.b = r4;
        r2.b = r5;
    }
}
