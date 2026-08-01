package androidx.compose.p001ui.draw;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2440;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/draw/飘花落叶言子楪哲兰世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final /* data */ class C2277 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters and from toString */
    public final long ambientColor;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters and from toString */
    public final boolean clip;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f4476;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2404 f4477;

    public C2277(InterfaceC2404 interfaceC2404, boolean z, long j, long j2) {
        this.f4477 = interfaceC2404;
        this.clip = z;
        this.f4476 = j;
        this.ambientColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2277)) {
            return false;
        }
        C2277 c2277 = (C2277) obj;
        return C8722.m13877(3.0f, 3.0f) && AbstractC5227.m9466(this.f4477, c2277.f4477) && this.clip == c2277.clip && C2434.m3509(this.f4476, c2277.f4476) && C2434.m3509(this.ambientColor, c2277.ambientColor);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701((this.f4477.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.clip);
        int i = C2434.f5044;
        return Long.hashCode(this.ambientColor) + AbstractC0900.m702(iM701, 31, this.f4476);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) C8722.m13876(3.0f));
        sb.append(", shape=");
        sb.append(this.f4477);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        AbstractC0900.m698(this.f4476, sb, ", spotColor=");
        sb.append((Object) C2434.m3514(this.ambientColor));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        AbstractC2629 abstractC2629;
        C2440 c2440 = (C2440) abstractC2961;
        ShadowGraphicsLayerElement$createBlock$1 shadowGraphicsLayerElement$createBlock$1 = new ShadowGraphicsLayerElement$createBlock$1(this);
        c2440.f5050 = shadowGraphicsLayerElement$createBlock$1;
        if (c2440.f6637.f6624 && (abstractC2629 = AbstractC2620.m3908(c2440, 2).f5602) != null) {
            abstractC2629.m3971(shadowGraphicsLayerElement$createBlock$1, true);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C2440(new ShadowGraphicsLayerElement$createBlock$1(this));
    }
}
