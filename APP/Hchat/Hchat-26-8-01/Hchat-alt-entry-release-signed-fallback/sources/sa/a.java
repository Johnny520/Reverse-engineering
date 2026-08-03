package sa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements android.speech.tts.TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12403b;

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f12402a = r2
            r0.f12403b = r1
            r0.<init>()
            return
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int r5) {
            r4 = this;
            int r0 = r4.f12402a
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f12403b
            ua.k r0 = (ua.k) r0
            android.os.Handler r1 = r0.f13661c
            f0.d r2 = new f0.d
            r3 = 4
            r2.<init>(r5, r3, r0)
            r1.post(r2)
            return
        L15:
            java.lang.Object r0 = r4.f12403b
            ra.c r0 = (ra.c) r0
            java.lang.Object r1 = r0.f11839f
            android.os.Handler r1 = (android.os.Handler) r1
            f0.d r2 = new f0.d
            r3 = 3
            r2.<init>(r5, r3, r0)
            r1.post(r2)
            return
    }
}
