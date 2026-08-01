package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public DeserializedClassDescriptor$computeValueClassRepresentation$2(Object obj) {
        super(1, obj, C5633.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // p068.InterfaceC7387
    public final AbstractC5710 invoke(C5523 c5523) {
        c5523.getClass();
        return ((C5633) this.receiver).m10100(c5523);
    }
}
