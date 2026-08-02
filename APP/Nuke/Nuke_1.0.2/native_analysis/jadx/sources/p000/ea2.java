package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 implements ListIterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2374h = 2;

    /* JADX INFO: renamed from: i */
    public final Object f2375i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2376j;

    public ea2(bf1 bf1Var, int i) {
        this.f2376j = bf1Var;
        this.f2375i = ((List) bf1Var.f838i).listIterator(AbstractC0142du.m1155k0(i, bf1Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2374h) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f2375i;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2374h;
        Object obj = this.f2375i;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((a72) obj).f108h < ((ew2) this.f2376j).f2663k - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f2374h;
        Object obj = this.f2375i;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((a72) obj).f108h >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f2374h;
        Object obj = this.f2375i;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                a72 a72Var = (a72) obj;
                int i2 = a72Var.f108h + 1;
                ew2 ew2Var = (ew2) this.f2376j;
                AbstractC0738tl.m5307f(i2, ew2Var.f2663k);
                a72Var.f108h = i2;
                return ew2Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.f2374h;
        Object obj = this.f2376j;
        Object obj2 = this.f2375i;
        switch (i) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((fa2) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((bf1) obj).size();
                break;
            default:
                return ((a72) obj2).f108h + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f2374h;
        Object obj = this.f2375i;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                a72 a72Var = (a72) obj;
                int i2 = a72Var.f108h;
                ew2 ew2Var = (ew2) this.f2376j;
                AbstractC0738tl.m5307f(i2, ew2Var.f2663k);
                a72Var.f108h = i2 - 1;
                return ew2Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.f2374h;
        Object obj = this.f2376j;
        Object obj2 = this.f2375i;
        switch (i) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((fa2) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((bf1) obj).size();
                break;
            default:
                return ((a72) obj2).f108h;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2374h) {
            case 0:
                ((ListIterator) this.f2375i).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2374h) {
            case 0:
                ((ListIterator) this.f2375i).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public ea2(fa2 fa2Var, int i) {
        this.f2376j = fa2Var;
        this.f2375i = fa2Var.f2883h.listIterator(AbstractC0142du.m1155k0(i, fa2Var));
    }

    public ea2(a72 a72Var, ew2 ew2Var) {
        this.f2375i = a72Var;
        this.f2376j = ew2Var;
    }
}
