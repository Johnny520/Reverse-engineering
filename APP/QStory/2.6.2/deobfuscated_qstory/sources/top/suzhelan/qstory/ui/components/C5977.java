package top.suzhelan.qstory.ui.components;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import java.util.List;
import kotlin.C5175;
import kotlin.InterfaceC5167;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p354.C8887;
import p354.C8890;
import p354.InterfaceC8886;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5977 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f16242;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f16243;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5167 f16244;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f16245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8886 f16246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f16247;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f16248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16249;

    public /* synthetic */ C5977(InterfaceC8886 interfaceC8886, List list, int i, boolean z, InterfaceC2129 interfaceC2129, InterfaceC5167 interfaceC5167, int i2, int i3) {
        this.f16249 = i3;
        this.f16246 = interfaceC8886;
        this.f16247 = list;
        this.f16248 = i;
        this.f16243 = z;
        this.f16242 = interfaceC2129;
        this.f16244 = interfaceC5167;
        this.f16245 = i2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16249;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f16245;
        InterfaceC5167 interfaceC5167 = this.f16244;
        InterfaceC8886 interfaceC8886 = this.f16246;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(i2 | 1);
                AbstractC5963.m11285((C8890) interfaceC8886, this.f16247, this.f16248, this.f16243, this.f16242, (InterfaceC6542) interfaceC5167, (InterfaceC1373) obj, iM2460);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(i2 | 1);
                AbstractC5963.m11290((C8887) interfaceC8886, this.f16247, this.f16248, this.f16243, this.f16242, (InterfaceC6553) interfaceC5167, (InterfaceC1373) obj, iM24602);
                break;
        }
        return c5175;
    }
}
