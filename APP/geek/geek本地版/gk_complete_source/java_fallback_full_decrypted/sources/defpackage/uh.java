package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class uh {
    public static android.widget.EdgeEffect a(android.content.Context r1, android.util.AttributeSet r2) {
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L6
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            return r2
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
