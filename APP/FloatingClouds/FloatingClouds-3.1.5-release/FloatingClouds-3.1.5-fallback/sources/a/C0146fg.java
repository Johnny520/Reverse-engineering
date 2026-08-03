package a;

/* JADX INFO: renamed from: a.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0146fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map<android.view.VelocityTracker, a.C0164gg> f475a = null;

    /* JADX INFO: renamed from: a.fg$a */
    public static class a {
        public static float a(android.view.VelocityTracker r0, int r1) {
                float r0 = r0.getAxisVelocity(r1)
                return r0
        }

        public static float b(android.view.VelocityTracker r0, int r1, int r2) {
                float r0 = r0.getAxisVelocity(r1, r2)
                return r0
        }

        public static boolean c(android.view.VelocityTracker r0, int r1) {
                boolean r0 = r0.isAxisSupported(r1)
                return r0
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            a.C0146fg.f475a = r0
            return
    }
}
