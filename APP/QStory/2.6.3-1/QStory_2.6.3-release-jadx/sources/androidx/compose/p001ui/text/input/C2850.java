package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2850 implements InterfaceC2839 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6298;

    public C2850(int i, int i2) {
        this.f6298 = i;
        this.f6297 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2850)) {
            return false;
        }
        C2850 c2850 = (C2850) obj;
        return this.f6298 == c2850.f6298 && this.f6297 == c2850.f6297;
    }

    public final int hashCode() {
        return (this.f6298 * 31) + this.f6297;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f6298);
        sb.append(", end=");
        return AbstractC0900.m716(sb, this.f6297, ')');
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2839
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2252(C2857 c2857) {
        int iM5650 = AbstractC3400.m5650(this.f6298, 0, ((C2853) c2857.f6308).m4280());
        int iM56502 = AbstractC3400.m5650(this.f6297, 0, ((C2853) c2857.f6308).m4280());
        if (iM5650 < iM56502) {
            c2857.m4287(iM5650, iM56502);
        } else {
            c2857.m4287(iM56502, iM5650);
        }
    }
}
