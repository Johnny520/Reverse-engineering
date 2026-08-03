package Yue;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5786 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧ$ۥ */
    @InterfaceC7113(21)
    public static class C0868 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2457(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0869 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static C5782 m2458(Configuration configuration) {
            return C5782.m17902(configuration.getLocales().toLanguageTags());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C5787 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m2459(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static LocaleList m2460(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    @InterfaceC6391
    @InterfaceC3262
    /* JADX INFO: renamed from: ۥ */
    public static C5782 m2455(@InterfaceC6391 Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C5782.m17902(C3365.m446(context));
        }
        Object objM17927 = m17927(context);
        return objM17927 != null ? C5782.m17907(C5787.m2459(objM17927)) : C5782.m17905();
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟ */
    public static C5782 m2456(Configuration configuration) {
        return C0869.m2458(configuration);
    }

    @InterfaceC7113(33)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object m17927(Context context) {
        return context.getSystemService("locale");
    }

    @InterfaceC6391
    @InterfaceC3262
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C5782 m17928(@InterfaceC6391 Context context) {
        C5782 c5782M17905 = C5782.m17905();
        if (Build.VERSION.SDK_INT < 33) {
            return m2456(Resources.getSystem().getConfiguration());
        }
        Object objM17927 = m17927(context);
        return objM17927 != null ? C5782.m17907(C5787.m2460(objM17927)) : c5782M17905;
    }
}
