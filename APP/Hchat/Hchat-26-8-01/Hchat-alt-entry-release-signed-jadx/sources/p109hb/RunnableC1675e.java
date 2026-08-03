package p109hb;

/* JADX INFO: renamed from: hb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1675e implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5537g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1687k f5538h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1683i f5539i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1675e(C1687k c1687k, C1683i c1683i, int i9) {
        this.f5537g = i9;
        this.f5538h = c1687k;
        this.f5539i = c1683i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5537g) {
            case 0:
                C1683i c1683i = this.f5539i;
                C1687k c1687k = this.f5538h;
                c1687k.f5604e.addLast(c1683i);
                if (c1687k.f5606g == null) {
                    c1687k.m4304n();
                }
                break;
            default:
                this.f5538h.m4303m(this.f5539i);
                break;
        }
    }
}
