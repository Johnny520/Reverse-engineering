package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends AbstractC0947z2 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: k */
    public static final pb1 f8242k;

    /* JADX INFO: renamed from: h */
    public Object[] f8243h;

    /* JADX INFO: renamed from: i */
    public int f8244i;

    /* JADX INFO: renamed from: j */
    public boolean f8245j;

    static {
        pb1 pb1Var = new pb1(0);
        pb1Var.f8245j = true;
        f8242k = pb1Var;
    }

    public pb1(int i) {
        if (i >= 0) {
            this.f8243h = new Object[i];
        } else {
            C0676s.m4651j("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: a */
    public final int mo152a() {
        return this.f8244i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3838f();
        int i2 = this.f8244i;
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return;
        }
        ((AbstractList) this).modCount++;
        m3839g(i, 1);
        this.f8243h[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m3838f();
        int i2 = this.f8244i;
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        m3836d(i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: b */
    public final Object mo153b(int i) {
        m3838f();
        int i2 = this.f8244i;
        if (i >= 0 && i < i2) {
            return m3840h(i);
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3838f();
        m3841i(0, this.f8244i);
    }

    /* JADX INFO: renamed from: d */
    public final void m3836d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m3839g(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f8243h[i + i3] = it.next();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3837e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m3839g(i, 1);
        this.f8243h[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f8243h;
            int i = this.f8244i;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (t11.m5086l(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3838f() {
        if (this.f8245j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3839g(int i, int i2) {
        int i3 = this.f8244i + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f8243h;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f8243h = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f8243h;
        AbstractC0460mg.m3088c0(objArr2, objArr2, i + i2, i, this.f8244i);
        this.f8244i += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f8244i;
        if (i >= 0 && i < i2) {
            return this.f8243h[i];
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Object m3840h(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f8243h;
        Object obj = objArr[i];
        AbstractC0460mg.m3088c0(objArr, objArr, i, i + 1, this.f8244i);
        Object[] objArr2 = this.f8243h;
        int i2 = this.f8244i - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f8244i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f8243h;
        int i = this.f8244i;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m3841i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f8243h;
        AbstractC0460mg.m3088c0(objArr, objArr, i, i + i2, this.f8244i);
        Object[] objArr2 = this.f8243h;
        int i3 = this.f8244i;
        tp0.m5345I(objArr2, i3 - i2, i3);
        this.f8244i -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f8244i; i++) {
            if (t11.m5086l(this.f8243h[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f8244i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m3842j(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f8243h;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f8243h;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC0460mg.m3088c0(objArr, objArr, i + i4, i2 + i, this.f8244i);
        Object[] objArr3 = this.f8243h;
        int i7 = this.f8244i;
        tp0.m5345I(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f8244i -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f8244i - 1; i >= 0; i--) {
            if (t11.m5086l(this.f8243h[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f8244i;
        if (i >= 0 && i <= i2) {
            return new vs0(this, i);
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3838f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo153b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m3838f();
        return m3842j(0, this.f8244i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m3838f();
        return m3842j(0, this.f8244i, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3838f();
        int i2 = this.f8244i;
        if (i < 0 || i >= i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.f8243h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        sp0.m4963u(i, i2, this.f8244i);
        return new ob1(this.f8243h, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f8244i;
        Object[] objArr2 = this.f8243h;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC0460mg.m3088c0(objArr2, objArr, 0, 0, i);
        int i2 = this.f8244i;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return tp0.m5362g(this.f8243h, 0, this.f8244i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3838f();
        int i = this.f8244i;
        ((AbstractList) this).modCount++;
        m3839g(i, 1);
        this.f8243h[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0460mg.m3093h0(this.f8243h, 0, this.f8244i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m3838f();
        int size = collection.size();
        m3836d(this.f8244i, collection, size);
        return size > 0;
    }
}
