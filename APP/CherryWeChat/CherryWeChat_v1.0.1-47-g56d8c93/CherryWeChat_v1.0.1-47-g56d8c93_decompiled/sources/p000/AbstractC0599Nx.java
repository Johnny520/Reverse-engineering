package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import io.github.cherrywechat.application.MainApplication;

/* JADX INFO: renamed from: Nx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0599Nx {

    /* JADX INFO: renamed from: a */
    public static final SharedPreferences f1939a;

    static {
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        SharedPreferences sharedPreferences = contextCurrentApplication.getSharedPreferences(AbstractC0295Gu.m625r(-839537257347125L), 0);
        AbstractC0295Gu.m625r(-839605976823861L);
        f1939a = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1172a(String str, boolean z) {
        AbstractC0295Gu.m625r(-839919509436469L);
        return f1939a.getBoolean(str, z);
    }

    /* JADX INFO: renamed from: b */
    public static String m1173b(String str, String str2) {
        AbstractC0295Gu.m625r(-839988228913205L);
        AbstractC0295Gu.m625r(-840005408782389L);
        String string = f1939a.getString(str, str2);
        return string == null ? str2 : string;
    }

    /* JADX INFO: renamed from: c */
    public static void m1174c(String str, boolean z) {
        AbstractC0295Gu.m625r(-839936689305653L);
        SharedPreferences.Editor editorEdit = f1939a.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public static void m1175d(String str) {
        AbstractC0295Gu.m625r(-839829315123253L);
        SharedPreferences.Editor editorEdit = f1939a.edit();
        editorEdit.putString(AbstractC0295Gu.m625r(-839850789959733L), str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public static void m1176e(String str, String str2) {
        AbstractC0295Gu.m625r(-839494307674165L);
        AbstractC0295Gu.m625r(-839511487543349L);
        SharedPreferences.Editor editorEdit = f1939a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
