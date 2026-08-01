package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1243 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3603;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3604;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3605;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3606;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f3607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f3608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3609;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3610 = 1;

    public /* synthetic */ C1243(C1242 c1242, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.f3608 = c1242;
        this.f3609 = obj;
        this.f3605 = bool;
        this.f3604 = obj2;
        this.f3603 = obj3;
        this.f3606 = obj4;
        this.f3607 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3610;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f3607;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(i2) | 1;
                this.f3608.m2149(this.f3609, this.f3604, this.f3603, this.f3606, this.f3605, (InterfaceC1373) obj, iM2471);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM24712 = AbstractC1367.m2471(i2) | 1;
                this.f3608.m2145(this.f3609, (Boolean) this.f3605, this.f3604, this.f3603, this.f3606, (InterfaceC1373) obj, iM24712);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C1243(C1242 c1242, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3608 = c1242;
        this.f3609 = obj;
        this.f3604 = obj2;
        this.f3603 = obj3;
        this.f3606 = obj4;
        this.f3605 = obj5;
        this.f3607 = i;
    }
}
