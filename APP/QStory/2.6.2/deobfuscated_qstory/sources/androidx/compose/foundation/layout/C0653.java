package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0653 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f1825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1826;

    public C0653(InterfaceC0608 interfaceC0608, int i) {
        this.f1826 = interfaceC0608;
        this.f1825 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0653)) {
            return false;
        }
        C0653 c0653 = (C0653) obj;
        return AbstractC4394.m8917(this.f1826, c0653.f1826) && this.f1825 == c0653.f1825;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1825) + (this.f1826.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f1826);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = AbstractC0628.f1775;
        int i2 = this.f1825;
        if ((i2 & i) == i) {
            AbstractC0628.m1421(sb3, "Start");
        }
        int i3 = AbstractC0628.f1773;
        if ((i2 & i3) == i3) {
            AbstractC0628.m1421(sb3, "Left");
        }
        if ((i2 & 16) == 16) {
            AbstractC0628.m1421(sb3, "Top");
        }
        int i4 = AbstractC0628.f1772;
        if ((i2 & i4) == i4) {
            AbstractC0628.m1421(sb3, "End");
        }
        int i5 = AbstractC0628.f1769;
        if ((i2 & i5) == i5) {
            AbstractC0628.m1421(sb3, "Right");
        }
        if ((i2 & 32) == 32) {
            AbstractC0628.m1421(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1360(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 8 : 2) & this.f1825) != 0) {
            return this.f1826.mo1360(interfaceC7895, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1361(InterfaceC7895 interfaceC7895) {
        if ((this.f1825 & 16) != 0) {
            return this.f1826.mo1361(interfaceC7895);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1362(InterfaceC7895 interfaceC7895) {
        if ((this.f1825 & 32) != 0) {
            return this.f1826.mo1362(interfaceC7895);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1363(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 4 : 1) & this.f1825) != 0) {
            return this.f1826.mo1363(interfaceC7895, layoutDirection);
        }
        return 0;
    }
}
