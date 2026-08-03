package p108ha;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ha.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1635c0 {

    /* JADX INFO: renamed from: a */
    public final String f5350a;

    /* JADX INFO: renamed from: b */
    public final long f5351b;

    /* JADX INFO: renamed from: c */
    public final String f5352c;

    /* JADX INFO: renamed from: d */
    public final long f5353d;

    /* JADX INFO: renamed from: e */
    public final EnumC1637d0 f5354e;

    /* JADX INFO: renamed from: f */
    public final String f5355f;

    /* JADX INFO: renamed from: g */
    public final Object f5356g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1635c0(String str, long j3, String str2, long j4, EnumC1637d0 enumC1637d0, String str3, Object obj) {
        str2.getClass();
        obj.getClass();
        this.f5350a = str;
        this.f5351b = j3;
        this.f5352c = str2;
        this.f5353d = j4;
        this.f5354e = enumC1637d0;
        this.f5355f = str3;
        this.f5356g = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1635c0)) {
            return false;
        }
        C1635c0 c1635c0 = (C1635c0) obj;
        return this.f5350a.equals(c1635c0.f5350a) && this.f5351b == c1635c0.f5351b && AbstractC1416l.m3825a(this.f5352c, c1635c0.f5352c) && this.f5353d == c1635c0.f5353d && this.f5354e == c1635c0.f5354e && this.f5355f.equals(c1635c0.f5355f) && AbstractC1416l.m3825a(this.f5356g, c1635c0.f5356g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5356g.hashCode() + AbstractC0921a.m2244g((this.f5354e.hashCode() + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2243f(this.f5350a.hashCode() * 31, 31, this.f5351b), 31, this.f5352c), 31, this.f5353d)) * 31, 31, this.f5355f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("MomentsPostRecord(key=", this.f5350a, ", snsId=", this.f5351b);
        sbM2259v.append(", userName=");
        sbM2259v.append(this.f5352c);
        sbM2259v.append(", createTimeSeconds=");
        sbM2259v.append(this.f5353d);
        sbM2259v.append(", type=");
        sbM2259v.append(this.f5354e);
        sbM2259v.append(", text=");
        sbM2259v.append(this.f5355f);
        sbM2259v.append(", nativeInfo=");
        sbM2259v.append(this.f5356g);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
