package androidx.compose.foundation;

import androidx.activity.compose.C0002;
import androidx.activity.compose.C0004;
import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.foundation.lazy.layout.C0701;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.InterfaceC1782;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1791;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1024 extends AbstractC1788 implements InterfaceC1761, InterfaceC1782, InterfaceC1783, InterfaceC1791, InterfaceC1764 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C1086 f2994 = new C1086();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1452 f2995;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC1794 f2996;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0701 f2997;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0566 f2998;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC6557 f2999;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0580 f3000;

    public C1024(InterfaceC0580 interfaceC0580, int i, InterfaceC6557 interfaceC6557) {
        this.f3000 = interfaceC0580;
        this.f2999 = interfaceC6557;
        C1452 c1452 = new C1452(i, new FocusableNode$focusTargetNode$1(this), 10);
        m3354(c1452);
        this.f2995 = c1452;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m1916(InterfaceC0580 interfaceC0580) {
        C0566 c0566;
        if (AbstractC4394.m8917(this.f3000, interfaceC0580)) {
            return;
        }
        InterfaceC0580 interfaceC05802 = this.f3000;
        if (interfaceC05802 != null && (c0566 = this.f2998) != null) {
            ((C0573) interfaceC05802).m1343(new C0578(c0566));
        }
        this.f2998 = null;
        this.f3000 = interfaceC0580;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m1917(InterfaceC0580 interfaceC0580, InterfaceC0582 interfaceC0582) {
        if (!this.f6278) {
            ((C0573) interfaceC0580).m1343(interfaceC0582);
        } else {
            InterfaceC5451 interfaceC5451 = (InterfaceC5451) ((C5350) m3857()).f14921.get(C5452.f15105);
            AbstractC5398.m10473(m3857(), null, null, new FocusableNode$emitWithFallback$1(interfaceC0580, interfaceC0582, interfaceC5451 != null ? interfaceC5451.mo10554(new C0002(interfaceC0580, 6, interfaceC0582)) : null, null), 3);
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo1628(AbstractC1794 abstractC1794) {
        this.f2996 = abstractC1794;
        if (this.f2995.m2587().isFocused()) {
            boolean z = abstractC1794.mo3272().f6278;
            C1086 c1086 = AbstractC1023.f2993;
            if (!z) {
                if (this.f6278) {
                    AbstractC1785.m3351(this, c1086);
                }
            } else {
                AbstractC1794 abstractC17942 = this.f2996;
                if (abstractC17942 != null && abstractC17942.mo3272().f6278 && this.f6278) {
                    AbstractC1785.m3351(this, c1086);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        boolean zIsFocused = this.f2995.m2587().isFocused();
        InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
        C1947 c1947 = AbstractC1943.f5749;
        InterfaceC5087 interfaceC5087 = AbstractC1946.f5754[4];
        Boolean boolValueOf = Boolean.valueOf(zIsFocused);
        c1947.getClass();
        interfaceC1944.mo3580(c1947, boolValueOf);
        interfaceC1944.mo3580(AbstractC1959.f5795, new C1941(null, new FocusableNode$applySemantics$1(this)));
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1118() {
        C0701 c0701 = this.f2997;
        if (c0701 != null) {
            c0701.m1489();
        }
        this.f2997 = null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1764
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1349() {
        return f2994;
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1126() {
        C0701 c0701;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC1785.m3334(this, new C0004(ref$ObjectRef, 2, this));
        InterfaceC1710 interfaceC1710 = (InterfaceC1710) ref$ObjectRef.element;
        if (this.f2995.m2587().isFocused()) {
            C0701 c07012 = this.f2997;
            if (c07012 != null) {
                c07012.m1489();
            }
            if (interfaceC1710 != null) {
                c0701 = (C0701) interfaceC1710;
                c0701.m1490();
            } else {
                c0701 = null;
            }
            this.f2997 = c0701;
        }
    }
}
