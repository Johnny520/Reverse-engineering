package p209o7;

import p152k7.InterfaceC2336f;
import p241q7.C3445b;
import p257r7.AbstractC3721k;
import p257r7.C3716f;
import p257r7.InterfaceC3717g;

/* JADX INFO: renamed from: o7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3069c extends C3068b {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f9928m = 0;

    /* JADX INFO: renamed from: n */
    public final InterfaceC3717g f9929n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3069c(C3716f c3716f) {
        super(AbstractC3721k.f12089o);
        this.f9929n = c3716f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        switch (this.f9928m) {
            case 0:
                mo5557c0(this.f9929n.get());
                mo6529Y(c3445b);
                break;
            default:
                int i9 = this.f9929n.get();
                mo5557c0(i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    ((AbstractC3721k) m6524Q(i10)).m5545G(c3445b);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: R */
    public boolean mo6525R() {
        switch (this.f9928m) {
            case 1:
                return true;
            default:
                return super.mo6525R();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public void mo5141X() {
        switch (this.f9928m) {
            case 0:
                this.f9929n.mo633k(this.f9926k.size());
                m6528U();
                break;
            default:
                super.mo5141X();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: Z */
    public void mo6530Z() {
        switch (this.f9928m) {
            case 1:
                break;
            default:
                super.mo6530Z();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: c0 */
    public void mo5557c0(int i9) {
        switch (this.f9928m) {
            case 1:
                mo6520d0(i9, false);
                this.f9929n.mo633k(i9);
                break;
            default:
                super.mo5557c0(i9);
                break;
        }
    }

    public C3069c(InterfaceC2336f interfaceC2336f, InterfaceC3717g interfaceC3717g) {
        super(interfaceC2336f);
        this.f9929n = interfaceC3717g;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m6538j0() {
    }
}
