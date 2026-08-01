package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0597 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0608 f1676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0608 f1677;

    public C0597(InterfaceC0608 interfaceC0608, InterfaceC0608 interfaceC06082) {
        this.f1677 = interfaceC0608;
        this.f1676 = interfaceC06082;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0597)) {
            return false;
        }
        C0597 c0597 = (C0597) obj;
        return AbstractC4395.m8907(c0597.f1677, this.f1677) && AbstractC4395.m8907(c0597.f1676, this.f1676);
    }

    public final int hashCode() {
        return this.f1676.hashCode() + (this.f1677.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f1677 + " - " + this.f1676 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo1370(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        int iMo1370 = this.f1677.mo1370(interfaceC7896, layoutDirection) - this.f1676.mo1370(interfaceC7896, layoutDirection);
        if (iMo1370 < 0) {
            return 0;
        }
        return iMo1370;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo1371(InterfaceC7896 interfaceC7896) {
        int iMo1371 = this.f1677.mo1371(interfaceC7896) - this.f1676.mo1371(interfaceC7896);
        if (iMo1371 < 0) {
            return 0;
        }
        return iMo1371;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1372(InterfaceC7896 interfaceC7896) {
        int iMo1372 = this.f1677.mo1372(interfaceC7896) - this.f1676.mo1372(interfaceC7896);
        if (iMo1372 < 0) {
            return 0;
        }
        return iMo1372;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo1373(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        int iMo1373 = this.f1677.mo1373(interfaceC7896, layoutDirection) - this.f1676.mo1373(interfaceC7896, layoutDirection);
        if (iMo1373 < 0) {
            return 0;
        }
        return iMo1373;
    }
}
