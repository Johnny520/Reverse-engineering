package p378z6;

import ac.AbstractC0063p;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.InterfaceC1026r0;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: z6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6101a implements InterfaceC1026r0 {

    /* JADX INFO: renamed from: a */
    public final EnumC6103c f24621a = EnumC6103c.f24635h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1026r0
    /* JADX INFO: renamed from: a */
    public final AbstractC0996c0 mo2612a(long j3, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c) {
        enumC4243m.getClass();
        interfaceC4233c.getClass();
        return AbstractC0063p.m401K(j3, C0810e.m2055b(j3) * 0.5f, this.f24621a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6101a) {
            return this.f24621a == ((C6101a) obj).f24621a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24621a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Capsule(style=" + this.f24621a + ")";
    }
}
