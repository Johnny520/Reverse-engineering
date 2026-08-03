package p378z6;

import ac.AbstractC0063p;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.InterfaceC1026r0;
import p293u2.C4236f;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: z6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6104d implements InterfaceC1026r0 {

    /* JADX INFO: renamed from: a */
    public final float f24637a;

    /* JADX INFO: renamed from: b */
    public final EnumC6103c f24638b = EnumC6103c.f24635h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6104d(float f3) {
        this.f24637a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1026r0
    /* JADX INFO: renamed from: a */
    public final AbstractC0996c0 mo2612a(long j3, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c) {
        enumC4243m.getClass();
        interfaceC4233c.getClass();
        float fMo1601x0 = interfaceC4233c.mo1601x0(this.f24637a);
        float fM2055b = C0810e.m2055b(j3) * 0.5f;
        if (fMo1601x0 < 0.0f) {
            fMo1601x0 = 0.0f;
        }
        if (fMo1601x0 <= fM2055b) {
            fM2055b = fMo1601x0;
        }
        return AbstractC0063p.m401K(j3, fM2055b, this.f24638b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6104d)) {
            return false;
        }
        C6104d c6104d = (C6104d) obj;
        return C4236f.m8520b(this.f24637a, c6104d.f24637a) && this.f24638b == c6104d.f24638b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24638b.hashCode() + (Float.hashCode(this.f24637a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RoundedRectangle(cornerRadius=" + C4236f.m8521c(this.f24637a) + ", style=" + this.f24638b + ")";
    }
}
