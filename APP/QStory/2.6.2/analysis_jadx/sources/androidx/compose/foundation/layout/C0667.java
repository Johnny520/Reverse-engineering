package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p180.AbstractC7753;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏哲楪世兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏哲楪兰世;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0667 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f1850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f1851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f1852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f1853;

    public C0667(float f, float f2, float f3, float f4) {
        this.f1853 = f;
        this.f1851 = f2;
        this.f1852 = f3;
        this.f1850 = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC7753.m13083("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        C0667 c0667 = obj instanceof C0667 ? (C0667) obj : null;
        return c0667 != null && C7892.m13290(this.f1853, c0667.f1853) && C7892.m13290(this.f1851, c0667.f1851) && C7892.m13290(this.f1852, c0667.f1852) && C7892.m13290(this.f1850, c0667.f1850);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f1853) * 31, this.f1851, 31), this.f1852, 31), this.f1850, 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0668 c0668 = (C0668) abstractC2128;
        c0668.f1854 = this.f1853;
        c0668.f1858 = this.f1851;
        c0668.f1857 = this.f1852;
        c0668.f1856 = this.f1850;
        c0668.f1855 = true;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0668 c0668 = new C0668();
        c0668.f1854 = this.f1853;
        c0668.f1858 = this.f1851;
        c0668.f1857 = this.f1852;
        c0668.f1856 = this.f1850;
        c0668.f1855 = true;
        return c0668;
    }
}
