package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2016 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5952;

    public C2016(int i, int i2) {
        this.f5952 = i;
        this.f5951 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2016)) {
            return false;
        }
        C2016 c2016 = (C2016) obj;
        return this.f5952 == c2016.f5952 && this.f5951 == c2016.f5951;
    }

    public final int hashCode() {
        return (this.f5952 * 31) + this.f5951;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f5952);
        sb.append(", end=");
        return AbstractC0053.m154(sb, this.f5951, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1682(C2023 c2023) {
        int iM11420 = AbstractC6087.m11420(this.f5952, 0, ((C2019) c2023.f5962).m3710());
        int iM114202 = AbstractC6087.m11420(this.f5951, 0, ((C2019) c2023.f5962).m3710());
        if (iM11420 < iM114202) {
            c2023.m3717(iM11420, iM114202);
        } else {
            c2023.m3717(iM114202, iM11420);
        }
    }
}
