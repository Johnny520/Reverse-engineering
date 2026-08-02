package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed3 {
    public static final SharedPreferences a;
    public static final String b;
    public static final String c;
    public static final hx2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Context context = up0.i;
        if (context == null) {
            t11.S("hostContext");
            throw null;
        }
        String str = up0.n;
        if (str == null) {
            t11.S("hostPkgName");
            throw null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str.concat("_preferences"), 4);
        a = sharedPreferences;
        String string = sharedPreferences.getString("last_avatar_path", "");
        string.getClass();
        b = string;
        String string2 = sharedPreferences.getString("last_login_alias", "");
        string2.getClass();
        c = string2;
        d = new hx2(new y63(9));
        new hx2(new y63(10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a() {
        String string = a.getString("login_weixin_username", "");
        string.getClass();
        return string;
    }
}
