package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p196.AbstractC8583;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏哲楪世兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏哲楪兰世;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1508 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f2196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f2197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f2198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f2199;

    public C1508(float f, float f2, float f3, float f4) {
        this.f2199 = f;
        this.f2197 = f2;
        this.f2198 = f3;
        this.f2196 = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            AbstractC8583.m13670("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        C1508 c1508 = obj instanceof C1508 ? (C1508) obj : null;
        return c1508 != null && C8722.m13877(this.f2199, c1508.f2199) && C8722.m13877(this.f2197, c1508.f2197) && C8722.m13877(this.f2198, c1508.f2198) && C8722.m13877(this.f2196, c1508.f2196);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f2199) * 31, this.f2197, 31), this.f2198, 31), this.f2196, 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1509 c1509 = (C1509) abstractC2961;
        c1509.f2200 = this.f2199;
        c1509.f2204 = this.f2197;
        c1509.f2203 = this.f2198;
        c1509.f2202 = this.f2196;
        c1509.f2201 = true;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1509 c1509 = new C1509();
        c1509.f2200 = this.f2199;
        c1509.f2204 = this.f2197;
        c1509.f2203 = this.f2198;
        c1509.f2202 = this.f2196;
        c1509.f2201 = true;
        return c1509;
    }
}
