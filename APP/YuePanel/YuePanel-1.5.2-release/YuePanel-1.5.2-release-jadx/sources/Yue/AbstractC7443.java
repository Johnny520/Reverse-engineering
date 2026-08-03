package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7443 implements Iterator<Short>, InterfaceC5591 {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(mo488());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Short m3640() {
        return Short.valueOf(mo488());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract short mo488();
}
