package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1055 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1054 f3134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3135;

    public /* synthetic */ C1055(AbstractC1054 abstractC1054, int i) {
        this.f3135 = i;
        this.f3134 = abstractC1054;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        InterfaceC1787 interfaceC1787;
        int i = this.f3135;
        AbstractC1054 abstractC1054 = this.f3134;
        switch (i) {
            case 0:
                InterfaceC1016 interfaceC1016 = (InterfaceC1016) AbstractC1785.m3356(abstractC1054, AbstractC1092.f3221);
                if (!(interfaceC1016 instanceof InterfaceC1095)) {
                    AbstractC7741.m13097("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC1016);
                }
                InterfaceC1095 interfaceC1095 = abstractC1054.f3123;
                InterfaceC1095 interfaceC10952 = (InterfaceC1095) interfaceC1016;
                abstractC1054.f3123 = interfaceC10952;
                if (interfaceC1095 != null && !AbstractC4395.m8907(interfaceC10952, interfaceC1095) && ((interfaceC1787 = abstractC1054.f3116) != null || !abstractC1054.f3130)) {
                    if (interfaceC1787 != null) {
                        abstractC1054.m3368(interfaceC1787);
                    }
                    abstractC1054.f3116 = null;
                    abstractC1054.m1967();
                }
                return C5176.f14739;
            default:
                abstractC1054.f3121.invoke();
                return Boolean.TRUE;
        }
    }
}
