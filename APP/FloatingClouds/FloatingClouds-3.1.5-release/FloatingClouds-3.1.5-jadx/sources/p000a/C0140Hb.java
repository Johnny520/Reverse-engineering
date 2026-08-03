package p000a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: a.Hb */
/* JADX INFO: loaded from: classes.dex */
public final class C0140Hb {
    /* JADX INFO: renamed from: a */
    public static Intent m364a(ActivityC0075E0 activityC0075E0) {
        Intent parentActivityIntent = activityC0075E0.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM366c = m366c(activityC0075E0, activityC0075E0.getComponentName());
            if (strM366c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activityC0075E0, strM366c);
            try {
                return m366c(activityC0075E0, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM366c + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m365b(ActivityC0075E0 activityC0075E0, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM366c = m366c(activityC0075E0, componentName);
        if (strM366c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM366c);
        return m366c(activityC0075E0, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: c */
    public static String m366c(Activity activity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }
}
