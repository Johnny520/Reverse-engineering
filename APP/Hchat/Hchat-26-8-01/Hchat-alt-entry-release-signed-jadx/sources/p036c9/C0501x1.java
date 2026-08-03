package p036c9;

/* JADX INFO: renamed from: c9.x1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0501x1 {

    /* JADX INFO: renamed from: a */
    public final C0492u1 f1531a;

    /* JADX INFO: renamed from: b */
    public final EnumC0495v1 f1532b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0501x1(C0492u1 c0492u1, EnumC0495v1 enumC0495v1) {
        this.f1531a = c0492u1;
        this.f1532b = enumC0495v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0501x1)) {
            return false;
        }
        C0501x1 c0501x1 = (C0501x1) obj;
        return this.f1531a.equals(c0501x1.f1531a) && this.f1532b == c0501x1.f1532b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1532b.hashCode() + (this.f1531a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NativeGroupMenuTarget(target=" + this.f1531a + ", action=" + this.f1532b + ")";
    }
}
