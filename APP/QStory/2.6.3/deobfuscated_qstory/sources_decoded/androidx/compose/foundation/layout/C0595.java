package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import p052.InterfaceC6558;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0595 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1724 f1672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1673;

    public /* synthetic */ C0595(AbstractC1724 abstractC1724, int i) {
        this.f1673 = i;
        this.f1672 = abstractC1724;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1673;
        C5176 c5176 = C5176.f14739;
        AbstractC1724 abstractC1724 = this.f1672;
        AbstractC1708 abstractC1708 = (AbstractC1708) obj;
        switch (i) {
            case 0:
                AbstractC1708.m3132(abstractC1708, abstractC1724, 0, 0);
                break;
            case 1:
                if (abstractC1708.mo3091() == LayoutDirection.Ltr || abstractC1708.mo3090() == 0) {
                    AbstractC1708.m3129(abstractC1708, abstractC1724);
                    abstractC1724.mo3128(C7908.m13362(0L, abstractC1724.f4995), 0.0f, null);
                } else {
                    long jMo3090 = ((long) (abstractC1708.mo3090() - abstractC1724.f4999)) << 32;
                    AbstractC1708.m3129(abstractC1708, abstractC1724);
                    abstractC1724.mo3128(C7908.m13362(jMo3090, abstractC1724.f4995), 0.0f, null);
                }
                break;
            case 2:
                AbstractC1708.m3132(abstractC1708, abstractC1724, 0, 0);
                break;
            case 3:
                abstractC1708.m3135(abstractC1724, 0, 0, 0.0f);
                break;
            default:
                abstractC1708.m3135(abstractC1724, 0, 0, 0.0f);
                break;
        }
        return c5176;
    }
}
