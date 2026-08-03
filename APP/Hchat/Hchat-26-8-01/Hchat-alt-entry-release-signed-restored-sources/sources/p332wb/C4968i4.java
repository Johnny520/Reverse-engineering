package p332wb;

/* JADX INFO: renamed from: wb.i4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4968i4 extends AbstractC5065l4 {

    /* JADX INFO: renamed from: a */
    public final C5391v0 f17769a;

    /* JADX INFO: renamed from: b */
    public final boolean f17770b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4968i4(C5391v0 c5391v0, boolean z9) {
        this.f17769a = c5391v0;
        this.f17770b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4968i4)) {
            return false;
        }
        C4968i4 c4968i4 = (C4968i4) obj;
        return this.f17769a.equals(c4968i4.f17769a) && this.f17770b == c4968i4.f17770b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f17770b) + (this.f17769a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(request=" + this.f17769a + ", fromMain=" + this.f17770b + ")";
    }
}
