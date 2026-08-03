package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: zx */
/* JADX INFO: loaded from: classes.dex */
public final class C2820zx implements Iterator, InterfaceC0190Eb, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f9538a;

    /* JADX INFO: renamed from: b */
    public Object f9539b;

    /* JADX INFO: renamed from: c */
    public Iterator f9540c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0190Eb f9541d;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m5454a() {
        int r0 = this.f9538a;
        if (r0 == 4) goto L11;
        if (r0 == 5) goto L9;
        return new IllegalStateException("Unexpected state of the iterator: " + this.f9538a);
    L9:
        return new IllegalStateException("Iterator has failed.");
    L11:
        return new NoSuchElementException();
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return C0366If.f1247a;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object r1) {
        AbstractC0628Oj.m1232T(r1);
        this.f9538a = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
    L2:
        int r0 = this.f9538a;
        if (r0 == 0) goto L21;
        if (r0 != 1) goto L6;
        if (this.f9540c.hasNext() == true) goto L18;
        this.f9540c = null;
        goto L21
    L18:
        this.f9538a = 2;
        return true;
    L6:
        if (r0 != 2) goto L8;
    L15:
        return true;
    L8:
        if (r0 == 3) goto L15;
        if (r0 != 4) goto L14;
        return false;
    L14:
        throw m5454a();
    L21:
        this.f9538a = 5;
        InterfaceC0190Eb r02 = this.f9541d;
        this.f9541d = null;
        r02.mo264f(C0829TC.f2620a);
        goto L2
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.f9538a;
        if (r0 == 0) goto L17;
        if (r0 == 1) goto L17;
        if (r0 != 2) goto L9;
        this.f9538a = 1;
        return this.f9540c.next();
    L9:
        if (r0 != 3) goto L13;
        this.f9538a = 0;
        Object r02 = this.f9539b;
        this.f9539b = null;
        return r02;
    L13:
        throw m5454a();
    L17:
        if (hasNext() == false) goto L21;
        return next();
    L21:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
