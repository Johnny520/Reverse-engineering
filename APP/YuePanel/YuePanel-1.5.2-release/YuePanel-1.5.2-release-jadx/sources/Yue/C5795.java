package Yue;

import Yue.InterfaceC7144;
import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public final class C5795 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1685 = "ۥ۠ۧۧۦ";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String[] f1686 = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ */
    public static /* synthetic */ class C0870 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1687;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f1687 = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1687[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1687[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1687[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0871 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2471(@InterfaceC6391 Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Locale m2472() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C5796 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2473(@InterfaceC6391 Locale locale) {
            return m2474(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static String m2474(DateFormat.HourCycle hourCycle) {
            int i = C0870.f1687[hourCycle.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : C5799.f14402 : C5799.f14401 : C5799.f14400 : C5799.f1693;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static String m17950(@InterfaceC6391 Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(C5800.f14404) ? C5800.f14404 : identifier;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5797 {

        /* JADX INFO: renamed from: ۥ */
        public static final String f1688 = "ca";

        /* JADX INFO: renamed from: ۥ۟ */
        public static final String f1689 = "chinese";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String f14382 = "dangi";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String f14383 = "gregorian";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f14384 = "hebrew";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f14385 = "indian";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final String f14386 = "islamic";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final String f14387 = "islamic-civil";

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final String f14388 = "islamic-rgsa";

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final String f14389 = "islamic-tbla";

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final String f14390 = "islamic-umalqura";

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final String f14391 = "persian";

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final String f14392 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0872 {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C5798 {

        /* JADX INFO: renamed from: ۥ */
        public static final String f1690 = "fw";

        /* JADX INFO: renamed from: ۥ۟ */
        public static final String f1691 = "sun";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String f14393 = "mon";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String f14394 = "tue";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f14395 = "wed";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f14396 = "thu";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final String f14397 = "fri";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final String f14398 = "sat";

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final String f14399 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۟$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0873 {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C5799 {

        /* JADX INFO: renamed from: ۥ */
        public static final String f1692 = "hc";

        /* JADX INFO: renamed from: ۥ۟ */
        public static final String f1693 = "h11";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String f14400 = "h12";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String f14401 = "h23";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f14402 = "h24";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f14403 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۠$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0874 {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C5800 {

        /* JADX INFO: renamed from: ۥ */
        public static final String f1694 = "mu";

        /* JADX INFO: renamed from: ۥ۟ */
        public static final String f1695 = "celsius";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String f14404 = "fahrenhe";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String f14405 = "kelvin";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f14406 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟ۡ$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0875 {
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static String m2469(@InterfaceC6391 Locale locale) {
        return m17943(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static String m2470(@InterfaceC6391 Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? C5799.f14401 : C5799.f14400;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m17930() {
        return m17933(true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m17931(@InterfaceC6391 Locale locale) {
        return m17932(locale, true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m17932(@InterfaceC6391 Locale locale, boolean z) {
        String strM17949 = m17949(C5797.f1688, "", locale, z);
        return strM17949 != null ? strM17949 : C0871.m2471(locale);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m17933(boolean z) {
        return m17932(C0871.m2472(), z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Locale m17934() {
        return Locale.getDefault();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m17935() {
        return m17938(true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m17936(@InterfaceC6391 Locale locale) {
        return m17937(locale, true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static String m17937(@InterfaceC6391 Locale locale, boolean z) {
        String strM17949 = m17949(C5798.f1690, "", locale, z);
        return strM17949 != null ? strM17949 : m2469(locale);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static String m17938(boolean z) {
        return m17937(C0871.m2472(), z);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m17939() {
        return m17942(true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static String m17940(@InterfaceC6391 Locale locale) {
        return m17941(locale, true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static String m17941(@InterfaceC6391 Locale locale, boolean z) {
        String strM17949 = m17949(C5799.f1692, "", locale, z);
        return strM17949 != null ? strM17949 : Build.VERSION.SDK_INT >= 33 ? C5796.m2473(locale) : m2470(locale);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static String m17942(boolean z) {
        return m17941(C0871.m2472(), z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m17943(int i) {
        return (i < 1 || i > 7) ? "" : new String[]{C5798.f1691, C5798.f14393, C5798.f14394, C5798.f14395, C5798.f14396, C5798.f14397, C5798.f14398}[i - 1];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static String m17944(Locale locale) {
        return Arrays.binarySearch(f1686, locale.getCountry()) >= 0 ? C5800.f14404 : C5800.f1695;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static String m17945() {
        return m17948(true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static String m17946(@InterfaceC6391 Locale locale) {
        return m17947(locale, true);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static String m17947(@InterfaceC6391 Locale locale, boolean z) {
        String strM17949 = m17949(C5800.f1694, "", locale, z);
        return strM17949 != null ? strM17949 : Build.VERSION.SDK_INT >= 33 ? C5796.m17950(locale) : m17944(locale);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static String m17948(boolean z) {
        return m17947(C0871.m2472(), z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static String m17949(String str, String str2, Locale locale, boolean z) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z) {
            return null;
        }
        return str2;
    }
}
