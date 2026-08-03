package p011F0;

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
    public final /* synthetic */ int f408a;

    /* JADX INFO: renamed from: b */
    public int f409b;

    /* JADX INFO: renamed from: c */
    public int f410c;

    /* JADX INFO: renamed from: d */
    public int f411d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0176g f412e;

    public C0197a(C0199c r2, int r3) {
        this.f408a = 1;
        AbstractC0307g.m703e(r2, "list");
        this.f412e = r2;
        this.f409b = r3;
        this.f410c = -1;
        this.f411d = C0199c.m579c(r2);
    }

    /* JADX INFO: renamed from: a */
    public void m569a() {
        if (C0199c.m579c(((C0198b) this.f412e).f417e) != this.f411d) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object r3) {
        switch(this.f408a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m570b();
        int r02 = this.f409b;
        this.f409b = r02 + 1;
        C0199c r1 = (C0199c) this.f412e;
        r1.add(r02, r3);
        this.f410c = -1;
        this.f411d = C0199c.m579c(r1);
        return;
    L6:
        m569a();
        int r03 = this.f409b;
        this.f409b = r03 + 1;
        C0198b r12 = (C0198b) this.f412e;
        r12.add(r03, r3);
        this.f410c = -1;
        this.f411d = C0198b.m571c(r12);
    }

    /* JADX INFO: renamed from: b */
    public void m570b() {
        if (C0199c.m579c((C0199c) this.f412e) != this.f411d) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch(this.f408a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.f409b >= ((C0199c) this.f412e).f420b) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.f409b >= ((C0198b) this.f412e).f415c) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch(this.f408a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.f409b <= 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.f409b <= 0) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch(this.f408a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        m570b();
        int r02 = this.f409b;
        C0199c r1 = (C0199c) this.f412e;
        if (r02 >= r1.f420b) goto L9;
        this.f409b = r02 + 1;
        this.f410c = r02;
        return r1.f419a[r02];
    L9:
        throw new NoSuchElementException();
    L10:
        m569a();
        int r03 = this.f409b;
        C0198b r12 = (C0198b) this.f412e;
        if (r03 >= r12.f415c) goto L15;
        this.f409b = r03 + 1;
        this.f410c = r03;
        return r12.f413a[r12.f414b + r03];
    L15:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch(this.f408a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f409b;
    L7:
        return this.f409b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch(this.f408a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        m570b();
        int r02 = this.f409b;
        if (r02 <= 0) goto L9;
        int r03 = r02 - 1;
        this.f409b = r03;
        this.f410c = r03;
        return ((C0199c) this.f412e).f419a[r03];
    L9:
        throw new NoSuchElementException();
    L10:
        m569a();
        int r04 = this.f409b;
        if (r04 <= 0) goto L15;
        int r05 = r04 - 1;
        this.f409b = r05;
        this.f410c = r05;
        C0198b r1 = (C0198b) this.f412e;
        return r1.f413a[r1.f414b + r05];
    L15:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch(this.f408a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f409b - 1;
    L7:
        return this.f409b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch(this.f408a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        m570b();
        int r02 = this.f410c;
        if (r02 == (-1)) goto L9;
        C0199c r2 = (C0199c) this.f412e;
        r2.mo522b(r02);
        this.f409b = this.f410c;
        this.f410c = -1;
        this.f411d = C0199c.m579c(r2);
        return;
    L9:
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
    L10:
        m569a();
        int r03 = this.f410c;
        if (r03 == (-1)) goto L15;
        C0198b r22 = (C0198b) this.f412e;
        r22.mo522b(r03);
        this.f409b = this.f410c;
        this.f410c = -1;
        this.f411d = C0198b.m571c(r22);
        return;
    L15:
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
    }

    @Override // java.util.ListIterator
    public final void set(Object r3) {
        switch(this.f408a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        m570b();
        int r02 = this.f410c;
        if (r02 == (-1)) goto L9;
        ((C0199c) this.f412e).set(r02, r3);
        return;
    L9:
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
    L10:
        m569a();
        int r03 = this.f410c;
        if (r03 == (-1)) goto L15;
        ((C0198b) this.f412e).set(r03, r3);
        return;
    L15:
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
    }

    public C0197a(C0198b r2, int r3) {
        this.f408a = 0;
        AbstractC0307g.m703e(r2, "list");
        this.f412e = r2;
        this.f409b = r3;
        this.f410c = -1;
        this.f411d = C0198b.m571c(r2);
    }
}
