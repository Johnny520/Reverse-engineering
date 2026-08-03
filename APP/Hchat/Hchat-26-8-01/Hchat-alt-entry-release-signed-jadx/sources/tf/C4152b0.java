package tf;

/* JADX INFO: renamed from: tf.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4152b0 extends AbstractC4151b {

    /* JADX INFO: renamed from: i */
    public int f13683i;

    /* JADX INFO: renamed from: j */
    public int f13684j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4154c0 f13685k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4152b0(C4154c0 c4154c0) {
        this.f13685k = c4154c0;
        this.f13683i = c4154c0.size();
        this.f13684j = c4154c0.f13688i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4151b
    /* JADX INFO: renamed from: a */
    public final void mo2018a() {
        int i9 = this.f13683i;
        if (i9 == 0) {
            this.f13681g = 2;
            return;
        }
        C4154c0 c4154c0 = this.f13685k;
        Object[] objArr = c4154c0.f13686g;
        int i10 = this.f13684j;
        this.f13682h = objArr[i10];
        this.f13681g = 1;
        this.f13684j = (i10 + 1) % c4154c0.f13687h;
        this.f13683i = i9 - 1;
    }
}
