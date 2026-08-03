package p332wb;

/* JADX INFO: renamed from: wb.tp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5350tp {

    /* JADX INFO: renamed from: a */
    public final EnumC5317sp f20948a;

    /* JADX INFO: renamed from: b */
    public final String f20949b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5350tp(EnumC5317sp enumC5317sp, String str) {
        this.f20948a = enumC5317sp;
        this.f20949b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5350tp)) {
            return false;
        }
        C5350tp c5350tp = (C5350tp) obj;
        return this.f20948a == c5350tp.f20948a && this.f20949b.equals(c5350tp.f20949b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20949b.hashCode() + (this.f20948a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PluginMarketUploadStatus(phase=" + this.f20948a + ", message=" + this.f20949b + ")";
    }
}
