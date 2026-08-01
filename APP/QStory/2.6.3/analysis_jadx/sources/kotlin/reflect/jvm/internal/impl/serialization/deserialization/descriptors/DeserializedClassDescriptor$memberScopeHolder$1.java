package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj, C4797.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
    }

    @Override // p052.InterfaceC6558
    public final C4797 invoke(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        return new C4797((C4801) this.receiver, abstractC4861);
    }
}
