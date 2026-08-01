package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qo {
    public static android.icu.util.ULocale a(java.lang.Object r0) {
            android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
            android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
            return r0
    }

    public static android.icu.util.ULocale b(java.util.Locale r0) {
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r0)
            return r0
    }

    public static java.lang.String c(java.lang.Object r0) {
            android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
            java.lang.String r0 = r0.getScript()
            return r0
    }
}
