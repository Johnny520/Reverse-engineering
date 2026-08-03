package p155ka;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ka.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2385k {

    /* JADX INFO: renamed from: a */
    public final String f7830a;

    /* JADX INFO: renamed from: b */
    public final String f7831b;

    /* JADX INFO: renamed from: c */
    public final String f7832c;

    /* JADX INFO: renamed from: d */
    public final String f7833d;

    /* JADX INFO: renamed from: e */
    public final String f7834e;

    /* JADX INFO: renamed from: f */
    public final String f7835f;

    /* JADX INFO: renamed from: g */
    public final String f7836g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2385k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7830a = str;
        this.f7831b = str2;
        this.f7832c = str3;
        this.f7833d = str4;
        this.f7834e = str5;
        this.f7835f = str6;
        this.f7836g = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2385k)) {
            return false;
        }
        C2385k c2385k = (C2385k) obj;
        return this.f7830a.equals(c2385k.f7830a) && this.f7831b.equals(c2385k.f7831b) && this.f7832c.equals(c2385k.f7832c) && this.f7833d.equals(c2385k.f7833d) && this.f7834e.equals(c2385k.f7834e) && this.f7835f.equals(c2385k.f7835f) && this.f7836g.equals(c2385k.f7836g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7836g.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f7830a.hashCode() * 31, 31, this.f7831b), 31, this.f7832c), 31, this.f7833d), 31, this.f7834e), 31, this.f7835f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("QQMusicTrack(title=", this.f7830a, ", singer=", this.f7831b, ", mid=");
        AbstractC2091b.m5173t(sbM1027p, this.f7832c, ", playUrl=", this.f7833d, ", lyric=");
        AbstractC2091b.m5173t(sbM1027p, this.f7834e, ", coverUrl=", this.f7835f, ", landingUrl=");
        return AbstractC0921a.m2255r(sbM1027p, this.f7836g, ")");
    }
}
