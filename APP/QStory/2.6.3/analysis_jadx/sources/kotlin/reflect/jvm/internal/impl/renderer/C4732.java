package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.slf4j.Marker;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4732 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4744 f13814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13815;

    public /* synthetic */ C4732(C4744 c4744, int i) {
        this.f13815 = i;
        this.f13814 = c4744;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f13815;
        C4744 c4744 = this.f13814;
        switch (i) {
            case 0:
                AbstractC4870 abstractC4870 = (AbstractC4870) obj;
                abstractC4870.getClass();
                if (abstractC4870.mo9740()) {
                    return Marker.ANY_MARKER;
                }
                AbstractC4882 abstractC4882Mo9741 = abstractC4870.mo9741();
                abstractC4882Mo9741.getClass();
                String strM9486 = c4744.m9486(abstractC4882Mo9741);
                if (abstractC4870.mo9742() == Variance.INVARIANT) {
                    return strM9486;
                }
                return abstractC4870.mo9742() + ' ' + strM9486;
            default:
                AbstractC4882 abstractC4882 = (AbstractC4882) obj;
                abstractC4882.getClass();
                return c4744.m9486(abstractC4882);
        }
    }
}
