package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj, C5629.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
    }

    @Override // p068.InterfaceC7387
    public final C5629 invoke(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        return new C5629((C5633) this.receiver, abstractC5693);
    }
}
