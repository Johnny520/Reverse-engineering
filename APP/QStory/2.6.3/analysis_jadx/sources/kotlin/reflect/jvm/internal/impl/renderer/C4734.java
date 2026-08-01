package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.text.AbstractC5144;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p079.AbstractC6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4734 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4744 f13822;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6530 f13823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13824;

    public /* synthetic */ C4734(C4744 c4744, AbstractC6530 abstractC6530, int i) {
        this.f13824 = i;
        this.f13822 = c4744;
        this.f13823 = abstractC6530;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13824;
        AbstractC6530 abstractC6530 = this.f13823;
        C4744 c4744 = this.f13822;
        switch (i) {
            case 0:
                C4737 c4737M9479 = c4744.m9479();
                AbstractC6989 abstractC6989M12039 = abstractC6530.m12039(AbstractC6527.f17869);
                if (abstractC6989M12039 != null) {
                    return AbstractC5144.m10154(c4737M9479.m9427(abstractC6989M12039, c4744), "Collection");
                }
                AbstractC6530.m12020(35);
                throw null;
            default:
                return AbstractC5144.m10154(c4744.m9479().m9427(abstractC6530.m12036("Array"), c4744), "Array");
        }
    }
}
