package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import p211.AbstractC8663;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2841 implements InterfaceC2839 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6259;

    public C2841(int i, int i2) {
        this.f6259 = i;
        this.f6258 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC8663.m13757("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2841)) {
            return false;
        }
        C2841 c2841 = (C2841) obj;
        return this.f6259 == c2841.f6259 && this.f6258 == c2841.f6258;
    }

    public final int hashCode() {
        return (this.f6259 * 31) + this.f6258;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f6259);
        sb.append(", lengthAfterCursor=");
        return AbstractC0900.m716(sb, this.f6258, ')');
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2839
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2252(C2857 c2857) {
        int i = c2857.f6310;
        C2853 c2853 = (C2853) c2857.f6308;
        int i2 = this.f6258;
        int iM4280 = i + i2;
        if (((i ^ iM4280) & (i2 ^ iM4280)) < 0) {
            iM4280 = c2853.m4280();
        }
        c2857.m4292(c2857.f6310, Math.min(iM4280, c2853.m4280()));
        int i3 = c2857.f6309;
        int i4 = this.f6259;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        c2857.m4292(Math.max(0, i5), c2857.f6309);
    }
}
