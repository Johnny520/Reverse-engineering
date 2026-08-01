package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import p195.AbstractC7833;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2007 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5913;

    public C2007(int i, int i2) {
        this.f5913 = i;
        this.f5912 = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        AbstractC7833.m13170("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2007)) {
            return false;
        }
        C2007 c2007 = (C2007) obj;
        return this.f5913 == c2007.f5913 && this.f5912 == c2007.f5912;
    }

    public final int hashCode() {
        return (this.f5913 * 31) + this.f5912;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f5913);
        sb.append(", lengthAfterCursor=");
        return AbstractC0053.m154(sb, this.f5912, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1682(C2023 c2023) {
        int i = c2023.f5964;
        C2019 c2019 = (C2019) c2023.f5962;
        int i2 = this.f5912;
        int iM3710 = i + i2;
        if (((i ^ iM3710) & (i2 ^ iM3710)) < 0) {
            iM3710 = c2019.m3710();
        }
        c2023.m3722(c2023.f5964, Math.min(iM3710, c2019.m3710()));
        int i3 = c2023.f5963;
        int i4 = this.f5913;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        c2023.m3722(Math.max(0, i5), c2023.f5963);
    }
}
