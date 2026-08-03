package p011F0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0176g;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0199c extends AbstractC0176g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C0199c f418d;

    /* JADX INFO: renamed from: a */
    public Object[] f419a;

    /* JADX INFO: renamed from: b */
    public int f420b;

    /* JADX INFO: renamed from: c */
    public boolean f421c;

    static {
        C0199c c0199c = new C0199c(0);
        c0199c.f421c = true;
        f418d = c0199c;
    }

    public C0199c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        this.f419a = new Object[i2];
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: a */
    public final int mo521a() {
        return this.f420b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m582f();
        int i2 = this.f420b;
        ((AbstractList) this).modCount++;
        m583g(i2, 1);
        this.f419a[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m582f();
        int size = collection.size();
        m580d(this.f420b, collection, size);
        return size > 0;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: b */
    public final Object mo522b(int i2) {
        m582f();
        int i3 = this.f420b;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return m584h(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m582f();
        m585i(0, this.f420b);
    }

    /* JADX INFO: renamed from: d */
    public final void m580d(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        m583g(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f419a[i2 + i4] = it.next();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m581e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        m583g(i2, 1);
        this.f419a[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!AbstractC0040p.m94a(this.f419a, 0, this.f420b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m582f() {
        if (this.f421c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m583g(int i2, int i3) {
        int i4 = this.f420b + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f419a;
        if (i4 > objArr.length) {
            int length = objArr.length;
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
            AbstractC0307g.m702d(objArrCopyOf, "copyOf(...)");
            this.f419a = objArrCopyOf;
        }
        Object[] objArr2 = this.f419a;
        AbstractC0179j.m533j0(objArr2, objArr2, i2 + i3, i2, this.f420b);
        this.f420b += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f420b;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return this.f419a[i2];
    }

    /* JADX INFO: renamed from: h */
    public final Object m584h(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f419a;
        Object obj = objArr[i2];
        AbstractC0179j.m533j0(objArr, objArr, i2, i2 + 1, this.f420b);
        Object[] objArr2 = this.f419a;
        int i3 = this.f420b - 1;
        AbstractC0307g.m703e(objArr2, "<this>");
        objArr2[i3] = null;
        this.f420b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f419a;
        int i2 = this.f420b;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m585i(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f419a;
        AbstractC0179j.m533j0(objArr, objArr, i2, i2 + i3, this.f420b);
        Object[] objArr2 = this.f419a;
        int i4 = this.f420b;
        AbstractC0307g.m703e(objArr2, "<this>");
        for (int i5 = i4 - i3; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        this.f420b -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f420b; i2++) {
            if (AbstractC0307g.m699a(this.f419a[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f420b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m586j(int i2, int i3, Collection collection, boolean z2) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f419a[i6]) == z2) {
                Object[] objArr = this.f419a;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.f419a;
        AbstractC0179j.m533j0(objArr2, objArr2, i2 + i5, i3 + i2, this.f420b);
        Object[] objArr3 = this.f419a;
        int i8 = this.f420b;
        AbstractC0307g.m703e(objArr3, "<this>");
        for (int i9 = i8 - i7; i9 < i8; i9++) {
            objArr3[i9] = null;
        }
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f420b -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f420b - 1; i2 >= 0; i2--) {
            if (AbstractC0307g.m699a(this.f419a[i2], obj)) {
                return i2;
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
        m582f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo522b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m582f();
        return m586j(0, this.f420b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m582f();
        return m586j(0, this.f420b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m582f();
        int i3 = this.f420b;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        Object[] objArr = this.f419a;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0040p.m107j(i2, i3, this.f420b);
        return new C0198b(this.f419a, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f420b;
        if (length < i2) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f419a, 0, i2, objArr.getClass());
            AbstractC0307g.m702d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC0179j.m533j0(this.f419a, objArr, 0, 0, i2);
        AbstractC0040p.m95a0(this.f420b, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0040p.m96b(this.f419a, 0, this.f420b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.f420b;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return new C0197a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m582f();
        int i3 = this.f420b;
        if (i2 >= 0 && i2 <= i3) {
            int size = collection.size();
            m580d(i2, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f419a;
        int i2 = this.f420b;
        AbstractC0307g.m703e(objArr, "<this>");
        AbstractC0040p.m114s(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i2);
        AbstractC0307g.m702d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        m582f();
        int i3 = this.f420b;
        if (i2 >= 0 && i2 <= i3) {
            ((AbstractList) this).modCount++;
            m583g(i2, 1);
            this.f419a[i2] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
    }
}
