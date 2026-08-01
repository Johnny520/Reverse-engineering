package p244u;

import p041H0.EnumC0556D0;
import p041H0.InterfaceC0558E0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: u.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3236E implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10025d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3239H f10026e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3236E(C3239H c3239h, int i5) {
        this.f10025d = i5;
        this.f10026e = c3239h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        InterfaceC0558E0 interfaceC0558E0 = (InterfaceC0558E0) obj;
        switch (this.f10025d) {
            case 0:
                AbstractC1665j.m2983c(interfaceC0558E0, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                C3239H c3239h = (C3239H) interfaceC0558E0;
                InterfaceC3276j0 interfaceC3276j0 = this.f10026e.f10033s;
                if (!AbstractC1665j.m2981a(c3239h.f10032r, interfaceC3276j0)) {
                    c3239h.f10032r = interfaceC3276j0;
                    c3239h.m5498J0();
                }
                return EnumC0556D0.f1669e;
            default:
                AbstractC1665j.m2983c(interfaceC0558E0, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.f10026e.f10032r = ((C3239H) interfaceC0558E0).f10033s;
                return Boolean.FALSE;
        }
    }
}
