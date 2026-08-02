package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vf2 {

    /* JADX INFO: renamed from: a */
    public final wf2 f11931a;

    /* JADX INFO: renamed from: b */
    public final String f11932b;

    /* JADX INFO: renamed from: c */
    public final String f11933c;

    /* JADX INFO: renamed from: d */
    public final Integer f11934d;

    /* JADX INFO: renamed from: e */
    public final Integer f11935e;

    public vf2(wf2 wf2Var, String str, String str2, Integer num, Integer num2) {
        this.f11931a = wf2Var;
        this.f11932b = str;
        this.f11933c = str2;
        this.f11934d = num;
        this.f11935e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf2)) {
            return false;
        }
        vf2 vf2Var = (vf2) obj;
        return this.f11931a == vf2Var.f11931a && t11.m5086l(this.f11932b, vf2Var.f11932b) && t11.m5086l(this.f11933c, vf2Var.f11933c) && t11.m5086l(this.f11934d, vf2Var.f11934d) && t11.m5086l(this.f11935e, vf2Var.f11935e);
    }

    public final int hashCode() {
        int iHashCode = this.f11931a.hashCode() * 31;
        String str = this.f11932b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11933c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f11934d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f11935e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ScriptConfigUi(widget=" + this.f11931a + ", placeholder=" + this.f11932b + ", unit=" + this.f11933c + ", minLines=" + this.f11934d + ", maxLines=" + this.f11935e + ")";
    }
}
