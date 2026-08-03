package p080fb;

import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: fb.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1193y0 {

    /* JADX INFO: renamed from: a */
    public final String f4010a;

    /* JADX INFO: renamed from: b */
    public final String f4011b;

    /* JADX INFO: renamed from: c */
    public final List f4012c;

    /* JADX INFO: renamed from: d */
    public final boolean f4013d;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:java.lang.String:0x0006: SGET  A[WRAPPED] (LINE:7) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED] (LINE:8)) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] (LINE:12) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED] (LINE:13)) != (0 int)) ? (wrap:java.util.List:0x0010: SGET  A[WRAPPED] (LINE:17) tf.t.g tf.t) : (r5v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED] (LINE:19)) == (0 int)) ? true : false)
 A[MD:(java.lang.String, java.lang.String, java.util.List, boolean):void (m)] (LINE:26) call: fb.y0.<init>(java.lang.String, java.lang.String, java.util.List, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1193y0(String str, String str2, List list, int i9) {
        this((i9 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i9 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i9 & 4) != 0 ? C4173t.f13710g : list, (i9 & 8) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193y0)) {
            return false;
        }
        C1193y0 c1193y0 = (C1193y0) obj;
        return AbstractC1416l.m3825a(this.f4010a, c1193y0.f4010a) && AbstractC1416l.m3825a(this.f4011b, c1193y0.f4011b) && AbstractC1416l.m3825a(this.f4012c, c1193y0.f4012c) && this.f4013d == c1193y0.f4013d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f4013d) + AbstractC2091b.m5158e(this.f4012c, AbstractC0921a.m2244g(this.f4010a.hashCode() * 31, 31, this.f4011b), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("StreamDelta(content=", this.f4010a, ", reasoning=", this.f4011b, ", toolCalls=");
        sbM1027p.append(this.f4012c);
        sbM1027p.append(", completed=");
        sbM1027p.append(this.f4013d);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public C1193y0(String str, String str2, List list, boolean z9) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f4010a = str;
        this.f4011b = str2;
        this.f4012c = list;
        this.f4013d = z9;
    }
}
