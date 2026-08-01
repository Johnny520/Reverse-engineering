package p000;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: qo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641qo {
    /* JADX INFO: renamed from: a */
    public static ULocale m2177a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m2178b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m2179c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
