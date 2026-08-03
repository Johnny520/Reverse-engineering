package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements Yue.InterfaceC1579, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, Yue.InterfaceC5504, Yue.InterfaceC4611, Yue.InterfaceC0255, Yue.InterfaceC0220, Yue.InterfaceC4612, Yue.InterfaceC4621, Yue.InterfaceC4617, Yue.InterfaceC4616, Yue.InterfaceC4618, Yue.InterfaceC4120, Yue.InterfaceC2821 {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.ActivityResultRegistry mActivityResultRegistry;

    @Yue.InterfaceC3573
    private int mContentLayoutId;
    final Yue.C1580 mContextAwareHelper;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @Yue.InterfaceC4410
    final Yue.C2818 mFullyDrawnReporter;
    private final androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final Yue.C4123 mMenuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC1535<android.content.res.Configuration>> mOnConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC1535<Yue.C4298>> mOnMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC1535<android.content.Intent>> mOnNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC1535<Yue.C4767>> mOnPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC1535<java.lang.Integer>> mOnTrimMemoryListeners;
    final androidx.activity.ComponentActivity.InterfaceExecutorC7234 mReportFullyDrawnExecutor;
    final Yue.C5502 mSavedStateRegistryController;
    private androidx.lifecycle.ViewModelStore mViewModelStore;





    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ, reason: contains not printable characters */
    public class C7227 extends androidx.activity.result.ActivityResultRegistry {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.ComponentActivity f24907;

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ$ۥ, reason: contains not printable characters */
        public class RunnableC7228 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ int f24908;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.AbstractC0221.C0222 f24909;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.activity.ComponentActivity.C7227 f24910;

            public RunnableC7228(androidx.activity.ComponentActivity.C7227 r1, int r2, Yue.AbstractC0221.C0222 r3) {
                    r0 = this;
                    r0.f24910 = r1
                    r0.f24908 = r2
                    r0.f24909 = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    androidx.activity.ComponentActivity$ۥ r0 = r3.f24910
                    int r1 = r3.f24908
                    Yue.ۥ۟۟ۨۢ$ۥ r2 = r3.f24909
                    java.lang.Object r2 = r2.m1126()
                    r0.m27776(r1, r2)
                    return
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ$ۥ۟, reason: contains not printable characters */
        public class RunnableC7229 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ int f24911;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ android.content.IntentSender.SendIntentException f24912;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.activity.ComponentActivity.C7227 f24913;

            public RunnableC7229(androidx.activity.ComponentActivity.C7227 r1, int r2, android.content.IntentSender.SendIntentException r3) {
                    r0 = this;
                    r0.f24913 = r1
                    r0.f24911 = r2
                    r0.f24912 = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r5 = this;
                    androidx.activity.ComponentActivity$ۥ r0 = r5.f24913
                    int r1 = r5.f24911
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>()
                    java.lang.String r3 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                    android.content.Intent r2 = r2.setAction(r3)
                    java.lang.String r3 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"
                    android.content.IntentSender$SendIntentException r4 = r5.f24912
                    android.content.Intent r2 = r2.putExtra(r3, r4)
                    r3 = 0
                    r0.m27775(r1, r3, r2)
                    return
            }
        }

        public C7227(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.f24907 = r1
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public <I, O> void mo27736(int r9, @Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r10, I r11, @Yue.InterfaceC4544 Yue.C0206 r12) {
                r8 = this;
                androidx.activity.ComponentActivity r0 = r8.f24907
                Yue.ۥ۟۟ۨۢ$ۥ r1 = r10.mo1124(r0, r11)
                if (r1 == 0) goto L1a
                android.os.Handler r10 = new android.os.Handler
                android.os.Looper r11 = android.os.Looper.getMainLooper()
                r10.<init>(r11)
                androidx.activity.ComponentActivity$ۥ$ۥ r11 = new androidx.activity.ComponentActivity$ۥ$ۥ
                r11.<init>(r8, r9, r1)
                r10.post(r11)
                return
            L1a:
                android.content.Intent r10 = r10.mo1123(r0, r11)
                android.os.Bundle r11 = r10.getExtras()
                if (r11 == 0) goto L35
                android.os.Bundle r11 = r10.getExtras()
                java.lang.ClassLoader r11 = r11.getClassLoader()
                if (r11 != 0) goto L35
                java.lang.ClassLoader r11 = r0.getClassLoader()
                r10.setExtrasClassLoader(r11)
            L35:
                java.lang.String r11 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                boolean r1 = r10.hasExtra(r11)
                if (r1 == 0) goto L46
                android.os.Bundle r12 = r10.getBundleExtra(r11)
                r10.removeExtra(r11)
                r7 = r12
                goto L50
            L46:
                if (r12 == 0) goto L4e
                android.os.Bundle r11 = r12.mo1097()
            L4c:
                r7 = r11
                goto L50
            L4e:
                r11 = 0
                goto L4c
            L50:
                java.lang.String r11 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                java.lang.String r12 = r10.getAction()
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto L6b
                java.lang.String r11 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r10 = r10.getStringArrayExtra(r11)
                if (r10 != 0) goto L67
                r10 = 0
                java.lang.String[] r10 = new java.lang.String[r10]
            L67:
                Yue.C0188.m1048(r0, r10, r9)
                goto Lab
            L6b:
                java.lang.String r11 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                java.lang.String r12 = r10.getAction()
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto La8
                java.lang.String r11 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                android.os.Parcelable r10 = r10.getParcelableExtra(r11)
                Yue.ۥ۠ۥۦۣ r10 = (Yue.C3313) r10
                android.content.IntentSender r1 = r10.m13863()     // Catch: android.content.IntentSender.SendIntentException -> L95
                android.content.Intent r3 = r10.m13860()     // Catch: android.content.IntentSender.SendIntentException -> L95
                int r4 = r10.m13861()     // Catch: android.content.IntentSender.SendIntentException -> L95
                int r5 = r10.m13862()     // Catch: android.content.IntentSender.SendIntentException -> L95
                r6 = 0
                r2 = r9
                Yue.C0188.m1056(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: android.content.IntentSender.SendIntentException -> L95
                goto Lab
            L95:
                r10 = move-exception
                android.os.Handler r11 = new android.os.Handler
                android.os.Looper r12 = android.os.Looper.getMainLooper()
                r11.<init>(r12)
                androidx.activity.ComponentActivity$ۥ$ۥ۟ r12 = new androidx.activity.ComponentActivity$ۥ$ۥ۟
                r12.<init>(r8, r9, r10)
                r11.post(r12)
                goto Lab
            La8:
                Yue.C0188.m1055(r0, r10, r9, r7)
            Lab:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟, reason: contains not printable characters */
    public class RunnableC7230 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.ComponentActivity f24914;

        public RunnableC7230(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.f24914 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.activity.ComponentActivity r0 = r3.f24914     // Catch: java.lang.NullPointerException -> L6 java.lang.IllegalStateException -> L8
                androidx.activity.ComponentActivity.access$001(r0)     // Catch: java.lang.NullPointerException -> L6 java.lang.IllegalStateException -> L8
                goto L24
            L6:
                r0 = move-exception
                goto La
            L8:
                r0 = move-exception
                goto L18
            La:
                java.lang.String r1 = r0.getMessage()
                java.lang.String r2 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L17
                goto L24
            L17:
                throw r0
            L18:
                java.lang.String r1 = r0.getMessage()
                java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L25
            L24:
                return
            L25:
                throw r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C7231 {
        public C7231() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m27737(android.view.View r0) {
                r0.cancelPendingInputEvents()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C7232 {
        public C7232() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.window.OnBackInvokedDispatcher m27738(android.app.Activity r0) {
                android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7233 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Object f24915;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.lifecycle.ViewModelStore f24916;

        public C7233() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceExecutorC7234 extends java.util.concurrent.Executor {
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        void mo27739();

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        void mo27740(@Yue.InterfaceC4410 android.view.View r1);
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(16)
    public class ViewTreeObserverOnDrawListenerC7235 implements androidx.activity.ComponentActivity.InterfaceExecutorC7234, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final long f24917;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Runnable f24918;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f24919;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.ComponentActivity f24920;

        public ViewTreeObserverOnDrawListenerC7235(androidx.activity.ComponentActivity r5) {
                r4 = this;
                r4.f24920 = r5
                r4.<init>()
                long r0 = android.os.SystemClock.uptimeMillis()
                r2 = 10000(0x2710, double:4.9407E-320)
                long r0 = r0 + r2
                r4.f24917 = r0
                r5 = 0
                r4.f24919 = r5
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m27741(androidx.activity.ComponentActivity.ViewTreeObserverOnDrawListenerC7235 r0) {
                r0.m27742()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                r2.f24918 = r3
                androidx.activity.ComponentActivity r3 = r2.f24920
                android.view.Window r3 = r3.getWindow()
                android.view.View r3 = r3.getDecorView()
                boolean r0 = r2.f24919
                if (r0 == 0) goto L22
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                if (r0 != r1) goto L1e
                r3.invalidate()
                goto L2a
            L1e:
                r3.postInvalidate()
                goto L2a
            L22:
                Yue.ۥ۟ۦۣۤ r0 = new Yue.ۥ۟ۦۣۤ
                r0.<init>(r2)
                r3.postOnAnimation(r0)
            L2a:
                return
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
                r6 = this;
                java.lang.Runnable r0 = r6.f24918
                r1 = 0
                if (r0 == 0) goto L25
                r0.run()
                r0 = 0
                r6.f24918 = r0
                androidx.activity.ComponentActivity r0 = r6.f24920
                Yue.ۥۣ۠۠ۤ r0 = r0.mFullyDrawnReporter
                boolean r0 = r0.m12273()
                if (r0 == 0) goto L3e
                r6.f24919 = r1
                androidx.activity.ComponentActivity r0 = r6.f24920
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.post(r6)
                goto L3e
            L25:
                long r2 = android.os.SystemClock.uptimeMillis()
                long r4 = r6.f24917
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L3e
                r6.f24919 = r1
                androidx.activity.ComponentActivity r0 = r6.f24920
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.post(r6)
            L3e:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.f24920
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnDrawListener(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ void m27742() {
                r1 = this;
                java.lang.Runnable r0 = r1.f24918
                if (r0 == 0) goto La
                r0.run()
                r0 = 0
                r1.f24918 = r0
            La:
                return
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC7234
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo27739() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.f24920
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.removeCallbacks(r1)
                androidx.activity.ComponentActivity r0 = r1.f24920
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnDrawListener(r1)
                return
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC7234
        /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
        public void mo27740(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                boolean r0 = r1.f24919
                if (r0 != 0) goto Le
                r0 = 1
                r1.f24919 = r0
                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                r2.addOnDrawListener(r1)
            Le:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C7236 implements androidx.activity.ComponentActivity.InterfaceExecutorC7234 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.os.Handler f24921;

        public C7236() {
                r1 = this;
                r1.<init>()
                android.os.Handler r0 = r1.m27743()
                r1.f24921 = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.f24921
                r0.postAtFrontOfQueue(r2)
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.os.Handler m27743() {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = new android.os.Handler
                if (r0 != 0) goto Lc
                android.os.Looper r0 = android.os.Looper.getMainLooper()
            Lc:
                r1.<init>(r0)
                return r1
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC7234
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo27739() {
                r0 = this;
                return
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC7234
        /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
        public void mo27740(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                return
        }
    }

    public ComponentActivity() {
            r4 = this;
            r4.<init>()
            Yue.ۥۣ۟ۧۦ r0 = new Yue.ۥۣ۟ۧۦ
            r0.<init>()
            r4.mContextAwareHelper = r0
            Yue.ۥۡ۠ۦۢ r0 = new Yue.ۥۡ۠ۦۢ
            Yue.ۥ۟ۦۤ۟ r1 = new Yue.ۥ۟ۦۤ۟
            r1.<init>(r4)
            r0.<init>(r1)
            r4.mMenuHostHelper = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r4)
            r4.mLifecycleRegistry = r0
            Yue.ۥۡۧۤۡ r0 = Yue.C5502.m20695(r4)
            r4.mSavedStateRegistryController = r0
            r1 = 0
            r4.mOnBackPressedDispatcher = r1
            androidx.activity.ComponentActivity$ۥ۟۟۟۠ r1 = r4.m27732()
            r4.mReportFullyDrawnExecutor = r1
            Yue.ۥۣ۠۠ۤ r2 = new Yue.ۥۣ۠۠ۤ
            Yue.ۥ۟ۦۤ۠ r3 = new Yue.ۥ۟ۦۤ۠
            r3.<init>(r4)
            r2.<init>(r1, r3)
            r4.mFullyDrawnReporter = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r4.mNextLocalRequestCode = r1
            androidx.activity.ComponentActivity$ۥ r1 = new androidx.activity.ComponentActivity$ۥ
            r1.<init>(r4)
            r4.mActivityResultRegistry = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnConfigurationChangedListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnTrimMemoryListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnNewIntentListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnMultiWindowModeChangedListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnPictureInPictureModeChangedListeners = r1
            r1 = 0
            r4.mDispatchingOnMultiWindowModeChanged = r1
            r4.mDispatchingOnPictureInPictureModeChanged = r1
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            if (r1 == 0) goto Lb5
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$2 r2 = new androidx.activity.ComponentActivity$2
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$3 r2 = new androidx.activity.ComponentActivity$3
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$4 r2 = new androidx.activity.ComponentActivity$4
            r2.<init>(r4)
            r1.addObserver(r2)
            r0.m20697()
            androidx.lifecycle.SavedStateHandleSupport.enableSavedStateHandles(r4)
            androidx.savedstate.ۥ r0 = r4.getSavedStateRegistry()
            Yue.ۥ۟ۦۤۡ r1 = new Yue.ۥ۟ۦۤۡ
            r1.<init>(r4)
            java.lang.String r2 = "android:support:activity-result"
            r0.m30366(r2, r1)
            Yue.ۥ۟ۦۤۢ r0 = new Yue.ۥ۟ۦۤۢ
            r0.<init>(r4)
            r4.addOnContextAvailableListener(r0)
            return
        Lb5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC1578
    public ComponentActivity(@Yue.InterfaceC3573 int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    public static /* synthetic */ void access$001(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    public static /* synthetic */ androidx.activity.OnBackPressedDispatcher access$100(androidx.activity.ComponentActivity r0) {
            androidx.activity.OnBackPressedDispatcher r0 = r0.mOnBackPressedDispatcher
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m27729(androidx.activity.ComponentActivity r0, android.content.Context r1) {
            r0.m27735(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ android.os.Bundle m27730(androidx.activity.ComponentActivity r0) {
            android.os.Bundle r0 = r0.m27734()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6593 m27731(androidx.activity.ComponentActivity r0) {
            Yue.ۥۣۢ۠ۤ r0 = r0.m27733()
            return r0
    }

    @Override // android.app.Activity
    public void addContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3, @android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ۥ۟۟۟۠ r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.mo27740(r1)
            super.addContentView(r3, r4)
            return
    }

    @Override // Yue.InterfaceC4120
    public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16159(r2)
            return
    }

    @Override // Yue.InterfaceC4120
    public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16160(r2, r3)
            return
    }

    @Override // Yue.InterfaceC4120
    @android.annotation.SuppressLint({"LambdaLast"})
    public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r4) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16161(r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC4612
    public final void addOnConfigurationChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.add(r2)
            return
    }

    @Override // Yue.InterfaceC1579
    public final void addOnContextAvailableListener(@Yue.InterfaceC4410 Yue.InterfaceC4613 r2) {
            r1 = this;
            Yue.ۥۣ۟ۧۦ r0 = r1.mContextAwareHelper
            r0.m7747(r2)
            return
    }

    @Override // Yue.InterfaceC4616
    public final void addOnMultiWindowModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4298> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۡۦۢ>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // Yue.InterfaceC4617
    public final void addOnNewIntentListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.add(r2)
            return
    }

    @Override // Yue.InterfaceC4618
    public final void addOnPictureInPictureModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4767> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۤۡ>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // Yue.InterfaceC4621
    public final void addOnTrimMemoryListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.add(r2)
            return
    }

    public void ensureViewModelStore() {
            r1 = this;
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$ۥ۟۟۟۟ r0 = (androidx.activity.ComponentActivity.C7233) r0
            if (r0 == 0) goto L10
            androidx.lifecycle.ViewModelStore r0 = r0.f24916
            r1.mViewModelStore = r0
        L10:
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            r1.mViewModelStore = r0
        L1b:
            return
    }

    @Override // Yue.InterfaceC0255
    @Yue.InterfaceC4410
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @Yue.InterfaceC4410
    @Yue.InterfaceC0907
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r3 = this;
            androidx.lifecycle.viewmodel.MutableCreationExtras r0 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r0.<init>()
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L14
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            android.app.Application r2 = r3.getApplication()
            r0.set(r1, r2)
        L14:
            androidx.lifecycle.viewmodel.CreationExtras$Key<Yue.ۥۡۧۤۢ> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r0.set(r1, r3)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r0.set(r1, r3)
            android.content.Intent r1 = r3.getIntent()
            if (r1 == 0) goto L3b
            android.content.Intent r1 = r3.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L3b
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r1 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.set(r1, r2)
        L3b:
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @Yue.InterfaceC4410
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L1f
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            android.app.Application r1 = r3.getApplication()
            android.content.Intent r2 = r3.getIntent()
            if (r2 == 0) goto L19
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            goto L1a
        L19:
            r2 = 0
        L1a:
            r0.<init>(r1, r3, r2)
            r3.mDefaultFactory = r0
        L1f:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
    }

    @Override // Yue.InterfaceC2821
    @Yue.InterfaceC4410
    public Yue.C2818 getFullyDrawnReporter() {
            r1 = this;
            Yue.ۥۣ۠۠ۤ r0 = r1.mFullyDrawnReporter
            return r0
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
            r1 = this;
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$ۥ۟۟۟۟ r0 = (androidx.activity.ComponentActivity.C7233) r0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.f24915
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // Yue.InterfaceC4611
    @Yue.InterfaceC4410
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r2 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            if (r0 != 0) goto L1c
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$ۥ۟ r1 = new androidx.activity.ComponentActivity$ۥ۟
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mOnBackPressedDispatcher = r0
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            androidx.activity.ComponentActivity$6 r1 = new androidx.activity.ComponentActivity$6
            r1.<init>(r2)
            r0.addObserver(r1)
        L1c:
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            return r0
    }

    @Override // Yue.InterfaceC5504
    @Yue.InterfaceC4410
    public final androidx.savedstate.C7816 getSavedStateRegistry() {
            r1 = this;
            Yue.ۥۡۧۤۡ r0 = r1.mSavedStateRegistryController
            androidx.savedstate.ۥ r0 = r0.m20696()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lc
            r2.ensureViewModelStore()
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC0907
    public void initializeViewTreeOwners() {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            Yue.C6920.m26786(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            Yue.C6917.m26783(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            Yue.C6914.m26780(r0, r1)
            return
    }

    @Override // Yue.InterfaceC4120
    public void invalidateMenu() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    @java.lang.Deprecated
    public void onActivityResult(int r2, int r3, @Yue.InterfaceC4544 android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            boolean r0 = r0.m27775(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    @Yue.InterfaceC3875
    @java.lang.Deprecated
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.getOnBackPressedDispatcher()
            r0.m27760()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @Yue.InterfaceC0907
    public void onConfigurationChanged(@Yue.InterfaceC4410 android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<android.content.res.Configuration>> r0 = r2.mOnConfigurationChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            r1.accept(r3)
            goto L9
        L19:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            Yue.ۥۡۧۤۡ r0 = r1.mSavedStateRegistryController
            r0.m20698(r2)
            Yue.ۥۣ۟ۧۦ r0 = r1.mContextAwareHelper
            r0.m7749(r1)
            super.onCreate(r2)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r1)
            int r2 = r1.mContentLayoutId
            if (r2 == 0) goto L17
            r1.setContentView(r2)
        L17:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, @Yue.InterfaceC4410 android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto Le
            super.onCreatePanelMenu(r2, r3)
            Yue.ۥۡ۠ۦۢ r2 = r1.mMenuHostHelper
            android.view.MenuInflater r0 = r1.getMenuInflater()
            r2.m16164(r3, r0)
        Le:
            r2 = 1
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            if (r2 != 0) goto L11
            Yue.ۥۡ۠ۦۢ r2 = r1.mMenuHostHelper
            boolean r2 = r2.m16166(r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    public void onMultiWindowModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnMultiWindowModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۡۦۢ>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            Yue.ۥۡۡۦۢ r2 = new Yue.ۥۡۡۦۢ
            r2.<init>(r4)
            r1.accept(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    @Yue.InterfaceC5336(api = 26)
    public void onMultiWindowModeChanged(boolean r4, @Yue.InterfaceC4410 android.content.res.Configuration r5) {
            r3 = this;
            r0 = 1
            r3.mDispatchingOnMultiWindowModeChanged = r0
            r0 = 0
            super.onMultiWindowModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.mDispatchingOnMultiWindowModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۡۦۢ>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            Yue.ۥۡۡۦۢ r2 = new Yue.ۥۡۡۦۢ
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto Lf
        L24:
            return
        L25:
            r4 = move-exception
            r3.mDispatchingOnMultiWindowModeChanged = r0
            throw r4
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    public void onNewIntent(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.content.Intent r3) {
            r2 = this;
            super.onNewIntent(r3)
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<android.content.Intent>> r0 = r2.mOnNewIntentListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            r1.accept(r3)
            goto L9
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, @Yue.InterfaceC4410 android.view.Menu r3) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16165(r3)
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    public void onPictureInPictureModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnPictureInPictureModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۤۡ>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            Yue.ۥۡۤۡ r2 = new Yue.ۥۡۤۡ
            r2.<init>(r4)
            r1.accept(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    @Yue.InterfaceC5336(api = 26)
    public void onPictureInPictureModeChanged(boolean r4, @Yue.InterfaceC4410 android.content.res.Configuration r5) {
            r3 = this;
            r0 = 1
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۤۡ>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            Yue.ۥۡۤۡ r2 = new Yue.ۥۡۤۡ
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto Lf
        L24:
            return
        L25:
            r4 = move-exception
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            throw r4
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, @Yue.InterfaceC4544 android.view.View r2, @Yue.InterfaceC4410 android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto La
            super.onPreparePanel(r1, r2, r3)
            Yue.ۥۡ۠ۦۢ r1 = r0.mMenuHostHelper
            r1.m16167(r3)
        La:
            r1 = 1
            return r1
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r4, @Yue.InterfaceC4410 java.lang.String[] r5, @Yue.InterfaceC4410 int[] r6) {
            r3 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r3.mActivityResultRegistry
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.m27775(r4, r2, r1)
            if (r0 != 0) goto L1d
            super.onRequestPermissionsResult(r4, r5, r6)
        L1d:
            return
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    @Yue.InterfaceC4544
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.onRetainCustomNonConfigurationInstance()
            androidx.lifecycle.ViewModelStore r1 = r3.mViewModelStore
            if (r1 != 0) goto L12
            java.lang.Object r2 = r3.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$ۥ۟۟۟۟ r2 = (androidx.activity.ComponentActivity.C7233) r2
            if (r2 == 0) goto L12
            androidx.lifecycle.ViewModelStore r1 = r2.f24916
        L12:
            if (r1 != 0) goto L18
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            androidx.activity.ComponentActivity$ۥ۟۟۟۟ r2 = new androidx.activity.ComponentActivity$ۥ۟۟۟۟
            r2.<init>()
            r2.f24915 = r0
            r2.f24916 = r1
            return r2
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @Yue.InterfaceC0907
    public void onSaveInstanceState(@Yue.InterfaceC4410 android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleRegistry
            if (r1 == 0) goto Lf
            androidx.lifecycle.LifecycleRegistry r0 = (androidx.lifecycle.LifecycleRegistry) r0
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
        Lf:
            super.onSaveInstanceState(r3)
            Yue.ۥۡۧۤۡ r0 = r2.mSavedStateRegistryController
            r0.m20699(r3)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @Yue.InterfaceC0907
    public void onTrimMemory(int r4) {
            r3 = this;
            super.onTrimMemory(r4)
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<java.lang.Integer>> r0 = r3.mOnTrimMemoryListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۠ۧ r1 = (Yue.InterfaceC1535) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.accept(r2)
            goto L9
        L1d:
            return
    }

    @Override // Yue.InterfaceC1579
    @Yue.InterfaceC4544
    public android.content.Context peekAvailableContext() {
            r1 = this;
            Yue.ۥۣ۟ۧۦ r0 = r1.mContextAwareHelper
            android.content.Context r0 = r0.m7750()
            return r0
    }

    @Override // Yue.InterfaceC0220
    @Yue.InterfaceC4410
    public final <I, O> Yue.AbstractC0254<I> registerForActivityResult(@Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r2, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r3) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            Yue.ۥ۟۟ۨۦ r2 = r1.registerForActivityResult(r2, r0, r3)
            return r2
    }

    @Override // Yue.InterfaceC0220
    @Yue.InterfaceC4410
    public final <I, O> Yue.AbstractC0254<I> registerForActivityResult(@Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r3, @Yue.InterfaceC4410 androidx.activity.result.ActivityResultRegistry r4, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "activity_rq#"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            Yue.ۥ۟۟ۨۦ r3 = r4.m27782(r0, r2, r3, r5)
            return r3
    }

    @Override // Yue.InterfaceC4120
    public void removeMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16168(r2)
            return
    }

    @Override // Yue.InterfaceC4612
    public final void removeOnConfigurationChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.remove(r2)
            return
    }

    @Override // Yue.InterfaceC1579
    public final void removeOnContextAvailableListener(@Yue.InterfaceC4410 Yue.InterfaceC4613 r2) {
            r1 = this;
            Yue.ۥۣ۟ۧۦ r0 = r1.mContextAwareHelper
            r0.m7751(r2)
            return
    }

    @Override // Yue.InterfaceC4616
    public final void removeOnMultiWindowModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4298> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۡۦۢ>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // Yue.InterfaceC4617
    public final void removeOnNewIntentListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.remove(r2)
            return
    }

    @Override // Yue.InterfaceC4618
    public final void removeOnPictureInPictureModeChangedListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.C4767> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۡۤۡ>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // Yue.InterfaceC4621
    public final void removeOnTrimMemoryListener(@Yue.InterfaceC4410 Yue.InterfaceC1535<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥ۟ۧ۠ۧ<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.remove(r2)
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            boolean r0 = Yue.C6385.m23583()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            Yue.C6385.m23578(r0)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L1a
        Le:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> Lc
            Yue.ۥۣ۠۠ۤ r0 = r1.mFullyDrawnReporter     // Catch: java.lang.Throwable -> Lc
            r0.m12272()     // Catch: java.lang.Throwable -> Lc
            Yue.C6385.m23581()
            return
        L1a:
            Yue.C6385.m23581()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(@Yue.InterfaceC3573 int r3) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ۥ۟۟۟۠ r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.mo27740(r1)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ۥ۟۟۟۠ r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.mo27740(r1)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3, @android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ۥ۟۟۟۠ r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.mo27740(r1)
            super.setContentView(r3, r4)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(@Yue.InterfaceC4410 android.content.Intent r1, int r2) {
            r0 = this;
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(@Yue.InterfaceC4410 android.content.Intent r1, int r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r0 = this;
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(@Yue.InterfaceC4410 android.content.IntentSender r1, int r2, @Yue.InterfaceC4544 android.content.Intent r3, int r4, int r5, int r6) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(@Yue.InterfaceC4410 android.content.IntentSender r1, int r2, @Yue.InterfaceC4544 android.content.Intent r3, int r4, int r5, int r6, @Yue.InterfaceC4544 android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final androidx.activity.ComponentActivity.InterfaceExecutorC7234 m27732() {
            r1 = this;
            androidx.activity.ComponentActivity$ۥ۟۟۟ۡ r0 = new androidx.activity.ComponentActivity$ۥ۟۟۟ۡ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final /* synthetic */ Yue.C6593 m27733() {
            r1 = this;
            r1.reportFullyDrawn()
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ android.os.Bundle m27734() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.activity.result.ActivityResultRegistry r1 = r2.mActivityResultRegistry
            r1.m27780(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ void m27735(android.content.Context r2) {
            r1 = this;
            androidx.savedstate.ۥ r2 = r1.getSavedStateRegistry()
            java.lang.String r0 = "android:support:activity-result"
            android.os.Bundle r2 = r2.m30359(r0)
            if (r2 == 0) goto L11
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            r0.m27779(r2)
        L11:
            return
    }
}
