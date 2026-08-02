package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b11 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final int f509h;

    /* JADX INFO: renamed from: i */
    public final int f510i;

    /* JADX INFO: renamed from: j */
    public boolean f511j;

    /* JADX INFO: renamed from: k */
    public int f512k;

    public b11(int i, int i2, int i3) {
        this.f509h = i3;
        this.f510i = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f511j = z;
        this.f512k = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f511j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f512k;
        if (i != this.f510i) {
            this.f512k = this.f509h + i;
        } else {
            if (!this.f511j) {
                um2.m5513b();
                return null;
            }
            this.f511j = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
