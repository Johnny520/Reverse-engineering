package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2011 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5936;

    public C2011(int i, int i2) {
        this.f5936 = i;
        this.f5935 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011)) {
            return false;
        }
        C2011 c2011 = (C2011) obj;
        return this.f5936 == c2011.f5936 && this.f5935 == c2011.f5935;
    }

    public final int hashCode() {
        return (this.f5936 * 31) + this.f5935;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f5936);
        sb.append(", end=");
        return AbstractC0053.m156(sb, this.f5935, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1692(C2023 c2023) {
        boolean z = c2023.f5962 != -1;
        C2019 c2019 = (C2019) c2023.f5963;
        if (z) {
            c2023.f5962 = -1;
            c2023.f5961 = -1;
        }
        int iM5090 = AbstractC2567.m5090(this.f5936, 0, c2019.m3720());
        int iM50902 = AbstractC2567.m5090(this.f5935, 0, c2019.m3720());
        if (iM5090 != iM50902) {
            if (iM5090 < iM50902) {
                c2023.m3728(iM5090, iM50902);
            } else {
                c2023.m3728(iM50902, iM5090);
            }
        }
    }
}
