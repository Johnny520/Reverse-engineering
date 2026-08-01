package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.core.view.C3058;
import p180.C8494;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1472 implements InterfaceC1449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f2125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f2124 = AbstractC2202.m3034(C8494.f21151);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f2123 = AbstractC2202.m3034(Boolean.TRUE);

    public C1472(int i, String str) {
        this.f2126 = i;
        this.f2125 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1472) {
            return this.f2126 == ((C1472) obj).f2126;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2126;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2125);
        sb.append('(');
        sb.append(m2007().f21155);
        sb.append(", ");
        sb.append(m2007().f21154);
        sb.append(", ");
        sb.append(m2007().f21153);
        sb.append(", ");
        return AbstractC0900.m716(sb, m2007().f21152, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2006(boolean z) {
        ((AbstractC2182) this.f2123).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8494 m2007() {
        return (C8494) ((AbstractC2182) this.f2124).getValue();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1930(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return m2007().f21155;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1931(InterfaceC8725 interfaceC8725) {
        return m2007().f21154;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1932(InterfaceC8725 interfaceC8725) {
        return m2007().f21152;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1933(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return m2007().f21153;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2008(C3058 c3058, int i) {
        int i2 = this.f2126;
        if (i == 0 || (i & i2) != 0) {
            ((AbstractC2182) this.f2124).setValue(c3058.f6866.mo4612(i2));
            m2006(c3058.f6866.mo4605(i2));
        }
    }
}
