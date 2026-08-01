package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.text.AbstractC5143;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p052.InterfaceC6542;
import p079.AbstractC6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4733 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4743 f13818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6529 f13819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13820;

    public /* synthetic */ C4733(C4743 c4743, AbstractC6529 abstractC6529, int i) {
        this.f13820 = i;
        this.f13818 = c4743;
        this.f13819 = abstractC6529;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13820;
        AbstractC6529 abstractC6529 = this.f13819;
        C4743 c4743 = this.f13818;
        switch (i) {
            case 0:
                C4736 c4736M9489 = c4743.m9489();
                AbstractC6988 abstractC6988M11996 = abstractC6529.m11996(AbstractC6526.f17873);
                if (abstractC6988M11996 != null) {
                    return AbstractC5143.m10138(c4736M9489.m9437(abstractC6988M11996, c4743), "Collection");
                }
                AbstractC6529.m11977(35);
                throw null;
            default:
                return AbstractC5143.m10138(c4743.m9489().m9437(abstractC6529.m11993("Array"), c4743), "Array");
        }
    }
}
