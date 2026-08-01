package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0423t0 implements List, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final List f1227q;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.t0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        int getIndex();

        Object getKey();
    }

    public C0423t0() {
        this(new SnapshotStateList());
    }

    /* JADX INFO: renamed from: a */
    public boolean m1397a(a aVar) {
        return this.f1227q.contains(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get(int i10) {
        return (a) this.f1227q.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a) {
            return m1397a((a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f1227q.containsAll(collection);
    }

    /* JADX INFO: renamed from: e */
    public int m1399e() {
        return this.f1227q.size();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof a) {
            return m1400l((a) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f1227q.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f1227q.iterator();
    }

    /* JADX INFO: renamed from: l */
    public int m1400l(a aVar) {
        return this.f1227q.indexOf(aVar);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof a) {
            return m1401o((a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f1227q.listIterator();
    }

    /* JADX INFO: renamed from: o */
    public int m1401o(a aVar) {
        return this.f1227q.lastIndexOf(aVar);
    }

    /* JADX INFO: renamed from: p */
    public final void m1402p(a aVar) {
        this.f1227q.add(aVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m1403q(a aVar) {
        this.f1227q.remove(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m1399e();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return this.f1227q.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1041j.m3804b(this, objArr);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return this.f1227q.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C0423t0(List list) {
        this.f1227q = list;
    }
}
