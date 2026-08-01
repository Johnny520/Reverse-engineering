package androidx.compose.foundation.text.selection;

import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.InterfaceC2100;
import p205.C7905;
import p205.C7908;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0925 implements InterfaceC2100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC0918 f2631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f2632 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2118 f2633;

    public C0925(InterfaceC2118 interfaceC2118, InterfaceC0918 interfaceC0918) {
        this.f2633 = interfaceC2118;
        this.f2631 = interfaceC0918;
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo1626(C7905 c7905, long j, LayoutDirection layoutDirection, long j2) {
        long jMo1822 = this.f2631.mo1822();
        if ((9223372034707292159L & jMo1822) == 9205357640488583168L) {
            jMo1822 = this.f2632;
        }
        this.f2632 = jMo1822;
        return C7908.m13362(C7908.m13362(c7905.m13355(), AbstractC8190.m13681(jMo1822)), this.f2633.mo3859(j2, 0L, layoutDirection));
    }
}
