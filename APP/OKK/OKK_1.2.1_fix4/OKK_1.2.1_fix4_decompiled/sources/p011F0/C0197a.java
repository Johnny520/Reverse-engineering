package p011F0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p009E0.AbstractC0176g;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: F0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0197a implements ListIterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f408a = 0;

    /* JADX INFO: renamed from: b */
    public int f409b;

    /* JADX INFO: renamed from: c */
    public int f410c;

    /* JADX INFO: renamed from: d */
    public int f411d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0176g f412e;

    public C0197a(C0199c c0199c, int i2) {
        AbstractC0307g.m703e(c0199c, "list");
        this.f412e = c0199c;
        this.f409b = i2;
        this.f410c = -1;
        this.f411d = ((AbstractList) c0199c).modCount;
    }

    /* JADX INFO: renamed from: a */
    public void m569a() {
        if (((AbstractList) ((C0198b) this.f412e).f417e).modCount != this.f411d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f408a) {
            case 0:
                m569a();
                int i2 = this.f409b;
                this.f409b = i2 + 1;
                C0198b c0198b = (C0198b) this.f412e;
                c0198b.add(i2, obj);
                this.f410c = -1;
                this.f411d = ((AbstractList) c0198b).modCount;
                break;
            default:
                m570b();
                int i3 = this.f409b;
                this.f409b = i3 + 1;
                C0199c c0199c = (C0199c) this.f412e;
                c0199c.add(i3, obj);
                this.f410c = -1;
                this.f411d = ((AbstractList) c0199c).modCount;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m570b() {
        if (((AbstractList) ((C0199c) this.f412e)).modCount != this.f411d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f408a) {
            case 0:
                if (this.f409b < ((C0198b) this.f412e).f415c) {
                }
                break;
            default:
                if (this.f409b < ((C0199c) this.f412e).f420b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f408a) {
            case 0:
                if (this.f409b > 0) {
                }
                break;
            default:
                if (this.f409b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f408a) {
            case 0:
                m569a();
                int i2 = this.f409b;
                C0198b c0198b = (C0198b) this.f412e;
                if (i2 >= c0198b.f415c) {
                    throw new NoSuchElementException();
                }
                this.f409b = i2 + 1;
                this.f410c = i2;
                return c0198b.f413a[c0198b.f414b + i2];
            default:
                m570b();
                int i3 = this.f409b;
                C0199c c0199c = (C0199c) this.f412e;
                if (i3 >= c0199c.f420b) {
                    throw new NoSuchElementException();
                }
                this.f409b = i3 + 1;
                this.f410c = i3;
                return c0199c.f419a[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f408a) {
        }
        return this.f409b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f408a) {
            case 0:
                m569a();
                int i2 = this.f409b;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f409b = i3;
                this.f410c = i3;
                C0198b c0198b = (C0198b) this.f412e;
                return c0198b.f413a[c0198b.f414b + i3];
            default:
                m570b();
                int i4 = this.f409b;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f409b = i5;
                this.f410c = i5;
                return ((C0199c) this.f412e).f419a[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f408a) {
        }
        return this.f409b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f408a) {
            case 0:
                m569a();
                int i2 = this.f410c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                C0198b c0198b = (C0198b) this.f412e;
                c0198b.mo522b(i2);
                this.f409b = this.f410c;
                this.f410c = -1;
                this.f411d = ((AbstractList) c0198b).modCount;
                return;
            default:
                m570b();
                int i3 = this.f410c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                C0199c c0199c = (C0199c) this.f412e;
                c0199c.mo522b(i3);
                this.f409b = this.f410c;
                this.f410c = -1;
                this.f411d = ((AbstractList) c0199c).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f408a) {
            case 0:
                m569a();
                int i2 = this.f410c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((C0198b) this.f412e).set(i2, obj);
                return;
            default:
                m570b();
                int i3 = this.f410c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((C0199c) this.f412e).set(i3, obj);
                return;
        }
    }

    public C0197a(C0198b c0198b, int i2) {
        AbstractC0307g.m703e(c0198b, "list");
        this.f412e = c0198b;
        this.f409b = i2;
        this.f410c = -1;
        this.f411d = ((AbstractList) c0198b).modCount;
    }
}
