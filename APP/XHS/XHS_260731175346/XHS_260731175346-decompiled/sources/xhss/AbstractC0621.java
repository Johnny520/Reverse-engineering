package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛱᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0621 {
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static float m1081(android.widget.EdgeEffect r0) {
            float r0 = r0.getDistance()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static float m1082(android.widget.EdgeEffect r0, float r1, float r2) {
            float r0 = r0.onPullDistance(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0.onPull(r1, r2)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.widget.EdgeEffect m1083(android.content.Context r1, android.util.AttributeSet r2) {
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L6
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            return r2
    }
}
