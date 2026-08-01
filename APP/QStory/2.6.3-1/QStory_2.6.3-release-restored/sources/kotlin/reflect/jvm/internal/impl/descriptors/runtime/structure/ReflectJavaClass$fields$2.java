package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1, C5278.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/reflect/Field;)V", 0);
    }

    @Override // p068.InterfaceC7387
    public final C5278 invoke(Field field) {
        field.getClass();
        return new C5278(field);
    }
}
