package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vf2 {
    public final wf2 a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vf2(wf2 wf2Var, String str, String str2, Integer num, Integer num2) {
        this.a = wf2Var;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf2)) {
            return false;
        }
        vf2 vf2Var = (vf2) obj;
        return this.a == vf2Var.a && t11.l(this.b, vf2Var.b) && t11.l(this.c, vf2Var.c) && t11.l(this.d, vf2Var.d) && t11.l(this.e, vf2Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptConfigUi(widget=" + this.a + ", placeholder=" + this.b + ", unit=" + this.c + ", minLines=" + this.d + ", maxLines=" + this.e + ")";
    }
}
