package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.C2178;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0074 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m249(Configuration configuration, C2178 c2178) {
        configuration.setLocales(LocaleList.forLanguageTags(c2178.f6453.f6455.toLanguageTags()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m250(C2178 c2178) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2178.f6453.f6455.toLanguageTags()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2178 m251(Configuration configuration) {
        return C2178.m3974(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m252(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }
}
