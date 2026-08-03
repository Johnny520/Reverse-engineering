package p000a;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: a.J9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0174J9 {

    /* JADX INFO: renamed from: b */
    public static final C0174J9 f611b = new C0174J9(new C0210L9(b.m474a(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final C0210L9 f612a;

    /* JADX INFO: renamed from: a.J9$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final Locale[] f613a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* JADX INFO: renamed from: a */
        public static Locale m472a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m473b(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (locale.getLanguage().equals(locale2.getLanguage())) {
                Locale[] localeArr = f613a;
                for (Locale locale3 : localeArr) {
                    if (locale3.equals(locale)) {
                        return false;
                    }
                }
                for (Locale locale4 : localeArr) {
                    if (locale4.equals(locale2)) {
                        return false;
                    }
                }
                String strM585c = C0209L8.m585c(C0209L8.m583a(C0209L8.m584b(locale)));
                if (!strM585c.isEmpty()) {
                    return strM585c.equals(C0209L8.m585c(C0209L8.m583a(C0209L8.m584b(locale2))));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a.J9$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m474a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* JADX INFO: renamed from: b */
        public static LocaleList m475b() {
            return LocaleList.getAdjustedDefault();
        }

        /* JADX INFO: renamed from: c */
        public static LocaleList m476c() {
            return LocaleList.getDefault();
        }
    }

    public C0174J9(C0210L9 c0210l9) {
        this.f612a = c0210l9;
    }

    /* JADX INFO: renamed from: a */
    public static C0174J9 m471a(String str) {
        if (str == null || str.isEmpty()) {
            return f611b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.m472a(strArrSplit[i]);
        }
        return new C0174J9(new C0210L9(b.m474a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0174J9) {
            return this.f612a.equals(((C0174J9) obj).f612a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f612a.f697a.hashCode();
    }

    public final String toString() {
        return this.f612a.f697a.toString();
    }
}
