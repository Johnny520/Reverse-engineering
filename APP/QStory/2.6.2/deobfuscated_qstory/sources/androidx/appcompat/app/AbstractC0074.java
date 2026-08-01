package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.C2178;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0074 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m248(Configuration configuration, C2178 c2178) {
        configuration.setLocales(LocaleList.forLanguageTags(c2178.f6452.f6454.toLanguageTags()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m249(C2178 c2178) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2178.f6452.f6454.toLanguageTags()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2178 m250(Configuration configuration) {
        return C2178.m3964(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m251(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }
}
