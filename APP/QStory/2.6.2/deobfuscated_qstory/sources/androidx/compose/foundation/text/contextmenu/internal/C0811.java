package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0811 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f2311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f2312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1242 f2313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2314;

    public /* synthetic */ C0811(InterfaceC2129 interfaceC2129, C1242 c1242, int i, int i2) {
        this.f2314 = i2;
        this.f2312 = interfaceC2129;
        this.f2313 = c1242;
        this.f2311 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2314;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f2311;
        C1242 c1242 = this.f2313;
        InterfaceC2129 interfaceC2129 = this.f2312;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0808.m1623(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2460(i2 | 1));
                break;
            case 1:
                AbstractC0808.m1622(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2460(i2 | 1));
                break;
            case 2:
                AbstractC0802.m1617(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2460(i2 | 1));
                break;
            case 3:
                AbstractC0808.m1624(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2460(i2 | 1));
                break;
            default:
                AbstractC0808.m1625(interfaceC2129, c1242, interfaceC1373, AbstractC1367.m2460(i2 | 1));
                break;
        }
        return c5175;
    }
}
