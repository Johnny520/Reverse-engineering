package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 {
    public final String a;
    public final String b;
    public final hf2 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gf2(String str, String str2, hf2 hf2Var) {
        this.a = str;
        this.b = str2;
        this.c = hf2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf2)) {
            return false;
        }
        gf2 gf2Var = (gf2) obj;
        return t11.l(this.a, gf2Var.a) && t11.l(this.b, gf2Var.b) && this.c == gf2Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + hk1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("ScriptConfigIssue(key=", this.a, ", message=", this.b, ", severity=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (r3v0 java.lang.String), (wrap:hf2:0x0000: SGET  A[WRAPPED] (LINE:11) hf2.i hf2) A[MD:(java.lang.String, java.lang.String, hf2):void (m)] (LINE:12) call: gf2.<init>(java.lang.String, java.lang.String, hf2):void type: THIS */
    public /* synthetic */ gf2(String str, String str2) {
        this(str, str2, hf2.i);
    }
}
