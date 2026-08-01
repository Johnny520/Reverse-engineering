package p065M2;

import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p011B4.AbstractC0231b;
import p041H0.C0609o;
import p061L2.AbstractC0967g;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: M2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0998a extends AbstractC0967g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public Object[] f3082d;

    /* JADX INFO: renamed from: e */
    public final int f3083e;

    /* JADX INFO: renamed from: f */
    public int f3084f;

    /* JADX INFO: renamed from: g */
    public final C0998a f3085g;

    /* JADX INFO: renamed from: h */
    public final C0999b f3086h;

    public C0998a(Object[] objArr, int i5, int i6, C0998a c0998a, C0999b c0999b) {
        AbstractC1665j.m2985e(objArr, "backing");
        AbstractC1665j.m2985e(c0999b, "root");
        this.f3082d = objArr;
        this.f3083e = i5;
        this.f3084f = i6;
        this.f3085g = c0998a;
        this.f3086h = c0999b;
        ((AbstractList) this).modCount = ((AbstractList) c0999b).modCount;
    }

    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: a */
    public final int mo1976a() {
        m2052f();
        return this.f3084f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2053g();
        m2052f();
        m2051e(this.f3083e + this.f3084f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2053g();
        m2052f();
        int size = collection.size();
        m2050d(this.f3083e + this.f3084f, collection, size);
        return size > 0;
    }

    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: b */
    public final Object mo1977b(int i5) {
        m2053g();
        m2052f();
        int i6 = this.f3084f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return m2054h(this.f3083e + i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2053g();
        m2052f();
        m2055i(this.f3083e, this.f3084f);
    }

    /* JADX INFO: renamed from: d */
    public final void m2050d(int i5, Collection collection, int i6) {
        ((AbstractList) this).modCount++;
        C0999b c0999b = this.f3086h;
        C0998a c0998a = this.f3085g;
        if (c0998a != null) {
            c0998a.m2050d(i5, collection, i6);
        } else {
            C0999b c0999b2 = C0999b.f3087g;
            c0999b.m2058d(i5, collection, i6);
        }
        this.f3082d = c0999b.f3088d;
        this.f3084f += i6;
    }

    /* JADX INFO: renamed from: e */
    public final void m2051e(int i5, Object obj) {
        ((AbstractList) this).modCount++;
        C0999b c0999b = this.f3086h;
        C0998a c0998a = this.f3085g;
        if (c0998a != null) {
            c0998a.m2051e(i5, obj);
        } else {
            C0999b c0999b2 = C0999b.f3087g;
            c0999b.m2059e(i5, obj);
        }
        this.f3082d = c0999b.f3088d;
        this.f3084f++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m2052f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f3082d;
            int i5 = this.f3084f;
            if (i5 == list.size()) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (AbstractC1665j.m2981a(objArr[this.f3083e + i6], list.get(i6))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2052f() {
        if (((AbstractList) this.f3086h).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2053g() {
        if (this.f3086h.f3090f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        m2052f();
        int i6 = this.f3084f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return this.f3082d[this.f3083e + i5];
    }

    /* JADX INFO: renamed from: h */
    public final Object m2054h(int i5) {
        Object objM2062h;
        ((AbstractList) this).modCount++;
        C0998a c0998a = this.f3085g;
        if (c0998a != null) {
            objM2062h = c0998a.m2054h(i5);
        } else {
            C0999b c0999b = C0999b.f3087g;
            objM2062h = this.f3086h.m2062h(i5);
        }
        this.f3084f--;
        return objM2062h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m2052f();
        Object[] objArr = this.f3082d;
        int i5 = this.f3084f;
        int iHashCode = 1;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = objArr[this.f3083e + i6];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m2055i(int i5, int i6) {
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0998a c0998a = this.f3085g;
        if (c0998a != null) {
            c0998a.m2055i(i5, i6);
        } else {
            C0999b c0999b = C0999b.f3087g;
            this.f3086h.m2063i(i5, i6);
        }
        this.f3084f -= i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m2052f();
        for (int i5 = 0; i5 < this.f3084f; i5++) {
            if (AbstractC1665j.m2981a(this.f3082d[this.f3083e + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m2052f();
        return this.f3084f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m2056j(int i5, int i6, Collection collection, boolean z5) {
        int iM2064j;
        C0998a c0998a = this.f3085g;
        if (c0998a != null) {
            iM2064j = c0998a.m2056j(i5, i6, collection, z5);
        } else {
            C0999b c0999b = C0999b.f3087g;
            iM2064j = this.f3086h.m2064j(i5, i6, collection, z5);
        }
        if (iM2064j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3084f -= iM2064j;
        return iM2064j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m2052f();
        for (int i5 = this.f3084f - 1; i5 >= 0; i5--) {
            if (AbstractC1665j.m2981a(this.f3082d[this.f3083e + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m2053g();
        m2052f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1977b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2053g();
        m2052f();
        return m2056j(this.f3083e, this.f3084f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2053g();
        m2052f();
        return m2056j(this.f3083e, this.f3084f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        m2053g();
        m2052f();
        int i6 = this.f3084f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        Object[] objArr = this.f3082d;
        int i7 = this.f3083e;
        Object obj2 = objArr[i7 + i5];
        objArr[i7 + i5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i6) {
        AbstractC1925g.m3532i(i5, i6, this.f3084f);
        return new C0998a(this.f3082d, this.f3083e + i5, i6 - i5, this, this.f3086h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        m2052f();
        int length = objArr.length;
        int i5 = this.f3084f;
        int i6 = this.f3083e;
        if (length < i5) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f3082d, i6, i5 + i6, objArr.getClass());
            AbstractC1665j.m2984d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC0972l.m1993Q(this.f3082d, objArr, 0, i6, i5 + i6);
        int i7 = this.f3084f;
        if (i7 < objArr.length) {
            objArr[i7] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m2052f();
        return AbstractC1924f.m3493b(this.f3082d, this.f3083e, this.f3084f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        m2052f();
        int i6 = this.f3084f;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return new C0609o(this, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        m2053g();
        m2052f();
        int i6 = this.f3084f;
        if (i5 >= 0 && i5 <= i6) {
            m2051e(this.f3083e + i5, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2053g();
        m2052f();
        int i6 = this.f3084f;
        if (i5 >= 0 && i5 <= i6) {
            int size = collection.size();
            m2050d(this.f3083e + i5, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m2052f();
        Object[] objArr = this.f3082d;
        int i5 = this.f3084f;
        int i6 = this.f3083e;
        return AbstractC0972l.m1997U(objArr, i6, i5 + i6);
    }
}
