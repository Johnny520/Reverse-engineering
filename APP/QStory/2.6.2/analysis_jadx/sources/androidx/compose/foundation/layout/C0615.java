package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子哲楪世兰苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子哲楪苏兰世;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0615 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f1713;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f1714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f1715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f1716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f1717;

    public C0615(float f, float f2, float f3, float f4, boolean z) {
        this.f1717 = f;
        this.f1715 = f2;
        this.f1716 = f3;
        this.f1714 = f4;
        this.f1713 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0615)) {
            return false;
        }
        C0615 c0615 = (C0615) obj;
        return C7892.m13290(this.f1717, c0615.f1717) && C7892.m13290(this.f1715, c0615.f1715) && C7892.m13290(this.f1716, c0615.f1716) && C7892.m13290(this.f1714, c0615.f1714) && this.f1713 == c0615.f1713;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1713) + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f1717) * 31, this.f1715, 31), this.f1716, 31), this.f1714, 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0620 c0620 = (C0620) abstractC2128;
        c0620.f1725 = this.f1717;
        c0620.f1729 = this.f1715;
        c0620.f1728 = this.f1716;
        c0620.f1727 = this.f1714;
        c0620.f1726 = this.f1713;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0620 c0620 = new C0620();
        c0620.f1725 = this.f1717;
        c0620.f1729 = this.f1715;
        c0620.f1728 = this.f1716;
        c0620.f1727 = this.f1714;
        c0620.f1726 = this.f1713;
        return c0620;
    }

    public /* synthetic */ C0615(float f, float f2) {
        this(Float.NaN, f, Float.NaN, f2, true);
    }
}
