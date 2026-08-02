package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jc3 {

    /* JADX INFO: renamed from: a */
    public final String f4964a;

    /* JADX INFO: renamed from: b */
    public final String f4965b;

    /* JADX INFO: renamed from: c */
    public final String f4966c;

    /* JADX INFO: renamed from: d */
    public final sc3 f4967d;

    public jc3(String str, String str2, String str3, sc3 sc3Var) {
        str2.getClass();
        this.f4964a = str;
        this.f4965b = str2;
        this.f4966c = str3;
        this.f4967d = sc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3)) {
            return false;
        }
        jc3 jc3Var = (jc3) obj;
        return this.f4964a.equals(jc3Var.f4964a) && t11.m5086l(this.f4965b, jc3Var.f4965b) && this.f4966c.equals(jc3Var.f4966c) && this.f4967d == jc3Var.f4967d;
    }

    public final int hashCode() {
        return this.f4967d.hashCode() + hk1.m2207f(this.f4966c, hk1.m2207f(this.f4965b, this.f4964a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("WeChatContact(wxId=", this.f4964a, ", displayName=", this.f4965b, ", avatarUrl=");
        sbM5696o.append(this.f4966c);
        sbM5696o.append(", type=");
        sbM5696o.append(this.f4967d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
