package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends a.D3 implements a.Gg, androidx.lifecycle.c, a.Ld, a.Yb, a.InterfaceC0112e0, a.Zb, a.InterfaceC0160gc, a.InterfaceC0069bc, a.InterfaceC0088cc, a.Xa {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.a mActivityResultRegistry;
    private int mContentLayoutId;
    final a.X3 mContextAwareHelper;
    private androidx.lifecycle.q.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final a.C0351r7 mFullyDrawnReporter;
    private final androidx.lifecycle.h mLifecycleRegistry;
    private final a.C0049ab mMenuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.res.Configuration>> mOnConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.C0499zb>> mOnMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.Intent>> mOnNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.C0410uc>> mOnPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<a.Q3<java.lang.Integer>> mOnTrimMemoryListeners;
    final androidx.activity.ComponentActivity.e mReportFullyDrawnExecutor;
    final a.Kd mSavedStateRegistryController;
    private a.Fg mViewModelStore;





    public class a extends androidx.activity.result.a {
        public final /* synthetic */ androidx.activity.ComponentActivity h;

        public a(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.h = r1
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.a
        public final void b(int r9, a.Y r10, android.os.Parcelable r11) {
                r8 = this;
                androidx.activity.ComponentActivity r0 = r8.h
                a.Y$a r1 = r10.b(r0, r11)
                if (r1 == 0) goto L1a
                android.os.Handler r10 = new android.os.Handler
                android.os.Looper r11 = android.os.Looper.getMainLooper()
                r10.<init>(r11)
                androidx.activity.a r11 = new androidx.activity.a
                r11.<init>(r8, r9, r1)
                r10.post(r11)
                return
            L1a:
                android.content.Intent r10 = r10.a(r0, r11)
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
                android.os.Bundle r1 = r10.getBundleExtra(r11)
                r10.removeExtra(r11)
            L44:
                r7 = r1
                goto L48
            L46:
                r1 = 0
                goto L44
            L48:
                java.lang.String r11 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                java.lang.String r1 = r10.getAction()
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto Ld9
                java.lang.String r11 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r10 = r10.getStringArrayExtra(r11)
                r11 = 0
                if (r10 != 0) goto L5f
                java.lang.String[] r10 = new java.lang.String[r11]
            L5f:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r2 = r11
            L65:
                int r3 = r10.length
                if (r2 >= r3) goto La1
                r3 = r10[r2]
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L8a
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 33
                if (r3 >= r4) goto L87
                r3 = r10[r2]
                java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L87
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r1.add(r3)
            L87:
                int r2 = r2 + 1
                goto L65
            L8a:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "Permission request for permissions "
                r11.<init>(r0)
                java.lang.String r10 = java.util.Arrays.toString(r10)
                java.lang.String r0 = " must not contain null or empty values"
                java.lang.String r10 = a.C0487z.h(r11, r10, r0)
                r9.<init>(r10)
                throw r9
            La1:
                int r2 = r1.size()
                if (r2 <= 0) goto Lac
                int r3 = r10.length
                int r3 = r3 - r2
                java.lang.String[] r3 = new java.lang.String[r3]
                goto Lad
            Lac:
                r3 = r10
            Lad:
                if (r2 <= 0) goto Lcb
                int r4 = r10.length
                if (r2 != r4) goto Lb3
                goto L112
            Lb3:
                r2 = r11
            Lb4:
                int r4 = r10.length
                if (r11 >= r4) goto Lcb
                java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
                boolean r4 = r1.contains(r4)
                if (r4 != 0) goto Lc8
                int r4 = r2 + 1
                r5 = r10[r11]
                r3[r2] = r5
                r2 = r4
            Lc8:
                int r11 = r11 + 1
                goto Lb4
            Lcb:
                boolean r11 = r0 instanceof a.U
                if (r11 == 0) goto Ld5
                r11 = r0
                a.U r11 = (a.U) r11
                r11.validateRequestPermissionsRequestCode(r9)
            Ld5:
                a.T.b(r0, r10, r9)
                return
            Ld9:
                java.lang.String r11 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                java.lang.String r1 = r10.getAction()
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto L113
                java.lang.String r11 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                android.os.Parcelable r10 = r10.getParcelableExtra(r11)
                a.g9 r10 = (a.C0157g9) r10
                android.content.IntentSender r1 = r10.f483a     // Catch: android.content.IntentSender.SendIntentException -> Lfe
                android.content.Intent r3 = r10.b     // Catch: android.content.IntentSender.SendIntentException -> Lfe
                int r4 = r10.c     // Catch: android.content.IntentSender.SendIntentException -> Lfe
                int r5 = r10.d     // Catch: android.content.IntentSender.SendIntentException -> Lfe
                r6 = 0
                r2 = r9
                r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.content.IntentSender.SendIntentException -> Lfb
                return
            Lfb:
                r0 = move-exception
            Lfc:
                r9 = r0
                goto L101
            Lfe:
                r0 = move-exception
                r2 = r9
                goto Lfc
            L101:
                android.os.Handler r10 = new android.os.Handler
                android.os.Looper r11 = android.os.Looper.getMainLooper()
                r10.<init>(r11)
                androidx.activity.b r11 = new androidx.activity.b
                r11.<init>(r8, r2, r9)
                r10.post(r11)
            L112:
                return
            L113:
                r2 = r9
                r0.startActivityForResult(r10, r2, r7)
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.ComponentActivity f788a;

        public b(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.<init>()
                r0.f788a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                androidx.activity.ComponentActivity r0 = r3.f788a     // Catch: java.lang.NullPointerException -> L6 java.lang.IllegalStateException -> L8
                androidx.activity.ComponentActivity.access$001(r0)     // Catch: java.lang.NullPointerException -> L6 java.lang.IllegalStateException -> L8
                return
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

    public static class c {
        public static android.window.OnBackInvokedDispatcher a(android.app.Activity r0) {
                android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
                return r0
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.Object f789a;
        public a.Fg b;

        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public interface e extends java.util.concurrent.Executor {
        void a(android.view.View r1);
    }

    public class f implements androidx.activity.ComponentActivity.e, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f790a;
        public java.lang.Runnable b;
        public boolean c;
        public final /* synthetic */ androidx.activity.ComponentActivity d;

        public f(androidx.activity.ComponentActivity r5) {
                r4 = this;
                r4.<init>()
                r4.d = r5
                long r0 = android.os.SystemClock.uptimeMillis()
                r2 = 10000(0x2710, double:4.9407E-320)
                long r0 = r0 + r2
                r4.f790a = r0
                r5 = 0
                r4.c = r5
                return
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void a(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 != 0) goto Le
                r0 = 1
                r1.c = r0
                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                r2.addOnDrawListener(r1)
            Le:
                return
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r3) {
                r2 = this;
                r2.b = r3
                androidx.activity.ComponentActivity r3 = r2.d
                android.view.Window r3 = r3.getWindow()
                android.view.View r3 = r3.getDecorView()
                boolean r0 = r2.c
                if (r0 == 0) goto L22
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                if (r0 != r1) goto L1e
                r3.invalidate()
                return
            L1e:
                r3.postInvalidate()
                return
            L22:
                a.M2 r0 = new a.M2
                r1 = 3
                r0.<init>(r1, r2)
                r3.postOnAnimation(r0)
                return
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
                r6 = this;
                java.lang.Runnable r0 = r6.b
                r1 = 0
                if (r0 == 0) goto L2a
                r0.run()
                r0 = 0
                r6.b = r0
                androidx.activity.ComponentActivity r0 = r6.d
                a.r7 r0 = r0.mFullyDrawnReporter
                java.lang.Object r2 = r0.f667a
                monitor-enter(r2)
                boolean r0 = r0.b     // Catch: java.lang.Throwable -> L27
                monitor-exit(r2)
                if (r0 == 0) goto L43
                r6.c = r1
                androidx.activity.ComponentActivity r0 = r6.d
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.post(r6)
                return
            L27:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L2a:
                long r2 = android.os.SystemClock.uptimeMillis()
                long r4 = r6.f790a
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L43
                r6.c = r1
                androidx.activity.ComponentActivity r0 = r6.d
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.post(r6)
            L43:
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.d
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnDrawListener(r1)
                return
        }
    }

    public ComponentActivity() {
            r5 = this;
            r5.<init>()
            a.X3 r0 = new a.X3
            r0.<init>()
            r5.mContextAwareHelper = r0
            a.ab r0 = new a.ab
            a.M2 r1 = new a.M2
            r2 = 2
            r1.<init>(r2, r5)
            r0.<init>(r1)
            r5.mMenuHostHelper = r0
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r5)
            r5.mLifecycleRegistry = r0
            a.Kd r0 = new a.Kd
            r0.<init>(r5)
            r5.mSavedStateRegistryController = r0
            r1 = 0
            r5.mOnBackPressedDispatcher = r1
            androidx.activity.ComponentActivity$e r1 = r5.createFullyDrawnExecutor()
            r5.mReportFullyDrawnExecutor = r1
            a.r7 r2 = new a.r7
            a.A3 r3 = new a.A3
            r4 = 0
            r3.<init>(r4, r5)
            r2.<init>(r1, r3)
            r5.mFullyDrawnReporter = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r5.mNextLocalRequestCode = r1
            androidx.activity.ComponentActivity$a r1 = new androidx.activity.ComponentActivity$a
            r1.<init>(r5)
            r5.mActivityResultRegistry = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.mOnConfigurationChangedListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.mOnTrimMemoryListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.mOnNewIntentListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.mOnMultiWindowModeChangedListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.mOnPictureInPictureModeChangedListeners = r1
            r1 = 0
            r5.mDispatchingOnMultiWindowModeChanged = r1
            r5.mDispatchingOnPictureInPictureModeChanged = r1
            androidx.lifecycle.e r1 = r5.getLifecycle()
            if (r1 == 0) goto Lba
            androidx.lifecycle.e r1 = r5.getLifecycle()
            androidx.activity.ComponentActivity$2 r2 = new androidx.activity.ComponentActivity$2
            r2.<init>(r5)
            r1.a(r2)
            androidx.lifecycle.e r1 = r5.getLifecycle()
            androidx.activity.ComponentActivity$3 r2 = new androidx.activity.ComponentActivity$3
            r2.<init>(r5)
            r1.a(r2)
            androidx.lifecycle.e r1 = r5.getLifecycle()
            androidx.activity.ComponentActivity$4 r2 = new androidx.activity.ComponentActivity$4
            r2.<init>(r5)
            r1.a(r2)
            r0.a()
            androidx.lifecycle.n.b(r5)
            androidx.savedstate.a r0 = r5.getSavedStateRegistry()
            a.B3 r1 = new a.B3
            r2 = 0
            r1.<init>(r2, r5)
            java.lang.String r2 = "android:support:activity-result"
            r0.c(r2, r1)
            a.C3 r0 = new a.C3
            r1 = 0
            r0.<init>(r5, r1)
            r5.addOnContextAvailableListener(r0)
            return
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            r0.<init>(r1)
            throw r0
    }

    public ComponentActivity(int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    public static /* synthetic */ void a(androidx.activity.ComponentActivity r0, androidx.activity.ComponentActivity r1) {
            r0.lambda$new$2(r1)
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

    public static /* synthetic */ android.os.Bundle b(androidx.activity.ComponentActivity r0) {
            android.os.Bundle r0 = r0.lambda$new$1()
            return r0
    }

    public static /* synthetic */ a.Wf c(androidx.activity.ComponentActivity r0) {
            a.Wf r0 = r0.lambda$new$0()
            return r0
    }

    private androidx.activity.ComponentActivity.e createFullyDrawnExecutor() {
            r1 = this;
            androidx.activity.ComponentActivity$f r0 = new androidx.activity.ComponentActivity$f
            r0.<init>(r1)
            return r0
    }

    private /* synthetic */ a.Wf lambda$new$0() {
            r1 = this;
            r1.reportFullyDrawn()
            r0 = 0
            return r0
    }

    private android.os.Bundle lambda$new$1() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.activity.result.a r1 = r5.mActivityResultRegistry
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap r3 = r1.b
            java.util.Collection r4 = r3.values()
            r2.<init>(r4)
            java.lang.String r4 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r0.putIntegerArrayList(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r3.keySet()
            r2.<init>(r3)
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r0.putStringArrayList(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r3 = r1.d
            r2.<init>(r3)
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r0.putStringArrayList(r3, r2)
            android.os.Bundle r1 = r1.g
            java.lang.Object r1 = r1.clone()
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r0.putBundle(r2, r1)
            return r0
    }

    private void lambda$new$2(android.content.Context r9) {
            r8 = this;
            androidx.savedstate.a r9 = r8.getSavedStateRegistry()
            java.lang.String r0 = "android:support:activity-result"
            android.os.Bundle r9 = r9.a(r0)
            if (r9 == 0) goto L73
            androidx.activity.result.a r0 = r8.mActivityResultRegistry
            r0.getClass()
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r1 = r9.getIntegerArrayList(r1)
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r2 = r9.getStringArrayList(r2)
            if (r2 == 0) goto L73
            if (r1 != 0) goto L22
            goto L73
        L22:
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r3 = r9.getStringArrayList(r3)
            r0.d = r3
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r9 = r9.getBundle(r3)
            android.os.Bundle r3 = r0.g
            r3.putAll(r9)
            r9 = 0
        L36:
            int r4 = r2.size()
            if (r9 >= r4) goto L73
            java.lang.Object r4 = r2.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap r5 = r0.b
            boolean r6 = r5.containsKey(r4)
            java.util.HashMap r7 = r0.f801a
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r5.remove(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r4 = r3.containsKey(r4)
            if (r4 != 0) goto L5b
            r7.remove(r6)
        L5b:
            java.lang.Object r4 = r1.get(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            java.lang.Object r6 = r2.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            r7.put(r4, r6)
            r5.put(r6, r4)
            int r9 = r9 + 1
            goto L36
        L73:
            return
    }

    @Override // android.app.Activity
    public void addContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3, @android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$e r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.a(r1)
            super.addContentView(r3, r4)
            return
    }

    @Override // a.Xa
    public void addMenuProvider(a.InterfaceC0159gb r3) {
            r2 = this;
            a.ab r0 = r2.mMenuHostHelper
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r1 = r0.b
            r1.add(r3)
            java.lang.Runnable r3 = r0.f400a
            r3.run()
            return
    }

    public void addMenuProvider(a.InterfaceC0159gb r6, a.InterfaceC0479y9 r7) {
            r5 = this;
            a.ab r0 = r5.mMenuHostHelper
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r1 = r0.b
            r1.add(r6)
            java.lang.Runnable r1 = r0.f400a
            r1.run()
            androidx.lifecycle.e r7 = r7.getLifecycle()
            java.util.HashMap r1 = r0.c
            java.lang.Object r2 = r1.remove(r6)
            a.ab$a r2 = (a.C0049ab.a) r2
            if (r2 == 0) goto L24
            androidx.lifecycle.e r3 = r2.f401a
            androidx.lifecycle.g r4 = r2.b
            r3.c(r4)
            r3 = 0
            r2.b = r3
        L24:
            a.Za r2 = new a.Za
            r2.<init>(r0, r6)
            a.ab$a r0 = new a.ab$a
            r0.<init>(r7, r2)
            r1.put(r6, r0)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public void addMenuProvider(a.InterfaceC0159gb r6, a.InterfaceC0479y9 r7, androidx.lifecycle.e.b r8) {
            r5 = this;
            a.ab r0 = r5.mMenuHostHelper
            r0.getClass()
            androidx.lifecycle.e r7 = r7.getLifecycle()
            java.util.HashMap r1 = r0.c
            java.lang.Object r2 = r1.remove(r6)
            a.ab$a r2 = (a.C0049ab.a) r2
            if (r2 == 0) goto L1d
            androidx.lifecycle.e r3 = r2.f401a
            androidx.lifecycle.g r4 = r2.b
            r3.c(r4)
            r3 = 0
            r2.b = r3
        L1d:
            a.Ya r2 = new a.Ya
            r2.<init>(r0, r8, r6)
            a.ab$a r8 = new a.ab$a
            r8.<init>(r7, r2)
            r1.put(r6, r8)
            return
    }

    @Override // a.Zb
    public final void addOnConfigurationChangedListener(a.Q3<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.add(r2)
            return
    }

    public final void addOnContextAvailableListener(a.InterfaceC0050ac r3) {
            r2 = this;
            a.X3 r0 = r2.mContextAwareHelper
            r0.getClass()
            java.lang.String r1 = "listener"
            a.C0193i9.e(r3, r1)
            androidx.activity.ComponentActivity r1 = r0.b
            if (r1 == 0) goto L11
            r3.a(r1)
        L11:
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f333a
            r0.add(r3)
            return
    }

    @Override // a.InterfaceC0069bc
    public final void addOnMultiWindowModeChangedListener(a.Q3<a.C0499zb> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.zb>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.add(r2)
            return
    }

    public final void addOnNewIntentListener(a.Q3<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.add(r2)
            return
    }

    @Override // a.InterfaceC0088cc
    public final void addOnPictureInPictureModeChangedListener(a.Q3<a.C0410uc> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.uc>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // a.InterfaceC0160gc
    public final void addOnTrimMemoryListener(a.Q3<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.add(r2)
            return
    }

    public void ensureViewModelStore() {
            r1 = this;
            a.Fg r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$d r0 = (androidx.activity.ComponentActivity.d) r0
            if (r0 == 0) goto L10
            a.Fg r0 = r0.b
            r1.mViewModelStore = r0
        L10:
            a.Fg r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            a.Fg r0 = new a.Fg
            r0.<init>()
            r1.mViewModelStore = r0
        L1b:
            return
    }

    @Override // a.InterfaceC0112e0
    public final androidx.activity.result.a getActivityResultRegistry() {
            r1 = this;
            androidx.activity.result.a r0 = r1.mActivityResultRegistry
            return r0
    }

    @Override // androidx.lifecycle.c
    public a.A4 getDefaultViewModelCreationExtras() {
            r4 = this;
            a.Ab r0 = new a.Ab
            r0.<init>()
            android.app.Application r1 = r4.getApplication()
            java.util.LinkedHashMap r2 = r0.f9a
            if (r1 == 0) goto L16
            androidx.lifecycle.p r1 = androidx.lifecycle.p.f942a
            android.app.Application r3 = r4.getApplication()
            r2.put(r1, r3)
        L16:
            androidx.lifecycle.n$b r1 = androidx.lifecycle.n.f940a
            r2.put(r1, r4)
            androidx.lifecycle.n$c r1 = androidx.lifecycle.n.b
            r2.put(r1, r4)
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L3d
            android.content.Intent r1 = r4.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L3d
            androidx.lifecycle.n$a r1 = androidx.lifecycle.n.c
            android.content.Intent r3 = r4.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            r2.put(r1, r3)
        L3d:
            return r0
    }

    public androidx.lifecycle.q.b getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.lifecycle.q$b r0 = r3.mDefaultFactory
            if (r0 != 0) goto L1f
            androidx.lifecycle.o r0 = new androidx.lifecycle.o
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
            androidx.lifecycle.q$b r0 = r3.mDefaultFactory
            return r0
    }

    public a.C0351r7 getFullyDrawnReporter() {
            r1 = this;
            a.r7 r0 = r1.mFullyDrawnReporter
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
            r1 = this;
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$d r0 = (androidx.activity.ComponentActivity.d) r0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.f789a
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // a.D3, a.InterfaceC0479y9
    public androidx.lifecycle.e getLifecycle() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // a.Yb
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r2 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            if (r0 != 0) goto L1c
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$b r1 = new androidx.activity.ComponentActivity$b
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mOnBackPressedDispatcher = r0
            androidx.lifecycle.e r0 = r2.getLifecycle()
            androidx.activity.ComponentActivity$6 r1 = new androidx.activity.ComponentActivity$6
            r1.<init>(r2)
            r0.a(r1)
        L1c:
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            return r0
    }

    @Override // a.Ld
    public final androidx.savedstate.a getSavedStateRegistry() {
            r1 = this;
            a.Kd r0 = r1.mSavedStateRegistryController
            androidx.savedstate.a r0 = r0.b
            return r0
    }

    @Override // a.Gg
    public a.Fg getViewModelStore() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lc
            r2.ensureViewModelStore()
            a.Fg r0 = r2.mViewModelStore
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    public void initializeViewTreeOwners() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            a.Mg.a(r0, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            int r2 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r0.setTag(r2, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.savedstate.b.a(r0, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.activity.c.a(r0, r3)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            a.C0193i9.e(r0, r1)
            int r1 = androidx.activity.R.id.report_drawn
            r0.setTag(r1, r3)
            return
    }

    public void invalidateMenu() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.a r0 = r1.mActivityResultRegistry
            boolean r0 = r0.a(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.getOnBackPressedDispatcher()
            r0.b()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.res.Configuration>> r0 = r2.mOnConfigurationChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            r1.a(r3)
            goto L9
        L19:
            return
    }

    @Override // a.D3, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            a.Kd r0 = r2.mSavedStateRegistryController
            r0.b(r3)
            a.X3 r0 = r2.mContextAwareHelper
            r0.getClass()
            r0.b = r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f333a
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            a.ac r1 = (a.InterfaceC0050ac) r1
            r1.a(r2)
            goto L12
        L22:
            super.onCreate(r3)
            int r3 = androidx.lifecycle.l.b
            androidx.lifecycle.l.a.b(r2)
            int r3 = r2.mContentLayoutId
            if (r3 == 0) goto L31
            r2.setContentView(r3)
        L31:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r3, android.view.Menu r4) {
            r2 = this;
            if (r3 != 0) goto L21
            super.onCreatePanelMenu(r3, r4)
            a.ab r3 = r2.mMenuHostHelper
            android.view.MenuInflater r0 = r2.getMenuInflater()
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r3 = r3.b
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            a.gb r1 = (a.InterfaceC0159gb) r1
            r1.a(r4, r0)
            goto L11
        L21:
            r3 = 1
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r4, android.view.MenuItem r5) {
            r3 = this;
            boolean r0 = super.onMenuItemSelected(r4, r5)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            if (r4 != 0) goto L26
            a.ab r4 = r3.mMenuHostHelper
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r4 = r4.b
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            a.gb r2 = (a.InterfaceC0159gb) r2
            boolean r2 = r2.c(r5)
            if (r2 == 0) goto L13
            return r1
        L26:
            return r0
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnMultiWindowModeChanged
            if (r0 == 0) goto L5
            goto L20
        L5:
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.zb>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            a.zb r2 = new a.zb
            r2.<init>(r4)
            r1.a(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r5, android.content.res.Configuration r6) {
            r4 = this;
            r0 = 1
            r4.mDispatchingOnMultiWindowModeChanged = r0
            r0 = 0
            super.onMultiWindowModeChanged(r5, r6)     // Catch: java.lang.Throwable -> L2a
            r4.mDispatchingOnMultiWindowModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.zb>> r0 = r4.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            a.zb r2 = new a.zb
            java.lang.String r3 = "newConfig"
            a.C0193i9.e(r6, r3)
            r2.<init>(r5)
            r1.a(r2)
            goto Lf
        L29:
            return
        L2a:
            r5 = move-exception
            r4.mDispatchingOnMultiWindowModeChanged = r0
            throw r5
    }

    @Override // android.app.Activity
    public void onNewIntent(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.content.Intent r3) {
            r2 = this;
            super.onNewIntent(r3)
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.Intent>> r0 = r2.mOnNewIntentListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            r1.a(r3)
            goto L9
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, android.view.Menu r4) {
            r2 = this;
            a.ab r0 = r2.mMenuHostHelper
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r0 = r0.b
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            a.gb r1 = (a.InterfaceC0159gb) r1
            r1.d(r4)
            goto L8
        L18:
            super.onPanelClosed(r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnPictureInPictureModeChanged
            if (r0 == 0) goto L5
            goto L20
        L5:
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.uc>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            a.uc r2 = new a.uc
            r2.<init>(r4)
            r1.a(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r5, android.content.res.Configuration r6) {
            r4 = this;
            r0 = 1
            r4.mDispatchingOnPictureInPictureModeChanged = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r5, r6)     // Catch: java.lang.Throwable -> L2a
            r4.mDispatchingOnPictureInPictureModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.uc>> r0 = r4.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            a.uc r2 = new a.uc
            java.lang.String r3 = "newConfig"
            a.C0193i9.e(r6, r3)
            r2.<init>(r5)
            r1.a(r2)
            goto Lf
        L29:
            return
        L2a:
            r5 = move-exception
            r4.mDispatchingOnPictureInPictureModeChanged = r0
            throw r5
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto L1d
            super.onPreparePanel(r1, r2, r3)
            a.ab r1 = r0.mMenuHostHelper
            java.util.concurrent.CopyOnWriteArrayList<a.gb> r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            a.gb r2 = (a.InterfaceC0159gb) r2
            r2.b(r3)
            goto Ld
        L1d:
            r1 = 1
            return r1
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            androidx.activity.result.a r0 = r3.mActivityResultRegistry
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.a(r4, r2, r1)
            if (r0 != 0) goto L1d
            super.onRequestPermissionsResult(r4, r5, r6)
        L1d:
            return
    }

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.onRetainCustomNonConfigurationInstance()
            a.Fg r1 = r3.mViewModelStore
            if (r1 != 0) goto L12
            java.lang.Object r2 = r3.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$d r2 = (androidx.activity.ComponentActivity.d) r2
            if (r2 == 0) goto L12
            a.Fg r1 = r2.b
        L12:
            if (r1 != 0) goto L18
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            androidx.activity.ComponentActivity$d r2 = new androidx.activity.ComponentActivity$d
            r2.<init>()
            r2.f789a = r0
            r2.b = r1
            return r2
    }

    @Override // a.D3, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.e r0 = r2.getLifecycle()
            boolean r1 = r0 instanceof androidx.lifecycle.h
            if (r1 == 0) goto Lf
            androidx.lifecycle.h r0 = (androidx.lifecycle.h) r0
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.c
            r0.h(r1)
        Lf:
            super.onSaveInstanceState(r3)
            a.Kd r0 = r2.mSavedStateRegistryController
            r0.c(r3)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r4) {
            r3 = this;
            super.onTrimMemory(r4)
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<java.lang.Integer>> r0 = r3.mOnTrimMemoryListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            a.Q3 r1 = (a.Q3) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.a(r2)
            goto L9
        L1d:
            return
    }

    public android.content.Context peekAvailableContext() {
            r1 = this;
            a.X3 r0 = r1.mContextAwareHelper
            androidx.activity.ComponentActivity r0 = r0.b
            return r0
    }

    public final <I, O> a.AbstractC0057b0<I> registerForActivityResult(a.Y<I, O> r2, a.X<O> r3) {
            r1 = this;
            androidx.activity.result.a r0 = r1.mActivityResultRegistry
            a.b0 r2 = r1.registerForActivityResult(r2, r0, r3)
            return r2
    }

    public final <I, O> a.AbstractC0057b0<I> registerForActivityResult(a.Y<I, O> r3, androidx.activity.result.a r4, a.X<O> r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "activity_rq#"
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a.c0 r3 = r4.c(r0, r2, r3, r5)
            return r3
    }

    @Override // a.Xa
    public void removeMenuProvider(a.InterfaceC0159gb r2) {
            r1 = this;
            a.ab r0 = r1.mMenuHostHelper
            r0.a(r2)
            return
    }

    @Override // a.Zb
    public final void removeOnConfigurationChangedListener(a.Q3<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.remove(r2)
            return
    }

    public final void removeOnContextAvailableListener(a.InterfaceC0050ac r3) {
            r2 = this;
            a.X3 r0 = r2.mContextAwareHelper
            r0.getClass()
            java.lang.String r1 = "listener"
            a.C0193i9.e(r3, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f333a
            r0.remove(r3)
            return
    }

    @Override // a.InterfaceC0069bc
    public final void removeOnMultiWindowModeChangedListener(a.Q3<a.C0499zb> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.zb>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.remove(r2)
            return
    }

    public final void removeOnNewIntentListener(a.Q3<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.remove(r2)
            return
    }

    @Override // a.InterfaceC0088cc
    public final void removeOnPictureInPictureModeChangedListener(a.Q3<a.C0410uc> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<a.uc>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // a.InterfaceC0160gc
    public final void removeOnTrimMemoryListener(a.Q3<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<a.Q3<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.remove(r2)
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            boolean r0 = a.C0503zf.a()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L1a
        Le:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> Lc
            a.r7 r0 = r1.mFullyDrawnReporter     // Catch: java.lang.Throwable -> Lc
            r0.a()     // Catch: java.lang.Throwable -> Lc
            android.os.Trace.endSection()
            return
        L1a:
            android.os.Trace.endSection()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$e r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.a(r1)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$e r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.a(r1)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(@android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.View r3, @android.annotation.SuppressLint({"UnknownNullness", "MissingNullability"}) android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$e r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.a(r1)
            super.setContentView(r3, r4)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2) {
            r0 = this;
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
