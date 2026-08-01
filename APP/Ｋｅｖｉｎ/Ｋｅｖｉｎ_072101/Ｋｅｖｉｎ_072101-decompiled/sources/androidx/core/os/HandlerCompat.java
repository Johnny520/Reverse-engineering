package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r1)
                return r0
        }

        public static android.os.Handler createAsync(android.os.Looper r1, android.os.Handler.Callback r2) {
                android.os.Handler r0 = android.os.Handler.createAsync(r1, r2)
                return r0
        }

        public static boolean postDelayed(android.os.Handler r1, java.lang.Runnable r2, java.lang.Object r3, long r4) {
                boolean r0 = r1.postDelayed(r2, r3, r4)
                return r0
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean hasCallbacks(android.os.Handler r1, java.lang.Runnable r2) {
                boolean r0 = r1.hasCallbacks(r2)
                return r0
        }
    }

    private HandlerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Handler createAsync(android.os.Looper r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r0 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r4)
            return r0
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.NoSuchMethodException -> L48 java.lang.InstantiationException -> L4b java.lang.IllegalAccessException -> L4e
            return r0
        L2d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L44
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 == 0) goto L3e
            r2 = r1
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L3e:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L44:
            r2 = r1
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L48:
            r0 = move-exception
            goto L50
        L4b:
            r0 = move-exception
            goto L50
        L4e:
            r0 = move-exception
        L50:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4)
            return r0
    }

    public static android.os.Handler createAsync(android.os.Looper r4, android.os.Handler.Callback r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r0 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r4, r5)
            return r0
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L47 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4d
            return r0
        L2c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L43
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 == 0) goto L3d
            r2 = r1
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L3d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L43:
            r2 = r1
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L47:
            r0 = move-exception
            goto L4f
        L4a:
            r0 = move-exception
            goto L4f
        L4d:
            r0 = move-exception
        L4f:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4, r5)
            return r0
    }

    public static boolean hasCallbacks(android.os.Handler r4, java.lang.Runnable r5) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lc
            boolean r1 = androidx.core.os.HandlerCompat.Api29Impl.hasCallbacks(r4, r5)
            return r1
        Lc:
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            java.lang.String r2 = "hasCallbacks"
            java.lang.Class<java.lang.Runnable> r3 = java.lang.Runnable.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2d java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L3b
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2d java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L3b
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2d java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L3b
            java.lang.Object r2 = r1.invoke(r4, r2)     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2d java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L3b
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2d java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L3b
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2d java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L3b
            return r2
        L2a:
            r1 = move-exception
            r0 = r1
            goto L33
        L2d:
            r1 = move-exception
            r0 = r1
            goto L32
        L30:
            r1 = move-exception
            r0 = r1
        L32:
        L33:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception."
            r1.<init>(r2, r0)
            throw r1
        L3b:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 != 0) goto L52
            boolean r3 = r2 instanceof java.lang.Error
            if (r3 == 0) goto L4c
            r3 = r2
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L4c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L52:
            r3 = r2
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
    }

    public static boolean postDelayed(android.os.Handler r2, java.lang.Runnable r3, java.lang.Object r4, long r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.os.HandlerCompat.Api28Impl.postDelayed(r2, r3, r4, r5)
            return r0
        Lb:
            android.os.Message r0 = android.os.Message.obtain(r2, r3)
            r0.obj = r4
            boolean r1 = r2.sendMessageDelayed(r0, r5)
            return r1
    }
}
