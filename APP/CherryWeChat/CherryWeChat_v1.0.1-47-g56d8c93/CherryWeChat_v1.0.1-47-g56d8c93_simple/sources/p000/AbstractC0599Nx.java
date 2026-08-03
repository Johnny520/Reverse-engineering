package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import io.github.cherrywechat.application.MainApplication;

/* JADX INFO: renamed from: Nx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0599Nx {

    /* JADX INFO: renamed from: a */
    public static final SharedPreferences f1939a = null;

    static {
        Context r0 = MainApplication.f5549a;
        if (r0 != null) goto L9;
        r0 = C1456gf.f5172p;
        if (r0 != null) goto L9;
        r0 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L9:
        SharedPreferences r02 = r0.getSharedPreferences(AbstractC0295Gu.m625r(-839537257347125L), 0);
        AbstractC0295Gu.m625r(-839605976823861L);
        f1939a = r02;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1172a(String r2, boolean r3) {
        AbstractC0295Gu.m625r(-839919509436469L);
        return f1939a.getBoolean(r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public static String m1173b(String r2, String r3) {
        AbstractC0295Gu.m625r(-839988228913205L);
        AbstractC0295Gu.m625r(-840005408782389L);
        String r22 = f1939a.getString(r2, r3);
        if (r22 != null) goto L5;
        return r3;
    L5:
        return r22;
    }

    /* JADX INFO: renamed from: c */
    public static void m1174c(String r2, boolean r3) {
        AbstractC0295Gu.m625r(-839936689305653L);
        SharedPreferences.Editor r0 = f1939a.edit();
        r0.putBoolean(r2, r3);
        r0.apply();
    }

    /* JADX INFO: renamed from: d */
    public static void m1175d(String r3) {
        AbstractC0295Gu.m625r(-839829315123253L);
        SharedPreferences.Editor r0 = f1939a.edit();
        r0.putString(AbstractC0295Gu.m625r(-839850789959733L), r3);
        r0.apply();
    }

    /* JADX INFO: renamed from: e */
    public static void m1176e(String r2, String r3) {
        AbstractC0295Gu.m625r(-839494307674165L);
        AbstractC0295Gu.m625r(-839511487543349L);
        SharedPreferences.Editor r0 = f1939a.edit();
        r0.putString(r2, r3);
        r0.apply();
    }
}
