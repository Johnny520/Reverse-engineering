package yyds;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: yyds.ᛳᲁᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0695 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0695 f3286;

    static {
        AbstractC2328.m4341(-600517605229422L);
        AbstractC2328.m4341(-600577734771566L);
        AbstractC2328.m4341(-600624979411822L);
        AbstractC2328.m4341(-600663634117486L);
        AbstractC2328.m4341(-600702288823150L);
        f3286 = new C0695();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m1608(Context context) {
        AbstractC2328.m4341(-600251317257070L);
        return m1610(context).getBoolean(AbstractC2328.m4341(-600285676995438L), false);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m1609(Context context) {
        AbstractC2328.m4341(-600169712878446L);
        String string = m1610(context).getString(AbstractC2328.m4341(-600204072616814L), AbstractC2328.m4341(-600242727322478L));
        return string == null ? AbstractC2328.m4341(-600247022289774L) : string;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static SharedPreferences m1610(Context context) {
        return context.getSharedPreferences(AbstractC2328.m4341(-599534057718638L), 0);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static String m1611(Context context) {
        AbstractC2328.m4341(-599997914186606L);
        String string = m1610(context).getString(AbstractC2328.m4341(-600032273924974L), AbstractC2328.m4341(-600079518565230L));
        return string == null ? AbstractC2328.m4341(-600083813532526L) : string;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static boolean m1612(Context context) {
        AbstractC2328.m4341(-600483245491054L);
        return m1611(context).length() > 0 && m1613(context).length() > 0 && m1609(context).length() > 0;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m1613(Context context) {
        AbstractC2328.m4341(-600088108499822L);
        String string = m1610(context).getString(AbstractC2328.m4341(-600122468238190L), AbstractC2328.m4341(-600161122943854L));
        return string == null ? AbstractC2328.m4341(-600165417911150L) : string;
    }
}
