package p176m1;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.C1034w;
import p162l3.C2469w;
import p293u2.C4236f;

/* JADX INFO: renamed from: m1.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2730f {

    /* JADX INFO: renamed from: k */
    public static int f8862k;

    /* JADX INFO: renamed from: l */
    public static final C2469w f8863l = new C2469w(2);

    /* JADX INFO: renamed from: a */
    public final String f8864a;

    /* JADX INFO: renamed from: b */
    public final float f8865b;

    /* JADX INFO: renamed from: c */
    public final float f8866c;

    /* JADX INFO: renamed from: d */
    public final float f8867d;

    /* JADX INFO: renamed from: e */
    public final float f8868e;

    /* JADX INFO: renamed from: f */
    public final C2733g0 f8869f;

    /* JADX INFO: renamed from: g */
    public final long f8870g;

    /* JADX INFO: renamed from: h */
    public final int f8871h;

    /* JADX INFO: renamed from: i */
    public final boolean f8872i;

    /* JADX INFO: renamed from: j */
    public final int f8873j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2730f(String str, float f3, float f10, float f11, float f12, C2733g0 c2733g0, long j3, int i9, boolean z9) {
        int i10;
        synchronized (f8863l) {
            i10 = f8862k;
            f8862k = i10 + 1;
        }
        this.f8864a = str;
        this.f8865b = f3;
        this.f8866c = f10;
        this.f8867d = f11;
        this.f8868e = f12;
        this.f8869f = c2733g0;
        this.f8870g = j3;
        this.f8871h = i9;
        this.f8872i = z9;
        this.f8873j = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2730f)) {
            return false;
        }
        C2730f c2730f = (C2730f) obj;
        return AbstractC1416l.m3825a(this.f8864a, c2730f.f8864a) && C4236f.m8520b(this.f8865b, c2730f.f8865b) && C4236f.m8520b(this.f8866c, c2730f.f8866c) && this.f8867d == c2730f.f8867d && this.f8868e == c2730f.f8868e && this.f8869f.equals(c2730f.f8869f) && C1034w.m2635c(this.f8870g, c2730f.f8870g) && this.f8871h == c2730f.f8871h && this.f8872i == c2730f.f8872i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f8869f.hashCode() + AbstractC0921a.m2241d(this.f8868e, AbstractC0921a.m2241d(this.f8867d, AbstractC0921a.m2241d(this.f8866c, AbstractC0921a.m2241d(this.f8865b, this.f8864a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i9 = C1034w.f3264h;
        return Boolean.hashCode(this.f8872i) + AbstractC0921a.m2242e(this.f8871h, AbstractC0921a.m2243f(iHashCode, 31, this.f8870g), 31);
    }
}
