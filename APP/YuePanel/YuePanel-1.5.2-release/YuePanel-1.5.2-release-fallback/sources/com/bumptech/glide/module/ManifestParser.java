package com.bumptech.glide.module;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class ManifestParser {
    private static final java.lang.String GLIDE_MODULE_VALUE = "GlideModule";
    private static final java.lang.String TAG = "ManifestParser";
    private final android.content.Context context;

    public ManifestParser(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    @Yue.InterfaceC4544
    private android.content.pm.ApplicationInfo getOurApplicationInfo() throws android.content.pm.PackageManager.NameNotFoundException {
            r3 = this;
            android.content.Context r0 = r3.context
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r1 = r3.context
            java.lang.String r1 = r1.getPackageName()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)
            return r0
    }

    private static com.bumptech.glide.module.GlideModule parseModule(java.lang.String r3) {
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L43
            r0 = 0
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.NoSuchMethodException -> L10 java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L14
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.NoSuchMethodException -> L10 java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L14
            goto L25
        Le:
            r1 = move-exception
            goto L16
        L10:
            r1 = move-exception
            goto L1a
        L12:
            r1 = move-exception
            goto L1e
        L14:
            r1 = move-exception
            goto L22
        L16:
            throwInstantiateGlideModuleException(r3, r1)
            goto L25
        L1a:
            throwInstantiateGlideModuleException(r3, r1)
            goto L25
        L1e:
            throwInstantiateGlideModuleException(r3, r1)
            goto L25
        L22:
            throwInstantiateGlideModuleException(r3, r1)
        L25:
            boolean r3 = r0 instanceof com.bumptech.glide.module.GlideModule
            if (r3 == 0) goto L2c
            com.bumptech.glide.module.GlideModule r0 = (com.bumptech.glide.module.GlideModule) r0
            return r0
        L2c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
        L43:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
    }

    private static void throwInstantiateGlideModuleException(java.lang.Class<?> r3, java.lang.Exception r4) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to instantiate GlideModule implementation for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    public java.util.List<com.bumptech.glide.module.GlideModule> parse() {
            r8 = this;
            java.lang.String r0 = "ManifestParser"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto Le
            java.lang.String r2 = "Loading Glide modules"
            android.util.Log.d(r0, r2)
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.pm.ApplicationInfo r3 = r8.getOurApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r3 == 0) goto L91
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r4 != 0) goto L1f
            goto L91
        L1f:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r4 == 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r5 = "Got app info metadata: "
            r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.os.Bundle r5 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r4 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.util.Log.v(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            goto L3f
        L3d:
            r1 = move-exception
            goto L9d
        L3f:
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.util.Set r4 = r4.keySet()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.util.Iterator r4 = r4.iterator()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
        L49:
            boolean r5 = r4.hasNext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r5 == 0) goto L85
            java.lang.Object r5 = r4.next()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r5 = (java.lang.String) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r6 = "GlideModule"
            android.os.Bundle r7 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.Object r7 = r7.get(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            boolean r6 = r6.equals(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r6 == 0) goto L49
            com.bumptech.glide.module.GlideModule r6 = parseModule(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r2.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            boolean r6 = android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r6 == 0) goto L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r7 = "Loaded Glide module: "
            r6.append(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r6.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r5 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.util.Log.d(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            goto L49
        L85:
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r1 == 0) goto La9
            java.lang.String r1 = "Finished loading Glide modules"
            android.util.Log.d(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            goto La9
        L91:
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r1 == 0) goto L9c
            java.lang.String r1 = "Got null app info metadata"
            android.util.Log.d(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
        L9c:
            return r2
        L9d:
            r3 = 6
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto La9
            java.lang.String r3 = "Failed to parse glide modules"
            android.util.Log.e(r0, r3, r1)
        La9:
            return r2
    }
}
