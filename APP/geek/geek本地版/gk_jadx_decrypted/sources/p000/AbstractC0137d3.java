package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0137d3 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m866a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m867b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
