package androidx.compose.ui.layout;

import androidx.collection.AbstractC0292;
import androidx.collection.C0239;
import androidx.collection.C0240;
import androidx.collection.C0243;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC4382;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1714 implements Collection, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0243 f4985;

    public C1714() {
        int i = AbstractC0292.f1015;
        this.f4985 = new C0243(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f4985.m766(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f4985.m765();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4985.m887(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4985.m887(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4985.f1014 == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0243 c0243 = this.f4985;
        c0243.getClass();
        return new C0239(new C0240(c0243));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4985.m768(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f4985.m768(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f4985.m769(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4985.f1014;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC4382.m8875(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4382.m8874(this, objArr);
    }
}
