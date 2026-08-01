package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1, C5274.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // p068.InterfaceC7387
    public final C5274 invoke(Constructor<?> constructor) {
        constructor.getClass();
        return new C5274(constructor);
    }
}
