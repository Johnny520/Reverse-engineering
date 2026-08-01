package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2845 implements InterfaceC2839 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6281;

    public C2845(int i, int i2) {
        this.f6281 = i;
        this.f6280 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2845)) {
            return false;
        }
        C2845 c2845 = (C2845) obj;
        return this.f6281 == c2845.f6281 && this.f6280 == c2845.f6280;
    }

    public final int hashCode() {
        return (this.f6281 * 31) + this.f6280;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f6281);
        sb.append(", end=");
        return AbstractC0900.m716(sb, this.f6280, ')');
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2839
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2252(C2857 c2857) {
        boolean z = c2857.f6307 != -1;
        C2853 c2853 = (C2853) c2857.f6308;
        if (z) {
            c2857.f6307 = -1;
            c2857.f6306 = -1;
        }
        int iM5650 = AbstractC3400.m5650(this.f6281, 0, c2853.m4280());
        int iM56502 = AbstractC3400.m5650(this.f6280, 0, c2853.m4280());
        if (iM5650 != iM56502) {
            if (iM5650 < iM56502) {
                c2857.m4288(iM5650, iM56502);
            } else {
                c2857.m4288(iM56502, iM5650);
            }
        }
    }
}
