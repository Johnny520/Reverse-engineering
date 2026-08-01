package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.text.AbstractC5976;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p095.AbstractC7818;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5566 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5576 f14167;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7359 f14168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14169;

    public /* synthetic */ C5566(C5576 c5576, AbstractC7359 abstractC7359, int i) {
        this.f14169 = i;
        this.f14167 = c5576;
        this.f14168 = abstractC7359;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14169;
        AbstractC7359 abstractC7359 = this.f14168;
        C5576 c5576 = this.f14167;
        switch (i) {
            case 0:
                C5569 c5569M10038 = c5576.m10038();
                AbstractC7818 abstractC7818M12598 = abstractC7359.m12598(AbstractC7356.f18214);
                if (abstractC7818M12598 != null) {
                    return AbstractC5976.m10713(c5569M10038.m9986(abstractC7818M12598, c5576), "Collection");
                }
                AbstractC7359.m12579(35);
                throw null;
            default:
                return AbstractC5976.m10713(c5576.m10038().m9986(abstractC7359.m12595("Array"), c5576), "Array");
        }
    }
}
