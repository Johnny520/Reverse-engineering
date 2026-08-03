package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: bD */
/* JADX INFO: loaded from: classes.dex */
public final class C1211bD implements Iterator {

    /* JADX INFO: renamed from: a */
    public Iterator f4142a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4142a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f4142a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
