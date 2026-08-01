package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import p068.InterfaceC7387;
import p095.C7808;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1, InterfaceC5288.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
    }

    @Override // p068.InterfaceC7387
    public final Boolean invoke(InterfaceC5288 interfaceC5288) {
        interfaceC5288.getClass();
        return Boolean.valueOf(((C7808) interfaceC5288).m12849());
    }
}
