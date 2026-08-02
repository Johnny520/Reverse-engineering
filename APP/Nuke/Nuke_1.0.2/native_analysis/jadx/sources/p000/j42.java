package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.TestLooperManager;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j42 extends Instrumentation {

    /* JADX INFO: renamed from: a */
    public final Instrumentation f4890a;

    public j42(Instrumentation instrumentation) {
        this.f4890a = instrumentation;
    }

    @Override // android.app.Instrumentation
    public final TestLooperManager acquireLooperManager(Looper looper) {
        return this.f4890a.acquireLooperManager(looper);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f4890a.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final void addResults(Bundle bundle) {
        this.f4890a.addResults(bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        boolean zIsAssignableFrom;
        if (bundle != null) {
            try {
                zIsAssignableFrom = AbstractActivityC0621qj.class.isAssignableFrom(AbstractC0079c5.f1153d.loadClass(activity.getClass().getName()));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                bundle.setClassLoader(AbstractC0079c5.f1153d);
            }
        }
        lg3.m2909a(activity);
        pp1.m3935g(activity);
        this.f4890a.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        this.f4890a.callActivityOnDestroy(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.f4890a.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        this.f4890a.callActivityOnPause(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPictureInPictureRequested(Activity activity) {
        this.f4890a.callActivityOnPictureInPictureRequested(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.f4890a.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestart(Activity activity) {
        this.f4890a.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.f4890a.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        this.f4890a.callActivityOnResume(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.f4890a.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStart(Activity activity) {
        this.f4890a.callActivityOnStart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStop(Activity activity) {
        this.f4890a.callActivityOnStop(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnUserLeaving(Activity activity) {
        this.f4890a.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public final void callApplicationOnCreate(Application application) {
        this.f4890a.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public final boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.f4890a.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public final void endPerformanceSnapshot() {
        this.f4890a.endPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void finish(int i, Bundle bundle) {
        this.f4890a.finish(i, bundle);
    }

    @Override // android.app.Instrumentation
    public final Bundle getAllocCounts() {
        return this.f4890a.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public final Bundle getBinderCounts() {
        return this.f4890a.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public final ComponentName getComponentName() {
        return this.f4890a.getComponentName();
    }

    @Override // android.app.Instrumentation
    public final Context getContext() {
        return this.f4890a.getContext();
    }

    @Override // android.app.Instrumentation
    public final String getProcessName() {
        return this.f4890a.getProcessName();
    }

    @Override // android.app.Instrumentation
    public final Context getTargetContext() {
        return this.f4890a.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation() {
        return this.f4890a.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public final boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.f4890a.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public final boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.f4890a.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public final boolean isProfiling() {
        return this.f4890a.isProfiling();
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws Exception {
        boolean zIsAssignableFrom;
        try {
            return this.f4890a.newActivity(classLoader, str, intent);
        } catch (Exception e) {
            try {
                zIsAssignableFrom = AbstractActivityC0621qj.class.isAssignableFrom(AbstractC0079c5.f1153d.loadClass(str));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                return (Activity) AbstractC0079c5.f1153d.loadClass(str).newInstance();
            }
            throw e;
        }
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.f4890a.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public final void onCreate(Bundle bundle) {
        this.f4890a.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public final void onDestroy() {
        this.f4890a.onDestroy();
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        return this.f4890a.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public final void onStart() {
        this.f4890a.onStart();
    }

    @Override // android.app.Instrumentation
    public final void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f4890a.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final void runOnMainSync(Runnable runnable) {
        this.f4890a.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public final void sendCharacterSync(int i) {
        this.f4890a.sendCharacterSync(i);
    }

    @Override // android.app.Instrumentation
    public final void sendKeyDownUpSync(int i) {
        this.f4890a.sendKeyDownUpSync(i);
    }

    @Override // android.app.Instrumentation
    public final void sendKeySync(KeyEvent keyEvent) {
        this.f4890a.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendPointerSync(MotionEvent motionEvent) {
        this.f4890a.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendStatus(int i, Bundle bundle) {
        this.f4890a.sendStatus(i, bundle);
    }

    @Override // android.app.Instrumentation
    public final void sendStringSync(String str) {
        this.f4890a.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public final void sendTrackballEventSync(MotionEvent motionEvent) {
        this.f4890a.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void setAutomaticPerformanceSnapshots() {
        this.f4890a.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public final void setInTouchMode(boolean z) {
        this.f4890a.setInTouchMode(z);
    }

    @Override // android.app.Instrumentation
    public final void start() {
        this.f4890a.start();
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent) {
        return this.f4890a.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public final void startAllocCounting() {
        this.f4890a.startAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void startPerformanceSnapshot() {
        this.f4890a.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void startProfiling() {
        this.f4890a.startProfiling();
    }

    @Override // android.app.Instrumentation
    public final void stopAllocCounting() {
        this.f4890a.stopAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void stopProfiling() {
        this.f4890a.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public final void waitForIdle(Runnable runnable) {
        this.f4890a.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public final void waitForIdleSync() {
        this.f4890a.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.f4890a.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.f4890a.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f4890a.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f4890a.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f4890a.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f4890a.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation(int i) {
        return this.f4890a.getUiAutomation(i);
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent, Bundle bundle) {
        return this.f4890a.startActivitySync(intent, bundle);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f4890a.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.f4890a.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        boolean zIsAssignableFrom;
        if (bundle != null) {
            try {
                zIsAssignableFrom = AbstractActivityC0621qj.class.isAssignableFrom(AbstractC0079c5.f1153d.loadClass(activity.getClass().getName()));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                bundle.setClassLoader(AbstractC0079c5.f1153d);
            }
        }
        lg3.m2909a(activity);
        pp1.m3935g(activity);
        this.f4890a.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
