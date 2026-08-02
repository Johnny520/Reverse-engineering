package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ai2 {

    /* JADX INFO: renamed from: a */
    public final String f213a;

    /* JADX INFO: renamed from: b */
    public final String f214b;

    /* JADX INFO: renamed from: c */
    public final String f215c;

    /* JADX INFO: renamed from: d */
    public final String f216d;

    /* JADX INFO: renamed from: e */
    public final Long f217e;

    /* JADX INFO: renamed from: f */
    public final d41 f218f;

    public ai2(String str, String str2, String str3, String str4, Long l, d41 d41Var) {
        this.f213a = str;
        this.f214b = str2;
        this.f215c = str3;
        this.f216d = str4;
        this.f217e = l;
        this.f218f = d41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai2)) {
            return false;
        }
        ai2 ai2Var = (ai2) obj;
        return this.f213a.equals(ai2Var.f213a) && this.f214b.equals(ai2Var.f214b) && this.f215c.equals(ai2Var.f215c) && this.f216d.equals(ai2Var.f216d) && t11.m5086l(this.f217e, ai2Var.f217e) && this.f218f.equals(ai2Var.f218f);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f216d, hk1.m2207f(this.f215c, hk1.m2207f(this.f214b, this.f213a.hashCode() * 31, 31), 31), 31);
        Long l = this.f217e;
        return this.f218f.f1861h.hashCode() + ((iM2207f + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ScriptMediaRef(platform=", this.f213a, ", accountId=", this.f214b, ", id=");
        hk1.m2216o(sbM5696o, this.f215c, ", kind=", this.f216d, ", expiresAt=");
        sbM5696o.append(this.f217e);
        sbM5696o.append(", metadata=");
        sbM5696o.append(this.f218f);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
