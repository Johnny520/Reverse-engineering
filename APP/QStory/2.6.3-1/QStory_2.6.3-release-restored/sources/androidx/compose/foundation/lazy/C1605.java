package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.InterfaceC1500;
import androidx.compose.foundation.lazy.layout.C1561;
import androidx.compose.foundation.text.AbstractC1806;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;
import top.yukonga.miuix.kmp.extra.AbstractC6872;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1605 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2579;

    public /* synthetic */ C1605(InterfaceC2962 interfaceC2962, int i, int i2) {
        this.f2579 = 1;
        this.f2578 = interfaceC2962;
        this.f2577 = i2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2579;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f2577;
        Object obj3 = this.f2578;
        switch (i) {
            case 0:
                C1603 c1603 = (C1603) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    C1561 c1561M2036 = c1603.f2573.f2569.m2036(i2);
                    ((C2077) c1561M2036.f2372.f663).invoke(c1603.f2572, Integer.valueOf(i2 - c1561M2036.f2374), c2159, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1806.m2444((InterfaceC2962) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC6872.m11963((InterfaceC1500) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(i2 | 1));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1605(Object obj, int i, int i2) {
        this.f2579 = i2;
        this.f2578 = obj;
        this.f2577 = i;
    }
}
