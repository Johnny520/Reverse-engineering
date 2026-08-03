package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(19)
final class ImmLeaksCleaner implements androidx.lifecycle.LifecycleEventObserver {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f24922 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f24923 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f24924 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static int f24925;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static java.lang.reflect.Field f24926;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static java.lang.reflect.Field f24927;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f24928;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public android.app.Activity f24929;

    static {
            return
    }

    public ImmLeaksCleaner(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.f24929 = r1
            return
    }

    @Yue.InterfaceC3875
    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m27744() {
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            r1 = 2
            androidx.activity.ImmLeaksCleaner.f24925 = r1     // Catch: java.lang.NoSuchFieldException -> L29
            java.lang.String r1 = "mServedView"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.f24927 = r1     // Catch: java.lang.NoSuchFieldException -> L29
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L29
            java.lang.String r1 = "mNextServedView"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.f24928 = r1     // Catch: java.lang.NoSuchFieldException -> L29
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L29
            java.lang.String r1 = "mH"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.f24926 = r0     // Catch: java.lang.NoSuchFieldException -> L29
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.f24925 = r2     // Catch: java.lang.NoSuchFieldException -> L29
        L29:
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L5
            return
        L5:
            int r3 = androidx.activity.ImmLeaksCleaner.f24925
            if (r3 != 0) goto Lc
            m27744()
        Lc:
            int r3 = androidx.activity.ImmLeaksCleaner.f24925
            r4 = 1
            if (r3 != r4) goto L4e
            android.app.Activity r3 = r2.f24929
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = androidx.activity.ImmLeaksCleaner.f24926     // Catch: java.lang.IllegalAccessException -> L4e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.IllegalAccessException -> L4e
            if (r4 != 0) goto L24
            return
        L24:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.f24927     // Catch: java.lang.Throwable -> L31 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L31 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L31 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            if (r0 != 0) goto L33
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r3 = move-exception
            goto L4c
        L33:
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L3b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L3b:
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.f24928     // Catch: java.lang.Throwable -> L31 java.lang.IllegalAccessException -> L46
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L31 java.lang.IllegalAccessException -> L46
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            r3.isActive()
            goto L4e
        L46:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            throw r3
        L4e:
            return
    }
}
