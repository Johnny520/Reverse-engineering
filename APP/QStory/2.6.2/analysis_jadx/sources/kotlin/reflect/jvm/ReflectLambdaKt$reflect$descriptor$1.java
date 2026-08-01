package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4822;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2, C4822.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
    }

    @Override // p052.InterfaceC6553
    public final InterfaceC4470 invoke(C4822 c4822, ProtoBuf$Function protoBuf$Function) {
        c4822.getClass();
        protoBuf$Function.getClass();
        return c4822.m9565(protoBuf$Function);
    }
}
