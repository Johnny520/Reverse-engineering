package sh;

import p025bc.AbstractC0255e;
import p057e1.C0807b;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: sh.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4024l {

    /* JADX INFO: renamed from: a */
    public final long f13209a;

    /* JADX INFO: renamed from: b */
    public final long f13210b;

    /* JADX INFO: renamed from: c */
    public final long f13211c;

    /* JADX INFO: renamed from: d */
    public final float f13212d;

    /* JADX INFO: renamed from: e */
    public final float f13213e;

    /* JADX INFO: renamed from: f */
    public final float f13214f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4024l(long j3, long j4, long j5, float f3, float f10, float f11) {
        this.f13209a = j3;
        this.f13210b = j4;
        this.f13211c = j5;
        this.f13212d = f3;
        this.f13213e = f10;
        this.f13214f = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4024l)) {
            return false;
        }
        C4024l c4024l = (C4024l) obj;
        return C0807b.m2039b(this.f13209a, c4024l.f13209a) && C0807b.m2039b(this.f13210b, c4024l.f13210b) && C0807b.m2039b(this.f13211c, c4024l.f13211c) && Float.compare(this.f13212d, c4024l.f13212d) == 0 && Float.compare(this.f13213e, c4024l.f13213e) == 0 && Float.compare(this.f13214f, c4024l.f13214f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13214f) + AbstractC0921a.m2241d(this.f13213e, AbstractC0921a.m2241d(this.f13212d, AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f13209a) * 31, 31, this.f13210b), 31, this.f13211c), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2044g = C0807b.m2044g(this.f13209a);
        String strM2044g2 = C0807b.m2044g(this.f13210b);
        String strM2044g3 = C0807b.m2044g(this.f13211c);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("CheckmarkCache(startPoint=", strM2044g, ", middlePoint=", strM2044g2, ", endPoint=");
        sbM1027p.append(strM2044g3);
        sbM1027p.append(", centerX=");
        sbM1027p.append(this.f13212d);
        sbM1027p.append(", centerY=");
        sbM1027p.append(this.f13213e);
        sbM1027p.append(", strokeWidth=");
        sbM1027p.append(this.f13214f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
