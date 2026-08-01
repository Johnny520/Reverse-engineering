package androidx.compose.p001ui.viewinterop;

import android.view.View;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.focus.AbstractC2316;
import androidx.compose.p001ui.focus.InterfaceC2304;
import androidx.compose.p001ui.focus.InterfaceC2311;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2915 extends AbstractC2961 implements InterfaceC2304 {
    @Override // androidx.compose.p001ui.focus.InterfaceC2304
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo3193(InterfaceC2311 interfaceC2311) {
        View viewM4378 = AbstractC2908.m4378(this);
        interfaceC2311.mo3194(this.f6637.f6624 && AbstractC2908.m4378(this).hasFocusable());
        View viewFindFocus = viewM4378.findFocus();
        if (viewFindFocus != null) {
            interfaceC2311.mo3197(AbstractC2316.m3213(viewFindFocus, viewM4378));
        }
    }
}
