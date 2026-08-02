package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qs1 {

    /* JADX INFO: renamed from: a */
    public final String f9152a;

    /* JADX INFO: renamed from: b */
    public final String f9153b;

    /* JADX INFO: renamed from: c */
    public final String f9154c;

    /* JADX INFO: renamed from: d */
    public final String f9155d;

    public qs1(String str, String str2, String str3, String str4) {
        this.f9152a = str;
        this.f9153b = str2;
        this.f9154c = str3;
        this.f9155d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs1)) {
            return false;
        }
        qs1 qs1Var = (qs1) obj;
        return this.f9152a.equals(qs1Var.f9152a) && this.f9153b.equals(qs1Var.f9153b) && this.f9154c.equals(qs1Var.f9154c) && this.f9155d.equals(qs1Var.f9155d);
    }

    public final int hashCode() {
        return this.f9155d.hashCode() + hk1.m2207f(this.f9154c, hk1.m2207f(this.f9153b, this.f9152a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("OfficialAccountInfoBean(wxId=", this.f9152a, ", customWxId=", this.f9153b, ", nickname=");
        sbM5696o.append(this.f9154c);
        sbM5696o.append(", avatarUrl=");
        sbM5696o.append(this.f9155d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
