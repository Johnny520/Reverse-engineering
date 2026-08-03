package p080fb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: fb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1143l {

    /* JADX INFO: renamed from: a */
    public final C1172s0 f3767a;

    /* JADX INFO: renamed from: b */
    public final String f3768b;

    /* JADX INFO: renamed from: c */
    public final String f3769c;

    /* JADX INFO: renamed from: d */
    public final C1173s1 f3770d;

    /* JADX INFO: renamed from: e */
    public final C1116e0 f3771e;

    /* JADX INFO: renamed from: f */
    public final boolean f3772f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1143l(C1172s0 c1172s0, String str, String str2, C1173s1 c1173s1, C1116e0 c1116e0, boolean z9) {
        c1172s0.getClass();
        str2.getClass();
        this.f3767a = c1172s0;
        this.f3768b = str;
        this.f3769c = str2;
        this.f3770d = c1173s1;
        this.f3771e = c1116e0;
        this.f3772f = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1172s0 m2898a() {
        return this.f3767a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2899b() {
        return this.f3768b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m2900c() {
        return this.f3772f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C1173s1 m2901d() {
        return this.f3770d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1143l)) {
            return false;
        }
        C1143l c1143l = (C1143l) obj;
        return AbstractC1416l.m3825a(this.f3767a, c1143l.f3767a) && this.f3768b.equals(c1143l.f3768b) && AbstractC1416l.m3825a(this.f3769c, c1143l.f3769c) && this.f3770d.equals(c1143l.f3770d) && AbstractC1416l.m3825a(this.f3771e, c1143l.f3771e) && this.f3772f == c1143l.f3772f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f3770d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3767a.hashCode() * 31, 31, this.f3768b), 31, this.f3769c)) * 31;
        C1116e0 c1116e0 = this.f3771e;
        return Boolean.hashCode(this.f3772f) + ((iHashCode + (c1116e0 == null ? 0 : c1116e0.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NativeToolExecution(call=" + this.f3767a + ", eventId=" + this.f3768b + ", rawResult=" + this.f3769c + ", stored=" + this.f3770d + ", fileResult=" + this.f3771e + ", failed=" + this.f3772f + ")";
    }
}
