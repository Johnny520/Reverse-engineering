package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.C0541;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0742;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲苏兰世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0725 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0541 f2035;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Orientation f2036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0742 f2037;

    public C0725(C0742 c0742, C0541 c0541, Orientation orientation) {
        this.f2037 = c0742;
        this.f2035 = c0541;
        this.f2036 = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0725)) {
            return false;
        }
        C0725 c0725 = (C0725) obj;
        return AbstractC4394.m8917(this.f2037, c0725.f2037) && AbstractC4394.m8917(this.f2035, c0725.f2035) && this.f2036 == c0725.f2036;
    }

    public final int hashCode() {
        return this.f2036.hashCode() + AbstractC0053.m140((this.f2035.hashCode() + (this.f2037.hashCode() * 31)) * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0719 c0719 = (C0719) abstractC2128;
        c0719.f2023 = this.f2037;
        c0719.f2025 = this.f2035;
        c0719.f2024 = this.f2036;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0719 c0719 = new C0719();
        c0719.f2023 = this.f2037;
        c0719.f2025 = this.f2035;
        c0719.f2024 = this.f2036;
        return c0719;
    }
}
