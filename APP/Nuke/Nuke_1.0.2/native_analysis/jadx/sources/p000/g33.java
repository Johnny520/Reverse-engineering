package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g33 {

    /* JADX INFO: renamed from: a */
    public final String f3298a;

    /* JADX INFO: renamed from: b */
    public final String f3299b;

    /* JADX INFO: renamed from: c */
    public final String f3300c;

    /* JADX INFO: renamed from: d */
    public final boolean f3301d;

    public g33(String str, String str2, String str3, boolean z) {
        str2.getClass();
        this.f3298a = str;
        this.f3299b = str2;
        this.f3300c = str3;
        this.f3301d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g33)) {
            return false;
        }
        g33 g33Var = (g33) obj;
        return this.f3298a.equals(g33Var.f3298a) && t11.m5086l(this.f3299b, g33Var.f3299b) && this.f3300c.equals(g33Var.f3300c) && this.f3301d == g33Var.f3301d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3301d) + hk1.m2207f(this.f3300c, hk1.m2207f(this.f3299b, this.f3298a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("TransferContact(wxId=", this.f3298a, ", displayName=", this.f3299b, ", avatarUrl=");
        sbM5696o.append(this.f3300c);
        sbM5696o.append(", isGroup=");
        sbM5696o.append(this.f3301d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
