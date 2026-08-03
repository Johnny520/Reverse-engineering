package p047d7;

import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p182m7.AbstractC2789b;
import p182m7.AbstractC2804q;
import p209o7.C3068b;
import p241q7.C3445b;

/* JADX INFO: renamed from: d7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0719b extends C3068b {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f2155m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0719b(InterfaceC2336f interfaceC2336f, int i9) {
        super(interfaceC2336f);
        this.f2155m = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        switch (this.f2155m) {
            case 0:
                break;
            default:
                return;
        }
        while (c3445b.m7227b()) {
            C0728k c0728k = new C0728k();
            c0728k.m5545G(c3445b);
            mo6519M(c0728k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: W */
    public void mo1894W(AbstractC2331a abstractC2331a) {
        switch (this.f2155m) {
            case 1:
                mo1895j0((AbstractC2789b) abstractC2331a);
                break;
            case 2:
                ((AbstractC2804q) abstractC2331a).mo6190N();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public void mo1895j0(AbstractC2789b abstractC2789b) {
        abstractC2789b.mo6169Z();
    }
}
