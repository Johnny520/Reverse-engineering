package p244u;

import p041H0.AbstractC0582a0;
import p153e1.C2010f;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.g0 */
/* JADX INFO: loaded from: classes.dex */
final class C3270g0 extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f10106a;

    /* JADX INFO: renamed from: b */
    public final float f10107b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3270g0(float f2, float f5) {
        this.f10106a = f2;
        this.f10107b = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3272h0 c3272h0 = new C3272h0();
        c3272h0.f10108r = this.f10106a;
        c3272h0.f10109s = this.f10107b;
        return c3272h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3270g0)) {
            return false;
        }
        C3270g0 c3270g0 = (C3270g0) obj;
        return C2010f.m3696b(this.f10106a, c3270g0.f10106a) && C2010f.m3696b(this.f10107b, c3270g0.f10107b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3272h0 c3272h0 = (C3272h0) abstractC2206o;
        c3272h0.f10108r = this.f10106a;
        c3272h0.f10109s = this.f10107b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10107b) + (Float.hashCode(this.f10106a) * 31);
    }
}
