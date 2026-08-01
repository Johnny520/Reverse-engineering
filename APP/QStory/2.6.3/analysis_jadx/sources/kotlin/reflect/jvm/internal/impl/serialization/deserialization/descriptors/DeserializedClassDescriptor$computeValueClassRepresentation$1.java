package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends AdaptedFunctionReference implements InterfaceC6558 {
    public DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj, C4810.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // p052.InterfaceC6558
    public final AbstractC4878 invoke(ProtoBuf$Type protoBuf$Type) {
        protoBuf$Type.getClass();
        return ((C4810) this.receiver).m9548(protoBuf$Type, true);
    }
}
