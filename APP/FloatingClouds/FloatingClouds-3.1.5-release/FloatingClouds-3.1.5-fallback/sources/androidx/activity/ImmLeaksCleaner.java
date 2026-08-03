package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f791a;

    @Override // androidx.lifecycle.g
    public final void a(a.InterfaceC0479y9 r2, androidx.lifecycle.e.a r3) {
            r1 = this;
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_DESTROY
            if (r3 == r2) goto L5
            goto L30
        L5:
            int r2 = androidx.activity.ImmLeaksCleaner.f791a
            r3 = 1
            if (r2 != 0) goto L2c
            java.lang.Class<android.view.inputmethod.InputMethodManager> r2 = android.view.inputmethod.InputMethodManager.class
            r0 = 2
            androidx.activity.ImmLeaksCleaner.f791a = r0     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2c
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2c
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2c
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2c
            androidx.activity.ImmLeaksCleaner.f791a = r3     // Catch: java.lang.NoSuchFieldException -> L2c
        L2c:
            int r2 = androidx.activity.ImmLeaksCleaner.f791a
            if (r2 == r3) goto L31
        L30:
            return
        L31:
            r2 = 0
            throw r2
    }
}
