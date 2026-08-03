package p312v5;

/* JADX INFO: renamed from: v5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4478a extends Exception {

    /* JADX INFO: renamed from: g */
    public final String f14829g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4478a(String str) {
        super("Invalid reference");
        this.f14829g = str;
    }

    public C4478a(String str, Throwable th2) {
        super(th2);
        this.f14829g = str;
    }
}
