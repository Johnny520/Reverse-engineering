package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LYue/ۥۣۢ۠ۤ;", "init", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class LifecycleDispatcher {

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.LifecycleDispatcher INSTANCE = null;

    @Yue.InterfaceC4418
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = null;

    @Yue.InterfaceC6959
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "LYue/ۥۣۢ۠ۤ;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    public static final class DispatcherActivityCallback extends androidx.lifecycle.EmptyActivityLifecycleCallbacks {
        public DispatcherActivityCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@Yue.InterfaceC4418 android.app.Activity r1, @Yue.InterfaceC4543 android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                Yue.C3329.m13906(r1, r2)
                androidx.lifecycle.ReportFragment$Companion r2 = androidx.lifecycle.ReportFragment.Companion
                r2.injectIfNeededIn(r1)
                return
        }
    }

    static {
            androidx.lifecycle.LifecycleDispatcher r0 = new androidx.lifecycle.LifecycleDispatcher
            r0.<init>()
            androidx.lifecycle.LifecycleDispatcher.INSTANCE = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleDispatcher.initialized = r0
            return
    }

    private LifecycleDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3427
    public static final void init(@Yue.InterfaceC4418 android.content.Context r2) {
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.lifecycle.LifecycleDispatcher.initialized
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            Yue.C3329.m13904(r2, r0)
            android.app.Application r2 = (android.app.Application) r2
            androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback r0 = new androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
            return
    }
}
