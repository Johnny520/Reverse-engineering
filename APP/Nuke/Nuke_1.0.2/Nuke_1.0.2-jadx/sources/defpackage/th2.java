package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class th2 {
    public static final o72 l = new o72("^[a-z][a-z0-9_-]*(?:\\.[a-z][a-z0-9_-]*)+$");
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ri2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public th2(int i, int i2, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, ri2 ri2Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = ri2Var;
        if (i != 1) {
            s.c(vi0.g("Unsupported manifest version: ", i));
            throw null;
        }
        if (i2 != 1) {
            s.c(vi0.g("Unsupported script API version: ", i2));
            throw null;
        }
        if (!l.b(str)) {
            s.c("Script id must contain at least two lowercase dot-separated segments: ".concat(str));
            throw null;
        }
        if (str.length() > 255) {
            s.j("Script id is too long.");
            throw null;
        }
        if (pv2.s0(str2)) {
            s.j("Script name must not be blank.");
            throw null;
        }
        if (str2.length() > 128) {
            s.j("Script name is too long.");
            throw null;
        }
        if (pv2.s0(str3)) {
            s.j("Script version must not be blank.");
            throw null;
        }
        if (str3.length() > 64) {
            s.j("Script version is too long.");
            throw null;
        }
        if (j <= 0) {
            s.j("Script versionCode must be positive.");
            throw null;
        }
        o72 o72Var = oi2.i;
        if (!wv2.W(str4, ".js", false)) {
            s.c("Script entry must be a JavaScript file: ".concat(str4));
            throw null;
        }
        if (str5 != null && str5.length() > 2048) {
            s.j("Script description is too long.");
            throw null;
        }
        if (str6 != null && pv2.s0(str6)) {
            s.j("Script author must not be blank when configured.");
            throw null;
        }
        if (str6 != null && str6.length() > 128) {
            s.j("Script author is too long.");
            throw null;
        }
        if (str7 == null || wv2.W(str7, ".json", false)) {
            return;
        }
        s.c("Script config schema must be a JSON file: ".concat(str7));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ri2 e() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof th2) {
                th2 th2Var = (th2) obj;
                if (this.a == th2Var.a && this.b == th2Var.b && t11.l(this.c, th2Var.c) && t11.l(this.d, th2Var.d) && t11.l(this.e, th2Var.e) && this.f == th2Var.f) {
                    String str = th2Var.g;
                    o72 o72Var = oi2.i;
                    if (this.g.equals(str) && t11.l(this.h, th2Var.h) && t11.l(this.i, th2Var.i)) {
                        String str2 = th2Var.j;
                        String str3 = this.j;
                        if (str3 == null) {
                            zEquals = str2 == null;
                            if (zEquals && this.k.equals(th2Var.k)) {
                            }
                        } else {
                            if (str2 != null) {
                                zEquals = str3.equals(str2);
                            }
                            if (zEquals) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = hk1.c(hk1.f(this.e, hk1.f(this.d, hk1.f(this.c, vi0.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f);
        o72 o72Var = oi2.i;
        int iF = hk1.f(this.g, iC, 31);
        String str = this.h;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return this.k.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        o72 o72Var = oi2.i;
        String str = this.j;
        if (str == null) {
            str = "null";
        }
        StringBuilder sbK = hk1.k("ScriptManifest(manifestVersion=", this.a, this.b, ", apiVersion=", ", id=");
        hk1.o(sbK, this.c, ", name=", this.d, ", version=");
        sbK.append(this.e);
        sbK.append(", versionCode=");
        sbK.append(this.f);
        hk1.o(sbK, ", entry=", this.g, ", description=", this.h);
        hk1.o(sbK, ", author=", this.i, ", configSchema=", str);
        sbK.append(", permissions=");
        sbK.append(this.k);
        sbK.append(")");
        return sbK.toString();
    }
}
