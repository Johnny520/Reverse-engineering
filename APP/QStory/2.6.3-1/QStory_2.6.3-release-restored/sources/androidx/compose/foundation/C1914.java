package androidx.compose.foundation;

import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.text.selection.C1752;
import androidx.compose.foundation.text.selection.C1774;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.node.InterfaceC2617;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import p128.C8158;
import p221.C8732;
import p221.C8735;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1914 extends AbstractC2961 implements InterfaceC2617, InterfaceC2616, InterfaceC2596, InterfaceC2626 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C2197 f3540;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C6022 f3541;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C8735 f3542;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1752 f3543;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public InterfaceC1918 f3545;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public InterfaceC8725 f3546;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public View f3547;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1921 f3548;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1774 f3549;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final InterfaceC2230 f3544 = AbstractC2202.m3035(null, C2188.f4265);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f3539 = 9205357640488583168L;

    public C1914(C1752 c1752, C1774 c1774, InterfaceC1921 interfaceC1921) {
        this.f3543 = c1752;
        this.f3549 = c1774;
        this.f3548 = interfaceC1921;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m2554() {
        InterfaceC8725 interfaceC8725;
        InterfaceC1918 interfaceC1918 = this.f3545;
        if (interfaceC1918 == null || (interfaceC8725 = this.f3546) == null) {
            return;
        }
        C1920 c1920 = (C1920) interfaceC1918;
        if (C8735.m13917(this.f3542, c1920.m2559())) {
            return;
        }
        this.f3549.invoke(new C8732(interfaceC8725.mo1899(AbstractC1298.m1700(c1920.m2559()))));
        this.f3542 = new C8735(c1920.m2559());
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2617
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo2198(AbstractC2629 abstractC2629) {
        ((AbstractC2182) this.f3544).setValue(abstractC2629);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final long m2555() {
        if (this.f3540 == null) {
            this.f3540 = AbstractC2202.m3056(new C1916(this, 2));
        }
        C2197 c2197 = this.f3540;
        if (c2197 != null) {
            return ((C8158) c2197.getValue()).f19886;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m2556() {
        InterfaceC8725 interfaceC8725 = this.f3546;
        if (interfaceC8725 == null) {
            interfaceC8725 = AbstractC2620.m3906(this).f5444;
            this.f3546 = interfaceC8725;
        }
        long j = ((C8158) this.f3543.invoke(interfaceC8725)).f19886;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m2555()) == 9205357640488583168L) {
            this.f3539 = 9205357640488583168L;
            InterfaceC1918 interfaceC1918 = this.f3545;
            if (interfaceC1918 != null) {
                ((C1920) interfaceC1918).m2560();
                return;
            }
            return;
        }
        this.f3539 = C8158.m13084(m2555(), j);
        if (this.f3545 == null) {
            m2557();
        }
        InterfaceC1918 interfaceC19182 = this.f3545;
        if (interfaceC19182 != null) {
            interfaceC19182.mo2509(this.f3539, 9205357640488583168L);
        }
        m2554();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m2557() {
        InterfaceC1918 interfaceC1918 = this.f3545;
        if (interfaceC1918 != null) {
            ((C1920) interfaceC1918).m2560();
        }
        View viewM3897 = this.f3547;
        if (viewM3897 == null) {
            viewM3897 = AbstractC2620.m3897(this);
        }
        this.f3547 = viewM3897;
        InterfaceC8725 interfaceC8725 = this.f3546;
        if (interfaceC8725 == null) {
            interfaceC8725 = AbstractC2620.m3906(this).f5444;
        }
        this.f3546 = interfaceC8725;
        this.f3545 = this.f3548.mo2510(viewM3897, interfaceC8725);
        m2554();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        interfaceC2779.mo4150(AbstractC1913.f3538, new C1916(this, 1));
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        InterfaceC1918 interfaceC1918 = this.f3545;
        if (interfaceC1918 != null) {
            ((C1920) interfaceC1918).m2560();
        }
        this.f3545 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        mo1687();
        this.f3541 = AbstractC6037.m10841(0, 7, null);
        AbstractC6231.m11036(m4427(), null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        AbstractC2620.m3904(this, new C1916(this, 0));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        ((C2593) interfaceC2341).m3871();
        C6022 c6022 = this.f3541;
        if (c6022 != null) {
            c6022.mo8995(C6008.f15084);
        }
    }
}
