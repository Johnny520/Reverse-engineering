package android.view;

import Yue.C5499;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.widget.C1629;
import androidx.fragment.app.C8882;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Activity;", C1629.f26361, "Landroid/os/Bundle;", C8882.f29747, "LYue/ۥۣۢ۠ۤ;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public class EmptyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@InterfaceC6399 Activity activity, @InterfaceC6489 Bundle savedInstanceState) {
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
    public void onActivityResumed(@InterfaceC6399 Activity activity) {
        C5499.m17103(activity, C1629.f26361);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@InterfaceC6399 Activity activity, @InterfaceC6399 Bundle outState) {
        C5499.m17103(activity, C1629.f26361);
        C5499.m17103(outState, "outState");
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
