package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C1781;
import androidx.compose.p001ui.autofill.C2242;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.node.AbstractC2592;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.platform.C2736;
import androidx.compose.p001ui.platform.InterfaceC2706;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import kotlin.C6008;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1718 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1708 f2820;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2821;

    public /* synthetic */ C1718(C1708 c1708, int i) {
        this.f2821 = i;
        this.f2820 = c1708;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        C2242 c2242;
        C2242 c22422;
        int i = this.f2821;
        C6008 c6008 = C6008.f15084;
        C1708 c1708 = this.f2820;
        switch (i) {
            case 0:
                C2583 c2583M3906 = AbstractC2620.m3906(c1708);
                if (!c2583M3906.f5456 && (c2242 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583M3906)).f5832) != null) {
                    c2242.m3101(c2583M3906);
                }
                return c6008;
            case 1:
                c1708.f2795.m2334(true);
                break;
            case 2:
                c1708.f2795.m2331(true);
                break;
            case 3:
                c1708.f2795.m2335();
                break;
            case 4:
                C2583 c2583M39062 = AbstractC2620.m3906(c1708);
                if (!c2583M39062.f5456 && (c22422 = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583M39062)).f5832) != null) {
                    c22422.m3101(c2583M39062);
                }
                return c6008;
            case 5:
                c1708.f2795.m2324();
                break;
            case 6:
                c1708.f2799.f3018.f3149.f3025.m2430(c1708.f2794.f6315);
                break;
            default:
                C1781 c1781 = c1708.f2799;
                C2303 c2303 = c1708.f2796;
                if (c1781.m2427()) {
                    InterfaceC2706 interfaceC2706 = c1781.f3013;
                    if (interfaceC2706 != null) {
                        ((C2736) interfaceC2706).m4155();
                    }
                } else {
                    C2303.m3192(c2303);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
