package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛸᛲᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1728 implements Iterator, InterfaceC0274, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Iterator f8728;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f8729;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public InterfaceC0274 f8730;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f8731;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f8729;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m3458();
                }
                if (this.f8728.hasNext()) {
                    this.f8729 = 2;
                    return true;
                }
                this.f8728 = null;
            }
            this.f8729 = 5;
            InterfaceC0274 interfaceC0274 = this.f8730;
            this.f8730 = null;
            interfaceC0274.mo812(C2746.f13459);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8729;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f8729 = 1;
            return this.f8728.next();
        }
        if (i != 3) {
            throw m3458();
        }
        this.f8729 = 0;
        Object obj = this.f8731;
        this.f8731 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo812(Object obj) throws Throwable {
        AbstractC1544.m3189(obj);
        this.f8729 = 4;
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2213 mo733() {
        return C2586.f12764;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final RuntimeException m3458() {
        int i = this.f8729;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8729);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3459(Object obj, AbstractC0171 abstractC0171) {
        this.f8731 = obj;
        this.f8729 = 3;
        this.f8730 = abstractC0171;
    }
}
