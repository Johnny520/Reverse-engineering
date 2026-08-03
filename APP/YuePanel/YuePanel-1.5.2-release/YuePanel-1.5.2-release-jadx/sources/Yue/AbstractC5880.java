package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5880 implements Iterator<Long>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(mo479());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Long m2549() {
        return Long.valueOf(mo479());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract long mo479();
}
