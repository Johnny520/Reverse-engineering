package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends FunctionReferenceImpl implements InterfaceC6558 {
    public DeserializedClassDescriptor$computeValueClassRepresentation$2(Object obj) {
        super(1, obj, C4801.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // p052.InterfaceC6558
    public final AbstractC4878 invoke(C4691 c4691) {
        c4691.getClass();
        return ((C4801) this.receiver).m9541(c4691);
    }
}
