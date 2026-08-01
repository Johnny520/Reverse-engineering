package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleGestureDetectorCompat {

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector r1) {
                boolean r0 = r1.isQuickScaleEnabled()
                return r0
        }

        static void setQuickScaleEnabled(android.view.ScaleGestureDetector r0, boolean r1) {
                r0.setQuickScaleEnabled(r1)
                return
        }
    }

    private ScaleGestureDetectorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector r1) {
            boolean r0 = androidx.core.view.ScaleGestureDetectorCompat.Api19Impl.isQuickScaleEnabled(r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object r1) {
            r0 = r1
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            boolean r0 = isQuickScaleEnabled(r0)
            return r0
    }

    public static void setQuickScaleEnabled(android.view.ScaleGestureDetector r0, boolean r1) {
            androidx.core.view.ScaleGestureDetectorCompat.Api19Impl.setQuickScaleEnabled(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object r1, boolean r2) {
            r0 = r1
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            setQuickScaleEnabled(r0, r2)
            return
    }
}
