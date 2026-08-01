package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import p195.AbstractC7834;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2006 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5912;

    public C2006(int i, int i2) {
        this.f5912 = i;
        this.f5911 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC7834.m13198("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2006)) {
            return false;
        }
        C2006 c2006 = (C2006) obj;
        return this.f5912 == c2006.f5912 && this.f5911 == c2006.f5911;
    }

    public final int hashCode() {
        return (this.f5912 * 31) + this.f5911;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f5912);
        sb.append(", lengthAfterCursor=");
        return AbstractC0053.m156(sb, this.f5911, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1692(C2023 c2023) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.f5912) {
                int i4 = i3 + 1;
                int i5 = c2023.f5964;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(c2023.m3731((i5 - i4) + (-1))) && Character.isLowSurrogate(c2023.m3731(c2023.f5964 - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iM3720 = 0;
        while (true) {
            if (i >= this.f5911) {
                break;
            }
            int i6 = iM3720 + 1;
            int i7 = c2023.f5965;
            C2019 c2019 = (C2019) c2023.f5963;
            if (i7 + i6 >= c2019.m3720()) {
                iM3720 = c2019.m3720() - c2023.f5965;
                break;
            } else {
                iM3720 = (Character.isHighSurrogate(c2023.m3731((c2023.f5965 + i6) + (-1))) && Character.isLowSurrogate(c2023.m3731(c2023.f5965 + i6))) ? iM3720 + 2 : i6;
                i++;
            }
        }
        int i8 = c2023.f5965;
        c2023.m3732(i8, iM3720 + i8);
        int i9 = c2023.f5964;
        c2023.m3732(i9 - i3, i9);
    }
}
