package p213ob;

import android.speech.tts.UtteranceProgressListener;
import gg.AbstractC1416l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ob.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3110c extends UtteranceProgressListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountDownLatch f10087b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicReference f10088c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3110c(String str, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.f10086a = str;
        this.f10087b = countDownLatch;
        this.f10088c = atomicReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        if (AbstractC1416l.m3825a(str, this.f10086a)) {
            this.f10087b.countDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i9) {
        if (AbstractC1416l.m3825a(str, this.f10086a)) {
            this.f10088c.set("TTS 合成失败: " + i9);
            this.f10087b.countDown();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        if (AbstractC1416l.m3825a(str, this.f10086a)) {
            this.f10088c.set("TTS 合成失败");
            this.f10087b.countDown();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
