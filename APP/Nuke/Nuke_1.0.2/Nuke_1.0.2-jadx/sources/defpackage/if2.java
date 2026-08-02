package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class if2 {
    public final uf2 a;
    public final List b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Integer f;
    public final Integer g;
    public final String h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public if2(uf2 uf2Var, List list, Double d, Double d2, Double d3, Integer num, Integer num2, String str) {
        this.a = uf2Var;
        this.b = list;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = num;
        this.g = num2;
        this.h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2Var = (if2) obj;
        return this.a == if2Var.a && this.b.equals(if2Var.b) && t11.l(this.c, if2Var.c) && t11.l(this.d, if2Var.d) && t11.l(this.e, if2Var.e) && t11.l(this.f, if2Var.f) && t11.l(this.g, if2Var.g) && t11.l(this.h, if2Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Double d = this.c;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.e;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.h;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptConfigItems(type=" + this.a + ", options=" + this.b + ", minimum=" + this.c + ", maximum=" + this.d + ", multipleOf=" + this.e + ", minLength=" + this.f + ", maxLength=" + this.g + ", format=" + this.h + ")";
    }
}
