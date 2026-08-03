package p332wb;

import p322w0.C4661l;

/* JADX INFO: renamed from: wb.n5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5132n5 {

    /* JADX INFO: renamed from: a */
    public final C4661l f19105a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5132n5(C4661l c4661l) {
        this.f19105a = c4661l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5132n5) && this.f19105a.equals(((C5132n5) obj).f19105a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f19105a.hashCode() + 70741189) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageBlockContactPickerRequest(title=选择适用聊天, existingValue=, onValue=" + this.f19105a + ", allowOfficialAccounts=false)";
    }
}
