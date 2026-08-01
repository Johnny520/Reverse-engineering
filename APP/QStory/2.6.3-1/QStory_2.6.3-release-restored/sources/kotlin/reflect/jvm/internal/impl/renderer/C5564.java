package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.slf4j.Marker;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5564 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5576 f14159;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14160;

    public /* synthetic */ C5564(C5576 c5576, int i) {
        this.f14160 = i;
        this.f14159 = c5576;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f14160;
        C5576 c5576 = this.f14159;
        switch (i) {
            case 0:
                AbstractC5702 abstractC5702 = (AbstractC5702) obj;
                abstractC5702.getClass();
                if (abstractC5702.mo10299()) {
                    return Marker.ANY_MARKER;
                }
                AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10300();
                abstractC5714Mo10300.getClass();
                String strM10045 = c5576.m10045(abstractC5714Mo10300);
                if (abstractC5702.mo10301() == Variance.INVARIANT) {
                    return strM10045;
                }
                return abstractC5702.mo10301() + ' ' + strM10045;
            default:
                AbstractC5714 abstractC5714 = (AbstractC5714) obj;
                abstractC5714.getClass();
                return c5576.m10045(abstractC5714);
        }
    }
}
