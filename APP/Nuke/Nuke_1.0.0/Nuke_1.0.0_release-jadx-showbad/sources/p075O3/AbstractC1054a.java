package p075O3;

import android.content.Context;
import android.content.SharedPreferences;
import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: O3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1054a {

    /* JADX INFO: renamed from: a */
    public static final String f3289a;

    /* JADX INFO: renamed from: b */
    public static final String f3290b;

    /* JADX INFO: renamed from: c */
    public static final String f3291c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Context context = AbstractC1785a.f6095a;
        if (context == null) {
            AbstractC1665j.m2991k("hostContext");
            throw null;
        }
        String str = AbstractC1785a.f6099e;
        if (str == null) {
            AbstractC1665j.m2991k("hostPkgName");
            throw null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str.concat("_preferences"), 4);
        String string = sharedPreferences.getString("login_weixin_username", "");
        AbstractC1665j.m2982b(string);
        f3289a = string;
        String string2 = sharedPreferences.getString("last_login_nick_name", "");
        AbstractC1665j.m2982b(string2);
        f3290b = string2;
        String string3 = sharedPreferences.getString("last_avatar_path", "");
        AbstractC1665j.m2982b(string3);
        f3291c = string3;
    }
}
