package p280t2;

/* JADX INFO: renamed from: t2.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4103s {

    /* JADX INFO: renamed from: c */
    public static final C4103s f13571c = new C4103s(2, false);

    /* JADX INFO: renamed from: d */
    public static final C4103s f13572d = new C4103s(1, true);

    /* JADX INFO: renamed from: a */
    public final int f13573a;

    /* JADX INFO: renamed from: b */
    public final boolean f13574b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4103s(int i9, boolean z9) {
        this.f13573a = i9;
        this.f13574b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4103s)) {
            return false;
        }
        C4103s c4103s = (C4103s) obj;
        return this.f13573a == c4103s.f13573a && this.f13574b == c4103s.f13574b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f13574b) + (Integer.hashCode(this.f13573a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return equals(f13571c) ? "TextMotion.Static" : equals(f13572d) ? "TextMotion.Animated" : "Invalid";
    }
}
