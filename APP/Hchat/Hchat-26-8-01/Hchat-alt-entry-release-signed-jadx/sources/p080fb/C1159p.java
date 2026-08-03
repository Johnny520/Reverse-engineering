package p080fb;

import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import tf.C4173t;

/* JADX INFO: renamed from: fb.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159p {

    /* JADX INFO: renamed from: a */
    public final String f3847a;

    /* JADX INFO: renamed from: b */
    public final String f3848b;

    /* JADX INFO: renamed from: c */
    public final List f3849c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1159p(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        this.f3847a = str;
        this.f3848b = str2;
        this.f3849c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159p)) {
            return false;
        }
        C1159p c1159p = (C1159p) obj;
        return AbstractC1416l.m3825a(this.f3847a, c1159p.f3847a) && AbstractC1416l.m3825a(this.f3848b, c1159p.f3848b) && AbstractC1416l.m3825a(this.f3849c, c1159p.f3849c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3849c.hashCode() + AbstractC0921a.m2244g(this.f3847a.hashCode() * 31, 31, this.f3848b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("StreamDelta(content=", this.f3847a, ", reasoning=", this.f3848b, ", toolCalls=");
        sbM1027p.append(this.f3849c);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CONSTRUCTOR 
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:tf.t:0x0002: SGET  A[WRAPPED] (LINE:17) tf.t.g tf.t)
 A[MD:(java.lang.String, java.lang.String, java.util.List):void (m)] (LINE:18) call: fb.p.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C1159p() {
        this(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, C4173t.f13710g);
    }
}
