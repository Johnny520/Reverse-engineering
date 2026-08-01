package androidx.compose.foundation;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2622;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1893 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1892 f3479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3480;

    public /* synthetic */ C1893(AbstractC1892 abstractC1892, int i) {
        this.f3480 = i;
        this.f3479 = abstractC1892;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        InterfaceC2622 interfaceC2622;
        int i = this.f3480;
        AbstractC1892 abstractC1892 = this.f3479;
        switch (i) {
            case 0:
                InterfaceC1854 interfaceC1854 = (InterfaceC1854) AbstractC2620.m3916(abstractC1892, AbstractC1930.f3566);
                if (!(interfaceC1854 instanceof InterfaceC1933)) {
                    AbstractC8570.m13656("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC1854);
                }
                InterfaceC1933 interfaceC1933 = abstractC1892.f3468;
                InterfaceC1933 interfaceC19332 = (InterfaceC1933) interfaceC1854;
                abstractC1892.f3468 = interfaceC19332;
                if (interfaceC1933 != null && !AbstractC5227.m9466(interfaceC19332, interfaceC1933) && ((interfaceC2622 = abstractC1892.f3461) != null || !abstractC1892.f3475)) {
                    if (interfaceC2622 != null) {
                        abstractC1892.m3928(interfaceC2622);
                    }
                    abstractC1892.f3461 = null;
                    abstractC1892.m2527();
                }
                return C6008.f15084;
            default:
                abstractC1892.f3466.invoke();
                return Boolean.TRUE;
        }
    }
}
