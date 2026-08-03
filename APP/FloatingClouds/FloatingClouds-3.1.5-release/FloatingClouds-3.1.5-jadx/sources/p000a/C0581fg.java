package p000a;

import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.fg */
/* JADX INFO: loaded from: classes.dex */
public final class C0581fg {

    /* JADX INFO: renamed from: a */
    public static final Map<VelocityTracker, C0600gg> f2148a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a.fg$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m1417a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        /* JADX INFO: renamed from: b */
        public static float m1418b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        /* JADX INFO: renamed from: c */
        public static boolean m1419c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }
}
