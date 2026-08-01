package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.node.InterfaceC1796;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6057 extends AbstractC1788 implements InterfaceC1796, InterfaceC1761, InterfaceC1764 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C6066 f16563 = new C6066();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC0580 f16564;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C0575 f16565;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C6066 f16566;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f16567;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC1787 f16568;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1627 f16569;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f16570 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC1095 f16571;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0580 f16572;

    public AbstractC6057(InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095) {
        this.f16572 = interfaceC0580;
        this.f16571 = interfaceC1095;
        this.f16564 = interfaceC0580;
        this.f16567 = interfaceC0580 == null && interfaceC1095 != null;
        this.f16566 = f16563;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static final void m11356(AbstractC6057 abstractC6057, InterfaceC5400 interfaceC5400, InterfaceC5451 interfaceC5451, InterfaceC6553 interfaceC6553) {
        abstractC6057.getClass();
        AbstractC5398.m10473(interfaceC5400, null, null, new AbstractPressableNode$launchAwaitingReset$1(interfaceC5451, interfaceC6553, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        C1627 c1627 = this.f16569;
        if (c1627 != null) {
            c1627.mo1214();
        }
        InterfaceC1787 interfaceC1787 = this.f16568;
        if (interfaceC1787 instanceof InterfaceC1796) {
            InterfaceC1796 interfaceC1796 = interfaceC1787 instanceof InterfaceC1796 ? (InterfaceC1796) interfaceC1787 : null;
            if (interfaceC1796 != null) {
                interfaceC1796.mo1214();
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        c1652.getClass();
        pointerEventPass.getClass();
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (j2 >> 32));
        Float.floatToRawIntBits((int) (j2 & 4294967295L));
        m11358();
        if (this.f16569 == null) {
            C6058 c6058 = new C6058(this);
            C1652 c16522 = AbstractC1622.f4744;
            C1627 c1627 = new C1627(null, null, c6058);
            m3354(c1627);
            this.f16569 = c1627;
        }
        C1627 c16272 = this.f16569;
        if (c16272 != null) {
            c16272.mo1281(c1652, pointerEventPass, j);
        }
        InterfaceC1787 interfaceC1787 = this.f16568;
        if (interfaceC1787 instanceof InterfaceC1796) {
            ((InterfaceC1796) interfaceC1787).mo1281(c1652, pointerEventPass, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m11357() {
        C0575 c0575;
        InterfaceC0580 interfaceC0580 = this.f16572;
        if (interfaceC0580 != null && (c0575 = this.f16565) != null) {
            ((C0573) interfaceC0580).m1343(new C0572(c0575));
        }
        this.f16565 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m11358() {
        InterfaceC1095 interfaceC1095;
        if (this.f16568 == null && (interfaceC1095 = this.f16571) != null) {
            if (this.f16572 == null) {
                this.f16572 = new C0573();
            }
            InterfaceC0580 interfaceC0580 = this.f16572;
            interfaceC0580.getClass();
            InterfaceC1787 interfaceC1787Mo1934 = interfaceC1095.mo1934(interfaceC0580);
            m3354(interfaceC1787Mo1934);
            this.f16568 = interfaceC1787Mo1934;
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo1686() {
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        interfaceC1944.getClass();
        if (this.f16570) {
            return;
        }
        InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
        interfaceC1944.mo3580(AbstractC1943.f5751, C5175.f14739);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        m11357();
        if (this.f16564 == null) {
            this.f16572 = null;
        }
        InterfaceC1787 interfaceC1787 = this.f16568;
        if (interfaceC1787 != null) {
            m3358(interfaceC1787);
        }
        this.f16568 = null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        if (this.f16567) {
            return;
        }
        m11358();
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1349() {
        return this.f16566;
    }
}
