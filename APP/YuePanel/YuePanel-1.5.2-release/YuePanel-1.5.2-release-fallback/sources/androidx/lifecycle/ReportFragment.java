package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001c\u001b\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "listener", "LYue/ۥۣۢ۠ۤ;", "dispatchCreate", "(Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;)V", "dispatchStart", "dispatchResume", "Landroidx/lifecycle/Lifecycle$Event;", "event", "dispatch", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "processListener", "setProcessListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Companion", "ActivityInitializationListener", "LifecycleCallbacks", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
public class ReportFragment extends android.app.Fragment {

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.ReportFragment.Companion Companion = null;

    @Yue.InterfaceC4418
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    @Yue.InterfaceC4543
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener processListener;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "LYue/ۥۣۢ۠ۤ;", "onCreate", "()V", "onStart", "onResume", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\u00020\u000e*\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "LYue/ۥۣۢ۠ۤ;", "injectIfNeededIn", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "dispatch$lifecycle_runtime_release", "(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V", "dispatch", "Landroidx/lifecycle/ReportFragment;", "get", "(Landroid/app/Activity;)Landroidx/lifecycle/ReportFragment;", "get$annotations", "reportFragment", "", "REPORT_FRAGMENT_TAG", "Ljava/lang/String;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
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

        @Yue.InterfaceC3427
        public static /* synthetic */ void get$annotations(android.app.Activity r0) {
                return
        }

        @Yue.InterfaceC3427
        public final void dispatch$lifecycle_runtime_release(@Yue.InterfaceC4418 android.app.Activity r2, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "event"
                Yue.C3329.m13906(r3, r0)
                boolean r0 = r2 instanceof androidx.lifecycle.LifecycleRegistryOwner
                if (r0 == 0) goto L18
                androidx.lifecycle.LifecycleRegistryOwner r2 = (androidx.lifecycle.LifecycleRegistryOwner) r2
                androidx.lifecycle.LifecycleRegistry r2 = r2.getLifecycle()
                r2.handleLifecycleEvent(r3)
                return
            L18:
                boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
                if (r0 == 0) goto L2b
                androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
                androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
                boolean r0 = r2 instanceof androidx.lifecycle.LifecycleRegistry
                if (r0 == 0) goto L2b
                androidx.lifecycle.LifecycleRegistry r2 = (androidx.lifecycle.LifecycleRegistry) r2
                r2.handleLifecycleEvent(r3)
            L2b:
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3421(name = "get")
        public final androidx.lifecycle.ReportFragment get(@Yue.InterfaceC4418 android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r2, r0)
                android.app.FragmentManager r2 = r2.getFragmentManager()
                java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r2 = r2.findFragmentByTag(r0)
                java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"
                Yue.C3329.m13904(r2, r0)
                androidx.lifecycle.ReportFragment r2 = (androidx.lifecycle.ReportFragment) r2
                return r2
        }

        @Yue.InterfaceC3427
        public final void injectIfNeededIn(@Yue.InterfaceC4418 android.app.Activity r4) {
                r3 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r4, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion
                r0.registerIn(r4)
            L10:
                android.app.FragmentManager r4 = r4.getFragmentManager()
                java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r1 = r4.findFragmentByTag(r0)
                if (r1 != 0) goto L2f
                android.app.FragmentTransaction r1 = r4.beginTransaction()
                androidx.lifecycle.ReportFragment r2 = new androidx.lifecycle.ReportFragment
                r2.<init>()
                android.app.FragmentTransaction r0 = r1.add(r2, r0)
                r0.commit()
                r4.executePendingTransactions()
            L2f:
                return
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "LYue/ۥۣۢ۠ۤ;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    @Yue.InterfaceC5336(29)
    public static final class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {

        @Yue.InterfaceC4418
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion Companion = null;

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "LYue/ۥۣۢ۠ۤ;", "registerIn", "(Landroid/app/Activity;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
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

            @Yue.InterfaceC3427
            public final void registerIn(@Yue.InterfaceC4418 android.app.Activity r2) {
                    r1 = this;
                    java.lang.String r0 = "activity"
                    Yue.C3329.m13906(r2, r0)
                    androidx.lifecycle.ReportFragment$LifecycleCallbacks r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks
                    r0.<init>()
                    Yue.C5316.m20073(r2, r0)
                    return
            }
        }

        static {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion = r0
                return
        }

        public LifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC3427
        public static final void registerIn(@Yue.InterfaceC4418 android.app.Activity r1) {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion
                r0.registerIn(r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@Yue.InterfaceC4418 android.app.Activity r1, @Yue.InterfaceC4543 android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                Yue.C3329.m13906(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@Yue.InterfaceC4418 android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@Yue.InterfaceC4418 android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@Yue.InterfaceC4418 android.app.Activity r2, @Yue.InterfaceC4543 android.os.Bundle r3) {
                r1 = this;
                java.lang.String r3 = "activity"
                Yue.C3329.m13906(r2, r3)
                androidx.lifecycle.ReportFragment$Companion r3 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                r3.dispatch$lifecycle_runtime_release(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@Yue.InterfaceC4418 android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@Yue.InterfaceC4418 android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@Yue.InterfaceC4418 android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@Yue.InterfaceC4418 android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@Yue.InterfaceC4418 android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@Yue.InterfaceC4418 android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@Yue.InterfaceC4418 android.app.Activity r2, @Yue.InterfaceC4418 android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r2 = "bundle"
                Yue.C3329.m13906(r3, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@Yue.InterfaceC4418 android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@Yue.InterfaceC4418 android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                Yue.C3329.m13906(r2, r0)
                return
        }
    }

    static {
            androidx.lifecycle.ReportFragment$Companion r0 = new androidx.lifecycle.ReportFragment$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.ReportFragment.Companion = r0
            return
    }

    public ReportFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void dispatch(androidx.lifecycle.Lifecycle.Event r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L14
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            android.app.Activity r1 = r3.getActivity()
            java.lang.String r2 = "activity"
            Yue.C3329.m13905(r1, r2)
            r0.dispatch$lifecycle_runtime_release(r1, r4)
        L14:
            return
    }

    @Yue.InterfaceC3427
    public static final void dispatch$lifecycle_runtime_release(@Yue.InterfaceC4418 android.app.Activity r1, @Yue.InterfaceC4418 androidx.lifecycle.Lifecycle.Event r2) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r0.dispatch$lifecycle_runtime_release(r1, r2)
            return
    }

    private final void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onCreate()
        L5:
            return
    }

    private final void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onResume()
        L5:
            return
    }

    private final void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onStart()
        L5:
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "get")
    public static final androidx.lifecycle.ReportFragment get(@Yue.InterfaceC4418 android.app.Activity r1) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            androidx.lifecycle.ReportFragment r1 = r0.get(r1)
            return r1
    }

    @Yue.InterfaceC3427
    public static final void injectIfNeededIn(@Yue.InterfaceC4418 android.app.Activity r1) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r0.injectIfNeededIn(r1)
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Yue.InterfaceC4543 android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r1 = r0.processListener
            r0.dispatchCreate(r1)
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.dispatch(r1)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.dispatch(r0)
            r0 = 0
            r1.processListener = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchResume(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchStart(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.dispatch(r0)
            return
    }

    public final void setProcessListener(@Yue.InterfaceC4543 androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            r0.processListener = r1
            return
    }
}
