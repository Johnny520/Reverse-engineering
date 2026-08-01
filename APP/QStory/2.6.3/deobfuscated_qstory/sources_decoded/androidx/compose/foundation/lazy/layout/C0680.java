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
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5088;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0680 extends AbstractC2128 implements InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6543 f1898;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C0681 f1899;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0681 f1900 = new C0681(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1958 f1901;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f1902;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Orientation f1903;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0743 f1904;

    public C0680(InterfaceC6543 interfaceC6543, C0743 c0743, Orientation orientation, boolean z) {
        this.f1898 = interfaceC6543;
        this.f1904 = c0743;
        this.f1903 = orientation;
        this.f1902 = z;
        m1480();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m1480() {
        this.f1901 = new C1958(new C0685(this, 0), new C0685(this, 1));
        this.f1899 = this.f1902 ? new C0681(this, 0) : null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1294(InterfaceC1944 interfaceC1944) {
        AbstractC1946.m3643(interfaceC1944);
        interfaceC1944.mo3590(AbstractC1943.f5715, this.f1900);
        Orientation orientation = this.f1903;
        Orientation orientation2 = Orientation.Vertical;
        C1958 c1958 = this.f1901;
        if (orientation == orientation2) {
            if (c1958 == null) {
                AbstractC4395.m8908("scrollAxisRange");
                throw null;
            }
            C1947 c1947 = AbstractC1943.f5737;
            InterfaceC5088 interfaceC5088 = AbstractC1946.f5755[13];
            c1947.getClass();
            interfaceC1944.mo3590(c1947, c1958);
        } else {
            if (c1958 == null) {
                AbstractC4395.m8908("scrollAxisRange");
                throw null;
            }
            C1947 c19472 = AbstractC1943.f5740;
            InterfaceC5088 interfaceC50882 = AbstractC1946.f5755[12];
            c19472.getClass();
            interfaceC1944.mo3590(c19472, c1958);
        }
        C0681 c0681 = this.f1899;
        if (c0681 != null) {
            interfaceC1944.mo3590(AbstractC1959.f5788, new C1941(null, c0681));
        }
        AbstractC1946.m3648(interfaceC1944, new C0685(this, 2));
        C0743 c0743 = this.f1904;
        c0743.getClass();
        C1939 c1939 = new C1939(((Number) c0743.f2130.getValue()).intValue(), 1);
        C1947 c19473 = AbstractC1943.f5729;
        InterfaceC5088 interfaceC50883 = AbstractC1946.f5755[24];
        c19473.getClass();
        interfaceC1944.mo3590(c19473, c1939);
    }
}
