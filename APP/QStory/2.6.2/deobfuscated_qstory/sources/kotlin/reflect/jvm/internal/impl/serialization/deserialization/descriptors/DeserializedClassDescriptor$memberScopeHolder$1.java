package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj, C4796.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
    }

    @Override // p052.InterfaceC6557
    public final C4796 invoke(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        return new C4796((C4800) this.receiver, abstractC4860);
    }
}
