package Yue;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4094 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧ$ۥ */
    @InterfaceC7113(24)
    public static class C0321 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m1051(Configuration configuration) {
            return configuration.getLocales();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m1052(@InterfaceC6391 Configuration configuration, @InterfaceC6391 C5782 c5782) {
            configuration.setLocales((LocaleList) c5782.m17915());
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C5782 m1049(@InterfaceC6391 Configuration configuration) {
        return C5782.m17907(C0321.m1051(configuration));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1050(@InterfaceC6391 Configuration configuration, @InterfaceC6391 C5782 c5782) {
        C0321.m1052(configuration, c5782);
    }
}
