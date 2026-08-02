package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b13 {

    /* JADX INFO: renamed from: a */
    public final lt2 f524a;

    /* JADX INFO: renamed from: b */
    public final lt2 f525b;

    /* JADX INFO: renamed from: c */
    public final lt2 f526c;

    /* JADX INFO: renamed from: d */
    public final lt2 f527d;

    public b13(lt2 lt2Var, lt2 lt2Var2, lt2 lt2Var3, lt2 lt2Var4) {
        this.f524a = lt2Var;
        this.f525b = lt2Var2;
        this.f526c = lt2Var3;
        this.f527d = lt2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b13)) {
            return false;
        }
        b13 b13Var = (b13) obj;
        return t11.m5086l(this.f524a, b13Var.f524a) && t11.m5086l(this.f525b, b13Var.f525b) && t11.m5086l(this.f526c, b13Var.f526c) && t11.m5086l(this.f527d, b13Var.f527d);
    }

    public final int hashCode() {
        lt2 lt2Var = this.f524a;
        int iHashCode = (lt2Var != null ? lt2Var.hashCode() : 0) * 31;
        lt2 lt2Var2 = this.f525b;
        int iHashCode2 = (iHashCode + (lt2Var2 != null ? lt2Var2.hashCode() : 0)) * 31;
        lt2 lt2Var3 = this.f526c;
        int iHashCode3 = (iHashCode2 + (lt2Var3 != null ? lt2Var3.hashCode() : 0)) * 31;
        lt2 lt2Var4 = this.f527d;
        return iHashCode3 + (lt2Var4 != null ? lt2Var4.hashCode() : 0);
    }
}
