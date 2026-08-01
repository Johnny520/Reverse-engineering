package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import androidx.lifecycle.InterfaceC3221;
import kotlin.C6008;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2079 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3956;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f3960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3961;

    public /* synthetic */ C2079(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f3961 = i2;
        this.f3957 = obj;
        this.f3959 = obj2;
        this.f3956 = obj3;
        this.f3958 = obj4;
        this.f3960 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3961;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f3960;
        Object obj3 = this.f3957;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(i2) | 1;
                ((C2077) obj3).m2703(this.f3959, this.f3956, this.f3958, (InterfaceC2208) obj, iM3031);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM30312 = AbstractC2202.m3031(i2 | 1);
                AbstractC9019.m14248((Boolean) obj3, this.f3959, (InterfaceC3221) this.f3956, (InterfaceC7387) this.f3958, (InterfaceC2208) obj, iM30312);
                break;
        }
        return c6008;
    }
}
