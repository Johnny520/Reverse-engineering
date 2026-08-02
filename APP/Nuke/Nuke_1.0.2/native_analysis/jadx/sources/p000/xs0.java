package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 implements List, q41 {

    /* JADX INFO: renamed from: h */
    public final lk1 f13155h = new lk1(16);

    /* JADX INFO: renamed from: i */
    public final ck1 f13156i = new ck1(16);

    /* JADX INFO: renamed from: j */
    public int f13157j = -1;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        p000.C0676s.m4646d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m6175a() {
        long jM4245a = qp0.m4245a(Float.POSITIVE_INFINITY, false, false);
        int i = this.f13157j + 1;
        int i2 = this.f13155h.f6164b - 1;
        if (i > i2) {
            return jM4245a;
        }
        while (true) {
            ck1 ck1Var = this.f13156i;
            if (i < 0) {
                ck1Var.getClass();
                break;
            }
            if (i >= ck1Var.f1599b) {
                break;
            }
            long j = ck1Var.f1598a[i];
            if (xe1.m6129k(j, jM4245a) < 0) {
                jM4245a = j;
            }
            if ((xe1.m6149z(jM4245a) < 0.0f && xe1.m6097O(jM4245a)) || i == i2) {
                break;
            }
            i++;
        }
        return jM4245a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public final void m6176b(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.f13155h.m2936l(i, i2);
        ck1 ck1Var = this.f13156i;
        if (i >= 0) {
            int i3 = ck1Var.f1599b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    C0676s.m4651j("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = ck1Var.f1598a;
                            AbstractC0460mg.m3087b0(jArr, jArr, i, i2, i3);
                        }
                        ck1Var.f1599b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            ck1Var.getClass();
        }
        C0676s.m4646d("Index must be between 0 and size");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f13157j = -1;
        this.f13155h.m2928d();
        this.f13156i.f1599b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof th1) && indexOf((th1) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((th1) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objM2930f = this.f13155h.m2930f(i);
        objM2930f.getClass();
        return (th1) objM2930f;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof th1)) {
            return -1;
        }
        th1 th1Var = (th1) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!t11.m5086l(this.f13155h.m2930f(i), th1Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13155h.m2932h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new vs0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof th1)) {
            return -1;
        }
        th1 th1Var = (th1) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (t11.m5086l(this.f13155h.m2930f(size), th1Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new vs0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13155h.f6164b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new ws0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new vs0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
