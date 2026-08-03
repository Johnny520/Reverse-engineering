package p078f9;

/* JADX INFO: renamed from: f9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1095f {

    /* JADX INFO: renamed from: a */
    public final boolean f3519a;

    /* JADX INFO: renamed from: b */
    public final boolean f3520b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1095f(boolean z9, boolean z10) {
        this.f3519a = z9;
        this.f3520b = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1095f)) {
            return false;
        }
        C1095f c1095f = (C1095f) obj;
        return this.f3519a == c1095f.f3519a && this.f3520b == c1095f.f3520b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3520b) + (Boolean.hashCode(this.f3519a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageWriteResult(success=" + this.f3519a + ", notified=" + this.f3520b + ")";
    }
}
