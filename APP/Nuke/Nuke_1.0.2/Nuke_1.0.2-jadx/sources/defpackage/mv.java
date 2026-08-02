package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mv {
    public final Object a;
    public final ip b;
    public final nn0 c;
    public final Object d;
    public final Throwable e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r3v0 java.lang.Object)
  (wrap:ip:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null ip) : (r4v0 ip))
  (wrap:nn0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r7v0 int) & (4 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null nn0) : (r5v0 nn0))
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000b: ARITH (r7v0 int) & (16 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (null java.lang.Throwable) : (r6v0 java.lang.Throwable))
 A[MD:(java.lang.Object, ip, nn0, java.lang.Object, java.lang.Throwable):void (m)] (LINE:20) call: mv.<init>(java.lang.Object, ip, nn0, java.lang.Object, java.lang.Throwable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mv(Object obj, ip ipVar, nn0 nn0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ipVar, (i & 4) != 0 ? null : nn0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static mv a(mv mvVar, ip ipVar, Throwable th, int i) {
        Object obj = mvVar.a;
        if ((i & 2) != 0) {
            ipVar = mvVar.b;
        }
        ip ipVar2 = ipVar;
        nn0 nn0Var = mvVar.c;
        Object obj2 = mvVar.d;
        if ((i & 16) != 0) {
            th = mvVar.e;
        }
        return new mv(obj, ipVar2, nn0Var, obj2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv)) {
            return false;
        }
        mv mvVar = (mv) obj;
        return t11.l(this.a, mvVar.a) && t11.l(this.b, mvVar.b) && t11.l(this.c, mvVar.c) && t11.l(this.d, mvVar.d) && t11.l(this.e, mvVar.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ip ipVar = this.b;
        int iHashCode2 = (iHashCode + (ipVar == null ? 0 : ipVar.hashCode())) * 31;
        nn0 nn0Var = this.c;
        int iHashCode3 = (iHashCode2 + (nn0Var == null ? 0 : nn0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public mv(Object obj, ip ipVar, nn0 nn0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ipVar;
        this.c = nn0Var;
        this.d = obj2;
        this.e = th;
    }
}
