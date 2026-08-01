package p027N0;

/* JADX INFO: renamed from: N0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0226j implements InterfaceC0219c {

    /* JADX INFO: renamed from: a */
    public final Class f566a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0226j(Class cls) {
        this.f566a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027N0.InterfaceC0219c
    /* JADX INFO: renamed from: a */
    public final Class mo413a() {
        return this.f566a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0226j) {
            return AbstractC0223g.m414a(this.f566a, ((C0226j) obj).f566a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f566a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f566a.toString() + " (Kotlin reflection is not available)";
    }
}
