package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final qr2 f2153h;

    /* JADX INFO: renamed from: i */
    public final int f2154i;

    /* JADX INFO: renamed from: j */
    public int f2155j;

    /* JADX INFO: renamed from: k */
    public final int f2156k;

    public dr0(qr2 qr2Var, int i, int i2) {
        this.f2153h = qr2Var;
        this.f2154i = i2;
        this.f2155j = i;
        this.f2156k = qr2Var.f9139o;
        if (qr2Var.f9138n) {
            sr2.m4994f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2155j < this.f2154i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        qr2 qr2Var = this.f2153h;
        int i = qr2Var.f9139o;
        int i2 = this.f2156k;
        if (i != i2) {
            sr2.m4994f();
        }
        int i3 = this.f2155j;
        this.f2155j = qr2Var.f9132h[(i3 * 5) + 3] + i3;
        return new rr2(qr2Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
