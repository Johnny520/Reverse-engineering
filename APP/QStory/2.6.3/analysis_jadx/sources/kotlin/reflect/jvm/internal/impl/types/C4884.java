package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4884 extends AbstractC4869 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f14195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f14196;

    public /* synthetic */ C4884(Object obj, int i) {
        this.f14196 = i;
        this.f14195 = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo9734() {
        switch (this.f14196) {
            case 1:
                return ((Map) this.f14195).isEmpty();
            default:
                return super.mo9734();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9737() {
        switch (this.f14196) {
            case 1:
                return false;
            default:
                return super.mo9737();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4869
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC4870 mo9738(InterfaceC4873 interfaceC4873) {
        int i = this.f14196;
        Object obj = this.f14195;
        interfaceC4873.getClass();
        switch (i) {
            case 0:
                if (!((ArrayList) obj).contains(interfaceC4873)) {
                    return null;
                }
                InterfaceC4477 interfaceC4477Mo9211 = interfaceC4873.mo9211();
                interfaceC4477Mo9211.getClass();
                return AbstractC4917.m9854((InterfaceC4463) interfaceC4477Mo9211);
            default:
                return (AbstractC4870) ((Map) obj).get(interfaceC4873);
        }
    }
}
