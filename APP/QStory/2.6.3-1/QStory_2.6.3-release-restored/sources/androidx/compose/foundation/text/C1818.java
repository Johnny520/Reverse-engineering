package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1818 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f3170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1720 f3171;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2077 f3172;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3173;

    public /* synthetic */ C1818(C1720 c1720, C2077 c2077, int i, int i2) {
        this.f3173 = i2;
        this.f3171 = c1720;
        this.f3172 = c2077;
        this.f3170 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3173;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f3170;
        C2077 c2077 = this.f3172;
        C1720 c1720 = this.f3171;
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1821.m2453(c1720, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
            default:
                AbstractC1821.m2452(c1720, c2077, interfaceC2208, AbstractC2202.m3031(i2 | 1));
                break;
        }
        return c6008;
    }
}
