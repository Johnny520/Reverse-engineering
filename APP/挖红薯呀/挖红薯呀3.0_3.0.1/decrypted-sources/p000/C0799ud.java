package p000;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0799ud extends C0836vd {

    /* JADX INFO: renamed from: a */
    public final Throwable f6192a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0799ud(Throwable th) {
        this.f6192a = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0799ud) {
            return p30.m3002l(this.f6192a, ((C0799ud) obj).f6192a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Throwable th = this.f6192a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0836vd
    public final String toString() {
        return "Closed(" + this.f6192a + ')';
    }
}
