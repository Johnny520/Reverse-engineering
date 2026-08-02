package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ot {
    public static final int $stable = 8;
    private final nt environment;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:nt:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null nt) : (r3v0 nt))
 A[MD:(java.lang.String, nt):void (m)] (LINE:12) call: ot.<init>(java.lang.String, nt):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ot(String str, nt ntVar, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : ntVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ot d(ot otVar, String str, nt ntVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otVar.message;
        }
        if ((i & 2) != 0) {
            ntVar = otVar.environment;
        }
        return otVar.c(str, ntVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nt b() {
        return this.environment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ot c(String str, nt ntVar) {
        return new ot(str, ntVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nt e() {
        return this.environment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return t11.l(this.message, otVar.message) && t11.l(this.environment, otVar.environment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        nt ntVar = this.environment;
        return iHashCode + (ntVar != null ? ntVar.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ClientReportRequest(message=" + this.message + ", environment=" + this.environment + ")";
    }

    public ot(String str, nt ntVar) {
        this.message = str;
        this.environment = ntVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public ot() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
