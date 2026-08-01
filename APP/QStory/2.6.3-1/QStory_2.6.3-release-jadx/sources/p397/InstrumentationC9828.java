package p397;

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
import com.bumptech.glide.AbstractC3888;
import p398.AbstractC9831;
import p405.AbstractC9919;

/* JADX INFO: renamed from: 飘花落叶言苏楪世兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentationC9828 extends Instrumentation {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Instrumentation f25617;

    public InstrumentationC9828(Instrumentation instrumentation) {
        this.f25617 = instrumentation;
    }

    @Override // android.app.Instrumentation
    public final TestLooperManager acquireLooperManager(Looper looper) {
        return this.f25617.acquireLooperManager(looper);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f25617.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final void addResults(Bundle bundle) {
        this.f25617.addResults(bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        if (bundle != null && AbstractC9831.m15171(activity.getClass().getName())) {
            Object[][] objArr = AbstractC9919.f25823;
            bundle.setClassLoader(AbstractC9919.class.getClassLoader());
        }
        AbstractC3888.m7247(activity);
        this.f25617.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        this.f25617.callActivityOnDestroy(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.f25617.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        this.f25617.callActivityOnPause(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPictureInPictureRequested(Activity activity) {
        this.f25617.callActivityOnPictureInPictureRequested(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.f25617.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestart(Activity activity) {
        this.f25617.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.f25617.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        this.f25617.callActivityOnResume(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.f25617.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStart(Activity activity) {
        this.f25617.callActivityOnStart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStop(Activity activity) {
        this.f25617.callActivityOnStop(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnUserLeaving(Activity activity) {
        this.f25617.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public final void callApplicationOnCreate(Application application) {
        this.f25617.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public final boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.f25617.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public final void endPerformanceSnapshot() {
        this.f25617.endPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void finish(int i, Bundle bundle) {
        this.f25617.finish(i, bundle);
    }

    @Override // android.app.Instrumentation
    public final Bundle getAllocCounts() {
        return this.f25617.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public final Bundle getBinderCounts() {
        return this.f25617.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public final ComponentName getComponentName() {
        return this.f25617.getComponentName();
    }

    @Override // android.app.Instrumentation
    public final Context getContext() {
        return this.f25617.getContext();
    }

    @Override // android.app.Instrumentation
    public final String getProcessName() {
        return this.f25617.getProcessName();
    }

    @Override // android.app.Instrumentation
    public final Context getTargetContext() {
        return this.f25617.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation() {
        return this.f25617.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public final boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.f25617.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public final boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.f25617.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public final boolean isProfiling() {
        return this.f25617.isProfiling();
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws Exception {
        try {
            return this.f25617.newActivity(classLoader, str, intent);
        } catch (Exception e) {
            if (!AbstractC9831.m15171(str)) {
                throw e;
            }
            Object[][] objArr = AbstractC9919.f25823;
            return (Activity) AbstractC9919.class.getClassLoader().loadClass(str).newInstance();
        }
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.f25617.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public final void onCreate(Bundle bundle) {
        this.f25617.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public final void onDestroy() {
        this.f25617.onDestroy();
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        return this.f25617.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public final void onStart() {
        this.f25617.onStart();
    }

    @Override // android.app.Instrumentation
    public final void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f25617.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final void runOnMainSync(Runnable runnable) {
        this.f25617.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public final void sendCharacterSync(int i) {
        this.f25617.sendCharacterSync(i);
    }

    @Override // android.app.Instrumentation
    public final void sendKeyDownUpSync(int i) {
        this.f25617.sendKeyDownUpSync(i);
    }

    @Override // android.app.Instrumentation
    public final void sendKeySync(KeyEvent keyEvent) {
        this.f25617.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendPointerSync(MotionEvent motionEvent) {
        this.f25617.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendStatus(int i, Bundle bundle) {
        this.f25617.sendStatus(i, bundle);
    }

    @Override // android.app.Instrumentation
    public final void sendStringSync(String str) {
        this.f25617.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public final void sendTrackballEventSync(MotionEvent motionEvent) {
        this.f25617.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void setAutomaticPerformanceSnapshots() {
        this.f25617.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public final void setInTouchMode(boolean z) {
        this.f25617.setInTouchMode(z);
    }

    @Override // android.app.Instrumentation
    public final void start() {
        this.f25617.start();
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent) {
        return this.f25617.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public final void startAllocCounting() {
        this.f25617.startAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void startPerformanceSnapshot() {
        this.f25617.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void startProfiling() {
        this.f25617.startProfiling();
    }

    @Override // android.app.Instrumentation
    public final void stopAllocCounting() {
        this.f25617.stopAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void stopProfiling() {
        this.f25617.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public final void waitForIdle(Runnable runnable) {
        this.f25617.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public final void waitForIdleSync() {
        this.f25617.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.f25617.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.f25617.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f25617.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f25617.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f25617.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f25617.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation(int i) {
        return this.f25617.getUiAutomation(i);
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent, Bundle bundle) {
        return this.f25617.startActivitySync(intent, bundle);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f25617.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.f25617.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        if (bundle != null && AbstractC9831.m15171(activity.getClass().getName())) {
            Object[][] objArr = AbstractC9919.f25823;
            bundle.setClassLoader(AbstractC9919.class.getClassLoader());
        }
        AbstractC3888.m7247(activity);
        this.f25617.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
