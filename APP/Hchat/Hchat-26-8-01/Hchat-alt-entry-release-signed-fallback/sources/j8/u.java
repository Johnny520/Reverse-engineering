package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements j8.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j8.y f6833b;

    public /* synthetic */ u(j8.y r1, int r2) {
            r0 = this;
            r0.f6832a = r2
            r0.f6833b = r1
            r0.<init>()
            return
    }

    @Override // j8.w
    public final boolean run() {
            r3 = this;
            int r0 = r3.f6832a
            switch(r0) {
                case 0: goto L1d;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            j8.y r0 = r3.f6833b
            r0.u()
            r0 = 1
            return r0
        Lc:
            j8.y r0 = r3.f6833b
            h.Hchat.dexkit.DexFinder r1 = r0.f6841a
            java.lang.reflect.Method r1 = r1.voicePlaybackPauseMethod
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            boolean r0 = r0.l(r1, r2)
            return r0
        L1d:
            j8.y r0 = r3.f6833b
            h.Hchat.dexkit.DexFinder r1 = r0.f6841a
            java.lang.reflect.Method r1 = r1.voicePlaybackResumeMethod
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r0 = r0.l(r1, r2)
            return r0
    }
}
