package androidx.compose.foundation.text;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2028;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0977 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0943 f2804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2805;

    public /* synthetic */ C0977(C0943 c0943, int i) {
        this.f2805 = i;
        this.f2804 = c0943;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2805;
        C5176 c5176 = C5176.f14739;
        C0943 c0943 = this.f2804;
        switch (i) {
            case 0:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) obj;
                C0963 c0963M1865 = c0943.m1865();
                if (c0963M1865 != null) {
                    c0963M1865.f2743 = interfaceC1695;
                }
                return c5176;
            case 1:
                InterfaceC1395 interfaceC1395 = c0943.f2671;
                C2013 c2013 = (C2013) obj;
                String str = c2013.f5947.f6129;
                C2068 c2068 = c0943.f2688;
                if (!AbstractC4395.m8907(str, c2068 != null ? c2068.f6129 : null)) {
                    ((AbstractC1347) c0943.f2685).setValue(HandleState.None);
                    if (((Boolean) ((AbstractC1347) interfaceC1395).getValue()).booleanValue()) {
                        ((AbstractC1347) interfaceC1395).setValue(Boolean.FALSE);
                    } else {
                        ((AbstractC1347) c0943.f2672).setValue(Boolean.FALSE);
                    }
                }
                long j = C2035.f6003;
                c0943.m1863(j);
                c0943.m1864(j);
                c0943.f2675.invoke(c2013);
                C1389 c1389 = c0943.f2669;
                C1363 c1363 = c1389.f4037;
                if (c1363 != null) {
                    c1363.m2460(c1389, null);
                }
                return c5176;
            case 2:
                c0943.f2680.m1870(((C2028) obj).f5978);
                return c5176;
            case 3:
                return Boolean.valueOf(c0943.f2680.m1870(((C2028) obj).f5978));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((AbstractC1347) c0943.f2679).setValue(bool);
                return c5176;
        }
    }
}
