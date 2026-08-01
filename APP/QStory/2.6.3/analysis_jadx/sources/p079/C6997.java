package p079;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4788;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import p049.AbstractC6530;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6997 implements InterfaceC4873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6996 f18754;

    public C6997(AbstractC6996 abstractC6996) {
        this.f18754 = abstractC6996;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        List list = ((C4788) this.f18754).f13946;
        if (list != null) {
            return list;
        }
        AbstractC4395.m8908("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f18754.getName().m9335() + ']';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        return AbstractC4773.m9499(this.f18754);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        return this.f18754;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9494() {
        Collection collectionMo9494 = this.f18754.mo9522().mo9722().mo9494();
        collectionMo9494.getClass();
        return collectionMo9494;
    }
}
