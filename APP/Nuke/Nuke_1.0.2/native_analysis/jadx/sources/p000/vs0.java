package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 implements ListIterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12158h;

    /* JADX INFO: renamed from: i */
    public int f12159i;

    /* JADX INFO: renamed from: j */
    public int f12160j;

    /* JADX INFO: renamed from: k */
    public int f12161k;

    /* JADX INFO: renamed from: l */
    public final Object f12162l;

    public vs0(ps2 ps2Var, int i) {
        this.f12158h = 3;
        this.f12162l = ps2Var;
        this.f12159i = i - 1;
        this.f12160j = -1;
        this.f12161k = AbstractC0738tl.m5281I(ps2Var);
    }

    /* JADX INFO: renamed from: a */
    public void m5795a() {
        if (((AbstractList) ((ob1) this.f12162l).f7613l).modCount != this.f12161k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f12158h;
        Object obj2 = this.f12162l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m5795a();
                ob1 ob1Var = (ob1) obj2;
                int i2 = this.f12159i;
                this.f12159i = i2 + 1;
                ob1Var.add(i2, obj);
                this.f12160j = -1;
                this.f12161k = ((AbstractList) ob1Var).modCount;
                return;
            case 2:
                m5796b();
                pb1 pb1Var = (pb1) obj2;
                int i3 = this.f12159i;
                this.f12159i = i3 + 1;
                pb1Var.add(i3, obj);
                this.f12160j = -1;
                this.f12161k = ((AbstractList) pb1Var).modCount;
                return;
            default:
                m5797c();
                ps2 ps2Var = (ps2) obj2;
                ps2Var.add(this.f12159i + 1, obj);
                this.f12160j = -1;
                this.f12159i++;
                this.f12161k = AbstractC0738tl.m5281I(ps2Var);
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5796b() {
        if (((AbstractList) ((pb1) this.f12162l)).modCount != this.f12161k) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5797c() {
        if (AbstractC0738tl.m5281I((ps2) this.f12162l) != this.f12161k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12158h;
        Object obj = this.f12162l;
        switch (i) {
            case 0:
                if (this.f12159i < this.f12161k) {
                }
                break;
            case 1:
                if (this.f12159i < ((ob1) obj).f7611j) {
                }
                break;
            case 2:
                if (this.f12159i < ((pb1) obj).f8244i) {
                }
                break;
            default:
                if (this.f12159i < ((ps2) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f12158h) {
            case 0:
                if (this.f12159i > this.f12160j) {
                }
                break;
            case 1:
                if (this.f12159i > 0) {
                }
                break;
            case 2:
                if (this.f12159i > 0) {
                }
                break;
            default:
                if (this.f12159i >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f12158h;
        Object obj = this.f12162l;
        switch (i) {
            case 0:
                lk1 lk1Var = ((xs0) obj).f13155h;
                int i2 = this.f12159i;
                this.f12159i = i2 + 1;
                Object objM2930f = lk1Var.m2930f(i2);
                objM2930f.getClass();
                return (th1) objM2930f;
            case 1:
                m5795a();
                int i3 = this.f12159i;
                ob1 ob1Var = (ob1) obj;
                if (i3 >= ob1Var.f7611j) {
                    um2.m5513b();
                    return null;
                }
                this.f12159i = i3 + 1;
                this.f12160j = i3;
                return ob1Var.f7609h[ob1Var.f7610i + i3];
            case 2:
                m5796b();
                int i4 = this.f12159i;
                pb1 pb1Var = (pb1) obj;
                if (i4 >= pb1Var.f8244i) {
                    um2.m5513b();
                    return null;
                }
                this.f12159i = i4 + 1;
                this.f12160j = i4;
                return pb1Var.f8243h[i4];
            default:
                m5797c();
                int i5 = this.f12159i + 1;
                this.f12160j = i5;
                ps2 ps2Var = (ps2) obj;
                AbstractC0738tl.m5307f(i5, ps2Var.size());
                Object obj2 = ps2Var.get(i5);
                this.f12159i = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f12158h) {
            case 0:
                return this.f12159i - this.f12160j;
            case 1:
                return this.f12159i;
            case 2:
                return this.f12159i;
            default:
                return this.f12159i + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f12158h;
        Object obj = this.f12162l;
        switch (i) {
            case 0:
                lk1 lk1Var = ((xs0) obj).f13155h;
                int i2 = this.f12159i - 1;
                this.f12159i = i2;
                Object objM2930f = lk1Var.m2930f(i2);
                objM2930f.getClass();
                return (th1) objM2930f;
            case 1:
                m5795a();
                int i3 = this.f12159i;
                if (i3 <= 0) {
                    um2.m5513b();
                    return null;
                }
                int i4 = i3 - 1;
                this.f12159i = i4;
                this.f12160j = i4;
                ob1 ob1Var = (ob1) obj;
                return ob1Var.f7609h[ob1Var.f7610i + i4];
            case 2:
                m5796b();
                int i5 = this.f12159i;
                if (i5 <= 0) {
                    um2.m5513b();
                    return null;
                }
                int i6 = i5 - 1;
                this.f12159i = i6;
                this.f12160j = i6;
                return ((pb1) obj).f8243h[i6];
            default:
                m5797c();
                ps2 ps2Var = (ps2) obj;
                AbstractC0738tl.m5307f(this.f12159i, ps2Var.size());
                int i7 = this.f12159i;
                this.f12160j = i7;
                this.f12159i--;
                return ps2Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f12158h) {
            case 0:
                return (this.f12159i - this.f12160j) - 1;
            case 1:
                i = this.f12159i;
                break;
            case 2:
                i = this.f12159i;
                break;
            default:
                return this.f12159i;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f12158h;
        Object obj = this.f12162l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ob1 ob1Var = (ob1) obj;
                m5795a();
                int i2 = this.f12160j;
                if (i2 == -1) {
                    C0676s.m4653l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ob1Var.mo153b(i2);
                this.f12159i = this.f12160j;
                this.f12160j = -1;
                this.f12161k = ((AbstractList) ob1Var).modCount;
                return;
            case 2:
                pb1 pb1Var = (pb1) obj;
                m5796b();
                int i3 = this.f12160j;
                if (i3 == -1) {
                    C0676s.m4653l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                pb1Var.mo153b(i3);
                this.f12159i = this.f12160j;
                this.f12160j = -1;
                this.f12161k = ((AbstractList) pb1Var).modCount;
                return;
            default:
                m5797c();
                ps2 ps2Var = (ps2) obj;
                ps2Var.remove(this.f12160j);
                this.f12159i--;
                this.f12160j = -1;
                this.f12161k = AbstractC0738tl.m5281I(ps2Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f12158h;
        Object obj2 = this.f12162l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m5795a();
                int i2 = this.f12160j;
                if (i2 != -1) {
                    ((ob1) obj2).set(i2, obj);
                    return;
                } else {
                    C0676s.m4653l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                m5796b();
                int i3 = this.f12160j;
                if (i3 != -1) {
                    ((pb1) obj2).set(i3, obj);
                    return;
                } else {
                    C0676s.m4653l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                ps2 ps2Var = (ps2) obj2;
                m5797c();
                int i4 = this.f12160j;
                if (i4 < 0) {
                    C0676s.m4653l("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    ps2Var.set(i4, obj);
                    this.f12161k = AbstractC0738tl.m5281I(ps2Var);
                    return;
                }
        }
    }

    public vs0(pb1 pb1Var, int i) {
        this.f12158h = 2;
        this.f12162l = pb1Var;
        this.f12159i = i;
        this.f12160j = -1;
        this.f12161k = ((AbstractList) pb1Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vs0(xs0 xs0Var, int i, int i2) {
        this(xs0Var, (i2 & 1) != 0 ? 0 : i, 0, xs0Var.f13155h.f6164b);
        this.f12158h = 0;
    }

    public vs0(xs0 xs0Var, int i, int i2, int i3) {
        this.f12158h = 0;
        this.f12162l = xs0Var;
        this.f12159i = i;
        this.f12160j = i2;
        this.f12161k = i3;
    }

    public vs0(ob1 ob1Var, int i) {
        this.f12158h = 1;
        this.f12162l = ob1Var;
        this.f12159i = i;
        this.f12160j = -1;
        this.f12161k = ((AbstractList) ob1Var).modCount;
    }
}
