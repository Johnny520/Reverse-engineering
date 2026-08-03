package p293u2;

import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p309v2.InterfaceC4442a;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: u2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4235e implements InterfaceC4233c {

    /* JADX INFO: renamed from: g */
    public final float f13906g;

    /* JADX INFO: renamed from: h */
    public final float f13907h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4442a f13908i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4235e(float f3, float f10, InterfaceC4442a interfaceC4442a) {
        this.f13906g = f3;
        this.f13907h = f10;
        this.f13908i = interfaceC4442a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: J */
    public final long mo1591J(float f3) {
        return AbstractC5700d.m10260R(4294967296L, this.f13908i.mo8536a(f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: S */
    public final float mo1595S(long j3) {
        if (C4246p.m8542a(C4245o.m8539b(j3), 4294967296L)) {
            return this.f13908i.mo8537b(C4245o.m8540c(j3));
        }
        C2104o.m5276A("Only Sp can convert to Px");
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f13906g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4235e)) {
            return false;
        }
        C4235e c4235e = (C4235e) obj;
        return Float.compare(this.f13906g, c4235e.f13906g) == 0 && Float.compare(this.f13907h, c4235e.f13907h) == 0 && this.f13908i.equals(c4235e.f13908i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13908i.hashCode() + AbstractC0921a.m2241d(this.f13907h, Float.hashCode(this.f13906g) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f13907h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DensityWithConverter(density=" + this.f13906g + ", fontScale=" + this.f13907h + ", converter=" + this.f13908i + ')';
    }
}
