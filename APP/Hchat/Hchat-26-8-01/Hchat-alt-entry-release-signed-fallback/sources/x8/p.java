package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends android.speech.tts.UtteranceProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f21327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f21328b;

    public p(java.util.concurrent.atomic.AtomicBoolean r1, java.util.concurrent.CountDownLatch r2) {
            r0 = this;
            r0.f21327a = r1
            r0.f21328b = r2
            r0.<init>()
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f21327a
            r0 = 1
            r2.set(r0)
            java.util.concurrent.CountDownLatch r2 = r1.f21328b
            r2.countDown()
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String r1) {
            r0 = this;
            java.util.concurrent.CountDownLatch r1 = r0.f21328b
            r1.countDown()
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String r1, int r2) {
            r0 = this;
            java.util.concurrent.CountDownLatch r1 = r0.f21328b
            r1.countDown()
            return
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String r1) {
            r0 = this;
            return
    }
}
