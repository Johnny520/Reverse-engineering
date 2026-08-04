package yyds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛲᛴᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0333 implements Parcelable {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1009(C1859 c1859, String str, int i) {
        String strM1989;
        if (c1859 == null) {
            C0188.m800(AbstractC2104.m4014("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"", str, "\" />"));
            return;
        }
        int i2 = c1859.f9344;
        if (i2 < i) {
            StringBuilder sb = new StringBuilder("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb.append(str);
            sb.append("\" android:maxSdkVersion=\"");
            sb.append(i2);
            sb.append("\" /> does not meet the requirements, ");
            if (i != Integer.MAX_VALUE) {
                strM1989 = AbstractC0897.m1989(i, "the minimum requirement for maxSdkVersion is ");
            } else {
                strM1989 = "please delete the android:maxSdkVersion=\"" + i2 + "\" attribute";
            }
            sb.append(strM1989);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C1859 m1010(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1859 c1859 = (C1859) it.next();
            if (AbstractC0879.m1958(c1859.f9343, str)) {
                return c1859;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0333) {
            return AbstractC0879.m1958(mo1021(), ((AbstractC0333) obj).mo1021());
        }
        if (!(obj instanceof String)) {
            return false;
        }
        return AbstractC0879.m1958(mo1021(), (String) obj);
    }

    public final String toString() {
        return mo1021();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean mo1011(Context context, boolean z) {
        return context.checkSelfPermission(mo1021()) == 0;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int mo1012(Activity activity) {
        return 1;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean mo1013(Context context, boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public String mo1014() {
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract int mo1015();

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean mo1016(Context context) {
        return mo1015() <= Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void mo1017(Activity activity, ArrayList arrayList, C0913 c0913, ArrayList arrayList2, C1859 c1859) {
        m1009(c1859, mo1021(), Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public List mo1018() {
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public ArrayList mo1019(Activity activity) {
        ArrayList arrayList = new ArrayList(5);
        if (AbstractC1400.m2838() && AbstractC1400.m2834()) {
            arrayList.add(new Intent("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", activity.getPackageName()));
        } else if (AbstractC1400.m2840() && AbstractC1400.m2834()) {
            String str = AbstractC1400.f6582;
            if (str == null) {
                str = "";
            }
            if (!str.matches("^2\\.0\\.[0-5]\\.\\d+$")) {
                arrayList.add(new Intent("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", activity.getPackageName()));
            }
        } else if (AbstractC1400.f6577 == 67983659) {
            arrayList.add(new Intent("com.meizu.safe.security.SHOW_APPSEC").putExtra("packageName", activity.getPackageName()));
        }
        arrayList.add(AbstractC0797.m1816(activity, this));
        arrayList.add(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        arrayList.add(new Intent("android.settings.APPLICATION_SETTINGS"));
        arrayList.add(new Intent("android.settings.SETTINGS"));
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean mo1020(Context context, boolean z) {
        return mo1015() > Build.VERSION.SDK_INT ? mo1013(context, z) : mo1011(context, z);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public abstract String mo1021();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void mo1022(Activity activity, ArrayList arrayList) {
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int mo1023(Activity activity) {
        return mo1015();
    }
}
