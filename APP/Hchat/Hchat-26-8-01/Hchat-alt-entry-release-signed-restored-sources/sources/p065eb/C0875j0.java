package p065eb;

/* JADX INFO: renamed from: eb.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0875j0 {

    /* JADX INFO: renamed from: a */
    public final String f2685a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0873i0 f2686b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0875j0(String str, InterfaceC0873i0 interfaceC0873i0) {
        this.f2685a = str;
        this.f2686b = interfaceC0873i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0875j0)) {
            return false;
        }
        C0875j0 c0875j0 = (C0875j0) obj;
        return this.f2685a.equals(c0875j0.f2685a) && this.f2686b.equals(c0875j0.f2686b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2686b.hashCode() + (this.f2685a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RegisteredHandler(id=" + this.f2685a + ", handler=" + this.f2686b + ")";
    }
}
