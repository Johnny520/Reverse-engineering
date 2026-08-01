package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1453 implements InterfaceC1449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f2050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f2051;

    public C1453(C1512 c1512, String str) {
        this.f2051 = str;
        this.f2050 = AbstractC2202.m3034(c1512);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1453) {
            return AbstractC5227.m9466(m1938(), ((C1453) obj).m1938());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2051.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2051);
        sb.append("(left=");
        sb.append(m1938().f2213);
        sb.append(", top=");
        sb.append(m1938().f2212);
        sb.append(", right=");
        sb.append(m1938().f2211);
        sb.append(", bottom=");
        return AbstractC0900.m716(sb, m1938().f2210, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1937(C1512 c1512) {
        ((AbstractC2182) this.f2050).setValue(c1512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1512 m1938() {
        return (C1512) ((AbstractC2182) this.f2050).getValue();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1930(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return m1938().f2213;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1931(InterfaceC8725 interfaceC8725) {
        return m1938().f2212;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1932(InterfaceC8725 interfaceC8725) {
        return m1938().f2210;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1449
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1933(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection) {
        return m1938().f2211;
    }
}
