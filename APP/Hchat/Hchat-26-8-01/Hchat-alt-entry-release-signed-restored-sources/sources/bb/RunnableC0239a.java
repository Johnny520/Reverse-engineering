package bb;

/* JADX INFO: renamed from: bb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0239a implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f634g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0240b f635h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f636i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0239a(C0240b c0240b, String str, int i9) {
        this.f634g = i9;
        this.f635h = c0240b;
        this.f636i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f634g) {
            case 0:
                this.f635h.m966k(this.f636i);
                break;
            case 1:
                this.f635h.m966k(this.f636i);
                break;
            default:
                ((C0241c) this.f635h.f639c).invoke(this.f636i);
                break;
        }
    }
}
