package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y70 {

    /* JADX INFO: renamed from: a */
    public final String f13327a;

    /* JADX INFO: renamed from: b */
    public final String f13328b;

    /* JADX INFO: renamed from: c */
    public final String f13329c;

    /* JADX INFO: renamed from: d */
    public final hx2 f13330d;

    public y70(String str) {
        str.getClass();
        this.f13330d = new hx2(new C0159ea(7, this));
        int iM4004q0 = pv2.m4004q0(str, "->", 0, false, 6);
        int iM4004q02 = pv2.m4004q0(str, ":", iM4004q0 + 1, false, 4);
        if (iM4004q0 == -1 || iM4004q02 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.f13327a = i80.m2300c(str.substring(0, iM4004q0));
        this.f13328b = str.substring(iM4004q0 + 2, iM4004q02);
        this.f13329c = i80.m2300c(str.substring(iM4004q02 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj;
        return t11.m5086l(this.f13327a, y70Var.f13327a) && t11.m5086l(this.f13328b, y70Var.f13328b) && t11.m5086l(this.f13329c, y70Var.f13329c);
    }

    public final int hashCode() {
        return this.f13329c.hashCode() + (this.f13328b.hashCode() * 31) + (this.f13327a.hashCode() * 31);
    }

    public final String toString() {
        return i80.m2302e(this.f13327a) + "->" + this.f13328b + ":" + ((String) this.f13330d.getValue());
    }
}
