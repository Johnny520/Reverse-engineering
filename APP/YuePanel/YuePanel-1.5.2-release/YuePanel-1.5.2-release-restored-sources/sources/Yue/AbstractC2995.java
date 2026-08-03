package Yue;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public abstract class AbstractC2995<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC5592 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo61();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract int mo61();
}
