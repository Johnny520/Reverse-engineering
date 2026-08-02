package defpackage;

import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.QuickJsException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class af2 {
    public static final af2 a = new af2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(String str, String str2) {
        if (pv2.s0(str) || str.length() > 64) {
            c80.p("INVALID_ARGUMENT", str2.concat(" must not be blank and must contain at most 64 characters."), 0, null, null, 28);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str) {
        if (pv2.s0(str) || str.length() > 4096) {
            c80.p("INVALID_ARGUMENT", "message must not be blank and must contain at most 4096 characters.", 0, null, null, 28);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(QuickJs quickJs, vn1 vn1Var) throws QuickJsException {
        df2 df2Var = (df2) vn1Var.d;
        n4 n4Var = new n4(df2Var.a);
        v20 v20Var = new v20(df2Var.a);
        dq1 dq1Var = new dq1(vn1Var);
        h9 h9Var = new h9(vn1Var, n4Var, v20Var, dq1Var, new jw0(vn1Var, dq1Var), 3);
        fs1 fs1Var = new fs1(quickJs.getTypeConverters(), "__nukeNative");
        h9Var.j(fs1Var);
        s11.G(quickJs, fs1Var, -1L);
        fs1 fs1Var2 = new fs1(quickJs.getTypeConverters(), "console");
        fs1Var2.b("debug", new vd2(vn1Var, 10));
        fs1Var2.b("log", new vd2(vn1Var, 11));
        fs1Var2.b("info", new vd2(vn1Var, 12));
        fs1Var2.b("warn", new vd2(vn1Var, 13));
        fs1Var2.b("error", new vd2(vn1Var, 14));
        s11.G(quickJs, fs1Var2, -1L);
        for (Map.Entry entry : ((Map) cf2.a.getValue()).entrySet()) {
            quickJs.addModule((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return obj.toString();
        }
        if (obj instanceof List) {
            return du.u0((Iterable) obj, null, "[", "]", new e2(1, this, af2.class, "formatLogValue", "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 0, 3), 25);
        }
        return obj instanceof Map ? du.u0(((Map) obj).entrySet(), null, "{", "}", new xc2(28), 25) : obj.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(vn1 vn1Var, ph2 ph2Var, Object[] objArr) {
        vn1Var.t(ph2Var, mg.p0(objArr, " ", new e2(1, this, af2.class, "formatLogValue", "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 0, 5), 30));
    }
}
