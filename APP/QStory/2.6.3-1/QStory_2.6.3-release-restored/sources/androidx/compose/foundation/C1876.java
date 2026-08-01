package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.C1422;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.text.input.C2848;
import androidx.compose.p001ui.text.input.C2859;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.InterfaceC6150;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1876 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3398;

    public /* synthetic */ C1876(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3398 = i;
        this.f3396 = obj;
        this.f3397 = obj2;
        this.f3395 = obj3;
        this.f3394 = obj4;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f3398;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f3394;
        Object obj3 = this.f3397;
        Object obj4 = this.f3396;
        Object obj5 = this.f3395;
        switch (i) {
            case 0:
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj5;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) obj4;
                boolean z = true;
                if (interfaceC1423 instanceof C1416) {
                    ref$IntRef3.element++;
                } else if ((interfaceC1423 instanceof C1417) || (interfaceC1423 instanceof C1413)) {
                    ref$IntRef3.element--;
                } else if (interfaceC1423 instanceof C1418) {
                    ref$IntRef2.element++;
                } else if (interfaceC1423 instanceof C1422) {
                    ref$IntRef2.element--;
                } else if (interfaceC1423 instanceof C1407) {
                    ref$IntRef.element++;
                } else if (interfaceC1423 instanceof C1419) {
                    ref$IntRef.element--;
                }
                boolean z2 = false;
                boolean z3 = ref$IntRef3.element > 0;
                boolean z4 = ref$IntRef2.element > 0;
                boolean z5 = ref$IntRef.element > 0;
                C1875 c1875 = (C1875) obj2;
                if (c1875.f3393 != z3) {
                    c1875.f3393 = z3;
                    z2 = true;
                }
                if (c1875.f3392 != z4) {
                    c1875.f3392 = z4;
                    z2 = true;
                }
                if (c1875.f3391 != z5) {
                    c1875.f3391 = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    AbstractC2620.m3911(c1875);
                }
                break;
            default:
                C1720 c1720 = (C1720) obj5;
                C1781 c1781 = (C1781) obj4;
                if (((Boolean) obj).booleanValue() && c1781.m2427()) {
                    AbstractC1821.m2458((C2848) obj3, c1781, c1720.m2319(), (C2859) obj2, c1720.f2834);
                } else {
                    AbstractC1821.m2470(c1781);
                }
                break;
        }
        return c6008;
    }
}
