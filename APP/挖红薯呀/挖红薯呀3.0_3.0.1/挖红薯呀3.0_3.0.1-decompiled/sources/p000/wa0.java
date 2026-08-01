package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends AbstractC0001a0 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: g */
    public static final wa0 f7052g;

    /* JADX INFO: renamed from: d */
    public Object[] f7053d;

    /* JADX INFO: renamed from: e */
    public int f7054e;

    /* JADX INFO: renamed from: f */
    public boolean f7055f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wa0 wa0Var = new wa0(0);
        wa0Var.f7055f = true;
        f7052g = wa0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wa0(int i) {
        if (i >= 0) {
            this.f7053d = new Object[i];
        } else {
            C0921xc.m5131l("capacity must be non-negative.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f7054e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m4931f();
        int i2 = this.f7054e;
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m4932g(i, 1);
        this.f7053d[i] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m4931f();
        int i2 = this.f7054e;
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        m4929d(i, collection, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: b */
    public final Object mo1b(int i) {
        m4931f();
        int i2 = this.f7054e;
        if (i >= 0 && i < i2) {
            return m4933h(i);
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4931f();
        m4934i(0, this.f7054e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4929d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m4932g(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f7053d[i + i3] = it.next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4930e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m4932g(i, 1);
        this.f7053d[i] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f7053d;
            int i = this.f7054e;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (p30.m3002l(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4931f() {
        if (this.f7055f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4932g(int i, int i2) {
        int i3 = this.f7054e + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f7053d;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f7053d = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f7053d;
        AbstractC0201f9.m1057c0(objArr2, objArr2, i + i2, i, this.f7054e);
        this.f7054e += i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f7054e;
        if (i >= 0 && i < i2) {
            return this.f7053d[i];
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m4933h(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f7053d;
        Object obj = objArr[i];
        AbstractC0201f9.m1057c0(objArr, objArr, i, i + 1, this.f7054e);
        Object[] objArr2 = this.f7053d;
        int i2 = this.f7054e - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f7054e--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f7053d;
        int i = this.f7054e;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4934i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f7053d;
        AbstractC0201f9.m1057c0(objArr, objArr, i, i + i2, this.f7054e);
        Object[] objArr2 = this.f7053d;
        int i3 = this.f7054e;
        w60.m4886H(objArr2, i3 - i2, i3);
        this.f7054e -= i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f7054e; i++) {
            if (p30.m3002l(this.f7053d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7054e == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m4935j(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f7053d;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f7053d;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC0201f9.m1057c0(objArr, objArr, i + i4, i2 + i, this.f7054e);
        Object[] objArr3 = this.f7053d;
        int i7 = this.f7054e;
        w60.m4886H(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7054e -= i6;
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f7054e - 1; i >= 0; i--) {
            if (p30.m3002l(this.f7053d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f7054e;
        if (i >= 0 && i <= i2) {
            return new C0530ny(this, i);
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4931f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m4931f();
        return m4935j(0, this.f7054e, collection, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m4931f();
        return m4935j(0, this.f7054e, collection, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4931f();
        int i2 = this.f7054e;
        if (i < 0 || i >= i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f7053d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        s91.m4050o(i, i2, this.f7054e);
        return new va0(this.f7053d, i, i2 - i, null, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f7054e;
        Object[] objArr2 = this.f7053d;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC0201f9.m1057c0(objArr2, objArr, 0, 0, i);
        int i2 = this.f7054e;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return w60.m4899f(this.f7053d, 0, this.f7054e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4931f();
        int i = this.f7054e;
        ((AbstractList) this).modCount++;
        m4932g(i, 1);
        this.f7053d[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0201f9.m1060f0(this.f7053d, 0, this.f7054e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m4931f();
        int size = collection.size();
        m4929d(this.f7054e, collection, size);
        return size > 0;
    }
}
