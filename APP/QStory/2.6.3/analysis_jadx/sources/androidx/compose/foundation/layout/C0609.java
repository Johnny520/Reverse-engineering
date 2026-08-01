package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0608 f1701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1702;

    public C0609(InterfaceC0608 interfaceC0608, InterfaceC0608 interfaceC06082) {
        this.f1702 = interfaceC0608;
        this.f1701 = interfaceC06082;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0609)) {
            return false;
        }
        C0609 c0609 = (C0609) obj;
        return AbstractC4395.m8907(c0609.f1702, this.f1702) && AbstractC4395.m8907(c0609.f1701, this.f1701);
    }

    public final int hashCode() {
        return (this.f1701.hashCode() * 31) + this.f1702.hashCode();
    }

    public final String toString() {
        return "(" + this.f1702 + " ∪ " + this.f1701 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1370(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return Math.max(this.f1702.mo1370(interfaceC7896, layoutDirection), this.f1701.mo1370(interfaceC7896, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1371(InterfaceC7896 interfaceC7896) {
        return Math.max(this.f1702.mo1371(interfaceC7896), this.f1701.mo1371(interfaceC7896));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1372(InterfaceC7896 interfaceC7896) {
        return Math.max(this.f1702.mo1372(interfaceC7896), this.f1701.mo1372(interfaceC7896));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1373(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return Math.max(this.f1702.mo1373(interfaceC7896, layoutDirection), this.f1701.mo1373(interfaceC7896, layoutDirection));
    }
}
