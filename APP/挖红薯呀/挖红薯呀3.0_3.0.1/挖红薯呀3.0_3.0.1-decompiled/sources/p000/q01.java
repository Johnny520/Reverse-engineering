package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 implements Iterator, InterfaceC0322ik, p40 {

    /* JADX INFO: renamed from: d */
    public int f5019d;

    /* JADX INFO: renamed from: e */
    public Object f5020e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0322ik f5021f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final RuntimeException m3183a() {
        int i = this.f5019d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5019d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3184b(InterfaceC0322ik interfaceC0322ik, Object obj) {
        this.f5020e = obj;
        this.f5019d = 3;
        this.f5021f = interfaceC0322ik;
        interfaceC0322ik.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return C0220fs.f1799d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f5019d;
            if (i != 0) {
                break;
            }
            this.f5019d = 5;
            InterfaceC0322ik interfaceC0322ik = this.f5021f;
            interfaceC0322ik.getClass();
            this.f5021f = null;
            interfaceC0322ik.mo541i(na1.f4229a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw m3183a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        w60.m4891M(obj);
        this.f5019d = 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5019d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            C0921xc.m5132m();
            return null;
        }
        if (i == 2) {
            this.f5019d = 1;
            throw null;
        }
        if (i != 3) {
            throw m3183a();
        }
        this.f5019d = 0;
        Object obj = this.f5020e;
        this.f5020e = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
