package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0811 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f2312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f2313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1242 f2314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2315;

    public /* synthetic */ C0811(InterfaceC2129 interfaceC2129, C1242 c1242, int i, int i2) {
        this.f2315 = i2;
        this.f2313 = interfaceC2129;
        this.f2314 = c1242;
        this.f2312 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2315;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f2312;
        C1242 c1242 = this.f2314;
        InterfaceC2129 interfaceC2129 = this.f2313;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0808.m1633(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
            case 1:
                AbstractC0808.m1632(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
            case 2:
                AbstractC0802.m1627(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
            case 3:
                AbstractC0808.m1634(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
            default:
                AbstractC0808.m1635(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
        }
        return c5176;
    }
}
