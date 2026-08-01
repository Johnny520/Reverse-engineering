package p000;

/* JADX INFO: renamed from: cy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0192cy {
    /* JADX INFO: renamed from: α */
    public static android.widget.EdgeEffect m1632(android.content.Context r1, android.util.AttributeSet r2) {
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L6
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static float m1633(android.widget.EdgeEffect r0) {
            float r0 = r0.getDistance()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static float m1634(android.widget.EdgeEffect r0, float r1, float r2) {
            float r0 = r0.onPullDistance(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0.onPull(r1, r2)
            r0 = 0
            return r0
    }
}
