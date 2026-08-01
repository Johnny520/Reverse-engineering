package androidx.compose.foundation.gestures;

import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0495 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0517 f1474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1475;

    public /* synthetic */ C0495(C0517 c0517, int i) {
        this.f1475 = i;
        this.f1474 = c0517;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f1475;
        C0517 c0517 = this.f1474;
        switch (i) {
            case 0:
                return Boolean.valueOf(c0517.f6278);
            default:
                C1452 c1452 = c0517.f1520;
                if (!c1452.f6291.f6278) {
                    return null;
                }
                FocusStateImpl focusStateImplM2587 = c1452.m2587();
                if (!focusStateImplM2587.getHasFocus()) {
                    return null;
                }
                if (focusStateImplM2587.isFocused()) {
                    return c1452.m2585(null);
                }
                C1452 c1452M2633 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(c1452)).getFocusOwner()).m2633();
                if (c1452M2633 != null) {
                    return c1452M2633.m2585(AbstractC1785.m3339(c1452));
                }
                return null;
        }
    }
}
