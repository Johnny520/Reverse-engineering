package p306v;

import ac.AbstractC0063p;
import p057e1.C0808c;
import p057e1.C0809d;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.InterfaceC1026r0;
import p201o.AbstractC3026b;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: v.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4359d implements InterfaceC1026r0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4356a f14553a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4356a f14554b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4356a f14555c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4356a f14556d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4359d(InterfaceC4356a interfaceC4356a, InterfaceC4356a interfaceC4356a2, InterfaceC4356a interfaceC4356a3, InterfaceC4356a interfaceC4356a4) {
        this.f14553a = interfaceC4356a;
        this.f14554b = interfaceC4356a2;
        this.f14555c = interfaceC4356a3;
        this.f14556d = interfaceC4356a4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1026r0
    /* JADX INFO: renamed from: a */
    public final AbstractC0996c0 mo2612a(long j3, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c) {
        float fMo8799a = this.f14553a.mo8799a(j3, interfaceC4233c);
        float fMo8799a2 = this.f14554b.mo8799a(j3, interfaceC4233c);
        float fMo8799a3 = this.f14555c.mo8799a(j3, interfaceC4233c);
        float fMo8799a4 = this.f14556d.mo8799a(j3, interfaceC4233c);
        float fM2055b = C0810e.m2055b(j3);
        float f3 = fMo8799a + fMo8799a4;
        if (f3 > fM2055b) {
            float f10 = fM2055b / f3;
            fMo8799a *= f10;
            fMo8799a4 *= f10;
        }
        float f11 = fMo8799a2 + fMo8799a3;
        if (f11 > fM2055b) {
            float f12 = fM2055b / f11;
            fMo8799a2 *= f12;
            fMo8799a3 *= f12;
        }
        if (fMo8799a < 0.0f || fMo8799a2 < 0.0f || fMo8799a3 < 0.0f || fMo8799a4 < 0.0f) {
            AbstractC3026b.m6428a("Corner size in Px can't be negative(topStart = " + fMo8799a + ", topEnd = " + fMo8799a2 + ", bottomEnd = " + fMo8799a3 + ", bottomStart = " + fMo8799a4 + ")!");
        }
        if (fMo8799a + fMo8799a2 + fMo8799a3 + fMo8799a4 == 0.0f) {
            return new C1012k0(AbstractC0063p.m408a(0L, j3));
        }
        C0808c c0808cM408a = AbstractC0063p.m408a(0L, j3);
        EnumC4243m enumC4243m2 = EnumC4243m.f13919g;
        float f13 = enumC4243m == enumC4243m2 ? fMo8799a : fMo8799a2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
        if (enumC4243m == enumC4243m2) {
            fMo8799a = fMo8799a2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo8799a)) << 32) | (((long) Float.floatToRawIntBits(fMo8799a)) & 4294967295L);
        float f14 = enumC4243m == enumC4243m2 ? fMo8799a3 : fMo8799a4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        if (enumC4243m != enumC4243m2) {
            fMo8799a4 = fMo8799a3;
        }
        return new C1014l0(new C0809d(c0808cM408a.f2416a, c0808cM408a.f2417b, c0808cM408a.f2418c, c0808cM408a.f2419d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo8799a4)) << 32) | (((long) Float.floatToRawIntBits(fMo8799a4)) & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4359d)) {
            return false;
        }
        C4359d c4359d = (C4359d) obj;
        return this.f14553a.equals(c4359d.f14553a) && this.f14554b.equals(c4359d.f14554b) && this.f14555c.equals(c4359d.f14555c) && this.f14556d.equals(c4359d.f14556d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14556d.hashCode() + ((this.f14555c.hashCode() + ((this.f14554b.hashCode() + (this.f14553a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f14553a + ", topEnd = " + this.f14554b + ", bottomEnd = " + this.f14555c + ", bottomStart = " + this.f14556d + ')';
    }
}
