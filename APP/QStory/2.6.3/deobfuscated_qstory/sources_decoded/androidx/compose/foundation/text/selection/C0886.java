package androidx.compose.foundation.text.selection;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0886 implements InterfaceC0926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2035 f2515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2516 = true;

    public C0886(C0882 c0882) {
        this.f2514 = c0882;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m1776(C2013 c2013, long j, boolean z, C0276 c0276) {
        C0882 c0882 = this.f2514;
        long jM1749 = C0882.m1749(c0882, c2013, j, z, false, c0276, false, null);
        if (!C2035.m3754(this.f2515, jM1749)) {
            this.f2516 = false;
        }
        c0882.m1762(C2035.m3752(jM1749) ? HandleState.Cursor : HandleState.Selection);
        return jM1749;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo1777(long j) {
        C0882 c0882 = this.f2514;
        C0943 c0943 = c0882.f2487;
        if (c0943 == null || c0943.m1865() == null || !c0882.m1767()) {
            return false;
        }
        c0882.f2491 = -1;
        C1468 c1468 = c0882.f2506;
        if (c1468 != null) {
            C1468.m2632(c1468);
        }
        m1776(c0882.m1759(), j, false, C0915.f2600);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo1778(long j, C0276 c0276) {
        C0943 c0943;
        C0882 c0882 = this.f2514;
        if (!c0882.m1767() || c0882.m1759().f5947.f6129.length() == 0 || (c0943 = c0882.f2487) == null || c0943.m1865() == null) {
            return false;
        }
        m1776(c0882.m1759(), j, false, c0276);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo1779(long j, C0276 c0276, int i) {
        C0943 c0943;
        C0882 c0882 = this.f2514;
        if (!c0882.m1767() || c0882.m1759().f5947.f6129.length() == 0 || (c0943 = c0882.f2487) == null || c0943.m1865() == null) {
            return false;
        }
        C1468 c1468 = c0882.f2506;
        if (c1468 != null) {
            C1468.m2632(c1468);
        }
        c0882.f2501 = j;
        c0882.f2491 = -1;
        c0882.m1774(true);
        long jM1776 = m1776(c0882.m1759(), c0882.f2501, true, c0276);
        if (i >= 2) {
            this.f2516 = true;
            this.f2515 = new C2035(jM1776);
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1780() {
        if (this.f2516) {
            C0882.m1750(this.f2514, this.f2515);
        }
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1781(long j) {
        C0943 c0943;
        C0882 c0882 = this.f2514;
        if (!c0882.m1767() || c0882.m1759().f5947.f6129.length() == 0 || (c0943 = c0882.f2487) == null || c0943.m1865() == null) {
            return false;
        }
        m1776(c0882.m1759(), j, false, C0915.f2600);
        return true;
    }
}
