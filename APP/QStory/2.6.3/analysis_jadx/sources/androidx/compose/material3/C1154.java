package androidx.compose.material3;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.graphics.vector.C1543;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1154 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3314;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f3315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f3316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f3317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3318 = 1;

    public /* synthetic */ C1154(AbstractC1528 abstractC1528, InterfaceC2129 interfaceC2129, long j, int i) {
        this.f3314 = abstractC1528;
        this.f3316 = interfaceC2129;
        this.f3317 = j;
        this.f3315 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3318;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f3314;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(49);
                AbstractC1153.m2021((C1543) obj3, this.f3316, this.f3317, (InterfaceC1373) obj, iM2471, this.f3315);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24712 = AbstractC1367.m2471(this.f3315 | 1);
                AbstractC1153.m2022((AbstractC1528) obj3, this.f3316, this.f3317, (InterfaceC1373) obj, iM24712);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C1154(C1543 c1543, InterfaceC2129 interfaceC2129, long j, int i, int i2) {
        this.f3314 = c1543;
        this.f3316 = interfaceC2129;
        this.f3317 = j;
        this.f3315 = i2;
    }
}
