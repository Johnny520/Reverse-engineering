package p159l0;

import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: l0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2422d implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C2426h f7925g;

    /* JADX INFO: renamed from: h */
    public final int f7926h;

    /* JADX INFO: renamed from: i */
    public int f7927i;

    /* JADX INFO: renamed from: j */
    public final int f7928j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2422d(C2426h c2426h, int i9, int i10) {
        this.f7925g = c2426h;
        this.f7926h = i10;
        this.f7927i = i9;
        this.f7928j = c2426h.f7956n;
        if (c2426h.f7955m) {
            AbstractC2428j.m5792f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7927i < this.f7926h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        C2426h c2426h = this.f7925g;
        int i9 = c2426h.f7956n;
        int i10 = this.f7928j;
        if (i9 != i10) {
            AbstractC2428j.m5792f();
        }
        int i11 = this.f7927i;
        this.f7927i = c2426h.f7949g[(i11 * 5) + 3] + i11;
        return new C2427i(c2426h, i11, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
