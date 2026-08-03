package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static int a(android.view.RenderNode r0) {
            int r0 = r0.getAmbientShadowColor()
            return r0
    }

    public static int b(android.view.RenderNode r0) {
            int r0 = r0.getSpotShadowColor()
            return r0
    }

    public static void c(android.view.RenderNode r0, int r1) {
            r0.setAmbientShadowColor(r1)
            return
    }

    public static void d(android.view.RenderNode r0, int r1) {
            r0.setSpotShadowColor(r1)
            return
    }
}
