package top.suzhelan.qstory.p015ui.components;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import java.util.List;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p366.C9685;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6812 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f16589;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f16590;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16591;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f16592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2962 f16593;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ boolean f16594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16595 = 1;

    public /* synthetic */ C6812(String str, InterfaceC2962 interfaceC2962, boolean z, InterfaceC7372 interfaceC7372, int i, int i2) {
        this.f16591 = str;
        this.f16593 = interfaceC2962;
        this.f16594 = z;
        this.f16592 = interfaceC7372;
        this.f16590 = i;
        this.f16589 = i2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16595;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f16592;
        Object obj4 = this.f16591;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(this.f16589 | 1);
                AbstractC6799.m11902((C9685) obj4, (List) obj3, this.f16590, this.f16594, this.f16593, (InterfaceC2208) obj, iM3031);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM30312 = AbstractC2202.m3031(this.f16590 | 1);
                AbstractC6799.m11907((String) obj4, this.f16593, this.f16594, (InterfaceC7372) obj3, (InterfaceC2208) obj, iM30312, this.f16589);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C6812(C9685 c9685, List list, int i, boolean z, InterfaceC2962 interfaceC2962, int i2) {
        this.f16591 = c9685;
        this.f16592 = list;
        this.f16590 = i;
        this.f16594 = z;
        this.f16593 = interfaceC2962;
        this.f16589 = i2;
    }
}
