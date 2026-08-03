package p117i0;

import p085fg.InterfaceC1231l;
import p266s0.C3878h;

/* JADX INFO: renamed from: i0.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1886v implements InterfaceC1870p2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f6263a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1886v(InterfaceC1231l interfaceC1231l) {
        this.f6263a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1870p2
    /* JADX INFO: renamed from: a */
    public final Object mo4454a(C3878h c3878h) {
        return this.f6263a.invoke(c3878h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1886v) && this.f6263a.equals(((C1886v) obj).f6263a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6263a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f6263a + ')';
    }
}
