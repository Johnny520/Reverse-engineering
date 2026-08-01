package androidx.compose.foundation.gestures;

import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0495 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0517 f1475;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1476;

    public /* synthetic */ C0495(C0517 c0517, int i) {
        this.f1476 = i;
        this.f1475 = c0517;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f1476;
        C0517 c0517 = this.f1475;
        switch (i) {
            case 0:
                return Boolean.valueOf(c0517.f6279);
            default:
                C1452 c1452 = c0517.f1521;
                if (!c1452.f6292.f6279) {
                    return null;
                }
                FocusStateImpl focusStateImplM2597 = c1452.m2597();
                if (!focusStateImplM2597.getHasFocus()) {
                    return null;
                }
                if (focusStateImplM2597.isFocused()) {
                    return c1452.m2595(null);
                }
                C1452 c1452M2643 = ((C1478) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c1452)).getFocusOwner()).m2643();
                if (c1452M2643 != null) {
                    return c1452M2643.m2595(AbstractC1785.m3349(c1452));
                }
                return null;
        }
    }
}
