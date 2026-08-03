package ng;

import bsh.C0353j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p077f8.AbstractC1089i;
import p114hg.InterfaceC1711a;
import p276sf.C3967n;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: ng.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3013k extends AbstractC3014l implements Iterator, InterfaceC5557c, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public int f9808g;

    /* JADX INFO: renamed from: h */
    public Object f9809h;

    /* JADX INFO: renamed from: i */
    public Iterator f9810i;

    /* JADX INFO: renamed from: j */
    public InterfaceC5557c f9811j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.AbstractC3014l
    /* JADX INFO: renamed from: a */
    public final void mo6406a(Object obj, InterfaceC5557c interfaceC5557c) {
        this.f9809h = obj;
        this.f9808g = 3;
        this.f9811j = interfaceC5557c;
        interfaceC5557c.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final RuntimeException m6407c() {
        int i9 = this.f9808g;
        if (i9 == 4) {
            return new NoSuchElementException();
        }
        if (i9 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f9808g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return C5562h.f22661g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i9 = this.f9808g;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        return true;
                    }
                    if (i9 == 4) {
                        return false;
                    }
                    throw m6407c();
                }
                Iterator it = this.f9810i;
                it.getClass();
                if (it.hasNext()) {
                    this.f9808g = 2;
                    return true;
                }
                this.f9810i = null;
            }
            this.f9808g = 5;
            InterfaceC5557c interfaceC5557c = this.f9811j;
            interfaceC5557c.getClass();
            this.f9811j = null;
            interfaceC5557c.resumeWith(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f9808g;
        if (i9 == 0 || i9 == 1) {
            if (hasNext()) {
                return next();
            }
            C0353j.m1307e();
            return null;
        }
        if (i9 == 2) {
            this.f9808g = 1;
            Iterator it = this.f9810i;
            it.getClass();
            return it.next();
        }
        if (i9 != 3) {
            throw m6407c();
        }
        this.f9808g = 0;
        Object obj = this.f9809h;
        this.f9809h = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        AbstractC1089i.m2732I0(obj);
        this.f9808g = 4;
    }
}
