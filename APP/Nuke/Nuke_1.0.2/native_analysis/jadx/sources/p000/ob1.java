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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 extends AbstractC0947z2 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: h */
    public Object[] f7609h;

    /* JADX INFO: renamed from: i */
    public final int f7610i;

    /* JADX INFO: renamed from: j */
    public int f7611j;

    /* JADX INFO: renamed from: k */
    public final ob1 f7612k;

    /* JADX INFO: renamed from: l */
    public final pb1 f7613l;

    public ob1(Object[] objArr, int i, int i2, ob1 ob1Var, pb1 pb1Var) {
        objArr.getClass();
        pb1Var.getClass();
        this.f7609h = objArr;
        this.f7610i = i;
        this.f7611j = i2;
        this.f7612k = ob1Var;
        this.f7613l = pb1Var;
        ((AbstractList) this).modCount = ((AbstractList) pb1Var).modCount;
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: a */
    public final int mo152a() {
        m3547f();
        return this.f7611j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3548g();
        m3547f();
        int i2 = this.f7611j;
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        } else {
            m3546e(this.f7610i + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m3548g();
        m3547f();
        int i2 = this.f7611j;
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        m3545d(this.f7610i + i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: b */
    public final Object mo153b(int i) {
        m3548g();
        m3547f();
        int i2 = this.f7611j;
        if (i >= 0 && i < i2) {
            return m3549h(this.f7610i + i);
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3548g();
        m3547f();
        m3550i(this.f7610i, this.f7611j);
    }

    /* JADX INFO: renamed from: d */
    public final void m3545d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        pb1 pb1Var = this.f7613l;
        ob1 ob1Var = this.f7612k;
        if (ob1Var != null) {
            ob1Var.m3545d(i, collection, i2);
        } else {
            pb1 pb1Var2 = pb1.f8242k;
            pb1Var.m3836d(i, collection, i2);
        }
        this.f7609h = pb1Var.f8243h;
        this.f7611j += i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m3546e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        pb1 pb1Var = this.f7613l;
        ob1 ob1Var = this.f7612k;
        if (ob1Var != null) {
            ob1Var.m3546e(i, obj);
        } else {
            pb1 pb1Var2 = pb1.f8242k;
            pb1Var.m3837e(i, obj);
        }
        this.f7609h = pb1Var.f8243h;
        this.f7611j++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m3547f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f7609h;
            int i = this.f7611j;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (t11.m5086l(objArr[this.f7610i + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3547f() {
        if (((AbstractList) this.f7613l).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3548g() {
        if (this.f7613l.f8245j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3547f();
        int i2 = this.f7611j;
        if (i >= 0 && i < i2) {
            return this.f7609h[this.f7610i + i];
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Object m3549h(int i) {
        Object objM3840h;
        ((AbstractList) this).modCount++;
        ob1 ob1Var = this.f7612k;
        if (ob1Var != null) {
            objM3840h = ob1Var.m3549h(i);
        } else {
            pb1 pb1Var = pb1.f8242k;
            objM3840h = this.f7613l.m3840h(i);
        }
        this.f7611j--;
        return objM3840h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m3547f();
        Object[] objArr = this.f7609h;
        int i = this.f7611j;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f7610i + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m3550i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ob1 ob1Var = this.f7612k;
        if (ob1Var != null) {
            ob1Var.m3550i(i, i2);
        } else {
            pb1 pb1Var = pb1.f8242k;
            this.f7613l.m3841i(i, i2);
        }
        this.f7611j -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m3547f();
        for (int i = 0; i < this.f7611j; i++) {
            if (t11.m5086l(this.f7609h[this.f7610i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m3547f();
        return this.f7611j == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m3551j(int i, int i2, Collection collection, boolean z) {
        int iM3842j;
        ob1 ob1Var = this.f7612k;
        if (ob1Var != null) {
            iM3842j = ob1Var.m3551j(i, i2, collection, z);
        } else {
            pb1 pb1Var = pb1.f8242k;
            iM3842j = this.f7613l.m3842j(i, i2, collection, z);
        }
        if (iM3842j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7611j -= iM3842j;
        return iM3842j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m3547f();
        for (int i = this.f7611j - 1; i >= 0; i--) {
            if (t11.m5086l(this.f7609h[this.f7610i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m3547f();
        int i2 = this.f7611j;
        if (i >= 0 && i <= i2) {
            return new vs0(this, i);
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3548g();
        m3547f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo153b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m3548g();
        m3547f();
        return m3551j(this.f7610i, this.f7611j, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m3548g();
        m3547f();
        return m3551j(this.f7610i, this.f7611j, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3548g();
        m3547f();
        int i2 = this.f7611j;
        if (i < 0 || i >= i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.f7609h;
        int i3 = this.f7610i;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        sp0.m4963u(i, i2, this.f7611j);
        return new ob1(this.f7609h, this.f7610i + i, i2 - i, this, this.f7613l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        m3547f();
        int length = objArr.length;
        int i = this.f7611j;
        Object[] objArr2 = this.f7609h;
        int i2 = this.f7610i;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC0460mg.m3088c0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.f7611j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m3547f();
        return tp0.m5362g(this.f7609h, this.f7610i, this.f7611j, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3548g();
        m3547f();
        m3546e(this.f7610i + this.f7611j, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m3547f();
        Object[] objArr = this.f7609h;
        int i = this.f7611j;
        int i2 = this.f7610i;
        return AbstractC0460mg.m3093h0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m3548g();
        m3547f();
        int size = collection.size();
        m3545d(this.f7610i + this.f7611j, collection, size);
        return size > 0;
    }
}
