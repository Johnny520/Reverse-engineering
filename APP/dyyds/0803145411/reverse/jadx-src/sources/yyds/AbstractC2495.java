package yyds;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: yyds.ᲇᛸᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2495 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4533(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1773 m4534(Configuration configuration) {
        return C1773.m3529(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m4535(C1773 c1773) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c1773.f8884.f9217.toLanguageTags()));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m4536(Configuration configuration, C1773 c1773) {
        configuration.setLocales(LocaleList.forLanguageTags(c1773.f8884.f9217.toLanguageTags()));
    }
}
