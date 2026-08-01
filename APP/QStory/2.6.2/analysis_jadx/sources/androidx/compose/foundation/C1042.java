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
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1042 extends AbstractC1788 implements InterfaceC1783, InterfaceC1791 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f3064;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC1085 f3065;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1084 f3066;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC1084 f3067;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f3068;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC1787 f3069;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C0517 f3070;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC0580 f3071;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC0560 f3072;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f3073;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public Orientation f3074;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0513 f3075;

    @Override // androidx.compose.ui.node.InterfaceC1787
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo1863() {
        boolean zM1936 = m1936();
        if (this.f3064 != zM1936) {
            this.f3064 = zM1936;
            InterfaceC0513 interfaceC0513 = this.f3075;
            Orientation orientation = this.f3074;
            boolean z = this.f3068;
            m1938(z ? this.f3066 : this.f3067, this.f3072, orientation, interfaceC0513, this.f3071, z, this.f3073);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final boolean m1936() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (this.f6278) {
            layoutDirection = AbstractC1785.m3336(this).f5099;
        }
        return layoutDirection != LayoutDirection.Rtl || this.f3074 == Orientation.Vertical;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1937() {
        InterfaceC1787 interfaceC1787 = this.f3069;
        if (interfaceC1787 != null) {
            if (((AbstractC2128) interfaceC1787).f6291.f6278) {
                return;
            }
            m3354(interfaceC1787);
            return;
        }
        if (this.f3068) {
            AbstractC1785.m3334(this, new C1030(this, 1));
        }
        InterfaceC1084 interfaceC1084 = this.f3068 ? this.f3066 : this.f3067;
        if (interfaceC1084 != null) {
            InterfaceC1787 interfaceC1787Mo1947 = interfaceC1084.mo1947();
            if (((AbstractC2128) interfaceC1787Mo1947).f6291.f6278) {
                return;
            }
            m3354(interfaceC1787Mo1947);
            this.f3069 = interfaceC1787Mo1947;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m1938(InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, InterfaceC0513 interfaceC0513, InterfaceC0580 interfaceC0580, boolean z, boolean z2) {
        boolean z3;
        this.f3075 = interfaceC0513;
        this.f3074 = orientation;
        boolean z4 = true;
        if (this.f3068 != z) {
            this.f3068 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (AbstractC4394.m8917(this.f3067, interfaceC1084)) {
            z4 = false;
        } else {
            this.f3067 = interfaceC1084;
        }
        if (z3 || (z4 && !z)) {
            InterfaceC1787 interfaceC1787 = this.f3069;
            if (interfaceC1787 != null) {
                m3358(interfaceC1787);
            }
            this.f3069 = null;
            m1937();
        }
        this.f3073 = z2;
        this.f3072 = interfaceC0560;
        this.f3071 = interfaceC0580;
        boolean zM1936 = m1936();
        this.f3064 = zM1936;
        C0517 c0517 = this.f3070;
        if (c0517 != null) {
            c0517.m1282(this.f3068 ? this.f3066 : this.f3067, interfaceC0560, orientation, interfaceC0513, interfaceC0580, z2, zM1936);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        InterfaceC1787 interfaceC1787 = this.f3069;
        if (interfaceC1787 != null) {
            m3358(interfaceC1787);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        this.f3064 = m1936();
        m1937();
        if (this.f3070 == null) {
            InterfaceC0513 interfaceC0513 = this.f3075;
            C0517 c0517 = new C0517(this.f3068 ? this.f3066 : this.f3067, this.f3072, this.f3074, interfaceC0513, this.f3071, this.f3073, this.f3064);
            m3354(c0517);
            this.f3070 = c0517;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        InterfaceC1085 interfaceC1085 = (InterfaceC1085) AbstractC1785.m3346(this, AbstractC1081.f3210);
        if (AbstractC4394.m8917(interfaceC1085, this.f3065)) {
            return;
        }
        this.f3065 = interfaceC1085;
        this.f3066 = null;
        InterfaceC1787 interfaceC1787 = this.f3069;
        if (interfaceC1787 != null) {
            m3358(interfaceC1787);
        }
        this.f3069 = null;
        m1937();
        C0517 c0517 = this.f3070;
        if (c0517 != null) {
            InterfaceC0513 interfaceC0513 = this.f3075;
            Orientation orientation = this.f3074;
            c0517.m1282(this.f3068 ? this.f3066 : this.f3067, this.f3072, orientation, interfaceC0513, this.f3071, this.f3073, this.f3064);
        }
    }
}
