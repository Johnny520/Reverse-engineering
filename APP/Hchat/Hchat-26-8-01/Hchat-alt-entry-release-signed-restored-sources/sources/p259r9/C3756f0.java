package p259r9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: r9.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3756f0 {

    /* JADX INFO: renamed from: a */
    public final int f12240a;

    /* JADX INFO: renamed from: b */
    public final long f12241b;

    /* JADX INFO: renamed from: c */
    public final long f12242c;

    /* JADX INFO: renamed from: d */
    public final String f12243d;

    /* JADX INFO: renamed from: e */
    public final String f12244e;

    /* JADX INFO: renamed from: f */
    public final String f12245f;

    /* JADX INFO: renamed from: g */
    public final String f12246g;

    /* JADX INFO: renamed from: h */
    public final String f12247h;

    /* JADX INFO: renamed from: i */
    public final String f12248i;

    /* JADX INFO: renamed from: j */
    public final String f12249j;

    /* JADX INFO: renamed from: k */
    public final long f12250k;

    /* JADX INFO: renamed from: l */
    public final boolean f12251l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3756f0(int i9, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j5, boolean z9) {
        str4.getClass();
        this.f12240a = i9;
        this.f12241b = j3;
        this.f12242c = j4;
        this.f12243d = str;
        this.f12244e = str2;
        this.f12245f = str3;
        this.f12246g = str4;
        this.f12247h = str5;
        this.f12248i = str6;
        this.f12249j = str7;
        this.f12250k = j5;
        this.f12251l = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3756f0)) {
            return false;
        }
        C3756f0 c3756f0 = (C3756f0) obj;
        return this.f12240a == c3756f0.f12240a && this.f12241b == c3756f0.f12241b && this.f12242c == c3756f0.f12242c && this.f12243d.equals(c3756f0.f12243d) && this.f12244e.equals(c3756f0.f12244e) && this.f12245f.equals(c3756f0.f12245f) && AbstractC1416l.m3825a(this.f12246g, c3756f0.f12246g) && this.f12247h.equals(c3756f0.f12247h) && this.f12248i.equals(c3756f0.f12248i) && this.f12249j.equals(c3756f0.f12249j) && this.f12250k == c3756f0.f12250k && this.f12251l == c3756f0.f12251l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f12251l) + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Integer.hashCode(this.f12240a) * 31, 31, this.f12241b), 31, this.f12242c), 31, this.f12243d), 31, this.f12244e), 31, this.f12245f), 31, this.f12246g), 31, this.f12247h), 31, this.f12248i), 31, this.f12249j), 31, this.f12250k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageDetails(type=");
        sb2.append(this.f12240a);
        sb2.append(", id=");
        sb2.append(this.f12241b);
        AbstractC2091b.m5172s(sb2, ", serverId=", this.f12242c, ", talker=");
        AbstractC2091b.m5173t(sb2, this.f12243d, ", sender=", this.f12244e, ", content=");
        AbstractC2091b.m5173t(sb2, this.f12245f, ", body=", this.f12246g, ", msgSource=");
        AbstractC2091b.m5173t(sb2, this.f12247h, ", atUserList=", this.f12248i, ", nativeClassName=");
        sb2.append(this.f12249j);
        sb2.append(", createTime=");
        sb2.append(this.f12250k);
        sb2.append(", isSelf=");
        sb2.append(this.f12251l);
        sb2.append(")");
        return sb2.toString();
    }
}
