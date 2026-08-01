package p185m8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5087j0 implements List, Serializable, RandomAccess, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public static final C5087j0 f15399q = new C5087j0();
    private static final long serialVersionUID = -7390468764508069838L;

    private final Object readResolve() {
        return f15399q;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20600a(Void r12) {
        r12.getClass();
        return false;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m20600a((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return collection.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public int m20602e() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return m20603l((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C5083h0.f15398q;
    }

    /* JADX INFO: renamed from: l */
    public int m20603l(Void r12) {
        r12.getClass();
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return m20604o((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return C5083h0.f15398q;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }

    /* JADX INFO: renamed from: o */
    public int m20604o(Void r12) {
        r12.getClass();
        return -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
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
        return m20602e();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        C5085i0.m20599a("fromIndex: ", i10, ", toIndex: ", i11);
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
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

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return C5083h0.f15398q;
    }
}
