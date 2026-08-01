package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import p211.AbstractC8663;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2840 implements InterfaceC2839 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6257;

    public C2840(int i, int i2) {
        this.f6257 = i;
        this.f6256 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC8663.m13757("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2840)) {
            return false;
        }
        C2840 c2840 = (C2840) obj;
        return this.f6257 == c2840.f6257 && this.f6256 == c2840.f6256;
    }

    public final int hashCode() {
        return (this.f6257 * 31) + this.f6256;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f6257);
        sb.append(", lengthAfterCursor=");
        return AbstractC0900.m716(sb, this.f6256, ')');
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2839
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2252(C2857 c2857) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.f6257) {
                int i4 = i3 + 1;
                int i5 = c2857.f6309;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(c2857.m4291((i5 - i4) + (-1))) && Character.isLowSurrogate(c2857.m4291(c2857.f6309 - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iM4280 = 0;
        while (true) {
            if (i >= this.f6256) {
                break;
            }
            int i6 = iM4280 + 1;
            int i7 = c2857.f6310;
            C2853 c2853 = (C2853) c2857.f6308;
            if (i7 + i6 >= c2853.m4280()) {
                iM4280 = c2853.m4280() - c2857.f6310;
                break;
            } else {
                iM4280 = (Character.isHighSurrogate(c2857.m4291((c2857.f6310 + i6) + (-1))) && Character.isLowSurrogate(c2857.m4291(c2857.f6310 + i6))) ? iM4280 + 2 : i6;
                i++;
            }
        }
        int i8 = c2857.f6310;
        c2857.m4292(i8, iM4280 + i8);
        int i9 = c2857.f6309;
        c2857.m4292(i9 - i3, i9);
    }
}
