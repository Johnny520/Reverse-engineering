package androidx.compose.foundation.layout;

import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1473 implements InterfaceC1449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1449 f2127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1449 f2128;

    public C1473(C1472 c1472, C1472 c14722) {
        this.f2128 = c1472;
        this.f2127 = c14722;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1473)) {
            return false;
        }
        C1473 c1473 = (C1473) obj;
        return AbstractC5227.m9466(c1473.f2128, this.f2128) && AbstractC5227.m9466(c1473.f2127, this.f2127);
    }

    public final int hashCode() {
        return (this.f2127.hashCode() * 31) + this.f2128.hashCode();
    }

    public final String toString() {
        return "(" + this.f2128 + " + " + this.f2127 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1930(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return this.f2127.mo1930(interfaceC8725, layoutDirection) + this.f2128.mo1930(interfaceC8725, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1931(InterfaceC8725 interfaceC8725) {
        return this.f2127.mo1931(interfaceC8725) + this.f2128.mo1931(interfaceC8725);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1932(InterfaceC8725 interfaceC8725) {
        return this.f2127.mo1932(interfaceC8725) + this.f2128.mo1932(interfaceC8725);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1933(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return this.f2127.mo1933(interfaceC8725, layoutDirection) + this.f2128.mo1933(interfaceC8725, layoutDirection);
    }
}
