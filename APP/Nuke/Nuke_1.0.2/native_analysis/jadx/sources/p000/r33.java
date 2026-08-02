package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r33 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final Iterator f9347h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ bj0 f9348i;

    public r33(bj0 bj0Var) {
        this.f9348i = bj0Var;
        this.f9347h = bj0Var.f893b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9347h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f9348i.f894c.mo5j(this.f9347h.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
