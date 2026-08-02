package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 implements ListIterator, q41 {
    public final /* synthetic */ int h = 2;
    public final Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ea2(bf1 bf1Var, int i) {
        this.j = bf1Var;
        this.i = ((List) bf1Var.i).listIterator(du.k0(i, bf1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.h) {
            case 0:
                ListIterator listIterator = (ListIterator) this.i;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((a72) obj).h < ((ew2) this.j).k - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((a72) obj).h >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                a72 a72Var = (a72) obj;
                int i2 = a72Var.h + 1;
                ew2 ew2Var = (ew2) this.j;
                tl.f(i2, ew2Var.k);
                a72Var.h = i2;
                return ew2Var.get(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.h;
        Object obj = this.j;
        Object obj2 = this.i;
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
                return ((a72) obj2).h + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                a72 a72Var = (a72) obj;
                int i2 = a72Var.h;
                ew2 ew2Var = (ew2) this.j;
                tl.f(i2, ew2Var.k);
                a72Var.h = i2 - 1;
                return ew2Var.get(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.h;
        Object obj = this.j;
        Object obj2 = this.i;
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
                return ((a72) obj2).h;
        }
        return (size - 1) - iNextIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                ((ListIterator) this.i).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.h) {
            case 0:
                ((ListIterator) this.i).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public ea2(fa2 fa2Var, int i) {
        this.j = fa2Var;
        this.i = fa2Var.h.listIterator(du.k0(i, fa2Var));
    }

    public ea2(a72 a72Var, ew2 ew2Var) {
        this.i = a72Var;
        this.j = ew2Var;
    }
}
