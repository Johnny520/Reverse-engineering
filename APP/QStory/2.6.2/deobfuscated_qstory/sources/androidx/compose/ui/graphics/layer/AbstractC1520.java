package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1520 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m2790(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m2791(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m2792(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m2793(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }
}
