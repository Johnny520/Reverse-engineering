package androidx.compose.material.ripple;

import androidx.compose.animation.core.AbstractC0336;
import androidx.compose.animation.core.C0362;
import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0569;
import androidx.compose.foundation.interaction.C0570;
import androidx.compose.foundation.interaction.C0571;
import androidx.compose.foundation.interaction.C0577;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.C0581;
import androidx.compose.foundation.interaction.InterfaceC0574;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.ui.node.AbstractC1785;
import java.util.ArrayList;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1110 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5401 f3257;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1105 f3258;

    public C1110(AbstractC1105 abstractC1105, InterfaceC5401 interfaceC5401) {
        this.f3258 = abstractC1105;
        this.f3257 = interfaceC5401;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
        boolean z = interfaceC0582 instanceof InterfaceC0574;
        AbstractC1105 abstractC1105 = this.f3258;
        if (!z) {
            C1104 c1104 = abstractC1105.f3244;
            if (c1104 == null) {
                c1104 = new C1104(abstractC1105.f3248, abstractC1105.f3245);
                AbstractC1785.m3351(abstractC1105);
                abstractC1105.f3244 = c1104;
            }
            ArrayList arrayList = c1104.f3235;
            if (interfaceC0582 instanceof C0577) {
                arrayList.add(interfaceC0582);
            } else if (interfaceC0582 instanceof C0581) {
                arrayList.remove(((C0581) interfaceC0582).f1629);
            } else if (interfaceC0582 instanceof C0566) {
                arrayList.add(interfaceC0582);
            } else if (interfaceC0582 instanceof C0578) {
                arrayList.remove(((C0578) interfaceC0582).f1628);
            } else if (interfaceC0582 instanceof C0570) {
                arrayList.add(interfaceC0582);
            } else if (interfaceC0582 instanceof C0569) {
                arrayList.remove(((C0569) interfaceC0582).f1622);
            } else if (interfaceC0582 instanceof C0571) {
                arrayList.remove(((C0571) interfaceC0582).f1623);
            }
            InterfaceC0582 interfaceC05822 = (InterfaceC0582) AbstractC4344.m8812(arrayList);
            if (!AbstractC4395.m8907(c1104.f3234, interfaceC05822)) {
                InterfaceC5401 interfaceC5401 = this.f3257;
                if (interfaceC05822 != null) {
                    c1104.f3237.invoke();
                    boolean z2 = interfaceC05822 instanceof C0577;
                    float f = z2 ? 0.08f : interfaceC05822 instanceof C0566 ? 0.1f : interfaceC05822 instanceof C0570 ? 0.16f : 0.0f;
                    C0362 c0362 = AbstractC1109.f3256;
                    if (!z2 && ((interfaceC05822 instanceof C0566) || (interfaceC05822 instanceof C0570))) {
                        c0362 = new C0362(45, 0, AbstractC0336.f1141);
                    }
                    AbstractC5399.m10477(interfaceC5401, null, null, new StateLayer$handleInteraction$1(c1104, f, c0362, null), 3);
                } else {
                    InterfaceC0582 interfaceC05823 = c1104.f3234;
                    C0362 c03622 = AbstractC1109.f3256;
                    if (!(interfaceC05823 instanceof C0577) && !(interfaceC05823 instanceof C0566) && (interfaceC05823 instanceof C0570)) {
                        c03622 = new C0362(150, 0, AbstractC0336.f1141);
                    }
                    AbstractC5399.m10477(interfaceC5401, null, null, new StateLayer$handleInteraction$2(c1104, c03622, null), 3);
                }
                c1104.f3234 = interfaceC05822;
            }
        } else if (abstractC1105.f3239) {
            abstractC1105.m2005((InterfaceC0574) interfaceC0582);
        } else {
            abstractC1105.f3241.m775(interfaceC0582);
        }
        return C5176.f14739;
    }
}
