package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements defpackage.mq {
    public static int a;

    @Override // defpackage.mq
    public final void b(defpackage.oq r2, defpackage.iq r3) {
            r1 = this;
            iq r2 = defpackage.iq.ON_DESTROY
            if (r3 == r2) goto L5
            goto L30
        L5:
            int r2 = androidx.activity.ImmLeaksCleaner.a
            r3 = 1
            if (r2 != 0) goto L2c
            java.lang.Class<android.view.inputmethod.InputMethodManager> r2 = android.view.inputmethod.InputMethodManager.class
            r0 = 2
            androidx.activity.ImmLeaksCleaner.a = r0     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2c
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2c
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2c
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2c
            androidx.activity.ImmLeaksCleaner.a = r3     // Catch: java.lang.NoSuchFieldException -> L2c
        L2c:
            int r2 = androidx.activity.ImmLeaksCleaner.a
            if (r2 == r3) goto L31
        L30:
            return
        L31:
            r2 = 0
            throw r2
    }
}
