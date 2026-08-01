package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final ReflectJavaClass$methods$2 INSTANCE = new ReflectJavaClass$methods$2();

    public ReflectJavaClass$methods$2() {
        super(1, C5268.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/reflect/Method;)V", 0);
    }

    @Override // p068.InterfaceC7387
    public final C5268 invoke(Method method) {
        method.getClass();
        return new C5268(method);
    }
}
