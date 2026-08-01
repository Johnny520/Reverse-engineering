package p158f0;

import com.bumptech.glide.AbstractC1926h;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p061L2.C0985y;
import p095T.AbstractC1380p0;
import p114X.AbstractC1614c;
import p114X.C1618g;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p117X2.C1673r;
import p122Y2.InterfaceC1767b;
import p132a3.C1803c;

/* JADX INFO: renamed from: f0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2093y implements List, InterfaceC1767b {

    /* JADX INFO: renamed from: d */
    public final C2085q f7012d;

    /* JADX INFO: renamed from: e */
    public final int f7013e;

    /* JADX INFO: renamed from: f */
    public int f7014f;

    /* JADX INFO: renamed from: g */
    public int f7015g;

    public C2093y(C2085q c2085q, int i5, int i6) {
        this.f7012d = c2085q;
        this.f7013e = i5;
        this.f7014f = AbstractC2086r.m3855g(c2085q);
        this.f7015g = i6 - i5;
    }

    /* JADX INFO: renamed from: a */
    public final void m3871a() {
        if (AbstractC2086r.m3855g(this.f7012d) != this.f7014f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m3871a();
        int i5 = this.f7013e + this.f7015g;
        C2085q c2085q = this.f7012d;
        c2085q.add(i5, obj);
        this.f7015g++;
        this.f7014f = AbstractC2086r.m3855g(c2085q);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f7015g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f7015g > 0) {
            m3871a();
            int i5 = this.f7015g;
            int i6 = this.f7013e;
            C2085q c2085q = this.f7012d;
            c2085q.m3849d(i6, i5 + i6);
            this.f7015g = 0;
            this.f7014f = AbstractC2086r.m3855g(c2085q);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

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

    @Override // java.util.List
    public final Object get(int i5) {
        m3871a();
        AbstractC2086r.m3850a(i5, this.f7015g);
        return this.f7012d.get(this.f7013e + i5);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i5;
        m3871a();
        int i6 = this.f7015g;
        int i7 = this.f7013e;
        Iterator it = AbstractC1926h.m3557J(i7, i6 + i7).iterator();
        do {
            C1803c c1803c = (C1803c) it;
            boolean z5 = c1803c.f6145f;
            if (!z5) {
                return -1;
            }
            i5 = c1803c.f6146g;
            if (i5 != c1803c.f6144e) {
                c1803c.f6146g = c1803c.f6143d + i5;
            } else {
                if (!z5) {
                    throw new NoSuchElementException();
                }
                c1803c.f6145f = false;
            }
        } while (!AbstractC1665j.m2981a(obj, this.f7012d.get(i5)));
        return i5 - i7;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7015g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m3871a();
        int i5 = this.f7015g;
        int i6 = this.f7013e;
        for (int i7 = (i5 + i6) - 1; i7 >= i6; i7--) {
            if (AbstractC1665j.m2981a(obj, this.f7012d.get(i7))) {
                return i7 - i6;
            }
        }
        return -1;
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

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z5 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z5) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i5;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        m3871a();
        C2085q c2085q = this.f7012d;
        int i6 = this.f7013e;
        int i7 = this.f7015g + i6;
        int size = c2085q.size();
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = c2085q.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i5 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            C1618g c1618gMo2880e = abstractC1614c.mo2880e();
            c1618gMo2880e.subList(i6, i7).retainAll(collection);
            AbstractC1614c abstractC1614cM2899c = c1618gMo2880e.m2899c();
            if (AbstractC1665j.m2981a(abstractC1614cM2899c, abstractC1614c)) {
                break;
            }
            C2089u c2089u3 = c2085q.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, c2085q, abstractC2074fM3834j), i5, abstractC1614cM2899c, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, c2085q);
        } while (!zM3851b);
        int size2 = size - c2085q.size();
        if (size2 > 0) {
            this.f7014f = AbstractC2086r.m3855g(this.f7012d);
            this.f7015g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        AbstractC2086r.m3850a(i5, this.f7015g);
        m3871a();
        int i6 = i5 + this.f7013e;
        C2085q c2085q = this.f7012d;
        Object obj2 = c2085q.set(i6, obj);
        this.f7014f = AbstractC2086r.m3855g(c2085q);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7015g;
    }

    @Override // java.util.List
    public final List subList(int i5, int i6) {
        if (!(i5 >= 0 && i5 <= i6 && i6 <= this.f7015g)) {
            AbstractC1380p0.m2542a("fromIndex or toIndex are out of bounds");
        }
        m3871a();
        int i7 = this.f7013e;
        return new C2093y(this.f7012d, i5 + i7, i6 + i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1664i.m2979a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        m3871a();
        C1673r c1673r = new C1673r();
        c1673r.f5707d = i5 - 1;
        return new C0985y(c1673r, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1664i.m2980b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        m3871a();
        int i6 = i5 + this.f7013e;
        C2085q c2085q = this.f7012d;
        boolean zAddAll = c2085q.addAll(i6, collection);
        if (zAddAll) {
            this.f7015g = collection.size() + this.f7015g;
            this.f7014f = AbstractC2086r.m3855g(c2085q);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        m3871a();
        int i6 = this.f7013e + i5;
        C2085q c2085q = this.f7012d;
        Object objRemove = c2085q.remove(i6);
        this.f7015g--;
        this.f7014f = AbstractC2086r.m3855g(c2085q);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        m3871a();
        int i6 = this.f7013e + i5;
        C2085q c2085q = this.f7012d;
        c2085q.add(i6, obj);
        this.f7015g++;
        this.f7014f = AbstractC2086r.m3855g(c2085q);
    }
}
