package androidx.compose.material.ripple;

import androidx.compose.animation.core.AbstractC1182;
import androidx.compose.animation.core.C1208;
import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1410;
import androidx.compose.foundation.interaction.C1411;
import androidx.compose.foundation.interaction.C1412;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.C1422;
import androidx.compose.foundation.interaction.InterfaceC1415;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.p001ui.node.AbstractC2620;
import java.util.ArrayList;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6150;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1948 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f3602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1943 f3603;

    public C1948(AbstractC1943 abstractC1943, InterfaceC6233 interfaceC6233) {
        this.f3603 = abstractC1943;
        this.f3602 = interfaceC6233;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
        boolean z = interfaceC1423 instanceof InterfaceC1415;
        AbstractC1943 abstractC1943 = this.f3603;
        if (!z) {
            C1942 c1942 = abstractC1943.f3589;
            if (c1942 == null) {
                c1942 = new C1942(abstractC1943.f3593, abstractC1943.f3590);
                AbstractC2620.m3911(abstractC1943);
                abstractC1943.f3589 = c1942;
            }
            ArrayList arrayList = c1942.f3580;
            if (interfaceC1423 instanceof C1418) {
                arrayList.add(interfaceC1423);
            } else if (interfaceC1423 instanceof C1422) {
                arrayList.remove(((C1422) interfaceC1423).f1974);
            } else if (interfaceC1423 instanceof C1407) {
                arrayList.add(interfaceC1423);
            } else if (interfaceC1423 instanceof C1419) {
                arrayList.remove(((C1419) interfaceC1423).f1973);
            } else if (interfaceC1423 instanceof C1411) {
                arrayList.add(interfaceC1423);
            } else if (interfaceC1423 instanceof C1410) {
                arrayList.remove(((C1410) interfaceC1423).f1967);
            } else if (interfaceC1423 instanceof C1412) {
                arrayList.remove(((C1412) interfaceC1423).f1968);
            }
            InterfaceC1423 interfaceC14232 = (InterfaceC1423) AbstractC5176.m9371(arrayList);
            if (!AbstractC5227.m9466(c1942.f3579, interfaceC14232)) {
                InterfaceC6233 interfaceC6233 = this.f3602;
                if (interfaceC14232 != null) {
                    c1942.f3582.invoke();
                    boolean z2 = interfaceC14232 instanceof C1418;
                    float f = z2 ? 0.08f : interfaceC14232 instanceof C1407 ? 0.1f : interfaceC14232 instanceof C1411 ? 0.16f : 0.0f;
                    C1208 c1208 = AbstractC1947.f3601;
                    if (!z2 && ((interfaceC14232 instanceof C1407) || (interfaceC14232 instanceof C1411))) {
                        c1208 = new C1208(45, 0, AbstractC1182.f1486);
                    }
                    AbstractC6231.m11036(interfaceC6233, null, null, new StateLayer$handleInteraction$1(c1942, f, c1208, null), 3);
                } else {
                    InterfaceC1423 interfaceC14233 = c1942.f3579;
                    C1208 c12082 = AbstractC1947.f3601;
                    if (!(interfaceC14233 instanceof C1418) && !(interfaceC14233 instanceof C1407) && (interfaceC14233 instanceof C1411)) {
                        c12082 = new C1208(150, 0, AbstractC1182.f1486);
                    }
                    AbstractC6231.m11036(interfaceC6233, null, null, new StateLayer$handleInteraction$2(c1942, c12082, null), 3);
                }
                c1942.f3579 = interfaceC14232;
            }
        } else if (abstractC1943.f3584) {
            abstractC1943.m2565((InterfaceC1415) interfaceC1423);
        } else {
            abstractC1943.f3586.m1335(interfaceC1423);
        }
        return C6008.f15084;
    }
}
