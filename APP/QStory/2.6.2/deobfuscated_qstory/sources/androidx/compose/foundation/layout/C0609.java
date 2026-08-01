package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0608 f1700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1701;

    public C0609(InterfaceC0608 interfaceC0608, InterfaceC0608 interfaceC06082) {
        this.f1701 = interfaceC0608;
        this.f1700 = interfaceC06082;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0609)) {
            return false;
        }
        C0609 c0609 = (C0609) obj;
        return AbstractC4394.m8917(c0609.f1701, this.f1701) && AbstractC4394.m8917(c0609.f1700, this.f1700);
    }

    public final int hashCode() {
        return (this.f1700.hashCode() * 31) + this.f1701.hashCode();
    }

    public final String toString() {
        return "(" + this.f1701 + " ∪ " + this.f1700 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1360(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return Math.max(this.f1701.mo1360(interfaceC7895, layoutDirection), this.f1700.mo1360(interfaceC7895, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1361(InterfaceC7895 interfaceC7895) {
        return Math.max(this.f1701.mo1361(interfaceC7895), this.f1700.mo1361(interfaceC7895));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1362(InterfaceC7895 interfaceC7895) {
        return Math.max(this.f1701.mo1362(interfaceC7895), this.f1700.mo1362(interfaceC7895));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1363(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return Math.max(this.f1701.mo1363(interfaceC7895, layoutDirection), this.f1700.mo1363(interfaceC7895, layoutDirection));
    }
}
