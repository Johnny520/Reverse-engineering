package androidx.compose.foundation.text.selection;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0886 implements InterfaceC0926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2035 f2514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2515 = true;

    public C0886(C0882 c0882) {
        this.f2513 = c0882;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m1766(C2013 c2013, long j, boolean z, C0276 c0276) {
        C0882 c0882 = this.f2513;
        long jM1739 = C0882.m1739(c0882, c2013, j, z, false, c0276, false, null);
        if (!C2035.m3744(this.f2514, jM1739)) {
            this.f2515 = false;
        }
        c0882.m1752(C2035.m3742(jM1739) ? HandleState.Cursor : HandleState.Selection);
        return jM1739;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo1767(long j) {
        C0882 c0882 = this.f2513;
        C0943 c0943 = c0882.f2486;
        if (c0943 == null || c0943.m1855() == null || !c0882.m1757()) {
            return false;
        }
        c0882.f2490 = -1;
        C1468 c1468 = c0882.f2505;
        if (c1468 != null) {
            C1468.m2622(c1468);
        }
        m1766(c0882.m1749(), j, false, C0915.f2599);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo1768(long j, C0276 c0276) {
        C0943 c0943;
        C0882 c0882 = this.f2513;
        if (!c0882.m1757() || c0882.m1749().f5946.f6128.length() == 0 || (c0943 = c0882.f2486) == null || c0943.m1855() == null) {
            return false;
        }
        m1766(c0882.m1749(), j, false, c0276);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo1769(long j, C0276 c0276, int i) {
        C0943 c0943;
        C0882 c0882 = this.f2513;
        if (!c0882.m1757() || c0882.m1749().f5946.f6128.length() == 0 || (c0943 = c0882.f2486) == null || c0943.m1855() == null) {
            return false;
        }
        C1468 c1468 = c0882.f2505;
        if (c1468 != null) {
            C1468.m2622(c1468);
        }
        c0882.f2500 = j;
        c0882.f2490 = -1;
        c0882.m1764(true);
        long jM1766 = m1766(c0882.m1749(), c0882.f2500, true, c0276);
        if (i >= 2) {
            this.f2515 = true;
            this.f2514 = new C2035(jM1766);
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1770() {
        if (this.f2515) {
            C0882.m1740(this.f2513, this.f2514);
        }
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC0926
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1771(long j) {
        C0943 c0943;
        C0882 c0882 = this.f2513;
        if (!c0882.m1757() || c0882.m1749().f5946.f6128.length() == 0 || (c0943 = c0882.f2486) == null || c0943.m1855() == null) {
            return false;
        }
        m1766(c0882.m1749(), j, false, C0915.f2599);
        return true;
    }
}
