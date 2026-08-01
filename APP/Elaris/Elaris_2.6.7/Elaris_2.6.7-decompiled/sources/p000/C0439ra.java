package p000;

/* JADX INFO: renamed from: ra */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439ra implements InterfaceC0199e8 {

    /* JADX INFO: renamed from: a */
    public final Class f802a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0439ra(Class cls) {
        cls.getClass();
        this.f802a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0439ra) {
            return AbstractC0260i5.m643p(this.f802a, ((C0439ra) obj).f802a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f802a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f802a + " (Kotlin reflection is not available)";
    }
}
