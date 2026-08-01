package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0980 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f2825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2826;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C1242 f2827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2828;

    public /* synthetic */ C0980(C0882 c0882, C1242 c1242, int i, int i2) {
        this.f2828 = i2;
        this.f2826 = c0882;
        this.f2827 = c1242;
        this.f2825 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2828;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f2825;
        C1242 c1242 = this.f2827;
        C0882 c0882 = this.f2826;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0983.m1893(c0882, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
            default:
                AbstractC0983.m1892(c0882, c1242, interfaceC1373, AbstractC1367.m2471(i2 | 1));
                break;
        }
        return c5176;
    }
}
