package top.suzhelan.qstory.ui.components;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import java.util.List;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p350.C8856;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5982 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f16244;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f16245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16246;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f16247;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f16248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ boolean f16249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16250 = 1;

    public /* synthetic */ C5982(String str, InterfaceC2129 interfaceC2129, boolean z, InterfaceC6543 interfaceC6543, int i, int i2) {
        this.f16246 = str;
        this.f16248 = interfaceC2129;
        this.f16249 = z;
        this.f16247 = interfaceC6543;
        this.f16245 = i;
        this.f16244 = i2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16250;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f16247;
        Object obj4 = this.f16246;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(this.f16244 | 1);
                AbstractC5969.m11343((C8856) obj4, (List) obj3, this.f16245, this.f16249, this.f16248, (InterfaceC1373) obj, iM2471);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24712 = AbstractC1367.m2471(this.f16245 | 1);
                AbstractC5969.m11348((String) obj4, this.f16248, this.f16249, (InterfaceC6543) obj3, (InterfaceC1373) obj, iM24712, this.f16244);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C5982(C8856 c8856, List list, int i, boolean z, InterfaceC2129 interfaceC2129, int i2) {
        this.f16246 = c8856;
        this.f16247 = list;
        this.f16245 = i;
        this.f16249 = z;
        this.f16248 = interfaceC2129;
        this.f16244 = i2;
    }
}
