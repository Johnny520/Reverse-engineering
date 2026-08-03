package p222p;

import p068eh.AbstractC0921a;
import p234q.AbstractC3418a;
import p293u2.C4236f;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: p.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3272z0 implements InterfaceC3268x0 {

    /* JADX INFO: renamed from: a */
    public final float f10417a;

    /* JADX INFO: renamed from: b */
    public final float f10418b;

    /* JADX INFO: renamed from: c */
    public final float f10419c;

    /* JADX INFO: renamed from: d */
    public final float f10420d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3272z0(float f3, float f10, float f11, float f12) {
        this.f10417a = f3;
        this.f10418b = f10;
        this.f10419c = f11;
        this.f10420d = f12;
        if (!((f3 >= 0.0f) & (f10 >= 0.0f) & (f11 >= 0.0f)) || !(f12 >= 0.0f)) {
            AbstractC3418a.m7194a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: a */
    public final float mo6922a() {
        return this.f10420d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: b */
    public final float mo6923b(EnumC4243m enumC4243m) {
        return enumC4243m == EnumC4243m.f13919g ? this.f10419c : this.f10417a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: c */
    public final float mo6924c() {
        return this.f10418b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: d */
    public final float mo6925d(EnumC4243m enumC4243m) {
        return enumC4243m == EnumC4243m.f13919g ? this.f10417a : this.f10419c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3272z0)) {
            return false;
        }
        C3272z0 c3272z0 = (C3272z0) obj;
        return C4236f.m8520b(this.f10417a, c3272z0.f10417a) && C4236f.m8520b(this.f10418b, c3272z0.f10418b) && C4236f.m8520b(this.f10419c, c3272z0.f10419c) && C4236f.m8520b(this.f10420d, c3272z0.f10420d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10420d) + AbstractC0921a.m2241d(this.f10419c, AbstractC0921a.m2241d(this.f10418b, Float.hashCode(this.f10417a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PaddingValues(start=" + ((Object) C4236f.m8521c(this.f10417a)) + ", top=" + ((Object) C4236f.m8521c(this.f10418b)) + ", end=" + ((Object) C4236f.m8521c(this.f10419c)) + ", bottom=" + ((Object) C4236f.m8521c(this.f10420d)) + ')';
    }
}
