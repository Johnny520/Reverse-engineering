package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: renamed from: ny */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0530ny implements ListIterator, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4363d;

    /* JADX INFO: renamed from: e */
    public int f4364e;

    /* JADX INFO: renamed from: f */
    public int f4365f;

    /* JADX INFO: renamed from: g */
    public int f4366g;

    /* JADX INFO: renamed from: h */
    public final Object f4367h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0530ny(c31 c31Var, int i) {
        this.f4363d = 3;
        this.f4367h = c31Var;
        this.f4364e = i - 1;
        this.f4365f = -1;
        this.f4366g = p30.m2970F(c31Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m2742a() {
        if (((AbstractList) ((va0) this.f4367h).f6625h).modCount != this.f4366g) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f4363d;
        Object obj2 = this.f4367h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m2742a();
                va0 va0Var = (va0) obj2;
                int i2 = this.f4364e;
                this.f4364e = i2 + 1;
                va0Var.add(i2, obj);
                this.f4365f = -1;
                this.f4366g = ((AbstractList) va0Var).modCount;
                return;
            case 2:
                m2743b();
                wa0 wa0Var = (wa0) obj2;
                int i3 = this.f4364e;
                this.f4364e = i3 + 1;
                wa0Var.add(i3, obj);
                this.f4365f = -1;
                this.f4366g = ((AbstractList) wa0Var).modCount;
                return;
            default:
                m2744c();
                c31 c31Var = (c31) obj2;
                c31Var.add(this.f4364e + 1, obj);
                this.f4365f = -1;
                this.f4364e++;
                this.f4366g = p30.m2970F(c31Var);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m2743b() {
        if (((AbstractList) ((wa0) this.f4367h)).modCount != this.f4366g) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m2744c() {
        if (p30.m2970F((c31) this.f4367h) != this.f4366g) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4363d;
        Object obj = this.f4367h;
        switch (i) {
            case 0:
                if (this.f4364e < this.f4366g) {
                }
                break;
            case 1:
                if (this.f4364e < ((va0) obj).f6623f) {
                }
                break;
            case 2:
                if (this.f4364e < ((wa0) obj).f7054e) {
                }
                break;
            default:
                if (this.f4364e < ((c31) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4363d) {
            case 0:
                if (this.f4364e > this.f4365f) {
                }
                break;
            case 1:
                if (this.f4364e > 0) {
                }
                break;
            case 2:
                if (this.f4364e > 0) {
                }
                break;
            default:
                if (this.f4364e >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f4363d;
        Object obj = this.f4367h;
        switch (i) {
            case 0:
                dh0 dh0Var = ((C0632py) obj).f4984d;
                int i2 = this.f4364e;
                this.f4364e = i2 + 1;
                Object objM702f = dh0Var.m702f(i2);
                objM702f.getClass();
                return (oe0) objM702f;
            case 1:
                m2742a();
                int i3 = this.f4364e;
                va0 va0Var = (va0) obj;
                if (i3 >= va0Var.f6623f) {
                    C0921xc.m5132m();
                    return null;
                }
                this.f4364e = i3 + 1;
                this.f4365f = i3;
                return va0Var.f6621d[va0Var.f6622e + i3];
            case 2:
                m2743b();
                int i4 = this.f4364e;
                wa0 wa0Var = (wa0) obj;
                if (i4 >= wa0Var.f7054e) {
                    C0921xc.m5132m();
                    return null;
                }
                this.f4364e = i4 + 1;
                this.f4365f = i4;
                return wa0Var.f7053d[i4];
            default:
                m2744c();
                int i5 = this.f4364e + 1;
                this.f4365f = i5;
                c31 c31Var = (c31) obj;
                p30.m3000j(i5, c31Var.size());
                Object obj2 = c31Var.get(i5);
                this.f4364e = i5;
                return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4363d) {
            case 0:
                return this.f4364e - this.f4365f;
            case 1:
                return this.f4364e;
            case 2:
                return this.f4364e;
            default:
                return this.f4364e + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f4363d;
        Object obj = this.f4367h;
        switch (i) {
            case 0:
                dh0 dh0Var = ((C0632py) obj).f4984d;
                int i2 = this.f4364e - 1;
                this.f4364e = i2;
                Object objM702f = dh0Var.m702f(i2);
                objM702f.getClass();
                return (oe0) objM702f;
            case 1:
                m2742a();
                int i3 = this.f4364e;
                if (i3 <= 0) {
                    C0921xc.m5132m();
                    return null;
                }
                int i4 = i3 - 1;
                this.f4364e = i4;
                this.f4365f = i4;
                va0 va0Var = (va0) obj;
                return va0Var.f6621d[va0Var.f6622e + i4];
            case 2:
                m2743b();
                int i5 = this.f4364e;
                if (i5 <= 0) {
                    C0921xc.m5132m();
                    return null;
                }
                int i6 = i5 - 1;
                this.f4364e = i6;
                this.f4365f = i6;
                return ((wa0) obj).f7053d[i6];
            default:
                m2744c();
                c31 c31Var = (c31) obj;
                p30.m3000j(this.f4364e, c31Var.size());
                int i7 = this.f4364e;
                this.f4365f = i7;
                this.f4364e--;
                return c31Var.get(i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f4363d) {
            case 0:
                return (this.f4364e - this.f4365f) - 1;
            case 1:
                i = this.f4364e;
                break;
            case 2:
                i = this.f4364e;
                break;
            default:
                return this.f4364e;
        }
        return i - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f4363d;
        Object obj = this.f4367h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                va0 va0Var = (va0) obj;
                m2742a();
                int i2 = this.f4365f;
                if (i2 == -1) {
                    C0921xc.m5134o("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                va0Var.mo1b(i2);
                this.f4364e = this.f4365f;
                this.f4365f = -1;
                this.f4366g = ((AbstractList) va0Var).modCount;
                return;
            case 2:
                wa0 wa0Var = (wa0) obj;
                m2743b();
                int i3 = this.f4365f;
                if (i3 == -1) {
                    C0921xc.m5134o("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                wa0Var.mo1b(i3);
                this.f4364e = this.f4365f;
                this.f4365f = -1;
                this.f4366g = ((AbstractList) wa0Var).modCount;
                return;
            default:
                m2744c();
                c31 c31Var = (c31) obj;
                c31Var.remove(this.f4365f);
                this.f4364e--;
                this.f4365f = -1;
                this.f4366g = p30.m2970F(c31Var);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f4363d;
        Object obj2 = this.f4367h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m2742a();
                int i2 = this.f4365f;
                if (i2 != -1) {
                    ((va0) obj2).set(i2, obj);
                    return;
                } else {
                    C0921xc.m5134o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                m2743b();
                int i3 = this.f4365f;
                if (i3 != -1) {
                    ((wa0) obj2).set(i3, obj);
                    return;
                } else {
                    C0921xc.m5134o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                c31 c31Var = (c31) obj2;
                m2744c();
                int i4 = this.f4365f;
                if (i4 < 0) {
                    C0921xc.m5134o("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    c31Var.set(i4, obj);
                    this.f4366g = p30.m2970F(c31Var);
                    return;
                }
        }
    }

    public C0530ny(wa0 wa0Var, int i) {
        this.f4363d = 2;
        this.f4367h = wa0Var;
        this.f4364e = i;
        this.f4365f = -1;
        this.f4366g = ((AbstractList) wa0Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0530ny(C0632py c0632py, int i, int i2) {
        this(c0632py, (i2 & 1) != 0 ? 0 : i, 0, c0632py.f4984d.f1109b);
        this.f4363d = 0;
    }

    public C0530ny(C0632py c0632py, int i, int i2, int i3) {
        this.f4363d = 0;
        this.f4367h = c0632py;
        this.f4364e = i;
        this.f4365f = i2;
        this.f4366g = i3;
    }

    /* JADX DEBUG: Class process forced to load method for inline: va0.c(va0):int */
    public C0530ny(va0 va0Var, int i) {
        this.f4363d = 1;
        this.f4367h = va0Var;
        this.f4364e = i;
        this.f4365f = -1;
        this.f4366g = ((AbstractList) va0Var).modCount;
    }
}
