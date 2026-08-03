package p080fb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: fb.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1157o1 {

    /* JADX INFO: renamed from: b */
    public static TextToSpeech f3842b;

    /* JADX INFO: renamed from: c */
    public static boolean f3843c;

    /* JADX INFO: renamed from: a */
    public static final Handler f3841a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public static String f3844d = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2978a(String str) {
        TextToSpeech textToSpeech = f3842b;
        if (textToSpeech != null) {
            textToSpeech.speak(str, 0, new Bundle(), AbstractC0255e.m1018g(System.currentTimeMillis(), "hchat_script_agent_"));
        }
    }
}
