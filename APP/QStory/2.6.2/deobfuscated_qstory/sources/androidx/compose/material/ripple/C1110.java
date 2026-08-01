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
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5317;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1110 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5400 f3256;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1105 f3257;

    public C1110(AbstractC1105 abstractC1105, InterfaceC5400 interfaceC5400) {
        this.f3257 = abstractC1105;
        this.f3256 = interfaceC5400;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
        boolean z = interfaceC0582 instanceof InterfaceC0574;
        AbstractC1105 abstractC1105 = this.f3257;
        if (!z) {
            C1104 c1104 = abstractC1105.f3243;
            if (c1104 == null) {
                c1104 = new C1104(abstractC1105.f3247, abstractC1105.f3244);
                AbstractC1785.m3341(abstractC1105);
                abstractC1105.f3243 = c1104;
            }
            ArrayList arrayList = c1104.f3234;
            if (interfaceC0582 instanceof C0577) {
                arrayList.add(interfaceC0582);
            } else if (interfaceC0582 instanceof C0581) {
                arrayList.remove(((C0581) interfaceC0582).f1628);
            } else if (interfaceC0582 instanceof C0566) {
                arrayList.add(interfaceC0582);
            } else if (interfaceC0582 instanceof C0578) {
                arrayList.remove(((C0578) interfaceC0582).f1627);
            } else if (interfaceC0582 instanceof C0570) {
                arrayList.add(interfaceC0582);
            } else if (interfaceC0582 instanceof C0569) {
                arrayList.remove(((C0569) interfaceC0582).f1621);
            } else if (interfaceC0582 instanceof C0571) {
                arrayList.remove(((C0571) interfaceC0582).f1622);
            }
            InterfaceC0582 interfaceC05822 = (InterfaceC0582) AbstractC4343.m8810(arrayList);
            if (!AbstractC4394.m8917(c1104.f3233, interfaceC05822)) {
                InterfaceC5400 interfaceC5400 = this.f3256;
                if (interfaceC05822 != null) {
                    c1104.f3236.invoke();
                    boolean z2 = interfaceC05822 instanceof C0577;
                    float f = z2 ? 0.08f : interfaceC05822 instanceof C0566 ? 0.1f : interfaceC05822 instanceof C0570 ? 0.16f : 0.0f;
                    C0362 c0362 = AbstractC1109.f3255;
                    if (!z2 && ((interfaceC05822 instanceof C0566) || (interfaceC05822 instanceof C0570))) {
                        c0362 = new C0362(45, 0, AbstractC0336.f1141);
                    }
                    AbstractC5398.m10473(interfaceC5400, null, null, new StateLayer$handleInteraction$1(c1104, f, c0362, null), 3);
                } else {
                    InterfaceC0582 interfaceC05823 = c1104.f3233;
                    C0362 c03622 = AbstractC1109.f3255;
                    if (!(interfaceC05823 instanceof C0577) && !(interfaceC05823 instanceof C0566) && (interfaceC05823 instanceof C0570)) {
                        c03622 = new C0362(150, 0, AbstractC0336.f1141);
                    }
                    AbstractC5398.m10473(interfaceC5400, null, null, new StateLayer$handleInteraction$2(c1104, c03622, null), 3);
                }
                c1104.f3233 = interfaceC05822;
            }
        } else if (abstractC1105.f3238) {
            abstractC1105.m1995((InterfaceC0574) interfaceC0582);
        } else {
            abstractC1105.f3240.m774(interfaceC0582);
        }
        return C5175.f14739;
    }
}
