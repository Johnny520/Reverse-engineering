package androidx.compose.material3;

import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.C0577;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.C0581;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.foundation.lazy.C0741;
import androidx.compose.ui.node.AbstractC1785;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5317;
import p048.C6518;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1182 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3386;

    public C1182(C0741 c0741, InterfaceC6557 interfaceC6557, C6518 c6518) {
        this.f3386 = 1;
        this.f3384 = c0741;
        this.f3385 = c6518;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        int i = this.f3386;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f3385;
        Object obj3 = this.f3384;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                ArrayList arrayList = (ArrayList) obj3;
                if (interfaceC0582 instanceof C0577) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0581) {
                    arrayList.remove(((C0581) interfaceC0582).f1628);
                } else if (interfaceC0582 instanceof C0566) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0578) {
                    arrayList.remove(((C0578) interfaceC0582).f1627);
                } else if (interfaceC0582 instanceof C0575) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0576) {
                    arrayList.remove(((C0576) interfaceC0582).f1626);
                } else if (interfaceC0582 instanceof C0572) {
                    arrayList.remove(((C0572) interfaceC0582).f1623);
                }
                AbstractC5398.m10473((InterfaceC5400) obj2, null, null, new FloatingActionButtonElevation$animateElevation$2$1$1$1(null, (InterfaceC0582) AbstractC4343.m8810(arrayList), null), 3);
                return c5175;
            case 1:
                ((Number) obj).intValue();
                C0741 c0741 = (C0741) obj3;
                c0741.f2104.m1550();
                c0741.f2104.m1550();
                int i2 = ((C6518) obj2).f17822;
                throw null;
            default:
                InterfaceC0582 interfaceC05822 = (InterfaceC0582) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                if (interfaceC05822 instanceof C0575) {
                    ref$IntRef.element++;
                } else if ((interfaceC05822 instanceof C0576) || (interfaceC05822 instanceof C0572)) {
                    ref$IntRef.element--;
                }
                boolean z = ref$IntRef.element > 0;
                C1173 c1173 = (C1173) obj2;
                if (c1173.f3378 != z) {
                    c1173.f3378 = z;
                    AbstractC1785.m3340(c1173);
                }
                return c5175;
        }
    }

    public /* synthetic */ C1182(Serializable serializable, Object obj, int i) {
        this.f3386 = i;
        this.f3384 = serializable;
        this.f3385 = obj;
    }
}
