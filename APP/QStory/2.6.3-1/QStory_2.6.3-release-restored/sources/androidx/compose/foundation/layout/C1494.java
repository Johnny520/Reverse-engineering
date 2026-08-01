package androidx.compose.foundation.layout;

import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1494 implements InterfaceC1449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1449 f2172;

    public C1494(InterfaceC1449 interfaceC1449, int i) {
        this.f2172 = interfaceC1449;
        this.f2171 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1494)) {
            return false;
        }
        C1494 c1494 = (C1494) obj;
        return AbstractC5227.m9466(this.f2172, c1494.f2172) && this.f2171 == c1494.f2171;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2171) + (this.f2172.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f2172);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = AbstractC1469.f2121;
        int i2 = this.f2171;
        if ((i2 & i) == i) {
            AbstractC1469.m1991(sb3, "Start");
        }
        int i3 = AbstractC1469.f2119;
        if ((i2 & i3) == i3) {
            AbstractC1469.m1991(sb3, "Left");
        }
        if ((i2 & 16) == 16) {
            AbstractC1469.m1991(sb3, "Top");
        }
        int i4 = AbstractC1469.f2118;
        if ((i2 & i4) == i4) {
            AbstractC1469.m1991(sb3, "End");
        }
        int i5 = AbstractC1469.f2115;
        if ((i2 & i5) == i5) {
            AbstractC1469.m1991(sb3, "Right");
        }
        if ((i2 & 32) == 32) {
            AbstractC1469.m1991(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1930(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 8 : 2) & this.f2171) != 0) {
            return this.f2172.mo1930(interfaceC8725, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1931(InterfaceC8725 interfaceC8725) {
        if ((this.f2171 & 16) != 0) {
            return this.f2172.mo1931(interfaceC8725);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1932(InterfaceC8725 interfaceC8725) {
        if ((this.f2171 & 32) != 0) {
            return this.f2172.mo1932(interfaceC8725);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1933(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 4 : 1) & this.f2171) != 0) {
            return this.f2172.mo1933(interfaceC8725, layoutDirection);
        }
        return 0;
    }
}
