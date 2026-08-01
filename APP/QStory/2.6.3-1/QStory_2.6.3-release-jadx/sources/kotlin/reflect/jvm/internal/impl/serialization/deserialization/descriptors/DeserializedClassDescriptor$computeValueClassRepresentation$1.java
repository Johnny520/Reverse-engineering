package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5642;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends AdaptedFunctionReference implements InterfaceC7387 {
    public DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj, C5642.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // p068.InterfaceC7387
    public final AbstractC5710 invoke(ProtoBuf$Type protoBuf$Type) {
        protoBuf$Type.getClass();
        return ((C5642) this.receiver).m10107(protoBuf$Type, true);
    }
}
