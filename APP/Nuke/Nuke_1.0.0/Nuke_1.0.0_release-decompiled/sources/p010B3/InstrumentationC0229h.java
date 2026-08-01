package p010B3;

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
import com.bumptech.glide.AbstractC1926h;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: B3.h */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentationC0229h extends Instrumentation {

    /* JADX INFO: renamed from: a */
    public final Instrumentation f780a;

    public InstrumentationC0229h(Instrumentation instrumentation) {
        this.f780a = instrumentation;
    }

    @Override // android.app.Instrumentation
    public final TestLooperManager acquireLooperManager(Looper looper) {
        return this.f780a.acquireLooperManager(looper);
    }

    @Override // android.app.Instrumentation
    public final void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f780a.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final void addResults(Bundle bundle) {
        this.f780a.addResults(bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        boolean zIsAssignableFrom;
        if (bundle != null) {
            try {
                zIsAssignableFrom = AbstractActivityC0224c.class.isAssignableFrom(AbstractC0222a.f773e.loadClass(activity.getClass().getName()));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                bundle.setClassLoader(AbstractC0222a.f773e);
            }
        }
        AbstractC1926h.m3560c(activity);
        this.f780a.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnDestroy(Activity activity) {
        this.f780a.callActivityOnDestroy(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.f780a.callActivityOnNewIntent(activity, intent);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPause(Activity activity) {
        this.f780a.callActivityOnPause(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPictureInPictureRequested(Activity activity) {
        this.f780a.callActivityOnPictureInPictureRequested(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.f780a.callActivityOnPostCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestart(Activity activity) {
        this.f780a.callActivityOnRestart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.f780a.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnResume(Activity activity) {
        this.f780a.callActivityOnResume(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.f780a.callActivityOnSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStart(Activity activity) {
        this.f780a.callActivityOnStart(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnStop(Activity activity) {
        this.f780a.callActivityOnStop(activity);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnUserLeaving(Activity activity) {
        this.f780a.callActivityOnUserLeaving(activity);
    }

    @Override // android.app.Instrumentation
    public final void callApplicationOnCreate(Application application) {
        this.f780a.callApplicationOnCreate(application);
    }

    @Override // android.app.Instrumentation
    public final boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i5) {
        return this.f780a.checkMonitorHit(activityMonitor, i5);
    }

    @Override // android.app.Instrumentation
    public final void endPerformanceSnapshot() {
        this.f780a.endPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void finish(int i5, Bundle bundle) {
        this.f780a.finish(i5, bundle);
    }

    @Override // android.app.Instrumentation
    public final Bundle getAllocCounts() {
        return this.f780a.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public final Bundle getBinderCounts() {
        return this.f780a.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public final ComponentName getComponentName() {
        return this.f780a.getComponentName();
    }

    @Override // android.app.Instrumentation
    public final Context getContext() {
        return this.f780a.getContext();
    }

    @Override // android.app.Instrumentation
    public final String getProcessName() {
        return this.f780a.getProcessName();
    }

    @Override // android.app.Instrumentation
    public final Context getTargetContext() {
        return this.f780a.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation() {
        return this.f780a.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public final boolean invokeContextMenuAction(Activity activity, int i5, int i6) {
        return this.f780a.invokeContextMenuAction(activity, i5, i6);
    }

    @Override // android.app.Instrumentation
    public final boolean invokeMenuActionSync(Activity activity, int i5, int i6) {
        return this.f780a.invokeMenuActionSync(activity, i5, i6);
    }

    @Override // android.app.Instrumentation
    public final boolean isProfiling() {
        return this.f780a.isProfiling();
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws Exception {
        boolean zIsAssignableFrom;
        try {
            return this.f780a.newActivity(classLoader, str, intent);
        } catch (Exception e5) {
            try {
                zIsAssignableFrom = AbstractActivityC0224c.class.isAssignableFrom(AbstractC0222a.f773e.loadClass(str));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                return (Activity) AbstractC0222a.f773e.loadClass(str).newInstance();
            }
            throw e5;
        }
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.f780a.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public final void onCreate(Bundle bundle) {
        this.f780a.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public final void onDestroy() {
        this.f780a.onDestroy();
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        return this.f780a.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public final void onStart() {
        this.f780a.onStart();
    }

    @Override // android.app.Instrumentation
    public final void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f780a.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final void runOnMainSync(Runnable runnable) {
        this.f780a.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public final void sendCharacterSync(int i5) {
        this.f780a.sendCharacterSync(i5);
    }

    @Override // android.app.Instrumentation
    public final void sendKeyDownUpSync(int i5) {
        this.f780a.sendKeyDownUpSync(i5);
    }

    @Override // android.app.Instrumentation
    public final void sendKeySync(KeyEvent keyEvent) {
        this.f780a.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendPointerSync(MotionEvent motionEvent) {
        this.f780a.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void sendStatus(int i5, Bundle bundle) {
        this.f780a.sendStatus(i5, bundle);
    }

    @Override // android.app.Instrumentation
    public final void sendStringSync(String str) {
        this.f780a.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public final void sendTrackballEventSync(MotionEvent motionEvent) {
        this.f780a.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public final void setAutomaticPerformanceSnapshots() {
        this.f780a.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public final void setInTouchMode(boolean z5) {
        this.f780a.setInTouchMode(z5);
    }

    @Override // android.app.Instrumentation
    public final void start() {
        this.f780a.start();
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent) {
        return this.f780a.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public final void startAllocCounting() {
        this.f780a.startAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void startPerformanceSnapshot() {
        this.f780a.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public final void startProfiling() {
        this.f780a.startProfiling();
    }

    @Override // android.app.Instrumentation
    public final void stopAllocCounting() {
        this.f780a.stopAllocCounting();
    }

    @Override // android.app.Instrumentation
    public final void stopProfiling() {
        this.f780a.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public final void waitForIdle(Runnable runnable) {
        this.f780a.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public final void waitForIdleSync() {
        this.f780a.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.f780a.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public final Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j5) {
        return this.f780a.waitForMonitorWithTimeout(activityMonitor, j5);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z5) {
        return this.f780a.addMonitor(str, activityResult, z5);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f780a.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f780a.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f780a.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final UiAutomation getUiAutomation(int i5) {
        return this.f780a.getUiAutomation(i5);
    }

    @Override // android.app.Instrumentation
    public final Activity startActivitySync(Intent intent, Bundle bundle) {
        return this.f780a.startActivitySync(intent, bundle);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z5) {
        return this.f780a.addMonitor(intentFilter, activityResult, z5);
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        boolean zIsAssignableFrom;
        if (bundle != null) {
            try {
                zIsAssignableFrom = AbstractActivityC0224c.class.isAssignableFrom(AbstractC0222a.f773e.loadClass(activity.getClass().getName()));
            } catch (Exception unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                bundle.setClassLoader(AbstractC0222a.f773e);
            }
        }
        AbstractC1926h.m3560c(activity);
        this.f780a.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.f780a.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
