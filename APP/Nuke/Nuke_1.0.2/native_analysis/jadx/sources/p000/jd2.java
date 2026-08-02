package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jd2 {

    /* JADX INFO: renamed from: a */
    public final String f4986a;

    /* JADX INFO: renamed from: b */
    public final String f4987b;

    /* JADX INFO: renamed from: c */
    public final String f4988c;

    public jd2(String str, String str2, String str3) {
        this.f4986a = str;
        this.f4987b = str2;
        this.f4988c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd2)) {
            return false;
        }
        jd2 jd2Var = (jd2) obj;
        return t11.m5086l(this.f4986a, jd2Var.f4986a) && this.f4987b.equals(jd2Var.f4987b) && this.f4988c.equals(jd2Var.f4988c);
    }

    public final int hashCode() {
        String str = this.f4986a;
        return this.f4988c.hashCode() + hk1.m2207f(this.f4987b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return hk1.m2211j(vi0.m5696o("ScriptAlertRequest(title=", this.f4986a, ", message=", this.f4987b, ", buttonText="), this.f4988c, ")");
    }
}
