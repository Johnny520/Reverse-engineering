package p172lg;

/* JADX INFO: renamed from: lg.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2564d extends C2562b {

    /* JADX INFO: renamed from: j */
    public static final C2564d f8319j = new C2564d(1, 0, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172lg.C2562b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2564d)) {
            return false;
        }
        if (isEmpty() && ((C2564d) obj).isEmpty()) {
            return true;
        }
        C2564d c2564d = (C2564d) obj;
        return this.f8312g == c2564d.f8312g && this.f8313h == c2564d.f8313h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172lg.C2562b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f8312g * 31) + this.f8313h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172lg.C2562b
    public final boolean isEmpty() {
        return this.f8312g > this.f8313h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172lg.C2562b
    public final String toString() {
        return this.f8312g + ".." + this.f8313h;
    }
}
