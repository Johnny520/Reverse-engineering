package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0321i3 {
    /* JADX INFO: renamed from: a */
    public static void m1386a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static C0718sr m1387b(Configuration configuration) {
        return C0718sr.m2337a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m1388c(C0718sr c0718sr) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0718sr.f4452a.f4613a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m1389d(Configuration configuration, C0718sr c0718sr) {
        configuration.setLocales(LocaleList.forLanguageTags(c0718sr.f4452a.f4613a.toLanguageTags()));
    }
}
