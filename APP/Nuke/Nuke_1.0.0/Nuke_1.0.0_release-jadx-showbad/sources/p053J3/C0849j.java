package p053J3;

import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0849j {
    public static final int $stable = 8;
    private final C0847h environment;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C0849j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0849j m1707d(C0849j c0849j, String str, C0847h c0847h, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0849j.message;
        }
        if ((i5 & 2) != 0) {
            c0847h = c0849j.environment;
        }
        return c0849j.m1710c(str, c0847h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1708a() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0847h m1709b() {
        return this.environment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0849j m1710c(String str, C0847h c0847h) {
        return new C0849j(str, c0847h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0847h m1711e() {
        return this.environment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849j)) {
            return false;
        }
        C0849j c0849j = (C0849j) obj;
        return AbstractC1665j.m2981a(this.message, c0849j.message) && AbstractC1665j.m2981a(this.environment, c0849j.environment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1712f() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0847h c0847h = this.environment;
        return iHashCode + (c0847h != null ? c0847h.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ClientReportRequest(message=" + this.message + ", environment=" + this.environment + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0849j(String str, C0847h c0847h) {
        this.message = str;
        this.environment = c0847h;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:J3.h:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null J3.h) : (r3v0 J3.h))
 A[MD:(java.lang.String, J3.h):void (m)] (LINE:5) call: J3.j.<init>(java.lang.String, J3.h):void type: THIS */
    public /* synthetic */ C0849j(String str, C0847h c0847h, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : c0847h);
    }
}
