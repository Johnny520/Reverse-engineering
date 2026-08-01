package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DescriptorRendererImpl$renderFlexibleType$3 extends FunctionReferenceImpl implements InterfaceC6558 {
    public DescriptorRendererImpl$renderFlexibleType$3(Object obj) {
        super(1, obj, C4744.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // p052.InterfaceC6558
    public final String invoke(String str) {
        str.getClass();
        C4744 c4744 = (C4744) this.receiver;
        int i = C4744.f13887;
        return c4744.m9478(str);
    }
}
