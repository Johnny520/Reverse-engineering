package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed3 {

    /* JADX INFO: renamed from: a */
    public static final SharedPreferences f2402a;

    /* JADX INFO: renamed from: b */
    public static final String f2403b;

    /* JADX INFO: renamed from: c */
    public static final String f2404c;

    /* JADX INFO: renamed from: d */
    public static final hx2 f2405d;

    static {
        Context context = up0.f11401i;
        if (context == null) {
            t11.m5067S("hostContext");
            throw null;
        }
        String str = up0.f11406n;
        if (str == null) {
            t11.m5067S("hostPkgName");
            throw null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str.concat("_preferences"), 4);
        f2402a = sharedPreferences;
        String string = sharedPreferences.getString("last_avatar_path", "");
        string.getClass();
        f2403b = string;
        String string2 = sharedPreferences.getString("last_login_alias", "");
        string2.getClass();
        f2404c = string2;
        f2405d = new hx2(new y63(9));
        new hx2(new y63(10));
    }

    /* JADX INFO: renamed from: a */
    public static String m1340a() {
        String string = f2402a.getString("login_weixin_username", "");
        string.getClass();
        return string;
    }
}
