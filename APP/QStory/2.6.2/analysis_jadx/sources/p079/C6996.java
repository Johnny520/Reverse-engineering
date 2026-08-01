package p079;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4787;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import p049.AbstractC6529;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6996 implements InterfaceC4872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6995 f18759;

    public C6996(AbstractC6995 abstractC6995) {
        this.f18759 = abstractC6995;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    public final List getParameters() {
        List list = ((C4787) this.f18759).f13942;
        if (list != null) {
            return list;
        }
        AbstractC4394.m8918("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f18759.getName().m9345() + ']';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9503() {
        return AbstractC4772.m9509(this.f18759);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4476 mo9221() {
        return this.f18759;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9222() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9504() {
        Collection collectionMo9504 = this.f18759.mo9532().mo9732().mo9504();
        collectionMo9504.getClass();
        return collectionMo9504;
    }
}
