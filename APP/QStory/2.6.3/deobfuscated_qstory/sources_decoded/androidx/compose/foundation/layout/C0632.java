package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0632 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0608 f1782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1783;

    public C0632(C0631 c0631, C0631 c06312) {
        this.f1783 = c0631;
        this.f1782 = c06312;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0632)) {
            return false;
        }
        C0632 c0632 = (C0632) obj;
        return AbstractC4395.m8907(c0632.f1783, this.f1783) && AbstractC4395.m8907(c0632.f1782, this.f1782);
    }

    public final int hashCode() {
        return (this.f1782.hashCode() * 31) + this.f1783.hashCode();
    }

    public final String toString() {
        return "(" + this.f1783 + " + " + this.f1782 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1370(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return this.f1782.mo1370(interfaceC7896, layoutDirection) + this.f1783.mo1370(interfaceC7896, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1371(InterfaceC7896 interfaceC7896) {
        return this.f1782.mo1371(interfaceC7896) + this.f1783.mo1371(interfaceC7896);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1372(InterfaceC7896 interfaceC7896) {
        return this.f1782.mo1372(interfaceC7896) + this.f1783.mo1372(interfaceC7896);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1373(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return this.f1782.mo1373(interfaceC7896, layoutDirection) + this.f1783.mo1373(interfaceC7896, layoutDirection);
    }
}
