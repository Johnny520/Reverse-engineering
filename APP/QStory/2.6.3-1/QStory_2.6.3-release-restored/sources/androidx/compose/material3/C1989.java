package androidx.compose.material3;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1989 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f3660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2962 f3661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f3662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3663 = 1;

    public /* synthetic */ C1989(AbstractC2363 abstractC2363, InterfaceC2962 interfaceC2962, long j, int i) {
        this.f3659 = abstractC2363;
        this.f3661 = interfaceC2962;
        this.f3662 = j;
        this.f3660 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3663;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f3659;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(49);
                AbstractC1988.m2581((C2378) obj3, this.f3661, this.f3662, (InterfaceC2208) obj, iM3031, this.f3660);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM30312 = AbstractC2202.m3031(this.f3660 | 1);
                AbstractC1988.m2582((AbstractC2363) obj3, this.f3661, this.f3662, (InterfaceC2208) obj, iM30312);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1989(C2378 c2378, InterfaceC2962 interfaceC2962, long j, int i, int i2) {
        this.f3659 = c2378;
        this.f3661 = interfaceC2962;
        this.f3662 = j;
        this.f3660 = i2;
    }
}
