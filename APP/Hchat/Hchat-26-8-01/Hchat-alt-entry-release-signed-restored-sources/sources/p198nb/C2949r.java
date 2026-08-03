package p198nb;

import android.speech.tts.UtteranceProgressListener;
import p063e9.RunnableC0844o;

/* JADX INFO: renamed from: nb.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2949r extends UtteranceProgressListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2954w f9664a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2949r(C2954w c2954w) {
        this.f9664a = c2954w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        C2954w c2954w = this.f9664a;
        c2954w.f9675b.post(new RunnableC2934f(c2954w, str, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        C2954w c2954w = this.f9664a;
        c2954w.f9675b.post(new RunnableC2934f(c2954w, str, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onRangeStart(String str, int i9, int i10, int i11) {
        C2954w c2954w = this.f9664a;
        c2954w.f9675b.post(new RunnableC0844o(c2954w, str, i9, 2));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i9) {
        C2954w c2954w = this.f9664a;
        c2954w.f9675b.post(new RunnableC2934f(c2954w, str, 1));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
