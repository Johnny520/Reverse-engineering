package p185m8;

import java.util.Collection;
import java.util.Iterator;
import p024b9.AbstractC1027c;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5094n implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final Object[] f15403q;

    /* JADX INFO: renamed from: r */
    public final boolean f15404r;

    public C5094n(Object[] objArr, boolean z10) {
        objArr.getClass();
        this.f15403q = objArr;
        this.f15404r = z10;
    }

    /* JADX INFO: renamed from: a */
    public int m20618a() {
        return this.f15403q.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC5106t.m20704R(this.f15403q, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f15403q.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC1027c.m3774a(this.f15403q);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m20618a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC5112w.m20786b(this.f15403q, this.f15404r);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }
}
