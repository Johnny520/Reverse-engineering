package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static android.widget.EdgeEffect a(android.content.Context r2) {
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L7
            r1 = 0
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            r0.<init>(r2)
            return r0
    }

    public static float b(android.widget.EdgeEffect r0) {
            float r0 = r0.getDistance()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static float c(android.widget.EdgeEffect r0, float r1, float r2) {
            float r0 = r0.onPullDistance(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0.onPull(r1, r2)
            r0 = 0
            return r0
    }
}
