package top.suzhelan.qstory.ui.components;

import androidx.compose.foundation.lazy.C0745;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import java.util.List;
import kotlin.C5176;
import kotlin.reflect.jvm.internal.C5028;
import p009.C6174;
import p052.InterfaceC6543;
import p052.InterfaceC6552;
import p052.InterfaceC6558;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5974 implements InterfaceC6552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f16206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ List f16207;

    public C5974(List list, InterfaceC6558 interfaceC6558) {
        this.f16207 = list;
        this.f16206 = interfaceC6558;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C0745 c0745 = (C0745) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC8405.m13972(3029);
        if ((iIntValue2 & 6) == 0) {
            i = (((C1324) interfaceC1373).m2360(c0745) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((C1324) interfaceC1373).m2362(iIntValue) ? 32 : 16;
        }
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2343(i & 1, (i & 147) != 146)) {
            C6174 c6174 = (C6174) this.f16207.get(iIntValue);
            c1324.m2392(1642834882);
            AbstractC8405.m13972(3031);
            AbstractC8405.m13972(3032);
            InterfaceC6558 interfaceC6558 = this.f16206;
            boolean zM2360 = c1324.m2360(interfaceC6558) | c1324.m2378(c6174);
            Object objM2345 = c1324.m2345();
            if (zM2360 || objM2345 == C1369.f3974) {
                objM2345 = new C5028(interfaceC6558, 15, c6174);
                c1324.m2386(objM2345);
            }
            AbstractC5969.m11347(c6174, (InterfaceC6543) objM2345, c1324, 0);
            c1324.m2377(false);
        } else {
            c1324.m2339();
        }
        return C5176.f14739;
    }
}
