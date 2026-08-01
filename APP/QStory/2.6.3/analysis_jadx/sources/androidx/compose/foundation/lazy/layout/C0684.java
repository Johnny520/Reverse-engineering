package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0743;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲兰楪苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0684 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0743 f1912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Orientation f1913;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6543 f1914;

    public C0684(InterfaceC6543 interfaceC6543, C0743 c0743, Orientation orientation, boolean z) {
        this.f1914 = interfaceC6543;
        this.f1912 = c0743;
        this.f1913 = orientation;
        this.f1911 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0684)) {
            return false;
        }
        C0684 c0684 = (C0684) obj;
        return this.f1914 == c0684.f1914 && AbstractC4395.m8907(this.f1912, c0684.f1912) && this.f1913 == c0684.f1913 && this.f1911 == c0684.f1911;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0053.m141((this.f1913.hashCode() + ((this.f1912.hashCode() + (this.f1914.hashCode() * 31)) * 31)) * 31, 31, this.f1911);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0680 c0680 = (C0680) abstractC2128;
        c0680.f1898 = this.f1914;
        c0680.f1904 = this.f1912;
        Orientation orientation = c0680.f1903;
        Orientation orientation2 = this.f1913;
        if (orientation != orientation2) {
            c0680.f1903 = orientation2;
            AbstractC1785.m3354(c0680);
        }
        boolean z = c0680.f1902;
        boolean z2 = this.f1911;
        if (z == z2) {
            return;
        }
        c0680.f1902 = z2;
        c0680.m1480();
        AbstractC1785.m3354(c0680);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C0680(this.f1914, this.f1912, this.f1913, this.f1911);
    }
}
