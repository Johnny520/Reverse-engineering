package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.slf4j.Marker;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4731 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4743 f13810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13811;

    public /* synthetic */ C4731(C4743 c4743, int i) {
        this.f13811 = i;
        this.f13810 = c4743;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f13811;
        C4743 c4743 = this.f13810;
        switch (i) {
            case 0:
                AbstractC4869 abstractC4869 = (AbstractC4869) obj;
                abstractC4869.getClass();
                if (abstractC4869.mo9750()) {
                    return Marker.ANY_MARKER;
                }
                AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
                abstractC4881Mo9751.getClass();
                String strM9496 = c4743.m9496(abstractC4881Mo9751);
                if (abstractC4869.mo9752() == Variance.INVARIANT) {
                    return strM9496;
                }
                return abstractC4869.mo9752() + ' ' + strM9496;
            default:
                AbstractC4881 abstractC4881 = (AbstractC4881) obj;
                abstractC4881.getClass();
                return c4743.m9496(abstractC4881);
        }
    }
}
