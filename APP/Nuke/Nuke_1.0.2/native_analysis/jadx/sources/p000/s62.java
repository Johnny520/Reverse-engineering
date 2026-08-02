package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s62 {

    /* JADX INFO: renamed from: a */
    public final String f9944a;

    /* JADX INFO: renamed from: b */
    public final String f9945b;

    /* JADX INFO: renamed from: c */
    public final String f9946c;

    /* JADX INFO: renamed from: d */
    public final boolean f9947d;

    public s62(String str, String str2, String str3, boolean z) {
        str2.getClass();
        this.f9944a = str;
        this.f9945b = str2;
        this.f9946c = str3;
        this.f9947d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s62)) {
            return false;
        }
        s62 s62Var = (s62) obj;
        return this.f9944a.equals(s62Var.f9944a) && t11.m5086l(this.f9945b, s62Var.f9945b) && this.f9946c.equals(s62Var.f9946c) && this.f9947d == s62Var.f9947d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9947d) + hk1.m2207f(this.f9946c, hk1.m2207f(this.f9945b, this.f9944a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("RedPacketContact(wxId=", this.f9944a, ", displayName=", this.f9945b, ", avatarUrl=");
        sbM5696o.append(this.f9946c);
        sbM5696o.append(", isGroup=");
        sbM5696o.append(this.f9947d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
