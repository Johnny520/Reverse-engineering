package p080fb;

import android.speech.tts.TextToSpeech;
import java.util.Locale;
import okhttp3.HttpUrl;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: fb.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1149m1 implements TextToSpeech.OnInitListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(final int i9) {
        AbstractC1157o1.f3841a.post(new Runnable() { // from class: fb.n1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z9 = i9 == 0;
                AbstractC1157o1.f3843c = z9;
                if (!z9) {
                    TextToSpeech textToSpeech = AbstractC1157o1.f3842b;
                    if (textToSpeech != null) {
                        textToSpeech.shutdown();
                    }
                    AbstractC1157o1.f3842b = null;
                    AbstractC1157o1.f3844d = HttpUrl.FRAGMENT_ENCODE_SET;
                    return;
                }
                TextToSpeech textToSpeech2 = AbstractC1157o1.f3842b;
                if (textToSpeech2 != null) {
                    textToSpeech2.setLanguage(Locale.getDefault());
                }
                String str = AbstractC1157o1.f3844d;
                AbstractC1157o1.f3844d = HttpUrl.FRAGMENT_ENCODE_SET;
                if (AbstractC3149m.m6721t0(str)) {
                    return;
                }
                AbstractC1157o1.m2978a(str);
            }
        });
    }
}
