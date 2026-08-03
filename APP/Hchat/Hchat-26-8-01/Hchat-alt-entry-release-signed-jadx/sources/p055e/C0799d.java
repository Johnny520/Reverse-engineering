package p055e;

import java.util.Iterator;

/* JADX INFO: renamed from: e.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0799d extends AbstractC0800e implements Iterator {

    /* JADX INFO: renamed from: g */
    public C0798c f2395g;

    /* JADX INFO: renamed from: h */
    public boolean f2396h = true;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0796a f2397i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0799d(C0796a c0796a) {
        this.f2397i = c0796a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p055e.AbstractC0800e
    /* JADX INFO: renamed from: a */
    public final void mo2031a(C0798c c0798c) {
        C0798c c0798c2 = this.f2395g;
        if (c0798c == c0798c2) {
            C0798c c0798c3 = c0798c2.f2394j;
            this.f2395g = c0798c3;
            this.f2396h = c0798c3 == null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2396h) {
            return this.f2397i.f2383g != null;
        }
        C0798c c0798c = this.f2395g;
        return (c0798c == null || c0798c.f2393i == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2396h) {
            this.f2396h = false;
            this.f2395g = this.f2397i.f2383g;
        } else {
            C0798c c0798c = this.f2395g;
            this.f2395g = c0798c != null ? c0798c.f2393i : null;
        }
        return this.f2395g;
    }
}
