package p381;

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
import com.bumptech.glide.AbstractC3056;
import p382.AbstractC9002;
import p389.AbstractC9090;

/* JADX INFO: renamed from: 飘花落叶言苏楪世兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentationC8999 extends Instrumentation {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Instrumentation f25272;

    public InstrumentationC8999(Instrumentation instrumentation) {
        this.f25272 = instrumentation;
    }

    @Override // android.app.Instrumentation
    public final TestLooperManager acquireLooperManager(Looper looper) {
        return this.f25272.acquireLooperManager(looper);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f25272.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final void addResults(Bundle bundle) {
        this.f25272.addResults(bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        if (bundle != null && AbstractC9002.m14612(activity.getClass().getName())) {
            Object[][] objArr = AbstractC9090.f25478;
            bundle.setClassLoader(AbstractC9090.class.getClassLoader());
        }
        AbstractC3056.m6687(activity);
        this.f25272.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        this.f25272.callActivityOnDestroy(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.f25272.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        this.f25272.callActivityOnPause(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPictureInPictureRequested(Activity activity) {
        this.f25272.callActivityOnPictureInPictureRequested(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.f25272.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestart(Activity activity) {
        this.f25272.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.f25272.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        this.f25272.callActivityOnResume(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.f25272.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStart(Activity activity) {
        this.f25272.callActivityOnStart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStop(Activity activity) {
        this.f25272.callActivityOnStop(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnUserLeaving(Activity activity) {
        this.f25272.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public final void callApplicationOnCreate(Application application) {
        this.f25272.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public final boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.f25272.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public final void endPerformanceSnapshot() {
        this.f25272.endPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void finish(int i, Bundle bundle) {
        this.f25272.finish(i, bundle);
    }

    @Override // android.app.Instrumentation
    public final Bundle getAllocCounts() {
        return this.f25272.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public final Bundle getBinderCounts() {
        return this.f25272.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public final ComponentName getComponentName() {
        return this.f25272.getComponentName();
    }

    @Override // android.app.Instrumentation
    public final Context getContext() {
        return this.f25272.getContext();
    }

    @Override // android.app.Instrumentation
    public final String getProcessName() {
        return this.f25272.getProcessName();
    }

    @Override // android.app.Instrumentation
    public final Context getTargetContext() {
        return this.f25272.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation() {
        return this.f25272.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public final boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.f25272.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public final boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.f25272.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public final boolean isProfiling() {
        return this.f25272.isProfiling();
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws Exception {
        try {
            return this.f25272.newActivity(classLoader, str, intent);
        } catch (Exception e) {
            if (!AbstractC9002.m14612(str)) {
                throw e;
            }
            Object[][] objArr = AbstractC9090.f25478;
            return (Activity) AbstractC9090.class.getClassLoader().loadClass(str).newInstance();
        }
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.f25272.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public final void onCreate(Bundle bundle) {
        this.f25272.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public final void onDestroy() {
        this.f25272.onDestroy();
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        return this.f25272.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public final void onStart() {
        this.f25272.onStart();
    }

    @Override // android.app.Instrumentation
    public final void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f25272.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final void runOnMainSync(Runnable runnable) {
        this.f25272.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public final void sendCharacterSync(int i) {
        this.f25272.sendCharacterSync(i);
    }

    @Override // android.app.Instrumentation
    public final void sendKeyDownUpSync(int i) {
        this.f25272.sendKeyDownUpSync(i);
    }

    @Override // android.app.Instrumentation
    public final void sendKeySync(KeyEvent keyEvent) {
        this.f25272.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendPointerSync(MotionEvent motionEvent) {
        this.f25272.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendStatus(int i, Bundle bundle) {
        this.f25272.sendStatus(i, bundle);
    }

    @Override // android.app.Instrumentation
    public final void sendStringSync(String str) {
        this.f25272.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public final void sendTrackballEventSync(MotionEvent motionEvent) {
        this.f25272.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void setAutomaticPerformanceSnapshots() {
        this.f25272.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public final void setInTouchMode(boolean z) {
        this.f25272.setInTouchMode(z);
    }

    @Override // android.app.Instrumentation
    public final void start() {
        this.f25272.start();
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent) {
        return this.f25272.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public final void startAllocCounting() {
        this.f25272.startAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void startPerformanceSnapshot() {
        this.f25272.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void startProfiling() {
        this.f25272.startProfiling();
    }

    @Override // android.app.Instrumentation
    public final void stopAllocCounting() {
        this.f25272.stopAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void stopProfiling() {
        this.f25272.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public final void waitForIdle(Runnable runnable) {
        this.f25272.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public final void waitForIdleSync() {
        this.f25272.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.f25272.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.f25272.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f25272.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f25272.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f25272.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f25272.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation(int i) {
        return this.f25272.getUiAutomation(i);
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent, Bundle bundle) {
        return this.f25272.startActivitySync(intent, bundle);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f25272.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.f25272.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        if (bundle != null && AbstractC9002.m14612(activity.getClass().getName())) {
            Object[][] objArr = AbstractC9090.f25478;
            bundle.setClassLoader(AbstractC9090.class.getClassLoader());
        }
        AbstractC3056.m6687(activity);
        this.f25272.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
