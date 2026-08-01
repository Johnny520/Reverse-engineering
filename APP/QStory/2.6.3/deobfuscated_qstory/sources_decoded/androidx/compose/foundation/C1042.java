package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0517;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.gestures.InterfaceC0560;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1042 extends AbstractC1788 implements InterfaceC1783, InterfaceC1791 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f3065;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC1085 f3066;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1084 f3067;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC1084 f3068;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f3069;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC1787 f3070;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C0517 f3071;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC0580 f3072;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC0560 f3073;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f3074;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public Orientation f3075;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0513 f3076;

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo1873() {
        boolean zM1946 = m1946();
        if (this.f3065 != zM1946) {
            this.f3065 = zM1946;
            InterfaceC0513 interfaceC0513 = this.f3076;
            Orientation orientation = this.f3075;
            boolean z = this.f3069;
            m1948(z ? this.f3067 : this.f3068, this.f3073, orientation, interfaceC0513, this.f3072, z, this.f3074);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final boolean m1946() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (this.f6279) {
            layoutDirection = AbstractC1785.m3346(this).f5100;
        }
        return layoutDirection != LayoutDirection.Rtl || this.f3075 == Orientation.Vertical;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1947() {
        InterfaceC1787 interfaceC1787 = this.f3070;
        if (interfaceC1787 != null) {
            if (((AbstractC2128) interfaceC1787).f6292.f6279) {
                return;
            }
            m3364(interfaceC1787);
            return;
        }
        if (this.f3069) {
            AbstractC1785.m3344(this, new C1030(this, 1));
        }
        InterfaceC1084 interfaceC1084 = this.f3069 ? this.f3067 : this.f3068;
        if (interfaceC1084 != null) {
            InterfaceC1787 interfaceC1787Mo1957 = interfaceC1084.mo1957();
            if (((AbstractC2128) interfaceC1787Mo1957).f6292.f6279) {
                return;
            }
            m3364(interfaceC1787Mo1957);
            this.f3070 = interfaceC1787Mo1957;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m1948(InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, InterfaceC0513 interfaceC0513, InterfaceC0580 interfaceC0580, boolean z, boolean z2) {
        boolean z3;
        this.f3076 = interfaceC0513;
        this.f3075 = orientation;
        boolean z4 = true;
        if (this.f3069 != z) {
            this.f3069 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (AbstractC4395.m8907(this.f3068, interfaceC1084)) {
            z4 = false;
        } else {
            this.f3068 = interfaceC1084;
        }
        if (z3 || (z4 && !z)) {
            InterfaceC1787 interfaceC1787 = this.f3070;
            if (interfaceC1787 != null) {
                m3368(interfaceC1787);
            }
            this.f3070 = null;
            m1947();
        }
        this.f3074 = z2;
        this.f3073 = interfaceC0560;
        this.f3072 = interfaceC0580;
        boolean zM1946 = m1946();
        this.f3065 = zM1946;
        C0517 c0517 = this.f3071;
        if (c0517 != null) {
            c0517.m1292(this.f3069 ? this.f3067 : this.f3068, interfaceC0560, orientation, interfaceC0513, interfaceC0580, z2, zM1946);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        InterfaceC1787 interfaceC1787 = this.f3070;
        if (interfaceC1787 != null) {
            m3368(interfaceC1787);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        this.f3065 = m1946();
        m1947();
        if (this.f3071 == null) {
            InterfaceC0513 interfaceC0513 = this.f3076;
            C0517 c0517 = new C0517(this.f3069 ? this.f3067 : this.f3068, this.f3073, this.f3075, interfaceC0513, this.f3072, this.f3074, this.f3065);
            m3364(c0517);
            this.f3071 = c0517;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1127() {
        InterfaceC1085 interfaceC1085 = (InterfaceC1085) AbstractC1785.m3356(this, AbstractC1081.f3211);
        if (AbstractC4395.m8907(interfaceC1085, this.f3066)) {
            return;
        }
        this.f3066 = interfaceC1085;
        this.f3067 = null;
        InterfaceC1787 interfaceC1787 = this.f3070;
        if (interfaceC1787 != null) {
            m3368(interfaceC1787);
        }
        this.f3070 = null;
        m1947();
        C0517 c0517 = this.f3071;
        if (c0517 != null) {
            InterfaceC0513 interfaceC0513 = this.f3076;
            Orientation orientation = this.f3075;
            c0517.m1292(this.f3069 ? this.f3067 : this.f3068, this.f3073, orientation, interfaceC0513, this.f3072, this.f3074, this.f3065);
        }
    }
}
