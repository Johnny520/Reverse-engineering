package Yue;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5782 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C5782 f1679 = m2446(new Locale[0]);

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC5784 f1680;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۦۥ$ۥ */
    @InterfaceC7113(21)
    public static class C0865 {

        /* JADX INFO: renamed from: ۥ */
        public static final Locale[] f1681 = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Locale m2448(String str) {
            return Locale.forLanguageTag(str);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2449(Locale locale) {
            for (Locale locale2 : f1681) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m17916(@InterfaceC6391 Locale locale, @InterfaceC6391 Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m2449(locale) || m2449(locale2)) {
                return false;
            }
            String strM16874 = C5390.m16874(locale);
            if (!strM16874.isEmpty()) {
                return strM16874.equals(C5390.m16874(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۦۥ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0866 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m2450(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static LocaleList m2451() {
            return LocaleList.getAdjustedDefault();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static LocaleList m17917() {
            return LocaleList.getDefault();
        }
    }

    public C5782(InterfaceC5784 interfaceC5784) {
        this.f1680 = interfaceC5784;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C5782 m2446(@InterfaceC6391 Locale... localeArr) {
        return m17907(C0866.m2450(localeArr));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Locale m2447(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains(JavaConstant.Dynamic.DEFAULT_NAME)) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split(JavaConstant.Dynamic.DEFAULT_NAME, -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C5782 m17902(@InterfaceC6490 String str) {
        if (str == null || str.isEmpty()) {
            return m17905();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C0865.m2448(strArrSplit[i]);
        }
        return m2446(localeArr);
    }

    @InterfaceC6391
    @InterfaceC7473(min = 1)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C5782 m17903() {
        return m17907(C0866.m2451());
    }

    @InterfaceC6391
    @InterfaceC7473(min = 1)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C5782 m17904() {
        return m17907(C0866.m17917());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C5782 m17905() {
        return f1679;
    }

    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m17906(@InterfaceC6391 Locale locale, @InterfaceC6391 Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : C0865.m17916(locale, locale2);
    }

    @InterfaceC6391
    @InterfaceC7113(24)
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static C5782 m17907(@InterfaceC6391 LocaleList localeList) {
        return new C5782(new C5785(localeList));
    }

    @InterfaceC7113(24)
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C5782 m17908(Object obj) {
        return m17907((LocaleList) obj);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5782) && this.f1680.equals(((C5782) obj).f1680);
    }

    public int hashCode() {
        return this.f1680.hashCode();
    }

    @InterfaceC6391
    public String toString() {
        return this.f1680.toString();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Locale m17909(int i) {
        return this.f1680.get(i);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Locale m17910(@InterfaceC6391 String[] strArr) {
        return this.f1680.mo17923(strArr);
    }

    @InterfaceC5459(from = -1)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m17911(@InterfaceC6490 Locale locale) {
        return this.f1680.mo2452(locale);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m17912() {
        return this.f1680.isEmpty();
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m17913() {
        return this.f1680.size();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String m17914() {
        return this.f1680.mo2453();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Object m17915() {
        return this.f1680.mo17922();
    }
}
