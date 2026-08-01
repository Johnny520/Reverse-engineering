package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1584;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2774;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2793;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1521 extends AbstractC2961 implements InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7372 f2243;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C1522 f2244;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1522 f2245 = new C1522(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2793 f2246;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f2247;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f2248;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C1584 f2249;

    public C1521(InterfaceC7372 interfaceC7372, C1584 c1584, Orientation orientation, boolean z) {
        this.f2243 = interfaceC7372;
        this.f2249 = c1584;
        this.f2248 = orientation;
        this.f2247 = z;
        m2040();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m2040() {
        this.f2246 = new C2793(new C1526(this, 0), new C1526(this, 1));
        this.f2244 = this.f2247 ? new C1522(this, 0) : null;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        AbstractC2781.m4203(interfaceC2779);
        interfaceC2779.mo4150(AbstractC2778.f6060, this.f2245);
        Orientation orientation = this.f2248;
        Orientation orientation2 = Orientation.Vertical;
        C2793 c2793 = this.f2246;
        if (orientation == orientation2) {
            if (c2793 == null) {
                AbstractC5227.m9467("scrollAxisRange");
                throw null;
            }
            C2782 c2782 = AbstractC2778.f6082;
            InterfaceC5920 interfaceC5920 = AbstractC2781.f6100[13];
            c2782.getClass();
            interfaceC2779.mo4150(c2782, c2793);
        } else {
            if (c2793 == null) {
                AbstractC5227.m9467("scrollAxisRange");
                throw null;
            }
            C2782 c27822 = AbstractC2778.f6085;
            InterfaceC5920 interfaceC59202 = AbstractC2781.f6100[12];
            c27822.getClass();
            interfaceC2779.mo4150(c27822, c2793);
        }
        C1522 c1522 = this.f2244;
        if (c1522 != null) {
            interfaceC2779.mo4150(AbstractC2794.f6133, new C2776(null, c1522));
        }
        AbstractC2781.m4208(interfaceC2779, new C1526(this, 2));
        C1584 c1584 = this.f2249;
        c1584.getClass();
        C2774 c2774 = new C2774(((Number) c1584.f2475.getValue()).intValue(), 1);
        C2782 c27823 = AbstractC2778.f6074;
        InterfaceC5920 interfaceC59203 = AbstractC2781.f6100[24];
        c27823.getClass();
        interfaceC2779.mo4150(c27823, c2774);
    }
}
