package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C2225;
import p164.C7665;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f1780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f1781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f1779 = AbstractC1367.m2474(C7665.f20806);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1778 = AbstractC1367.m2474(Boolean.TRUE);

    public C0631(int i, String str) {
        this.f1781 = i;
        this.f1780 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0631) {
            return this.f1781 == ((C0631) obj).f1781;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1781;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1780);
        sb.append('(');
        sb.append(m1447().f20810);
        sb.append(", ");
        sb.append(m1447().f20809);
        sb.append(", ");
        sb.append(m1447().f20808);
        sb.append(", ");
        return AbstractC0053.m156(sb, m1447().f20807, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1446(boolean z) {
        ((AbstractC1347) this.f1778).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7665 m1447() {
        return (C7665) ((AbstractC1347) this.f1779).getValue();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1370(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return m1447().f20810;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1371(InterfaceC7896 interfaceC7896) {
        return m1447().f20809;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1372(InterfaceC7896 interfaceC7896) {
        return m1447().f20807;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1373(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return m1447().f20808;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1448(C2225 c2225, int i) {
        int i2 = this.f1781;
        if (i == 0 || (i & i2) != 0) {
            ((AbstractC1347) this.f1779).setValue(c2225.f6521.mo4052(i2));
            m1446(c2225.f6521.mo4045(i2));
        }
    }
}
