package p000;

import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.QuickJsException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class af2 {

    /* JADX INFO: renamed from: a */
    public static final af2 f186a = new af2();

    /* JADX INFO: renamed from: a */
    public static final void m146a(String str, String str2) {
        if (pv2.m4006s0(str) || str.length() > 64) {
            c80.m672p("INVALID_ARGUMENT", str2.concat(" must not be blank and must contain at most 64 characters."), 0, null, null, 28);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m147b(String str) {
        if (pv2.m4006s0(str) || str.length() > 4096) {
            c80.m672p("INVALID_ARGUMENT", "message must not be blank and must contain at most 4096 characters.", 0, null, null, 28);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m148d(QuickJs quickJs, vn1 vn1Var) throws QuickJsException {
        df2 df2Var = (df2) vn1Var.f12033d;
        C0485n4 c0485n4 = new C0485n4(df2Var.f2023a);
        v20 v20Var = new v20(df2Var.f2023a);
        dq1 dq1Var = new dq1(vn1Var);
        C0269h9 c0269h9 = new C0269h9(vn1Var, c0485n4, v20Var, dq1Var, new jw0(vn1Var, dq1Var), 3);
        fs1 fs1Var = new fs1(quickJs.getTypeConverters(), "__nukeNative");
        c0269h9.mo5j(fs1Var);
        s11.m4662G(quickJs, fs1Var, -1L);
        fs1 fs1Var2 = new fs1(quickJs.getTypeConverters(), "console");
        fs1Var2.m1716b("debug", new vd2(vn1Var, 10));
        fs1Var2.m1716b("log", new vd2(vn1Var, 11));
        fs1Var2.m1716b("info", new vd2(vn1Var, 12));
        fs1Var2.m1716b("warn", new vd2(vn1Var, 13));
        fs1Var2.m1716b("error", new vd2(vn1Var, 14));
        s11.m4662G(quickJs, fs1Var2, -1L);
        for (Map.Entry entry : ((Map) cf2.f1503a.getValue()).entrySet()) {
            quickJs.addModule((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m149c(Object obj) {
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
            return AbstractC0142du.m1165u0((Iterable) obj, null, "[", "]", new C0151e2(1, this, af2.class, "formatLogValue", "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 0, 3), 25);
        }
        return obj instanceof Map ? AbstractC0142du.m1165u0(((Map) obj).entrySet(), null, "{", "}", new xc2(28), 25) : obj.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m150e(vn1 vn1Var, ph2 ph2Var, Object[] objArr) {
        vn1Var.m5738t(ph2Var, AbstractC0460mg.m3101p0(objArr, " ", new C0151e2(1, this, af2.class, "formatLogValue", "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 0, 5), 30));
    }
}
