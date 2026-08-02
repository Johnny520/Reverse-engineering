package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class th2 {

    /* JADX INFO: renamed from: l */
    public static final o72 f10771l = new o72("^[a-z][a-z0-9_-]*(?:\\.[a-z][a-z0-9_-]*)+$");

    /* JADX INFO: renamed from: a */
    public final int f10772a;

    /* JADX INFO: renamed from: b */
    public final int f10773b;

    /* JADX INFO: renamed from: c */
    public final String f10774c;

    /* JADX INFO: renamed from: d */
    public final String f10775d;

    /* JADX INFO: renamed from: e */
    public final String f10776e;

    /* JADX INFO: renamed from: f */
    public final long f10777f;

    /* JADX INFO: renamed from: g */
    public final String f10778g;

    /* JADX INFO: renamed from: h */
    public final String f10779h;

    /* JADX INFO: renamed from: i */
    public final String f10780i;

    /* JADX INFO: renamed from: j */
    public final String f10781j;

    /* JADX INFO: renamed from: k */
    public final ri2 f10782k;

    public th2(int i, int i2, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, ri2 ri2Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f10772a = i;
        this.f10773b = i2;
        this.f10774c = str;
        this.f10775d = str2;
        this.f10776e = str3;
        this.f10777f = j;
        this.f10778g = str4;
        this.f10779h = str5;
        this.f10780i = str6;
        this.f10781j = str7;
        this.f10782k = ri2Var;
        if (i != 1) {
            C0676s.m4645c(vi0.m5688g("Unsupported manifest version: ", i));
            throw null;
        }
        if (i2 != 1) {
            C0676s.m4645c(vi0.m5688g("Unsupported script API version: ", i2));
            throw null;
        }
        if (!f10771l.m3539b(str)) {
            C0676s.m4645c("Script id must contain at least two lowercase dot-separated segments: ".concat(str));
            throw null;
        }
        if (str.length() > 255) {
            C0676s.m4651j("Script id is too long.");
            throw null;
        }
        if (pv2.m4006s0(str2)) {
            C0676s.m4651j("Script name must not be blank.");
            throw null;
        }
        if (str2.length() > 128) {
            C0676s.m4651j("Script name is too long.");
            throw null;
        }
        if (pv2.m4006s0(str3)) {
            C0676s.m4651j("Script version must not be blank.");
            throw null;
        }
        if (str3.length() > 64) {
            C0676s.m4651j("Script version is too long.");
            throw null;
        }
        if (j <= 0) {
            C0676s.m4651j("Script versionCode must be positive.");
            throw null;
        }
        o72 o72Var = oi2.f7689i;
        if (!wv2.m6005W(str4, ".js", false)) {
            C0676s.m4645c("Script entry must be a JavaScript file: ".concat(str4));
            throw null;
        }
        if (str5 != null && str5.length() > 2048) {
            C0676s.m4651j("Script description is too long.");
            throw null;
        }
        if (str6 != null && pv2.m4006s0(str6)) {
            C0676s.m4651j("Script author must not be blank when configured.");
            throw null;
        }
        if (str6 != null && str6.length() > 128) {
            C0676s.m4651j("Script author is too long.");
            throw null;
        }
        if (str7 == null || wv2.m6005W(str7, ".json", false)) {
            return;
        }
        C0676s.m4645c("Script config schema must be a JSON file: ".concat(str7));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final String m5263a() {
        return this.f10781j;
    }

    /* JADX INFO: renamed from: b */
    public final String m5264b() {
        return this.f10779h;
    }

    /* JADX INFO: renamed from: c */
    public final String m5265c() {
        return this.f10774c;
    }

    /* JADX INFO: renamed from: d */
    public final String m5266d() {
        return this.f10775d;
    }

    /* JADX INFO: renamed from: e */
    public final ri2 m5267e() {
        return this.f10782k;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof th2) {
                th2 th2Var = (th2) obj;
                if (this.f10772a == th2Var.f10772a && this.f10773b == th2Var.f10773b && t11.m5086l(this.f10774c, th2Var.f10774c) && t11.m5086l(this.f10775d, th2Var.f10775d) && t11.m5086l(this.f10776e, th2Var.f10776e) && this.f10777f == th2Var.f10777f) {
                    String str = th2Var.f10778g;
                    o72 o72Var = oi2.f7689i;
                    if (this.f10778g.equals(str) && t11.m5086l(this.f10779h, th2Var.f10779h) && t11.m5086l(this.f10780i, th2Var.f10780i)) {
                        String str2 = th2Var.f10781j;
                        String str3 = this.f10781j;
                        if (str3 == null) {
                            zEquals = str2 == null;
                            if (zEquals && this.f10782k.equals(th2Var.f10782k)) {
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

    /* JADX INFO: renamed from: f */
    public final String m5268f() {
        return this.f10776e;
    }

    public final int hashCode() {
        int iM2204c = hk1.m2204c(hk1.m2207f(this.f10776e, hk1.m2207f(this.f10775d, hk1.m2207f(this.f10774c, vi0.m5685d(this.f10773b, Integer.hashCode(this.f10772a) * 31, 31), 31), 31), 31), 31, this.f10777f);
        o72 o72Var = oi2.f7689i;
        int iM2207f = hk1.m2207f(this.f10778g, iM2204c, 31);
        String str = this.f10779h;
        int iHashCode = (iM2207f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10780i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10781j;
        return this.f10782k.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        o72 o72Var = oi2.f7689i;
        String str = this.f10781j;
        if (str == null) {
            str = "null";
        }
        StringBuilder sbM2212k = hk1.m2212k("ScriptManifest(manifestVersion=", this.f10772a, this.f10773b, ", apiVersion=", ", id=");
        hk1.m2216o(sbM2212k, this.f10774c, ", name=", this.f10775d, ", version=");
        sbM2212k.append(this.f10776e);
        sbM2212k.append(", versionCode=");
        sbM2212k.append(this.f10777f);
        hk1.m2216o(sbM2212k, ", entry=", this.f10778g, ", description=", this.f10779h);
        hk1.m2216o(sbM2212k, ", author=", this.f10780i, ", configSchema=", str);
        sbM2212k.append(", permissions=");
        sbM2212k.append(this.f10782k);
        sbM2212k.append(")");
        return sbM2212k.toString();
    }
}
