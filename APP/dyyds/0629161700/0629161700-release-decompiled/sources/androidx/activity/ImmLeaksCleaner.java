package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements defpackage.InterfaceC0708 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int f3;

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r1, defpackage.EnumC2255 r2) {
            r0 = this;
            ᲈᛶᛱᛲ r0 = defpackage.EnumC2255.ON_DESTROY
            if (r2 == r0) goto L5
            goto L30
        L5:
            int r0 = androidx.activity.ImmLeaksCleaner.f3
            r1 = 1
            if (r0 != 0) goto L2c
            r0 = 2
            androidx.activity.ImmLeaksCleaner.f3 = r0     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r2 = "mServedView"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L2c
            r2.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r2 = "mNextServedView"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L2c
            r2.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2c
            java.lang.String r2 = "mH"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L2c
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2c
            androidx.activity.ImmLeaksCleaner.f3 = r1     // Catch: java.lang.NoSuchFieldException -> L2c
        L2c:
            int r0 = androidx.activity.ImmLeaksCleaner.f3
            if (r0 == r1) goto L31
        L30:
            return
        L31:
            r0 = 0
            throw r0
    }
}
