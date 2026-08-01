package p053J3;

import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0844e {
    public static final int $stable = 0;
    private final String message;
    private final String path;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0844e(String str, String str2) {
        AbstractC1665j.m2985e(str2, "message");
        this.path = str;
        this.message = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0844e m1581d(C0844e c0844e, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0844e.path;
        }
        if ((i5 & 2) != 0) {
            str2 = c0844e.message;
        }
        return c0844e.m1584c(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1582a() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1583b() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0844e m1584c(String str, String str2) {
        AbstractC1665j.m2985e(str2, "message");
        return new C0844e(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1585e() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844e)) {
            return false;
        }
        C0844e c0844e = (C0844e) obj;
        return AbstractC1665j.m2981a(this.path, c0844e.path) && AbstractC1665j.m2981a(this.message, c0844e.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1586f() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.path;
        return this.message.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ApiIssue(path=" + this.path + ", message=" + this.message + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (r2v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:4) call: J3.e.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C0844e(String str, String str2, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, str2);
    }
}
