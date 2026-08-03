package p182m7;

import java.util.HashSet;

/* JADX INFO: renamed from: m7.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2808u extends AbstractC2802o {

    /* JADX INFO: renamed from: q */
    public final HashSet f9074q;

    /* JADX INFO: renamed from: r */
    public final HashSet f9075r;

    /* JADX INFO: renamed from: s */
    public final C2800m f9076s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2808u(C2800m c2800m) {
        super(5, 0);
        this.f9076s = c2800m;
        this.f9074q = new HashSet();
        this.f9075r = new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        int i9 = this.f9036o.f12083n;
        C2800m c2800m = this.f9076s;
        c2800m.mo6170a0(i9);
        c2800m.mo6171b0(this.f9037p.f12083n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: R */
    public final void mo5906R() {
        mo6168Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: Z */
    public final void mo6169Z() {
        this.f9074q.clear();
        this.f9075r.clear();
        super.mo6169Z();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: a0 */
    public final void mo6170a0(int i9) {
        super.mo6170a0(i9);
        this.f9076s.mo6170a0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b
    /* JADX INFO: renamed from: b0 */
    public final void mo6171b0(int i9) {
        super.mo6171b0(i9);
        this.f9076s.mo6171b0(i9);
    }
}
