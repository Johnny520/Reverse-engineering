package p306v;

import p057e1.C0810e;
import p201o.AbstractC3026b;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: v.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4358c implements InterfaceC4356a {

    /* JADX INFO: renamed from: a */
    public final float f14552a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4358c(float f3) {
        this.f14552a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            AbstractC3026b.m6428a("The percent should be in the range of [0, 100]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p306v.InterfaceC4356a
    /* JADX INFO: renamed from: a */
    public final float mo8799a(long j3, InterfaceC4233c interfaceC4233c) {
        return (this.f14552a / 100.0f) * C0810e.m2055b(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4358c) && Float.compare(this.f14552a, ((C4358c) obj).f14552a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f14552a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f14552a + "%)";
    }
}
