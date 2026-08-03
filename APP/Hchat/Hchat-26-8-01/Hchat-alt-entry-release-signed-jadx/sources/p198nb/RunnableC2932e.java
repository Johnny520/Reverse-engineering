package p198nb;

import android.speech.tts.TextToSpeech;
import java.util.ArrayDeque;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p136j8.C2105p;
import p136j8.C2110u;
import p136j8.C2114y;

/* JADX INFO: renamed from: nb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2932e implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9603g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2954w f9604h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2932e(C2954w c2954w, int i9) {
        this.f9603g = i9;
        this.f9604h = c2954w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C2114y c2114y;
        C2114y c2114y2;
        switch (this.f9603g) {
            case 0:
                this.f9604h.m6369t();
                break;
            case 1:
                this.f9604h.m6364j();
                break;
            case 2:
                this.f9604h.m6364j();
                break;
            case 3:
                this.f9604h.m6364j();
                break;
            case 4:
                C2954w c2954w = this.f9604h;
                c2954w.f9699z++;
                c2954w.f9677d.clear();
                c2954w.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
                c2954w.f9690q = 0;
                c2954w.f9691r = false;
                c2954w.f9693t = 0;
                c2954w.m6368p();
                c2954w.f9688o = null;
                c2954w.f9676c.clear();
                try {
                    TextToSpeech textToSpeech = c2954w.f9679f;
                    if (textToSpeech != null) {
                        textToSpeech.stop();
                    }
                    break;
                } catch (Throwable unused) {
                }
                c2954w.m6362g();
                C2105p c2105pMedia = WeChatApis.media();
                if (c2105pMedia != null && (c2114y = c2105pMedia.f7036b) != null) {
                    c2114y.m5322r(new C2110u(c2114y, 2));
                }
                c2954w.m6367o();
                c2954w.m6372w();
                break;
            case 5:
                C2954w c2954w2 = this.f9604h;
                c2954w2.f9699z++;
                c2954w2.f9677d.clear();
                ArrayDeque arrayDeque = c2954w2.f9676c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : arrayDeque) {
                    if (!(((AbstractC2943l) obj) instanceof C2946o)) {
                        arrayList.add(obj);
                    }
                }
                c2954w2.f9676c.clear();
                c2954w2.f9676c.addAll(arrayList);
                if (c2954w2.f9688o instanceof C2946o) {
                    c2954w2.f9688o = null;
                    c2954w2.f9691r = false;
                    c2954w2.m6362g();
                    C2105p c2105pMedia2 = WeChatApis.media();
                    if (c2105pMedia2 != null && (c2114y2 = c2105pMedia2.f7036b) != null) {
                        c2114y2.m5322r(new C2110u(c2114y2, 2));
                    }
                    c2954w2.m6366n();
                }
                break;
            case 6:
                C2954w c2954w3 = this.f9604h;
                if (!c2954w3.m6374y().m6377b("text_speech_volume_control") || c2954w3.f9688o == null) {
                    c2954w3.m6367o();
                } else {
                    c2954w3.m6359c();
                }
                break;
            case 7:
                C2954w c2954w4 = this.f9604h;
                if (c2954w4.f9691r) {
                    c2954w4.m6375z();
                } else {
                    c2954w4.m6365m();
                }
                break;
            default:
                C2954w c2954w5 = this.f9604h;
                c2954w5.getClass();
                c2954w5.m6370u();
                break;
        }
    }
}
