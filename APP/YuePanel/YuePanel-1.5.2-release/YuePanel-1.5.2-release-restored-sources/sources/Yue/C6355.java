package Yue;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: Yue.ۥۡۢۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6355 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2034 = "NavUtils";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f2035 = "android.support.PARENT_ACTIVITY";

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Intent m2817(@InterfaceC6391 Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM19858 = m19858(activity);
        if (strM19858 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM19858);
        try {
            return m19859(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f2034, "getParentActivityIntent: bad parentActivityName '" + strM19858 + "' in manifest");
            return null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static Intent m2818(@InterfaceC6391 Context context, @InterfaceC6391 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM19859 = m19859(context, componentName);
        if (strM19859 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM19859);
        return m19859(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Intent m19857(@InterfaceC6391 Context context, @InterfaceC6391 Class<?> cls) throws PackageManager.NameNotFoundException {
        String strM19859 = m19859(context, new ComponentName(context, cls));
        if (strM19859 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, strM19859);
        return m19859(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m19858(@InterfaceC6391 Activity activity) {
        try {
            return m19859(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m19859(@InterfaceC6391 Context context, @InterfaceC6391 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f2035)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m19860(@InterfaceC6391 Activity activity) {
        Intent intentM2817 = m2817(activity);
        if (intentM2817 != null) {
            m19861(activity, intentM2817);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m19861(@InterfaceC6391 Activity activity, @InterfaceC6391 Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m19862(@InterfaceC6391 Activity activity, @InterfaceC6391 Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
