package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.C6008;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p117.InterfaceC8083;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5405 extends AbstractC8104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f13672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Set f13673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7818 f13674;

    public C5405(AbstractC7818 abstractC7818, Set set, InterfaceC7387 interfaceC7387) {
        this.f13674 = abstractC7818;
        this.f13673 = set;
        this.f13672 = interfaceC7387;
    }

    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo9514(Object obj) {
        AbstractC7818 abstractC7818 = (AbstractC7818) obj;
        abstractC7818.getClass();
        if (abstractC7818 == this.f13674) {
            return true;
        }
        InterfaceC8083 interfaceC8083Mo9565 = abstractC7818.mo9565();
        interfaceC8083Mo9565.getClass();
        if (!(interfaceC8083Mo9565 instanceof AbstractC5403)) {
            return true;
        }
        this.f13673.addAll((Collection) this.f13672.invoke(interfaceC8083Mo9565));
        return false;
    }

    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final /* bridge */ /* synthetic */ Object mo9515() {
        return C6008.f15084;
    }
}
