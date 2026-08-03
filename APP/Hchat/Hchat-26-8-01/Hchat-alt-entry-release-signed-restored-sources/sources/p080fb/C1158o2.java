package p080fb;

/* JADX INFO: renamed from: fb.o2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1158o2 {

    /* JADX INFO: renamed from: a */
    public final boolean f3845a;

    /* JADX INFO: renamed from: b */
    public final String f3846b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1158o2(boolean z9, String str) {
        this.f3845a = z9;
        this.f3846b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158o2)) {
            return false;
        }
        C1158o2 c1158o2 = (C1158o2) obj;
        return this.f3845a == c1158o2.f3845a && this.f3846b.equals(c1158o2.f3846b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3846b.hashCode() + (Boolean.hashCode(this.f3845a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DirectoryWriteProbe(success=" + this.f3845a + ", detail=" + this.f3846b + ")";
    }
}
