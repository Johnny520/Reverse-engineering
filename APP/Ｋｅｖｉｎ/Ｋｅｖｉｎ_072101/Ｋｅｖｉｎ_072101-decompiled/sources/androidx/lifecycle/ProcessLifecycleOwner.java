package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class ProcessLifecycleOwner implements androidx.lifecycle.LifecycleOwner {
    static final long TIMEOUT_MS = 700;
    private static final androidx.lifecycle.ProcessLifecycleOwner sInstance = null;
    private java.lang.Runnable mDelayedPauseRunnable;
    private android.os.Handler mHandler;
    androidx.lifecycle.ReportFragment.ActivityInitializationListener mInitializationListener;
    private boolean mPauseSent;
    private final androidx.lifecycle.LifecycleRegistry mRegistry;
    private int mResumedCounter;
    private int mStartedCounter;
    private boolean mStopSent;




    static {
            androidx.lifecycle.ProcessLifecycleOwner r0 = new androidx.lifecycle.ProcessLifecycleOwner
            r0.<init>()
            androidx.lifecycle.ProcessLifecycleOwner.sInstance = r0
            return
    }

    private ProcessLifecycleOwner() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStartedCounter = r0
            r1.mResumedCounter = r0
            r0 = 1
            r1.mPauseSent = r0
            r1.mStopSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mRegistry = r0
            androidx.lifecycle.ProcessLifecycleOwner$1 r0 = new androidx.lifecycle.ProcessLifecycleOwner$1
            r0.<init>(r1)
            r1.mDelayedPauseRunnable = r0
            androidx.lifecycle.ProcessLifecycleOwner$2 r0 = new androidx.lifecycle.ProcessLifecycleOwner$2
            r0.<init>(r1)
            r1.mInitializationListener = r0
            return
    }

    public static androidx.lifecycle.LifecycleOwner get() {
            androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.sInstance
            return r0
    }

    static void init(android.content.Context r1) {
            androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.sInstance
            r0.attach(r1)
            return
    }

    void activityPaused() {
            r4 = this;
            int r0 = r4.mResumedCounter
            int r0 = r0 + (-1)
            r4.mResumedCounter = r0
            int r0 = r4.mResumedCounter
            if (r0 != 0) goto L13
            android.os.Handler r0 = r4.mHandler
            java.lang.Runnable r1 = r4.mDelayedPauseRunnable
            r2 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r1, r2)
        L13:
            return
    }

    void activityResumed() {
            r2 = this;
            int r0 = r2.mResumedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.mResumedCounter = r0
            int r0 = r2.mResumedCounter
            if (r0 != r1) goto L20
            boolean r0 = r2.mPauseSent
            if (r0 == 0) goto L19
            androidx.lifecycle.LifecycleRegistry r0 = r2.mRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.mPauseSent = r0
            goto L20
        L19:
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mDelayedPauseRunnable
            r0.removeCallbacks(r1)
        L20:
            return
    }

    void activityStarted() {
            r2 = this;
            int r0 = r2.mStartedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.mStartedCounter = r0
            int r0 = r2.mStartedCounter
            if (r0 != r1) goto L18
            boolean r0 = r2.mStopSent
            if (r0 == 0) goto L18
            androidx.lifecycle.LifecycleRegistry r0 = r2.mRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.mStopSent = r0
        L18:
            return
    }

    void activityStopped() {
            r1 = this;
            int r0 = r1.mStartedCounter
            int r0 = r0 + (-1)
            r1.mStartedCounter = r0
            r1.dispatchStopIfNeeded()
            return
    }

    void attach(android.content.Context r3) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.mHandler = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.mRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            android.content.Context r0 = r3.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.ProcessLifecycleOwner$3 r1 = new androidx.lifecycle.ProcessLifecycleOwner$3
            r1.<init>(r2)
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    void dispatchPauseIfNeeded() {
            r2 = this;
            int r0 = r2.mResumedCounter
            if (r0 != 0) goto Le
            r0 = 1
            r2.mPauseSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.mRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
        Le:
            return
    }

    void dispatchStopIfNeeded() {
            r2 = this;
            int r0 = r2.mStartedCounter
            if (r0 != 0) goto L12
            boolean r0 = r2.mPauseSent
            if (r0 == 0) goto L12
            androidx.lifecycle.LifecycleRegistry r0 = r2.mRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 1
            r2.mStopSent = r0
        L12:
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mRegistry
            return r0
    }
}
