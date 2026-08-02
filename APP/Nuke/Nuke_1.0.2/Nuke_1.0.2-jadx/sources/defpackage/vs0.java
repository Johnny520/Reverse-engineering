package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 implements ListIterator, q41 {
    public final /* synthetic */ int h;
    public int i;
    public int j;
    public int k;
    public final Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vs0(ps2 ps2Var, int i) {
        this.h = 3;
        this.l = ps2Var;
        this.i = i - 1;
        this.j = -1;
        this.k = tl.I(ps2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        if (((AbstractList) ((ob1) this.l).l).modCount != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.h;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                ob1 ob1Var = (ob1) obj2;
                int i2 = this.i;
                this.i = i2 + 1;
                ob1Var.add(i2, obj);
                this.j = -1;
                this.k = ((AbstractList) ob1Var).modCount;
                return;
            case 2:
                b();
                pb1 pb1Var = (pb1) obj2;
                int i3 = this.i;
                this.i = i3 + 1;
                pb1Var.add(i3, obj);
                this.j = -1;
                this.k = ((AbstractList) pb1Var).modCount;
                return;
            default:
                c();
                ps2 ps2Var = (ps2) obj2;
                ps2Var.add(this.i + 1, obj);
                this.j = -1;
                this.i++;
                this.k = tl.I(ps2Var);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        if (((AbstractList) ((pb1) this.l)).modCount != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        if (tl.I((ps2) this.l) != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        Object obj = this.l;
        switch (i) {
            case 0:
                if (this.i < this.k) {
                }
                break;
            case 1:
                if (this.i < ((ob1) obj).j) {
                }
                break;
            case 2:
                if (this.i < ((pb1) obj).i) {
                }
                break;
            default:
                if (this.i < ((ps2) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.h) {
            case 0:
                if (this.i > this.j) {
                }
                break;
            case 1:
                if (this.i > 0) {
                }
                break;
            case 2:
                if (this.i > 0) {
                }
                break;
            default:
                if (this.i >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.h;
        Object obj = this.l;
        switch (i) {
            case 0:
                lk1 lk1Var = ((xs0) obj).h;
                int i2 = this.i;
                this.i = i2 + 1;
                Object objF = lk1Var.f(i2);
                objF.getClass();
                return (th1) objF;
            case 1:
                a();
                int i3 = this.i;
                ob1 ob1Var = (ob1) obj;
                if (i3 >= ob1Var.j) {
                    um2.b();
                    return null;
                }
                this.i = i3 + 1;
                this.j = i3;
                return ob1Var.h[ob1Var.i + i3];
            case 2:
                b();
                int i4 = this.i;
                pb1 pb1Var = (pb1) obj;
                if (i4 >= pb1Var.i) {
                    um2.b();
                    return null;
                }
                this.i = i4 + 1;
                this.j = i4;
                return pb1Var.h[i4];
            default:
                c();
                int i5 = this.i + 1;
                this.j = i5;
                ps2 ps2Var = (ps2) obj;
                tl.f(i5, ps2Var.size());
                Object obj2 = ps2Var.get(i5);
                this.i = i5;
                return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.h) {
            case 0:
                return this.i - this.j;
            case 1:
                return this.i;
            case 2:
                return this.i;
            default:
                return this.i + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.h;
        Object obj = this.l;
        switch (i) {
            case 0:
                lk1 lk1Var = ((xs0) obj).h;
                int i2 = this.i - 1;
                this.i = i2;
                Object objF = lk1Var.f(i2);
                objF.getClass();
                return (th1) objF;
            case 1:
                a();
                int i3 = this.i;
                if (i3 <= 0) {
                    um2.b();
                    return null;
                }
                int i4 = i3 - 1;
                this.i = i4;
                this.j = i4;
                ob1 ob1Var = (ob1) obj;
                return ob1Var.h[ob1Var.i + i4];
            case 2:
                b();
                int i5 = this.i;
                if (i5 <= 0) {
                    um2.b();
                    return null;
                }
                int i6 = i5 - 1;
                this.i = i6;
                this.j = i6;
                return ((pb1) obj).h[i6];
            default:
                c();
                ps2 ps2Var = (ps2) obj;
                tl.f(this.i, ps2Var.size());
                int i7 = this.i;
                this.j = i7;
                this.i--;
                return ps2Var.get(i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.h) {
            case 0:
                return (this.i - this.j) - 1;
            case 1:
                i = this.i;
                break;
            case 2:
                i = this.i;
                break;
            default:
                return this.i;
        }
        return i - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.h;
        Object obj = this.l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ob1 ob1Var = (ob1) obj;
                a();
                int i2 = this.j;
                if (i2 == -1) {
                    s.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ob1Var.b(i2);
                this.i = this.j;
                this.j = -1;
                this.k = ((AbstractList) ob1Var).modCount;
                return;
            case 2:
                pb1 pb1Var = (pb1) obj;
                b();
                int i3 = this.j;
                if (i3 == -1) {
                    s.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                pb1Var.b(i3);
                this.i = this.j;
                this.j = -1;
                this.k = ((AbstractList) pb1Var).modCount;
                return;
            default:
                c();
                ps2 ps2Var = (ps2) obj;
                ps2Var.remove(this.j);
                this.i--;
                this.j = -1;
                this.k = tl.I(ps2Var);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.h;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.j;
                if (i2 != -1) {
                    ((ob1) obj2).set(i2, obj);
                    return;
                } else {
                    s.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.j;
                if (i3 != -1) {
                    ((pb1) obj2).set(i3, obj);
                    return;
                } else {
                    s.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                ps2 ps2Var = (ps2) obj2;
                c();
                int i4 = this.j;
                if (i4 < 0) {
                    s.l("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    ps2Var.set(i4, obj);
                    this.k = tl.I(ps2Var);
                    return;
                }
        }
    }

    public vs0(pb1 pb1Var, int i) {
        this.h = 2;
        this.l = pb1Var;
        this.i = i;
        this.j = -1;
        this.k = ((AbstractList) pb1Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vs0(xs0 xs0Var, int i, int i2) {
        this(xs0Var, (i2 & 1) != 0 ? 0 : i, 0, xs0Var.h.b);
        this.h = 0;
    }

    public vs0(xs0 xs0Var, int i, int i2, int i3) {
        this.h = 0;
        this.l = xs0Var;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ob1.c(ob1):int */
    public vs0(ob1 ob1Var, int i) {
        this.h = 1;
        this.l = ob1Var;
        this.i = i;
        this.j = -1;
        this.k = ((AbstractList) ob1Var).modCount;
    }
}
