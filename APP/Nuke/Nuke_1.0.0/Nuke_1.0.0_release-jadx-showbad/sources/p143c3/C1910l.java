package p143c3;

import java.util.Iterator;
import p112W2.InterfaceC1601c;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: c3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1910l implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final Iterator f6480d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1904f f6481e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1910l(C1904f c1904f) {
        this.f6481e = c1904f;
        this.f6480d = ((InterfaceC1905g) c1904f.f6474b).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6480d.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        return ((InterfaceC1601c) this.f6481e.f6475c).mo1h(this.f6480d.next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
