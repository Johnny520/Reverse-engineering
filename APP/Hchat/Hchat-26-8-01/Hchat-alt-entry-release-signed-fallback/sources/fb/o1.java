package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f3688a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static android.speech.tts.TextToSpeech f3689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static java.lang.String f3691d;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            fb.o1.f3688a = r0
            java.lang.String r0 = ""
            fb.o1.f3691d = r0
            return
    }

    public static void a(java.lang.String r5) {
            android.speech.tts.TextToSpeech r0 = fb.o1.f3689b
            if (r0 == 0) goto L17
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "hchat_script_agent_"
            java.lang.String r2 = bc.e.g(r2, r4)
            r3 = 0
            r0.speak(r5, r3, r1, r2)
        L17:
            return
    }
}
