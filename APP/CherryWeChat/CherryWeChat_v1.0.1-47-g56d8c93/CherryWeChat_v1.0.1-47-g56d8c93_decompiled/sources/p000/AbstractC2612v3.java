package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: v3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2612v3 {
    /* JADX INFO: renamed from: a */
    public static void m5122a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static C1105Zo m5123b(Configuration configuration) {
        return C1105Zo.m2029a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m5124c(C1105Zo c1105Zo) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c1105Zo.f3499a.f4071a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m5125d(Configuration configuration, C1105Zo c1105Zo) {
        configuration.setLocales(LocaleList.forLanguageTags(c1105Zo.f3499a.f4071a.toLanguageTags()));
    }
}
