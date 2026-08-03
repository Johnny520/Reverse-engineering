package p305uh;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p293u2.C4236f;

/* JADX INFO: renamed from: uh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4352a {

    /* JADX INFO: renamed from: g */
    public static final C4352a f14530g;

    /* JADX INFO: renamed from: h */
    public static final C4352a f14531h;

    /* JADX INFO: renamed from: i */
    public static final C4352a f14532i;

    /* JADX INFO: renamed from: j */
    public static final C4352a f14533j;

    /* JADX INFO: renamed from: k */
    public static final C4352a f14534k;

    /* JADX INFO: renamed from: l */
    public static final C4352a f14535l;

    /* JADX INFO: renamed from: a */
    public final long f14536a;

    /* JADX INFO: renamed from: b */
    public final int f14537b;

    /* JADX INFO: renamed from: c */
    public final float f14538c;

    /* JADX INFO: renamed from: d */
    public final C4355d f14539d;

    /* JADX INFO: renamed from: e */
    public final C4355d f14540e;

    /* JADX INFO: renamed from: f */
    public final boolean f14541f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j3 = C1034w.f3259c;
        f14530g = new C4352a(C1034w.m2634b(j3, 0.05f), (float) 3.5d, new C4355d(new C4354c(0.5f, 0.5f, -0.5f), 0.3f), new C4355d(new C4354c(0.5f, 0.6f, -0.5f), 0.2f), 34);
        f14531h = new C4352a(C1034w.m2634b(j3, 0.05f), (float) 2.8d, new C4355d(new C4354c(0.5f, 0.5f, -0.5f), 0.4f), new C4355d(new C4354c(0.5f, 0.8f, -0.5f), 0.25f), 34);
        f14532i = new C4352a(C1034w.m2634b(j3, 0.05f), (float) 2.6d, new C4355d(new C4354c(0.5f, 0.5f, -0.5f), 0.6f), new C4355d(new C4354c(0.5f, 0.95f, -0.5f), 0.35f), 34);
        f14533j = new C4352a(C1034w.m2634b(j3, 0.05f), (float) 1.7d, new C4355d(new C4354c(0.5f, 0.5f, -0.5f), 0.4f), new C4355d(new C4354c(0.5f, 0.6f, -0.5f), 0.25f), 34);
        f14534k = new C4352a(C1034w.m2634b(j3, 0.06f), (float) 2.0d, new C4355d(new C4354c(0.5f, 0.5f, -0.5f), 0.5f), new C4355d(new C4354c(0.5f, 0.8f, -0.5f), 0.25f), 34);
        f14535l = new C4352a(C1034w.m2634b(j3, 0.08f), (float) 2.3d, new C4355d(new C4354c(0.5f, 0.5f, -0.5f), 0.6f), new C4355d(new C4354c(0.5f, 0.95f, -0.36f), 0.25f), 34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4352a(long j3, float f3, C4355d c4355d, C4355d c4355d2, int i9) {
        this(j3, 12, f3, c4355d, c4355d2, (i9 & 32) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4352a)) {
            return false;
        }
        C4352a c4352a = (C4352a) obj;
        return C1034w.m2635c(this.f14536a, c4352a.f14536a) && this.f14537b == c4352a.f14537b && C4236f.m8520b(this.f14538c, c4352a.f14538c) && AbstractC1416l.m3825a(this.f14539d, c4352a.f14539d) && AbstractC1416l.m3825a(this.f14540e, c4352a.f14540e) && this.f14541f == c4352a.f14541f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Boolean.hashCode(this.f14541f) + ((this.f14540e.hashCode() + ((this.f14539d.hashCode() + AbstractC0921a.m2241d(this.f14538c, AbstractC0921a.m2242e(this.f14537b, Long.hashCode(this.f14536a) * 31, 31), 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2641i = C1034w.m2641i(this.f14536a);
        String strM2503A = AbstractC0996c0.m2503A(this.f14537b);
        String strM8521c = C4236f.m8521c(this.f14538c);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("BloomStroke(color=", strM2641i, ", blendMode=", strM2503A, ", innerBlurRadius=");
        sbM1027p.append(strM8521c);
        sbM1027p.append(", primaryLight=");
        sbM1027p.append(this.f14539d);
        sbM1027p.append(", secondaryLight=");
        sbM1027p.append(this.f14540e);
        sbM1027p.append(", dualPeak=");
        sbM1027p.append(this.f14541f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public C4352a(long j3, int i9, float f3, C4355d c4355d, C4355d c4355d2, boolean z9) {
        c4355d2.getClass();
        this.f14536a = j3;
        this.f14537b = i9;
        this.f14538c = f3;
        this.f14539d = c4355d;
        this.f14540e = c4355d2;
        this.f14541f = z9;
    }
}
