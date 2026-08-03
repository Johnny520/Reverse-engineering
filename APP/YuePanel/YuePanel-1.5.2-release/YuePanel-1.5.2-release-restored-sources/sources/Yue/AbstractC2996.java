package Yue;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public abstract class AbstractC2996<E> extends AbstractList<E> implements List<E>, InterfaceC5595 {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return mo63(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo62();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract int mo62();

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract E mo63(int i);
}
