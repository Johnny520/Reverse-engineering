package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p070.AbstractC6912;
import p099.AbstractC7242;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4815 extends AbstractC1332 implements InterfaceC4816 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4813 f14033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4815(InterfaceC4486 interfaceC4486, C0325 c0325, AbstractC7242 abstractC7242) {
        super(abstractC7242);
        interfaceC4486.getClass();
        abstractC7242.getClass();
        this.f14033 = new C4813(interfaceC4486, c0325);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4816
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final Object mo9249(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property, AbstractC4882 abstractC4882) {
        protoBuf$Property.getClass();
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) AbstractC6912.m12204(protoBuf$Property, ((AbstractC7242) this.f3895).f19302);
        if (value == null) {
            return null;
        }
        return this.f14033.m9552(abstractC4882, value, abstractC4808.f14019);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4816
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final Object mo9251(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property, AbstractC4882 abstractC4882) {
        protoBuf$Property.getClass();
        return null;
    }
}
