package p143c3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p056K2.C0891q;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: c3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1906h implements Iterator, InterfaceC1046d, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public int f6476d;

    /* JADX INFO: renamed from: e */
    public Object f6477e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1046d f6478f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final RuntimeException m3390a() {
        int i5 = this.f6476d;
        if (i5 == 4) {
            return new NoSuchElementException();
        }
        if (i5 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f6476d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3391b(InterfaceC1046d interfaceC1046d, Object obj) {
        this.f6477e = obj;
        this.f6476d = 3;
        this.f6478f = interfaceC1046d;
        AbstractC1665j.m2985e(interfaceC1046d, "frame");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return C1052j.f3286d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        while (true) {
            i5 = this.f6476d;
            if (i5 != 0) {
                break;
            }
            this.f6476d = 5;
            InterfaceC1046d interfaceC1046d = this.f6478f;
            AbstractC1665j.m2982b(interfaceC1046d);
            this.f6478f = null;
            interfaceC1046d.mo278i(C0891q.f2780a);
        }
        if (i5 == 1) {
            AbstractC1665j.m2982b(null);
            throw null;
        }
        if (i5 == 2 || i5 == 3) {
            return true;
        }
        if (i5 == 4) {
            return false;
        }
        throw m3390a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        AbstractC1784a.m3205S(obj);
        this.f6476d = 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f6476d;
        if (i5 == 0 || i5 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i5 == 2) {
            this.f6476d = 1;
            AbstractC1665j.m2982b(null);
            throw null;
        }
        if (i5 != 3) {
            throw m3390a();
        }
        this.f6476d = 0;
        Object obj = this.f6477e;
        this.f6477e = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
