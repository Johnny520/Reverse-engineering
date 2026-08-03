package Yue;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7758 {
    /* JADX INFO: renamed from: ۥ */
    public static int m3849(@InterfaceC6490 Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m3850(@InterfaceC6391 String str) {
        return TextUtils.htmlEncode(str);
    }
}
