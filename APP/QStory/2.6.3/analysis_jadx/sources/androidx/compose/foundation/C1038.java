package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.C0577;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.C0581;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2025;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1038 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3053;

    public /* synthetic */ C1038(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3053 = i;
        this.f3051 = obj;
        this.f3052 = obj2;
        this.f3050 = obj3;
        this.f3049 = obj4;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f3053;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f3049;
        Object obj3 = this.f3052;
        Object obj4 = this.f3051;
        Object obj5 = this.f3050;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj5;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) obj4;
                boolean z = true;
                if (interfaceC0582 instanceof C0575) {
                    ref$IntRef3.element++;
                } else if ((interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0572)) {
                    ref$IntRef3.element--;
                } else if (interfaceC0582 instanceof C0577) {
                    ref$IntRef2.element++;
                } else if (interfaceC0582 instanceof C0581) {
                    ref$IntRef2.element--;
                } else if (interfaceC0582 instanceof C0566) {
                    ref$IntRef.element++;
                } else if (interfaceC0582 instanceof C0578) {
                    ref$IntRef.element--;
                }
                boolean z2 = false;
                boolean z3 = ref$IntRef3.element > 0;
                boolean z4 = ref$IntRef2.element > 0;
                boolean z5 = ref$IntRef.element > 0;
                C1037 c1037 = (C1037) obj2;
                if (c1037.f3048 != z3) {
                    c1037.f3048 = z3;
                    z2 = true;
                }
                if (c1037.f3047 != z4) {
                    c1037.f3047 = z4;
                    z2 = true;
                }
                if (c1037.f3046 != z5) {
                    c1037.f3046 = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    AbstractC1785.m3351(c1037);
                }
                break;
            default:
                C0882 c0882 = (C0882) obj5;
                C0943 c0943 = (C0943) obj4;
                if (((Boolean) obj).booleanValue() && c0943.m1867()) {
                    AbstractC0983.m1898((C2014) obj3, c0943, c0882.m1759(), (C2025) obj2, c0882.f2489);
                } else {
                    AbstractC0983.m1910(c0943);
                }
                break;
        }
        return c5176;
    }
}
