package p166l7;

import p135j7.C2085a;
import p229p7.C3338h;

/* JADX INFO: renamed from: l7.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2523k extends AbstractC2513a {

    /* JADX INFO: renamed from: o */
    public final C2085a f8153o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2523k() {
        C3338h c3338h = new C3338h();
        super(c3338h, 1);
        C2085a c2085a = new C2085a(c3338h.f10741r, 1);
        this.f8153o = c2085a;
        m6539P(c2085a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
        ((C3338h) this.f8138m).f10741r.mo633k(this.f8153o.f9926k.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public final String toString() {
        return C2523k.class.getSimpleName() + ": count=" + this.f8153o.f9926k.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public final boolean mo5555y() {
        return this.f8153o.f9926k.size() == 0;
    }
}
