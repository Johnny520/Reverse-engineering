package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.C0541;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0742;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲苏兰世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0725 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0541 f2036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Orientation f2037;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0742 f2038;

    public C0725(C0742 c0742, C0541 c0541, Orientation orientation) {
        this.f2038 = c0742;
        this.f2036 = c0541;
        this.f2037 = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0725)) {
            return false;
        }
        C0725 c0725 = (C0725) obj;
        return AbstractC4395.m8907(this.f2038, c0725.f2038) && AbstractC4395.m8907(this.f2036, c0725.f2036) && this.f2037 == c0725.f2037;
    }

    public final int hashCode() {
        return this.f2037.hashCode() + AbstractC0053.m141((this.f2036.hashCode() + (this.f2038.hashCode() * 31)) * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0719 c0719 = (C0719) abstractC2128;
        c0719.f2024 = this.f2038;
        c0719.f2026 = this.f2036;
        c0719.f2025 = this.f2037;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0719 c0719 = new C0719();
        c0719.f2024 = this.f2038;
        c0719.f2026 = this.f2036;
        c0719.f2025 = this.f2037;
        return c0719;
    }
}
