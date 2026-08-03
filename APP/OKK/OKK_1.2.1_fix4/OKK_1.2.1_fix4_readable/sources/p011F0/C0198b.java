package p011F0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0176g;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: F0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0198b extends AbstractC0176g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public Object[] f413a;

    /* JADX INFO: renamed from: b */
    public final int f414b;

    /* JADX INFO: renamed from: c */
    public int f415c;

    /* JADX INFO: renamed from: d */
    public final C0198b f416d;

    /* JADX INFO: renamed from: e */
    public final C0199c f417e;

    public C0198b(Object[] objArr, int i2, int i3, C0198b c0198b, C0199c c0199c) {
        AbstractC0307g.m703e(objArr, "backing");
        AbstractC0307g.m703e(c0199c, "root");
        this.f413a = objArr;
        this.f414b = i2;
        this.f415c = i3;
        this.f416d = c0198b;
        this.f417e = c0199c;
        ((AbstractList) this).modCount = ((AbstractList) c0199c).modCount;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: a */
    public final int mo521a() {
        m574f();
        return this.f415c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m575g();
        m574f();
        m573e(this.f414b + this.f415c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m575g();
        m574f();
        int size = collection.size();
        m572d(this.f414b + this.f415c, collection, size);
        return size > 0;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: b */
    public final Object mo522b(int i2) {
        m575g();
        m574f();
        int i3 = this.f415c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return m576h(this.f414b + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m575g();
        m574f();
        m577i(this.f414b, this.f415c);
    }

    /* JADX INFO: renamed from: d */
    public final void m572d(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        C0199c c0199c = this.f417e;
        C0198b c0198b = this.f416d;
        if (c0198b != null) {
            c0198b.m572d(i2, collection, i3);
        } else {
            C0199c c0199c2 = C0199c.f418d;
            c0199c.m580d(i2, collection, i3);
        }
        this.f413a = c0199c.f419a;
        this.f415c += i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m573e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        C0199c c0199c = this.f417e;
        C0198b c0198b = this.f416d;
        if (c0198b != null) {
            c0198b.m573e(i2, obj);
        } else {
            C0199c c0199c2 = C0199c.f418d;
            c0199c.m581e(i2, obj);
        }
        this.f413a = c0199c.f419a;
        this.f415c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m574f();
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC0040p.m94a(this.f413a, this.f414b, this.f415c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m574f() {
        if (((AbstractList) this.f417e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m575g() {
        if (this.f417e.f421c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m574f();
        int i3 = this.f415c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return this.f413a[this.f414b + i2];
    }

    /* JADX INFO: renamed from: h */
    public final Object m576h(int i2) {
        Object objM584h;
        ((AbstractList) this).modCount++;
        C0198b c0198b = this.f416d;
        if (c0198b != null) {
            objM584h = c0198b.m576h(i2);
        } else {
            C0199c c0199c = C0199c.f418d;
            objM584h = this.f417e.m584h(i2);
        }
        this.f415c--;
        return objM584h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m574f();
        Object[] objArr = this.f413a;
        int i2 = this.f415c;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[this.f414b + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m577i(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0198b c0198b = this.f416d;
        if (c0198b != null) {
            c0198b.m577i(i2, i3);
        } else {
            C0199c c0199c = C0199c.f418d;
            this.f417e.m585i(i2, i3);
        }
        this.f415c -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m574f();
        for (int i2 = 0; i2 < this.f415c; i2++) {
            if (AbstractC0307g.m699a(this.f413a[this.f414b + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m574f();
        return this.f415c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m578j(int i2, int i3, Collection collection, boolean z2) {
        int iM586j;
        C0198b c0198b = this.f416d;
        if (c0198b != null) {
            iM586j = c0198b.m578j(i2, i3, collection, z2);
        } else {
            C0199c c0199c = C0199c.f418d;
            iM586j = this.f417e.m586j(i2, i3, collection, z2);
        }
        if (iM586j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f415c -= iM586j;
        return iM586j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m574f();
        for (int i2 = this.f415c - 1; i2 >= 0; i2--) {
            if (AbstractC0307g.m699a(this.f413a[this.f414b + i2], obj)) {
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
        m575g();
        m574f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo522b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m575g();
        m574f();
        return m578j(this.f414b, this.f415c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m575g();
        m574f();
        return m578j(this.f414b, this.f415c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m575g();
        m574f();
        int i3 = this.f415c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        Object[] objArr = this.f413a;
        int i4 = this.f414b;
        Object obj2 = objArr[i4 + i2];
        objArr[i4 + i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0040p.m107j(i2, i3, this.f415c);
        return new C0198b(this.f413a, this.f414b + i2, i3 - i2, this, this.f417e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "array");
        m574f();
        int length = objArr.length;
        int i2 = this.f415c;
        int i3 = this.f414b;
        if (length < i2) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f413a, i3, i2 + i3, objArr.getClass());
            AbstractC0307g.m702d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC0179j.m533j0(this.f413a, objArr, 0, i3, i2 + i3);
        AbstractC0040p.m95a0(this.f415c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m574f();
        return AbstractC0040p.m96b(this.f413a, this.f414b, this.f415c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        m574f();
        int i3 = this.f415c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return new C0197a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        m575g();
        m574f();
        int i3 = this.f415c;
        if (i2 >= 0 && i2 <= i3) {
            m573e(this.f414b + i2, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        m575g();
        m574f();
        int i3 = this.f415c;
        if (i2 >= 0 && i2 <= i3) {
            int size = collection.size();
            m572d(this.f414b + i2, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m574f();
        Object[] objArr = this.f413a;
        int i2 = this.f415c;
        int i3 = this.f414b;
        int i4 = i2 + i3;
        AbstractC0307g.m703e(objArr, "<this>");
        AbstractC0040p.m114s(i4, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i3, i4);
        AbstractC0307g.m702d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }
}
