package p304uf;

import gg.AbstractC1416l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p136j8.C2104o;
import p259r9.AbstractC3754e0;
import tf.AbstractC4159f;
import tf.AbstractC4160g;
import tf.AbstractC4165l;
import tf.C4153c;

/* JADX INFO: renamed from: uf.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4329c extends AbstractC4160g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: j */
    public static final C4329c f14467j;

    /* JADX INFO: renamed from: g */
    public Object[] f14468g;

    /* JADX INFO: renamed from: h */
    public int f14469h;

    /* JADX INFO: renamed from: i */
    public boolean f14470i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C4329c c4329c = new C4329c(0);
        c4329c.f14470i = true;
        f14467j = c4329c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4329c(int i9) {
        if (i9 >= 0) {
            this.f14468g = new Object[i9];
        } else {
            C2104o.m5294t("capacity must be non-negative.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: a */
    public final int mo6457a() {
        return this.f14469h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        m8735g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14469h;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        ((AbstractList) this).modCount++;
        m8736h(i9, 1);
        this.f14468g[i9] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        collection.getClass();
        m8735g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14469h;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        int size = collection.size();
        m8733e(i9, collection, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: c */
    public final Object mo6458c(int i9) {
        m8735g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14469h;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        return m8737i(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8735g();
        m8738j(0, this.f14469h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8733e(int i9, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        m8736h(i9, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14468g[i9 + i11] = it.next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f14468g;
            int i9 = this.f14469h;
            if (i9 == list.size()) {
                for (int i10 = 0; i10 < i9; i10++) {
                    if (AbstractC1416l.m3825a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m8734f(int i9, Object obj) {
        ((AbstractList) this).modCount++;
        m8736h(i9, 1);
        this.f14468g[i9] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m8735g() {
        if (this.f14470i) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14469h;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        return this.f14468g[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m8736h(int i9, int i10) {
        int i11 = this.f14469h + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f14468g;
        if (i11 > objArr.length) {
            C4153c c4153c = AbstractC4159f.Companion;
            int length = objArr.length;
            c4153c.getClass();
            int iM8348d = C4153c.m8348d(length, i11);
            Object[] objArr2 = this.f14468g;
            objArr2.getClass();
            this.f14468g = Arrays.copyOf(objArr2, iM8348d);
        }
        Object[] objArr3 = this.f14468g;
        AbstractC4165l.m8379n0(i9 + i10, i9, objArr3, this.f14469h, objArr3);
        this.f14469h += i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f14468g;
        int i9 = this.f14469h;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m8737i(int i9) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f14468g;
        Object obj = objArr[i9];
        AbstractC4165l.m8379n0(i9, i9 + 1, objArr, this.f14469h, objArr);
        Object[] objArr2 = this.f14468g;
        int i10 = this.f14469h - 1;
        objArr2.getClass();
        objArr2[i10] = null;
        this.f14469h--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i9 = 0; i9 < this.f14469h; i9++) {
            if (AbstractC1416l.m3825a(this.f14468g[i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14469h == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m8738j(int i9, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f14468g;
        AbstractC4165l.m8379n0(i9, i9 + i10, objArr, this.f14469h, objArr);
        Object[] objArr2 = this.f14468g;
        int i11 = this.f14469h;
        AbstractC3754e0.m7891g0(objArr2, i11 - i10, i11);
        this.f14469h -= i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m8739k(int i9, int i10, Collection collection, boolean z9) {
        Object[] objArr;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f14468g;
            if (i11 >= i10) {
                break;
            }
            int i13 = i9 + i11;
            if (collection.contains(objArr[i13]) == z9) {
                Object[] objArr2 = this.f14468g;
                i11++;
                objArr2[i12 + i9] = objArr2[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        AbstractC4165l.m8379n0(i9 + i12, i10 + i9, objArr, this.f14469h, objArr);
        Object[] objArr3 = this.f14468g;
        int i15 = this.f14469h;
        AbstractC3754e0.m7891g0(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f14469h -= i14;
        return i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i9 = this.f14469h - 1; i9 >= 0; i9--) {
            if (AbstractC1416l.m3825a(this.f14468g[i9], obj)) {
                return i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14469h;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        return new C4327a(this, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8735g();
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
        m8735g();
        return m8739k(0, this.f14469h, collection, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m8735g();
        return m8739k(0, this.f14469h, collection, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        m8735g();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f14469h;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        Object[] objArr = this.f14468g;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i11 = this.f14469h;
        c4153c.getClass();
        C4153c.m8347c(i9, i10, i11);
        return new C4328b(this.f14468g, i9, i10 - i9, null, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i9 = this.f14469h;
        Object[] objArr2 = this.f14468g;
        if (length < i9) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i9, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC4165l.m8379n0(0, 0, objArr2, i9, objArr);
        int i10 = this.f14469h;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC3754e0.m7894i(this.f14468g, 0, this.f14469h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8735g();
        int i9 = this.f14469h;
        ((AbstractList) this).modCount++;
        m8736h(i9, 1);
        this.f14468g[i9] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m8735g();
        int size = collection.size();
        m8733e(this.f14469h, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC4165l.m8386u0(this.f14468g, 0, this.f14469h);
    }
}
