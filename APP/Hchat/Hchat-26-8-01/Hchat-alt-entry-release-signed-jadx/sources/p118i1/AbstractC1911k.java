package p118i1;

import android.view.RenderNode;

/* JADX INFO: renamed from: i1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1911k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m4762a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m4763b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m4764c(RenderNode renderNode, int i9) {
        renderNode.setAmbientShadowColor(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m4765d(RenderNode renderNode, int i9) {
        renderNode.setSpotShadowColor(i9);
    }
}
