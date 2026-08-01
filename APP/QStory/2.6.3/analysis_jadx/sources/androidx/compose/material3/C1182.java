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
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5318;
import p048.C6519;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1182 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3386;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3387;

    public C1182(C0741 c0741, InterfaceC6558 interfaceC6558, C6519 c6519) {
        this.f3387 = 1;
        this.f3385 = c0741;
        this.f3386 = c6519;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f3387;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f3386;
        Object obj3 = this.f3385;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                ArrayList arrayList = (ArrayList) obj3;
                if (interfaceC0582 instanceof C0577) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0581) {
                    arrayList.remove(((C0581) interfaceC0582).f1629);
                } else if (interfaceC0582 instanceof C0566) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0578) {
                    arrayList.remove(((C0578) interfaceC0582).f1628);
                } else if (interfaceC0582 instanceof C0575) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0576) {
                    arrayList.remove(((C0576) interfaceC0582).f1627);
                } else if (interfaceC0582 instanceof C0572) {
                    arrayList.remove(((C0572) interfaceC0582).f1624);
                }
                AbstractC5399.m10477((InterfaceC5401) obj2, null, null, new FloatingActionButtonElevation$animateElevation$2$1$1$1(null, (InterfaceC0582) AbstractC4344.m8812(arrayList), null), 3);
                return c5176;
            case 1:
                ((Number) obj).intValue();
                C0741 c0741 = (C0741) obj3;
                c0741.f2105.m1560();
                c0741.f2105.m1560();
                int i2 = ((C6519) obj2).f17818;
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
                if (c1173.f3379 != z) {
                    c1173.f3379 = z;
                    AbstractC1785.m3350(c1173);
                }
                return c5176;
        }
    }

    public /* synthetic */ C1182(Serializable serializable, Object obj, int i) {
        this.f3387 = i;
        this.f3385 = serializable;
        this.f3386 = obj;
    }
}
