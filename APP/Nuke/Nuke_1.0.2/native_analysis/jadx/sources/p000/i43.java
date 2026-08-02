package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i43 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public Object[] f4268h = h43.f3816e.f3820d;

    /* JADX INFO: renamed from: i */
    public int f4269i;

    /* JADX INFO: renamed from: j */
    public int f4270j;

    /* JADX INFO: renamed from: a */
    public final void m2269a(Object[] objArr, int i, int i2) {
        this.f4268h = objArr;
        this.f4269i = i;
        this.f4270j = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4270j < this.f4269i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
