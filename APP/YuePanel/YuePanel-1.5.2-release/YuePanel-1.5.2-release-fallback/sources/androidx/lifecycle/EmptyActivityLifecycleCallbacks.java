package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "LYue/ۥۣۢ۠ۤ;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public class EmptyActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
    public EmptyActivityLifecycleCallbacks() {
            r0 = this;
            r0.<init>()
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
            java.lang.String r2 = "outState"
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
