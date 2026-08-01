package defpackage;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class ey {
    public static final void a(Activity r1, Application.ActivityLifecycleCallbacks r2) {
        ip.o("activity", r1);
        ip.o("callback", r2);
        r1.registerActivityLifecycleCallbacks(r2);
    }
}
