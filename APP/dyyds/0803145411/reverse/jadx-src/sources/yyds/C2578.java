package yyds;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᲈᛱᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2578 extends AbstractC0212 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2578 f12708;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f12709;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object[] f12710;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f12711;

    static {
        C2578 c2578 = new C2578(0);
        c2578.f12709 = true;
        f12708 = c2578;
    }

    public C2578(int i) {
        if (i >= 0) {
            this.f12710 = new Object[i];
        } else {
            C0188.m798("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m4653();
        int i2 = this.f12711;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        m4651(i, 1);
        this.f12710[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m4653();
        int i2 = this.f12711;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        m4654(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4653();
        m4649(0, this.f12711);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f12710;
            int i = this.f12711;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC1544.m3188(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f12711;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return this.f12710[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f12710;
        int i = this.f12711;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f12711; i++) {
            if (AbstractC1544.m3188(this.f12710[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12711 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f12711 - 1; i >= 0; i--) {
            if (AbstractC1544.m3188(this.f12710[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f12711;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return new C0368(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4653();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo869(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m4653();
        return m4652(0, this.f12711, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m4653();
        return m4652(0, this.f12711, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4653();
        int i2 = this.f12711;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f12710;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1960.m3783(i, i2, this.f12711);
        return new C0924(this.f12710, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f12711;
        Object[] objArr2 = this.f12710;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
        }
        AbstractC2070.m3939(0, 0, i, objArr2, objArr);
        int i2 = this.f12711;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC2217.m4198(this.f12710, 0, this.f12711, this);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object m4648(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f12710;
        Object obj = objArr[i];
        AbstractC2070.m3939(i, i + 1, this.f12711, objArr, objArr);
        Object[] objArr2 = this.f12710;
        int i2 = this.f12711;
        objArr2[i2 - 1] = null;
        this.f12711 = i2 - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4649(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f12710;
        AbstractC2070.m3939(i, i + i2, this.f12711, objArr, objArr);
        Object[] objArr2 = this.f12710;
        int i3 = this.f12711;
        AbstractC2217.m4202(objArr2, i3 - i2, i3);
        this.f12711 -= i2;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4650(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m4651(i, 1);
        this.f12710[i] = obj;
    }

    @Override // yyds.AbstractC0212
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo868() {
        return this.f12711;
    }

    @Override // yyds.AbstractC0212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo869(int i) {
        m4653();
        int i2 = this.f12711;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return m4648(i);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4651(int i, int i2) {
        int i3 = this.f12711 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.f12710;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.f12710 = objArrCopyOf;
        }
        AbstractC2070.m3939(i + i2, i, this.f12711, objArrCopyOf, objArrCopyOf);
        this.f12711 += i2;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int m4652(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f12710;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f12710;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC2070.m3939(i + i4, i2 + i, this.f12711, objArr, objArr);
        Object[] objArr3 = this.f12710;
        int i7 = this.f12711;
        AbstractC2217.m4202(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f12711 -= i6;
        return i6;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4653() {
        if (this.f12709) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4654(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m4651(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f12710[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f12710;
        int i = this.f12711;
        AbstractC0476.m1329(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4653();
        int size = collection.size();
        m4654(this.f12711, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4653();
        int i = this.f12711;
        ((AbstractList) this).modCount++;
        m4651(i, 1);
        this.f12710[i] = obj;
        return true;
    }
}
