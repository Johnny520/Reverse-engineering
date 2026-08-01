package p000;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: uo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0788uo {
    /* JADX INFO: renamed from: a */
    public static ULocale m2477a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m2478b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m2479c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
