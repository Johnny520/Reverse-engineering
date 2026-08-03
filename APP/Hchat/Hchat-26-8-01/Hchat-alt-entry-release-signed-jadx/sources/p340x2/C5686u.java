package p340x2;

import android.view.View;
import p041d1.AbstractC0662h;
import p041d1.InterfaceC0672r;
import p041d1.InterfaceC0675u;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: x2.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5686u extends AbstractC5852n implements InterfaceC0675u {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0675u
    /* JADX INFO: renamed from: r0 */
    public final void mo1858r0(InterfaceC0672r interfaceC0672r) {
        View viewM10236c = AbstractC5674i.m10236c(this);
        interfaceC0672r.mo1855c(this.f23788g.f23801t && AbstractC5674i.m10236c(this).hasFocusable());
        View viewFindFocus = viewM10236c.findFocus();
        if (viewFindFocus != null) {
            interfaceC0672r.mo1856d(AbstractC0662h.m1837a(viewFindFocus, viewM10236c));
        }
    }
}
