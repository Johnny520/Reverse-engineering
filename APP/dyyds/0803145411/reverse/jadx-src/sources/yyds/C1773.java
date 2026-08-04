package yyds;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛸᛵᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1773 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1773 f8883 = new C1773(new C1839(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1839 f8884;

    public C1773(C1839 c1839) {
        this.f8884 = c1839;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1773 m3529(String str) {
        if (str == null || str.isEmpty()) {
            return f8883;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new C1773(new C1839(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1773) {
            return this.f8884.equals(((C1773) obj).f8884);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8884.f9217.hashCode();
    }

    public final String toString() {
        return this.f8884.f9217.toString();
    }
}
