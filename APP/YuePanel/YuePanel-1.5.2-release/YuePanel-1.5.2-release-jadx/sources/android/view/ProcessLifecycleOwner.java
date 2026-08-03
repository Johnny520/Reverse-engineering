package android.view;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC4482;
import Yue.InterfaceC5578;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7113;
import Yue.InterfaceC8392;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Lifecycle;
import android.view.ProcessLifecycleOwner;
import android.view.ReportFragment;
import androidx.appcompat.widget.C1629;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0002/.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۣۢ۠ۤ;", "activityStarted$lifecycle_process_release", "activityStarted", "activityResumed$lifecycle_process_release", "activityResumed", "activityPaused$lifecycle_process_release", "activityPaused", "activityStopped$lifecycle_process_release", "activityStopped", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "Landroid/content/Context;", "context", "attach$lifecycle_process_release", "(Landroid/content/Context;)V", "attach", "", "startedCounter", "I", "resumedCounter", "", "pauseSent", "Z", "stopSent", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Ljava/lang/Runnable;", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "initializationListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final long TIMEOUT_MS = 700;

    @InterfaceC6489
    private Handler handler;
    private int resumedCounter;
    private int startedCounter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private boolean pauseSent = true;
    private boolean stopSent = true;

    @InterfaceC6399
    private final LifecycleRegistry registry = new LifecycleRegistry(this);

    @InterfaceC6399
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: Yue.ۥۡۥۡ۟
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(this.f17684);
        }
    };

    @InterfaceC6399
    private final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            this.this$0.activityResumed$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            this.this$0.activityStarted$lifecycle_process_release();
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Activity;", C1629.f26361, "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "LYue/ۥۣۢ۠ۤ;", "registerActivityLifecycleCallbacks", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    @InterfaceC7113(29)
    public static final class Api29Impl {

        @InterfaceC6399
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @InterfaceC4482
        @InterfaceC5578
        public static final void registerActivityLifecycleCallbacks(@InterfaceC6399 Activity activity, @InterfaceC6399 Application.ActivityLifecycleCallbacks callback) {
            C5499.m17103(activity, C1629.f26361);
            C5499.m17103(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroidx/lifecycle/LifecycleOwner;", "get", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "LYue/ۥۣۢ۠ۤ;", "init$lifecycle_process_release", "(Landroid/content/Context;)V", "init", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process_release$annotations", "Landroidx/lifecycle/ProcessLifecycleOwner;", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.ProcessLifecycleOwner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC8392
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }

        @InterfaceC6399
        @InterfaceC5578
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.newInstance;
        }

        @InterfaceC5578
        public final void init$lifecycle_process_release(@InterfaceC6399 Context context) {
            C5499.m17103(context, "context");
            ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner processLifecycleOwner) {
        C5499.m17103(processLifecycleOwner, "this$0");
        processLifecycleOwner.dispatchPauseIfNeeded$lifecycle_process_release();
        processLifecycleOwner.dispatchStopIfNeeded$lifecycle_process_release();
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final LifecycleOwner get() {
        return INSTANCE.get();
    }

    public final void activityPaused$lifecycle_process_release() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            C5499.m17100(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                C5499.m17100(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(@InterfaceC6399 Context context) {
        C5499.m17103(context, "context");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C5499.m17101(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // android.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@InterfaceC6399 Activity activity, @InterfaceC6489 Bundle savedInstanceState) {
                C5499.m17103(activity, C1629.f26361);
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.INSTANCE.get(activity).setProcessListener(this.this$0.initializationListener);
                }
            }

            @Override // android.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@InterfaceC6399 Activity activity) {
                C5499.m17103(activity, C1629.f26361);
                this.this$0.activityPaused$lifecycle_process_release();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            @InterfaceC7113(29)
            public void onActivityPreCreated(@InterfaceC6399 Activity activity, @InterfaceC6489 Bundle savedInstanceState) {
                C5499.m17103(activity, C1629.f26361);
                final ProcessLifecycleOwner processLifecycleOwner = this.this$0;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@InterfaceC6399 Activity activity2) {
                        C5499.m17103(activity2, C1629.f26361);
                        processLifecycleOwner.activityResumed$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@InterfaceC6399 Activity activity2) {
                        C5499.m17103(activity2, C1629.f26361);
                        processLifecycleOwner.activityStarted$lifecycle_process_release();
                    }
                });
            }

            @Override // android.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@InterfaceC6399 Activity activity) {
                C5499.m17103(activity, C1629.f26361);
                this.this$0.activityStopped$lifecycle_process_release();
            }
        });
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    @Override // android.view.LifecycleOwner
    @InterfaceC6399
    public Lifecycle getLifecycle() {
        return this.registry;
    }
}
