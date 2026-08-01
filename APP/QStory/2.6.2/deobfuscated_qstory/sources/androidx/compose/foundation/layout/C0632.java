package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0632 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0608 f1781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1782;

    public C0632(C0631 c0631, C0631 c06312) {
        this.f1782 = c0631;
        this.f1781 = c06312;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0632)) {
            return false;
        }
        C0632 c0632 = (C0632) obj;
        return AbstractC4394.m8917(c0632.f1782, this.f1782) && AbstractC4394.m8917(c0632.f1781, this.f1781);
    }

    public final int hashCode() {
        return (this.f1781.hashCode() * 31) + this.f1782.hashCode();
    }

    public final String toString() {
        return "(" + this.f1782 + " + " + this.f1781 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1360(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return this.f1781.mo1360(interfaceC7895, layoutDirection) + this.f1782.mo1360(interfaceC7895, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1361(InterfaceC7895 interfaceC7895) {
        return this.f1781.mo1361(interfaceC7895) + this.f1782.mo1361(interfaceC7895);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1362(InterfaceC7895 interfaceC7895) {
        return this.f1781.mo1362(interfaceC7895) + this.f1782.mo1362(interfaceC7895);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1363(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return this.f1781.mo1363(interfaceC7895, layoutDirection) + this.f1782.mo1363(interfaceC7895, layoutDirection);
    }
}
