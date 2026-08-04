package yyds;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛲᛶᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0368 implements ListIterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final AbstractC0212 f1889;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f1891;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f1892;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1890 = 0;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1888 = -1;

    public C0368(C2578 c2578, int i) {
        this.f1889 = c2578;
        this.f1892 = i;
        this.f1891 = ((AbstractList) c2578).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f1890;
        AbstractC0212 abstractC0212 = this.f1889;
        switch (i) {
            case 0:
                m1066();
                C0924 c0924 = (C0924) abstractC0212;
                int i2 = this.f1892;
                this.f1892 = i2 + 1;
                c0924.add(i2, obj);
                this.f1888 = -1;
                this.f1891 = ((AbstractList) c0924).modCount;
                break;
            default:
                m1067();
                C2578 c2578 = (C2578) abstractC0212;
                int i3 = this.f1892;
                this.f1892 = i3 + 1;
                c2578.add(i3, obj);
                this.f1888 = -1;
                this.f1891 = ((AbstractList) c2578).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f1890;
        AbstractC0212 abstractC0212 = this.f1889;
        switch (i) {
            case 0:
                if (this.f1892 < ((C0924) abstractC0212).f4234) {
                }
                break;
            default:
                if (this.f1892 < ((C2578) abstractC0212).f12711) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1890) {
            case 0:
                if (this.f1892 > 0) {
                }
                break;
            default:
                if (this.f1892 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f1890;
        AbstractC0212 abstractC0212 = this.f1889;
        switch (i) {
            case 0:
                m1066();
                int i2 = this.f1892;
                C0924 c0924 = (C0924) abstractC0212;
                if (i2 >= c0924.f4234) {
                    throw new NoSuchElementException();
                }
                this.f1892 = i2 + 1;
                this.f1888 = i2;
                return c0924.f4236[c0924.f4238 + i2];
            default:
                m1067();
                int i3 = this.f1892;
                C2578 c2578 = (C2578) abstractC0212;
                if (i3 >= c2578.f12711) {
                    throw new NoSuchElementException();
                }
                this.f1892 = i3 + 1;
                this.f1888 = i3;
                return c2578.f12710[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1890) {
        }
        return this.f1892;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f1890;
        AbstractC0212 abstractC0212 = this.f1889;
        switch (i) {
            case 0:
                m1066();
                int i2 = this.f1892;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f1892 = i3;
                this.f1888 = i3;
                C0924 c0924 = (C0924) abstractC0212;
                return c0924.f4236[c0924.f4238 + i3];
            default:
                m1067();
                int i4 = this.f1892;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f1892 = i5;
                this.f1888 = i5;
                return ((C2578) abstractC0212).f12710[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f1890) {
            case 0:
                i = this.f1892;
                break;
            default:
                i = this.f1892;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f1890;
        AbstractC0212 abstractC0212 = this.f1889;
        switch (i) {
            case 0:
                C0924 c0924 = (C0924) abstractC0212;
                m1066();
                int i2 = this.f1888;
                if (i2 == -1) {
                    C0188.m800("Call next() or previous() before removing element from the iterator.");
                } else {
                    c0924.mo869(i2);
                    this.f1892 = this.f1888;
                    this.f1888 = -1;
                    this.f1891 = ((AbstractList) c0924).modCount;
                }
                break;
            default:
                C2578 c2578 = (C2578) abstractC0212;
                m1067();
                int i3 = this.f1888;
                if (i3 == -1) {
                    C0188.m800("Call next() or previous() before removing element from the iterator.");
                } else {
                    c2578.mo869(i3);
                    this.f1892 = this.f1888;
                    this.f1888 = -1;
                    this.f1891 = ((AbstractList) c2578).modCount;
                }
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f1890;
        AbstractC0212 abstractC0212 = this.f1889;
        switch (i) {
            case 0:
                m1066();
                int i2 = this.f1888;
                if (i2 == -1) {
                    C0188.m800("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((C0924) abstractC0212).set(i2, obj);
                }
                break;
            default:
                m1067();
                int i3 = this.f1888;
                if (i3 == -1) {
                    C0188.m800("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((C2578) abstractC0212).set(i3, obj);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m1066() {
        if (((AbstractList) ((C0924) this.f1889).f4235).modCount != this.f1891) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m1067() {
        if (((AbstractList) ((C2578) this.f1889)).modCount != this.f1891) {
            throw new ConcurrentModificationException();
        }
    }

    public C0368(C0924 c0924, int i) {
        this.f1889 = c0924;
        this.f1892 = i;
        this.f1891 = ((AbstractList) c0924).modCount;
    }
}
