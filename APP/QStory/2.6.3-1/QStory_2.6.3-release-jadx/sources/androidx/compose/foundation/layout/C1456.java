package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子哲楪世兰苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子哲楪苏兰世;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1456 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f2059;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f2060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f2061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f2062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f2063;

    public C1456(float f, float f2, float f3, float f4, boolean z) {
        this.f2063 = f;
        this.f2061 = f2;
        this.f2062 = f3;
        this.f2060 = f4;
        this.f2059 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1456)) {
            return false;
        }
        C1456 c1456 = (C1456) obj;
        return C8722.m13877(this.f2063, c1456.f2063) && C8722.m13877(this.f2061, c1456.f2061) && C8722.m13877(this.f2062, c1456.f2062) && C8722.m13877(this.f2060, c1456.f2060) && this.f2059 == c1456.f2059;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2059) + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f2063) * 31, this.f2061, 31), this.f2062, 31), this.f2060, 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1461 c1461 = (C1461) abstractC2961;
        c1461.f2071 = this.f2063;
        c1461.f2075 = this.f2061;
        c1461.f2074 = this.f2062;
        c1461.f2073 = this.f2060;
        c1461.f2072 = this.f2059;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1461 c1461 = new C1461();
        c1461.f2071 = this.f2063;
        c1461.f2075 = this.f2061;
        c1461.f2074 = this.f2062;
        c1461.f2073 = this.f2060;
        c1461.f2072 = this.f2059;
        return c1461;
    }

    public /* synthetic */ C1456(float f, float f2) {
        this(Float.NaN, f, Float.NaN, f2, true);
    }
}
