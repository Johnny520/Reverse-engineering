package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: wb.jv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5026jv {

    /* JADX INFO: renamed from: a */
    public final String f18249a;

    /* JADX INFO: renamed from: b */
    public final String f18250b;

    /* JADX INFO: renamed from: c */
    public final boolean f18251c;

    /* JADX INFO: renamed from: d */
    public final String f18252d;

    /* JADX INFO: renamed from: e */
    public final String f18253e;

    /* JADX INFO: renamed from: f */
    public final List f18254f;

    /* JADX INFO: renamed from: g */
    public final boolean f18255g;

    /* JADX INFO: renamed from: h */
    public final List f18256h;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (8 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:java.lang.String:0x0006: SGET  A[WRAPPED] (LINE:7) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r11v0 int) & (16 int) A[WRAPPED] (LINE:8)) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] (LINE:12) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r11v0 int) & (32 int) A[WRAPPED] (LINE:13)) != (0 int)) ? (wrap:java.util.List:0x0010: SGET  A[WRAPPED] (LINE:17) tf.t.g tf.t) : (r8v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r11v0 int) & (64 int) A[WRAPPED] (LINE:19)) != (0 int)) ? false : (r9v0 boolean))
  (r10v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, boolean, java.util.List):void (m)] (LINE:33) call: wb.jv.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, boolean, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5026jv(String str, String str2, boolean z9, String str3, String str4, List list, boolean z10, List list2, int i9) {
        this(str, str2, z9, (i9 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i9 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4, (i9 & 32) != 0 ? C4173t.f13710g : list, (i9 & 64) != 0 ? false : z10, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5026jv)) {
            return false;
        }
        C5026jv c5026jv = (C5026jv) obj;
        return AbstractC1416l.m3825a(this.f18249a, c5026jv.f18249a) && AbstractC1416l.m3825a(this.f18250b, c5026jv.f18250b) && this.f18251c == c5026jv.f18251c && AbstractC1416l.m3825a(this.f18252d, c5026jv.f18252d) && AbstractC1416l.m3825a(this.f18253e, c5026jv.f18253e) && AbstractC1416l.m3825a(this.f18254f, c5026jv.f18254f) && this.f18255g == c5026jv.f18255g && AbstractC1416l.m3825a(this.f18256h, c5026jv.f18256h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18256h.hashCode() + AbstractC0921a.m2245h(AbstractC2091b.m5158e(this.f18254f, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f18249a.hashCode() * 31, 31, this.f18250b), 31, this.f18251c), 31, this.f18252d), 31, this.f18253e), 31), 31, this.f18255g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ContactItem(id=", this.f18249a, ", label=", this.f18250b, ", group=");
        sbM1027p.append(this.f18251c);
        sbM1027p.append(", avatarUrl=");
        sbM1027p.append(this.f18252d);
        sbM1027p.append(", avatarBackupUrl=");
        sbM1027p.append(this.f18253e);
        sbM1027p.append(", labels=");
        sbM1027p.append(this.f18254f);
        sbM1027p.append(", official=");
        sbM1027p.append(this.f18255g);
        sbM1027p.append(", searchAliases=");
        sbM1027p.append(this.f18256h);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public C5026jv(String str, String str2, boolean z9, String str3, String str4, List list, boolean z10, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f18249a = str;
        this.f18250b = str2;
        this.f18251c = z9;
        this.f18252d = str3;
        this.f18253e = str4;
        this.f18254f = list;
        this.f18255g = z10;
        this.f18256h = list2;
    }
}
