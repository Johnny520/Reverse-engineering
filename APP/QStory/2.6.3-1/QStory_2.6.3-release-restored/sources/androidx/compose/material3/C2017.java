package androidx.compose.material3;

import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.C1422;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.p001ui.node.AbstractC2620;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6150;
import p064.C7348;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2017 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3732;

    public C2017(C1582 c1582, InterfaceC7387 interfaceC7387, C7348 c7348) {
        this.f3732 = 1;
        this.f3730 = c1582;
        this.f3731 = c7348;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f3732;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f3731;
        Object obj3 = this.f3730;
        switch (i) {
            case 0:
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
                ArrayList arrayList = (ArrayList) obj3;
                if (interfaceC1423 instanceof C1418) {
                    arrayList.add(interfaceC1423);
                } else if (interfaceC1423 instanceof C1422) {
                    arrayList.remove(((C1422) interfaceC1423).f1974);
                } else if (interfaceC1423 instanceof C1407) {
                    arrayList.add(interfaceC1423);
                } else if (interfaceC1423 instanceof C1419) {
                    arrayList.remove(((C1419) interfaceC1423).f1973);
                } else if (interfaceC1423 instanceof C1416) {
                    arrayList.add(interfaceC1423);
                } else if (interfaceC1423 instanceof C1417) {
                    arrayList.remove(((C1417) interfaceC1423).f1972);
                } else if (interfaceC1423 instanceof C1413) {
                    arrayList.remove(((C1413) interfaceC1423).f1969);
                }
                AbstractC6231.m11036((InterfaceC6233) obj2, null, null, new FloatingActionButtonElevation$animateElevation$2$1$1$1(null, (InterfaceC1423) AbstractC5176.m9371(arrayList), null), 3);
                return c6008;
            case 1:
                ((Number) obj).intValue();
                C1582 c1582 = (C1582) obj3;
                c1582.f2450.m2120();
                c1582.f2450.m2120();
                int i2 = ((C7348) obj2).f18163;
                throw null;
            default:
                InterfaceC1423 interfaceC14232 = (InterfaceC1423) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                if (interfaceC14232 instanceof C1416) {
                    ref$IntRef.element++;
                } else if ((interfaceC14232 instanceof C1417) || (interfaceC14232 instanceof C1413)) {
                    ref$IntRef.element--;
                }
                boolean z = ref$IntRef.element > 0;
                C2008 c2008 = (C2008) obj2;
                if (c2008.f3724 != z) {
                    c2008.f3724 = z;
                    AbstractC2620.m3910(c2008);
                }
                return c6008;
        }
    }

    public /* synthetic */ C2017(Serializable serializable, Object obj, int i) {
        this.f3732 = i;
        this.f3730 = serializable;
        this.f3731 = obj;
    }
}
