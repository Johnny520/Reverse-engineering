package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4809;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends AdaptedFunctionReference implements InterfaceC6557 {
    public DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj, C4809.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // p052.InterfaceC6557
    public final AbstractC4877 invoke(ProtoBuf$Type protoBuf$Type) {
        protoBuf$Type.getClass();
        return ((C4809) this.receiver).m9558(protoBuf$Type, true);
    }
}
