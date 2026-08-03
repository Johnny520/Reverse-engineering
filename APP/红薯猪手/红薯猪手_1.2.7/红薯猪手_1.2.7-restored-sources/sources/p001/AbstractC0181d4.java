package p001;

import java.util.Iterator;

/* JADX INFO: renamed from: ۟.d4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181d4 implements Iterator<Integer>, InterfaceC0321n4 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
