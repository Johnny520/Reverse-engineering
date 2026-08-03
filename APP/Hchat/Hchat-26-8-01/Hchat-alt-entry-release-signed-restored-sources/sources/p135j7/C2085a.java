package p135j7;

import p152k7.AbstractC2331a;
import p152k7.AbstractC2332b;
import p241q7.C3445b;
import p241q7.InterfaceC3444a;
import p257r7.C3716f;
import p314v7.C4495f0;
import p314v7.C4496g;

/* JADX INFO: renamed from: j7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2085a extends AbstractC2332b implements InterfaceC3444a {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f6990m;

    /* JADX INFO: renamed from: n */
    public final C3716f f6991n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2085a(C3716f c3716f, int i9) {
        this.f6990m = i9;
        switch (i9) {
            case 1:
                this.f6991n = c3716f;
                c3716f.f7660j = this;
                break;
            default:
                this.f6991n = c3716f;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2332b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        switch (this.f6990m) {
            case 0:
                mo5557c0(this.f6991n.f12083n);
                mo6529Y(c3445b);
                break;
            default:
                super.mo1893B(c3445b);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
        switch (this.f6990m) {
            case 0:
                this.f6991n.mo633k(this.f9926k.size());
                break;
            default:
                this.f6991n.mo633k(this.f9926k.size());
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p241q7.InterfaceC3444a
    /* JADX INFO: renamed from: m */
    public void mo1926m(AbstractC2331a abstractC2331a) {
        C3716f c3716f = this.f6991n;
        if (abstractC2331a == c3716f) {
            mo5557c0(c3716f.f12083n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        switch (this.f6990m) {
            case 0:
                return new C4496g();
            default:
                return new C4495f0(8, 0);
        }
    }
}
