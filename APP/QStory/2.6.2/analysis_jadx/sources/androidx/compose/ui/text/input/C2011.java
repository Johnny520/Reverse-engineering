package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2011 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5935;

    public C2011(int i, int i2) {
        this.f5935 = i;
        this.f5934 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011)) {
            return false;
        }
        C2011 c2011 = (C2011) obj;
        return this.f5935 == c2011.f5935 && this.f5934 == c2011.f5934;
    }

    public final int hashCode() {
        return (this.f5935 * 31) + this.f5934;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f5935);
        sb.append(", end=");
        return AbstractC0053.m154(sb, this.f5934, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1682(C2023 c2023) {
        boolean z = c2023.f5961 != -1;
        C2019 c2019 = (C2019) c2023.f5962;
        if (z) {
            c2023.f5961 = -1;
            c2023.f5960 = -1;
        }
        int iM11420 = AbstractC6087.m11420(this.f5935, 0, c2019.m3710());
        int iM114202 = AbstractC6087.m11420(this.f5934, 0, c2019.m3710());
        if (iM11420 != iM114202) {
            if (iM11420 < iM114202) {
                c2023.m3718(iM11420, iM114202);
            } else {
                c2023.m3718(iM114202, iM11420);
            }
        }
    }
}
