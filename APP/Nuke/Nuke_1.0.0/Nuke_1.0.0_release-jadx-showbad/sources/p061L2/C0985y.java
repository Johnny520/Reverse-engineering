package p061L2;

import java.util.List;
import java.util.ListIterator;
import p011B4.AbstractC0231b;
import p117X2.C1673r;
import p122Y2.InterfaceC1766a;
import p132a3.C1804d;
import p158f0.AbstractC2086r;
import p158f0.C2093y;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0985y implements ListIterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3050d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f3051e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3052f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0985y(C0986z c0986z, int i5) {
        this.f3052f = c0986z;
        List list = (List) c0986z.f3054e;
        if (i5 >= 0 && i5 <= c0986z.mo1974a()) {
            this.f3051e = list.listIterator(c0986z.mo1974a() - i5);
            return;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Position index ", " must be in range [");
        sbM404o.append(new C1804d(0, c0986z.mo1974a(), 1));
        sbM404o.append("].");
        throw new IndexOutOfBoundsException(sbM404o.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f3050d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3050d) {
            case 0:
                return ((ListIterator) this.f3051e).hasPrevious();
            default:
                return ((C1673r) this.f3051e).f5707d < ((C2093y) this.f3052f).f7015g - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3050d) {
            case 0:
                return ((ListIterator) this.f3051e).hasNext();
            default:
                return ((C1673r) this.f3051e).f5707d >= 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3050d) {
            case 0:
                return ((ListIterator) this.f3051e).previous();
            default:
                C1673r c1673r = (C1673r) this.f3051e;
                int i5 = c1673r.f5707d + 1;
                C2093y c2093y = (C2093y) this.f3052f;
                AbstractC2086r.m3850a(i5, c2093y.f7015g);
                c1673r.f5707d = i5;
                return c2093y.get(i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3050d) {
            case 0:
                C0986z c0986z = (C0986z) this.f3052f;
                return AbstractC2352g.m4208u(c0986z) - ((ListIterator) this.f3051e).previousIndex();
            default:
                return ((C1673r) this.f3051e).f5707d + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3050d) {
            case 0:
                return ((ListIterator) this.f3051e).next();
            default:
                C1673r c1673r = (C1673r) this.f3051e;
                int i5 = c1673r.f5707d;
                C2093y c2093y = (C2093y) this.f3052f;
                AbstractC2086r.m3850a(i5, c2093y.f7015g);
                c1673r.f5707d = i5 - 1;
                return c2093y.get(i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f3050d) {
            case 0:
                C0986z c0986z = (C0986z) this.f3052f;
                return AbstractC2352g.m4208u(c0986z) - ((ListIterator) this.f3051e).nextIndex();
            default:
                return ((C1673r) this.f3051e).f5707d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f3050d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3050d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C0985y(C1673r c1673r, C2093y c2093y) {
        this.f3051e = c1673r;
        this.f3052f = c2093y;
    }
}
