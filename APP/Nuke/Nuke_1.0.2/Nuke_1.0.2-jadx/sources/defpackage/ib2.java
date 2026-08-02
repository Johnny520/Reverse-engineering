package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ib2 {
    public final jb2 a;
    public final jb2 b;
    public final Throwable c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ib2(jb2 jb2Var, ry ryVar, Throwable th) {
        this.a = jb2Var;
        this.b = ryVar;
        this.c = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return t11.l(this.a, ib2Var.a) && t11.l(this.b, ib2Var.b) && t11.l(this.c, ib2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jb2 jb2Var = this.b;
        int iHashCode2 = (iHashCode + (jb2Var == null ? 0 : jb2Var.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r2v0 jb2)
  (wrap:ry:?: CAST (ry) (null ry))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(jb2, ry, java.lang.Throwable):void (m)] (LINE:11) call: ib2.<init>(jb2, ry, java.lang.Throwable):void type: THIS */
    public /* synthetic */ ib2(jb2 jb2Var, Throwable th, int i) {
        this(jb2Var, (ry) null, (i & 4) != 0 ? null : th);
    }
}
