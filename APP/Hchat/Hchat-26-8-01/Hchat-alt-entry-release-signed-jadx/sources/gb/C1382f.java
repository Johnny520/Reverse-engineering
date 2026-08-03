package gb;

/* JADX INFO: renamed from: gb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1382f extends IllegalStateException {

    /* JADX INFO: renamed from: g */
    public final String f4589g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1382f(String str, int i9, String str2, Throwable th2) {
        th2 = (i9 & 4) != 0 ? null : th2;
        str2 = (i9 & 8) != 0 ? null : str2;
        super(str, th2);
        this.f4589g = str2;
    }
}
