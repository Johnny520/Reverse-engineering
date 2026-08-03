package Yue;

import Yue.C3605;
import Yue.InterfaceC7144;
import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5193 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1335 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1336 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12283 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f12284 = 3;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ */
    @InterfaceC7113(34)
    public static class C0664 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m1971(Context context) {
            return m1972(context).getApplicationGrammaticalGender();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static GrammaticalInflectionManager m1972(Context context) {
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m15899(Context context, int i) {
            m1972(context).setRequestedApplicationGrammaticalGender(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0665 {
    }

    @InterfaceC6578(markerClass = {C3605.InterfaceC0195.class})
    @InterfaceC3262
    /* JADX INFO: renamed from: ۥ */
    public static int m1969(@InterfaceC6391 Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0664.m1971(context);
        }
        return 0;
    }

    @InterfaceC6578(markerClass = {C3605.InterfaceC0195.class})
    @InterfaceC3262
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1970(@InterfaceC6391 Context context, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            C0664.m15899(context, i);
        }
    }
}
