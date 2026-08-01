package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
final class ActivityRecreator {
    private static final java.lang.String LOG_TAG = "ActivityRecreator";
    protected static final java.lang.Class<?> activityThreadClass = null;
    private static final android.os.Handler mainHandler = null;
    protected static final java.lang.reflect.Field mainThreadField = null;
    protected static final java.lang.reflect.Method performStopActivity2ParamsMethod = null;
    protected static final java.lang.reflect.Method performStopActivity3ParamsMethod = null;
    protected static final java.lang.reflect.Method requestRelaunchActivityMethod = null;
    protected static final java.lang.reflect.Field tokenField = null;




    private static final class LifecycleCheckCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        java.lang.Object currentlyRecreatingToken;
        private android.app.Activity mActivity;
        private boolean mDestroyed;
        private final int mRecreatingHashCode;
        private boolean mStarted;
        private boolean mStopQueued;

        LifecycleCheckCallbacks(android.app.Activity r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mStarted = r0
                r1.mDestroyed = r0
                r1.mStopQueued = r0
                r1.mActivity = r2
                android.app.Activity r0 = r1.mActivity
                int r0 = r0.hashCode()
                r1.mRecreatingHashCode = r0
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                if (r0 != r2) goto La
                r0 = 0
                r1.mActivity = r0
                r0 = 1
                r1.mDestroyed = r0
            La:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r3) {
                r2 = this;
                boolean r0 = r2.mDestroyed
                if (r0 == 0) goto L1c
                boolean r0 = r2.mStopQueued
                if (r0 != 0) goto L1c
                boolean r0 = r2.mStarted
                if (r0 != 0) goto L1c
                java.lang.Object r0 = r2.currentlyRecreatingToken
                int r1 = r2.mRecreatingHashCode
                boolean r0 = androidx.core.app.ActivityRecreator.queueOnStopIfNecessary(r0, r1, r3)
                if (r0 == 0) goto L1c
                r0 = 1
                r2.mStopQueued = r0
                r0 = 0
                r2.currentlyRecreatingToken = r0
            L1c:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                if (r0 != r2) goto L7
                r0 = 1
                r1.mStarted = r0
            L7:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.core.app.ActivityRecreator.mainHandler = r0
            java.lang.Class r0 = getActivityThreadClass()
            androidx.core.app.ActivityRecreator.activityThreadClass = r0
            java.lang.reflect.Field r0 = getMainThreadField()
            androidx.core.app.ActivityRecreator.mainThreadField = r0
            java.lang.reflect.Field r0 = getTokenField()
            androidx.core.app.ActivityRecreator.tokenField = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.activityThreadClass
            java.lang.reflect.Method r0 = getPerformStopActivity3Params(r0)
            androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.activityThreadClass
            java.lang.reflect.Method r0 = getPerformStopActivity2Params(r0)
            androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.activityThreadClass
            java.lang.reflect.Method r0 = getRequestRelaunchActivityMethod(r0)
            androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod = r0
            return
    }

    private ActivityRecreator() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Class<?> getActivityThreadClass() {
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static java.lang.reflect.Field getMainThreadField() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mMainThread"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static java.lang.reflect.Method getPerformStopActivity2Params(java.lang.Class<?> r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L17
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = move-exception
            return r0
    }

    private static java.lang.reflect.Method getPerformStopActivity3Params(java.lang.Class<?> r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L19
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r1 = r5.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L19
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            return r0
    }

    private static java.lang.reflect.Method getRequestRelaunchActivityMethod(java.lang.Class<?> r11) {
            boolean r0 = needsRelaunchCall()
            r1 = 0
            if (r0 == 0) goto L2d
            if (r11 != 0) goto La
            goto L2d
        La:
            java.lang.String r0 = "requestRelaunchActivity"
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<java.util.List> r4 = java.util.List.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<android.content.res.Configuration> r7 = android.content.res.Configuration.class
            java.lang.Class<android.content.res.Configuration> r8 = android.content.res.Configuration.class
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2b
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r0 = r11.getDeclaredMethod(r0, r2)     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L2b:
            r0 = move-exception
            return r1
        L2d:
            return r1
    }

    private static java.lang.reflect.Field getTokenField() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static boolean needsRelaunchCall() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto Lf
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    protected static boolean queueOnStopIfNecessary(java.lang.Object r5, int r6, android.app.Activity r7) {
            r0 = 0
            java.lang.reflect.Field r1 = androidx.core.app.ActivityRecreator.tokenField     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L23
            if (r1 != r5) goto L22
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L23
            if (r2 == r6) goto L10
            goto L22
        L10:
            java.lang.reflect.Field r2 = androidx.core.app.ActivityRecreator.mainThreadField     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L23
            android.os.Handler r3 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L23
            androidx.core.app.ActivityRecreator$3 r4 = new androidx.core.app.ActivityRecreator$3     // Catch: java.lang.Throwable -> L23
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L23
            r3.postAtFrontOfQueue(r4)     // Catch: java.lang.Throwable -> L23
            r0 = 1
            return r0
        L22:
            return r0
        L23:
            r1 = move-exception
            java.lang.String r2 = "ActivityRecreator"
            java.lang.String r3 = "Exception while fetching field values"
            android.util.Log.e(r2, r3, r1)
            return r0
    }

    static boolean recreate(android.app.Activity r17) {
            r1 = r17
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r3 = 1
            if (r0 < r2) goto Ld
            r17.recreate()
            return r3
        Ld:
            boolean r0 = needsRelaunchCall()
            r2 = 0
            if (r0 == 0) goto L19
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod
            if (r0 != 0) goto L19
            return r2
        L19:
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod
            if (r0 != 0) goto L22
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod
            if (r0 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Field r0 = androidx.core.app.ActivityRecreator.tokenField     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            r13 = r0
            if (r13 != 0) goto L2c
            return r2
        L2c:
            java.lang.reflect.Field r0 = androidx.core.app.ActivityRecreator.mainThreadField     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            r14 = r0
            if (r14 != 0) goto L36
            return r2
        L36:
            android.app.Application r0 = r17.getApplication()     // Catch: java.lang.Throwable -> L96
            r15 = r0
            androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks r0 = new androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks     // Catch: java.lang.Throwable -> L96
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L96
            r12 = r0
            r15.registerActivityLifecycleCallbacks(r12)     // Catch: java.lang.Throwable -> L96
            android.os.Handler r0 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L96
            androidx.core.app.ActivityRecreator$1 r4 = new androidx.core.app.ActivityRecreator$1     // Catch: java.lang.Throwable -> L96
            r4.<init>(r12, r13)     // Catch: java.lang.Throwable -> L96
            r0.post(r4)     // Catch: java.lang.Throwable -> L96
            boolean r0 = needsRelaunchCall()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L76
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L88
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            r2 = r12
            r12 = r16
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L86
            r0.invoke(r14, r4)     // Catch: java.lang.Throwable -> L86
            goto L7a
        L76:
            r2 = r12
            r17.recreate()     // Catch: java.lang.Throwable -> L86
        L7a:
            android.os.Handler r0 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L96
            androidx.core.app.ActivityRecreator$2 r4 = new androidx.core.app.ActivityRecreator$2     // Catch: java.lang.Throwable -> L96
            r4.<init>(r15, r2)     // Catch: java.lang.Throwable -> L96
            r0.post(r4)     // Catch: java.lang.Throwable -> L96
            return r3
        L86:
            r0 = move-exception
            goto L8a
        L88:
            r0 = move-exception
            r2 = r12
        L8a:
            android.os.Handler r3 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L96
            androidx.core.app.ActivityRecreator$2 r4 = new androidx.core.app.ActivityRecreator$2     // Catch: java.lang.Throwable -> L96
            r4.<init>(r15, r2)     // Catch: java.lang.Throwable -> L96
            r3.post(r4)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            r2 = 0
            return r2
    }
}
