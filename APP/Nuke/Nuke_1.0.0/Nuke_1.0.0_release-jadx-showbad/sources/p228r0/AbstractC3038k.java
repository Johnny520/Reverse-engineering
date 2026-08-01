package p228r0;

import android.view.RenderNode;

/* JADX INFO: renamed from: r0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3038k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m5305a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m5306b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m5307c(RenderNode renderNode, int i5) {
        renderNode.setAmbientShadowColor(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m5308d(RenderNode renderNode, int i5) {
        renderNode.setSpotShadowColor(i5);
    }
}
