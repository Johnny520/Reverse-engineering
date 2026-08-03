package p000a;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: a.G5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0116G5 {

    /* JADX INFO: renamed from: a.G5$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m308a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: a.G5$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m309a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* JADX INFO: renamed from: b */
        public static float m310b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: c */
        public static float m311c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m306a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m310b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static float m307b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m311c(edgeEffect, f, f2);
        }
        a.m308a(edgeEffect, f, f2);
        return f;
    }
}
