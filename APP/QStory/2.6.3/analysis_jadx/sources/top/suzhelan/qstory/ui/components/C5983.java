package top.suzhelan.qstory.ui.components;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import java.util.List;
import kotlin.C5176;
import kotlin.InterfaceC5168;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p350.C8855;
import p350.C8858;
import p350.InterfaceC8854;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5983 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f16251;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f16252;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5168 f16253;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f16254;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8854 f16255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f16256;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f16257;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16258;

    public /* synthetic */ C5983(InterfaceC8854 interfaceC8854, List list, int i, boolean z, InterfaceC2129 interfaceC2129, InterfaceC5168 interfaceC5168, int i2, int i3) {
        this.f16258 = i3;
        this.f16255 = interfaceC8854;
        this.f16256 = list;
        this.f16257 = i;
        this.f16252 = z;
        this.f16251 = interfaceC2129;
        this.f16253 = interfaceC5168;
        this.f16254 = i2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16258;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f16254;
        InterfaceC5168 interfaceC5168 = this.f16253;
        InterfaceC8854 interfaceC8854 = this.f16255;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(i2 | 1);
                AbstractC5969.m11345((C8858) interfaceC8854, this.f16256, this.f16257, this.f16252, this.f16251, (InterfaceC6543) interfaceC5168, (InterfaceC1373) obj, iM2471);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24712 = AbstractC1367.m2471(i2 | 1);
                AbstractC5969.m11350((C8855) interfaceC8854, this.f16256, this.f16257, this.f16252, this.f16251, (InterfaceC6554) interfaceC5168, (InterfaceC1373) obj, iM24712);
                break;
        }
        return c5176;
    }
}
