package yyds;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Parcelable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛷᛱᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1480 extends AbstractC0333 {
    public static final Parcelable.Creator<C1480> CREATOR = new C1499(1);

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static boolean m2978(Context context) {
        try {
            PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0);
            if (permissionInfo != null) {
                return permissionInfo.getProtection() == 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "oem_installed_apps_runtime_permission_enable") == 1;
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static boolean m2979(Context context) {
        if (AbstractC1400.f6577 == 76334938) {
            try {
                PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo("com.samsung.android.permission.GET_APP_LIST", 0);
                if (permissionInfo != null) {
                    return permissionInfo.getProtection() == 1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final int mo1012(Activity activity) {
        if (m2978(activity)) {
            return 1;
        }
        if (m2979(activity) || AbstractC1400.f6577 != 67983659) {
            return 2;
        }
        String str = AbstractC1400.f6582;
        if (str == null) {
            str = "";
        }
        if (str.isEmpty()) {
            return 2;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return 2;
        }
        try {
            Integer.parseInt(strArrSplit[0]);
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1015() {
        return 17;
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final boolean mo1016(Context context) {
        boolean zMo1016 = super.mo1016(context);
        if (!zMo1016) {
            return zMo1016;
        }
        if (m2978(context) || m2979(context)) {
            return true;
        }
        int i = AbstractC1400.f6577;
        if (i != 2366768 || i != 2366768) {
            return zMo1016;
        }
        try {
            Class.forName(AppOpsManager.class.getName()).getDeclaredField("OP_GET_INSTALLED_APPS");
            return AbstractC1400.m2834();
        } catch (Exception unused) {
            return zMo1016;
        }
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1017(Activity activity, ArrayList arrayList, C0913 c0913, ArrayList arrayList2, C1859 c1859) {
        super.mo1017(activity, arrayList, c0913, arrayList2, c1859);
        if (activity.getApplicationInfo().targetSdkVersion >= 30 && AbstractC0333.m1010("android.permission.QUERY_ALL_PACKAGES", arrayList2) == null && ((ArrayList) c0913.f4161).isEmpty()) {
            C0188.m800("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"android.permission.QUERY_ALL_PACKAGES\" />, or add the app package name to the <queries> tag in the AndroidManifest.xml file");
        }
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final ArrayList mo1019(Activity activity) {
        ArrayList arrayList = new ArrayList();
        if ((AbstractC1400.m2840() && AbstractC1400.m2834()) || (AbstractC1400.m2838() && AbstractC1400.m2834())) {
            arrayList.add(new Intent("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", activity.getPackageName()));
        } else if (AbstractC1400.f6577 == 67983659) {
            arrayList.add(new Intent("com.meizu.safe.security.SHOW_APPSEC").putExtra("packageName", activity.getPackageName()));
        }
        arrayList.add(AbstractC0797.m1816(activity, this));
        arrayList.add(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        arrayList.add(new Intent("android.settings.APPLICATION_SETTINGS"));
        arrayList.add(new Intent("android.settings.SETTINGS"));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1020(Context context, boolean z) {
        int iIntValue;
        int iIntValue2;
        int i;
        if (m2978(context)) {
            return context.checkSelfPermission("com.android.permission.GET_INSTALLED_APPS") == 0;
        }
        if (m2979(context)) {
            return context.checkSelfPermission("com.samsung.android.permission.GET_APP_LIST") == 0;
        }
        if (AbstractC1400.f6577 == 67983659) {
            String str = AbstractC1400.f6582;
            if (str == null) {
                str = "";
            }
            if (str.isEmpty()) {
                i = -1;
                if (i >= 9) {
                    int i2 = Settings.Secure.getInt(context.getContentResolver(), context.getPackageName() + "_op_56", -1);
                    return i2 == 4 || i2 == 6;
                }
            } else {
                String[] strArrSplit = str.split("\\.");
                if (strArrSplit.length != 0) {
                    try {
                        i = Integer.parseInt(strArrSplit[0]);
                    } catch (Exception unused) {
                        i = -1;
                    }
                    if (i >= 9) {
                    }
                }
            }
        }
        if (AbstractC1400.f6577 != 2366768) {
            return true;
        }
        try {
            Class.forName(AppOpsManager.class.getName()).getDeclaredField("OP_GET_INSTALLED_APPS");
            if (!AbstractC1400.m2834()) {
                return true;
            }
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            if (appOpsManager == null) {
                iIntValue2 = -1;
            } else {
                try {
                    Class<?> cls = Class.forName(AppOpsManager.class.getName());
                    try {
                        iIntValue = ((Integer) cls.getDeclaredField("OP_GET_INSTALLED_APPS").get(Integer.class)).intValue();
                    } catch (NoSuchFieldException unused2) {
                        iIntValue = 10022;
                    }
                    Class cls2 = Integer.TYPE;
                    iIntValue2 = ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(iIntValue), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    iIntValue2 = -1;
                }
            }
            if (iIntValue2 == -1) {
                return true;
            }
            return iIntValue2 == 0;
        } catch (Exception unused3) {
            return true;
        }
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final String mo1021() {
        return "com.android.permission.GET_INSTALLED_APPS";
    }
}
