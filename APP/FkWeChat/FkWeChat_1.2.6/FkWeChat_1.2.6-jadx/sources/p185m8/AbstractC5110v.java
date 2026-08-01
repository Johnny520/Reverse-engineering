package p185m8;

import java.util.Iterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5110v implements Iterator, InterfaceC1400a {
    /* JADX INFO: renamed from: g */
    public abstract char mo8551g();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo8551g());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
