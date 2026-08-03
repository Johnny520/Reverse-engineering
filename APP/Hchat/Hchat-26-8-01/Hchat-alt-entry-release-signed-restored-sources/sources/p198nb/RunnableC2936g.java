package p198nb;

import android.media.AudioAttributes;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import ca.RunnableC0531r;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p276sf.C3960g;
import tf.C4175v;

/* JADX INFO: renamed from: nb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2936g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9624g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2954w f9625h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f9626i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9627j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9628k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f9629l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2936g(C2954w c2954w, long j3, String str, String str2, int i9) {
        this.f9625h = c2954w;
        this.f9626i = j3;
        this.f9628k = str;
        this.f9629l = str2;
        this.f9627j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TextToSpeech textToSpeech;
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object next;
        switch (this.f9624g) {
            case 0:
                C2954w c2954w = this.f9625h;
                Handler handler = c2954w.f9675b;
                long j3 = this.f9626i;
                String str = (String) this.f9628k;
                String str2 = (String) this.f9629l;
                int i9 = this.f9627j;
                if (j3 == c2954w.f9682i) {
                    RunnableC0531r runnableC0531r = c2954w.f9683j;
                    if (runnableC0531r != null) {
                        handler.removeCallbacks(runnableC0531r);
                    }
                    String strConcat = null;
                    c2954w.f9683j = null;
                    c2954w.f9681h = false;
                    if (!c2954w.m6374y().m6377b("text_speech_enable")) {
                        c2954w.m6372w();
                    } else if (!AbstractC1416l.m3825a(str, c2954w.m6374y().m6378c())) {
                        c2954w.m6369t();
                    } else if (i9 == 0 && (textToSpeech = c2954w.f9679f) != null) {
                        Object field = KavaReflector.readField(textToSpeech, "mCurrentEngine");
                        String str3 = field instanceof String ? (String) field : null;
                        if (AbstractC3149m.m6721t0(str2) || str3 == null || AbstractC3149m.m6721t0(str3) || str3.equals(str2)) {
                            c2954w.f9684k = 0;
                            TextToSpeech textToSpeech2 = c2954w.f9679f;
                            if (textToSpeech2 != null) {
                                try {
                                    c3959f = Integer.valueOf(textToSpeech2.setLanguage(Locale.CHINA));
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b == null) {
                                    int iIntValue = ((Number) c3959f).intValue();
                                    if (iIntValue == -2 || iIntValue == -1) {
                                        strConcat = "所选文字转语音引擎缺少中文语音数据或不支持中文";
                                    } else {
                                        String string = AbstractC3149m.m6703R0(c2954w.m6374y().m6379d("text_speech_tts_voice", HttpUrl.FRAGMENT_ENCODE_SET)).toString();
                                        if (!AbstractC3149m.m6721t0(string)) {
                                            try {
                                                Set<Voice> voices = textToSpeech2.getVoices();
                                                if (voices == null) {
                                                    voices = C4175v.f13712g;
                                                }
                                                Iterator<T> it = voices.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        if (AbstractC1416l.m3825a(((Voice) next).getName(), string)) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                c3959f2 = (Voice) next;
                                            } catch (Throwable th3) {
                                                c3959f2 = new C3959f(th3);
                                            }
                                            if (c3959f2 instanceof C3959f) {
                                                c3959f2 = null;
                                            }
                                            Voice voice = (Voice) c3959f2;
                                            if (voice != null) {
                                                try {
                                                    c3959f3 = Integer.valueOf(textToSpeech2.setVoice(voice));
                                                } catch (Throwable th4) {
                                                    c3959f3 = new C3959f(th4);
                                                }
                                                Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                                                if (thM8182b2 != null) {
                                                    AbstractC0921a.m2260w("[Hchat:TextSpeech] 设置播报角色失败: voice=", string, ", error=", thM8182b2.getMessage(), thM8182b2);
                                                    strConcat = "所选播报角色设置失败: ".concat(string);
                                                } else if (((Number) c3959f3).intValue() != 0) {
                                                    strConcat = "所选播报角色设置失败: ".concat(string);
                                                } else {
                                                    try {
                                                        textToSpeech2.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                                                        break;
                                                    } catch (Throwable unused) {
                                                    }
                                                    textToSpeech2.setOnUtteranceProgressListener(new C2949r(c2954w));
                                                }
                                            } else {
                                                strConcat = "所选播报角色已不可用: ".concat(string);
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    AbstractC0921a.m2261x("[Hchat:TextSpeech] 设置中文语音失败: ", thM8182b.getMessage(), thM8182b);
                                    strConcat = "所选文字转语音引擎设置中文语音失败";
                                }
                            } else {
                                strConcat = "文字转语音引擎未初始化";
                            }
                            if (strConcat == null) {
                                c2954w.f9680g = true;
                                c2954w.m6366n();
                            } else {
                                c2954w.m6372w();
                                if (!c2954w.m6360e()) {
                                    String strM6378c = c2954w.m6374y().m6378c();
                                    if (AbstractC3149m.m6721t0(strM6378c)) {
                                        strM6378c = "系统默认";
                                    }
                                    AbstractC1184v0.m3203m("[Hchat:TextSpeech] " + strConcat + ", engine=" + strM6378c);
                                    c2954w.m6368p();
                                    c2954w.m6363i();
                                } else {
                                    handler.postDelayed(new RunnableC2932e(c2954w, 3), 800L);
                                }
                            }
                        } else {
                            c2954w.m6371v(new IllegalStateException(AbstractC0255e.m1021j("引擎 ", str2, " 连接失败，系统回退到 ", str3)));
                        }
                    } else {
                        c2954w.m6371v(null);
                    }
                    break;
                }
                break;
            default:
                C2954w c2954w2 = this.f9625h;
                C2942k c2942k = (C2942k) this.f9628k;
                long j4 = this.f9626i;
                C2944m c2944m = (C2944m) this.f9629l;
                int i10 = this.f9627j;
                if (c2954w2.m6361f(c2942k, j4)) {
                    if (c2944m == null) {
                        int i11 = i10 + 1;
                        if (i11 >= 120) {
                            c2954w2.f9677d.remove(c2942k.f9647a);
                            String str4 = c2942k.f9648b;
                            long j5 = c2942k.f9649c;
                            long j10 = c2942k.f9650d;
                            String str5 = c2942k.f9656j;
                            StringBuilder sbM2259v = AbstractC0921a.m2259v("[Hchat:TextSpeech] 等待语音文件超时: talker=", str4, " msgId=", j5);
                            AbstractC2091b.m5172s(sbM2259v, " msgSvrId=", j10, " ");
                            sbM2259v.append(str5);
                            AbstractC1184v0.m3203m(sbM2259v.toString());
                        } else {
                            c2954w2.f9675b.postDelayed(new RunnableC2938h(c2954w2, c2942k, j4, i11), 500L);
                        }
                        break;
                    } else {
                        c2954w2.f9677d.remove(c2942k.f9647a);
                        C2946o c2946o = new C2946o(c2944m.f9657a, c2944m.f9658b);
                        if (c2954w2.m6374y().m6377b("text_speech_enable")) {
                            c2954w2.f9676c.addLast(c2946o);
                            c2954w2.m6366n();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2936g(C2954w c2954w, C2942k c2942k, long j3, C2944m c2944m, int i9) {
        this.f9625h = c2954w;
        this.f9628k = c2942k;
        this.f9626i = j3;
        this.f9629l = c2944m;
        this.f9627j = i9;
    }
}
