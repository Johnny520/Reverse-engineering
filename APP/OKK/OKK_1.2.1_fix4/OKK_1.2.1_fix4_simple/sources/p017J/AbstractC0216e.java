package p017J;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: J.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0216e {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m599a(Context r1, AttributeSet r2) {
        return new EdgeEffect(r1, r2);
    L5:
        return new EdgeEffect(r1);
    }

    /* JADX INFO: renamed from: b */
    public static float m600b(EdgeEffect r02) {
        return r02.getDistance();
    L4:
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static float m601c(EdgeEffect r02, float r1, float r2) {
        return r02.onPullDistance(r1, r2);
    L4:
        r02.onPull(r1, r2);
        return 0.0f;
    }
}
