package p257r7;

import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: r7.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3722l implements InterfaceC3723m {

    /* JADX INFO: renamed from: g */
    public final AbstractC3712b f12092g;

    /* JADX INFO: renamed from: h */
    public final int f12093h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3722l(AbstractC3712b abstractC3712b, int i9) {
        this.f12092g = abstractC3712b;
        this.f12093h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3723m
    /* JADX INFO: renamed from: d */
    public final AbstractC2331a mo7733d(Class cls) {
        AbstractC3712b abstractC3712b = this.f12092g;
        return cls.isInstance(abstractC3712b) ? abstractC3712b : abstractC3712b.m5554v(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public final int get() {
        return AbstractC2331a.m5539s(this.f12092g.mo5552r(), this.f12093h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public final void mo633k(int i9) {
        AbstractC2331a.m5534D(this.f12092g.mo5552r(), this.f12093h, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return get() + ":" + this.f12092g;
    }
}
