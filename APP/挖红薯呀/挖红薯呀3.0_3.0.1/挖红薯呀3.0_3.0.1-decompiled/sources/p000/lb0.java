package p000;

import android.util.Log;
import io.github.libxposed.api.XposedModule;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lb0 {

    /* JADX INFO: renamed from: b */
    private static final String f3405b = "XP1";

    /* JADX INFO: renamed from: c */
    private static volatile XposedModule f3406c;

    /* JADX INFO: renamed from: a */
    public static final lb0 f3404a = new lb0();

    /* JADX INFO: renamed from: d */
    public static final int f3407d = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private lb0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2011c(lb0 lb0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        lb0Var.m2014a(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2012f(lb0 lb0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        lb0Var.m2017e(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2013i(lb0 lb0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        lb0Var.m2019h(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2014a(String str, String str2) {
        StringBuilder sb;
        str.getClass();
        str2.getClass();
        if (str2.length() > 0) {
            sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
        } else {
            sb = new StringBuilder("[");
            sb.append(str);
            sb.append("]");
        }
        String string = sb.toString();
        XposedModule xposedModule = f3406c;
        if (xposedModule != null) {
            xposedModule.log(4, f3405b, string);
        } else {
            Log.i(f3405b, string);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2015b(String str, Throwable th) {
        String str2;
        str.getClass();
        if (th != null) {
            str2 = "[" + str + "] " + th.getClass().getSimpleName() + ": " + th.getMessage();
        } else {
            str2 = "[" + str + "]";
        }
        XposedModule xposedModule = f3406c;
        if (xposedModule != null) {
            xposedModule.log(4, f3405b, str2);
        } else {
            Log.i(f3405b, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final XposedModule m2016d() {
        return f3406c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2017e(String str, String str2) {
        str.getClass();
        str2.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2018g(XposedModule xposedModule) {
        f3406c = xposedModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2019h(String str, String str2) {
        StringBuilder sb;
        str.getClass();
        str2.getClass();
        if (str2.length() > 0) {
            sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
        } else {
            sb = new StringBuilder("[");
            sb.append(str);
            sb.append("]");
        }
        String string = sb.toString();
        XposedModule xposedModule = f3406c;
        if (xposedModule != null) {
            xposedModule.log(4, f3405b, string);
        } else {
            Log.i(f3405b, string);
        }
    }
}
