package p136j8;

/* JADX INFO: renamed from: j8.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2110u implements InterfaceC2112w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2114y f7053b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2110u(C2114y c2114y, int i9) {
        this.f7052a = i9;
        this.f7053b = c2114y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2112w
    public final boolean run() {
        switch (this.f7052a) {
            case 0:
                C2114y c2114y = this.f7053b;
                return c2114y.m5316l(c2114y.f7061a.voicePlaybackResumeMethod, new Object[0]);
            case 1:
                C2114y c2114y2 = this.f7053b;
                return c2114y2.m5316l(c2114y2.f7061a.voicePlaybackPauseMethod, Boolean.TRUE);
            default:
                this.f7053b.m5325u();
                return true;
        }
    }
}
