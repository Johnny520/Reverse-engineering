package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0743;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲兰楪苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0684 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0743 f1911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Orientation f1912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6542 f1913;

    public C0684(InterfaceC6542 interfaceC6542, C0743 c0743, Orientation orientation, boolean z) {
        this.f1913 = interfaceC6542;
        this.f1911 = c0743;
        this.f1912 = orientation;
        this.f1910 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0684)) {
            return false;
        }
        C0684 c0684 = (C0684) obj;
        return this.f1913 == c0684.f1913 && AbstractC4394.m8917(this.f1911, c0684.f1911) && this.f1912 == c0684.f1912 && this.f1910 == c0684.f1910;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0053.m140((this.f1912.hashCode() + ((this.f1911.hashCode() + (this.f1913.hashCode() * 31)) * 31)) * 31, 31, this.f1910);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0680 c0680 = (C0680) abstractC2128;
        c0680.f1897 = this.f1913;
        c0680.f1903 = this.f1911;
        Orientation orientation = c0680.f1902;
        Orientation orientation2 = this.f1912;
        if (orientation != orientation2) {
            c0680.f1902 = orientation2;
            AbstractC1785.m3344(c0680);
        }
        boolean z = c0680.f1901;
        boolean z2 = this.f1910;
        if (z == z2) {
            return;
        }
        c0680.f1901 = z2;
        c0680.m1470();
        AbstractC1785.m3344(c0680);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C0680(this.f1913, this.f1911, this.f1912, this.f1910);
    }
}
