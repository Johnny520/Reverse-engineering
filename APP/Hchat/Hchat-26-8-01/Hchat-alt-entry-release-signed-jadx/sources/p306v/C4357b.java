package p306v;

import p293u2.C4236f;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: v.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4357b implements InterfaceC4356a {

    /* JADX INFO: renamed from: a */
    public final float f14551a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4357b(float f3) {
        this.f14551a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p306v.InterfaceC4356a
    /* JADX INFO: renamed from: a */
    public final float mo8799a(long j3, InterfaceC4233c interfaceC4233c) {
        return interfaceC4233c.mo1601x0(this.f14551a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4357b) && C4236f.m8520b(this.f14551a, ((C4357b) obj).f14551a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f14551a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f14551a + ".dp)";
    }
}
