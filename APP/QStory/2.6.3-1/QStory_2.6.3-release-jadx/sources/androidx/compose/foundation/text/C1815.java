package androidx.compose.foundation.text;

import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2862;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1815 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1781 f3149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3150;

    public /* synthetic */ C1815(C1781 c1781, int i) {
        this.f3150 = i;
        this.f3149 = c1781;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f3150;
        C6008 c6008 = C6008.f15084;
        C1781 c1781 = this.f3149;
        switch (i) {
            case 0:
                InterfaceC2530 interfaceC2530 = (InterfaceC2530) obj;
                C1801 c1801M2425 = c1781.m2425();
                if (c1801M2425 != null) {
                    c1801M2425.f3088 = interfaceC2530;
                }
                return c6008;
            case 1:
                InterfaceC2230 interfaceC2230 = c1781.f3016;
                C2847 c2847 = (C2847) obj;
                String str = c2847.f6292.f6474;
                C2902 c2902 = c1781.f3033;
                if (!AbstractC5227.m9466(str, c2902 != null ? c2902.f6474 : null)) {
                    ((AbstractC2182) c1781.f3030).setValue(HandleState.None);
                    if (((Boolean) ((AbstractC2182) interfaceC2230).getValue()).booleanValue()) {
                        ((AbstractC2182) interfaceC2230).setValue(Boolean.FALSE);
                    } else {
                        ((AbstractC2182) c1781.f3017).setValue(Boolean.FALSE);
                    }
                }
                long j = C2869.f6348;
                c1781.m2423(j);
                c1781.m2424(j);
                c1781.f3020.invoke(c2847);
                C2224 c2224 = c1781.f3014;
                C2198 c2198 = c2224.f4382;
                if (c2198 != null) {
                    c2198.m3020(c2224, null);
                }
                return c6008;
            case 2:
                c1781.f3025.m2430(((C2862) obj).f6323);
                return c6008;
            case 3:
                return Boolean.valueOf(c1781.f3025.m2430(((C2862) obj).f6323));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((AbstractC2182) c1781.f3024).setValue(bool);
                return c6008;
        }
    }
}
