package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.lifecycle.InterfaceC2388;
import kotlin.C5176;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1244 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f3615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3616;

    public /* synthetic */ C1244(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f3616 = i2;
        this.f3612 = obj;
        this.f3614 = obj2;
        this.f3611 = obj3;
        this.f3613 = obj4;
        this.f3615 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3616;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f3615;
        Object obj3 = this.f3612;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(i2) | 1;
                ((C1242) obj3).m2143(this.f3614, this.f3611, this.f3613, (InterfaceC1373) obj, iM2471);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24712 = AbstractC1367.m2471(i2 | 1);
                AbstractC8190.m13689((Boolean) obj3, this.f3614, (InterfaceC2388) this.f3611, (InterfaceC6558) this.f3613, (InterfaceC1373) obj, iM24712);
                break;
        }
        return c5176;
    }
}
