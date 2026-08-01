package androidx.activity;

/* JADX INFO: loaded from: classes2.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.LifecycleEventObserver {
    private static final int INIT_FAILED = 2;
    private static final int INIT_SUCCESS = 1;
    private static final int NOT_INITIALIAZED = 0;
    private static java.lang.reflect.Field sHField;
    private static java.lang.reflect.Field sNextServedViewField;
    private static int sReflectedFieldsInitialized;
    private static java.lang.reflect.Field sServedViewField;
    private android.app.Activity mActivity;

    static {
            r0 = 0
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r0
            return
    }

    ImmLeaksCleaner(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.mActivity = r1
            return
    }

    private static void initializeReflectiveFields() {
            r0 = 2
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r0     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r1 = "mServedView"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L34
            androidx.activity.ImmLeaksCleaner.sServedViewField = r0     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sServedViewField     // Catch: java.lang.NoSuchFieldException -> L34
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r2 = "mNextServedView"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L34
            androidx.activity.ImmLeaksCleaner.sNextServedViewField = r0     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sNextServedViewField     // Catch: java.lang.NoSuchFieldException -> L34
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r2 = "mH"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L34
            androidx.activity.ImmLeaksCleaner.sHField = r0     // Catch: java.lang.NoSuchFieldException -> L34
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sHField     // Catch: java.lang.NoSuchFieldException -> L34
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L34
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r1     // Catch: java.lang.NoSuchFieldException -> L34
            goto L35
        L34:
            r0 = move-exception
        L35:
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r6, androidx.lifecycle.Lifecycle.Event r7) {
            r5 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r7 == r0) goto L5
            return
        L5:
            int r0 = androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized
            if (r0 != 0) goto Lc
            initializeReflectiveFields()
        Lc:
            int r0 = androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized
            r1 = 1
            if (r0 != r1) goto L56
            android.app.Activity r0 = r5.mActivity
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.reflect.Field r1 = androidx.activity.ImmLeaksCleaner.sHField     // Catch: java.lang.IllegalAccessException -> L54
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.IllegalAccessException -> L54
            if (r1 != 0) goto L25
            return
        L25:
            monitor-enter(r1)
            java.lang.reflect.Field r2 = androidx.activity.ImmLeaksCleaner.sServedViewField     // Catch: java.lang.Throwable -> L4a java.lang.ClassCastException -> L4c java.lang.IllegalAccessException -> L4f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L4a java.lang.ClassCastException -> L4c java.lang.IllegalAccessException -> L4f
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L4a java.lang.ClassCastException -> L4c java.lang.IllegalAccessException -> L4f
            if (r2 != 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return
        L33:
            boolean r3 = r2.isAttachedToWindow()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L3b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return
        L3b:
            java.lang.reflect.Field r3 = androidx.activity.ImmLeaksCleaner.sNextServedViewField     // Catch: java.lang.IllegalAccessException -> L47 java.lang.Throwable -> L4a
            r4 = 0
            r3.set(r0, r4)     // Catch: java.lang.IllegalAccessException -> L47 java.lang.Throwable -> L4a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            r0.isActive()
            goto L56
        L47:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r2 = move-exception
            goto L52
        L4c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return
        L4f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            throw r2
        L54:
            r1 = move-exception
            return
        L56:
            return
    }
}
