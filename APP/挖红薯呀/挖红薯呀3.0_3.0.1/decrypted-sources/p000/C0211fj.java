package p000;

/* JADX INFO: renamed from: fj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211fj implements cb1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f1740a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0211fj(InterfaceC0742sw interfaceC0742sw) {
        this.f1740a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.cb1
    /* JADX INFO: renamed from: a */
    public final Object mo196a(fq0 fq0Var) {
        return this.f1740a.invoke(fq0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0211fj) && this.f1740a.equals(((C0211fj) obj).f1740a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1740a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f1740a + ')';
    }
}
