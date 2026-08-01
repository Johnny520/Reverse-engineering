package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleCompat {

    static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.IBinder getBinder(android.os.Bundle r1, java.lang.String r2) {
                android.os.IBinder r0 = r1.getBinder(r2)
                return r0
        }

        static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
                r0.putBinder(r1, r2)
                return
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T getParcelable(android.os.Bundle r1, java.lang.String r2, java.lang.Class<T> r3) {
                java.lang.Object r0 = r1.getParcelable(r2, r3)
                return r0
        }

        static <T> T[] getParcelableArray(android.os.Bundle r1, java.lang.String r2, java.lang.Class<T> r3) {
                java.lang.Object[] r0 = r1.getParcelableArray(r2, r3)
                return r0
        }

        static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle r1, java.lang.String r2, java.lang.Class<? extends T> r3) {
                java.util.ArrayList r0 = r1.getParcelableArrayList(r2, r3)
                return r0
        }

        static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle r1, java.lang.String r2, java.lang.Class<? extends T> r3) {
                android.util.SparseArray r0 = r1.getSparseParcelableArray(r2, r3)
                return r0
        }
    }

    static class BeforeApi18Impl {
        private static final java.lang.String TAG = "BundleCompat";
        private static java.lang.reflect.Method sGetIBinderMethod;
        private static boolean sGetIBinderMethodFetched;
        private static java.lang.reflect.Method sPutIBinderMethod;
        private static boolean sPutIBinderMethodFetched;

        private BeforeApi18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.IBinder getBinder(android.os.Bundle r5, java.lang.String r6) {
                boolean r0 = androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethodFetched
                java.lang.String r1 = "BundleCompat"
                if (r0 != 0) goto L25
                r0 = 1
                java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
                java.lang.String r3 = "getIBinder"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L1d
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1d
                androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethod = r2     // Catch: java.lang.NoSuchMethodException -> L1d
                java.lang.reflect.Method r2 = androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethod     // Catch: java.lang.NoSuchMethodException -> L1d
                r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1d
                goto L23
            L1d:
                r2 = move-exception
                java.lang.String r3 = "Failed to retrieve getIBinder method"
                android.util.Log.i(r1, r3, r2)
            L23:
                androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethodFetched = r0
            L25:
                java.lang.reflect.Method r0 = androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethod
                r2 = 0
                if (r0 == 0) goto L43
                java.lang.reflect.Method r0 = androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethod     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                java.lang.Object[] r3 = new java.lang.Object[]{r6}     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                java.lang.Object r0 = r0.invoke(r5, r3)     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.IllegalAccessException -> L39 java.lang.reflect.InvocationTargetException -> L3b
                return r0
            L37:
                r0 = move-exception
                goto L3c
            L39:
                r0 = move-exception
                goto L3c
            L3b:
                r0 = move-exception
            L3c:
                java.lang.String r3 = "Failed to invoke getIBinder via reflection"
                android.util.Log.i(r1, r3, r0)
                androidx.core.os.BundleCompat.BeforeApi18Impl.sGetIBinderMethod = r2
            L43:
                return r2
        }

        public static void putBinder(android.os.Bundle r6, java.lang.String r7, android.os.IBinder r8) {
                boolean r0 = androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethodFetched
                java.lang.String r1 = "BundleCompat"
                if (r0 != 0) goto L27
                r0 = 1
                java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
                java.lang.String r3 = "putIBinder"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Class<android.os.IBinder> r5 = android.os.IBinder.class
                java.lang.Class[] r4 = new java.lang.Class[]{r4, r5}     // Catch: java.lang.NoSuchMethodException -> L1f
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1f
                androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethod = r2     // Catch: java.lang.NoSuchMethodException -> L1f
                java.lang.reflect.Method r2 = androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethod     // Catch: java.lang.NoSuchMethodException -> L1f
                r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1f
                goto L25
            L1f:
                r2 = move-exception
                java.lang.String r3 = "Failed to retrieve putIBinder method"
                android.util.Log.i(r1, r3, r2)
            L25:
                androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethodFetched = r0
            L27:
                java.lang.reflect.Method r0 = androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethod
                if (r0 == 0) goto L42
                java.lang.reflect.Method r0 = androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethod     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
                java.lang.Object[] r2 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
                r0.invoke(r6, r2)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.IllegalAccessException -> L37 java.lang.reflect.InvocationTargetException -> L39
                goto L42
            L35:
                r0 = move-exception
                goto L3a
            L37:
                r0 = move-exception
                goto L3a
            L39:
                r0 = move-exception
            L3a:
                java.lang.String r2 = "Failed to invoke putIBinder via reflection"
                android.util.Log.i(r1, r2, r0)
                r1 = 0
                androidx.core.os.BundleCompat.BeforeApi18Impl.sPutIBinderMethod = r1
            L42:
                return
        }
    }

    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.IBinder getBinder(android.os.Bundle r1, java.lang.String r2) {
            android.os.IBinder r0 = androidx.core.os.BundleCompat.Api18Impl.getBinder(r1, r2)
            return r0
    }

    public static <T> T getParcelable(android.os.Bundle r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r0 = androidx.core.os.BundleCompat.Api33Impl.getParcelable(r2, r3, r4)
            return r0
        Lb:
            android.os.Parcelable r0 = r2.getParcelable(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L17
            r1 = r0
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    public static android.os.Parcelable[] getParcelableArray(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r0 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            return r0
        Ld:
            android.os.Parcelable[] r0 = r2.getParcelableArray(r3)
            return r0
    }

    public static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r0 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArrayList(r2, r3, r4)
            return r0
        Lb:
            java.util.ArrayList r0 = r2.getParcelableArrayList(r3)
            return r0
    }

    public static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r0 = androidx.core.os.BundleCompat.Api33Impl.getSparseParcelableArray(r2, r3, r4)
            return r0
        Lb:
            android.util.SparseArray r0 = r2.getSparseParcelableArray(r3)
            return r0
    }

    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            androidx.core.os.BundleCompat.Api18Impl.putBinder(r0, r1, r2)
            return
    }
}
