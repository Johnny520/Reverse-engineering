package p000;

import android.content.Context;
import android.graphics.Path;
import android.view.DisplayCutout;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ne */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0495ne {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m3286a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Path m3287b(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    /* JADX INFO: renamed from: c */
    public static float m3288c(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m3289d(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
