package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.AbstractC2167;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p086.AbstractC7741;
import p115.AbstractC8071;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5647 extends AbstractC2167 implements InterfaceC5648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5645 f14378;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5647(InterfaceC5318 interfaceC5318, C1171 c1171, AbstractC8071 abstractC8071) {
        super(abstractC8071);
        interfaceC5318.getClass();
        abstractC8071.getClass();
        this.f14378 = new C5645(interfaceC5318, c1171);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5648
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final Object mo9808(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property, AbstractC5714 abstractC5714) {
        protoBuf$Property.getClass();
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) AbstractC7741.m12763(protoBuf$Property, ((AbstractC8071) this.f4240).f19647);
        if (value == null) {
            return null;
        }
        return this.f14378.m10111(abstractC5714, value, abstractC5640.f14364);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5648
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final Object mo9810(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property, AbstractC5714 abstractC5714) {
        protoBuf$Property.getClass();
        return null;
    }
}
