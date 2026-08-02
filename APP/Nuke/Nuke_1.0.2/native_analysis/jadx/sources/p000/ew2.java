package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements List, q41 {

    /* JADX INFO: renamed from: h */
    public final ps2 f2660h;

    /* JADX INFO: renamed from: i */
    public final int f2661i;

    /* JADX INFO: renamed from: j */
    public int f2662j;

    /* JADX INFO: renamed from: k */
    public int f2663k;

    public ew2(ps2 ps2Var, int i, int i2) {
        this.f2660h = ps2Var;
        this.f2661i = i;
        this.f2662j = AbstractC0738tl.m5281I(ps2Var);
        this.f2663k = i2 - i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1481a() {
        if (AbstractC0738tl.m5281I(this.f2660h) != this.f2662j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m1481a();
        int i = this.f2661i + this.f2663k;
        ps2 ps2Var = this.f2660h;
        ps2Var.add(i, obj);
        this.f2663k++;
        this.f2662j = AbstractC0738tl.m5281I(ps2Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m1481a();
        int i2 = i + this.f2661i;
        ps2 ps2Var = this.f2660h;
        boolean zAddAll = ps2Var.addAll(i2, collection);
        if (zAddAll) {
            this.f2663k = collection.size() + this.f2663k;
            this.f2662j = AbstractC0738tl.m5281I(ps2Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f2663k > 0) {
            m1481a();
            int i = this.f2663k;
            int i2 = this.f2661i;
            ps2 ps2Var = this.f2660h;
            ps2Var.m3969d(i2, i + i2);
            this.f2663k = 0;
            this.f2662j = AbstractC0738tl.m5281I(ps2Var);
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
    public final Object get(int i) {
        m1481a();
        AbstractC0738tl.m5307f(i, this.f2663k);
        return this.f2660h.get(this.f2661i + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i;
        m1481a();
        int i2 = this.f2663k;
        int i3 = this.f2661i;
        Iterator it = ci0.m799X(i3, i2 + i3).iterator();
        do {
            b11 b11Var = (b11) it;
            boolean z = b11Var.f511j;
            if (!z) {
                return -1;
            }
            i = b11Var.f512k;
            if (i != b11Var.f510i) {
                b11Var.f512k = b11Var.f509h + i;
            } else {
                if (!z) {
                    um2.m5513b();
                    return 0;
                }
                b11Var.f511j = false;
            }
        } while (!t11.m5086l(obj, this.f2660h.get(i)));
        return i - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2663k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m1481a();
        int i = this.f2663k;
        int i2 = this.f2661i;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (t11.m5086l(obj, this.f2660h.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m1481a();
        a72 a72Var = new a72();
        a72Var.f108h = i - 1;
        return new ea2(a72Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m1481a();
        int i2 = this.f2661i + i;
        ps2 ps2Var = this.f2660h;
        Object objRemove = ps2Var.remove(i2);
        this.f2663k--;
        this.f2662j = AbstractC0738tl.m5281I(ps2Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        m1481a();
        ps2 ps2Var = this.f2660h;
        int i2 = this.f2661i;
        int i3 = this.f2663k + i2;
        int size = ps2Var.size();
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = ps2Var.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            lz1 lz1VarMo622e = abstractC0077c3.mo622e();
            lz1VarMo622e.subList(i2, i3).retainAll(collection);
            AbstractC0077c3 abstractC0077c3M2997c = lz1VarMo622e.m2997c();
            if (t11.m5086l(abstractC0077c3M2997c, abstractC0077c3)) {
                break;
            }
            mu2 mu2Var3 = ps2Var.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, ps2Var, vr2VarM1126j), i, abstractC0077c3M2997c, true);
            }
            ds2.m1130n(vr2VarM1126j, ps2Var);
        } while (!zM5309h);
        int size2 = size - ps2Var.size();
        if (size2 > 0) {
            this.f2662j = AbstractC0738tl.m5281I(this.f2660h);
            this.f2663k -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC0738tl.m5307f(i, this.f2663k);
        m1481a();
        int i2 = i + this.f2661i;
        ps2 ps2Var = this.f2660h;
        Object obj2 = ps2Var.set(i2, obj);
        this.f2662j = AbstractC0738tl.m5281I(ps2Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f2663k;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f2663k) {
            j22.m2429a("fromIndex or toIndex are out of bounds");
        }
        m1481a();
        int i3 = this.f2661i;
        return new ew2(this.f2660h, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0738tl.m5301b0(this, objArr);
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
    public final void add(int i, Object obj) {
        m1481a();
        int i2 = this.f2661i + i;
        ps2 ps2Var = this.f2660h;
        ps2Var.add(i2, obj);
        this.f2663k++;
        this.f2662j = AbstractC0738tl.m5281I(ps2Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f2663k, collection);
    }
}
