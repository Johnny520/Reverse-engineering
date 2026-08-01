package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class t41 implements List, r40 {

    /* JADX INFO: renamed from: d */
    public final c31 f5909d;

    /* JADX INFO: renamed from: e */
    public final int f5910e;

    /* JADX INFO: renamed from: f */
    public int f5911f;

    /* JADX INFO: renamed from: g */
    public int f5912g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t41(c31 c31Var, int i, int i2) {
        this.f5909d = c31Var;
        this.f5910e = i;
        this.f5911f = p30.m2970F(c31Var);
        this.f5912g = i2 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4186a() {
        if (p30.m2970F(this.f5909d) != this.f5911f) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m4186a();
        int i = this.f5910e + this.f5912g;
        c31 c31Var = this.f5909d;
        c31Var.add(i, obj);
        this.f5912g++;
        this.f5911f = p30.m2970F(c31Var);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m4186a();
        int i2 = i + this.f5910e;
        c31 c31Var = this.f5909d;
        boolean zAddAll = c31Var.addAll(i2, collection);
        if (zAddAll) {
            this.f5912g = collection.size() + this.f5912g;
            this.f5911f = p30.m2970F(c31Var);
        }
        return zAddAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f5912g > 0) {
            m4186a();
            int i = this.f5912g;
            int i2 = this.f5910e;
            c31 c31Var = this.f5909d;
            c31Var.m442d(i2, i + i2);
            this.f5912g = 0;
            this.f5911f = p30.m2970F(c31Var);
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
        m4186a();
        p30.m3000j(i, this.f5912g);
        return this.f5909d.get(this.f5910e + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m4186a();
        int i = this.f5912g;
        int i2 = this.f5910e;
        Iterator it = w60.m4893O(i2, i + i2).iterator();
        do {
            y20 y20Var = (y20) it;
            if (!y20Var.f7497f) {
                return -1;
            }
            iNextInt = y20Var.nextInt();
        } while (!p30.m3002l(obj, this.f5909d.get(iNextInt)));
        return iNextInt - i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5912g == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m4186a();
        int i = this.f5912g;
        int i2 = this.f5910e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (p30.m3002l(obj, this.f5909d.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m4186a();
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = i - 1;
        return new iv0(xt0Var, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i) {
        m4186a();
        int i2 = this.f5910e + i;
        c31 c31Var = this.f5909d;
        Object objRemove = c31Var.remove(i2);
        this.f5912g--;
        this.f5911f = p30.m2970F(c31Var);
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
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        m4186a();
        c31 c31Var = this.f5909d;
        int i2 = this.f5910e;
        int i3 = this.f5912g + i2;
        int size = c31Var.size();
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = c31Var.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            qq0 qq0VarMo10e = abstractC0112d0.mo10e();
            qq0VarMo10e.subList(i2, i3).retainAll(collection);
            AbstractC0112d0 abstractC0112d0M3301c = qq0VarMo10e.m3301c();
            if (p30.m3002l(abstractC0112d0M3301c, abstractC0112d0)) {
                break;
            }
            c41 c41Var3 = c31Var.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, c31Var, l21VarM4172j), i, abstractC0112d0M3301c, true);
            }
            t21.m4176n(l21VarM4172j, c31Var);
        } while (!zM3003m);
        int size2 = size - c31Var.size();
        if (size2 > 0) {
            this.f5911f = p30.m2970F(this.f5909d);
            this.f5912g -= size2;
        }
        return size2 > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        p30.m3000j(i, this.f5912g);
        m4186a();
        int i2 = i + this.f5910e;
        c31 c31Var = this.f5909d;
        Object obj2 = c31Var.set(i2, obj);
        this.f5911f = p30.m2970F(c31Var);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5912g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f5912g) {
            wr0.m5024a("fromIndex or toIndex are out of bounds");
        }
        m4186a();
        int i3 = this.f5910e;
        return new t41(this.f5909d, i + i3, i2 + i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s91.m4031R(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return s91.m4032S(this, objArr);
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
        m4186a();
        int i2 = this.f5910e + i;
        c31 c31Var = this.f5909d;
        c31Var.add(i2, obj);
        this.f5912g++;
        this.f5911f = p30.m2970F(c31Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f5912g, collection);
    }
}
