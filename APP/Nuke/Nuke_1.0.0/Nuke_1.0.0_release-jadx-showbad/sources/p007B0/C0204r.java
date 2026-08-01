package p007B0;

import p041H0.AbstractC0601k;
import p047I0.AbstractC0757q0;
import p047I0.C0677J;
import p047I0.C0760s;

/* JADX INFO: renamed from: B0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0204r extends AbstractC0194h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007B0.AbstractC0194h
    /* JADX INFO: renamed from: K0 */
    public final void mo263K0(InterfaceC0206t interfaceC0206t) {
        InterfaceC0207u interfaceC0207u = (InterfaceC0207u) AbstractC0601k.m1032h(this, AbstractC0757q0.f2371u);
        if (interfaceC0207u != null) {
            C0760s c0760s = (C0760s) interfaceC0207u;
            if (interfaceC0206t == null) {
                InterfaceC0206t.f707a.getClass();
                interfaceC0206t = AbstractC0208v.f708a;
            }
            C0677J.f2157a.m1175a(c0760s.f2379b, interfaceC0206t);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007B0.AbstractC0194h
    /* JADX INFO: renamed from: M0 */
    public final boolean mo264M0(int i5) {
        return (i5 == 3 || i5 == 4) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ Object mo146s() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
