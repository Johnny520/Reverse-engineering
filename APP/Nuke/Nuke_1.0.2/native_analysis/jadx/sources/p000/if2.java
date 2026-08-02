package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class if2 {

    /* JADX INFO: renamed from: a */
    public final uf2 f4591a;

    /* JADX INFO: renamed from: b */
    public final List f4592b;

    /* JADX INFO: renamed from: c */
    public final Double f4593c;

    /* JADX INFO: renamed from: d */
    public final Double f4594d;

    /* JADX INFO: renamed from: e */
    public final Double f4595e;

    /* JADX INFO: renamed from: f */
    public final Integer f4596f;

    /* JADX INFO: renamed from: g */
    public final Integer f4597g;

    /* JADX INFO: renamed from: h */
    public final String f4598h;

    public if2(uf2 uf2Var, List list, Double d, Double d2, Double d3, Integer num, Integer num2, String str) {
        this.f4591a = uf2Var;
        this.f4592b = list;
        this.f4593c = d;
        this.f4594d = d2;
        this.f4595e = d3;
        this.f4596f = num;
        this.f4597g = num2;
        this.f4598h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2Var = (if2) obj;
        return this.f4591a == if2Var.f4591a && this.f4592b.equals(if2Var.f4592b) && t11.m5086l(this.f4593c, if2Var.f4593c) && t11.m5086l(this.f4594d, if2Var.f4594d) && t11.m5086l(this.f4595e, if2Var.f4595e) && t11.m5086l(this.f4596f, if2Var.f4596f) && t11.m5086l(this.f4597g, if2Var.f4597g) && t11.m5086l(this.f4598h, if2Var.f4598h);
    }

    public final int hashCode() {
        int iHashCode = (this.f4592b.hashCode() + (this.f4591a.hashCode() * 31)) * 31;
        Double d = this.f4593c;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f4594d;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f4595e;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f4596f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4597g;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f4598h;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ScriptConfigItems(type=" + this.f4591a + ", options=" + this.f4592b + ", minimum=" + this.f4593c + ", maximum=" + this.f4594d + ", multipleOf=" + this.f4595e + ", minLength=" + this.f4596f + ", maxLength=" + this.f4597g + ", format=" + this.f4598h + ")";
    }
}
