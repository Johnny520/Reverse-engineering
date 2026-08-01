package p000;

import java.util.Locale;

/* JADX INFO: renamed from: qr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0644qr {

    /* JADX INFO: renamed from: a */
    public static final Locale[] f4114a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: a */
    public static Locale m2182a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2183b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f4114a;
            int length = localeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    int length2 = localeArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            String strM2179c = AbstractC0641qo.m2179c(AbstractC0641qo.m2177a(AbstractC0641qo.m2178b(locale)));
                            if (!strM2179c.isEmpty()) {
                                return strM2179c.equals(AbstractC0641qo.m2179c(AbstractC0641qo.m2177a(AbstractC0641qo.m2178b(locale2))));
                            }
                            String country = locale.getCountry();
                            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                                return true;
                            }
                        } else {
                            if (localeArr[i2].equals(locale2)) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    if (localeArr[i].equals(locale)) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
