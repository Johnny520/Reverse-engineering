package p332wb;

/* JADX INFO: renamed from: wb.x5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5462x5 extends AbstractC4740b6 {

    /* JADX INFO: renamed from: a */
    public final EnumC5264r5 f21850a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5462x5(EnumC5264r5 enumC5264r5) {
        this.f21850a = enumC5264r5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5462x5) && this.f21850a == ((C5462x5) obj).f21850a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f21850a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DefaultRuleEditor(kind=" + this.f21850a + ")";
    }
}
