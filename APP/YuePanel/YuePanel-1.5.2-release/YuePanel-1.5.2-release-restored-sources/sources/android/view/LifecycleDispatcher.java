package android.view;

import Yue.C5499;
import Yue.InterfaceC5578;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC8392;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.C1629;
import androidx.fragment.app.C8882;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/content/Context;", "context", "LYue/ۥۣۢ۠ۤ;", "init", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class LifecycleDispatcher {

    @InterfaceC6399
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();

    @InterfaceC6399
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    @InterfaceC8392
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Landroid/app/Activity;", C1629.f26361, "Landroid/os/Bundle;", C8882.f29747, "LYue/ۥۣۢ۠ۤ;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // android.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@InterfaceC6399 Activity activity, @InterfaceC6489 Bundle savedInstanceState) {
            C5499.m17103(activity, C1629.f26361);
            ReportFragment.INSTANCE.injectIfNeededIn(activity);
        }
    }

    private LifecycleDispatcher() {
    }

    @InterfaceC5578
    public static final void init(@InterfaceC6399 Context context) {
        C5499.m17103(context, "context");
        if (initialized.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C5499.m17101(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}
