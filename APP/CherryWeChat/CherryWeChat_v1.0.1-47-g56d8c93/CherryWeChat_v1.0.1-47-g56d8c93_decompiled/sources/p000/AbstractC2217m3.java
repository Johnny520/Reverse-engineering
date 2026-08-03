package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2217m3 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m4461a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m4462b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
