package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends FunctionReferenceImpl implements InterfaceC6557 {
    public DeserializedClassDescriptor$computeValueClassRepresentation$2(Object obj) {
        super(1, obj, C4800.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // p052.InterfaceC6557
    public final AbstractC4877 invoke(C4690 c4690) {
        c4690.getClass();
        return ((C4800) this.receiver).m9551(c4690);
    }
}
