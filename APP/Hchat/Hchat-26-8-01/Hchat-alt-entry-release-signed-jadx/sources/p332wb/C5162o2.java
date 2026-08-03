package p332wb;

/* JADX INFO: renamed from: wb.o2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5162o2 extends AbstractC5261r2 {

    /* JADX INFO: renamed from: a */
    public final EnumC5063l2 f19311a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5162o2(EnumC5063l2 enumC5063l2) {
        enumC5063l2.getClass();
        this.f19311a = enumC5063l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5162o2) && this.f19311a == ((C5162o2) obj).f19311a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f19311a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DefaultEditor(kind=" + this.f19311a + ")";
    }
}
