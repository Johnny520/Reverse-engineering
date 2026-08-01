package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0743;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1939;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1958;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0680 extends AbstractC2128 implements InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6542 f1897;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C0681 f1898;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0681 f1899 = new C0681(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1958 f1900;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f1901;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f1902;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0743 f1903;

    public C0680(InterfaceC6542 interfaceC6542, C0743 c0743, Orientation orientation, boolean z) {
        this.f1897 = interfaceC6542;
        this.f1903 = c0743;
        this.f1902 = orientation;
        this.f1901 = z;
        m1470();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m1470() {
        this.f1900 = new C1958(new C0685(this, 0), new C0685(this, 1));
        this.f1898 = this.f1901 ? new C0681(this, 0) : null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        AbstractC1946.m3633(interfaceC1944);
        interfaceC1944.mo3580(AbstractC1943.f5714, this.f1899);
        Orientation orientation = this.f1902;
        Orientation orientation2 = Orientation.Vertical;
        C1958 c1958 = this.f1900;
        if (orientation == orientation2) {
            if (c1958 == null) {
                AbstractC4394.m8918("scrollAxisRange");
                throw null;
            }
            C1947 c1947 = AbstractC1943.f5736;
            InterfaceC5087 interfaceC5087 = AbstractC1946.f5754[13];
            c1947.getClass();
            interfaceC1944.mo3580(c1947, c1958);
        } else {
            if (c1958 == null) {
                AbstractC4394.m8918("scrollAxisRange");
                throw null;
            }
            C1947 c19472 = AbstractC1943.f5739;
            InterfaceC5087 interfaceC50872 = AbstractC1946.f5754[12];
            c19472.getClass();
            interfaceC1944.mo3580(c19472, c1958);
        }
        C0681 c0681 = this.f1898;
        if (c0681 != null) {
            interfaceC1944.mo3580(AbstractC1959.f5787, new C1941(null, c0681));
        }
        AbstractC1946.m3638(interfaceC1944, new C0685(this, 2));
        C0743 c0743 = this.f1903;
        c0743.getClass();
        C1939 c1939 = new C1939(((Number) c0743.f2129.getValue()).intValue(), 1);
        C1947 c19473 = AbstractC1943.f5728;
        InterfaceC5087 interfaceC50873 = AbstractC1946.f5754[24];
        c19473.getClass();
        interfaceC1944.mo3580(c19473, c1939);
    }
}
