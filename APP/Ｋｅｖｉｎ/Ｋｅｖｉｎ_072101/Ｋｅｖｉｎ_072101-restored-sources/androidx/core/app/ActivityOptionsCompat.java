package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    private static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(android.app.ActivityOptions r1) {
                r0 = this;
                r0.<init>()
                r0.mActivityOptions = r1
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.graphics.Rect r0 = androidx.core.app.ActivityOptionsCompat.Api24Impl.getLaunchBounds(r0)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(android.app.PendingIntent r2) {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                androidx.core.app.ActivityOptionsCompat.Api23Impl.requestUsageTimeReport(r0, r2)
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect r3) {
                r2 = this;
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
                android.app.ActivityOptions r1 = r2.mActivityOptions
                android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api24Impl.setLaunchBounds(r1, r3)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.os.Bundle r0 = r0.toBundle()
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(androidx.core.app.ActivityOptionsCompat r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl
                if (r0 == 0) goto Le
                r0 = r4
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = (androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) r0
                android.app.ActivityOptions r1 = r3.mActivityOptions
                android.app.ActivityOptions r2 = r0.mActivityOptions
                r1.update(r2)
            Le:
                return
        }
    }

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.ActivityOptions makeCustomAnimation(android.content.Context r1, int r2, int r3) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeCustomAnimation(r1, r2, r3)
                return r0
        }

        static android.app.ActivityOptions makeScaleUpAnimation(android.view.View r1, int r2, int r3, int r4, int r5) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeScaleUpAnimation(r1, r2, r3, r4, r5)
                return r0
        }

        static android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View r1, android.graphics.Bitmap r2, int r3, int r4) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeThumbnailScaleUpAnimation(r1, r2, r3, r4)
                return r0
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity r1, android.view.View r2, java.lang.String r3) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeSceneTransitionAnimation(r1, r2, r3)
                return r0
        }

        @java.lang.SafeVarargs
        static android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity r1, android.util.Pair<android.view.View, java.lang.String>... r2) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeSceneTransitionAnimation(r1, r2)
                return r0
        }

        static android.app.ActivityOptions makeTaskLaunchBehind() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeTaskLaunchBehind()
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.ActivityOptions makeBasic() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()
                return r0
        }

        static android.app.ActivityOptions makeClipRevealAnimation(android.view.View r1, int r2, int r3, int r4, int r5) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeClipRevealAnimation(r1, r2, r3, r4, r5)
                return r0
        }

        static void requestUsageTimeReport(android.app.ActivityOptions r0, android.app.PendingIntent r1) {
                r0.requestUsageTimeReport(r1)
                return
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Rect getLaunchBounds(android.app.ActivityOptions r1) {
                android.graphics.Rect r0 = r1.getLaunchBounds()
                return r0
        }

        static android.app.ActivityOptions setLaunchBounds(android.app.ActivityOptions r1, android.graphics.Rect r2) {
                android.app.ActivityOptions r0 = r1.setLaunchBounds(r2)
                return r0
        }
    }

    protected ActivityOptionsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api23Impl.makeBasic()
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(android.view.View r2, int r3, int r4, int r5, int r6) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api23Impl.makeClipRevealAnimation(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(android.content.Context r2, int r3, int r4) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api16Impl.makeCustomAnimation(r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(android.view.View r2, int r3, int r4, int r5, int r6) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api16Impl.makeScaleUpAnimation(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity r2, android.view.View r3, java.lang.String r4) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api21Impl.makeSceneTransitionAnimation(r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity r4, androidx.core.util.Pair<android.view.View, java.lang.String>... r5) {
            r0 = 0
            if (r5 == 0) goto L20
            int r1 = r5.length
            android.util.Pair[] r0 = new android.util.Pair[r1]
            r1 = 0
        L8:
            int r2 = r5.length
            if (r1 >= r2) goto L20
            r2 = r5[r1]
            F r2 = r2.first
            android.view.View r2 = (android.view.View) r2
            r3 = r5[r1]
            S r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L20:
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r1 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r2 = androidx.core.app.ActivityOptionsCompat.Api21Impl.makeSceneTransitionAnimation(r4, r0)
            r1.<init>(r2)
            return r1
    }

    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api21Impl.makeTaskLaunchBehind()
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(android.view.View r2, android.graphics.Bitmap r3, int r4, int r5) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = androidx.core.app.ActivityOptionsCompat.Api16Impl.makeThumbnailScaleUpAnimation(r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    public android.graphics.Rect getLaunchBounds() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void requestUsageTimeReport(android.app.PendingIntent r1) {
            r0 = this;
            return
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect r1) {
            r0 = this;
            return r0
    }

    public android.os.Bundle toBundle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void update(androidx.core.app.ActivityOptionsCompat r1) {
            r0 = this;
            return
    }
}
