package p332wb;

/* JADX INFO: renamed from: wb.y3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5492y3 extends AbstractC4738b4 {

    /* JADX INFO: renamed from: a */
    public final C4737b3 f22070a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5492y3(C4737b3 c4737b3) {
        this.f22070a = c4737b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5492y3) && this.f22070a.equals(((C5492y3) obj).f22070a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f22070a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FavoritePicker(request=" + this.f22070a + ")";
    }
}
