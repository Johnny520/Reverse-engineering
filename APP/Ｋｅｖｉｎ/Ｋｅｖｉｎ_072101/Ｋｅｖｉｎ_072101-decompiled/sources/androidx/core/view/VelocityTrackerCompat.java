package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class VelocityTrackerCompat {

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getAxisVelocity(android.view.VelocityTracker r1, int r2) {
                float r0 = r1.getAxisVelocity(r2)
                return r0
        }

        static float getAxisVelocity(android.view.VelocityTracker r1, int r2, int r3) {
                float r0 = r1.getAxisVelocity(r2, r3)
                return r0
        }

        static boolean isAxisSupported(android.view.VelocityTracker r1, int r2) {
                boolean r0 = r1.isAxisSupported(r2)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VelocityTrackableMotionEventAxis {
    }

    private VelocityTrackerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float getAxisVelocity(android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r0 = androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(r2, r3)
            return r0
        Lb:
            if (r3 != 0) goto L12
            float r0 = r2.getXVelocity()
            return r0
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r0 = r2.getYVelocity()
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public static float getAxisVelocity(android.view.VelocityTracker r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r0 = androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(r2, r3, r4)
            return r0
        Lb:
            if (r3 != 0) goto L12
            float r0 = r2.getXVelocity(r4)
            return r0
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r0 = r2.getYVelocity(r4)
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public static float getXVelocity(android.view.VelocityTracker r1, int r2) {
            float r0 = r1.getXVelocity(r2)
            return r0
    }

    @java.lang.Deprecated
    public static float getYVelocity(android.view.VelocityTracker r1, int r2) {
            float r0 = r1.getYVelocity(r2)
            return r0
    }

    public static boolean isAxisSupported(android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.VelocityTrackerCompat.Api34Impl.isAxisSupported(r2, r3)
            return r0
        Lb:
            r0 = 1
            if (r3 == 0) goto L12
            if (r3 != r0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }
}
