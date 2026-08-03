package p213ob;

import android.speech.tts.TextToSpeech;
import gg.C1423s;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ob.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3108a implements TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountDownLatch f10084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Serializable f10085c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3108a(Serializable serializable, CountDownLatch countDownLatch, int i9) {
        this.f10083a = i9;
        this.f10085c = serializable;
        this.f10084b = countDownLatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i9) {
        switch (this.f10083a) {
            case 0:
                ((AtomicInteger) this.f10085c).set(i9);
                this.f10084b.countDown();
                break;
            default:
                ((C1423s) this.f10085c).f4736g = i9;
                this.f10084b.countDown();
                break;
        }
    }
}
