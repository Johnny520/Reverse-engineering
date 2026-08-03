package p322w0;

import gg.AbstractC1415k;
import gg.AbstractC1416l;
import gg.C1423s;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p114hg.InterfaceC1713c;
import p117i0.AbstractC1861n1;
import p172lg.C2563c;
import p202o0.AbstractC3031c;
import p202o0.C3034f;
import p259r9.AbstractC3754e0;
import tf.C4179z;

/* JADX INFO: renamed from: w0.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4673x implements List, InterfaceC1713c {

    /* JADX INFO: renamed from: g */
    public final C4665p f15552g;

    /* JADX INFO: renamed from: h */
    public final int f15553h;

    /* JADX INFO: renamed from: i */
    public int f15554i;

    /* JADX INFO: renamed from: j */
    public int f15555j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4673x(C4665p c4665p, int i9, int i10) {
        this.f15552g = c4665p;
        this.f15553h = i9;
        this.f15554i = AbstractC4666q.m9150g(c4665p);
        this.f15555j = i10 - i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9166a() {
        if (AbstractC4666q.m9150g(this.f15552g) != this.f15554i) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m9166a();
        int i9 = this.f15553h + this.f15555j;
        C4665p c4665p = this.f15552g;
        c4665p.add(i9, obj);
        this.f15555j++;
        this.f15554i = AbstractC4666q.m9150g(c4665p);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        m9166a();
        int i10 = i9 + this.f15553h;
        C4665p c4665p = this.f15552g;
        boolean zAddAll = c4665p.addAll(i10, collection);
        if (zAddAll) {
            this.f15555j = collection.size() + this.f15555j;
            this.f15554i = AbstractC4666q.m9150g(c4665p);
        }
        return zAddAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f15555j > 0) {
            m9166a();
            int i9 = this.f15555j;
            int i10 = this.f15553h;
            C4665p c4665p = this.f15552g;
            c4665p.m9144e(i10, i9 + i10);
            this.f15555j = 0;
            this.f15554i = AbstractC4666q.m9150g(c4665p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        m9166a();
        AbstractC4666q.m9145a(i9, this.f15555j);
        return this.f15552g.get(this.f15553h + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m9166a();
        int i9 = this.f15555j;
        int i10 = this.f15553h;
        Iterator it = AbstractC3754e0.m7910r0(i10, i9 + i10).iterator();
        do {
            C2563c c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                return -1;
            }
            iNextInt = c2563c.nextInt();
        } while (!AbstractC1416l.m3825a(obj, this.f15552g.get(iNextInt)));
        return iNextInt - i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15555j == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m9166a();
        int i9 = this.f15555j;
        int i10 = this.f15553h;
        for (int i11 = (i9 + i10) - 1; i11 >= i10; i11--) {
            if (AbstractC1416l.m3825a(obj, this.f15552g.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        m9166a();
        C1423s c1423s = new C1423s();
        c1423s.f4736g = i9 - 1;
        return new C4179z(c1423s, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i9) {
        m9166a();
        int i10 = this.f15553h + i9;
        C4665p c4665p = this.f15552g;
        Object objRemove = c4665p.remove(i10);
        this.f15555j--;
        this.f15554i = AbstractC4666q.m9150g(c4665p);
        return objRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z9 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z9) {
                    z9 = true;
                }
            }
            return z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i9;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        m9166a();
        C4665p c4665p = this.f15552g;
        int i10 = this.f15553h;
        int i11 = this.f15555j + i10;
        int size = c4665p.size();
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = c4665p.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i9 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            C3034f c3034fMo6437e = abstractC3031c.mo6437e();
            c3034fMo6437e.subList(i10, i11).retainAll(collection);
            AbstractC3031c abstractC3031cM6459d = c3034fMo6437e.m6459d();
            if (AbstractC1416l.m3825a(abstractC3031cM6459d, abstractC3031c)) {
                break;
            }
            C4669t c4669t3 = c4665p.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, c4665p, abstractC4655fM9129j), i9, abstractC3031cM6459d, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, c4665p);
        } while (!zM9146b);
        int size2 = size - c4665p.size();
        if (size2 > 0) {
            this.f15554i = AbstractC4666q.m9150g(this.f15552g);
            this.f15555j -= size2;
        }
        return size2 > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        AbstractC4666q.m9145a(i9, this.f15555j);
        m9166a();
        int i10 = i9 + this.f15553h;
        C4665p c4665p = this.f15552g;
        Object obj2 = c4665p.set(i10, obj);
        this.f15554i = AbstractC4666q.m9150g(c4665p);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f15555j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        if (i9 < 0 || i9 > i10 || i10 > this.f15555j) {
            AbstractC1861n1.m4583a("fromIndex or toIndex are out of bounds");
        }
        m9166a();
        int i11 = this.f15553h;
        return new C4673x(this.f15552g, i9 + i11, i10 + i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1415k.m3823a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1415k.m3824b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        m9166a();
        int i10 = this.f15553h + i9;
        C4665p c4665p = this.f15552g;
        c4665p.add(i10, obj);
        this.f15555j++;
        this.f15554i = AbstractC4666q.m9150g(c4665p);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f15555j, collection);
    }
}
