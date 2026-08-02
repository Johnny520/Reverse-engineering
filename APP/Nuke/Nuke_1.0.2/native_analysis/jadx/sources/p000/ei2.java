package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ei2 {

    /* JADX INFO: renamed from: a */
    public final d41 f2457a;

    public ei2(d41 d41Var) {
        this.f2457a = d41Var;
        if (pv2.m4006s0("text")) {
            C0676s.m4651j("Message segment type must not be blank.");
            throw null;
        }
        if (d41Var.containsKey("type")) {
            C0676s.m4651j("Message segment fields must not redefine type.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei2) && this.f2457a.equals(((ei2) obj).f2457a);
    }

    public final int hashCode() {
        return this.f2457a.f1861h.hashCode() + 110256243;
    }

    public final String toString() {
        return "ScriptMessageSegment(type=text, fields=" + this.f2457a + ")";
    }
}
