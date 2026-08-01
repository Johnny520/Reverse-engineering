package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0653 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f1826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1827;

    public C0653(InterfaceC0608 interfaceC0608, int i) {
        this.f1827 = interfaceC0608;
        this.f1826 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0653)) {
            return false;
        }
        C0653 c0653 = (C0653) obj;
        return AbstractC4395.m8907(this.f1827, c0653.f1827) && this.f1826 == c0653.f1826;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1826) + (this.f1827.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f1827);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = AbstractC0628.f1776;
        int i2 = this.f1826;
        if ((i2 & i) == i) {
            AbstractC0628.m1431(sb3, "Start");
        }
        int i3 = AbstractC0628.f1774;
        if ((i2 & i3) == i3) {
            AbstractC0628.m1431(sb3, "Left");
        }
        if ((i2 & 16) == 16) {
            AbstractC0628.m1431(sb3, "Top");
        }
        int i4 = AbstractC0628.f1773;
        if ((i2 & i4) == i4) {
            AbstractC0628.m1431(sb3, "End");
        }
        int i5 = AbstractC0628.f1770;
        if ((i2 & i5) == i5) {
            AbstractC0628.m1431(sb3, "Right");
        }
        if ((i2 & 32) == 32) {
            AbstractC0628.m1431(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1370(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 8 : 2) & this.f1826) != 0) {
            return this.f1827.mo1370(interfaceC7896, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1371(InterfaceC7896 interfaceC7896) {
        if ((this.f1826 & 16) != 0) {
            return this.f1827.mo1371(interfaceC7896);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1372(InterfaceC7896 interfaceC7896) {
        if ((this.f1826 & 32) != 0) {
            return this.f1827.mo1372(interfaceC7896);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1373(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 4 : 1) & this.f1826) != 0) {
            return this.f1827.mo1373(interfaceC7896, layoutDirection);
        }
        return 0;
    }
}
