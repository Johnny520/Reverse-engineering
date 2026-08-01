package androidx.compose.foundation.layout;

import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1450 implements InterfaceC1449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1449 f2046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1449 f2047;

    public C1450(InterfaceC1449 interfaceC1449, InterfaceC1449 interfaceC14492) {
        this.f2047 = interfaceC1449;
        this.f2046 = interfaceC14492;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1450)) {
            return false;
        }
        C1450 c1450 = (C1450) obj;
        return AbstractC5227.m9466(c1450.f2047, this.f2047) && AbstractC5227.m9466(c1450.f2046, this.f2046);
    }

    public final int hashCode() {
        return (this.f2046.hashCode() * 31) + this.f2047.hashCode();
    }

    public final String toString() {
        return "(" + this.f2047 + " ∪ " + this.f2046 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1930(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return Math.max(this.f2047.mo1930(interfaceC8725, layoutDirection), this.f2046.mo1930(interfaceC8725, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1931(InterfaceC8725 interfaceC8725) {
        return Math.max(this.f2047.mo1931(interfaceC8725), this.f2046.mo1931(interfaceC8725));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1932(InterfaceC8725 interfaceC8725) {
        return Math.max(this.f2047.mo1932(interfaceC8725), this.f2046.mo1932(interfaceC8725));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1933(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return Math.max(this.f2047.mo1933(interfaceC8725, layoutDirection), this.f2046.mo1933(interfaceC8725, layoutDirection));
    }
}
