package p315v8;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: v8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4525e {

    /* JADX INFO: renamed from: a */
    public final String f14923a;

    /* JADX INFO: renamed from: b */
    public final String f14924b;

    /* JADX INFO: renamed from: c */
    public final String f14925c;

    /* JADX INFO: renamed from: d */
    public final int f14926d;

    /* JADX INFO: renamed from: e */
    public final long f14927e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4525e(String str, String str2, String str3, int i9, long j3) {
        this.f14923a = str;
        this.f14924b = str2;
        this.f14925c = str3;
        this.f14926d = i9;
        this.f14927e = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4525e)) {
            return false;
        }
        C4525e c4525e = (C4525e) obj;
        return this.f14923a.equals(c4525e.f14923a) && this.f14924b.equals(c4525e.f14924b) && this.f14925c.equals(c4525e.f14925c) && this.f14926d == c4525e.f14926d && this.f14927e == c4525e.f14927e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f14927e) + AbstractC0921a.m2242e(this.f14926d, AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f14923a.hashCode() * 31, 31, this.f14924b), 31, this.f14925c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("CdnDownloadSpec(md5=", this.f14923a, ", url=", this.f14924b, ", aesKey=");
        sbM1027p.append(this.f14925c);
        sbM1027p.append(", fileType=");
        sbM1027p.append(this.f14926d);
        sbM1027p.append(", expectedLength=");
        return AbstractC0921a.m2253p(sbM1027p, this.f14927e, ")");
    }
}
