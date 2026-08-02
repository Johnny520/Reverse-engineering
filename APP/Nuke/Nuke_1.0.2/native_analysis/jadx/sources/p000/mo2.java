package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mo2 implements oo2 {

    /* JADX INFO: renamed from: a */
    public final String f6737a;

    /* JADX INFO: renamed from: b */
    public final String f6738b;

    public mo2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6737a = str;
        this.f6738b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return t11.m5086l(this.f6737a, mo2Var.f6737a) && t11.m5086l(this.f6738b, mo2Var.f6738b);
    }

    public final int hashCode() {
        return this.f6738b.hashCode() + (this.f6737a.hashCode() * 31);
    }

    public final String toString() {
        return vi0.m5692k("Text(talker=", this.f6737a, ", content=", this.f6738b, ")");
    }
}
