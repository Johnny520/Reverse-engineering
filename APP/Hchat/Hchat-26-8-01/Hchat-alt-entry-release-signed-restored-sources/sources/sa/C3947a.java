package sa;

import android.os.Handler;
import android.speech.tts.TextToSpeech;
import p070f0.RunnableC0972d;
import p260ra.C3779c;
import ua.C4300k;

/* JADX INFO: renamed from: sa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3947a implements TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12946b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3947a(Object obj, int i9) {
        this.f12945a = i9;
        this.f12946b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i9) {
        switch (this.f12945a) {
            case 0:
                C3779c c3779c = (C3779c) this.f12946b;
                ((Handler) c3779c.f12376f).post(new RunnableC0972d(i9, 3, c3779c));
                break;
            default:
                C4300k c4300k = (C4300k) this.f12946b;
                c4300k.f14338c.post(new RunnableC0972d(i9, 4, c4300k));
                break;
        }
    }
}
