package p332wb;

/* JADX INFO: renamed from: wb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5060l extends AbstractC5159o {

    /* JADX INFO: renamed from: a */
    public final C4804d4 f18541a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5060l(C4804d4 c4804d4) {
        this.f18541a = c4804d4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5060l) && this.f18541a.equals(((C5060l) obj).f18541a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18541a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "GroupMemberPicker(request=" + this.f18541a + ")";
    }
}
