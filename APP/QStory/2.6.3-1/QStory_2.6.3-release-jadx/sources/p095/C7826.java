package p095;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5620;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import p065.AbstractC7359;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7826 implements InterfaceC5705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7825 f19099;

    public C7826(AbstractC7825 abstractC7825) {
        this.f19099 = abstractC7825;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        List list = ((C5620) this.f19099).f14291;
        if (list != null) {
            return list;
        }
        AbstractC5227.m9467("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f19099.getName().m9894() + ']';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10052() {
        return AbstractC5605.m10058(this.f19099);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5309 mo9770() {
        return this.f19099;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9771() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo10053() {
        Collection collectionMo10053 = this.f19099.mo10081().mo10281().mo10053();
        collectionMo10053.getClass();
        return collectionMo10053;
    }
}
