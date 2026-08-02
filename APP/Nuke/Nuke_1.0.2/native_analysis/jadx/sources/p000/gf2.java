package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 {

    /* JADX INFO: renamed from: a */
    public final String f3489a;

    /* JADX INFO: renamed from: b */
    public final String f3490b;

    /* JADX INFO: renamed from: c */
    public final hf2 f3491c;

    public gf2(String str, String str2, hf2 hf2Var) {
        this.f3489a = str;
        this.f3490b = str2;
        this.f3491c = hf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf2)) {
            return false;
        }
        gf2 gf2Var = (gf2) obj;
        return t11.m5086l(this.f3489a, gf2Var.f3489a) && t11.m5086l(this.f3490b, gf2Var.f3490b) && this.f3491c == gf2Var.f3491c;
    }

    public final int hashCode() {
        String str = this.f3489a;
        return this.f3491c.hashCode() + hk1.m2207f(this.f3490b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ScriptConfigIssue(key=", this.f3489a, ", message=", this.f3490b, ", severity=");
        sbM5696o.append(this.f3491c);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    public /* synthetic */ gf2(String str, String str2) {
        this(str, str2, hf2.f3994i);
    }
}
