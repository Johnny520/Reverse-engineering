package androidx.compose.foundation.text.selection;

import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.InterfaceC2100;
import p175.AbstractC7738;
import p205.C7904;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0925 implements InterfaceC2100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC0918 f2630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f2631 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2118 f2632;

    public C0925(InterfaceC2118 interfaceC2118, InterfaceC0918 interfaceC0918) {
        this.f2632 = interfaceC2118;
        this.f2630 = interfaceC0918;
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo1616(C7904 c7904, long j, LayoutDirection layoutDirection, long j2) {
        long jMo1812 = this.f2630.mo1812();
        if ((9223372034707292159L & jMo1812) == 9205357640488583168L) {
            jMo1812 = this.f2631;
        }
        this.f2631 = jMo1812;
        return C7907.m13334(C7907.m13334(c7904.m13327(), AbstractC7738.m13022(jMo1812)), this.f2632.mo3849(j2, 0L, layoutDirection));
    }
}
