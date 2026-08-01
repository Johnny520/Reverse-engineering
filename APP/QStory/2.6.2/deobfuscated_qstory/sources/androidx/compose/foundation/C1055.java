package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1055 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1054 f3133;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3134;

    public /* synthetic */ C1055(AbstractC1054 abstractC1054, int i) {
        this.f3134 = i;
        this.f3133 = abstractC1054;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        InterfaceC1787 interfaceC1787;
        int i = this.f3134;
        AbstractC1054 abstractC1054 = this.f3133;
        switch (i) {
            case 0:
                InterfaceC1016 interfaceC1016 = (InterfaceC1016) AbstractC1785.m3346(abstractC1054, AbstractC1092.f3220);
                if (!(interfaceC1016 instanceof InterfaceC1095)) {
                    AbstractC7740.m13069("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC1016);
                }
                InterfaceC1095 interfaceC1095 = abstractC1054.f3122;
                InterfaceC1095 interfaceC10952 = (InterfaceC1095) interfaceC1016;
                abstractC1054.f3122 = interfaceC10952;
                if (interfaceC1095 != null && !AbstractC4394.m8917(interfaceC10952, interfaceC1095) && ((interfaceC1787 = abstractC1054.f3115) != null || !abstractC1054.f3129)) {
                    if (interfaceC1787 != null) {
                        abstractC1054.m3358(interfaceC1787);
                    }
                    abstractC1054.f3115 = null;
                    abstractC1054.m1957();
                }
                return C5175.f14739;
            default:
                abstractC1054.f3120.invoke();
                return Boolean.TRUE;
        }
    }
}
