package yyds;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛸᛷᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1827 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f9181 = 0;

    static {
        SdkExtensions.getExtensionVersion(30);
        SdkExtensions.getExtensionVersion(31);
        SdkExtensions.getExtensionVersion(33);
        SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final boolean m3586() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i >= 32) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                Integer num = str.toUpperCase(locale).equals("BAKLAVA") ? num : null;
                num = "Tiramisu".toUpperCase(locale).equals("BAKLAVA") ? 0 : null;
                if (num == null || num == null) {
                    if (num == null && num == null) {
                        if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
