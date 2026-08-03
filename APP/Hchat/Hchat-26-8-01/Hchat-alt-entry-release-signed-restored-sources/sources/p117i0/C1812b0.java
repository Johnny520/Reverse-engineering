package p117i0;

import p266s0.C3878h;

/* JADX INFO: renamed from: i0.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1812b0 implements InterfaceC1870p2 {

    /* JADX INFO: renamed from: a */
    public final C1845j1 f6031a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1812b0(C1845j1 c1845j1) {
        this.f6031a = c1845j1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1870p2
    /* JADX INFO: renamed from: a */
    public final Object mo4454a(C3878h c3878h) {
        return this.f6031a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1812b0) && this.f6031a.equals(((C1812b0) obj).f6031a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6031a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DynamicValueHolder(state=" + this.f6031a + ')';
    }
}
