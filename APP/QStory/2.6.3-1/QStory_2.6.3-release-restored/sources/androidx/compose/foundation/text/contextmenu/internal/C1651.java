package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1651 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f2657;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2962 f2658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2077 f2659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2660;

    public /* synthetic */ C1651(InterfaceC2962 interfaceC2962, C2077 c2077, int i, int i2) {
        this.f2660 = i2;
        this.f2658 = interfaceC2962;
        this.f2659 = c2077;
        this.f2657 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2660;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f2657;
        C2077 c2077 = this.f2659;
        InterfaceC2962 interfaceC2962 = this.f2658;
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1648.m2193(interfaceC2962, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
            case 1:
                AbstractC1648.m2192(interfaceC2962, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
            case 2:
                AbstractC1642.m2187(interfaceC2962, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
            case 3:
                AbstractC1648.m2194(interfaceC2962, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
            default:
                AbstractC1648.m2195(interfaceC2962, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
        }
        return c6008;
    }
}
