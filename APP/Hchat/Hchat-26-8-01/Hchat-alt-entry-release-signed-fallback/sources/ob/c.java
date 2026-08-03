package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends android.speech.tts.UtteranceProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f9714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f9715c;

    public c(java.lang.String r1, java.util.concurrent.CountDownLatch r2, java.util.concurrent.atomic.AtomicReference r3) {
            r0 = this;
            r0.f9713a = r1
            r0.f9714b = r2
            r0.f9715c = r3
            r0.<init>()
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.f9713a
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto Ld
            java.util.concurrent.CountDownLatch r2 = r1.f9714b
            r2.countDown()
        Ld:
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.f9713a
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L14
            java.util.concurrent.atomic.AtomicReference r2 = r1.f9715c
            java.lang.String r0 = "TTS 合成失败"
            r2.set(r0)
            java.util.concurrent.CountDownLatch r2 = r1.f9714b
            r2.countDown()
        L14:
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.f9713a
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "TTS 合成失败: "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.concurrent.atomic.AtomicReference r3 = r1.f9715c
            r3.set(r2)
            java.util.concurrent.CountDownLatch r2 = r1.f9714b
            r2.countDown()
        L20:
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String r1) {
            r0 = this;
            return
    }
}
