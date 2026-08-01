package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static int f0;

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r1, xhss.EnumC1174 r2) {
            r0 = this;
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_DESTROY
            if (r2 == r0) goto L5
            goto L30
        L5:
            int r0 = androidx.activity.ImmLeaksCleaner.f0
            r1 = 1
            if (r0 != 0) goto L2c
            r0 = 2
            androidx.activity.ImmLeaksCleaner.f0 = r0     // Catch: java.lang.NoSuchFieldException -> L2c
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
            androidx.activity.ImmLeaksCleaner.f0 = r1     // Catch: java.lang.NoSuchFieldException -> L2c
        L2c:
            int r0 = androidx.activity.ImmLeaksCleaner.f0
            if (r0 == r1) goto L31
        L30:
            return
        L31:
            r0 = 0
            throw r0
    }
}
