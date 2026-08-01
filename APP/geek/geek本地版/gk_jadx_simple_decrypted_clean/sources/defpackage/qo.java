package defpackage;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class qo {
    public static ULocale a(Object r0) {
        return ULocale.addLikelySubtags((ULocale) r0);
    }

    public static ULocale b(Locale r0) {
        return ULocale.forLocale(r0);
    }

    public static String c(Object r0) {
        return ((ULocale) r0).getScript();
    }
}
