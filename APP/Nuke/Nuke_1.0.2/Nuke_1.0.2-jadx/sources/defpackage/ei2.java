package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ei2 {
    public final d41 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ei2(d41 d41Var) {
        this.a = d41Var;
        if (pv2.s0("text")) {
            s.j("Message segment type must not be blank.");
            throw null;
        }
        if (d41Var.containsKey("type")) {
            s.j("Message segment fields must not redefine type.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei2) && this.a.equals(((ei2) obj).a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.h.hashCode() + 110256243;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptMessageSegment(type=text, fields=" + this.a + ")";
    }
}
