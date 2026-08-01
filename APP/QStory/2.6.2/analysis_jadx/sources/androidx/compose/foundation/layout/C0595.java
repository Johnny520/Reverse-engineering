package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import p052.InterfaceC6557;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0595 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1724 f1671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1672;

    public /* synthetic */ C0595(AbstractC1724 abstractC1724, int i) {
        this.f1672 = i;
        this.f1671 = abstractC1724;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1672;
        C5175 c5175 = C5175.f14739;
        AbstractC1724 abstractC1724 = this.f1671;
        AbstractC1708 abstractC1708 = (AbstractC1708) obj;
        switch (i) {
            case 0:
                AbstractC1708.m3122(abstractC1708, abstractC1724, 0, 0);
                break;
            case 1:
                if (abstractC1708.mo3081() == LayoutDirection.Ltr || abstractC1708.mo3080() == 0) {
                    AbstractC1708.m3119(abstractC1708, abstractC1724);
                    abstractC1724.mo3118(C7907.m13334(0L, abstractC1724.f4994), 0.0f, null);
                } else {
                    long jMo3080 = ((long) (abstractC1708.mo3080() - abstractC1724.f4998)) << 32;
                    AbstractC1708.m3119(abstractC1708, abstractC1724);
                    abstractC1724.mo3118(C7907.m13334(jMo3080, abstractC1724.f4994), 0.0f, null);
                }
                break;
            case 2:
                AbstractC1708.m3122(abstractC1708, abstractC1724, 0, 0);
                break;
            case 3:
                abstractC1708.m3125(abstractC1724, 0, 0, 0.0f);
                break;
            default:
                abstractC1708.m3125(abstractC1724, 0, 0, 0.0f);
                break;
        }
        return c5175;
    }
}
