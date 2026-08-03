package p070f0;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.widget.EditText;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.function.IntConsumer;
import na.C2914b;
import p198nb.C2948q;
import p198nb.C2954w;
import p198nb.C2957z;
import p218og.C3147k;
import p260ra.C3779c;
import ua.C4300k;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0972d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3063g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3064h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3065i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0972d(int i9, int i10, Object obj) {
        this.f3063g = i10;
        this.f3065i = obj;
        this.f3064h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        TextToSpeech textToSpeech;
        int i9 = this.f3063g;
        int i10 = this.f3064h;
        Object obj = this.f3065i;
        switch (i9) {
            case 0:
                ((IntConsumer) obj).accept(i10);
                break;
            case 1:
                C2954w c2954w = (C2954w) obj;
                C3147k c3147k = C2954w.f9673A;
                C2957z c2957zM6374y = c2954w.m6374y();
                if (!c2957zM6374y.m6377b("text_speech_enable") || !c2957zM6374y.m6377b("text_speech_volume_control") || c2954w.f9688o == null) {
                    c2954w.m6367o();
                } else if (i10 < 0 && c2954w.f9691r) {
                    c2954w.m6375z();
                } else if (i10 < 0) {
                    c2954w.m6365m();
                } else if (i10 > 0 && c2954w.f9691r) {
                    c2954w.m6370u();
                } else if (i10 > 0) {
                    Object systemService = c2954w.f9674a.getSystemService("audio");
                    AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                    if (audioManager != null) {
                        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                        if (streamMaxVolume < 1) {
                            streamMaxVolume = 1;
                        }
                        int streamVolume = audioManager.getStreamVolume(3) + 1;
                        if (streamVolume <= streamMaxVolume) {
                            streamMaxVolume = streamVolume;
                        }
                        try {
                            c2954w.f9697x = Integer.valueOf(streamMaxVolume);
                            audioManager.setStreamVolume(3, streamMaxVolume, 1);
                            C2948q c2948q = c2954w.f9695v;
                            if (c2948q != null) {
                                c2948q.setCurrentVolume(streamMaxVolume);
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                }
                break;
            case 2:
                ((EditText) obj).scrollTo(0, i10);
                break;
            case 3:
                C3779c c3779c = (C3779c) obj;
                C2914b c2914b = (C2914b) c3779c.f12375e;
                c3779c.f12372b = false;
                if (i10 == 0 && (textToSpeech = (TextToSpeech) c3779c.f12380j) != null) {
                    c3779c.f12371a = true;
                    try {
                        int language = textToSpeech.setLanguage(Locale.CHINA);
                        if (language == -1 || language == -2) {
                            String str = "ERROR 红包播报中文语音不可用: " + language;
                            if (c2914b != null) {
                                c2914b.mo3415a(str);
                            }
                        }
                    } catch (Throwable th2) {
                        String str2 = "ERROR 红包播报语言设置失败: " + th2.getMessage();
                        if (c2914b != null) {
                            c2914b.mo3415a(str2);
                        }
                    }
                    try {
                        ((TextToSpeech) c3779c.f12380j).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                    } catch (Throwable th3) {
                        String str3 = "ERROR 红包播报音频通道设置失败: " + th3.getMessage();
                        if (c2914b != null) {
                            c2914b.mo3415a(str3);
                        }
                    }
                    c3779c.m7932e();
                } else {
                    try {
                        TextToSpeech textToSpeech2 = (TextToSpeech) c3779c.f12380j;
                        if (textToSpeech2 != null) {
                            textToSpeech2.shutdown();
                        }
                        break;
                    } catch (Throwable unused2) {
                    }
                    c3779c.f12380j = null;
                    c3779c.f12371a = false;
                    c3779c.m7937k("红包播报初始化失败: status=" + i10, null);
                    c3779c.m7943q("初始化失败");
                }
                break;
            default:
                C4300k c4300k = (C4300k) obj;
                boolean z9 = i10 == 0;
                c4300k.f14343h = z9;
                ArrayDeque arrayDeque = c4300k.f14344i;
                if (!z9) {
                    c4300k.f14337b.invoke("自动收款播报初始化失败: " + i10, null);
                    arrayDeque.clear();
                } else {
                    TextToSpeech textToSpeech3 = c4300k.f14342g;
                    if (textToSpeech3 != null) {
                        textToSpeech3.setLanguage(Locale.CHINA);
                    }
                    while (!arrayDeque.isEmpty()) {
                        Object objRemoveFirst = arrayDeque.removeFirst();
                        objRemoveFirst.getClass();
                        c4300k.m8637d((String) objRemoveFirst);
                    }
                }
                break;
        }
    }
}
