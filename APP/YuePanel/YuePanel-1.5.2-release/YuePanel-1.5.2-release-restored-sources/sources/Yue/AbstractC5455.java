package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5455 implements Iterator<Integer>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo471());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Integer m2225() {
        return Integer.valueOf(mo471());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract int mo471();
}
