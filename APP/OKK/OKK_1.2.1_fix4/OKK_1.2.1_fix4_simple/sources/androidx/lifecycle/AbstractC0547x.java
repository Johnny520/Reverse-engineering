package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0547x {
    /* JADX INFO: renamed from: a */
    public static final void m1262a(Activity r1, Application.ActivityLifecycleCallbacks r2) {
        AbstractC0307g.m703e(r1, "activity");
        AbstractC0307g.m703e(r2, "callback");
        r1.registerActivityLifecycleCallbacks(r2);
    }
}
