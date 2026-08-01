package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DescriptorRendererImpl$renderFlexibleType$3 extends FunctionReferenceImpl implements InterfaceC7387 {
    public DescriptorRendererImpl$renderFlexibleType$3(Object obj) {
        super(1, obj, C5576.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // p068.InterfaceC7387
    public final String invoke(String str) {
        str.getClass();
        C5576 c5576 = (C5576) this.receiver;
        int i = C5576.f14232;
        return c5576.m10037(str);
    }
}
