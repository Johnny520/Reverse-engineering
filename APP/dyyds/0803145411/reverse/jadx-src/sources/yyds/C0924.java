package yyds;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᛴᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0924 extends AbstractC0212 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4234;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2578 f4235;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object[] f4236;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0924 f4237;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f4238;

    public C0924(Object[] objArr, int i, int i2, C0924 c0924, C2578 c2578) {
        this.f4236 = objArr;
        this.f4238 = i;
        this.f4234 = i2;
        this.f4237 = c0924;
        this.f4235 = c2578;
        ((AbstractList) this).modCount = ((AbstractList) c2578).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m2044();
        m2046();
        int i2 = this.f4234;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        m2043(this.f4238 + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2044();
        m2046();
        int i2 = this.f4234;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        m2047(this.f4238 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2044();
        m2046();
        m2042(this.f4238, this.f4234);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m2046();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f4236;
            int i = this.f4234;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC1544.m3188(objArr[this.f4238 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2046();
        int i2 = this.f4234;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return this.f4236[this.f4238 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m2046();
        Object[] objArr = this.f4236;
        int i = this.f4234;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f4238 + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m2046();
        for (int i = 0; i < this.f4234; i++) {
            if (AbstractC1544.m3188(this.f4236[this.f4238 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m2046();
        return this.f4234 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m2046();
        for (int i = this.f4234 - 1; i >= 0; i--) {
            if (AbstractC1544.m3188(this.f4236[this.f4238 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m2046();
        int i2 = this.f4234;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return new C0368(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m2044();
        m2046();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo869(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m2044();
        m2046();
        return m2045(this.f4238, this.f4234, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m2044();
        m2046();
        return m2045(this.f4238, this.f4234, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2044();
        m2046();
        int i2 = this.f4234;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f4236;
        int i3 = this.f4238;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1960.m3783(i, i2, this.f4234);
        return new C0924(this.f4236, this.f4238 + i, i2 - i, this, this.f4235);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m2046();
        int length = objArr.length;
        int i = this.f4234;
        Object[] objArr2 = this.f4236;
        int i2 = this.f4238;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        AbstractC2070.m3939(0, i2, i + i2, objArr2, objArr);
        int i3 = this.f4234;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m2046();
        return AbstractC2217.m4198(this.f4236, this.f4238, this.f4234, this);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object m2041(int i) {
        Object objM4648;
        ((AbstractList) this).modCount++;
        C0924 c0924 = this.f4237;
        if (c0924 != null) {
            objM4648 = c0924.m2041(i);
        } else {
            C2578 c2578 = C2578.f12708;
            objM4648 = this.f4235.m4648(i);
        }
        this.f4234--;
        return objM4648;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m2042(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0924 c0924 = this.f4237;
        if (c0924 != null) {
            c0924.m2042(i, i2);
        } else {
            C2578 c2578 = C2578.f12708;
            this.f4235.m4649(i, i2);
        }
        this.f4234 -= i2;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m2043(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C2578 c2578 = this.f4235;
        C0924 c0924 = this.f4237;
        if (c0924 != null) {
            c0924.m2043(i, obj);
        } else {
            C2578 c25782 = C2578.f12708;
            c2578.m4650(i, obj);
        }
        this.f4236 = c2578.f12710;
        this.f4234++;
    }

    @Override // yyds.AbstractC0212
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo868() {
        m2046();
        return this.f4234;
    }

    @Override // yyds.AbstractC0212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo869(int i) {
        m2044();
        m2046();
        int i2 = this.f4234;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return m2041(this.f4238 + i);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2044() {
        if (this.f4235.f12709) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int m2045(int i, int i2, Collection collection, boolean z) {
        int iM4652;
        C0924 c0924 = this.f4237;
        if (c0924 != null) {
            iM4652 = c0924.m2045(i, i2, collection, z);
        } else {
            C2578 c2578 = C2578.f12708;
            iM4652 = this.f4235.m4652(i, i2, collection, z);
        }
        if (iM4652 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4234 -= iM4652;
        return iM4652;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m2046() {
        if (((AbstractList) this.f4235).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2047(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C2578 c2578 = this.f4235;
        C0924 c0924 = this.f4237;
        if (c0924 != null) {
            c0924.m2047(i, collection, i2);
        } else {
            C2578 c25782 = C2578.f12708;
            c2578.m4654(i, collection, i2);
        }
        this.f4236 = c2578.f12710;
        this.f4234 += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2044();
        m2046();
        m2043(this.f4238 + this.f4234, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m2046();
        Object[] objArr = this.f4236;
        int i = this.f4234;
        int i2 = this.f4238;
        int i3 = i + i2;
        AbstractC0476.m1329(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2044();
        m2046();
        int size = collection.size();
        m2047(this.f4238 + this.f4234, collection, size);
        return size > 0;
    }
}
