package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReferenceImpl implements InterfaceC6557 {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1, C4441.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // p052.InterfaceC6557
    public final C4441 invoke(Constructor<?> constructor) {
        constructor.getClass();
        return new C4441(constructor);
    }
}
