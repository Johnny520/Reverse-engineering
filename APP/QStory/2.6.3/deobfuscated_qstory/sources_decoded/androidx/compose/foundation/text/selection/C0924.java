package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0924 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2626;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2630 = 0;

    public /* synthetic */ C0924(InterfaceC2129 interfaceC2129, InterfaceC6543 interfaceC6543, boolean z, int i) {
        this.f2627 = interfaceC2129;
        this.f2626 = interfaceC6543;
        this.f2628 = z;
        this.f2629 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2630;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f2629;
        Object obj3 = this.f2626;
        Object obj4 = this.f2627;
        boolean z = this.f2628;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0895.m1804((InterfaceC2129) obj4, (InterfaceC6543) obj3, z, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0895.m1802(z, (ResolvedTextDirection) obj4, (C0882) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0924(boolean z, ResolvedTextDirection resolvedTextDirection, C0882 c0882, int i) {
        this.f2628 = z;
        this.f2627 = resolvedTextDirection;
        this.f2626 = c0882;
        this.f2629 = i;
    }
}
