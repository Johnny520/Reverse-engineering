package androidx.compose.foundation.text.selection;

import androidx.collection.C1123;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1724 implements InterfaceC1764 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C1720 f2859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2869 f2860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2861 = true;

    public C1724(C1720 c1720) {
        this.f2859 = c1720;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m2336(C2847 c2847, long j, boolean z, C1123 c1123) {
        C1720 c1720 = this.f2859;
        long jM2309 = C1720.m2309(c1720, c2847, j, z, false, c1123, false, null);
        if (!C2869.m4314(this.f2860, jM2309)) {
            this.f2861 = false;
        }
        c1720.m2322(C2869.m4312(jM2309) ? HandleState.Cursor : HandleState.Selection);
        return jM2309;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo2337(long j) {
        C1720 c1720 = this.f2859;
        C1781 c1781 = c1720.f2832;
        if (c1781 == null || c1781.m2425() == null || !c1720.m2327()) {
            return false;
        }
        c1720.f2836 = -1;
        C2303 c2303 = c1720.f2851;
        if (c2303 != null) {
            C2303.m3192(c2303);
        }
        m2336(c1720.m2319(), j, false, C1753.f2945);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo2338(long j, C1123 c1123) {
        C1781 c1781;
        C1720 c1720 = this.f2859;
        if (!c1720.m2327() || c1720.m2319().f6292.f6474.length() == 0 || (c1781 = c1720.f2832) == null || c1781.m2425() == null) {
            return false;
        }
        m2336(c1720.m2319(), j, false, c1123);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo2339(long j, C1123 c1123, int i) {
        C1781 c1781;
        C1720 c1720 = this.f2859;
        if (!c1720.m2327() || c1720.m2319().f6292.f6474.length() == 0 || (c1781 = c1720.f2832) == null || c1781.m2425() == null) {
            return false;
        }
        C2303 c2303 = c1720.f2851;
        if (c2303 != null) {
            C2303.m3192(c2303);
        }
        c1720.f2846 = j;
        c1720.f2836 = -1;
        c1720.m2334(true);
        long jM2336 = m2336(c1720.m2319(), c1720.f2846, true, c1123);
        if (i >= 2) {
            this.f2861 = true;
            this.f2860 = new C2869(jM2336);
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2340() {
        if (this.f2861) {
            C1720.m2310(this.f2859, this.f2860);
        }
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo2341(long j) {
        C1781 c1781;
        C1720 c1720 = this.f2859;
        if (!c1720.m2327() || c1720.m2319().f6292.f6474.length() == 0 || (c1781 = c1720.f2832) == null || c1781.m2425() == null) {
            return false;
        }
        m2336(c1720.m2319(), j, false, C1753.f2945);
        return true;
    }
}
