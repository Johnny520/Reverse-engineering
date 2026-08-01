package androidx.compose.foundation.layout;

import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1438 implements InterfaceC1449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1449 f2021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1449 f2022;

    public C1438(InterfaceC1449 interfaceC1449, InterfaceC1449 interfaceC14492) {
        this.f2022 = interfaceC1449;
        this.f2021 = interfaceC14492;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1438)) {
            return false;
        }
        C1438 c1438 = (C1438) obj;
        return AbstractC5227.m9466(c1438.f2022, this.f2022) && AbstractC5227.m9466(c1438.f2021, this.f2021);
    }

    public final int hashCode() {
        return this.f2021.hashCode() + (this.f2022.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f2022 + " - " + this.f2021 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo1930(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        int iMo1930 = this.f2022.mo1930(interfaceC8725, layoutDirection) - this.f2021.mo1930(interfaceC8725, layoutDirection);
        if (iMo1930 < 0) {
            return 0;
        }
        return iMo1930;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo1931(InterfaceC8725 interfaceC8725) {
        int iMo1931 = this.f2022.mo1931(interfaceC8725) - this.f2021.mo1931(interfaceC8725);
        if (iMo1931 < 0) {
            return 0;
        }
        return iMo1931;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1932(InterfaceC8725 interfaceC8725) {
        int iMo1932 = this.f2022.mo1932(interfaceC8725) - this.f2021.mo1932(interfaceC8725);
        if (iMo1932 < 0) {
            return 0;
        }
        return iMo1932;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo1933(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        int iMo1933 = this.f2022.mo1933(interfaceC8725, layoutDirection) - this.f2021.mo1933(interfaceC8725, layoutDirection);
        if (iMo1933 < 0) {
            return 0;
        }
        return iMo1933;
    }
}
