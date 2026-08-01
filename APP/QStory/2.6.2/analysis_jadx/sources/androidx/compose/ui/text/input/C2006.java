package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import p195.AbstractC7833;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2006 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5911;

    public C2006(int i, int i2) {
        this.f5911 = i;
        this.f5910 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC7833.m13170("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2006)) {
            return false;
        }
        C2006 c2006 = (C2006) obj;
        return this.f5911 == c2006.f5911 && this.f5910 == c2006.f5910;
    }

    public final int hashCode() {
        return (this.f5911 * 31) + this.f5910;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f5911);
        sb.append(", lengthAfterCursor=");
        return AbstractC0053.m154(sb, this.f5910, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1682(C2023 c2023) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.f5911) {
                int i4 = i3 + 1;
                int i5 = c2023.f5963;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(c2023.m3721((i5 - i4) + (-1))) && Character.isLowSurrogate(c2023.m3721(c2023.f5963 - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iM3710 = 0;
        while (true) {
            if (i >= this.f5910) {
                break;
            }
            int i6 = iM3710 + 1;
            int i7 = c2023.f5964;
            C2019 c2019 = (C2019) c2023.f5962;
            if (i7 + i6 >= c2019.m3710()) {
                iM3710 = c2019.m3710() - c2023.f5964;
                break;
            } else {
                iM3710 = (Character.isHighSurrogate(c2023.m3721((c2023.f5964 + i6) + (-1))) && Character.isLowSurrogate(c2023.m3721(c2023.f5964 + i6))) ? iM3710 + 2 : i6;
                i++;
            }
        }
        int i8 = c2023.f5964;
        c2023.m3722(i8, iM3710 + i8);
        int i9 = c2023.f5963;
        c2023.m3722(i9 - i3, i9);
    }
}
