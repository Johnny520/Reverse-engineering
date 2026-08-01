package p038T0;

import java.util.Iterator;
import p021K0.C0169h;
import p025M0.InterfaceC0204l;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: T0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0288m implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final Iterator f661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0169h f662b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0288m(C0169h c0169h) {
        this.f662b = c0169h;
        this.f661a = ((InterfaceC0283h) c0169h.f489b).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f661a.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        return ((InterfaceC0204l) this.f662b.f490c).mo8c(this.f661a.next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
