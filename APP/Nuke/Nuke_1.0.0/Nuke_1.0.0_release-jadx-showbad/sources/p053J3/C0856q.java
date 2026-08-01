package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0856q {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: iv */
    private final String f2696iv;
    private final String kid;
    private final String payload;
    private final String tag;

    /* JADX INFO: renamed from: v */
    private final int f2697v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0856q(int i5, String str, String str2, String str3, String str4) {
        AbstractC1665j.m2985e(str2, "iv");
        AbstractC1665j.m2985e(str3, "payload");
        AbstractC1665j.m2985e(str4, "tag");
        this.f2697v = i5;
        this.kid = str;
        this.f2696iv = str2;
        this.payload = str3;
        this.tag = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0856q m1798g(C0856q c0856q, int i5, String str, String str2, String str3, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = c0856q.f2697v;
        }
        if ((i6 & 2) != 0) {
            str = c0856q.kid;
        }
        if ((i6 & 4) != 0) {
            str2 = c0856q.f2696iv;
        }
        if ((i6 & 8) != 0) {
            str3 = c0856q.payload;
        }
        if ((i6 & 16) != 0) {
            str4 = c0856q.tag;
        }
        String str5 = str4;
        String str6 = str2;
        return c0856q.m1804f(i5, str, str6, str3, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1799a() {
        return this.f2697v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1800b() {
        return this.kid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1801c() {
        return this.f2696iv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1802d() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1803e() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0856q)) {
            return false;
        }
        C0856q c0856q = (C0856q) obj;
        return this.f2697v == c0856q.f2697v && AbstractC1665j.m2981a(this.kid, c0856q.kid) && AbstractC1665j.m2981a(this.f2696iv, c0856q.f2696iv) && AbstractC1665j.m2981a(this.payload, c0856q.payload) && AbstractC1665j.m2981a(this.tag, c0856q.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0856q m1804f(int i5, String str, String str2, String str3, String str4) {
        AbstractC1665j.m2985e(str2, "iv");
        AbstractC1665j.m2985e(str3, "payload");
        AbstractC1665j.m2985e(str4, "tag");
        return new C0856q(i5, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m1805h() {
        return this.f2696iv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f2697v) * 31;
        String str = this.kid;
        return this.tag.hashCode() + AbstractC0231b.m394e(AbstractC0231b.m394e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2696iv), 31, this.payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m1806i() {
        return this.kid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m1807j() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1808k() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m1809l() {
        return this.f2697v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        int i5 = this.f2697v;
        String str = this.kid;
        String str2 = this.f2696iv;
        String str3 = this.payload;
        String str4 = this.tag;
        StringBuilder sb = new StringBuilder("EncryptedPayload(v=");
        sb.append(i5);
        sb.append(", kid=");
        sb.append(str);
        sb.append(", iv=");
        AbstractC3202a.m5468c(sb, str2, ", payload=", str3, ", tag=");
        return AbstractC0231b.m403n(sb, str4, ")");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: J3.q.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C0856q(int i5, String str, String str2, String str3, String str4, int i6, AbstractC1661f abstractC1661f) {
        this((i6 & 1) != 0 ? 3 : i5, (i6 & 2) != 0 ? null : str, str2, str3, str4);
    }
}
