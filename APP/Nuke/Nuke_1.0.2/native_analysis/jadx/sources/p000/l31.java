package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l31 {

    /* JADX INFO: renamed from: a */
    public static final gz0 f5905a = qp0.m4247b(nv2.f7346a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    /* JADX INFO: renamed from: a */
    public static final i41 m2793a(Boolean bool) {
        return bool == null ? z31.INSTANCE : new w31(bool, false);
    }

    /* JADX INFO: renamed from: b */
    public static final i41 m2794b(Number number) {
        return number == null ? z31.INSTANCE : new w31(number, false);
    }

    /* JADX INFO: renamed from: c */
    public static final i41 m2795c(String str) {
        return str == null ? z31.INSTANCE : new w31(str, true);
    }

    /* JADX INFO: renamed from: d */
    public static final Boolean m2796d(i41 i41Var) {
        i41Var.getClass();
        String strMo2263a = i41Var.mo2263a();
        String[] strArr = mv2.f6900a;
        strMo2263a.getClass();
        if (strMo2263a.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strMo2263a.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Integer m2797e(i41 i41Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(m2799g(i41Var));
        } catch (h31 unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final Long m2798f(i41 i41Var) {
        i41Var.getClass();
        try {
            return Long.valueOf(m2799g(i41Var));
        } catch (h31 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final long m2799g(i41 i41Var) {
        i41Var.getClass();
        qb2 qb2VarM6111b = xe1.m6111b(u21.f11071d, i41Var.mo2263a());
        String str = (String) qb2VarM6111b.f8879g;
        long jM4122i = qb2VarM6111b.m4122i();
        if (qb2VarM6111b.m4119f() == 10) {
            return jM4122i;
        }
        int i = qb2VarM6111b.f8874b;
        int i2 = i > 0 ? i - 1 : i;
        qb2.m4114m(qb2VarM6111b, vi0.m5691j("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, 4);
        throw null;
    }
}
