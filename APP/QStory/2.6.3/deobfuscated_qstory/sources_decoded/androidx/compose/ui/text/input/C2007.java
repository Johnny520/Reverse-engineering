package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import p195.AbstractC7834;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2007 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5914;

    public C2007(int i, int i2) {
        this.f5914 = i;
        this.f5913 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC7834.m13198("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2007)) {
            return false;
        }
        C2007 c2007 = (C2007) obj;
        return this.f5914 == c2007.f5914 && this.f5913 == c2007.f5913;
    }

    public final int hashCode() {
        return (this.f5914 * 31) + this.f5913;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f5914);
        sb.append(", lengthAfterCursor=");
        return AbstractC0053.m156(sb, this.f5913, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1692(C2023 c2023) {
        int i = c2023.f5965;
        C2019 c2019 = (C2019) c2023.f5963;
        int i2 = this.f5913;
        int iM3720 = i + i2;
        if (((i ^ iM3720) & (i2 ^ iM3720)) < 0) {
            iM3720 = c2019.m3720();
        }
        c2023.m3732(c2023.f5965, Math.min(iM3720, c2019.m3720()));
        int i3 = c2023.f5964;
        int i4 = this.f5914;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        c2023.m3732(Math.max(0, i5), c2023.f5964);
    }
}
