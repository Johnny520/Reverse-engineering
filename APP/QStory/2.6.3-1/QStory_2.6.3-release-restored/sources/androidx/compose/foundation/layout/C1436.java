package androidx.compose.foundation.layout;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import p068.InterfaceC7387;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1436 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2559 f2017;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2018;

    public /* synthetic */ C1436(AbstractC2559 abstractC2559, int i) {
        this.f2018 = i;
        this.f2017 = abstractC2559;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2018;
        C6008 c6008 = C6008.f15084;
        AbstractC2559 abstractC2559 = this.f2017;
        AbstractC2543 abstractC2543 = (AbstractC2543) obj;
        switch (i) {
            case 0:
                AbstractC2543.m3692(abstractC2543, abstractC2559, 0, 0);
                break;
            case 1:
                if (abstractC2543.mo3651() == LayoutDirection.Ltr || abstractC2543.mo3650() == 0) {
                    AbstractC2543.m3689(abstractC2543, abstractC2559);
                    abstractC2559.mo3688(C8737.m13921(0L, abstractC2559.f5340), 0.0f, null);
                } else {
                    long jMo3650 = ((long) (abstractC2543.mo3650() - abstractC2559.f5344)) << 32;
                    AbstractC2543.m3689(abstractC2543, abstractC2559);
                    abstractC2559.mo3688(C8737.m13921(jMo3650, abstractC2559.f5340), 0.0f, null);
                }
                break;
            case 2:
                AbstractC2543.m3692(abstractC2543, abstractC2559, 0, 0);
                break;
            case 3:
                abstractC2543.m3695(abstractC2559, 0, 0, 0.0f);
                break;
            default:
                abstractC2543.m3695(abstractC2559, 0, 0, 0.0f);
                break;
        }
        return c6008;
    }
}
