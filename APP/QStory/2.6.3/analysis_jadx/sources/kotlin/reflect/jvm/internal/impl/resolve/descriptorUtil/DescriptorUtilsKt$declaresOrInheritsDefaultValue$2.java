package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import p052.InterfaceC6558;
import p079.C6979;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReferenceImpl implements InterfaceC6558 {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1, InterfaceC4456.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
    }

    @Override // p052.InterfaceC6558
    public final Boolean invoke(InterfaceC4456 interfaceC4456) {
        interfaceC4456.getClass();
        return Boolean.valueOf(((C6979) interfaceC4456).m12290());
    }
}
