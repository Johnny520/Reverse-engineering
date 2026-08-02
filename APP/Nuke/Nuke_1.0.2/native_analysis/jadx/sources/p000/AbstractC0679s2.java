package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0679s2 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public int f9875h;

    /* JADX INFO: renamed from: i */
    public Object f9876i;

    /* JADX INFO: renamed from: a */
    public abstract void mo2473a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9875h;
        if (i == 0) {
            this.f9875h = 3;
            mo2473a();
            return this.f9875h == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C0676s.m4651j("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9875h;
        if (i == 1) {
            this.f9875h = 0;
            return this.f9876i;
        }
        if (i != 2) {
            this.f9875h = 3;
            mo2473a();
            if (this.f9875h == 1) {
                this.f9875h = 0;
                return this.f9876i;
            }
        }
        um2.m5513b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
