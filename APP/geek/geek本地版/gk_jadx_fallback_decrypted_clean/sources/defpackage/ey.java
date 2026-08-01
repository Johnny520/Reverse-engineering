package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ey {
    public static final void a(android.app.Activity r1, android.app.Application.ActivityLifecycleCallbacks r2) {
            java.lang.String r0 = "activity"
            defpackage.ip.o(r0, r1)
            java.lang.String r0 = "callback"
            defpackage.ip.o(r0, r2)
            r1.registerActivityLifecycleCallbacks(r2)
            return
    }
}
