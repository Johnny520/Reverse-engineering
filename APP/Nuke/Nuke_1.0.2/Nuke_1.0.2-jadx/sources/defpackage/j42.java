package defpackage;

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
    public final Instrumentation a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j42(Instrumentation instrumentation) {
        this.a = instrumentation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final TestLooperManager acquireLooperManager(Looper looper) {
        return this.a.acquireLooperManager(looper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.a.addMonitor(str, activityResult, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void addResults(Bundle bundle) {
        this.a.addResults(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        boolean zIsAssignableFrom;
        if (bundle != null) {
            try {
                zIsAssignableFrom = qj.class.isAssignableFrom(c5.d.loadClass(activity.getClass().getName()));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                bundle.setClassLoader(c5.d);
            }
        }
        lg3.a(activity);
        pp1.g(activity);
        this.a.callActivityOnCreate(activity, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        this.a.callActivityOnDestroy(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.a.callActivityOnNewIntent(activity, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        this.a.callActivityOnPause(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnPictureInPictureRequested(Activity activity) {
        this.a.callActivityOnPictureInPictureRequested(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.a.callActivityOnPostCreate(activity, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnRestart(Activity activity) {
        this.a.callActivityOnRestart(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.a.callActivityOnRestoreInstanceState(activity, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        this.a.callActivityOnResume(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.a.callActivityOnSaveInstanceState(activity, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnStart(Activity activity) {
        this.a.callActivityOnStart(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnStop(Activity activity) {
        this.a.callActivityOnStop(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callActivityOnUserLeaving(Activity activity) {
        this.a.callActivityOnUserLeaving(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void callApplicationOnCreate(Application application) {
        this.a.callApplicationOnCreate(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.a.checkMonitorHit(activityMonitor, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void endPerformanceSnapshot() {
        this.a.endPerformanceSnapshot();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void finish(int i, Bundle bundle) {
        this.a.finish(i, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Bundle getAllocCounts() {
        return this.a.getAllocCounts();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Bundle getBinderCounts() {
        return this.a.getBinderCounts();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final ComponentName getComponentName() {
        return this.a.getComponentName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Context getContext() {
        return this.a.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final String getProcessName() {
        return this.a.getProcessName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Context getTargetContext() {
        return this.a.getTargetContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation() {
        return this.a.getUiAutomation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.a.invokeContextMenuAction(activity, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.a.invokeMenuActionSync(activity, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final boolean isProfiling() {
        return this.a.isProfiling();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws Exception {
        boolean zIsAssignableFrom;
        try {
            return this.a.newActivity(classLoader, str, intent);
        } catch (Exception e) {
            try {
                zIsAssignableFrom = qj.class.isAssignableFrom(c5.d.loadClass(str));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                return (Activity) c5.d.loadClass(str).newInstance();
            }
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.a.newApplication(classLoader, str, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void onCreate(Bundle bundle) {
        this.a.onCreate(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void onDestroy() {
        this.a.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        return this.a.onException(obj, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void onStart() {
        this.a.onStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.a.removeMonitor(activityMonitor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void runOnMainSync(Runnable runnable) {
        this.a.runOnMainSync(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendCharacterSync(int i) {
        this.a.sendCharacterSync(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendKeyDownUpSync(int i) {
        this.a.sendKeyDownUpSync(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendKeySync(KeyEvent keyEvent) {
        this.a.sendKeySync(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendPointerSync(MotionEvent motionEvent) {
        this.a.sendPointerSync(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendStatus(int i, Bundle bundle) {
        this.a.sendStatus(i, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendStringSync(String str) {
        this.a.sendStringSync(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void sendTrackballEventSync(MotionEvent motionEvent) {
        this.a.sendTrackballEventSync(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void setAutomaticPerformanceSnapshots() {
        this.a.setAutomaticPerformanceSnapshots();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void setInTouchMode(boolean z) {
        this.a.setInTouchMode(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void start() {
        this.a.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent) {
        return this.a.startActivitySync(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void startAllocCounting() {
        this.a.startAllocCounting();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void startPerformanceSnapshot() {
        this.a.startPerformanceSnapshot();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void startProfiling() {
        this.a.startProfiling();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void stopAllocCounting() {
        this.a.stopAllocCounting();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void stopProfiling() {
        this.a.stopProfiling();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void waitForIdle(Runnable runnable) {
        this.a.waitForIdle(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final void waitForIdleSync() {
        this.a.waitForIdleSync();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.a.waitForMonitor(activityMonitor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Instrumentation
    public final Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.a.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.a.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.a.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.a.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.a.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation(int i) {
        return this.a.getUiAutomation(i);
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent, Bundle bundle) {
        return this.a.startActivitySync(intent, bundle);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.a.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.a.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        boolean zIsAssignableFrom;
        if (bundle != null) {
            try {
                zIsAssignableFrom = qj.class.isAssignableFrom(c5.d.loadClass(activity.getClass().getName()));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                bundle.setClassLoader(c5.d);
            }
        }
        lg3.a(activity);
        pp1.g(activity);
        this.a.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
