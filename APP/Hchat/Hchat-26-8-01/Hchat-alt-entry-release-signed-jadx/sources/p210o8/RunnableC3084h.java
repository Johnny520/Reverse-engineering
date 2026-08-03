package p210o8;

/* JADX INFO: renamed from: o8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3084h implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9958g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3086j f9959h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Runnable f9960i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3084h(C3086j c3086j, Runnable runnable, int i9) {
        this.f9958g = i9;
        this.f9959h = c3086j;
        this.f9960i = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9958g) {
            case 0:
                this.f9959h.m6556g(this.f9960i);
                break;
            default:
                this.f9959h.m6556g(this.f9960i);
                break;
        }
    }
}
