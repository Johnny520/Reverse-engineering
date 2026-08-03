package Yue;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C3363 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f248 = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f249 = "startedFromLauncher";

    @Deprecated
    public C3363() {
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m441(@InterfaceC6391 Context context) {
        return context.getSharedPreferences(f248, 0).getBoolean(f249, false);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m442(@InterfaceC6391 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f248, 0);
        if (sharedPreferences.getBoolean(f249, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C5463.f13425)) {
            sharedPreferences.edit().putBoolean(f249, true).apply();
        }
    }
}
