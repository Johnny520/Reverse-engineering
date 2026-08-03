package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public class C0533 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f1341 = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f1342 = "startedFromLauncher";

    @java.lang.Deprecated
    public C0533() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m1889(@Yue.InterfaceC4410 android.content.Context r2) {
            java.lang.String r0 = "android.support.AppLaunchChecker"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r0 = "startedFromLauncher"
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m1890(@Yue.InterfaceC4410 android.app.Activity r4) {
            java.lang.String r0 = "android.support.AppLaunchChecker"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            java.lang.String r2 = "startedFromLauncher"
            boolean r1 = r0.getBoolean(r2, r1)
            if (r1 == 0) goto L10
            return
        L10:
            android.content.Intent r4 = r4.getIntent()
            if (r4 != 0) goto L17
            return
        L17:
            java.lang.String r1 = "android.intent.action.MAIN"
            java.lang.String r3 = r4.getAction()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = "android.intent.category.LAUNCHER"
            boolean r1 = r4.hasCategory(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = "android.intent.category.LEANBACK_LAUNCHER"
            boolean r4 = r4.hasCategory(r1)
            if (r4 == 0) goto L3f
        L33:
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r0 = 1
            android.content.SharedPreferences$Editor r4 = r4.putBoolean(r2, r0)
            r4.apply()
        L3f:
            return
    }
}
