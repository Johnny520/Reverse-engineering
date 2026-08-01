package p305v1;

import android.view.RenderNode;

/* JADX INFO: renamed from: v1.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8786o0 {

    /* JADX INFO: renamed from: a */
    public static final C8786o0 f29295a = new C8786o0();

    /* JADX INFO: renamed from: a */
    public final int m33759a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public final int m33760b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public final void m33761c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m33762d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
