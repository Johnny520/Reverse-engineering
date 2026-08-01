package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670l {

    /* JADX INFO: renamed from: a */
    public static final C0670l f1975a = new C0670l();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1976b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC0660g {
        @Override // androidx.lifecycle.AbstractC0660g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            FragmentC0690z.INSTANCE.m2713c(activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2637a(Context context) {
        context.getClass();
        if (f1976b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
