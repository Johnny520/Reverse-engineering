package androidx.compose.ui.draw;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1605;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/飘花落叶言子楪哲兰世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C1442 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters and from toString */
    public final long ambientColor;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters and from toString */
    public final boolean clip;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f4131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1569 f4132;

    public C1442(InterfaceC1569 interfaceC1569, boolean z, long j, long j2) {
        this.f4132 = interfaceC1569;
        this.clip = z;
        this.f4131 = j;
        this.ambientColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1442)) {
            return false;
        }
        C1442 c1442 = (C1442) obj;
        return C7893.m13318(3.0f, 3.0f) && AbstractC4395.m8907(this.f4132, c1442.f4132) && this.clip == c1442.clip && C1599.m2949(this.f4131, c1442.f4131) && C1599.m2949(this.ambientColor, c1442.ambientColor);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141((this.f4132.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.clip);
        int i = C1599.f4699;
        return Long.hashCode(this.ambientColor) + AbstractC0053.m142(iM141, 31, this.f4131);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) C7893.m13317(3.0f));
        sb.append(", shape=");
        sb.append(this.f4132);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        AbstractC0053.m138(this.f4131, sb, ", spotColor=");
        sb.append((Object) C1599.m2954(this.ambientColor));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        AbstractC1794 abstractC1794;
        C1605 c1605 = (C1605) abstractC2128;
        ShadowGraphicsLayerElement$createBlock$1 shadowGraphicsLayerElement$createBlock$1 = new ShadowGraphicsLayerElement$createBlock$1(this);
        c1605.f4705 = shadowGraphicsLayerElement$createBlock$1;
        if (c1605.f6292.f6279 && (abstractC1794 = AbstractC1785.m3348(c1605, 2).f5257) != null) {
            abstractC1794.m3411(shadowGraphicsLayerElement$createBlock$1, true);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1605(new ShadowGraphicsLayerElement$createBlock$1(this));
    }
}
