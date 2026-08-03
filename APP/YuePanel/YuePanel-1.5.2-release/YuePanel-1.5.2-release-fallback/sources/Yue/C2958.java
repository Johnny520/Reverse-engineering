package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2958 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f9588 = "HandlerCompat";

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C2959 {
        public C2959() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.Handler m12581(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.os.Handler m12582(android.os.Looper r0, android.os.Handler.Callback r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m12583(android.os.Handler r0, java.lang.Runnable r1, java.lang.Object r2, long r3) {
                boolean r0 = r0.postDelayed(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C2960 {
        public C2960() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m12584(android.os.Handler r0, java.lang.Runnable r1) {
                boolean r0 = r0.hasCallbacks(r1)
                return r0
        }
    }

    public C2958() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.os.Handler m12577(@Yue.InterfaceC4410 android.os.Looper r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r4 = Yue.C2958.C2959.m12581(r4)
            return r4
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.InstantiationException -> L2d java.lang.IllegalAccessException -> L2f
            return r0
        L29:
            r4 = move-exception
            goto L31
        L2b:
            r0 = move-exception
            goto L49
        L2d:
            r0 = move-exception
            goto L49
        L2f:
            r0 = move-exception
            goto L49
        L31:
            java.lang.Throwable r4 = r4.getCause()
            boolean r0 = r4 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 == 0) goto L40
            java.lang.Error r4 = (java.lang.Error) r4
            throw r4
        L40:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L46:
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L49:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.os.Handler m12578(@Yue.InterfaceC4410 android.os.Looper r4, @Yue.InterfaceC4410 android.os.Handler.Callback r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r4 = Yue.C2958.C2959.m12582(r4, r5)
            return r4
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.InstantiationException -> L2c java.lang.IllegalAccessException -> L2e
            return r0
        L28:
            r4 = move-exception
            goto L30
        L2a:
            r0 = move-exception
            goto L48
        L2c:
            r0 = move-exception
            goto L48
        L2e:
            r0 = move-exception
            goto L48
        L30:
            java.lang.Throwable r4 = r4.getCause()
            boolean r5 = r4 instanceof java.lang.RuntimeException
            if (r5 != 0) goto L45
            boolean r5 = r4 instanceof java.lang.Error
            if (r5 == 0) goto L3f
            java.lang.Error r4 = (java.lang.Error) r4
            throw r4
        L3f:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L45:
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L48:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m12579(@Yue.InterfaceC4410 android.os.Handler r3, @Yue.InterfaceC4410 java.lang.Runnable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r3 = Yue.C2958.C2960.m12584(r3, r4)
            return r3
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.String r1 = "hasCallbacks"
            java.lang.Class<java.lang.Runnable> r2 = java.lang.Runnable.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NullPointerException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L2e
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NullPointerException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L2e
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.NullPointerException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L2e
            java.lang.Object r3 = r0.invoke(r3, r4)     // Catch: java.lang.NullPointerException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L2e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.NullPointerException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L2e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.NullPointerException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.reflect.InvocationTargetException -> L2e
            return r3
        L28:
            r3 = move-exception
            goto L30
        L2a:
            r3 = move-exception
            goto L30
        L2c:
            r3 = move-exception
            goto L30
        L2e:
            r3 = move-exception
            goto L38
        L30:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception."
            r4.<init>(r0, r3)
            throw r4
        L38:
            java.lang.Throwable r3 = r3.getCause()
            boolean r4 = r3 instanceof java.lang.RuntimeException
            if (r4 != 0) goto L4d
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L47
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L47:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L4d:
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m12580(@Yue.InterfaceC4410 android.os.Handler r2, @Yue.InterfaceC4410 java.lang.Runnable r3, @Yue.InterfaceC4544 java.lang.Object r4, long r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C2958.C2959.m12583(r2, r3, r4, r5)
            return r2
        Lb:
            android.os.Message r3 = android.os.Message.obtain(r2, r3)
            r3.obj = r4
            boolean r2 = r2.sendMessageDelayed(r3, r5)
            return r2
    }
}
