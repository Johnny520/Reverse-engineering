package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class va0 extends AbstractC0001a0 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public Object[] f6621d;

    /* JADX INFO: renamed from: e */
    public final int f6622e;

    /* JADX INFO: renamed from: f */
    public int f6623f;

    /* JADX INFO: renamed from: g */
    public final va0 f6624g;

    /* JADX INFO: renamed from: h */
    public final wa0 f6625h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public va0(Object[] objArr, int i, int i2, va0 va0Var, wa0 wa0Var) {
        objArr.getClass();
        wa0Var.getClass();
        this.f6621d = objArr;
        this.f6622e = i;
        this.f6623f = i2;
        this.f6624g = va0Var;
        this.f6625h = wa0Var;
        ((AbstractList) this).modCount = ((AbstractList) wa0Var).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        m4434f();
        return this.f6623f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m4435g();
        m4434f();
        int i2 = this.f6623f;
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        } else {
            m4433e(this.f6622e + i, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m4435g();
        m4434f();
        int i2 = this.f6623f;
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        m4432d(this.f6622e + i, collection, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: b */
    public final Object mo1b(int i) {
        m4435g();
        m4434f();
        int i2 = this.f6623f;
        if (i >= 0 && i < i2) {
            return m4436h(this.f6622e + i);
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4435g();
        m4434f();
        m4437i(this.f6622e, this.f6623f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4432d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        wa0 wa0Var = this.f6625h;
        va0 va0Var = this.f6624g;
        if (va0Var != null) {
            va0Var.m4432d(i, collection, i2);
        } else {
            wa0 wa0Var2 = wa0.f7052g;
            wa0Var.m4929d(i, collection, i2);
        }
        this.f6621d = wa0Var.f7053d;
        this.f6623f += i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4433e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        wa0 wa0Var = this.f6625h;
        va0 va0Var = this.f6624g;
        if (va0Var != null) {
            va0Var.m4433e(i, obj);
        } else {
            wa0 wa0Var2 = wa0.f7052g;
            wa0Var.m4930e(i, obj);
        }
        this.f6621d = wa0Var.f7053d;
        this.f6623f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m4434f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f6621d;
            int i = this.f6623f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (p30.m3002l(objArr[this.f6622e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4434f() {
        if (((AbstractList) this.f6625h).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4435g() {
        if (this.f6625h.f7055f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m4434f();
        int i2 = this.f6623f;
        if (i >= 0 && i < i2) {
            return this.f6621d[this.f6622e + i];
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m4436h(int i) {
        Object objM4933h;
        ((AbstractList) this).modCount++;
        va0 va0Var = this.f6624g;
        if (va0Var != null) {
            objM4933h = va0Var.m4436h(i);
        } else {
            wa0 wa0Var = wa0.f7052g;
            objM4933h = this.f6625h.m4933h(i);
        }
        this.f6623f--;
        return objM4933h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m4434f();
        Object[] objArr = this.f6621d;
        int i = this.f6623f;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f6622e + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4437i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        va0 va0Var = this.f6624g;
        if (va0Var != null) {
            va0Var.m4437i(i, i2);
        } else {
            wa0 wa0Var = wa0.f7052g;
            this.f6625h.m4934i(i, i2);
        }
        this.f6623f -= i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m4434f();
        for (int i = 0; i < this.f6623f; i++) {
            if (p30.m3002l(this.f6621d[this.f6622e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m4434f();
        return this.f6623f == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m4438j(int i, int i2, Collection collection, boolean z) {
        int iM4935j;
        va0 va0Var = this.f6624g;
        if (va0Var != null) {
            iM4935j = va0Var.m4438j(i, i2, collection, z);
        } else {
            wa0 wa0Var = wa0.f7052g;
            iM4935j = this.f6625h.m4935j(i, i2, collection, z);
        }
        if (iM4935j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6623f -= iM4935j;
        return iM4935j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m4434f();
        for (int i = this.f6623f - 1; i >= 0; i--) {
            if (p30.m3002l(this.f6621d[this.f6622e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m4434f();
        int i2 = this.f6623f;
        if (i >= 0 && i <= i2) {
            return new C0530ny(this, i);
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4435g();
        m4434f();
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
        m4435g();
        m4434f();
        return m4438j(this.f6622e, this.f6623f, collection, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m4435g();
        m4434f();
        return m4438j(this.f6622e, this.f6623f, collection, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4435g();
        m4434f();
        int i2 = this.f6623f;
        if (i < 0 || i >= i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f6621d;
        int i3 = this.f6622e;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        s91.m4050o(i, i2, this.f6623f);
        return new va0(this.f6621d, this.f6622e + i, i2 - i, this, this.f6625h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        m4434f();
        int length = objArr.length;
        int i = this.f6623f;
        Object[] objArr2 = this.f6621d;
        int i2 = this.f6622e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC0201f9.m1057c0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.f6623f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        m4434f();
        return w60.m4899f(this.f6621d, this.f6622e, this.f6623f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4435g();
        m4434f();
        m4433e(this.f6622e + this.f6623f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m4434f();
        Object[] objArr = this.f6621d;
        int i = this.f6623f;
        int i2 = this.f6622e;
        return AbstractC0201f9.m1060f0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m4435g();
        m4434f();
        int size = collection.size();
        m4432d(this.f6622e + this.f6623f, collection, size);
        return size > 0;
    }
}
