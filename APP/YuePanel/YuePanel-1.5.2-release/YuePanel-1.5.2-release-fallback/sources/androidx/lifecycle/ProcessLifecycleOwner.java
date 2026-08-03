package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0002/.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "LYue/ۥۣۢ۠ۤ;", "activityStarted$lifecycle_process_release", "activityStarted", "activityResumed$lifecycle_process_release", "activityResumed", "activityPaused$lifecycle_process_release", "activityPaused", "activityStopped$lifecycle_process_release", "activityStopped", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "Landroid/content/Context;", "context", "attach$lifecycle_process_release", "(Landroid/content/Context;)V", "attach", "", "startedCounter", "I", "resumedCounter", "", "pauseSent", "Z", "stopSent", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Ljava/lang/Runnable;", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "initializationListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleOwner implements androidx.lifecycle.LifecycleOwner {

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.ProcessLifecycleOwner.Companion Companion = null;
    public static final long TIMEOUT_MS = 700;

    @Yue.InterfaceC4418
    private static final androidx.lifecycle.ProcessLifecycleOwner newInstance = null;

    @Yue.InterfaceC4418
    private final java.lang.Runnable delayedPauseRunnable;

    @Yue.InterfaceC4543
    private android.os.Handler handler;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.ReportFragment.ActivityInitializationListener initializationListener;
    private boolean pauseSent;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.LifecycleRegistry registry;
    private int resumedCounter;
    private int startedCounter;
    private boolean stopSent;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "LYue/ۥۣۢ۠ۤ;", "registerActivityLifecycleCallbacks", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    @Yue.InterfaceC5336(29)
    public static final class Api29Impl {

        @Yue.InterfaceC4418
        public static final androidx.lifecycle.ProcessLifecycleOwner.Api29Impl INSTANCE = null;

        static {
                androidx.lifecycle.ProcessLifecycleOwner$Api29Impl r0 = new androidx.lifecycle.ProcessLifecycleOwner$Api29Impl
                r0.<init>()
                androidx.lifecycle.ProcessLifecycleOwner.Api29Impl.INSTANCE = r0
                return
        }

        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC3427
        public static final void registerActivityLifecycleCallbacks(@Yue.InterfaceC4418 android.app.Activity r1, @Yue.InterfaceC4418 android.app.Application.ActivityLifecycleCallbacks r2) {
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r1, r0)
                java.lang.String r0 = "callback"
                Yue.C3329.m13906(r2, r0)
                r1.registerActivityLifecycleCallbacks(r2)
                return
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "get", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "LYue/ۥۣۢ۠ۤ;", "init$lifecycle_process_release", "(Landroid/content/Context;)V", "init", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process_release$annotations", "Landroidx/lifecycle/ProcessLifecycleOwner;", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC6959
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final androidx.lifecycle.LifecycleOwner get() {
                r1 = this;
                androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.access$getNewInstance$cp()
                return r0
        }

        @Yue.InterfaceC3427
        public final void init$lifecycle_process_release(@Yue.InterfaceC4418 android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                Yue.C3329.m13906(r2, r0)
                androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.access$getNewInstance$cp()
                r0.attach$lifecycle_process_release(r2)
                return
        }
    }

    static {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = new androidx.lifecycle.ProcessLifecycleOwner$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.ProcessLifecycleOwner.Companion = r0
            androidx.lifecycle.ProcessLifecycleOwner r0 = new androidx.lifecycle.ProcessLifecycleOwner
            r0.<init>()
            androidx.lifecycle.ProcessLifecycleOwner.newInstance = r0
            return
    }

    private ProcessLifecycleOwner() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.pauseSent = r0
            r1.stopSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.registry = r0
            Yue.ۥۡۥۡ۟ r0 = new Yue.ۥۡۥۡ۟
            r0.<init>(r1)
            r1.delayedPauseRunnable = r0
            androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1 r0 = new androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
            r0.<init>(r1)
            r1.initializationListener = r0
            return
    }

    public static final /* synthetic */ androidx.lifecycle.ReportFragment.ActivityInitializationListener access$getInitializationListener$p(androidx.lifecycle.ProcessLifecycleOwner r0) {
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r0.initializationListener
            return r0
    }

    public static final /* synthetic */ androidx.lifecycle.ProcessLifecycleOwner access$getNewInstance$cp() {
            androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.newInstance
            return r0
    }

    private static final void delayedPauseRunnable$lambda$0(androidx.lifecycle.ProcessLifecycleOwner r1) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            r1.dispatchPauseIfNeeded$lifecycle_process_release()
            r1.dispatchStopIfNeeded$lifecycle_process_release()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final androidx.lifecycle.LifecycleOwner get() {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            androidx.lifecycle.LifecycleOwner r0 = r0.get()
            return r0
    }

    @Yue.InterfaceC3427
    public static final void init$lifecycle_process_release(@Yue.InterfaceC4418 android.content.Context r1) {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            r0.init$lifecycle_process_release(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29516(androidx.lifecycle.ProcessLifecycleOwner r0) {
            delayedPauseRunnable$lambda$0(r0)
            return
    }

    public final void activityPaused$lifecycle_process_release() {
            r4 = this;
            int r0 = r4.resumedCounter
            int r0 = r0 + (-1)
            r4.resumedCounter = r0
            if (r0 != 0) goto L14
            android.os.Handler r0 = r4.handler
            Yue.C3329.m13903(r0)
            java.lang.Runnable r1 = r4.delayedPauseRunnable
            r2 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r1, r2)
        L14:
            return
    }

    public final void activityResumed$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.resumedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.resumedCounter = r0
            if (r0 != r1) goto L21
            boolean r0 = r2.pauseSent
            if (r0 == 0) goto L17
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.pauseSent = r0
            goto L21
        L17:
            android.os.Handler r0 = r2.handler
            Yue.C3329.m13903(r0)
            java.lang.Runnable r1 = r2.delayedPauseRunnable
            r0.removeCallbacks(r1)
        L21:
            return
    }

    public final void activityStarted$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.startedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.startedCounter = r0
            if (r0 != r1) goto L16
            boolean r0 = r2.stopSent
            if (r0 == 0) goto L16
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.stopSent = r0
        L16:
            return
    }

    public final void activityStopped$lifecycle_process_release() {
            r1 = this;
            int r0 = r1.startedCounter
            int r0 = r0 + (-1)
            r1.startedCounter = r0
            r1.dispatchStopIfNeeded$lifecycle_process_release()
            return
    }

    public final void attach$lifecycle_process_release(@Yue.InterfaceC4418 android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r3, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.handler = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            Yue.C3329.m13904(r3, r0)
            android.app.Application r3 = (android.app.Application) r3
            androidx.lifecycle.ProcessLifecycleOwner$attach$1 r0 = new androidx.lifecycle.ProcessLifecycleOwner$attach$1
            r0.<init>(r2)
            r3.registerActivityLifecycleCallbacks(r0)
            return
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.resumedCounter
            if (r0 != 0) goto Le
            r0 = 1
            r2.pauseSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
        Le:
            return
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.startedCounter
            if (r0 != 0) goto L12
            boolean r0 = r2.pauseSent
            if (r0 == 0) goto L12
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 1
            r2.stopSent = r0
        L12:
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4418
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.registry
            return r0
    }
}
