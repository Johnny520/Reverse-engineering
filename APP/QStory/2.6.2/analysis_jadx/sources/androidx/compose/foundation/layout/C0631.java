package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C2225;
import p164.C7664;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f1779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f1778 = AbstractC1367.m2465(C7664.f20811);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1777 = AbstractC1367.m2465(Boolean.TRUE);

    public C0631(int i, String str) {
        this.f1780 = i;
        this.f1779 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0631) {
            return this.f1780 == ((C0631) obj).f1780;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1780;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1779);
        sb.append('(');
        sb.append(m1437().f20815);
        sb.append(", ");
        sb.append(m1437().f20814);
        sb.append(", ");
        sb.append(m1437().f20813);
        sb.append(", ");
        return AbstractC0053.m154(sb, m1437().f20812, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1436(boolean z) {
        ((AbstractC1347) this.f1777).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7664 m1437() {
        return (C7664) ((AbstractC1347) this.f1778).getValue();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1360(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return m1437().f20815;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1361(InterfaceC7895 interfaceC7895) {
        return m1437().f20814;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1362(InterfaceC7895 interfaceC7895) {
        return m1437().f20812;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1363(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return m1437().f20813;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1438(C2225 c2225, int i) {
        int i2 = this.f1780;
        if (i == 0 || (i & i2) != 0) {
            ((AbstractC1347) this.f1778).setValue(c2225.f6520.mo4042(i2));
            m1436(c2225.f6520.mo4035(i2));
        }
    }
}
