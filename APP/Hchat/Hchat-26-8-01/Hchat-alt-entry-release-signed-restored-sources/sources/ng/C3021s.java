package ng;

import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: ng.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3021s implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final Iterator f9820g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3022t f9821h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3021s(C3022t c3022t) {
        this.f9821h = c3022t;
        this.f9820g = c3022t.f9822a.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9820g.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f9821h.f9823b.invoke(this.f9820g.next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
