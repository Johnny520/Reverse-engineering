package p065M2;

import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p011B4.AbstractC0231b;
import p041H0.C0609o;
import p061L2.AbstractC0967g;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: M2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0999b extends AbstractC0967g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: g */
    public static final C0999b f3087g;

    /* JADX INFO: renamed from: d */
    public Object[] f3088d;

    /* JADX INFO: renamed from: e */
    public int f3089e;

    /* JADX INFO: renamed from: f */
    public boolean f3090f;

    static {
        C0999b c0999b = new C0999b(0);
        c0999b.f3090f = true;
        f3087g = c0999b;
    }

    public C0999b(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f3088d = new Object[i5];
    }

    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: a */
    public final int mo1976a() {
        return this.f3089e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2060f();
        int i5 = this.f3089e;
        ((AbstractList) this).modCount++;
        m2061g(i5, 1);
        this.f3088d[i5] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2060f();
        int size = collection.size();
        m2058d(this.f3089e, collection, size);
        return size > 0;
    }

    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: b */
    public final Object mo1977b(int i5) {
        m2060f();
        int i6 = this.f3089e;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return m2062h(i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2060f();
        m2063i(0, this.f3089e);
    }

    /* JADX INFO: renamed from: d */
    public final void m2058d(int i5, Collection collection, int i6) {
        ((AbstractList) this).modCount++;
        m2061g(i5, i6);
        Iterator it = collection.iterator();
        for (int i7 = 0; i7 < i6; i7++) {
            this.f3088d[i5 + i7] = it.next();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2059e(int i5, Object obj) {
        ((AbstractList) this).modCount++;
        m2061g(i5, 1);
        this.f3088d[i5] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f3088d;
            int i5 = this.f3089e;
            if (i5 == list.size()) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (AbstractC1665j.m2981a(objArr[i6], list.get(i6))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2060f() {
        if (this.f3090f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2061g(int i5, int i6) {
        int i7 = this.f3089e + i6;
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f3088d;
        if (i7 > objArr.length) {
            int length = objArr.length;
            int i8 = length + (length >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i8);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            this.f3088d = objArrCopyOf;
        }
        Object[] objArr2 = this.f3088d;
        AbstractC0972l.m1993Q(objArr2, objArr2, i5 + i6, i5, this.f3089e);
        this.f3089e += i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        int i6 = this.f3089e;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return this.f3088d[i5];
    }

    /* JADX INFO: renamed from: h */
    public final Object m2062h(int i5) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f3088d;
        Object obj = objArr[i5];
        AbstractC0972l.m1993Q(objArr, objArr, i5, i5 + 1, this.f3089e);
        Object[] objArr2 = this.f3088d;
        int i6 = this.f3089e - 1;
        AbstractC1665j.m2985e(objArr2, "<this>");
        objArr2[i6] = null;
        this.f3089e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f3088d;
        int i5 = this.f3089e;
        int iHashCode = 1;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = objArr[i6];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m2063i(int i5, int i6) {
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f3088d;
        AbstractC0972l.m1993Q(objArr, objArr, i5, i5 + i6, this.f3089e);
        Object[] objArr2 = this.f3088d;
        int i7 = this.f3089e;
        AbstractC1924f.m3506t(objArr2, i7 - i6, i7);
        this.f3089e -= i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i5 = 0; i5 < this.f3089e; i5++) {
            if (AbstractC1665j.m2981a(this.f3088d[i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3089e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m2064j(int i5, int i6, Collection collection, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i5 + i7;
            if (collection.contains(this.f3088d[i9]) == z5) {
                Object[] objArr = this.f3088d;
                i7++;
                objArr[i8 + i5] = objArr[i9];
                i8++;
            } else {
                i7++;
            }
        }
        int i10 = i6 - i8;
        Object[] objArr2 = this.f3088d;
        AbstractC0972l.m1993Q(objArr2, objArr2, i5 + i8, i6 + i5, this.f3089e);
        Object[] objArr3 = this.f3088d;
        int i11 = this.f3089e;
        AbstractC1924f.m3506t(objArr3, i11 - i10, i11);
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3089e -= i10;
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i5 = this.f3089e - 1; i5 >= 0; i5--) {
            if (AbstractC1665j.m2981a(this.f3088d[i5], obj)) {
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
        m2060f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1977b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2060f();
        return m2064j(0, this.f3089e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2060f();
        return m2064j(0, this.f3089e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        m2060f();
        int i6 = this.f3089e;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        Object[] objArr = this.f3088d;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i6) {
        AbstractC1925g.m3532i(i5, i6, this.f3089e);
        return new C0998a(this.f3088d, i5, i6 - i5, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        int length = objArr.length;
        int i5 = this.f3089e;
        if (length < i5) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f3088d, 0, i5, objArr.getClass());
            AbstractC1665j.m2984d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC0972l.m1993Q(this.f3088d, objArr, 0, 0, i5);
        int i6 = this.f3089e;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1924f.m3493b(this.f3088d, 0, this.f3089e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        int i6 = this.f3089e;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        return new C0609o(this, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        m2060f();
        int i6 = this.f3089e;
        if (i5 >= 0 && i5 <= i6) {
            int size = collection.size();
            m2058d(i5, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        m2060f();
        int i6 = this.f3089e;
        if (i5 >= 0 && i5 <= i6) {
            ((AbstractList) this).modCount++;
            m2061g(i5, 1);
            this.f3088d[i5] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0972l.m1997U(this.f3088d, 0, this.f3089e);
    }
}
