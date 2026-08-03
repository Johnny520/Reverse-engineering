package p339x1;

import gg.AbstractC1415k;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p114hg.InterfaceC1711a;
import p304uf.C4327a;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: x1.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5630o implements List, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final int f22929g;

    /* JADX INFO: renamed from: h */
    public final int f22930h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5633p f22931i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5630o(C5633p c5633p, int i9, int i10) {
        this.f22931i = c5633p;
        this.f22929g = i9;
        this.f22930h = i10;
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
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        Object objM2291f = this.f22931i.f22940g.m2291f(i9 + this.f22929g);
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
        int i9 = this.f22929g;
        int i10 = this.f22930h;
        if (i9 > i10) {
            return -1;
        }
        int i11 = i9;
        while (!AbstractC1416l.m3825a(this.f22931i.f22940g.m2291f(i11), abstractC5852n)) {
            if (i11 == i10) {
                return -1;
            }
            i11++;
        }
        return i11 - i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i9 = this.f22929g;
        return new C4327a(this.f22931i, i9, i9, this.f22930h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC5852n)) {
            return -1;
        }
        AbstractC5852n abstractC5852n = (AbstractC5852n) obj;
        int i9 = this.f22930h;
        int i10 = this.f22929g;
        if (i10 > i9) {
            return -1;
        }
        while (!AbstractC1416l.m3825a(this.f22931i.f22940g.m2291f(i9), abstractC5852n)) {
            if (i9 == i10) {
                return -1;
            }
            i9--;
        }
        return i9 - i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        int i10 = this.f22929g;
        int i11 = this.f22930h;
        return new C4327a(this.f22931i, i9 + i10, i10, i11);
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
        return this.f22930h - this.f22929g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        int i11 = this.f22929g;
        return new C5630o(this.f22931i, i9 + i11, i11 + i10);
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i9 = this.f22929g;
        return new C4327a(this.f22931i, i9, i9, this.f22930h);
    }
}
