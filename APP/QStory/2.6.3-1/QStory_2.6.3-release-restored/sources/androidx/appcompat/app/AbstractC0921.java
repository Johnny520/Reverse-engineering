package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.C3011;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0921 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m809(Configuration configuration, C3011 c3011) {
        configuration.setLocales(LocaleList.forLanguageTags(c3011.f6798.f6800.toLanguageTags()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m810(C3011 c3011) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c3011.f6798.f6800.toLanguageTags()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3011 m811(Configuration configuration) {
        return C3011.m4534(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m812(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }
}
