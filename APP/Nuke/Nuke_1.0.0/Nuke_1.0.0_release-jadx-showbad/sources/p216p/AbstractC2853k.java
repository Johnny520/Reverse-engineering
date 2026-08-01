package p216p;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: p.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2853k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m5044a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static float m5045b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static float m5046c(EdgeEffect edgeEffect, float f2, float f5) {
        try {
            return edgeEffect.onPullDistance(f2, f5);
        } catch (Throwable unused) {
            edgeEffect.onPull(f2, f5);
            return 0.0f;
        }
    }
}
