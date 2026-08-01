package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import p052.InterfaceC6557;
import p079.C6978;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReferenceImpl implements InterfaceC6557 {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1, InterfaceC4455.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
    }

    @Override // p052.InterfaceC6557
    public final Boolean invoke(InterfaceC4455 interfaceC4455) {
        interfaceC4455.getClass();
        return Boolean.valueOf(((C6978) interfaceC4455).m12263());
    }
}
