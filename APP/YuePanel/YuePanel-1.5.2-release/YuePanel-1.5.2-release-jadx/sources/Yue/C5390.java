package Yue;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5390 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1484 = "ICUCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f1485;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Method f13281;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ$ۥ */
    @InterfaceC7113(21)
    public static class C0739 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2162(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0740 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ULocale m2163(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ULocale m2164(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static String m16875(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ */
    public static String m2160(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f13281;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e) {
            Log.w(f1484, e);
        } catch (InvocationTargetException e2) {
            Log.w(f1484, e2);
        }
        return string;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m2161(String str) {
        try {
            Method method = f1485;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w(f1484, e);
        } catch (InvocationTargetException e2) {
            Log.w(f1484, e2);
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m16874(@InterfaceC6391 Locale locale) {
        return C0740.m16875(C0740.m2163(C0740.m2164(locale)));
    }
}
