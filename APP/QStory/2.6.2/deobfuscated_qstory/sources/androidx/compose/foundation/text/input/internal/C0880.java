package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C0943;
import androidx.compose.ui.autofill.C1407;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.node.AbstractC1757;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.platform.C1901;
import androidx.compose.ui.platform.InterfaceC1871;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlin.C5175;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0880 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0870 f2474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2475;

    public /* synthetic */ C0880(C0870 c0870, int i) {
        this.f2475 = i;
        this.f2474 = c0870;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        C1407 c1407;
        C1407 c14072;
        int i = this.f2475;
        C5175 c5175 = C5175.f14739;
        C0870 c0870 = this.f2474;
        switch (i) {
            case 0:
                C1748 c1748M3336 = AbstractC1785.m3336(c0870);
                if (!c1748M3336.f5110 && (c1407 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748M3336)).f5486) != null) {
                    c1407.m2531(c1748M3336);
                }
                return c5175;
            case 1:
                c0870.f2449.m1764(true);
                break;
            case 2:
                c0870.f2449.m1761(true);
                break;
            case 3:
                c0870.f2449.m1765();
                break;
            case 4:
                C1748 c1748M33362 = AbstractC1785.m3336(c0870);
                if (!c1748M33362.f5110 && (c14072 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748M33362)).f5486) != null) {
                    c14072.m2531(c1748M33362);
                }
                return c5175;
            case 5:
                c0870.f2449.m1754();
                break;
            case 6:
                c0870.f2453.f2672.f2803.f2679.m1860(c0870.f2448.f5969);
                break;
            default:
                C0943 c0943 = c0870.f2453;
                C1468 c1468 = c0870.f2450;
                if (c0943.m1857()) {
                    InterfaceC1871 interfaceC1871 = c0943.f2667;
                    if (interfaceC1871 != null) {
                        ((C1901) interfaceC1871).m3585();
                    }
                } else {
                    C1468.m2622(c1468);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
