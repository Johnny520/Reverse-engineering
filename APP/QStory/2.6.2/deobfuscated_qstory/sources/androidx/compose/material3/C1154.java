package androidx.compose.material3;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.graphics.vector.C1543;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1154 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3313;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f3314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f3315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f3316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3317 = 1;

    public /* synthetic */ C1154(AbstractC1528 abstractC1528, InterfaceC2129 interfaceC2129, long j, int i) {
        this.f3313 = abstractC1528;
        this.f3315 = interfaceC2129;
        this.f3316 = j;
        this.f3314 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3317;
        C5175 c5175 = C5175.f14739;
        Object obj3 = this.f3313;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(49);
                AbstractC1153.m2011((C1543) obj3, this.f3315, this.f3316, (InterfaceC1373) obj, iM2460, this.f3314);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24602 = AbstractC1367.m2460(this.f3314 | 1);
                AbstractC1153.m2012((AbstractC1528) obj3, this.f3315, this.f3316, (InterfaceC1373) obj, iM24602);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C1154(C1543 c1543, InterfaceC2129 interfaceC2129, long j, int i, int i2) {
        this.f3313 = c1543;
        this.f3315 = interfaceC2129;
        this.f3316 = j;
        this.f3314 = i2;
    }
}
