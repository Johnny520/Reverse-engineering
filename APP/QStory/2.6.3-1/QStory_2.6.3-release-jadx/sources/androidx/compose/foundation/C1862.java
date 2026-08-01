package androidx.compose.foundation;

import androidx.activity.compose.C0849;
import androidx.activity.compose.C0851;
import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.foundation.lazy.layout.C1542;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.InterfaceC2617;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5920;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1862 extends AbstractC2623 implements InterfaceC2596, InterfaceC2617, InterfaceC2618, InterfaceC2626, InterfaceC2599 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C1924 f3340 = new C1924();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2287 f3341;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AbstractC2629 f3342;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1542 f3343;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1407 f3344;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC7387 f3345;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC1421 f3346;

    public C1862(InterfaceC1421 interfaceC1421, int i, InterfaceC7387 interfaceC7387) {
        this.f3346 = interfaceC1421;
        this.f3345 = interfaceC7387;
        C2287 c2287 = new C2287(i, new FocusableNode$focusTargetNode$1(this), 10);
        m3924(c2287);
        this.f3341 = c2287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void m2486(InterfaceC1421 interfaceC1421) {
        C1407 c1407;
        if (AbstractC5227.m9466(this.f3346, interfaceC1421)) {
            return;
        }
        InterfaceC1421 interfaceC14212 = this.f3346;
        if (interfaceC14212 != null && (c1407 = this.f3344) != null) {
            ((C1414) interfaceC14212).m1913(new C1419(c1407));
        }
        this.f3344 = null;
        this.f3346 = interfaceC1421;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m2487(InterfaceC1421 interfaceC1421, InterfaceC1423 interfaceC1423) {
        if (!this.f6624) {
            ((C1414) interfaceC1421).m1913(interfaceC1423);
        } else {
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) ((C6183) m4427()).f15266.get(C6285.f15450);
            AbstractC6231.m11036(m4427(), null, null, new FocusableNode$emitWithFallback$1(interfaceC1421, interfaceC1423, interfaceC6284 != null ? interfaceC6284.mo11118(new C0849(interfaceC1421, 6, interfaceC1423)) : null, null), 3);
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2617
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo2198(AbstractC2629 abstractC2629) {
        this.f3342 = abstractC2629;
        if (this.f3341.m3157().isFocused()) {
            boolean z = abstractC2629.mo3842().f6624;
            C1924 c1924 = AbstractC1861.f3339;
            if (!z) {
                if (this.f6624) {
                    AbstractC2620.m3921(this, c1924);
                }
            } else {
                AbstractC2629 abstractC26292 = this.f3342;
                if (abstractC26292 != null && abstractC26292.mo3842().f6624 && this.f6624) {
                    AbstractC2620.m3921(this, c1924);
                }
            }
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        boolean zIsFocused = this.f3341.m3157().isFocused();
        InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
        C2782 c2782 = AbstractC2778.f6095;
        InterfaceC5920 interfaceC5920 = AbstractC2781.f6100[4];
        Boolean boolValueOf = Boolean.valueOf(zIsFocused);
        c2782.getClass();
        interfaceC2779.mo4150(c2782, boolValueOf);
        interfaceC2779.mo4150(AbstractC2794.f6141, new C2776(null, new FocusableNode$applySemantics$1(this)));
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1679() {
        C1542 c1542 = this.f3343;
        if (c1542 != null) {
            c1542.m2059();
        }
        this.f3343 = null;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1919() {
        return f3340;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        C1542 c1542;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC2620.m3904(this, new C0851(ref$ObjectRef, 2, this));
        InterfaceC2545 interfaceC2545 = (InterfaceC2545) ref$ObjectRef.element;
        if (this.f3341.m3157().isFocused()) {
            C1542 c15422 = this.f3343;
            if (c15422 != null) {
                c15422.m2059();
            }
            if (interfaceC2545 != null) {
                c1542 = (C1542) interfaceC2545;
                c1542.m2060();
            } else {
                c1542 = null;
            }
            this.f3343 = c1542;
        }
    }
}
