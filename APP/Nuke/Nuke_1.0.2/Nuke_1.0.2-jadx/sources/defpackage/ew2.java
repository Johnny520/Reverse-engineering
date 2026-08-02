package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements List, q41 {
    public final ps2 h;
    public final int i;
    public int j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ew2(ps2 ps2Var, int i, int i2) {
        this.h = ps2Var;
        this.i = i;
        this.j = tl.I(ps2Var);
        this.k = i2 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (tl.I(this.h) != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.i + this.k;
        ps2 ps2Var = this.h;
        ps2Var.add(i, obj);
        this.k++;
        this.j = tl.I(ps2Var);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.i;
        ps2 ps2Var = this.h;
        boolean zAddAll = ps2Var.addAll(i2, collection);
        if (zAddAll) {
            this.k = collection.size() + this.k;
            this.j = tl.I(ps2Var);
        }
        return zAddAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.k > 0) {
            a();
            int i = this.k;
            int i2 = this.i;
            ps2 ps2Var = this.h;
            ps2Var.d(i2, i + i2);
            this.k = 0;
            this.j = tl.I(ps2Var);
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
    public final Object get(int i) {
        a();
        tl.f(i, this.k);
        return this.h.get(this.i + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i;
        a();
        int i2 = this.k;
        int i3 = this.i;
        Iterator it = ci0.X(i3, i2 + i3).iterator();
        do {
            b11 b11Var = (b11) it;
            boolean z = b11Var.j;
            if (!z) {
                return -1;
            }
            i = b11Var.k;
            if (i != b11Var.i) {
                b11Var.k = b11Var.h + i;
            } else {
                if (!z) {
                    um2.b();
                    return 0;
                }
                b11Var.j = false;
            }
        } while (!t11.l(obj, this.h.get(i)));
        return i - i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.k == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.k;
        int i2 = this.i;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (t11.l(obj, this.h.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        a72 a72Var = new a72();
        a72Var.h = i - 1;
        return new ea2(a72Var, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.i + i;
        ps2 ps2Var = this.h;
        Object objRemove = ps2Var.remove(i2);
        this.k--;
        this.j = tl.I(ps2Var);
        return objRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        a();
        ps2 ps2Var = this.h;
        int i2 = this.i;
        int i3 = this.k + i2;
        int size = ps2Var.size();
        do {
            synchronized (tl.g) {
                mu2 mu2Var = ps2Var.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            lz1 lz1VarE = c3Var.e();
            lz1VarE.subList(i2, i3).retainAll(collection);
            c3 c3VarC = lz1VarE.c();
            if (t11.l(c3VarC, c3Var)) {
                break;
            }
            mu2 mu2Var3 = ps2Var.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, ps2Var, vr2VarJ), i, c3VarC, true);
            }
            ds2.n(vr2VarJ, ps2Var);
        } while (!zH);
        int size2 = size - ps2Var.size();
        if (size2 > 0) {
            this.j = tl.I(this.h);
            this.k -= size2;
        }
        return size2 > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        tl.f(i, this.k);
        a();
        int i2 = i + this.i;
        ps2 ps2Var = this.h;
        Object obj2 = ps2Var.set(i2, obj);
        this.j = tl.I(ps2Var);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.k) {
            j22.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.i;
        return new ew2(this.h, i + i3, i2 + i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return tl.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tl.b0(this, objArr);
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
        a();
        int i2 = this.i + i;
        ps2 ps2Var = this.h;
        ps2Var.add(i2, obj);
        this.k++;
        this.j = tl.I(ps2Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.k, collection);
    }
}
