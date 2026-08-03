package p159l0;

import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p338x0.InterfaceC5573c;

/* JADX INFO: renamed from: l0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2431m implements InterfaceC5573c, Iterable, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final C2426h f7992g;

    /* JADX INFO: renamed from: h */
    public final int f7993h;

    /* JADX INFO: renamed from: i */
    public final C2424f f7994i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2431m(C2426h c2426h, int i9, AbstractC2421c abstractC2421c, C2424f c2424f) {
        this.f7992g = c2426h;
        this.f7993h = i9;
        this.f7994i = c2424f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2431m)) {
            return false;
        }
        C2431m c2431m = (C2431m) obj;
        return c2431m.f7993h == this.f7993h && c2431m.f7992g.equals(this.f7992g) && c2431m.f7994i.equals(this.f7994i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7994i.hashCode() + ((this.f7992g.hashCode() + (this.f7993h * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2430l(this.f7992g, this.f7993h, null, this.f7994i);
    }
}
