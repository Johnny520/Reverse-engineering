package p095T;

import java.util.Iterator;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: T.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1325M implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C1318I0 f4747d;

    /* JADX INFO: renamed from: e */
    public final int f4748e;

    /* JADX INFO: renamed from: f */
    public int f4749f;

    /* JADX INFO: renamed from: g */
    public final int f4750g;

    public C1325M(C1318I0 c1318i0, int i5, int i6) {
        this.f4747d = c1318i0;
        this.f4748e = i6;
        this.f4749f = i5;
        this.f4750g = c1318i0.f4712k;
        if (c1318i0.f4711j) {
            AbstractC1322K0.m2447f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4749f < this.f4748e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1318I0 c1318i0 = this.f4747d;
        int i5 = c1318i0.f4712k;
        int i6 = this.f4750g;
        if (i5 != i6) {
            AbstractC1322K0.m2447f();
        }
        int i7 = this.f4749f;
        this.f4749f = AbstractC1322K0.m2442a(c1318i0.f4705d, i7) + i7;
        return new C1320J0(c1318i0, i7, i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
