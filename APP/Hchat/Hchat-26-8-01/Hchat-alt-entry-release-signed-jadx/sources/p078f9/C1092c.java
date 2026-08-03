package p078f9;

/* JADX INFO: renamed from: f9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1092c {

    /* JADX INFO: renamed from: a */
    public final long f3507a;

    /* JADX INFO: renamed from: b */
    public final Object f3508b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1092c(Object obj, long j3) {
        this.f3507a = j3;
        this.f3508b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092c)) {
            return false;
        }
        C1092c c1092c = (C1092c) obj;
        return this.f3507a == c1092c.f3507a && this.f3508b.equals(c1092c.f3508b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3508b.hashCode() + (Long.hashCode(this.f3507a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MenuMessageBinding(msgId=" + this.f3507a + ", nativeMessage=" + this.f3508b + ")";
    }
}
