package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class DescriptorRendererImpl$renderFlexibleType$3 extends FunctionReferenceImpl implements InterfaceC6557 {
    public DescriptorRendererImpl$renderFlexibleType$3(Object obj) {
        super(1, obj, C4743.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // p052.InterfaceC6557
    public final String invoke(String str) {
        str.getClass();
        C4743 c4743 = (C4743) this.receiver;
        int i = C4743.f13883;
        return c4743.m9488(str);
    }
}
