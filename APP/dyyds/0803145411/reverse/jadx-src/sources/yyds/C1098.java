package yyds;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛵᛵᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1098 extends AbstractC0333 {
    public static final Parcelable.Creator<C1098> CREATOR = new C1499(5);

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final boolean mo1011(Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 33) {
            return super.mo1011(context, z);
        }
        AbstractC0333 abstractC0333M3678 = AbstractC1897.m3678("android.permission.READ_MEDIA_IMAGES");
        if (abstractC0333M3678 == null) {
            abstractC0333M3678 = new C0874();
            AbstractC1897.f9607.m2556("android.permission.READ_MEDIA_IMAGES", abstractC0333M3678);
        }
        if (!abstractC0333M3678.mo1020(context, z)) {
            return false;
        }
        AbstractC0333 abstractC0333M36782 = AbstractC1897.m3678("android.permission.READ_MEDIA_VIDEO");
        if (abstractC0333M36782 == null) {
            abstractC0333M36782 = new C0620();
            AbstractC1897.f9607.m2556("android.permission.READ_MEDIA_VIDEO", abstractC0333M36782);
        }
        return abstractC0333M36782.mo1020(context, z) && AbstractC1897.m3680().mo1020(context, z);
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final String mo1014() {
        return "storage_group";
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1015() {
        return 23;
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1017(Activity activity, ArrayList arrayList, C0913 c0913, ArrayList arrayList2, C1859 c1859) {
        C1572 c1572;
        boolean z;
        super.mo1017(activity, arrayList, c0913, arrayList2, c1859);
        if (AbstractC0879.m1962("android.permission.ACCESS_MEDIA_LOCATION", arrayList) || (c1572 = (C1572) c0913.f4160) == null) {
            return;
        }
        int i = activity.getApplicationInfo().targetSdkVersion;
        ArrayList<C0152> arrayList3 = (ArrayList) c1572.f7970;
        if (arrayList3 != null) {
            for (C0152 c0152 : arrayList3) {
                if ("ScopedStorage".equals(c0152.f947)) {
                    z = Boolean.parseBoolean(c0152.f948);
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (i < 29 || c1572.f7969 || z) {
            if (i < 30 || z) {
                return;
            }
            C0188.m798("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use \"android.permission.MANAGE_EXTERNAL_STORAGE\" to apply for permission");
        } else {
            C0188.m800("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
        }
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final String mo1021() {
        return "android.permission.READ_EXTERNAL_STORAGE";
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1022(Activity activity, ArrayList arrayList) {
        if (activity.getApplicationInfo().targetSdkVersion < 33) {
            return;
        }
        C0188.m798("When the project targetSdkVersion >= 33, the \"android.permission.READ_EXTERNAL_STORAGE\" permission cannot be applied for, and some problems will occur.Because after testing, if targetSdkVersion >= 33 applies for \"android.permission.READ_EXTERNAL_STORAGE\" or \"android.permission.WRITE_EXTERNAL_STORAGE\", it will be directly rejected by the system and no authorization dialog box will be displayed.If the App has been adapted for scoped storage, the should be requested \"android.permission.READ_MEDIA_IMAGES\" or \"android.permission.READ_MEDIA_VIDEO\" or \"android.permission.READ_MEDIA_AUDIO\" permission.If the App does not need to adapt scoped storage, the should be requested \"android.permission.MANAGE_EXTERNAL_STORAGE\" permission");
    }
}
