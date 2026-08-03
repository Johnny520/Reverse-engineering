package p000a;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: a.L8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209L8 {
    /* JADX INFO: renamed from: a */
    public static ULocale m583a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m584b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m585c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
