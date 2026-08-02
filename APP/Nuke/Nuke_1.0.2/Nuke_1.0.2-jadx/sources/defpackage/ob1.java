package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 extends z2 implements RandomAccess, Serializable {
    public Object[] h;
    public final int i;
    public int j;
    public final ob1 k;
    public final pb1 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ob1(Object[] objArr, int i, int i2, ob1 ob1Var, pb1 pb1Var) {
        objArr.getClass();
        pb1Var.getClass();
        this.h = objArr;
        this.i = i;
        this.j = i2;
        this.k = ob1Var;
        this.l = pb1Var;
        ((AbstractList) this).modCount = ((AbstractList) pb1Var).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z2
    public final int a() {
        f();
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
        } else {
            e(this.i + i, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        d(this.i + i, collection, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z2
    public final Object b(int i) {
        g();
        f();
        int i2 = this.j;
        if (i >= 0 && i < i2) {
            return h(this.i + i);
        }
        s.d(vi0.h("index: ", i, ", size: ", i2));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.i, this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        pb1 pb1Var = this.l;
        ob1 ob1Var = this.k;
        if (ob1Var != null) {
            ob1Var.d(i, collection, i2);
        } else {
            pb1 pb1Var2 = pb1.k;
            pb1Var.d(i, collection, i2);
        }
        this.h = pb1Var.h;
        this.j += i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        pb1 pb1Var = this.l;
        ob1 ob1Var = this.k;
        if (ob1Var != null) {
            ob1Var.e(i, obj);
        } else {
            pb1 pb1Var2 = pb1.k;
            pb1Var.e(i, obj);
        }
        this.h = pb1Var.h;
        this.j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.h;
            int i = this.j;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (t11.l(objArr[this.i + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        if (((AbstractList) this.l).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        if (this.l.j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.j;
        if (i >= 0 && i < i2) {
            return this.h[this.i + i];
        }
        s.d(vi0.h("index: ", i, ", size: ", i2));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        ob1 ob1Var = this.k;
        if (ob1Var != null) {
            objH = ob1Var.h(i);
        } else {
            pb1 pb1Var = pb1.k;
            objH = this.l.h(i);
        }
        this.j--;
        return objH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.h;
        int i = this.j;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.i + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ob1 ob1Var = this.k;
        if (ob1Var != null) {
            ob1Var.i(i, i2);
        } else {
            pb1 pb1Var = pb1.k;
            this.l.i(i, i2);
        }
        this.j -= i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.j; i++) {
            if (t11.l(this.h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.j == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j(int i, int i2, Collection collection, boolean z) {
        int iJ;
        ob1 ob1Var = this.k;
        if (ob1Var != null) {
            iJ = ob1Var.j(i, i2, collection, z);
        } else {
            pb1 pb1Var = pb1.k;
            iJ = this.l.j(i, i2, collection, z);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.j -= iJ;
        return iJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.j - 1; i >= 0; i--) {
            if (t11.l(this.h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.j;
        if (i >= 0 && i <= i2) {
            return new vs0(this, i);
        }
        s.d(vi0.h("index: ", i, ", size: ", i2));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.i, this.j, collection, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.i, this.j, collection, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.h;
        int i3 = this.i;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        sp0.u(i, i2, this.j);
        return new ob1(this.h, this.i + i, i2 - i, this, this.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.j;
        Object[] objArr2 = this.h;
        int i2 = this.i;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        mg.c0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return tp0.g(this.h, this.i, this.j, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.i + this.j, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.h;
        int i = this.j;
        int i2 = this.i;
        return mg.h0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.i + this.j, collection, size);
        return size > 0;
    }
}
