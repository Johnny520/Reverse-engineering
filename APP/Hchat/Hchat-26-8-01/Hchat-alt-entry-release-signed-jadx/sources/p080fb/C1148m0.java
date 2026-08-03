package p080fb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1148m0 {

    /* JADX INFO: renamed from: a */
    public final String f3783a;

    /* JADX INFO: renamed from: b */
    public final String f3784b;

    /* JADX INFO: renamed from: c */
    public final String f3785c;

    /* JADX INFO: renamed from: d */
    public final long f3786d;

    /* JADX INFO: renamed from: e */
    public final long f3787e;

    /* JADX INFO: renamed from: f */
    public final long f3788f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1148m0(String str, String str2, String str3, long j3, long j4, long j5) {
        this.f3783a = str;
        this.f3784b = str2;
        this.f3785c = str3;
        this.f3786d = j3;
        this.f3787e = j4;
        this.f3788f = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148m0)) {
            return false;
        }
        C1148m0 c1148m0 = (C1148m0) obj;
        return this.f3783a.equals(c1148m0.f3783a) && this.f3784b.equals(c1148m0.f3784b) && this.f3785c.equals(c1148m0.f3785c) && this.f3786d == c1148m0.f3786d && this.f3787e == c1148m0.f3787e && this.f3788f == c1148m0.f3788f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3788f) + AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3783a.hashCode() * 31, 31, this.f3784b), 31, this.f3785c), 31, this.f3786d), 31, this.f3787e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("TargetSession(sessionId=", this.f3783a, ", apkPath=", this.f3784b, ", kind=");
        sbM1027p.append(this.f3785c);
        sbM1027p.append(", fileLength=");
        sbM1027p.append(this.f3786d);
        AbstractC2091b.m5172s(sbM1027p, ", lastModified=", this.f3787e, ", addedAt=");
        return AbstractC0921a.m2253p(sbM1027p, this.f3788f, ")");
    }
}
