package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l31 {
    public static final gz0 a = qp0.b(nv2.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final i41 a(Boolean bool) {
        return bool == null ? z31.INSTANCE : new w31(bool, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final i41 b(Number number) {
        return number == null ? z31.INSTANCE : new w31(number, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final i41 c(String str) {
        return str == null ? z31.INSTANCE : new w31(str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean d(i41 i41Var) {
        i41Var.getClass();
        String strA = i41Var.a();
        String[] strArr = mv2.a;
        strA.getClass();
        if (strA.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strA.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Integer e(i41 i41Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(g(i41Var));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Long f(i41 i41Var) {
        i41Var.getClass();
        try {
            return Long.valueOf(g(i41Var));
        } catch (h31 unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long g(i41 i41Var) {
        i41Var.getClass();
        qb2 qb2VarB = xe1.b(u21.d, i41Var.a());
        String str = (String) qb2VarB.g;
        long jI = qb2VarB.i();
        if (qb2VarB.f() == 10) {
            return jI;
        }
        int i = qb2VarB.b;
        int i2 = i > 0 ? i - 1 : i;
        qb2.m(qb2VarB, vi0.j("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, 4);
        throw null;
    }
}
