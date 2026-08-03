package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements android.speech.tts.TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f9711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.io.Serializable f9712c;

    public /* synthetic */ a(java.io.Serializable r1, java.util.concurrent.CountDownLatch r2, int r3) {
            r0 = this;
            r0.f9710a = r3
            r0.f9712c = r1
            r0.f9711b = r2
            r0.<init>()
            return
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int r2) {
            r1 = this;
            int r0 = r1.f9710a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r1.f9712c
            gg.s r0 = (gg.s) r0
            r0.f4562g = r2
            java.util.concurrent.CountDownLatch r2 = r1.f9711b
            r2.countDown()
            return
        L11:
            java.io.Serializable r0 = r1.f9712c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r0.set(r2)
            java.util.concurrent.CountDownLatch r2 = r1.f9711b
            r2.countDown()
            return
    }
}
