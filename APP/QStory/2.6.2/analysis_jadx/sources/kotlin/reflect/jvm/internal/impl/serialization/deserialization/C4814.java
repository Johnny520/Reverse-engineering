package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p070.AbstractC6911;
import p099.AbstractC7241;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4814 extends AbstractC1332 implements InterfaceC4815 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4812 f14029;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4814(InterfaceC4485 interfaceC4485, C0325 c0325, AbstractC7241 abstractC7241) {
        super(abstractC7241);
        interfaceC4485.getClass();
        abstractC7241.getClass();
        this.f14029 = new C4812(interfaceC4485, c0325);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4815
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final Object mo9259(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property, AbstractC4881 abstractC4881) {
        protoBuf$Property.getClass();
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) AbstractC6911.m12176(protoBuf$Property, ((AbstractC7241) this.f3894).f19307);
        if (value == null) {
            return null;
        }
        return this.f14029.m9562(abstractC4881, value, abstractC4807.f14015);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4815
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final Object mo9261(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property, AbstractC4881 abstractC4881) {
        protoBuf$Property.getClass();
        return null;
    }
}
