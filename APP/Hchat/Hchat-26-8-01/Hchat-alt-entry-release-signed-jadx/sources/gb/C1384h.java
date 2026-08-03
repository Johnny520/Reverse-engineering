package gb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: gb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1384h {

    /* JADX INFO: renamed from: a */
    public final String f4595a;

    /* JADX INFO: renamed from: b */
    public final String f4596b;

    /* JADX INFO: renamed from: c */
    public final String f4597c;

    /* JADX INFO: renamed from: d */
    public final long f4598d;

    /* JADX INFO: renamed from: e */
    public final String f4599e;

    /* JADX INFO: renamed from: f */
    public final String f4600f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1384h(long j3, String str, String str2, String str3, String str4, String str5) {
        this.f4595a = str;
        this.f4596b = str2;
        this.f4597c = str3;
        this.f4598d = j3;
        this.f4599e = str4;
        this.f4600f = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1384h)) {
            return false;
        }
        C1384h c1384h = (C1384h) obj;
        return this.f4595a.equals(c1384h.f4595a) && this.f4596b.equals(c1384h.f4596b) && this.f4597c.equals(c1384h.f4597c) && this.f4598d == c1384h.f4598d && this.f4599e.equals(c1384h.f4599e) && this.f4600f.equals(c1384h.f4600f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4600f.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4595a.hashCode() * 31, 31, this.f4596b), 31, this.f4597c), 31, this.f4598d), 31, this.f4599e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketHistoryVersion(versionId=", this.f4595a, ", versionName=", this.f4596b, ", contentHash=");
        sbM1027p.append(this.f4597c);
        sbM1027p.append(", totalSize=");
        sbM1027p.append(this.f4598d);
        AbstractC2091b.m5173t(sbM1027p, ", createdAt=", this.f4599e, ", releaseNotes=", this.f4600f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
