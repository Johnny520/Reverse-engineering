package p236q1;

import android.view.KeyEvent;
import p085fg.InterfaceC1231l;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: q1.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3426f extends AbstractC5852n implements InterfaceC3425e {

    /* JADX INFO: renamed from: u */
    public InterfaceC1231l f11094u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1231l f11095v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: C */
    public final boolean mo5389C(KeyEvent keyEvent) {
        InterfaceC1231l interfaceC1231l = this.f11095v;
        if (interfaceC1231l != null) {
            return ((Boolean) interfaceC1231l.invoke(new C3422b(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: W */
    public final boolean mo5390W(KeyEvent keyEvent) {
        InterfaceC1231l interfaceC1231l = this.f11094u;
        if (interfaceC1231l != null) {
            return ((Boolean) interfaceC1231l.invoke(new C3422b(keyEvent))).booleanValue();
        }
        return false;
    }
}
