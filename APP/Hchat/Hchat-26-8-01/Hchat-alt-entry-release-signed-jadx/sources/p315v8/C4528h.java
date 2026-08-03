package p315v8;

import gg.AbstractC1416l;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: v8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4528h {

    /* JADX INFO: renamed from: a */
    public final String f14940a;

    /* JADX INFO: renamed from: b */
    public final String f14941b;

    /* JADX INFO: renamed from: c */
    public final long f14942c;

    /* JADX INFO: renamed from: d */
    public final WeChatMessage f14943d;

    /* JADX INFO: renamed from: e */
    public final List f14944e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f14945f;

    /* JADX INFO: renamed from: g */
    public final String f14946g;

    /* JADX INFO: renamed from: h */
    public final int f14947h;

    /* JADX INFO: renamed from: i */
    public final String f14948i;

    /* JADX INFO: renamed from: j */
    public final boolean f14949j;

    /* JADX INFO: renamed from: k */
    public final String f14950k;

    /* JADX INFO: renamed from: l */
    public final long f14951l;

    /* JADX INFO: renamed from: m */
    public final String f14952m;

    /* JADX INFO: renamed from: n */
    public String f14953n;

    /* JADX INFO: renamed from: o */
    public String f14954o;

    /* JADX INFO: renamed from: p */
    public boolean f14955p;

    /* JADX INFO: renamed from: q */
    public boolean f14956q;

    /* JADX INFO: renamed from: r */
    public boolean f14957r;

    /* JADX INFO: renamed from: s */
    public String f14958s;

    /* JADX INFO: renamed from: t */
    public String f14959t;

    /* JADX INFO: renamed from: u */
    public long f14960u;

    /* JADX INFO: renamed from: v */
    public int f14961v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4528h(String str, String str2, long j3, WeChatMessage weChatMessage, List list, LinkedHashMap linkedHashMap, String str3, int i9, String str4, boolean z9, String str5, long j4, String str6) {
        str2.getClass();
        weChatMessage.getClass();
        str3.getClass();
        str5.getClass();
        this.f14940a = str;
        this.f14941b = str2;
        this.f14942c = j3;
        this.f14943d = weChatMessage;
        this.f14944e = list;
        this.f14945f = linkedHashMap;
        this.f14946g = str3;
        this.f14947h = i9;
        this.f14948i = str4;
        this.f14949j = z9;
        this.f14950k = str5;
        this.f14951l = j4;
        this.f14952m = str6;
        this.f14953n = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14954o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14955p = false;
        this.f14956q = false;
        this.f14957r = false;
        this.f14958s = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14959t = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f14960u = -1L;
        this.f14961v = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4528h)) {
            return false;
        }
        C4528h c4528h = (C4528h) obj;
        return this.f14940a.equals(c4528h.f14940a) && AbstractC1416l.m3825a(this.f14941b, c4528h.f14941b) && this.f14942c == c4528h.f14942c && AbstractC1416l.m3825a(this.f14943d, c4528h.f14943d) && this.f14944e.equals(c4528h.f14944e) && this.f14945f.equals(c4528h.f14945f) && AbstractC1416l.m3825a(this.f14946g, c4528h.f14946g) && this.f14947h == c4528h.f14947h && this.f14948i.equals(c4528h.f14948i) && this.f14949j == c4528h.f14949j && AbstractC1416l.m3825a(this.f14950k, c4528h.f14950k) && this.f14951l == c4528h.f14951l && this.f14952m.equals(c4528h.f14952m) && this.f14953n.equals(c4528h.f14953n) && this.f14954o.equals(c4528h.f14954o) && this.f14955p == c4528h.f14955p && this.f14956q == c4528h.f14956q && this.f14957r == c4528h.f14957r && this.f14958s.equals(c4528h.f14958s) && this.f14959t.equals(c4528h.f14959t) && this.f14960u == c4528h.f14960u && this.f14961v == c4528h.f14961v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f14961v) + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f14947h, AbstractC0921a.m2244g((this.f14945f.hashCode() + AbstractC2091b.m5158e(this.f14944e, (this.f14943d.hashCode() + AbstractC0921a.m2243f(AbstractC0921a.m2244g(this.f14940a.hashCode() * 31, 31, this.f14941b), 31, this.f14942c)) * 31, 31)) * 31, 31, this.f14946g), 31), 31, this.f14948i), 31, this.f14949j), 31, this.f14950k), 31, this.f14951l), 31, this.f14952m), 31, this.f14953n), 31, this.f14954o), 31, this.f14955p), 31, this.f14956q), 31, this.f14957r), 31, this.f14958s), 31, this.f14959t), 31, this.f14960u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f14953n;
        String str2 = this.f14954o;
        boolean z9 = this.f14955p;
        boolean z10 = this.f14956q;
        boolean z11 = this.f14957r;
        String str3 = this.f14958s;
        String str4 = this.f14959t;
        long j3 = this.f14960u;
        int i9 = this.f14961v;
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PendingForward(key=", this.f14940a, ", talker=", this.f14941b, ", msgSvrId=");
        sbM1027p.append(this.f14942c);
        sbM1027p.append(", fallback=");
        sbM1027p.append(this.f14943d);
        sbM1027p.append(", targets=");
        sbM1027p.append(this.f14944e);
        sbM1027p.append(", targetRules=");
        sbM1027p.append(this.f14945f);
        sbM1027p.append(", kind=");
        sbM1027p.append(this.f14946g);
        sbM1027p.append(", messageType=");
        sbM1027p.append(this.f14947h);
        sbM1027p.append(", searchableContent=");
        sbM1027p.append(this.f14948i);
        sbM1027p.append(", outgoing=");
        sbM1027p.append(this.f14949j);
        sbM1027p.append(", sourceSender=");
        sbM1027p.append(this.f14950k);
        sbM1027p.append(", deadline=");
        sbM1027p.append(this.f14951l);
        sbM1027p.append(", cacheToken=");
        sbM1027p.append(this.f14952m);
        AbstractC2091b.m5173t(sbM1027p, ", downloadTargetPath=", str, ", downloadPath=", str2);
        sbM1027p.append(", downloadRequested=");
        sbM1027p.append(z9);
        sbM1027p.append(", downloadInFlight=");
        sbM1027p.append(z10);
        sbM1027p.append(", downloadFailed=");
        sbM1027p.append(z11);
        sbM1027p.append(", downloadError=");
        sbM1027p.append(str3);
        sbM1027p.append(", stableLocalPath=");
        sbM1027p.append(str4);
        sbM1027p.append(", stableLocalLength=");
        sbM1027p.append(j3);
        sbM1027p.append(", stableLocalChecks=");
        sbM1027p.append(i9);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
