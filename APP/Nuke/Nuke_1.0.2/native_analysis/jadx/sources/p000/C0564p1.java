package p000;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0564p1 {

    /* JADX INFO: renamed from: a */
    public final String f7920a;

    /* JADX INFO: renamed from: b */
    public final String f7921b;

    /* JADX INFO: renamed from: c */
    public final String f7922c;

    public C0564p1(String str, String str2, String str3) {
        str.getClass();
        this.f7920a = str;
        this.f7921b = str2;
        this.f7922c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0564p1)) {
            return false;
        }
        C0564p1 c0564p1 = (C0564p1) obj;
        return t11.m5086l(this.f7920a, c0564p1.f7920a) && this.f7921b.equals(c0564p1.f7921b) && this.f7922c.equals(c0564p1.f7922c);
    }

    public final int hashCode() {
        return this.f7922c.hashCode() + hk1.m2207f(this.f7921b, this.f7920a.hashCode() * 31, 31);
    }

    public final String toString() {
        return hk1.m2211j(vi0.m5696o("AboutDeveloper(name=", this.f7920a, ", description=", this.f7921b, ", githubUsername="), this.f7922c, ")");
    }
}
