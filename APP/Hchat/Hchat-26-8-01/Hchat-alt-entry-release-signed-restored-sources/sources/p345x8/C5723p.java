package p345x8;

import android.speech.tts.UtteranceProgressListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: x8.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5723p extends UtteranceProgressListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f23295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountDownLatch f23296b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5723p(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.f23295a = atomicBoolean;
        this.f23296b = countDownLatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        this.f23295a.set(true);
        this.f23296b.countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.f23296b.countDown();
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i9) {
        this.f23296b.countDown();
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
