package p339x1;

import gg.AbstractC1415k;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import okio.C3193a;
import p069f.C0933f0;
import p069f.C0967y;
import p114hg.InterfaceC1711a;
import p136j8.C2104o;
import p304uf.C4327a;
import p356y0.AbstractC5852n;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: x1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5633p implements List, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C0933f0 f22940g = new C0933f0(16);

    /* JADX INFO: renamed from: h */
    public final C0967y f22941h = new C0967y(16);

    /* JADX INFO: renamed from: i */
    public int f22942i = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        okio.C3193a.m6820i("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m10185a() {
        long jM10145a = AbstractC5618k.m10145a(Float.POSITIVE_INFINITY, false, false);
        int i9 = this.f22942i + 1;
        int i10 = this.f22940g.f2924b - 1;
        if (i9 > i10) {
            return jM10145a;
        }
        while (true) {
            C0967y c0967y = this.f22941h;
            if (i9 < 0) {
                c0967y.getClass();
                break;
            }
            if (i9 >= c0967y.f3044b) {
                break;
            }
            long j3 = c0967y.f3043a[i9];
            if (AbstractC5618k.m10151g(j3, jM10145a) < 0) {
                jM10145a = j3;
            }
            if ((AbstractC5618k.m10155k(jM10145a) < 0.0f && AbstractC5618k.m10160p(jM10145a)) || i9 == i10) {
                break;
            }
            i9++;
        }
        return jM10145a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10186c(int i9, int i10) {
        if (i9 >= i10) {
            return;
        }
        this.f22940g.m2297l(i9, i10);
        C0967y c0967y = this.f22941h;
        if (i9 >= 0) {
            int i11 = c0967y.f3044b;
            if (i9 <= i11 && i10 >= 0 && i10 <= i11) {
                if (i10 < i9) {
                    C2104o.m5294t("The end index must be < start index");
                    return;
                } else {
                    if (i10 != i9) {
                        if (i10 < i11) {
                            long[] jArr = c0967y.f3043a;
                            AbstractC4165l.m8382q0(jArr, jArr, i9, i10, i11);
                        }
                        c0967y.f3044b -= i10 - i9;
                        return;
                    }
                    return;
                }
            }
        } else {
            c0967y.getClass();
        }
        C3193a.m6820i("Index must be between 0 and size");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f22942i = -1;
        this.f22940g.m2289d();
        this.f22941h.f3044b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC5852n) && indexOf((AbstractC5852n) obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC5852n) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        Object objM2291f = this.f22940g.m2291f(i9);
        objM2291f.getClass();
        return (AbstractC5852n) objM2291f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC5852n)) {
            return -1;
        }
        AbstractC5852n abstractC5852n = (AbstractC5852n) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i9 = 0;
            while (!AbstractC1416l.m3825a(this.f22940g.m2291f(i9), abstractC5852n)) {
                if (i9 != size) {
                    i9++;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f22940g.m2293h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4327a(this, 0, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC5852n)) {
            return -1;
        }
        AbstractC5852n abstractC5852n = (AbstractC5852n) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (AbstractC1416l.m3825a(this.f22940g.m2291f(size), abstractC5852n)) {
                return size;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C4327a(this, 0, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f22940g.f2924b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        return new C5630o(this, i9, i10);
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

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        return new C4327a(this, i9, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
