package android.view;

import Yue.C4335;
import Yue.C5499;
import Yue.C6411;
import Yue.InterfaceC5572;
import Yue.InterfaceC5578;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Lifecycle;
import androidx.appcompat.widget.C1629;
import androidx.fragment.app.C8882;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001c\u001b\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "listener", "LYue/ۥۣۢ۠ۤ;", "dispatchCreate", "(Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;)V", "dispatchStart", "dispatchResume", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "dispatch", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroid/os/Bundle;", C8882.f29747, "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "processListener", "setProcessListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Companion", "ActivityInitializationListener", "LifecycleCallbacks", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
public class ReportFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private static final String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    @InterfaceC6489
    private ActivityInitializationListener processListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "LYue/ۥۣۢ۠ۤ;", "onCreate", "()V", "onStart", "onResume", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\u00020\u000e*\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Activity;", C1629.f26361, "LYue/ۥۣۢ۠ۤ;", "injectIfNeededIn", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "dispatch$lifecycle_runtime_release", "(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V", "dispatch", "Landroidx/lifecycle/ReportFragment;", "get", "(Landroid/app/Activity;)Landroidx/lifecycle/ReportFragment;", "get$annotations", "reportFragment", "", "REPORT_FRAGMENT_TAG", "Ljava/lang/String;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.ReportFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC5578
        public static /* synthetic */ void get$annotations(Activity activity) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC5578
        public final void dispatch$lifecycle_runtime_release(@InterfaceC6399 Activity activity, @InterfaceC6399 Lifecycle.Event event) {
            C5499.m17103(activity, C1629.f26361);
            C5499.m17103(event, C6411.f16276);
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
            } else if (activity instanceof LifecycleOwner) {
                Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        @InterfaceC6399
        @InterfaceC5572(name = "get")
        public final ReportFragment get(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(ReportFragment.REPORT_FRAGMENT_TAG);
            C5499.m17101(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) fragmentFindFragmentByTag;
        }

        @InterfaceC5578
        public final void injectIfNeededIn(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
            if (Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.INSTANCE.registerIn(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(ReportFragment.REPORT_FRAGMENT_TAG) == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), ReportFragment.REPORT_FRAGMENT_TAG).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Activity;", C1629.f26361, "Landroid/os/Bundle;", "bundle", "LYue/ۥۣۢ۠ۤ;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", C8882.f29747, "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    @InterfaceC7113(29)
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @InterfaceC6399
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Activity;", C1629.f26361, "LYue/ۥۣۢ۠ۤ;", "registerIn", "(Landroid/app/Activity;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(C4335 c4335) {
                this();
            }

            @InterfaceC5578
            public final void registerIn(@InterfaceC6399 Activity activity) {
                C5499.m17103(activity, C1629.f26361);
                activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }
        }

        @InterfaceC5578
        public static final void registerIn(@InterfaceC6399 Activity activity) {
            INSTANCE.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@InterfaceC6399 Activity activity, @InterfaceC6489 Bundle bundle) {
            C5499.m17103(activity, C1629.f26361);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@InterfaceC6399 Activity activity, @InterfaceC6489 Bundle savedInstanceState) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@InterfaceC6399 Activity activity, @InterfaceC6399 Bundle bundle) {
            C5499.m17103(activity, C1629.f26361);
            C5499.m17103(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@InterfaceC6399 Activity activity) {
            C5499.m17103(activity, C1629.f26361);
        }
    }

    private final void dispatch(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = INSTANCE;
            Activity activity = getActivity();
            C5499.m17102(activity, C1629.f26361);
            companion.dispatch$lifecycle_runtime_release(activity, event);
        }
    }

    private final void dispatchCreate(ActivityInitializationListener listener) {
        if (listener != null) {
            listener.onCreate();
        }
    }

    private final void dispatchResume(ActivityInitializationListener listener) {
        if (listener != null) {
            listener.onResume();
        }
    }

    private final void dispatchStart(ActivityInitializationListener listener) {
        if (listener != null) {
            listener.onStart();
        }
    }

    @InterfaceC6399
    @InterfaceC5572(name = "get")
    public static final ReportFragment get(@InterfaceC6399 Activity activity) {
        return INSTANCE.get(activity);
    }

    @InterfaceC5578
    public static final void injectIfNeededIn(@InterfaceC6399 Activity activity) {
        INSTANCE.injectIfNeededIn(activity);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@InterfaceC6489 Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dispatchCreate(this.processListener);
        dispatch(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispatch(Lifecycle.Event.ON_DESTROY);
        this.processListener = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dispatch(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        dispatchResume(this.processListener);
        dispatch(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        dispatchStart(this.processListener);
        dispatch(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        dispatch(Lifecycle.Event.ON_STOP);
    }

    public final void setProcessListener(@InterfaceC6489 ActivityInitializationListener processListener) {
        this.processListener = processListener;
    }
}
