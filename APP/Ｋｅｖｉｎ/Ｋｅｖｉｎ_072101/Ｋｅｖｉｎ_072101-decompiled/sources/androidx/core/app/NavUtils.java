package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class NavUtils {
    public static final java.lang.String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final java.lang.String TAG = "NavUtils";

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Intent getParentActivityIntent(android.app.Activity r1) {
                android.content.Intent r0 = r1.getParentActivityIntent()
                return r0
        }

        static boolean navigateUpTo(android.app.Activity r1, android.content.Intent r2) {
                boolean r0 = r1.navigateUpTo(r2)
                return r0
        }

        static boolean shouldUpRecreateTask(android.app.Activity r1, android.content.Intent r2) {
                boolean r0 = r1.shouldUpRecreateTask(r2)
                return r0
        }
    }

    private NavUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Intent getParentActivityIntent(android.app.Activity r6) {
            android.content.Intent r0 = androidx.core.app.NavUtils.Api16Impl.getParentActivityIntent(r6)
            if (r0 == 0) goto L8
            return r0
        L8:
            java.lang.String r0 = getParentActivityName(r6)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r0)
            java.lang.String r3 = getParentActivityName(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r3 != 0) goto L20
            android.content.Intent r1 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            goto L29
        L20:
            android.content.Intent r4 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            android.content.Intent r1 = r4.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
        L29:
            return r1
        L2a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getParentActivityIntent: bad parentActivityName '"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = "' in manifest"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "NavUtils"
            android.util.Log.e(r5, r4)
            return r1
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context r4, android.content.ComponentName r5) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = getParentActivityName(r4, r5)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = r5.getPackageName()
            r1.<init>(r2, r0)
            java.lang.String r2 = getParentActivityName(r4, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r1)
            goto L25
        L1c:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r3 = r3.setComponent(r1)
        L25:
            return r3
    }

    public static android.content.Intent getParentActivityIntent(android.content.Context r4, java.lang.Class<?> r5) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r4, r5)
            java.lang.String r0 = getParentActivityName(r4, r0)
            if (r0 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r4, r0)
            java.lang.String r2 = getParentActivityName(r4, r1)
            if (r2 != 0) goto L1d
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r1)
            goto L26
        L1d:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r3 = r3.setComponent(r1)
        L26:
            return r3
    }

    public static java.lang.String getParentActivityName(android.app.Activity r2) {
            android.content.ComponentName r0 = r2.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            java.lang.String r0 = getParentActivityName(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String getParentActivityName(android.content.Context r6, android.content.ComponentName r7) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            r1 = 128(0x80, float:1.8E-43)
            r1 = r1 | 512(0x200, float:7.17E-43)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L13
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            r1 = r1 | r2
            goto L17
        L13:
            r2 = 786432(0xc0000, float:1.102026E-39)
            r1 = r1 | r2
        L17:
            android.content.pm.ActivityInfo r2 = r0.getActivityInfo(r7, r1)
            java.lang.String r3 = r2.parentActivityName
            if (r3 == 0) goto L21
            return r3
        L21:
            android.os.Bundle r3 = r2.metaData
            r4 = 0
            if (r3 != 0) goto L27
            return r4
        L27:
            android.os.Bundle r3 = r2.metaData
            java.lang.String r5 = "android.support.PARENT_ACTIVITY"
            java.lang.String r3 = r3.getString(r5)
            if (r3 != 0) goto L32
            return r4
        L32:
            r4 = 0
            char r4 = r3.charAt(r4)
            r5 = 46
            if (r4 != r5) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.getPackageName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r3 = r4.toString()
        L50:
            return r3
    }

    public static void navigateUpFromSameTask(android.app.Activity r4) {
            android.content.Intent r0 = getParentActivityIntent(r4)
            if (r0 == 0) goto La
            navigateUpTo(r4, r0)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Activity "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static void navigateUpTo(android.app.Activity r0, android.content.Intent r1) {
            androidx.core.app.NavUtils.Api16Impl.navigateUpTo(r0, r1)
            return
    }

    public static boolean shouldUpRecreateTask(android.app.Activity r1, android.content.Intent r2) {
            boolean r0 = androidx.core.app.NavUtils.Api16Impl.shouldUpRecreateTask(r1, r2)
            return r0
    }
}
