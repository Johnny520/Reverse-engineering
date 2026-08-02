package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hh2 {

    /* JADX INFO: renamed from: a */
    public final String f4020a;

    /* JADX INFO: renamed from: b */
    public final String f4021b;

    /* JADX INFO: renamed from: c */
    public final String f4022c;

    public hh2(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f4020a = str;
        this.f4021b = str2;
        this.f4022c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh2)) {
            return false;
        }
        hh2 hh2Var = (hh2) obj;
        return t11.m5086l(this.f4020a, hh2Var.f4020a) && t11.m5086l(this.f4021b, hh2Var.f4021b) && this.f4022c.equals(hh2Var.f4022c);
    }

    public final int hashCode() {
        return this.f4022c.hashCode() + hk1.m2207f(this.f4021b, this.f4020a.hashCode() * 31, 31);
    }

    public final String toString() {
        return hk1.m2211j(vi0.m5696o("ScriptHostObjectContext(scriptId=", this.f4020a, ", scriptName=", this.f4021b, ", className="), this.f4022c, ")");
    }
}
