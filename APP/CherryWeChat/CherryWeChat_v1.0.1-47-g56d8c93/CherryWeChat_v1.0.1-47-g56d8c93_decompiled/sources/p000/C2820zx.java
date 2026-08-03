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
        int i = this.f9538a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f9538a);
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return C0366If.f1247a;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object obj) throws Throwable {
        AbstractC0628Oj.m1232T(obj);
        this.f9538a = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f9538a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m5454a();
                }
                if (this.f9540c.hasNext()) {
                    this.f9538a = 2;
                    return true;
                }
                this.f9540c = null;
            }
            this.f9538a = 5;
            InterfaceC0190Eb interfaceC0190Eb = this.f9541d;
            this.f9541d = null;
            interfaceC0190Eb.mo264f(C0829TC.f2620a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9538a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f9538a = 1;
            return this.f9540c.next();
        }
        if (i != 3) {
            throw m5454a();
        }
        this.f9538a = 0;
        Object obj = this.f9539b;
        this.f9539b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
