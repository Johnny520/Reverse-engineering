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
import kotlin.C5176;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0880 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0870 f2475;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2476;

    public /* synthetic */ C0880(C0870 c0870, int i) {
        this.f2476 = i;
        this.f2475 = c0870;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        C1407 c1407;
        C1407 c14072;
        int i = this.f2476;
        C5176 c5176 = C5176.f14739;
        C0870 c0870 = this.f2475;
        switch (i) {
            case 0:
                C1748 c1748M3346 = AbstractC1785.m3346(c0870);
                if (!c1748M3346.f5111 && (c1407 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748M3346)).f5487) != null) {
                    c1407.m2541(c1748M3346);
                }
                return c5176;
            case 1:
                c0870.f2450.m1774(true);
                break;
            case 2:
                c0870.f2450.m1771(true);
                break;
            case 3:
                c0870.f2450.m1775();
                break;
            case 4:
                C1748 c1748M33462 = AbstractC1785.m3346(c0870);
                if (!c1748M33462.f5111 && (c14072 = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748M33462)).f5487) != null) {
                    c14072.m2541(c1748M33462);
                }
                return c5176;
            case 5:
                c0870.f2450.m1764();
                break;
            case 6:
                c0870.f2454.f2673.f2804.f2680.m1870(c0870.f2449.f5970);
                break;
            default:
                C0943 c0943 = c0870.f2454;
                C1468 c1468 = c0870.f2451;
                if (c0943.m1867()) {
                    InterfaceC1871 interfaceC1871 = c0943.f2668;
                    if (interfaceC1871 != null) {
                        ((C1901) interfaceC1871).m3595();
                    }
                } else {
                    C1468.m2632(c1468);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
