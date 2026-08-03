package p000a;

import java.util.Iterator;

/* JADX INFO: renamed from: a.c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517c9 implements Iterator<Integer>, InterfaceC0783q9 {
    /* JADX INFO: renamed from: a */
    public abstract int mo1278a();

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo1278a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
