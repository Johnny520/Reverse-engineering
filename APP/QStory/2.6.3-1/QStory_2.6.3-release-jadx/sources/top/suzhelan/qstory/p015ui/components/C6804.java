package top.suzhelan.qstory.p015ui.components;

import androidx.compose.foundation.lazy.C1586;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import java.util.List;
import kotlin.C6008;
import kotlin.reflect.jvm.internal.C5860;
import p025.C7003;
import p068.InterfaceC7372;
import p068.InterfaceC7381;
import p068.InterfaceC7387;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6804 implements InterfaceC7381 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f16551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ List f16552;

    public C6804(List list, InterfaceC7387 interfaceC7387) {
        this.f16552 = list;
        this.f16551 = interfaceC7387;
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C1586 c1586 = (C1586) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC9234.m14531(3029);
        if ((iIntValue2 & 6) == 0) {
            i = (((C2159) interfaceC2208).m2920(c1586) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((C2159) interfaceC2208).m2922(iIntValue) ? 32 : 16;
        }
        C2159 c2159 = (C2159) interfaceC2208;
        if (c2159.m2903(i & 1, (i & 147) != 146)) {
            C7003 c7003 = (C7003) this.f16552.get(iIntValue);
            c2159.m2952(1642834882);
            AbstractC9234.m14531(3031);
            AbstractC9234.m14531(3032);
            InterfaceC7387 interfaceC7387 = this.f16551;
            boolean zM2920 = c2159.m2920(interfaceC7387) | c2159.m2938(c7003);
            Object objM2905 = c2159.m2905();
            if (zM2920 || objM2905 == C2204.f4319) {
                objM2905 = new C5860(interfaceC7387, 15, c7003);
                c2159.m2946(objM2905);
            }
            AbstractC6799.m11906(c7003, (InterfaceC7372) objM2905, c2159, 0);
            c2159.m2937(false);
        } else {
            c2159.m2899();
        }
        return C6008.f15084;
    }
}
