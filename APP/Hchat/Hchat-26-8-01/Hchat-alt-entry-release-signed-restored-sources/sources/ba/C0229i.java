package ba;

/* JADX INFO: renamed from: ba.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0229i {

    /* JADX INFO: renamed from: a */
    public final C0237q f569a;

    /* JADX INFO: renamed from: b */
    public final EnumC0234n f570b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0229i(C0237q c0237q, EnumC0234n enumC0234n) {
        this.f569a = c0237q;
        this.f570b = enumC0234n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0229i)) {
            return false;
        }
        C0229i c0229i = (C0229i) obj;
        return this.f569a.equals(c0229i.f569a) && this.f570b == c0229i.f570b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f570b.hashCode() + (this.f569a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DrawableChoice(drawable=" + this.f569a + ", slot=" + this.f570b + ")";
    }
}
