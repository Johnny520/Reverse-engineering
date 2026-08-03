package com.bumptech.glide.signature;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationVersionSignature {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.Key> PACKAGE_NAME_TO_KEY = null;
    private static final java.lang.String TAG = "AppVersionSignature";

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bumptech.glide.signature.ApplicationVersionSignature.PACKAGE_NAME_TO_KEY = r0
            return
    }

    private ApplicationVersionSignature() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    private static android.content.pm.PackageInfo getPackageInfo(@Yue.InterfaceC4410 android.content.Context r3) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            r2 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            return r3
        Le:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot resolve info for"
            r1.append(r2)
            java.lang.String r3 = r3.getPackageName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "AppVersionSignature"
            android.util.Log.e(r1, r3, r0)
            r3 = 0
            return r3
    }

    @Yue.InterfaceC4410
    private static java.lang.String getVersionCode(@Yue.InterfaceC4544 android.content.pm.PackageInfo r0) {
            if (r0 == 0) goto L9
            int r0 = r0.versionCode
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L11
        L9:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
        L11:
            return r0
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.Key obtain(@Yue.InterfaceC4410 android.content.Context r3) {
            java.lang.String r0 = r3.getPackageName()
            java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.Key> r1 = com.bumptech.glide.signature.ApplicationVersionSignature.PACKAGE_NAME_TO_KEY
            java.lang.Object r2 = r1.get(r0)
            com.bumptech.glide.load.Key r2 = (com.bumptech.glide.load.Key) r2
            if (r2 != 0) goto L1c
            com.bumptech.glide.load.Key r2 = obtainVersionSignature(r3)
            java.lang.Object r3 = r1.putIfAbsent(r0, r2)
            com.bumptech.glide.load.Key r3 = (com.bumptech.glide.load.Key) r3
            if (r3 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            return r2
    }

    @Yue.InterfaceC4410
    private static com.bumptech.glide.load.Key obtainVersionSignature(@Yue.InterfaceC4410 android.content.Context r1) {
            android.content.pm.PackageInfo r1 = getPackageInfo(r1)
            java.lang.String r1 = getVersionCode(r1)
            com.bumptech.glide.signature.ObjectKey r0 = new com.bumptech.glide.signature.ObjectKey
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC6959
    public static void reset() {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.Key> r0 = com.bumptech.glide.signature.ApplicationVersionSignature.PACKAGE_NAME_TO_KEY
            r0.clear()
            return
    }
}
