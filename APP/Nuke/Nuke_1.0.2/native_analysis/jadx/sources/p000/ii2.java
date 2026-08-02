package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ii2 {

    /* JADX INFO: renamed from: a */
    public final String f4645a;

    /* JADX INFO: renamed from: b */
    public final String f4646b;

    public ii2(String str, String str2) {
        str.getClass();
        this.f4645a = str;
        this.f4646b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii2)) {
            return false;
        }
        ii2 ii2Var = (ii2) obj;
        String str = ii2Var.f4645a;
        o72 o72Var = oi2.f7689i;
        return t11.m5086l(this.f4645a, str) && this.f4646b.equals(ii2Var.f4646b);
    }

    public final int hashCode() {
        o72 o72Var = oi2.f7689i;
        return this.f4646b.hashCode() + (this.f4645a.hashCode() * 31);
    }

    public final String toString() {
        o72 o72Var = oi2.f7689i;
        return vi0.m5692k("ScriptModule(path=", this.f4645a, ", code=", this.f4646b, ")");
    }
}
