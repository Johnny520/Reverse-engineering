package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2016 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5953;

    public C2016(int i, int i2) {
        this.f5953 = i;
        this.f5952 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2016)) {
            return false;
        }
        C2016 c2016 = (C2016) obj;
        return this.f5953 == c2016.f5953 && this.f5952 == c2016.f5952;
    }

    public final int hashCode() {
        return (this.f5953 * 31) + this.f5952;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f5953);
        sb.append(", end=");
        return AbstractC0053.m156(sb, this.f5952, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1692(C2023 c2023) {
        int iM5090 = AbstractC2567.m5090(this.f5953, 0, ((C2019) c2023.f5963).m3720());
        int iM50902 = AbstractC2567.m5090(this.f5952, 0, ((C2019) c2023.f5963).m3720());
        if (iM5090 < iM50902) {
            c2023.m3727(iM5090, iM50902);
        } else {
            c2023.m3727(iM50902, iM5090);
        }
    }
}
