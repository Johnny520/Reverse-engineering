package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5716 extends AbstractC5701 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f14540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f14541;

    public /* synthetic */ C5716(Object obj, int i) {
        this.f14541 = i;
        this.f14540 = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo10293() {
        switch (this.f14541) {
            case 1:
                return ((Map) this.f14540).isEmpty();
            default:
                return super.mo10293();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo10296() {
        switch (this.f14541) {
            case 1:
                return false;
            default:
                return super.mo10296();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5701
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5702 mo10297(InterfaceC5705 interfaceC5705) {
        int i = this.f14541;
        Object obj = this.f14540;
        interfaceC5705.getClass();
        switch (i) {
            case 0:
                if (!((ArrayList) obj).contains(interfaceC5705)) {
                    return null;
                }
                InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705.mo9770();
                interfaceC5309Mo9770.getClass();
                return AbstractC5749.m10413((InterfaceC5295) interfaceC5309Mo9770);
            default:
                return (AbstractC5702) ((Map) obj).get(interfaceC5705);
        }
    }
}
