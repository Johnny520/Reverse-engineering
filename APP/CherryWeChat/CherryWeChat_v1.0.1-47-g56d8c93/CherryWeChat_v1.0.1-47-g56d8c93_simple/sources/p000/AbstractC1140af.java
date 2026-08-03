package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1140af {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m2055a(Context r1, AttributeSet r2) {
        return new EdgeEffect(r1, r2);
    L5:
        return new EdgeEffect(r1);
    }

    /* JADX INFO: renamed from: b */
    public static float m2056b(EdgeEffect r0) {
        return r0.getDistance();
    L4:
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static float m2057c(EdgeEffect r0, float r1, float r2) {
        return r0.onPullDistance(r1, r2);
    L4:
        r0.onPull(r1, r2);
        return 0.0f;
    }
}
