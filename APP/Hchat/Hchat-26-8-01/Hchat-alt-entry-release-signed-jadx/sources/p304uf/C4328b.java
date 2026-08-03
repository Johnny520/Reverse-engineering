package p304uf;

import gg.AbstractC1416l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p259r9.AbstractC3754e0;
import tf.AbstractC4159f;
import tf.AbstractC4160g;
import tf.AbstractC4165l;
import tf.C4153c;

/* JADX INFO: renamed from: uf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4328b extends AbstractC4160g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: g */
    public Object[] f14462g;

    /* JADX INFO: renamed from: h */
    public final int f14463h;

    /* JADX INFO: renamed from: i */
    public int f14464i;

    /* JADX INFO: renamed from: j */
    public final C4328b f14465j;

    /* JADX INFO: renamed from: k */
    public final C4329c f14466k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4328b(Object[] objArr, int i9, int i10, C4328b c4328b, C4329c c4329c) {
        objArr.getClass();
        c4329c.getClass();
        this.f14462g = objArr;
        this.f14463h = i9;
        this.f14464i = i10;
        this.f14465j = c4328b;
        this.f14466k = c4329c;
        ((AbstractList) this).modCount = ((AbstractList) c4329c).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: a */
    public final int mo6457a() {
        m8727g();
        return this.f14464i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        m8728h();
        m8727g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14464i;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        m8726f(this.f14463h + i9, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        collection.getClass();
        m8728h();
        m8727g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14464i;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        int size = collection.size();
        m8725e(this.f14463h + i9, collection, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: c */
    public final Object mo6458c(int i9) {
        m8728h();
        m8727g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14464i;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        return m8729i(this.f14463h + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8728h();
        m8727g();
        m8730j(this.f14463h, this.f14464i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8725e(int i9, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        C4329c c4329c = this.f14466k;
        C4328b c4328b = this.f14465j;
        if (c4328b != null) {
            c4328b.m8725e(i9, collection, i10);
        } else {
            C4329c c4329c2 = C4329c.f14467j;
            c4329c.m8733e(i9, collection, i10);
        }
        this.f14462g = c4329c.f14468g;
        this.f14464i += i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m8727g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f14462g;
            int i9 = this.f14464i;
            if (i9 == list.size()) {
                for (int i10 = 0; i10 < i9; i10++) {
                    if (AbstractC1416l.m3825a(objArr[this.f14463h + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m8726f(int i9, Object obj) {
        ((AbstractList) this).modCount++;
        C4329c c4329c = this.f14466k;
        C4328b c4328b = this.f14465j;
        if (c4328b != null) {
            c4328b.m8726f(i9, obj);
        } else {
            C4329c c4329c2 = C4329c.f14467j;
            c4329c.m8734f(i9, obj);
        }
        this.f14462g = c4329c.f14468g;
        this.f14464i++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m8727g() {
        if (((AbstractList) this.f14466k).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        m8727g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14464i;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        return this.f14462g[this.f14463h + i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m8728h() {
        if (this.f14466k.f14470i) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m8727g();
        Object[] objArr = this.f14462g;
        int i9 = this.f14464i;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = objArr[this.f14463h + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m8729i(int i9) {
        Object objM8737i;
        ((AbstractList) this).modCount++;
        C4328b c4328b = this.f14465j;
        if (c4328b != null) {
            objM8737i = c4328b.m8729i(i9);
        } else {
            C4329c c4329c = C4329c.f14467j;
            objM8737i = this.f14466k.m8737i(i9);
        }
        this.f14464i--;
        return objM8737i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m8727g();
        for (int i9 = 0; i9 < this.f14464i; i9++) {
            if (AbstractC1416l.m3825a(this.f14462g[this.f14463h + i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m8727g();
        return this.f14464i == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m8730j(int i9, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        C4328b c4328b = this.f14465j;
        if (c4328b != null) {
            c4328b.m8730j(i9, i10);
        } else {
            C4329c c4329c = C4329c.f14467j;
            this.f14466k.m8738j(i9, i10);
        }
        this.f14464i -= i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m8731k(int i9, int i10, Collection collection, boolean z9) {
        int iM8739k;
        C4328b c4328b = this.f14465j;
        if (c4328b != null) {
            iM8739k = c4328b.m8731k(i9, i10, collection, z9);
        } else {
            C4329c c4329c = C4329c.f14467j;
            iM8739k = this.f14466k.m8739k(i9, i10, collection, z9);
        }
        if (iM8739k > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f14464i -= iM8739k;
        return iM8739k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m8727g();
        for (int i9 = this.f14464i - 1; i9 >= 0; i9--) {
            if (AbstractC1416l.m3825a(this.f14462g[this.f14463h + i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        m8727g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14464i;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        return new C4327a(this, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8728h();
        m8727g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo6458c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m8728h();
        m8727g();
        return m8731k(this.f14463h, this.f14464i, collection, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m8728h();
        m8727g();
        return m8731k(this.f14463h, this.f14464i, collection, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        m8728h();
        m8727g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14464i;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        Object[] objArr = this.f14462g;
        int i11 = this.f14463h + i9;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i11 = this.f14464i;
        c4153c.getClass();
        C4153c.m8347c(i9, i10, i11);
        return new C4328b(this.f14462g, this.f14463h + i9, i10 - i9, this, this.f14466k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        m8727g();
        int length = objArr.length;
        int i9 = this.f14464i;
        Object[] objArr2 = this.f14462g;
        int i10 = this.f14463h;
        if (length < i9) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i10, i9 + i10, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC4165l.m8379n0(0, i10, objArr2, i9 + i10, objArr);
        int i11 = this.f14464i;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        m8727g();
        return AbstractC3754e0.m7894i(this.f14462g, this.f14463h, this.f14464i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8728h();
        m8727g();
        m8726f(this.f14463h + this.f14464i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m8728h();
        m8727g();
        int size = collection.size();
        m8725e(this.f14463h + this.f14464i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m8727g();
        Object[] objArr = this.f14462g;
        int i9 = this.f14464i;
        int i10 = this.f14463h;
        return AbstractC4165l.m8386u0(objArr, i10, i9 + i10);
    }
}
