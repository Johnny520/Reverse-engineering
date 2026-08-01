package androidx.compose.runtime;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p150k1.InterfaceC3920m;

/* JADX INFO: renamed from: androidx.compose.runtime.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0525k1 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final C0535l4 f1432q;

    /* JADX INFO: renamed from: r */
    public final int f1433r;

    /* JADX INFO: renamed from: s */
    public int f1434s;

    /* JADX INFO: renamed from: t */
    public final int f1435t;

    public C0525k1(C0535l4 c0535l4, int i10, int i11) {
        this.f1432q = c0535l4;
        this.f1433r = i11;
        this.f1434s = i10;
        this.f1435t = c0535l4.m1911y();
        if (c0535l4.m1912z()) {
            AbstractC0549n4.m1962u();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC3920m next() {
        m1777l();
        int i10 = this.f1434s;
        this.f1434s = AbstractC0549n4.m1956o(this.f1432q.m1906t(), i10) + i10;
        return new C0542m4(this.f1432q, i10, this.f1435t);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1434s < this.f1433r;
    }

    /* JADX INFO: renamed from: l */
    public final void m1777l() {
        if (this.f1432q.m1911y() != this.f1435t) {
            AbstractC0549n4.m1962u();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
