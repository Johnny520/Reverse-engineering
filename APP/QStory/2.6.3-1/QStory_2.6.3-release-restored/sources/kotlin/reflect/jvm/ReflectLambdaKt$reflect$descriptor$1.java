package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5655;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2, C5655.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
    }

    @Override // p068.InterfaceC7383
    public final InterfaceC5303 invoke(C5655 c5655, ProtoBuf$Function protoBuf$Function) {
        c5655.getClass();
        protoBuf$Function.getClass();
        return c5655.m10114(protoBuf$Function);
    }
}
