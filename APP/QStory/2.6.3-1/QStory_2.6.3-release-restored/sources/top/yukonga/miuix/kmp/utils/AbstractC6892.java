package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.node.InterfaceC2631;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5920;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6892 extends AbstractC2623 implements InterfaceC2631, InterfaceC2596, InterfaceC2599 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C6901 f16917 = new C6901();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public InterfaceC1421 f16918;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1416 f16919;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C6901 f16920;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f16921;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC2622 f16922;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C2462 f16923;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f16924 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC1933 f16925;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1421 f16926;

    public AbstractC6892(InterfaceC1421 interfaceC1421, InterfaceC1933 interfaceC1933) {
        this.f16926 = interfaceC1421;
        this.f16925 = interfaceC1933;
        this.f16918 = interfaceC1421;
        this.f16921 = interfaceC1421 == null && interfaceC1933 != null;
        this.f16920 = f16917;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static final void m11975(AbstractC6892 abstractC6892, InterfaceC6233 interfaceC6233, InterfaceC6284 interfaceC6284, InterfaceC7383 interfaceC7383) {
        abstractC6892.getClass();
        AbstractC6231.m11036(interfaceC6233, null, null, new AbstractPressableNode$launchAwaitingReset$1(interfaceC6284, interfaceC7383, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        C2462 c2462 = this.f16923;
        if (c2462 != null) {
            c2462.mo1784();
        }
        InterfaceC2622 interfaceC2622 = this.f16922;
        if (interfaceC2622 instanceof InterfaceC2631) {
            InterfaceC2631 interfaceC2631 = interfaceC2622 instanceof InterfaceC2631 ? (InterfaceC2631) interfaceC2622 : null;
            if (interfaceC2631 != null) {
                interfaceC2631.mo1784();
            }
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        c2487.getClass();
        pointerEventPass.getClass();
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (j2 >> 32));
        Float.floatToRawIntBits((int) (j2 & 4294967295L));
        m11977();
        if (this.f16923 == null) {
            C6893 c6893 = new C6893(this);
            C2487 c24872 = AbstractC2457.f5090;
            C2462 c2462 = new C2462(null, null, c6893);
            m3924(c2462);
            this.f16923 = c2462;
        }
        C2462 c24622 = this.f16923;
        if (c24622 != null) {
            c24622.mo1851(c2487, pointerEventPass, j);
        }
        InterfaceC2622 interfaceC2622 = this.f16922;
        if (interfaceC2622 instanceof InterfaceC2631) {
            ((InterfaceC2631) interfaceC2622).mo1851(c2487, pointerEventPass, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m11976() {
        C1416 c1416;
        InterfaceC1421 interfaceC1421 = this.f16926;
        if (interfaceC1421 != null && (c1416 = this.f16919) != null) {
            ((C1414) interfaceC1421).m1913(new C1413(c1416));
        }
        this.f16919 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final void m11977() {
        InterfaceC1933 interfaceC1933;
        if (this.f16922 == null && (interfaceC1933 = this.f16925) != null) {
            if (this.f16926 == null) {
                this.f16926 = new C1414();
            }
            InterfaceC1421 interfaceC1421 = this.f16926;
            interfaceC1421.getClass();
            InterfaceC2622 interfaceC2622Mo2504 = interfaceC1933.mo2504(interfaceC1421);
            m3924(interfaceC2622Mo2504);
            this.f16922 = interfaceC2622Mo2504;
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo2256() {
        return true;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        interfaceC2779.getClass();
        if (this.f16924) {
            return;
        }
        InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
        interfaceC2779.mo4150(AbstractC2778.f6097, C6008.f15084);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        m11976();
        if (this.f16918 == null) {
            this.f16926 = null;
        }
        InterfaceC2622 interfaceC2622 = this.f16922;
        if (interfaceC2622 != null) {
            m3928(interfaceC2622);
        }
        this.f16922 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        if (this.f16921) {
            return;
        }
        m11977();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1919() {
        return this.f16920;
    }
}
