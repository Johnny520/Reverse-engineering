package p345x8;

import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: x8.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5719l {

    /* JADX INFO: renamed from: a */
    public final String f23268a;

    /* JADX INFO: renamed from: b */
    public final String f23269b;

    /* JADX INFO: renamed from: c */
    public final long f23270c;

    /* JADX INFO: renamed from: d */
    public final int f23271d;

    /* JADX INFO: renamed from: e */
    public final List f23272e;

    /* JADX INFO: renamed from: f */
    public final boolean f23273f;

    /* JADX INFO: renamed from: g */
    public final int f23274g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5719l(String str, String str2, long j3, int i9, List list, boolean z9, int i10) {
        this.f23268a = str;
        this.f23269b = str2;
        this.f23270c = j3;
        this.f23271d = i9;
        this.f23272e = list;
        this.f23273f = z9;
        this.f23274g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5719l)) {
            return false;
        }
        C5719l c5719l = (C5719l) obj;
        return AbstractC1416l.m3825a(this.f23268a, c5719l.f23268a) && AbstractC1416l.m3825a(this.f23269b, c5719l.f23269b) && this.f23270c == c5719l.f23270c && this.f23271d == c5719l.f23271d && AbstractC1416l.m3825a(this.f23272e, c5719l.f23272e) && this.f23273f == c5719l.f23273f && this.f23274g == c5719l.f23274g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f23274g) + AbstractC0921a.m2245h(AbstractC2091b.m5158e(this.f23272e, AbstractC0921a.m2242e(this.f23271d, AbstractC0921a.m2243f(AbstractC0921a.m2244g(this.f23268a.hashCode() * 31, 31, this.f23269b), 31, this.f23270c), 31), 31), 31, this.f23273f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("XiaozhiReply(text=", this.f23268a, ", voicePath=", this.f23269b, ", voiceBytes=");
        sbM1027p.append(this.f23270c);
        sbM1027p.append(", durationMs=");
        sbM1027p.append(this.f23271d);
        sbM1027p.append(", voiceSegments=");
        sbM1027p.append(this.f23272e);
        sbM1027p.append(", mergeVoiceSegments=");
        sbM1027p.append(this.f23273f);
        sbM1027p.append(", mergedSegmentCount=");
        sbM1027p.append(this.f23274g);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (0 long)
  (0 int)
  (wrap:tf.t:0x0007: SGET  A[WRAPPED] tf.t.g tf.t)
  false
  (0 int)
 A[MD:(java.lang.String, java.lang.String, long, int, java.util.List, boolean, int):void (m)] (LINE:19) call: x8.l.<init>(java.lang.String, java.lang.String, long, int, java.util.List, boolean, int):void type: THIS */
    public /* synthetic */ C5719l() {
        this(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0L, 0, C4173t.f13710g, false, 0);
    }
}
