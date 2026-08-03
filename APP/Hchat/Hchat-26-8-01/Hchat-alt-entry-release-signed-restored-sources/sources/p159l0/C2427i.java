package p159l0;

import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p338x0.InterfaceC5573c;

/* JADX INFO: renamed from: l0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2427i implements InterfaceC5573c, Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C2426h f7960g;

    /* JADX INFO: renamed from: h */
    public final int f7961h;

    /* JADX INFO: renamed from: i */
    public final int f7962i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2427i(C2426h c2426h, int i9, int i10) {
        this.f7960g = c2426h;
        this.f7961h = i9;
        this.f7962i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2427i)) {
            return false;
        }
        C2427i c2427i = (C2427i) obj;
        return c2427i.f7961h == this.f7961h && c2427i.f7962i == this.f7962i && c2427i.f7960g.equals(this.f7960g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f7960g.hashCode() * 31) + this.f7961h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2426h c2426h = this.f7960g;
        if (c2426h.f7956n != this.f7962i) {
            AbstractC2428j.m5792f();
        }
        int i9 = this.f7961h;
        c2426h.m5786g(i9);
        return new C2422d(c2426h, i9 + 1, c2426h.f7949g[(i9 * 5) + 3] + i9);
    }
}
