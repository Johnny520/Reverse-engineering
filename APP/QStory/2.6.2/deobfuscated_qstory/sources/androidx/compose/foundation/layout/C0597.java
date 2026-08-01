package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0597 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0608 f1675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1676;

    public C0597(InterfaceC0608 interfaceC0608, InterfaceC0608 interfaceC06082) {
        this.f1676 = interfaceC0608;
        this.f1675 = interfaceC06082;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0597)) {
            return false;
        }
        C0597 c0597 = (C0597) obj;
        return AbstractC4394.m8917(c0597.f1676, this.f1676) && AbstractC4394.m8917(c0597.f1675, this.f1675);
    }

    public final int hashCode() {
        return this.f1675.hashCode() + (this.f1676.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f1676 + " - " + this.f1675 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo1360(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        int iMo1360 = this.f1676.mo1360(interfaceC7895, layoutDirection) - this.f1675.mo1360(interfaceC7895, layoutDirection);
        if (iMo1360 < 0) {
            return 0;
        }
        return iMo1360;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo1361(InterfaceC7895 interfaceC7895) {
        int iMo1361 = this.f1676.mo1361(interfaceC7895) - this.f1675.mo1361(interfaceC7895);
        if (iMo1361 < 0) {
            return 0;
        }
        return iMo1361;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1362(InterfaceC7895 interfaceC7895) {
        int iMo1362 = this.f1676.mo1362(interfaceC7895) - this.f1675.mo1362(interfaceC7895);
        if (iMo1362 < 0) {
            return 0;
        }
        return iMo1362;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo1363(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        int iMo1363 = this.f1676.mo1363(interfaceC7895, layoutDirection) - this.f1675.mo1363(interfaceC7895, layoutDirection);
        if (iMo1363 < 0) {
            return 0;
        }
        return iMo1363;
    }
}
