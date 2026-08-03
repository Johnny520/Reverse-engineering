package p078f9;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: f9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1096g {

    /* JADX INFO: renamed from: a */
    public final boolean f3521a;

    /* JADX INFO: renamed from: b */
    public final boolean f3522b;

    /* JADX INFO: renamed from: c */
    public final long f3523c;

    /* JADX INFO: renamed from: d */
    public final boolean f3524d;

    /* JADX INFO: renamed from: e */
    public final String f3525e;

    /* JADX INFO: renamed from: f */
    public final String f3526f;

    /* JADX INFO: renamed from: g */
    public final String f3527g;

    /* JADX INFO: renamed from: h */
    public final String f3528h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1096g(long j3, String str, String str2, String str3, String str4, boolean z9, boolean z10, boolean z11) {
        this.f3521a = z9;
        this.f3522b = z10;
        this.f3523c = j3;
        this.f3524d = z11;
        this.f3525e = str;
        this.f3526f = str2;
        this.f3527g = str3;
        this.f3528h = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1096g)) {
            return false;
        }
        C1096g c1096g = (C1096g) obj;
        return this.f3521a == c1096g.f3521a && this.f3522b == c1096g.f3522b && this.f3523c == c1096g.f3523c && this.f3524d == c1096g.f3524d && AbstractC1416l.m3825a(this.f3525e, c1096g.f3525e) && AbstractC1416l.m3825a(this.f3526f, c1096g.f3526f) && AbstractC1416l.m3825a(this.f3527g, c1096g.f3527g) && AbstractC1416l.m3825a(this.f3528h, c1096g.f3528h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3528h.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2243f(AbstractC0921a.m2245h(Boolean.hashCode(this.f3521a) * 31, 31, this.f3522b), 31, this.f3523c), 31, this.f3524d), 31, this.f3525e), 31, this.f3526f), 31, this.f3527g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditMessageUpdate(success=");
        sb2.append(this.f3521a);
        sb2.append(", requiresReload=");
        sb2.append(this.f3522b);
        sb2.append(", msgId=");
        sb2.append(this.f3523c);
        sb2.append(", isTransfer=");
        sb2.append(this.f3524d);
        AbstractC2091b.m5173t(sb2, ", oldContent=", this.f3525e, ", newContent=", this.f3526f);
        AbstractC2091b.m5173t(sb2, ", oldDisplayText=", this.f3527g, ", newDisplayText=", this.f3528h);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  false
  false
  false
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:21) call: f9.g.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C1096g() {
        this(0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false);
    }
}
