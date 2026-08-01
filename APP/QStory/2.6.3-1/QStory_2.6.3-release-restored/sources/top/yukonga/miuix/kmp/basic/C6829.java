package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.InterfaceC1449;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6829 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1449 f16709;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2077 f16710;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16711;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16712;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ int f16713;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16714;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f16715;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16717;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16718;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16719 = 0;

    public /* synthetic */ C6829(InterfaceC7383 interfaceC7383, InterfaceC7383 interfaceC73832, InterfaceC7383 interfaceC73833, InterfaceC7383 interfaceC73834, int i, InterfaceC7383 interfaceC73835, int i2, InterfaceC7383 interfaceC73836, InterfaceC1449 interfaceC1449, C2077 c2077, int i3) {
        this.f16717 = interfaceC7383;
        this.f16718 = interfaceC73832;
        this.f16712 = interfaceC73833;
        this.f16711 = interfaceC73834;
        this.f16715 = i;
        this.f16716 = interfaceC73835;
        this.f16713 = i2;
        this.f16714 = interfaceC73836;
        this.f16709 = interfaceC1449;
        this.f16710 = c2077;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16719;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6862.m11943(this.f16717, this.f16718, this.f16712, this.f16711, this.f16715, this.f16716, this.f16713, this.f16714, this.f16709, this.f16710, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                break;
            default:
                C6855 c6855 = (C6855) this.f16709;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(1 & iIntValue, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    AbstractC6862.m11943(this.f16717, this.f16718, this.f16712, this.f16711, this.f16715, this.f16716, this.f16713, this.f16714, c6855, this.f16710, c2159, 0);
                }
                break;
        }
        return c6008;
    }

    public /* synthetic */ C6829(InterfaceC7383 interfaceC7383, InterfaceC7383 interfaceC73832, InterfaceC7383 interfaceC73833, InterfaceC7383 interfaceC73834, int i, InterfaceC7383 interfaceC73835, int i2, InterfaceC7383 interfaceC73836, C6855 c6855, C2077 c2077) {
        this.f16717 = interfaceC7383;
        this.f16718 = interfaceC73832;
        this.f16712 = interfaceC73833;
        this.f16711 = interfaceC73834;
        this.f16715 = i;
        this.f16716 = interfaceC73835;
        this.f16713 = i2;
        this.f16714 = interfaceC73836;
        this.f16709 = c6855;
        this.f16710 = c2077;
    }
}
