package p041H0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p065M2.C0998a;
import p065M2.C0999b;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p158f0.AbstractC2086r;
import p158f0.C2085q;
import p169h0.AbstractC2206o;
import p186k.C2404A;

/* JADX INFO: renamed from: H0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0609o implements ListIterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1958d;

    /* JADX INFO: renamed from: e */
    public int f1959e;

    /* JADX INFO: renamed from: f */
    public int f1960f;

    /* JADX INFO: renamed from: g */
    public int f1961g;

    /* JADX INFO: renamed from: h */
    public final Object f1962h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0609o(C0613q c0613q, int i5, int i6) {
        this(c0613q, (i6 & 1) != 0 ? 0 : i5, 0, c0613q.f1966d.f7767b);
        this.f1958d = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m1052a() {
        if (((AbstractList) ((C0998a) this.f1962h).f3086h).modCount != this.f1961g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f1958d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case BuildConfig.VERSION_CODE /* 1 */:
                m1052a();
                C0998a c0998a = (C0998a) this.f1962h;
                int i5 = this.f1959e;
                this.f1959e = i5 + 1;
                c0998a.add(i5, obj);
                this.f1960f = -1;
                this.f1961g = ((AbstractList) c0998a).modCount;
                return;
            case 2:
                m1053b();
                C0999b c0999b = (C0999b) this.f1962h;
                int i6 = this.f1959e;
                this.f1959e = i6 + 1;
                c0999b.add(i6, obj);
                this.f1960f = -1;
                this.f1961g = ((AbstractList) c0999b).modCount;
                return;
            default:
                m1054c();
                C2085q c2085q = (C2085q) this.f1962h;
                c2085q.add(this.f1959e + 1, obj);
                this.f1960f = -1;
                this.f1959e++;
                this.f1961g = AbstractC2086r.m3855g(c2085q);
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1053b() {
        if (((AbstractList) ((C0999b) this.f1962h)).modCount != this.f1961g) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1054c() {
        if (AbstractC2086r.m3855g((C2085q) this.f1962h) != this.f1961g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1958d) {
            case 0:
                return this.f1959e < this.f1961g;
            case BuildConfig.VERSION_CODE /* 1 */:
                return this.f1959e < ((C0998a) this.f1962h).f3084f;
            case 2:
                return this.f1959e < ((C0999b) this.f1962h).f3089e;
            default:
                return this.f1959e < ((C2085q) this.f1962h).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1958d) {
            case 0:
                if (this.f1959e > this.f1960f) {
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (this.f1959e > 0) {
                }
                break;
            case 2:
                if (this.f1959e > 0) {
                }
                break;
            default:
                if (this.f1959e >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1958d) {
            case 0:
                C2404A c2404a = ((C0613q) this.f1962h).f1966d;
                int i5 = this.f1959e;
                this.f1959e = i5 + 1;
                Object objM4248f = c2404a.m4248f(i5);
                AbstractC1665j.m2983c(objM4248f, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC2206o) objM4248f;
            case BuildConfig.VERSION_CODE /* 1 */:
                m1052a();
                int i6 = this.f1959e;
                C0998a c0998a = (C0998a) this.f1962h;
                if (i6 >= c0998a.f3084f) {
                    throw new NoSuchElementException();
                }
                this.f1959e = i6 + 1;
                this.f1960f = i6;
                return c0998a.f3082d[c0998a.f3083e + i6];
            case 2:
                m1053b();
                int i7 = this.f1959e;
                C0999b c0999b = (C0999b) this.f1962h;
                if (i7 >= c0999b.f3089e) {
                    throw new NoSuchElementException();
                }
                this.f1959e = i7 + 1;
                this.f1960f = i7;
                return c0999b.f3088d[i7];
            default:
                m1054c();
                int i8 = this.f1959e + 1;
                this.f1960f = i8;
                C2085q c2085q = (C2085q) this.f1962h;
                AbstractC2086r.m3850a(i8, c2085q.size());
                Object obj = c2085q.get(i8);
                this.f1959e = i8;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1958d) {
            case 0:
                return this.f1959e - this.f1960f;
            case BuildConfig.VERSION_CODE /* 1 */:
                return this.f1959e;
            case 2:
                return this.f1959e;
            default:
                return this.f1959e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1958d) {
            case 0:
                C2404A c2404a = ((C0613q) this.f1962h).f1966d;
                int i5 = this.f1959e - 1;
                this.f1959e = i5;
                Object objM4248f = c2404a.m4248f(i5);
                AbstractC1665j.m2983c(objM4248f, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC2206o) objM4248f;
            case BuildConfig.VERSION_CODE /* 1 */:
                m1052a();
                int i6 = this.f1959e;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f1959e = i7;
                this.f1960f = i7;
                C0998a c0998a = (C0998a) this.f1962h;
                return c0998a.f3082d[c0998a.f3083e + i7];
            case 2:
                m1053b();
                int i8 = this.f1959e;
                if (i8 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i8 - 1;
                this.f1959e = i9;
                this.f1960f = i9;
                return ((C0999b) this.f1962h).f3088d[i9];
            default:
                m1054c();
                int i10 = this.f1959e;
                C2085q c2085q = (C2085q) this.f1962h;
                AbstractC2086r.m3850a(i10, c2085q.size());
                int i11 = this.f1959e;
                this.f1960f = i11;
                this.f1959e--;
                return c2085q.get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i5;
        switch (this.f1958d) {
            case 0:
                i5 = this.f1959e - this.f1960f;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                i5 = this.f1959e;
                break;
            case 2:
                i5 = this.f1959e;
                break;
            default:
                return this.f1959e;
        }
        return i5 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f1958d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case BuildConfig.VERSION_CODE /* 1 */:
                C0998a c0998a = (C0998a) this.f1962h;
                m1052a();
                int i5 = this.f1960f;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0998a.mo1977b(i5);
                this.f1959e = this.f1960f;
                this.f1960f = -1;
                this.f1961g = ((AbstractList) c0998a).modCount;
                return;
            case 2:
                C0999b c0999b = (C0999b) this.f1962h;
                m1053b();
                int i6 = this.f1960f;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0999b.mo1977b(i6);
                this.f1959e = this.f1960f;
                this.f1960f = -1;
                this.f1961g = ((AbstractList) c0999b).modCount;
                return;
            default:
                m1054c();
                C2085q c2085q = (C2085q) this.f1962h;
                c2085q.remove(this.f1960f);
                this.f1959e--;
                this.f1960f = -1;
                this.f1961g = AbstractC2086r.m3855g(c2085q);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1958d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case BuildConfig.VERSION_CODE /* 1 */:
                m1052a();
                int i5 = this.f1960f;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0998a) this.f1962h).set(i5, obj);
                return;
            case 2:
                m1053b();
                int i6 = this.f1960f;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0999b) this.f1962h).set(i6, obj);
                return;
            default:
                C2085q c2085q = (C2085q) this.f1962h;
                m1054c();
                int i7 = this.f1960f;
                if (i7 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                c2085q.set(i7, obj);
                this.f1961g = AbstractC2086r.m3855g(c2085q);
                return;
        }
    }

    public C0609o(C0999b c0999b, int i5) {
        this.f1958d = 2;
        this.f1962h = c0999b;
        this.f1959e = i5;
        this.f1960f = -1;
        this.f1961g = ((AbstractList) c0999b).modCount;
    }

    public C0609o(C2085q c2085q, int i5) {
        this.f1958d = 3;
        this.f1962h = c2085q;
        this.f1959e = i5 - 1;
        this.f1960f = -1;
        this.f1961g = AbstractC2086r.m3855g(c2085q);
    }

    public C0609o(C0613q c0613q, int i5, int i6, int i7) {
        this.f1958d = 0;
        this.f1962h = c0613q;
        this.f1959e = i5;
        this.f1960f = i6;
        this.f1961g = i7;
    }

    public C0609o(C0998a c0998a, int i5) {
        this.f1958d = 1;
        this.f1962h = c0998a;
        this.f1959e = i5;
        this.f1960f = -1;
        this.f1961g = ((AbstractList) c0998a).modCount;
    }
}
