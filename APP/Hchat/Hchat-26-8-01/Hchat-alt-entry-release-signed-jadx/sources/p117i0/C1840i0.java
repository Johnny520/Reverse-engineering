package p117i0;

import p338x0.InterfaceC5573c;

/* JADX INFO: renamed from: i0.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1840i0 implements InterfaceC5573c {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1859n f6131g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1840i0(InterfaceC1859n interfaceC1859n) {
        this.f6131g = interfaceC1859n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1840i0) {
            return this.f6131g.equals(((C1840i0) obj).f6131g);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6131g.hashCode() * 31;
    }
}
