package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class VoiceAssistantHook {
    private static final java.lang.String DY_AUDIO_DIR = null;
    private static final java.lang.String DY_IM_AUDIO_DIR = null;
    private static final java.lang.String KEY_AUDIO_DIR_URI = null;
    private static final java.lang.String KEY_TTS_KEY = null;
    private static final java.lang.String PREFS_NAME = null;
    private static final int REQ_PICK_AUDIO_DIR = 9527;
    private static final java.lang.String TAG = null;
    private static final java.lang.String TTS_API_URL = null;
    private static java.lang.ref.WeakReference<android.widget.ListView> audioListViewRef;
    private static java.util.List<kevin.fun.hook.VoiceAssistantHook.AudioItem> cachedAudioItems;
    private static java.lang.ref.WeakReference<android.app.Activity> currentActivityRef;
    private static java.lang.String currentTtsAudioPath;
    private static java.lang.String currentTtsAudioUrl;
    private static int currentTtsCost;
    private static long currentTtsDuration;
    private static int currentTtsRemaining;
    private static java.lang.ref.WeakReference<android.app.Dialog> dialogRef;
    private static java.util.concurrent.ExecutorService executorService;
    private static java.lang.String generatedAudioUrl;
    private static boolean isInitialized;
    private static long lastScanTime;
    private static android.os.Handler mainHandler;
    private static android.media.MediaPlayer mediaPlayer;
    private static java.lang.Runnable onReplaceCompleteCallback;
    private static final java.lang.Object playerLock = null;
    private static java.lang.ref.WeakReference<android.widget.Button> replaceBtnRef;
    private static android.net.Uri selectedAudio;
    private static java.lang.String selectedVoiceId;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f388short = null;
    private static java.lang.ref.WeakReference<android.widget.TextView> statusTextRef;
    private static java.lang.ref.WeakReference<android.widget.TextView> tabLocalRef;
    private static java.lang.ref.WeakReference<android.widget.TextView> tabTtsRef;
    private static java.lang.String targetReplaceDir;
    private static java.lang.String ttsApiKey;
    private static boolean ttsBreakClone;
    private static boolean ttsFlash;
    private static int ttsProbabilityOptimization;
    private static int ttsRandomness;
    private static int ttsSeed;
    private static boolean ttsSharpen;
    private static java.lang.ref.WeakReference<android.widget.Spinner> ttsSpinnerRef;
    private static boolean ttsSrt;
    private static int ttsStabilityBoost;
    private static java.lang.ref.WeakReference<android.widget.TextView> ttsStatusTextRef;
    private static boolean ttsStream;
    private static java.util.Map<java.lang.String, java.lang.String> voiceList;


    private static class AudioAdapter extends android.widget.BaseAdapter {
        private final java.lang.ref.WeakReference<android.app.Activity> activityRef;
        private final java.util.List<kevin.fun.hook.VoiceAssistantHook.AudioItem> items;

        static {
                return
        }

        AudioAdapter(android.app.Activity r3, java.util.List<kevin.fun.hook.VoiceAssistantHook.AudioItem> r4) {
                r2 = this;
                r2.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r2.activityRef = r0
                r2.items = r4
                int r1 = androidx.loader.C1098.m2793()
                r0 = 1616(0x650, float:2.264E-42)
            L12:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L18;
                    case 49: goto L1b;
                    case 204: goto L20;
                    case 239: goto L2f;
                    default: goto L17;
                }
            L17:
                goto L12
            L18:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L12
            L1b:
                if (r1 < 0) goto L18
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L12
            L20:
                java.lang.String r0 = "JF3TX"
                java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L2f:
                return
        }

        /* JADX INFO: renamed from: ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
        public static java.util.List m7596(java.lang.Object r2) {
                int r1 = androidx.vectordrawable.C1105.m3314()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.VoiceAssistantHook$AudioAdapter r2 = (kevin.fun.hook.VoiceAssistantHook.AudioAdapter) r2
                java.util.List<kevin.fun.hook.VoiceAssistantHook$AudioItem> r0 = r2.items
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۟ۡۤۥۦ, reason: not valid java name and contains not printable characters */
        public static int m7597(java.lang.Object r2, float r3) {
                int r1 = androidx.appcompat.C1069.m747()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                android.content.Context r2 = (android.content.Context) r2
                int r0 = kevin.fun.hook.VoiceAssistantHook._$$Nest$smdpToPx(r2, r3)
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۣ۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
        public static android.net.Uri m7598() {
                int r1 = kevin.fun.hook.audio.C1117.m8167()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 < 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                android.net.Uri r0 = kevin.fun.hook.VoiceAssistantHook._$$Nest$sfgetselectedAudio()
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۡ۟ۧۡ, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7599(java.lang.Object r2) {
                int r1 = androidx.vectordrawable.C1105.m3314()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.VoiceAssistantHook$AudioItem r2 = (kevin.fun.hook.VoiceAssistantHook.AudioItem) r2
                java.lang.String r0 = r2.name
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۤۦ۟ۥ, reason: not valid java name and contains not printable characters */
        public static android.net.Uri m7600(java.lang.Object r2) {
                int r1 = org.luckypray.dexkit.C1125.m10627()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.VoiceAssistantHook$AudioItem r2 = (kevin.fun.hook.VoiceAssistantHook.AudioItem) r2
                android.net.Uri r0 = r2.uri
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۥۨۥۥ, reason: contains not printable characters */
        public static java.lang.ref.WeakReference m7601(java.lang.Object r2) {
                int r1 = androidx.lifecycle.livedata.C1086.m1929()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.VoiceAssistantHook$AudioAdapter r2 = (kevin.fun.hook.VoiceAssistantHook.AudioAdapter) r2
                java.lang.ref.WeakReference<android.app.Activity> r0 = r2.activityRef
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                java.util.List r0 = m7596(r1)
                int r0 = androidx.lifecycle.livedata.C1086.m1931(r0)
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                java.util.List r0 = m7596(r1)
                java.lang.Object r0 = androidx.drawerlayout.C1077.m1311(r0, r2)
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
                r7 = this;
                r6 = 1097859072(0x41700000, float:15.0)
                r5 = 1094713344(0x41400000, float:12.0)
                java.lang.ref.WeakReference r0 = m7601(r7)
                java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                r1 = 1616(0x650, float:2.264E-42)
            L10:
                r1 = r1 ^ 1633(0x661, float:2.288E-42)
                switch(r1) {
                    case 14: goto L16;
                    case 49: goto L19;
                    case 204: goto L1e;
                    case 239: goto L28;
                    default: goto L15;
                }
            L15:
                goto L10
            L16:
                r1 = 1678(0x68e, float:2.351E-42)
                goto L10
            L19:
                if (r0 != 0) goto L16
                r1 = 1709(0x6ad, float:2.395E-42)
                goto L10
            L1e:
                android.view.View r9 = new android.view.View
                android.content.Context r0 = androidx.customview.C1074.m48(r10)
                r9.<init>(r0)
            L27:
                return r9
            L28:
                r1 = 1740(0x6cc, float:2.438E-42)
            L2a:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L30;
                    case 54: goto L35;
                    case 471: goto L47;
                    case 500: goto L38;
                    default: goto L2f;
                }
            L2f:
                goto L2a
            L30:
                if (r9 != 0) goto L35
                r1 = 1833(0x729, float:2.569E-42)
                goto L2a
            L35:
                r1 = 1802(0x70a, float:2.525E-42)
                goto L2a
            L38:
                android.view.LayoutInflater r1 = androidx.lifecycle.runtime.C1092.m2305(r0)
                r2 = -17367402(0xfffffffffef6fe96, float:-1.6415599E38)
                int r3 = kevin.fun.hook.webdav.C1118.f417
                r2 = r2 ^ r3
                r3 = 0
                android.view.View r9 = androidx.activity.C1062.m166(r1, r2, r10, r3)
            L47:
                r1 = -16908732(0xfffffffffefdfe44, float:-1.6880745E38)
                int r2 = androidx.lifecycle.process.C1090.f116
                r1 = r1 ^ r2
                android.view.View r1 = androidx.lifecycle.livedata.C1086.m1913(r9, r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.util.List r2 = m7596(r7)
                java.lang.Object r2 = androidx.drawerlayout.C1077.m1311(r2, r8)
                kevin.fun.hook.VoiceAssistantHook$AudioItem r2 = (kevin.fun.hook.VoiceAssistantHook.AudioItem) r2
                java.lang.String r3 = m7599(r2)
                androidx.lifecycle.process.C1087.m1946(r1, r3)
                r3 = -16776948(0xffffffffff00010c, float:-1.7014662E38)
                int r4 = androidx.vectordrawable.C1103.f129
                r3 = r3 ^ r4
                kevin.fun.hook.webdav.C1118.m8517(r1, r3)
                r3 = 1096810496(0x41600000, float:14.0)
                androidx.vectordrawable.animated.C1102.m3105(r1, r3)
                android.text.TextUtils$TruncateAt r3 = androidx.core.C1073.m1025()
                androidx.vectordrawable.C1103.m3165(r1, r3)
                r3 = 1
                androidx.loader.C1094.m2457(r1, r3)
                int r1 = m7597(r0, r6)
                int r3 = m7597(r0, r5)
                int r4 = m7597(r0, r6)
                int r0 = m7597(r0, r5)
                kevin.fun.hook.webdav.C1119.m8548(r9, r1, r3, r4, r0)
                android.net.Uri r1 = m7598()
                r0 = 1864(0x748, float:2.612E-42)
            L96:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L9c;
                    case 47384: goto Ldf;
                    case 47417: goto La6;
                    case 47483: goto La2;
                    default: goto L9b;
                }
            L9b:
                goto L96
            L9c:
                if (r1 == 0) goto La2
                r0 = 48736(0xbe60, float:6.8294E-41)
                goto L96
            La2:
                r0 = 48705(0xbe41, float:6.825E-41)
                goto L96
            La6:
                android.net.Uri r0 = m7598()
                android.net.Uri r1 = m7600(r2)
                boolean r1 = androidx.activity.C1066.m489(r0, r1)
                r0 = 48767(0xbe7f, float:6.8337E-41)
            Lb5:
                r2 = 48784(0xbe90, float:6.8361E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 14: goto Lbd;
                    case 45: goto Ldf;
                    case 76: goto Lc7;
                    case 239: goto Lc1;
                    default: goto Lbc;
                }
            Lbc:
                goto Lb5
            Lbd:
                r0 = 48829(0xbebd, float:6.8424E-41)
                goto Lb5
            Lc1:
                if (r1 == 0) goto Lbd
                r0 = 48860(0xbedc, float:6.8467E-41)
                goto Lb5
            Lc7:
                r0 = 1838390(0x1c0d36, float:2.576133E-39)
                int r1 = androidx.activity.C1065.f91
                r0 = r0 ^ r1
                androidx.loader.C1099.m2849(r9, r0)
                r0 = 48891(0xbefb, float:6.8511E-41)
            Ld3:
                r1 = 48908(0xbf0c, float:6.8535E-41)
                r0 = r0 ^ r1
                switch(r0) {
                    case 22: goto L27;
                    case 503: goto Ldb;
                    default: goto Lda;
                }
            Lda:
                goto Ld3
            Ldb:
                r0 = 48922(0xbf1a, float:6.8554E-41)
                goto Ld3
            Ldf:
                int r0 = androidx.vectordrawable.C1105.f131
                r0 = r0 ^ (-359(0xfffffffffffffe99, float:NaN))
                androidx.loader.C1099.m2849(r9, r0)
                goto L27
        }
    }

    private static class AudioItem {
        java.lang.String name;
        android.net.Uri uri;

        static {
                return
        }

        private AudioItem() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.lifecycle.process.C1088.m2011()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L22;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "eEjzZJytve"
                java.lang.String r0 = androidx.interpolator.C1082.m1668(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L22:
                return
        }

        /* synthetic */ AudioItem(kevin.fun.hook.VoiceAssistantHookIA r3) {
                r2 = this;
                r2.<init>()
                int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "crRRUCXeT7U"
                java.lang.String r0 = androidx.core.C1072.m925(r0)
                java.lang.Long r0 = java.lang.Long.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    static class HttpApi {
        private static final okhttp3.OkHttpClient client = null;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f389short = null;

        static {
                r0 = 55
                short[] r0 = new short[r0]
                r0 = {x002c: FILL_ARRAY_DATA , data: [14859, -32266, -25112, 22706, 26704, 14858, 2619, 2643, 2639, 2639, 2635, 2619, 2652, 2654, 2639, 21785, 21539, 2593, 2619, 2994, 2979, 2979, 3007, 3002, 2992, 2994, 2983, 3002, 3004, 3005, 3068, 3001, 2976, 3004, 3005, 14604, -32015, -24849, 23477, 27479, 14605, 2364, 2388, 2376, 2376, 2380, 2364, 2380, 2387, 2383, 2376, 22046, 22308, 2342, 2364} // fill-array
                kevin.fun.hook.VoiceAssistantHook.HttpApi.f389short = r0
                okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
                r0.<init>()
                java.util.concurrent.TimeUnit r1 = androidx.interpolator.C1081.m1572()
                r2 = -43
                int r4 = androidx.activity.C1065.f91
                long r4 = (long) r4
                long r2 = r2 ^ r4
                okhttp3.OkHttpClient$Builder r0 = m7605(r0, r2, r1)
                java.util.concurrent.TimeUnit r1 = androidx.interpolator.C1081.m1572()
                okhttp3.OkHttpClient$Builder r0 = m7607(r0, r2, r1)
                okhttp3.OkHttpClient r0 = m7604(r0)
                kevin.fun.hook.VoiceAssistantHook.HttpApi.client = r0
                return
        }

        HttpApi() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.loader.C1097.m2731()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 < 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "qAtWxvw"
                java.lang.String r0 = androidx.loader.C1095.m2606(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }

        public static java.lang.String get(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
                okhttp3.Request$Builder r1 = new okhttp3.Request$Builder     // Catch: java.io.IOException -> L84
                r1.<init>()     // Catch: java.io.IOException -> L84
                okhttp3.Request$Builder r1 = m7616(r1, r7)     // Catch: java.io.IOException -> L84
                okhttp3.Request$Builder r3 = m7618(r1)     // Catch: java.io.IOException -> L84
                r1 = 1616(0x650, float:2.264E-42)
            Lf:
                r1 = r1 ^ 1633(0x661, float:2.288E-42)
                switch(r1) {
                    case 14: goto L15;
                    case 49: goto L18;
                    case 204: goto L1d;
                    case 239: goto L6b;
                    default: goto L14;
                }     // Catch: java.io.IOException -> L84
            L14:
                goto Lf
            L15:
                r1 = 1678(0x68e, float:2.351E-42)
                goto Lf
            L18:
                if (r8 == 0) goto L15
                r1 = 1709(0x6ad, float:2.395E-42)
                goto Lf
            L1d:
                java.util.Set r1 = androidx.core.C1072.m926(r8)     // Catch: java.io.IOException -> L84
                java.util.Iterator r4 = kevin.fun.hook.C1120.m8611(r1)     // Catch: java.io.IOException -> L84
            L25:
                boolean r2 = androidx.activity.C1063.m269(r4)     // Catch: java.io.IOException -> L84
                r1 = 1740(0x6cc, float:2.438E-42)
            L2b:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L31;
                    case 54: goto L36;
                    case 471: goto L45;
                    case 500: goto L39;
                    default: goto L30;
                }     // Catch: java.io.IOException -> L84
            L30:
                goto L2b
            L31:
                if (r2 != 0) goto L36
                r1 = 1833(0x729, float:2.569E-42)
                goto L2b
            L36:
                r1 = 1802(0x70a, float:2.525E-42)
                goto L2b
            L39:
                r1 = 1864(0x748, float:2.612E-42)
            L3b:
                r1 = r1 ^ 1881(0x759, float:2.636E-42)
                switch(r1) {
                    case 17: goto L41;
                    case 47483: goto L6b;
                    default: goto L40;
                }     // Catch: java.io.IOException -> L84
            L40:
                goto L3b
            L41:
                r1 = 48674(0xbe22, float:6.8207E-41)
                goto L3b
            L45:
                java.lang.Object r1 = androidx.core.ktx.C1071.m870(r4)     // Catch: java.io.IOException -> L84
                r0 = r1
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.io.IOException -> L84
                r2 = r0
                java.lang.Object r1 = androidx.viewpager.C1108.m3495(r2)     // Catch: java.io.IOException -> L84
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L84
                java.lang.Object r2 = kevin.fun.hook.C1120.m8633(r2)     // Catch: java.io.IOException -> L84
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.IOException -> L84
                m7613(r3, r1, r2)     // Catch: java.io.IOException -> L84
                r1 = 48767(0xbe7f, float:6.8337E-41)
            L5f:
                r2 = 48784(0xbe90, float:6.8361E-41)
                r1 = r1 ^ r2
                switch(r1) {
                    case 14: goto L25;
                    case 239: goto L67;
                    default: goto L66;
                }     // Catch: java.io.IOException -> L84
            L66:
                goto L5f
            L67:
                r1 = 48798(0xbe9e, float:6.838E-41)
                goto L5f
            L6b:
                okhttp3.OkHttpClient r1 = m7609()     // Catch: java.io.IOException -> L84
                okhttp3.Request r2 = m7606(r3)     // Catch: java.io.IOException -> L84
                okhttp3.Call r1 = m7615(r1, r2)     // Catch: java.io.IOException -> L84
                okhttp3.Response r1 = m7611(r1)     // Catch: java.io.IOException -> L84
                okhttp3.ResponseBody r1 = m7610(r1)     // Catch: java.io.IOException -> L84
                java.lang.String r1 = m7603(r1)     // Catch: java.io.IOException -> L84
            L83:
                return r1
            L84:
                r1 = move-exception
                java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1366(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                short[] r3 = m7608()
                r4 = 0
                int r5 = org.luckypray.dexkit.C1123.f433
                r5 = r5 ^ (-982(0xfffffffffffffc2a, float:NaN))
                r6 = 2587(0xa1b, float:3.625E-42)
                java.lang.String r3 = androidx.vectordrawable.C1104.m3232(r3, r4, r5, r6)
                java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
                java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
                java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
                m7614(r1)
                r1 = 0
                goto L83
        }

        public static java.lang.String post(java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
                short[] r1 = m7608()     // Catch: java.io.IOException -> L9c
                r2 = 19
                int r3 = com.tencent.mmkv.C1109.f135     // Catch: java.io.IOException -> L9c
                r3 = r3 ^ (-504(0xfffffffffffffe08, float:NaN))
                r4 = 3027(0xbd3, float:4.242E-42)
                java.lang.String r1 = androidx.loader.C1095.m2574(r1, r2, r3, r4)     // Catch: java.io.IOException -> L9c
                okhttp3.MediaType r1 = m7612(r1)     // Catch: java.io.IOException -> L9c
                okhttp3.RequestBody r1 = m7617(r1, r8)     // Catch: java.io.IOException -> L9c
                okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch: java.io.IOException -> L9c
                r2.<init>()     // Catch: java.io.IOException -> L9c
                okhttp3.Request$Builder r2 = m7616(r2, r7)     // Catch: java.io.IOException -> L9c
                okhttp3.Request$Builder r3 = m7602(r2, r1)     // Catch: java.io.IOException -> L9c
                r1 = 1616(0x650, float:2.264E-42)
            L27:
                r1 = r1 ^ 1633(0x661, float:2.288E-42)
                switch(r1) {
                    case 14: goto L2d;
                    case 49: goto L30;
                    case 204: goto L35;
                    case 239: goto L83;
                    default: goto L2c;
                }     // Catch: java.io.IOException -> L9c
            L2c:
                goto L27
            L2d:
                r1 = 1678(0x68e, float:2.351E-42)
                goto L27
            L30:
                if (r9 == 0) goto L2d
                r1 = 1709(0x6ad, float:2.395E-42)
                goto L27
            L35:
                java.util.Set r1 = androidx.core.C1072.m926(r9)     // Catch: java.io.IOException -> L9c
                java.util.Iterator r4 = kevin.fun.hook.C1120.m8611(r1)     // Catch: java.io.IOException -> L9c
            L3d:
                boolean r2 = androidx.activity.C1063.m269(r4)     // Catch: java.io.IOException -> L9c
                r1 = 1740(0x6cc, float:2.438E-42)
            L43:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L49;
                    case 54: goto L4e;
                    case 471: goto L5d;
                    case 500: goto L51;
                    default: goto L48;
                }     // Catch: java.io.IOException -> L9c
            L48:
                goto L43
            L49:
                if (r2 != 0) goto L4e
                r1 = 1833(0x729, float:2.569E-42)
                goto L43
            L4e:
                r1 = 1802(0x70a, float:2.525E-42)
                goto L43
            L51:
                r1 = 1864(0x748, float:2.612E-42)
            L53:
                r1 = r1 ^ 1881(0x759, float:2.636E-42)
                switch(r1) {
                    case 17: goto L59;
                    case 47483: goto L83;
                    default: goto L58;
                }     // Catch: java.io.IOException -> L9c
            L58:
                goto L53
            L59:
                r1 = 48674(0xbe22, float:6.8207E-41)
                goto L53
            L5d:
                java.lang.Object r1 = androidx.core.ktx.C1071.m870(r4)     // Catch: java.io.IOException -> L9c
                r0 = r1
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.io.IOException -> L9c
                r2 = r0
                java.lang.Object r1 = androidx.viewpager.C1108.m3495(r2)     // Catch: java.io.IOException -> L9c
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L9c
                java.lang.Object r2 = kevin.fun.hook.C1120.m8633(r2)     // Catch: java.io.IOException -> L9c
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.IOException -> L9c
                m7613(r3, r1, r2)     // Catch: java.io.IOException -> L9c
                r1 = 48767(0xbe7f, float:6.8337E-41)
            L77:
                r2 = 48784(0xbe90, float:6.8361E-41)
                r1 = r1 ^ r2
                switch(r1) {
                    case 14: goto L3d;
                    case 239: goto L7f;
                    default: goto L7e;
                }     // Catch: java.io.IOException -> L9c
            L7e:
                goto L77
            L7f:
                r1 = 48798(0xbe9e, float:6.838E-41)
                goto L77
            L83:
                okhttp3.OkHttpClient r1 = m7609()     // Catch: java.io.IOException -> L9c
                okhttp3.Request r2 = m7606(r3)     // Catch: java.io.IOException -> L9c
                okhttp3.Call r1 = m7615(r1, r2)     // Catch: java.io.IOException -> L9c
                okhttp3.Response r1 = m7611(r1)     // Catch: java.io.IOException -> L9c
                okhttp3.ResponseBody r1 = m7610(r1)     // Catch: java.io.IOException -> L9c
                java.lang.String r1 = m7603(r1)     // Catch: java.io.IOException -> L9c
            L9b:
                return r1
            L9c:
                r1 = move-exception
                java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1366(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                short[] r3 = m7608()
                r4 = 35
                int r5 = kevin.fun.hook.audio.C1115.f404
                r5 = r5 ^ 822(0x336, float:1.152E-42)
                r6 = 2332(0x91c, float:3.268E-42)
                java.lang.String r3 = kevin.fun.hook.audio.C1117.m8169(r3, r4, r5, r6)
                java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
                java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
                java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
                m7614(r1)
                r1 = 0
                goto L9b
        }

        /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
        public static okhttp3.Request.Builder m7602(java.lang.Object r2, java.lang.Object r3) {
                int r1 = androidx.versionedparcelable.C1107.m3467()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
                okhttp3.RequestBody r3 = (okhttp3.RequestBody) r3
                okhttp3.Request$Builder r0 = r2.post(r3)
            L1c:
                return r0
            L1d:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L20:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L26;
                    case 54: goto L1c;
                    default: goto L25;
                }
            L25:
                goto L20
            L26:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L20
        }

        /* JADX INFO: renamed from: ۟۟ۨۦۦ, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7603(java.lang.Object r2) {
                int r1 = androidx.interpolator.C1083.m1725()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.ResponseBody r2 = (okhttp3.ResponseBody) r2
                java.lang.String r0 = r2.string()
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۟۠ۤ۠ۦ, reason: not valid java name and contains not printable characters */
        public static okhttp3.OkHttpClient m7604(java.lang.Object r2) {
                int r1 = org.luckypray.dexkit.C1123.m10509()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 < 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.OkHttpClient$Builder r2 = (okhttp3.OkHttpClient.Builder) r2
                okhttp3.OkHttpClient r0 = r2.build()
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۟ۡۤۨ۠, reason: not valid java name and contains not printable characters */
        public static okhttp3.OkHttpClient.Builder m7605(java.lang.Object r3, long r4, java.lang.Object r6) {
                int r1 = kevin.fun.hook.audio.C1117.m8167()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 < 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.OkHttpClient$Builder r3 = (okhttp3.OkHttpClient.Builder) r3
                java.util.concurrent.TimeUnit r6 = (java.util.concurrent.TimeUnit) r6
                okhttp3.OkHttpClient$Builder r0 = r3.connectTimeout(r4, r6)
            L1c:
                return r0
            L1d:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L20:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L26;
                    case 54: goto L1c;
                    default: goto L25;
                }
            L25:
                goto L20
            L26:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L20
        }

        /* JADX INFO: renamed from: ۟ۢۥ۠ۨ, reason: not valid java name and contains not printable characters */
        public static okhttp3.Request m7606(java.lang.Object r2) {
                int r1 = androidx.activity.C1062.m182()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
                okhttp3.Request r0 = r2.build()
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۟ۢۨۥۢ, reason: not valid java name and contains not printable characters */
        public static okhttp3.OkHttpClient.Builder m7607(java.lang.Object r3, long r4, java.lang.Object r6) {
                int r1 = androidx.vectordrawable.animated.C1102.m3110()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 < 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.OkHttpClient$Builder r3 = (okhttp3.OkHttpClient.Builder) r3
                java.util.concurrent.TimeUnit r6 = (java.util.concurrent.TimeUnit) r6
                okhttp3.OkHttpClient$Builder r0 = r3.readTimeout(r4, r6)
            L1c:
                return r0
            L1d:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L20:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L26;
                    case 54: goto L1c;
                    default: goto L25;
                }
            L25:
                goto L20
            L26:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L20
        }

        /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
        public static short[] m7608() {
                int r1 = kevin.fun.hook.webdav.C1119.m8565()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L17;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                short[] r0 = kevin.fun.hook.VoiceAssistantHook.HttpApi.f389short
            L16:
                return r0
            L17:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1a:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L20;
                    case 54: goto L16;
                    default: goto L1f;
                }
            L1f:
                goto L1a
            L20:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1a
        }

        /* JADX INFO: renamed from: ۟ۤۥۣ۠, reason: not valid java name and contains not printable characters */
        public static okhttp3.OkHttpClient m7609() {
                int r1 = androidx.interpolator.C1081.m1643()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L17;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.OkHttpClient r0 = kevin.fun.hook.VoiceAssistantHook.HttpApi.client
            L16:
                return r0
            L17:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1a:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L20;
                    case 54: goto L16;
                    default: goto L1f;
                }
            L1f:
                goto L1a
            L20:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1a
        }

        /* JADX INFO: renamed from: ۟ۤۦۥۧ, reason: not valid java name and contains not printable characters */
        public static okhttp3.ResponseBody m7610(java.lang.Object r2) {
                int r1 = androidx.lifecycle.process.C1089.m2142()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Response r2 = (okhttp3.Response) r2
                okhttp3.ResponseBody r0 = r2.body()
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۟ۥ۠۠۟, reason: not valid java name and contains not printable characters */
        public static okhttp3.Response m7611(java.lang.Object r2) {
                int r1 = androidx.loader.C1094.m2490()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Call r2 = (okhttp3.Call) r2
                okhttp3.Response r0 = r2.execute()
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۟ۦۧۥ۟, reason: not valid java name and contains not printable characters */
        public static okhttp3.MediaType m7612(java.lang.Object r2) {
                int r1 = androidx.lifecycle.livedata.C1085.m1819()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.lang.String r2 = (java.lang.String) r2
                okhttp3.MediaType r0 = okhttp3.MediaType.parse(r2)
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۡ۠۠ۢ, reason: not valid java name and contains not printable characters */
        public static okhttp3.Request.Builder m7613(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                int r1 = androidx.interpolator.C1081.m1643()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1f;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = (java.lang.String) r4
                okhttp3.Request$Builder r0 = r2.addHeader(r3, r4)
            L1e:
                return r0
            L1f:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L22:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L28;
                    case 54: goto L1e;
                    default: goto L27;
                }
            L27:
                goto L22
            L28:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L22
        }

        /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
        public static void m7614(java.lang.Object r2) {
                int r1 = androidx.activity.C1064.m377()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L39;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.lang.String r2 = (java.lang.String) r2
                de.robv.android.xposed.XposedBridge.log(r2)
            L19:
                int r1 = androidx.lifecycle.livedata.C1085.m1819()
                r0 = 1740(0x6cc, float:2.438E-42)
            L1f:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L25;
                    case 54: goto L2a;
                    case 471: goto L38;
                    case 500: goto L2d;
                    default: goto L24;
                }
            L24:
                goto L1f
            L25:
                if (r1 > 0) goto L2a
                r0 = 1833(0x729, float:2.569E-42)
                goto L1f
            L2a:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L1f
            L2d:
                java.lang.String r0 = "QzRSYlO"
                java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L38:
                return
            L39:
                r0 = 1864(0x748, float:2.612E-42)
            L3b:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L41;
                    case 47483: goto L19;
                    default: goto L40;
                }
            L40:
                goto L3b
            L41:
                r0 = 48674(0xbe22, float:6.8207E-41)
                goto L3b
        }

        /* JADX INFO: renamed from: ۥۦۦ۟, reason: contains not printable characters */
        public static okhttp3.Call m7615(java.lang.Object r2, java.lang.Object r3) {
                int r1 = androidx.lifecycle.process.C1089.m2142()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.OkHttpClient r2 = (okhttp3.OkHttpClient) r2
                okhttp3.Request r3 = (okhttp3.Request) r3
                okhttp3.Call r0 = r2.newCall(r3)
            L1c:
                return r0
            L1d:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L20:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L26;
                    case 54: goto L1c;
                    default: goto L25;
                }
            L25:
                goto L20
            L26:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L20
        }

        /* JADX INFO: renamed from: ۧۢۧ۠, reason: not valid java name and contains not printable characters */
        public static okhttp3.Request.Builder m7616(java.lang.Object r2, java.lang.Object r3) {
                int r1 = androidx.interpolator.C1082.m1718()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
                java.lang.String r3 = (java.lang.String) r3
                okhttp3.Request$Builder r0 = r2.url(r3)
            L1c:
                return r0
            L1d:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L20:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L26;
                    case 54: goto L1c;
                    default: goto L25;
                }
            L25:
                goto L20
            L26:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L20
        }

        /* JADX INFO: renamed from: ۧۥۧ۟, reason: not valid java name and contains not printable characters */
        public static okhttp3.RequestBody m7617(java.lang.Object r2, java.lang.Object r3) {
                int r1 = androidx.viewpager.C1108.m3542()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.MediaType r2 = (okhttp3.MediaType) r2
                java.lang.String r3 = (java.lang.String) r3
                okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r2, r3)
            L1c:
                return r0
            L1d:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L20:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L26;
                    case 54: goto L1c;
                    default: goto L25;
                }
            L25:
                goto L20
            L26:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L20
        }

        /* JADX INFO: renamed from: ۨۤ۠ۥ, reason: not valid java name and contains not printable characters */
        public static okhttp3.Request.Builder m7618(java.lang.Object r2) {
                int r1 = kevin.fun.hook.audio.C1116.m8064()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
                okhttp3.Request$Builder r0 = r2.get()
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }
    }

    static {
            r6 = 0
            r5 = 0
            r4 = 0
            r0 = 2004(0x7d4, float:2.808E-42)
            short[] r0 = new short[r0]
            r0 = {x00f6: FILL_ARRAY_DATA , data: [1091, 1032, 1037, 1048, 1037, 1091, 1049, 1055, 1033, 1054, 1091, 1116, 1091, 1039, 1027, 1025, 1090, 1055, 1055, 1090, 1037, 1026, 1032, 1054, 1027, 1029, 1032, 1090, 1049, 1035, 1039, 1090, 1037, 1051, 1033, 1025, 1033, 1091, 1034, 1029, 1024, 1033, 1055, 1091, 1039, 1027, 1025, 1025, 1033, 1026, 1048, 1091, 1037, 1049, 1032, 1029, 1027, 1091, 2182, 2253, 2248, 2269, 2248, 2182, 2268, 2266, 2252, 2267, 2182, 2201, 2182, 2250, 2246, 2244, 2183, 2266, 2266, 2183, 2248, 2247, 2253, 2267, 2246, 2240, 2253, 2183, 2268, 2254, 2250, 2183, 2248, 2270, 2252, 2244, 2252, 2182, 2255, 2240, 2245, 2252, 2266, 2182, 2240, 2244, 2182, 461, 473, 456, 453, 451, 499, 456, 453, 478, 499, 473, 478, 453, 402, 402, 405, 441, 391, 406, 399, 441, 397, 387, 415, 301, 308, 306, 312, 318, 260, 314, 296, 296, 306, 296, 303, 314, 309, 303, 14043, -29402, -28360, 21602, 25728, 14042, 2370, 2398, 2398, 2394, 2393, 2320, 2309, 2309, 2396, 2331, 2308, 2396, 2373, 2377, 2399, 2308, 2393, 2398, 2399, 2382, 2371, 2373, 2860, 2919, 2914, 2935, 2914, 2860, 2934, 2928, 2918, 2929, 2860, 2867, 2860, 2912, 2924, 2926, 2861, 2928, 2928, 2861, 2914, 2925, 2919, 2929, 2924, 2922, 2919, 2861, 2934, 2916, 2912, 2861, 2914, 2932, 2918, 2926, 2918, 2860, 2917, 2922, 2927, 2918, 2928, 2860, 2912, 2924, 2926, 2926, 2918, 2925, 2935, 2860, 2914, 2934, 2919, 2922, 2924, 2860, 13571, -28930, -27936, 22458, 26456, 13570, 1331, 8799, 1331, 22280, 23529, 24298, -28978, 27989, 23586, -30666, 1321, 1331, 22419, 23410, 24177, -29099, 28110, 23737, -30547, -25818, 27078, 27651, 23583, -25380, -27714, 28328, 17881, -3019, 21658, 25373, 25079, 25706, 21816, 26014, -28421, -11928, -10860, -27654, -25448, 24401, 24887, -30234, 23437, -1261, 25992, -27989, 24651, 29772, 24055, -27660, 24852, 29971, 23720, 24938, 20854, -28235, -24873, 28063, 21327, -30860, -31755, -24597, -32086, -24908, 23534, 27404, 10196, -190, 11540, -29215, -29940, 26370, 29412, 25063, 24375, -1158, -32496, -31372, 23426, -31898, -31349, 27013, 17629, -32502, -25324, 31843, 28512, 20912, 2761, 2761, 2761, -25996, 26772, -25202, -30705, -2713, 2505, 2505, 2510, 2530, 2507, 2514, 2516, 2526, 2520, 2530, 2510, 2509, 2516, 2515, 2515, 2520, 2511, 21273, -28988, -27062, -31797, 21422, -30255, 20372, 407, 407, 407, -29191, 25079, -30665, 22478, 27862, 26955, -32195, 22658, -26173, 27427, -25031, -28325, 27725, 18236, -25327, -28045, 28517, 17428, 17647, 20922, 24010, -2578, -32491, -25809, 28498, -31346, 27008, 1888, 1913, 1919, 1909, 1907, 1865, 1911, 1893, 1893, 1919, 1893, 1890, 1911, 1912, 1890, 2875, 2863, 2878, 2867, 2869, 2821, 2878, 2867, 2856, 2821, 2863, 2856, 2867, 13287, -30694, -27644, 20830, 25020, 13286, 983, 9403, 983, 20970, 23100, 20705, 23238, -28974, 973, 983, 2261, 2266, 2256, 2246, 2267, 2269, 2256, 2202, 2269, 2266, 2240, 2257, 2266, 2240, 2202, 2261, 2263, 2240, 2269, 2267, 2266, 2202, 2274, 2301, 2289, 2275, 2541, 2545, 2545, 2549, 2550, 2495, 2474, 2474, 2547, 2538, 2534, 2544, 2475, 2532, 2540, 23709, 25219, 26444, 19218, 23071, -28952, 19040, 28727, 28080, 24143, 1335, 1353, 1359, 1361, 1334, -29024, -28431, 2975, 2993, 2989, 22054, 17417, 20620, -2856, -32733, -26087, 24571, 21824, 32508, 32459, 28316, -32612, -31496, 23054, -32022, -31737, 26633, 32239, 28396, 20540, -31909, 23012, 24452, -26143, 30658, 18049, 22383, -31982, 30658, 2285, 2300, 2277, 2188, 2279, 2249, 2261, -30087, 20678, -28281, 25447, -27011, -31748, -30874, 24025, -31926, -31523, 26902, 22470, -31747, 28659, -31924, 23027, -30880, -32521, 27964, 21484, -30761, 27609, 2094, 2074, 2075, 2055, 2048, 2077, 2054, 2069, 2062, 2075, 2054, 2048, 2049, 2457, 2494, 2490, 2473, 2494, 2473, 2555, 3296, 3270, 3280, 3271, 3224, 3316, 3282, 3280, 3291, 3265, 830, 783, 790, 793, 784, 775, 848, 846, 849, 847, 849, 847, 863, 855, 791, 779, 779, 783, 780, 837, 848, 848, 798, 783, 790, 793, 784, 775, 849, 796, 784, 786, 854, 1349, 1385, 1384, 1394, 1379, 1384, 1394, 1323, 1362, 1407, 1398, 1379, 399, 414, 414, 386, 391, 397, 399, 410, 391, 385, 384, 449, 388, 413, 385, 384, 635, 610, 612, 622, 616, 580, 617, 1839, 1854, 1827, 1839, 270, 258, 259, 281, 264, 259, 281, 286, 2618, 2601, 2598, 2604, 2599, 2597, 2598, 2605, 2619, 2619, 1560, 1567, 1546, 1545, 1538, 1543, 1538, 1567, 1554, 1588, 1545, 1540, 1540, 1560, 1567, 293, 295, 314, 311, 308, 311, 316, 313, 316, 289, 300, 266, 314, 293, 289, 316, 312, 316, 303, 308, 289, 316, 314, 315, 550, 562, 545, 557, 549, 563, 532, 559, 523, 549, 549, 560, 2904, 2888, 2911, 2907, 2897, 2917, 2905, 2902, 2901, 2900, 2911, 2565, 2575, 2562, 2576, 2571, 2019, 2040, 2033, 2018, 2016, 2037, 2046, 1541, 1538, 1540, 1555, 1559, 1563, 498, 499, 501, 2360, 2350, 2350, 2351, 2614, 2602, 2602, 2606, 2605, 2660, 2673, 2673, 2600, 2671, 2672, 2600, 2609, 2621, 2603, 2672, 2605, 2602, 2603, 2618, 2615, 2609, 2673, 2623, 2606, 2615, 2673, 2602, 2602, 2605, 2673, 2617, 2619, 2608, 2619, 2604, 2623, 2602, 2619, 2285, 2262, 2265, 2253, 2252, 2256, 2263, 2250, 2257, 2242, 2269, 2268, 2052, 2051, 2070, 2051, 2050, 2052, 1723, 1726, 1707, 1726, 3279, 3266, 847, 839, 849, 849, 835, 837, 839, 2447, 2472, 2485, 2483, 2464, 2464, 2479, 2469, 2479, 2467, 2472, 2482, 2534, 2437, 2484, 2467, 2466, 2479, 2482, 13134, -30541, -27475, 20983, 24853, 13135, 894, 778, 778, 781, -29646, 24636, 23644, 23910, 868, 894, -30170, 26152, 23675, -30609, -1456, 1281, 1327, 1331, 24746, 24578, 2792, 2758, 2778, 28483, 28651, -2641, -32428, 25187, 27974, -25618, 30157, 31326, 28567, 17642, -30892, -2581, -32496, 23458, 23259, 25356, 22176, 23299, 23097, -1253, 2776, 2768, 2758, 2758, 2772, 2770, 2768, 27583, 31600, -26228, -30854, -29592, 24678, 23093, -29151, -994, -30370, 25936, 22832, 22538, -1752, -30126, 26204, -30533, 24776, -1486, -28983, -27405, -28949, 630, 565, 620, 569, 3300, 3300, 3299, 3279, 2122, 2122, 2125, 2145, 2122, 2139, 2131, 2126, 2145, 3240, 3307, 3318, 3253, 13489, -28852, -27822, 22024, 26346, 13488, 1153, -29747, 26563, 23952, -30332, -1107, 19422, 29065, 1260, 1265, 1170, 24984, 20655, 31649, 1179, 1153, 14503, -31910, -24764, 23070, 27388, 14502, 2199, 18108, -30774, -24764, -28634, 20870, -31342, 2189, 2199, 8544, 1605, -30455, 25863, 24041, 25717, 1647, -31118, 25491, 1631, 1605, 1600, 1537, 32695, 1605, 1561, 1605, 27629, -31118, 1631, 1605, 1600, 1537, 30428, 1605, 1561, 1605, 21516, 18748, 1631, 1605, 1600, 1537, 30428, 18057, -30721, -24719, -28653, 20915, -31321, 2232, 2210, 24606, 24973, 23938, -30314, -1111, 22590, 21727, -25130, -27980, 31947, 21872, 21268, -30976, 25781, 25057, 20911, 23754, -27540, -877, -30616, 21207, 21687, 24841, -27540, 23754, 20905, 19871, 25854, -30606, -27540, 12852, -30263, -27177, 20621, 24687, 12853, 516, 624, 624, 631, 25819, 24902, 23317, -28927, 542, 516, 27664, 27021, 21470, -30774, 2773, 2767, 3000, 2977, 2983, 2989, 2987, 1369, 1361, 1344, 1365, 1360, 1365, 1344, 1365, 1623, 1604, 1619, 1618, 1608, 1614, 1615, 1588, 1536, 1537, 1565, 1562, 1543, 1564, 1551, 1556, 1537, 1564, 1562, 1563, 1712, 1687, 1683, 1664, 1687, 1664, 1746, 2607, 2569, 2591, 2568, 2647, 2619, 2589, 2591, 2580, 2574, 3322, 3275, 3282, 3293, 3284, 3267, 3220, 3210, 3221, 3211, 3221, 3211, 3227, 3219, 3283, 3279, 3279, 3275, 3272, 3201, 3220, 3220, 3290, 3275, 3282, 3293, 3284, 3267, 3221, 3288, 3284, 3286, 3218, 2403, 2383, 2382, 2388, 2373, 2382, 2388, 2317, 2420, 2393, 2384, 2373, 314, 299, 299, 311, 306, 312, 314, 303, 306, 308, 309, 372, 305, 296, 308, 309, 2800, 2796, 2796, 2792, 2795, 2722, 2743, 2743, 2798, 2729, 2742, 2798, 2807, 2811, 2797, 2742, 2795, 2796, 2797, 2812, 2801, 2807, 2743, 2809, 2792, 2801, 2743, 2796, 2796, 2795, 2743, 2798, 2807, 2801, 2811, 2813, 2727, 2795, 2800, 2807, 2799, 2725, 2814, 2797, 2804, 2804, 403, 424, 423, 435, 434, 430, 425, 436, 431, 444, 419, 418, 2825, 2830, 2843, 2830, 2831, 2825, 935, 930, 951, 930, 2705, 2716, 2750, 2711, 2698, 2751, 2717, 2710, 2717, 2698, 2713, 2700, 2717, 1670, 1673, 1669, 1677, 787, 14219, -29578, -28568, 21810, 26064, 14218, 1979, 21819, -30490, -28568, -31255, 21900, -28685, 24234, -30018, 1953, 1979, 553, 618, 563, 614, 11960, 2461, 2537, 2537, 2542, -32176, -25010, 28482, 27359, 27565, 23330, 21673, 25390, 18611, 1712, 1712, 1712, 20720, 26487, 27326, 28451, 21872, -32412, 3195, 3169, 22219, 23082, -27869, -25535, 29246, 23429, 24033, -30219, 13707, -29066, -28056, 22322, 26576, 13706, 1467, 8919, 1467, 24604, 19309, -29088, 21506, 23193, 23459, 1441, 1467, 25160, 26396, 22354, 23095, -28015, -1426, -29035, 21546, 21066, 26612, -28015, 23095, 22356, 19298, 25091, -29041, -28015, 15499, -30858, -25752, 24114, 28368, 15498, 3259, 11223, 3259, 27236, 28665, 21401, 21155, 3233, 3259, 3080, 3147, 3090, 3143, 9934, 491, -30170, -27080, 26420, 25257, 25563, 21332, 13453, -28816, -27794, 22068, 26326, 13452, 1213, 24957, 26696, 25251, 32167, 1225, 1266, 1276, 1262, 1257, 1191, 1213, 13366, -28725, -27691, 22159, 26221, 13367, 1030, 25112, 32028, 1138, 1097, 1095, 1109, 1106, 23831, -30461, 1052, 1030, 14180, -29543, -28537, 21981, 25919, 14181, 1876, 21827, 25284, -28537, -31482, 21859, -28900, 24133, -30127, 1870, 1876, 970, 979, 981, 991, 985, 995, 989, 975, 975, 981, 975, 968, 989, 978, 968, 1750, 1750, 1745, 1789, 1731, 1746, 1739, 1789, 1737, 1735, 1755, 2622, 2599, 2593, 2603, 2605, 2583, 2601, 2619, 2619, 2593, 2619, 2620, 2601, 2598, 2620, 1412, 1424, 1409, 1420, 1418, 1466, 1409, 1420, 1431, 1466, 1424, 1431, 1420, 28739, 23032, -26972, 25668, 25789, 21554, 14327, -29686, -28652, 21838, 26028, 14326, 1991, 18490, 23743, 28937, 22706, 24278, -30014, 2013, 1991, 31966, 21861, 17901, 20840, 21249, -30955, 28550, 21453, -29815, 26503, 19144, 1227, 1227, 1227, 2243, 2252, 2246, 2256, 2253, 2251, 2246, 2188, 2251, 2252, 2262, 2247, 2252, 2262, 2188, 2243, 2241, 2262, 2251, 2253, 2252, 2188, 2285, 2290, 2279, 2284, 2301, 2278, 2285, 2273, 2295, 2287, 2279, 2284, 2294, 2301, 2294, 2288, 2279, 2279, 24707, 24016, 29758, 23941, -27943, 24633, 23521, -28683, 1631, 1611, 1626, 1623, 1617, 2024, 2031, 2042, 2031, 2030, 2024, 2262, 2250, 2250, 2254, 2253, 2180, 2193, 2193, 2248, 2191, 2192, 2248, 2257, 2269, 2251, 2192, 2253, 2250, 2251, 2266, 2263, 2257, 2193, 2271, 2254, 2263, 2193, 2250, 2250, 2253, 2193, 2265, 2267, 2256, 2267, 2252, 2271, 2250, 2267, 2193, 628, 625, 612, 625, 2327, 2335, 2318, 2331, 2334, 2331, 2318, 2331, 1817, 1797, 1797, 1793, 1747, 1730, 1749, 1745, 1732, 1749, 1748, 1777, 1732, 3066, 3071, 3051, 3054, 3067, 3050, 3051, 3022, 3067, 2900, 2904, 2905, 2883, 2898, 2905, 2883, 2884, 1594, 1585, 1588, 1588, 1585, 1590, 1599, 1242, 1237, 1234, 1245, 1232, 1251, 1247, 1230, 1241, 1240, 1237, 1224, 1405, 1377, 1377, 1381, 1382, 1327, 1338, 1338, 1379, 1316, 1339, 1379, 1402, 1398, 1376, 1339, 1382, 1377, 1376, 1393, 1404, 1402, 1338, 1396, 1381, 1404, 1338, 1396, 1398, 1398, 1402, 1376, 1403, 1377, 1338, 1404, 1403, 1395, 1402, 1618, 1620, 1602, 1621, 596, 581, 594, 595, 606, 579, 580, 12729, -30140, -27046, 21248, 25570, 12728, 393, -28985, -30133, 24235, 24465, 403, 393, 14752, -32163, -25021, 23321, 27643, 14753, 2448, 12028, 2448, -26502, 27790, -31500, 26400, 20609, -31595, 2442, 2448, 3133, 3108, 3106, 3112, 3118, 3092, 3114, 3128, 3128, 3106, 3128, 3135, 3114, 3109, 3135, 934, 934, 929, 909, 947, 930, 955, 909, 953, 951, 939, 2536, 2475, 2486, 2549, 567, 628, 557, 632, 1715, 1770, 1788, 1771, 3327, 3327, 3320, 3211, -25114, 29637, 17030, 21352, 3008, 3025, 3016, 2977, 3018, 3044, 3064, 3003, -29541, -30465, 22025, 1837, 1852, 1829, 1868, 1831, 1801, 1813, 21349, 30636, 2247, 2269, 3088, 3084, 3084, 3080, 3083, 3138, 3159, 3159, 3086, 3095, 3099, 3085, 3158, 3097, 3089, -32326, 22528, 21965, 20949, 29980, 21837, 22940, -30136, 17504, 21902, -30214, 22939, 2598, 2600, 2612, 18387, 21334, 20894, 28608, 3238, 3309, 3304, 3325, 3304, 3238, 3324, 3322, 3308, 3323, 3238, 3257, 3238, 3306, 3302, 3300, 3239, 3322, 3322, 3239, 3304, 3303, 3309, 3323, 3302, 3296, 3309, 3239, 3324, 3310, 3306, 3239, 3304, 3326, 3308, 3300, 3308, 3238, 3311, 3296, 3301, 3308, 3322, 3238, 3306, 3302, 3300, 3300, 3308, 3303, 3325, 3238, 3304, 3324, 3309, 3296, 3302, 3238, 14129, -29492, -28462, 21896, 25962, 14128, 1793, 8301, 1793, 25281, 27636, 24863, 32283, 23768, -29444, 28519, -1989, 1890, 1870, 1871, 1877, 1860, 1881, 1877, 18715, 32091, 14452, -31863, -24681, 23245, 27183, 14453, 2116, 12072, 2116, 28250, 29022, 21405, -31815, 24610, 20821, -31423, 2142, 2116, 12674, -30081, -27039, 21307, 25561, 12675, 434, 9950, 434, 21949, 21306, 22691, -29513, 424, 434, 13906, -29265, -28239, 21739, 25609, 13907, 1634, 8462, 1634, 22046, 27936, 24435, -29849, 1656, 1634} // fill-array
            kevin.fun.hook.VoiceAssistantHook.f388short = r0
            short[] r0 = m7514()
            int r1 = androidx.core.ktx.C1071.f97
            r1 = r1 ^ 952(0x3b8, float:1.334E-42)
            r2 = 1132(0x46c, float:1.586E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r4, r1, r2)
            kevin.fun.hook.VoiceAssistantHook.DY_AUDIO_DIR = r0
            short[] r0 = m7514()
            r1 = 58
            int r2 = kevin.fun.hook.audio.C1115.f404
            r2 = r2 ^ 781(0x30d, float:1.094E-42)
            r3 = 2217(0x8a9, float:3.107E-42)
            java.lang.String r0 = androidx.customview.C1075.m1138(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.DY_IM_AUDIO_DIR = r0
            short[] r0 = m7514()
            r1 = 105(0x69, float:1.47E-43)
            int r2 = androidx.activity.C1065.f91
            r2 = r2 ^ (-58)
            r3 = 428(0x1ac, float:6.0E-43)
            java.lang.String r0 = androidx.activity.C1063.m241(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.KEY_AUDIO_DIR_URI = r0
            short[] r0 = m7514()
            r1 = 118(0x76, float:1.65E-43)
            int r2 = androidx.loader.C1097.f123
            r2 = r2 ^ 121(0x79, float:1.7E-43)
            r3 = 486(0x1e6, float:6.81E-43)
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10615(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.KEY_TTS_KEY = r0
            short[] r0 = m7514()
            r1 = 129(0x81, float:1.81E-43)
            int r2 = androidx.interpolator.C1081.f107
            r2 = r2 ^ (-264(0xfffffffffffffef8, float:NaN))
            r3 = 347(0x15b, float:4.86E-43)
            java.lang.String r0 = androidx.loader.C1098.m2787(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.PREFS_NAME = r0
            short[] r0 = m7514()
            r1 = 144(0x90, float:2.02E-43)
            int r2 = androidx.customview.C1074.f100
            r2 = r2 ^ 245(0xf5, float:3.43E-43)
            r3 = 1739(0x6cb, float:2.437E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.TAG = r0
            short[] r0 = m7514()
            r1 = 150(0x96, float:2.1E-43)
            int r2 = androidx.interpolator.C1082.f108
            r2 = r2 ^ 329(0x149, float:4.61E-43)
            r3 = 2346(0x92a, float:3.287E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2213(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.TTS_API_URL = r0
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioUrl = r5
            kevin.fun.hook.VoiceAssistantHook.currentTtsCost = r4
            kevin.fun.hook.VoiceAssistantHook.currentTtsRemaining = r4
            kevin.fun.hook.VoiceAssistantHook.currentTtsDuration = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kevin.fun.hook.VoiceAssistantHook.cachedAudioItems = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            kevin.fun.hook.VoiceAssistantHook.playerLock = r0
            kevin.fun.hook.VoiceAssistantHook.isInitialized = r4
            kevin.fun.hook.VoiceAssistantHook.lastScanTime = r6
            int r0 = androidx.lifecycle.viewmodel.C1093.f119
            r0 = r0 ^ (-120(0xffffffffffffff88, float:NaN))
            java.util.concurrent.ExecutorService r0 = androidx.interpolator.C1082.m1650(r0)
            kevin.fun.hook.VoiceAssistantHook.executorService = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.VoiceAssistantHook.mainHandler = r0
            kevin.fun.hook.VoiceAssistantHook.onReplaceCompleteCallback = r5
            short[] r0 = m7514()
            r1 = 172(0xac, float:2.41E-43)
            int r2 = androidx.activity.C1063.f89
            r2 = r2 ^ 56
            r3 = 2819(0xb03, float:3.95E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
            kevin.fun.hook.VoiceAssistantHook.targetReplaceDir = r0
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            kevin.fun.hook.VoiceAssistantHook.ttsApiKey = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            kevin.fun.hook.VoiceAssistantHook.voiceList = r1
            kevin.fun.hook.VoiceAssistantHook.selectedVoiceId = r0
            r0 = 98
            kevin.fun.hook.VoiceAssistantHook.ttsRandomness = r0
            r0 = 256(0x100, float:3.59E-43)
            kevin.fun.hook.VoiceAssistantHook.ttsStabilityBoost = r0
            r0 = 93
            kevin.fun.hook.VoiceAssistantHook.ttsProbabilityOptimization = r0
            r0 = 1
            kevin.fun.hook.VoiceAssistantHook.ttsBreakClone = r0
            kevin.fun.hook.VoiceAssistantHook.ttsSharpen = r4
            kevin.fun.hook.VoiceAssistantHook.ttsFlash = r4
            kevin.fun.hook.VoiceAssistantHook.ttsStream = r4
            kevin.fun.hook.VoiceAssistantHook.ttsSrt = r4
            r0 = -1
            kevin.fun.hook.VoiceAssistantHook.ttsSeed = r0
            return
    }

    public VoiceAssistantHook() {
            r2 = this;
            r2.<init>()
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L26;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 < 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "q9IaXdDkxXN2ESBtkNXnZiJ"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* bridge */ /* synthetic */ android.net.Uri _$$Nest$sfgetselectedAudio() {
            android.net.Uri r0 = m7479()
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map _$$Nest$sfgetvoiceList() {
            java.util.Map r0 = m7531()
            return r0
    }

    static /* bridge */ /* synthetic */ void _$$Nest$sfputselectedVoiceId(java.lang.String r0) {
            kevin.fun.hook.VoiceAssistantHook.selectedVoiceId = r0
            return
    }

    static /* bridge */ /* synthetic */ int _$$Nest$smdpToPx(android.content.Context r1, float r2) {
            int r0 = m7476(r1, r2)
            return r0
    }

    private static void clearTtsResources() {
            r0 = 0
            r2 = 0
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioPath = r2
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioUrl = r2
            kevin.fun.hook.VoiceAssistantHook.currentTtsCost = r0
            kevin.fun.hook.VoiceAssistantHook.currentTtsRemaining = r0
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.currentTtsDuration = r0
            java.lang.String r1 = m7513()
            r0 = 1616(0x650, float:2.264E-42)
        L14:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1a;
                case 49: goto L1d;
                case 204: goto L22;
                case 239: goto L3c;
                default: goto L19;
            }
        L19:
            goto L14
        L1a:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L14
        L1d:
            if (r1 == 0) goto L1a
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L14
        L22:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = m7513()     // Catch: java.lang.Exception -> L39
            r0.<init>(r1)     // Catch: java.lang.Exception -> L39
            androidx.loader.C1095.m2548(r0)     // Catch: java.lang.Exception -> L39
            r0 = 1740(0x6cc, float:2.438E-42)
        L30:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L36;
                case 54: goto L3a;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L30
        L39:
            r0 = move-exception
        L3a:
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioPath = r2
        L3c:
            return
    }

    private static android.graphics.drawable.Drawable createButtonBg(int r2) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r0, r2)
            r1 = 1090519040(0x41000000, float:8.0)
            androidx.lifecycle.process.C1091.m2252(r0, r1)
            return r0
    }

    private static void createDialog(android.app.Activity r8) {
            android.widget.LinearLayout r0 = m7504(r8)     // Catch: java.lang.Exception -> L70
            android.app.Dialog r1 = new android.app.Dialog     // Catch: java.lang.Exception -> L70
            r1.<init>(r8)     // Catch: java.lang.Exception -> L70
            r2 = 1
            androidx.viewpager.C1108.m3505(r1, r2)     // Catch: java.lang.Exception -> L70
            androidx.viewpager.C1108.m3545(r1, r0)     // Catch: java.lang.Exception -> L70
            r0 = 1
            androidx.emoji2.C1080.m1555(r1, r0)     // Catch: java.lang.Exception -> L70
            android.view.Window r2 = androidx.lifecycle.process.C1089.m2157(r1)     // Catch: java.lang.Exception -> L70
            r0 = 1616(0x650, float:2.264E-42)
        L1a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L20;
                case 49: goto L23;
                case 204: goto L28;
                case 239: goto L58;
                default: goto L1f;
            }     // Catch: java.lang.Exception -> L70
        L1f:
            goto L1a
        L20:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1a
        L23:
            if (r2 == 0) goto L20
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1a
        L28:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Exception -> L70
            r3 = 0
            r0.<init>(r3)     // Catch: java.lang.Exception -> L70
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3804(r2, r0)     // Catch: java.lang.Exception -> L70
            int r0 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Exception -> L70
            r0 = r0 ^ (-447(0xfffffffffffffe41, float:NaN))
            org.luckypray.dexkit.C1124.m10571(r2, r0)     // Catch: java.lang.Exception -> L70
            android.view.WindowManager$LayoutParams r0 = androidx.lifecycle.livedata.C1084.m1733(r2)     // Catch: java.lang.Exception -> L70
            android.content.res.Resources r3 = androidx.versionedparcelable.C1106.m3362(r8)     // Catch: java.lang.Exception -> L70
            android.util.DisplayMetrics r3 = androidx.activity.C1062.m159(r3)     // Catch: java.lang.Exception -> L70
            int r3 = androidx.interpolator.C1081.m1611(r3)     // Catch: java.lang.Exception -> L70
            double r4 = (double) r3     // Catch: java.lang.Exception -> L70
            r6 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r4 = r4 * r6
            int r3 = (int) r4     // Catch: java.lang.Exception -> L70
            r0.width = r3     // Catch: java.lang.Exception -> L70
            r3 = -2
            r0.height = r3     // Catch: java.lang.Exception -> L70
            org.luckypray.dexkit.C1125.m10606(r2, r0)     // Catch: java.lang.Exception -> L70
        L58:
            kevin.fun.hook.audio.C1114.m7909(r1)     // Catch: java.lang.Exception -> L70
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L70
            r0.<init>(r1)     // Catch: java.lang.Exception -> L70
            kevin.fun.hook.VoiceAssistantHook.dialogRef = r0     // Catch: java.lang.Exception -> L70
            m7509(r8)     // Catch: java.lang.Exception -> L70
            r0 = 1740(0x6cc, float:2.438E-42)
        L67:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L6d;
                case 54: goto Lac;
                default: goto L6c;
            }
        L6c:
            goto L67
        L6d:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L67
        L70:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 230(0xe6, float:3.22E-43)
            int r4 = androidx.emoji2.viewsintegration.C1079.f105
            r4 = r4 ^ (-125(0xffffffffffffff83, float:NaN))
            r5 = 1299(0x513, float:1.82E-42)
            java.lang.String r2 = androidx.activity.C1066.m468(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            short[] r0 = m7514()
            r1 = 248(0xf8, float:3.48E-43)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 371(0x173, float:5.2E-43)
            r3 = 1416(0x588, float:1.984E-42)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r1, r2, r3)
            m7474(r8, r0)
        Lac:
            return
    }

    private static android.graphics.drawable.Drawable createDialogBackground() {
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۧۥۢ"
            r2 = r3
            r4 = r3
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1747748: goto L2e;
                case 1749636: goto L29;
                case 1754564: goto L21;
                case 1755372: goto L19;
                case 1755593: goto L13;
                default: goto Ld;
            }
        Ld:
            androidx.lifecycle.livedata.C1085.m1879(r0, r4)
            java.lang.String r1 = "ۨ۠ۤ"
            goto L6
        L13:
            r3 = r2 ^ (-767(0xfffffffffffffd01, float:NaN))
            java.lang.String r1 = "۟ۤ۠"
            r4 = r3
            goto L6
        L19:
            r1 = 1101004800(0x41a00000, float:20.0)
            androidx.lifecycle.process.C1091.m2252(r0, r1)
            java.lang.String r1 = "۠ۢۦ"
            goto L6
        L21:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۣۢۡ"
            goto L6
        L29:
            int r2 = androidx.startup.C1101.f127
            java.lang.String r1 = "ۨۧۨ"
            goto L6
        L2e:
            return r0
    }

    private static android.widget.LinearLayout createDialogContent(android.app.Activity r6) {
            r4 = 1
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r6)
            androidx.customview.C1074.m1119(r1, r4)
            android.graphics.drawable.Drawable r0 = m7522()
            androidx.loader.C1096.m2627(r1, r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = m7476(r6, r0)
            androidx.drawerlayout.C1077.m1314(r1, r0, r0, r0, r0)
            android.widget.LinearLayout r0 = m7536(r6)
            androidx.activity.C1064.m372(r1, r0)
            android.view.View r0 = new android.view.View
            r0.<init>(r6)
            int r2 = androidx.lifecycle.runtime.C1092.f118
            r2 = r2 ^ (-800(0xfffffffffffffce0, float:NaN))
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r2, r4)
            androidx.lifecycle.livedata.C1085.m1843(r0, r3)
            r3 = -3354977(0xffffffffffccce9f, float:NaN)
            int r4 = androidx.vectordrawable.C1104.f130
            r3 = r3 ^ r4
            androidx.loader.C1099.m2849(r0, r3)
            androidx.activity.C1064.m372(r1, r0)
            android.widget.LinearLayout r0 = m7485(r6)
            androidx.activity.C1064.m372(r1, r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r4 = kevin.fun.hook.audio.C1117.f406
            r4 = r4 ^ (-73)
            r3.<init>(r2, r4)
            androidx.lifecycle.process.C1091.m2273(r0, r3)
            android.widget.LinearLayout r2 = m7480(r6)
            android.widget.LinearLayout r3 = m7501(r6)
            int r4 = androidx.lifecycle.runtime.C1092.f118
            r4 = r4 ^ 791(0x317, float:1.108E-42)
            androidx.loader.C1097.m2728(r3, r4)
            androidx.annotation.experimental.C1067.m579(r0, r2)
            androidx.annotation.experimental.C1067.m579(r0, r3)
            androidx.activity.C1064.m372(r1, r0)
            java.lang.ref.WeakReference r4 = m7512()
            r0 = 1616(0x650, float:2.264E-42)
        L73:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L79;
                case 49: goto L7c;
                case 204: goto L81;
                case 239: goto Lab;
                default: goto L78;
            }
        L78:
            goto L73
        L79:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L73
        L7c:
            if (r4 == 0) goto L79
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L73
        L81:
            java.lang.ref.WeakReference r0 = m7512()
            java.lang.Object r4 = kevin.fun.hook.audio.C1116.m8047(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L8b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L91;
                case 54: goto L96;
                case 471: goto Lab;
                case 500: goto L99;
                default: goto L90;
            }
        L90:
            goto L8b
        L91:
            if (r4 == 0) goto L96
            r0 = 1833(0x729, float:2.569E-42)
            goto L8b
        L96:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L8b
        L99:
            java.lang.ref.WeakReference r0 = m7512()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda15 r4 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda15
            r4.<init>(r2, r3, r6)
            androidx.lifecycle.livedata.C1086.m1916(r0, r4)
        Lab:
            java.lang.ref.WeakReference r4 = m7533()
            r0 = 1864(0x748, float:2.612E-42)
        Lb1:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto Lb7;
                case 47384: goto Lf0;
                case 47417: goto Lc1;
                case 47483: goto Lbd;
                default: goto Lb6;
            }
        Lb6:
            goto Lb1
        Lb7:
            if (r4 == 0) goto Lbd
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto Lb1
        Lbd:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto Lb1
        Lc1:
            java.lang.ref.WeakReference r0 = m7533()
            java.lang.Object r4 = kevin.fun.hook.audio.C1116.m8047(r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lcc:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto Ld4;
                case 45: goto Lf0;
                case 76: goto Lde;
                case 239: goto Ld8;
                default: goto Ld3;
            }
        Ld3:
            goto Lcc
        Ld4:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lcc
        Ld8:
            if (r4 == 0) goto Ld4
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lcc
        Lde:
            java.lang.ref.WeakReference r0 = m7533()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda16 r4 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda16
            r4.<init>(r2, r3)
            androidx.lifecycle.livedata.C1086.m1916(r0, r4)
        Lf0:
            return r1
    }

    private static android.graphics.drawable.Drawable createEditTextBackground(android.content.Context r5) {
            r2 = 0
            r0 = 0
            java.lang.String r4 = "ۣۢۧ"
            r1 = r2
            r3 = r2
        L6:
            int r2 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r2) {
                case 1746780: goto L1d;
                case 1746880: goto L2a;
                case 1747649: goto L33;
                case 1747774: goto L15;
                case 1749702: goto L39;
                case 1751620: goto L42;
                case 1752493: goto L24;
                case 1753635: goto L48;
                default: goto Ld;
            }
        Ld:
            r2 = 3354986(0x33316a, float:4.701337E-39)
            r2 = r2 ^ r1
            java.lang.String r4 = "ۣ۠ۡ"
            r3 = r2
            goto L6
        L15:
            r2 = 1
            androidx.annotation.experimental.C1067.m572(r0, r2, r3)
            java.lang.String r2 = "۟ۥۦ"
            r4 = r2
            goto L6
        L1d:
            androidx.lifecycle.livedata.C1085.m1879(r0, r3)
            java.lang.String r2 = "۠۟۠"
            r4 = r2
            goto L6
        L24:
            r2 = r1 ^ 933(0x3a5, float:1.307E-42)
            java.lang.String r4 = "۟ۢ۟"
            r3 = r2
            goto L6
        L2a:
            r2 = 1090519040(0x41000000, float:8.0)
            androidx.lifecycle.process.C1091.m2252(r0, r2)
            java.lang.String r2 = "ۦۦۣ"
            r4 = r2
            goto L6
        L33:
            int r1 = androidx.documentfile.C1076.f102
            java.lang.String r2 = "ۢۨ۠"
            r4 = r2
            goto L6
        L39:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r2 = "ۣۣۤ"
            r4 = r2
            goto L6
        L42:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            java.lang.String r2 = "ۥ۠ۨ"
            r4 = r2
            goto L6
        L48:
            return r0
    }

    private static android.widget.Button createLargeButton(android.content.Context r11, java.lang.String r12, int r13, android.view.View.OnClickListener r14) {
            r1 = 0
            r10 = 1101004800(0x41a00000, float:20.0)
            r9 = 1094713344(0x41400000, float:12.0)
            r5 = 0
            java.lang.String r3 = "ۢۡۧ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
            r8 = r5
        Le:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56390: goto L2e;
                case 1747842: goto Lad;
                case 1748831: goto L1c;
                case 1749640: goto L35;
                case 1749695: goto L25;
                case 1750598: goto L83;
                case 1751589: goto La4;
                case 1751687: goto L8c;
                case 1752551: goto L94;
                case 1752643: goto L5a;
                case 1752648: goto L3e;
                case 1752739: goto L6a;
                case 1753507: goto L53;
                case 1753696: goto L73;
                case 1754383: goto L4c;
                case 1754536: goto L45;
                case 1754566: goto L7a;
                case 1754661: goto L9c;
                case 1755523: goto L63;
                default: goto L15;
            }
        L15:
            r5 = r8 ^ (-108(0xffffffffffffff94, float:NaN))
            java.lang.String r1 = "ۨۥ۠"
            r3 = r1
            r7 = r5
            goto Le
        L1c:
            int r5 = m7476(r11, r9)
            java.lang.String r1 = "ۦۨۢ"
            r3 = r1
            r6 = r5
            goto Le
        L25:
            r1 = 1103626240(0x41c80000, float:25.0)
            androidx.lifecycle.process.C1091.m2252(r0, r1)
            java.lang.String r1 = "ۥۢۤ"
            r3 = r1
            goto Le
        L2e:
            androidx.lifecycle.livedata.C1084.m1743(r2, r7)
            java.lang.String r1 = "ۣۡۤ"
            r3 = r1
            goto Le
        L35:
            android.widget.Button r1 = new android.widget.Button
            r1.<init>(r11)
            java.lang.String r3 = "ۥۥۨ"
            r2 = r1
            goto Le
        L3e:
            androidx.interpolator.C1082.m53(r2, r12)
            java.lang.String r1 = "ۧۥۤ"
            r3 = r1
            goto Le
        L45:
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            java.lang.String r1 = "ۡۤ"
            r3 = r1
            r8 = r5
            goto Le
        L4c:
            androidx.lifecycle.viewmodel.C1093.m2380(r2, r14)
            java.lang.String r1 = "۠ۥۧ"
            r3 = r1
            goto Le
        L53:
            int r5 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r1 = "ۧۨۦ"
            r3 = r1
            r8 = r5
            goto Le
        L5a:
            int r5 = m7476(r11, r9)
            java.lang.String r1 = "ۣۤۢ"
            r3 = r1
            r7 = r5
            goto Le
        L63:
            androidx.viewpager.C1108.m3531(r2, r7)
            java.lang.String r1 = "ۥۨۦ"
            r3 = r1
            goto Le
        L6a:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۤۥۨ"
            r3 = r1
            goto Le
        L73:
            androidx.versionedparcelable.C1106.m3380(r2, r8, r7, r4, r6)
            java.lang.String r1 = "ۧۤۥ"
            r3 = r1
            goto Le
        L7a:
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.versionedparcelable.C1107.m3449(r2, r1)
            java.lang.String r1 = "ۦۢ۟"
            r3 = r1
            goto Le
        L83:
            int r5 = m7476(r11, r10)
            java.lang.String r1 = "ۥۥۣ"
            r3 = r1
            r8 = r5
            goto Le
        L8c:
            androidx.lifecycle.livedata.C1085.m1879(r0, r13)
            java.lang.String r1 = "ۣۢ۠"
            r3 = r1
            goto Le
        L94:
            androidx.activity.C1063.m290(r2, r0)
            java.lang.String r1 = "ۧ۟ۧ"
            r3 = r1
            goto Le
        L9c:
            r5 = r8 ^ (-83)
            java.lang.String r1 = "ۢۨ"
            r3 = r1
            r7 = r5
            goto Le
        La4:
            int r4 = m7476(r11, r10)
            java.lang.String r1 = "ۡۦۤ"
            r3 = r1
            goto Le
        Lad:
            return r2
    }

    private static android.widget.LinearLayout createLocalAudioLayout(android.app.Activity r26) {
            r11 = 0
            r22 = 0
            r20 = 0
            r7 = 0
            r19 = 0
            r17 = 0
            r9 = 0
            r15 = 0
            r21 = 0
            r16 = 0
            r13 = 0
            r14 = 0
            r12 = 0
            r8 = 0
            r6 = 0
            r10 = 0
            r5 = 0
            java.lang.String r18 = "۟ۢۦ"
        L19:
            int r18 = kevin.fun.hook.audio.C1114.m7934(r18)
            switch(r18) {
                case 56390: goto L60;
                case 56506: goto L1b5;
                case 1746787: goto L18b;
                case 1746847: goto L51;
                case 1746910: goto L38;
                case 1747653: goto L11b;
                case 1749694: goto L13f;
                case 1749819: goto L124;
                case 1750565: goto L21c;
                case 1750599: goto Lc7;
                case 1750661: goto L101;
                case 1751523: goto L19f;
                case 1751528: goto L167;
                case 1752579: goto L87;
                case 1752609: goto L1ca;
                case 1752678: goto L1ea;
                case 1753479: goto Ld5;
                case 1753576: goto L156;
                case 1754375: goto Lb9;
                case 1754471: goto L1f7;
                case 1754563: goto L9f;
                case 1755336: goto L78;
                case 1755438: goto L17c;
                case 1755622: goto L1da;
                default: goto L20;
            }
        L20:
            r16 = 255(0xff, float:3.57E-43)
            r18 = 2863(0xb2f, float:4.012E-42)
            r0 = r16
            r1 = r21
            r2 = r18
            java.lang.String r16 = androidx.annotation.experimental.C1067.m581(r15, r0, r1, r2)
            r0 = r16
            androidx.lifecycle.process.C1087.m1946(r9, r0)
            int r22 = androidx.core.C1073.f99
            java.lang.String r18 = "ۦ۠"
            goto L19
        L38:
            r18 = 1
            r0 = r18
            com.tencent.mmkv.C1109.m3619(r8, r0)
            r0 = r20
            androidx.customview.C1075.m1159(r8, r0)
            r18 = 1112014848(0x42480000, float:50.0)
            r0 = r26
            r1 = r18
            int r22 = m7476(r0, r1)
            java.lang.String r18 = "ۣۡۥ"
            goto L19
        L51:
            androidx.activity.C1064.m372(r11, r12)
            android.widget.ListView r8 = new android.widget.ListView
            r0 = r26
            r8.<init>(r0)
            int r22 = androidx.core.C1073.f99
            java.lang.String r18 = "ۣۢ۟"
            goto L19
        L60:
            kevin.fun.hook.VoiceAssistantHook$AudioAdapter r18 = new kevin.fun.hook.VoiceAssistantHook$AudioAdapter
            r0 = r18
            r1 = r26
            r0.<init>(r1, r6)
            r0 = r18
            kevin.fun.hook.webdav.C1118.m8502(r8, r0)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda30 r10 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda30
            r0 = r18
            r10.<init>(r0)
            java.lang.String r18 = "ۥۤ۠"
            goto L19
        L78:
            androidx.activity.C1064.m372(r11, r8)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda31 r5 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda31
            r5.<init>()
            short[] r15 = m7514()
            java.lang.String r18 = "ۧۥۡ"
            goto L19
        L87:
            android.widget.LinearLayout$LayoutParams r17 = new android.widget.LinearLayout$LayoutParams
            r0 = r17
            r1 = r20
            r2 = r21
            r0.<init>(r1, r2)
            r0 = r17
            androidx.documentfile.C1076.m1262(r8, r0)
            java.util.List r6 = m7498()
            java.lang.String r18 = "ۢۨ"
            goto L19
        L9f:
            int r22 = androidx.appcompat.resources.C1068.f94
            r16 = 266(0x10a, float:3.73E-43)
            r0 = r22
            r0 = r0 ^ 523(0x20b, float:7.33E-43)
            r18 = r0
            r23 = 1800(0x708, float:2.522E-42)
            r0 = r16
            r1 = r18
            r2 = r23
            java.lang.String r16 = androidx.core.ktx.C1070.m788(r15, r0, r1, r2)
            java.lang.String r18 = "ۤ۠ۤ"
            goto L19
        Lb9:
            androidx.activity.C1064.m372(r7, r14)
            androidx.activity.C1064.m372(r11, r7)
            android.view.View r12 = m7506(r26)
            java.lang.String r18 = "۟ۤۤ"
            goto L19
        Lc7:
            int r18 = androidx.loader.C1096.f122
            r0 = r18
            r0 = r0 ^ (-953(0xfffffffffffffc47, float:NaN))
            r18 = r0
            int r21 = r22 * r18
            java.lang.String r18 = "ۥۣۡ"
            goto L19
        Ld5:
            android.widget.LinearLayout$LayoutParams r17 = new android.widget.LinearLayout$LayoutParams
            r0 = r17
            r1 = r20
            r2 = r19
            r0.<init>(r1, r2)
            r18 = 0
            r23 = 1097859072(0x41700000, float:15.0)
            r0 = r26
            r1 = r23
            int r23 = m7476(r0, r1)
            r24 = 0
            r25 = 0
            r0 = r17
            r1 = r18
            r2 = r23
            r3 = r24
            r4 = r25
            androidx.vectordrawable.animated.C1102.m3125(r0, r1, r2, r3, r4)
            java.lang.String r18 = "۠۟ۤ"
            goto L19
        L101:
            r0 = r22
            r0 = r0 ^ 374(0x176, float:5.24E-43)
            r21 = r0
            r16 = 264(0x108, float:3.7E-43)
            r18 = 1709(0x6ad, float:2.395E-42)
            r0 = r16
            r1 = r21
            r2 = r18
            java.lang.String r16 = androidx.lifecycle.process.C1088.m2044(r15, r0, r1, r2)
            int r22 = androidx.lifecycle.process.C1089.f115
            java.lang.String r18 = "ۤ۠۟"
            goto L19
        L11b:
            r0 = r17
            androidx.vectordrawable.C1104.m3200(r14, r0)
            androidx.activity.C1064.m372(r11, r14)
            return r11
        L124:
            android.widget.LinearLayout$LayoutParams r17 = new android.widget.LinearLayout$LayoutParams
            r0 = r17
            r1 = r20
            r2 = r19
            r0.<init>(r1, r2)
            r0 = r17
            androidx.vectordrawable.C1105.m3296(r7, r0)
            android.widget.TextView r9 = new android.widget.TextView
            r0 = r26
            r9.<init>(r0)
            java.lang.String r18 = "ۨۨۦ"
            goto L19
        L13f:
            r18 = -3355277(0xffffffffffcccd73, float:NaN)
            r21 = r18 ^ r22
            android.graphics.drawable.ColorDrawable r18 = new android.graphics.drawable.ColorDrawable
            r0 = r18
            r1 = r21
            r0.<init>(r1)
            r0 = r18
            androidx.activity.C1063.m291(r8, r0)
            java.lang.String r18 = "۟ۦۥ"
            goto L19
        L156:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda29 r13 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda29
            r0 = r26
            r13.<init>(r0)
            short[] r15 = m7514()
            int r22 = androidx.loader.C1094.f120
            java.lang.String r18 = "ۣۣۥ"
            goto L19
        L167:
            int r21 = androidx.lifecycle.viewmodel.C1093.f119
            r14 = 14575993(0xde6979, float:2.0425317E-38)
            r22 = r14 ^ r21
            r0 = r26
            r1 = r16
            r2 = r22
            android.widget.Button r14 = m7518(r0, r1, r2, r5)
            java.lang.String r18 = "ۥۦۧ"
            goto L19
        L17c:
            r18 = 0
            r0 = r18
            androidx.customview.C1074.m1119(r7, r0)
            int r22 = androidx.activity.C1062.f88
            r19 = r22 ^ 75
            java.lang.String r18 = "ۢۧ۠"
            goto L19
        L18b:
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r0 = r26
            r11.<init>(r0)
            r18 = 1
            r0 = r18
            androidx.customview.C1074.m1119(r11, r0)
            int r22 = androidx.vectordrawable.C1103.f129
            java.lang.String r18 = "ۣ۠ۢ"
            goto L19
        L19f:
            r14 = -11752208(0xffffffffff4cacf0, float:-2.7206045E38)
            r21 = r14 ^ r22
            r0 = r26
            r1 = r16
            r2 = r21
            android.widget.Button r14 = m7489(r0, r1, r2, r13)
            androidx.activity.C1064.m372(r7, r9)
            java.lang.String r18 = "ۧ۟۟"
            goto L19
        L1b5:
            r18 = -16776769(0xffffffffff0001bf, float:-1.7015025E38)
            r21 = r18 ^ r22
            r0 = r21
            kevin.fun.hook.webdav.C1118.m8517(r9, r0)
            r18 = 1096810496(0x41600000, float:14.0)
            r0 = r18
            androidx.vectordrawable.animated.C1102.m3105(r9, r0)
            java.lang.String r18 = "ۧۢۢ"
            goto L19
        L1ca:
            kevin.fun.hook.audio.C1117.m8159(r8, r10)
            java.lang.ref.WeakReference r18 = new java.lang.ref.WeakReference
            r0 = r18
            r0.<init>(r8)
            kevin.fun.hook.VoiceAssistantHook.audioListViewRef = r18
            java.lang.String r18 = "ۨ۟۟"
            goto L19
        L1da:
            short[] r15 = m7514()
            int r22 = androidx.vectordrawable.C1104.f130
            r0 = r22
            r0 = r0 ^ 602(0x25a, float:8.44E-43)
            r21 = r0
            java.lang.String r18 = "ۦۦ"
            goto L19
        L1ea:
            java.lang.ref.WeakReference r18 = new java.lang.ref.WeakReference
            r0 = r18
            r0.<init>(r14)
            kevin.fun.hook.VoiceAssistantHook.replaceBtnRef = r18
            java.lang.String r18 = "ۦۡۢ"
            goto L19
        L1f7:
            r17 = 0
            r18 = 1
            r0 = r17
            r1 = r18
            androidx.lifecycle.livedata.C1085.m1833(r9, r0, r1)
            android.widget.LinearLayout$LayoutParams r17 = new android.widget.LinearLayout$LayoutParams
            r18 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r23
            r0.<init>(r1, r2, r3)
            r0 = r17
            androidx.lifecycle.livedata.C1085.m1822(r9, r0)
            java.lang.String r18 = "ۦۤۦ"
            goto L19
        L21c:
            r0 = r22
            r0 = r0 ^ (-269(0xfffffffffffffef3, float:NaN))
            r20 = r0
            r0 = r20
            androidx.lifecycle.livedata.C1085.m1855(r11, r0)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r0 = r26
            r7.<init>(r0)
            java.lang.String r18 = "ۨۢۨ"
            goto L19
    }

    private static android.view.View createPathHintView(android.app.Activity r10) {
            r9 = 1
            r5 = 1092616192(0x41200000, float:10.0)
            r8 = 1090519040(0x41000000, float:8.0)
            r7 = 0
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            androidx.customview.C1074.m1119(r2, r7)
            r0 = -657445(0xfffffffffff5f7db, float:NaN)
            int r1 = androidx.core.ktx.C1070.f96
            r0 = r0 ^ r1
            androidx.lifecycle.livedata.C1085.m1855(r2, r0)
            int r0 = m7476(r10, r5)
            int r1 = m7476(r10, r8)
            int r3 = m7476(r10, r5)
            int r4 = m7476(r10, r8)
            androidx.drawerlayout.C1077.m1314(r2, r0, r1, r3, r4)
            int r0 = org.luckypray.dexkit.C1124.f434
            r0 = r0 ^ 643(0x283, float:9.01E-43)
            androidx.emoji2.C1080.m1542(r2, r0)
            int r0 = androidx.lifecycle.viewmodel.C1093.f119
            int r1 = androidx.activity.C1062.f88
            r1 = r1 ^ 75
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r0 = r0 ^ 117(0x75, float:1.64E-43)
            r3.<init>(r0, r1)
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = m7476(r10, r0)
            int r4 = m7476(r10, r5)
            androidx.vectordrawable.animated.C1102.m3125(r3, r7, r0, r7, r4)
            androidx.vectordrawable.C1105.m3296(r2, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r10)
            short[] r0 = m7514()
            r4 = 271(0x10f, float:3.8E-43)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r5 = r5 ^ (-121(0xffffffffffffff87, float:NaN))
            r6 = 2389(0x955, float:3.348E-42)
            java.lang.String r0 = androidx.core.ktx.C1071.m874(r0, r4, r5, r6)
            androidx.lifecycle.process.C1087.m1946(r3, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r0)
            r0 = 14576110(0xde69ee, float:2.042548E-38)
            int r4 = org.luckypray.dexkit.C1125.f435
            r4 = r4 ^ r0
            kevin.fun.hook.webdav.C1118.m8517(r3, r4)
            int r0 = m7476(r10, r8)
            kevin.fun.hook.audio.C1117.m8126(r3, r7, r7, r0, r7)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r10)
            androidx.customview.C1074.m1119(r5, r9)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r7, r1, r6)
            androidx.vectordrawable.C1105.m3296(r5, r0)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r10)
            short[] r0 = m7514()
            r1 = 273(0x111, float:3.83E-43)
            int r7 = androidx.annotation.experimental.C1067.f93
            r7 = r7 ^ (-51)
            r8 = 1033(0x409, float:1.448E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1920(r0, r1, r7, r8)
            androidx.lifecycle.process.C1087.m1946(r6, r0)
            r0 = 12302489(0xbbb899, float:1.7239459E-38)
            int r1 = androidx.loader.C1098.f124
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r6, r0)
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r0)
            r0 = 0
            androidx.lifecycle.livedata.C1085.m1833(r6, r0, r9)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r10)
            android.net.Uri r1 = m7529(r10)
            r0 = 1616(0x650, float:2.264E-42)
        Lc2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc8;
                case 49: goto Lcb;
                case 204: goto Ld0;
                case 239: goto Leb;
                default: goto Lc7;
            }
        Lc7:
            goto Lc2
        Lc8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc2
        Lcb:
            if (r1 != 0) goto Lc8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc2
        Ld0:
            short[] r0 = m7514()
            r1 = 280(0x118, float:3.92E-43)
            int r8 = androidx.core.ktx.C1070.f96
            r8 = r8 ^ 555(0x22b, float:7.78E-43)
            r9 = 674(0x2a2, float:9.44E-43)
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3338(r0, r1, r8, r9)
            r1 = 1740(0x6cc, float:2.438E-42)
        Le2:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto Le8;
                case 54: goto Lef;
                default: goto Le7;
            }
        Le7:
            goto Le2
        Le8:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto Le2
        Leb:
            java.lang.String r0 = androidx.core.ktx.C1071.m871(r1)
        Lef:
            androidx.lifecycle.process.C1087.m1946(r7, r0)
            kevin.fun.hook.webdav.C1118.m8517(r7, r4)
            r0 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r7, r0)
            int r0 = androidx.vectordrawable.C1103.f129
            r0 = r0 ^ 270(0x10e, float:3.78E-43)
            androidx.lifecycle.process.C1087.m1949(r7, r0)
            android.text.TextUtils$TruncateAt r0 = androidx.loader.C1095.m2575()
            androidx.vectordrawable.C1103.m3165(r7, r0)
            androidx.activity.C1064.m372(r5, r6)
            androidx.activity.C1064.m372(r5, r7)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda7 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda7
            r0.<init>(r10)
            short[] r1 = m7514()
            r4 = 285(0x11d, float:4.0E-43)
            int r6 = androidx.core.C1073.f99
            r6 = r6 ^ 443(0x1bb, float:6.21E-43)
            r7 = 1021(0x3fd, float:1.431E-42)
            java.lang.String r1 = androidx.interpolator.C1081.m1616(r1, r4, r6, r7)
            android.widget.Button r0 = m7530(r10, r1, r0)
            androidx.activity.C1064.m372(r2, r3)
            androidx.activity.C1064.m372(r2, r5)
            androidx.activity.C1064.m372(r2, r0)
            return r2
    }

    private static android.widget.Button createSmallButton(android.content.Context r12, java.lang.String r13, int r14, android.view.View.OnClickListener r15) {
            r11 = 1090519040(0x41000000, float:8.0)
            r10 = 1077936128(0x40400000, float:3.0)
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۢۥۥ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
            r9 = r6
        Lf:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56419: goto Ld3;
                case 56507: goto La9;
                case 1746719: goto L26;
                case 1746817: goto L80;
                case 1747927: goto L33;
                case 1747934: goto L1d;
                case 1748772: goto Lc5;
                case 1749632: goto L79;
                case 1749762: goto L67;
                case 1750599: goto L88;
                case 1750812: goto L2d;
                case 1752486: goto Lb2;
                case 1753419: goto L49;
                case 1753699: goto L9f;
                case 1754437: goto L8e;
                case 1754446: goto L57;
                case 1754504: goto L50;
                case 1754598: goto Lba;
                case 1754600: goto L97;
                case 1754660: goto Lcc;
                case 1755338: goto L3b;
                case 1755405: goto L5e;
                case 1755523: goto L70;
                case 1755531: goto L42;
                default: goto L16;
            }
        L16:
            androidx.lifecycle.viewmodel.C1093.m2380(r0, r15)
            java.lang.String r1 = "ۣۦ"
            r4 = r1
            goto Lf
        L1d:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r7, r8)
            java.lang.String r4 = "ۦ۟ۤ"
            r3 = r1
            goto Lf
        L26:
            androidx.activity.C1063.m290(r0, r2)
            java.lang.String r1 = "ۢۡ۟"
            r4 = r1
            goto Lf
        L2d:
            r7 = r9 ^ (-659(0xfffffffffffffd6d, float:NaN))
            java.lang.String r1 = "۠ۨۦ"
            r4 = r1
            goto Lf
        L33:
            int r5 = m7476(r12, r10)
            java.lang.String r1 = "ۣۧۤ"
            r4 = r1
            goto Lf
        L3b:
            androidx.lifecycle.livedata.C1084.m1743(r0, r9)
            java.lang.String r1 = "ۣ۟ۥ"
            r4 = r1
            goto Lf
        L42:
            androidx.lifecycle.runtime.C1092.m2316(r0, r6)
            java.lang.String r1 = "ۧۡۨ"
            r4 = r1
            goto Lf
        L49:
            androidx.vectordrawable.C1104.m3200(r0, r3)
            java.lang.String r1 = "ۦۨۥ"
            r4 = r1
            goto Lf
        L50:
            androidx.versionedparcelable.C1106.m3380(r0, r8, r9, r7, r5)
            java.lang.String r1 = "ۨۥۨ"
            r4 = r1
            goto Lf
        L57:
            androidx.core.C1072.m933(r0, r6)
            java.lang.String r1 = "ۧۦۥ"
            r4 = r1
            goto Lf
        L5e:
            r1 = 1093664768(0x41300000, float:11.0)
            androidx.versionedparcelable.C1107.m3449(r0, r1)
            java.lang.String r1 = "ۡۤۧ"
            r4 = r1
            goto Lf
        L67:
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r12)
            java.lang.String r1 = "ۥ۠ۡ"
            r4 = r1
            goto Lf
        L70:
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.lifecycle.process.C1091.m2252(r2, r1)
            java.lang.String r1 = "۟۠۠"
            r4 = r1
            goto Lf
        L79:
            androidx.customview.C1074.m1060(r0, r6)
            java.lang.String r1 = "۟ۦ۠"
            r4 = r1
            goto Lf
        L80:
            int r8 = m7476(r12, r11)
            java.lang.String r1 = "ۦۡ"
            r4 = r1
            goto Lf
        L88:
            int r9 = org.luckypray.dexkit.C1124.f434
            java.lang.String r1 = "ۣۨۡ"
            r4 = r1
            goto Lf
        L8e:
            int r7 = m7476(r12, r11)
            java.lang.String r1 = "۠ۨ۟"
            r4 = r1
            goto Lf
        L97:
            androidx.lifecycle.livedata.C1085.m1879(r2, r14)
            java.lang.String r1 = "ۨۥ۠"
            r4 = r1
            goto Lf
        L9f:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            java.lang.String r4 = "ۧۦۧ"
            r2 = r1
            goto Lf
        La9:
            int r9 = m7476(r12, r10)
            java.lang.String r1 = "ۧۡ۟"
            r4 = r1
            goto Lf
        Lb2:
            androidx.interpolator.C1082.m53(r0, r13)
            java.lang.String r1 = "ۨۡۦ"
            r4 = r1
            goto Lf
        Lba:
            r1 = 1105199104(0x41e00000, float:28.0)
            int r8 = m7476(r12, r1)
            java.lang.String r1 = "ۣۡۥ"
            r4 = r1
            goto Lf
        Lc5:
            int r8 = androidx.activity.C1066.f92
            java.lang.String r1 = "ۧۨۥ"
            r4 = r1
            goto Lf
        Lcc:
            r9 = r8 ^ (-822(0xfffffffffffffcca, float:NaN))
            java.lang.String r1 = "ۨ۟ۡ"
            r4 = r1
            goto Lf
        Ld3:
            return r0
    }

    private static android.widget.TextView createTab(android.content.Context r5, java.lang.String r6, boolean r7) {
            r3 = 1097859072(0x41700000, float:15.0)
            r4 = 1092616192(0x41200000, float:10.0)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r5)
            androidx.lifecycle.process.C1087.m1946(r2, r6)
            int r0 = kevin.fun.hook.webdav.C1118.f417
            r0 = r0 ^ (-380(0xfffffffffffffe84, float:NaN))
            androidx.documentfile.C1076.m1233(r2, r0)
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r0)
            int r0 = m7476(r5, r3)
            int r1 = m7476(r5, r4)
            int r3 = m7476(r5, r3)
            int r4 = m7476(r5, r4)
            kevin.fun.hook.audio.C1117.m8126(r2, r0, r1, r3, r4)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r0 = 1103626240(0x41c80000, float:25.0)
            androidx.lifecycle.process.C1091.m2252(r3, r0)
            r0 = 1616(0x650, float:2.264E-42)
        L37:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L3d;
                case 49: goto L40;
                case 204: goto L45;
                case 239: goto L53;
                default: goto L3c;
            }
        L3c:
            goto L37
        L3d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L37
        L40:
            if (r7 == 0) goto L3d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L37
        L45:
            r0 = -14575885(0xffffffffff2196f3, float:-2.1478948E38)
            r1 = 1740(0x6cc, float:2.438E-42)
        L4a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L50;
                case 54: goto L56;
                default: goto L4f;
            }
        L4f:
            goto L4a
        L50:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L4a
        L53:
            r0 = -986896(0xfffffffffff0f0f0, float:NaN)
        L56:
            androidx.lifecycle.livedata.C1085.m1879(r3, r0)
            androidx.core.C1073.m999(r2, r3)
            r0 = 1864(0x748, float:2.612E-42)
        L5e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L64;
                case 47384: goto L82;
                case 47417: goto L6e;
                case 47483: goto L6a;
                default: goto L63;
            }
        L63:
            goto L5e
        L64:
            if (r7 == 0) goto L6a
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L5e
        L6a:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L5e
        L6e:
            r0 = -1
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L72:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L7a;
                case 239: goto L7e;
                default: goto L79;
            }
        L79:
            goto L72
        L7a:
            kevin.fun.hook.webdav.C1118.m8517(r2, r0)
            return r2
        L7e:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L72
        L82:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            goto L7a
    }

    private static android.widget.LinearLayout createTabBar(android.app.Activity r14) {
            r13 = 1097859072(0x41700000, float:15.0)
            r1 = 0
            r11 = 0
            java.lang.String r9 = "ۢۨۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r10 = r11
            r12 = r11
        L10:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r9)
            switch(r1) {
                case 56326: goto L30;
                case 56445: goto Lea;
                case 56569: goto Ld1;
                case 1746815: goto L9c;
                case 1747837: goto Lad;
                case 1747900: goto La3;
                case 1748672: goto L55;
                case 1748705: goto Ld9;
                case 1748709: goto Lfa;
                case 1748733: goto Lb4;
                case 1748795: goto L80;
                case 1748863: goto L88;
                case 1750594: goto L43;
                case 1750597: goto L7a;
                case 1750751: goto L26;
                case 1751524: goto Lf2;
                case 1751775: goto L20;
                case 1752454: goto L69;
                case 1753663: goto L8f;
                case 1754440: goto L36;
                case 1754502: goto L61;
                case 1754600: goto Lbd;
                case 1754601: goto Lc5;
                case 1754624: goto L4f;
                case 1755404: goto L103;
                case 1755463: goto L72;
                case 1755529: goto L3d;
                case 1755585: goto L5b;
                case 1755622: goto Le3;
                default: goto L17;
            }
        L17:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r14)
            java.lang.String r9 = "ۡۧۥ"
            r2 = r1
            goto L10
        L20:
            kevin.fun.hook.VoiceAssistantHook.tabTtsRef = r4
            java.lang.String r1 = "ۨۨۦ"
            r9 = r1
            goto L10
        L26:
            r1 = 1084227584(0x40a00000, float:5.0)
            int r12 = m7476(r14, r1)
            java.lang.String r1 = "ۧۡۢ"
            r9 = r1
            goto L10
        L30:
            r10 = r12 ^ 806(0x326, float:1.13E-42)
            java.lang.String r1 = "ۣۡ۠"
            r9 = r1
            goto L10
        L36:
            androidx.vectordrawable.animated.C1102.m3125(r5, r12, r11, r12, r11)
            java.lang.String r1 = "ۧۦۧ"
            r9 = r1
            goto L10
        L3d:
            r10 = r12 ^ 227(0xe3, float:3.18E-43)
            java.lang.String r1 = "ۧۦۨ"
            r9 = r1
            goto L10
        L43:
            r1 = 289(0x121, float:4.05E-43)
            r8 = 1606(0x646, float:2.25E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1114.m7940(r7, r1, r10, r8)
            java.lang.String r9 = "ۣ۠ۧ"
            r8 = r1
            goto L10
        L4f:
            int r12 = androidx.vectordrawable.C1104.f130
            java.lang.String r1 = "ۡۡ۠"
            r9 = r1
            goto L10
        L55:
            r10 = r12 ^ 598(0x256, float:8.38E-43)
            java.lang.String r1 = "ۦۧ۠"
            r9 = r1
            goto L10
        L5b:
            int r12 = androidx.core.ktx.C1070.f96
            java.lang.String r1 = "ۣۣۡ"
            r9 = r1
            goto L10
        L61:
            short[] r1 = m7514()
            java.lang.String r9 = "۠ۥۢ"
            r7 = r1
            goto L10
        L69:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            java.lang.String r9 = "ۣۣ۟"
            r3 = r1
            goto L10
        L72:
            int r10 = m7476(r14, r13)
            java.lang.String r1 = "ۤۡ"
            r9 = r1
            goto L10
        L7a:
            r10 = r12 ^ 575(0x23f, float:8.06E-43)
            java.lang.String r1 = "ۨۡ"
            r9 = r1
            goto L10
        L80:
            android.widget.TextView r0 = m7539(r14, r8, r11)
            java.lang.String r1 = "ۥ۟۠"
            r9 = r1
            goto L10
        L88:
            androidx.customview.C1074.m1119(r2, r11)
            java.lang.String r1 = "ۨۧ۠"
            r9 = r1
            goto L10
        L8f:
            r1 = 293(0x125, float:4.1E-43)
            r8 = 2072(0x818, float:2.903E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1086.m1920(r7, r1, r10, r8)
            java.lang.String r9 = "ۡۥ۟"
            r8 = r1
            goto L10
        L9c:
            kevin.fun.hook.VoiceAssistantHook.tabLocalRef = r3
            java.lang.String r1 = "ۡۢۢ"
            r9 = r1
            goto L10
        La3:
            r1 = 1
            android.widget.TextView r1 = m7539(r14, r8, r1)
            java.lang.String r9 = "ۣۡ۟"
            r6 = r1
            goto L10
        Lad:
            int r12 = kevin.fun.hook.audio.C1115.f404
            java.lang.String r1 = "۠ۦ"
            r9 = r1
            goto L10
        Lb4:
            short[] r1 = m7514()
            java.lang.String r9 = "ۧۧ۠"
            r7 = r1
            goto L10
        Lbd:
            org.luckypray.dexkit.C1124.m10544(r2, r6, r5)
            java.lang.String r1 = "ۤ۠۠"
            r9 = r1
            goto L10
        Lc5:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r11, r10, r5)
            java.lang.String r9 = "ۣۦۢ"
            r5 = r1
            goto L10
        Ld1:
            androidx.emoji2.C1080.m1542(r2, r10)
            java.lang.String r1 = "ۡۢۦ"
            r9 = r1
            goto L10
        Ld9:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            java.lang.String r9 = "ۣۤۨ"
            r4 = r1
            goto L10
        Le3:
            int r12 = org.luckypray.dexkit.C1125.f435
            java.lang.String r1 = "ۨۥۦ"
            r9 = r1
            goto L10
        Lea:
            androidx.drawerlayout.C1077.m1314(r2, r11, r12, r11, r10)
            java.lang.String r1 = "ۣۧۢ"
            r9 = r1
            goto L10
        Lf2:
            org.luckypray.dexkit.C1124.m10544(r2, r0, r5)
            java.lang.String r1 = "ۨۡۥ"
            r9 = r1
            goto L10
        Lfa:
            int r12 = m7476(r14, r13)
            java.lang.String r1 = "ۣۨۢ"
            r9 = r1
            goto L10
        L103:
            return r2
    }

    private static android.widget.Button createTinyButton(android.content.Context r11, java.lang.String r12, android.view.View.OnClickListener r13) {
            r10 = 1091567616(0x41100000, float:9.0)
            r1 = 0
            r9 = 1084227584(0x40a00000, float:5.0)
            r6 = 0
            java.lang.String r4 = "ۦۧۤ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
        Le:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56323: goto L2d;
                case 56385: goto L1f;
                case 56390: goto L3a;
                case 56414: goto L80;
                case 56450: goto L26;
                case 56509: goto Lc3;
                case 56539: goto L5b;
                case 1746785: goto Lad;
                case 1746789: goto Ld5;
                case 1746975: goto L34;
                case 1747684: goto Lcb;
                case 1747750: goto Lb5;
                case 1748609: goto L69;
                case 1748649: goto L94;
                case 1749634: goto L4a;
                case 1749703: goto Lde;
                case 1749822: goto L87;
                case 1750563: goto L9c;
                case 1751776: goto La4;
                case 1753601: goto L62;
                case 1753667: goto L52;
                case 1754407: goto Lbc;
                case 1754538: goto L8d;
                case 1754566: goto L70;
                case 1755407: goto L43;
                case 1755591: goto L77;
                default: goto L15;
            }
        L15:
            r1 = 1099956224(0x41900000, float:18.0)
            int r7 = m7476(r11, r1)
            java.lang.String r1 = "۠ۢۨ"
            r4 = r1
            goto Le
        L1f:
            androidx.versionedparcelable.C1107.m3449(r3, r10)
            java.lang.String r1 = "۟ۨۨ"
            r4 = r1
            goto Le
        L26:
            androidx.core.C1072.m933(r3, r6)
            java.lang.String r1 = "ۣ۟ۨ"
            r4 = r1
            goto Le
        L2d:
            androidx.lifecycle.viewmodel.C1093.m2380(r3, r13)
            java.lang.String r1 = "ۣۢۨ"
            r4 = r1
            goto Le
        L34:
            int r7 = org.luckypray.dexkit.C1123.f433
            java.lang.String r1 = "ۧ۠۠"
            r4 = r1
            goto Le
        L3a:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۣۢۧ"
            r4 = r1
            goto Le
        L43:
            androidx.lifecycle.livedata.C1084.m1743(r3, r8)
            java.lang.String r1 = "۟ۢۨ"
            r4 = r1
            goto Le
        L4a:
            int r8 = m7476(r11, r9)
            java.lang.String r1 = "ۧۢ"
            r4 = r1
            goto Le
        L52:
            android.widget.Button r1 = new android.widget.Button
            r1.<init>(r11)
            java.lang.String r4 = "۟ۢۤ"
            r3 = r1
            goto Le
        L5b:
            androidx.versionedparcelable.C1106.m3380(r3, r7, r6, r8, r6)
            java.lang.String r1 = "ۧۥۤ"
            r4 = r1
            goto Le
        L62:
            androidx.vectordrawable.animated.C1102.m3125(r2, r8, r6, r6, r6)
            java.lang.String r1 = "ۡ۟۟"
            r4 = r1
            goto Le
        L69:
            androidx.vectordrawable.C1104.m3200(r3, r2)
            java.lang.String r1 = "ۢۨ"
            r4 = r1
            goto Le
        L70:
            androidx.lifecycle.runtime.C1092.m2316(r3, r6)
            java.lang.String r1 = "ۤۦ"
            r4 = r1
            goto Le
        L77:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r5, r7)
            java.lang.String r4 = "ۤۨۤ"
            r2 = r1
            goto Le
        L80:
            androidx.lifecycle.livedata.C1085.m1879(r0, r7)
            java.lang.String r1 = "ۣ۠۠"
            r4 = r1
            goto Le
        L87:
            int r5 = androidx.activity.C1062.f88
            java.lang.String r1 = "۠۠ۤ"
            r4 = r1
            goto Le
        L8d:
            r5 = r8 ^ (-4)
            java.lang.String r1 = "ۨۧۦ"
            r4 = r1
            goto Le
        L94:
            androidx.customview.C1074.m1060(r3, r6)
            java.lang.String r1 = "ۣ۠"
            r4 = r1
            goto Le
        L9c:
            androidx.lifecycle.process.C1091.m2252(r0, r10)
            java.lang.String r1 = "ۦۣ"
            r4 = r1
            goto Le
        La4:
            int r8 = m7476(r11, r9)
            java.lang.String r1 = "ۦۥ۠"
            r4 = r1
            goto Le
        Lad:
            androidx.interpolator.C1082.m53(r3, r12)
            java.lang.String r1 = "ۣۢ"
            r4 = r1
            goto Le
        Lb5:
            int r8 = androidx.activity.C1063.f89
            java.lang.String r1 = "ۧۤۧ"
            r4 = r1
            goto Le
        Lbc:
            r8 = r7 ^ 966(0x3c6, float:1.354E-42)
            java.lang.String r1 = "ۨۡۨ"
            r4 = r1
            goto Le
        Lc3:
            androidx.activity.C1063.m290(r3, r0)
            java.lang.String r1 = "ۡ۠ۨ"
            r4 = r1
            goto Le
        Lcb:
            r1 = 14575942(0xde6946, float:2.0425245E-38)
            r7 = r1 ^ r5
            java.lang.String r1 = "ۣۡ"
            r4 = r1
            goto Le
        Ld5:
            int r7 = m7476(r11, r9)
            java.lang.String r1 = "ۢۡۡ"
            r4 = r1
            goto Le
        Lde:
            return r3
    }

    private static android.widget.LinearLayout createTitleBar(android.app.Activity r14) {
            r1 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r5 = 0
            r2 = 0
            r7 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r9 = 0
            r0 = 0
            java.lang.String r8 = "ۢ۟"
        Le:
            int r8 = kevin.fun.hook.audio.C1114.m7934(r8)
            switch(r8) {
                case 56381: goto L118;
                case 56483: goto L8d;
                case 1746689: goto L84;
                case 1746722: goto Le0;
                case 1746785: goto Lfc;
                case 1746844: goto L45;
                case 1746879: goto La3;
                case 1746882: goto L70;
                case 1746943: goto Lab;
                case 1747749: goto L12d;
                case 1748609: goto L7d;
                case 1748801: goto L13a;
                case 1749822: goto L97;
                case 1749852: goto L3a;
                case 1750751: goto L20;
                case 1750754: goto Lec;
                case 1750815: goto L2a;
                case 1752549: goto L125;
                case 1752701: goto Lbb;
                case 1753422: goto L5e;
                case 1753640: goto Ld4;
                case 1754507: goto L50;
                case 1754538: goto Lc7;
                case 1754657: goto L108;
                case 1755469: goto L67;
                default: goto L15;
            }
        L15:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda38 r8 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda38
            r8.<init>(r14)
            androidx.lifecycle.viewmodel.C1093.m2380(r3, r8)
            java.lang.String r8 = "۠ۢۧ"
            goto Le
        L20:
            int r12 = androidx.documentfile.C1076.f102
            r8 = 16776614(0xfffda6, float:2.3509043E-38)
            r11 = r8 ^ r12
            java.lang.String r8 = "ۢۨۢ"
            goto Le
        L2a:
            r5 = 0
            r8 = 1
            androidx.lifecycle.livedata.C1085.m1833(r2, r5, r8)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r8, r10, r13)
            java.lang.String r8 = "۟ۢۤ"
            goto Le
        L3a:
            kevin.fun.hook.webdav.C1118.m8517(r2, r11)
            r8 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r8)
            java.lang.String r8 = "ۣۨۤ"
            goto Le
        L45:
            r8 = 1101004800(0x41a00000, float:20.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r8)
            kevin.fun.hook.webdav.C1118.m8517(r4, r12)
            java.lang.String r8 = "۟ۧۧ"
            goto Le
        L50:
            r6 = 298(0x12a, float:4.18E-43)
            r8 = 2375(0x947, float:3.328E-42)
            java.lang.String r6 = androidx.lifecycle.livedata.C1084.m1796(r7, r6, r11, r8)
            androidx.lifecycle.process.C1087.m1946(r2, r6)
            java.lang.String r8 = "ۣۦۢ"
            goto Le
        L5e:
            androidx.lifecycle.livedata.C1086.m1916(r4, r0)
            androidx.activity.C1064.m372(r1, r2)
            java.lang.String r8 = "۟۟ۡ"
            goto Le
        L67:
            r8 = 0
            androidx.activity.C1063.m290(r3, r8)
            int r10 = kevin.fun.hook.webdav.C1118.f417
            java.lang.String r8 = "ۥۧ۟"
            goto Le
        L70:
            r11 = r12 ^ (-455(0xfffffffffffffe39, float:NaN))
            r6 = 302(0x12e, float:4.23E-43)
            r8 = 333(0x14d, float:4.67E-43)
            java.lang.String r6 = androidx.vectordrawable.C1105.m3247(r7, r6, r11, r8)
            java.lang.String r8 = "ۦۦۨ"
            goto Le
        L7d:
            int r12 = androidx.core.ktx.C1071.f97
            r11 = r12 ^ (-899(0xfffffffffffffc7d, float:NaN))
            java.lang.String r8 = "ۥۢۢ"
            goto Le
        L84:
            androidx.activity.C1064.m372(r1, r3)
            androidx.activity.C1064.m372(r1, r4)
            java.lang.String r8 = "ۡۥۥ"
            goto Le
        L8d:
            short[] r7 = m7514()
            int r12 = kevin.fun.hook.C1120.f419
            java.lang.String r8 = "۟ۥۨ"
            goto Le
        L97:
            kevin.fun.hook.audio.C1117.m8126(r4, r11, r10, r12, r9)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda39 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda39
            r0.<init>()
            java.lang.String r8 = "ۦ۟ۧ"
            goto Le
        La3:
            int r12 = androidx.lifecycle.livedata.C1085.f111
            r11 = r12 ^ 777(0x309, float:1.089E-42)
            java.lang.String r8 = "ۣۧۧ"
            goto Le
        Lab:
            r8 = 1092616192(0x41200000, float:10.0)
            int r11 = m7476(r14, r8)
            r8 = 1084227584(0x40a00000, float:5.0)
            int r10 = m7476(r14, r8)
            java.lang.String r8 = "ۣۦۥ"
            goto Le
        Lbb:
            r8 = 7829021(0x77761d, float:1.0970795E-38)
            r12 = r8 ^ r10
            androidx.lifecycle.livedata.C1084.m1743(r3, r12)
            java.lang.String r8 = "ۣ۠"
            goto Le
        Lc7:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r14)
            short[] r7 = m7514()
            java.lang.String r8 = "۟ۥۥ"
            goto Le
        Ld4:
            androidx.interpolator.C1082.m53(r3, r6)
            r8 = 1098907648(0x41800000, float:16.0)
            androidx.versionedparcelable.C1107.m3449(r3, r8)
            java.lang.String r8 = "ۣۨۨ"
            goto Le
        Le0:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r11, r10)
            androidx.vectordrawable.C1105.m3296(r1, r5)
            java.lang.String r8 = "ۧۤۧ"
            goto Le
        Lec:
            r8 = 1092616192(0x41200000, float:10.0)
            int r12 = m7476(r14, r8)
            r8 = 1084227584(0x40a00000, float:5.0)
            int r9 = m7476(r14, r8)
            java.lang.String r8 = "ۣۢۧ"
            goto Le
        Lfc:
            androidx.lifecycle.livedata.C1085.m1822(r2, r5)
            android.widget.Button r3 = new android.widget.Button
            r3.<init>(r14)
            java.lang.String r8 = "ۥۨ"
            goto Le
        L108:
            r6 = 304(0x130, float:4.26E-43)
            r8 = 1
            r13 = 2561(0xa01, float:3.589E-42)
            java.lang.String r6 = kevin.fun.hook.webdav.C1118.m8509(r7, r6, r8, r13)
            androidx.lifecycle.process.C1087.m1946(r4, r6)
            java.lang.String r8 = "۟ۤۡ"
            goto Le
        L118:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r14)
            r8 = 0
            androidx.customview.C1074.m1119(r1, r8)
            java.lang.String r8 = "ۡ۟۟"
            goto Le
        L125:
            int r12 = androidx.lifecycle.process.C1089.f115
            r10 = r12 ^ (-930(0xfffffffffffffc5e, float:NaN))
            java.lang.String r8 = "ۣ۟۠"
            goto Le
        L12d:
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r14)
            short[] r7 = m7514()
            java.lang.String r8 = "ۧۨۢ"
            goto Le
        L13a:
            return r1
    }

    private static android.widget.LinearLayout createTtsLayout(android.app.Activity r15) {
            r14 = 1096810496(0x41600000, float:14.0)
            r13 = 1
            r12 = 1084227584(0x40a00000, float:5.0)
            r11 = 1092616192(0x41200000, float:10.0)
            r10 = 0
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r15)
            androidx.customview.C1074.m1119(r1, r13)
            int r0 = androidx.activity.C1065.f91
            r0 = r0 ^ 52
            androidx.lifecycle.livedata.C1085.m1855(r1, r0)
            int r2 = m7476(r15, r11)
            androidx.drawerlayout.C1077.m1314(r1, r10, r2, r10, r10)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r15)
            short[] r3 = m7514()
            r4 = 305(0x131, float:4.27E-43)
            int r5 = org.luckypray.dexkit.C1124.f434
            r5 = r5 ^ 660(0x294, float:9.25E-43)
            r6 = 1120(0x460, float:1.57E-42)
            java.lang.String r3 = androidx.lifecycle.process.C1087.m2008(r3, r4, r5, r6)
            androidx.lifecycle.process.C1087.m1946(r2, r3)
            r3 = -16776844(0xffffffffff000174, float:-1.7014873E38)
            int r4 = androidx.loader.C1094.f120
            r3 = r3 ^ r4
            kevin.fun.hook.webdav.C1118.m8517(r2, r3)
            androidx.vectordrawable.animated.C1102.m3105(r2, r14)
            r4 = 0
            androidx.lifecycle.livedata.C1085.m1833(r2, r4, r13)
            androidx.activity.C1064.m372(r1, r2)
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r15)
            short[] r4 = m7514()
            r5 = 312(0x138, float:4.37E-43)
            int r6 = org.luckypray.dexkit.C1125.f435
            r6 = r6 ^ (-238(0xffffffffffffff12, float:NaN))
            r7 = 2791(0xae7, float:3.911E-42)
            java.lang.String r4 = androidx.lifecycle.livedata.C1084.m1796(r4, r5, r6, r7)
            androidx.lifecycle.process.C1090.m2215(r2, r4)
            r4 = 1117782016(0x42a00000, float:80.0)
            int r4 = m7476(r15, r4)
            dev.rikka.ndk.thirdparty.libcxx.C1110.m3666(r2, r4)
            int r4 = androidx.lifecycle.process.C1091.f117
            r4 = r4 ^ (-476(0xfffffffffffffe24, float:NaN))
            androidx.core.C1072.m976(r2, r4)
            android.graphics.drawable.Drawable r4 = m7524(r15)
            androidx.vectordrawable.animated.C1102.m3095(r2, r4)
            int r4 = m7476(r15, r11)
            int r5 = m7476(r15, r11)
            int r6 = m7476(r15, r11)
            int r7 = m7476(r15, r11)
            kevin.fun.hook.audio.C1117.m8119(r2, r4, r5, r6, r7)
            int r4 = kevin.fun.hook.audio.C1117.f406
            r4 = r4 ^ (-73)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r0, r4)
            int r6 = m7476(r15, r12)
            r7 = 1097859072(0x41700000, float:15.0)
            int r7 = m7476(r15, r7)
            androidx.vectordrawable.animated.C1102.m3125(r5, r10, r6, r10, r7)
            kevin.fun.hook.audio.C1116.m8025(r2, r5)
            androidx.activity.C1064.m372(r1, r2)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r15)
            short[] r6 = m7514()
            r7 = 327(0x147, float:4.58E-43)
            int r8 = androidx.loader.C1095.f121
            r8 = r8 ^ (-967(0xfffffffffffffc39, float:NaN))
            r9 = 2685(0xa7d, float:3.762E-42)
            java.lang.String r6 = androidx.versionedparcelable.C1106.m3338(r6, r7, r8, r9)
            androidx.lifecycle.process.C1087.m1946(r5, r6)
            kevin.fun.hook.webdav.C1118.m8517(r5, r3)
            androidx.vectordrawable.animated.C1102.m3105(r5, r14)
            r3 = 0
            androidx.lifecycle.livedata.C1085.m1833(r5, r3, r13)
            androidx.activity.C1064.m372(r1, r5)
            android.widget.Spinner r3 = new android.widget.Spinner
            r3.<init>(r15)
            short[] r5 = m7514()
            r6 = 332(0x14c, float:4.65E-43)
            int r7 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r7 = r7 ^ (-108(0xffffffffffffff94, float:NaN))
            r8 = 2493(0x9bd, float:3.493E-42)
            java.lang.String r5 = androidx.startup.C1101.m3014(r5, r6, r7, r8)
            androidx.emoji2.viewsintegration.C1078.m1361(r3, r5)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            kevin.fun.hook.VoiceAssistantHook.ttsSpinnerRef = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            short[] r6 = m7514()
            r7 = 349(0x15d, float:4.89E-43)
            int r8 = androidx.activity.C1064.f90
            r8 = r8 ^ 480(0x1e0, float:6.73E-43)
            r9 = 441(0x1b9, float:6.18E-43)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r6, r7, r8, r9)
            androidx.emoji2.viewsintegration.C1078.m1429(r5, r6)
            android.widget.ArrayAdapter r6 = new android.widget.ArrayAdapter
            r7 = 17367420(0x109017c, float:2.516399E-38)
            int r8 = androidx.loader.C1094.f120
            r7 = r7 ^ r8
            r6.<init>(r15, r7, r5)
            r5 = -17367633(0xfffffffffef6fdaf, float:-1.6415364E38)
            int r7 = androidx.documentfile.C1076.f102
            r5 = r5 ^ r7
            androidx.loader.C1098.m2796(r6, r5)
            androidx.vectordrawable.C1105.m3262(r3, r6)
            kevin.fun.hook.VoiceAssistantHook$1 r5 = new kevin.fun.hook.VoiceAssistantHook$1
            r5.<init>()
            androidx.lifecycle.process.C1089.m2088(r3, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r0, r4)
            int r0 = m7476(r15, r12)
            r4 = 1097859072(0x41700000, float:15.0)
            int r4 = m7476(r15, r4)
            androidx.vectordrawable.animated.C1102.m3125(r5, r10, r0, r10, r4)
            androidx.vectordrawable.C1103.m3126(r3, r5)
            androidx.activity.C1064.m372(r1, r3)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r15)
            java.lang.String r3 = androidx.emoji2.C1080.m1562()
            androidx.lifecycle.process.C1087.m1946(r0, r3)
            r3 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r3)
            r3 = 7829136(0x777690, float:1.0970956E-38)
            int r4 = androidx.viewpager.C1108.f134
            r3 = r3 ^ r4
            kevin.fun.hook.webdav.C1118.m8517(r0, r3)
            int r3 = m7476(r15, r11)
            kevin.fun.hook.audio.C1117.m8126(r0, r10, r10, r10, r3)
            androidx.activity.C1064.m372(r1, r0)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            kevin.fun.hook.VoiceAssistantHook.ttsStatusTextRef = r3
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r15)
            androidx.customview.C1074.m1119(r3, r10)
            int r4 = m7476(r15, r11)
            androidx.drawerlayout.C1077.m1314(r3, r10, r10, r10, r4)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda9 r4 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda9
            r4.<init>(r2, r15, r0)
            short[] r0 = m7514()
            r2 = 359(0x167, float:5.03E-43)
            int r5 = androidx.loader.C1097.f123
            r5 = r5 ^ 112(0x70, float:1.57E-43)
            r6 = 661(0x295, float:9.26E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2213(r0, r2, r5, r6)
            r2 = 14576297(0xde6aa9, float:2.0425743E-38)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r2 = r2 ^ r5
            android.widget.Button r0 = m7489(r15, r0, r2, r4)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda10 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda10
            r2.<init>(r15)
            short[] r4 = m7514()
            r5 = 361(0x169, float:5.06E-43)
            int r6 = androidx.lifecycle.process.C1088.f114
            r6 = r6 ^ (-97)
            r7 = 994(0x3e2, float:1.393E-42)
            java.lang.String r4 = androidx.lifecycle.livedata.C1084.m1796(r4, r5, r6, r7)
            int r5 = androidx.appcompat.C1069.f95
            r5 = r5 ^ 26387(0x6713, float:3.6976E-41)
            android.widget.Button r2 = m7489(r15, r4, r5, r2)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda12 r4 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda12
            r4.<init>(r15)
            short[] r5 = m7514()
            r6 = 363(0x16b, float:5.09E-43)
            int r7 = androidx.vectordrawable.C1105.f131
            r7 = r7 ^ 356(0x164, float:4.99E-43)
            r8 = 2601(0xa29, float:3.645E-42)
            java.lang.String r5 = androidx.viewpager.C1108.m3518(r5, r6, r7, r8)
            r6 = 11751752(0xb35148, float:1.6467712E-38)
            int r7 = androidx.viewpager.C1108.f134
            r6 = r6 ^ r7
            android.widget.Button r4 = m7489(r15, r5, r6, r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            int r6 = kevin.fun.hook.audio.C1114.f403
            r6 = r6 ^ 18
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r10, r6, r7)
            int r6 = m7476(r15, r12)
            androidx.vectordrawable.animated.C1102.m3125(r5, r10, r10, r6, r10)
            androidx.vectordrawable.C1104.m3200(r0, r5)
            androidx.vectordrawable.C1104.m3200(r2, r5)
            androidx.vectordrawable.C1104.m3200(r4, r5)
            androidx.activity.C1064.m372(r3, r0)
            androidx.activity.C1064.m372(r3, r2)
            androidx.activity.C1064.m372(r3, r4)
            androidx.activity.C1064.m372(r1, r3)
            java.lang.String r0 = m7502()
            boolean r2 = androidx.documentfile.C1076.m1246(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L200:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L206;
                case 49: goto L209;
                case 204: goto L20e;
                case 239: goto L235;
                default: goto L205;
            }
        L205:
            goto L200
        L206:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L200
        L209:
            if (r2 != 0) goto L206
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L200
        L20e:
            java.util.Map r0 = m7531()
            boolean r2 = org.luckypray.dexkit.C1123.m10501(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L218:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L21e;
                case 54: goto L223;
                case 471: goto L235;
                case 500: goto L226;
                default: goto L21d;
            }
        L21d:
            goto L218
        L21e:
            if (r2 == 0) goto L223
            r0 = 1833(0x729, float:2.569E-42)
            goto L218
        L223:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L218
        L226:
            m7503(r15)
            r0 = 1864(0x748, float:2.612E-42)
        L22b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L231;
                case 47483: goto L260;
                default: goto L230;
            }
        L230:
            goto L22b
        L231:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L22b
        L235:
            java.util.Map r0 = m7531()
            boolean r2 = org.luckypray.dexkit.C1123.m10501(r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L240:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L248;
                case 45: goto L260;
                case 76: goto L252;
                case 239: goto L24c;
                default: goto L247;
            }
        L247:
            goto L240
        L248:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L240
        L24c:
            if (r2 != 0) goto L248
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L240
        L252:
            m7534(r15)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L258:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L260;
                case 503: goto L261;
                default: goto L25f;
            }
        L25f:
            goto L258
        L260:
            return r1
        L261:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L258
    }

    private static void dismissDialog() {
            java.lang.ref.WeakReference r1 = m7487()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L4a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference r0 = m7487()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L2b;
                case 471: goto L47;
                case 500: goto L2e;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            if (r0 == 0) goto L2b
            r1 = 1833(0x729, float:2.569E-42)
            goto L20
        L2b:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L20
        L2e:
            boolean r2 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r1 = 1864(0x748, float:2.612E-42)
        L34:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L3a;
                case 47384: goto L47;
                case 47417: goto L44;
                case 47483: goto L40;
                default: goto L39;
            }
        L39:
            goto L34
        L3a:
            if (r2 == 0) goto L40
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L34
        L40:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L34
        L44:
            androidx.customview.C1074.m1118(r0)
        L47:
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.dialogRef = r0
        L4a:
            m7535()
            m7516()
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L57:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L5f;
                case 45: goto L78;
                case 76: goto L69;
                case 239: goto L63;
                default: goto L5e;
            }
        L5e:
            goto L57
        L5f:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L57
        L63:
            if (r1 > 0) goto L5f
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L57
        L69:
            java.lang.String r0 = "hAW5R6Q"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L78:
            return
    }

    private static void doReplace() {
            r0 = 0
            android.net.Uri r2 = m7479()
            r1 = 1616(0x650, float:2.264E-42)
        L7:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L15;
                case 239: goto L4c;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r2 != 0) goto Ld
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            short[] r1 = m7514()
            r2 = 365(0x16d, float:5.11E-43)
            int r3 = androidx.customview.C1075.f101
            r3 = r3 ^ (-110(0xffffffffffffff92, float:NaN))
            r4 = 2506(0x9ca, float:3.512E-42)
            java.lang.String r1 = androidx.drawerlayout.C1077.m1343(r1, r2, r3, r4)
            m7474(r0, r1)
            int r1 = androidx.activity.C1062.m182()
            r0 = 1740(0x6cc, float:2.438E-42)
        L2e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L34;
                case 54: goto L39;
                case 471: goto L4b;
                case 500: goto L3c;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            if (r1 < 0) goto L39
            r0 = 1833(0x729, float:2.569E-42)
            goto L2e
        L39:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2e
        L3c:
            java.lang.String r0 = "s4CHx77MwSdXW2iab9AezVEUqXy6"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L4b:
            return
        L4c:
            java.lang.ref.WeakReference r2 = m7543()
            r1 = 1864(0x748, float:2.612E-42)
        L52:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L58;
                case 47384: goto L6c;
                case 47417: goto L62;
                case 47483: goto L5e;
                default: goto L57;
            }
        L57:
            goto L52
        L58:
            if (r2 == 0) goto L5e
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L52
        L5e:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L52
        L62:
            java.lang.ref.WeakReference r0 = m7543()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.app.Activity r0 = (android.app.Activity) r0
        L6c:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L6f:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L77;
                case 45: goto L81;
                case 76: goto L4b;
                case 239: goto L7b;
                default: goto L76;
            }
        L76:
            goto L6f
        L77:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L6f
        L7b:
            if (r0 != 0) goto L77
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L6f
        L81:
            java.util.concurrent.ExecutorService r1 = m7507()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda17 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda17
            r2.<init>(r0)
            androidx.activity.C1063.m244(r1, r2)
            goto L4b
    }

    private static void doTtsReplace(android.app.Activity r4) {
            java.lang.String r1 = m7513()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L4e;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m7513()
            r0.<init>(r1)
            boolean r1 = androidx.vectordrawable.C1105.m3294(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L3d;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 != 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            r0 = 1864(0x748, float:2.612E-42)
        L33:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L39;
                case 47483: goto L4e;
                default: goto L38;
            }
        L38:
            goto L33
        L39:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L33
        L3d:
            java.lang.String r0 = m7513()
            java.util.concurrent.ExecutorService r1 = m7507()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda41 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda41
            r2.<init>(r4, r0)
            androidx.activity.C1063.m244(r1, r2)
        L4d:
            return
        L4e:
            short[] r0 = m7514()
            r1 = 373(0x175, float:5.23E-43)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r2 = r2 ^ 640(0x280, float:8.97E-43)
            r3 = 2786(0xae2, float:3.904E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            m7474(r4, r0)
            goto L4d
    }

    private static void downloadAudioFile(java.lang.String r4, android.widget.TextView r5) {
            r1 = 0
            java.lang.String r3 = "ۧۤۨ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1749636: goto L1b;
                case 1750631: goto L24;
                case 1753662: goto L14;
                default: goto Lc;
            }
        Lc:
            java.util.concurrent.ExecutorService r1 = m7507()
            java.lang.String r3 = "ۣۢۡ"
            r2 = r1
            goto L5
        L14:
            androidx.activity.C1063.m244(r2, r0)
            java.lang.String r1 = "ۣۢۦ"
            r3 = r1
            goto L5
        L1b:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda40 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda40
            r0.<init>(r4, r5)
            java.lang.String r1 = "ۦۧ۟"
            r3 = r1
            goto L5
        L24:
            return
    }

    private static int dpToPx(android.content.Context r2, float r3) {
            r1 = 1056964608(0x3f000000, float:0.5)
            r0 = 1616(0x650, float:2.264E-42)
        L4:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto La;
                case 49: goto Ld;
                case 204: goto L12;
                case 239: goto L18;
                default: goto L9;
            }
        L9:
            goto L4
        La:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L4
        Ld:
            if (r2 != 0) goto La
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L4
        L12:
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r3
            float r0 = r0 + r1
            int r0 = (int) r0
        L17:
            return r0
        L18:
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r2)
            android.util.DisplayMetrics r0 = androidx.activity.C1062.m159(r0)
            float r0 = androidx.vectordrawable.animated.C1102.m3118(r0)
            float r0 = r0 * r3
            float r0 = r0 + r1
            int r0 = (int) r0
            goto L17
    }

    private static android.net.Uri getAudioDirUri(android.content.Context r6) {
            r0 = 0
            short[] r1 = m7514()
            r2 = 386(0x182, float:5.41E-43)
            int r3 = androidx.vectordrawable.C1104.f130
            r3 = r3 ^ 604(0x25c, float:8.46E-43)
            r4 = 1814(0x716, float:2.542E-42)
            java.lang.String r1 = androidx.loader.C1097.m2734(r1, r2, r3, r4)
            r2 = 0
            android.content.SharedPreferences r1 = androidx.drawerlayout.C1077.m1322(r6, r1, r2)
            short[] r2 = m7514()
            r3 = 401(0x191, float:5.62E-43)
            int r4 = androidx.versionedparcelable.C1107.f133
            r4 = r4 ^ 649(0x289, float:9.1E-43)
            r5 = 2906(0xb5a, float:4.072E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)
            java.lang.String r2 = androidx.loader.C1096.m2655(r1, r2, r0)
            r1 = 1616(0x650, float:2.264E-42)
        L2c:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L32;
                case 49: goto L35;
                case 204: goto L3a;
                case 239: goto L45;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L2c
        L35:
            if (r2 != 0) goto L32
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L2c
        L3a:
            r1 = 1740(0x6cc, float:2.438E-42)
        L3c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L42;
                case 54: goto L49;
                default: goto L41;
            }
        L41:
            goto L3c
        L42:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L3c
        L45:
            android.net.Uri r0 = androidx.activity.C1063.m240(r2)
        L49:
            return r0
    }

    public static void initWithContext(android.content.Context r6) {
            m7532(r6)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            m7495(r0)     // Catch: java.lang.Throwable -> L16
            r0 = 1
            kevin.fun.hook.VoiceAssistantHook.isInitialized = r0     // Catch: java.lang.Throwable -> L16
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L13;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            return
        L13:
            r0 = 1647(0x66f, float:2.308E-42)
            goto Lc
        L16:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 414(0x19e, float:5.8E-43)
            int r4 = androidx.activity.C1065.f91
            r4 = r4 ^ (-37)
            r5 = 1015(0x3f7, float:1.422E-42)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8576(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            goto L12
    }

    static /* synthetic */ void lambda$0(android.content.Context r2) {
            m7545(r2)
            int r1 = androidx.interpolator.C1081.m1643()
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L26;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 > 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "oM3NjD7JEMi50oCTLbkZz2pBHkIBN"
            java.lang.String r0 = androidx.startup.C1101.m2985(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* synthetic */ void lambda$1(android.app.Activity r2) {
            android.os.Handler r0 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda8 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda8
            r1.<init>(r2)
            androidx.activity.C1062.m178(r0, r1)
            return
    }

    static /* synthetic */ void lambda$10(android.app.Activity r6, android.view.View r7) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L48
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L48
            r2 = 430(0x1ae, float:6.03E-43)
            int r3 = androidx.documentfile.C1076.f102     // Catch: java.lang.Exception -> L48
            r3 = r3 ^ (-580(0xfffffffffffffdbc, float:NaN))
            r4 = 2228(0x8b4, float:3.122E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8169(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L48
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L48
            r3 = 456(0x1c8, float:6.39E-43)
            int r4 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Exception -> L48
            r4 = r4 ^ (-98)
            r5 = 2437(0x985, float:3.415E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L48
            android.net.Uri r2 = androidx.activity.C1063.m240(r2)     // Catch: java.lang.Exception -> L48
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L48
            androidx.core.ktx.C1071.m893(r6, r0)     // Catch: java.lang.Exception -> L48
            r0 = 1616(0x650, float:2.264E-42)
        L2e:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L34;
                case 49: goto L45;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1740(0x6cc, float:2.438E-42)
        L3a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L40;
                case 54: goto L5d;
                case 471: goto L6f;
                case 500: goto L60;
                default: goto L3f;
            }
        L3f:
            goto L3a
        L40:
            if (r1 < 0) goto L5d
            r0 = 1833(0x729, float:2.569E-42)
            goto L3a
        L45:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L2e
        L48:
            r0 = move-exception
            short[] r0 = m7514()
            r1 = 471(0x1d7, float:6.6E-43)
            int r2 = org.luckypray.dexkit.C1123.f433
            r2 = r2 ^ (-984(0xfffffffffffffc28, float:NaN))
            r3 = 1311(0x51f, float:1.837E-42)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r1, r2, r3)
            m7474(r6, r0)
            goto L34
        L5d:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3a
        L60:
            java.lang.String r0 = "W7"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L6f:
            return
    }

    static /* synthetic */ void lambda$11(android.widget.EditText r9, android.app.Activity r10, android.app.Dialog r11, android.view.View r12) {
            r6 = 0
            r1 = 0
            java.lang.String r8 = "ۧۨ۟"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r6
            r7 = r6
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r8)
            switch(r1) {
                case 1746906: goto L1a;
                case 1747719: goto L54;
                case 1749695: goto L31;
                case 1750657: goto L45;
                case 1753608: goto L21;
                case 1754502: goto L4c;
                case 1754530: goto L38;
                case 1754532: goto L5b;
                case 1754654: goto L28;
                case 1755402: goto L64;
                default: goto L11;
            }
        L11:
            java.lang.String r1 = androidx.startup.C1101.m2982(r3)
            java.lang.String r6 = "ۧۤۡ"
            r4 = r1
            r8 = r6
            goto La
        L1a:
            m7474(r10, r4)
            java.lang.String r1 = "ۣۣۡ"
            r8 = r1
            goto La
        L21:
            int r1 = kevin.fun.hook.webdav.C1119.f418
            java.lang.String r6 = "ۣۢ۠"
            r5 = r1
            r8 = r6
            goto La
        L28:
            android.text.Editable r1 = androidx.drawerlayout.C1077.m1276(r9)
            java.lang.String r6 = "ۤۢۨ"
            r3 = r1
            r8 = r6
            goto La
        L31:
            r6 = r5 ^ 296(0x128, float:4.15E-43)
            java.lang.String r1 = "ۧۤ۟"
            r7 = r6
            r8 = r1
            goto La
        L38:
            r1 = 488(0x1e8, float:6.84E-43)
            r4 = 3028(0xbd4, float:4.243E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r1, r7, r4)
            java.lang.String r6 = "۟ۦۡ"
            r4 = r1
            r8 = r6
            goto La
        L45:
            androidx.customview.C1074.m1118(r11)
            java.lang.String r1 = "ۣۨۡ"
            r8 = r1
            goto La
        L4c:
            short[] r0 = m7514()
            java.lang.String r1 = "ۦۥۧ"
            r8 = r1
            goto La
        L54:
            m7538(r10, r2)
            java.lang.String r1 = "ۣۧۢ"
            r8 = r1
            goto La
        L5b:
            java.lang.String r1 = androidx.documentfile.C1076.m1236(r4)
            java.lang.String r6 = "۠ۡۨ"
            r2 = r1
            r8 = r6
            goto La
        L64:
            return
    }

    static /* synthetic */ void lambda$12(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$13(android.widget.EditText r4, android.app.Activity r5, android.widget.TextView r6, android.view.View r7) {
            android.text.Editable r0 = androidx.drawerlayout.C1077.m1276(r4)
            java.lang.String r0 = androidx.startup.C1101.m2982(r0)
            java.lang.String r1 = androidx.documentfile.C1076.m1236(r0)
            boolean r2 = androidx.documentfile.C1076.m1246(r1)
            r0 = 1616(0x650, float:2.264E-42)
        L12:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L18;
                case 49: goto L1b;
                case 204: goto L20;
                case 239: goto L34;
                default: goto L17;
            }
        L17:
            goto L12
        L18:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L12
        L1b:
            if (r2 == 0) goto L18
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L12
        L20:
            short[] r0 = m7514()
            r1 = 502(0x1f6, float:7.03E-43)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 381(0x17d, float:5.34E-43)
            r3 = 2923(0xb6b, float:4.096E-42)
            java.lang.String r0 = androidx.core.ktx.C1071.m874(r0, r1, r2, r3)
            m7474(r5, r0)
        L33:
            return
        L34:
            java.lang.String r0 = m7502()
            boolean r2 = androidx.documentfile.C1076.m1246(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L3e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L44;
                case 54: goto L49;
                case 471: goto L85;
                case 500: goto L4c;
                default: goto L43;
            }
        L43:
            goto L3e
        L44:
            if (r2 == 0) goto L49
            r0 = 1833(0x729, float:2.569E-42)
            goto L3e
        L49:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3e
        L4c:
            short[] r0 = m7514()
            r1 = 511(0x1ff, float:7.16E-43)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 356(0x164, float:4.99E-43)
            r3 = 2220(0x8ac, float:3.111E-42)
            java.lang.String r0 = androidx.vectordrawable.C1103.m3132(r0, r1, r2, r3)
            m7474(r5, r0)
            int r1 = androidx.appcompat.C1069.m747()
            r0 = 1864(0x748, float:2.612E-42)
        L65:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L6b;
                case 47384: goto L33;
                case 47417: goto L75;
                case 47483: goto L71;
                default: goto L6a;
            }
        L6a:
            goto L65
        L6b:
            if (r1 < 0) goto L71
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L65
        L71:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L65
        L75:
            java.lang.String r0 = "ZmyK7ilrvhJs"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L33
        L85:
            java.lang.String r0 = m7510()
            boolean r2 = androidx.documentfile.C1076.m1246(r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L90:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L98;
                case 45: goto Lb7;
                case 76: goto La2;
                case 239: goto L9c;
                default: goto L97;
            }
        L97:
            goto L90
        L98:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L90
        L9c:
            if (r2 == 0) goto L98
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L90
        La2:
            short[] r0 = m7514()
            r1 = 527(0x20f, float:7.38E-43)
            int r2 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ 21
            r3 = 398(0x18e, float:5.58E-43)
            java.lang.String r0 = androidx.vectordrawable.C1103.m3132(r0, r1, r2, r3)
            m7474(r5, r0)
            goto L33
        Lb7:
            m7486(r1, r6)
            goto L33
    }

    static /* synthetic */ void lambda$14(android.app.Activity r4, android.view.View r5) {
            java.lang.String r1 = m7513()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L44;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m7513()
            r0.<init>(r1)
            boolean r1 = androidx.vectordrawable.C1105.m3294(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L44;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 == 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = m7513()
            m7500(r4, r0)
            r0 = 1864(0x748, float:2.612E-42)
        L3a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L40;
                case 47483: goto L57;
                default: goto L3f;
            }
        L3f:
            goto L3a
        L40:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3a
        L44:
            short[] r0 = m7514()
            r1 = 533(0x215, float:7.47E-43)
            int r2 = kevin.fun.hook.C1120.f419
            r2 = r2 ^ (-461(0xfffffffffffffe33, float:NaN))
            r3 = 3217(0xc91, float:4.508E-42)
            java.lang.String r0 = androidx.core.ktx.C1070.m788(r0, r1, r2, r3)
            m7474(r4, r0)
        L57:
            return
    }

    static /* synthetic */ void lambda$15(android.app.Activity r4, android.view.View r5) {
            java.lang.String r1 = m7513()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L40;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m7513()
            r0.<init>(r1)
            boolean r1 = androidx.vectordrawable.C1105.m3294(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L40;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 == 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            m7511(r4)
            r0 = 1864(0x748, float:2.612E-42)
        L36:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3c;
                case 47483: goto L53;
                default: goto L3b;
            }
        L3b:
            goto L36
        L3c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L36
        L40:
            short[] r0 = m7514()
            r1 = 541(0x21d, float:7.58E-43)
            int r2 = kevin.fun.hook.audio.C1116.f405
            r2 = r2 ^ 90
            r3 = 2235(0x8bb, float:3.132E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
            m7474(r4, r0)
        L53:
            return
    }

    static /* synthetic */ void lambda$16(java.lang.String r8, android.widget.TextView r9) {
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L364
            r1.<init>()     // Catch: java.lang.Exception -> L364
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r2 = 549(0x225, float:7.7E-43)
            int r3 = androidx.interpolator.C1081.f107     // Catch: java.lang.Exception -> L364
            r3 = r3 ^ (-262(0xfffffffffffffefa, float:NaN))
            r4 = 2159(0x86f, float:3.025E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L364
            java.lang.String r2 = m7502()     // Catch: java.lang.Exception -> L364
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L364
            r3.<init>()     // Catch: java.lang.Exception -> L364
            short[] r4 = m7514()     // Catch: java.lang.Exception -> L364
            r5 = 562(0x232, float:7.88E-43)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Exception -> L364
            r6 = r6 ^ (-931(0xfffffffffffffc5d, float:NaN))
            r7 = 2523(0x9db, float:3.535E-42)
            java.lang.String r4 = androidx.documentfile.C1076.m1234(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L364
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)     // Catch: java.lang.Exception -> L364
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)     // Catch: java.lang.Exception -> L364
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Exception -> L364
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r1, r0, r2)     // Catch: java.lang.Exception -> L364
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r2 = 569(0x239, float:7.97E-43)
            int r3 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Exception -> L364
            r3 = r3 ^ (-101(0xffffffffffffff9b, float:NaN))
            r4 = 3253(0xcb5, float:4.558E-42)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 579(0x243, float:8.11E-43)
            int r4 = androidx.loader.C1098.f124     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ (-772(0xfffffffffffffcfc, float:NaN))
            r5 = 895(0x37f, float:1.254E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r1, r0, r2)     // Catch: java.lang.Exception -> L364
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r2 = 612(0x264, float:8.58E-43)
            int r3 = androidx.viewpager.C1108.f134     // Catch: java.lang.Exception -> L364
            r3 = r3 ^ (-492(0xfffffffffffffe14, float:NaN))
            r4 = 1286(0x506, float:1.802E-42)
            java.lang.String r0 = androidx.loader.C1096.m2645(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 624(0x270, float:8.74E-43)
            int r4 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 574(0x23e, float:8.04E-43)
            r5 = 494(0x1ee, float:6.92E-43)
            java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r1, r0, r2)     // Catch: java.lang.Exception -> L364
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L364
            r0.<init>()     // Catch: java.lang.Exception -> L364
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L364
            r2.<init>()     // Catch: java.lang.Exception -> L364
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L364
            r3.<init>()     // Catch: java.lang.Exception -> L364
            short[] r4 = m7514()     // Catch: java.lang.Exception -> L364
            r5 = 640(0x280, float:8.97E-43)
            int r6 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Exception -> L364
            r6 = r6 ^ (-452(0xfffffffffffffe3c, float:NaN))
            r7 = 525(0x20d, float:7.36E-43)
            java.lang.String r4 = androidx.annotation.experimental.C1067.m581(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L364
            java.lang.String r5 = m7510()     // Catch: java.lang.Exception -> L364
            androidx.drawerlayout.C1077.m1338(r3, r4, r5)     // Catch: java.lang.Exception -> L364
            short[] r4 = m7514()     // Catch: java.lang.Exception -> L364
            r5 = 647(0x287, float:9.07E-43)
            int r6 = androidx.viewpager.C1108.f134     // Catch: java.lang.Exception -> L364
            r6 = r6 ^ (-484(0xfffffffffffffe1c, float:NaN))
            r7 = 1883(0x75b, float:2.639E-42)
            java.lang.String r4 = androidx.lifecycle.runtime.C1092.m2337(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L364
            androidx.drawerlayout.C1077.m1338(r3, r4, r8)     // Catch: java.lang.Exception -> L364
            androidx.activity.C1063.m261(r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r3 = m7514()     // Catch: java.lang.Exception -> L364
            r4 = 651(0x28b, float:9.12E-43)
            int r5 = androidx.emoji2.C1080.f106     // Catch: java.lang.Exception -> L364
            r5 = r5 ^ 369(0x171, float:5.17E-43)
            r6 = 365(0x16d, float:5.11E-43)
            java.lang.String r3 = androidx.activity.C1063.m241(r3, r4, r5, r6)     // Catch: java.lang.Exception -> L364
            androidx.drawerlayout.C1077.m1338(r0, r3, r2)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 659(0x293, float:9.23E-43)
            int r4 = androidx.core.C1072.f98     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ (-534(0xfffffffffffffdea, float:NaN))
            r5 = 2632(0xa48, float:3.688E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1125.m10615(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            int r3 = m7484()     // Catch: java.lang.Exception -> L364
            androidx.core.ktx.C1071.m843(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 669(0x29d, float:9.37E-43)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ (-939(0xfffffffffffffc55, float:NaN))
            r5 = 1643(0x66b, float:2.302E-42)
            java.lang.String r2 = androidx.interpolator.C1083.m1723(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            int r3 = m7473()     // Catch: java.lang.Exception -> L364
            androidx.core.ktx.C1071.m843(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 684(0x2ac, float:9.58E-43)
            int r4 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 81
            r5 = 341(0x155, float:4.78E-43)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            int r3 = m7494()     // Catch: java.lang.Exception -> L364
            androidx.core.ktx.C1071.m843(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 708(0x2c4, float:9.92E-43)
            int r4 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 362(0x16a, float:5.07E-43)
            r5 = 576(0x240, float:8.07E-43)
            java.lang.String r2 = androidx.vectordrawable.C1105.m3247(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            int r3 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Exception -> L364
            r3 = r3 ^ (-108(0xffffffffffffff94, float:NaN))
            androidx.core.ktx.C1071.m843(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 720(0x2d0, float:1.009E-42)
            int r4 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 263(0x107, float:3.69E-43)
            r5 = 2874(0xb3a, float:4.027E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1085.m1814(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            boolean r3 = m7482()     // Catch: java.lang.Exception -> L364
            androidx.activity.C1065.m435(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 731(0x2db, float:1.024E-42)
            int r4 = androidx.loader.C1097.f123     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 119(0x77, float:1.67E-43)
            r5 = 2659(0xa63, float:3.726E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1084.m1796(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            boolean r3 = m7544()     // Catch: java.lang.Exception -> L364
            androidx.activity.C1065.m435(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 736(0x2e0, float:1.031E-42)
            int r4 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ (-425(0xfffffffffffffe57, float:NaN))
            r5 = 1936(0x790, float:2.713E-42)
            java.lang.String r2 = androidx.core.C1073.m1028(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            boolean r3 = m7519()     // Catch: java.lang.Exception -> L364
            androidx.activity.C1065.m435(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 743(0x2e7, float:1.041E-42)
            int r4 = androidx.loader.C1097.f123     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 116(0x74, float:1.63E-43)
            r5 = 1654(0x676, float:2.318E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1124.m10545(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            boolean r3 = m7526()     // Catch: java.lang.Exception -> L364
            androidx.activity.C1065.m435(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 749(0x2ed, float:1.05E-42)
            int r4 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 293(0x125, float:4.1E-43)
            r5 = 385(0x181, float:5.4E-43)
            java.lang.String r2 = androidx.loader.C1096.m2645(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            boolean r3 = m7528()     // Catch: java.lang.Exception -> L364
            androidx.activity.C1065.m435(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 752(0x2f0, float:1.054E-42)
            int r4 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 23
            r5 = 2379(0x94b, float:3.334E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            int r3 = m7525()     // Catch: java.lang.Exception -> L364
            androidx.core.ktx.C1071.m843(r0, r2, r3)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 756(0x2f4, float:1.06E-42)
            int r4 = androidx.viewpager.C1108.f134     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ (-449(0xfffffffffffffe3f, float:NaN))
            r5 = 2654(0xa5e, float:3.719E-42)
            java.lang.String r2 = androidx.startup.C1101.m3014(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            java.lang.String r0 = androidx.viewpager.C1108.m3553(r0)     // Catch: java.lang.Exception -> L364
            java.lang.String r2 = m7520(r2, r0, r1)     // Catch: java.lang.Exception -> L364
            r0 = 1616(0x650, float:2.264E-42)
        L1d2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1d8;
                case 49: goto L1db;
                case 204: goto L1e0;
                case 239: goto L356;
                default: goto L1d7;
            }     // Catch: java.lang.Exception -> L364
        L1d7:
            goto L1d2
        L1d8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1d2
        L1db:
            if (r2 == 0) goto L1d8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1d2
        L1e0:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 795(0x31b, float:1.114E-42)
            int r4 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 207(0xcf, float:2.9E-43)
            r5 = 2232(0x8b8, float:3.128E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            boolean r3 = androidx.emoji2.C1080.m1554(r2, r0)     // Catch: java.lang.Exception -> L364
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f6:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1fc;
                case 54: goto L201;
                case 471: goto L210;
                case 500: goto L204;
                default: goto L1fb;
            }     // Catch: java.lang.Exception -> L364
        L1fb:
            goto L1f6
        L1fc:
            if (r3 == 0) goto L201
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f6
        L201:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f6
        L204:
            r0 = 1864(0x748, float:2.612E-42)
        L206:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L20c;
                case 47483: goto L356;
                default: goto L20b;
            }     // Catch: java.lang.Exception -> L364
        L20b:
            goto L206
        L20c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L206
        L210:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L364
            r3.<init>(r2)     // Catch: java.lang.Exception -> L364
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r2 = 807(0x327, float:1.131E-42)
            int r4 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 934(0x3a6, float:1.309E-42)
            r5 = 2167(0x877, float:3.037E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r2, r4, r5)     // Catch: java.lang.Exception -> L364
            int r2 = androidx.vectordrawable.animated.C1102.m3071(r3, r0)     // Catch: java.lang.Exception -> L364
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L22c:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 14: goto L234;
                case 45: goto L27b;
                case 76: goto L240;
                case 239: goto L238;
                default: goto L233;
            }     // Catch: java.lang.Exception -> L364
        L233:
            goto L22c
        L234:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L22c
        L238:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L234
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L22c
        L240:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r2 = 813(0x32d, float:1.139E-42)
            int r4 = androidx.startup.C1101.f127     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ 762(0x2fa, float:1.068E-42)
            r5 = 1759(0x6df, float:2.465E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r2, r4, r5)     // Catch: java.lang.Exception -> L364
            org.json.JSONObject r0 = androidx.vectordrawable.C1105.m3254(r3, r0)     // Catch: java.lang.Exception -> L364
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L364
            r3 = 817(0x331, float:1.145E-42)
            int r4 = androidx.loader.C1095.f121     // Catch: java.lang.Exception -> L364
            r4 = r4 ^ (-962(0xfffffffffffffc3e, float:NaN))
            r5 = 3238(0xca6, float:4.537E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1125.m10615(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L364
            java.lang.String r0 = androidx.loader.C1096.m2683(r0, r2)     // Catch: java.lang.Exception -> L364
            m7542(r0, r1, r9)     // Catch: java.lang.Exception -> L364
            r0 = 48891(0xbefb, float:6.8511E-41)
        L26e:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L276;
                case 503: goto L277;
                default: goto L275;
            }     // Catch: java.lang.Exception -> L364
        L275:
            goto L26e
        L276:
            return
        L277:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L26e
        L27b:
            r0 = 49666(0xc202, float:6.9597E-41)
        L27e:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L286;
                case 50: goto L28e;
                case 76: goto L292;
                case 83: goto L2ad;
                default: goto L285;
            }     // Catch: java.lang.Exception -> L364
        L285:
            goto L27e
        L286:
            r0 = 401(0x191, float:5.62E-43)
            if (r2 != r0) goto L28e
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L27e
        L28e:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L27e
        L292:
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L364
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda43 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda43     // Catch: java.lang.Exception -> L364
            r1.<init>(r9)     // Catch: java.lang.Exception -> L364
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Exception -> L364
            r0 = 49790(0xc27e, float:6.977E-41)
        L2a1:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L276;
                case 241: goto L2a9;
                default: goto L2a8;
            }     // Catch: java.lang.Exception -> L364
        L2a8:
            goto L2a1
        L2a9:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L2a1
        L2ad:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L2b0:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L2b8;
                case 1711: goto L2c0;
                case 1736: goto L33b;
                case 1769: goto L2c4;
                default: goto L2b7;
            }     // Catch: java.lang.Exception -> L364
        L2b7:
            goto L2b0
        L2b8:
            r0 = 403(0x193, float:5.65E-43)
            if (r2 != r0) goto L2c0
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L2b0
        L2c0:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L2b0
        L2c4:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r1 = 819(0x333, float:1.148E-42)
            int r2 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Exception -> L364
            r2 = r2 ^ (-493(0xfffffffffffffe13, float:NaN))
            r4 = 802(0x322, float:1.124E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r4)     // Catch: java.lang.Exception -> L364
            java.lang.String r1 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Exception -> L364
            java.lang.String r1 = androidx.loader.C1095.m2550(r3, r0, r1)     // Catch: java.lang.Exception -> L364
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L364
            r2 = 826(0x33a, float:1.157E-42)
            int r3 = androidx.loader.C1098.f124     // Catch: java.lang.Exception -> L364
            r3 = r3 ^ (-818(0xfffffffffffffcce, float:NaN))
            r4 = 2502(0x9c6, float:3.506E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1796(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L364
            boolean r2 = androidx.emoji2.C1080.m1554(r1, r0)     // Catch: java.lang.Exception -> L364
            r0 = 50689(0xc601, float:7.103E-41)
        L2f3:
            r3 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 19: goto L2fb;
                case 45: goto L320;
                case 50: goto L301;
                case 76: goto L305;
                default: goto L2fa;
            }     // Catch: java.lang.Exception -> L364
        L2fa:
            goto L2f3
        L2fb:
            if (r2 == 0) goto L301
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L2f3
        L301:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L2f3
        L305:
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L364
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda44 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda44     // Catch: java.lang.Exception -> L364
            r1.<init>(r9)     // Catch: java.lang.Exception -> L364
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Exception -> L364
            r0 = 50813(0xc67d, float:7.1204E-41)
        L314:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L276;
                case 243: goto L31c;
                default: goto L31b;
            }     // Catch: java.lang.Exception -> L364
        L31b:
            goto L314
        L31c:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L314
        L320:
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L364
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda45 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda45     // Catch: java.lang.Exception -> L364
            r2.<init>(r9, r1)     // Catch: java.lang.Exception -> L364
            androidx.activity.C1062.m178(r0, r2)     // Catch: java.lang.Exception -> L364
            r0 = 51588(0xc984, float:7.229E-41)
        L32f:
            r1 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L337;
                case 54: goto L276;
                default: goto L336;
            }     // Catch: java.lang.Exception -> L364
        L336:
            goto L32f
        L337:
            r0 = 51619(0xc9a3, float:7.2334E-41)
            goto L32f
        L33b:
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L364
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda46 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda46     // Catch: java.lang.Exception -> L364
            r1.<init>(r9, r3)     // Catch: java.lang.Exception -> L364
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Exception -> L364
            r0 = 51712(0xca00, float:7.2464E-41)
        L34a:
            r1 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L276;
                case 15: goto L351;
                case 16: goto L351;
                case 17: goto L352;
                default: goto L351;
            }     // Catch: java.lang.Exception -> L364
        L351:
            goto L34a
        L352:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L34a
        L356:
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L364
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda42 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda42     // Catch: java.lang.Exception -> L364
            r1.<init>(r9)     // Catch: java.lang.Exception -> L364
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Exception -> L364
            goto L276
        L364:
            r0 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7514()
            r4 = 845(0x34d, float:1.184E-42)
            int r5 = androidx.lifecycle.runtime.C1092.f118
            r5 = r5 ^ 783(0x30f, float:1.097E-42)
            r6 = 862(0x35e, float:1.208E-42)
            java.lang.String r3 = androidx.viewpager.C1108.m3518(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7537(r1)
            android.os.Handler r1 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda1 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda1
            r2.<init>(r9, r0)
            androidx.activity.C1062.m178(r1, r2)
            goto L276
    }

    static /* synthetic */ void lambda$17(android.widget.TextView r7) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۤۢۢ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1747873: goto L30;
                case 1748707: goto L1d;
                case 1748798: goto L10;
                case 1750657: goto L29;
                case 1750783: goto L16;
                case 1751588: goto L3e;
                case 1753607: goto L37;
                case 1755556: goto L46;
                default: goto Lf;
            }
        Lf:
            return
        L10:
            r4 = r6 ^ 904(0x388, float:1.267E-42)
            java.lang.String r1 = "ۡۢۤ"
            r3 = r1
            goto L8
        L16:
            androidx.lifecycle.process.C1087.m1946(r7, r0)
            java.lang.String r1 = "۠ۦۧ"
            r3 = r1
            goto L8
        L1d:
            r0 = 861(0x35d, float:1.207E-42)
            r1 = 1354(0x54a, float:1.897E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r2, r0, r4, r1)
            java.lang.String r1 = "ۣۣۧ"
            r3 = r1
            goto L8
        L29:
            int r5 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۡۥۢ"
            r3 = r1
            r6 = r5
            goto L8
        L30:
            int r5 = androidx.activity.C1066.f92
            java.lang.String r1 = "ۨۦۢ"
            r3 = r1
            r6 = r5
            goto L8
        L37:
            kevin.fun.hook.webdav.C1118.m8517(r7, r4)
            java.lang.String r1 = "ۦۥۧ"
            r3 = r1
            goto L8
        L3e:
            short[] r1 = m7514()
            java.lang.String r3 = "ۣۣۡ"
            r2 = r1
            goto L8
        L46:
            r1 = -64715(0xffffffffffff0335, float:NaN)
            r4 = r1 ^ r6
            java.lang.String r1 = "ۦۥۦ"
            r3 = r1
            goto L8
    }

    static /* synthetic */ void lambda$18(android.widget.TextView r7) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۡ۟"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56326: goto L1c;
                case 56350: goto L46;
                case 1746752: goto L29;
                case 1749764: goto L4e;
                case 1749793: goto L30;
                case 1750717: goto L23;
                case 1753419: goto L15;
                case 1753511: goto L3c;
                default: goto Lf;
            }
        Lf:
            int r4 = androidx.activity.C1064.f90
            java.lang.String r1 = "۟ۡۢ"
            r3 = r1
            goto L8
        L15:
            kevin.fun.hook.webdav.C1118.m8517(r7, r6)
            java.lang.String r1 = "ۢۥۧ"
            r3 = r1
            goto L8
        L1c:
            androidx.lifecycle.process.C1087.m1946(r7, r0)
            java.lang.String r1 = "ۣۥ۟"
            r3 = r1
            goto L8
        L23:
            int r4 = androidx.startup.C1100.f126
            java.lang.String r1 = "ۦۣۢ"
            r3 = r1
            goto L8
        L29:
            r5 = r4 ^ 481(0x1e1, float:6.74E-43)
            java.lang.String r1 = "ۢۦۥ"
            r3 = r1
            r6 = r5
            goto L8
        L30:
            r0 = 871(0x367, float:1.22E-42)
            r1 = 2723(0xaa3, float:3.816E-42)
            java.lang.String r0 = androidx.core.C1072.m957(r2, r0, r6, r1)
            java.lang.String r1 = "۠ۦ"
            r3 = r1
            goto L8
        L3c:
            r1 = 65258(0xfeea, float:9.1446E-41)
            r5 = r1 ^ r4
            java.lang.String r1 = "ۦ۟ۤ"
            r3 = r1
            r6 = r5
            goto L8
        L46:
            short[] r1 = m7514()
            java.lang.String r3 = "ۨۨ"
            r2 = r1
            goto L8
        L4e:
            return
    }

    static /* synthetic */ void lambda$19(android.widget.TextView r4) {
            short[] r0 = m7514()
            r1 = 882(0x372, float:1.236E-42)
            int r2 = androidx.vectordrawable.C1105.f131
            r2 = r2 ^ 366(0x16e, float:5.13E-43)
            r3 = 2791(0xae7, float:3.911E-42)
            java.lang.String r0 = androidx.interpolator.C1081.m1616(r0, r1, r2, r3)
            androidx.lifecycle.process.C1087.m1946(r4, r0)
            r0 = 65483(0xffcb, float:9.1761E-41)
            int r1 = androidx.activity.C1065.f91
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r4, r0)
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L22:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L28;
                case 49: goto L2b;
                case 204: goto L30;
                case 239: goto L3f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L22
        L2b:
            if (r1 < 0) goto L28
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L22
        L30:
            java.lang.String r0 = "GMcezWrRmUbiloeP8"
            java.lang.String r0 = kevin.fun.hook.audio.C1115.m8007(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3f:
            return
    }

    static /* synthetic */ void lambda$2(android.app.Activity r0) {
            m7509(r0)
            return
    }

    static /* synthetic */ void lambda$20(android.widget.TextView r9, java.lang.String r10) {
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۡۧۥ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 1746941: goto L22;
                case 1747686: goto L63;
                case 1747840: goto L55;
                case 1747903: goto L1a;
                case 1749764: goto L6a;
                case 1750531: goto L43;
                case 1750785: goto L5b;
                case 1751554: goto L3c;
                case 1752547: goto L4b;
                case 1754662: goto L71;
                case 1755374: goto L36;
                case 1755560: goto L2e;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "ۣۧۥ"
            r3 = r1
            goto La
        L1a:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r10)
            java.lang.String r5 = "ۨۦۦ"
            r3 = r1
            goto La
        L22:
            r1 = 890(0x37a, float:1.247E-42)
            r4 = 1025(0x401, float:1.436E-42)
            java.lang.String r1 = androidx.core.ktx.C1070.m788(r2, r1, r8, r4)
            java.lang.String r5 = "ۣ۟۟"
            r4 = r1
            goto La
        L2e:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r3)
            java.lang.String r5 = "ۤۡ۟"
            r4 = r1
            goto La
        L36:
            int r6 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۢۥۧ"
            r5 = r1
            goto La
        L3c:
            androidx.lifecycle.process.C1087.m1946(r9, r4)
            java.lang.String r1 = "۠ۥۥ"
            r5 = r1
            goto La
        L43:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.String r1 = "۠ۧۦ"
            r5 = r1
            goto La
        L4b:
            r1 = 64992(0xfde0, float:9.1073E-41)
            r7 = r1 ^ r6
            java.lang.String r1 = "۠۠ۦ"
            r5 = r1
            r8 = r7
            goto La
        L55:
            int r6 = androidx.core.C1072.f98
            java.lang.String r1 = "ۥۢ۠"
            r5 = r1
            goto La
        L5b:
            short[] r1 = m7514()
            java.lang.String r5 = "ۨ۠ۦ"
            r2 = r1
            goto La
        L63:
            kevin.fun.hook.webdav.C1118.m8517(r9, r8)
            java.lang.String r1 = "ۧۨۧ"
            r5 = r1
            goto La
        L6a:
            r7 = r6 ^ 903(0x387, float:1.265E-42)
            java.lang.String r1 = "۟ۧۥ"
            r5 = r1
            r8 = r7
            goto La
        L71:
            return
    }

    static /* synthetic */ void lambda$21(android.widget.TextView r6, org.json.JSONObject r7) {
            short[] r0 = m7514()
            r1 = 895(0x37f, float:1.254E-42)
            int r2 = androidx.drawerlayout.C1077.f103
            r2 = r2 ^ 281(0x119, float:3.94E-43)
            r3 = 2741(0xab5, float:3.841E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            short[] r1 = m7514()
            r2 = 902(0x386, float:1.264E-42)
            int r3 = androidx.lifecycle.viewmodel.C1093.f119
            r3 = r3 ^ (-114(0xffffffffffffff8e, float:NaN))
            r4 = 3221(0xc95, float:4.514E-42)
            java.lang.String r1 = androidx.customview.C1075.m1138(r1, r2, r3, r4)
            java.lang.String r0 = androidx.loader.C1095.m2550(r7, r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 906(0x38a, float:1.27E-42)
            int r4 = kevin.fun.hook.audio.C1117.f406
            r4 = r4 ^ 76
            r5 = 772(0x304, float:1.082E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1087.m2008(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r6, r0)
            r0 = -64883(0xffffffffffff028d, float:NaN)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r6, r0)
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 1616(0x650, float:2.264E-42)
        L57:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L5d;
                case 49: goto L60;
                case 204: goto L65;
                case 239: goto L74;
                default: goto L5c;
            }
        L5c:
            goto L57
        L5d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L57
        L60:
            if (r1 < 0) goto L5d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L57
        L65:
            java.lang.String r0 = "TbJqqllY9"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L74:
            return
    }

    static /* synthetic */ void lambda$22(android.widget.TextView r10, java.lang.Exception r11) {
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۧۤۧ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r8
            r9 = r8
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 1746816: goto L5e;
                case 1748708: goto L6c;
                case 1748896: goto L4d;
                case 1750687: goto L1c;
                case 1751651: goto L45;
                case 1751744: goto L56;
                case 1752551: goto L7a;
                case 1752555: goto L2a;
                case 1752674: goto L3e;
                case 1753416: goto L32;
                case 1753476: goto L66;
                case 1754538: goto L22;
                case 1755589: goto L73;
                default: goto L12;
            }
        L12:
            r1 = -64755(0xffffffffffff030d, float:NaN)
            r8 = r1 ^ r7
            java.lang.String r1 = "ۡۢۥ"
            r6 = r1
            r9 = r8
            goto Lb
        L1c:
            int r7 = androidx.loader.C1098.f124
            java.lang.String r1 = "ۥۦۣ"
            r6 = r1
            goto Lb
        L22:
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r11)
            java.lang.String r6 = "ۡۨۧ"
            r3 = r1
            goto Lb
        L2a:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r5)
            java.lang.String r6 = "ۨۧۤ"
            r4 = r1
            goto Lb
        L32:
            r1 = 911(0x38f, float:1.277E-42)
            r4 = 1586(0x632, float:2.222E-42)
            java.lang.String r1 = androidx.core.ktx.C1070.m788(r0, r1, r9, r4)
            java.lang.String r6 = "ۣۤۤ"
            r4 = r1
            goto Lb
        L3e:
            r8 = r7 ^ (-808(0xfffffffffffffcd8, float:NaN))
            java.lang.String r1 = "ۦ۟ۡ"
            r6 = r1
            r9 = r8
            goto Lb
        L45:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r5, r4)
            java.lang.String r6 = "ۣ۟ۤ"
            r2 = r1
            goto Lb
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "ۣۤۧ"
            r5 = r1
            goto Lb
        L56:
            short[] r0 = m7514()
            java.lang.String r1 = "ۣۤ۠"
            r6 = r1
            goto Lb
        L5e:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.String r6 = "ۥۢۨ"
            r5 = r1
            goto Lb
        L66:
            int r7 = androidx.lifecycle.livedata.C1085.f111
            java.lang.String r1 = "۟ۥ۠"
            r6 = r1
            goto Lb
        L6c:
            kevin.fun.hook.webdav.C1118.m8517(r10, r9)
            java.lang.String r1 = "ۥۢۤ"
            r6 = r1
            goto Lb
        L73:
            androidx.lifecycle.process.C1087.m1946(r10, r4)
            java.lang.String r1 = "ۦۡ۟"
            r6 = r1
            goto Lb
        L7a:
            return
    }

    static /* synthetic */ void lambda$23(android.widget.TextView r4) {
            short[] r0 = m7514()
            r1 = 916(0x394, float:1.284E-42)
            int r2 = kevin.fun.hook.audio.C1115.f404
            r2 = r2 ^ 810(0x32a, float:1.135E-42)
            r3 = 1342(0x53e, float:1.88E-42)
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3338(r0, r1, r2, r3)
            androidx.lifecycle.process.C1087.m1946(r4, r0)
            r0 = 65083(0xfe3b, float:9.1201E-41)
            int r1 = kevin.fun.hook.C1120.f419
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r4, r0)
            int r1 = androidx.activity.C1066.m518()
            r0 = 1616(0x650, float:2.264E-42)
        L22:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L28;
                case 49: goto L2b;
                case 204: goto L30;
                case 239: goto L3f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L22
        L2b:
            if (r1 > 0) goto L28
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L22
        L30:
            java.lang.String r0 = "ikXRRKqN"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1079.m1451(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3f:
            return
    }

    static /* synthetic */ void lambda$24(java.lang.String r13, android.widget.TextView r14) {
            r12 = -1
            r2 = 0
            short[] r0 = m7514()
            r1 = 924(0x39c, float:1.295E-42)
            int r3 = androidx.emoji2.viewsintegration.C1079.f105
            r3 = r3 ^ (-107(0xffffffffffffff95, float:NaN))
            r4 = 600(0x258, float:8.41E-43)
            java.lang.String r3 = androidx.startup.C1101.m3014(r0, r1, r3, r4)
            short[] r0 = m7514()
            r1 = 928(0x3a0, float:1.3E-42)
            int r4 = kevin.fun.hook.audio.C1117.f406
            r4 = r4 ^ 77
            r5 = 3216(0xc90, float:4.507E-42)
            java.lang.String r4 = androidx.viewpager.C1108.m3518(r0, r1, r4, r5)
            java.lang.ref.WeakReference r1 = m7543()     // Catch: java.lang.Exception -> L29c
            r0 = 1616(0x650, float:2.264E-42)
        L28:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2e;
                case 49: goto L31;
                case 204: goto L36;
                case 239: goto L5a;
                default: goto L2d;
            }     // Catch: java.lang.Exception -> L29c
        L2d:
            goto L28
        L2e:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L28
        L31:
            if (r1 == 0) goto L2e
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L28
        L36:
            java.lang.ref.WeakReference r0 = m7543()     // Catch: java.lang.Exception -> L29c
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)     // Catch: java.lang.Exception -> L29c
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L29c
            r1 = 1740(0x6cc, float:2.438E-42)
        L42:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L48;
                case 54: goto L4b;
                default: goto L47;
            }     // Catch: java.lang.Exception -> L29c
        L47:
            goto L42
        L48:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L42
        L4b:
            r1 = r0
        L4c:
            r0 = 1864(0x748, float:2.612E-42)
        L4e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L54;
                case 47384: goto L89;
                case 47417: goto L60;
                case 47483: goto L5c;
                default: goto L53;
            }     // Catch: java.lang.Exception -> L29c
        L53:
            goto L4e
        L54:
            if (r1 != 0) goto L5c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L4e
        L5a:
            r1 = r2
            goto L4c
        L5c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L4e
        L60:
            int r1 = androidx.appcompat.resources.C1068.m612()     // Catch: java.lang.Exception -> L29c
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L67:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L6f;
                case 45: goto L88;
                case 76: goto L79;
                case 239: goto L73;
                default: goto L6e;
            }     // Catch: java.lang.Exception -> L29c
        L6e:
            goto L67
        L6f:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L67
        L73:
            if (r1 < 0) goto L6f
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L67
        L79:
            java.lang.String r0 = "6XQgk"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)     // Catch: java.lang.Exception -> L29c
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> L29c
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Exception -> L29c
            r1.println(r0)     // Catch: java.lang.Exception -> L29c
        L88:
            return
        L89:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L29c
            r0.<init>(r13)     // Catch: java.lang.Exception -> L29c
            java.net.URLConnection r0 = androidx.loader.C1094.m2492(r0)     // Catch: java.lang.Exception -> L29c
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Exception -> L29c
            int r5 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Exception -> L29c
            r5 = r5 ^ (-14971(0xffffffffffffc585, float:NaN))
            androidx.lifecycle.process.C1087.m2000(r0, r5)     // Catch: java.lang.Exception -> L29c
            androidx.loader.C1094.m2450(r0, r5)     // Catch: java.lang.Exception -> L29c
            androidx.emoji2.viewsintegration.C1078.m1378(r0)     // Catch: java.lang.Exception -> L29c
            long r6 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29c
            r5.<init>()     // Catch: java.lang.Exception -> L29c
            short[] r8 = m7514()     // Catch: java.lang.Exception -> L29c
            r9 = 932(0x3a4, float:1.306E-42)
            int r10 = androidx.loader.C1098.f124     // Catch: java.lang.Exception -> L29c
            r10 = r10 ^ (-812(0xfffffffffffffcd4, float:NaN))
            r11 = 2110(0x83e, float:2.957E-42)
            java.lang.String r8 = androidx.startup.C1100.m2931(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r8)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r5 = androidx.loader.C1097.m2720(r5, r6)     // Catch: java.lang.Exception -> L29c
            short[] r6 = m7514()     // Catch: java.lang.Exception -> L29c
            r7 = 941(0x3ad, float:1.319E-42)
            int r8 = androidx.loader.C1097.f123     // Catch: java.lang.Exception -> L29c
            r8 = r8 ^ 118(0x76, float:1.65E-43)
            r9 = 3206(0xc86, float:4.493E-42)
            java.lang.String r6 = androidx.lifecycle.livedata.C1084.m1796(r6, r7, r8, r9)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Exception -> L29c
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8573(r5)     // Catch: java.lang.Exception -> L29c
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L29c
            java.io.File r7 = androidx.versionedparcelable.C1107.m3483(r1)     // Catch: java.lang.Exception -> L29c
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L29c
            java.io.InputStream r5 = androidx.customview.C1075.m1174(r0)     // Catch: java.lang.Throwable -> L371
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2fb
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2fb
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r0]     // Catch: java.lang.Throwable -> L2e6
        Lf0:
            int r9 = androidx.loader.C1099.m2896(r5, r8)     // Catch: java.lang.Throwable -> L2e6
            r0 = 48891(0xbefb, float:6.8511E-41)
        Lf7:
            r10 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r10
            switch(r0) {
                case 22: goto Lff;
                case 53: goto L2d3;
                case 503: goto L103;
                case 32495: goto L109;
                default: goto Lfe;
            }     // Catch: java.lang.Throwable -> L2e6
        Lfe:
            goto Lf7
        Lff:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Lf7
        L103:
            if (r9 != r12) goto Lff
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Lf7
        L109:
            kevin.fun.hook.audio.C1117.m8156(r7)     // Catch: java.lang.Throwable -> L2e6
            kevin.fun.hook.audio.C1117.m8104(r7)     // Catch: java.lang.Throwable -> L2fb
            r0 = 49666(0xc202, float:6.9597E-41)
        L112:
            r7 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 17: goto L11a;
                case 50: goto L120;
                case 76: goto L124;
                case 83: goto L127;
                default: goto L119;
            }
        L119:
            goto L112
        L11a:
            if (r5 == 0) goto L120
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L112
        L120:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L112
        L124:
            androidx.versionedparcelable.C1107.m3447(r5)     // Catch: java.lang.Throwable -> L371
        L127:
            long r8 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29c
            r0.<init>()     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r4)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.loader.C1097.m2720(r0, r8)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)     // Catch: java.lang.Exception -> L29c
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Exception -> L29c
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L29c
            java.io.File r7 = androidx.versionedparcelable.C1107.m3483(r1)     // Catch: java.lang.Exception -> L29c
            r5.<init>(r7, r0)     // Catch: java.lang.Exception -> L29c
            long r8 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29c
            r0.<init>()     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r4)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.loader.C1097.m2720(r0, r8)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)     // Catch: java.lang.Exception -> L29c
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Exception -> L29c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L29c
            java.io.File r1 = androidx.versionedparcelable.C1107.m3483(r1)     // Catch: java.lang.Exception -> L29c
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> L29c
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L25d
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L25d
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3b0
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b0
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r0]     // Catch: java.lang.Throwable -> L1f7
        L179:
            int r7 = androidx.loader.C1099.m2896(r4, r5)     // Catch: java.lang.Throwable -> L1f7
            r0 = 49790(0xc27e, float:6.977E-41)
        L180:
            r8 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 18: goto L188;
                case 51: goto L1e4;
                case 84: goto L192;
                case 241: goto L18c;
                default: goto L187;
            }
        L187:
            goto L180
        L188:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L180
        L18c:
            if (r7 != r12) goto L188
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L180
        L192:
            kevin.fun.hook.audio.C1117.m8104(r1)     // Catch: java.lang.Throwable -> L3b0
            androidx.versionedparcelable.C1107.m3447(r4)     // Catch: java.lang.Throwable -> L25d
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r3)     // Catch: java.lang.Exception -> L29c
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioPath = r0     // Catch: java.lang.Exception -> L29c
            androidx.loader.C1095.m2548(r6)     // Catch: java.lang.Exception -> L29c
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r3)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29c
            r1.<init>()     // Catch: java.lang.Exception -> L29c
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L29c
            r3 = 945(0x3b1, float:1.324E-42)
            int r4 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Exception -> L29c
            r4 = r4 ^ (-245(0xffffffffffffff0b, float:NaN))
            r5 = 1185(0x4a1, float:1.66E-42)
            java.lang.String r2 = androidx.core.C1073.m1028(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Exception -> L29c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Exception -> L29c
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Exception -> L29c
            m7537(r0)     // Catch: java.lang.Exception -> L29c
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L29c
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda13 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda13     // Catch: java.lang.Exception -> L29c
            r1.<init>(r14)     // Catch: java.lang.Exception -> L29c
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Exception -> L29c
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L1d8:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L1e0;
                case 1711: goto L88;
                default: goto L1df;
            }
        L1df:
            goto L1d8
        L1e0:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L1d8
        L1e4:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r1, r5, r0, r7)     // Catch: java.lang.Throwable -> L1f7
            r0 = 50689(0xc601, float:7.103E-41)
        L1eb:
            r7 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 19: goto L1f3;
                case 50: goto L179;
                default: goto L1f2;
            }
        L1f2:
            goto L1eb
        L1f3:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L1eb
        L1f7:
            r2 = move-exception
            kevin.fun.hook.audio.C1117.m8104(r1)     // Catch: java.lang.Throwable -> L1fc
            throw r2     // Catch: java.lang.Throwable -> L1fc
        L1fc:
            r0 = move-exception
            r1 = 50813(0xc67d, float:7.1204E-41)
        L200:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 18: goto L208;
                case 243: goto L219;
                default: goto L207;
            }
        L207:
            goto L200
        L208:
            r1 = 51588(0xc984, float:7.229E-41)
        L20b:
            r3 = 51605(0xc995, float:7.2314E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L213;
                case 54: goto L21d;
                case 87: goto L258;
                case 116: goto L221;
                default: goto L212;
            }
        L212:
            goto L20b
        L213:
            if (r2 == 0) goto L21d
            r1 = 51681(0xc9e1, float:7.242E-41)
            goto L20b
        L219:
            r1 = 50844(0xc69c, float:7.1248E-41)
            goto L200
        L21d:
            r1 = 51650(0xc9c2, float:7.2377E-41)
            goto L20b
        L221:
            r1 = 51712(0xca00, float:7.2464E-41)
        L224:
            r3 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L22c;
                case 17: goto L230;
                case 47: goto L259;
                case 76: goto L236;
                default: goto L22b;
            }
        L22b:
            goto L224
        L22c:
            r1 = 51774(0xca3e, float:7.2551E-41)
            goto L224
        L230:
            if (r2 == r0) goto L22c
            r1 = 51805(0xca5d, float:7.2594E-41)
            goto L224
        L236:
            kevin.fun.hook.audio.C1116.m8088(r2, r0)     // Catch: java.lang.Throwable -> L248
            r0 = 51836(0xca7c, float:7.2638E-41)
        L23c:
            r1 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 241: goto L244;
                case 1963: goto L259;
                default: goto L243;
            }     // Catch: java.lang.Throwable -> L248
        L243:
            goto L23c
        L244:
            r0 = 52518(0xcd26, float:7.3593E-41)
            goto L23c
        L248:
            r0 = move-exception
            r1 = 52611(0xcd83, float:7.3724E-41)
        L24c:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 23: goto L254;
                case 54: goto L25e;
                default: goto L253;
            }     // Catch: java.lang.Throwable -> L248
        L253:
            goto L24c
        L254:
            r1 = 52642(0xcda2, float:7.3767E-41)
            goto L24c
        L258:
            r2 = r0
        L259:
            androidx.versionedparcelable.C1107.m3447(r4)     // Catch: java.lang.Throwable -> L248
            throw r2     // Catch: java.lang.Throwable -> L248
        L25d:
            r0 = move-exception
        L25e:
            r1 = 52735(0xcdff, float:7.3897E-41)
        L261:
            r3 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L269;
                case 45: goto L29a;
                case 1007: goto L26d;
                case 7927: goto L273;
                default: goto L268;
            }
        L268:
            goto L261
        L269:
            r1 = 52797(0xce3d, float:7.3984E-41)
            goto L261
        L26d:
            if (r2 == 0) goto L269
            r1 = 53479(0xd0e7, float:7.494E-41)
            goto L261
        L273:
            r1 = 53510(0xd106, float:7.4983E-41)
        L276:
            r3 = 53527(0xd117, float:7.5007E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L27e;
                case 50: goto L284;
                case 83: goto L29b;
                case 116: goto L288;
                default: goto L27d;
            }
        L27d:
            goto L276
        L27e:
            if (r2 == r0) goto L284
            r1 = 53603(0xd163, float:7.5114E-41)
            goto L276
        L284:
            r1 = 53572(0xd144, float:7.507E-41)
            goto L276
        L288:
            kevin.fun.hook.audio.C1116.m8088(r2, r0)     // Catch: java.lang.Exception -> L29c
            r0 = 53634(0xd182, float:7.5157E-41)
        L28e:
            r1 = 53651(0xd193, float:7.5181E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L296;
                case 50: goto L29b;
                default: goto L295;
            }     // Catch: java.lang.Exception -> L29c
        L295:
            goto L28e
        L296:
            r0 = 53665(0xd1a1, float:7.52E-41)
            goto L28e
        L29a:
            r2 = r0
        L29b:
            throw r2     // Catch: java.lang.Exception -> L29c
        L29c:
            r0 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7514()
            r4 = 967(0x3c7, float:1.355E-42)
            int r5 = androidx.vectordrawable.C1105.f131
            r5 = r5 ^ 361(0x169, float:5.06E-43)
            r6 = 2231(0x8b7, float:3.126E-42)
            java.lang.String r3 = androidx.startup.C1100.m2931(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7537(r1)
            android.os.Handler r1 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda14 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda14
            r2.<init>(r14, r0)
            androidx.activity.C1062.m178(r1, r2)
            goto L88
        L2d3:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r7, r8, r0, r9)     // Catch: java.lang.Throwable -> L2e6
            r0 = 53758(0xd1fe, float:7.5331E-41)
        L2da:
            r9 = 53775(0xd20f, float:7.5355E-41)
            r0 = r0 ^ r9
            switch(r0) {
                case 1009: goto L2e2;
                case 1703: goto Lf0;
                default: goto L2e1;
            }
        L2e1:
            goto L2da
        L2e2:
            r0 = 54440(0xd4a8, float:7.6287E-41)
            goto L2da
        L2e6:
            r2 = move-exception
            kevin.fun.hook.audio.C1117.m8104(r7)     // Catch: java.lang.Throwable -> L2eb
            throw r2     // Catch: java.lang.Throwable -> L2eb
        L2eb:
            r0 = move-exception
            r1 = 54533(0xd505, float:7.6417E-41)
        L2ef:
            r3 = 54550(0xd516, float:7.6441E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L2f7;
                case 50: goto L2fc;
                default: goto L2f6;
            }
        L2f6:
            goto L2ef
        L2f7:
            r1 = 54564(0xd524, float:7.646E-41)
            goto L2ef
        L2fb:
            r0 = move-exception
        L2fc:
            r1 = 54657(0xd581, float:7.6591E-41)
        L2ff:
            r3 = 54674(0xd592, float:7.6615E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L307;
                case 45: goto L332;
                case 50: goto L30d;
                case 3579: goto L311;
                default: goto L306;
            }
        L306:
            goto L2ff
        L307:
            if (r2 != 0) goto L30d
            r1 = 55401(0xd869, float:7.7633E-41)
            goto L2ff
        L30d:
            r1 = 54719(0xd5bf, float:7.6678E-41)
            goto L2ff
        L311:
            r1 = 55432(0xd888, float:7.7677E-41)
        L314:
            r2 = 55449(0xd899, float:7.77E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L31c;
                case 62: goto L320;
                default: goto L31b;
            }
        L31b:
            goto L314
        L31c:
            r1 = 55463(0xd8a7, float:7.772E-41)
            goto L314
        L320:
            r2 = r0
        L321:
            r0 = 56579(0xdd03, float:7.9284E-41)
        L324:
            r1 = 56596(0xdd14, float:7.9308E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 23: goto L32c;
                case 54: goto L369;
                case 85: goto L370;
                case 1564036: goto L36d;
                default: goto L32b;
            }
        L32b:
            goto L324
        L32c:
            if (r5 == 0) goto L369
            r0 = 1507472(0x170090, float:2.112418E-39)
            goto L324
        L332:
            r1 = 55556(0xd904, float:7.785E-41)
        L335:
            r3 = 55573(0xd915, float:7.7874E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L33d;
                case 54: goto L343;
                case 87: goto L321;
                case 116: goto L347;
                default: goto L33c;
            }
        L33c:
            goto L335
        L33d:
            if (r2 == r0) goto L343
            r1 = 55649(0xd961, float:7.7981E-41)
            goto L335
        L343:
            r1 = 55618(0xd942, float:7.7937E-41)
            goto L335
        L347:
            kevin.fun.hook.audio.C1116.m8088(r2, r0)     // Catch: java.lang.Throwable -> L359
            r0 = 55680(0xd980, float:7.8024E-41)
        L34d:
            r1 = 55697(0xd991, float:7.8048E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L355;
                case 1467: goto L321;
                default: goto L354;
            }     // Catch: java.lang.Throwable -> L359
        L354:
            goto L34d
        L355:
            r0 = 56362(0xdc2a, float:7.898E-41)
            goto L34d
        L359:
            r0 = move-exception
            r1 = 56455(0xdc87, float:7.911E-41)
        L35d:
            r3 = 56472(0xdc98, float:7.9134E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 31: goto L365;
                case 62: goto L372;
                default: goto L364;
            }     // Catch: java.lang.Throwable -> L359
        L364:
            goto L35d
        L365:
            r1 = 56486(0xdca6, float:7.9154E-41)
            goto L35d
        L369:
            r0 = 56641(0xdd41, float:7.9371E-41)
            goto L324
        L36d:
            androidx.versionedparcelable.C1107.m3447(r5)     // Catch: java.lang.Throwable -> L359
        L370:
            throw r2     // Catch: java.lang.Throwable -> L359
        L371:
            r0 = move-exception
        L372:
            r1 = 1507503(0x1700af, float:2.112462E-39)
        L375:
            r3 = 1507520(0x1700c0, float:2.112485E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L37d;
                case 45: goto L3ae;
                case 111: goto L381;
                case 460: goto L387;
                default: goto L37c;
            }
        L37c:
            goto L375
        L37d:
            r1 = 1507565(0x1700ed, float:2.112549E-39)
            goto L375
        L381:
            if (r2 == 0) goto L37d
            r1 = 1507596(0x17010c, float:2.112592E-39)
            goto L375
        L387:
            r1 = 1507627(0x17012b, float:2.112635E-39)
        L38a:
            r3 = 1507644(0x17013c, float:2.112659E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 23: goto L392;
                case 85: goto L3af;
                case 118: goto L398;
                case 180: goto L39c;
                default: goto L391;
            }
        L391:
            goto L38a
        L392:
            if (r2 == r0) goto L398
            r1 = 1507720(0x170188, float:2.112766E-39)
            goto L38a
        L398:
            r1 = 1507689(0x170169, float:2.112722E-39)
            goto L38a
        L39c:
            kevin.fun.hook.audio.C1116.m8088(r2, r0)     // Catch: java.lang.Exception -> L29c
            r0 = 1507751(0x1701a7, float:2.112809E-39)
        L3a2:
            r1 = 1507768(0x1701b8, float:2.112833E-39)
            r0 = r0 ^ r1
            switch(r0) {
                case 31: goto L3aa;
                case 1513: goto L3af;
                default: goto L3a9;
            }     // Catch: java.lang.Exception -> L29c
        L3a9:
            goto L3a2
        L3aa:
            r0 = 1508433(0x170451, float:2.113765E-39)
            goto L3a2
        L3ae:
            r2 = r0
        L3af:
            throw r2     // Catch: java.lang.Exception -> L29c
        L3b0:
            r0 = move-exception
            goto L208
    }

    static /* synthetic */ void lambda$25(android.widget.TextView r5) {
            long r0 = m7497()
            java.lang.Long r0 = androidx.appcompat.resources.C1068.m611(r0)
            int r1 = m7490()
            java.lang.Integer r1 = androidx.activity.C1064.m334(r1)
            int r2 = m7475()
            java.lang.Integer r2 = androidx.activity.C1064.m334(r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = kevin.fun.hook.C1120.f419
            r4 = r4 ^ (-453(0xfffffffffffffe3b, float:NaN))
            r3[r4] = r0
            int r0 = androidx.emoji2.C1080.f106
            r0 = r0 ^ 376(0x178, float:5.27E-43)
            r3[r0] = r1
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r0 = r0 ^ (-936(0xfffffffffffffc58, float:NaN))
            r3[r0] = r2
            short[] r0 = m7514()
            r1 = 982(0x3d6, float:1.376E-42)
            int r2 = androidx.lifecycle.livedata.C1086.f112
            r2 = r2 ^ 923(0x39b, float:1.293E-42)
            r4 = 1637(0x665, float:2.294E-42)
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3485(r0, r1, r2, r4)
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3391(r0, r3)
            androidx.lifecycle.process.C1087.m1946(r5, r0)
            r0 = -11751697(0xffffffffff4caeef, float:-2.7207082E38)
            int r1 = androidx.core.C1073.f99
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r5, r0)
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L53:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L59;
                case 49: goto L5c;
                case 204: goto L61;
                case 239: goto L70;
                default: goto L58;
            }
        L58:
            goto L53
        L59:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L53
        L5c:
            if (r1 < 0) goto L59
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L53
        L61:
            java.lang.String r0 = "jLpmuoA3yMqW"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L70:
            return
    }

    static /* synthetic */ void lambda$26(android.widget.TextView r10, java.lang.Exception r11) {
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۥۣۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r8
            r9 = r8
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 56383: goto L73;
                case 1746783: goto L27;
                case 1746937: goto L1f;
                case 1747717: goto L6b;
                case 1747872: goto L5b;
                case 1748834: goto L53;
                case 1749824: goto L7a;
                case 1749849: goto L19;
                case 1750812: goto L2e;
                case 1751500: goto L4a;
                case 1752580: goto L63;
                case 1752733: goto L3a;
                case 1753482: goto L44;
                default: goto L12;
            }
        L12:
            r8 = r7 ^ (-594(0xfffffffffffffdae, float:NaN))
            java.lang.String r1 = "ۣۨۡ"
            r6 = r1
            r9 = r8
            goto Lb
        L19:
            int r7 = androidx.documentfile.C1076.f102
            java.lang.String r1 = "ۢۧ۟"
            r6 = r1
            goto Lb
        L1f:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.String r1 = "۠ۦۦ"
            r6 = r1
            goto Lb
        L27:
            androidx.lifecycle.process.C1087.m1946(r10, r5)
            java.lang.String r1 = "ۦۡۥ"
            r6 = r1
            goto Lb
        L2e:
            r1 = 1016(0x3f8, float:1.424E-42)
            r5 = 2178(0x882, float:3.052E-42)
            java.lang.String r1 = androidx.lifecycle.viewmodel.C1093.m2415(r2, r1, r9, r5)
            java.lang.String r6 = "۟ۧۡ"
            r5 = r1
            goto Lb
        L3a:
            r1 = -64677(0xffffffffffff035b, float:NaN)
            r8 = r1 ^ r7
            java.lang.String r1 = "ۢۡ"
            r6 = r1
            r9 = r8
            goto Lb
        L44:
            int r7 = androidx.loader.C1099.f125
            java.lang.String r1 = "ۥۨ۠"
            r6 = r1
            goto Lb
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "۠ۡۦ"
            r4 = r1
            goto Lb
        L53:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r4)
            java.lang.String r6 = "۟ۢۢ"
            r5 = r1
            goto Lb
        L5b:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)
            java.lang.String r6 = "ۡۦۧ"
            r4 = r1
            goto Lb
        L63:
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r11)
            java.lang.String r6 = "ۤ۟ۧ"
            r3 = r1
            goto Lb
        L6b:
            short[] r1 = m7514()
            java.lang.String r6 = "ۢۨ۟"
            r2 = r1
            goto Lb
        L73:
            kevin.fun.hook.webdav.C1118.m8517(r10, r9)
            java.lang.String r1 = "ۢۧۥ"
            r6 = r1
            goto Lb
        L7a:
            return
    }

    static /* synthetic */ void lambda$27(java.lang.String r6, android.app.Activity r7) {
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch: java.lang.Exception -> L34
            r0.<init>()     // Catch: java.lang.Exception -> L34
            kevin.fun.hook.VoiceAssistantHook.mediaPlayer = r0     // Catch: java.lang.Exception -> L34
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L34
            androidx.lifecycle.livedata.C1085.m1804(r0, r6)     // Catch: java.lang.Exception -> L34
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L34
            kevin.fun.hook.webdav.C1118.m8507(r0)     // Catch: java.lang.Exception -> L34
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L34
            com.tencent.mmkv.C1109.m3605(r0)     // Catch: java.lang.Exception -> L34
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L34
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda32 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda32     // Catch: java.lang.Exception -> L34
            r1.<init>()     // Catch: java.lang.Exception -> L34
            androidx.startup.C1101.m3009(r0, r1)     // Catch: java.lang.Exception -> L34
            r0 = 1616(0x650, float:2.264E-42)
        L2a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L30;
                case 49: goto L31;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            return
        L31:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L2a
        L34:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1024(0x400, float:1.435E-42)
            int r4 = com.tencent.mmkv.C1109.f135
            r4 = r4 ^ (-483(0xfffffffffffffe1d, float:NaN))
            r5 = 1203(0x4b3, float:1.686E-42)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7474(r7, r0)
            goto L30
    }

    static /* synthetic */ void lambda$28(android.media.MediaPlayer r0) {
            m7535()
            return
    }

    static /* synthetic */ void lambda$29(android.app.Activity r7, java.lang.String r8) {
            r2 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = m7517()     // Catch: java.lang.Exception -> L96
            r1.<init>(r0)     // Catch: java.lang.Exception -> L96
            boolean r3 = androidx.vectordrawable.C1105.m3294(r1)     // Catch: java.lang.Exception -> L96
            r0 = 1616(0x650, float:2.264E-42)
        L10:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L16;
                case 49: goto L19;
                case 204: goto L1e;
                case 239: goto L46;
                default: goto L15;
            }     // Catch: java.lang.Exception -> L96
        L15:
            goto L10
        L16:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L10
        L19:
            if (r3 != 0) goto L16
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L10
        L1e:
            boolean r3 = androidx.lifecycle.process.C1090.m2220(r1)     // Catch: java.lang.Exception -> L96
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L2f;
                case 471: goto L46;
                case 500: goto L32;
                default: goto L29;
            }     // Catch: java.lang.Exception -> L96
        L29:
            goto L24
        L2a:
            if (r3 != 0) goto L2f
            r0 = 1833(0x729, float:2.569E-42)
            goto L24
        L2f:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L24
        L32:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L96
            r1 = 1029(0x405, float:1.442E-42)
            int r2 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Exception -> L96
            r2 = r2 ^ 603(0x25b, float:8.45E-43)
            r3 = 2597(0xa25, float:3.639E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1087.m2008(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L96
            m7474(r7, r0)     // Catch: java.lang.Exception -> L96
        L45:
            return
        L46:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda3 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda3     // Catch: java.lang.Exception -> L96
            r0.<init>()     // Catch: java.lang.Exception -> L96
            java.io.File[] r1 = androidx.customview.C1074.m1105(r1, r0)     // Catch: java.lang.Exception -> L96
            r0 = 1864(0x748, float:2.612E-42)
        L51:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L57;
                case 47384: goto L82;
                case 47417: goto L61;
                case 47483: goto L5d;
                default: goto L56;
            }     // Catch: java.lang.Exception -> L96
        L56:
            goto L51
        L57:
            if (r1 == 0) goto L5d
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L51
        L5d:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L51
        L61:
            int r3 = r1.length     // Catch: java.lang.Exception -> L96
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L65:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 14: goto L6d;
                case 45: goto Led;
                case 76: goto L77;
                case 239: goto L71;
                default: goto L6c;
            }     // Catch: java.lang.Exception -> L96
        L6c:
            goto L65
        L6d:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L65
        L71:
            if (r3 != 0) goto L6d
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L65
        L77:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7a:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L82;
                case 503: goto Le9;
                default: goto L81;
            }     // Catch: java.lang.Exception -> L96
        L81:
            goto L7a
        L82:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L96
            r1 = 1037(0x40d, float:1.453E-42)
            int r2 = androidx.interpolator.C1082.f108     // Catch: java.lang.Exception -> L96
            r2 = r2 ^ 334(0x14e, float:4.68E-43)
            r3 = 927(0x39f, float:1.299E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L96
            m7474(r7, r0)     // Catch: java.lang.Exception -> L96
            goto L45
        L96:
            r0 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7514()
            r4 = 1054(0x41e, float:1.477E-42)
            int r5 = androidx.annotation.experimental.C1067.f93
            r5 = r5 ^ (-38)
            r6 = 548(0x224, float:7.68E-43)
            java.lang.String r3 = androidx.lifecycle.livedata.C1084.m1796(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7537(r1)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1070(0x42e, float:1.5E-42)
            int r4 = org.luckypray.dexkit.C1123.f433
            r4 = r4 ^ (-961(0xfffffffffffffc3f, float:NaN))
            r5 = 2799(0xaef, float:3.922E-42)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7474(r7, r0)
            goto L45
        Le9:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L7a
        Led:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda4 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda4     // Catch: java.lang.Exception -> L96
            r0.<init>()     // Catch: java.lang.Exception -> L96
            kevin.fun.hook.audio.C1117.m8102(r1, r0)     // Catch: java.lang.Exception -> L96
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Exception -> L96
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1ce
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L1ce
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1d1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d1
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L156
        L106:
            int r5 = androidx.loader.C1099.m2896(r3, r4)     // Catch: java.lang.Throwable -> L156
            r0 = 49666(0xc202, float:6.9597E-41)
        L10d:
            r6 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 17: goto L115;
                case 50: goto L11b;
                case 76: goto L11f;
                case 83: goto L143;
                default: goto L114;
            }     // Catch: java.lang.Throwable -> L156
        L114:
            goto L10d
        L115:
            if (r5 > 0) goto L11b
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L10d
        L11b:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L10d
        L11f:
            kevin.fun.hook.audio.C1117.m8156(r1)     // Catch: java.lang.Throwable -> L156
            android.os.Handler r0 = m7523()     // Catch: java.lang.Throwable -> L156
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda5 r4 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda5     // Catch: java.lang.Throwable -> L156
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L156
            androidx.activity.C1062.m178(r0, r4)     // Catch: java.lang.Throwable -> L156
            kevin.fun.hook.audio.C1117.m8104(r1)     // Catch: java.lang.Throwable -> L1d1
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L1ce
            r0 = 49790(0xc27e, float:6.977E-41)
        L137:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L45;
                case 241: goto L13f;
                default: goto L13e;
            }
        L13e:
            goto L137
        L13f:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L137
        L143:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r1, r4, r0, r5)     // Catch: java.lang.Throwable -> L156
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L14a:
            r5 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 497: goto L152;
                case 1711: goto L106;
                default: goto L151;
            }
        L151:
            goto L14a
        L152:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L14a
        L156:
            r0 = move-exception
            kevin.fun.hook.audio.C1117.m8104(r1)     // Catch: java.lang.Throwable -> L15b
            throw r0     // Catch: java.lang.Throwable -> L15b
        L15b:
            r1 = move-exception
            r2 = r0
        L15d:
            r0 = 50689(0xc601, float:7.103E-41)
        L160:
            r4 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 19: goto L168;
                case 45: goto L199;
                case 50: goto L16e;
                case 76: goto L172;
                default: goto L167;
            }
        L167:
            goto L160
        L168:
            if (r2 == 0) goto L16e
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L160
        L16e:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L160
        L172:
            r0 = 50813(0xc67d, float:7.1204E-41)
        L175:
            r4 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto L17d;
                case 53: goto L19a;
                case 243: goto L181;
                case 4075: goto L187;
                default: goto L17c;
            }
        L17c:
            goto L175
        L17d:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto L175
        L181:
            if (r2 == r1) goto L17d
            r0 = 51557(0xc965, float:7.2247E-41)
            goto L175
        L187:
            kevin.fun.hook.audio.C1116.m8088(r2, r1)     // Catch: java.lang.Throwable -> L19e
            r0 = 51588(0xc984, float:7.229E-41)
        L18d:
            r1 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L195;
                case 54: goto L19a;
                default: goto L194;
            }     // Catch: java.lang.Throwable -> L19e
        L194:
            goto L18d
        L195:
            r0 = 51619(0xc9a3, float:7.2334E-41)
            goto L18d
        L199:
            r2 = r1
        L19a:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L19e
            throw r2     // Catch: java.lang.Throwable -> L19e
        L19e:
            r1 = move-exception
            r0 = r2
        L1a0:
            r2 = 51712(0xca00, float:7.2464E-41)
        L1a3:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1ab;
                case 17: goto L1af;
                case 47: goto L1d4;
                case 76: goto L1b5;
                default: goto L1aa;
            }
        L1aa:
            goto L1a3
        L1ab:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L1a3
        L1af:
            if (r0 == 0) goto L1ab
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L1a3
        L1b5:
            r2 = 51836(0xca7c, float:7.2638E-41)
        L1b8:
            r3 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 241: goto L1c0;
                case 1963: goto L1c6;
                case 1992: goto L1cd;
                case 2025: goto L1ca;
                default: goto L1bf;
            }
        L1bf:
            goto L1b8
        L1c0:
            if (r0 == r1) goto L1c6
            r2 = 52580(0xcd64, float:7.368E-41)
            goto L1b8
        L1c6:
            r2 = 52549(0xcd45, float:7.3637E-41)
            goto L1b8
        L1ca:
            kevin.fun.hook.audio.C1116.m8088(r0, r1)     // Catch: java.lang.Exception -> L96
        L1cd:
            throw r0     // Catch: java.lang.Exception -> L96
        L1ce:
            r1 = move-exception
            r0 = r2
            goto L1a0
        L1d1:
            r0 = move-exception
            r1 = r0
            goto L15d
        L1d4:
            r0 = r1
            goto L1cd
    }

    static /* synthetic */ void lambda$3(android.content.Context r15) {
            short[] r0 = m7514()
            r1 = 1076(0x434, float:1.508E-42)
            int r2 = androidx.core.ktx.C1070.f96
            r2 = r2 ^ 555(0x22b, float:7.78E-43)
            r3 = 3022(0xbce, float:4.235E-42)
            java.lang.String r4 = androidx.startup.C1101.m3014(r0, r1, r2, r3)
            short[] r0 = m7514()
            r1 = 1081(0x439, float:1.515E-42)
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 773(0x305, float:1.083E-42)
            r3 = 1332(0x534, float:1.867E-42)
            java.lang.String r5 = kevin.fun.hook.audio.C1114.m7940(r0, r1, r2, r3)
            java.lang.String r2 = androidx.emoji2.C1080.m1562()
            short[] r0 = m7514()
            r1 = 1089(0x441, float:1.526E-42)
            int r3 = androidx.vectordrawable.C1103.f129
            r3 = r3 ^ 267(0x10b, float:3.74E-43)
            r6 = 1569(0x621, float:2.199E-42)
            java.lang.String r6 = androidx.lifecycle.livedata.C1084.m1796(r0, r1, r3, r6)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L2b6
            r0.<init>()     // Catch: java.lang.Exception -> L2b6
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2b6
            r3 = 1096(0x448, float:1.536E-42)
            int r7 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ 299(0x12b, float:4.19E-43)
            r8 = 1653(0x675, float:2.316E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1116.m8020(r1, r3, r7, r8)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r3 = m7502()     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b6
            r7.<init>()     // Catch: java.lang.Exception -> L2b6
            short[] r8 = m7514()     // Catch: java.lang.Exception -> L2b6
            r9 = 1109(0x455, float:1.554E-42)
            int r10 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Exception -> L2b6
            r10 = r10 ^ 660(0x294, float:9.25E-43)
            r11 = 1778(0x6f2, float:2.492E-42)
            java.lang.String r8 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r7 = androidx.lifecycle.livedata.C1085.m1859(r7, r8)     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r7, r3)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Exception -> L2b6
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r0, r1, r3)     // Catch: java.lang.Exception -> L2b6
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2b6
            r3 = 1116(0x45c, float:1.564E-42)
            int r7 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ 364(0x16c, float:5.1E-43)
            r8 = 2682(0xa7a, float:3.758E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1079.m1457(r1, r3, r7, r8)     // Catch: java.lang.Exception -> L2b6
            short[] r3 = m7514()     // Catch: java.lang.Exception -> L2b6
            r7 = 1126(0x466, float:1.578E-42)
            int r8 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Exception -> L2b6
            r8 = r8 ^ 690(0x2b2, float:9.67E-43)
            r9 = 3259(0xcbb, float:4.567E-42)
            java.lang.String r3 = androidx.emoji2.viewsintegration.C1078.m1413(r3, r7, r8, r9)     // Catch: java.lang.Exception -> L2b6
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r0, r1, r3)     // Catch: java.lang.Exception -> L2b6
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2b6
            r3 = 1159(0x487, float:1.624E-42)
            int r7 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ 546(0x222, float:7.65E-43)
            r8 = 2336(0x920, float:3.273E-42)
            java.lang.String r1 = androidx.viewpager.C1108.m3518(r1, r3, r7, r8)     // Catch: java.lang.Exception -> L2b6
            short[] r3 = m7514()     // Catch: java.lang.Exception -> L2b6
            r7 = 1171(0x493, float:1.641E-42)
            int r8 = androidx.customview.C1075.f101     // Catch: java.lang.Exception -> L2b6
            r8 = r8 ^ (-118(0xffffffffffffff8a, float:NaN))
            r9 = 347(0x15b, float:4.86E-43)
            java.lang.String r3 = androidx.viewpager.C1108.m3518(r3, r7, r8, r9)     // Catch: java.lang.Exception -> L2b6
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r0, r1, r3)     // Catch: java.lang.Exception -> L2b6
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2b6
            r3 = 1187(0x4a3, float:1.663E-42)
            int r7 = androidx.activity.C1063.f89     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ 44
            r8 = 2712(0xa98, float:3.8E-42)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r3, r7, r8)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r1 = m7521(r1, r0)     // Catch: java.lang.Exception -> L2b6
            r0 = 1616(0x650, float:2.264E-42)
        Lcd:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld3;
                case 49: goto Ld6;
                case 204: goto Ldb;
                case 239: goto L2df;
                default: goto Ld2;
            }     // Catch: java.lang.Exception -> L2b6
        Ld2:
            goto Lcd
        Ld3:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lcd
        Ld6:
            if (r1 == 0) goto Ld3
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lcd
        Ldb:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L2b6
            r3 = 1233(0x4d1, float:1.728E-42)
            int r7 = androidx.activity.C1064.f90     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ 486(0x1e6, float:6.81E-43)
            r8 = 454(0x1c6, float:6.36E-43)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r3, r7, r8)     // Catch: java.lang.Exception -> L2b6
            boolean r3 = androidx.emoji2.C1080.m1554(r1, r0)     // Catch: java.lang.Exception -> L2b6
            r0 = 1740(0x6cc, float:2.438E-42)
        Lf1:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto Lf7;
                case 54: goto Lfc;
                case 471: goto L10b;
                case 500: goto Lff;
                default: goto Lf6;
            }     // Catch: java.lang.Exception -> L2b6
        Lf6:
            goto Lf1
        Lf7:
            if (r3 == 0) goto Lfc
            r0 = 1833(0x729, float:2.569E-42)
            goto Lf1
        Lfc:
            r0 = 1802(0x70a, float:2.525E-42)
            goto Lf1
        Lff:
            r0 = 1864(0x748, float:2.612E-42)
        L101:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L107;
                case 47483: goto L2df;
                default: goto L106;
            }     // Catch: java.lang.Exception -> L2b6
        L106:
            goto L101
        L107:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L101
        L10b:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2b6
            r3.<init>(r1)     // Catch: java.lang.Exception -> L2b6
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L2b6
            r1 = 1245(0x4dd, float:1.745E-42)
            int r7 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ 197(0xc5, float:2.76E-43)
            r8 = 2938(0xb7a, float:4.117E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r7, r8)     // Catch: java.lang.Exception -> L2b6
            int r1 = androidx.vectordrawable.animated.C1102.m3071(r3, r0)     // Catch: java.lang.Exception -> L2b6
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L127:
            r7 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 14: goto L12f;
                case 45: goto L2df;
                case 76: goto L13b;
                case 239: goto L133;
                default: goto L12e;
            }     // Catch: java.lang.Exception -> L2b6
        L12e:
            goto L127
        L12f:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L127
        L133:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L12f
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L127
        L13b:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L2b6
            r1 = 1251(0x4e3, float:1.753E-42)
            int r7 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Exception -> L2b6
            r7 = r7 ^ (-367(0xfffffffffffffe91, float:NaN))
            r8 = 963(0x3c3, float:1.35E-42)
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3485(r0, r1, r7, r8)     // Catch: java.lang.Exception -> L2b6
            org.json.JSONArray r7 = androidx.core.C1073.m1032(r3, r0)     // Catch: java.lang.Exception -> L2b6
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L2b6
            r8.<init>()     // Catch: java.lang.Exception -> L2b6
            r0 = 0
            r1 = r0
        L156:
            int r3 = androidx.emoji2.viewsintegration.C1078.m1393(r7)     // Catch: java.lang.Exception -> L2b6
            r0 = 48891(0xbefb, float:6.8511E-41)
        L15d:
            r9 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r9
            switch(r0) {
                case 22: goto L165;
                case 53: goto L18a;
                case 503: goto L169;
                case 32495: goto L16f;
                default: goto L164;
            }     // Catch: java.lang.Exception -> L2b6
        L164:
            goto L15d
        L165:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L15d
        L169:
            if (r1 < r3) goto L165
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L15d
        L16f:
            android.os.Handler r0 = m7523()     // Catch: java.lang.Exception -> L2b6
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda35 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda35     // Catch: java.lang.Exception -> L2b6
            r1.<init>(r8, r15)     // Catch: java.lang.Exception -> L2b6
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Exception -> L2b6
            r0 = 49666(0xc202, float:6.9597E-41)
        L17e:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L186;
                case 50: goto L2df;
                default: goto L185;
            }     // Catch: java.lang.Exception -> L2b6
        L185:
            goto L17e
        L186:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L17e
        L18a:
            org.json.JSONObject r3 = androidx.vectordrawable.C1103.m3180(r7, r1)     // Catch: java.lang.Exception -> L2b6
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L2b6
            r9 = 1255(0x4e7, float:1.759E-42)
            int r10 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Exception -> L2b6
            r10 = r10 ^ 768(0x300, float:1.076E-42)
            r11 = 2808(0xaf8, float:3.935E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r9, r10, r11)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r9 = androidx.loader.C1096.m2683(r3, r0)     // Catch: java.lang.Exception -> L2b6
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L2b6
            r10 = 1268(0x4f4, float:1.777E-42)
            int r11 = androidx.documentfile.C1076.f102     // Catch: java.lang.Exception -> L2b6
            r11 = r11 ^ (-606(0xfffffffffffffda2, float:NaN))
            r12 = 1768(0x6e8, float:2.477E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r10, r11, r12)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r10 = androidx.loader.C1096.m2683(r3, r0)     // Catch: java.lang.Exception -> L2b6
            boolean r11 = androidx.loader.C1097.m2717(r3, r6)     // Catch: java.lang.Exception -> L2b6
            r0 = 49790(0xc27e, float:6.977E-41)
        L1bd:
            r12 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r12
            switch(r0) {
                case 18: goto L1c5;
                case 51: goto L1f8;
                case 84: goto L1cf;
                case 241: goto L1c9;
                default: goto L1c4;
            }     // Catch: java.lang.Exception -> L2b6
        L1c4:
            goto L1bd
        L1c5:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L1bd
        L1c9:
            if (r11 == 0) goto L1c5
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L1bd
        L1cf:
            java.lang.String r0 = androidx.loader.C1096.m2683(r3, r6)     // Catch: java.lang.Exception -> L2b6
            r3 = 49914(0xc2fa, float:6.9944E-41)
        L1d6:
            r11 = 49931(0xc30b, float:6.9968E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 497: goto L1de;
                case 1711: goto L1e2;
                default: goto L1dd;
            }     // Catch: java.lang.Exception -> L2b6
        L1dd:
            goto L1d6
        L1de:
            r3 = 50596(0xc5a4, float:7.09E-41)
            goto L1d6
        L1e2:
            r3 = r0
        L1e3:
            boolean r11 = androidx.activity.C1066.m488(r3)     // Catch: java.lang.Exception -> L2b6
            r0 = 51836(0xca7c, float:7.2638E-41)
        L1ea:
            r12 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r12
            switch(r0) {
                case 241: goto L1f2;
                case 1963: goto L258;
                case 1992: goto L293;
                case 2025: goto L25c;
                default: goto L1f1;
            }     // Catch: java.lang.Exception -> L2b6
        L1f1:
            goto L1ea
        L1f2:
            if (r11 == 0) goto L258
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L1ea
        L1f8:
            boolean r11 = androidx.loader.C1097.m2717(r3, r5)     // Catch: java.lang.Exception -> L2b6
            r0 = 50689(0xc601, float:7.103E-41)
        L1ff:
            r12 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r12
            switch(r0) {
                case 19: goto L207;
                case 45: goto L2e0;
                case 50: goto L20d;
                case 76: goto L211;
                default: goto L206;
            }     // Catch: java.lang.Exception -> L2b6
        L206:
            goto L1ff
        L207:
            if (r11 == 0) goto L20d
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L1ff
        L20d:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L1ff
        L211:
            org.json.JSONObject r3 = androidx.vectordrawable.C1105.m3254(r3, r5)     // Catch: java.lang.Exception -> L2b6
            boolean r11 = androidx.loader.C1097.m2717(r3, r4)     // Catch: java.lang.Exception -> L2b6
            r0 = 50813(0xc67d, float:7.1204E-41)
        L21c:
            r12 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r12
            switch(r0) {
                case 18: goto L224;
                case 53: goto L247;
                case 243: goto L228;
                case 4075: goto L22e;
                default: goto L223;
            }     // Catch: java.lang.Exception -> L2b6
        L223:
            goto L21c
        L224:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto L21c
        L228:
            if (r11 == 0) goto L224
            r0 = 51557(0xc965, float:7.2247E-41)
            goto L21c
        L22e:
            org.json.JSONObject r0 = androidx.vectordrawable.C1105.m3254(r3, r4)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r0 = androidx.loader.C1096.m2683(r0, r6)     // Catch: java.lang.Exception -> L2b6
            r3 = 51588(0xc984, float:7.229E-41)
        L239:
            r11 = 51605(0xc995, float:7.2314E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 17: goto L241;
                case 54: goto L245;
                default: goto L240;
            }     // Catch: java.lang.Exception -> L2b6
        L240:
            goto L239
        L241:
            r3 = 51619(0xc9a3, float:7.2334E-41)
            goto L239
        L245:
            r3 = r0
            goto L1e3
        L247:
            r0 = 51712(0xca00, float:7.2464E-41)
        L24a:
            r3 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L252;
                case 15: goto L251;
                case 16: goto L251;
                case 17: goto L254;
                default: goto L251;
            }     // Catch: java.lang.Exception -> L2b6
        L251:
            goto L24a
        L252:
            r3 = r2
            goto L1e3
        L254:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L24a
        L258:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L1ea
        L25c:
            r0 = 52611(0xcd83, float:7.3724E-41)
        L25f:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 23: goto L267;
                case 54: goto L26b;
                default: goto L266;
            }     // Catch: java.lang.Exception -> L2b6
        L266:
            goto L25f
        L267:
            r0 = 52642(0xcda2, float:7.3767E-41)
            goto L25f
        L26b:
            r0 = r2
        L26c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b6
            r3.<init>()     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r10)     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r0)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Exception -> L2b6
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3755(r8, r0, r9)     // Catch: java.lang.Exception -> L2b6
            int r0 = androidx.core.C1073.f99
            r0 = r0 ^ 446(0x1be, float:6.25E-43)
            int r0 = r0 + r1
            r1 = 52735(0xcdff, float:7.3897E-41)
        L288:
            r3 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L290;
                case 1007: goto L2b2;
                default: goto L28f;
            }
        L28f:
            goto L288
        L290:
            r1 = r0
            goto L156
        L293:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b6
            r0.<init>()     // Catch: java.lang.Exception -> L2b6
            short[] r11 = m7514()     // Catch: java.lang.Exception -> L2b6
            r12 = 1272(0x4f8, float:1.782E-42)
            r13 = 1
            r14 = 819(0x333, float:1.148E-42)
            java.lang.String r11 = androidx.activity.C1063.m241(r11, r12, r13, r14)     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r11)     // Catch: java.lang.Exception -> L2b6
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)     // Catch: java.lang.Exception -> L2b6
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Exception -> L2b6
            goto L26c
        L2b2:
            r1 = 52766(0xce1e, float:7.3941E-41)
            goto L288
        L2b6:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1273(0x4f9, float:1.784E-42)
            int r4 = androidx.activity.C1066.f92
            r4 = r4 ^ 804(0x324, float:1.127E-42)
            r5 = 1947(0x79b, float:2.728E-42)
            java.lang.String r2 = androidx.activity.C1064.m310(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
        L2df:
            return
        L2e0:
            r3 = r2
            goto L1e3
    }

    static /* synthetic */ boolean lambda$30(java.io.File r9) {
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۣ۠ۤ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56413: goto L3d;
                case 1750567: goto L35;
                case 1750656: goto L22;
                case 1753507: goto L1a;
                case 1753693: goto L12;
                case 1754630: goto L2e;
                default: goto L11;
            }
        L11:
            return r5
        L12:
            short[] r1 = m7514()
            java.lang.String r4 = "ۧۧۦ"
            r2 = r1
            goto La
        L1a:
            boolean r5 = androidx.activity.C1064.m311(r3, r0)
            java.lang.String r1 = "۠ۥ۟"
            r4 = r1
            goto La
        L22:
            r0 = 1290(0x50a, float:1.808E-42)
            r1 = 519(0x207, float:7.27E-43)
            java.lang.String r0 = androidx.customview.C1074.m1116(r2, r0, r8, r1)
            java.lang.String r1 = "ۦۢ۟"
            r4 = r1
            goto La
        L2e:
            int r6 = androidx.lifecycle.process.C1089.f115
            java.lang.String r1 = "ۣ۠"
            r4 = r1
            r7 = r6
            goto La
        L35:
            java.lang.String r1 = androidx.loader.C1099.m2847(r9)
            java.lang.String r4 = "ۦۨ۟"
            r3 = r1
            goto La
        L3d:
            r6 = r7 ^ 932(0x3a4, float:1.306E-42)
            java.lang.String r1 = "ۣۣ۠"
            r4 = r1
            r8 = r6
            goto La
    }

    static /* synthetic */ int lambda$31(java.io.File r8, java.io.File r9) {
            r4 = 0
            r1 = 0
            java.lang.String r0 = "ۥۡ۟"
            r2 = r4
            r6 = r4
        L7:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1746908: goto L16;
                case 1749636: goto L24;
                case 1752515: goto L1d;
                default: goto Le;
            }
        Le:
            long r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3810(r8)
            java.lang.String r0 = "۟ۦۣ"
            r6 = r4
            goto L7
        L16:
            int r1 = androidx.vectordrawable.C1104.m3226(r2, r6)
            java.lang.String r0 = "ۣۢۡ"
            goto L7
        L1d:
            long r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3810(r9)
            java.lang.String r0 = "ۥ۟ۤ"
            goto L7
        L24:
            return r1
    }

    static /* synthetic */ void lambda$32(android.app.Activity r4) {
            short[] r0 = m7514()
            r1 = 1294(0x50e, float:1.813E-42)
            int r2 = org.luckypray.dexkit.C1123.f433
            r2 = r2 ^ (-974(0xfffffffffffffc32, float:NaN))
            r3 = 2493(0x9bd, float:3.493E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r2, r3)
            m7474(r4, r0)
            m7493()
            java.lang.Runnable r1 = m7477()
            r0 = 1616(0x650, float:2.264E-42)
        L1c:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L22;
                case 49: goto L25;
                case 204: goto L2a;
                case 239: goto L34;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1c
        L25:
            if (r1 == 0) goto L22
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1c
        L2a:
            java.lang.Runnable r0 = m7477()
            r1 = 0
            kevin.fun.hook.VoiceAssistantHook.onReplaceCompleteCallback = r1
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r0)
        L34:
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1740(0x6cc, float:2.438E-42)
        L3a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L40;
                case 54: goto L45;
                case 471: goto L57;
                case 500: goto L48;
                default: goto L3f;
            }
        L3f:
            goto L3a
        L40:
            if (r1 > 0) goto L45
            r0 = 1833(0x729, float:2.569E-42)
            goto L3a
        L45:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3a
        L48:
            java.lang.String r0 = "tkUFbNqCqTGsyuM1FIkTKQ"
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1844(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L57:
            return
    }

    static /* synthetic */ void lambda$33(android.app.Activity r9, android.view.View r10) {
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۥۥۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56319: goto L50;
                case 1746967: goto L41;
                case 1749694: goto L56;
                case 1750754: goto L2d;
                case 1752616: goto L1d;
                case 1752641: goto L3a;
                case 1754439: goto L49;
                case 1754499: goto L33;
                case 1755342: goto L26;
                default: goto L11;
            }
        L11:
            r1 = 1305(0x519, float:1.829E-42)
            r2 = 1694(0x69e, float:2.374E-42)
            java.lang.String r1 = androidx.annotation.experimental.C1067.m581(r3, r1, r8, r2)
            java.lang.String r5 = "ۧۡۡ"
            r2 = r1
            goto La
        L1d:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda28 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda28
            r1.<init>(r10, r9)
            java.lang.String r5 = "ۣۧ۟"
            r4 = r1
            goto La
        L26:
            r0 = r10
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r1 = "۟ۨ۠"
            r5 = r1
            goto La
        L2d:
            int r6 = androidx.lifecycle.process.C1089.f115
            java.lang.String r1 = "۠۟"
            r5 = r1
            goto La
        L33:
            m7495(r4)
            java.lang.String r1 = "ۣۢ۟"
            r5 = r1
            goto La
        L3a:
            androidx.loader.C1096.m2665(r10, r7)
            java.lang.String r1 = "ۨ۟ۥ"
            r5 = r1
            goto La
        L41:
            short[] r1 = m7514()
            java.lang.String r5 = "ۣۦۥ"
            r3 = r1
            goto La
        L49:
            androidx.interpolator.C1082.m53(r0, r2)
            java.lang.String r1 = "ۥۤۧ"
            r5 = r1
            goto La
        L50:
            r8 = r6 ^ 934(0x3a6, float:1.309E-42)
            java.lang.String r1 = "۟ۤ۠"
            r5 = r1
            goto La
        L56:
            return
    }

    static /* synthetic */ void lambda$34(android.view.View r4, android.app.Activity r5) {
            r1 = 0
            java.lang.String r3 = "ۧۨ۟"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1749700: goto L1d;
                case 1753453: goto L14;
                case 1754535: goto L24;
                default: goto Lc;
            }
        Lc:
            android.os.Handler r1 = m7523()
            java.lang.String r3 = "ۦ۠ۧ"
            r2 = r1
            goto L5
        L14:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda21 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda21
            r0.<init>(r4, r5)
            java.lang.String r1 = "ۣۢۥ"
            r3 = r1
            goto L5
        L1d:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "ۧۤۤ"
            r3 = r1
            goto L5
        L24:
            return
    }

    static /* synthetic */ void lambda$35(android.view.View r4, android.app.Activity r5) {
            r0 = 1
            androidx.loader.C1096.m2665(r4, r0)
            android.widget.Button r4 = (android.widget.Button) r4
            short[] r0 = m7514()
            r1 = 1311(0x51f, float:1.837E-42)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r2 = r2 ^ (-121(0xffffffffffffff87, float:NaN))
            r3 = 711(0x2c7, float:9.96E-43)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
            androidx.interpolator.C1082.m53(r4, r0)
            m7509(r5)
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1616(0x650, float:2.264E-42)
        L22:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L28;
                case 49: goto L2b;
                case 204: goto L30;
                case 239: goto L3f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L22
        L2b:
            if (r1 > 0) goto L28
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L22
        L30:
            java.lang.String r0 = "VNcDGou"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3f:
            return
    }

    static /* synthetic */ void lambda$36(kevin.fun.hook.VoiceAssistantHook.AudioAdapter r2, android.widget.AdapterView r3, android.view.View r4, int r5, long r6) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L3b;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r5 < 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            java.util.List r0 = m7498()
            int r1 = androidx.lifecycle.livedata.C1086.m1931(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L3b;
                case 500: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r5 >= r1) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            java.util.List r0 = m7498()
            java.lang.Object r0 = androidx.drawerlayout.C1077.m1311(r0, r5)
            kevin.fun.hook.VoiceAssistantHook$AudioItem r0 = (kevin.fun.hook.VoiceAssistantHook.AudioItem) r0
            android.net.Uri r0 = m7505(r0)
            kevin.fun.hook.VoiceAssistantHook.selectedAudio = r0
            m7540(r2)
        L3b:
            return
    }

    static /* synthetic */ void lambda$37(android.view.View r0) {
            m7483()
            return
    }

    static /* synthetic */ void lambda$38(android.app.Activity r0, android.view.View r1) {
            m7515(r0)
            return
    }

    static /* synthetic */ void lambda$39(android.widget.ListView r2) {
            android.os.Handler r0 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda6 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda6
            r1.<init>(r2)
            androidx.activity.C1062.m178(r0, r1)
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 1616(0x650, float:2.264E-42)
        L12:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L18;
                case 49: goto L1b;
                case 204: goto L20;
                case 239: goto L2f;
                default: goto L17;
            }
        L17:
            goto L12
        L18:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L12
        L1b:
            if (r1 < 0) goto L18
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L12
        L20:
            java.lang.String r0 = "crbW15JcMuk8cU3"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2f:
            return
    }

    static /* synthetic */ void lambda$4(java.util.Map r2, android.content.Context r3) {
            java.util.Map r0 = m7531()
            androidx.loader.C1094.m2464(r0)
            java.util.Map r0 = m7531()
            androidx.customview.C1075.m1188(r0, r2)
            java.util.Map r0 = m7531()
            boolean r1 = org.luckypray.dexkit.C1123.m10501(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L18:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1e;
                case 49: goto L21;
                case 204: goto L26;
                case 239: goto L3a;
                default: goto L1d;
            }
        L1d:
            goto L18
        L1e:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L18
        L21:
            if (r1 != 0) goto L1e
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L18
        L26:
            java.util.Map r0 = m7531()
            java.util.Collection r0 = androidx.viewpager.C1108.m3547(r0)
            java.util.Iterator r0 = androidx.interpolator.C1082.m1687(r0)
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r0)
            java.lang.String r0 = (java.lang.String) r0
            kevin.fun.hook.VoiceAssistantHook.selectedVoiceId = r0
        L3a:
            m7534(r3)
            return
    }

    static /* synthetic */ void lambda$40(android.widget.ListView r3) {
            android.widget.ListAdapter r1 = androidx.vectordrawable.C1103.m3138(r3)
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.ListAdapter r0 = androidx.vectordrawable.C1103.m3138(r3)
            kevin.fun.hook.VoiceAssistantHook$AudioAdapter r0 = (kevin.fun.hook.VoiceAssistantHook.AudioAdapter) r0
            m7540(r0)
        L1d:
            int r1 = androidx.core.ktx.C1071.m854()
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L40;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 > 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "Xn"
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2359(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L40:
            return
    }

    static /* synthetic */ void lambda$41(java.lang.Runnable r5) {
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ref.WeakReference r1 = m7543()
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L2e;
                default: goto L10;
            }
        L10:
            goto Lb
        L11:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lb
        L14:
            if (r1 == 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.ref.WeakReference r0 = m7543()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 1740(0x6cc, float:2.438E-42)
        L25:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2b;
                case 54: goto L2f;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L25
        L2e:
            r0 = 0
        L2f:
            r1 = 1864(0x748, float:2.612E-42)
        L31:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L37;
                case 47384: goto L6a;
                case 47417: goto L41;
                case 47483: goto L3d;
                default: goto L36;
            }
        L36:
            goto L31
        L37:
            if (r0 != 0) goto L3d
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L31
        L3d:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L31
        L41:
            int r1 = androidx.loader.C1097.m2731()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L48:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L50;
                case 45: goto L69;
                case 76: goto L5a;
                case 239: goto L54;
                default: goto L4f;
            }
        L4f:
            goto L48
        L50:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L48
        L54:
            if (r1 < 0) goto L50
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L48
        L5a:
            java.lang.String r0 = "VjK9NWpVH2wlwO"
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1844(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L69:
            return
        L6a:
            android.net.Uri r3 = m7529(r0)
            r1 = 48891(0xbefb, float:6.8511E-41)
        L71:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 22: goto L79;
                case 53: goto L83;
                case 503: goto L7d;
                case 32495: goto L69;
                default: goto L78;
            }
        L78:
            goto L71
        L79:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L71
        L7d:
            if (r3 != 0) goto L79
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L71
        L83:
            androidx.documentfile.provider.DocumentFile r0 = androidx.versionedparcelable.C1106.m3416(r0, r3)
            m7478(r0, r2)
            java.util.List r0 = m7498()
            androidx.core.C1072.m954(r0)
            java.util.List r0 = m7498()
            androidx.versionedparcelable.C1107.m3471(r0, r2)
            long r0 = androidx.lifecycle.process.C1089.m2100()
            kevin.fun.hook.VoiceAssistantHook.lastScanTime = r0
            r0 = 49666(0xc202, float:6.9597E-41)
        La1:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto La9;
                case 50: goto Laf;
                case 76: goto Lb3;
                case 83: goto L69;
                default: goto La8;
            }
        La8:
            goto La1
        La9:
            if (r5 == 0) goto Laf
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto La1
        Laf:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto La1
        Lb3:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r5)
            goto L69
    }

    static /* synthetic */ void lambda$42(android.app.Activity r8) {
            r1 = 0
            short[] r0 = m7514()
            r2 = 1313(0x521, float:1.84E-42)
            int r3 = androidx.emoji2.C1080.f106
            r3 = r3 ^ 383(0x17f, float:5.37E-43)
            r4 = 3137(0xc41, float:4.396E-42)
            java.lang.String r4 = androidx.vectordrawable.C1104.m3232(r0, r2, r3, r4)
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L237
            java.lang.String r0 = m7517()     // Catch: java.lang.Exception -> L237
            r2.<init>(r0)     // Catch: java.lang.Exception -> L237
            boolean r3 = androidx.vectordrawable.C1105.m3294(r2)     // Catch: java.lang.Exception -> L237
            r0 = 1616(0x650, float:2.264E-42)
        L20:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L26;
                case 49: goto L29;
                case 204: goto L2e;
                case 239: goto L56;
                default: goto L25;
            }     // Catch: java.lang.Exception -> L237
        L25:
            goto L20
        L26:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L20
        L29:
            if (r3 != 0) goto L26
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L20
        L2e:
            boolean r3 = androidx.lifecycle.process.C1090.m2220(r2)     // Catch: java.lang.Exception -> L237
            r0 = 1740(0x6cc, float:2.438E-42)
        L34:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3a;
                case 54: goto L3f;
                case 471: goto L56;
                case 500: goto L42;
                default: goto L39;
            }     // Catch: java.lang.Exception -> L237
        L39:
            goto L34
        L3a:
            if (r3 != 0) goto L3f
            r0 = 1833(0x729, float:2.569E-42)
            goto L34
        L3f:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L34
        L42:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L237
            r1 = 1319(0x527, float:1.848E-42)
            int r2 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Exception -> L237
            r2 = r2 ^ 203(0xcb, float:2.84E-43)
            r3 = 1232(0x4d0, float:1.726E-42)
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3485(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L237
            m7474(r8, r0)     // Catch: java.lang.Exception -> L237
        L55:
            return
        L56:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda18 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda18     // Catch: java.lang.Exception -> L237
            r0.<init>()     // Catch: java.lang.Exception -> L237
            java.io.File[] r2 = androidx.customview.C1074.m1105(r2, r0)     // Catch: java.lang.Exception -> L237
            r0 = 1864(0x748, float:2.612E-42)
        L61:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L67;
                case 47384: goto L92;
                case 47417: goto L71;
                case 47483: goto L6d;
                default: goto L66;
            }     // Catch: java.lang.Exception -> L237
        L66:
            goto L61
        L67:
            if (r2 == 0) goto L6d
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L61
        L6d:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L61
        L71:
            int r3 = r2.length     // Catch: java.lang.Exception -> L237
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L75:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto L7d;
                case 45: goto Lbe;
                case 76: goto L87;
                case 239: goto L81;
                default: goto L7c;
            }     // Catch: java.lang.Exception -> L237
        L7c:
            goto L75
        L7d:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L75
        L81:
            if (r3 != 0) goto L7d
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L75
        L87:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L8a:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L92;
                case 503: goto Lba;
                default: goto L91;
            }     // Catch: java.lang.Exception -> L237
        L91:
            goto L8a
        L92:
            short[] r0 = m7514()     // Catch: java.lang.Exception -> L237
            r1 = 1344(0x540, float:1.883E-42)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Exception -> L237
            r2 = r2 ^ (-949(0xfffffffffffffc4b, float:NaN))
            r3 = 1378(0x562, float:1.931E-42)
            java.lang.String r0 = androidx.core.C1073.m1028(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L237
            m7474(r8, r0)     // Catch: java.lang.Exception -> L237
            int r1 = org.luckypray.dexkit.C1123.m10509()
            r0 = 53634(0xd182, float:7.5157E-41)
        Lac:
            r2 = 53651(0xd193, float:7.5181E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Lb4;
                case 50: goto L221;
                case 76: goto L226;
                case 83: goto L55;
                default: goto Lb3;
            }
        Lb3:
            goto Lac
        Lb4:
            if (r1 > 0) goto L221
            r0 = 53727(0xd1df, float:7.5288E-41)
            goto Lac
        Lba:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L8a
        Lbe:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda19 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda19     // Catch: java.lang.Exception -> L237
            r0.<init>()     // Catch: java.lang.Exception -> L237
            kevin.fun.hook.audio.C1117.m8102(r2, r0)     // Catch: java.lang.Exception -> L237
            r0 = 0
            r0 = r2[r0]     // Catch: java.lang.Exception -> L237
            android.content.ContentResolver r2 = androidx.lifecycle.process.C1087.m2004(r8)     // Catch: java.lang.Throwable -> L27a
            android.net.Uri r3 = m7479()     // Catch: java.lang.Throwable -> L27a
            java.io.InputStream r3 = androidx.annotation.experimental.C1067.m606(r2, r3)     // Catch: java.lang.Throwable -> L27a
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L149
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L149
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r0]     // Catch: java.lang.Throwable -> L143
        Lde:
            int r6 = androidx.loader.C1099.m2896(r3, r5)     // Catch: java.lang.Throwable -> L143
            r0 = 49666(0xc202, float:6.9597E-41)
        Le5:
            r7 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 17: goto Led;
                case 50: goto Lf3;
                case 76: goto Lf7;
                case 83: goto L130;
                default: goto Lec;
            }     // Catch: java.lang.Throwable -> L143
        Lec:
            goto Le5
        Led:
            if (r6 > 0) goto Lf3
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Le5
        Lf3:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Le5
        Lf7:
            kevin.fun.hook.audio.C1117.m8156(r2)     // Catch: java.lang.Throwable -> L143
            android.os.Handler r0 = m7523()     // Catch: java.lang.Throwable -> L143
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda20 r5 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda20     // Catch: java.lang.Throwable -> L143
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L143
            androidx.activity.C1062.m178(r0, r5)     // Catch: java.lang.Throwable -> L143
            kevin.fun.hook.audio.C1117.m8104(r2)     // Catch: java.lang.Throwable -> L149
            r0 = 49790(0xc27e, float:6.977E-41)
        L10c:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L114;
                case 51: goto L55;
                case 84: goto L11e;
                case 241: goto L118;
                default: goto L113;
            }
        L113:
            goto L10c
        L114:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L10c
        L118:
            if (r3 == 0) goto L114
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L10c
        L11e:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L27a
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L124:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L12c;
                case 1711: goto L55;
                default: goto L12b;
            }
        L12b:
            goto L124
        L12c:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L124
        L130:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r2, r5, r0, r6)     // Catch: java.lang.Throwable -> L143
            r0 = 50689(0xc601, float:7.103E-41)
        L137:
            r6 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 19: goto L13f;
                case 50: goto Lde;
                default: goto L13e;
            }
        L13e:
            goto L137
        L13f:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L137
        L143:
            r0 = move-exception
            r1 = r0
            kevin.fun.hook.audio.C1117.m8104(r2)     // Catch: java.lang.Throwable -> L149
            throw r1     // Catch: java.lang.Throwable -> L149
        L149:
            r0 = move-exception
            r2 = 50813(0xc67d, float:7.1204E-41)
        L14d:
            r5 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 18: goto L155;
                case 53: goto L16e;
                case 243: goto L159;
                case 4075: goto L15f;
                default: goto L154;
            }
        L154:
            goto L14d
        L155:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L14d
        L159:
            if (r1 != 0) goto L155
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L14d
        L15f:
            r1 = 51588(0xc984, float:7.229E-41)
        L162:
            r2 = 51605(0xc995, float:7.2314E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L16a;
                case 54: goto L187;
                default: goto L169;
            }
        L169:
            goto L162
        L16a:
            r1 = 51619(0xc9a3, float:7.2334E-41)
            goto L162
        L16e:
            r2 = 51712(0xca00, float:7.2464E-41)
        L171:
            r5 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L179;
                case 17: goto L17d;
                case 47: goto L287;
                case 76: goto L183;
                default: goto L178;
            }
        L178:
            goto L171
        L179:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L171
        L17d:
            if (r1 == r0) goto L179
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L171
        L183:
            kevin.fun.hook.audio.C1116.m8088(r1, r0)     // Catch: java.lang.Throwable -> L27f
            r0 = r1
        L187:
            r1 = 51836(0xca7c, float:7.2638E-41)
        L18a:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 241: goto L192;
                case 1963: goto L198;
                case 1992: goto L19f;
                case 2025: goto L19c;
                default: goto L191;
            }
        L191:
            goto L18a
        L192:
            if (r3 == 0) goto L198
            r1 = 52580(0xcd64, float:7.368E-41)
            goto L18a
        L198:
            r1 = 52549(0xcd45, float:7.3637E-41)
            goto L18a
        L19c:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L1a0
        L19f:
            throw r0     // Catch: java.lang.Throwable -> L1a0
        L1a0:
            r1 = move-exception
            r2 = r1
            r3 = r0
        L1a3:
            r0 = 52611(0xcd83, float:7.3724E-41)
        L1a6:
            r1 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 23: goto L1ae;
                case 54: goto L1b4;
                case 85: goto L284;
                case 116: goto L1b8;
                default: goto L1ad;
            }
        L1ad:
            goto L1a6
        L1ae:
            if (r3 == 0) goto L1b4
            r0 = 52704(0xcde0, float:7.3854E-41)
            goto L1a6
        L1b4:
            r0 = 52673(0xcdc1, float:7.381E-41)
            goto L1a6
        L1b8:
            r0 = 52735(0xcdff, float:7.3897E-41)
        L1bb:
            r1 = 52752(0xce10, float:7.3921E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L1c3;
                case 45: goto L1d0;
                case 1007: goto L1c7;
                case 7927: goto L1cd;
                default: goto L1c2;
            }
        L1c2:
            goto L1bb
        L1c3:
            r0 = 52797(0xce3d, float:7.3984E-41)
            goto L1bb
        L1c7:
            if (r3 == r2) goto L1c3
            r0 = 53479(0xd0e7, float:7.494E-41)
            goto L1bb
        L1cd:
            kevin.fun.hook.audio.C1116.m8088(r3, r2)     // Catch: java.io.IOException -> L1d1 java.lang.Exception -> L237
        L1d0:
            throw r3     // Catch: java.io.IOException -> L1d1 java.lang.Exception -> L237
        L1d1:
            r0 = move-exception
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1366(r0)     // Catch: java.lang.Exception -> L237
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L237
            r2.<init>()     // Catch: java.lang.Exception -> L237
            short[] r3 = m7514()     // Catch: java.lang.Exception -> L237
            r5 = 1327(0x52f, float:1.86E-42)
            int r6 = androidx.interpolator.C1081.f107     // Catch: java.lang.Exception -> L237
            r6 = r6 ^ (-282(0xfffffffffffffee6, float:NaN))
            r7 = 1435(0x59b, float:2.011E-42)
            java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r3, r5, r6, r7)     // Catch: java.lang.Exception -> L237
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)     // Catch: java.lang.Exception -> L237
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)     // Catch: java.lang.Exception -> L237
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Exception -> L237
            m7537(r1)     // Catch: java.lang.Exception -> L237
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1366(r0)     // Catch: java.lang.Exception -> L237
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L237
            r1.<init>()     // Catch: java.lang.Exception -> L237
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)     // Catch: java.lang.Exception -> L237
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Exception -> L237
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Exception -> L237
            m7474(r8, r0)     // Catch: java.lang.Exception -> L237
            r0 = 53510(0xd106, float:7.4983E-41)
        L215:
            r1 = 53527(0xd117, float:7.5007E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L21d;
                case 50: goto L55;
                default: goto L21c;
            }
        L21c:
            goto L215
        L21d:
            r0 = 53541(0xd125, float:7.5027E-41)
            goto L215
        L221:
            r0 = 53696(0xd1c0, float:7.5244E-41)
            goto Lac
        L226:
            java.lang.String r0 = "Y0yItaWHXpIEs"
            java.lang.String r0 = androidx.core.C1072.m925(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L55
        L237:
            r0 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7514()
            r5 = 1361(0x551, float:1.907E-42)
            int r6 = org.luckypray.dexkit.C1123.f433
            r6 = r6 ^ (-970(0xfffffffffffffc36, float:NaN))
            r7 = 3227(0xc9b, float:4.522E-42)
            java.lang.String r3 = androidx.appcompat.C1069.m751(r3, r5, r6, r7)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7537(r1)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7474(r8, r0)
            goto L55
        L27a:
            r0 = move-exception
            r2 = r0
            r3 = r1
            goto L1a3
        L27f:
            r0 = move-exception
            r2 = r0
            r3 = r1
            goto L1a3
        L284:
            r3 = r2
            goto L1d0
        L287:
            r0 = r1
            goto L187
    }

    static /* synthetic */ boolean lambda$43(java.io.File r9) {
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۣ۠ۦ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747779: goto L1f;
                case 1749636: goto L2f;
                case 1752486: goto L43;
                case 1754468: goto L27;
                case 1754565: goto L37;
                case 1755404: goto L18;
                default: goto L11;
            }
        L11:
            int r6 = androidx.customview.C1074.f100
            java.lang.String r1 = "ۨۡۥ"
            r4 = r1
            r7 = r6
            goto La
        L18:
            r6 = r7 ^ 247(0xf7, float:3.46E-43)
            java.lang.String r1 = "ۧۥۣ"
            r4 = r1
            r8 = r6
            goto La
        L1f:
            java.lang.String r0 = androidx.loader.C1099.m2847(r9)
            java.lang.String r1 = "ۧۢ۟"
            r4 = r1
            goto La
        L27:
            short[] r1 = m7514()
            java.lang.String r4 = "ۤۡۧ"
            r2 = r1
            goto La
        L2f:
            boolean r5 = androidx.activity.C1064.m311(r0, r3)
            java.lang.String r1 = "ۥ۠ۡ"
            r4 = r1
            goto La
        L37:
            r1 = 1376(0x560, float:1.928E-42)
            r3 = 3110(0xc26, float:4.358E-42)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r2, r1, r8, r3)
            java.lang.String r4 = "ۣۢۡ"
            r3 = r1
            goto La
        L43:
            return r5
    }

    static /* synthetic */ int lambda$44(java.io.File r8, java.io.File r9) {
            r4 = 0
            r1 = 0
            java.lang.String r0 = "ۤۧۢ"
            r2 = r4
            r6 = r4
        L7:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1751743: goto Lf;
                case 1753421: goto L16;
                case 1753445: goto L1d;
                default: goto Le;
            }
        Le:
            return r1
        Lf:
            long r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3810(r9)
            java.lang.String r0 = "ۦ۠۟"
            goto L7
        L16:
            int r1 = androidx.vectordrawable.C1104.m3226(r2, r6)
            java.lang.String r0 = "ۨ۠ۡ"
            goto L7
        L1d:
            long r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3810(r8)
            java.lang.String r0 = "ۦ۟ۦ"
            r6 = r4
            goto L7
    }

    static /* synthetic */ void lambda$45(android.app.Activity r4) {
            short[] r0 = m7514()
            r1 = 1380(0x564, float:1.934E-42)
            int r2 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ 27
            r3 = 459(0x1cb, float:6.43E-43)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r2, r3)
            m7474(r4, r0)
            m7493()
            java.lang.Runnable r1 = m7477()
            r0 = 1616(0x650, float:2.264E-42)
        L1c:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L22;
                case 49: goto L25;
                case 204: goto L2a;
                case 239: goto L34;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1c
        L25:
            if (r1 == 0) goto L22
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1c
        L2a:
            java.lang.Runnable r0 = m7477()
            r1 = 0
            kevin.fun.hook.VoiceAssistantHook.onReplaceCompleteCallback = r1
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r0)
        L34:
            return
    }

    static /* synthetic */ void lambda$46(android.content.Context r6, java.lang.String r7) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L85;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r6 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            java.lang.ref.WeakReference r1 = m7487()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L4c;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 == 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            java.lang.ref.WeakReference r0 = m7487()
            java.lang.Object r1 = kevin.fun.hook.audio.C1116.m8047(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L2e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L34;
                case 47384: goto L4c;
                case 47417: goto L3e;
                case 47483: goto L3a;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            if (r1 == 0) goto L3a
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2e
        L3a:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2e
        L3e:
            java.lang.ref.WeakReference r0 = m7487()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.app.Dialog r0 = (android.app.Dialog) r0
            android.content.Context r6 = kevin.fun.hook.C1120.m8630(r0)
        L4c:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L4f:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L57;
                case 45: goto L85;
                case 76: goto L61;
                case 239: goto L5b;
                default: goto L56;
            }
        L56:
            goto L4f
        L57:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L4f
        L5b:
            if (r6 != 0) goto L57
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L4f
        L61:
            java.lang.ref.WeakReference r1 = m7543()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L68:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L70;
                case 53: goto L85;
                case 503: goto L74;
                case 32495: goto L7a;
                default: goto L6f;
            }
        L6f:
            goto L68
        L70:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L68
        L74:
            if (r1 == 0) goto L70
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L68
        L7a:
            java.lang.ref.WeakReference r0 = m7543()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.content.Context r0 = (android.content.Context) r0
            r6 = r0
        L85:
            r0 = 49666(0xc202, float:6.9597E-41)
        L88:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L90;
                case 50: goto L96;
                case 76: goto L9a;
                case 83: goto Le7;
                default: goto L8f;
            }
        L8f:
            goto L88
        L90:
            if (r6 != 0) goto L96
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L88
        L96:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L88
        L9a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m7514()
            r2 = 1388(0x56c, float:1.945E-42)
            int r3 = androidx.annotation.experimental.C1067.f93
            r3 = r3 ^ (-40)
            r4 = 1181(0x49d, float:1.655E-42)
            java.lang.String r1 = androidx.activity.C1063.m241(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r7)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            int r1 = androidx.loader.C1096.m2651()
            r0 = 49790(0xc27e, float:6.977E-41)
        Lc5:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto Lcd;
                case 51: goto Le6;
                case 84: goto Ld7;
                case 241: goto Ld1;
                default: goto Lcc;
            }
        Lcc:
            goto Lc5
        Lcd:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lc5
        Ld1:
            if (r1 < 0) goto Lcd
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lc5
        Ld7:
            java.lang.String r0 = "MDs"
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2222(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Le6:
            return
        Le7:
            r0 = 0
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r6, r7, r0)     // Catch: java.lang.Exception -> Lfe
            androidx.viewpager.C1108.m3524(r0)     // Catch: java.lang.Exception -> Lfe
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lf2:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto Lfa;
                case 1711: goto Le6;
                default: goto Lf9;
            }
        Lf9:
            goto Lf2
        Lfa:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto Lf2
        Lfe:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1406(0x57e, float:1.97E-42)
            int r4 = androidx.activity.C1064.f90
            r4 = r4 ^ 504(0x1f8, float:7.06E-43)
            r5 = 1062(0x426, float:1.488E-42)
            java.lang.String r2 = androidx.activity.C1062.m170(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            goto Le6
    }

    static /* synthetic */ void lambda$5(android.app.Activity r7) {
            r2 = 0
            java.lang.ref.WeakReference r1 = m7527()     // Catch: java.lang.Exception -> L168
            r0 = 1616(0x650, float:2.264E-42)
        L7:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L15;
                case 239: goto L39;
                default: goto Lc;
            }     // Catch: java.lang.Exception -> L168
        Lc:
            goto L7
        Ld:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r1 == 0) goto Ld
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            java.lang.ref.WeakReference r0 = m7527()     // Catch: java.lang.Exception -> L168
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)     // Catch: java.lang.Exception -> L168
            android.widget.Spinner r0 = (android.widget.Spinner) r0     // Catch: java.lang.Exception -> L168
            r1 = 1740(0x6cc, float:2.438E-42)
        L21:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L27;
                case 54: goto L2a;
                default: goto L26;
            }     // Catch: java.lang.Exception -> L168
        L26:
            goto L21
        L27:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L21
        L2a:
            r1 = r0
        L2b:
            r0 = 1864(0x748, float:2.612E-42)
        L2d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L33;
                case 47384: goto L65;
                case 47417: goto L40;
                case 47483: goto L3c;
                default: goto L32;
            }     // Catch: java.lang.Exception -> L168
        L32:
            goto L2d
        L33:
            if (r1 != 0) goto L3c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2d
        L39:
            r0 = 0
            r1 = r0
            goto L2b
        L3c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2d
        L40:
            int r1 = androidx.interpolator.C1083.m1725()     // Catch: java.lang.Exception -> L168
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L47:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L4f;
                case 45: goto L64;
                case 76: goto L59;
                case 239: goto L53;
                default: goto L4e;
            }     // Catch: java.lang.Exception -> L168
        L4e:
            goto L47
        L4f:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L47
        L53:
            if (r1 < 0) goto L4f
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L47
        L59:
            java.lang.String r0 = "RCZK24J8Y6lHddeyfORPy"
            java.lang.String r0 = androidx.interpolator.C1083.m1724(r0)     // Catch: java.lang.Exception -> L168
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Exception -> L168
            r1.println(r0)     // Catch: java.lang.Exception -> L168
        L64:
            return
        L65:
            java.util.Map r0 = m7531()     // Catch: java.lang.Exception -> L168
            boolean r3 = org.luckypray.dexkit.C1123.m10501(r0)     // Catch: java.lang.Exception -> L168
            r0 = 48891(0xbefb, float:6.8511E-41)
        L70:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 22: goto L78;
                case 53: goto L64;
                case 503: goto L7c;
                case 32495: goto L82;
                default: goto L77;
            }     // Catch: java.lang.Exception -> L168
        L77:
            goto L70
        L78:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L70
        L7c:
            if (r3 != 0) goto L78
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L70
        L82:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L168
            java.util.Map r0 = m7531()     // Catch: java.lang.Exception -> L168
            java.util.Set r0 = androidx.activity.C1063.m257(r0)     // Catch: java.lang.Exception -> L168
            r5.<init>(r0)     // Catch: java.lang.Exception -> L168
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter     // Catch: java.lang.Exception -> L168
            r3 = 17367946(0x109038a, float:2.5165465E-38)
            int r4 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Exception -> L168
            r3 = r3 ^ r4
            r0.<init>(r7, r3, r5)     // Catch: java.lang.Exception -> L168
            r3 = -17367852(0xfffffffffef6fcd4, float:-1.6415142E38)
            int r4 = androidx.loader.C1098.f124     // Catch: java.lang.Exception -> L168
            r3 = r3 ^ r4
            androidx.loader.C1098.m2796(r0, r3)     // Catch: java.lang.Exception -> L168
            androidx.vectordrawable.C1105.m3262(r1, r0)     // Catch: java.lang.Exception -> L168
            java.lang.String r3 = m7510()     // Catch: java.lang.Exception -> L168
            r0 = 49666(0xc202, float:6.9597E-41)
        Lad:
            r4 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto Lb5;
                case 50: goto Lbb;
                case 76: goto Lbf;
                case 83: goto L64;
                default: goto Lb4;
            }     // Catch: java.lang.Exception -> L168
        Lb4:
            goto Lad
        Lb5:
            if (r3 == 0) goto Lbb
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lad
        Lbb:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lad
        Lbf:
            boolean r3 = androidx.activity.C1064.m359(r5)     // Catch: java.lang.Exception -> L168
            r0 = 49790(0xc27e, float:6.977E-41)
        Lc6:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto Lce;
                case 51: goto L64;
                case 84: goto Ld8;
                case 241: goto Ld2;
                default: goto Lcd;
            }     // Catch: java.lang.Exception -> L168
        Lcd:
            goto Lc6
        Lce:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lc6
        Ld2:
            if (r3 != 0) goto Lce
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lc6
        Ld8:
            r3 = r2
        Ld9:
            int r4 = androidx.lifecycle.livedata.C1086.m1931(r5)     // Catch: java.lang.Exception -> L168
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Le0:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 497: goto Le8;
                case 1711: goto Lee;
                case 1736: goto L114;
                case 1769: goto Lf2;
                default: goto Le7;
            }     // Catch: java.lang.Exception -> L168
        Le7:
            goto Le0
        Le8:
            if (r3 < r4) goto Lee
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Le0
        Lee:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Le0
        Lf2:
            r0 = 50689(0xc601, float:7.103E-41)
        Lf5:
            r3 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 19: goto Lfd;
                case 50: goto L101;
                default: goto Lfc;
            }     // Catch: java.lang.Exception -> L168
        Lfc:
            goto Lf5
        Lfd:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto Lf5
        L101:
            r0 = r2
        L102:
            androidx.appcompat.C1069.m713(r1, r0)     // Catch: java.lang.Exception -> L168
            r0 = 51712(0xca00, float:7.2464E-41)
        L108:
            r1 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L64;
                case 15: goto L10f;
                case 16: goto L10f;
                case 17: goto L110;
                default: goto L10f;
            }     // Catch: java.lang.Exception -> L168
        L10f:
            goto L108
        L110:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L108
        L114:
            java.util.Map r0 = m7531()     // Catch: java.lang.Exception -> L168
            java.lang.Object r4 = androidx.drawerlayout.C1077.m1311(r5, r3)     // Catch: java.lang.Exception -> L168
            java.lang.Object r0 = org.luckypray.dexkit.C1124.m10538(r0, r4)     // Catch: java.lang.Exception -> L168
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L168
            r4 = 50813(0xc67d, float:7.1204E-41)
        L125:
            r6 = 50830(0xc68e, float:7.1228E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 18: goto L12d;
                case 53: goto L154;
                case 243: goto L131;
                case 4075: goto L137;
                default: goto L12c;
            }     // Catch: java.lang.Exception -> L168
        L12c:
            goto L125
        L12d:
            r4 = 50875(0xc6bb, float:7.1291E-41)
            goto L125
        L131:
            if (r0 == 0) goto L12d
            r4 = 51557(0xc965, float:7.2247E-41)
            goto L125
        L137:
            java.lang.String r4 = m7510()     // Catch: java.lang.Exception -> L168
            boolean r4 = org.luckypray.dexkit.C1125.m10633(r0, r4)     // Catch: java.lang.Exception -> L168
            r0 = 51588(0xc984, float:7.229E-41)
        L142:
            r6 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 17: goto L14a;
                case 54: goto L150;
                case 87: goto L154;
                case 116: goto L193;
                default: goto L149;
            }
        L149:
            goto L142
        L14a:
            if (r4 == 0) goto L150
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L142
        L150:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L142
        L154:
            int r0 = androidx.customview.C1075.f101
            r0 = r0 ^ (-101(0xffffffffffffff9b, float:NaN))
            int r3 = r3 + r0
            r0 = 51836(0xca7c, float:7.2638E-41)
        L15c:
            r4 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 241: goto L164;
                case 1963: goto Ld9;
                default: goto L163;
            }
        L163:
            goto L15c
        L164:
            r0 = 52518(0xcd26, float:7.3593E-41)
            goto L15c
        L168:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1424(0x590, float:1.995E-42)
            int r4 = androidx.lifecycle.process.C1089.f115
            r4 = r4 ^ 945(0x3b1, float:1.324E-42)
            r5 = 1908(0x774, float:2.674E-42)
            java.lang.String r2 = androidx.versionedparcelable.C1106.m3338(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            goto L64
        L193:
            r0 = r3
            goto L102
    }

    static /* synthetic */ void lambda$6(android.widget.LinearLayout r3, android.widget.LinearLayout r4, android.app.Activity r5, android.view.View r6) {
            r2 = 0
            java.lang.ref.WeakReference r0 = m7512()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 1
            m7488(r0, r1)
            java.lang.ref.WeakReference r1 = m7533()
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L48;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r1 == 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.ref.WeakReference r0 = m7533()
            java.lang.Object r1 = kevin.fun.hook.audio.C1116.m8047(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L2d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L33;
                case 54: goto L38;
                case 471: goto L48;
                case 500: goto L3b;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            if (r1 == 0) goto L38
            r0 = 1833(0x729, float:2.569E-42)
            goto L2d
        L38:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2d
        L3b:
            java.lang.ref.WeakReference r0 = m7533()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            m7488(r0, r2)
        L48:
            androidx.loader.C1097.m2728(r3, r2)
            int r0 = androidx.activity.C1063.f89
            r0 = r0 ^ 10
            androidx.loader.C1097.m2728(r4, r0)
            m7509(r5)
            return
    }

    static /* synthetic */ void lambda$7(android.widget.LinearLayout r3, android.widget.LinearLayout r4, android.view.View r5) {
            r2 = 0
            java.lang.ref.WeakReference r0 = m7533()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 1
            m7488(r0, r1)
            java.lang.ref.WeakReference r1 = m7512()
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L48;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r1 == 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.ref.WeakReference r0 = m7512()
            java.lang.Object r1 = kevin.fun.hook.audio.C1116.m8047(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L2d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L33;
                case 54: goto L38;
                case 471: goto L48;
                case 500: goto L3b;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            if (r1 == 0) goto L38
            r0 = 1833(0x729, float:2.569E-42)
            goto L2d
        L38:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2d
        L3b:
            java.lang.ref.WeakReference r0 = m7512()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            m7488(r0, r2)
        L48:
            int r0 = androidx.loader.C1099.f125
            r0 = r0 ^ 851(0x353, float:1.193E-42)
            androidx.loader.C1097.m2728(r3, r0)
            androidx.loader.C1097.m2728(r4, r2)
            int r1 = androidx.activity.C1062.m182()
            r0 = 1864(0x748, float:2.612E-42)
        L58:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5e;
                case 47384: goto L77;
                case 47417: goto L68;
                case 47483: goto L64;
                default: goto L5d;
            }
        L5d:
            goto L58
        L5e:
            if (r1 < 0) goto L64
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L58
        L64:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L58
        L68:
            java.lang.String r0 = "M7sGhWtdmd5n8p0bKkFv"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L77:
            return
    }

    static /* synthetic */ void lambda$8(android.app.Activity r0, android.view.View r1) {
            m7491(r0)
            return
    }

    static /* synthetic */ void lambda$9(android.view.View r0) {
            m7493()
            return
    }

    private static void loadTtsConfig(android.content.Context r5) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L5a;
                case 239: goto L10;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r5 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            short[] r0 = m7514()
            r1 = 1441(0x5a1, float:2.019E-42)
            int r2 = kevin.fun.hook.audio.C1114.f403
            r2 = r2 ^ (-29)
            r3 = 956(0x3bc, float:1.34E-42)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r1, r2, r3)
            r1 = 0
            android.content.SharedPreferences r0 = androidx.drawerlayout.C1077.m1322(r5, r0, r1)
            short[] r1 = m7514()
            r2 = 1456(0x5b0, float:2.04E-42)
            int r3 = kevin.fun.hook.audio.C1115.f404
            r3 = r3 ^ 809(0x329, float:1.134E-42)
            r4 = 1698(0x6a2, float:2.38E-42)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r2, r3, r4)
            java.lang.String r2 = androidx.emoji2.C1080.m1562()
            java.lang.String r0 = androidx.loader.C1096.m2655(r0, r1, r2)
            kevin.fun.hook.VoiceAssistantHook.ttsApiKey = r0
            java.lang.String r0 = m7502()
            boolean r1 = androidx.activity.C1066.m488(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L49:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4f;
                case 54: goto L54;
                case 471: goto L5a;
                case 500: goto L57;
                default: goto L4e;
            }
        L4e:
            goto L49
        L4f:
            if (r1 != 0) goto L54
            r0 = 1833(0x729, float:2.569E-42)
            goto L49
        L54:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L49
        L57:
            m7503(r5)
        L5a:
            return
    }

    private static void loadVoiceList(android.content.Context r2) {
            java.lang.String r0 = m7502()
            boolean r1 = androidx.documentfile.C1076.m1246(r0)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L24;
                case 239: goto L18;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 == 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            java.util.concurrent.ExecutorService r0 = m7507()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda0 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda0
            r1.<init>(r2)
            androidx.activity.C1063.m244(r0, r1)
        L24:
            return
    }

    public static void onApplicationQuit() {
            r0 = 0
            com.tencent.mmkv.C1109.m3601(r0)
            java.util.concurrent.ExecutorService r1 = m7507()
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L5c;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 == 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            java.util.concurrent.ExecutorService r0 = m7507()
            androidx.lifecycle.process.C1089.m2148(r0)
            java.util.concurrent.ExecutorService r0 = m7507()     // Catch: java.lang.InterruptedException -> L54
            java.util.concurrent.TimeUnit r1 = org.luckypray.dexkit.C1124.m10546()     // Catch: java.lang.InterruptedException -> L54
            r2 = -737(0xfffffffffffffd1f, double:NaN)
            int r4 = androidx.interpolator.C1081.f107     // Catch: java.lang.InterruptedException -> L54
            long r4 = (long) r4     // Catch: java.lang.InterruptedException -> L54
            long r2 = r2 ^ r4
            boolean r1 = androidx.vectordrawable.C1104.m3223(r0, r2, r1)     // Catch: java.lang.InterruptedException -> L54
            r0 = 1740(0x6cc, float:2.438E-42)
        L33:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L39;
                case 54: goto L3e;
                case 471: goto L5c;
                case 500: goto L41;
                default: goto L38;
            }     // Catch: java.lang.InterruptedException -> L54
        L38:
            goto L33
        L39:
            if (r1 != 0) goto L3e
            r0 = 1833(0x729, float:2.569E-42)
            goto L33
        L3e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L33
        L41:
            java.util.concurrent.ExecutorService r0 = m7507()     // Catch: java.lang.InterruptedException -> L54
            androidx.vectordrawable.C1105.m3265(r0)     // Catch: java.lang.InterruptedException -> L54
            r0 = 1864(0x748, float:2.612E-42)
        L4a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L50;
                case 47483: goto L5c;
                default: goto L4f;
            }
        L4f:
            goto L4a
        L50:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L4a
        L54:
            r0 = move-exception
            java.util.concurrent.ExecutorService r0 = m7507()
            androidx.vectordrawable.C1105.m3265(r0)
        L5c:
            int r1 = androidx.interpolator.C1081.m1643()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L63:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L6b;
                case 45: goto L84;
                case 76: goto L75;
                case 239: goto L6f;
                default: goto L6a;
            }
        L6a:
            goto L63
        L6b:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L63
        L6f:
            if (r1 > 0) goto L6b
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L63
        L75:
            java.lang.String r0 = "uYTWXuL52Q19"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3709(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L84:
            return
    }

    public static void onDirectoryPicked(android.app.Activity r6, android.content.Intent r7) {
            r1 = 1709(0x6ad, float:2.395E-42)
            android.net.Uri r2 = androidx.customview.C1074.m1121(r7)     // Catch: java.lang.Throwable -> L9f
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L15;
                case 239: goto L39;
                default: goto Ld;
            }     // Catch: java.lang.Throwable -> L9f
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r2 != 0) goto Le
            r0 = r1
            goto L8
        L15:
            int r1 = androidx.loader.C1097.m2731()     // Catch: java.lang.Throwable -> L9f
            r0 = 1740(0x6cc, float:2.438E-42)
        L1b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L21;
                case 54: goto L26;
                case 471: goto L38;
                case 500: goto L29;
                default: goto L20;
            }     // Catch: java.lang.Throwable -> L9f
        L20:
            goto L1b
        L21:
            if (r1 < 0) goto L26
            r0 = 1833(0x729, float:2.569E-42)
            goto L1b
        L26:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1b
        L29:
            java.lang.String r0 = "cfVxNuEytDdczBLkF"
            java.lang.String r0 = androidx.interpolator.C1082.m1668(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> L9f
            r1.println(r0)     // Catch: java.lang.Throwable -> L9f
        L38:
            return
        L39:
            android.content.ContentResolver r0 = androidx.lifecycle.process.C1087.m2004(r6)     // Catch: java.lang.Throwable -> L9f
            int r1 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L9f
            r1 = r1 ^ 557(0x22d, float:7.8E-43)
            kevin.fun.hook.webdav.C1119.m110(r0, r2, r1)     // Catch: java.lang.Throwable -> L9f
            short[] r0 = m7514()     // Catch: java.lang.Throwable -> L9f
            r1 = 1467(0x5bb, float:2.056E-42)
            int r3 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L9f
            r3 = r3 ^ (-970(0xfffffffffffffc36, float:NaN))
            r4 = 2632(0xa48, float:3.688E-42)
            java.lang.String r0 = androidx.loader.C1096.m2645(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L9f
            r1 = 0
            android.content.SharedPreferences r0 = androidx.loader.C1096.m2626(r6, r0, r1)     // Catch: java.lang.Throwable -> L9f
            android.content.SharedPreferences$Editor r0 = androidx.emoji2.viewsintegration.C1078.m1386(r0)     // Catch: java.lang.Throwable -> L9f
            short[] r1 = m7514()     // Catch: java.lang.Throwable -> L9f
            r3 = 1482(0x5ca, float:2.077E-42)
            int r4 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L9f
            r4 = r4 ^ (-597(0xfffffffffffffdab, float:NaN))
            r5 = 1509(0x5e5, float:2.115E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1413(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = androidx.core.ktx.C1071.m871(r2)     // Catch: java.lang.Throwable -> L9f
            android.content.SharedPreferences$Editor r0 = androidx.core.C1073.m986(r0, r1, r2)     // Catch: java.lang.Throwable -> L9f
            androidx.vectordrawable.C1104.m3221(r0)     // Catch: java.lang.Throwable -> L9f
            short[] r0 = m7514()     // Catch: java.lang.Throwable -> L9f
            r1 = 1495(0x5d7, float:2.095E-42)
            int r2 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L9f
            r2 = r2 ^ (-271(0xfffffffffffffef1, float:NaN))
            r3 = 1709(0x6ad, float:2.395E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1814(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L9f
            m7474(r6, r0)     // Catch: java.lang.Throwable -> L9f
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda37 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda37     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L9f
            m7495(r0)     // Catch: java.lang.Throwable -> L9f
            r0 = 1864(0x748, float:2.612E-42)
        L95:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L9b;
                case 47483: goto L38;
                default: goto L9a;
            }
        L9a:
            goto L95
        L9b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L95
        L9f:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1501(0x5dd, float:2.103E-42)
            int r4 = androidx.startup.C1101.f127
            r4 = r4 ^ 753(0x2f1, float:1.055E-42)
            r5 = 2023(0x7e7, float:2.835E-42)
            java.lang.String r2 = androidx.versionedparcelable.C1107.m3485(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            short[] r0 = m7514()
            r1 = 1516(0x5ec, float:2.124E-42)
            int r2 = kevin.fun.hook.audio.C1114.f403
            r2 = r2 ^ (-22)
            r3 = 2608(0xa30, float:3.655E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r2, r3)
            m7474(r6, r0)
            goto L38
    }

    private static void performTtsConversion(java.lang.String r5, android.widget.TextView r6) {
            r4 = 0
            short[] r0 = m7514()
            r1 = 1522(0x5f2, float:2.133E-42)
            int r2 = kevin.fun.hook.audio.C1117.f406
            r2 = r2 ^ 65
            r3 = 1253(0x4e5, float:1.756E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            androidx.lifecycle.process.C1087.m1946(r6, r0)
            int r0 = androidx.annotation.experimental.C1067.f93
            r0 = r0 ^ 26570(0x67ca, float:3.7233E-41)
            kevin.fun.hook.webdav.C1118.m8517(r6, r0)
            java.lang.String r1 = m7513()
            r0 = 1616(0x650, float:2.264E-42)
        L21:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L27;
                case 49: goto L2a;
                case 204: goto L2f;
                case 239: goto L49;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L21
        L2a:
            if (r1 == 0) goto L27
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L21
        L2f:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = m7513()     // Catch: java.lang.Exception -> L46
            r0.<init>(r1)     // Catch: java.lang.Exception -> L46
            androidx.loader.C1095.m2548(r0)     // Catch: java.lang.Exception -> L46
            r0 = 1740(0x6cc, float:2.438E-42)
        L3d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L43;
                case 54: goto L47;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L3d
        L46:
            r0 = move-exception
        L47:
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioPath = r4
        L49:
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioUrl = r4
            int r1 = androidx.emoji2.C1080.m1552(r5)
            int r0 = androidx.documentfile.C1076.f102
            r2 = r0 ^ (-1770(0xfffffffffffff916, float:NaN))
            r0 = 1864(0x748, float:2.612E-42)
        L55:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5b;
                case 47384: goto L75;
                case 47417: goto L65;
                case 47483: goto L61;
                default: goto L5a;
            }
        L5a:
            goto L55
        L5b:
            if (r1 <= r2) goto L61
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L55
        L61:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L55
        L65:
            r0 = 0
            java.lang.String r5 = androidx.lifecycle.process.C1088.m2028(r5, r0, r2)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L6d:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L75;
                case 239: goto L82;
                default: goto L74;
            }
        L74:
            goto L6d
        L75:
            java.util.concurrent.ExecutorService r0 = m7507()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda27 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda27
            r1.<init>(r5, r6)
            androidx.activity.C1063.m244(r0, r1)
            return
        L82:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L6d
    }

    private static void pickAudioDirectory(android.app.Activity r5) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2f
            short[] r1 = m7514()     // Catch: java.lang.Throwable -> L2f
            r2 = 1530(0x5fa, float:2.144E-42)
            int r3 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L2f
            r3 = r3 ^ 726(0x2d6, float:1.017E-42)
            r4 = 2210(0x8a2, float:3.097E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1079.m1457(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            int r1 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L2f
            r1 = r1 ^ (-39)
            kevin.fun.hook.audio.C1117.m8143(r0, r1)     // Catch: java.lang.Throwable -> L2f
            int r1 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L2f
            r1 = r1 ^ (-9973(0xffffffffffffd90b, float:NaN))
            androidx.core.C1073.m1046(r5, r0, r1)     // Catch: java.lang.Throwable -> L2f
            r0 = 1616(0x650, float:2.264E-42)
        L25:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2b;
                case 49: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            return
        L2c:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L25
        L2f:
            r0 = move-exception
            short[] r0 = m7514()
            r1 = 1570(0x622, float:2.2E-42)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r2 = r2 ^ (-942(0xfffffffffffffc52, float:NaN))
            r3 = 720(0x2d0, float:1.009E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r1, r2, r3)
            m7474(r5, r0)
            goto L2b
    }

    private static void playTtsAudio(android.app.Activity r4, java.lang.String r5) {
            r1 = 0
            java.lang.String r3 = "ۧۨۦ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1750812: goto L2b;
                case 1754630: goto L1d;
                case 1754661: goto L24;
                case 1755555: goto L14;
                default: goto Lc;
            }
        Lc:
            android.os.Handler r1 = m7523()
            java.lang.String r3 = "ۨۦۡ"
            r2 = r1
            goto L5
        L14:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda34 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda34
            r0.<init>(r5, r4)
            java.lang.String r1 = "ۧۧۦ"
            r3 = r1
            goto L5
        L1d:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "ۣۨۡ"
            r3 = r1
            goto L5
        L24:
            m7535()
            java.lang.String r1 = "ۦۦۨ"
            r3 = r1
            goto L5
        L2b:
            return
    }

    private static void pollTtsResult(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, android.widget.TextView r14) {
            short[] r0 = m7514()
            r1 = 1578(0x62a, float:2.211E-42)
            int r2 = kevin.fun.hook.audio.C1116.f405
            r2 = r2 ^ 87
            r3 = 1598(0x63e, float:2.239E-42)
            java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r0, r1, r2, r3)
            short[] r0 = m7514()
            r1 = 1583(0x62f, float:2.218E-42)
            int r2 = androidx.vectordrawable.C1103.f129
            r2 = r2 ^ 266(0x10a, float:3.73E-43)
            r4 = 1947(0x79b, float:2.728E-42)
            java.lang.String r4 = androidx.appcompat.resources.C1068.m652(r0, r1, r2, r4)
            r5 = 60
            r0 = 0
        L23:
            r1 = 1616(0x650, float:2.264E-42)
        L25:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L2b;
                case 49: goto L2e;
                case 204: goto L33;
                case 239: goto L63;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L25
        L2e:
            if (r0 < r5) goto L2b
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L25
        L33:
            android.os.Handler r0 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda22 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda22
            r1.<init>(r14)
            androidx.activity.C1062.m178(r0, r1)
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1740(0x6cc, float:2.438E-42)
        L45:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4b;
                case 54: goto L50;
                case 471: goto L62;
                case 500: goto L53;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            if (r1 < 0) goto L50
            r0 = 1833(0x729, float:2.569E-42)
            goto L45
        L50:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L45
        L53:
            java.lang.String r0 = "9JsN02N0"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L62:
            return
        L63:
            int r1 = kevin.fun.hook.audio.C1115.f404
            long r6 = (long) r1
            r8 = 1790(0x6fe, double:8.844E-321)
            long r6 = r6 ^ r8
            androidx.vectordrawable.C1105.m3252(r6)     // Catch: java.lang.Exception -> L2e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e2
            r1.<init>()     // Catch: java.lang.Exception -> L2e2
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L2e2
            r6 = 1589(0x635, float:2.227E-42)
            int r7 = androidx.loader.C1097.f123     // Catch: java.lang.Exception -> L2e2
            r7 = r7 ^ 90
            r8 = 2238(0x8be, float:3.136E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1079.m1457(r2, r6, r7, r8)     // Catch: java.lang.Exception -> L2e2
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Exception -> L2e2
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r12)     // Catch: java.lang.Exception -> L2d2
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Exception -> L2d2
            java.lang.String r2 = m7521(r1, r13)     // Catch: java.lang.Exception -> L2d2
            r1 = 1864(0x748, float:2.612E-42)
        L93:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L99;
                case 47384: goto Lc6;
                case 47417: goto La3;
                case 47483: goto L9f;
                default: goto L98;
            }
        L98:
            goto L93
        L99:
            if (r2 != 0) goto L9f
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L93
        L9f:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L93
        La3:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        La6:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto Lae;
                case 239: goto Lc2;
                default: goto Lad;
            }
        Lad:
            goto La6
        Lae:
            int r1 = androidx.lifecycle.process.C1088.f114
            r1 = r1 ^ (-100)
            int r0 = r0 + r1
            r1 = 53634(0xd182, float:7.5157E-41)
        Lb6:
            r2 = 53651(0xd193, float:7.5181E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto Lbe;
                case 50: goto L23;
                default: goto Lbd;
            }
        Lbd:
            goto Lb6
        Lbe:
            r1 = 53665(0xd1a1, float:7.52E-41)
            goto Lb6
        Lc2:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto La6
        Lc6:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d2
            r6.<init>(r2)     // Catch: java.lang.Exception -> L2d2
            int r2 = androidx.vectordrawable.animated.C1102.m3071(r6, r4)     // Catch: java.lang.Exception -> L2d2
            r1 = 48891(0xbefb, float:6.8511E-41)
        Ld2:
            r7 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 22: goto Lda;
                case 53: goto L2c3;
                case 503: goto Lde;
                case 32495: goto Le6;
                default: goto Ld9;
            }     // Catch: java.lang.Exception -> L2d2
        Ld9:
            goto Ld2
        Lda:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto Ld2
        Lde:
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto Lda
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto Ld2
        Le6:
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2d2
            r2 = 1629(0x65d, float:2.283E-42)
            int r7 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Exception -> L2d2
            r7 = r7 ^ 264(0x108, float:3.7E-43)
            r8 = 528(0x210, float:7.4E-43)
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2213(r1, r2, r7, r8)     // Catch: java.lang.Exception -> L2d2
            org.json.JSONObject r2 = androidx.vectordrawable.C1105.m3254(r6, r1)     // Catch: java.lang.Exception -> L2d2
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2d2
            r6 = 1633(0x661, float:2.288E-42)
            int r7 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Exception -> L2d2
            r7 = r7 ^ 810(0x32a, float:1.135E-42)
            r8 = 2426(0x97a, float:3.4E-42)
            java.lang.String r1 = androidx.loader.C1099.m2843(r1, r6, r7, r8)     // Catch: java.lang.Exception -> L2d2
            org.json.JSONObject r6 = androidx.vectordrawable.C1105.m3254(r2, r1)     // Catch: java.lang.Exception -> L2d2
            boolean r7 = androidx.loader.C1097.m2717(r6, r3)     // Catch: java.lang.Exception -> L2d2
            r1 = 49666(0xc202, float:6.9597E-41)
        L115:
            r8 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 17: goto L11d;
                case 50: goto L123;
                case 76: goto L127;
                case 83: goto L2b4;
                default: goto L11c;
            }     // Catch: java.lang.Exception -> L2d2
        L11c:
            goto L115
        L11d:
            if (r7 == 0) goto L123
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L115
        L123:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L115
        L127:
            java.lang.String r7 = androidx.loader.C1096.m2683(r6, r3)     // Catch: java.lang.Exception -> L2d2
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2d2
            r8 = 1641(0x669, float:2.3E-42)
            int r9 = androidx.startup.C1100.f126     // Catch: java.lang.Exception -> L2d2
            r9 = r9 ^ (-274(0xfffffffffffffeee, float:NaN))
            r10 = 1905(0x771, float:2.67E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1086.m1920(r1, r8, r9, r10)     // Catch: java.lang.Exception -> L2d2
            boolean r8 = androidx.core.C1073.m1059(r7, r1)     // Catch: java.lang.Exception -> L2d2
            r1 = 49790(0xc27e, float:6.977E-41)
        L142:
            r9 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r9
            switch(r1) {
                case 18: goto L14a;
                case 51: goto L2a5;
                case 84: goto L154;
                case 241: goto L14e;
                default: goto L149;
            }     // Catch: java.lang.Exception -> L2d2
        L149:
            goto L142
        L14a:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto L142
        L14e:
            if (r8 == 0) goto L14a
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto L142
        L154:
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioUrl = r7     // Catch: java.lang.Exception -> L2d2
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2d2
            r8 = 1645(0x66d, float:2.305E-42)
            int r9 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Exception -> L2d2
            r9 = r9 ^ 64
            r10 = 1712(0x6b0, float:2.399E-42)
            java.lang.String r1 = androidx.interpolator.C1083.m1723(r1, r8, r9, r10)     // Catch: java.lang.Exception -> L2d2
            java.lang.String r1 = androidx.loader.C1096.m2683(r2, r1)     // Catch: java.lang.Exception -> L2d2
            short[] r8 = m7514()     // Catch: java.lang.Exception -> L2d2
            r9 = 1654(0x676, float:2.318E-42)
            int r10 = androidx.appcompat.C1069.f95     // Catch: java.lang.Exception -> L2d2
            r10 = r10 ^ (-230(0xffffffffffffff1a, float:NaN))
            r11 = 2959(0xb8f, float:4.146E-42)
            java.lang.String r8 = androidx.interpolator.C1081.m1616(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2d2
            java.lang.String r2 = androidx.loader.C1096.m2683(r2, r8)     // Catch: java.lang.Exception -> L2d2
            java.time.ZonedDateTime r1 = androidx.lifecycle.process.C1089.m2139(r1)     // Catch: java.lang.Exception -> L2d2
            java.time.ZonedDateTime r2 = androidx.lifecycle.process.C1089.m2139(r2)     // Catch: java.lang.Exception -> L2d2
            java.time.Duration r1 = androidx.loader.C1096.m2636(r1, r2)     // Catch: java.lang.Exception -> L2d2
            long r8 = androidx.interpolator.C1081.m1577(r1)     // Catch: java.lang.Exception -> L2d2
            kevin.fun.hook.VoiceAssistantHook.currentTtsDuration = r8     // Catch: java.lang.Exception -> L2d2
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L2d2
            r2 = 1663(0x67f, float:2.33E-42)
            int r8 = androidx.core.C1073.f99     // Catch: java.lang.Exception -> L2d2
            r8 = r8 ^ 439(0x1b7, float:6.15E-43)
            r9 = 2871(0xb37, float:4.023E-42)
            java.lang.String r1 = androidx.loader.C1099.m2843(r1, r2, r8, r9)     // Catch: java.lang.Exception -> L2d2
            org.json.JSONArray r1 = androidx.core.C1073.m1032(r6, r1)     // Catch: java.lang.Exception -> L2d2
            r2 = 0
            org.json.JSONObject r1 = androidx.vectordrawable.C1103.m3180(r1, r2)     // Catch: java.lang.Exception -> L26b
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L26b
            r6 = 1671(0x687, float:2.342E-42)
            int r8 = androidx.core.C1072.f98     // Catch: java.lang.Exception -> L26b
            r8 = r8 ^ (-537(0xfffffffffffffde7, float:NaN))
            r9 = 1624(0x658, float:2.276E-42)
            java.lang.String r2 = androidx.customview.C1075.m1138(r2, r6, r8, r9)     // Catch: java.lang.Exception -> L26b
            org.json.JSONObject r1 = androidx.vectordrawable.C1105.m3254(r1, r2)     // Catch: java.lang.Exception -> L26b
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L26b
            r6 = 1678(0x68e, float:2.351E-42)
            int r8 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Exception -> L26b
            r8 = r8 ^ 514(0x202, float:7.2E-43)
            r9 = 1212(0x4bc, float:1.698E-42)
            java.lang.String r2 = androidx.appcompat.C1069.m751(r2, r6, r8, r9)     // Catch: java.lang.Exception -> L26b
            r6 = 0
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3675(r1, r2, r6)     // Catch: java.lang.Exception -> L257
            kevin.fun.hook.VoiceAssistantHook.currentTtsCost = r1     // Catch: java.lang.Exception -> L257
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L257
            r2 = 1690(0x69a, float:2.368E-42)
            int r6 = androidx.interpolator.C1083.f109     // Catch: java.lang.Exception -> L257
            r6 = r6 ^ (-411(0xfffffffffffffe65, float:NaN))
            r8 = 1301(0x515, float:1.823E-42)
            java.lang.String r1 = org.luckypray.dexkit.C1123.m10510(r1, r2, r6, r8)     // Catch: java.lang.Exception -> L257
            java.lang.String r2 = m7521(r1, r13)     // Catch: java.lang.Exception -> L257
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L1eb:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 497: goto L1f3;
                case 1711: goto L1f9;
                case 1736: goto L252;
                case 1769: goto L1fd;
                default: goto L1f2;
            }     // Catch: java.lang.Exception -> L257
        L1f2:
            goto L1eb
        L1f3:
            if (r2 == 0) goto L1f9
            r1 = 50658(0xc5e2, float:7.0987E-41)
            goto L1eb
        L1f9:
            r1 = 50627(0xc5c3, float:7.0944E-41)
            goto L1eb
        L1fd:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L257
            r6.<init>(r2)     // Catch: java.lang.Exception -> L257
            int r2 = androidx.vectordrawable.animated.C1102.m3071(r6, r4)     // Catch: java.lang.Exception -> L257
            r1 = 50689(0xc601, float:7.103E-41)
        L209:
            r8 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 19: goto L211;
                case 45: goto L252;
                case 50: goto L219;
                case 76: goto L21d;
                default: goto L210;
            }     // Catch: java.lang.Exception -> L257
        L210:
            goto L209
        L211:
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L219
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto L209
        L219:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto L209
        L21d:
            short[] r1 = m7514()     // Catch: java.lang.Exception -> L257
            r2 = 1729(0x6c1, float:2.423E-42)
            int r8 = androidx.documentfile.C1076.f102     // Catch: java.lang.Exception -> L257
            r8 = r8 ^ (-606(0xfffffffffffffda2, float:NaN))
            r9 = 1575(0x627, float:2.207E-42)
            java.lang.String r1 = androidx.loader.C1094.m2495(r1, r2, r8, r9)     // Catch: java.lang.Exception -> L257
            org.json.JSONObject r1 = androidx.vectordrawable.C1105.m3254(r6, r1)     // Catch: java.lang.Exception -> L257
            short[] r2 = m7514()     // Catch: java.lang.Exception -> L257
            r6 = 1733(0x6c5, float:2.428E-42)
            int r8 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Exception -> L257
            r8 = r8 ^ 660(0x294, float:9.25E-43)
            r9 = 567(0x237, float:7.95E-43)
            java.lang.String r2 = kevin.fun.hook.audio.C1116.m8020(r2, r6, r8, r9)     // Catch: java.lang.Exception -> L257
            int r1 = androidx.vectordrawable.animated.C1102.m3071(r1, r2)     // Catch: java.lang.Exception -> L257
            kevin.fun.hook.VoiceAssistantHook.currentTtsRemaining = r1     // Catch: java.lang.Exception -> L257
            r1 = 50813(0xc67d, float:7.1204E-41)
        L24a:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L252;
                case 243: goto L267;
                default: goto L251;
            }     // Catch: java.lang.Exception -> L257
        L251:
            goto L24a
        L252:
            m7481(r7, r14)     // Catch: java.lang.Exception -> L257
            goto L62
        L257:
            r1 = move-exception
            r2 = 51588(0xc984, float:7.229E-41)
        L25b:
            r6 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L263;
                case 54: goto L277;
                default: goto L262;
            }
        L262:
            goto L25b
        L263:
            r2 = 51619(0xc9a3, float:7.2334E-41)
            goto L25b
        L267:
            r1 = 50844(0xc69c, float:7.1248E-41)
            goto L24a
        L26b:
            r1 = move-exception
            r2 = 51712(0xca00, float:7.2464E-41)
        L26f:
            r6 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 14: goto L277;
                case 15: goto L276;
                case 16: goto L276;
                case 17: goto L2a1;
                default: goto L276;
            }
        L276:
            goto L26f
        L277:
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r6 = m7514()
            r7 = 1740(0x6cc, float:2.438E-42)
            int r8 = androidx.loader.C1094.f120
            r8 = r8 ^ 377(0x179, float:5.28E-43)
            r9 = 425(0x1a9, float:5.96E-43)
            java.lang.String r6 = androidx.emoji2.C1080.m1525(r6, r7, r8, r9)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7537(r1)
            goto Lae
        L2a1:
            r2 = 51743(0xca1f, float:7.2507E-41)
            goto L26f
        L2a5:
            r1 = 51836(0xca7c, float:7.2638E-41)
        L2a8:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 241: goto L2b0;
                case 1963: goto Lae;
                default: goto L2af;
            }
        L2af:
            goto L2a8
        L2b0:
            r1 = 52518(0xcd26, float:7.3593E-41)
            goto L2a8
        L2b4:
            r1 = 52611(0xcd83, float:7.3724E-41)
        L2b7:
            r2 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 23: goto L2bf;
                case 54: goto Lae;
                default: goto L2be;
            }
        L2be:
            goto L2b7
        L2bf:
            r1 = 52642(0xcda2, float:7.3767E-41)
            goto L2b7
        L2c3:
            r1 = 52735(0xcdff, float:7.3897E-41)
        L2c6:
            r2 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto Lae;
                case 1007: goto L2ce;
                default: goto L2cd;
            }
        L2cd:
            goto L2c6
        L2ce:
            r1 = 52766(0xce1e, float:7.3941E-41)
            goto L2c6
        L2d2:
            r1 = move-exception
            r2 = 53510(0xd106, float:7.4983E-41)
        L2d6:
            r6 = 53527(0xd117, float:7.5007E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L2de;
                case 50: goto L277;
                default: goto L2dd;
            }
        L2dd:
            goto L2d6
        L2de:
            r2 = 53541(0xd125, float:7.5027E-41)
            goto L2d6
        L2e2:
            r1 = move-exception
            goto L277
    }

    private static void refreshAudioList(android.app.Activity r4) {
            java.lang.ref.WeakReference r1 = m7541()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L38;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference r0 = m7541()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L29;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
        L29:
            r1 = r0
        L2a:
            r0 = 1864(0x748, float:2.612E-42)
        L2c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L32;
                case 47384: goto Lbf;
                case 47417: goto L3f;
                case 47483: goto L3b;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            if (r1 == 0) goto L3b
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2c
        L38:
            r0 = 0
            r1 = r0
            goto L2a
        L3b:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2c
        L3f:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L42:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L4a;
                case 45: goto Lbf;
                case 76: goto L54;
                case 239: goto L4e;
                default: goto L49;
            }
        L49:
            goto L42
        L4a:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L42
        L4e:
            if (r4 == 0) goto L4a
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L42
        L54:
            boolean r2 = androidx.loader.C1098.m2818(r4)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L5b:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L63;
                case 53: goto L7c;
                case 503: goto L67;
                case 32495: goto L6d;
                default: goto L62;
            }
        L62:
            goto L5b
        L63:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L5b
        L67:
            if (r2 == 0) goto L63
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L5b
        L6d:
            r0 = 49666(0xc202, float:6.9597E-41)
        L70:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L78;
                case 50: goto Lbf;
                default: goto L77;
            }
        L77:
            goto L70
        L78:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L70
        L7c:
            android.widget.ListAdapter r0 = androidx.vectordrawable.C1103.m3138(r1)
            kevin.fun.hook.VoiceAssistantHook$AudioAdapter r0 = (kevin.fun.hook.VoiceAssistantHook.AudioAdapter) r0
            r2 = 49790(0xc27e, float:6.977E-41)
        L85:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L8d;
                case 51: goto L9a;
                case 84: goto L97;
                case 241: goto L91;
                default: goto L8c;
            }
        L8c:
            goto L85
        L8d:
            r2 = 49852(0xc2bc, float:6.9858E-41)
            goto L85
        L91:
            if (r0 == 0) goto L8d
            r2 = 49883(0xc2db, float:6.9901E-41)
            goto L85
        L97:
            m7540(r0)
        L9a:
            java.util.List r0 = m7498()
            boolean r2 = androidx.activity.C1064.m359(r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        La5:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 497: goto Lad;
                case 1711: goto Lb3;
                case 1736: goto Lbf;
                case 1769: goto Lb7;
                default: goto Lac;
            }
        Lac:
            goto La5
        Lad:
            if (r2 == 0) goto Lb3
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto La5
        Lb3:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto La5
        Lb7:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda2 r0 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda2
            r0.<init>(r1)
            m7495(r0)
        Lbf:
            return
    }

    private static void refreshTtsVoiceSpinner(android.content.Context r4) {
            java.lang.ref.WeakReference r1 = m7543()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L29;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference r0 = m7543()
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L2a;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
        L29:
            r0 = 0
        L2a:
            r1 = 1864(0x748, float:2.612E-42)
        L2c:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L32;
                case 47384: goto L56;
                case 47417: goto L3c;
                case 47483: goto L38;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            if (r0 != 0) goto L38
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L2c
        L38:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L2c
        L3c:
            boolean r2 = r4 instanceof android.app.Activity
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L41:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L49;
                case 45: goto L56;
                case 76: goto L53;
                case 239: goto L4d;
                default: goto L48;
            }
        L48:
            goto L41
        L49:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L41
        L4d:
            if (r2 == 0) goto L49
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L41
        L53:
            android.app.Activity r4 = (android.app.Activity) r4
            r0 = r4
        L56:
            r1 = 48891(0xbefb, float:6.8511E-41)
        L59:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L61;
                case 53: goto L6b;
                case 503: goto L65;
                case 32495: goto L77;
                default: goto L60;
            }
        L60:
            goto L59
        L61:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L59
        L65:
            if (r0 != 0) goto L61
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L59
        L6b:
            android.os.Handler r1 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda33 r2 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda33
            r2.<init>(r0)
            androidx.activity.C1062.m178(r1, r2)
        L77:
            return
    }

    private static void releaseMediaPlayer() {
            android.media.MediaPlayer r1 = m7546()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L4a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L46
            boolean r1 = androidx.lifecycle.livedata.C1084.m1768(r0)     // Catch: java.lang.Exception -> L46
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L33;
                case 500: goto L2c;
                default: goto L23;
            }     // Catch: java.lang.Exception -> L46
        L23:
            goto L1e
        L24:
            if (r1 == 0) goto L29
            r0 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L46
            androidx.customview.C1074.m1076(r0)     // Catch: java.lang.Exception -> L46
        L33:
            android.media.MediaPlayer r0 = m7546()     // Catch: java.lang.Exception -> L46
            androidx.core.C1073.m46(r0)     // Catch: java.lang.Exception -> L46
            r0 = 1864(0x748, float:2.612E-42)
        L3c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L42;
                case 47483: goto L47;
                default: goto L41;
            }
        L41:
            goto L3c
        L42:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3c
        L46:
            r0 = move-exception
        L47:
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.mediaPlayer = r0
        L4a:
            return
    }

    private static void releaseResources() {
            m7535()     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.selectedAudio = r0     // Catch: java.lang.Throwable -> L2f
            java.util.List r0 = m7498()     // Catch: java.lang.Throwable -> L2f
            androidx.core.C1072.m954(r0)     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.generatedAudioUrl = r0     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.currentTtsAudioPath = r0     // Catch: java.lang.Throwable -> L2f
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L2c;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L59;
                case 471: goto L6b;
                case 500: goto L5c;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 > 0) goto L59
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L15
        L2f:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1753(0x6d9, float:2.456E-42)
            int r4 = androidx.lifecycle.process.C1087.f113
            r4 = r4 ^ (-639(0xfffffffffffffd81, float:NaN))
            r5 = 2480(0x9b0, float:3.475E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1087.m2008(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            goto L1b
        L59:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L5c:
            java.lang.String r0 = "HxowXfJnrWsD6F"
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L6b:
            return
    }

    private static void saveTtsApiKey(android.content.Context r10, java.lang.String r11) {
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۢۢۥ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r8
            r9 = r8
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 56328: goto L3b;
                case 56385: goto L1e;
                case 1746935: goto L7e;
                case 1746968: goto L25;
                case 1748773: goto L72;
                case 1748829: goto L33;
                case 1748830: goto L2d;
                case 1749575: goto L60;
                case 1749669: goto L6c;
                case 1752610: goto L51;
                case 1753515: goto L43;
                case 1754534: goto L58;
                case 1755400: goto L49;
                case 1755621: goto L78;
                default: goto L12;
            }
        L12:
            r1 = 1770(0x6ea, float:2.48E-42)
            r4 = 3147(0xc4b, float:4.41E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r5, r1, r9, r4)
            java.lang.String r6 = "۟ۨۡ"
            r4 = r1
            goto Lb
        L1e:
            m7503(r10)
            java.lang.String r1 = "۟ۧ۟"
            r6 = r1
            goto Lb
        L25:
            android.content.SharedPreferences r1 = androidx.drawerlayout.C1077.m1322(r10, r4, r8)
            java.lang.String r6 = "ۡۦۢ"
            r3 = r1
            goto Lb
        L2d:
            int r7 = androidx.lifecycle.viewmodel.C1093.f119
            java.lang.String r1 = "ۨۨۥ"
            r6 = r1
            goto Lb
        L33:
            android.content.SharedPreferences$Editor r0 = androidx.emoji2.viewsintegration.C1078.m1386(r3)
            java.lang.String r1 = "ۣۧۤ"
            r6 = r1
            goto Lb
        L3b:
            android.content.SharedPreferences$Editor r1 = androidx.core.C1073.m986(r0, r4, r11)
            java.lang.String r6 = "ۥۤۡ"
            r2 = r1
            goto Lb
        L43:
            r9 = r7 ^ 770(0x302, float:1.079E-42)
            java.lang.String r1 = "ۡۨۡ"
            r6 = r1
            goto Lb
        L49:
            short[] r1 = m7514()
            java.lang.String r6 = "ۡۤۨ"
            r5 = r1
            goto Lb
        L51:
            androidx.vectordrawable.C1104.m3221(r2)
            java.lang.String r1 = "ۣۢ"
            r6 = r1
            goto Lb
        L58:
            short[] r1 = m7514()
            java.lang.String r6 = "ۡۦۣ"
            r5 = r1
            goto Lb
        L60:
            r1 = 1785(0x6f9, float:2.501E-42)
            r4 = 978(0x3d2, float:1.37E-42)
            java.lang.String r1 = androidx.loader.C1099.m2843(r5, r1, r9, r4)
            java.lang.String r6 = "۠ۨ"
            r4 = r1
            goto Lb
        L6c:
            kevin.fun.hook.VoiceAssistantHook.ttsApiKey = r11
            java.lang.String r1 = "ۨۡۡ"
            r6 = r1
            goto Lb
        L72:
            int r7 = androidx.lifecycle.livedata.C1085.f111
            java.lang.String r1 = "ۦۢۧ"
            r6 = r1
            goto Lb
        L78:
            r9 = r7 ^ (-127(0xffffffffffffff81, float:NaN))
            java.lang.String r1 = "ۢ۟ۤ"
            r6 = r1
            goto Lb
        L7e:
            return
    }

    private static void scanAudiosAsync(java.lang.Runnable r2) {
            java.util.concurrent.ExecutorService r0 = m7507()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda11 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda11
            r1.<init>(r2)
            androidx.activity.C1063.m244(r0, r1)
            return
    }

    private static void scanDocumentTree(androidx.documentfile.provider.DocumentFile r10, java.util.List<kevin.fun.hook.VoiceAssistantHook.AudioItem> r11) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L144;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r10 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            boolean r1 = androidx.activity.C1065.m417(r10)
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L30;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 != 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            r0 = 1864(0x748, float:2.612E-42)
        L26:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2c;
                case 47483: goto L144;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            androidx.documentfile.provider.DocumentFile[] r2 = androidx.appcompat.C1069.m763(r10)
            int r3 = r2.length
            r0 = 0
        L36:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L39:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 14: goto L41;
                case 45: goto L4b;
                case 76: goto L16c;
                case 239: goto L45;
                default: goto L40;
            }
        L40:
            goto L39
        L41:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L39
        L45:
            if (r0 < r3) goto L41
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L39
        L4b:
            r4 = r2[r0]
            boolean r5 = androidx.activity.C1065.m417(r4)
            r1 = 48891(0xbefb, float:6.8511E-41)
        L54:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 22: goto L5c;
                case 53: goto L78;
                case 503: goto L60;
                case 32495: goto L66;
                default: goto L5b;
            }
        L5b:
            goto L54
        L5c:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L54
        L60:
            if (r5 == 0) goto L5c
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L54
        L66:
            m7478(r4, r11)
            r1 = 49666(0xc202, float:6.9597E-41)
        L6c:
            r4 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 17: goto L74;
                case 50: goto L130;
                default: goto L73;
            }
        L73:
            goto L6c
        L74:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L6c
        L78:
            java.lang.String r5 = androidx.core.C1073.m985(r4)
            r1 = 49790(0xc27e, float:6.977E-41)
        L7f:
            r6 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 18: goto L87;
                case 51: goto La0;
                case 84: goto L91;
                case 241: goto L8b;
                default: goto L86;
            }
        L86:
            goto L7f
        L87:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto L7f
        L8b:
            if (r5 != 0) goto L87
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto L7f
        L91:
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L94:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 497: goto L9c;
                case 1711: goto L130;
                default: goto L9b;
            }
        L9b:
            goto L94
        L9c:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L94
        La0:
            java.lang.String r6 = androidx.appcompat.resources.C1068.m696(r5)
            short[] r1 = m7514()
            r7 = 1796(0x704, float:2.517E-42)
            int r8 = androidx.lifecycle.process.C1087.f113
            r8 = r8 ^ (-620(0xfffffffffffffd94, float:NaN))
            r9 = 2502(0x9c6, float:3.506E-42)
            java.lang.String r1 = androidx.loader.C1098.m2787(r1, r7, r8, r9)
            boolean r7 = androidx.activity.C1064.m311(r6, r1)
            r1 = 50689(0xc601, float:7.103E-41)
        Lbb:
            r8 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 19: goto Lc3;
                case 45: goto L11f;
                case 50: goto Lc9;
                case 76: goto Lcd;
                default: goto Lc2;
            }
        Lc2:
            goto Lbb
        Lc3:
            if (r7 != 0) goto Lc9
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto Lbb
        Lc9:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto Lbb
        Lcd:
            short[] r1 = m7514()
            r7 = 1800(0x708, float:2.522E-42)
            int r8 = androidx.activity.C1066.f92
            r8 = r8 ^ 817(0x331, float:1.145E-42)
            r9 = 537(0x219, float:7.52E-43)
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2229(r1, r7, r8, r9)
            boolean r7 = androidx.activity.C1064.m311(r6, r1)
            r1 = 50813(0xc67d, float:7.1204E-41)
        Le4:
            r8 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 18: goto Lec;
                case 53: goto L11f;
                case 243: goto Lf0;
                case 4075: goto Lf6;
                default: goto Leb;
            }
        Leb:
            goto Le4
        Lec:
            r1 = 50875(0xc6bb, float:7.1291E-41)
            goto Le4
        Lf0:
            if (r7 != 0) goto Lec
            r1 = 51557(0xc965, float:7.2247E-41)
            goto Le4
        Lf6:
            short[] r1 = m7514()
            r7 = 1804(0x70c, float:2.528E-42)
            int r8 = androidx.emoji2.viewsintegration.C1078.f104
            r8 = r8 ^ 611(0x263, float:8.56E-43)
            r9 = 1693(0x69d, float:2.372E-42)
            java.lang.String r1 = androidx.appcompat.C1069.m751(r1, r7, r8, r9)
            boolean r6 = androidx.activity.C1064.m311(r6, r1)
            r1 = 51588(0xc984, float:7.229E-41)
        L10d:
            r7 = 51605(0xc995, float:7.2314E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 17: goto L115;
                case 54: goto L11b;
                case 87: goto L130;
                case 116: goto L11f;
                default: goto L114;
            }
        L114:
            goto L10d
        L115:
            if (r6 == 0) goto L11b
            r1 = 51681(0xc9e1, float:7.242E-41)
            goto L10d
        L11b:
            r1 = 51650(0xc9c2, float:7.2377E-41)
            goto L10d
        L11f:
            kevin.fun.hook.VoiceAssistantHook$AudioItem r1 = new kevin.fun.hook.VoiceAssistantHook$AudioItem
            r6 = 0
            r1.<init>(r6)
            r1.name = r5
            android.net.Uri r4 = androidx.annotation.experimental.C1067.m543(r4)
            r1.uri = r4
            androidx.emoji2.viewsintegration.C1078.m1429(r11, r1)
        L130:
            int r1 = androidx.loader.C1099.f125
            r1 = r1 ^ 858(0x35a, float:1.202E-42)
            int r0 = r0 + r1
            r1 = 51712(0xca00, float:7.2464E-41)
        L138:
            r4 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 14: goto L36;
                case 15: goto L13f;
                case 16: goto L13f;
                case 17: goto L140;
                default: goto L13f;
            }
        L13f:
            goto L138
        L140:
            r1 = 51743(0xca1f, float:7.2507E-41)
            goto L138
        L144:
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 51836(0xca7c, float:7.2638E-41)
        L14b:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 241: goto L153;
                case 1963: goto L159;
                case 1992: goto L16c;
                case 2025: goto L15d;
                default: goto L152;
            }
        L152:
            goto L14b
        L153:
            if (r1 < 0) goto L159
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L14b
        L159:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L14b
        L15d:
            java.lang.String r0 = "uOo35m8wuZezvag4M"
            java.lang.String r0 = androidx.core.C1073.m1027(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L16c:
            return
    }

    public static void setOnReplaceCompleteCallback(java.lang.Runnable r0) {
            kevin.fun.hook.VoiceAssistantHook.onReplaceCompleteCallback = r0
            return
    }

    private static void setTabActive(android.widget.TextView r3, boolean r4) {
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 1103626240(0x41c80000, float:25.0)
            androidx.lifecycle.process.C1091.m2252(r2, r0)
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L28;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r4 == 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            r0 = -14575885(0xffffffffff2196f3, float:-2.1478948E38)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L25;
                case 54: goto L2b;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1f
        L28:
            r0 = -986896(0xfffffffffff0f0f0, float:NaN)
        L2b:
            androidx.lifecycle.livedata.C1085.m1879(r2, r0)
            androidx.core.C1073.m999(r3, r2)
            r0 = 1864(0x748, float:2.612E-42)
        L33:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L39;
                case 47384: goto L69;
                case 47417: goto L43;
                case 47483: goto L3f;
                default: goto L38;
            }
        L38:
            goto L33
        L39:
            if (r4 == 0) goto L3f
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L33
        L3f:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L33
        L43:
            r0 = -1
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L47:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L4f;
                case 239: goto L65;
                default: goto L4e;
            }
        L4e:
            goto L47
        L4f:
            kevin.fun.hook.webdav.C1118.m8517(r3, r0)
            int r1 = androidx.viewpager.C1108.m3542()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L59:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L61;
                case 53: goto L7e;
                case 503: goto L6d;
                case 32495: goto L73;
                default: goto L60;
            }
        L60:
            goto L59
        L61:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L59
        L65:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L47
        L69:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            goto L4f
        L6d:
            if (r1 < 0) goto L61
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L59
        L73:
            java.lang.String r0 = "LvV4aWEkdWX87NJ16cSoN"
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L7e:
            return
    }

    private static void showConfigDialog(android.app.Activity r30) {
            r6 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = 0
            r15 = 0
            r17 = 0
            r16 = 0
            r5 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r11 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = 0
            r4 = 0
            r12 = 0
            r26 = 0
            r7 = 0
            java.lang.String r18 = "ۣ۠۟"
        L20:
            int r18 = kevin.fun.hook.audio.C1114.m7934(r18)
            switch(r18) {
                case 56416: goto L24f;
                case 56572: goto L3fe;
                case 1746909: goto Le2;
                case 1746940: goto L2a0;
                case 1747679: goto L6d;
                case 1747749: goto L475;
                case 1747868: goto Lba;
                case 1748680: goto L146;
                case 1748704: goto L3a1;
                case 1748858: goto L282;
                case 1749576: goto L16d;
                case 1749639: goto L20e;
                case 1749852: goto L90;
                case 1750562: goto L317;
                case 1751622: goto L1ef;
                case 1751647: goto L4a;
                case 1752461: goto L1be;
                case 1752462: goto L193;
                case 1752583: goto L236;
                case 1753452: goto L2e9;
                case 1753509: goto L42a;
                case 1753600: goto L1e0;
                case 1753640: goto L2bf;
                case 1754531: goto L351;
                case 1754656: goto L36f;
                case 1755338: goto L11c;
                case 1755616: goto L3c7;
                default: goto L27;
            }
        L27:
            androidx.lifecycle.process.C1087.m1946(r15, r16)
            r18 = 1094713344(0x41400000, float:12.0)
            r0 = r18
            androidx.vectordrawable.animated.C1102.m3105(r15, r0)
            int r24 = androidx.lifecycle.process.C1090.f116
            r18 = 12302868(0xbbba14, float:1.723999E-38)
            r22 = r18 ^ r24
            r0 = r22
            kevin.fun.hook.webdav.C1118.m8517(r15, r0)
            r18 = 1097859072(0x41700000, float:15.0)
            r0 = r30
            r1 = r18
            int r23 = m7476(r0, r1)
            java.lang.String r18 = "ۢۡۦ"
            goto L20
        L4a:
            r23 = r21 ^ (-104(0xffffffffffffff98, float:NaN))
            r14 = 1868(0x74c, float:2.618E-42)
            r16 = 2062(0x80e, float:2.89E-42)
            r0 = r17
            r1 = r23
            r2 = r16
            java.lang.String r16 = androidx.startup.C1101.m3014(r0, r14, r1, r2)
            r0 = r16
            androidx.interpolator.C1082.m53(r10, r0)
            int r22 = androidx.interpolator.C1081.f107
            r14 = 11751847(0xb351a7, float:1.6467845E-38)
            r24 = r14 ^ r22
            android.graphics.drawable.Drawable r14 = m7496(r24)
            java.lang.String r18 = "۠۠۟"
            goto L20
        L6d:
            androidx.activity.C1063.m290(r10, r14)
            int r19 = androidx.loader.C1097.f123
            r20 = r19 ^ (-115(0xffffffffffffff8d, float:NaN))
            r0 = r20
            androidx.lifecycle.livedata.C1084.m1743(r10, r0)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r21 = m7476(r0, r1)
            r18 = 1090519040(0x41000000, float:8.0)
            r0 = r30
            r1 = r18
            int r23 = m7476(r0, r1)
            java.lang.String r18 = "ۦۢۡ"
            goto L20
        L90:
            androidx.activity.C1064.m372(r6, r15)
            android.widget.TextView r15 = new android.widget.TextView
            r0 = r30
            r15.<init>(r0)
            short[] r17 = m7514()
            int r22 = org.luckypray.dexkit.C1125.f435
            r0 = r22
            r0 = r0 ^ (-235(0xffffffffffffff15, float:NaN))
            r23 = r0
            r16 = 1816(0x718, float:2.545E-42)
            r18 = 2945(0xb81, float:4.127E-42)
            r0 = r17
            r1 = r16
            r2 = r23
            r3 = r18
            java.lang.String r16 = androidx.vectordrawable.C1103.m3132(r0, r1, r2, r3)
            java.lang.String r18 = "ۣۨ۠"
            goto L20
        Lba:
            r0 = r23
            r0 = r0 ^ 382(0x17e, float:5.35E-43)
            r24 = r0
            r14 = 1824(0x720, float:2.556E-42)
            r16 = 1900(0x76c, float:2.662E-42)
            r0 = r17
            r1 = r24
            r2 = r16
            java.lang.String r14 = androidx.vectordrawable.C1104.m3232(r0, r14, r1, r2)
            androidx.lifecycle.process.C1090.m2215(r5, r14)
            java.lang.String r16 = m7502()
            r0 = r16
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3825(r5, r0)
            android.graphics.drawable.Drawable r14 = m7524(r30)
            java.lang.String r18 = "۟ۦۤ"
            goto L20
        Le2:
            androidx.vectordrawable.animated.C1102.m3095(r5, r14)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r30
            r1 = r18
            int r23 = m7476(r0, r1)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r30
            r1 = r18
            int r24 = m7476(r0, r1)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r30
            r1 = r18
            int r20 = m7476(r0, r1)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r30
            r1 = r18
            int r21 = m7476(r0, r1)
            r0 = r23
            r1 = r24
            r2 = r20
            r3 = r21
            kevin.fun.hook.audio.C1117.m8119(r5, r0, r1, r2, r3)
            java.lang.String r18 = "ۦ۠ۦ"
            goto L20
        L11c:
            short[] r17 = m7514()
            int r21 = androidx.documentfile.C1076.f102
            r0 = r21
            r0 = r0 ^ (-599(0xfffffffffffffda9, float:NaN))
            r23 = r0
            r16 = 1853(0x73d, float:2.597E-42)
            r18 = 2637(0xa4d, float:3.695E-42)
            r0 = r17
            r1 = r16
            r2 = r23
            r3 = r18
            java.lang.String r16 = androidx.customview.C1075.m1138(r0, r1, r2, r3)
            androidx.lifecycle.process.C1087.m1946(r15, r16)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r18
            androidx.vectordrawable.animated.C1102.m3105(r15, r0)
            java.lang.String r18 = "۟ۧۤ"
            goto L20
        L146:
            r24 = r23 ^ (-110(0xffffffffffffff92, float:NaN))
            r16 = 1838(0x72e, float:2.576E-42)
            r18 = 3192(0xc78, float:4.473E-42)
            r0 = r17
            r1 = r16
            r2 = r24
            r3 = r18
            java.lang.String r16 = androidx.core.ktx.C1071.m874(r0, r1, r2, r3)
            r0 = r16
            androidx.lifecycle.process.C1087.m1946(r8, r0)
            int r20 = kevin.fun.hook.webdav.C1118.f417
            r18 = 14575718(0xde6866, float:2.0424931E-38)
            r21 = r18 ^ r20
            r0 = r21
            kevin.fun.hook.webdav.C1118.m8517(r8, r0)
            java.lang.String r18 = "ۡۧ۠"
            goto L20
        L16d:
            android.app.Dialog r4 = new android.app.Dialog
            r0 = r30
            r4.<init>(r0)
            r12 = 1
            androidx.viewpager.C1108.m3505(r4, r12)
            androidx.viewpager.C1108.m3545(r4, r6)
            android.view.Window r12 = androidx.lifecycle.process.C1089.m2157(r4)
            android.graphics.drawable.ColorDrawable r18 = new android.graphics.drawable.ColorDrawable
            r25 = 0
            r0 = r18
            r1 = r25
            r0.<init>(r1)
            r0 = r18
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3804(r12, r0)
            java.lang.String r18 = "۠ۢۧ"
            goto L20
        L193:
            r10 = 0
            androidx.customview.C1074.m1119(r11, r10)
            r10 = 1097859072(0x41700000, float:15.0)
            r0 = r30
            int r20 = m7476(r0, r10)
            r10 = 0
            r17 = 0
            r18 = 0
            r0 = r20
            r1 = r17
            r2 = r18
            androidx.drawerlayout.C1077.m1314(r11, r10, r0, r1, r2)
            android.widget.Button r10 = new android.widget.Button
            r0 = r30
            r10.<init>(r0)
            short[] r17 = m7514()
            int r21 = androidx.customview.C1075.f101
            java.lang.String r18 = "ۤۤ۟"
            goto L20
        L1be:
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda23 r18 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda23
            r0 = r18
            r1 = r30
            r0.<init>(r1)
            r0 = r18
            androidx.lifecycle.livedata.C1086.m1916(r8, r0)
            androidx.activity.C1064.m372(r11, r15)
            androidx.activity.C1064.m372(r11, r8)
            androidx.activity.C1064.m372(r6, r11)
            android.widget.TextView r15 = new android.widget.TextView
            r0 = r30
            r15.<init>(r0)
            java.lang.String r18 = "ۨ۟ۡ"
            goto L20
        L1e0:
            androidx.lifecycle.viewmodel.C1093.m2380(r10, r7)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda25 r5 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda25
            r5.<init>(r4)
            androidx.lifecycle.viewmodel.C1093.m2380(r9, r5)
            kevin.fun.hook.audio.C1114.m7909(r4)
            return
        L1ef:
            r0 = r26
            int r0 = (int) r0
            r19 = r0
            int r20 = androidx.emoji2.C1080.f106
            r0 = r20
            r0 = r0 ^ (-377(0xfffffffffffffe87, float:NaN))
            r21 = r0
            r0 = r19
            r1 = r21
            androidx.startup.C1101.m3028(r12, r0, r1)
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda24 r7 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda24
            r0 = r30
            r7.<init>(r5, r0, r4)
            java.lang.String r18 = "ۦۥ۟"
            goto L20
        L20e:
            r5 = 1084227584(0x40a00000, float:5.0)
            r0 = r30
            int r24 = m7476(r0, r5)
            r5 = 0
            r17 = 0
            r0 = r23
            r1 = r17
            r2 = r24
            kevin.fun.hook.audio.C1117.m8126(r15, r5, r0, r1, r2)
            androidx.activity.C1064.m372(r6, r15)
            android.widget.EditText r5 = new android.widget.EditText
            r0 = r30
            r5.<init>(r0)
            short[] r17 = m7514()
            int r23 = androidx.loader.C1094.f120
            java.lang.String r18 = "۠ۦۢ"
            goto L20
        L236:
            r0 = r16
            androidx.interpolator.C1082.m53(r9, r0)
            int r23 = androidx.customview.C1075.f101
            r14 = 6381828(0x616104, float:8.942846E-39)
            r22 = r14 ^ r23
            android.graphics.drawable.Drawable r14 = m7496(r22)
            androidx.activity.C1063.m290(r9, r14)
            int r24 = kevin.fun.hook.C1120.f419
            java.lang.String r18 = "ۨۨ۠"
            goto L20
        L24f:
            r15 = 0
            r16 = 0
            r0 = r23
            r1 = r16
            r2 = r24
            androidx.drawerlayout.C1077.m1314(r11, r15, r0, r1, r2)
            android.widget.TextView r15 = new android.widget.TextView
            r0 = r30
            r15.<init>(r0)
            short[] r17 = m7514()
            int r20 = androidx.vectordrawable.animated.C1102.f128
            r0 = r20
            r0 = r0 ^ 199(0xc7, float:2.79E-43)
            r21 = r0
            r16 = 1834(0x72a, float:2.57E-42)
            r18 = 2301(0x8fd, float:3.224E-42)
            r0 = r17
            r1 = r16
            r2 = r21
            r3 = r18
            java.lang.String r16 = org.luckypray.dexkit.C1125.m10615(r0, r1, r2, r3)
            java.lang.String r18 = "ۧۤ۠"
            goto L20
        L282:
            r18 = 1094713344(0x41400000, float:12.0)
            r0 = r18
            androidx.vectordrawable.animated.C1102.m3105(r8, r0)
            int r22 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3681(r8)
            int r23 = androidx.interpolator.C1083.f109
            r0 = r23
            r0 = r0 ^ (-438(0xfffffffffffffe4a, float:NaN))
            r24 = r0
            r20 = r22 | r24
            r0 = r20
            kevin.fun.hook.webdav.C1118.m8523(r8, r0)
            java.lang.String r18 = "ۥ۟ۧ"
            goto L20
        L2a0:
            int r22 = androidx.lifecycle.viewmodel.C1093.f119
            r11 = 7829250(0x777702, float:1.0971116E-38)
            r24 = r11 ^ r22
            r0 = r24
            kevin.fun.hook.webdav.C1118.m8517(r15, r0)
            r0 = r19
            androidx.documentfile.C1076.m1233(r15, r0)
            androidx.activity.C1064.m372(r6, r15)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r0 = r30
            r11.<init>(r0)
            java.lang.String r18 = "ۥ۟ۨ"
            goto L20
        L2bf:
            androidx.vectordrawable.C1104.m3200(r10, r13)
            android.widget.Button r9 = new android.widget.Button
            r0 = r30
            r9.<init>(r0)
            short[] r17 = m7514()
            int r20 = kevin.fun.hook.webdav.C1118.f417
            r0 = r20
            r0 = r0 ^ (-361(0xfffffffffffffe97, float:NaN))
            r21 = r0
            r16 = 1870(0x74e, float:2.62E-42)
            r18 = 584(0x248, float:8.18E-43)
            r0 = r17
            r1 = r16
            r2 = r21
            r3 = r18
            java.lang.String r16 = androidx.loader.C1094.m2495(r0, r1, r2, r3)
            java.lang.String r18 = "ۥۣۥ"
            goto L20
        L2e9:
            androidx.activity.C1064.m372(r6, r5)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r0 = r30
            r11.<init>(r0)
            r18 = 0
            r0 = r18
            androidx.customview.C1074.m1119(r11, r0)
            r0 = r19
            androidx.emoji2.C1080.m1542(r11, r0)
            r18 = 1097859072(0x41700000, float:15.0)
            r0 = r30
            r1 = r18
            int r23 = m7476(r0, r1)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r30
            r1 = r18
            int r24 = m7476(r0, r1)
            java.lang.String r18 = "ۣۣ"
            goto L20
        L317:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r0 = r30
            r6.<init>(r0)
            r18 = 1
            r0 = r18
            androidx.customview.C1074.m1119(r6, r0)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r22 = m7476(r0, r1)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r23 = m7476(r0, r1)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r24 = m7476(r0, r1)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r19 = m7476(r0, r1)
            java.lang.String r18 = "ۧۨۡ"
            goto L20
        L351:
            androidx.lifecycle.process.C1087.m1946(r15, r16)
            r0 = r22
            kevin.fun.hook.webdav.C1118.m8517(r15, r0)
            r8 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r15, r8)
            android.widget.TextView r8 = new android.widget.TextView
            r0 = r30
            r8.<init>(r0)
            short[] r17 = m7514()
            int r23 = androidx.lifecycle.process.C1088.f114
            java.lang.String r18 = "ۡۡۨ"
            goto L20
        L36f:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r19
            androidx.drawerlayout.C1077.m1314(r6, r0, r1, r2, r3)
            android.widget.TextView r15 = new android.widget.TextView
            r0 = r30
            r15.<init>(r0)
            short[] r17 = m7514()
            int r22 = androidx.emoji2.C1080.f106
            r0 = r22
            r0 = r0 ^ 369(0x171, float:5.17E-43)
            r23 = r0
            r16 = 1808(0x710, float:2.534E-42)
            r18 = 3243(0xcab, float:4.544E-42)
            r0 = r17
            r1 = r16
            r2 = r23
            r3 = r18
            java.lang.String r16 = androidx.interpolator.C1082.m1694(r0, r1, r2, r3)
            java.lang.String r18 = "ۡۢۡ"
            goto L20
        L3a1:
            androidx.lifecycle.process.C1087.m1946(r15, r16)
            r18 = 1098907648(0x41800000, float:16.0)
            r0 = r18
            androidx.vectordrawable.animated.C1102.m3105(r15, r0)
            r18 = 0
            r19 = 1
            r0 = r18
            r1 = r19
            androidx.lifecycle.livedata.C1085.m1833(r15, r0, r1)
            int r24 = androidx.appcompat.resources.C1068.f94
            r0 = r24
            r0 = r0 ^ 543(0x21f, float:7.61E-43)
            r19 = r0
            r0 = r19
            androidx.documentfile.C1076.m1233(r15, r0)
            java.lang.String r18 = "ۢۨۢ"
            goto L20
        L3c7:
            r0 = r24
            r0 = r0 ^ 452(0x1c4, float:6.33E-43)
            r19 = r0
            r0 = r19
            androidx.lifecycle.livedata.C1084.m1743(r9, r0)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r20 = m7476(r0, r1)
            r18 = 1090519040(0x41000000, float:8.0)
            r0 = r30
            r1 = r18
            int r21 = m7476(r0, r1)
            r18 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            r1 = r18
            int r23 = m7476(r0, r1)
            r18 = 1090519040(0x41000000, float:8.0)
            r0 = r30
            r1 = r18
            int r22 = m7476(r0, r1)
            java.lang.String r18 = "ۨۤ"
            goto L20
        L3fe:
            r0 = r20
            r1 = r21
            r2 = r23
            r3 = r22
            androidx.versionedparcelable.C1106.m3380(r9, r0, r1, r2, r3)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r18 = 0
            r25 = -2
            r28 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            r1 = r25
            r2 = r28
            r13.<init>(r0, r1, r2)
            androidx.vectordrawable.C1104.m3200(r9, r13)
            androidx.activity.C1064.m372(r11, r10)
            androidx.activity.C1064.m372(r11, r9)
            androidx.activity.C1064.m372(r6, r11)
            java.lang.String r18 = "ۢ۟ۥ"
            goto L20
        L42a:
            r13 = 1101004800(0x41a00000, float:20.0)
            r0 = r30
            int r22 = m7476(r0, r13)
            r13 = 1090519040(0x41000000, float:8.0)
            r0 = r30
            int r24 = m7476(r0, r13)
            r0 = r21
            r1 = r23
            r2 = r22
            r3 = r24
            androidx.versionedparcelable.C1106.m3380(r10, r0, r1, r2, r3)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r18 = 0
            r19 = -2
            r25 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            r1 = r19
            r2 = r25
            r13.<init>(r0, r1, r2)
            r18 = 1092616192(0x41200000, float:10.0)
            r0 = r30
            r1 = r18
            int r19 = m7476(r0, r1)
            r18 = 0
            r25 = 0
            r28 = 0
            r0 = r18
            r1 = r25
            r2 = r19
            r3 = r28
            androidx.vectordrawable.animated.C1102.m3125(r13, r0, r1, r2, r3)
            java.lang.String r18 = "ۦۦۨ"
            goto L20
        L475:
            android.view.Window r12 = androidx.lifecycle.process.C1089.m2157(r4)
            android.content.res.Resources r18 = androidx.versionedparcelable.C1106.m3362(r30)
            android.util.DisplayMetrics r18 = androidx.activity.C1062.m159(r18)
            int r24 = androidx.interpolator.C1081.m1611(r18)
            r0 = r24
            double r0 = (double) r0
            r26 = r0
            r28 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r26 = r26 * r28
            java.lang.String r18 = "ۣۤۥ"
            goto L20
    }

    public static void showDialog(android.content.Context r4) {
            short[] r0 = m7514()
            r1 = 1872(0x750, float:2.623E-42)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-1018(0xfffffffffffffc06, float:NaN))
            r3 = 3209(0xc89, float:4.497E-42)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r2, r3)
            androidx.lifecycle.process.C1087.m1982(r4, r0)
            int r1 = androidx.activity.C1063.m300()
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L36;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r1 > 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            java.lang.String r0 = "J4Q4nIhr97cXG8dCgmSYDFsLTC5O"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }

    public static void showDialog(android.content.Context r4, java.lang.String r5) {
            boolean r1 = m7492()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 != 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            com.tencent.mmkv.C1109.m3572(r4)
        L17:
            r0 = 1740(0x6cc, float:2.438E-42)
        L19:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1f;
                case 54: goto L24;
                case 471: goto L3b;
                case 500: goto L27;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            if (r4 != 0) goto L24
            r0 = 1833(0x729, float:2.569E-42)
            goto L19
        L24:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L19
        L27:
            short[] r0 = m7514()
            r1 = 1930(0x78a, float:2.705E-42)
            int r2 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ 9
            r3 = 1825(0x721, float:2.557E-42)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r1, r2, r3)
            m7537(r0)
        L3a:
            return
        L3b:
            boolean r1 = r4 instanceof android.app.Activity
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47384: goto L59;
                case 47417: goto L4f;
                case 47483: goto L4b;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            if (r1 == 0) goto L4b
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3f
        L4b:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3f
        L4f:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            r1.<init>(r0)
            kevin.fun.hook.VoiceAssistantHook.currentActivityRef = r1
        L59:
            kevin.fun.hook.VoiceAssistantHook.targetReplaceDir = r5
            android.os.Looper r1 = androidx.annotation.experimental.C1067.m595()
            android.os.Looper r2 = androidx.lifecycle.process.C1089.m2150()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L66:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L6e;
                case 45: goto L9f;
                case 76: goto L78;
                case 239: goto L72;
                default: goto L6d;
            }
        L6d:
            goto L66
        L6e:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L66
        L72:
            if (r1 != r2) goto L6e
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L66
        L78:
            m7545(r4)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7e:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L86;
                case 503: goto L9b;
                default: goto L85;
            }
        L85:
            goto L7e
        L86:
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 49666(0xc202, float:6.9597E-41)
        L8d:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L95;
                case 50: goto Lac;
                case 76: goto Lb0;
                case 83: goto L3a;
                default: goto L94;
            }
        L94:
            goto L8d
        L95:
            if (r1 < 0) goto Lac
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L8d
        L9b:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L7e
        L9f:
            android.os.Handler r0 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda36 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda36
            r1.<init>(r4)
            androidx.activity.C1062.m178(r0, r1)
            goto L86
        Lac:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L8d
        Lb0:
            java.lang.String r0 = "Tkzi77iVYJ9qlbxcuOBZfVZr5vx"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L3a
    }

    private static void showDialogInternal(android.content.Context r6) {
            java.lang.ref.WeakReference r1 = m7487()     // Catch: java.lang.Exception -> Lc9
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L5d;
                default: goto Lb;
            }     // Catch: java.lang.Exception -> Lc9
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference r0 = m7487()     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r1 = kevin.fun.hook.audio.C1116.m8047(r0)     // Catch: java.lang.Exception -> Lc9
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L5d;
                case 500: goto L2c;
                default: goto L23;
            }     // Catch: java.lang.Exception -> Lc9
        L23:
            goto L1e
        L24:
            if (r1 == 0) goto L29
            r0 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            java.lang.ref.WeakReference r0 = m7487()     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)     // Catch: java.lang.Exception -> Lc9
            android.app.Dialog r0 = (android.app.Dialog) r0     // Catch: java.lang.Exception -> Lc9
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)     // Catch: java.lang.Exception -> Lc9
            r0 = 1864(0x748, float:2.612E-42)
        L3c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L42;
                case 47384: goto L5d;
                case 47417: goto L4c;
                case 47483: goto L48;
                default: goto L41;
            }     // Catch: java.lang.Exception -> Lc9
        L41:
            goto L3c
        L42:
            if (r1 == 0) goto L48
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3c
        L48:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3c
        L4c:
            java.lang.ref.WeakReference r0 = m7487()     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r0)     // Catch: java.lang.Exception -> Lc9
            android.app.Dialog r0 = (android.app.Dialog) r0     // Catch: java.lang.Exception -> Lc9
            androidx.customview.C1074.m1118(r0)     // Catch: java.lang.Exception -> Lc9
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.dialogRef = r0     // Catch: java.lang.Exception -> Lc9
        L5c:
            return
        L5d:
            boolean r1 = r6 instanceof android.app.Activity     // Catch: java.lang.Exception -> Lc9
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L62:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L6a;
                case 45: goto L74;
                case 76: goto L5c;
                case 239: goto L6e;
                default: goto L69;
            }     // Catch: java.lang.Exception -> Lc9
        L69:
            goto L62
        L6a:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L62
        L6e:
            if (r1 != 0) goto L6a
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L62
        L74:
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Exception -> Lc9
            boolean r1 = androidx.loader.C1098.m2818(r6)     // Catch: java.lang.Exception -> Lc9
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7d:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L85;
                case 53: goto L5c;
                case 503: goto L89;
                case 32495: goto L8f;
                default: goto L84;
            }     // Catch: java.lang.Exception -> Lc9
        L84:
            goto L7d
        L85:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L7d
        L89:
            if (r1 != 0) goto L85
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L7d
        L8f:
            boolean r1 = kevin.fun.hook.audio.C1115.m8003(r6)     // Catch: java.lang.Exception -> Lc9
            r0 = 49666(0xc202, float:6.9597E-41)
        L96:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L9e;
                case 50: goto La4;
                case 76: goto La8;
                case 83: goto Lb7;
                default: goto L9d;
            }     // Catch: java.lang.Exception -> Lc9
        L9d:
            goto L96
        L9e:
            if (r1 == 0) goto La4
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L96
        La4:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L96
        La8:
            r0 = 49790(0xc27e, float:6.977E-41)
        Lab:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L5c;
                case 241: goto Lb3;
                default: goto Lb2;
            }     // Catch: java.lang.Exception -> Lc9
        Lb2:
            goto Lab
        Lb3:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Lab
        Lb7:
            m7499(r6)     // Catch: java.lang.Exception -> Lc9
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lbd:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto Lc5;
                case 1711: goto L5c;
                default: goto Lc4;
            }
        Lc4:
            goto Lbd
        Lc5:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto Lbd
        Lc9:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1956(0x7a4, float:2.741E-42)
            int r4 = androidx.viewpager.C1108.f134
            r4 = r4 ^ (-502(0xfffffffffffffe0a, float:NaN))
            r5 = 2148(0x864, float:3.01E-42)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            goto L5c
    }

    private static void showToast(android.content.Context r3, java.lang.String r4) {
            android.os.Handler r0 = m7523()
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda26 r1 = new kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda26
            r1.<init>(r3, r4)
            androidx.activity.C1062.m178(r0, r1)
            int r1 = androidx.loader.C1098.m2793()
            r0 = 1616(0x650, float:2.264E-42)
        L12:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L18;
                case 49: goto L1b;
                case 204: goto L20;
                case 239: goto L2f;
                default: goto L17;
            }
        L17:
            goto L12
        L18:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L12
        L1b:
            if (r1 < 0) goto L18
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L12
        L20:
            java.lang.String r0 = "rGFbL"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2f:
            return
    }

    public static void startVoiceAssistant(android.content.Context r6) {
            m7532(r6)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            m7495(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 1
            kevin.fun.hook.VoiceAssistantHook.isInitialized = r0     // Catch: java.lang.Throwable -> L30
            boolean r1 = r6 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L30
            r0 = 1616(0x650, float:2.264E-42)
        Le:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L14;
                case 49: goto L17;
                case 204: goto L1c;
                case 239: goto L59;
                default: goto L13;
            }     // Catch: java.lang.Throwable -> L30
        L13:
            goto Le
        L14:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Le
        L17:
            if (r1 == 0) goto L14
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Le
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L30
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> L30
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L30
            kevin.fun.hook.VoiceAssistantHook.currentActivityRef = r0     // Catch: java.lang.Throwable -> L30
            r0 = 1740(0x6cc, float:2.438E-42)
        L27:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2d;
                case 54: goto L59;
                default: goto L2c;
            }
        L2c:
            goto L27
        L2d:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L27
        L30:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1974(0x7b6, float:2.766E-42)
            int r4 = androidx.lifecycle.process.C1091.f117
            r4 = r4 ^ (-485(0xfffffffffffffe1b, float:NaN))
            r5 = 402(0x192, float:5.63E-43)
            java.lang.String r2 = androidx.lifecycle.livedata.C1085.m1814(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
        L59:
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1864(0x748, float:2.612E-42)
        L5f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L65;
                case 47384: goto L7e;
                case 47417: goto L6f;
                case 47483: goto L6b;
                default: goto L64;
            }
        L64:
            goto L5f
        L65:
            if (r1 < 0) goto L6b
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L5f
        L6b:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L5f
        L6f:
            java.lang.String r0 = "llgNeE"
            java.lang.String r0 = androidx.vectordrawable.C1105.m3273(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L7e:
            return
    }

    public static void stopVoiceAssistant(android.content.Context r6) {
            m7493()     // Catch: java.lang.Throwable -> L28
            m7508()     // Catch: java.lang.Throwable -> L28
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.isInitialized = r0     // Catch: java.lang.Throwable -> L28
            r0 = 0
            kevin.fun.hook.VoiceAssistantHook.currentActivityRef = r0     // Catch: java.lang.Throwable -> L28
            r0 = 1616(0x650, float:2.264E-42)
        Le:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L14;
                case 49: goto L25;
                default: goto L13;
            }
        L13:
            goto Le
        L14:
            int r1 = androidx.startup.C1100.m2972()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L52;
                case 471: goto L64;
                case 500: goto L55;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r1 < 0) goto L52
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1647(0x66f, float:2.308E-42)
            goto Le
        L28:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7514()
            r3 = 1989(0x7c5, float:2.787E-42)
            int r4 = androidx.core.ktx.C1071.f97
            r4 = r4 ^ 909(0x38d, float:1.274E-42)
            r5 = 1602(0x642, float:2.245E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7537(r0)
            goto L14
        L52:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L55:
            java.lang.String r0 = "7v7qSzS1n"
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L64:
            return
    }

    /* JADX INFO: renamed from: ۟۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m7473() {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.VoiceAssistantHook.ttsStabilityBoost
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7474(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            showToast(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7475() {
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.VoiceAssistantHook.currentTtsRemaining
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m7476(java.lang.Object r2, float r3) {
            int r1 = androidx.interpolator.C1083.m1725()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            int r0 = dpToPx(r2, r3)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m7477() {
            int r1 = androidx.viewpager.C1108.m3542()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Runnable r0 = kevin.fun.hook.VoiceAssistantHook.onReplaceCompleteCallback
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m7478(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            androidx.documentfile.provider.DocumentFile r2 = (androidx.documentfile.provider.DocumentFile) r2
            java.util.List r3 = (java.util.List) r3
            scanDocumentTree(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m7479() {
            int r1 = androidx.annotation.experimental.C1067.m596()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.net.Uri r0 = kevin.fun.hook.VoiceAssistantHook.selectedAudio
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7480(java.lang.Object r2) {
            int r1 = androidx.startup.C1100.m2972()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            android.widget.LinearLayout r0 = createLocalAudioLayout(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7481(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.process.C1089.m2142()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            downloadAudioFile(r2, r3)
        L1b:
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3e;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 > 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "jUj7xxTMObjTTEkCL8pCp"
            java.lang.String r0 = androidx.documentfile.C1076.m1239(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L1b;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7482() {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.VoiceAssistantHook.ttsBreakClone
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۡۥۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7483() {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            doReplace()
        L17:
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L3a;
                case 500: goto L2b;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 < 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "DuXtaiQszke6LHhakQK"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3a:
            return
        L3b:
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47483: goto L17;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۦ, reason: not valid java name and contains not printable characters */
    public static int m7484() {
            int r1 = androidx.activity.C1063.m300()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.VoiceAssistantHook.ttsRandomness
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7485(java.lang.Object r2) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            android.widget.LinearLayout r0 = createTabBar(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m7486(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            performTtsConversion(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m7487() {
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference<android.app.Dialog> r0 = kevin.fun.hook.VoiceAssistantHook.dialogRef
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7488(java.lang.Object r2, boolean r3) {
            int r1 = androidx.loader.C1098.m2793()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.TextView r2 = (android.widget.TextView) r2
            setTabActive(r2, r3)
        L19:
            int r1 = androidx.core.ktx.C1071.m854()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 > 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "T2dClOYUFcOG"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.Button m7489(java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5) {
            int r1 = androidx.core.C1072.m980()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            android.widget.Button r0 = createSmallButton(r2, r3, r4, r5)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m7490() {
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.VoiceAssistantHook.currentTtsCost
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7491(java.lang.Object r2) {
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            showConfigDialog(r2)
        L19:
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 < 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "0G20zh4J"
            java.lang.String r0 = androidx.appcompat.C1069.m702(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7492() {
            int r1 = androidx.activity.C1066.m518()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.VoiceAssistantHook.isInitialized
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m7493() {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L18;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            dismissDialog()
        L17:
            return
        L18:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L17;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m7494() {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.VoiceAssistantHook.ttsProbabilityOptimization
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۧ, reason: not valid java name and contains not printable characters */
    public static void m7495(java.lang.Object r2) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            scanAudiosAsync(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠۠, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m7496(int r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.graphics.drawable.Drawable r0 = createButtonBg(r2)
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۨ, reason: not valid java name and contains not printable characters */
    public static long m7497() {
            int r1 = androidx.vectordrawable.C1104.m3230()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            long r0 = kevin.fun.hook.VoiceAssistantHook.currentTtsDuration
        L16:
            return r0
        L17:
            r0 = 0
            r2 = 1740(0x6cc, float:2.438E-42)
        L1b:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L21;
                case 54: goto L16;
                default: goto L20;
            }
        L20:
            goto L1b
        L21:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L1b
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۢ, reason: not valid java name and contains not printable characters */
    public static java.util.List m7498() {
            int r1 = androidx.activity.C1066.m518()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.util.List<kevin.fun.hook.VoiceAssistantHook$AudioItem> r0 = kevin.fun.hook.VoiceAssistantHook.cachedAudioItems
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7499(java.lang.Object r2) {
            int r1 = androidx.annotation.experimental.C1067.m596()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            createDialog(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static void m7500(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r3 = (java.lang.String) r3
            playTtsAudio(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۣ۠۟۠, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7501(java.lang.Object r2) {
            int r1 = androidx.startup.C1100.m2972()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            android.widget.LinearLayout r0 = createTtsLayout(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7502() {
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = kevin.fun.hook.VoiceAssistantHook.ttsApiKey
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m7503(java.lang.Object r2) {
            int r1 = androidx.activity.C1063.m300()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            loadVoiceList(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۠ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7504(java.lang.Object r2) {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            android.widget.LinearLayout r0 = createDialogContent(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m7505(java.lang.Object r2) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.VoiceAssistantHook$AudioItem r2 = (kevin.fun.hook.VoiceAssistantHook.AudioItem) r2
            android.net.Uri r0 = r2.uri
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7506(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.View r0 = createPathHintView(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.ExecutorService m7507() {
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.util.concurrent.ExecutorService r0 = kevin.fun.hook.VoiceAssistantHook.executorService
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m7508() {
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            releaseResources()
        L17:
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L3a;
                case 500: goto L2b;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 > 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "iURwUFDk9tODc4feR"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47483: goto L17;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
    }

    /* JADX INFO: renamed from: ۢ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m7509(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1116.m8064()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            refreshAudioList(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7510() {
            int r1 = androidx.annotation.experimental.C1067.m596()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = kevin.fun.hook.VoiceAssistantHook.selectedVoiceId
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m7511(java.lang.Object r3) {
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r3 = (android.app.Activity) r3
            doTtsReplace(r3)
        L19:
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 < 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "nFPYH9Q07d2dQsSLhYGWjqN06"
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1925(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m7512() {
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference<android.widget.TextView> r0 = kevin.fun.hook.VoiceAssistantHook.tabLocalRef
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۢۥۨ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7513() {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = kevin.fun.hook.VoiceAssistantHook.currentTtsAudioPath
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7514() {
            int r1 = org.luckypray.dexkit.C1124.m10581()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            short[] r0 = kevin.fun.hook.VoiceAssistantHook.f388short
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m7515(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            pickAudioDirectory(r2)
        L19:
            int r1 = androidx.versionedparcelable.C1107.m3467()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 > 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "Yzp4QvtTvw1JjnDG"
            java.lang.String r0 = androidx.startup.C1101.m2985(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7516() {
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L18;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            clearTtsResources()
        L17:
            return
        L18:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L17;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣۣۥۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7517() {
            int r1 = androidx.appcompat.resources.C1068.m612()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = kevin.fun.hook.VoiceAssistantHook.targetReplaceDir
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣۥۥ۠, reason: not valid java name and contains not printable characters */
    public static android.widget.Button m7518(java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5) {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            android.widget.Button r0 = createLargeButton(r2, r3, r4, r5)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7519() {
            int r1 = kevin.fun.hook.audio.C1116.m8064()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.VoiceAssistantHook.ttsSharpen
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۤ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7520(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = kevin.fun.hook.VoiceAssistantHook.HttpApi.post(r2, r3, r4)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7521(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = kevin.fun.hook.VoiceAssistantHook.HttpApi.get(r2, r3)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m7522() {
            int r1 = org.luckypray.dexkit.C1124.m10581()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.graphics.drawable.Drawable r0 = createDialogBackground()
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۤۧۡۨ, reason: not valid java name and contains not printable characters */
    public static android.os.Handler m7523() {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.os.Handler r0 = kevin.fun.hook.VoiceAssistantHook.mainHandler
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m7524(java.lang.Object r2) {
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r0 = createEditTextBackground(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static int m7525() {
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.VoiceAssistantHook.ttsSeed
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۥۣۤۡ, reason: contains not printable characters */
    public static boolean m7526() {
            int r1 = androidx.lifecycle.process.C1088.m2011()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.VoiceAssistantHook.ttsStream
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۥۥ۟ۦ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference m7527() {
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference<android.widget.Spinner> r0 = kevin.fun.hook.VoiceAssistantHook.ttsSpinnerRef
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۥۨۨۨ, reason: contains not printable characters */
    public static boolean m7528() {
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.VoiceAssistantHook.ttsSrt
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static android.net.Uri m7529(java.lang.Object r2) {
            int r1 = androidx.appcompat.C1069.m747()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            android.net.Uri r0 = getAudioDirUri(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static android.widget.Button m7530(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.core.ktx.C1070.m822()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            android.widget.Button r0 = createTinyButton(r2, r3, r4)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۦۣۥ, reason: contains not printable characters */
    public static java.util.Map m7531() {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.util.Map<java.lang.String, java.lang.String> r0 = kevin.fun.hook.VoiceAssistantHook.voiceList
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۦۤ۠ۡ, reason: contains not printable characters */
    public static void m7532(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            loadTtsConfig(r2)
        L19:
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 > 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "1CrKwLHCpx0zdj1wS"
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2259(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۦۥ۠ۢ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference m7533() {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference<android.widget.TextView> r0 = kevin.fun.hook.VoiceAssistantHook.tabTtsRef
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۦۥۢۥ, reason: contains not printable characters */
    public static void m7534(java.lang.Object r2) {
            int r1 = androidx.vectordrawable.C1104.m3230()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            refreshTtsVoiceSpinner(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۦۦۡۧ, reason: contains not printable characters */
    public static void m7535() {
            int r1 = androidx.interpolator.C1081.m1643()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            releaseMediaPlayer()
        L17:
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L3a;
                case 500: goto L2b;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 > 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "0EBjHwJ4lQW"
            java.lang.String r0 = androidx.loader.C1096.m2685(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47483: goto L17;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
    }

    /* JADX INFO: renamed from: ۦۧۡ۠, reason: contains not printable characters */
    public static android.widget.LinearLayout m7536(java.lang.Object r2) {
            int r1 = androidx.appcompat.resources.C1068.m612()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            android.widget.LinearLayout r0 = createTitleBar(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۦۨ۟, reason: contains not printable characters */
    public static void m7537(java.lang.Object r2) {
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            de.robv.android.xposed.XposedBridge.log(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m7538(java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1088.m2011()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            saveTtsApiKey(r3, r4)
        L1b:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3e;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 < 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "ID74"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3e:
            return
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L1b;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    /* JADX INFO: renamed from: ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7539(java.lang.Object r2, java.lang.Object r3, boolean r4) {
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            android.widget.TextView r0 = createTab(r2, r3, r4)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۣۧۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7540(java.lang.Object r2) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.VoiceAssistantHook$AudioAdapter r2 = (kevin.fun.hook.VoiceAssistantHook.AudioAdapter) r2
            r2.notifyDataSetChanged()
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m7541() {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference<android.widget.ListView> r0 = kevin.fun.hook.VoiceAssistantHook.audioListViewRef
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7542(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.core.ktx.C1071.m854()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1e;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r3 = (java.util.Map) r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            pollTtsResult(r2, r3, r4)
        L1d:
            return
        L1e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L1d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m7543() {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.ref.WeakReference<android.app.Activity> r0 = kevin.fun.hook.VoiceAssistantHook.currentActivityRef
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۨۤۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7544() {
            int r1 = androidx.versionedparcelable.C1107.m3467()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.VoiceAssistantHook.ttsFlash
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۨۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m7545(java.lang.Object r2) {
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            showDialogInternal(r2)
        L19:
            int r1 = androidx.drawerlayout.C1077.m1360()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 < 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "QHWM"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static android.media.MediaPlayer m7546() {
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.media.MediaPlayer r0 = kevin.fun.hook.VoiceAssistantHook.mediaPlayer
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }
}
