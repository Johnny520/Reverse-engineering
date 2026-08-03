package p332wb;

/* JADX INFO: renamed from: wb.tv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5356tv extends AbstractC5422vv {

    /* JADX INFO: renamed from: a */
    public final EnumC5455wv f20975a;

    /* JADX INFO: renamed from: b */
    public final C5391v0 f20976b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5356tv(EnumC5455wv enumC5455wv, C5391v0 c5391v0) {
        this.f20975a = enumC5455wv;
        this.f20976b = c5391v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5356tv)) {
            return false;
        }
        C5356tv c5356tv = (C5356tv) obj;
        return this.f20975a == c5356tv.f20975a && this.f20976b.equals(c5356tv.f20976b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20976b.hashCode() + (this.f20975a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContactPicker(selection=" + this.f20975a + ", request=" + this.f20976b + ")";
    }
}
