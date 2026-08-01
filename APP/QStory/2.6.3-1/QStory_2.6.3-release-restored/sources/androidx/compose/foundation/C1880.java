package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C1358;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.gestures.InterfaceC1401;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1880 extends AbstractC2623 implements InterfaceC2618, InterfaceC2626 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f3410;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public InterfaceC1923 f3411;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1922 f3412;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC1922 f3413;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f3414;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public InterfaceC2622 f3415;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C1358 f3416;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC1421 f3417;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1401 f3418;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f3419;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public Orientation f3420;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1354 f3421;

    @Override // androidx.compose.p001ui.node.InterfaceC2622
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo2433() {
        boolean zM2506 = m2506();
        if (this.f3410 != zM2506) {
            this.f3410 = zM2506;
            InterfaceC1354 interfaceC1354 = this.f3421;
            Orientation orientation = this.f3420;
            boolean z = this.f3414;
            m2508(z ? this.f3412 : this.f3413, this.f3418, orientation, interfaceC1354, this.f3417, z, this.f3419);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final boolean m2506() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (this.f6624) {
            layoutDirection = AbstractC2620.m3906(this).f5445;
        }
        return layoutDirection != LayoutDirection.Rtl || this.f3420 == Orientation.Vertical;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m2507() {
        InterfaceC2622 interfaceC2622 = this.f3415;
        if (interfaceC2622 != null) {
            if (((AbstractC2961) interfaceC2622).f6637.f6624) {
                return;
            }
            m3924(interfaceC2622);
            return;
        }
        if (this.f3414) {
            AbstractC2620.m3904(this, new C1868(this, 1));
        }
        InterfaceC1922 interfaceC1922 = this.f3414 ? this.f3412 : this.f3413;
        if (interfaceC1922 != null) {
            InterfaceC2622 interfaceC2622Mo2517 = interfaceC1922.mo2517();
            if (((AbstractC2961) interfaceC2622Mo2517).f6637.f6624) {
                return;
            }
            m3924(interfaceC2622Mo2517);
            this.f3415 = interfaceC2622Mo2517;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m2508(InterfaceC1922 interfaceC1922, InterfaceC1401 interfaceC1401, Orientation orientation, InterfaceC1354 interfaceC1354, InterfaceC1421 interfaceC1421, boolean z, boolean z2) {
        boolean z3;
        this.f3421 = interfaceC1354;
        this.f3420 = orientation;
        boolean z4 = true;
        if (this.f3414 != z) {
            this.f3414 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (AbstractC5227.m9466(this.f3413, interfaceC1922)) {
            z4 = false;
        } else {
            this.f3413 = interfaceC1922;
        }
        if (z3 || (z4 && !z)) {
            InterfaceC2622 interfaceC2622 = this.f3415;
            if (interfaceC2622 != null) {
                m3928(interfaceC2622);
            }
            this.f3415 = null;
            m2507();
        }
        this.f3419 = z2;
        this.f3418 = interfaceC1401;
        this.f3417 = interfaceC1421;
        boolean zM2506 = m2506();
        this.f3410 = zM2506;
        C1358 c1358 = this.f3416;
        if (c1358 != null) {
            c1358.m1852(this.f3414 ? this.f3412 : this.f3413, interfaceC1401, orientation, interfaceC1354, interfaceC1421, z2, zM2506);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        InterfaceC2622 interfaceC2622 = this.f3415;
        if (interfaceC2622 != null) {
            m3928(interfaceC2622);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        this.f3410 = m2506();
        m2507();
        if (this.f3416 == null) {
            InterfaceC1354 interfaceC1354 = this.f3421;
            C1358 c1358 = new C1358(this.f3414 ? this.f3412 : this.f3413, this.f3418, this.f3420, interfaceC1354, this.f3417, this.f3419, this.f3410);
            m3924(c1358);
            this.f3416 = c1358;
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        InterfaceC1923 interfaceC1923 = (InterfaceC1923) AbstractC2620.m3916(this, AbstractC1919.f3556);
        if (AbstractC5227.m9466(interfaceC1923, this.f3411)) {
            return;
        }
        this.f3411 = interfaceC1923;
        this.f3412 = null;
        InterfaceC2622 interfaceC2622 = this.f3415;
        if (interfaceC2622 != null) {
            m3928(interfaceC2622);
        }
        this.f3415 = null;
        m2507();
        C1358 c1358 = this.f3416;
        if (c1358 != null) {
            InterfaceC1354 interfaceC1354 = this.f3421;
            Orientation orientation = this.f3420;
            c1358.m1852(this.f3414 ? this.f3412 : this.f3413, this.f3418, orientation, interfaceC1354, this.f3417, this.f3419, this.f3410);
        }
    }
}
