package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class KSHook implements de.robv.android.xposed.IXposedHookLoadPackage {
    private static final int CORE_POOL_SIZE = 2;
    private static final java.util.concurrent.ExecutorService DOWNLOAD_EXECUTOR = null;
    private static final java.lang.String HOME_ACTIVITY = null;
    private static final long KEEP_ALIVE_TIME = 30;
    private static final java.lang.String KEY_DEXKIT_VERSION = null;
    private static final java.lang.String KEY_SHARE = null;
    private static final java.lang.String KEY_SHAREPANEL = null;
    private static final android.os.Handler MAIN_HANDLER = null;
    private static final int MAX_POOL_SIZE = 3;
    private static final java.lang.Object MMKV_LOCK = null;
    private static final java.lang.String MODULE_PKG = null;
    private static final java.lang.String PREFS_NAME = null;
    private static final int STATE_DOWNLOADING = 2;
    private static final int STATE_ERROR = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PARSING = 1;
    private static final java.lang.String TAG = null;
    private static final java.lang.String TARGET_PACKAGE = null;
    private static final java.lang.String[] USER_AGENT_ARRAY = null;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> WORK_QUEUE = null;
    private static final java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> dialogActiveMap = null;
    private static java.lang.String mModulePath;
    private static volatile java.lang.Class<?> mmkvClass;
    private static final java.util.concurrent.atomic.AtomicBoolean mmkvInitialized = null;
    private static java.lang.Object mmkvInstance;
    private static volatile dalvik.system.DexClassLoader mmkvLoader;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f365short = null;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> cachedShareObjectId;
    private final kevin.fun.hook.KSHook.ParseResult currentResult;
    private final java.util.concurrent.atomic.AtomicInteger currentState;
    private final java.lang.Object idLock;
    private final java.util.concurrent.atomic.AtomicBoolean isAdSkipped;







    private static class AtlasDownloadHolder {
        android.app.Dialog dialog;
        android.widget.ProgressBar progressBar;
        android.widget.TextView progressText;
        android.widget.TextView speedText;

        static {
                return
        }

        private AtlasDownloadHolder() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.core.ktx.C1071.m854()
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
                java.lang.String r0 = "To7GG9krBeC6UsSEaQ6gQOzRBkQv"
                java.lang.String r0 = androidx.loader.C1094.m2472(r0)
                java.lang.Integer r0 = java.lang.Integer.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }

        /* synthetic */ AtlasDownloadHolder(kevin.fun.hook.KSHookIA r3) {
                r2 = this;
                r2.<init>()
                int r1 = androidx.emoji2.C1080.m1539()
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
                java.lang.String r0 = "QbRJ"
                java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3709(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    private static class DownloadDialogHolder {
        android.app.Dialog dialog;
        android.widget.ProgressBar progressBar;
        android.widget.TextView progressText;
        android.widget.TextView speedText;

        static {
                return
        }

        private DownloadDialogHolder() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.core.C1072.m980()
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
                java.lang.String r0 = "3hpkJ"
                java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
                float r0 = java.lang.Float.parseFloat(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }

        /* synthetic */ DownloadDialogHolder(kevin.fun.hook.KSHookIA r3) {
                r2 = this;
                r2.<init>()
                int r1 = androidx.loader.C1095.m2562()
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
                java.lang.String r0 = "WpGMK7umrU4"
                java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
                java.lang.Integer r0 = java.lang.Integer.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    private interface DownloadProgressListener {
        static {
                return
        }

        void onProgress(int r1, int r2);
    }

    private enum MediaType extends java.lang.Enum<kevin.fun.hook.KSHook.MediaType> {
        public static final kevin.fun.hook.KSHook.MediaType ATLAS = null;
        private static final kevin.fun.hook.KSHook.MediaType[] ENUM$VALUES = null;
        public static final kevin.fun.hook.KSHook.MediaType VIDEO = null;

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f367short = null;
        final java.lang.String name;

        static {
                r6 = 2
                r5 = 0
                r0 = 14
                short[] r0 = new short[r0]
                r0 = {x0062: FILL_ARRAY_DATA , data: [-28816, -25049, 1974, 1961, 1956, 1957, 1967, 23742, -25466, 2027, 2046, 2022, 2027, 2041} // fill-array
                kevin.fun.hook.KSHook.MediaType.f367short = r0
                short[] r0 = kevin.fun.hook.KSHook.MediaType.f367short
                int r1 = androidx.core.ktx.C1070.f96
                r1 = r1 ^ 556(0x22c, float:7.79E-43)
                r2 = 1718(0x6b6, float:2.407E-42)
                java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r5, r1, r2)
                kevin.fun.hook.KSHook$MediaType r1 = new kevin.fun.hook.KSHook$MediaType
                short[] r2 = kevin.fun.hook.KSHook.MediaType.f367short
                int r3 = androidx.activity.C1064.f90
                r3 = r3 ^ 495(0x1ef, float:6.94E-43)
                r4 = 2016(0x7e0, float:2.825E-42)
                java.lang.String r2 = kevin.fun.hook.audio.C1117.m8169(r2, r6, r3, r4)
                r1.<init>(r2, r5, r0)
                kevin.fun.hook.KSHook.MediaType.VIDEO = r1
                short[] r0 = kevin.fun.hook.KSHook.MediaType.f367short
                r1 = 7
                int r2 = androidx.loader.C1097.f123
                r2 = r2 ^ 112(0x70, float:1.57E-43)
                r3 = 2624(0xa40, float:3.677E-42)
                java.lang.String r0 = androidx.activity.C1063.m241(r0, r1, r2, r3)
                kevin.fun.hook.KSHook$MediaType r1 = new kevin.fun.hook.KSHook$MediaType
                short[] r2 = kevin.fun.hook.KSHook.MediaType.f367short
                r3 = 9
                int r4 = androidx.customview.C1074.f100
                r4 = r4 ^ 246(0xf6, float:3.45E-43)
                r5 = 1962(0x7aa, float:2.75E-42)
                java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r3, r4, r5)
                r3 = 1
                r1.<init>(r2, r3, r0)
                kevin.fun.hook.KSHook.MediaType.ATLAS = r1
                kevin.fun.hook.KSHook$MediaType r0 = kevin.fun.hook.KSHook.MediaType.VIDEO
                kevin.fun.hook.KSHook$MediaType r1 = kevin.fun.hook.KSHook.MediaType.ATLAS
                kevin.fun.hook.KSHook$MediaType[] r2 = new kevin.fun.hook.KSHook.MediaType[r6]
                int r3 = androidx.interpolator.C1082.f108
                r3 = r3 ^ 351(0x15f, float:4.92E-43)
                r2[r3] = r0
                int r0 = androidx.customview.C1075.f101
                r0 = r0 ^ (-101(0xffffffffffffff9b, float:NaN))
                r2[r0] = r1
                kevin.fun.hook.KSHook.MediaType.ENUM$VALUES = r2
                return
        }

        MediaType(java.lang.String r3, int r4, java.lang.String r5) {
                r2 = this;
                r2.<init>(r3, r4)
                r2.name = r5
                int r1 = kevin.fun.hook.webdav.C1119.m8565()
                r0 = 1616(0x650, float:2.264E-42)
            Lb:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L11;
                    case 49: goto L14;
                    case 204: goto L19;
                    case 239: goto L28;
                    default: goto L10;
                }
            L10:
                goto Lb
            L11:
                r0 = 1678(0x68e, float:2.351E-42)
                goto Lb
            L14:
                if (r1 < 0) goto L11
                r0 = 1709(0x6ad, float:2.395E-42)
                goto Lb
            L19:
                java.lang.String r0 = "sP"
                java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
                java.lang.Float r0 = java.lang.Float.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L28:
                return
        }

        public static kevin.fun.hook.KSHook.MediaType valueOf(java.lang.String r1) {
                java.lang.Class<kevin.fun.hook.KSHook$MediaType> r0 = kevin.fun.hook.KSHook.MediaType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                kevin.fun.hook.KSHook$MediaType r0 = (kevin.fun.hook.KSHook.MediaType) r0
                return r0
        }

        public static kevin.fun.hook.KSHook.MediaType[] values() {
                r3 = 0
                kevin.fun.hook.KSHook$MediaType[] r0 = kevin.fun.hook.KSHook.MediaType.ENUM$VALUES
                int r1 = r0.length
                kevin.fun.hook.KSHook$MediaType[] r2 = new kevin.fun.hook.KSHook.MediaType[r1]
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                return r2
        }
    }

    private static class ParseResult {
        java.util.List<java.lang.String> atlasImageUrls;
        java.lang.String backgroundMusicUrl;
        java.lang.String backupVideoUrl;
        java.lang.String coverImageUrl;
        kevin.fun.hook.KSHook.MediaType currentMediaType;
        java.lang.String kwaiID;
        java.lang.String publishTime;
        java.lang.String userName;
        java.lang.String videoCaption;
        java.util.List<kevin.fun.hook.KSHook.VideoInfo> videoList;
        long viewCount;

        static {
                return
        }

        private ParseResult() {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = androidx.emoji2.C1080.m1562()
                r4.userName = r0
                r4.kwaiID = r0
                r2 = 0
                r4.viewCount = r2
                r4.publishTime = r0
                r4.videoCaption = r0
                r4.coverImageUrl = r0
                r4.backgroundMusicUrl = r0
                r4.backupVideoUrl = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.videoList = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.atlasImageUrls = r0
                kevin.fun.hook.KSHook$MediaType r0 = m7213()
                r4.currentMediaType = r0
                int r1 = androidx.loader.C1096.m2651()
                r0 = 1616(0x650, float:2.264E-42)
            L33:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L39;
                    case 49: goto L3c;
                    case 204: goto L41;
                    case 239: goto L50;
                    default: goto L38;
                }
            L38:
                goto L33
            L39:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L33
            L3c:
                if (r1 < 0) goto L39
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L33
            L41:
                java.lang.String r0 = "fd3LR7Kin2M6YuH0a"
                java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
                java.lang.Long r0 = java.lang.Long.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L50:
                return
        }

        /* synthetic */ ParseResult(kevin.fun.hook.KSHookIA r3) {
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
                java.lang.String r0 = "F4oIzZ8VVWrj2L3V"
                java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }

        /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
        public static java.util.List m7210(java.lang.Object r2) {
                int r1 = androidx.core.C1072.m980()
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
                kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
                java.util.List<java.lang.String> r0 = r2.atlasImageUrls
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

        /* JADX INFO: renamed from: ۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7211(java.lang.Object r2) {
                int r1 = androidx.activity.C1066.m518()
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
                kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
                java.lang.String r0 = r2.videoCaption
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

        /* JADX INFO: renamed from: ۟ۥۦۣۦ, reason: not valid java name and contains not printable characters */
        public static long m7212(java.lang.Object r3) {
                int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
                kevin.fun.hook.KSHook$ParseResult r3 = (kevin.fun.hook.KSHook.ParseResult) r3
                long r0 = r3.viewCount
            L18:
                return r0
            L19:
                r0 = 0
                r2 = 1740(0x6cc, float:2.438E-42)
            L1d:
                r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
                switch(r2) {
                    case 17: goto L23;
                    case 54: goto L18;
                    default: goto L22;
                }
            L22:
                goto L1d
            L23:
                r2 = 1771(0x6eb, float:2.482E-42)
                goto L1d
        }

        /* JADX INFO: renamed from: ۠ۤ۠ۢ, reason: not valid java name and contains not printable characters */
        public static kevin.fun.hook.KSHook.MediaType m7213() {
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
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.KSHook$MediaType r0 = kevin.fun.hook.KSHook.MediaType.VIDEO
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

        /* JADX INFO: renamed from: ۣۡۥ۠, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7214(java.lang.Object r2) {
                int r1 = androidx.core.ktx.C1070.m822()
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
                kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
                java.lang.String r0 = r2.userName
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

        /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
        public static java.util.List m7215(java.lang.Object r2) {
                int r1 = androidx.core.C1073.m1015()
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
                kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
                java.util.List<kevin.fun.hook.KSHook$VideoInfo> r0 = r2.videoList
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

        void clear() {
                r6 = this;
                r1 = 0
                java.lang.String r4 = "ۦۨۨ"
                r0 = r1
                r2 = r1
                r3 = r1
            L6:
                int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
                switch(r1) {
                    case 56420: goto L13;
                    case 56569: goto L3c;
                    case 1746846: goto L19;
                    case 1748833: goto L4f;
                    case 1748897: goto L49;
                    case 1749765: goto L65;
                    case 1750599: goto L73;
                    case 1750724: goto L5f;
                    case 1750818: goto L36;
                    case 1752640: goto L43;
                    case 1752709: goto L6b;
                    case 1753702: goto L57;
                    case 1754537: goto L1f;
                    case 1755437: goto L27;
                    case 1755522: goto L2e;
                    default: goto Ld;
                }
            Ld:
                r6.publishTime = r2
                java.lang.String r1 = "ۣ۟ۤ"
                r4 = r1
                goto L6
            L13:
                r6.kwaiID = r2
                java.lang.String r1 = "ۨۥ۟"
                r4 = r1
                goto L6
            L19:
                r6.videoCaption = r2
                java.lang.String r1 = "ۢۥۨ"
                r4 = r1
                goto L6
            L1f:
                java.util.List r1 = m7215(r6)
                java.lang.String r4 = "ۨۡ"
                r3 = r1
                goto L6
            L27:
                androidx.core.C1072.m954(r3)
                java.lang.String r1 = "ۡۦۦ"
                r4 = r1
                goto L6
            L2e:
                r4 = 0
                r6.viewCount = r4
                java.lang.String r1 = "ۡۧ۠"
                r4 = r1
                goto L6
            L36:
                r6.currentMediaType = r0
                java.lang.String r1 = "ۣۡۥ"
                r4 = r1
                goto L6
            L3c:
                androidx.core.C1072.m954(r3)
                java.lang.String r1 = "ۥۧۧ"
                r4 = r1
                goto L6
            L43:
                r6.backupVideoUrl = r2
                java.lang.String r1 = "ۧۤۦ"
                r4 = r1
                goto L6
            L49:
                r6.userName = r2
                java.lang.String r1 = "ۣۧ"
                r4 = r1
                goto L6
            L4f:
                kevin.fun.hook.KSHook$MediaType r0 = m7213()
                java.lang.String r1 = "ۣۨۧ"
                r4 = r1
                goto L6
            L57:
                java.lang.String r1 = androidx.emoji2.C1080.m1562()
                java.lang.String r4 = "ۡۨۨ"
                r2 = r1
                goto L6
            L5f:
                r6.backgroundMusicUrl = r2
                java.lang.String r1 = "ۥۥ۠"
                r4 = r1
                goto L6
            L65:
                r6.coverImageUrl = r2
                java.lang.String r1 = "ۣۥۦ"
                r4 = r1
                goto L6
            L6b:
                java.util.List r1 = m7210(r6)
                java.lang.String r4 = "ۨۢۧ"
                r3 = r1
                goto L6
            L73:
                return
        }

        boolean isComplete() {
                r4 = this;
                java.lang.String r0 = m7214(r4)
                boolean r1 = androidx.activity.C1066.m488(r0)
                r0 = 1616(0x650, float:2.264E-42)
            La:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L10;
                    case 49: goto L13;
                    case 204: goto L18;
                    case 239: goto L4c;
                    default: goto Lf;
                }
            Lf:
                goto La
            L10:
                r0 = 1678(0x68e, float:2.351E-42)
                goto La
            L13:
                if (r1 != 0) goto L10
                r0 = 1709(0x6ad, float:2.395E-42)
                goto La
            L18:
                java.lang.String r0 = m7211(r4)
                boolean r1 = androidx.activity.C1066.m488(r0)
                r0 = 1740(0x6cc, float:2.438E-42)
            L22:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L28;
                    case 54: goto L2d;
                    case 471: goto L4c;
                    case 500: goto L30;
                    default: goto L27;
                }
            L27:
                goto L22
            L28:
                if (r1 != 0) goto L2d
                r0 = 1833(0x729, float:2.569E-42)
                goto L22
            L2d:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L22
            L30:
                long r2 = m7212(r4)
                r0 = 1864(0x748, float:2.612E-42)
            L36:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L3c;
                    case 47384: goto L4c;
                    case 47417: goto L4a;
                    case 47483: goto L46;
                    default: goto L3b;
                }
            L3b:
                goto L36
            L3c:
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L46
                r0 = 48736(0xbe60, float:6.8294E-41)
                goto L36
            L46:
                r0 = 48705(0xbe41, float:6.825E-41)
                goto L36
            L4a:
                r0 = 1
            L4b:
                return r0
            L4c:
                r0 = 0
                goto L4b
        }
    }

    private static class VideoInfo {
        final int avgBitrate;
        final int height;
        final java.lang.String url;
        final java.lang.String videoCodec;

        static {
                return
        }

        VideoInfo(java.lang.String r3, java.lang.String r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                r2.url = r3
                r2.videoCodec = r4
                r2.height = r5
                r2.avgBitrate = r6
                int r1 = kevin.fun.hook.audio.C1114.m7895()
                r0 = 1616(0x650, float:2.264E-42)
            L11:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L17;
                    case 49: goto L1a;
                    case 204: goto L1f;
                    case 239: goto L2e;
                    default: goto L16;
                }
            L16:
                goto L11
            L17:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L11
            L1a:
                if (r1 > 0) goto L17
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L11
            L1f:
                java.lang.String r0 = "UM0NUi"
                java.lang.String r0 = androidx.vectordrawable.C1105.m3273(r0)
                float r0 = java.lang.Float.parseFloat(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L2e:
                return
        }
    }

    static {
            r12 = 0
            r9 = 0
            r0 = 4039(0xfc7, float:5.66E-42)
            short[] r0 = new short[r0]
            r0 = {x0146: FILL_ARRAY_DATA , data: [1500, 1488, 1490, 1425, 1478, 1479, 1500, 1488, 1485, 1487, 1425, 1496, 1494, 1497, 1484, 1495, 1488, 1480, 1425, 1527, 1488, 1490, 1498, 1534, 1500, 1483, 1494, 1481, 1494, 1483, 1478, 560, 561, 556, 575, 573, 544, 523, 546, 561, 550, 551, 573, 571, 570, 523, 567, 571, 560, 561, 614, 637, 628, 615, 624, 2321, 2314, 2307, 2320, 2311, 2322, 2307, 2316, 2311, 2318, 924, 914, 897, 926, 921, 985, 913, 898, 921, 691, 701, 686, 689, 694, 647, 680, 682, 701, 702, 683, 12962, 761, 727, 708, 731, 732, 12963, 2711, 2715, 2713, 2778, 2695, 2713, 2717, 2712, 2705, 2778, 2707, 2717, 2706, 2713, 2709, 2719, 2705, 2694, 1643, 1609, 1628, 1615, 1610, 1610, 1607, 1545, 1555, 1544, 1558, 1542, 1550, 1642, 1615, 1608, 1619, 1630, 1565, 1542, 1651, 1565, 1542, 1639, 1608, 1602, 1620, 1609, 1615, 1602, 1542, 1556, 1544, 1556, 1544, 1559, 1565, 1542, 1628, 1614, 1547, 1605, 1608, 1565, 1542, 1646, 1650, 1637, 1657, 1649, 1615, 1610, 1602, 1600, 1615, 1620, 1603, 1657, 1639, 1557, 1557, 1557, 1557, 1542, 1636, 1619, 1615, 1610, 1602, 1545, 1632, 1652, 1633, 1566, 1557, 1634, 1551, 1542, 1639, 1622, 1622, 1610, 1603, 1649, 1603, 1604, 1645, 1615, 1618, 1545, 1555, 1557, 1557, 1544, 1559, 1542, 1550, 1645, 1646, 1650, 1643, 1642, 1546, 1542, 1610, 1615, 1613, 1603, 1542, 1633, 1603, 1605, 1613, 1609, 1551, 1542, 1648, 1603, 1620, 1621, 1615, 1609, 1608, 1545, 1554, 1544, 1558, 1542, 1643, 1609, 1604, 1615, 1610, 1603, 1542, 1653, 1607, 1600, 1607, 1620, 1615, 1545, 1555, 1557, 1557, 1544, 1559, 1923, 1953, 1972, 1959, 1954, 1954, 1967, 2017, 2043, 2016, 2046, 2030, 2022, 1959, 1950, 1958, 1953, 1952, 1963, 2037, 2030, 1933, 1950, 1947, 2030, 1959, 1950, 1958, 1953, 1952, 1963, 2030, 1921, 1949, 2030, 2047, 2043, 1937, 2046, 2030, 1954, 1959, 1957, 1963, 2030, 1923, 1967, 1965, 2030, 1921, 1949, 2030, 1942, 2023, 2030, 1935, 1982, 1982, 1954, 1963, 1945, 1963, 1964, 1925, 1959, 1978, 2017, 2040, 2046, 2043, 2016, 2047, 2016, 2047, 2043, 2030, 2022, 1925, 1926, 1946, 1923, 1922, 2018, 2030, 1954, 1959, 1957, 1963, 2030, 1929, 1963, 1965, 1957, 1953, 2023, 2030, 1944, 1963, 1980, 1981, 1959, 1953, 1952, 2017, 2047, 2043, 2016, 2046, 2030, 1923, 1953, 1964, 1959, 1954, 1963, 2017, 2047, 2043, 1931, 2047, 2042, 2038, 2030, 1949, 1967, 1960, 1967, 1980, 1959, 2017, 2040, 2046, 2042, 2016, 2047, 488, 458, 479, 460, 457, 457, 452, 394, 400, 395, 405, 389, 397, 489, 460, 459, 464, 477, 414, 389, 484, 459, 449, 471, 458, 460, 449, 389, 404, 405, 414, 389, 502, 488, 392, 482, 412, 413, 404, 487, 396, 389, 484, 469, 469, 457, 448, 498, 448, 455, 494, 460, 465, 394, 400, 406, 402, 395, 406, 403, 389, 397, 494, 493, 497, 488, 489, 393, 389, 457, 460, 462, 448, 389, 482, 448, 454, 462, 458, 396, 389, 486, 461, 471, 458, 456, 448, 394, 413, 405, 395, 405, 395, 406, 412, 413, 402, 395, 404, 403, 407, 389, 488, 458, 455, 460, 457, 448, 389, 502, 452, 451, 452, 471, 460, 394, 400, 406, 402, 395, 406, 403, 430, 396, 409, 394, 399, 399, 386, 460, 470, 461, 467, 451, 459, 394, 435, 395, 396, 397, 390, 472, 451, 438, 472, 451, 416, 435, 438, 451, 394, 435, 395, 396, 397, 390, 451, 428, 432, 451, 471, 444, 464, 444, 464, 451, 399, 394, 392, 390, 451, 430, 386, 384, 451, 428, 432, 451, 443, 472, 451, 390, 397, 462, 406, 400, 458, 451, 418, 403, 403, 399, 390, 436, 390, 385, 424, 394, 407, 460, 470, 464, 464, 461, 466, 468, 461, 474, 451, 459, 424, 427, 439, 430, 431, 463, 451, 399, 394, 392, 390, 451, 420, 390, 384, 392, 396, 458, 451, 437, 390, 401, 400, 394, 396, 397, 460, 470, 461, 467, 461, 465, 451, 430, 396, 385, 394, 399, 390, 460, 475, 425, 465, 451, 432, 386, 389, 386, 401, 394, 460, 469, 470, 464, 464, 461, 466, 475, 461, 470, -11686, -10749, 2631, -829, 898, 911, -815, -1050, -11464, -10428, 2853, 2137, 2254, 2137, -9794, -8866, 419, -8762, -10169, 1499, 21253, 30652, 24715, -27596, -1311, 786, 23570, 1223, 1256, 1227, 1241, 1231, 1260, 1231, 1231, 1230, 1667, 1696, 1665, 1664, 1707, 1687, 1675, 1699, 1679, 1686, 1706, 1679, 1690, 1679, 14708, 2351, 2305, 2322, 2317, 2314, 14709, 2398, 2372, 26465, 29470, 22299, 23854, 27668, 27146, 20565, -31679, 2398, 2372, 1892, 1899, 1902, 1911, 1893, 1896, 1894, 1909, 1891, -25990, 28167, -25675, -25862, 2305, 589, 594, 23968, 21857, 16971, 3144, 3144, 3144, 18512, -30426, 20645, -28515, 23431, 21318, 17482, -31428, 2671, 2671, 2671, 20536, 22470, 19005, -29877, 22391, 20617, 19826, -29692, 23911, 29000, 32339, 24570, 19051, -29923, 23164, -24862, 19643, -29235, -27975, -25911, 656, 669, 656, -29834, -26079, 17978, -30900, -26568, -28600, 2065, 2076, 2065, 24271, -24841, 19122, -29756, -31627, 25302, -27830, 19177, 18128, -30810, 21722, -24647, 24101, 20966, 23261, 28012, 24739, 18941, -30581, -29136, -24729, 18027, -30947, 22792, -26488, 24222, 31271, 1962, 1980, 1967, 1977, 1967, 1964, 1954, 1963, 14406, 2077, 2099, 2080, 2111, 2104, 14407, 2166, 2085, 2099, 2082, 2066, 2084, 2103, 2081, 2103, 2100, 2106, 2099, 2166, 20839, -31373, 2156, 2166, 13357, 1142, 1112, 1099, 1108, 1107, 13356, 1053, 22054, 23239, 21187, 27706, 25018, 25361, 26420, -28525, 23820, -30440, 1031, 1053, 12161, -2258, 2305, 27377, 28699, -2501, -32060, -32537, -28240, 18203, 2380, 2322, 2388, 2329, 23334, 31590, 24861, 22062, -2515, 22491, -32113, -26328, 27592, 14637, 20518, 31753, 29458, 21179, 18218, -31140, 14636, 18372, 29007, 18172, 18218, -31140, 27441, 23486, 3159, 3138, -29944, 26483, 19195, 1272, 1272, 1272, 25194, 24097, 18178, -31116, 436, 426, 446, 438, 428, 439, 432, 426, 384, 2667, 2667, 2667, -25781, 27051, -32124, -27693, -31126, -25971, 27791, 20985, -29424, 31168, 1295, 1303, 1339, 1303, 1292, 1285, 1302, 1281, 1339, 1286, 1291, 1296, 1296, 1291, 1289, 1339, 1286, 1285, 1302, 18115, -30795, 2859, 2937, 2114, 2124, 2143, 2112, 2119, 2055, 2127, 2140, 2119, -31838, 30578, 584, 584, 3122, 3132, 3119, 3120, 3127, 3191, 3135, 3116, 3127, 2127, 2135, 2171, 2135, 2124, 2117, 2134, 2113, 2171, 2134, 2123, 2123, 2128, 1276, 1196, 1188, 3294, 3287, 3269, 3270, 3228, 3221, 3224, 3221, 1164, 1189, 1809, 1903, 2719, 27986, 26362, 21020, 20472, -29042, 30583, 22285, 29620, 813, 809, 805, 803, 801, 875, 814, 820, 801, 803, 2528, 2558, 2538, 2530, 2552, 2531, 2532, 2558, 2516, 2536, 2532, 2557, 2542, 2553, 2516, 908, 968, 978, 965, 22235, -25160, 23588, 28415, 22768, 32311, 22302, -25475, 24033, -24607, 26810, 3130, 3128, 3113, 2392, 2430, 2408, 2431, 2336, 2380, 2410, 2408, 2403, 2425, 2506, 2536, 2536, 2542, 2555, 2559, 2470, 2510, 2533, 2536, 2532, 2543, 2530, 2533, 2540, 2201, 2196, 2197, 2206, 2180, 2201, 2180, 2185, 27652, 22952, 23905, -31523, 24023, -25072, -32538, 2867, 2857, 17728, -31690, 21114, -31122, 19805, -29653, -29699, 19835, 26363, 1983, 1963, 1978, 1975, 1969, 2033, 1971, 1966, 1979, 1977, 1557, 1547, 1567, 1559, 1549, 1558, 1553, 1547, 1569, 1555, 1547, 1549, 1559, 1565, 1569, -31356, 25383, -27973, 19224, 27802, 23189, 31826, -30282, 28437, -24951, 18218, -25212, 27359, 2786, 2723, 2724, 2734, 2786, 2716, 2739, 2794, 2810, 2716, 2739, 2794, 2716, 2715, 2786, 2792, 2715, 2718, 2786, 2717, 2795, 2793, 2786, 1601, 1551, 1546, 1552, 1559, 1601, 1599, 1552, 1609, 1625, 1599, 1552, 1609, 1599, 1592, 1611, 1613, 1609, 1628, 1610, 1599, 1598, 2612, 2622, 2637, 2632, 2612, 2635, 2621, 2634, 2616, 2622, 2601, 2604, 2684, 2662, 2673, 2666, 2684, 2662, 2675, 2673, 2666, 2662, 2680, 2673, 2666, 2657, 2675, 2676, 2662, 2623, 2623, 2612, 2315, 2327, 2327, 2323, 2334, 2306, 2306, 2310, 2309, 2380, 2393, 2393, 1049, 1029, 1029, 1025, 1026, 1099, 1118, 1118, 1025, 1095, 1095, 1116, 1025, 1053, 1040, 1029, 1119, 1030, 1026, 1028, 1050, 1030, 1040, 1048, 1119, 1042, 1054, 1052, 15003, 2752, 2798, 2813, 2786, 2789, 15002, 2737, 2731, 2768, 23669, -25523, 26971, 22877, 2774, 2731, 26971, 22877, 21434, -30802, 2737, 2731, 2526, 2451, 2442, 2457, 2446, 2446, 2453, 2456, 2457, 2495, 2451, 2442, 2457, 2446, 2473, 2446, 2448, 2447, 2526, 2471, 2466, 2433, 2465, 2518, 2526, 2441, 2446, 2448, 2526, 2464, 2447, 2518, 2502, 2464, 2447, 2518, 2526, 2516, 2471, 2466, 2526, 2465, 2519, 2517, 2526, 1170, 1235, 1247, 1222, 1237, 1218, 1253, 1218, 1244, 1219, 1170, 1259, 1262, 1260, 1259, 1261, 1178, 1260, 1259, 1259, 1262, 1260, 1227, 1261, 1178, 1260, 1227, 1259, 1262, 1229, 1261, 1178, 1170, 1221, 1218, 1244, 1170, 1260, 1219, 1178, 1162, 1260, 1219, 1178, 1170, 1176, 1259, 1262, 1170, 1261, 1179, 1177, 1170, 3036, 2953, 2971, 2972, 2958, 3005, 2961, 2952, 2971, 2956, 2987, 2956, 2962, 2957, 3036, 2981, 2976, 2978, 2981, 2979, 3028, 2978, 2981, 2981, 2976, 2978, 2949, 2979, 3028, 2978, 2949, 2981, 2976, 2947, 2979, 3028, 3036, 2955, 2956, 2962, 3036, 2978, 2957, 3028, 3012, 2978, 2957, 3028, 3036, 3030, 2981, 2976, 3036, 2979, 3029, 3031, 3036, 2553, 2556, 2551, 2490, 2826, 2889, 2892, 2887, 2881, 2880, 2909, 2894, 2892, 2897, 2827, 2902, 2890, 3092, 2027, 2005, 2030, 2023, 2036, 2019, 2006, 2023, 2024, 2019, 2026, 968, 1014, 973, 964, 983, 960, 1002, 967, 975, 960, 966, 977, 1004, 961, 1648, 1643, 1650, 1650, 3044, 2995, 2996, 2986, 3044, 2970, 2997, 3052, 3068, 2970, 2997, 3052, 3044, 3054, 2990, 2994, 2994, 2998, 2997, 3065, 3068, 3049, 3049, 2973, 2968, 3044, 2971, 3052, 2970, 3048, 2987, 2998, 3058, 2973, 2968, 3044, 2971, 3052, 3055, 3044, 897, 922, 927, 922, 923, 899, 922, 1062, 1059, 1064, 1125, 1990, 2167, 2150, 2173, 2070, 17947, 28444, 27208, 23046, 2070, 2149, 2169, 2070, 28081, 18112, 2060, 2070, 2280, 2236, 2211, 2222, 2223, 2213, 2185, 2213, 2222, 2223, 2217, 2280, 2198, 2233, 2272, 2288, 2198, 2233, 2272, 2280, 2274, 2193, 2196, 2280, 2199, 2273, 2275, 2280, 2193, 2196, 2231, 2199, 2272, 2280, 2210, 2223, 2211, 2221, 2210, 2238, 2280, 2198, 2233, 2272, 2288, 2198, 2233, 2272, 2274, 2198, 2222, 2273, 2275, 2193, 2196, 2231, 2199, 2272, 2280, 2219, 2236, 2221, 2184, 2211, 2238, 2232, 2219, 2238, 2223, 2280, 2198, 2233, 2272, 2288, 2198, 2233, 2272, 2274, 2198, 2222, 2273, 2275, 2193, 2196, 2231, 2199, 2272, 2280, 2239, 2232, 2214, 2280, 2198, 2233, 2272, 2288, 2198, 2233, 2272, 2280, 2274, 2193, 2196, 2280, 2199, 2273, 2275, 2280, 13182, 805, 779, 792, 775, 768, 13183, 852, 846, 821, -30040, -25601, 24766, 20664, 819, 846, 24766, 20664, 23135, -29109, 852, 846, 1422, 1420, 1437, 3165, 3195, 3181, 3194, 3109, 3145, 3183, 3181, 3174, 3196, 674, 640, 640, 646, 659, 663, 1464, 1449, 1460, 1464, 1507, 1444, 1464, 1441, 1440, 1504, 1453, 1468, 1468, 1440, 1445, 1455, 1453, 1464, 1445, 1443, 1442, 1507, 1460, 1444, 1464, 1441, 1440, 1511, 1460, 1441, 1440, 1504, 1453, 1468, 1468, 1440, 1445, 1455, 1453, 1464, 1445, 1443, 1442, 1507, 1460, 1441, 1440, 1527, 1469, 1521, 1532, 1506, 1525, 1504, 1510, 1507, 1510, 1527, 1469, 1521, 1532, 1506, 1524, 911, 941, 941, 939, 958, 954, 995, 898, 943, 928, 937, 955, 943, 937, 939, 3070, 3052, 2985, 3015, 3018, 2984, 3070, 3052, 3007, 3061, 3001, 2996, 2986, 3005, 2141, 2140, 2126, 2085, 2096, 1991, 1986, 1993, 1924, 1994, 2009, 1990, 1949, 1951, 1924, 1991, 1986, 1993, 1990, 1990, 1984, 2013, 1925, 2008, 1988, 2614, 2611, 2616, 2677, 2619, 2600, 2615, 2677, 2614, 2611, 2616, 2615, 2615, 2609, 2604, 2676, 2601, 2613, 1193, 1186, 1213, 1258, 1196, 1217, 1230, 1187, 1279, 1257, 1250, 1277, 1194, 1260, 1159, 1166, 1251, 1215, 2440, 2435, 2461, 2507, 2445, 2543, 2434, 2526, 1030, 1093, 1112, 1051, 979, 944, 1096, 1082, 1432, 1413, 1478, 1417, 1432, 1473, 1428, 1417, 1428, 1428, 1430, 1417, 1427, 1433, 1428, 1430, 1417, 1410, 1428, 1411, 1981, 14164, 1807, 1825, 1842, 1837, 1834, 14165, 1892, 1827, 1825, 1840, 1810, 1825, 1846, 1847, 1837, 1835, 1834, 1799, 1835, 1824, 1825, 24181, -30111, 1918, 1892, 2263, 12997, 670, 688, 675, 700, 699, 12996, 751, 757, 23505, 30419, 23722, 22175, 19550, 19491, 23524, -28688, 751, 757, 592, 618, 624, 611, 636, 1687, 1685, 1668, 2261, 2300, 2257, 2251, 2248, 2260, 2265, 2241, 2294, 2265, 2261, 2269, 23876, 19723, 26081, 20769, 28136, 23527, 32032, -32306, -28519, -25354, 27565, 24886, 22329, 29182, 21032, 30353, -28632, 26483, 787, 786, 783, 796, 798, 771, 808, 769, 786, 773, 772, 798, 792, 793, 808, 788, 792, 787, 786, 13798, 1469, 1427, 1408, 1439, 1432, 13799, 1494, 30654, 25306, 22062, 22240, -1286, 23286, 23613, -27148, -27461, 14743, 2508, 2530, 2545, 2542, 2537, 14742, 2471, 2506, 2534, 2542, 2537, 2502, 2532, 2547, 2542, 2545, 2542, 2547, 2558, 2471, 2536, 2537, 2500, 2549, 2530, 2534, 2547, 2530, 2471, 2543, 2536, 2536, 2540, 2471, 2529, 2534, 2542, 2539, 2530, 2531, 2493, 2471, 23254, 26486, -29445, -25172, 24762, 28021, 25802, 26885, 23743, 22592, 21371, 21373, 21287, -29575, 26162, 424, 491, 437, 499, 446, 855, 847, 867, 847, 852, 861, 846, 857, 867, 846, 851, 851, 840, 1238, 1242, 1240, 1179, 1228, 1229, 1238, 1242, 1223, 1221, 1179, 1234, 1244, 1235, 1222, 1245, 1242, 1218, 1179, 1277, 1242, 1240, 1232, 1268, 1238, 1217, 1244, 1219, 1244, 1217, 1228, 769, 768, 813, 796, 779, 783, 794, 779, 15293, 3046, 3016, 3035, 3012, 3011, 15292, 2957, 3013, 3010, 3010, 3014, 3040, 3020, 3012, 3011, 3052, 3022, 3033, 3012, 3035, 3012, 3033, 3028, 21148, -31096, 2967, 2957, 515, 536, 529, 514, 533, 512, 529, 542, 533, 540, 1561, 1557, 1559, 1620, 1539, 1538, 1561, 1557, 1544, 1546, 1620, 1565, 1555, 1564, 1545, 1554, 1557, 1549, 1620, 1545, 1554, 1563, 1544, 1567, 1620, 1549, 1555, 1566, 1565, 1567, 1550, 1620, 1596, 1557, 1544, 1549, 1563, 1544, 1566, 1597, 1544, 1555, 1566, 1577, 1567, 1561, 1550, 1555, 1557, 1556, 1581, 1555, 1550, 1554, 1587, 1559, 1578, 1563, 1556, 1567, 1558, 1596, 1544, 1563, 1565, 1559, 1567, 1556, 1550, 13163, 816, 798, 781, 786, 789, 13162, 833, 859, 808, 787, 794, 777, 798, 811, 794, 789, 798, 791, 859, 23149, -27757, 859, 819, 788, 788, 784, 859, 23114, -29090, 833, 859, 2721, 2733, 2735, 2796, 2729, 2743, 2723, 2731, 2737, 2730, 2733, 2743, 2796, 2721, 2733, 2735, 2735, 2727, 2736, 2721, 2731, 2723, 2734, 2796, 2737, 2738, 2734, 2723, 2737, 2730, 2796, 2705, 2738, 2734, 2723, 2737, 2730, 2703, 2733, 2726, 2727, 2734, 3272, 3279, 3293, 3276, 3291, 3309, 3276, 3290, 3276, 3291, 3264, 3272, 3269, 3264, 3283, 3276, 486, 490, 488, 427, 508, 509, 486, 490, 503, 501, 427, 482, 492, 483, 502, 493, 490, 498, 427, 461, 490, 488, 480, 452, 486, 497, 492, 499, 492, 497, 508, 2153, 2152, 2171, 2111, 2164, 1782, 1783, 1756, 1775, 1788, 1783, 1773, 1748, 1784, 1776, 1783, 1741, 1777, 1771, 1788, 1784, 1789, 14161, 1802, 1828, 1847, 1832, 1839, 14160, 1915, 1889, 1818, 22846, 21259, 1801, 1838, 1838, 1834, 1820, 1889, 1801, 1838, 1838, 1834, 24176, -30108, 1915, 1889, 14545, 2186, 2212, 2231, 2216, 2223, 14544, 2273, 22465, 20746, 2273, 2181, 2212, 2233, 2186, 2216, 2229, 2273, -26429, -26228, -2099, 22418, 23180, 31369, 28653, 2299, 2273, 1137, 1136, 1133, 1150, 1148, 1121, 1098, 1123, 1136, 1127, 1126, 1148, 1146, 1147, 1098, 1142, 1146, 1137, 1136, 26504, 28349, 20595, 23698, 584, 556, 525, 528, 547, 513, 540, 554, 538, 513, 524, 527, 525, 14736, 2507, 2533, 2550, 2537, 2542, 14737, 2464, 11980, 2464, 2500, 2533, 2552, 2507, 2537, 2548, 2464, -26238, -26419, 20657, -31579, 2490, 2464, -27425, -27248, 24401, 26317, -1071, -28886, -27376, 20722, 23350, 26262, -27399, -27210, 24010, -30242, 1217, 1243, 510, 23212, 18332, 2277, 32574, 21897, 23292, 23926, 25834, 2441, 2444, 2439, 2433, 2432, 2461, 2446, 2444, 2449, 2507, 2454, 2442, 13253, 926, 944, 931, 956, 955, 13252, 1013, 9369, 1013, 952, 954, 945, 928, 953, 944, 901, 948, 929, 957, 1013, 19951, 31151, 1564, 1623, 1618, 1607, 1618, 1564, 1623, 1618, 1607, 1618, 1564, 2589, 2644, 2651, 2654, 2647, 2625, 2589, 2646, 2647, 2634, 2649, 2651, 2630, 13300, 943, 897, 914, 909, 906, 13301, 964, 9384, 964, 20991, 23838, 29962, 23729, 23253, -28991, 990, 964, 14460, 2087, 2057, 2074, 2053, 2050, 14461, 2124, 12064, 2124, 2048, 2051, 2061, 2056, 2088, 2057, 2068, 2087, 2053, 2072, 2111, 2051, 2124, 20829, -31415, 2134, 2124, 1975, 1975, 818, 869, 867, 885, 866, 862, 881, 893, 885, 818, 844, 867, 826, 810, 844, 867, 826, 818, 824, 843, 846, 818, 845, 827, 825, 818, 3079, 3073, 3095, 3072, 3132, 3091, 3103, 3095, 3113, 3116, 3144, 3119, 3160, 3144, 3113, 3116, 3152, 3119, 3160, 3152, 3162, 3113, 3116, 3152, 3119, 3161, 3163, 3152, 2172, 2091, 2093, 2107, 2092, 2071, 2106, 2172, 2050, 2093, 2164, 2148, 2050, 2093, 2164, 2166, 2050, 2106, 2165, 2167, 1892, 1837, 1841, 1831, 1839, 1807, 1826, 1892, 1818, 1845, 1900, 1916, 1818, 1845, 1900, 1892, 1913, 1902, 1821, 1816, 1892, 1898, 1851, 1819, 1901, 1903, 1892, 1913, 1345, 1280, 1282, 1299, 1303, 1290, 1292, 1293, 1345, 1343, 1296, 1353, 1369, 1343, 1296, 1353, 1345, 1355, 1336, 1341, 1345, 1342, 1353, 1354, 1345, 1049, 1101, 1106, 1118, 1100, 1144, 1108, 1102, 1109, 1103, 1049, 1127, 1096, 1041, 1025, 1127, 1096, 1041, 1043, 1127, 1119, 1040, 1042, 2258, 2180, 2201, 2205, 2197, 2179, 2180, 2193, 2205, 2176, 2258, 2220, 2179, 2266, 2250, 2220, 2179, 2266, 2264, 2220, 2196, 2267, 2265, 372, 294, 318, 313, 290, 313, 258, 303, 294, 307, 372, 266, 293, 380, 364, 266, 293, 380, 372, 382, 269, 264, 372, 267, 381, 383, 372, 3272, 3287, 3290, 3291, 3281, 725, 722, 719, 724, 711, 722, 723, 713, 732, 721, 706, 732, 713, 721, 732, 718, 567, 548, 563, 565, 552, 546, 544, 557, 574, 544, 565, 557, 544, 562, 1333, 1398, 1378, 1395, 1406, 1400, 1346, 1381, 1403, 1380, 1333, 1356, 1353, 1355, 1356, 1354, 1341, 1355, 1356, 1356, 1353, 1355, 1388, 1354, 1341, 1355, 1388, 1356, 1353, 1386, 1354, 1341, 1333, 1378, 1381, 1403, 1333, 1355, 1380, 1341, 1325, 1355, 1380, 1341, 1333, 1343, 1356, 1353, 1333, 1354, 1340, 1342, 1333, 1584, 1580, 1580, 1576, 1579, 1634, 1136, 1087, 1075, 1083, 1084, 1055, 1060, 1031, 1056, 1086, 1057, 1136, 1033, 1036, 1038, 1033, 1039, 1144, 1038, 1033, 1033, 1036, 1038, 1065, 1039, 1144, 1038, 1065, 1033, 1036, 1071, 1039, 1144, 1136, 1063, 1056, 1086, 1136, 1038, 1057, 1144, 1128, 1038, 1057, 1144, 1136, 1146, 1033, 1036, 1136, 1039, 1145, 1147, 1136, 12786, 425, 391, 404, 395, 396, 12787, 472, 450, 441, 426, 438, 431, 430, -30719, 26226, 447, 450, -30719, 26226, 22739, -29497, 472, 450, 26290, 30333, 25710, -27540, 2605, 2605, 2605, 2605, 2681, 2585, 2585, 2681, 2608, 2608, 2676, 2588, 2588, 2670, 2617, 2617, 2670, 2599, 2599, 856, 874, 880, 888, 822, 842, 881, 888, 887, 894, 881, 888, 880, 2587, 2613, 2598, 2617, 2622, 25659, 27918, 21440, 24353, 22309, 29596, 30517, 24206, 262, 280, 268, 260, 286, 261, 258, 280, 306, 268, 281, 257, 268, 286, 306, 2289, 2871, 2931, 2921, 2942, 536, 566, 549, 570, 573, 21425, 22593, 23432, 18148, 23302, 22896, 14361, 2114, 2156, 2175, 2144, 2151, 14360, 2089, 17922, -30860, 22283, 22065, 2099, 2089, 1215, 1188, 1197, 1214, 1193, 2147, 2146, 2126, 2149, 2146, 2152, 2138, 2149, 2153, 2171, 2116, 2147, 2144, 2152, 2153, 2174, 1959, 1960, 1954, 1972, 1961, 1967, 1954, 1982, 2024, 1972, 1955, 1957, 1983, 1957, 1962, 1955, 1972, 1968, 1967, 1955, 1969, 2024, 1969, 1967, 1954, 1953, 1955, 1970, 2024, 1940, 1955, 1957, 1983, 1957, 1962, 1955, 1972, 1936, 1967, 1955, 1969, 2018, 1936, 1967, 1955, 1969, 1934, 1961, 1962, 1954, 1955, 1972, 13022, 645, 683, 696, 679, 672, 13023, 750, 702, 700, 683, 646, 673, 673, 677, 669, 678, 687, 700, 683, 641, 684, 676, 683, 685, 698, 647, 682, 23551, -28693, 756, 750, 15361, 3162, 3188, 3175, 3192, 3199, 15360, 3121, 11101, 3121, 28271, 16924, 24097, 3121, 3197, 3192, 3187, 3196, 3196, 3194, 3175, 3135, 3170, 3198, 2486, 2486, 2480, 2477, 2548, 2487, 2482, 2489, 2486, 2486, 2480, 2477, 2549, 2472, 2484, 12666, 289, 271, 284, 259, 260, 12667, 330, 9766, 330, 20652, 22637, 330, 313, 293, 330, 25837, 20380, 22619, -29617, 336, 330, 14527, 2276, 2250, 2265, 2246, 2241, 14526, 2191, 11791, -2400, 2191, 2274, 2274, 2276, 2297, 2191, 21853, 30304, 23218, 20836, 23481, -30872, -2141, -31396, -30872, 418, 430, 428, 495, 437, 420, 431, 418, 420, 431, 437, 495, 428, 428, 426, 439, 495, 396, 396, 394, 407, 2703, 2763, 2757, 2774, 2761, 2766, 2815, 2765, 2765, 2763, 2774, 2099, 2100, 2099, 2094, 2099, 2107, 2102, 2099, 2080, 2111, 15372, 3159, 3193, 3178, 3189, 3186, 15373, 3132, 10940, -3565, 3132, 3153, 3153, 3159, 3146, 3132, 24563, -29471, 20974, 24065, 21975, 24330, 3110, 3132, 855, 855, 849, 844, 877, 851, 846, 850, 883, 894, 1730, 1740, 1759, 1728, 1735, 1782, 1753, 1755, 1740, 1743, 1754, 2784, 2798, 2813, 2786, 2789, 2772, 2811, 2809, 2798, 2797, 2808, 14375, 2172, 2130, 2113, 2142, 2137, 14374, 2071, 12155, 2071, 2138, 2138, 2140, 2113, 2144, 2142, 2115, 2143, 2174, 2163, 2071, -30749, 24297, 2071, 2137, 2114, 2139, 2139, 13983, 1732, 1770, 1785, 1766, 1761, 13982, 1711, 8643, 1711, 1756, 1728, 1711, 25352, 18553, 22345, 24456, 24510, -29782, 13959, 1756, 1778, 1761, 1790, 1785, 13958, 1719, -8534, -9309, 1719, 21642, 24412, 21889, 23486, 26644, -29327, 26194, 1709, 1693, 14278, 1949, 1971, 1952, 1983, 1976, 14279, 2038, 1952, 1971, 1956, 1957, 1983, 1977, 1976, 1944, 1975, 1979, 1971, 2038, 2027, 2038, 1660, 1578, 1593, 1582, 1583, 1589, 1587, 1586, 1567, 1587, 1592, 1593, 1660, 1633, 1660, 2156, 2162, 2150, 2158, 2164, 2159, 2152, 2162, 2136, 2161, 2146, 2165, 2164, 2158, 2152, 2153, 2136, 2153, 2150, 2154, 2146, 1542, 1560, 1548, 1540, 1566, 1541, 1538, 1560, 1586, 1563, 1544, 1567, 1566, 1540, 1538, 1539, 1586, 1550, 1538, 1545, 1544, 12988, 743, 713, 730, 709, 706, 12989, 652, 735, 717, 730, 713, 762, 713, 734, 735, 709, 707, 706, 741, 706, 714, 707, 652, 714, 717, 709, 704, 713, 712, 662, 652, 27568, 23359, 18347, -31011, 2432, 1319, 23079, 21497, 30528, 2378, 2370, 22797, 24348, -29944, 1540, 15459, 3128, 3094, 3077, 3098, 3101, 15458, 3145, 3155, 3112, 17016, -31986, 22410, -30802, 25653, 3118, 3155, 27213, 30025, 21826, -32426, 3145, 3155, 12983, 748, 706, 721, 718, 713, 12982, 647, 724, 719, 712, 720, 756, 706, 723, 723, 718, 713, 704, 724, 739, 718, 710, 715, 712, 704, 23446, -28798, 669, 647, 14571, 2224, 2206, 2189, 2194, 2197, 14570, 2241, 2267, 2208, -31277, -26316, -26382, 27154, 2214, 2267, 28357, 29121, 20938, -31266, 2241, 2267, 28531, 21304, 23828, 28694, 19005, -1252, -28697, 32285, 21513, 1086, 1086, 1086, 28646, 32553, 27962, -25288, 28395, 28300, 25411, 3043, 3055, 3053, 2990, 3059, 3053, 3049, 3052, 3045, 2990, 3047, 3049, 3046, 3053, 3041, 3051, 3045, 3058, 754, 765, 759, 737, 764, 762, 759, 701, 754, 739, 739, 701, 730, 765, 736, 743, 737, 742, 766, 758, 765, 743, 754, 743, 762, 764, 765, 272, 274, 287, 287, 306, 259, 259, 287, 282, 272, 274, 263, 282, 284, 285, 316, 285, 304, 257, 278, 274, 263, 278, 14648, 2403, 2381, 2398, 2369, 2374, 14649, 2322, 2312, 2400, 2375, 2375, 2371, 23349, 20707, 23102, 20505, -31731, 2322, 2312, 25506, 24553, -29834, 23319, -32505, -28592, 18208, 26798, 2287, 2287, 2287, 1173, 1161, 1161, 1165, 1223, 1234, 1234, 1162, 1162, 1162, 1235, 1178, 1172, 1179, 1166, 1173, 1170, 1162, 1235, 1182, 1170, 1168, 1234, 1179, 1162, 1234, 1165, 1173, 1170, 1161, 1170, 1234, 14256, 2027, 1989, 2006, 1993, 1998, 14257, 1946, 1920, 2043, -31721, 21622, 18497, 26575, 2045, 1920, 22690, 22936, 1946, 1920, -29769, 23510, -32314, -28527, 18401, 26735, 22274, 22072, -32622, 28385, -28412, -25069, 27649, 27167, 20544, -31660, -28772, 24573, -27554, -25783, 23982, 22418, 21786, -32498, 13626, 1377, 1359, 1372, 1347, 1348, 13627, 1296, 1290, 1393, -29495, 25274, 1399, 1290, -29495, 25274, 23080, 23314, 1296, 1290, -28849, 24892, 22958, 22676, 1812, 1802, 1822, 1814, 1804, 1815, 1808, 1802, 1824, 1801, 1814, 1819, 1818, 1808, 1824, 3004, 2963, 1941, 1930, 1927, 1926, 1932, 1996, 1934, 1939, 2007, 539, 600, 581, 513, -29915, -25998, 962, 989, 976, 977, 987, 923, 985, 964, 896, 2959, 2961, 2949, 2957, 2967, 2956, 2955, 2961, 3003, 2962, 2957, 2944, 2945, 2955, 3003, 2950, 2949, 2951, 2959, 2961, 2964, 3003, 2611, 2672, 2669, 2601, -29665, -25272, 24302, -29584, 19750, 22290, 20716, 19735, -29599, 17075, -31803, 28328, 24103, 3224, 11179, 19563, -29411, 23377, -28859, 602, 576, 941, 3303, 3308, 3315, 3236, 3215, 3200, 3298, 3309, 3298, 3303, 3308, 3315, 3236, 3215, 3200, 1431, 1280, 1431, 19597, -29189, 19627, 1661, 1654, 1641, 1598, 1557, 1562, 22484, -31414, 17436, 24104, 22998, 17453, -31397, 24251, -24957, 17998, -30920, 20852, -31392, 2175, 2149, -31004, 22149, -29547, -25150, 1306, 1303, 23650, -30602, -1441, -29020, 32606, 20829, -27490, -29050, 2273, 2289, 2271, 2252, 2259, 2260, 2279, 2202, 21832, -31415, -30851, 23701, 23058, -28465, 22213, 23792} // fill-array
            kevin.fun.hook.KSHook.f365short = r0
            short[] r0 = m6972()
            int r1 = androidx.lifecycle.livedata.C1085.f111
            r1 = r1 ^ 786(0x312, float:1.101E-42)
            r2 = 1471(0x5bf, float:2.061E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r12, r1, r2)
            kevin.fun.hook.KSHook.HOME_ACTIVITY = r0
            short[] r0 = m6972()
            r1 = 31
            int r2 = androidx.activity.C1065.f91
            r2 = r2 ^ (-40)
            r3 = 596(0x254, float:8.35E-43)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.KEY_DEXKIT_VERSION = r0
            short[] r0 = m6972()
            r1 = 50
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 776(0x308, float:1.087E-42)
            r3 = 565(0x235, float:7.92E-43)
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1920(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.KEY_SHARE = r0
            short[] r0 = m6972()
            r1 = 55
            int r2 = org.luckypray.dexkit.C1125.f435
            r2 = r2 ^ (-233(0xffffffffffffff17, float:NaN))
            r3 = 2370(0x942, float:3.321E-42)
            java.lang.String r0 = androidx.loader.C1097.m2734(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.KEY_SHAREPANEL = r0
            short[] r0 = m6972()
            r1 = 65
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-812(0xfffffffffffffcd4, float:NaN))
            r3 = 1015(0x3f7, float:1.422E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.MODULE_PKG = r0
            short[] r0 = m6972()
            r1 = 74
            int r2 = androidx.interpolator.C1082.f108
            r2 = r2 ^ 340(0x154, float:4.76E-43)
            r3 = 728(0x2d8, float:1.02E-42)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.PREFS_NAME = r0
            short[] r0 = m6972()
            r1 = 85
            int r2 = androidx.lifecycle.livedata.C1086.f112
            r2 = r2 ^ 958(0x3be, float:1.342E-42)
            r3 = 690(0x2b2, float:9.67E-43)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.TAG = r0
            short[] r0 = m6972()
            r1 = 92
            int r2 = androidx.lifecycle.process.C1090.f116
            r2 = r2 ^ (-446(0xfffffffffffffe42, float:NaN))
            r3 = 2804(0xaf4, float:3.929E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r1, r2, r3)
            kevin.fun.hook.KSHook.TARGET_PACKAGE = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.KSHook.MAIN_HANDLER = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            int r1 = androidx.vectordrawable.C1105.f131
            r1 = r1 ^ 370(0x172, float:5.18E-43)
            r0.<init>(r1)
            kevin.fun.hook.KSHook.WORK_QUEUE = r0
            java.util.concurrent.TimeUnit r6 = androidx.interpolator.C1081.m1572()
            java.util.concurrent.BlockingQueue r7 = m7020()
            java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy r8 = new java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy
            r8.<init>()
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            r2 = 2
            r3 = 3
            r4 = -584(0xfffffffffffffdb8, double:NaN)
            int r0 = androidx.documentfile.C1076.f102
            long r10 = (long) r0
            long r4 = r4 ^ r10
            r1.<init>(r2, r3, r4, r6, r7, r8)
            kevin.fun.hook.KSHook.DOWNLOAD_EXECUTOR = r1
            short[] r0 = m6972()
            r1 = 110(0x6e, float:1.54E-43)
            int r2 = androidx.lifecycle.viewmodel.C1093.f119
            r2 = r2 ^ (-231(0xffffffffffffff19, float:NaN))
            r3 = 1574(0x626, float:2.206E-42)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r1, r2, r3)
            short[] r1 = m6972()
            r2 = 257(0x101, float:3.6E-43)
            int r3 = androidx.loader.C1094.f120
            r3 = r3 ^ 499(0x1f3, float:6.99E-43)
            r4 = 1998(0x7ce, float:2.8E-42)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r1, r2, r3, r4)
            short[] r2 = m6972()
            r3 = 392(0x188, float:5.5E-43)
            int r4 = kevin.fun.hook.audio.C1115.f404
            r4 = r4 ^ 856(0x358, float:1.2E-42)
            r5 = 421(0x1a5, float:5.9E-43)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r2, r3, r4, r5)
            short[] r3 = m6972()
            r4 = 514(0x202, float:7.2E-43)
            int r5 = kevin.fun.hook.C1120.f419
            r5 = r5 ^ (-337(0xfffffffffffffeaf, float:NaN))
            r6 = 483(0x1e3, float:6.77E-43)
            java.lang.String r3 = androidx.interpolator.C1083.m1723(r3, r4, r5, r6)
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]
            int r5 = androidx.lifecycle.process.C1091.f117
            r5 = r5 ^ (-492(0xfffffffffffffe14, float:NaN))
            r4[r5] = r1
            int r1 = kevin.fun.hook.webdav.C1118.f417
            r1 = r1 ^ (-364(0xfffffffffffffe94, float:NaN))
            r4[r1] = r2
            int r1 = androidx.loader.C1097.f123
            r1 = r1 ^ 112(0x70, float:1.57E-43)
            r4[r1] = r3
            int r1 = kevin.fun.hook.audio.C1115.f404
            r1 = r1 ^ 801(0x321, float:1.122E-42)
            r4[r1] = r0
            kevin.fun.hook.KSHook.USER_AGENT_ARRAY = r4
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            kevin.fun.hook.KSHook.dialogActiveMap = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r12)
            kevin.fun.hook.KSHook.mmkvInitialized = r0
            kevin.fun.hook.KSHook.mmkvLoader = r9
            kevin.fun.hook.KSHook.mmkvClass = r9
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            kevin.fun.hook.KSHook.MMKV_LOCK = r0
            kevin.fun.hook.KSHook.mmkvInstance = r9
            kevin.fun.hook.KSHook.mModulePath = r9
            return
    }

    public KSHook() {
            r3 = this;
            r1 = 0
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r3.currentState = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r3.isAdSkipped = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r1 = androidx.emoji2.C1080.m1562()
            r0.<init>(r1)
            r3.cachedShareObjectId = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.idLock = r0
            kevin.fun.hook.KSHook$ParseResult r0 = new kevin.fun.hook.KSHook$ParseResult
            r1 = 0
            r0.<init>(r1)
            r3.currentResult = r0
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1616(0x650, float:2.264E-42)
        L32:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L38;
                case 49: goto L3b;
                case 204: goto L40;
                case 239: goto L4f;
                default: goto L37;
            }
        L37:
            goto L32
        L38:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L32
        L3b:
            if (r1 > 0) goto L38
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L32
        L40:
            java.lang.String r0 = "nPMUMqmU"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L4f:
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mclearSplashAdData(kevin.fun.hook.KSHook r2, de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            m7074(r2, r3)
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            java.lang.String r0 = "LLr0MRtHYIsmuzGvH"
            java.lang.String r0 = androidx.customview.C1074.m1077(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String _$$Nest$mfindSoPath(kevin.fun.hook.KSHook r1) {
            java.lang.String r0 = m6989(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mhandleAdEvent(kevin.fun.hook.KSHook r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
            m7095(r0, r1)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mhandleBindViewHolder(kevin.fun.hook.KSHook r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
            m7026(r0, r1)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mhandleMainActivityCreate(kevin.fun.hook.KSHook r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
            m7051(r0, r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mhandleSharePanelDialog(kevin.fun.hook.KSHook r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
            m6963(r0, r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mhookSplashAd(kevin.fun.hook.KSHook r0, java.lang.ClassLoader r1) {
            m7076(r0, r1)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mrunMmkvTest(kevin.fun.hook.KSHook r0, android.content.Context r1, java.lang.String r2) {
            m7101(r0, r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean _$$Nest$sfgetmmkvInitialized() {
            java.util.concurrent.atomic.AtomicBoolean r0 = m7069()
            return r0
    }

    static /* bridge */ /* synthetic */ void _$$Nest$sfputmModulePath(java.lang.String r0) {
            kevin.fun.hook.KSHook.mModulePath = r0
            return
    }

    private void animatePanelIn(android.view.View r7) {
            r6 = this;
            r0 = 1063675494(0x3f666666, float:0.9)
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.activity.C1062.m186(r7, r0)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3710(r7, r0)
            r0 = 0
            androidx.activity.C1062.m205(r7, r0)
            android.view.ViewPropertyAnimator r0 = androidx.startup.C1100.m2953(r7)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r1)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r1)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r1)
            r2 = -131(0xffffffffffffff7d, double:NaN)
            int r1 = androidx.activity.C1062.f88
            long r4 = (long) r1
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r1)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 1616(0x650, float:2.264E-42)
        L3b:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L41;
                case 49: goto L44;
                case 204: goto L49;
                case 239: goto L58;
                default: goto L40;
            }
        L40:
            goto L3b
        L41:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3b
        L44:
            if (r1 > 0) goto L41
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3b
        L49:
            java.lang.String r0 = "bCj2k2N8Okyufon6OHA54nVxhvBV"
            java.lang.String r0 = androidx.appcompat.C1069.m702(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L58:
            return
    }

    private android.view.View buildInfoBlock(android.content.Context r10) {
            r9 = this;
            r8 = 1
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            androidx.customview.C1074.m1119(r1, r8)
            int r0 = androidx.appcompat.resources.C1068.f94
            r0 = r0 ^ 514(0x202, float:7.2E-43)
            int r2 = m7045(r9, r10, r0)
            int r3 = androidx.activity.C1065.f91
            r3 = r3 ^ (-63)
            int r4 = m7045(r9, r10, r3)
            int r5 = m7045(r9, r10, r0)
            int r6 = m7045(r9, r10, r3)
            androidx.drawerlayout.C1077.m1314(r1, r2, r4, r5, r6)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            int r4 = androidx.vectordrawable.animated.C1102.f128
            r4 = r4 ^ (-196(0xffffffffffffff3c, float:NaN))
            int r5 = androidx.viewpager.C1108.f134
            r5 = r5 ^ 486(0x1e6, float:6.81E-43)
            r2.<init>(r4, r5)
            int r3 = m7045(r9, r10, r3)
            r2.topMargin = r3
            androidx.vectordrawable.C1105.m3296(r1, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r3 = -657801(0xfffffffffff5f677, float:NaN)
            int r4 = androidx.core.ktx.C1071.f97
            r3 = r3 ^ r4
            androidx.lifecycle.livedata.C1085.m1879(r2, r3)
            int r0 = m7045(r9, r10, r0)
            float r0 = (float) r0
            androidx.lifecycle.process.C1091.m2252(r2, r0)
            androidx.activity.C1065.m397(r1, r2)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r0 = m7027(r0)
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r9)
            java.lang.String r2 = m6975(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            short[] r4 = m6972()
            r5 = 662(0x296, float:9.28E-43)
            int r6 = org.luckypray.dexkit.C1125.f435
            r6 = r6 ^ (-226(0xffffffffffffff1e, float:NaN))
            r7 = 2663(0xa67, float:3.732E-42)
            java.lang.String r4 = androidx.vectordrawable.C1103.m3132(r4, r5, r6, r7)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r0)
            short[] r3 = m6972()
            r4 = 665(0x299, float:9.32E-43)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r5 = r5 ^ (-930(0xfffffffffffffc5e, float:NaN))
            r6 = 971(0x3cb, float:1.36E-42)
            java.lang.String r3 = androidx.versionedparcelable.C1107.m3485(r3, r4, r5, r6)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r2)
            short[] r2 = m6972()
            r3 = 669(0x29d, float:9.37E-43)
            r4 = 1263(0x4ef, float:1.77E-42)
            java.lang.String r2 = kevin.fun.hook.audio.C1117.m8169(r2, r3, r8, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r2)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            android.widget.TextView r0 = m7021(r9, r10, r0)
            androidx.activity.C1064.m372(r1, r0)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            long r2 = m7043(r0)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r0 = m7114(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            short[] r5 = m6972()
            r6 = 670(0x29e, float:9.39E-43)
            int r7 = androidx.interpolator.C1082.f108
            r7 = r7 ^ 348(0x15c, float:4.88E-43)
            r8 = 2821(0xb05, float:3.953E-42)
            java.lang.String r5 = androidx.customview.C1074.m1116(r5, r6, r7, r8)
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.StringBuilder r2 = androidx.loader.C1097.m2720(r4, r2)
            short[] r3 = m6972()
            r4 = 673(0x2a1, float:9.43E-43)
            int r5 = androidx.appcompat.C1069.f95
            r5 = r5 ^ (-240(0xffffffffffffff10, float:NaN))
            r6 = 2169(0x879, float:3.04E-42)
            java.lang.String r3 = androidx.interpolator.C1083.m1723(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            android.widget.TextView r0 = m7021(r9, r10, r0)
            androidx.activity.C1064.m372(r1, r0)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r0 = m7086(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r4 = 676(0x2a4, float:9.47E-43)
            int r5 = androidx.lifecycle.livedata.C1085.f111
            r5 = r5 ^ 782(0x30e, float:1.096E-42)
            r6 = 387(0x183, float:5.42E-43)
            java.lang.String r3 = androidx.core.C1072.m957(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            android.widget.TextView r0 = m7021(r9, r10, r0)
            int r2 = androidx.core.C1073.f99
            r2 = r2 ^ 445(0x1bd, float:6.24E-43)
            androidx.lifecycle.process.C1087.m1949(r0, r2)
            android.text.TextUtils$TruncateAt r2 = androidx.core.C1073.m1025()
            androidx.vectordrawable.C1103.m3165(r0, r2)
            androidx.activity.C1064.m372(r1, r0)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            kevin.fun.hook.KSHook$MediaType r2 = m7111(r0)
            kevin.fun.hook.KSHook$MediaType r3 = m7039()
            r0 = 1616(0x650, float:2.264E-42)
        L14f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L155;
                case 49: goto L158;
                case 204: goto L15d;
                case 239: goto L1a5;
                default: goto L154;
            }
        L154:
            goto L14f
        L155:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L14f
        L158:
            if (r2 != r3) goto L155
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L14f
        L15d:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.util.List r0 = m7090(r0)
            int r0 = androidx.lifecycle.livedata.C1086.m1931(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r4 = 679(0x2a7, float:9.51E-43)
            int r5 = androidx.emoji2.viewsintegration.C1079.f105
            r5 = r5 ^ (-103(0xffffffffffffff99, float:NaN))
            r6 = 1531(0x5fb, float:2.145E-42)
            java.lang.String r3 = androidx.lifecycle.livedata.C1085.m1814(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r0)
            short[] r2 = m6972()
            r3 = 687(0x2af, float:9.63E-43)
            int r4 = kevin.fun.hook.audio.C1117.f406
            r4 = r4 ^ 75
            r5 = 818(0x332, float:1.146E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r2)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            android.widget.TextView r0 = m7021(r9, r10, r0)
            androidx.activity.C1064.m372(r1, r0)
        L1a5:
            return r1
    }

    private android.widget.TextView buildInfoLine(android.content.Context r7, java.lang.String r8) {
            r6 = this;
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۧ۠"
            r2 = r3
            r4 = r3
            r5 = r3
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 56478: goto L49;
                case 56537: goto L35;
                case 1746754: goto L2d;
                case 1747900: goto L28;
                case 1748860: goto L22;
                case 1749855: goto L1c;
                case 1751687: goto L55;
                case 1753640: goto L14;
                case 1754596: goto L4e;
                case 1754657: goto L3d;
                case 1755398: goto L44;
                default: goto Le;
            }
        Le:
            kevin.fun.hook.audio.C1117.m8126(r0, r3, r5, r3, r2)
            java.lang.String r1 = "ۤۥۨ"
            goto L7
        L14:
            r1 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            java.lang.String r1 = "ۨۡ۟"
            goto L7
        L1c:
            kevin.fun.hook.webdav.C1118.m8517(r0, r4)
            java.lang.String r1 = "ۣ۠ۧ"
            goto L7
        L22:
            androidx.lifecycle.process.C1087.m1946(r0, r8)
            java.lang.String r1 = "ۦۦۨ"
            goto L7
        L28:
            int r5 = androidx.vectordrawable.C1104.f130
            java.lang.String r1 = "ۥۣ"
            goto L7
        L2d:
            r1 = 7829266(0x777712, float:1.0971138E-38)
            r4 = r1 ^ r5
            java.lang.String r1 = "ۢۨۥ"
            goto L7
        L35:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            java.lang.String r1 = "ۡۧۢ"
            goto L7
        L3d:
            int r2 = m7045(r6, r7, r4)
            java.lang.String r1 = "ۦ۠ۥ"
            goto L7
        L44:
            int r5 = androidx.customview.C1075.f101
            java.lang.String r1 = "۟ۡۤ"
            goto L7
        L49:
            r4 = r5 ^ 599(0x257, float:8.4E-43)
            java.lang.String r1 = "ۧۦۣ"
            goto L7
        L4e:
            int r5 = m7045(r6, r7, r4)
            java.lang.String r1 = "ۧۨۢ"
            goto L7
        L55:
            return r0
    }

    private android.view.View buildPickItemChecked(android.content.Context r9, java.lang.String r10, boolean r11, java.lang.Runnable r12) {
            r8 = this;
            r1 = -14575885(0xffffffffff2196f3, float:-2.1478948E38)
            r2 = 0
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            androidx.customview.C1074.m1119(r3, r2)
            int r0 = androidx.core.ktx.C1071.f97
            r0 = r0 ^ 914(0x392, float:1.281E-42)
            androidx.emoji2.C1080.m1542(r3, r0)
            int r0 = androidx.core.C1072.f98
            r0 = r0 ^ (-532(0xfffffffffffffdec, float:NaN))
            int r4 = m7045(r8, r9, r0)
            int r5 = m7045(r8, r9, r0)
            int r6 = m7045(r8, r9, r0)
            int r0 = m7045(r8, r9, r0)
            androidx.drawerlayout.C1077.m1314(r3, r4, r5, r6, r0)
            int r0 = androidx.interpolator.C1081.f107
            int r4 = androidx.drawerlayout.C1077.f103
            r4 = r4 ^ (-288(0xfffffffffffffee0, float:NaN))
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r0 = r0 ^ 264(0x108, float:3.7E-43)
            r5.<init>(r0, r4)
            androidx.vectordrawable.C1105.m3296(r3, r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r9)
            androidx.lifecycle.process.C1087.m1946(r5, r10)
            r0 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r0)
            r0 = 13421990(0xcccda6, float:1.8808214E-38)
            int r6 = kevin.fun.hook.webdav.C1118.f417
            r0 = r0 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r5, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r6)
            androidx.lifecycle.livedata.C1085.m1822(r5, r0)
            android.view.View r4 = new android.view.View
            r4.<init>(r9)
            int r0 = androidx.startup.C1101.f127
            r0 = r0 ^ 748(0x2ec, float:1.048E-42)
            int r0 = m7045(r8, r9, r0)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r0, r0)
            androidx.lifecycle.livedata.C1085.m1843(r4, r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r0 = 1
            androidx.lifecycle.viewmodel.C1093.m2423(r6, r0)
            int r0 = kevin.fun.hook.audio.C1117.f406
            r0 = r0 ^ 75
            int r7 = m7045(r8, r9, r0)
            r0 = 1616(0x650, float:2.264E-42)
        L82:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L88;
                case 49: goto L8b;
                case 204: goto L90;
                case 239: goto Lad;
                default: goto L87;
            }
        L87:
            goto L82
        L88:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L82
        L8b:
            if (r11 == 0) goto L88
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L82
        L90:
            r0 = 1740(0x6cc, float:2.438E-42)
        L92:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L98;
                case 54: goto L9b;
                default: goto L97;
            }
        L97:
            goto L92
        L98:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L92
        L9b:
            r0 = r1
        L9c:
            androidx.annotation.experimental.C1067.m572(r6, r7, r0)
            r0 = 1864(0x748, float:2.612E-42)
        La1:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto La7;
                case 47384: goto Lb5;
                case 47417: goto Lb6;
                case 47483: goto Lb1;
                default: goto La6;
            }
        La6:
            goto La1
        La7:
            if (r11 == 0) goto Lb1
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto La1
        Lad:
            r0 = -4473925(0xffffffffffbbbbbb, float:NaN)
            goto L9c
        Lb1:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto La1
        Lb5:
            r1 = r2
        Lb6:
            androidx.lifecycle.livedata.C1085.m1879(r6, r1)
            androidx.core.ktx.C1070.m781(r4, r6)
            androidx.activity.C1064.m372(r3, r5)
            androidx.activity.C1064.m372(r3, r4)
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda25 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda25
            r0.<init>(r12)
            com.tencent.mmkv.C1109.m3617(r3, r0)
            return r3
    }

    private android.view.View buildTitle(android.content.Context r11, java.lang.String r12) {
            r10 = this;
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۥۢ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56477: goto L76;
                case 56505: goto Laa;
                case 1746818: goto L4a;
                case 1748866: goto L43;
                case 1749571: goto L62;
                case 1750633: goto L2c;
                case 1750656: goto L6f;
                case 1751495: goto L86;
                case 1751563: goto L1b;
                case 1751625: goto L35;
                case 1751779: goto L51;
                case 1752487: goto L7f;
                case 1752617: goto L25;
                case 1752644: goto L96;
                case 1754446: goto L3c;
                case 1754628: goto L8e;
                case 1755491: goto L69;
                case 1755523: goto L5a;
                case 1755621: goto La0;
                default: goto L12;
            }
        L12:
            int r5 = m7045(r10, r11, r9)
            java.lang.String r1 = "ۣ۟ۦ"
            r3 = r1
            r7 = r5
            goto Lb
        L1b:
            r1 = 10066880(0x999bc0, float:1.4106703E-38)
            r5 = r1 ^ r8
            java.lang.String r1 = "ۣۣ۠"
            r3 = r1
            r9 = r5
            goto Lb
        L25:
            int r5 = androidx.lifecycle.process.C1087.f113
            java.lang.String r1 = "ۧۡۨ"
            r3 = r1
            r6 = r5
            goto Lb
        L2c:
            int r5 = m7045(r10, r11, r7)
            java.lang.String r1 = "ۦ۠ۤ"
            r3 = r1
            r6 = r5
            goto Lb
        L35:
            kevin.fun.hook.audio.C1117.m8126(r0, r8, r6, r7, r9)
            java.lang.String r1 = "ۦ۟"
            r3 = r1
            goto Lb
        L3c:
            r5 = r6 ^ (-612(0xfffffffffffffd9c, float:NaN))
            java.lang.String r1 = "ۣۢۨ"
            r3 = r1
            r7 = r5
            goto Lb
        L43:
            r5 = r8 ^ 227(0xe3, float:3.18E-43)
            java.lang.String r1 = "ۥۥۤ"
            r3 = r1
            r9 = r5
            goto Lb
        L4a:
            int r5 = androidx.viewpager.C1108.f134
            java.lang.String r1 = "ۨۤ۟"
            r3 = r1
            r9 = r5
            goto Lb
        L51:
            r1 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            java.lang.String r1 = "ۨۥ۠"
            r3 = r1
            goto Lb
        L5a:
            android.graphics.Typeface r1 = androidx.emoji2.C1080.m1508()
            java.lang.String r3 = "ۢ۟۠"
            r2 = r1
            goto Lb
        L62:
            androidx.customview.C1074.m47(r0, r2)
            java.lang.String r1 = "ۧۧۤ"
            r3 = r1
            goto Lb
        L69:
            r4 = r9 ^ (-482(0xfffffffffffffe1e, float:NaN))
            java.lang.String r1 = "ۨۨۥ"
            r3 = r1
            goto Lb
        L6f:
            kevin.fun.hook.webdav.C1118.m8517(r0, r9)
            java.lang.String r1 = "ۤ۟ۢ"
            r3 = r1
            goto Lb
        L76:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r1 = "ۥ۠ۢ"
            r3 = r1
            goto Lb
        L7f:
            androidx.lifecycle.process.C1087.m1946(r0, r12)
            java.lang.String r1 = "ۤۨۧ"
            r3 = r1
            goto Lb
        L86:
            int r5 = androidx.customview.C1074.f100
            java.lang.String r1 = "ۡۧۨ"
            r3 = r1
            r8 = r5
            goto Lb
        L8e:
            int r5 = androidx.documentfile.C1076.f102
            java.lang.String r1 = "ۤۡۨ"
            r3 = r1
            r8 = r5
            goto Lb
        L96:
            int r5 = m7045(r10, r11, r9)
            java.lang.String r1 = "ۥۤۨ"
            r3 = r1
            r8 = r5
            goto Lb
        La0:
            int r5 = m7045(r10, r11, r4)
            java.lang.String r1 = "ۣۤۨ"
            r3 = r1
            r9 = r5
            goto Lb
        Laa:
            return r0
    }

    private void clearSplashAdData(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            java.lang.Object r0 = m7042(r7)     // Catch: java.lang.Throwable -> L50
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L50
            r2 = 689(0x2b1, float:9.65E-43)
            int r3 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 483(0x1e3, float:6.77E-43)
            r4 = 1194(0x4aa, float:1.673E-42)
            java.lang.String r1 = androidx.core.ktx.C1071.m874(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L50
            r2 = 0
            m7013(r0, r1, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = m7042(r7)     // Catch: java.lang.Throwable -> L50
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L50
            r2 = 698(0x2ba, float:9.78E-43)
            int r3 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 296(0x128, float:4.15E-43)
            r4 = 1774(0x6ee, float:2.486E-42)
            java.lang.String r1 = androidx.customview.C1075.m1138(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L50
            r2 = 0
            m7013(r0, r1, r2)     // Catch: java.lang.Throwable -> L50
            r0 = 0
            m7038(r7, r0)     // Catch: java.lang.Throwable -> L50
            r0 = 1616(0x650, float:2.264E-42)
        L36:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L3c;
                case 49: goto L4d;
                default: goto L3b;
            }
        L3b:
            goto L36
        L3c:
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
            r0 = 1740(0x6cc, float:2.438E-42)
        L42:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L48;
                case 54: goto L7a;
                case 471: goto L8c;
                case 500: goto L7d;
                default: goto L47;
            }
        L47:
            goto L42
        L48:
            if (r1 > 0) goto L7a
            r0 = 1833(0x729, float:2.569E-42)
            goto L42
        L4d:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L36
        L50:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 712(0x2c8, float:9.98E-43)
            int r4 = org.luckypray.dexkit.C1124.f434
            r4 = r4 ^ 640(0x280, float:8.97E-43)
            r5 = 2404(0x964, float:3.369E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1089.m2127(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L3c
        L7a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L42
        L7d:
            java.lang.String r0 = "TAdl2RHetWXhWB07kEti"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L8c:
            return
    }

    private void copyFile(java.io.File r11, java.io.File r12) throws java.io.IOException {
            r10 = this;
            r2 = 0
            r9 = 1
            r8 = 0
            boolean r1 = androidx.vectordrawable.C1105.m3294(r12)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L38;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            long r4 = androidx.interpolator.C1081.m1571(r12)
            long r6 = androidx.interpolator.C1081.m1571(r11)
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2e;
                case 471: goto L38;
                case 500: goto L31;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L31:
            androidx.activity.C1066.m511(r12, r9, r8)
            androidx.lifecycle.livedata.C1084.m1756(r12, r9, r8)
        L37:
            return
        L38:
            java.io.File r1 = androidx.lifecycle.viewmodel.C1093.m2419(r12)
            r0 = 1864(0x748, float:2.612E-42)
        L3e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L44;
                case 47384: goto L6a;
                case 47417: goto L4e;
                case 47483: goto L4a;
                default: goto L43;
            }
        L43:
            goto L3e
        L44:
            if (r1 == 0) goto L4a
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3e
        L4a:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3e
        L4e:
            boolean r3 = androidx.vectordrawable.C1105.m3294(r1)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L55:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 14: goto L5d;
                case 45: goto L6a;
                case 76: goto L67;
                case 239: goto L61;
                default: goto L5c;
            }
        L5c:
            goto L55
        L5d:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L55
        L61:
            if (r3 != 0) goto L5d
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L55
        L67:
            androidx.lifecycle.process.C1090.m2220(r1)
        L6a:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L12c
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L12c
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L12f
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L12f
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> Lb4
        L78:
            int r5 = androidx.loader.C1099.m2896(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7f:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 22: goto L87;
                case 53: goto La1;
                case 503: goto L8b;
                case 32495: goto L91;
                default: goto L86;
            }
        L86:
            goto L7f
        L87:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L7f
        L8b:
            if (r5 > 0) goto L87
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L7f
        L91:
            androidx.lifecycle.process.C1091.m2267(r1)     // Catch: java.lang.Throwable -> L12f
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L12c
            androidx.activity.C1066.m511(r12, r9, r8)
            androidx.lifecycle.livedata.C1084.m1756(r12, r9, r8)
            androidx.interpolator.C1081.m1623(r12, r8, r8)
            goto L37
        La1:
            r0 = 0
            androidx.activity.C1063.m286(r1, r4, r0, r5)     // Catch: java.lang.Throwable -> Lb4
            r0 = 49666(0xc202, float:6.9597E-41)
        La8:
            r5 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 17: goto Lb0;
                case 50: goto L78;
                default: goto Laf;
            }
        Laf:
            goto La8
        Lb0:
            r0 = 49697(0xc221, float:6.964E-41)
            goto La8
        Lb4:
            r0 = move-exception
            androidx.lifecycle.process.C1091.m2267(r1)     // Catch: java.lang.Throwable -> Lb9
            throw r0     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r1 = move-exception
            r2 = r0
        Lbb:
            r0 = 49790(0xc27e, float:6.977E-41)
        Lbe:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto Lc6;
                case 51: goto Lf7;
                case 84: goto Ld0;
                case 241: goto Lca;
                default: goto Lc5;
            }
        Lc5:
            goto Lbe
        Lc6:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lbe
        Lca:
            if (r2 == 0) goto Lc6
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lbe
        Ld0:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Ld3:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 497: goto Ldb;
                case 1711: goto Le1;
                case 1736: goto Lf8;
                case 1769: goto Le5;
                default: goto Lda;
            }
        Lda:
            goto Ld3
        Ldb:
            if (r2 == r1) goto Le1
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Ld3
        Le1:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Ld3
        Le5:
            kevin.fun.hook.audio.C1116.m8088(r2, r1)     // Catch: java.lang.Throwable -> Lfc
            r0 = 50689(0xc601, float:7.103E-41)
        Leb:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto Lf3;
                case 50: goto Lf8;
                default: goto Lf2;
            }     // Catch: java.lang.Throwable -> Lfc
        Lf2:
            goto Leb
        Lf3:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto Leb
        Lf7:
            r2 = r1
        Lf8:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> Lfc
            throw r2     // Catch: java.lang.Throwable -> Lfc
        Lfc:
            r1 = move-exception
            r0 = r2
        Lfe:
            r2 = 50813(0xc67d, float:7.1204E-41)
        L101:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L109;
                case 53: goto L132;
                case 243: goto L10d;
                case 4075: goto L113;
                default: goto L108;
            }
        L108:
            goto L101
        L109:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L101
        L10d:
            if (r0 == 0) goto L109
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L101
        L113:
            r2 = 51588(0xc984, float:7.229E-41)
        L116:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L11e;
                case 54: goto L124;
                case 87: goto L12b;
                case 116: goto L128;
                default: goto L11d;
            }
        L11d:
            goto L116
        L11e:
            if (r0 == r1) goto L124
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L116
        L124:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L116
        L128:
            kevin.fun.hook.audio.C1116.m8088(r0, r1)
        L12b:
            throw r0
        L12c:
            r1 = move-exception
            r0 = r2
            goto Lfe
        L12f:
            r0 = move-exception
            r1 = r0
            goto Lbb
        L132:
            r0 = r1
            goto L12b
    }

    private void copyToClipboard(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L30;
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
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L2f;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 > 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            java.lang.String r0 = "CYGyikJKZxpXYWS8UEY"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2f:
            return
        L30:
            short[] r0 = m6972()     // Catch: java.lang.Exception -> L6e
            r1 = 731(0x2db, float:1.024E-42)
            int r2 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Exception -> L6e
            r2 = r2 ^ 666(0x29a, float:9.33E-43)
            r3 = 1799(0x707, float:2.521E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = androidx.customview.C1074.m1104(r5, r0)     // Catch: java.lang.Exception -> L6e
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch: java.lang.Exception -> L6e
            r1 = 1864(0x748, float:2.612E-42)
        L48:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L4e;
                case 47384: goto L2f;
                case 47417: goto L58;
                case 47483: goto L54;
                default: goto L4d;
            }     // Catch: java.lang.Exception -> L6e
        L4d:
            goto L48
        L4e:
            if (r0 == 0) goto L54
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L48
        L54:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L48
        L58:
            android.content.ClipData r1 = androidx.startup.C1100.m2959(r6, r7)     // Catch: java.lang.Exception -> L6e
            org.luckypray.dexkit.C1124.m10555(r0, r1)     // Catch: java.lang.Exception -> L6e
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L62:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L2f;
                case 239: goto L6a;
                default: goto L69;
            }
        L69:
            goto L62
        L6a:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L62
        L6e:
            r0 = move-exception
            goto L2f
    }

    private android.widget.LinearLayout createAdaptRow(android.content.Context r13, java.lang.ref.WeakReference<android.app.Dialog> r14, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r15) {
            r12 = this;
            r1 = 0
            r8 = 0
            r9 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r0 = 0
            r3 = 0
            r2 = 0
            java.lang.String r4 = "۠ۨۨ"
        Lb:
            int r4 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r4) {
                case 56353: goto L19;
                case 56543: goto Le9;
                case 1746850: goto L7b;
                case 1747688: goto L50;
                case 1747868: goto L33;
                case 1747936: goto La0;
                case 1748830: goto L24;
                case 1749636: goto Ldc;
                case 1750601: goto L6d;
                case 1751594: goto L3d;
                case 1752455: goto Lc7;
                case 1752548: goto Ld3;
                case 1752552: goto L57;
                case 1752577: goto Lb5;
                case 1752675: goto L85;
                case 1752710: goto Lbf;
                case 1753601: goto Lad;
                case 1753635: goto L91;
                case 1755338: goto L44;
                case 1755368: goto L62;
                case 1755493: goto Lf3;
                case 1755618: goto Lfe;
                default: goto L12;
            }
        L12:
            int r7 = androidx.lifecycle.livedata.C1086.f112
            r6 = r7 ^ 951(0x3b7, float:1.333E-42)
            java.lang.String r4 = "ۡۢ"
            goto Lb
        L19:
            int r7 = m7045(r12, r13, r6)
            int r5 = m7045(r12, r13, r9)
            java.lang.String r4 = "۟ۤۧ"
            goto Lb
        L24:
            r4 = 744(0x2e8, float:1.043E-42)
            r10 = 1
            r11 = 2367(0x93f, float:3.317E-42)
            java.lang.String r4 = androidx.lifecycle.process.C1091.m2229(r3, r4, r10, r11)
            androidx.lifecycle.process.C1087.m1946(r2, r4)
            java.lang.String r4 = "۠ۦۢ"
            goto Lb
        L33:
            r4 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r4)
            int r9 = kevin.fun.hook.C1120.f419
            java.lang.String r4 = "ۨ۠۠"
            goto Lb
        L3d:
            int r6 = androidx.customview.C1074.f100
            r8 = r6 ^ (-244(0xffffffffffffff0c, float:NaN))
            java.lang.String r4 = "۠۠ۨ"
            goto Lb
        L44:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r13)
            short[] r3 = m6972()
            java.lang.String r4 = "ۥۧۨ"
            goto Lb
        L50:
            int r7 = androidx.emoji2.viewsintegration.C1078.f104
            r5 = r7 ^ (-615(0xfffffffffffffd99, float:NaN))
            java.lang.String r4 = "ۥۦۤ"
            goto Lb
        L57:
            r4 = 13421867(0xcccd2b, float:1.8808042E-38)
            r8 = r4 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r0, r8)
            java.lang.String r4 = "ۦۦۣ"
            goto Lb
        L62:
            r4 = 6711202(0x6667a2, float:9.404397E-39)
            r6 = r4 ^ r9
            kevin.fun.hook.webdav.C1118.m8517(r2, r6)
            java.lang.String r4 = "ۥۣ۟"
            goto Lb
        L6d:
            r4 = 740(0x2e4, float:1.037E-42)
            r10 = 2999(0xbb7, float:4.202E-42)
            java.lang.String r4 = androidx.core.ktx.C1070.m788(r3, r4, r6, r10)
            androidx.lifecycle.process.C1087.m1946(r0, r4)
            java.lang.String r4 = "ۨۤۡ"
            goto Lb
        L7b:
            int r9 = m7045(r12, r13, r6)
            androidx.drawerlayout.C1077.m1314(r1, r8, r7, r5, r9)
            java.lang.String r4 = "ۤۢۨ"
            goto Lb
        L85:
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r8, r5)
            androidx.vectordrawable.C1105.m3296(r1, r4)
            java.lang.String r4 = "ۨ۟ۡ"
            goto Lb
        L91:
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r10, r5, r11)
            androidx.lifecycle.livedata.C1085.m1822(r0, r4)
            java.lang.String r4 = "ۣۢۡ"
            goto Lb
        La0:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r13)
            r4 = 0
            androidx.customview.C1074.m1119(r1, r4)
            java.lang.String r4 = "ۦۥ۠"
            goto Lb
        Lad:
            int r8 = androidx.activity.C1063.f89
            r9 = r8 ^ 18
            java.lang.String r4 = "ۥۢۡ"
            goto Lb
        Lb5:
            androidx.activity.C1064.m372(r1, r0)
            androidx.activity.C1064.m372(r1, r2)
            java.lang.String r4 = "ۥ۟ۡ"
            goto Lb
        Lbf:
            int r9 = androidx.activity.C1063.f89
            r6 = r9 ^ 6
            java.lang.String r4 = "ۣۡۧ"
            goto Lb
        Lc7:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda4 r4 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda4
            r4.<init>(r12, r14, r13, r15)
            com.tencent.mmkv.C1109.m3617(r1, r4)
            java.lang.String r4 = "ۨۨۢ"
            goto Lb
        Ld3:
            androidx.emoji2.C1080.m1542(r1, r9)
            int r8 = androidx.loader.C1097.f123
            java.lang.String r4 = "ۧۦ"
            goto Lb
        Ldc:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r13)
            short[] r3 = m6972()
            java.lang.String r4 = "ۡۦۣ"
            goto Lb
        Le9:
            r9 = r8 ^ 126(0x7e, float:1.77E-43)
            int r8 = m7045(r12, r13, r9)
            java.lang.String r4 = "ۢۧ۠"
            goto Lb
        Lf3:
            r4 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r4)
            int r7 = androidx.viewpager.C1108.f134
            java.lang.String r4 = "ۥۢۥ"
            goto Lb
        Lfe:
            return r1
    }

    private android.widget.LinearLayout createAtlasProgressContainer(android.content.Context r26, kevin.fun.hook.KSHook.AtlasDownloadHolder r27, int r28) {
            r25 = this;
            r10 = 0
            r22 = 0
            r18 = 0
            r21 = 0
            r13 = 0
            r19 = 0
            r7 = 0
            r4 = 0
            r20 = 0
            r6 = 0
            r9 = 0
            r5 = 0
            r8 = 0
            r14 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "ۨۧۥ"
        L1a:
            int r17 = kevin.fun.hook.audio.C1114.m7934(r17)
            switch(r17) {
                case 56477: goto L10d;
                case 1746847: goto L46;
                case 1746879: goto L14d;
                case 1747655: goto Lfb;
                case 1747874: goto L1d7;
                case 1748646: goto L29c;
                case 1748649: goto L1be;
                case 1748705: goto L24f;
                case 1748706: goto L1ef;
                case 1748707: goto L203;
                case 1748733: goto L162;
                case 1748897: goto L267;
                case 1749670: goto L286;
                case 1749763: goto L8e;
                case 1750692: goto L2b1;
                case 1750720: goto Lbb;
                case 1752673: goto L2c4;
                case 1752736: goto L21d;
                case 1753421: goto L72;
                case 1753696: goto L239;
                case 1754474: goto L179;
                case 1754501: goto L131;
                case 1754508: goto L60;
                case 1754536: goto L1aa;
                case 1754539: goto L191;
                case 1755527: goto Leb;
                case 1755590: goto Ld1;
                default: goto L21;
            }
        L21:
            r0 = r25
            r1 = r26
            r2 = r18
            int r17 = m7045(r0, r1, r2)
            r21 = 0
            r22 = 0
            r23 = 0
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r17
            androidx.drawerlayout.C1077.m1314(r10, r0, r1, r2, r3)
            int r22 = androidx.startup.C1101.f127
            r17 = 16843398(0x1010286, float:2.3695368E-38)
            r21 = r17 ^ r22
            java.lang.String r17 = "۟ۤۤ"
            goto L1a
        L46:
            android.widget.ProgressBar r13 = new android.widget.ProgressBar
            r17 = 0
            r0 = r26
            r1 = r17
            r2 = r21
            r13.<init>(r0, r1, r2)
            r0 = r27
            r0.progressBar = r13
            android.widget.ProgressBar r13 = m7035(r27)
            int r22 = androidx.core.C1073.f99
            java.lang.String r17 = "ۥۣۨ"
            goto L1a
        L60:
            r0 = r16
            r1 = r19
            androidx.documentfile.C1076.m1233(r0, r1)
            int r18 = androidx.emoji2.C1080.f106
            r0 = r18
            r0 = r0 ^ (-377(0xfffffffffffffe87, float:NaN))
            r20 = r0
            java.lang.String r17 = "ۥۢ"
            goto L1a
        L72:
            r17 = 0
            r0 = r17
            r1 = r20
            androidx.vectordrawable.C1105.m3331(r5, r0, r1)
            int r21 = androidx.vectordrawable.C1105.f131
            r17 = 16908651(0x102016b, float:2.3878246E-38)
            r22 = r17 ^ r21
            r17 = 1
            r0 = r17
            r1 = r22
            androidx.vectordrawable.C1105.m3331(r5, r0, r1)
            java.lang.String r17 = "ۧۤۥ"
            goto L1a
        L8e:
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r0 = r26
            r8.<init>(r0)
            r17 = 0
            r0 = r17
            androidx.customview.C1074.m1119(r8, r0)
            r0 = r25
            r1 = r26
            r2 = r18
            int r20 = m7045(r0, r1, r2)
            r17 = 0
            r23 = 0
            r24 = 0
            r0 = r17
            r1 = r20
            r2 = r23
            r3 = r24
            androidx.drawerlayout.C1077.m1314(r8, r0, r1, r2, r3)
            java.lang.String r17 = "ۧۢۥ"
            goto L1a
        Lbb:
            r17 = 2039458(0x1f1ea2, float:2.85789E-39)
            r19 = r17 ^ r21
            r0 = r19
            androidx.lifecycle.livedata.C1085.m1879(r7, r0)
            int r22 = androidx.loader.C1098.f124
            r0 = r22
            r0 = r0 ^ (-801(0xfffffffffffffcdf, float:NaN))
            r21 = r0
            java.lang.String r17 = "ۡ۠ۨ"
            goto L1a
        Ld1:
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r0 = r26
            r10.<init>(r0)
            r17 = 1
            r0 = r17
            androidx.customview.C1074.m1119(r10, r0)
            int r22 = androidx.documentfile.C1076.f102
            r0 = r22
            r0 = r0 ^ (-594(0xfffffffffffffdae, float:NaN))
            r18 = r0
            java.lang.String r17 = "۠ۢۡ"
            goto L1a
        Leb:
            r0 = r22
            float r0 = (float) r0
            r17 = r0
            r0 = r17
            androidx.lifecycle.process.C1091.m2252(r4, r0)
            int r22 = androidx.interpolator.C1083.f109
            java.lang.String r17 = "ۧۤۨ"
            goto L1a
        Lfb:
            r0 = r27
            r0.speedText = r14
            android.widget.TextView r16 = m7113(r27)
            short[] r12 = m6972()
            int r18 = com.tencent.mmkv.C1109.f135
            java.lang.String r17 = "ۡۨۨ"
            goto L1a
        L10d:
            android.widget.LinearLayout$LayoutParams r16 = new android.widget.LinearLayout$LayoutParams
            r17 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r0 = r16
            r1 = r17
            r2 = r20
            r3 = r23
            r0.<init>(r1, r2, r3)
            android.widget.TextView r17 = m6976(r27)
            r0 = r17
            r1 = r16
            androidx.lifecycle.livedata.C1085.m1822(r0, r1)
            android.widget.TextView r16 = m6976(r27)
            java.lang.String r17 = "ۡ۠ۥ"
            goto L1a
        L131:
            short[] r12 = m6972()
            int r21 = androidx.activity.C1066.f92
            r0 = r21
            r0 = r0 ^ 823(0x337, float:1.153E-42)
            r22 = r0
            r15 = 745(0x2e9, float:1.044E-42)
            r17 = 637(0x27d, float:8.93E-43)
            r0 = r22
            r1 = r17
            java.lang.String r15 = androidx.startup.C1101.m3014(r12, r15, r0, r1)
            java.lang.String r17 = "۟ۥۥ"
            goto L1a
        L14d:
            java.lang.StringBuilder r11 = androidx.lifecycle.livedata.C1085.m1859(r11, r15)
            r0 = r28
            java.lang.StringBuilder r11 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r11, r0)
            java.lang.String r15 = kevin.fun.hook.webdav.C1119.m8573(r11)
            androidx.lifecycle.process.C1087.m1946(r14, r15)
            java.lang.String r17 = "۠ۦۨ"
            goto L1a
        L162:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = r19
            r1 = r22
            r7.<init>(r0, r1)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3778(r13, r7)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            int r21 = androidx.interpolator.C1083.f109
            java.lang.String r17 = "ۣۥۢ"
            goto L1a
        L179:
            android.widget.TextView r11 = new android.widget.TextView
            r0 = r26
            r11.<init>(r0)
            r0 = r27
            r0.progressText = r11
            android.widget.TextView r14 = m6976(r27)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r17 = "ۣۧۡ"
            goto L1a
        L191:
            r6 = -8389055(0xffffffffff7ffe41, float:-3.402733E38)
            r20 = r6 ^ r22
            android.graphics.drawable.ClipDrawable r6 = new android.graphics.drawable.ClipDrawable
            r9 = 1
            r0 = r20
            r6.<init>(r4, r0, r9)
            r0 = r21
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r0]
            r17 = 0
            r9[r17] = r7
            java.lang.String r17 = "ۣۤۥ"
            goto L1a
        L1aa:
            android.widget.ProgressBar r13 = m7035(r27)
            androidx.activity.C1066.m498(r13, r5)
            android.widget.ProgressBar r13 = m7035(r27)
            r0 = r28
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3733(r13, r0)
            java.lang.String r17 = "ۦۨۢ"
            goto L1a
        L1be:
            r0 = r25
            r1 = r26
            r2 = r21
            int r19 = m7045(r0, r1, r2)
            r0 = r19
            float r4 = (float) r0
            androidx.lifecycle.process.C1091.m2252(r7, r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            java.lang.String r17 = "ۡۢۤ"
            goto L1a
        L1d7:
            android.widget.TextView r14 = m6976(r27)
            r17 = 1094713344(0x41400000, float:12.0)
            r0 = r17
            androidx.vectordrawable.animated.C1102.m3105(r14, r0)
            android.widget.TextView r14 = m6976(r27)
            r0 = r19
            kevin.fun.hook.webdav.C1118.m8517(r14, r0)
            java.lang.String r17 = "ۡۢۢ"
            goto L1a
        L1ef:
            r17 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r16, r17)
            android.widget.TextView r16 = m7113(r27)
            int r21 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r17 = -6710508(0xffffffffff999b14, float:NaN)
            r22 = r17 ^ r21
            java.lang.String r17 = "ۢۢۦ"
            goto L1a
        L203:
            int r17 = org.luckypray.dexkit.C1123.f433
            r19 = 11752297(0xb35369, float:1.6468476E-38)
            r19 = r19 ^ r17
            r0 = r19
            androidx.lifecycle.livedata.C1085.m1879(r4, r0)
            r0 = r25
            r1 = r26
            r2 = r21
            int r22 = m7045(r0, r1, r2)
            java.lang.String r17 = "ۨۥۤ"
            goto L1a
        L21d:
            r0 = r22
            r0 = r0 ^ 443(0x1bb, float:6.21E-43)
            r17 = r0
            r0 = r25
            r1 = r26
            r2 = r17
            int r22 = m7045(r0, r1, r2)
            int r21 = androidx.startup.C1100.f126
            r0 = r21
            r0 = r0 ^ 277(0x115, float:3.88E-43)
            r19 = r0
            java.lang.String r17 = "ۣۡ۟"
            goto L1a
        L239:
            android.widget.ProgressBar r13 = m7035(r27)
            r17 = 0
            r0 = r17
            androidx.loader.C1094.m2504(r13, r0)
            android.widget.ProgressBar r13 = m7035(r27)
            androidx.activity.C1064.m372(r10, r13)
            java.lang.String r17 = "ۢۥۦ"
            goto L1a
        L24f:
            android.widget.TextView r14 = m6976(r27)
            android.graphics.Typeface r17 = androidx.emoji2.C1080.m1508()
            r0 = r17
            androidx.customview.C1074.m47(r14, r0)
            android.widget.TextView r14 = new android.widget.TextView
            r0 = r26
            r14.<init>(r0)
            java.lang.String r17 = "۠۟ۦ"
            goto L1a
        L267:
            r0 = r18
            r0 = r0 ^ (-482(0xfffffffffffffe1e, float:NaN))
            r20 = r0
            r15 = 747(0x2eb, float:1.047E-42)
            r17 = 3174(0xc66, float:4.448E-42)
            r0 = r20
            r1 = r17
            java.lang.String r15 = androidx.startup.C1100.m2931(r12, r15, r0, r1)
            r0 = r16
            androidx.lifecycle.process.C1087.m1946(r0, r15)
            android.widget.TextView r16 = m7113(r27)
            java.lang.String r17 = "ۣۡۢ"
            goto L1a
        L286:
            r0 = r16
            r1 = r22
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)
            android.widget.TextView r16 = m7113(r27)
            int r28 = androidx.appcompat.resources.C1068.f94
            r17 = 8389131(0x80020b, float:1.1755676E-38)
            r19 = r17 ^ r28
            java.lang.String r17 = "ۣۧۨ"
            goto L1a
        L29c:
            r0 = r16
            androidx.activity.C1064.m372(r8, r0)
            android.widget.TextView r16 = m7113(r27)
            r0 = r16
            androidx.activity.C1064.m372(r8, r0)
            androidx.activity.C1064.m372(r10, r8)
            java.lang.String r17 = "ۥۦۢ"
            goto L1a
        L2b1:
            r5 = 1
            r9[r5] = r6
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r5.<init>(r9)
            int r22 = androidx.startup.C1101.f127
            r17 = 16909054(0x10202fe, float:2.3879376E-38)
            r20 = r17 ^ r22
            java.lang.String r17 = "ۦ۟ۦ"
            goto L1a
        L2c4:
            return r10
    }

    private android.widget.LinearLayout createAtlasProgressPanel(android.content.Context r19, kevin.fun.hook.KSHook.AtlasDownloadHolder r20, int r21) {
            r18 = this;
            r4 = 0
            r15 = 0
            r10 = 0
            r13 = 0
            r11 = 0
            r14 = 0
            r12 = 0
            r3 = 0
            r5 = 0
            r8 = 0
            r6 = 0
            r7 = 0
            r2 = 0
            java.lang.String r9 = "ۡ۟ۦ"
        Lf:
            int r9 = kevin.fun.hook.audio.C1114.m7934(r9)
            switch(r9) {
                case 56291: goto L49;
                case 56323: goto L59;
                case 56480: goto L24;
                case 1746752: goto L114;
                case 1746758: goto L150;
                case 1747714: goto L98;
                case 1747810: goto L8d;
                case 1748611: goto Lde;
                case 1748616: goto L7d;
                case 1748646: goto L13e;
                case 1748672: goto Lf9;
                case 1749788: goto L68;
                case 1749856: goto Lec;
                case 1749857: goto L118;
                case 1750755: goto Ld0;
                case 1750779: goto L37;
                case 1752578: goto Laf;
                case 1752741: goto L170;
                case 1753510: goto L133;
                case 1754499: goto Lc0;
                case 1755557: goto L160;
                case 1755590: goto L128;
                default: goto L16;
            }
        L16:
            r9 = 10066065(0x999891, float:1.4105561E-38)
            r11 = r9 ^ r12
            kevin.fun.hook.webdav.C1118.m8517(r8, r11)
            androidx.documentfile.C1076.m1233(r8, r10)
            java.lang.String r9 = "ۣ۠"
            goto Lf
        L24:
            r2 = 0
            r9 = 0
            r16 = 0
            r0 = r16
            kevin.fun.hook.audio.C1117.m8126(r8, r2, r9, r0, r14)
            androidx.activity.C1064.m372(r4, r8)
            android.widget.LinearLayout r2 = m7065(r18, r19, r20, r21)
            java.lang.String r9 = "ۣۧ۟"
            goto Lf
        L37:
            androidx.activity.C1064.m372(r4, r2)
            android.app.Dialog r8 = m7058(r20)
            r0 = r18
            r1 = r19
            android.widget.TextView r8 = m7092(r0, r1, r8)
            java.lang.String r9 = "۟ۡۢ"
            goto Lf
        L49:
            r15 = r13 ^ 290(0x122, float:4.06E-43)
            r7 = 753(0x2f1, float:1.055E-42)
            r9 = 1627(0x65b, float:2.28E-42)
            java.lang.String r7 = androidx.lifecycle.livedata.C1084.m1796(r6, r7, r15, r9)
            androidx.lifecycle.process.C1087.m1946(r8, r7)
            java.lang.String r9 = "ۣۧ۟"
            goto Lf
        L59:
            int r13 = kevin.fun.hook.C1120.f419
            r15 = r13 ^ (-457(0xfffffffffffffe37, float:NaN))
            r0 = r18
            r1 = r19
            int r14 = m7045(r0, r1, r15)
            java.lang.String r9 = "ۥۥ"
            goto Lf
        L68:
            r13 = r15 ^ 148(0x94, float:2.07E-43)
            r0 = r18
            r1 = r19
            int r15 = m7045(r0, r1, r13)
            r0 = r18
            r1 = r19
            int r11 = m7045(r0, r1, r13)
            java.lang.String r9 = "ۣ۠ۡ"
            goto Lf
        L7d:
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r0 = r19
            r4.<init>(r0)
            r9 = 1
            androidx.customview.C1074.m1119(r4, r9)
            int r15 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            java.lang.String r9 = "۠ۤۦ"
            goto Lf
        L8d:
            r10 = r15 ^ (-949(0xfffffffffffffc4b, float:NaN))
            androidx.emoji2.C1080.m1542(r4, r10)
            int r15 = androidx.versionedparcelable.C1106.f132
            java.lang.String r9 = "ۢۦ۠"
            goto Lf
        L98:
            r0 = r18
            r1 = r19
            int r14 = m7045(r0, r1, r13)
            r0 = r18
            r1 = r19
            int r12 = m7045(r0, r1, r13)
            androidx.drawerlayout.C1077.m1314(r4, r15, r11, r14, r12)
            java.lang.String r9 = "ۨۦۣ"
            goto Lf
        Laf:
            android.widget.TextView r8 = new android.widget.TextView
            r0 = r19
            r8.<init>(r0)
            short[] r6 = m6972()
            int r13 = kevin.fun.hook.webdav.C1119.f418
            java.lang.String r9 = "۟ۢ"
            goto Lf
        Lc0:
            r9 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r8, r9)
            android.graphics.Typeface r9 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r8, r9)
            java.lang.String r9 = "ۣۦۦ"
            goto Lf
        Ld0:
            int r14 = kevin.fun.hook.audio.C1115.f404
            r9 = -13422575(0xffffffffff333011, float:-2.3818139E38)
            r12 = r9 ^ r14
            kevin.fun.hook.webdav.C1118.m8517(r8, r12)
            java.lang.String r9 = "ۡۡ۠"
            goto Lf
        Lde:
            androidx.lifecycle.process.C1087.m1946(r8, r7)
            r9 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r8, r9)
            int r12 = androidx.interpolator.C1081.f107
            java.lang.String r9 = "ۡۡ"
            goto Lf
        Lec:
            int r14 = androidx.lifecycle.livedata.C1086.f112
            r12 = r14 ^ (-953(0xfffffffffffffc47, float:NaN))
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r11, r12)
            java.lang.String r9 = "ۥۨۨ"
            goto Lf
        Lf9:
            androidx.documentfile.C1076.m1233(r8, r10)
            r0 = r18
            r1 = r19
            int r13 = m7045(r0, r1, r11)
            r9 = 0
            r16 = 0
            r17 = 0
            r0 = r16
            r1 = r17
            kevin.fun.hook.audio.C1117.m8126(r8, r9, r0, r1, r13)
            java.lang.String r9 = "ۡ۠ۥ"
            goto Lf
        L114:
            androidx.activity.C1064.m372(r4, r8)
            return r4
        L118:
            int r14 = androidx.versionedparcelable.C1106.f132
            r11 = r14 ^ 156(0x9c, float:2.19E-43)
            r0 = r18
            r1 = r19
            int r12 = m7045(r0, r1, r11)
            java.lang.String r9 = "ۦۢۢ"
            goto Lf
        L128:
            int r13 = androidx.viewpager.C1108.f134
            r15 = r13 ^ 487(0x1e7, float:6.82E-43)
            androidx.lifecycle.livedata.C1085.m1879(r5, r15)
            java.lang.String r9 = "ۢۨۧ"
            goto Lf
        L133:
            float r9 = (float) r12
            androidx.lifecycle.process.C1091.m2252(r5, r9)
            androidx.activity.C1065.m397(r4, r5)
            java.lang.String r9 = "ۥۣ۠"
            goto Lf
        L13e:
            androidx.activity.C1064.m372(r4, r8)
            android.widget.TextView r8 = new android.widget.TextView
            r0 = r19
            r8.<init>(r0)
            short[] r6 = m6972()
            java.lang.String r9 = "۟ۡۨ"
            goto Lf
        L150:
            int r15 = kevin.fun.hook.audio.C1115.f404
            r14 = r15 ^ 805(0x325, float:1.128E-42)
            r7 = 757(0x2f5, float:1.061E-42)
            r9 = 2625(0xa41, float:3.678E-42)
            java.lang.String r7 = androidx.customview.C1074.m1116(r6, r7, r14, r9)
            java.lang.String r9 = "ۡ۟ۡ"
            goto Lf
        L160:
            int r13 = kevin.fun.hook.C1120.f419
            r15 = r13 ^ (-221(0xffffffffffffff23, float:NaN))
            r0 = r18
            r1 = r19
            int r11 = m7045(r0, r1, r15)
            java.lang.String r9 = "ۢۨۦ"
            goto Lf
        L170:
            r3.gravity = r10
            androidx.vectordrawable.C1105.m3296(r4, r3)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            java.lang.String r9 = "ۨۧۥ"
            goto Lf
    }

    private android.widget.TextView createBackgroundButton(android.content.Context r12, android.app.Dialog r13) {
            r11 = this;
            r1 = 0
            r8 = 0
            java.lang.String r6 = "ۣۨۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r8
            r9 = r8
            r10 = r8
        Lc:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 56572: goto Ld6;
                case 56573: goto Le0;
                case 56574: goto Lef;
                case 1746721: goto Lc7;
                case 1746819: goto L50;
                case 1746881: goto L64;
                case 1747651: goto L56;
                case 1747655: goto L7c;
                case 1747865: goto L1f;
                case 1747869: goto L37;
                case 1747927: goto L3e;
                case 1748614: goto L6c;
                case 1748702: goto L28;
                case 1749665: goto Lbf;
                case 1749794: goto L9e;
                case 1750632: goto L88;
                case 1750786: goto L4a;
                case 1750812: goto L2e;
                case 1751712: goto Lae;
                case 1751713: goto Lb8;
                case 1751744: goto L5e;
                case 1752492: goto L97;
                case 1752550: goto Lcf;
                case 1752583: goto L82;
                case 1753575: goto Le7;
                case 1753632: goto Lf4;
                case 1753634: goto La7;
                case 1754473: goto L90;
                case 1755342: goto L44;
                case 1755591: goto L73;
                default: goto L13;
            }
        L13:
            r1 = 764(0x2fc, float:1.07E-42)
            r3 = 1078(0x436, float:1.51E-42)
            java.lang.String r1 = androidx.customview.C1075.m1138(r5, r1, r9, r3)
            java.lang.String r6 = "ۦۤۥ"
            r3 = r1
            goto Lc
        L1f:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r10, r7)
            java.lang.String r6 = "ۦۦۢ"
            r2 = r1
            goto Lc
        L28:
            r9 = r10 ^ 19
            java.lang.String r1 = "ۣۢۧ"
            r6 = r1
            goto Lc
        L2e:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r12)
            java.lang.String r6 = "ۢۦۦ"
            r4 = r1
            goto Lc
        L37:
            kevin.fun.hook.audio.C1117.m8126(r4, r8, r10, r8, r8)
            java.lang.String r1 = "ۨۦ"
            r6 = r1
            goto Lc
        L3e:
            r10 = r9 ^ (-972(0xfffffffffffffc34, float:NaN))
            java.lang.String r1 = "۟ۥۧ"
            r6 = r1
            goto Lc
        L44:
            int r9 = androidx.activity.C1065.f91
            java.lang.String r1 = "ۧۢۤ"
            r6 = r1
            goto Lc
        L4a:
            r9 = r10 ^ 805(0x325, float:1.128E-42)
            java.lang.String r1 = "۠۟ۢ"
            r6 = r1
            goto Lc
        L50:
            int r10 = androidx.core.C1072.f98
            java.lang.String r1 = "ۨۧۦ"
            r6 = r1
            goto Lc
        L56:
            int r10 = m7045(r11, r12, r9)
            java.lang.String r1 = "۠ۦۣ"
            r6 = r1
            goto Lc
        L5e:
            int r9 = androidx.vectordrawable.C1105.f131
            java.lang.String r1 = "ۥ۠ۧ"
            r6 = r1
            goto Lc
        L64:
            int r7 = m7045(r11, r12, r10)
            java.lang.String r1 = "ۤۦۣ"
            r6 = r1
            goto Lc
        L6c:
            kevin.fun.hook.webdav.C1118.m8517(r4, r9)
            java.lang.String r1 = "۠۟ۦ"
            r6 = r1
            goto Lc
        L73:
            r1 = 10066822(0x999b86, float:1.4106622E-38)
            r9 = r1 ^ r10
            java.lang.String r1 = "ۡ۟ۤ"
            r6 = r1
            goto Lc
        L7c:
            int r10 = androidx.activity.C1063.f89
            java.lang.String r1 = "ۡۢ۟"
            r6 = r1
            goto Lc
        L82:
            int r10 = androidx.activity.C1066.f92
            java.lang.String r1 = "ۣۧۦ"
            r6 = r1
            goto Lc
        L88:
            androidx.documentfile.C1076.m1233(r4, r9)
            java.lang.String r1 = "ۥۣۥ"
            r6 = r1
            goto Lc
        L90:
            r10 = r9 ^ 52
            java.lang.String r1 = "ۣۤۧ"
            r6 = r1
            goto Lc
        L97:
            r7 = r9 ^ (-360(0xfffffffffffffe98, float:NaN))
            java.lang.String r1 = "۠ۦ۟"
            r6 = r1
            goto Lc
        L9e:
            short[] r1 = m6972()
            java.lang.String r6 = "ۥۣۢ"
            r5 = r1
            goto Lc
        La7:
            int r9 = androidx.loader.C1095.f121
            java.lang.String r1 = "۠ۨ۟"
            r6 = r1
            goto Lc
        Lae:
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r1)
            java.lang.String r1 = "ۣ۟ۧ"
            r6 = r1
            goto Lc
        Lb8:
            r2.topMargin = r7
            java.lang.String r1 = "ۢۢۡ"
            r6 = r1
            goto Lc
        Lbf:
            androidx.lifecycle.livedata.C1085.m1822(r4, r2)
            java.lang.String r1 = "ۨۤ"
            r6 = r1
            goto Lc
        Lc7:
            androidx.lifecycle.livedata.C1086.m1916(r4, r0)
            java.lang.String r1 = "ۦۦ۠"
            r6 = r1
            goto Lc
        Lcf:
            int r10 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            java.lang.String r1 = "ۨۥ"
            r6 = r1
            goto Lc
        Ld6:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda3 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda3
            r0.<init>(r11, r13, r12)
            java.lang.String r1 = "۟۠ۢ"
            r6 = r1
            goto Lc
        Le0:
            r9 = r10 ^ (-930(0xfffffffffffffc5e, float:NaN))
            java.lang.String r1 = "ۢۨ۠"
            r6 = r1
            goto Lc
        Le7:
            androidx.lifecycle.process.C1087.m1946(r4, r3)
            java.lang.String r1 = "ۤۦۢ"
            r6 = r1
            goto Lc
        Lef:
            java.lang.String r1 = "ۨ۟ۥ"
            r6 = r1
            goto Lc
        Lf4:
            return r4
    }

    private android.widget.TextView createBackgroundButton(android.content.Context r12, kevin.fun.hook.KSHook.DownloadDialogHolder r13) {
            r11 = this;
            r1 = 0
            r8 = 0
            java.lang.String r6 = "ۢ۠ۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r8
            r9 = r8
            r10 = r8
        Lc:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 56415: goto L74;
                case 56478: goto L54;
                case 56539: goto L45;
                case 56568: goto La6;
                case 1746693: goto L6a;
                case 1746843: goto L1b;
                case 1746912: goto Lc6;
                case 1746913: goto Ld5;
                case 1746967: goto L2d;
                case 1746972: goto L21;
                case 1747838: goto L7c;
                case 1748735: goto L85;
                case 1748861: goto L8f;
                case 1749603: goto Lad;
                case 1749757: goto Lf4;
                case 1750600: goto L39;
                case 1750688: goto Lce;
                case 1750692: goto Le6;
                case 1750725: goto L6e;
                case 1751493: goto L63;
                case 1752516: goto L5c;
                case 1752523: goto L33;
                case 1754599: goto Ldf;
                case 1755376: goto L97;
                case 1755399: goto L4b;
                case 1755437: goto L9f;
                case 1755492: goto Led;
                case 1755555: goto Lbf;
                case 1755587: goto L3f;
                case 1755619: goto Lb7;
                default: goto L13;
            }
        L13:
            short[] r1 = m6972()
            java.lang.String r6 = "ۨۧۢ"
            r2 = r1
            goto Lc
        L1b:
            r10 = r9 ^ 491(0x1eb, float:6.88E-43)
            java.lang.String r1 = "ۨ۠"
            r6 = r1
            goto Lc
        L21:
            r1 = 768(0x300, float:1.076E-42)
            r3 = 889(0x379, float:1.246E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1087.m2008(r2, r1, r9, r3)
            java.lang.String r6 = "ۨ۠ۨ"
            r3 = r1
            goto Lc
        L2d:
            r7 = r9 ^ (-288(0xfffffffffffffee0, float:NaN))
            java.lang.String r1 = "ۨۡ۠"
            r6 = r1
            goto Lc
        L33:
            int r9 = androidx.customview.C1074.f100
            java.lang.String r1 = "ۣۤۡ"
            r6 = r1
            goto Lc
        L39:
            r9 = r10 ^ 3
            java.lang.String r1 = "ۥۣ"
            r6 = r1
            goto Lc
        L3f:
            int r10 = androidx.interpolator.C1083.f109
            java.lang.String r1 = "ۨۢۧ"
            r6 = r1
            goto Lc
        L45:
            r4.topMargin = r7
            java.lang.String r1 = "ۣۡۧ"
            r6 = r1
            goto Lc
        L4b:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r10, r7)
            java.lang.String r6 = "ۥۡۧ"
            r4 = r1
            goto Lc
        L54:
            int r10 = m7045(r11, r12, r9)
            java.lang.String r1 = "۟ۦۧ"
            r6 = r1
            goto Lc
        L5c:
            androidx.lifecycle.livedata.C1086.m1916(r5, r0)
            java.lang.String r1 = "ۢۥ۠"
            r6 = r1
            goto Lc
        L63:
            androidx.documentfile.C1076.m1233(r5, r9)
            java.lang.String r1 = "ۨۦۡ"
            r6 = r1
            goto Lc
        L6a:
            java.lang.String r1 = "ۣۥۧ"
            r6 = r1
            goto Lc
        L6e:
            int r9 = androidx.lifecycle.process.C1091.f117
            java.lang.String r1 = "۟ۤ۠"
            r6 = r1
            goto Lc
        L74:
            int r7 = m7045(r11, r12, r10)
            java.lang.String r1 = "ۧۢ"
            r6 = r1
            goto Lc
        L7c:
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r1)
            java.lang.String r1 = "ۣۤۥ"
            r6 = r1
            goto Lc
        L85:
            r1 = -10066380(0xffffffffff666634, float:-3.062531E38)
            r9 = r1 ^ r10
            java.lang.String r1 = "ۣۨۨ"
            r6 = r1
            goto Lc
        L8f:
            androidx.lifecycle.livedata.C1085.m1822(r5, r4)
            java.lang.String r1 = "۟ۦۨ"
            r6 = r1
            goto Lc
        L97:
            androidx.lifecycle.process.C1087.m1946(r5, r3)
            java.lang.String r1 = "۠ۥۣ"
            r6 = r1
            goto Lc
        L9f:
            r9 = r10 ^ (-442(0xfffffffffffffe46, float:NaN))
            java.lang.String r1 = "۟ۨۥ"
            r6 = r1
            goto Lc
        La6:
            int r9 = androidx.drawerlayout.C1077.f103
            java.lang.String r1 = "۟ۨ۠"
            r6 = r1
            goto Lc
        Lad:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r12)
            java.lang.String r6 = "ۢۨ۠"
            r5 = r1
            goto Lc
        Lb7:
            kevin.fun.hook.webdav.C1118.m8517(r5, r9)
            java.lang.String r1 = "ۨۤ۠"
            r6 = r1
            goto Lc
        Lbf:
            int r10 = androidx.lifecycle.livedata.C1084.f110
            java.lang.String r1 = "ۣۡۦ"
            r6 = r1
            goto Lc
        Lc6:
            kevin.fun.hook.audio.C1117.m8126(r5, r8, r10, r8, r8)
            java.lang.String r1 = "۟۟ۥ"
            r6 = r1
            goto Lc
        Lce:
            r10 = r9 ^ 251(0xfb, float:3.52E-43)
            java.lang.String r1 = "ۣۢ"
            r6 = r1
            goto Lc
        Ld5:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda36 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda36
            r0.<init>(r11, r13, r12)
            java.lang.String r1 = "ۥۡ۠"
            r6 = r1
            goto Lc
        Ldf:
            r9 = r10 ^ 915(0x393, float:1.282E-42)
            java.lang.String r1 = "ۤ۟۠"
            r6 = r1
            goto Lc
        Le6:
            int r10 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r1 = "ۣۡۡ"
            r6 = r1
            goto Lc
        Led:
            int r10 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۧۦۦ"
            r6 = r1
            goto Lc
        Lf4:
            return r5
    }

    private android.view.View createBackupItem(android.content.Context r10, java.lang.ref.WeakReference<android.app.Dialog> r11) {
            r9 = this;
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۣۡۤ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 1747812: goto L3a;
                case 1748610: goto L22;
                case 1748738: goto L19;
                case 1751748: goto L42;
                case 1751776: goto L34;
                case 1755555: goto L2e;
                default: goto L11;
            }
        L11:
            short[] r0 = m6972()
            java.lang.String r1 = "ۨۦۡ"
            r5 = r1
            goto La
        L19:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda13 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda13
            r1.<init>(r9, r11, r10)
            java.lang.String r5 = "ۡۡ"
            r3 = r1
            goto La
        L22:
            r1 = 772(0x304, float:1.082E-42)
            r2 = 1120(0x460, float:1.57E-42)
            java.lang.String r1 = androidx.vectordrawable.C1104.m3232(r0, r1, r8, r2)
            java.lang.String r5 = "۠ۤۨ"
            r2 = r1
            goto La
        L2e:
            int r6 = androidx.loader.C1099.f125
            java.lang.String r1 = "ۤۨۤ"
            r5 = r1
            goto La
        L34:
            r8 = r6 ^ 861(0x35d, float:1.207E-42)
            java.lang.String r1 = "ۡ۟۠"
            r5 = r1
            goto La
        L3a:
            android.view.View r1 = m7040(r9, r10, r2, r7, r3)
            java.lang.String r5 = "ۤۧۧ"
            r4 = r1
            goto La
        L42:
            return r4
    }

    private android.widget.TextView createCloseButton(android.content.Context r11, java.lang.ref.WeakReference<android.app.Dialog> r12) {
            r10 = this;
            r1 = 0
            r7 = 0
            java.lang.String r5 = "ۤۦۥ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
            r9 = r7
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56297: goto L49;
                case 56359: goto Lb9;
                case 1746723: goto L80;
                case 1746910: goto L34;
                case 1747710: goto L2e;
                case 1747838: goto L25;
                case 1748706: goto L6b;
                case 1748772: goto La8;
                case 1748800: goto L97;
                case 1749570: goto L71;
                case 1749729: goto La0;
                case 1750664: goto L55;
                case 1750812: goto L43;
                case 1751715: goto L77;
                case 1752516: goto Lb1;
                case 1752522: goto L4f;
                case 1752579: goto L8f;
                case 1752611: goto L88;
                case 1752734: goto L1e;
                case 1753484: goto L5e;
                case 1754623: goto L3a;
                case 1755500: goto L65;
                default: goto L12;
            }
        L12:
            r0 = 778(0x30a, float:1.09E-42)
            r1 = 2831(0xb0f, float:3.967E-42)
            java.lang.String r0 = com.tencent.mmkv.C1109.m3629(r2, r0, r9, r1)
            java.lang.String r1 = "ۦۡۧ"
            r5 = r1
            goto Lb
        L1e:
            kevin.fun.hook.webdav.C1118.m8517(r4, r9)
            java.lang.String r1 = "۠ۥۣ"
            r5 = r1
            goto Lb
        L25:
            r1 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r1)
            java.lang.String r1 = "۟ۨ"
            r5 = r1
            goto Lb
        L2e:
            int r8 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۨۤۨ"
            r5 = r1
            goto Lb
        L34:
            int r9 = androidx.loader.C1099.f125
            java.lang.String r1 = "ۢ۟۟"
            r5 = r1
            goto Lb
        L3a:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda12 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda12
            r1.<init>(r10, r12)
            java.lang.String r5 = "ۥۡ۠"
            r3 = r1
            goto Lb
        L43:
            int r8 = androidx.loader.C1094.f120
            java.lang.String r1 = "ۣۡۢ"
            r5 = r1
            goto Lb
        L49:
            int r8 = org.luckypray.dexkit.C1125.f435
            java.lang.String r1 = "ۥۤۢ"
            r5 = r1
            goto Lb
        L4f:
            int r8 = org.luckypray.dexkit.C1125.f435
            java.lang.String r1 = "ۣۣۨ"
            r5 = r1
            goto Lb
        L55:
            r1 = 13421614(0xcccc2e, float:1.8807687E-38)
            r9 = r1 ^ r8
            java.lang.String r1 = "ۥۨۡ"
            r5 = r1
            goto Lb
        L5e:
            androidx.lifecycle.process.C1087.m1946(r4, r0)
            java.lang.String r1 = "ۥۡۦ"
            r5 = r1
            goto Lb
        L65:
            r9 = r8 ^ 914(0x392, float:1.281E-42)
            java.lang.String r1 = "ۡۥۤ"
            r5 = r1
            goto Lb
        L6b:
            r9 = r8 ^ 374(0x176, float:5.24E-43)
            java.lang.String r1 = "۟ۦۡ"
            r5 = r1
            goto Lb
        L71:
            r6 = r9 ^ 851(0x353, float:1.193E-42)
            java.lang.String r1 = "ۡۤۧ"
            r5 = r1
            goto Lb
        L77:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r11)
            java.lang.String r5 = "۟۠ۤ"
            r4 = r1
            goto Lb
        L80:
            short[] r1 = m6972()
            java.lang.String r5 = "ۣۨۡ"
            r2 = r1
            goto Lb
        L88:
            r9 = r8 ^ (-244(0xffffffffffffff0c, float:NaN))
            java.lang.String r1 = "ۥۣۡ"
            r5 = r1
            goto Lb
        L8f:
            androidx.documentfile.C1076.m1233(r4, r9)
            java.lang.String r1 = "۠ۡ۟"
            r5 = r1
            goto Lb
        L97:
            int r8 = m7045(r10, r11, r9)
            java.lang.String r1 = "۟ۦۥ"
            r5 = r1
            goto Lb
        La0:
            kevin.fun.hook.audio.C1117.m8126(r4, r7, r8, r7, r9)
            java.lang.String r1 = "ۧۧ۟"
            r5 = r1
            goto Lb
        La8:
            int r9 = m7045(r10, r11, r6)
            java.lang.String r1 = "ۣۢۤ"
            r5 = r1
            goto Lb
        Lb1:
            androidx.lifecycle.livedata.C1086.m1916(r4, r3)
            java.lang.String r1 = "ۡۨ"
            r5 = r1
            goto Lb
        Lb9:
            return r4
    }

    private android.widget.FrameLayout createDialogFrame(android.content.Context r8) {
            r7 = this;
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۡۤۡ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746935: goto L43;
                case 1747747: goto L33;
                case 1747904: goto L39;
                case 1748766: goto L18;
                case 1749637: goto L4a;
                case 1752461: goto L2c;
                case 1753662: goto L25;
                case 1755432: goto L50;
                case 1755438: goto L21;
                default: goto Lf;
            }
        Lf:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r6, r6)
            java.lang.String r1 = "۟ۧ۟"
            r3 = r1
            goto L8
        L18:
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r8)
            java.lang.String r3 = "ۨۢۨ"
            r2 = r1
            goto L8
        L21:
            java.lang.String r1 = "۠ۢۥ"
            r3 = r1
            goto L8
        L25:
            r5 = r4 ^ (-899(0xfffffffffffffc7d, float:NaN))
            java.lang.String r1 = "ۨ۠ۢ"
            r3 = r1
            r6 = r5
            goto L8
        L2c:
            androidx.lifecycle.livedata.C1084.m1783(r2, r6)
            java.lang.String r1 = "ۨۢۢ"
            r3 = r1
            goto L8
        L33:
            int r4 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۦۧ۟"
            r3 = r1
            goto L8
        L39:
            r1 = -2147483646(0xffffffff80000002, float:-2.8E-45)
            r5 = r1 ^ r4
            java.lang.String r1 = "ۥ۟ۧ"
            r3 = r1
            r6 = r5
            goto L8
        L43:
            androidx.lifecycle.process.C1091.m2273(r2, r0)
            java.lang.String r1 = "ۢۡۤ"
            r3 = r1
            goto L8
        L4a:
            int r4 = androidx.activity.C1063.f89
            java.lang.String r1 = "۠ۧۧ"
            r3 = r1
            goto L8
        L50:
            return r2
    }

    private android.widget.LinearLayout createDownloadPanel(android.content.Context r12, java.lang.ref.WeakReference<android.app.Dialog> r13) {
            r11 = this;
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r12)
            r0 = 1
            androidx.customview.C1074.m1119(r3, r0)
            int r0 = androidx.versionedparcelable.C1107.f133
            r0 = r0 ^ 648(0x288, float:9.08E-43)
            int r1 = m7045(r11, r12, r0)
            int r2 = androidx.activity.C1064.f90
            r2 = r2 ^ 482(0x1e2, float:6.75E-43)
            int r4 = m7045(r11, r12, r2)
            int r0 = m7045(r11, r12, r0)
            int r5 = androidx.drawerlayout.C1077.f103
            r5 = r5 ^ 270(0x10e, float:3.78E-43)
            int r6 = m7045(r11, r12, r5)
            androidx.drawerlayout.C1077.m1314(r3, r1, r4, r0, r6)
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r0 = r0 ^ 122(0x7a, float:1.71E-43)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r4 = androidx.customview.C1074.f100
            r4 = r4 ^ (-243(0xffffffffffffff0d, float:NaN))
            r1.<init>(r0, r4)
            r4 = 80
            r1.gravity = r4
            androidx.vectordrawable.C1105.m3296(r3, r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r1, r0)
            int r0 = m7045(r11, r12, r5)
            float r0 = (float) r0
            int r4 = m7045(r11, r12, r5)
            float r4 = (float) r4
            int r6 = m7045(r11, r12, r5)
            float r6 = (float) r6
            int r5 = m7045(r11, r12, r5)
            float r5 = (float) r5
            float[] r2 = new float[r2]
            r7 = 0
            r2[r7] = r0
            r0 = 1
            r2[r0] = r4
            r0 = 2
            r2[r0] = r6
            r0 = 3
            r2[r0] = r5
            r0 = 4
            r4 = 0
            r2[r0] = r4
            r0 = 5
            r4 = 0
            r2[r0] = r4
            r0 = 6
            r4 = 0
            r2[r0] = r4
            r0 = 7
            r4 = 0
            r2[r0] = r4
            androidx.vectordrawable.C1103.m3187(r1, r2)
            androidx.activity.C1065.m397(r3, r1)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r11)
            kevin.fun.hook.KSHook$MediaType r1 = m7111(r0)
            kevin.fun.hook.KSHook$MediaType r2 = m7064()
            r0 = 1616(0x650, float:2.264E-42)
        L8a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L90;
                case 49: goto L93;
                case 204: goto L98;
                case 239: goto Lb3;
                default: goto L8f;
            }
        L8f:
            goto L8a
        L90:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8a
        L93:
            if (r1 != r2) goto L90
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8a
        L98:
            short[] r0 = m6972()
            r1 = 780(0x30c, float:1.093E-42)
            int r2 = androidx.loader.C1099.f125
            r2 = r2 ^ 850(0x352, float:1.191E-42)
            r4 = 688(0x2b0, float:9.64E-43)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r1, r2, r4)
            r1 = 1740(0x6cc, float:2.438E-42)
        Laa:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto Lb0;
                case 54: goto Lc3;
                default: goto Laf;
            }
        Laf:
            goto Laa
        Lb0:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto Laa
        Lb3:
            short[] r0 = m6972()
            r1 = 789(0x315, float:1.106E-42)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 937(0x3a9, float:1.313E-42)
            r4 = 2097(0x831, float:2.939E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r2, r4)
        Lc3:
            android.view.View r0 = m7112(r11, r12, r0)
            androidx.activity.C1064.m372(r3, r0)
            android.view.View r0 = m7077(r11, r12)
            androidx.activity.C1064.m372(r3, r0)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r12)
            r0 = 1
            androidx.customview.C1074.m1119(r4, r0)
            androidx.activity.C1064.m372(r3, r4)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r11)
            kevin.fun.hook.KSHook$MediaType r1 = m7111(r0)
            kevin.fun.hook.KSHook$MediaType r2 = m7064()
            short[] r0 = m6972()
            r5 = 798(0x31e, float:1.118E-42)
            int r6 = androidx.activity.C1066.f92
            r6 = r6 ^ 819(0x333, float:1.148E-42)
            r7 = 1209(0x4b9, float:1.694E-42)
            java.lang.String r5 = androidx.vectordrawable.C1103.m3132(r0, r5, r6, r7)
            short[] r0 = m6972()
            r6 = 804(0x324, float:1.127E-42)
            int r7 = androidx.lifecycle.process.C1089.f115
            r7 = r7 ^ 933(0x3a5, float:1.307E-42)
            r8 = 2267(0x8db, float:3.177E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1090.m2213(r0, r6, r7, r8)
            short[] r0 = m6972()
            r7 = 809(0x329, float:1.134E-42)
            int r8 = androidx.appcompat.resources.C1068.f94
            r8 = r8 ^ 522(0x20a, float:7.31E-43)
            r9 = 2283(0x8eb, float:3.199E-42)
            java.lang.String r7 = androidx.emoji2.viewsintegration.C1078.m1413(r0, r7, r8, r9)
            r0 = 1864(0x748, float:2.612E-42)
        L11b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L121;
                case 47384: goto L16a;
                case 47417: goto L12b;
                case 47483: goto L127;
                default: goto L120;
            }
        L120:
            goto L11b
        L121:
            if (r1 != r2) goto L127
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L11b
        L127:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L11b
        L12b:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            short[] r2 = m6972()
            r8 = 813(0x32d, float:1.139E-42)
            int r9 = androidx.loader.C1099.f125
            r9 = r9 ^ 863(0x35f, float:1.21E-42)
            r10 = 2038(0x7f6, float:2.856E-42)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r8, r9, r10)
            r0[r1] = r2
            r1 = 1
            r0[r1] = r7
            r1 = 2
            r0[r1] = r6
            r1 = 3
            r0[r1] = r5
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L14d:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L155;
                case 239: goto L166;
                default: goto L154;
            }
        L154:
            goto L14d
        L155:
            r1 = 0
        L156:
            int r5 = r0.length
            r2 = 48891(0xbefb, float:6.8511E-41)
        L15a:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 22: goto L162;
                case 53: goto L190;
                case 503: goto L18a;
                case 32495: goto L1b3;
                default: goto L161;
            }
        L161:
            goto L15a
        L162:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L15a
        L166:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L14d
        L16a:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            short[] r2 = m6972()
            r8 = 817(0x331, float:1.145E-42)
            int r9 = androidx.loader.C1097.f123
            r9 = r9 ^ 116(0x74, float:1.63E-43)
            r10 = 2144(0x860, float:3.004E-42)
            java.lang.String r2 = androidx.drawerlayout.C1077.m1343(r2, r8, r9, r10)
            r0[r1] = r2
            r1 = 1
            r0[r1] = r7
            r1 = 2
            r0[r1] = r6
            r1 = 3
            r0[r1] = r5
            goto L155
        L18a:
            if (r1 < r5) goto L162
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L15a
        L190:
            r2 = r0[r1]
            r5 = 0
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda10 r6 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda10
            r6.<init>(r11, r12, r13, r1)
            android.view.View r2 = m7040(r11, r12, r2, r5, r6)
            androidx.activity.C1064.m372(r4, r2)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-963(0xfffffffffffffc3d, float:NaN))
            int r1 = r1 + r2
            r2 = 49666(0xc202, float:6.9597E-41)
        L1a7:
            r5 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L1af;
                case 50: goto L156;
                default: goto L1ae;
            }
        L1ae:
            goto L1a7
        L1af:
            r2 = 49697(0xc221, float:6.964E-41)
            goto L1a7
        L1b3:
            return r3
    }

    private android.view.View createIconTextButton(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, android.view.View.OnClickListener r15) {
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L107
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L107
            r1 = 1
            androidx.customview.C1074.m1119(r0, r1)     // Catch: java.lang.Throwable -> L107
            int r1 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L107
            r2 = r1 ^ 430(0x1ae, float:6.03E-43)
            androidx.emoji2.C1080.m1542(r0, r2)     // Catch: java.lang.Throwable -> L107
            int r1 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L107
            r1 = r1 ^ (-434(0xfffffffffffffe4e, float:NaN))
            int r3 = m7045(r9, r10, r1)     // Catch: java.lang.Throwable -> L107
            int r4 = m7045(r9, r10, r1)     // Catch: java.lang.Throwable -> L107
            int r5 = m7045(r9, r10, r1)     // Catch: java.lang.Throwable -> L107
            int r1 = m7045(r9, r10, r1)     // Catch: java.lang.Throwable -> L107
            androidx.drawerlayout.C1077.m1314(r0, r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L107
            r1 = 1
            androidx.viewpager.C1108.m3510(r0, r1)     // Catch: java.lang.Throwable -> L107
            r1 = 1
            kevin.fun.hook.audio.C1117.m8136(r0, r1)     // Catch: java.lang.Throwable -> L107
            android.widget.ImageView r3 = new android.widget.ImageView     // Catch: java.lang.Throwable -> L107
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L107
            int r1 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L107
            r1 = r1 ^ (-459(0xfffffffffffffe35, float:NaN))
            int r1 = m7045(r9, r10, r1)     // Catch: java.lang.Throwable -> L107
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L107
            r4.<init>(r1, r1)     // Catch: java.lang.Throwable -> L107
            androidx.lifecycle.process.C1090.m2175(r3, r4)     // Catch: java.lang.Throwable -> L107
            android.widget.ImageView$ScaleType r1 = androidx.activity.C1066.m472()     // Catch: java.lang.Throwable -> L107
            androidx.lifecycle.livedata.C1084.m1758(r3, r1)     // Catch: java.lang.Throwable -> L107
            int r1 = androidx.loader.C1098.f124
            r1 = r1 ^ (-801(0xfffffffffffffcdf, float:NaN))
            android.content.Context r4 = androidx.annotation.experimental.C1067.m588(r10, r13, r1)     // Catch: java.lang.Throwable -> L92
            android.content.res.Resources r1 = androidx.emoji2.viewsintegration.C1078.m1401(r4)     // Catch: java.lang.Throwable -> L92
            short[] r5 = m6972()     // Catch: java.lang.Throwable -> L92
            r6 = 823(0x337, float:1.153E-42)
            int r7 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L92
            r7 = r7 ^ 260(0x104, float:3.64E-43)
            r8 = 1998(0x7ce, float:2.8E-42)
            java.lang.String r5 = androidx.core.C1073.m1028(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L92
            int r5 = androidx.lifecycle.process.C1087.m1980(r1, r12, r5, r13)     // Catch: java.lang.Throwable -> L92
            r1 = 1616(0x650, float:2.264E-42)
        L6d:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L73;
                case 49: goto L76;
                case 204: goto L7b;
                case 239: goto Lbb;
                default: goto L72;
            }     // Catch: java.lang.Throwable -> L92
        L72:
            goto L6d
        L73:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L6d
        L76:
            if (r5 == 0) goto L73
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L6d
        L7b:
            android.content.res.Resources r1 = androidx.emoji2.viewsintegration.C1078.m1401(r4)     // Catch: java.lang.Throwable -> L92
            r4 = 0
            android.graphics.drawable.Drawable r1 = androidx.startup.C1101.m3031(r1, r5, r4)     // Catch: java.lang.Throwable -> L92
            androidx.emoji2.C1080.m1545(r3, r1)     // Catch: java.lang.Throwable -> L92
            r1 = 1740(0x6cc, float:2.438E-42)
        L89:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L8f;
                case 54: goto Lbb;
                default: goto L8e;
            }
        L8e:
            goto L89
        L8f:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L89
        L92:
            r1 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2254(r1)     // Catch: java.lang.Throwable -> L107
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r4.<init>()     // Catch: java.lang.Throwable -> L107
            short[] r5 = m6972()     // Catch: java.lang.Throwable -> L107
            r6 = 831(0x33f, float:1.164E-42)
            int r7 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L107
            r7 = r7 ^ 498(0x1f2, float:6.98E-43)
            r8 = 2134(0x856, float:2.99E-42)
            java.lang.String r5 = androidx.lifecycle.runtime.C1092.m2337(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L107
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Throwable -> L107
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r4, r1)     // Catch: java.lang.Throwable -> L107
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Throwable -> L107
            m7099(r1)     // Catch: java.lang.Throwable -> L107
        Lbb:
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L107
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L107
            androidx.lifecycle.process.C1087.m1946(r1, r11)     // Catch: java.lang.Throwable -> L107
            r4 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r4)     // Catch: java.lang.Throwable -> L107
            android.graphics.Typeface r4 = androidx.emoji2.C1080.m1508()     // Catch: java.lang.Throwable -> L107
            androidx.customview.C1074.m47(r1, r4)     // Catch: java.lang.Throwable -> L107
            kevin.fun.hook.webdav.C1118.m8517(r1, r14)     // Catch: java.lang.Throwable -> L107
            androidx.documentfile.C1076.m1233(r1, r2)     // Catch: java.lang.Throwable -> L107
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L107
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L107
            r4 = r4 ^ 932(0x3a4, float:1.306E-42)
            r2.<init>(r4, r4)     // Catch: java.lang.Throwable -> L107
            int r4 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L107
            r4 = r4 ^ 197(0xc5, float:2.76E-43)
            int r4 = m7045(r9, r10, r4)     // Catch: java.lang.Throwable -> L107
            r2.topMargin = r4     // Catch: java.lang.Throwable -> L107
            androidx.lifecycle.livedata.C1085.m1822(r1, r2)     // Catch: java.lang.Throwable -> L107
            androidx.activity.C1064.m372(r0, r3)     // Catch: java.lang.Throwable -> L107
            androidx.activity.C1064.m372(r0, r1)     // Catch: java.lang.Throwable -> L107
            r1 = 1864(0x748, float:2.612E-42)
        Lf3:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto Lf9;
                case 47384: goto L106;
                case 47417: goto L103;
                case 47483: goto Lff;
                default: goto Lf8;
            }     // Catch: java.lang.Throwable -> L107
        Lf8:
            goto Lf3
        Lf9:
            if (r15 == 0) goto Lff
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto Lf3
        Lff:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto Lf3
        L103:
            com.tencent.mmkv.C1109.m3617(r0, r15)     // Catch: java.lang.Throwable -> L107
        L106:
            return r0
        L107:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 855(0x357, float:1.198E-42)
            int r4 = androidx.loader.C1098.f124
            r4 = r4 ^ (-823(0xfffffffffffffcc9, float:NaN))
            r5 = 1085(0x43d, float:1.52E-42)
            java.lang.String r2 = androidx.activity.C1063.m241(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r10)
            goto L106
    }

    private android.widget.TextView createM3u8Tip(android.content.Context r12) {
            r11 = this;
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۨۥۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
        Lc:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56451: goto L23;
                case 1746873: goto L1a;
                case 1746910: goto L2c;
                case 1749601: goto L6b;
                case 1749854: goto L36;
                case 1750564: goto L99;
                case 1750624: goto Lc0;
                case 1751526: goto L79;
                case 1751710: goto L3d;
                case 1752487: goto L91;
                case 1752546: goto L5b;
                case 1752614: goto L87;
                case 1752705: goto L64;
                case 1753573: goto Lb8;
                case 1754406: goto L80;
                case 1754473: goto L4b;
                case 1754537: goto L52;
                case 1754593: goto L72;
                case 1755369: goto L43;
                case 1755525: goto La1;
                case 1755589: goto Lab;
                default: goto L13;
            }
        L13:
            int r6 = androidx.lifecycle.process.C1088.f114
            java.lang.String r1 = "۟ۦۥ"
            r4 = r1
            r9 = r6
            goto Lc
        L1a:
            int r6 = m7045(r11, r12, r10)
            java.lang.String r1 = "ۧۢۤ"
            r4 = r1
            r9 = r6
            goto Lc
        L23:
            int r6 = m7045(r11, r12, r8)
            java.lang.String r1 = "ۧۤۦ"
            r4 = r1
            r7 = r6
            goto Lc
        L2c:
            r1 = 65437(0xff9d, float:9.1697E-41)
            r6 = r1 ^ r9
            java.lang.String r1 = "ۢ۠۟"
            r4 = r1
            r10 = r6
            goto Lc
        L36:
            int r6 = org.luckypray.dexkit.C1125.f435
            java.lang.String r1 = "ۤۦ۠"
            r4 = r1
            r10 = r6
            goto Lc
        L3d:
            r5 = r10 ^ (-233(0xffffffffffffff17, float:NaN))
            java.lang.String r1 = "ۥۤۥ"
            r4 = r1
            goto Lc
        L43:
            short[] r1 = m6972()
            java.lang.String r4 = "ۥۣۧ"
            r2 = r1
            goto Lc
        L4b:
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            java.lang.String r1 = "ۧۦ۠"
            r4 = r1
            r7 = r6
            goto Lc
        L52:
            int r6 = m7045(r11, r12, r10)
            java.lang.String r1 = "ۢۨۤ"
            r4 = r1
            r8 = r6
            goto Lc
        L5b:
            r1 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            java.lang.String r1 = "ۤ۠ۢ"
            r4 = r1
            goto Lc
        L64:
            int r6 = androidx.activity.C1062.f88
            java.lang.String r1 = "ۣ۠ۡ"
            r4 = r1
            r9 = r6
            goto Lc
        L6b:
            kevin.fun.hook.webdav.C1118.m8517(r0, r10)
            java.lang.String r1 = "ۥۢ۟"
            r4 = r1
            goto Lc
        L72:
            r6 = r7 ^ (-932(0xfffffffffffffc5c, float:NaN))
            java.lang.String r1 = "ۤۧ"
            r4 = r1
            r8 = r6
            goto Lc
        L79:
            int r6 = androidx.core.C1073.f99
            java.lang.String r1 = "ۧ۠۟"
            r4 = r1
            r9 = r6
            goto Lc
        L80:
            r6 = r9 ^ 435(0x1b3, float:6.1E-43)
            java.lang.String r1 = "۟ۥ۟"
            r4 = r1
            r10 = r6
            goto Lc
        L87:
            int r6 = m7045(r11, r12, r5)
            java.lang.String r1 = "ۥ۠ۢ"
            r4 = r1
            r10 = r6
            goto Lc
        L91:
            kevin.fun.hook.audio.C1117.m8126(r0, r9, r7, r8, r10)
            java.lang.String r1 = "ۣۢ۟"
            r4 = r1
            goto Lc
        L99:
            r6 = r9 ^ (-109(0xffffffffffffff93, float:NaN))
            java.lang.String r1 = "ۨۧۤ"
            r4 = r1
            r10 = r6
            goto Lc
        La1:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r12)
            java.lang.String r1 = "ۨ۠ۡ"
            r4 = r1
            goto Lc
        Lab:
            r1 = 875(0x36b, float:1.226E-42)
            r3 = 2337(0x921, float:3.275E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1116.m8020(r2, r1, r10, r3)
            java.lang.String r4 = "ۦۣۤ"
            r3 = r1
            goto Lc
        Lb8:
            androidx.lifecycle.process.C1087.m1946(r0, r3)
            java.lang.String r1 = "۠ۨۡ"
            r4 = r1
            goto Lc
        Lc0:
            return r0
    }

    private android.widget.LinearLayout createProgressContainer(android.content.Context r27, kevin.fun.hook.KSHook.DownloadDialogHolder r28) {
            r26 = this;
            r8 = 0
            r23 = 0
            r19 = 0
            r22 = 0
            r15 = 0
            r20 = 0
            r12 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r5 = 0
            r16 = 0
            r14 = 0
            r13 = 0
            r10 = 0
            r17 = 0
            java.lang.String r18 = "ۣۤۡ"
        L1c:
            int r18 = kevin.fun.hook.audio.C1114.m7934(r18)
            switch(r18) {
                case 56569: goto L224;
                case 1746875: goto L1e4;
                case 1747650: goto Lf8;
                case 1747679: goto L68;
                case 1748834: goto L1fa;
                case 1749570: goto L137;
                case 1749607: goto L27a;
                case 1749700: goto L1d2;
                case 1749764: goto L1bc;
                case 1749849: goto L3d;
                case 1749852: goto L7d;
                case 1750602: goto Lab;
                case 1750689: goto L25a;
                case 1750722: goto L11e;
                case 1750750: goto L56;
                case 1751618: goto Lde;
                case 1751683: goto L153;
                case 1752518: goto L19d;
                case 1752582: goto L184;
                case 1752584: goto Lcd;
                case 1752614: goto L271;
                case 1752615: goto L28a;
                case 1752675: goto L20e;
                case 1752710: goto L168;
                case 1753571: goto L241;
                case 1753637: goto L2a6;
                default: goto L23;
            }
        L23:
            android.widget.ProgressBar r15 = new android.widget.ProgressBar
            r18 = 0
            r0 = r27
            r1 = r18
            r2 = r22
            r15.<init>(r0, r1, r2)
            r0 = r28
            r0.progressBar = r15
            android.widget.ProgressBar r15 = m7070(r28)
            int r23 = androidx.interpolator.C1082.f108
            java.lang.String r18 = "ۥۧۨ"
            goto L1c
        L3d:
            int r18 = org.luckypray.dexkit.C1124.f434
            r20 = -11751997(0xffffffffff4cadc3, float:-2.7206473E38)
            r20 = r20 ^ r18
            r0 = r20
            androidx.lifecycle.livedata.C1085.m1879(r11, r0)
            r0 = r26
            r1 = r27
            r2 = r22
            int r23 = m7045(r0, r1, r2)
            java.lang.String r18 = "ۢ۠ۥ"
            goto L1c
        L56:
            r7 = 1
            r6[r7] = r4
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r7.<init>(r6)
            int r23 = androidx.core.ktx.C1070.f96
            r18 = 16908846(0x102022e, float:2.3878793E-38)
            r21 = r18 ^ r23
            java.lang.String r18 = "ۨۡ"
            goto L1c
        L68:
            r0 = r17
            androidx.lifecycle.process.C1087.m1946(r0, r13)
            android.widget.TextView r17 = m7105(r28)
            r18 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r17, r18)
            android.widget.TextView r17 = m7105(r28)
            java.lang.String r18 = "۟ۥۡ"
            goto L1c
        L7d:
            r0 = r26
            r1 = r27
            r2 = r19
            int r23 = m7045(r0, r1, r2)
            r18 = 0
            r24 = 0
            r25 = 0
            r0 = r18
            r1 = r23
            r2 = r24
            r3 = r25
            androidx.drawerlayout.C1077.m1314(r5, r0, r1, r2, r3)
            android.widget.TextView r18 = new android.widget.TextView
            r0 = r18
            r1 = r27
            r0.<init>(r1)
            r0 = r18
            r1 = r28
            r1.progressText = r0
            java.lang.String r18 = "ۡۦۧ"
            goto L1c
        Lab:
            r13 = 913(0x391, float:1.28E-42)
            r18 = 3175(0xc67, float:4.449E-42)
            r0 = r22
            r1 = r18
            java.lang.String r13 = androidx.core.C1072.m957(r14, r13, r0, r1)
            r0 = r16
            androidx.lifecycle.process.C1087.m1946(r0, r13)
            android.widget.TextView r16 = m6981(r28)
            r18 = 1094713344(0x41400000, float:12.0)
            r0 = r16
            r1 = r18
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            java.lang.String r18 = "ۤۥۤ"
            goto L1c
        Lcd:
            android.widget.ProgressBar r15 = m7070(r28)
            androidx.activity.C1066.m498(r15, r7)
            android.widget.ProgressBar r15 = m7070(r28)
            int r21 = androidx.activity.C1065.f91
            java.lang.String r18 = "ۢۥۧ"
            goto L1c
        Lde:
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r0 = r27
            r8.<init>(r0)
            r18 = 1
            r0 = r18
            androidx.customview.C1074.m1119(r8, r0)
            int r23 = androidx.core.ktx.C1071.f97
            r0 = r23
            r0 = r0 ^ 906(0x38a, float:1.27E-42)
            r19 = r0
            java.lang.String r18 = "۠۟ۡ"
            goto L1c
        Lf8:
            r0 = r26
            r1 = r27
            r2 = r19
            int r18 = m7045(r0, r1, r2)
            r22 = 0
            r23 = 0
            r24 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r18
            androidx.drawerlayout.C1077.m1314(r8, r0, r1, r2, r3)
            int r23 = kevin.fun.hook.webdav.C1119.f418
            r18 = 16843102(0x101015e, float:2.369454E-38)
            r22 = r18 ^ r23
            java.lang.String r18 = "ۤۤ"
            goto L1c
        L11e:
            r0 = r26
            r1 = r27
            r2 = r22
            int r20 = m7045(r0, r1, r2)
            r0 = r20
            float r11 = (float) r0
            androidx.lifecycle.process.C1091.m2252(r9, r11)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            java.lang.String r18 = "ۢۨ۟"
            goto L1c
        L137:
            short[] r14 = m6972()
            int r19 = androidx.emoji2.viewsintegration.C1078.f104
            r0 = r19
            r0 = r0 ^ 609(0x261, float:8.53E-43)
            r23 = r0
            r13 = 915(0x393, float:1.282E-42)
            r18 = 1238(0x4d6, float:1.735E-42)
            r0 = r23
            r1 = r18
            java.lang.String r13 = androidx.loader.C1096.m2645(r14, r13, r0, r1)
            java.lang.String r18 = "۠۠۟"
            goto L1c
        L153:
            android.widget.TextView r10 = m6981(r28)
            r0 = r20
            kevin.fun.hook.webdav.C1118.m8517(r10, r0)
            android.widget.TextView r16 = m6981(r28)
            android.graphics.Typeface r10 = androidx.emoji2.C1080.m1508()
            java.lang.String r18 = "ۥۤۦ"
            goto L1c
        L168:
            r0 = r23
            r0 = r0 ^ 347(0x15b, float:4.86E-43)
            r18 = r0
            r0 = r26
            r1 = r27
            r2 = r18
            int r23 = m7045(r0, r1, r2)
            int r22 = androidx.loader.C1099.f125
            r0 = r22
            r0 = r0 ^ (-860(0xfffffffffffffca4, float:NaN))
            r20 = r0
            java.lang.String r18 = "ۣۤۢ"
            goto L1c
        L184:
            r4 = 8388689(0x800051, float:1.1755057E-38)
            r21 = r4 ^ r23
            android.graphics.drawable.ClipDrawable r4 = new android.graphics.drawable.ClipDrawable
            r6 = 1
            r0 = r21
            r4.<init>(r11, r0, r6)
            r0 = r22
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r0]
            r18 = 0
            r6[r18] = r9
            java.lang.String r18 = "ۣۦۡ"
            goto L1c
        L19d:
            int r23 = androidx.customview.C1074.f100
            r0 = r23
            r0 = r0 ^ (-243(0xffffffffffffff0d, float:NaN))
            r21 = r0
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            r1 = r21
            r2 = r18
            r12.<init>(r0, r1, r2)
            android.widget.TextView r17 = m6981(r28)
            java.lang.String r18 = "ۦۦۥ"
            goto L1c
        L1bc:
            r22 = r21 ^ (-81)
            r0 = r22
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3733(r15, r0)
            android.widget.ProgressBar r15 = m7070(r28)
            r18 = 0
            r0 = r18
            androidx.loader.C1094.m2504(r15, r0)
            java.lang.String r18 = "ۦۤۡ"
            goto L1c
        L1d2:
            int r20 = androidx.lifecycle.process.C1087.f113
            r18 = -8389227(0xffffffffff7ffd95, float:-3.4026981E38)
            r19 = r18 ^ r20
            r0 = r17
            r1 = r19
            androidx.documentfile.C1076.m1233(r0, r1)
            java.lang.String r18 = "ۥۡۢ"
            goto L1c
        L1e4:
            int r21 = androidx.interpolator.C1081.f107
            r18 = 6711150(0x66676e, float:9.404324E-39)
            r22 = r18 ^ r21
            r0 = r17
            r1 = r22
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)
            android.widget.TextView r17 = m7105(r28)
            java.lang.String r18 = "ۣۢۥ"
            goto L1c
        L1fa:
            android.widget.TextView r16 = m6981(r28)
            short[] r14 = m6972()
            int r21 = androidx.loader.C1095.f121
            r0 = r21
            r0 = r0 ^ (-962(0xfffffffffffffc3e, float:NaN))
            r22 = r0
            java.lang.String r18 = "ۣۡۨ"
            goto L1c
        L20e:
            r18 = 2039594(0x1f1f2a, float:2.85808E-39)
            r20 = r18 ^ r22
            r0 = r20
            androidx.lifecycle.livedata.C1085.m1879(r9, r0)
            int r23 = com.tencent.mmkv.C1109.f135
            r0 = r23
            r0 = r0 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r22 = r0
            java.lang.String r18 = "ۣۥۤ"
            goto L1c
        L224:
            r18 = 0
            r0 = r18
            r1 = r21
            androidx.vectordrawable.C1105.m3331(r7, r0, r1)
            int r22 = androidx.appcompat.resources.C1068.f94
            r18 = 16908803(0x1020203, float:2.3878672E-38)
            r23 = r18 ^ r22
            r18 = 1
            r0 = r18
            r1 = r23
            androidx.vectordrawable.C1105.m3331(r7, r0, r1)
            java.lang.String r18 = "ۥۣۦ"
            goto L1c
        L241:
            android.widget.ProgressBar r15 = m7070(r28)
            androidx.activity.C1064.m372(r8, r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r0 = r27
            r5.<init>(r0)
            r18 = 0
            r0 = r18
            androidx.customview.C1074.m1119(r5, r0)
            java.lang.String r18 = "ۢۨۢ"
            goto L1c
        L25a:
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r0 = r20
            r1 = r23
            r12.<init>(r0, r1)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3778(r15, r12)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            int r22 = androidx.annotation.experimental.C1067.f93
            java.lang.String r18 = "ۥۦۤ"
            goto L1c
        L271:
            r0 = r17
            androidx.activity.C1064.m372(r5, r0)
            androidx.activity.C1064.m372(r8, r5)
            return r8
        L27a:
            r0 = r23
            float r0 = (float) r0
            r18 = r0
            r0 = r18
            androidx.lifecycle.process.C1091.m2252(r11, r0)
            int r23 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r18 = "ۥۣۤ"
            goto L1c
        L28a:
            r0 = r16
            androidx.customview.C1074.m47(r0, r10)
            android.widget.TextView r16 = new android.widget.TextView
            r0 = r16
            r1 = r27
            r0.<init>(r1)
            r0 = r16
            r1 = r28
            r1.speedText = r0
            android.widget.TextView r17 = m7105(r28)
            java.lang.String r18 = "ۢ۟۟"
            goto L1c
        L2a6:
            r0 = r17
            androidx.lifecycle.livedata.C1085.m1822(r0, r12)
            android.widget.TextView r17 = m6981(r28)
            r0 = r17
            androidx.activity.C1064.m372(r5, r0)
            android.widget.TextView r17 = m7105(r28)
            java.lang.String r18 = "ۥۤۥ"
            goto L1c
    }

    private android.widget.LinearLayout createProgressPanel(android.content.Context r22, kevin.fun.hook.KSHook.DownloadDialogHolder r23, java.lang.String r24, java.lang.String r25) {
            r21 = this;
            r5 = 0
            r16 = 0
            r11 = 0
            r15 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            r17 = 0
            r10 = 0
            r7 = 0
            r6 = 0
            java.lang.String r18 = "ۣ۟ۧ"
        L13:
            int r18 = kevin.fun.hook.audio.C1114.m7934(r18)
            switch(r18) {
                case 56351: goto Le0;
                case 56354: goto L103;
                case 1746695: goto Ld0;
                case 1746758: goto La4;
                case 1746940: goto L148;
                case 1746972: goto L3e;
                case 1747873: goto L1db;
                case 1748641: goto L1cd;
                case 1748671: goto L12b;
                case 1748738: goto L89;
                case 1749639: goto Lc1;
                case 1749672: goto L176;
                case 1749731: goto L186;
                case 1749796: goto L1eb;
                case 1749856: goto L1b3;
                case 1750539: goto L55;
                case 1750718: goto L115;
                case 1750752: goto L196;
                case 1751500: goto L79;
                case 1752555: goto L169;
                case 1753605: goto Lef;
                case 1754438: goto L97;
                case 1754503: goto Lb6;
                case 1754654: goto L31;
                case 1755376: goto L161;
                case 1755403: goto L68;
                default: goto L1a;
            }
        L1a:
            int r15 = androidx.drawerlayout.C1077.f103
            r0 = r15 ^ 282(0x11a, float:3.95E-43)
            r16 = r0
            r10 = 921(0x399, float:1.29E-42)
            r18 = 2313(0x909, float:3.241E-42)
            r0 = r17
            r1 = r16
            r2 = r18
            java.lang.String r10 = androidx.core.ktx.C1071.m874(r0, r10, r1, r2)
            java.lang.String r18 = "ۨۡۤ"
            goto L13
        L31:
            r3.gravity = r11
            androidx.vectordrawable.C1105.m3296(r5, r3)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            java.lang.String r18 = "ۢۡۦ"
            goto L13
        L3e:
            r0 = r16
            r15 = r0 ^ 318(0x13e, float:4.46E-43)
            r0 = r21
            r1 = r22
            int r16 = m7045(r0, r1, r15)
            r0 = r21
            r1 = r22
            int r12 = m7045(r0, r1, r15)
            java.lang.String r18 = "۟ۧۤ"
            goto L13
        L55:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r0 = r22
            r5.<init>(r0)
            r16 = 1
            r0 = r16
            androidx.customview.C1074.m1119(r5, r0)
            int r16 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r18 = "ۣۣۧ"
            goto L13
        L68:
            java.lang.StringBuilder r9 = androidx.lifecycle.livedata.C1085.m1859(r9, r10)
            r0 = r24
            java.lang.StringBuilder r9 = androidx.lifecycle.livedata.C1085.m1859(r9, r0)
            java.lang.String r10 = kevin.fun.hook.webdav.C1119.m8573(r9)
            java.lang.String r18 = "۟۟ۧ"
            goto L13
        L79:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = androidx.lifecycle.livedata.C1085.m1859(r9, r6)
            short[] r17 = m6972()
            java.lang.String r18 = "ۣۥ۠"
            goto L13
        L89:
            short[] r17 = m6972()
            int r16 = androidx.lifecycle.process.C1091.f117
            r0 = r16
            r13 = r0 ^ (-483(0xfffffffffffffe1d, float:NaN))
            java.lang.String r18 = "ۢۨۦ"
            goto L13
        L97:
            int r13 = androidx.lifecycle.process.C1087.f113
            r14 = r13 ^ 622(0x26e, float:8.72E-43)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r12, r14)
            java.lang.String r18 = "ۧۨ۟"
            goto L13
        La4:
            kevin.fun.hook.webdav.C1118.m8517(r8, r14)
            androidx.documentfile.C1076.m1233(r8, r11)
            r0 = r21
            r1 = r22
            int r15 = m7045(r0, r1, r12)
            java.lang.String r18 = "ۣۦۣ"
            goto L13
        Lb6:
            r11 = r16 ^ 67
            androidx.emoji2.C1080.m1542(r5, r11)
            int r16 = kevin.fun.hook.webdav.C1119.f418
            java.lang.String r18 = "۟ۨۥ"
            goto L13
        Lc1:
            int r15 = androidx.vectordrawable.animated.C1102.f128
            r0 = r15 ^ (-196(0xffffffffffffff3c, float:NaN))
            r16 = r0
            r0 = r16
            androidx.lifecycle.livedata.C1085.m1879(r4, r0)
            java.lang.String r18 = "ۢۢۨ"
            goto L13
        Ld0:
            androidx.lifecycle.process.C1087.m1946(r8, r10)
            r7 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r8, r7)
            android.graphics.Typeface r7 = androidx.emoji2.C1080.m1508()
            java.lang.String r18 = "ۥۢۨ"
            goto L13
        Le0:
            float r0 = (float) r14
            r18 = r0
            r0 = r18
            androidx.lifecycle.process.C1091.m2252(r4, r0)
            androidx.activity.C1065.m397(r5, r4)
            java.lang.String r18 = "ۦۥۤ"
            goto L13
        Lef:
            android.widget.TextView r8 = new android.widget.TextView
            r0 = r22
            r8.<init>(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            short[] r17 = m6972()
            java.lang.String r18 = "ۢۢ"
            goto L13
        L103:
            int r15 = kevin.fun.hook.webdav.C1119.f418
            r16 = r15 ^ 62
            r0 = r21
            r1 = r22
            r2 = r16
            int r12 = m7045(r0, r1, r2)
            java.lang.String r18 = "ۧۡ۠"
            goto L13
        L115:
            int r14 = androidx.vectordrawable.animated.C1102.f128
            r12 = r14 ^ 192(0xc0, float:2.69E-43)
            r18 = 934(0x3a6, float:1.309E-42)
            r19 = 2629(0xa45, float:3.684E-42)
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r25 = androidx.vectordrawable.C1103.m3132(r0, r1, r12, r2)
            java.lang.String r18 = "ۢۦۨ"
            goto L13
        L12b:
            r14 = r13 ^ 486(0x1e6, float:6.81E-43)
            r0 = r21
            r1 = r22
            int r12 = m7045(r0, r1, r14)
            r18 = 0
            r19 = 0
            r20 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            kevin.fun.hook.audio.C1117.m8126(r8, r0, r1, r2, r12)
            java.lang.String r18 = "۠ۦۧ"
            goto L13
        L148:
            r0 = r21
            r1 = r22
            int r13 = m7045(r0, r1, r15)
            r0 = r21
            r1 = r22
            int r14 = m7045(r0, r1, r15)
            r0 = r16
            androidx.drawerlayout.C1077.m1314(r5, r0, r12, r13, r14)
            java.lang.String r18 = "ۣۡ"
            goto L13
        L161:
            android.widget.TextView r3 = m7066(r21, r22, r23)
            androidx.activity.C1064.m372(r5, r3)
            return r5
        L169:
            androidx.customview.C1074.m47(r8, r7)
            int r13 = androidx.core.ktx.C1070.f96
            r14 = -13422307(0xffffffffff33311d, float:-2.3818682E38)
            r14 = r14 ^ r13
            java.lang.String r18 = "۟ۡۨ"
            goto L13
        L176:
            int r13 = androidx.lifecycle.livedata.C1085.f111
            r12 = r13 ^ 797(0x31d, float:1.117E-42)
            r0 = r21
            r1 = r22
            int r14 = m7045(r0, r1, r12)
            java.lang.String r18 = "ۡ۠"
            goto L13
        L186:
            r15 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r8, r15)
            int r15 = kevin.fun.hook.audio.C1116.f405
            r16 = -10066380(0xffffffffff666634, float:-3.062531E38)
            r16 = r16 ^ r15
            java.lang.String r18 = "ۡ۠۠"
            goto L13
        L196:
            r18 = 0
            r19 = 0
            r20 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            kevin.fun.hook.audio.C1117.m8126(r8, r0, r1, r2, r15)
            androidx.activity.C1064.m372(r5, r8)
            android.widget.TextView r8 = new android.widget.TextView
            r0 = r22
            r8.<init>(r0)
            java.lang.String r18 = "ۣۡۤ"
            goto L13
        L1b3:
            r6 = 925(0x39d, float:1.296E-42)
            r10 = 479(0x1df, float:6.71E-43)
            r0 = r17
            java.lang.String r24 = androidx.activity.C1063.m241(r0, r6, r13, r10)
            java.lang.String r10 = androidx.emoji2.C1080.m1562()
            r0 = r25
            r1 = r24
            java.lang.String r6 = androidx.loader.C1096.m2667(r0, r1, r10)
            java.lang.String r18 = "ۤ۟ۧ"
            goto L13
        L1cd:
            r0 = r16
            kevin.fun.hook.webdav.C1118.m8517(r8, r0)
            androidx.documentfile.C1076.m1233(r8, r11)
            int r13 = androidx.activity.C1064.f90
            java.lang.String r18 = "ۡۡ۟"
            goto L13
        L1db:
            androidx.activity.C1064.m372(r5, r8)
            android.widget.LinearLayout r18 = m7014(r21, r22, r23)
            r0 = r18
            androidx.activity.C1064.m372(r5, r0)
            java.lang.String r18 = "ۨ۠ۨ"
            goto L13
        L1eb:
            r0 = r25
            java.lang.StringBuilder r18 = androidx.lifecycle.livedata.C1085.m1859(r9, r0)
            java.lang.String r24 = kevin.fun.hook.webdav.C1119.m8573(r18)
            r0 = r24
            androidx.lifecycle.process.C1087.m1946(r8, r0)
            java.lang.String r18 = "ۢۤۥ"
            goto L13
    }

    private android.widget.LinearLayout createQualityPanel(android.content.Context r11, java.lang.ref.WeakReference<android.app.Dialog> r12, java.util.List<kevin.fun.hook.KSHook.VideoInfo> r13, boolean r14) {
            r10 = this;
            r9 = 1
            r8 = 0
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            androidx.customview.C1074.m1119(r1, r9)
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r0 = r0 ^ (-938(0xfffffffffffffc56, float:NaN))
            int r2 = m7045(r10, r11, r0)
            int r3 = androidx.vectordrawable.animated.C1102.f128
            r3 = r3 ^ 203(0xcb, float:2.84E-43)
            int r4 = m7045(r10, r11, r3)
            int r0 = m7045(r10, r11, r0)
            int r5 = androidx.activity.C1065.f91
            r5 = r5 ^ (-37)
            int r6 = m7045(r10, r11, r5)
            androidx.drawerlayout.C1077.m1314(r1, r2, r4, r0, r6)
            int r0 = androidx.loader.C1096.f122
            r0 = r0 ^ 958(0x3be, float:1.342E-42)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ (-19)
            r2.<init>(r0, r4)
            r4 = 80
            r2.gravity = r4
            androidx.vectordrawable.C1105.m3296(r1, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r2, r0)
            int r0 = m7045(r10, r11, r5)
            float r0 = (float) r0
            int r4 = m7045(r10, r11, r5)
            float r4 = (float) r4
            int r6 = m7045(r10, r11, r5)
            float r6 = (float) r6
            int r5 = m7045(r10, r11, r5)
            float r5 = (float) r5
            float[] r3 = new float[r3]
            r7 = 0
            r3[r7] = r0
            r3[r9] = r4
            r0 = 2
            r3[r0] = r6
            r0 = 3
            r3[r0] = r5
            r0 = 4
            r3[r0] = r8
            r0 = 5
            r3[r0] = r8
            r0 = 6
            r3[r0] = r8
            r0 = 7
            r3[r0] = r8
            androidx.vectordrawable.C1103.m3187(r2, r3)
            androidx.activity.C1065.m397(r1, r2)
            short[] r0 = m6972()
            r2 = 937(0x3a9, float:1.313E-42)
            int r3 = androidx.core.ktx.C1070.f96
            r3 = r3 ^ 552(0x228, float:7.74E-43)
            r4 = 2882(0xb42, float:4.039E-42)
            java.lang.String r0 = androidx.loader.C1098.m2787(r0, r2, r3, r4)
            android.view.View r0 = m7112(r10, r11, r0)
            androidx.activity.C1064.m372(r1, r0)
            r0 = 1616(0x650, float:2.264E-42)
        L91:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L97;
                case 49: goto L9a;
                case 204: goto L9f;
                case 239: goto Ldc;
                default: goto L96;
            }
        L96:
            goto L91
        L97:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L91
        L9a:
            if (r14 == 0) goto L97
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L91
        L9f:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r10)
            java.lang.String r2 = m7002(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        La9:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto Laf;
                case 54: goto Lb4;
                case 471: goto Ldc;
                case 500: goto Lb7;
                default: goto Lae;
            }
        Lae:
            goto La9
        Laf:
            if (r2 == 0) goto Lb4
            r0 = 1833(0x729, float:2.569E-42)
            goto La9
        Lb4:
            r0 = 1802(0x70a, float:2.525E-42)
            goto La9
        Lb7:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r10)
            java.lang.String r0 = m7002(r0)
            boolean r2 = androidx.activity.C1066.m488(r0)
            r0 = 1864(0x748, float:2.612E-42)
        Lc5:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto Lcb;
                case 47384: goto Ldc;
                case 47417: goto Ld5;
                case 47483: goto Ld1;
                default: goto Lca;
            }
        Lca:
            goto Lc5
        Lcb:
            if (r2 != 0) goto Ld1
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto Lc5
        Ld1:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto Lc5
        Ld5:
            android.widget.TextView r0 = m7059(r10, r11)
            androidx.activity.C1064.m372(r1, r0)
        Ldc:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r11)
            androidx.customview.C1074.m1119(r2, r9)
            androidx.activity.C1064.m372(r1, r2)
            java.util.Iterator r3 = androidx.core.ktx.C1071.m904(r13)
        Leb:
            boolean r4 = androidx.activity.C1063.m269(r3)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lf2:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto Lfa;
                case 45: goto L15f;
                case 76: goto L104;
                case 239: goto Lfe;
                default: goto Lf9;
            }
        Lf9:
            goto Lf2
        Lfa:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lf2
        Lfe:
            if (r4 != 0) goto Lfa
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lf2
        L104:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L107:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L10f;
                case 53: goto L15e;
                case 503: goto L113;
                case 32495: goto L119;
                default: goto L10e;
            }
        L10e:
            goto L107
        L10f:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L107
        L113:
            if (r14 == 0) goto L10f
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L107
        L119:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r10)
            java.lang.String r3 = m7002(r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        L124:
            r4 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto L12c;
                case 50: goto L132;
                case 76: goto L136;
                case 83: goto L15e;
                default: goto L12b;
            }
        L12b:
            goto L124
        L12c:
            if (r3 == 0) goto L132
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L124
        L132:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L124
        L136:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r10)
            java.lang.String r0 = m7002(r0)
            boolean r3 = androidx.activity.C1066.m488(r0)
            r0 = 49790(0xc27e, float:6.977E-41)
        L145:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto L14d;
                case 51: goto L15e;
                case 84: goto L157;
                case 241: goto L151;
                default: goto L14c;
            }
        L14c:
            goto L145
        L14d:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L145
        L151:
            if (r3 != 0) goto L14d
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L145
        L157:
            android.view.View r0 = m7031(r10, r11, r12)
            androidx.activity.C1064.m372(r2, r0)
        L15e:
            return r1
        L15f:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r3)
            kevin.fun.hook.KSHook$VideoInfo r0 = (kevin.fun.hook.KSHook.VideoInfo) r0
            android.view.View r0 = m7007(r10, r11, r12, r0)
            androidx.activity.C1064.m372(r2, r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L16f:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 497: goto L177;
                case 1711: goto Leb;
                default: goto L176;
            }
        L176:
            goto L16f
        L177:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L16f
    }

    private android.widget.LinearLayout createSettingsPanel(android.content.Context r20, java.lang.ref.WeakReference<android.app.Dialog> r21, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r22) {
            r19 = this;
            r2 = 0
            r13 = 0
            r11 = 0
            r12 = 0
            r8 = 0
            r10 = 0
            r9 = 0
            r5 = 0
            r17 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r3 = 0
            r6 = 0
            r4 = 0
            java.lang.String r7 = "ۣ۟"
        L13:
            int r7 = kevin.fun.hook.audio.C1114.m7934(r7)
            switch(r7) {
                case 56328: goto L81;
                case 56412: goto L11a;
                case 1746820: goto L161;
                case 1746911: goto L4a;
                case 1748614: goto L139;
                case 1748643: goto Lef;
                case 1748857: goto L29;
                case 1748862: goto L2d;
                case 1749795: goto L105;
                case 1751494: goto L12b;
                case 1751500: goto Ld6;
                case 1751710: goto L3e;
                case 1751716: goto L150;
                case 1752489: goto La9;
                case 1752671: goto L59;
                case 1752707: goto L10e;
                case 1753514: goto L9a;
                case 1753573: goto L170;
                case 1754473: goto Lcb;
                case 1754508: goto Le1;
                case 1754623: goto L6f;
                case 1755402: goto L90;
                case 1755561: goto Lba;
                default: goto L1a;
            }
        L1a:
            r0 = r19
            r1 = r20
            int r9 = m7045(r0, r1, r10)
            int r12 = androidx.activity.C1062.f88
            r8 = r12 ^ (-65)
            java.lang.String r7 = "ۡ۟ۤ"
            goto L13
        L29:
            androidx.activity.C1064.m372(r2, r6)
            return r2
        L2d:
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r12, r11)
            r18 = 80
            r0 = r18
            r7.gravity = r0
            androidx.vectordrawable.C1105.m3296(r2, r7)
            java.lang.String r7 = "ۥۧۥ"
            goto L13
        L3e:
            r7 = 0
            r3[r7] = r17
            r7 = 1
            r3[r7] = r14
            r7 = 2
            r3[r7] = r15
            java.lang.String r7 = "ۨۦۧ"
            goto L13
        L4a:
            r11 = r13 ^ (-532(0xfffffffffffffdec, float:NaN))
            r0 = r19
            r1 = r20
            int r13 = m7045(r0, r1, r11)
            int r12 = org.luckypray.dexkit.C1124.f434
            java.lang.String r7 = "ۡ۠ۢ"
            goto L13
        L59:
            r0 = r19
            r1 = r20
            int r13 = m7045(r0, r1, r9)
            float r0 = (float) r13
            r17 = r0
            r0 = r19
            r1 = r20
            int r10 = m7045(r0, r1, r9)
            java.lang.String r7 = "ۤ۟ۡ"
            goto L13
        L6f:
            r9 = r11 ^ 86
            r7 = 943(0x3af, float:1.321E-42)
            r18 = 1710(0x6ae, float:2.396E-42)
            r0 = r18
            java.lang.String r7 = androidx.lifecycle.process.C1087.m2008(r4, r7, r9, r0)
            androidx.lifecycle.process.C1087.m1946(r6, r7)
            java.lang.String r7 = "۠ۨ"
            goto L13
        L81:
            r7 = 1099431936(0x41880000, float:17.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r7)
            android.graphics.Typeface r7 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r6, r7)
            java.lang.String r7 = "ۣۧۨ"
            goto L13
        L90:
            r12 = r13 ^ (-645(0xfffffffffffffd7b, float:NaN))
            int r10 = androidx.customview.C1074.f100
            r11 = r10 ^ (-243(0xffffffffffffff0d, float:NaN))
            java.lang.String r7 = "ۡۧۤ"
            goto L13
        L9a:
            r7 = 7
            r18 = 0
            r3[r7] = r18
            androidx.vectordrawable.C1103.m3187(r5, r3)
            androidx.activity.C1065.m397(r2, r5)
            java.lang.String r7 = "ۤۦۦ"
            goto L13
        La9:
            r0 = r19
            r1 = r20
            int r12 = m7045(r0, r1, r9)
            float r0 = (float) r12
            r16 = r0
            float[] r3 = new float[r8]
            java.lang.String r7 = "ۤۦ۠"
            goto L13
        Lba:
            r7 = 3
            r3[r7] = r16
            r7 = 4
            r18 = 0
            r3[r7] = r18
            r7 = 5
            r18 = 0
            r3[r7] = r18
            java.lang.String r7 = "ۤ۟ۧ"
            goto L13
        Lcb:
            int r13 = androidx.interpolator.C1083.f109
            r11 = r13 ^ (-429(0xfffffffffffffe53, float:NaN))
            androidx.documentfile.C1076.m1233(r6, r11)
            java.lang.String r7 = "۠ۦ۟"
            goto L13
        Ld6:
            int r13 = org.luckypray.dexkit.C1124.f434
            r10 = r13 ^ 661(0x295, float:9.26E-43)
            r7 = 0
            r3[r10] = r7
            java.lang.String r7 = "ۦۢۦ"
            goto L13
        Le1:
            int r12 = kevin.fun.hook.webdav.C1118.f417
            r7 = 16776853(0xfffe95, float:2.3509378E-38)
            r8 = r7 ^ r12
            kevin.fun.hook.webdav.C1118.m8517(r6, r8)
            java.lang.String r7 = "ۧۢۤ"
            goto L13
        Lef:
            r8 = r12 ^ 667(0x29b, float:9.35E-43)
            r0 = r19
            r1 = r20
            int r12 = m7045(r0, r1, r8)
            r0 = r19
            r1 = r20
            int r10 = m7045(r0, r1, r11)
            java.lang.String r7 = "ۦۣۤ"
            goto L13
        L105:
            androidx.drawerlayout.C1077.m1314(r2, r13, r12, r10, r11)
            int r13 = androidx.versionedparcelable.C1107.f133
            java.lang.String r7 = "ۣۨۡ"
            goto L13
        L10e:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r5, r12)
            java.lang.String r7 = "ۥۦ۠"
            goto L13
        L11a:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r0 = r20
            r2.<init>(r0)
            r7 = 1
            androidx.customview.C1074.m1119(r2, r7)
            int r13 = androidx.core.C1072.f98
            java.lang.String r7 = "۟ۦۦ"
            goto L13
        L12b:
            float r14 = (float) r10
            r0 = r19
            r1 = r20
            int r11 = m7045(r0, r1, r9)
            float r15 = (float) r11
            java.lang.String r7 = "ۥ۠ۤ"
            goto L13
        L139:
            r0 = r19
            r1 = r20
            int r13 = m7045(r0, r1, r8)
            r7 = 0
            r18 = 0
            r0 = r18
            kevin.fun.hook.audio.C1117.m8126(r6, r7, r9, r0, r13)
            androidx.activity.C1064.m372(r2, r6)
            java.lang.String r7 = "ۣ۟ۨ"
            goto L13
        L150:
            android.widget.TextView r6 = new android.widget.TextView
            r0 = r20
            r6.<init>(r0)
            short[] r4 = m6972()
            int r11 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r7 = "ۧۧ۟"
            goto L13
        L161:
            android.widget.LinearLayout r6 = m6985(r19, r20, r21, r22)
            androidx.activity.C1064.m372(r2, r6)
            android.widget.TextView r6 = m7068(r19, r20, r21)
            java.lang.String r7 = "ۡۧ۟"
            goto L13
        L170:
            int r7 = androidx.viewpager.C1108.f134
            r9 = r7 ^ (-504(0xfffffffffffffe08, float:NaN))
            r0 = r19
            r1 = r20
            int r11 = m7045(r0, r1, r9)
            java.lang.String r7 = "ۢۦۧ"
            goto L13
    }

    private android.widget.LinearLayout createShareBottomBar(android.content.Context r23, android.app.Dialog r24, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r25) {
            r22 = this;
            r4 = 0
            r21 = 0
            r20 = 0
            r18 = 0
            r19 = 0
            r17 = 0
            r15 = 0
            r5 = 0
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = 0
            java.lang.String r16 = "ۡۧۢ"
            r10 = r3
            r11 = r4
            r12 = r8
        L19:
            int r3 = kevin.fun.hook.audio.C1114.m7934(r16)
            switch(r3) {
                case 56351: goto L1fe;
                case 56385: goto L37;
                case 56479: goto L1ea;
                case 56538: goto L172;
                case 1746851: goto L15c;
                case 1747687: goto L1d1;
                case 1747809: goto L1a0;
                case 1748702: goto L47;
                case 1748766: goto L5f;
                case 1748860: goto L97;
                case 1748895: goto L74;
                case 1750538: goto Lc4;
                case 1750594: goto Lfc;
                case 1750602: goto Lad;
                case 1751778: goto L112;
                case 1751779: goto L125;
                case 1752521: goto Ldd;
                case 1752672: goto L183;
                case 1752739: goto L144;
                case 1754593: goto L1b6;
                case 1755405: goto Lee;
                default: goto L20;
            }
        L20:
            r0 = r21
            r8 = r0 ^ 825(0x339, float:1.156E-42)
            r0 = r22
            r1 = r23
            int r21 = m7045(r0, r1, r8)
            int r4 = androidx.drawerlayout.C1077.f103
            java.lang.String r3 = "ۡۨۦ"
            r16 = r3
            r18 = r4
            r20 = r8
            goto L19
        L37:
            short[] r3 = m6972()
            int r8 = kevin.fun.hook.audio.C1117.f406
            r20 = r8 ^ 64
            java.lang.String r4 = "ۧۦ۠"
            r15 = r3
            r16 = r4
            r17 = r8
            goto L19
        L47:
            r0 = r20
            r8 = r0 ^ (-361(0xfffffffffffffe97, float:NaN))
            r3 = 966(0x3c6, float:1.354E-42)
            r4 = 2248(0x8c8, float:3.15E-42)
            java.lang.String r5 = org.luckypray.dexkit.C1123.m10510(r15, r3, r8, r4)
            short[] r3 = m6972()
            java.lang.String r4 = "۠ۤۥ"
            r15 = r3
            r16 = r4
            r19 = r8
            goto L19
        L5f:
            int r8 = androidx.viewpager.C1108.f134
            r4 = r8 ^ (-495(0xfffffffffffffe11, float:NaN))
            r3 = 983(0x3d7, float:1.377E-42)
            r7 = 3161(0xc59, float:4.43E-42)
            java.lang.String r7 = androidx.loader.C1098.m2787(r15, r3, r4, r7)
            java.lang.String r3 = "ۥۨۦ"
            r16 = r3
            r18 = r4
            r21 = r8
            goto L19
        L74:
            r0 = r18
            r0 = r0 ^ 278(0x116, float:3.9E-43)
            r19 = r0
            r0 = r22
            r1 = r23
            r2 = r19
            int r8 = m7045(r0, r1, r2)
            r0 = r22
            r1 = r23
            r2 = r20
            int r4 = m7045(r0, r1, r2)
            java.lang.String r3 = "ۤۨۧ"
            r16 = r3
            r17 = r4
            r18 = r8
            goto L19
        L97:
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r0 = r23
            r3.<init>(r0)
            r4 = 0
            androidx.customview.C1074.m1119(r3, r4)
            int r8 = androidx.activity.C1065.f91
            java.lang.String r4 = "ۥۡۥ"
            r11 = r3
            r16 = r4
            r21 = r8
            goto L19
        Lad:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda18 r3 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda18
            r0 = r22
            r1 = r23
            r3.<init>(r0, r13, r1)
            short[] r4 = m6972()
            int r20 = kevin.fun.hook.webdav.C1118.f417
            java.lang.String r8 = "ۡۢ۟"
            r14 = r3
            r15 = r4
            r16 = r8
            goto L19
        Lc4:
            r0 = r20
            r8 = r0 ^ (-604(0xfffffffffffffda4, float:NaN))
            r3 = 981(0x3d5, float:1.375E-42)
            r4 = 553(0x229, float:7.75E-43)
            java.lang.String r6 = androidx.versionedparcelable.C1106.m3338(r15, r3, r8, r4)
            short[] r3 = m6972()
            java.lang.String r4 = "ۡۤۡ"
            r15 = r3
            r16 = r4
            r19 = r8
            goto L19
        Ldd:
            r8 = r21 ^ (-38)
            androidx.emoji2.C1080.m1542(r11, r8)
            int r4 = androidx.activity.C1066.f92
            java.lang.String r3 = "۟ۨۤ"
            r16 = r3
            r20 = r8
            r21 = r4
            goto L19
        Lee:
            int r4 = androidx.startup.C1100.f126
            r8 = r4 ^ 276(0x114, float:3.87E-43)
            java.lang.String r3 = "۟ۤۨ"
            r16 = r3
            r19 = r4
            r21 = r8
            goto L19
        Lfc:
            int r8 = androidx.vectordrawable.C1103.f129
            r4 = r8 ^ 287(0x11f, float:4.02E-43)
            r3 = 947(0x3b3, float:1.327E-42)
            r5 = 1380(0x564, float:1.934E-42)
            java.lang.String r5 = androidx.lifecycle.process.C1090.m2213(r15, r3, r4, r5)
            java.lang.String r3 = "ۧۡ"
            r16 = r3
            r17 = r4
            r18 = r8
            goto L19
        L112:
            short[] r3 = m6972()
            int r18 = androidx.versionedparcelable.C1107.f133
            r0 = r18
            r8 = r0 ^ 646(0x286, float:9.05E-43)
            java.lang.String r4 = "۠۠ۧ"
            r15 = r3
            r16 = r4
            r17 = r8
            goto L19
        L125:
            r0 = r22
            r1 = r23
            r2 = r19
            int r8 = m7045(r0, r1, r2)
            r0 = r21
            r1 = r18
            r2 = r17
            androidx.drawerlayout.C1077.m1314(r11, r0, r1, r2, r8)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            java.lang.String r3 = "ۥۤ"
            r16 = r3
            r19 = r4
            r20 = r8
            goto L19
        L144:
            int r17 = androidx.startup.C1101.f127
            r3 = -16776450(0xffffffffff0002fe, float:-1.7015672E38)
            r8 = r3 ^ r17
            r3 = r22
            r4 = r23
            android.view.View r3 = m7034(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r4 = "ۨۡۦ"
            r10 = r3
            r16 = r4
            r20 = r8
            goto L19
        L15c:
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r21
            r3.<init>(r4, r0, r8)
            androidx.lifecycle.livedata.C1085.m1843(r12, r3)
            androidx.lifecycle.livedata.C1085.m1843(r10, r3)
            java.lang.String r3 = "ۡ۠"
            r16 = r3
            goto L19
        L172:
            androidx.lifecycle.runtime.C1092.m2336(r11, r5)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r0 = r24
            r3.<init>(r0)
            java.lang.String r4 = "ۣۡۨ"
            r13 = r3
            r16 = r4
            goto L19
        L183:
            r3 = r22
            r4 = r23
            r8 = r21
            r9 = r14
            android.view.View r3 = m7034(r3, r4, r5, r6, r7, r8, r9)
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda19 r9 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda19
            r0 = r22
            r1 = r23
            r2 = r25
            r9.<init>(r0, r13, r1, r2)
            java.lang.String r4 = "ۤۨۦ"
            r12 = r3
            r16 = r4
            goto L19
        L1a0:
            int r8 = androidx.viewpager.C1108.f134
            r4 = r8 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r3 = 968(0x3c8, float:1.356E-42)
            r6 = 2890(0xb4a, float:4.05E-42)
            java.lang.String r6 = androidx.documentfile.C1076.m1234(r15, r3, r4, r6)
            java.lang.String r3 = "ۣۢ"
            r16 = r3
            r18 = r4
            r21 = r8
            goto L19
        L1b6:
            r3 = 970(0x3ca, float:1.359E-42)
            r4 = 2089(0x829, float:2.927E-42)
            r0 = r20
            java.lang.String r7 = androidx.lifecycle.livedata.C1084.m1796(r15, r3, r0, r4)
            int r4 = androidx.customview.C1075.f101
            r3 = 16777114(0xffff9a, float:2.3509744E-38)
            r8 = r3 ^ r4
            java.lang.String r3 = "ۥۦۡ"
            r16 = r3
            r19 = r4
            r21 = r8
            goto L19
        L1d1:
            r3 = 979(0x3d3, float:1.372E-42)
            r4 = 2076(0x81c, float:2.909E-42)
            r0 = r17
            java.lang.String r5 = androidx.core.ktx.C1070.m788(r15, r3, r0, r4)
            short[] r3 = m6972()
            int r8 = androidx.documentfile.C1076.f102
            java.lang.String r4 = "ۣ۟ۦ"
            r15 = r3
            r16 = r4
            r20 = r8
            goto L19
        L1ea:
            r0 = r19
            r8 = r0 ^ 933(0x3a5, float:1.307E-42)
            androidx.lifecycle.livedata.C1085.m1855(r11, r8)
            short[] r3 = m6972()
            java.lang.String r4 = "ۣۡ۠"
            r15 = r3
            r16 = r4
            r21 = r8
            goto L19
        L1fe:
            androidx.activity.C1064.m372(r11, r12)
            androidx.activity.C1064.m372(r11, r10)
            return r11
    }

    private android.widget.LinearLayout createShareRootLayout(android.content.Context r10) {
            r9 = this;
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۣۨۥ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 1746819: goto L4a;
                case 1747653: goto L6b;
                case 1747716: goto L5f;
                case 1747806: goto L17;
                case 1750532: goto L51;
                case 1750748: goto L1d;
                case 1753541: goto L63;
                case 1753572: goto L58;
                case 1753667: goto L3e;
                case 1754379: goto L2d;
                case 1755336: goto L35;
                case 1755466: goto L24;
                default: goto L11;
            }
        L11:
            int r6 = androidx.customview.C1075.f101
            java.lang.String r1 = "ۣۦ۟"
            r5 = r1
            goto La
        L17:
            int r6 = kevin.fun.hook.audio.C1114.f403
            java.lang.String r1 = "ۣ۟۠"
            r5 = r1
            goto La
        L1d:
            r7 = r6 ^ 101(0x65, float:1.42E-43)
            java.lang.String r1 = "ۨ۟۟"
            r5 = r1
            r8 = r7
            goto La
        L24:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            java.lang.String r5 = "ۦۣۢ"
            r2 = r1
            goto La
        L2d:
            r1 = 1
            androidx.customview.C1074.m1119(r2, r1)
            java.lang.String r1 = "۠۟ۤ"
            r5 = r1
            goto La
        L35:
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r8, r8)
            java.lang.String r5 = "ۣ۟ۧ"
            r4 = r1
            goto La
        L3e:
            r0 = 992(0x3e0, float:1.39E-42)
            r1 = 2084(0x824, float:2.92E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r3, r0, r8, r1)
            java.lang.String r1 = "ۦۤۢ"
            r5 = r1
            goto La
        L4a:
            androidx.vectordrawable.C1105.m3296(r2, r4)
            java.lang.String r1 = "ۣۧ۟"
            r5 = r1
            goto La
        L51:
            r7 = r6 ^ (-31)
            java.lang.String r1 = "ۦۧۤ"
            r5 = r1
            r8 = r7
            goto La
        L58:
            androidx.lifecycle.runtime.C1092.m2336(r2, r0)
            java.lang.String r1 = "۠ۡۥ"
            r5 = r1
            goto La
        L5f:
            java.lang.String r1 = "ۣۢ"
            r5 = r1
            goto La
        L63:
            short[] r1 = m6972()
            java.lang.String r5 = "۠ۤۢ"
            r3 = r1
            goto La
        L6b:
            return r2
    }

    private android.view.View createVideoQualityItem(android.content.Context r12, java.lang.ref.WeakReference<android.app.Dialog> r13, kevin.fun.hook.KSHook.VideoInfo r14) {
            r11 = this;
            r10 = 0
            r8 = 0
            r1 = 0
            r4 = 0
            r6 = 0
            r3 = 0
            r9 = 0
            r5 = 0
            r0 = 0
            r2 = 0
            java.lang.String r7 = "ۡۢۨ"
        Lc:
            int r7 = kevin.fun.hook.audio.C1114.m7934(r7)
            switch(r7) {
                case 56575: goto La5;
                case 1747804: goto L27;
                case 1747841: goto L63;
                case 1748711: goto L78;
                case 1748734: goto L1b;
                case 1749573: goto L95;
                case 1749604: goto L7f;
                case 1749852: goto L22;
                case 1751494: goto L6b;
                case 1751594: goto L2e;
                case 1751649: goto L5c;
                case 1752704: goto L50;
                case 1753484: goto L3a;
                case 1753516: goto L45;
                case 1753604: goto L86;
                case 1755369: goto L33;
                case 1755429: goto L8d;
                case 1755590: goto L70;
                case 1755616: goto L57;
                case 1755621: goto L9d;
                default: goto L13;
            }
        L13:
            r2 = 0
            android.view.View r2 = m7040(r11, r12, r5, r2, r0)
            java.lang.String r7 = "ۨۧ"
            goto Lc
        L1b:
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r6, r5)
            java.lang.String r7 = "ۥۧۢ"
            goto Lc
        L22:
            r9 = r10 ^ 251(0xfb, float:3.52E-43)
            java.lang.String r7 = "ۦۢۨ"
            goto Lc
        L27:
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r6, r5)
            java.lang.String r7 = "ۢ۠ۢ"
            goto Lc
        L2e:
            r9 = r10 ^ 612(0x264, float:8.58E-43)
            java.lang.String r7 = "ۦۡۧ"
            goto Lc
        L33:
            java.lang.StringBuilder r6 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r4, r10)
            java.lang.String r7 = "ۢ۟ۢ"
            goto Lc
        L3a:
            r5 = 1005(0x3ed, float:1.408E-42)
            r7 = 1164(0x48c, float:1.631E-42)
            java.lang.String r5 = androidx.lifecycle.process.C1087.m2008(r3, r5, r9, r7)
            java.lang.String r7 = "ۣۡ۠"
            goto Lc
        L45:
            r5 = 1008(0x3f0, float:1.413E-42)
            r7 = 3253(0xcb5, float:4.558E-42)
            java.lang.String r5 = androidx.lifecycle.process.C1087.m2008(r3, r5, r9, r7)
            java.lang.String r7 = "۠ۤ۠"
            goto Lc
        L50:
            java.lang.StringBuilder r6 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r4, r8)
            java.lang.String r7 = "ۨۨۥ"
            goto Lc
        L57:
            int r10 = androidx.customview.C1074.f100
            java.lang.String r7 = "ۢۨۢ"
            goto Lc
        L5c:
            java.lang.String r1 = m7046(r14)
            java.lang.String r7 = "۠ۥۦ"
            goto Lc
        L63:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "ۨ۠ۡ"
            goto Lc
        L6b:
            int r10 = androidx.emoji2.viewsintegration.C1078.f104
            java.lang.String r7 = "ۤۢۨ"
            goto Lc
        L70:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda35 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda35
            r0.<init>(r11, r13, r12, r14)
            java.lang.String r7 = "ۡۧ۠"
            goto Lc
        L78:
            int r10 = m6983(r14)
            java.lang.String r7 = "ۨۢ۟"
            goto Lc
        L7f:
            java.lang.StringBuilder r6 = androidx.lifecycle.livedata.C1085.m1859(r4, r1)
            java.lang.String r7 = "ۦۥۣ"
            goto Lc
        L86:
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8573(r6)
            java.lang.String r7 = "ۨۧۥ"
            goto Lc
        L8d:
            int r8 = m7078(r14)
            java.lang.String r7 = "ۤۤۡ"
            goto Lc
        L95:
            short[] r3 = m6972()
            java.lang.String r7 = "ۤ۟ۡ"
            goto Lc
        L9d:
            short[] r3 = m6972()
            java.lang.String r7 = "ۨۨ۠"
            goto Lc
        La5:
            return r2
    }

    private java.lang.String decodeUnicode(java.lang.String r8) {
            r7 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L16d;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r8 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            short[] r0 = m6972()
            r1 = 1016(0x3f8, float:1.424E-42)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-962(0xfffffffffffffc3e, float:NaN))
            r3 = 1232(0x4d0, float:1.726E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r2, r3)
            boolean r1 = androidx.emoji2.C1080.m1554(r8, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L26:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2c;
                case 54: goto L31;
                case 471: goto L40;
                case 500: goto L34;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r1 != 0) goto L31
            r0 = 1833(0x729, float:2.569E-42)
            goto L26
        L31:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L26
        L34:
            r0 = 1864(0x748, float:2.612E-42)
        L36:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3c;
                case 47483: goto L16d;
                default: goto L3b;
            }
        L3b:
            goto L36
        L3c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L36
        L40:
            short[] r0 = m6972()     // Catch: java.lang.Exception -> L166
            r1 = 1018(0x3fa, float:1.427E-42)
            int r2 = androidx.appcompat.C1069.f95     // Catch: java.lang.Exception -> L166
            r2 = r2 ^ (-239(0xffffffffffffff11, float:NaN))
            r3 = 1869(0x74d, float:2.619E-42)
            java.lang.String r0 = androidx.loader.C1096.m2645(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L166
            short[] r1 = m6972()     // Catch: java.lang.Exception -> L166
            r2 = 1020(0x3fc, float:1.43E-42)
            r3 = 1
            r4 = 2749(0xabd, float:3.852E-42)
            java.lang.String r1 = androidx.startup.C1101.m3014(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L166
            java.lang.String r8 = androidx.loader.C1096.m2667(r8, r0, r1)     // Catch: java.lang.Exception -> L166
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L166
            r2.<init>()     // Catch: java.lang.Exception -> L166
            r0 = 0
        L67:
            int r3 = androidx.emoji2.C1080.m1552(r8)     // Catch: java.lang.Exception -> L166
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L6e:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 14: goto L76;
                case 45: goto L85;
                case 76: goto L80;
                case 239: goto L7a;
                default: goto L75;
            }     // Catch: java.lang.Exception -> L166
        L75:
            goto L6e
        L76:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L6e
        L7a:
            if (r0 < r3) goto L76
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L6e
        L80:
            java.lang.String r8 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Exception -> L166
        L84:
            return r8
        L85:
            char r3 = androidx.versionedparcelable.C1106.m3404(r8, r0)     // Catch: java.lang.Exception -> L166
            r1 = 48891(0xbefb, float:6.8511E-41)
        L8c:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 22: goto L94;
                case 53: goto L162;
                case 503: goto L98;
                case 32495: goto La0;
                default: goto L93;
            }     // Catch: java.lang.Exception -> L166
        L93:
            goto L8c
        L94:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L8c
        L98:
            r1 = 92
            if (r3 != r1) goto L94
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L8c
        La0:
            int r4 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Exception -> L166
            int r5 = androidx.emoji2.C1080.m1552(r8)     // Catch: java.lang.Exception -> L166
            r1 = 49666(0xc202, float:6.9597E-41)
        La9:
            r6 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 17: goto Lb1;
                case 50: goto Lba;
                case 76: goto Lbe;
                case 83: goto L162;
                default: goto Lb0;
            }     // Catch: java.lang.Exception -> L166
        Lb0:
            goto La9
        Lb1:
            r1 = r4 ^ 72
            int r1 = r1 + r0
            if (r1 >= r5) goto Lba
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto La9
        Lba:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto La9
        Lbe:
            int r1 = androidx.documentfile.C1076.f102     // Catch: java.lang.Exception -> L166
            r1 = r1 ^ (-601(0xfffffffffffffda7, float:NaN))
            int r1 = r1 + r0
            char r4 = androidx.versionedparcelable.C1106.m3404(r8, r1)     // Catch: java.lang.Exception -> L166
            r1 = 49790(0xc27e, float:6.977E-41)
        Lca:
            r5 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 18: goto Ld2;
                case 51: goto L162;
                case 84: goto Lde;
                case 241: goto Ld6;
                default: goto Ld1;
            }     // Catch: java.lang.Exception -> L166
        Ld1:
            goto Lca
        Ld2:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto Lca
        Ld6:
            r1 = 117(0x75, float:1.64E-43)
            if (r4 != r1) goto Ld2
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto Lca
        Lde:
            int r4 = androidx.interpolator.C1083.f109     // Catch: java.lang.Exception -> L166
            int r5 = androidx.emoji2.C1080.m1552(r8)     // Catch: java.lang.Exception -> L166
            r1 = 49914(0xc2fa, float:6.9944E-41)
        Le7:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 497: goto Lef;
                case 1711: goto Lf8;
                case 1736: goto L150;
                case 1769: goto Lfc;
                default: goto Lee;
            }     // Catch: java.lang.Exception -> L166
        Lee:
            goto Le7
        Lef:
            r1 = r4 ^ (-444(0xfffffffffffffe44, float:NaN))
            int r1 = r1 + r0
            if (r1 > r5) goto Lf8
            r1 = 50658(0xc5e2, float:7.0987E-41)
            goto Le7
        Lf8:
            r1 = 50627(0xc5c3, float:7.0944E-41)
            goto Le7
        Lfc:
            int r1 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Exception -> L166
            r1 = r1 ^ (-120(0xffffffffffffff88, float:NaN))
            int r1 = r1 + r0
            int r4 = androidx.appcompat.C1069.f95     // Catch: java.lang.Exception -> L166
            r4 = r4 ^ (-235(0xffffffffffffff15, float:NaN))
            int r4 = r4 + r0
            java.lang.String r1 = androidx.lifecycle.process.C1088.m2028(r8, r1, r4)     // Catch: java.lang.Exception -> L166
            int r4 = androidx.loader.C1095.f121
            r4 = r4 ^ (-980(0xfffffffffffffc2c, float:NaN))
            int r1 = androidx.activity.C1064.m376(r1, r4)     // Catch: java.lang.NumberFormatException -> L12a java.lang.Exception -> L166
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L12a java.lang.Exception -> L166
            androidx.annotation.experimental.C1067.m601(r2, r1)     // Catch: java.lang.NumberFormatException -> L12a java.lang.Exception -> L166
            int r1 = androidx.loader.C1098.f124
            r1 = r1 ^ (-808(0xfffffffffffffcd8, float:NaN))
            int r0 = r0 + r1
            r1 = 50689(0xc601, float:7.103E-41)
        L11e:
            r3 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L126;
                case 50: goto L139;
                default: goto L125;
            }
        L125:
            goto L11e
        L126:
            r1 = 50720(0xc620, float:7.1074E-41)
            goto L11e
        L12a:
            r1 = move-exception
            androidx.annotation.experimental.C1067.m601(r2, r3)     // Catch: java.lang.Exception -> L166
            r1 = 50813(0xc67d, float:7.1204E-41)
        L131:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 18: goto L139;
                case 243: goto L14c;
                default: goto L138;
            }
        L138:
            goto L131
        L139:
            int r1 = androidx.lifecycle.runtime.C1092.f118
            r1 = r1 ^ 798(0x31e, float:1.118E-42)
            int r1 = r1 + r0
            r0 = 51712(0xca00, float:7.2464E-41)
        L141:
            r3 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L149;
                case 15: goto L148;
                case 16: goto L148;
                case 17: goto L169;
                default: goto L148;
            }
        L148:
            goto L141
        L149:
            r0 = r1
            goto L67
        L14c:
            r1 = 50844(0xc69c, float:7.1248E-41)
            goto L131
        L150:
            androidx.annotation.experimental.C1067.m601(r2, r3)     // Catch: java.lang.Exception -> L166
            r1 = 51588(0xc984, float:7.229E-41)
        L156:
            r3 = 51605(0xc995, float:7.2314E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L15e;
                case 54: goto L139;
                default: goto L15d;
            }     // Catch: java.lang.Exception -> L166
        L15d:
            goto L156
        L15e:
            r1 = 51619(0xc9a3, float:7.2334E-41)
            goto L156
        L162:
            androidx.annotation.experimental.C1067.m601(r2, r3)     // Catch: java.lang.Exception -> L166
            goto L139
        L166:
            r0 = move-exception
            goto L84
        L169:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L141
        L16d:
            r0 = 51836(0xca7c, float:7.2638E-41)
        L170:
            r1 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 241: goto L178;
                case 1963: goto L17e;
                case 1992: goto L191;
                case 2025: goto L182;
                default: goto L177;
            }
        L177:
            goto L170
        L178:
            if (r8 == 0) goto L17e
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L170
        L17e:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L170
        L182:
            r0 = 52611(0xcd83, float:7.3724E-41)
        L185:
            r1 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 23: goto L18d;
                case 54: goto L84;
                default: goto L18c;
            }
        L18c:
            goto L185
        L18d:
            r0 = 52642(0xcda2, float:7.3767E-41)
            goto L185
        L191:
            java.lang.String r8 = androidx.emoji2.C1080.m1562()
            goto L84
    }

    private void dismissDialog(android.app.Dialog r3) {
            r2 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L27;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r3 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r3)
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L27;
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
            androidx.customview.C1074.m1118(r3)
        L27:
            return
    }

    private void dismissDialog(java.lang.ref.WeakReference<android.app.Dialog> r4) {
            r3 = this;
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r4)
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1 = 1616(0x650, float:2.264E-42)
        L8:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L2d;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 == 0) goto Le
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            boolean r2 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto L2d;
                case 500: goto L2a;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            if (r2 == 0) goto L27
            r1 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            androidx.customview.C1074.m1118(r0)
        L2d:
            return
    }

    private void downloadAtlasImages(android.content.Context r10) {
            r9 = this;
            r6 = 0
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.util.List r0 = m7090(r0)
            boolean r1 = androidx.activity.C1064.m359(r0)
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L57;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 == 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            short[] r0 = m6972()
            r1 = 1021(0x3fd, float:1.431E-42)
            int r2 = androidx.loader.C1099.f125
            r2 = r2 ^ 851(0x353, float:1.193E-42)
            r3 = 499(0x1f3, float:6.99E-43)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            m7018(r9, r10, r0)
            m7029(r9)
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1740(0x6cc, float:2.438E-42)
        L39:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3f;
                case 54: goto L44;
                case 471: goto L56;
                case 500: goto L47;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            if (r1 < 0) goto L44
            r0 = 1833(0x729, float:2.569E-42)
            goto L39
        L44:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L39
        L47:
            java.lang.String r0 = "ptjjkTYzyKtXUjdzCt7T4"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L56:
            return
        L57:
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r9)
            int r1 = androidx.emoji2.viewsintegration.C1079.f105
            r1 = r1 ^ (-109(0xffffffffffffff93, float:NaN))
            r2 = 1
            boolean r2 = kevin.fun.hook.C1120.m8661(r0, r2, r1)
            r0 = 1864(0x748, float:2.612E-42)
        L66:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L6c;
                case 47384: goto L93;
                case 47417: goto L76;
                case 47483: goto L72;
                default: goto L6b;
            }
        L6b:
            goto L66
        L6c:
            if (r2 != 0) goto L72
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L66
        L72:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L66
        L76:
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r9)
            boolean r1 = kevin.fun.hook.C1120.m8661(r0, r6, r1)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L81:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L89;
                case 45: goto L93;
                case 76: goto L56;
                case 239: goto L8d;
                default: goto L88;
            }
        L88:
            goto L81
        L89:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L81
        L8d:
            if (r1 != 0) goto L89
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L81
        L93:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r10)
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = new kevin.fun.hook.KSHook$AtlasDownloadHolder
            r0 = 0
            r3.<init>(r0)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.util.List r0 = m7090(r0)
            int r4 = androidx.lifecycle.livedata.C1086.m1931(r0)
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>(r6)
            long r6 = androidx.lifecycle.process.C1089.m2100()
            android.os.Handler r0 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda8 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda8
            r1.<init>(r9, r2, r3, r4)
            androidx.activity.C1062.m178(r0, r1)
            java.util.concurrent.ExecutorService r8 = m7016()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda9 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda9
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.activity.C1063.m244(r8, r0)
            goto L56
    }

    private void downloadCover(android.content.Context r10) {
            r9 = this;
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r1 = m7030(r0)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L91;
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
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r0 = m7030(r0)
            boolean r1 = androidx.activity.C1066.m488(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L26:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2c;
                case 54: goto L31;
                case 471: goto L91;
                case 500: goto L34;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r1 != 0) goto L31
            r0 = 1833(0x729, float:2.569E-42)
            goto L26
        L31:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L26
        L34:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r2 = m7030(r0)
            java.lang.String r6 = androidx.lifecycle.runtime.C1092.m2350()
            short[] r0 = m6972()
            r1 = 1029(0x405, float:1.442E-42)
            int r3 = kevin.fun.hook.audio.C1117.f406
            r3 = r3 ^ 67
            r4 = 836(0x344, float:1.171E-42)
            java.lang.String r3 = androidx.vectordrawable.C1103.m3132(r0, r1, r3, r4)
            short[] r0 = m6972()
            r1 = 1039(0x40f, float:1.456E-42)
            int r4 = androidx.loader.C1097.f123
            r4 = r4 ^ 125(0x7d, float:1.75E-43)
            r5 = 2443(0x98b, float:3.423E-42)
            java.lang.String r4 = androidx.loader.C1099.m2843(r0, r1, r4, r5)
            short[] r0 = m6972()
            r1 = 1054(0x41e, float:1.477E-42)
            int r5 = androidx.lifecycle.process.C1088.f114
            r5 = r5 ^ (-103(0xffffffffffffff99, float:NaN))
            r7 = 930(0x3a2, float:1.303E-42)
            java.lang.String r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r5, r7)
            short[] r0 = m6972()
            r1 = 1058(0x422, float:1.483E-42)
            int r7 = kevin.fun.hook.webdav.C1118.f417
            r7 = r7 ^ (-362(0xfffffffffffffe96, float:NaN))
            r8 = 2778(0xada, float:3.893E-42)
            java.lang.String r7 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r0, r1, r7, r8)
            r0 = r9
            r1 = r10
            m7023(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 1864(0x748, float:2.612E-42)
        L87:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L8d;
                case 47483: goto La7;
                default: goto L8c;
            }
        L8c:
            goto L87
        L8d:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L87
        L91:
            short[] r0 = m6972()
            r1 = 1061(0x425, float:1.487E-42)
            int r2 = androidx.lifecycle.livedata.C1086.f112
            r2 = r2 ^ 945(0x3b1, float:1.324E-42)
            r3 = 2847(0xb1f, float:3.99E-42)
            java.lang.String r0 = androidx.loader.C1097.m2734(r0, r1, r2, r3)
            m7018(r9, r10, r0)
            m7029(r9)
        La7:
            return
    }

    private void downloadFile(java.lang.String r19, java.io.File r20, kevin.fun.hook.KSHook.DownloadProgressListener r21) throws java.io.IOException {
            r18 = this;
            r2 = 0
            r6 = 0
            r9 = 0
            r3 = 0
            r7 = 0
            r5 = 0
            r8 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L288
            r0 = r19
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1fe
            java.net.URLConnection r2 = androidx.loader.C1094.m2492(r2)     // Catch: java.lang.Throwable -> L1fe
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L1fe
            short[] r3 = m6972()     // Catch: java.lang.Throwable -> L28a
            r4 = 1069(0x42d, float:1.498E-42)
            int r6 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L28a
            r6 = r6 ^ 647(0x287, float:9.07E-43)
            r10 = 3197(0xc7d, float:4.48E-42)
            java.lang.String r3 = androidx.startup.C1100.m2931(r3, r4, r6, r10)     // Catch: java.lang.Throwable -> L28a
            androidx.versionedparcelable.C1107.m3434(r2, r3)     // Catch: java.lang.Throwable -> L28a
            short[] r3 = m6972()     // Catch: java.lang.Throwable -> L28a
            r4 = 1072(0x430, float:1.502E-42)
            int r6 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L28a
            r6 = r6 ^ 249(0xf9, float:3.49E-43)
            r10 = 2317(0x90d, float:3.247E-42)
            java.lang.String r3 = kevin.fun.hook.C1120.m8645(r3, r4, r6, r10)     // Catch: java.lang.Throwable -> L28a
            java.lang.String r4 = m7032(r18)     // Catch: java.lang.Throwable -> L28a
            androidx.activity.C1064.m355(r2, r3, r4)     // Catch: java.lang.Throwable -> L28a
            int r3 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L28a
            r3 = r3 ^ (-15232(0xffffffffffffc480, float:NaN))
            androidx.lifecycle.process.C1087.m2000(r2, r3)     // Catch: java.lang.Throwable -> L28a
            androidx.loader.C1094.m2450(r2, r3)     // Catch: java.lang.Throwable -> L28a
            short[] r3 = m6972()     // Catch: java.lang.Throwable -> L28a
            r4 = 1082(0x43a, float:1.516E-42)
            int r6 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L28a
            r6 = r6 ^ 93
            r10 = 2443(0x98b, float:3.423E-42)
            java.lang.String r3 = kevin.fun.hook.webdav.C1118.m8509(r3, r4, r6, r10)     // Catch: java.lang.Throwable -> L28a
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> L28a
            r6 = 1097(0x449, float:1.537E-42)
            int r10 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L28a
            r10 = r10 ^ (-975(0xfffffffffffffc31, float:NaN))
            r11 = 2288(0x8f0, float:3.206E-42)
            java.lang.String r4 = androidx.appcompat.resources.C1068.m652(r4, r6, r10, r11)     // Catch: java.lang.Throwable -> L28a
            androidx.activity.C1064.m355(r2, r3, r4)     // Catch: java.lang.Throwable -> L28a
            int r4 = androidx.loader.C1094.m57(r2)     // Catch: java.lang.Throwable -> L28a
            r3 = 1616(0x650, float:2.264E-42)
        L71:
            r3 = r3 ^ 1633(0x661, float:2.288E-42)
            switch(r3) {
                case 14: goto L77;
                case 49: goto L7a;
                case 204: goto L81;
                case 239: goto L1b3;
                default: goto L76;
            }     // Catch: java.lang.Throwable -> L28a
        L76:
            goto L71
        L77:
            r3 = 1678(0x68e, float:2.351E-42)
            goto L71
        L7a:
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 != r3) goto L77
            r3 = 1709(0x6ad, float:2.395E-42)
            goto L71
        L81:
            int r11 = androidx.activity.C1066.m474(r2)     // Catch: java.lang.Throwable -> L28a
            java.io.InputStream r3 = androidx.customview.C1075.m1174(r2)     // Catch: java.lang.Throwable -> L28a
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28e
            r0 = r20
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L291
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r12 = new byte[r5]     // Catch: java.lang.Throwable -> L295
            r5 = 0
            long r6 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Throwable -> L295
            r10 = r5
        L9a:
            int r8 = androidx.loader.C1099.m2896(r3, r12)     // Catch: java.lang.Throwable -> L295
            r5 = 1740(0x6cc, float:2.438E-42)
        La0:
            r5 = r5 ^ 1757(0x6dd, float:2.462E-42)
            switch(r5) {
                case 17: goto La6;
                case 54: goto Lac;
                case 471: goto L163;
                case 500: goto Laf;
                default: goto La5;
            }     // Catch: java.lang.Throwable -> L295
        La5:
            goto La0
        La6:
            r5 = -1
            if (r8 != r5) goto Lac
            r5 = 1833(0x729, float:2.569E-42)
            goto La0
        Lac:
            r5 = 1802(0x70a, float:2.525E-42)
            goto La0
        Laf:
            kevin.fun.hook.audio.C1117.m8156(r4)     // Catch: java.lang.Throwable -> L295
            r5 = 1864(0x748, float:2.612E-42)
        Lb4:
            r5 = r5 ^ 1881(0x759, float:2.636E-42)
            switch(r5) {
                case 17: goto Lba;
                case 47384: goto Lc9;
                case 47417: goto Lc4;
                case 47483: goto Lc0;
                default: goto Lb9;
            }     // Catch: java.lang.Throwable -> L295
        Lb9:
            goto Lb4
        Lba:
            if (r21 == 0) goto Lc0
            r5 = 48736(0xbe60, float:6.8294E-41)
            goto Lb4
        Lc0:
            r5 = 48705(0xbe41, float:6.825E-41)
            goto Lb4
        Lc4:
            r0 = r21
            m7004(r0, r10, r11)     // Catch: java.lang.Throwable -> L295
        Lc9:
            kevin.fun.hook.audio.C1117.m8104(r4)     // Catch: java.io.IOException -> Lec
        Lcc:
            r4 = 48767(0xbe7f, float:6.8337E-41)
        Lcf:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 14: goto Ld7;
                case 239: goto Le8;
                default: goto Ld6;
            }
        Ld6:
            goto Lcf
        Ld7:
            r4 = 49666(0xc202, float:6.9597E-41)
        Lda:
            r5 = 49683(0xc213, float:6.9621E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto Le2;
                case 50: goto Lfc;
                case 76: goto L100;
                case 83: goto L10e;
                default: goto Le1;
            }
        Le1:
            goto Lda
        Le2:
            if (r3 == 0) goto Lfc
            r4 = 49759(0xc25f, float:6.9727E-41)
            goto Lda
        Le8:
            r4 = 48798(0xbe9e, float:6.838E-41)
            goto Lcf
        Lec:
            r4 = move-exception
            r4 = 48891(0xbefb, float:6.8511E-41)
        Lf0:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 22: goto Lcc;
                case 503: goto Lf8;
                default: goto Lf7;
            }
        Lf7:
            goto Lf0
        Lf8:
            r4 = 48922(0xbf1a, float:6.8554E-41)
            goto Lf0
        Lfc:
            r4 = 49728(0xc240, float:6.9684E-41)
            goto Lda
        L100:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.io.IOException -> L123
        L103:
            r3 = 49790(0xc27e, float:6.977E-41)
        L106:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto L10e;
                case 241: goto L11f;
                default: goto L10d;
            }
        L10d:
            goto L106
        L10e:
            r3 = 50689(0xc601, float:7.103E-41)
        L111:
            r4 = 50706(0xc612, float:7.1054E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 19: goto L119;
                case 45: goto L13a;
                case 50: goto L133;
                case 76: goto L137;
                default: goto L118;
            }
        L118:
            goto L111
        L119:
            if (r2 == 0) goto L133
            r3 = 50782(0xc65e, float:7.1161E-41)
            goto L111
        L11f:
            r3 = 49821(0xc29d, float:6.9814E-41)
            goto L106
        L123:
            r3 = move-exception
            r3 = 49914(0xc2fa, float:6.9944E-41)
        L127:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 497: goto L12f;
                case 1711: goto L103;
                default: goto L12e;
            }
        L12e:
            goto L127
        L12f:
            r3 = 50596(0xc5a4, float:7.09E-41)
            goto L127
        L133:
            r3 = 50751(0xc63f, float:7.1117E-41)
            goto L111
        L137:
            androidx.emoji2.C1080.m1546(r2)
        L13a:
            int r3 = org.luckypray.dexkit.C1124.m10581()
            r2 = 50813(0xc67d, float:7.1204E-41)
        L141:
            r4 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 18: goto L149;
                case 53: goto L162;
                case 243: goto L14d;
                case 4075: goto L153;
                default: goto L148;
            }
        L148:
            goto L141
        L149:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L141
        L14d:
            if (r3 < 0) goto L149
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L141
        L153:
            java.lang.String r2 = "Uj9XzMMVa1j5GE186"
            java.lang.String r2 = androidx.vectordrawable.C1105.m3273(r2)
            java.lang.Double r2 = java.lang.Double.decode(r2)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
        L162:
            return
        L163:
            r5 = 0
            androidx.drawerlayout.C1077.m1285(r4, r12, r5, r8)     // Catch: java.lang.Throwable -> L295
            int r10 = r10 + r8
            long r8 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Throwable -> L295
            r5 = 51588(0xc984, float:7.229E-41)
        L16f:
            r13 = 51605(0xc995, float:7.2314E-41)
            r5 = r5 ^ r13
            switch(r5) {
                case 17: goto L177;
                case 54: goto L183;
                case 87: goto L9a;
                case 116: goto L187;
                default: goto L176;
            }     // Catch: java.lang.Throwable -> L295
        L176:
            goto L16f
        L177:
            long r14 = r8 - r6
            r16 = 200(0xc8, double:9.9E-322)
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r5 <= 0) goto L183
            r5 = 51681(0xc9e1, float:7.242E-41)
            goto L16f
        L183:
            r5 = 51650(0xc9c2, float:7.2377E-41)
            goto L16f
        L187:
            r5 = 51712(0xca00, float:7.2464E-41)
        L18a:
            r6 = 51729(0xca11, float:7.2488E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 14: goto L192;
                case 17: goto L196;
                case 47: goto L1a1;
                case 76: goto L19c;
                default: goto L191;
            }     // Catch: java.lang.Throwable -> L295
        L191:
            goto L18a
        L192:
            r5 = 51774(0xca3e, float:7.2551E-41)
            goto L18a
        L196:
            if (r21 == 0) goto L192
            r5 = 51805(0xca5d, float:7.2594E-41)
            goto L18a
        L19c:
            r0 = r21
            m7004(r0, r10, r11)     // Catch: java.lang.Throwable -> L295
        L1a1:
            r5 = 51836(0xca7c, float:7.2638E-41)
        L1a4:
            r6 = 51853(0xca8d, float:7.2662E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 241: goto L1ac;
                case 1963: goto L1b0;
                default: goto L1ab;
            }
        L1ab:
            goto L1a4
        L1ac:
            r5 = 52518(0xcd26, float:7.3593E-41)
            goto L1a4
        L1b0:
            r6 = r8
            goto L9a
        L1b3:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L1da
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1da
            r5.<init>()     // Catch: java.lang.Throwable -> L1da
            short[] r6 = m6972()     // Catch: java.lang.Throwable -> L1da
            r9 = 1105(0x451, float:1.548E-42)
            int r10 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L1da
            r10 = r10 ^ 937(0x3a9, float:1.313E-42)
            r11 = 2825(0xb09, float:3.959E-42)
            java.lang.String r6 = androidx.versionedparcelable.C1107.m3485(r6, r9, r10, r11)     // Catch: java.lang.Throwable -> L1da
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L1da
            java.lang.StringBuilder r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r4)     // Catch: java.lang.Throwable -> L1da
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r4)     // Catch: java.lang.Throwable -> L1da
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1da
            throw r3     // Catch: java.lang.Throwable -> L1da
        L1da:
            r6 = move-exception
            r3 = r7
            r4 = r8
        L1dd:
            r5 = 52611(0xcd83, float:7.3724E-41)
        L1e0:
            r7 = 52628(0xcd94, float:7.3748E-41)
            r5 = r5 ^ r7
            switch(r5) {
                case 23: goto L1e8;
                case 54: goto L1ec;
                default: goto L1e7;
            }
        L1e7:
            goto L1e0
        L1e8:
            r5 = 52642(0xcda2, float:7.3767E-41)
            goto L1e0
        L1ec:
            r5 = r4
        L1ed:
            r4 = 53510(0xd106, float:7.4983E-41)
        L1f0:
            r7 = 53527(0xd117, float:7.5007E-41)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto L1f8;
                case 50: goto L212;
                case 83: goto L238;
                case 116: goto L216;
                default: goto L1f7;
            }
        L1f7:
            goto L1f0
        L1f8:
            if (r5 == 0) goto L212
            r4 = 53603(0xd163, float:7.5114E-41)
            goto L1f0
        L1fe:
            r4 = move-exception
            r2 = r6
            r3 = r9
        L201:
            r6 = 52735(0xcdff, float:7.3897E-41)
        L204:
            r7 = 52752(0xce10, float:7.3921E-41)
            r6 = r6 ^ r7
            switch(r6) {
                case 14: goto L20c;
                case 1007: goto L20e;
                default: goto L20b;
            }
        L20b:
            goto L204
        L20c:
            r6 = r4
            goto L1ed
        L20e:
            r6 = 52766(0xce1e, float:7.3941E-41)
            goto L204
        L212:
            r4 = 53572(0xd144, float:7.507E-41)
            goto L1f0
        L216:
            kevin.fun.hook.audio.C1117.m8104(r5)     // Catch: java.io.IOException -> L228
        L219:
            r4 = 53634(0xd182, float:7.5157E-41)
        L21c:
            r5 = 53651(0xd193, float:7.5181E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L224;
                case 50: goto L238;
                default: goto L223;
            }
        L223:
            goto L21c
        L224:
            r4 = 53665(0xd1a1, float:7.52E-41)
            goto L21c
        L228:
            r4 = move-exception
            r4 = 53758(0xd1fe, float:7.5331E-41)
        L22c:
            r5 = 53775(0xd20f, float:7.5355E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 1009: goto L234;
                case 1703: goto L219;
                default: goto L233;
            }
        L233:
            goto L22c
        L234:
            r4 = 54440(0xd4a8, float:7.6287E-41)
            goto L22c
        L238:
            r4 = 54533(0xd505, float:7.6417E-41)
        L23b:
            r5 = 54550(0xd516, float:7.6441E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 19: goto L243;
                case 50: goto L249;
                case 85: goto L26f;
                case 116: goto L24d;
                default: goto L242;
            }
        L242:
            goto L23b
        L243:
            if (r3 == 0) goto L249
            r4 = 54626(0xd562, float:7.6547E-41)
            goto L23b
        L249:
            r4 = 54595(0xd543, float:7.6504E-41)
            goto L23b
        L24d:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.io.IOException -> L25f
        L250:
            r3 = 54657(0xd581, float:7.6591E-41)
        L253:
            r4 = 54674(0xd592, float:7.6615E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 19: goto L25b;
                case 50: goto L26f;
                default: goto L25a;
            }
        L25a:
            goto L253
        L25b:
            r3 = 54688(0xd5a0, float:7.6634E-41)
            goto L253
        L25f:
            r3 = move-exception
            r3 = 55432(0xd888, float:7.7677E-41)
        L263:
            r4 = 55449(0xd899, float:7.77E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L26b;
                case 62: goto L250;
                default: goto L26a;
            }
        L26a:
            goto L263
        L26b:
            r3 = 55463(0xd8a7, float:7.772E-41)
            goto L263
        L26f:
            r3 = 55556(0xd904, float:7.785E-41)
        L272:
            r4 = 55573(0xd915, float:7.7874E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L27a;
                case 54: goto L280;
                case 87: goto L287;
                case 116: goto L284;
                default: goto L279;
            }
        L279:
            goto L272
        L27a:
            if (r2 == 0) goto L280
            r3 = 55649(0xd961, float:7.7981E-41)
            goto L272
        L280:
            r3 = 55618(0xd942, float:7.7937E-41)
            goto L272
        L284:
            androidx.emoji2.C1080.m1546(r2)
        L287:
            throw r6
        L288:
            r4 = move-exception
            goto L20c
        L28a:
            r4 = move-exception
            r3 = r9
            goto L201
        L28e:
            r4 = move-exception
            goto L201
        L291:
            r6 = move-exception
            r4 = r8
            goto L1dd
        L295:
            r6 = move-exception
            goto L1dd
    }

    private void downloadFileWithRetry(java.lang.String r8, java.io.File r9, java.lang.String r10, kevin.fun.hook.KSHook.DownloadProgressListener r11) throws java.io.IOException {
            r7 = this;
            r6 = 3
            r1 = 0
            r0 = 1
        L3:
            r2 = 1616(0x650, float:2.264E-42)
        L5:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L45;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r0 <= r6) goto Lb
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = 1740(0x6cc, float:2.438E-42)
        L15:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1b;
                case 54: goto L20;
                case 471: goto L2f;
                case 500: goto L23;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            if (r1 == 0) goto L20
            r0 = 1833(0x729, float:2.569E-42)
            goto L15
        L20:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L15
        L23:
            r0 = 1864(0x748, float:2.612E-42)
        L25:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2b;
                case 47483: goto L44;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L25
        L2f:
            java.io.IOException r1 = new java.io.IOException
            short[] r0 = m6972()
            r2 = 1114(0x45a, float:1.561E-42)
            int r3 = androidx.loader.C1099.f125
            r3 = r3 ^ 863(0x35f, float:1.21E-42)
            r4 = 2891(0xb4b, float:4.051E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1087.m2008(r0, r2, r3, r4)
            r1.<init>(r0)
        L44:
            throw r1
        L45:
            m7003(r7, r8, r9, r11)     // Catch: java.io.IOException -> L49
            return
        L49:
            r1 = move-exception
            boolean r3 = androidx.vectordrawable.C1105.m3294(r9)
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L51:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L59;
                case 45: goto L66;
                case 76: goto L63;
                case 239: goto L5d;
                default: goto L58;
            }
        L58:
            goto L51
        L59:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L51
        L5d:
            if (r3 == 0) goto L59
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L51
        L63:
            androidx.loader.C1095.m2548(r9)
        L66:
            r2 = 48891(0xbefb, float:6.8511E-41)
        L69:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto L71;
                case 53: goto Lb1;
                case 503: goto L75;
                case 32495: goto L7b;
                default: goto L70;
            }
        L70:
            goto L69
        L71:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L69
        L75:
            if (r0 >= r6) goto L71
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L69
        L7b:
            int r2 = androidx.appcompat.C1069.f95
            long r2 = (long) r2
            r4 = -1853(0xfffffffffffff8c3, double:NaN)
            long r2 = r2 ^ r4
            androidx.vectordrawable.C1105.m3252(r2)     // Catch: java.lang.InterruptedException -> L93
            r2 = 49666(0xc202, float:6.9597E-41)
        L87:
            r3 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L8f;
                case 50: goto Lb1;
                default: goto L8e;
            }
        L8e:
            goto L87
        L8f:
            r2 = 49697(0xc221, float:6.964E-41)
            goto L87
        L93:
            r0 = move-exception
            java.lang.Thread r1 = androidx.lifecycle.process.C1088.m2063()
            androidx.lifecycle.livedata.C1085.m1849(r1)
            java.io.IOException r1 = new java.io.IOException
            short[] r2 = m6972()
            r3 = 1118(0x45e, float:1.567E-42)
            int r4 = androidx.vectordrawable.animated.C1102.f128
            r4 = r4 ^ 198(0xc6, float:2.77E-43)
            r5 = 854(0x356, float:1.197E-42)
            java.lang.String r2 = androidx.loader.C1095.m2574(r2, r3, r4, r5)
            r1.<init>(r2, r0)
            throw r1
        Lb1:
            int r2 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ 18
            int r0 = r0 + r2
            r2 = 49790(0xc27e, float:6.977E-41)
        Lb9:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L3;
                case 241: goto Lc1;
                default: goto Lc0;
            }
        Lc0:
            goto Lb9
        Lc1:
            r2 = 49821(0xc29d, float:6.9814E-41)
            goto Lb9
    }

    private void downloadMusic(android.content.Context r10) {
            r9 = this;
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r1 = m6970(r0)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L8d;
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
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r0 = m6970(r0)
            boolean r1 = androidx.activity.C1066.m488(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L26:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2c;
                case 54: goto L31;
                case 471: goto L8d;
                case 500: goto L34;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r1 != 0) goto L31
            r0 = 1833(0x729, float:2.569E-42)
            goto L26
        L31:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L26
        L34:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r0 = m6970(r0)
            java.lang.String r5 = m7075(r9, r0)
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r9)
            java.lang.String r2 = m6970(r0)
            java.lang.String r6 = androidx.lifecycle.livedata.C1085.m1870()
            short[] r0 = m6972()
            r1 = 1123(0x463, float:1.574E-42)
            int r3 = androidx.activity.C1066.f92
            r3 = r3 ^ 831(0x33f, float:1.164E-42)
            r4 = 2014(0x7de, float:2.822E-42)
            java.lang.String r3 = androidx.interpolator.C1083.m1723(r0, r1, r3, r4)
            short[] r0 = m6972()
            r1 = 1133(0x46d, float:1.588E-42)
            int r4 = kevin.fun.hook.webdav.C1118.f417
            r4 = r4 ^ (-358(0xfffffffffffffe9a, float:NaN))
            r7 = 1662(0x67e, float:2.329E-42)
            java.lang.String r4 = androidx.appcompat.resources.C1068.m652(r0, r1, r4, r7)
            short[] r0 = m6972()
            r1 = 1148(0x47c, float:1.609E-42)
            int r7 = androidx.activity.C1065.f91
            r7 = r7 ^ (-49)
            r8 = 1352(0x548, float:1.895E-42)
            java.lang.String r7 = androidx.core.ktx.C1071.m874(r0, r1, r7, r8)
            r0 = r9
            r1 = r10
            m7023(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 1864(0x748, float:2.612E-42)
        L83:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L89;
                case 47483: goto La3;
                default: goto L88;
            }
        L88:
            goto L83
        L89:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L83
        L8d:
            short[] r0 = m6972()
            r1 = 1152(0x480, float:1.614E-42)
            int r2 = androidx.lifecycle.process.C1090.f116
            r2 = r2 ^ (-423(0xfffffffffffffe59, float:NaN))
            r3 = 2426(0x97a, float:3.4E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            m7018(r9, r10, r0)
            m7029(r9)
        La3:
            return
    }

    private boolean downloadSingleImage(java.lang.String r5, java.io.File r6) {
            r4 = this;
            r1 = 0
            r0 = r1
        L2:
            r2 = 1616(0x650, float:2.264E-42)
        L4:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto La;
                case 49: goto Ld;
                case 204: goto L18;
                case 239: goto L13;
                default: goto L9;
            }
        L9:
            goto L4
        La:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L4
        Ld:
            r2 = 2
            if (r0 < r2) goto La
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L4
        L13:
            r2 = 0
            m7003(r4, r5, r6, r2)     // Catch: java.io.IOException -> L19
            r1 = 1
        L18:
            return r1
        L19:
            r2 = move-exception
            boolean r3 = androidx.vectordrawable.C1105.m3294(r6)
            r2 = 1740(0x6cc, float:2.438E-42)
        L20:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L26;
                case 54: goto L2b;
                case 471: goto L31;
                case 500: goto L2e;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            if (r3 == 0) goto L2b
            r2 = 1833(0x729, float:2.569E-42)
            goto L20
        L2b:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L20
        L2e:
            androidx.loader.C1095.m2548(r6)
        L31:
            int r2 = androidx.customview.C1074.f100
            r2 = r2 ^ 242(0xf2, float:3.39E-43)
            int r0 = r0 + r2
            r2 = 1864(0x748, float:2.612E-42)
        L38:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L3e;
                case 47483: goto L2;
                default: goto L3d;
            }
        L3d:
            goto L38
        L3e:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto L38
    }

    /* JADX INFO: renamed from: dp */
    private int m90dp(android.content.Context r3, int r4) {
            r2 = this;
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r3)     // Catch: java.lang.Exception -> L13
            android.util.DisplayMetrics r0 = androidx.activity.C1062.m159(r0)     // Catch: java.lang.Exception -> L13
            float r0 = androidx.vectordrawable.animated.C1102.m3118(r0)     // Catch: java.lang.Exception -> L13
            float r1 = (float) r4
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
        L12:
            return r0
        L13:
            r0 = move-exception
            int r0 = kevin.fun.hook.C1120.f419
            r0 = r0 ^ (-456(0xfffffffffffffe38, float:NaN))
            int r0 = r0 * r4
            goto L12
    }

    private void extractAtlasUrls(java.lang.String r9, kevin.fun.hook.KSHook.ParseResult r10) {
            r8 = this;
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L15f
            r1 = 1161(0x489, float:1.627E-42)
            int r2 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L15f
            r2 = r2 ^ (-35)
            r3 = 2752(0xac0, float:3.856E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r2 = m7089(r8, r9, r0)     // Catch: java.lang.Throwable -> L15f
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L15f
            r1 = 1184(0x4a0, float:1.659E-42)
            int r3 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L15f
            r3 = r3 ^ 536(0x218, float:7.51E-43)
            r4 = 1635(0x663, float:2.291E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L15f
            int r1 = androidx.activity.C1063.f89     // Catch: java.lang.Throwable -> L15f
            r1 = r1 ^ 34
            java.util.regex.Pattern r0 = androidx.lifecycle.process.C1087.m1979(r0, r1)     // Catch: java.lang.Throwable -> L15f
            java.util.regex.Matcher r1 = androidx.lifecycle.runtime.C1092.m2355(r0, r9)     // Catch: java.lang.Throwable -> L15f
            boolean r3 = androidx.drawerlayout.C1077.m1287(r1)     // Catch: java.lang.Throwable -> L15f
            r0 = 1616(0x650, float:2.264E-42)
        L36:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L3c;
                case 49: goto L3f;
                case 204: goto L44;
                case 239: goto L188;
                default: goto L3b;
            }     // Catch: java.lang.Throwable -> L15f
        L3b:
            goto L36
        L3c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L36
        L3f:
            if (r3 == 0) goto L3c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L36
        L44:
            r0 = 1
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r1, r0)     // Catch: java.lang.Throwable -> L15f
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L15f
            r3 = 1206(0x4b6, float:1.69E-42)
            int r4 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L15f
            r4 = r4 ^ (-22)
            r5 = 2582(0xa16, float:3.618E-42)
            java.lang.String r1 = androidx.activity.C1066.m468(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L15f
            java.util.regex.Pattern r1 = androidx.activity.C1062.m185(r1)     // Catch: java.lang.Throwable -> L15f
            java.util.regex.Matcher r3 = androidx.lifecycle.runtime.C1092.m2355(r1, r0)     // Catch: java.lang.Throwable -> L15f
        L61:
            boolean r1 = androidx.drawerlayout.C1077.m1287(r3)     // Catch: java.lang.Throwable -> L15f
            r0 = 1740(0x6cc, float:2.438E-42)
        L67:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L6d;
                case 54: goto L72;
                case 471: goto L81;
                case 500: goto L75;
                default: goto L6c;
            }     // Catch: java.lang.Throwable -> L15f
        L6c:
            goto L67
        L6d:
            if (r1 != 0) goto L72
            r0 = 1833(0x729, float:2.569E-42)
            goto L67
        L72:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L67
        L75:
            r0 = 1864(0x748, float:2.612E-42)
        L77:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L7d;
                case 47483: goto L188;
                default: goto L7c;
            }     // Catch: java.lang.Throwable -> L15f
        L7c:
            goto L77
        L7d:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L77
        L81:
            r0 = 1
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r3, r0)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r0 = m7019(r8, r0)     // Catch: java.lang.Throwable -> L15f
            boolean r4 = androidx.activity.C1066.m488(r0)     // Catch: java.lang.Throwable -> L15f
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L91:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 14: goto L99;
                case 45: goto L61;
                case 76: goto La3;
                case 239: goto L9d;
                default: goto L98;
            }     // Catch: java.lang.Throwable -> L15f
        L98:
            goto L91
        L99:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L91
        L9d:
            if (r4 != 0) goto L99
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L91
        La3:
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L15f
            r4 = 1238(0x4d6, float:1.735E-42)
            int r5 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L15f
            r5 = r5 ^ 136(0x88, float:1.9E-43)
            r6 = 2403(0x963, float:3.367E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8169(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L15f
            boolean r4 = androidx.core.C1073.m1059(r0, r1)     // Catch: java.lang.Throwable -> L15f
            r1 = 48891(0xbefb, float:6.8511E-41)
        Lba:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 22: goto Lc2;
                case 53: goto Ldb;
                case 503: goto Lc6;
                case 32495: goto Lcc;
                default: goto Lc1;
            }     // Catch: java.lang.Throwable -> L15f
        Lc1:
            goto Lba
        Lc2:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto Lba
        Lc6:
            if (r4 == 0) goto Lc2
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto Lba
        Lcc:
            r1 = 49666(0xc202, float:6.9597E-41)
        Lcf:
            r4 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 17: goto Ld7;
                case 50: goto L149;
                default: goto Ld6;
            }     // Catch: java.lang.Throwable -> L15f
        Ld6:
            goto Lcf
        Ld7:
            r1 = 49697(0xc221, float:6.964E-41)
            goto Lcf
        Ldb:
            boolean r4 = androidx.activity.C1066.m488(r2)     // Catch: java.lang.Throwable -> L15f
            r1 = 49790(0xc27e, float:6.977E-41)
        Le2:
            r5 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 18: goto Lea;
                case 51: goto L128;
                case 84: goto Lf4;
                case 241: goto Lee;
                default: goto Le9;
            }     // Catch: java.lang.Throwable -> L15f
        Le9:
            goto Le2
        Lea:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto Le2
        Lee:
            if (r4 != 0) goto Lea
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto Le2
        Lf4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r1.<init>()     // Catch: java.lang.Throwable -> L15f
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> L15f
            r5 = 1242(0x4da, float:1.74E-42)
            int r6 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L15f
            r6 = r6 ^ 203(0xcb, float:2.84E-43)
            r7 = 2422(0x976, float:3.394E-42)
            java.lang.String r4 = androidx.viewpager.C1108.m3518(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L15f
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L11c:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 497: goto L124;
                case 1711: goto L149;
                default: goto L123;
            }     // Catch: java.lang.Throwable -> L15f
        L123:
            goto L11c
        L124:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L11c
        L128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r1.<init>()     // Catch: java.lang.Throwable -> L15f
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> L15f
            r5 = 1250(0x4e2, float:1.752E-42)
            int r6 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L15f
            r6 = r6 ^ (-992(0xfffffffffffffc20, float:NaN))
            r7 = 1137(0x471, float:1.593E-42)
            java.lang.String r4 = androidx.customview.C1075.m1138(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L15f
        L149:
            java.util.List r1 = m7090(r10)     // Catch: java.lang.Throwable -> L15f
            androidx.emoji2.viewsintegration.C1078.m1429(r1, r0)     // Catch: java.lang.Throwable -> L15f
            r0 = 50689(0xc601, float:7.103E-41)
        L153:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L15b;
                case 50: goto L61;
                default: goto L15a;
            }
        L15a:
            goto L153
        L15b:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L153
        L15f:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 1278(0x4fe, float:1.791E-42)
            int r4 = androidx.loader.C1098.f124
            r4 = r4 ^ (-821(0xfffffffffffffccb, float:NaN))
            r5 = 2699(0xa8b, float:3.782E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        L188:
            return
    }

    private java.lang.String extractCoverUrl(java.lang.String r7) {
            r6 = this;
            short[] r0 = m6972()
            r1 = 1300(0x514, float:1.822E-42)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 909(0x38d, float:1.274E-42)
            r3 = 2556(0x9fc, float:3.582E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r1, r2, r3)
            short[] r1 = m6972()
            r2 = 1345(0x541, float:1.885E-42)
            int r3 = androidx.lifecycle.livedata.C1084.f110
            r3 = r3 ^ 38
            r4 = 1200(0x4b0, float:1.682E-42)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r1, r2, r3, r4)
            short[] r2 = m6972()
            r3 = 1398(0x576, float:1.959E-42)
            int r4 = androidx.lifecycle.process.C1088.f114
            r4 = r4 ^ (-92)
            r5 = 3070(0xbfe, float:4.302E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1123.m10510(r2, r3, r4, r5)
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            int r4 = org.luckypray.dexkit.C1125.f435
            r4 = r4 ^ (-227(0xffffffffffffff1d, float:NaN))
            r3[r4] = r1
            int r1 = androidx.activity.C1064.f90
            r1 = r1 ^ 491(0x1eb, float:6.88E-43)
            r3[r1] = r2
            int r1 = org.luckypray.dexkit.C1123.f433
            r1 = r1 ^ (-965(0xfffffffffffffc3b, float:NaN))
            r3[r1] = r0
            int r2 = r3.length
            r0 = 0
        L47:
            r1 = 1616(0x650, float:2.264E-42)
        L49:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L4f;
                case 49: goto L52;
                case 204: goto L57;
                case 239: goto L5c;
                default: goto L4e;
            }
        L4e:
            goto L49
        L4f:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L49
        L52:
            if (r0 < r2) goto L4f
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L49
        L57:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
        L5b:
            return r0
        L5c:
            r1 = r3[r0]
            java.lang.String r4 = m7089(r6, r7, r1)
            boolean r5 = androidx.activity.C1066.m488(r4)
            r1 = 1740(0x6cc, float:2.438E-42)
        L68:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L6e;
                case 54: goto L73;
                case 471: goto L7b;
                case 500: goto L76;
                default: goto L6d;
            }
        L6d:
            goto L68
        L6e:
            if (r5 != 0) goto L73
            r1 = 1833(0x729, float:2.569E-42)
            goto L68
        L73:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L68
        L76:
            java.lang.String r0 = m7019(r6, r4)
            goto L5b
        L7b:
            int r1 = androidx.core.ktx.C1070.f96
            r1 = r1 ^ 559(0x22f, float:7.83E-43)
            int r0 = r0 + r1
            r1 = 1864(0x748, float:2.612E-42)
        L82:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L88;
                case 47483: goto L47;
                default: goto L87;
            }
        L87:
            goto L82
        L88:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L82
    }

    private void extractDexKitSo(java.lang.String r8, java.io.File r9) throws java.io.IOException {
            r7 = this;
            r2 = 0
            r1 = 0
            java.lang.String[] r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3680()
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r3 = m6972()
            r4 = 1455(0x5af, float:2.039E-42)
            int r5 = org.luckypray.dexkit.C1125.f435
            r5 = r5 ^ (-231(0xffffffffffffff19, float:NaN))
            r6 = 2453(0x995, float:3.437E-42)
            java.lang.String r3 = androidx.vectordrawable.C1103.m3132(r3, r4, r5, r6)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            short[] r1 = m6972()
            r3 = 1459(0x5b3, float:2.044E-42)
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ 30
            r5 = 2853(0xb25, float:3.998E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r1, r3, r4, r5)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L16e
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L16e
            java.util.zip.ZipEntry r0 = androidx.startup.C1101.m3024(r4, r0)     // Catch: java.lang.Throwable -> L171
            java.io.InputStream r3 = androidx.viewpager.C1108.m3527(r4, r0)     // Catch: java.lang.Throwable -> L171
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L178
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L178
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L9b
        L53:
            int r6 = androidx.loader.C1099.m2896(r3, r1)     // Catch: java.lang.Throwable -> L9b
            r0 = 1616(0x650, float:2.264E-42)
        L59:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L5f;
                case 49: goto L62;
                case 204: goto L67;
                case 239: goto L8b;
                default: goto L5e;
            }     // Catch: java.lang.Throwable -> L9b
        L5e:
            goto L59
        L5f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L59
        L62:
            if (r6 > 0) goto L5f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L59
        L67:
            r0 = 1
            r1 = 0
            androidx.activity.C1066.m511(r9, r0, r1)     // Catch: java.lang.Throwable -> L9b
            r0 = 1
            r1 = 0
            androidx.lifecycle.livedata.C1084.m1756(r9, r0, r1)     // Catch: java.lang.Throwable -> L9b
            kevin.fun.hook.audio.C1117.m8104(r5)     // Catch: java.lang.Throwable -> L178
            r0 = 1740(0x6cc, float:2.438E-42)
        L76:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L7c;
                case 54: goto L81;
                case 471: goto L87;
                case 500: goto L84;
                default: goto L7b;
            }
        L7b:
            goto L76
        L7c:
            if (r3 == 0) goto L81
            r0 = 1833(0x729, float:2.569E-42)
            goto L76
        L81:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L76
        L84:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L171
        L87:
            androidx.activity.C1064.m338(r4)     // Catch: java.lang.Throwable -> L16e
            return
        L8b:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r5, r1, r0, r6)     // Catch: java.lang.Throwable -> L9b
            r0 = 1864(0x748, float:2.612E-42)
        L91:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L97;
                case 47483: goto L53;
                default: goto L96;
            }
        L96:
            goto L91
        L97:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L91
        L9b:
            r0 = move-exception
            r1 = r0
            kevin.fun.hook.audio.C1117.m8104(r5)     // Catch: java.lang.Throwable -> La1
            throw r1     // Catch: java.lang.Throwable -> La1
        La1:
            r0 = move-exception
        La2:
            r2 = 48767(0xbe7f, float:6.8337E-41)
        La5:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto Lad;
                case 45: goto Ld5;
                case 76: goto Lb7;
                case 239: goto Lb1;
                default: goto Lac;
            }
        Lac:
            goto La5
        Lad:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto La5
        Lb1:
            if (r1 != 0) goto Lad
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto La5
        Lb7:
            r1 = 48891(0xbefb, float:6.8511E-41)
        Lba:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto Lc2;
                case 503: goto Ld1;
                default: goto Lc1;
            }
        Lc1:
            goto Lba
        Lc2:
            r1 = 49790(0xc27e, float:6.977E-41)
        Lc5:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto Lcd;
                case 51: goto Lf8;
                case 84: goto Lf5;
                case 241: goto Lef;
                default: goto Lcc;
            }
        Lcc:
            goto Lc5
        Lcd:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto Lc5
        Ld1:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto Lba
        Ld5:
            r2 = 49666(0xc202, float:6.9597E-41)
        Ld8:
            r5 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto Le0;
                case 50: goto Le6;
                case 76: goto Lea;
                case 83: goto L17e;
                default: goto Ldf;
            }
        Ldf:
            goto Ld8
        Le0:
            if (r1 == r0) goto Le6
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto Ld8
        Le6:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto Ld8
        Lea:
            kevin.fun.hook.audio.C1116.m8088(r1, r0)     // Catch: java.lang.Throwable -> L174
            r0 = r1
            goto Lc2
        Lef:
            if (r3 == 0) goto Lcd
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto Lc5
        Lf5:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> Lf9
        Lf8:
            throw r0     // Catch: java.lang.Throwable -> Lf9
        Lf9:
            r1 = move-exception
            r3 = r1
            r2 = r0
        Lfc:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lff:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L107;
                case 1711: goto L10d;
                case 1736: goto L14f;
                case 1769: goto L111;
                default: goto L106;
            }
        L106:
            goto Lff
        L107:
            if (r2 == 0) goto L10d
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Lff
        L10d:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Lff
        L111:
            r0 = 50689(0xc601, float:7.103E-41)
        L114:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L11c;
                case 45: goto L134;
                case 50: goto L122;
                case 76: goto L126;
                default: goto L11b;
            }
        L11b:
            goto L114
        L11c:
            if (r2 == r3) goto L122
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L114
        L122:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L114
        L126:
            kevin.fun.hook.audio.C1116.m8088(r2, r3)     // Catch: java.lang.Throwable -> L138
            r0 = 50813(0xc67d, float:7.1204E-41)
        L12c:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L134;
                case 243: goto L14b;
                default: goto L133;
            }     // Catch: java.lang.Throwable -> L138
        L133:
            goto L12c
        L134:
            androidx.activity.C1064.m338(r4)     // Catch: java.lang.Throwable -> L138
            throw r2     // Catch: java.lang.Throwable -> L138
        L138:
            r1 = move-exception
            r0 = r2
        L13a:
            r2 = 51588(0xc984, float:7.229E-41)
        L13d:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L145;
                case 54: goto L151;
                case 87: goto L17c;
                case 116: goto L155;
                default: goto L144;
            }
        L144:
            goto L13d
        L145:
            if (r0 == 0) goto L151
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L13d
        L14b:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L12c
        L14f:
            r2 = r3
            goto L134
        L151:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L13d
        L155:
            r2 = 51712(0xca00, float:7.2464E-41)
        L158:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L160;
                case 17: goto L164;
                case 47: goto L16d;
                case 76: goto L16a;
                default: goto L15f;
            }
        L15f:
            goto L158
        L160:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L158
        L164:
            if (r0 == r1) goto L160
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L158
        L16a:
            kevin.fun.hook.audio.C1116.m8088(r0, r1)
        L16d:
            throw r0
        L16e:
            r1 = move-exception
            r0 = r2
            goto L13a
        L171:
            r0 = move-exception
            r3 = r0
            goto Lfc
        L174:
            r0 = move-exception
            r3 = r0
            r2 = r1
            goto Lfc
        L178:
            r0 = move-exception
            r1 = r2
            goto La2
        L17c:
            r0 = r1
            goto L16d
        L17e:
            r0 = r1
            goto Lc2
    }

    private void extractShareObjectId(java.lang.Object r6) {
            r5 = this;
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Lea
            r1 = 1472(0x5c0, float:2.063E-42)
            r2 = 1
            r3 = 3198(0xc7e, float:4.481E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r1 = m7100(r6, r0)     // Catch: java.lang.Throwable -> Lea
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L45;
                default: goto L18;
            }     // Catch: java.lang.Throwable -> Lea
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r1 != 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            int r1 = androidx.drawerlayout.C1077.m1360()     // Catch: java.lang.Throwable -> Lea
            r0 = 1740(0x6cc, float:2.438E-42)
        L27:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2d;
                case 54: goto L32;
                case 471: goto L44;
                case 500: goto L35;
                default: goto L2c;
            }     // Catch: java.lang.Throwable -> Lea
        L2c:
            goto L27
        L2d:
            if (r1 < 0) goto L32
            r0 = 1833(0x729, float:2.569E-42)
            goto L27
        L32:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L27
        L35:
            java.lang.String r0 = "6sKjegOs9w23LkwdN1L5"
            java.lang.String r0 = androidx.vectordrawable.C1105.m3273(r0)     // Catch: java.lang.Throwable -> Lea
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lea
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> Lea
            r2.println(r0)     // Catch: java.lang.Throwable -> Lea
        L44:
            return
        L45:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Lea
            r2 = 1473(0x5c1, float:2.064E-42)
            int r3 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> Lea
            r3 = r3 ^ (-25)
            r4 = 1926(0x786, float:2.699E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r1 = m7100(r1, r0)     // Catch: java.lang.Throwable -> Lea
            r0 = 1864(0x748, float:2.612E-42)
        L5b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L61;
                case 47384: goto L6b;
                case 47417: goto L44;
                case 47483: goto L67;
                default: goto L60;
            }     // Catch: java.lang.Throwable -> Lea
        L60:
            goto L5b
        L61:
            if (r1 != 0) goto L67
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L5b
        L67:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L5b
        L6b:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Lea
            r2 = 1484(0x5cc, float:2.08E-42)
            int r3 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> Lea
            r3 = r3 ^ (-60)
            r4 = 933(0x3a5, float:1.307E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r0 = m7100(r1, r0)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lea
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L84:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L8c;
                case 45: goto L44;
                case 76: goto L96;
                case 239: goto L90;
                default: goto L8b;
            }     // Catch: java.lang.Throwable -> Lea
        L8b:
            goto L84
        L8c:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L84
        L90:
            if (r0 == 0) goto L8c
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L84
        L96:
            boolean r2 = androidx.activity.C1066.m488(r0)     // Catch: java.lang.Throwable -> Lea
            r1 = 48891(0xbefb, float:6.8511E-41)
        L9d:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 22: goto La5;
                case 53: goto L44;
                case 503: goto La9;
                case 32495: goto Laf;
                default: goto La4;
            }     // Catch: java.lang.Throwable -> Lea
        La4:
            goto L9d
        La5:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L9d
        La9:
            if (r2 != 0) goto La5
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L9d
        Laf:
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> Lea
            r2 = 1498(0x5da, float:2.099E-42)
            int r3 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> Lea
            r3 = r3 ^ 136(0x88, float:1.9E-43)
            r4 = 1566(0x61e, float:2.194E-42)
            java.lang.String r1 = androidx.core.ktx.C1070.m788(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lea
            boolean r2 = org.luckypray.dexkit.C1125.m10633(r1, r0)     // Catch: java.lang.Throwable -> Lea
            r1 = 49666(0xc202, float:6.9597E-41)
        Lc6:
            r3 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto Lce;
                case 50: goto Ld4;
                case 76: goto Ld8;
                case 83: goto L44;
                default: goto Lcd;
            }     // Catch: java.lang.Throwable -> Lea
        Lcd:
            goto Lc6
        Lce:
            if (r2 != 0) goto Ld4
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto Lc6
        Ld4:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto Lc6
        Ld8:
            m6967(r5, r0)     // Catch: java.lang.Throwable -> Lea
            r0 = 49790(0xc27e, float:6.977E-41)
        Lde:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L44;
                case 241: goto Le6;
                default: goto Le5;
            }
        Le5:
            goto Lde
        Le6:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Lde
        Lea:
            r0 = move-exception
            goto L44
    }

    private void extractSimpleMp4Urls(java.lang.String r10, kevin.fun.hook.KSHook.ParseResult r11) {
            r9 = this;
            r8 = 0
            short[] r0 = m6972()
            r1 = 1502(0x5de, float:2.105E-42)
            int r2 = kevin.fun.hook.C1120.f419
            r2 = r2 ^ (-493(0xfffffffffffffe13, float:NaN))
            r3 = 3014(0xbc6, float:4.224E-42)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r2, r3)
            java.util.regex.Pattern r0 = androidx.activity.C1062.m185(r0)
            java.util.regex.Matcher r1 = androidx.lifecycle.runtime.C1092.m2355(r0, r10)
        L19:
            boolean r2 = androidx.drawerlayout.C1077.m1287(r1)
            r0 = 1616(0x650, float:2.264E-42)
        L1f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L25;
                case 49: goto L28;
                case 204: goto L87;
                case 239: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1f
        L28:
            if (r2 != 0) goto L25
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1f
        L2d:
            r0 = 1
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r1, r0)
            java.lang.String r2 = m7019(r9, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L38:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3e;
                case 54: goto L43;
                case 471: goto L19;
                case 500: goto L46;
                default: goto L3d;
            }
        L3d:
            goto L38
        L3e:
            if (r2 == 0) goto L43
            r0 = 1833(0x729, float:2.569E-42)
            goto L38
        L43:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L38
        L46:
            boolean r3 = androidx.activity.C1066.m488(r2)
            r0 = 1864(0x748, float:2.612E-42)
        L4c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L52;
                case 47384: goto L19;
                case 47417: goto L5c;
                case 47483: goto L58;
                default: goto L51;
            }
        L51:
            goto L4c
        L52:
            if (r3 != 0) goto L58
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L4c
        L58:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L4c
        L5c:
            java.util.List r0 = m7093(r11)
            kevin.fun.hook.KSHook$VideoInfo r3 = new kevin.fun.hook.KSHook$VideoInfo
            short[] r4 = m6972()
            r5 = 1542(0x606, float:2.161E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r6 = r6 ^ 650(0x28a, float:9.11E-43)
            r7 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r4 = androidx.loader.C1095.m2574(r4, r5, r6, r7)
            r3.<init>(r2, r4, r8, r8)
            androidx.emoji2.viewsintegration.C1078.m1429(r0, r3)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L7b:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L19;
                case 239: goto L83;
                default: goto L82;
            }
        L82:
            goto L7b
        L83:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L7b
        L87:
            return
    }

    private void extractSoFromApk(java.lang.String r9, java.lang.String r10, java.io.File r11) throws java.io.IOException {
            r8 = this;
            r2 = 0
            r7 = 1
            r1 = 0
            java.lang.String[] r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3680()
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r3 = m6972()
            r4 = 1549(0x60d, float:2.17E-42)
            int r5 = androidx.lifecycle.process.C1090.f116
            r5 = r5 ^ (-428(0xfffffffffffffe54, float:NaN))
            r6 = 1098(0x44a, float:1.539E-42)
            java.lang.String r3 = androidx.core.C1073.m1028(r3, r4, r5, r6)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            short[] r1 = m6972()
            r3 = 1553(0x611, float:2.176E-42)
            r4 = 2025(0x7e9, float:2.838E-42)
            java.lang.String r1 = androidx.activity.C1066.m468(r1, r3, r7, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r10)
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r0)
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L197
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L197
            java.util.zip.ZipEntry r0 = androidx.startup.C1101.m3024(r5, r4)     // Catch: java.lang.Throwable -> L19a
            java.io.InputStream r3 = androidx.viewpager.C1108.m3527(r5, r0)     // Catch: java.lang.Throwable -> L19a
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1a3
            r6.<init>(r11)     // Catch: java.lang.Throwable -> L1a3
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L9c
        L54:
            int r7 = androidx.loader.C1099.m2896(r3, r1)     // Catch: java.lang.Throwable -> L9c
            r0 = 1616(0x650, float:2.264E-42)
        L5a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L60;
                case 49: goto L63;
                case 204: goto L68;
                case 239: goto L8c;
                default: goto L5f;
            }     // Catch: java.lang.Throwable -> L9c
        L5f:
            goto L5a
        L60:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5a
        L63:
            if (r7 > 0) goto L60
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5a
        L68:
            r0 = 1
            r1 = 0
            androidx.activity.C1066.m511(r11, r0, r1)     // Catch: java.lang.Throwable -> L9c
            r0 = 1
            r1 = 0
            androidx.lifecycle.livedata.C1084.m1756(r11, r0, r1)     // Catch: java.lang.Throwable -> L9c
            kevin.fun.hook.audio.C1117.m8104(r6)     // Catch: java.lang.Throwable -> L1a3
            r0 = 1740(0x6cc, float:2.438E-42)
        L77:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L7d;
                case 54: goto L82;
                case 471: goto L88;
                case 500: goto L85;
                default: goto L7c;
            }
        L7c:
            goto L77
        L7d:
            if (r3 == 0) goto L82
            r0 = 1833(0x729, float:2.569E-42)
            goto L77
        L82:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L77
        L85:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L19a
        L88:
            androidx.activity.C1064.m338(r5)     // Catch: java.lang.Throwable -> L197
            return
        L8c:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r6, r1, r0, r7)     // Catch: java.lang.Throwable -> L9c
            r0 = 1864(0x748, float:2.612E-42)
        L92:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L98;
                case 47483: goto L54;
                default: goto L97;
            }
        L97:
            goto L92
        L98:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L92
        L9c:
            r0 = move-exception
            r1 = r0
            kevin.fun.hook.audio.C1117.m8104(r6)     // Catch: java.lang.Throwable -> La2
            throw r1     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
        La3:
            r2 = 48767(0xbe7f, float:6.8337E-41)
        La6:
            r6 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 14: goto Lae;
                case 45: goto Ld6;
                case 76: goto Lb8;
                case 239: goto Lb2;
                default: goto Lad;
            }
        Lad:
            goto La6
        Lae:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto La6
        Lb2:
            if (r1 != 0) goto Lae
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto La6
        Lb8:
            r1 = 48891(0xbefb, float:6.8511E-41)
        Lbb:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto Lc3;
                case 503: goto Ld2;
                default: goto Lc2;
            }
        Lc2:
            goto Lbb
        Lc3:
            r1 = 49790(0xc27e, float:6.977E-41)
        Lc6:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto Lce;
                case 51: goto Lf9;
                case 84: goto Lf6;
                case 241: goto Lf0;
                default: goto Lcd;
            }
        Lcd:
            goto Lc6
        Lce:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto Lc6
        Ld2:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto Lbb
        Ld6:
            r2 = 49666(0xc202, float:6.9597E-41)
        Ld9:
            r6 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto Le1;
                case 50: goto Le7;
                case 76: goto Leb;
                case 83: goto L1a9;
                default: goto Le0;
            }
        Le0:
            goto Ld9
        Le1:
            if (r1 == r0) goto Le7
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto Ld9
        Le7:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto Ld9
        Leb:
            kevin.fun.hook.audio.C1116.m8088(r1, r0)     // Catch: java.lang.Throwable -> L19e
            r0 = r1
            goto Lc3
        Lf0:
            if (r3 == 0) goto Lce
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto Lc6
        Lf6:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> Lfa
        Lf9:
            throw r0     // Catch: java.lang.Throwable -> Lfa
        Lfa:
            r1 = move-exception
            r3 = r1
            r2 = r0
        Lfd:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L100:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L108;
                case 1711: goto L10e;
                case 1736: goto L150;
                case 1769: goto L112;
                default: goto L107;
            }
        L107:
            goto L100
        L108:
            if (r2 == 0) goto L10e
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L100
        L10e:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L100
        L112:
            r0 = 50689(0xc601, float:7.103E-41)
        L115:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L11d;
                case 45: goto L135;
                case 50: goto L123;
                case 76: goto L127;
                default: goto L11c;
            }
        L11c:
            goto L115
        L11d:
            if (r2 == r3) goto L123
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L115
        L123:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L115
        L127:
            kevin.fun.hook.audio.C1116.m8088(r2, r3)     // Catch: java.lang.Throwable -> L139
            r0 = 50813(0xc67d, float:7.1204E-41)
        L12d:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L135;
                case 243: goto L14c;
                default: goto L134;
            }     // Catch: java.lang.Throwable -> L139
        L134:
            goto L12d
        L135:
            androidx.activity.C1064.m338(r5)     // Catch: java.lang.Throwable -> L139
            throw r2     // Catch: java.lang.Throwable -> L139
        L139:
            r1 = move-exception
            r0 = r2
        L13b:
            r2 = 51588(0xc984, float:7.229E-41)
        L13e:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L146;
                case 54: goto L152;
                case 87: goto L1a7;
                case 116: goto L156;
                default: goto L145;
            }
        L145:
            goto L13e
        L146:
            if (r0 == 0) goto L152
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L13e
        L14c:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L12d
        L150:
            r2 = r3
            goto L135
        L152:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L13e
        L156:
            r2 = 51712(0xca00, float:7.2464E-41)
        L159:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L161;
                case 17: goto L165;
                case 47: goto L16e;
                case 76: goto L16b;
                default: goto L160;
            }
        L160:
            goto L159
        L161:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L159
        L165:
            if (r0 == r1) goto L161
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L159
        L16b:
            kevin.fun.hook.audio.C1116.m8088(r0, r1)     // Catch: java.lang.NullPointerException -> L16f
        L16e:
            throw r0     // Catch: java.lang.NullPointerException -> L16f
        L16f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r5 = 1554(0x612, float:2.178E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r6 = r6 ^ (-950(0xfffffffffffffc4a, float:NaN))
            r7 = 2102(0x836, float:2.946E-42)
            java.lang.String r3 = androidx.lifecycle.livedata.C1084.m1796(r3, r5, r6, r7)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            r1.<init>(r2, r0)
            throw r1
        L197:
            r1 = move-exception
            r0 = r2
            goto L13b
        L19a:
            r0 = move-exception
            r3 = r0
            goto Lfd
        L19e:
            r0 = move-exception
            r3 = r0
            r2 = r1
            goto Lfd
        L1a3:
            r0 = move-exception
            r1 = r2
            goto La3
        L1a7:
            r0 = r1
            goto L16e
        L1a9:
            r0 = r1
            goto Lc3
    }

    private java.lang.String extractValue(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.regex.Pattern r0 = androidx.activity.C1062.m185(r5)
            java.util.regex.Matcher r1 = androidx.lifecycle.runtime.C1092.m2355(r0, r4)
            boolean r2 = androidx.drawerlayout.C1077.m1287(r1)
            r0 = 1616(0x650, float:2.264E-42)
        Le:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L14;
                case 49: goto L17;
                case 204: goto L1c;
                case 239: goto L2c;
                default: goto L13;
            }
        L13:
            goto Le
        L14:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Le
        L17:
            if (r2 == 0) goto L14
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Le
        L1c:
            r0 = 1
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r1, r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L23:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L29;
                case 54: goto L30;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L23
        L2c:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
        L30:
            return r0
    }

    private void extractVideoUrls(java.lang.String r10, kevin.fun.hook.KSHook.ParseResult r11) {
            r9 = this;
            r1 = 1678(0x68e, float:2.351E-42)
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Ld6
            r2 = 1570(0x622, float:2.2E-42)
            int r3 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> Ld6
            r3 = r3 ^ 846(0x34e, float:1.185E-42)
            r4 = 2250(0x8ca, float:3.153E-42)
            java.lang.String r0 = androidx.appcompat.C1069.m751(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Ld6
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> Ld6
            r2 = r2 ^ (-902(0xfffffffffffffc7a, float:NaN))
            java.util.regex.Pattern r0 = androidx.lifecycle.process.C1087.m1979(r0, r2)     // Catch: java.lang.Throwable -> Ld6
            java.util.regex.Matcher r2 = androidx.lifecycle.runtime.C1092.m2355(r0, r10)     // Catch: java.lang.Throwable -> Ld6
        L1e:
            boolean r3 = androidx.drawerlayout.C1077.m1287(r2)     // Catch: java.lang.Throwable -> Ld6
            r0 = 1616(0x650, float:2.264E-42)
        L24:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2a;
                case 49: goto L2c;
                case 204: goto L31;
                case 239: goto L64;
                default: goto L29;
            }     // Catch: java.lang.Throwable -> Ld6
        L29:
            goto L24
        L2a:
            r0 = r1
            goto L24
        L2c:
            if (r3 != 0) goto L2a
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L24
        L31:
            java.util.List r0 = m7093(r11)     // Catch: java.lang.Throwable -> Ld6
            boolean r2 = androidx.activity.C1064.m359(r0)     // Catch: java.lang.Throwable -> Ld6
            r0 = 1740(0x6cc, float:2.438E-42)
        L3b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L41;
                case 54: goto L46;
                case 471: goto L4c;
                case 500: goto L49;
                default: goto L40;
            }     // Catch: java.lang.Throwable -> Ld6
        L40:
            goto L3b
        L41:
            if (r2 == 0) goto L46
            r0 = 1833(0x729, float:2.569E-42)
            goto L3b
        L46:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3b
        L49:
            m6990(r9, r10, r11)     // Catch: java.lang.Throwable -> Ld6
        L4c:
            java.util.List r0 = m7093(r11)     // Catch: java.lang.Throwable -> Ld6
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda7 r2 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda7     // Catch: java.lang.Throwable -> Ld6
            r2.<init>()     // Catch: java.lang.Throwable -> Ld6
            androidx.loader.C1097.m2760(r0, r2)     // Catch: java.lang.Throwable -> Ld6
            r0 = 1864(0x748, float:2.612E-42)
        L5a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L60;
                case 47483: goto Lfd;
                default: goto L5f;
            }     // Catch: java.lang.Throwable -> Ld6
        L5f:
            goto L5a
        L60:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L5a
        L64:
            r0 = 1
            java.lang.String r3 = androidx.emoji2.C1080.m1523(r2, r0)     // Catch: java.lang.Throwable -> Ld6
            int r0 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> Ld6
            r0 = r0 ^ 955(0x3bb, float:1.338E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r2, r0)     // Catch: java.lang.Throwable -> Ld6
            int r4 = androidx.viewpager.C1108.m3549(r0)     // Catch: java.lang.Throwable -> Ld6
            int r0 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> Ld6
            r0 = r0 ^ 656(0x290, float:9.19E-43)
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r2, r0)     // Catch: java.lang.Throwable -> Ld6
            int r5 = androidx.viewpager.C1108.m3549(r0)     // Catch: java.lang.Throwable -> Ld6
            int r0 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> Ld6
            r0 = r0 ^ (-449(0xfffffffffffffe3f, float:NaN))
            java.lang.String r0 = androidx.emoji2.C1080.m1523(r2, r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = m7019(r9, r0)     // Catch: java.lang.Throwable -> Ld6
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L90:
            r7 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 14: goto L98;
                case 45: goto L1e;
                case 76: goto La2;
                case 239: goto L9c;
                default: goto L97;
            }     // Catch: java.lang.Throwable -> Ld6
        L97:
            goto L90
        L98:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L90
        L9c:
            if (r6 == 0) goto L98
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L90
        La2:
            boolean r7 = androidx.activity.C1066.m488(r6)     // Catch: java.lang.Throwable -> Ld6
            r0 = 48891(0xbefb, float:6.8511E-41)
        La9:
            r8 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 22: goto Lb1;
                case 53: goto L1e;
                case 503: goto Lb5;
                case 32495: goto Lbb;
                default: goto Lb0;
            }     // Catch: java.lang.Throwable -> Ld6
        Lb0:
            goto La9
        Lb1:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto La9
        Lb5:
            if (r7 != 0) goto Lb1
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto La9
        Lbb:
            java.util.List r0 = m7093(r11)     // Catch: java.lang.Throwable -> Ld6
            kevin.fun.hook.KSHook$VideoInfo r7 = new kevin.fun.hook.KSHook$VideoInfo     // Catch: java.lang.Throwable -> Ld6
            r7.<init>(r6, r3, r4, r5)     // Catch: java.lang.Throwable -> Ld6
            androidx.emoji2.viewsintegration.C1078.m1429(r0, r7)     // Catch: java.lang.Throwable -> Ld6
            r0 = 49666(0xc202, float:6.9597E-41)
        Lca:
            r3 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto Ld2;
                case 50: goto L1e;
                default: goto Ld1;
            }
        Ld1:
            goto Lca
        Ld2:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lca
        Ld6:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            int r4 = org.luckypray.dexkit.C1123.f433
            r4 = r4 ^ (-977(0xfffffffffffffc2f, float:NaN))
            r5 = 878(0x36e, float:1.23E-42)
            java.lang.String r1 = org.luckypray.dexkit.C1124.m10545(r3, r1, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        Lfd:
            int r1 = androidx.activity.C1065.m427()
            r0 = 49790(0xc27e, float:6.977E-41)
        L104:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L10c;
                case 51: goto L125;
                case 84: goto L116;
                case 241: goto L110;
                default: goto L10b;
            }
        L10b:
            goto L104
        L10c:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L104
        L110:
            if (r1 > 0) goto L10c
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L104
        L116:
            java.lang.String r0 = "8t1Qqw2o"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L125:
            return
    }

    private java.lang.String fetchHtmlContent(java.lang.String r13) {
            r12 = this;
            r1 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L185 java.lang.Throwable -> L1a8
            r0.<init>(r13)     // Catch: java.lang.Exception -> L185 java.lang.Throwable -> L1a8
            java.net.URLConnection r0 = androidx.loader.C1094.m2492(r0)     // Catch: java.lang.Exception -> L185 java.lang.Throwable -> L1a8
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Exception -> L185 java.lang.Throwable -> L1a8
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r3 = 1700(0x6a4, float:2.382E-42)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r4 = r4 ^ (-122(0xffffffffffffff86, float:NaN))
            r5 = 1481(0x5c9, float:2.075E-42)
            java.lang.String r2 = androidx.documentfile.C1076.m1234(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            androidx.versionedparcelable.C1107.m3434(r0, r2)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r3 = 1703(0x6a7, float:2.386E-42)
            int r4 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r4 = r4 ^ 480(0x1e0, float:6.73E-43)
            r5 = 3080(0xc08, float:4.316E-42)
            java.lang.String r2 = androidx.activity.C1064.m310(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            java.lang.String r3 = m7032(r12)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            androidx.activity.C1064.m355(r0, r2, r3)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            int r2 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r2 = r2 ^ 14648(0x3938, float:2.0526E-41)
            androidx.lifecycle.process.C1087.m2000(r0, r2)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            androidx.loader.C1094.m2450(r0, r2)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r3 = 1713(0x6b1, float:2.4E-42)
            int r4 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r4 = r4 ^ (-482(0xfffffffffffffe1e, float:NaN))
            r5 = 739(0x2e3, float:1.036E-42)
            java.lang.String r2 = androidx.loader.C1098.m2787(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            short[] r3 = m6972()     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r4 = 1719(0x6b7, float:2.409E-42)
            int r5 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r5 = r5 ^ 927(0x39f, float:1.299E-42)
            r6 = 1484(0x5cc, float:2.08E-42)
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2213(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            androidx.activity.C1064.m355(r0, r2, r3)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r3 = 1782(0x6f6, float:2.497E-42)
            int r4 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r4 = r4 ^ (-946(0xfffffffffffffc4e, float:NaN))
            r5 = 974(0x3ce, float:1.365E-42)
            java.lang.String r2 = androidx.loader.C1097.m2734(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            short[] r3 = m6972()     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r4 = 1797(0x705, float:2.518E-42)
            int r5 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r5 = r5 ^ 360(0x168, float:5.04E-43)
            r6 = 2948(0xb84, float:4.131E-42)
            java.lang.String r3 = androidx.activity.C1062.m170(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            androidx.activity.C1064.m355(r0, r2, r3)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            int r3 = androidx.loader.C1094.m57(r0)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            r2 = 1616(0x650, float:2.264E-42)
        L8c:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L92;
                case 49: goto L95;
                case 204: goto L9c;
                case 239: goto Le1;
                default: goto L91;
            }
        L91:
            goto L8c
        L92:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L8c
        L95:
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 == r2) goto L92
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L8c
        L9c:
            r2 = 1740(0x6cc, float:2.438E-42)
        L9e:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto La4;
                case 54: goto La4;
                case 471: goto Lc7;
                case 500: goto La7;
                default: goto La3;
            }
        La3:
            goto L9e
        La4:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L9e
        La7:
            r2 = 0
            androidx.versionedparcelable.C1107.m3447(r2)     // Catch: java.io.IOException -> Lb7
        Lab:
            r2 = 1864(0x748, float:2.612E-42)
        Lad:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto Lb3;
                case 47483: goto Lc7;
                default: goto Lb2;
            }
        Lb2:
            goto Lad
        Lb3:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto Lad
        Lb7:
            r2 = move-exception
            r2 = 48767(0xbe7f, float:6.8337E-41)
        Lbb:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto Lab;
                case 239: goto Lc3;
                default: goto Lc2;
            }
        Lc2:
            goto Lbb
        Lc3:
            r2 = 48798(0xbe9e, float:6.838E-41)
            goto Lbb
        Lc7:
            r2 = 48891(0xbefb, float:6.8511E-41)
        Lca:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto Ld2;
                case 53: goto Ldf;
                case 503: goto Ld6;
                case 32495: goto Ldc;
                default: goto Ld1;
            }
        Ld1:
            goto Lca
        Ld2:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto Lca
        Ld6:
            if (r0 == 0) goto Ld2
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto Lca
        Ldc:
            androidx.emoji2.C1080.m1546(r0)
        Ldf:
            r0 = r1
        Le0:
            return r0
        Le1:
            java.io.InputStream r2 = androidx.customview.C1075.m1174(r0)     // Catch: java.lang.Throwable -> L23d java.lang.Exception -> L249
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r4.<init>()     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
        Lee:
            int r6 = androidx.loader.C1099.m2896(r2, r5)     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r3 = 49666(0xc202, float:6.9597E-41)
        Lf5:
            r7 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r7
            switch(r3) {
                case 17: goto Lfd;
                case 50: goto L104;
                case 76: goto L108;
                case 83: goto L15d;
                default: goto Lfc;
            }     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
        Lfc:
            goto Lf5
        Lfd:
            r3 = -1
            if (r6 != r3) goto L104
            r3 = 49759(0xc25f, float:6.9727E-41)
            goto Lf5
        L104:
            r3 = 49728(0xc240, float:6.9684E-41)
            goto Lf5
        L108:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r4)     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r3 = 49790(0xc27e, float:6.977E-41)
        L10f:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto L117;
                case 51: goto L143;
                case 84: goto L121;
                case 241: goto L11b;
                default: goto L116;
            }
        L116:
            goto L10f
        L117:
            r3 = 49852(0xc2bc, float:6.9858E-41)
            goto L10f
        L11b:
            if (r2 == 0) goto L117
            r3 = 49883(0xc2db, float:6.9901E-41)
            goto L10f
        L121:
            androidx.versionedparcelable.C1107.m3447(r2)     // Catch: java.io.IOException -> L133
        L124:
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L127:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 497: goto L12f;
                case 1711: goto L143;
                default: goto L12e;
            }
        L12e:
            goto L127
        L12f:
            r2 = 50596(0xc5a4, float:7.09E-41)
            goto L127
        L133:
            r2 = move-exception
            r2 = 50689(0xc601, float:7.103E-41)
        L137:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L13f;
                case 50: goto L124;
                default: goto L13e;
            }
        L13e:
            goto L137
        L13f:
            r2 = 50720(0xc620, float:7.1074E-41)
            goto L137
        L143:
            r2 = 50813(0xc67d, float:7.1204E-41)
        L146:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L14e;
                case 53: goto L15b;
                case 243: goto L152;
                case 4075: goto L158;
                default: goto L14d;
            }
        L14d:
            goto L146
        L14e:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L146
        L152:
            if (r0 == 0) goto L14e
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L146
        L158:
            androidx.emoji2.C1080.m1546(r0)
        L15b:
            r0 = r1
            goto Le0
        L15d:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r7 = 0
            short[] r8 = m6972()     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r9 = 1811(0x713, float:2.538E-42)
            int r10 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r10 = r10 ^ (-270(0xfffffffffffffef2, float:NaN))
            r11 = 2056(0x808, float:2.881E-42)
            java.lang.String r8 = androidx.emoji2.C1080.m1525(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r3.<init>(r5, r7, r6, r8)     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            androidx.lifecycle.livedata.C1085.m1859(r4, r3)     // Catch: java.lang.Throwable -> L243 java.lang.Exception -> L24d
            r3 = 51588(0xc984, float:7.229E-41)
        L179:
            r6 = 51605(0xc995, float:7.2314E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 17: goto L181;
                case 54: goto Lee;
                default: goto L180;
            }
        L180:
            goto L179
        L181:
            r3 = 51619(0xc9a3, float:7.2334E-41)
            goto L179
        L185:
            r0 = move-exception
            r2 = r1
            r0 = r1
        L188:
            r3 = 51712(0xca00, float:7.2464E-41)
        L18b:
            r4 = 51729(0xca11, float:7.2488E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 14: goto L193;
                case 15: goto L192;
                case 16: goto L192;
                case 17: goto L1a4;
                default: goto L192;
            }
        L192:
            goto L18b
        L193:
            r3 = 53634(0xd182, float:7.5157E-41)
        L196:
            r4 = 53651(0xd193, float:7.5181E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L19e;
                case 50: goto L1fc;
                case 76: goto L200;
                case 83: goto L222;
                default: goto L19d;
            }
        L19d:
            goto L196
        L19e:
            if (r2 == 0) goto L1fc
            r3 = 53727(0xd1df, float:7.5288E-41)
            goto L196
        L1a4:
            r3 = 51743(0xca1f, float:7.2507E-41)
            goto L18b
        L1a8:
            r0 = move-exception
            r3 = r0
            r4 = r1
            r5 = r1
        L1ac:
            r0 = 51836(0xca7c, float:7.2638E-41)
        L1af:
            r1 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 241: goto L1b7;
                case 1963: goto L1bd;
                case 1992: goto L1e3;
                case 2025: goto L1c1;
                default: goto L1b6;
            }
        L1b6:
            goto L1af
        L1b7:
            if (r4 == 0) goto L1bd
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L1af
        L1bd:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L1af
        L1c1:
            androidx.versionedparcelable.C1107.m3447(r4)     // Catch: java.io.IOException -> L1d3
        L1c4:
            r0 = 52611(0xcd83, float:7.3724E-41)
        L1c7:
            r1 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 23: goto L1cf;
                case 54: goto L1e3;
                default: goto L1ce;
            }
        L1ce:
            goto L1c7
        L1cf:
            r0 = 52642(0xcda2, float:7.3767E-41)
            goto L1c7
        L1d3:
            r0 = move-exception
            r0 = 52735(0xcdff, float:7.3897E-41)
        L1d7:
            r1 = 52752(0xce10, float:7.3921E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L1c4;
                case 1007: goto L1df;
                default: goto L1de;
            }
        L1de:
            goto L1d7
        L1df:
            r0 = 52766(0xce1e, float:7.3941E-41)
            goto L1d7
        L1e3:
            r0 = 53510(0xd106, float:7.4983E-41)
        L1e6:
            r1 = 53527(0xd117, float:7.5007E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L1ee;
                case 50: goto L1f4;
                case 83: goto L1fb;
                case 116: goto L1f8;
                default: goto L1ed;
            }
        L1ed:
            goto L1e6
        L1ee:
            if (r5 == 0) goto L1f4
            r0 = 53603(0xd163, float:7.5114E-41)
            goto L1e6
        L1f4:
            r0 = 53572(0xd144, float:7.507E-41)
            goto L1e6
        L1f8:
            androidx.emoji2.C1080.m1546(r5)
        L1fb:
            throw r3
        L1fc:
            r3 = 53696(0xd1c0, float:7.5244E-41)
            goto L196
        L200:
            androidx.versionedparcelable.C1107.m3447(r2)     // Catch: java.io.IOException -> L212
        L203:
            r2 = 53758(0xd1fe, float:7.5331E-41)
        L206:
            r3 = 53775(0xd20f, float:7.5355E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 1009: goto L20e;
                case 1703: goto L222;
                default: goto L20d;
            }
        L20d:
            goto L206
        L20e:
            r2 = 54440(0xd4a8, float:7.6287E-41)
            goto L206
        L212:
            r2 = move-exception
            r2 = 54533(0xd505, float:7.6417E-41)
        L216:
            r3 = 54550(0xd516, float:7.6441E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L21e;
                case 50: goto L203;
                default: goto L21d;
            }
        L21d:
            goto L216
        L21e:
            r2 = 54564(0xd524, float:7.646E-41)
            goto L216
        L222:
            r2 = 54657(0xd581, float:7.6591E-41)
        L225:
            r3 = 54674(0xd592, float:7.6615E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L22d;
                case 45: goto L23a;
                case 50: goto L233;
                case 3579: goto L237;
                default: goto L22c;
            }
        L22c:
            goto L225
        L22d:
            if (r0 == 0) goto L233
            r2 = 55401(0xd869, float:7.7633E-41)
            goto L225
        L233:
            r2 = 54719(0xd5bf, float:7.6678E-41)
            goto L225
        L237:
            androidx.emoji2.C1080.m1546(r0)
        L23a:
            r0 = r1
            goto Le0
        L23d:
            r2 = move-exception
            r3 = r2
            r4 = r1
            r5 = r0
            goto L1ac
        L243:
            r1 = move-exception
            r3 = r1
            r4 = r2
            r5 = r0
            goto L1ac
        L249:
            r2 = move-exception
            r2 = r1
            goto L188
        L24d:
            r3 = move-exception
            goto L188
    }

    private java.lang.String findSoPath() {
            r8 = this;
            r0 = 0
            java.lang.String r2 = m6993()
            r1 = 1616(0x650, float:2.264E-42)
        L7:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L4f;
                case 239: goto L15;
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
            java.io.File r2 = new java.io.File
            java.lang.String r1 = m6993()
            r2.<init>(r1)
            java.io.File r3 = new java.io.File
            java.io.File r1 = androidx.lifecycle.viewmodel.C1093.m2419(r2)
            short[] r4 = m6972()
            r5 = 1816(0x718, float:2.545E-42)
            int r6 = androidx.interpolator.C1083.f109
            r6 = r6 ^ (-426(0xfffffffffffffe56, float:NaN))
            r7 = 1963(0x7ab, float:2.751E-42)
            java.lang.String r4 = org.luckypray.dexkit.C1125.m10615(r4, r5, r6, r7)
            r3.<init>(r1, r4)
            boolean r4 = androidx.vectordrawable.C1105.m3294(r3)
            r1 = 1740(0x6cc, float:2.438E-42)
        L3d:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L43;
                case 54: goto L48;
                case 471: goto L50;
                case 500: goto L4b;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            if (r4 == 0) goto L48
            r1 = 1833(0x729, float:2.569E-42)
            goto L3d
        L48:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L3d
        L4b:
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r3)
        L4f:
            return r0
        L50:
            java.io.File r3 = new java.io.File
            java.io.File r1 = androidx.lifecycle.viewmodel.C1093.m2419(r2)
            short[] r2 = m6972()
            r4 = 1836(0x72c, float:2.573E-42)
            int r5 = androidx.versionedparcelable.C1107.f133
            r5 = r5 ^ 662(0x296, float:9.28E-43)
            r6 = 2650(0xa5a, float:3.713E-42)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r4, r5, r6)
            r3.<init>(r1, r2)
            boolean r2 = androidx.vectordrawable.C1105.m3294(r3)
            r1 = 1864(0x748, float:2.612E-42)
        L6f:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L75;
                case 47384: goto L4f;
                case 47417: goto L7f;
                case 47483: goto L7b;
                default: goto L74;
            }
        L74:
            goto L6f
        L75:
            if (r2 == 0) goto L7b
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L6f
        L7b:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L6f
        L7f:
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r3)
            goto L4f
    }

    private java.lang.String formatSpeed(int r11, long r12) {
            r10 = this;
            r8 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            r6 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r4 = 1
            double r0 = (double) r11
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            double r2 = (double) r12
            double r2 = r0 / r2
            r0 = 1616(0x650, float:2.264E-42)
        L11:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L17;
                case 49: goto L1a;
                case 204: goto L21;
                case 239: goto L47;
                default: goto L16;
            }
        L16:
            goto L11
        L17:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L11
        L1a:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L21:
            java.util.Locale r0 = androidx.customview.C1075.m1125()
            double r2 = r2 / r8
            java.lang.Double r1 = androidx.core.ktx.C1071.m841(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r3 = androidx.vectordrawable.animated.C1102.f128
            r3 = r3 ^ 195(0xc3, float:2.73E-43)
            r2[r3] = r1
            short[] r1 = m6972()
            r3 = 1854(0x73e, float:2.598E-42)
            int r4 = kevin.fun.hook.audio.C1117.f406
            r4 = r4 ^ 64
            r5 = 1164(0x48c, float:1.631E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1116.m8020(r1, r3, r4, r5)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8117(r0, r1, r2)
        L46:
            return r0
        L47:
            r0 = 1740(0x6cc, float:2.438E-42)
        L49:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4f;
                case 54: goto L56;
                case 471: goto L7f;
                case 500: goto L59;
                default: goto L4e;
            }
        L4e:
            goto L49
        L4f:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L56
            r0 = 1833(0x729, float:2.569E-42)
            goto L49
        L56:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L49
        L59:
            java.util.Locale r0 = androidx.customview.C1075.m1125()
            double r2 = r2 / r6
            java.lang.Double r1 = androidx.core.ktx.C1071.m841(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r3 = kevin.fun.hook.audio.C1114.f403
            r3 = r3 ^ (-20)
            r2[r3] = r1
            short[] r1 = m6972()
            r3 = 1863(0x747, float:2.61E-42)
            int r4 = androidx.loader.C1096.f122
            r4 = r4 ^ (-952(0xfffffffffffffc48, float:NaN))
            r5 = 1228(0x4cc, float:1.721E-42)
            java.lang.String r1 = androidx.core.C1072.m957(r1, r3, r4, r5)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8117(r0, r1, r2)
            goto L46
        L7f:
            java.util.Locale r0 = androidx.customview.C1075.m1125()
            java.lang.Double r1 = androidx.core.ktx.C1071.m841(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r3 = androidx.startup.C1101.f127
            r3 = r3 ^ 766(0x2fe, float:1.073E-42)
            r2[r3] = r1
            short[] r1 = m6972()
            r3 = 1872(0x750, float:2.623E-42)
            int r4 = androidx.lifecycle.process.C1087.f113
            r4 = r4 ^ (-616(0xfffffffffffffd98, float:NaN))
            r5 = 2477(0x9ad, float:3.471E-42)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8576(r1, r3, r4, r5)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8117(r0, r1, r2)
            goto L46
    }

    private java.lang.String getFileExtension(java.lang.String r8) {
            r7 = this;
            r6 = 1
            short[] r0 = m6972()
            r1 = 1880(0x758, float:2.634E-42)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 368(0x170, float:5.16E-43)
            r3 = 1064(0x428, float:1.491E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10615(r0, r1, r2, r3)
            r1 = 1616(0x650, float:2.264E-42)
        L13:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto Lae;
                case 239: goto L21;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r8 != 0) goto L19
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            short[] r1 = m6972()     // Catch: java.lang.Exception -> Laf
            r2 = 1884(0x75c, float:2.64E-42)
            int r3 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Exception -> Laf
            r3 = r3 ^ 783(0x30f, float:1.097E-42)
            r4 = 911(0x38f, float:1.277E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r1, r2, r3, r4)     // Catch: java.lang.Exception -> Laf
            java.lang.String[] r1 = kevin.fun.hook.audio.C1117.m8145(r8, r1)     // Catch: java.lang.Exception -> Laf
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> Laf
            short[] r2 = m6972()     // Catch: java.lang.Exception -> Laf
            r3 = 1886(0x75e, float:2.643E-42)
            int r4 = androidx.customview.C1075.f101     // Catch: java.lang.Exception -> Laf
            r4 = r4 ^ (-104(0xffffffffffffff98, float:NaN))
            r5 = 1044(0x414, float:1.463E-42)
            java.lang.String r2 = androidx.activity.C1066.m468(r2, r3, r4, r5)     // Catch: java.lang.Exception -> Laf
            java.lang.String[] r2 = kevin.fun.hook.audio.C1117.m8145(r1, r2)     // Catch: java.lang.Exception -> Laf
            int r3 = r2.length     // Catch: java.lang.Exception -> Laf
            r1 = 1740(0x6cc, float:2.438E-42)
        L4f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L55;
                case 54: goto L5a;
                case 471: goto Lae;
                case 500: goto L5d;
                default: goto L54;
            }     // Catch: java.lang.Exception -> Laf
        L54:
            goto L4f
        L55:
            if (r3 <= r6) goto L5a
            r1 = 1833(0x729, float:2.569E-42)
            goto L4f
        L5a:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L4f
        L5d:
            int r1 = r2.length     // Catch: java.lang.Exception -> Laf
            int r1 = r1 + (-1)
            r1 = r2[r1]     // Catch: java.lang.Exception -> Laf
            java.util.Locale r2 = kevin.fun.hook.audio.C1117.m8129()     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = kevin.fun.hook.audio.C1116.m8046(r1, r2)     // Catch: java.lang.Exception -> Laf
            short[] r1 = m6972()     // Catch: java.lang.Exception -> Laf
            r3 = 1888(0x760, float:2.646E-42)
            int r4 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Exception -> Laf
            r4 = r4 ^ (-123(0xffffffffffffff85, float:NaN))
            r5 = 1525(0x5f5, float:2.137E-42)
            java.lang.String r1 = androidx.documentfile.C1076.m1234(r1, r3, r4, r5)     // Catch: java.lang.Exception -> Laf
            boolean r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3718(r2, r1)     // Catch: java.lang.Exception -> Laf
            r1 = 1864(0x748, float:2.612E-42)
        L80:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L86;
                case 47384: goto Lae;
                case 47417: goto L90;
                case 47483: goto L8c;
                default: goto L85;
            }     // Catch: java.lang.Exception -> Laf
        L85:
            goto L80
        L86:
            if (r3 == 0) goto L8c
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L80
        L8c:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L80
        L90:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r1.<init>()     // Catch: java.lang.Exception -> Laf
            short[] r3 = m6972()     // Catch: java.lang.Exception -> Laf
            r4 = 1908(0x774, float:2.674E-42)
            r5 = 1
            r6 = 1939(0x793, float:2.717E-42)
            java.lang.String r3 = androidx.loader.C1098.m2787(r3, r4, r5, r6)     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r3)     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Exception -> Laf
        Lae:
            return r0
        Laf:
            r1 = move-exception
            goto Lae
    }

    private java.lang.String getRandomUserAgent() {
            r9 = this;
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۦۦۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 1748643: goto L30;
                case 1748894: goto L22;
                case 1749666: goto L3e;
                case 1750686: goto L1a;
                case 1753634: goto L28;
                case 1754469: goto L39;
                default: goto L11;
            }
        L11:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            java.lang.String r5 = "ۣۤ۟"
            r3 = r1
            goto La
        L1a:
            java.lang.String[] r1 = m7085()
            java.lang.String r5 = "ۧۢ۠"
            r4 = r1
            goto La
        L22:
            r1 = r0[r8]
            java.lang.String r5 = "ۢۢۢ"
            r2 = r1
            goto La
        L28:
            java.lang.String[] r0 = m7085()
            java.lang.String r1 = "ۣۧۧ"
            r5 = r1
            goto La
        L30:
            int r7 = androidx.vectordrawable.C1103.m3150(r3, r6)
            java.lang.String r1 = "ۡۨۥ"
            r5 = r1
            r8 = r7
            goto La
        L39:
            int r6 = r4.length
            java.lang.String r1 = "ۡ۠ۢ"
            r5 = r1
            goto La
        L3e:
            return r2
    }

    private long getVersionCode(android.content.Context r7) {
            r6 = this;
            android.content.pm.PackageManager r0 = androidx.customview.C1074.m1063(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = androidx.appcompat.C1069.m719(r7)     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            android.content.pm.PackageInfo r1 = androidx.activity.C1062.m194(r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
            int r2 = androidx.loader.C1095.m2593()     // Catch: java.lang.Throwable -> L2e
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L23;
                case 239: goto L28;
                default: goto L18;
            }     // Catch: java.lang.Throwable -> L2e
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            r0 = 28
            if (r2 < r0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L23:
            long r0 = androidx.drawerlayout.C1077.m1300(r1)     // Catch: java.lang.Throwable -> L2e
        L27:
            return r0
        L28:
            int r0 = kevin.fun.hook.audio.C1116.m8090(r1)     // Catch: java.lang.Throwable -> L2e
            long r0 = (long) r0
            goto L27
        L2e:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 1909(0x775, float:2.675E-42)
            int r4 = androidx.lifecycle.runtime.C1092.f118
            r4 = r4 ^ 773(0x305, float:1.083E-42)
            r5 = 1860(0x744, float:2.606E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            r0 = 963(0x3c3, double:4.76E-321)
            int r2 = androidx.loader.C1095.f121
            long r2 = (long) r2
            long r0 = r0 ^ r2
            goto L27
    }

    private void handleAdEvent(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            r3 = 1
            short[] r0 = m6972()
            r1 = 1935(0x78f, float:2.712E-42)
            r2 = 2230(0x8b6, float:3.125E-42)
            java.lang.String r1 = androidx.interpolator.C1082.m1694(r0, r1, r3, r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = m7049(r6)
            boolean r2 = androidx.activity.C1062.m223(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L17:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1d;
                case 49: goto L20;
                case 204: goto Le7;
                case 239: goto L25;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L17
        L20:
            if (r2 == 0) goto L1d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L17
        L25:
            java.lang.Object[] r0 = m7108(r7)     // Catch: java.lang.Throwable -> Lbe
            r2 = 0
            r0 = r0[r2]     // Catch: java.lang.Throwable -> Lbe
            int r2 = m7009(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            r0 = 1740(0x6cc, float:2.438E-42)
        L32:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L38;
                case 54: goto L3d;
                case 471: goto L53;
                case 500: goto L40;
                default: goto L37;
            }     // Catch: java.lang.Throwable -> Lbe
        L37:
            goto L32
        L38:
            if (r2 == r3) goto L3d
            r0 = 1833(0x729, float:2.569E-42)
            goto L32
        L3d:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L32
        L40:
            r0 = 1864(0x748, float:2.612E-42)
        L42:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L48;
                case 47384: goto Le7;
                case 47417: goto L53;
                case 47483: goto L4f;
                default: goto L47;
            }     // Catch: java.lang.Throwable -> Lbe
        L47:
            goto L42
        L48:
            r0 = 2
            if (r2 != r0) goto L4f
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L42
        L4f:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L42
        L53:
            java.lang.Object[] r0 = m7108(r7)     // Catch: java.lang.Throwable -> Lbe
            r2 = 0
            r0 = r0[r2]     // Catch: java.lang.Throwable -> Lbe
            int r2 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> Lbe
            r2 = r2 ^ (-79)
            m7037(r0, r1, r2)     // Catch: java.lang.Throwable -> Lbe
            java.util.concurrent.atomic.AtomicBoolean r0 = m7049(r6)     // Catch: java.lang.Throwable -> Lbe
            r1 = 1
            androidx.drawerlayout.C1077.m1308(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r0 = m7042(r7)     // Catch: java.lang.Throwable -> Lbe
            boolean r1 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Lbe
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L72:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L7a;
                case 45: goto Le7;
                case 76: goto L84;
                case 239: goto L7e;
                default: goto L79;
            }     // Catch: java.lang.Throwable -> Lbe
        L79:
            goto L72
        L7a:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L72
        L7e:
            if (r1 == 0) goto L7a
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L72
        L84:
            java.lang.Object r0 = m7042(r7)     // Catch: java.lang.Throwable -> Lbe
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = androidx.loader.C1098.m2818(r0)     // Catch: java.lang.Throwable -> Lbe
            r1 = 48891(0xbefb, float:6.8511E-41)
        L91:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 22: goto L99;
                case 53: goto Le7;
                case 503: goto L9d;
                case 32495: goto La3;
                default: goto L98;
            }     // Catch: java.lang.Throwable -> Lbe
        L98:
            goto L91
        L99:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L91
        L9d:
            if (r2 != 0) goto L99
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L91
        La3:
            android.os.Handler r1 = m7088()     // Catch: java.lang.Throwable -> Lbe
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda1 r2 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> Lbe
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> Lbe
            androidx.activity.C1062.m178(r1, r2)     // Catch: java.lang.Throwable -> Lbe
            r0 = 49666(0xc202, float:6.9597E-41)
        Lb2:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Lba;
                case 50: goto Le7;
                default: goto Lb9;
            }
        Lb9:
            goto Lb2
        Lba:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lb2
        Lbe:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 1936(0x790, float:2.713E-42)
            int r4 = org.luckypray.dexkit.C1124.f434
            r4 = r4 ^ 640(0x280, float:8.97E-43)
            r5 = 725(0x2d5, float:1.016E-42)
            java.lang.String r2 = androidx.appcompat.resources.C1068.m652(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        Le7:
            return
    }

    private void handleBindViewHolder(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            r3 = 1
            short[] r0 = m6972()
            r1 = 1955(0x7a3, float:2.74E-42)
            r2 = 561(0x231, float:7.86E-43)
            java.lang.String r1 = androidx.lifecycle.process.C1088.m2044(r0, r1, r3, r2)
            java.lang.Object r2 = m7042(r8)     // Catch: java.lang.Throwable -> L14a
            java.lang.Object[] r0 = m7108(r8)     // Catch: java.lang.Throwable -> L14a
            r3 = 1
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L14a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L14a
            int r3 = androidx.interpolator.C1081.m1580(r0)     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r2 = m7100(r2, r1)     // Catch: java.lang.Throwable -> L14a
            r0 = 1616(0x650, float:2.264E-42)
        L24:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2a;
                case 49: goto L2d;
                case 204: goto L32;
                case 239: goto L56;
                default: goto L29;
            }     // Catch: java.lang.Throwable -> L14a
        L29:
            goto L24
        L2a:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L24
        L2d:
            if (r2 != 0) goto L2a
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L24
        L32:
            int r1 = androidx.interpolator.C1083.m1725()     // Catch: java.lang.Throwable -> L14a
            r0 = 1740(0x6cc, float:2.438E-42)
        L38:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3e;
                case 54: goto L43;
                case 471: goto L55;
                case 500: goto L46;
                default: goto L3d;
            }     // Catch: java.lang.Throwable -> L14a
        L3d:
            goto L38
        L3e:
            if (r1 < 0) goto L43
            r0 = 1833(0x729, float:2.569E-42)
            goto L38
        L43:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L38
        L46:
            java.lang.String r0 = "jL2w6jLEilBy0"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)     // Catch: java.lang.Throwable -> L14a
            java.lang.Long r0 = java.lang.Long.decode(r0)     // Catch: java.lang.Throwable -> L14a
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> L14a
            r1.println(r0)     // Catch: java.lang.Throwable -> L14a
        L55:
            return
        L56:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L14a
            r4 = 1956(0x7a4, float:2.741E-42)
            int r5 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L14a
            r5 = r5 ^ (-50)
            r6 = 537(0x219, float:7.52E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L14a
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r0 = m7082(r2, r0, r4)     // Catch: java.lang.Throwable -> L14a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L14a
            int r4 = androidx.interpolator.C1081.m1580(r0)     // Catch: java.lang.Throwable -> L14a
            r0 = 1864(0x748, float:2.612E-42)
        L75:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L7b;
                case 47384: goto L55;
                case 47417: goto L85;
                case 47483: goto L81;
                default: goto L7a;
            }     // Catch: java.lang.Throwable -> L14a
        L7a:
            goto L75
        L7b:
            if (r3 < 0) goto L81
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L75
        L81:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L75
        L85:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L88:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto L90;
                case 45: goto La9;
                case 76: goto L9a;
                case 239: goto L94;
                default: goto L8f;
            }     // Catch: java.lang.Throwable -> L14a
        L8f:
            goto L88
        L90:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L88
        L94:
            if (r3 < r4) goto L90
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L88
        L9a:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L9d:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L55;
                case 503: goto La5;
                default: goto La4;
            }     // Catch: java.lang.Throwable -> L14a
        La4:
            goto L9d
        La5:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L9d
        La9:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L14a
            r4 = 1960(0x7a8, float:2.747E-42)
            int r5 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L14a
            r5 = r5 ^ 765(0x2fd, float:1.072E-42)
            r6 = 1776(0x6f0, float:2.489E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L14a
            java.lang.Integer r3 = androidx.activity.C1064.m334(r3)     // Catch: java.lang.Throwable -> L14a
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L14a
            int r5 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L14a
            r5 = r5 ^ (-363(0xfffffffffffffe95, float:NaN))
            r4[r5] = r3     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r2 = m7082(r2, r0, r4)     // Catch: java.lang.Throwable -> L14a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r3 = m7082(r2, r1, r0)     // Catch: java.lang.Throwable -> L14a
            r0 = 49666(0xc202, float:6.9597E-41)
        Ld4:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Ldc;
                case 50: goto Le2;
                case 76: goto L55;
                case 83: goto Le6;
                default: goto Ldb;
            }
        Ldb:
            goto Ld4
        Ldc:
            if (r3 != 0) goto Le2
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Ld4
        Le2:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Ld4
        Le6:
            r1 = 0
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L131
            r4 = 1963(0x7ab, float:2.751E-42)
            int r5 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L131
            r5 = r5 ^ (-71)
            r6 = 2232(0x8b8, float:3.128E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L131
            java.lang.Object r0 = m7100(r3, r0)     // Catch: java.lang.Throwable -> L131
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L131
            r1 = 49790(0xc27e, float:6.977E-41)
        L100:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 18: goto L108;
                case 241: goto L12d;
                default: goto L107;
            }
        L107:
            goto L100
        L108:
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L14a
            r3 = 1975(0x7b7, float:2.768E-42)
            int r4 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L14a
            r4 = r4 ^ 136(0x88, float:1.9E-43)
            r5 = 746(0x2ea, float:1.045E-42)
            java.lang.String r1 = androidx.interpolator.C1083.m1723(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L14a
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r1, r0)     // Catch: java.lang.Throwable -> L14a
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L11f:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 497: goto L127;
                case 1711: goto L134;
                case 1736: goto L55;
                case 1769: goto L138;
                default: goto L126;
            }     // Catch: java.lang.Throwable -> L14a
        L126:
            goto L11f
        L127:
            if (r1 == 0) goto L134
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L11f
        L12d:
            r1 = 49821(0xc29d, float:6.9814E-41)
            goto L100
        L131:
            r0 = move-exception
            r0 = r1
            goto L108
        L134:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L11f
        L138:
            m7041(r7, r2)     // Catch: java.lang.Throwable -> L14a
            r0 = 50689(0xc601, float:7.103E-41)
        L13e:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L146;
                case 50: goto L55;
                default: goto L145;
            }
        L145:
            goto L13e
        L146:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L13e
        L14a:
            r0 = move-exception
            goto L55
    }

    private void handleDownloadOption(android.content.Context r5) {
            r4 = this;
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r4)
            kevin.fun.hook.KSHook$MediaType r1 = m7111(r0)
            kevin.fun.hook.KSHook$MediaType r2 = m7064()
            r0 = 1616(0x650, float:2.264E-42)
        Le:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L14;
                case 49: goto L17;
                case 204: goto L1c;
                case 239: goto L70;
                default: goto L13;
            }
        L13:
            goto Le
        L14:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Le
        L17:
            if (r1 != r2) goto L14
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Le
        L1c:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r4)
            java.util.List r0 = m7093(r0)
            boolean r1 = androidx.activity.C1064.m359(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L2a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L30;
                case 54: goto L35;
                case 471: goto L4a;
                case 500: goto L38;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            if (r1 != 0) goto L35
            r0 = 1833(0x729, float:2.569E-42)
            goto L2a
        L35:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2a
        L38:
            m7029(r4)
            m7115(r4, r5)
            r0 = 1864(0x748, float:2.612E-42)
        L40:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L46;
                case 47483: goto L6b;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L40
        L4a:
            short[] r0 = m6972()
            r1 = 1979(0x7bb, float:2.773E-42)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-965(0xfffffffffffffc3b, float:NaN))
            r3 = 2056(0x808, float:2.881E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r0, r1, r2, r3)
            m7018(r4, r5, r0)
            m7029(r4)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L63:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L6b;
                case 239: goto L6c;
                default: goto L6a;
            }
        L6a:
            goto L63
        L6b:
            return
        L6c:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L63
        L70:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r4)
            java.util.List r0 = m7090(r0)
            boolean r1 = androidx.activity.C1064.m359(r0)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7f:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L87;
                case 53: goto La3;
                case 503: goto L8b;
                case 32495: goto L91;
                default: goto L86;
            }
        L86:
            goto L7f
        L87:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L7f
        L8b:
            if (r1 != 0) goto L87
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L7f
        L91:
            m6980(r4, r5)
            r0 = 49666(0xc202, float:6.9597E-41)
        L97:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L9f;
                case 50: goto L6b;
                default: goto L9e;
            }
        L9e:
            goto L97
        L9f:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L97
        La3:
            short[] r0 = m6972()
            r1 = 1986(0x7c2, float:2.783E-42)
            int r2 = androidx.activity.C1066.f92
            r2 = r2 ^ 818(0x332, float:1.146E-42)
            r3 = 1238(0x4d6, float:1.735E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            m7018(r4, r5, r0)
            m7029(r4)
            goto L6b
    }

    private void handleMainActivityCreate(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r10) {
            r8 = this;
            java.lang.Object r0 = m7042(r9)     // Catch: java.lang.Throwable -> L6b
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L6b
            long r2 = m7048(r8, r0)     // Catch: java.lang.Throwable -> L6b
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L6b
            r4 = 1993(0x7c9, float:2.793E-42)
            int r5 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L6b
            r5 = r5 ^ 159(0x9f, float:2.23E-43)
            r6 = 887(0x377, float:1.243E-42)
            java.lang.String r1 = androidx.annotation.experimental.C1067.m581(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L6b
            r4 = 543(0x21f, double:2.683E-321)
            int r6 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L6b
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L6b
            long r4 = r4 ^ r6
            long r4 = androidx.lifecycle.livedata.C1086.m1936(r1, r4)     // Catch: java.lang.Throwable -> L6b
            r1 = 1616(0x650, float:2.264E-42)
        L26:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L2c;
                case 49: goto L2f;
                case 204: goto L36;
                case 239: goto L53;
                default: goto L2b;
            }     // Catch: java.lang.Throwable -> L6b
        L2b:
            goto L26
        L2c:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L26
        L2f:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L2c
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L26
        L36:
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L6b
            r4 = 2012(0x7dc, float:2.82E-42)
            int r5 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L6b
            r5 = r5 ^ (-470(0xfffffffffffffe2a, float:NaN))
            r6 = 1526(0x5f6, float:2.138E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1084.m1796(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L6b
            m7099(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = m7071(r10)     // Catch: java.lang.Throwable -> L6b
            m7006(r8, r0, r1)     // Catch: java.lang.Throwable -> L6b
            m7052(r8, r10, r0, r2)     // Catch: java.lang.Throwable -> L6b
        L53:
            m7022(r8, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.ClassLoader r0 = m7036(r10)     // Catch: java.lang.Throwable -> L6b
            m6999(r8, r0)     // Catch: java.lang.Throwable -> L6b
            m7033(r8, r10)     // Catch: java.lang.Throwable -> L6b
            r0 = 1740(0x6cc, float:2.438E-42)
        L62:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L68;
                case 54: goto L94;
                default: goto L67;
            }
        L67:
            goto L62
        L68:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L62
        L6b:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 2029(0x7ed, float:2.843E-42)
            int r4 = kevin.fun.hook.C1120.f419
            r4 = r4 ^ (-496(0xfffffffffffffe10, float:NaN))
            r5 = 2439(0x987, float:3.418E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        L94:
            return
    }

    private void handleOptionClick(android.content.Context r6, java.lang.ref.WeakReference<android.app.Dialog> r7, int r8) {
            r5 = this;
            m7103(r5, r7)
            switch(r8) {
                case 0: goto L6f;
                case 1: goto L2f;
                case 2: goto L20;
                case 3: goto L12;
                default: goto L6;
            }
        L6:
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            return
        Lf:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L8
        L12:
            m7107(r5, r6)
            r0 = 1740(0x6cc, float:2.438E-42)
        L17:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1d;
                case 54: goto Le;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L17
        L20:
            m7000(r5, r6)
            r0 = 1864(0x748, float:2.612E-42)
        L25:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2b;
                case 47483: goto Le;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L25
        L2f:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r5)
            java.lang.String r0 = m7086(r0)
            short[] r1 = m6972()
            r2 = 2072(0x818, float:2.903E-42)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r3 = r3 ^ (-125(0xffffffffffffff83, float:NaN))
            r4 = 1341(0x53d, float:1.879E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r1, r2, r3, r4)
            m6997(r5, r6, r1, r0)
            short[] r0 = m6972()
            r1 = 2078(0x81e, float:2.912E-42)
            int r2 = androidx.emoji2.viewsintegration.C1079.f105
            r2 = r2 ^ (-104(0xffffffffffffff98, float:NaN))
            r3 = 333(0x14d, float:4.67E-43)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r1, r2, r3)
            m7018(r5, r6, r0)
            m7029(r5)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L63:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto Le;
                case 239: goto L6b;
                default: goto L6a;
            }
        L6a:
            goto L63
        L6b:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L63
        L6f:
            m7116(r5, r6)
            goto Le
    }

    private void handleParseError(java.lang.ref.WeakReference<android.content.Context> r5, java.lang.String r6) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۥ۟ۦ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746876: goto L24;
                case 1748773: goto L1d;
                case 1749605: goto L14;
                default: goto Lc;
            }
        Lc:
            android.os.Handler r1 = m7088()
            java.lang.String r3 = "ۣۢ۠"
            r2 = r1
            goto L5
        L14:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda0 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda0
            r0.<init>(r4, r5, r6)
            java.lang.String r1 = "ۡۤۨ"
            r3 = r1
            goto L5
        L1d:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "۟ۥۢ"
            r3 = r1
            goto L5
        L24:
            return
    }

    private void handleSharePanelDialog(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r8) {
            r6 = this;
            java.lang.Object[] r0 = m7108(r7)
            r1 = 0
            r0 = r0[r1]
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1 = 1616(0x650, float:2.264E-42)
        Lb:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L7b;
                default: goto L10;
            }
        L10:
            goto Lb
        L11:
            r1 = 1678(0x68e, float:2.351E-42)
            goto Lb
        L14:
            if (r0 == 0) goto L11
            r1 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            android.view.Window r2 = androidx.lifecycle.process.C1089.m2157(r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L39;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r2 != 0) goto L2a
            r1 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            r0 = 1864(0x748, float:2.612E-42)
        L2f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L35;
                case 47483: goto L7b;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2f
        L39:
            android.view.Window r1 = androidx.lifecycle.process.C1089.m2157(r0)
            android.view.View r1 = androidx.viewpager.C1108.m3492(r1)
            boolean r3 = r1 instanceof android.view.ViewGroup
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L46:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L4e;
                case 45: goto L58;
                case 76: goto L7a;
                case 239: goto L52;
                default: goto L4d;
            }
        L4d:
            goto L46
        L4e:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L46
        L52:
            if (r3 != 0) goto L4e
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L46
        L58:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.content.Context r3 = androidx.customview.C1074.m48(r1)
            boolean r4 = m6987(r6, r1)
            r2 = 48891(0xbefb, float:6.8511E-41)
        L65:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 22: goto L6d;
                case 53: goto L77;
                case 503: goto L71;
                case 32495: goto L7a;
                default: goto L6c;
            }
        L6c:
            goto L65
        L6d:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L65
        L71:
            if (r4 == 0) goto L6d
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L65
        L77:
            m6988(r6, r1, r3, r0, r8)
        L7a:
            return
        L7b:
            int r1 = androidx.activity.C1064.m377()
            r0 = 49666(0xc202, float:6.9597E-41)
        L82:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L8a;
                case 50: goto L90;
                case 76: goto L94;
                case 83: goto L7a;
                default: goto L89;
            }
        L89:
            goto L82
        L8a:
            if (r1 < 0) goto L90
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L82
        L90:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L82
        L94:
            java.lang.String r0 = "ZvH3X1pT"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L7a
    }

    private boolean hasM3u8Url(java.util.List<kevin.fun.hook.KSHook.VideoInfo> r7) {
            r6 = this;
            java.util.Iterator r1 = androidx.core.ktx.C1071.m904(r7)
        L4:
            boolean r2 = androidx.activity.C1063.m269(r1)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L1a;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r2 != 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            r0 = 0
        L19:
            return r0
        L1a:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r1)
            kevin.fun.hook.KSHook$VideoInfo r0 = (kevin.fun.hook.KSHook.VideoInfo) r0
            java.lang.String r0 = m7067(r0)
            short[] r2 = m6972()
            r3 = 2087(0x827, float:2.925E-42)
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ 22
            r5 = 390(0x186, float:5.47E-43)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r3, r4, r5)
            boolean r2 = androidx.emoji2.C1080.m1554(r0, r2)
            r0 = 1740(0x6cc, float:2.438E-42)
        L3a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L40;
                case 54: goto L45;
                case 471: goto L4;
                case 500: goto L48;
                default: goto L3f;
            }
        L3f:
            goto L3a
        L40:
            if (r2 == 0) goto L45
            r0 = 1833(0x729, float:2.569E-42)
            goto L3a
        L45:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3a
        L48:
            r0 = 1
            goto L19
    }

    private boolean hasShareBottomBar(android.view.ViewGroup r8) {
            r7 = this;
            r1 = 0
            r0 = r1
        L2:
            int r3 = androidx.loader.C1095.m2579(r8)
            r2 = 1616(0x650, float:2.264E-42)
        L8:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L6c;
                case 239: goto L16;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 < r3) goto Le
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            android.view.View r3 = androidx.loader.C1096.m2666(r8, r0)
            boolean r4 = r3 instanceof android.widget.LinearLayout
            r2 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L6d;
                case 500: goto L2c;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            if (r4 == 0) goto L29
            r2 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            java.lang.Object r3 = androidx.interpolator.C1081.m1599(r3)
            r2 = 1864(0x748, float:2.612E-42)
        L32:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L38;
                case 47384: goto L6d;
                case 47417: goto L42;
                case 47483: goto L3e;
                default: goto L37;
            }
        L37:
            goto L32
        L38:
            if (r3 == 0) goto L3e
            r2 = 48736(0xbe60, float:6.8294E-41)
            goto L32
        L3e:
            r2 = 48705(0xbe41, float:6.825E-41)
            goto L32
        L42:
            short[] r2 = m6972()
            r4 = 2092(0x82c, float:2.932E-42)
            int r5 = androidx.vectordrawable.C1105.f131
            r5 = r5 ^ 363(0x16b, float:5.09E-43)
            r6 = 828(0x33c, float:1.16E-42)
            java.lang.String r2 = kevin.fun.hook.C1120.m8645(r2, r4, r5, r6)
            boolean r3 = org.luckypray.dexkit.C1125.m10633(r2, r3)
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L59:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L61;
                case 45: goto L6d;
                case 76: goto L6b;
                case 239: goto L65;
                default: goto L60;
            }
        L60:
            goto L59
        L61:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L59
        L65:
            if (r3 == 0) goto L61
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L59
        L6b:
            r1 = 1
        L6c:
            return r1
        L6d:
            int r2 = androidx.lifecycle.process.C1087.f113
            r2 = r2 ^ (-623(0xfffffffffffffd91, float:NaN))
            int r0 = r0 + r2
            r2 = 48891(0xbefb, float:6.8511E-41)
        L75:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto L2;
                case 503: goto L7d;
                default: goto L7c;
            }
        L7c:
            goto L75
        L7d:
            r2 = 48922(0xbf1a, float:6.8554E-41)
            goto L75
    }

    private void hookMainActivity(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r8) {
            r7 = this;
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L49
            r1 = 2105(0x839, float:2.95E-42)
            int r2 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L49
            r2 = r2 ^ (-583(0xfffffffffffffdb9, float:NaN))
            r3 = 1205(0x4b5, float:1.689E-42)
            java.lang.String r0 = androidx.appcompat.resources.C1068.m652(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.ClassLoader r1 = m7036(r8)     // Catch: java.lang.Throwable -> L49
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L49
            r3 = 2136(0x858, float:2.993E-42)
            int r4 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ (-496(0xfffffffffffffe10, float:NaN))
            r5 = 878(0x36e, float:1.23E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L49
            kevin.fun.hook.KSHook$2 r3 = new kevin.fun.hook.KSHook$2     // Catch: java.lang.Throwable -> L49
            r3.<init>(r7, r8)     // Catch: java.lang.Throwable -> L49
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L49
            int r5 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L49
            r5 = r5 ^ (-624(0xfffffffffffffd90, float:NaN))
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r4[r5] = r6     // Catch: java.lang.Throwable -> L49
            int r5 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> L49
            r5 = r5 ^ 952(0x3b8, float:1.334E-42)
            r4[r5] = r3     // Catch: java.lang.Throwable -> L49
            m6996(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L49
            r0 = 1616(0x650, float:2.264E-42)
        L3f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L45;
                case 49: goto L46;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            return
        L46:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L3f
        L49:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 2144(0x860, float:3.004E-42)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r4 = r4 ^ (-954(0xfffffffffffffc46, float:NaN))
            r5 = 2989(0xbad, float:4.188E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L45
    }

    private void hookSharePanel(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r8) {
            r7 = this;
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L4e
            r1 = 2172(0x87c, float:3.044E-42)
            int r2 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L4e
            r2 = r2 ^ (-233(0xffffffffffffff17, float:NaN))
            r3 = 592(0x250, float:8.3E-43)
            java.lang.String r0 = androidx.loader.C1095.m2574(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            java.lang.String r0 = androidx.interpolator.C1081.m1642(r0, r1)     // Catch: java.lang.Throwable -> L4e
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L4e
            r2 = 2182(0x886, float:3.058E-42)
            int r3 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L4e
            r3 = r3 ^ 546(0x222, float:7.65E-43)
            r4 = 1658(0x67a, float:2.323E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2213(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.ClassLoader r2 = m7036(r8)     // Catch: java.lang.Throwable -> L4e
            kevin.fun.hook.KSHook$4 r3 = new kevin.fun.hook.KSHook$4     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r7, r8)     // Catch: java.lang.Throwable -> L4e
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4e
            int r5 = com.tencent.mmkv.C1109.f135     // Catch: java.lang.Throwable -> L4e
            r5 = r5 ^ (-488(0xfffffffffffffe18, float:NaN))
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            r4[r5] = r6     // Catch: java.lang.Throwable -> L4e
            int r5 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L4e
            r5 = r5 ^ 376(0x178, float:5.27E-43)
            r4[r5] = r3     // Catch: java.lang.Throwable -> L4e
            m6996(r1, r2, r0, r4)     // Catch: java.lang.Throwable -> L4e
            r0 = 1616(0x650, float:2.264E-42)
        L44:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L4a;
                case 49: goto L4b;
                default: goto L49;
            }
        L49:
            goto L44
        L4a:
            return
        L4b:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L44
        L4e:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2839(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 2251(0x8cb, float:3.154E-42)
            int r4 = kevin.fun.hook.audio.C1115.f404
            r4 = r4 ^ 770(0x302, float:1.079E-42)
            r5 = 891(0x37b, float:1.249E-42)
            java.lang.String r2 = com.tencent.mmkv.C1109.m3629(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L4a
    }

    private void hookSplashAd(java.lang.ClassLoader r7) {
            r6 = this;
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L8c
            r1 = 2283(0x8eb, float:3.199E-42)
            int r2 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L8c
            r2 = r2 ^ 308(0x134, float:4.32E-43)
            r3 = 2754(0xac2, float:3.859E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L8c
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L8c
            r2 = 2325(0x915, float:3.258E-42)
            int r3 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L8c
            r3 = r3 ^ 631(0x277, float:8.84E-43)
            r4 = 3241(0xca9, float:4.542E-42)
            java.lang.String r1 = androidx.loader.C1095.m2574(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L8c
            kevin.fun.hook.KSHook$5 r2 = new kevin.fun.hook.KSHook$5     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8c
            int r4 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L8c
            r4 = r4 ^ 268(0x10c, float:3.76E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L8c
            m6996(r0, r7, r1, r3)     // Catch: java.lang.Throwable -> L8c
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L8c
            r1 = 2341(0x925, float:3.28E-42)
            int r2 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L8c
            r2 = r2 ^ (-244(0xffffffffffffff0c, float:NaN))
            r3 = 389(0x185, float:5.45E-43)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Class r0 = m7102(r0, r7)     // Catch: java.lang.Throwable -> L8c
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L8c
            r2 = 2372(0x944, float:3.324E-42)
            int r3 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L8c
            r3 = r3 ^ (-97)
            r4 = 2065(0x811, float:2.894E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2213(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.Class r1 = m7102(r1, r7)     // Catch: java.lang.Throwable -> L8c
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L8c
            r3 = 2377(0x949, float:3.331E-42)
            int r4 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L8c
            r4 = r4 ^ (-254(0xffffffffffffff02, float:NaN))
            r5 = 1689(0x699, float:2.367E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1086.m1920(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8c
            kevin.fun.hook.KSHook$6 r3 = new kevin.fun.hook.KSHook$6     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L8c
            int r5 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> L8c
            r5 = r5 ^ 799(0x31f, float:1.12E-42)
            r4[r5] = r1     // Catch: java.lang.Throwable -> L8c
            int r1 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L8c
            r1 = r1 ^ 899(0x383, float:1.26E-42)
            r4[r1] = r3     // Catch: java.lang.Throwable -> L8c
            m6973(r0, r2, r4)     // Catch: java.lang.Throwable -> L8c
            r0 = 1616(0x650, float:2.264E-42)
        L82:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L88;
                case 49: goto L89;
                default: goto L87;
            }
        L87:
            goto L82
        L88:
            return
        L89:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L82
        L8c:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 2394(0x95a, float:3.355E-42)
            int r4 = androidx.annotation.experimental.C1067.f93
            r4 = r4 ^ (-48)
            r5 = 1857(0x741, float:2.602E-42)
            java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L88
    }

    private void initHookEnvironment(java.lang.ClassLoader r4) {
            r3 = this;
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r3)
            m7084(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r3)
            r1 = 0
            androidx.vectordrawable.C1105.m3278(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = m7044(r3)
            java.lang.String r1 = androidx.emoji2.C1080.m1562()
            androidx.vectordrawable.C1104.m3224(r0, r1)
            int r1 = androidx.interpolator.C1083.m1725()
            r0 = 1616(0x650, float:2.264E-42)
        L20:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L26;
                case 49: goto L29;
                case 204: goto L2e;
                case 239: goto L3d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L20
        L29:
            if (r1 < 0) goto L26
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L20
        L2e:
            java.lang.String r0 = "EmVIjqynF1QLF5LhWC95RaXXF26i"
            java.lang.String r0 = com.tencent.mmkv.C1109.m3585(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3d:
            return
    }

    private boolean isActivityFinishing(android.content.Context r3) {
            r2 = this;
            boolean r1 = r3 instanceof android.app.Activity
            r0 = 1616(0x650, float:2.264E-42)
        L4:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto La;
                case 49: goto Ld;
                case 204: goto L12;
                case 239: goto L2a;
                default: goto L9;
            }
        L9:
            goto L4
        La:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L4
        Ld:
            if (r1 == 0) goto La
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L4
        L12:
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r1 = androidx.loader.C1098.m2818(r3)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L2a;
                case 500: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r1 == 0) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            r0 = 1
        L29:
            return r0
        L2a:
            r0 = 0
            goto L29
    }

    static /* synthetic */ void lambda$0(long r8, android.content.Context r10, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L9f
            r2 = 2420(0x974, float:3.391E-42)
            int r3 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L9f
            r3 = r3 ^ (-990(0xfffffffffffffc22, float:NaN))
            r4 = 2241(0x8c1, float:3.14E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2213(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = androidx.loader.C1097.m2720(r0, r8)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L9f
            m7099(r0)     // Catch: java.lang.Throwable -> L9f
            android.content.pm.ApplicationInfo r0 = androidx.customview.C1075.m1172(r10)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3669(r0)     // Catch: java.lang.Throwable -> L9f
            org.luckypray.dexkit.DexKitBridge r2 = m7063(r0)     // Catch: java.lang.Throwable -> L9f
            r0 = 1616(0x650, float:2.264E-42)
        L32:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L38;
                case 49: goto L3b;
                case 204: goto L40;
                case 239: goto Ld5;
                default: goto L37;
            }
        L37:
            goto L32
        L38:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L32
        L3b:
            if (r2 == 0) goto L38
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L32
        L40:
            java.lang.ClassLoader r0 = m7036(r11)     // Catch: java.lang.Throwable -> L85
            m6982(r2, r0, r10)     // Catch: java.lang.Throwable -> L85
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L85
            r1 = 2447(0x98f, float:3.429E-42)
            int r3 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L85
            r3 = r3 ^ 840(0x348, float:1.177E-42)
            r4 = 1045(0x415, float:1.464E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2127(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L85
            androidx.loader.C1097.m2736(r0, r8)     // Catch: java.lang.Throwable -> L85
            android.os.Handler r0 = m7088()     // Catch: java.lang.Throwable -> L85
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda32 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda32     // Catch: java.lang.Throwable -> L85
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L85
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Throwable -> L85
            r0 = 1740(0x6cc, float:2.438E-42)
        L68:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L6e;
                case 54: goto L73;
                case 471: goto Ld4;
                case 500: goto L76;
                default: goto L6d;
            }
        L6d:
            goto L68
        L6e:
            if (r2 == 0) goto L73
            r0 = 1833(0x729, float:2.569E-42)
            goto L68
        L73:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L68
        L76:
            m7054(r2)     // Catch: java.lang.Throwable -> L9f
            r0 = 1864(0x748, float:2.612E-42)
        L7b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L81;
                case 47483: goto Ld4;
                default: goto L80;
            }     // Catch: java.lang.Throwable -> L9f
        L80:
            goto L7b
        L81:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L7b
        L85:
            r0 = move-exception
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L89:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L91;
                case 45: goto L9e;
                case 76: goto L9b;
                case 239: goto L95;
                default: goto L90;
            }     // Catch: java.lang.Throwable -> L9f
        L90:
            goto L89
        L91:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L89
        L95:
            if (r2 == 0) goto L91
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L89
        L9b:
            m7054(r2)     // Catch: java.lang.Throwable -> L9f
        L9e:
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r4 = 2483(0x9b3, float:3.48E-42)
            int r5 = androidx.viewpager.C1108.f134
            r5 = r5 ^ (-497(0xfffffffffffffe0f, float:NaN))
            r6 = 2432(0x980, float:3.408E-42)
            java.lang.String r3 = androidx.core.ktx.C1071.m874(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7099(r1)
            android.os.Handler r1 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda34 r2 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda34
            r2.<init>(r10, r0)
            androidx.activity.C1062.m178(r1, r2)
        Ld4:
            return
        Ld5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9f
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L9f
            r2 = 2466(0x9a2, float:3.456E-42)
            int r3 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L9f
            r3 = r3 ^ 804(0x324, float:1.127E-42)
            r4 = 616(0x268, float:8.63E-43)
            java.lang.String r1 = kevin.fun.hook.webdav.C1118.m8509(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
    }

    static /* synthetic */ void lambda$1(android.content.Context r4) {
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L24
            r1 = 2506(0x9ca, float:3.512E-42)
            int r2 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L24
            r2 = r2 ^ (-482(0xfffffffffffffe1e, float:NaN))
            r3 = 1245(0x4dd, float:1.745E-42)
            java.lang.String r0 = androidx.core.ktx.C1071.m874(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L24
            r1 = 1
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r4, r0, r1)     // Catch: java.lang.Throwable -> L24
            androidx.viewpager.C1108.m3524(r0)     // Catch: java.lang.Throwable -> L24
            r0 = 1616(0x650, float:2.264E-42)
        L1a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L20;
                case 49: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            return
        L21:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L1a
        L24:
            r0 = move-exception
            goto L20
    }

    static /* synthetic */ int lambda$16(kevin.fun.hook.KSHook.VideoInfo r5, kevin.fun.hook.KSHook.VideoInfo r6) {
            r2 = 0
            java.lang.String r0 = "ۥۣۢ"
            r1 = r2
            r3 = r2
            r4 = r2
        L6:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1752550: goto L16;
                case 1754566: goto L1d;
                case 1754624: goto Le;
                default: goto Ld;
            }
        Ld:
            return r3
        Le:
            int r2 = org.luckypray.dexkit.C1123.m10512(r1, r4)
            java.lang.String r0 = "ۥ۟ۢ"
            r3 = r2
            goto L6
        L16:
            int r1 = m6983(r6)
            java.lang.String r0 = "ۧۥۤ"
            goto L6
        L1d:
            int r2 = m6983(r5)
            java.lang.String r0 = "ۧۧ۠"
            r4 = r2
            goto L6
    }

    static /* synthetic */ void lambda$18(android.view.View r0) {
            return
    }

    static /* synthetic */ void lambda$2(android.content.Context r6, java.lang.Throwable r7) {
            java.lang.String r0 = androidx.loader.C1099.m2895(r7)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L39
            r3 = 2516(0x9d4, float:3.526E-42)
            int r4 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L39
            r4 = r4 ^ (-966(0xfffffffffffffc3a, float:NaN))
            r5 = 1275(0x4fb, float:1.787E-42)
            java.lang.String r2 = com.tencent.mmkv.C1109.m3629(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L39
            r1 = 1
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r6, r0, r1)     // Catch: java.lang.Throwable -> L39
            androidx.viewpager.C1108.m3524(r0)     // Catch: java.lang.Throwable -> L39
            r0 = 1616(0x650, float:2.264E-42)
        L2f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L35;
                case 49: goto L36;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            return
        L36:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L2f
        L39:
            r0 = move-exception
            goto L35
    }

    static /* synthetic */ void lambda$20(java.lang.Runnable r1, android.view.View r2) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L13;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r1 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r1)
        L13:
            return
    }

    static /* synthetic */ int lambda$21(kevin.fun.hook.KSHook.VideoInfo r5, kevin.fun.hook.KSHook.VideoInfo r6) {
            r2 = 0
            java.lang.String r0 = "ۢۢۤ"
            r1 = r2
            r3 = r2
            r4 = r2
        L6:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 56572: goto L24;
                case 1749668: goto L1c;
                case 1755622: goto L15;
                default: goto Ld;
            }
        Ld:
            int r2 = org.luckypray.dexkit.C1123.m10512(r3, r1)
            java.lang.String r0 = "ۨۤ"
            r4 = r2
            goto L6
        L15:
            int r1 = m6983(r5)
            java.lang.String r0 = "ۥۥ"
            goto L6
        L1c:
            int r2 = m6983(r6)
            java.lang.String r0 = "ۨۨۦ"
            r3 = r2
            goto L6
        L24:
            return r4
    }

    static /* synthetic */ void lambda$23(android.view.View r0) {
            return
    }

    static /* synthetic */ void lambda$38(kevin.fun.hook.KSHook.AtlasDownloadHolder r9, int r10, int r11, long r12) {
            r6 = 0
            r8 = 1
            android.app.Dialog r1 = m7058(r9)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L104;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            android.app.Dialog r0 = m7058(r9)
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3b;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 != 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            r0 = 1864(0x748, float:2.612E-42)
        L31:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L37;
                case 47483: goto L104;
                default: goto L36;
            }
        L36:
            goto L31
        L37:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L31
        L3b:
            android.widget.ProgressBar r0 = m7035(r9)
            androidx.loader.C1094.m2504(r0, r10)
            android.widget.TextView r0 = m6976(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r1, r10)
            short[] r2 = m6972()
            r3 = 2522(0x9da, float:3.534E-42)
            r4 = 465(0x1d1, float:6.52E-43)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r8, r4)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r1, r11)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
            long r0 = androidx.lifecycle.process.C1089.m2100()
            long r2 = r0 - r12
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L73:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L7b;
                case 45: goto L104;
                case 76: goto L87;
                case 239: goto L7f;
                default: goto L7a;
            }
        L7a:
            goto L73
        L7b:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L73
        L7f:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L7b
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L73
        L87:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L8a:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L92;
                case 53: goto L104;
                case 503: goto L96;
                case 32495: goto L9c;
                default: goto L91;
            }
        L91:
            goto L8a
        L92:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L8a
        L96:
            if (r10 <= 0) goto L92
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L8a
        L9c:
            double r0 = (double) r2
            double r2 = (double) r10
            double r0 = r0 / r2
            int r2 = r11 - r10
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            long r2 = (long) r0
            r0 = 49666(0xc202, float:6.9597E-41)
        Lad:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Lb5;
                case 50: goto Lbd;
                case 76: goto Lc1;
                case 83: goto L109;
                default: goto Lb4;
            }
        Lb4:
            goto Lad
        Lb5:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lbd
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lad
        Lbd:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lad
        Lc1:
            android.widget.TextView r0 = m7113(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r4 = m6972()
            r5 = 2523(0x9db, float:3.535E-42)
            int r6 = androidx.lifecycle.process.C1091.f117
            r6 = r6 ^ (-489(0xfffffffffffffe17, float:NaN))
            r7 = 2245(0x8c5, float:3.146E-42)
            java.lang.String r4 = androidx.emoji2.viewsintegration.C1079.m1457(r4, r5, r6, r7)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)
            java.lang.StringBuilder r1 = androidx.loader.C1097.m2720(r1, r2)
            short[] r2 = m6972()
            r3 = 2526(0x9de, float:3.54E-42)
            r4 = 1772(0x6ec, float:2.483E-42)
            java.lang.String r2 = androidx.viewpager.C1108.m3518(r2, r3, r8, r4)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
            r0 = 49790(0xc27e, float:6.977E-41)
        Lfc:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L104;
                case 241: goto L105;
                default: goto L103;
            }
        L103:
            goto Lfc
        L104:
            return
        L105:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Lfc
        L109:
            android.widget.TextView r0 = m7113(r9)
            short[] r1 = m6972()
            r2 = 2527(0x9df, float:3.541E-42)
            int r3 = androidx.startup.C1100.f126
            r3 = r3 ^ (-274(0xfffffffffffffeee, float:NaN))
            r4 = 1786(0x6fa, float:2.503E-42)
            java.lang.String r1 = androidx.activity.C1063.m241(r1, r2, r3, r4)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
            goto L104
    }

    static /* synthetic */ void lambda$39(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r2, r3, r0)     // Catch: java.lang.Exception -> L37
            androidx.viewpager.C1108.m3524(r0)     // Catch: java.lang.Exception -> L37
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L21;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L24;
                case 471: goto L36;
                case 500: goto L27;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 < 0) goto L24
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1647(0x66f, float:2.308E-42)
            goto La
        L24:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L27:
            java.lang.String r0 = "y6LB2vnSRxgUhY9YUdHpAaGJ"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
        L37:
            r0 = move-exception
            goto L10
    }

    static /* synthetic */ void lambda$9(android.view.View r0) {
            return
    }

    private void loadDexKitSo(android.content.Context r11, java.lang.String r12) {
            r10 = this;
            short[] r0 = m6972()
            r1 = 2531(0x9e3, float:3.547E-42)
            int r2 = androidx.viewpager.C1108.f134
            r2 = r2 ^ (-492(0xfffffffffffffe14, float:NaN))
            r3 = 2533(0x9e5, float:3.55E-42)
            java.lang.String r2 = androidx.appcompat.C1069.m751(r0, r1, r2, r3)
            java.lang.String r3 = androidx.lifecycle.livedata.C1085.m1829()     // Catch: java.lang.Throwable -> Lee
            r0 = 1616(0x650, float:2.264E-42)
        L16:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1c;
                case 49: goto L1f;
                case 204: goto L24;
                case 239: goto L5b;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> Lee
        L1b:
            goto L16
        L1c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L16
        L1f:
            if (r3 != 0) goto L1c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L16
        L24:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Lee
            r1 = 2543(0x9ef, float:3.564E-42)
            int r2 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Throwable -> Lee
            r2 = r2 ^ (-118(0xffffffffffffff8a, float:NaN))
            r3 = 981(0x3d5, float:1.375E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lee
            m7099(r0)     // Catch: java.lang.Throwable -> Lee
            int r1 = androidx.customview.C1074.m1071()     // Catch: java.lang.Throwable -> Lee
            r0 = 1740(0x6cc, float:2.438E-42)
        L3d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L43;
                case 54: goto L48;
                case 471: goto L5a;
                case 500: goto L4b;
                default: goto L42;
            }     // Catch: java.lang.Throwable -> Lee
        L42:
            goto L3d
        L43:
            if (r1 < 0) goto L48
            r0 = 1833(0x729, float:2.569E-42)
            goto L3d
        L48:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3d
        L4b:
            java.lang.String r0 = "7j9qaji"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> Lee
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> Lee
            r1.println(r0)     // Catch: java.lang.Throwable -> Lee
        L5a:
            return
        L5b:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lee
            r0.<init>()     // Catch: java.lang.Throwable -> Lee
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> Lee
            r5 = 2566(0xa06, float:3.596E-42)
            int r6 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> Lee
            r6 = r6 ^ 135(0x87, float:1.89E-43)
            r7 = 1587(0x633, float:2.224E-42)
            java.lang.String r4 = androidx.core.ktx.C1071.m874(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r4)     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r12)     // Catch: java.lang.Throwable -> Lee
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> Lee
            r5 = 2577(0xa11, float:3.611E-42)
            int r6 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> Lee
            r6 = r6 ^ 129(0x81, float:1.81E-43)
            r7 = 2610(0xa32, float:3.657E-42)
            java.lang.String r4 = androidx.core.ktx.C1070.m788(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r4)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> Lee
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lee
            boolean r4 = androidx.vectordrawable.C1105.m3294(r1)     // Catch: java.lang.Throwable -> Lee
            r0 = 1864(0x748, float:2.612E-42)
        L9b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto La1;
                case 47384: goto L119;
                case 47417: goto Lab;
                case 47483: goto La7;
                default: goto La0;
            }     // Catch: java.lang.Throwable -> Lee
        La0:
            goto L9b
        La1:
            if (r4 != 0) goto La7
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L9b
        La7:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L9b
        Lab:
            boolean r4 = androidx.lifecycle.process.C1090.m2220(r1)     // Catch: java.lang.Throwable -> Lee
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lb2:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto Lba;
                case 45: goto L119;
                case 76: goto Lc4;
                case 239: goto Lbe;
                default: goto Lb9;
            }     // Catch: java.lang.Throwable -> Lee
        Lb9:
            goto Lb2
        Lba:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lb2
        Lbe:
            if (r4 != 0) goto Lba
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lb2
        Lc4:
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lee
            r1.<init>()     // Catch: java.lang.Throwable -> Lee
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> Lee
            r3 = 2590(0xa1e, float:3.63E-42)
            int r4 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> Lee
            r4 = r4 ^ 429(0x1ad, float:6.01E-43)
            r5 = 996(0x3e4, float:1.396E-42)
            java.lang.String r2 = androidx.appcompat.C1069.m751(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> Lee
            m7099(r0)     // Catch: java.lang.Throwable -> Lee
            goto L5a
        Lee:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 2608(0xa30, float:3.655E-42)
            int r4 = androidx.activity.C1064.f90
            r4 = r4 ^ 497(0x1f1, float:6.96E-43)
            r5 = 2156(0x86c, float:3.021E-42)
            java.lang.String r2 = androidx.loader.C1095.m2574(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L5a
        L119:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lee
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lee
            r0 = 1
            boolean r5 = androidx.vectordrawable.C1105.m3294(r4)     // Catch: java.lang.Throwable -> Lee
            r1 = 48891(0xbefb, float:6.8511E-41)
        L126:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 22: goto L12e;
                case 53: goto L156;
                case 503: goto L132;
                case 32495: goto L138;
                default: goto L12d;
            }     // Catch: java.lang.Throwable -> Lee
        L12d:
            goto L126
        L12e:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L126
        L132:
            if (r5 == 0) goto L12e
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L126
        L138:
            long r6 = androidx.interpolator.C1081.m1571(r4)     // Catch: java.lang.Throwable -> Lee
            r1 = 49666(0xc202, float:6.9597E-41)
        L13f:
            r5 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 17: goto L147;
                case 50: goto L151;
                case 76: goto L155;
                case 83: goto L156;
                default: goto L146;
            }     // Catch: java.lang.Throwable -> Lee
        L146:
            goto L13f
        L147:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L151
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L13f
        L151:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L13f
        L155:
            r0 = 0
        L156:
            r1 = 49790(0xc27e, float:6.977E-41)
        L159:
            r5 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 18: goto L161;
                case 51: goto L16e;
                case 84: goto L16b;
                case 241: goto L165;
                default: goto L160;
            }     // Catch: java.lang.Throwable -> Lee
        L160:
            goto L159
        L161:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto L159
        L165:
            if (r0 == 0) goto L161
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto L159
        L16b:
            m7081(r10, r3, r2, r4)     // Catch: java.lang.Throwable -> Lee
        L16e:
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r4)     // Catch: java.lang.Throwable -> Lee
            androidx.customview.C1074.m1099(r0)     // Catch: java.lang.Throwable -> Lee
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L178:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L180;
                case 1711: goto L5a;
                default: goto L17f;
            }
        L17f:
            goto L178
        L180:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L178
    }

    private void modifySharePanel(android.view.ViewGroup r7, android.content.Context r8, android.app.Dialog r9, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r10) {
            r6 = this;
            r5 = 0
            int r1 = androidx.loader.C1095.m2579(r7)
            r0 = 1616(0x650, float:2.264E-42)
        L7:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L15;
                case 239: goto L39;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r1 != 0) goto Ld
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L21;
                case 54: goto L26;
                case 471: goto L38;
                case 500: goto L29;
                default: goto L20;
            }
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
            java.lang.String r0 = "uG4JK1qDRt6"
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8480(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L38:
            return
        L39:
            android.view.View r0 = androidx.loader.C1096.m2666(r7, r5)
            androidx.loader.C1099.m2885(r7)
            android.widget.LinearLayout r1 = m7055(r6, r8)
            int r2 = androidx.appcompat.C1069.f95
            r2 = r2 ^ 236(0xec, float:3.31E-43)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r2, r5, r4)
            org.luckypray.dexkit.C1124.m10544(r1, r0, r3)
            android.widget.LinearLayout r0 = m6971(r6, r8, r9, r10)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r4 = androidx.annotation.experimental.C1067.f93
            r4 = r4 ^ 52
            r3.<init>(r2, r4)
            org.luckypray.dexkit.C1124.m10544(r1, r0, r3)
            androidx.lifecycle.process.C1091.m2269(r7, r1)
            goto L38
    }

    private kevin.fun.hook.KSHook.ParseResult parseHtmlInOnePass(java.lang.String r9) {
            r8 = this;
            r1 = 0
            short[] r0 = m6972()
            r2 = 2635(0xa4b, float:3.692E-42)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r3 = r3 ^ (-936(0xfffffffffffffc58, float:NaN))
            r4 = 1944(0x798, float:2.724E-42)
            java.lang.String r3 = kevin.fun.hook.audio.C1114.m7940(r0, r2, r3, r4)
            kevin.fun.hook.KSHook$ParseResult r0 = new kevin.fun.hook.KSHook$ParseResult     // Catch: java.lang.Throwable -> L1f9
            r2 = 0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1f9
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2637(0xa4d, float:3.695E-42)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 663(0x297, float:9.29E-43)
            r6 = 784(0x310, float:1.099E-42)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.userName = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7027(r0)     // Catch: java.lang.Throwable -> L1f9
            boolean r4 = androidx.activity.C1066.m488(r2)     // Catch: java.lang.Throwable -> L1f9
            r2 = 1616(0x650, float:2.264E-42)
        L37:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L3d;
                case 49: goto L40;
                case 204: goto L45;
                case 239: goto L65;
                default: goto L3c;
            }     // Catch: java.lang.Throwable -> L1f9
        L3c:
            goto L37
        L3d:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L37
        L40:
            if (r4 == 0) goto L3d
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L37
        L45:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2663(0xa67, float:3.732E-42)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 657(0x291, float:9.2E-43)
            r6 = 3186(0xc72, float:4.465E-42)
            java.lang.String r2 = androidx.vectordrawable.animated.C1102.m3116(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.userName = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7027(r0)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7019(r8, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.userName = r2     // Catch: java.lang.Throwable -> L1f9
        L65:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2691(0xa83, float:3.771E-42)
            int r5 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 306(0x132, float:4.29E-43)
            r6 = 2142(0x85e, float:3.002E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1088.m2044(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.kwaiID = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m6975(r0)     // Catch: java.lang.Throwable -> L1f9
            boolean r4 = androidx.activity.C1066.m488(r2)     // Catch: java.lang.Throwable -> L1f9
            r2 = 1740(0x6cc, float:2.438E-42)
        L85:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L8b;
                case 54: goto L90;
                case 471: goto La9;
                case 500: goto L93;
                default: goto L8a;
            }     // Catch: java.lang.Throwable -> L1f9
        L8a:
            goto L85
        L8b:
            if (r4 == 0) goto L90
            r2 = 1833(0x729, float:2.569E-42)
            goto L85
        L90:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L85
        L93:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2711(0xa97, float:3.799E-42)
            int r5 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 378(0x17a, float:5.3E-43)
            r6 = 1862(0x746, float:2.609E-42)
            java.lang.String r2 = kevin.fun.hook.C1120.m8645(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.kwaiID = r2     // Catch: java.lang.Throwable -> L1f9
        La9:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2739(0xab3, float:3.838E-42)
            int r5 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 812(0x32c, float:1.138E-42)
            r6 = 1379(0x563, float:1.932E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1123.m10510(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.videoCaption = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7086(r0)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7019(r8, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.videoCaption = r2     // Catch: java.lang.Throwable -> L1f9
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2764(0xacc, float:3.873E-42)
            int r5 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ (-288(0xfffffffffffffee0, float:NaN))
            r6 = 1083(0x43b, float:1.518E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1087.m2008(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            long r4 = androidx.loader.C1095.m2603(r2)     // Catch: java.lang.NumberFormatException -> Lef java.lang.Throwable -> L1f9
            r0.viewCount = r4     // Catch: java.lang.NumberFormatException -> Lef java.lang.Throwable -> L1f9
            r2 = 1864(0x748, float:2.612E-42)
        Le5:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto Leb;
                case 47483: goto Lf0;
                default: goto Lea;
            }
        Lea:
            goto Le5
        Leb:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto Le5
        Lef:
            r2 = move-exception
        Lf0:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2787(0xae3, float:3.905E-42)
            int r5 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 794(0x31a, float:1.113E-42)
            r6 = 2288(0x8f0, float:3.206E-42)
            java.lang.String r2 = kevin.fun.hook.webdav.C1118.m8509(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7025(r8, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.publishTime = r2     // Catch: java.lang.Throwable -> L1f9
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2810(0xafa, float:3.938E-42)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ 662(0x296, float:9.28E-43)
            r6 = 342(0x156, float:4.79E-43)
            java.lang.String r2 = androidx.lifecycle.process.C1091.m2229(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r4 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r5 = 2837(0xb15, float:3.975E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L1f9
            r6 = r6 ^ (-929(0xfffffffffffffc5f, float:NaN))
            r7 = 3230(0xc9e, float:4.526E-42)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f9
            boolean r5 = org.luckypray.dexkit.C1125.m10633(r2, r4)     // Catch: java.lang.Throwable -> L1f9
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L135:
            r6 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 14: goto L13d;
                case 45: goto L19f;
                case 76: goto L147;
                case 239: goto L141;
                default: goto L13c;
            }     // Catch: java.lang.Throwable -> L1f9
        L13c:
            goto L135
        L13d:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L135
        L141:
            if (r5 == 0) goto L13d
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L135
        L147:
            kevin.fun.hook.KSHook$MediaType r2 = m7064()     // Catch: java.lang.Throwable -> L1f9
            r0.currentMediaType = r2     // Catch: java.lang.Throwable -> L1f9
        L14d:
            r2 = 48891(0xbefb, float:6.8511E-41)
        L150:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 22: goto L158;
                case 503: goto L19b;
                default: goto L157;
            }     // Catch: java.lang.Throwable -> L1f9
        L157:
            goto L150
        L158:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2872(0xb38, float:4.025E-42)
            int r5 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L1f9
            r5 = r5 ^ (-1012(0xfffffffffffffc0c, float:NaN))
            r6 = 1303(0x517, float:1.826E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7019(r8, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.backgroundMusicUrl = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m6970(r0)     // Catch: java.lang.Throwable -> L1f9
            boolean r4 = androidx.core.C1073.m1059(r2, r3)     // Catch: java.lang.Throwable -> L1f9
            short[] r2 = m6972()
            r5 = 2925(0xb6d, float:4.099E-42)
            int r6 = androidx.lifecycle.process.C1088.f114
            r6 = r6 ^ (-101(0xffffffffffffff9b, float:NaN))
            r7 = 1624(0x658, float:2.276E-42)
            java.lang.String r5 = androidx.customview.C1075.m1138(r2, r5, r6, r7)
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L18d:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 497: goto L195;
                case 1711: goto L224;
                case 1736: goto L240;
                case 1769: goto L229;
                default: goto L194;
            }
        L194:
            goto L18d
        L195:
            if (r4 == 0) goto L224
            r2 = 50658(0xc5e2, float:7.0987E-41)
            goto L18d
        L19b:
            r2 = 48922(0xbf1a, float:6.8554E-41)
            goto L150
        L19f:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r5 = 2842(0xb1a, float:3.982E-42)
            int r6 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L1f9
            r6 = r6 ^ (-37)
            r7 = 669(0x29d, float:9.37E-43)
            java.lang.String r2 = androidx.customview.C1075.m1138(r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f9
            boolean r5 = org.luckypray.dexkit.C1125.m10633(r2, r4)     // Catch: java.lang.Throwable -> L1f9
            r2 = 49666(0xc202, float:6.9597E-41)
        L1b6:
            r6 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L1be;
                case 50: goto L1c4;
                case 76: goto L1c8;
                case 83: goto L1f1;
                default: goto L1bd;
            }     // Catch: java.lang.Throwable -> L1f9
        L1bd:
            goto L1b6
        L1be:
            if (r5 != 0) goto L1c4
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto L1b6
        L1c4:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto L1b6
        L1c8:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r5 = 2858(0xb2a, float:4.005E-42)
            int r6 = com.tencent.mmkv.C1109.f135     // Catch: java.lang.Throwable -> L1f9
            r6 = r6 ^ (-490(0xfffffffffffffe16, float:NaN))
            r7 = 609(0x261, float:8.53E-43)
            java.lang.String r2 = org.luckypray.dexkit.C1124.m10545(r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f9
            boolean r4 = org.luckypray.dexkit.C1125.m10633(r2, r4)     // Catch: java.lang.Throwable -> L1f9
            r2 = 49790(0xc27e, float:6.977E-41)
        L1df:
            r5 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 18: goto L1e7;
                case 51: goto L14d;
                case 84: goto L1f1;
                case 241: goto L1eb;
                default: goto L1e6;
            }     // Catch: java.lang.Throwable -> L1f9
        L1e6:
            goto L1df
        L1e7:
            r2 = 49852(0xc2bc, float:6.9858E-41)
            goto L1df
        L1eb:
            if (r4 == 0) goto L1e7
            r2 = 49883(0xc2db, float:6.9901E-41)
            goto L1df
        L1f1:
            kevin.fun.hook.KSHook$MediaType r2 = m7039()     // Catch: java.lang.Throwable -> L1f9
            r0.currentMediaType = r2     // Catch: java.lang.Throwable -> L1f9
            goto L158
        L1f9:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r4 = 2985(0xba9, float:4.183E-42)
            int r5 = androidx.lifecycle.process.C1090.f116
            r5 = r5 ^ (-440(0xfffffffffffffe48, float:NaN))
            r6 = 482(0x1e2, float:6.75E-43)
            java.lang.String r3 = kevin.fun.hook.webdav.C1118.m8509(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            r0 = r1
        L223:
            return r0
        L224:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto L18d
        L229:
            java.lang.String r2 = m6970(r0)     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f9
            r4.<init>()     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r4, r2)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L1f9
            r0.backgroundMusicUrl = r2     // Catch: java.lang.Throwable -> L1f9
        L240:
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1f9
            r4 = 2931(0xb73, float:4.107E-42)
            int r6 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L1f9
            r6 = r6 ^ (-602(0xfffffffffffffda6, float:NaN))
            r7 = 1106(0x452, float:1.55E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7089(r8, r9, r2)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7019(r8, r2)     // Catch: java.lang.Throwable -> L1f9
            r0.backupVideoUrl = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7002(r0)     // Catch: java.lang.Throwable -> L1f9
            boolean r4 = androidx.core.C1073.m1059(r2, r3)     // Catch: java.lang.Throwable -> L1f9
            r2 = 50689(0xc601, float:7.103E-41)
        L265:
            r6 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto L26d;
                case 45: goto L28e;
                case 50: goto L273;
                case 76: goto L277;
                default: goto L26c;
            }     // Catch: java.lang.Throwable -> L1f9
        L26c:
            goto L265
        L26d:
            if (r4 == 0) goto L273
            r2 = 50782(0xc65e, float:7.1161E-41)
            goto L265
        L273:
            r2 = 50751(0xc63f, float:7.1117E-41)
            goto L265
        L277:
            java.lang.String r2 = m7002(r0)     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f9
            r4.<init>()     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r4, r2)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L1f9
            r0.backupVideoUrl = r2     // Catch: java.lang.Throwable -> L1f9
        L28e:
            java.lang.String r2 = m7053(r8, r9)     // Catch: java.lang.Throwable -> L1f9
            r0.coverImageUrl = r2     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = m7030(r0)     // Catch: java.lang.Throwable -> L1f9
            boolean r3 = androidx.core.C1073.m1059(r2, r3)     // Catch: java.lang.Throwable -> L1f9
            r2 = 50813(0xc67d, float:7.1204E-41)
        L29f:
            r4 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 18: goto L2a7;
                case 53: goto L2c8;
                case 243: goto L2ab;
                case 4075: goto L2b1;
                default: goto L2a6;
            }     // Catch: java.lang.Throwable -> L1f9
        L2a6:
            goto L29f
        L2a7:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L29f
        L2ab:
            if (r3 == 0) goto L2a7
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L29f
        L2b1:
            java.lang.String r2 = m7030(r0)     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f9
            r3.<init>()     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)     // Catch: java.lang.Throwable -> L1f9
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L1f9
            r0.coverImageUrl = r2     // Catch: java.lang.Throwable -> L1f9
        L2c8:
            kevin.fun.hook.KSHook$MediaType r3 = m7111(r0)     // Catch: java.lang.Throwable -> L1f9
            kevin.fun.hook.KSHook$MediaType r4 = m7064()     // Catch: java.lang.Throwable -> L1f9
            r2 = 51588(0xc984, float:7.229E-41)
        L2d3:
            r5 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L2db;
                case 54: goto L2e1;
                case 87: goto L2f7;
                case 116: goto L2e5;
                default: goto L2da;
            }     // Catch: java.lang.Throwable -> L1f9
        L2da:
            goto L2d3
        L2db:
            if (r3 != r4) goto L2e1
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L2d3
        L2e1:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L2d3
        L2e5:
            m7012(r8, r9, r0)     // Catch: java.lang.Throwable -> L1f9
            r1 = 51712(0xca00, float:7.2464E-41)
        L2eb:
            r2 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L223;
                case 15: goto L2f2;
                case 16: goto L2f2;
                case 17: goto L2f3;
                default: goto L2f2;
            }     // Catch: java.lang.Throwable -> L1f9
        L2f2:
            goto L2eb
        L2f3:
            r1 = 51743(0xca1f, float:7.2507E-41)
            goto L2eb
        L2f7:
            m6998(r8, r9, r0)     // Catch: java.lang.Throwable -> L1f9
            goto L223
    }

    private java.lang.String parseTimestamp(java.lang.String r9) {
            r8 = this;
            short[] r0 = m6972()
            r1 = 3009(0xbc1, float:4.217E-42)
            int r2 = androidx.core.C1072.f98
            r2 = r2 ^ (-540(0xfffffffffffffde4, float:NaN))
            r3 = 408(0x198, float:5.72E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1087.m2008(r0, r1, r2, r3)
            r1 = 1616(0x650, float:2.264E-42)
        L12:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L18;
                case 49: goto L1b;
                case 204: goto L20;
                case 239: goto L7d;
                default: goto L17;
            }
        L17:
            goto L12
        L18:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L12
        L1b:
            if (r9 == 0) goto L18
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L12
        L20:
            boolean r2 = androidx.activity.C1066.m488(r9)
            r1 = 1740(0x6cc, float:2.438E-42)
        L26:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2c;
                case 54: goto L31;
                case 471: goto L40;
                case 500: goto L34;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r2 == 0) goto L31
            r1 = 1833(0x729, float:2.569E-42)
            goto L26
        L31:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L26
        L34:
            r1 = 1864(0x748, float:2.612E-42)
        L36:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L3c;
                case 47483: goto L7d;
                default: goto L3b;
            }
        L3b:
            goto L36
        L3c:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L36
        L40:
            long r2 = androidx.loader.C1095.m2603(r9)     // Catch: java.lang.NumberFormatException -> L7e
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.NumberFormatException -> L7e
            short[] r4 = m6972()     // Catch: java.lang.NumberFormatException -> L7e
            r5 = 3013(0xbc5, float:4.222E-42)
            int r6 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.NumberFormatException -> L7e
            r6 = r6 ^ 65
            r7 = 2644(0xa54, float:3.705E-42)
            java.lang.String r4 = kevin.fun.hook.C1120.m8645(r4, r5, r6, r7)     // Catch: java.lang.NumberFormatException -> L7e
            java.util.Locale r5 = androidx.customview.C1075.m1125()     // Catch: java.lang.NumberFormatException -> L7e
            r1.<init>(r4, r5)     // Catch: java.lang.NumberFormatException -> L7e
            short[] r4 = m6972()     // Catch: java.lang.NumberFormatException -> L7e
            r5 = 3032(0xbd8, float:4.249E-42)
            int r6 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.NumberFormatException -> L7e
            r6 = r6 ^ (-121(0xffffffffffffff87, float:NaN))
            r7 = 793(0x319, float:1.111E-42)
            java.lang.String r4 = androidx.activity.C1064.m310(r4, r5, r6, r7)     // Catch: java.lang.NumberFormatException -> L7e
            java.util.TimeZone r4 = androidx.appcompat.resources.C1068.m676(r4)     // Catch: java.lang.NumberFormatException -> L7e
            androidx.core.ktx.C1070.m824(r1, r4)     // Catch: java.lang.NumberFormatException -> L7e
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.NumberFormatException -> L7e
            r4.<init>(r2)     // Catch: java.lang.NumberFormatException -> L7e
            java.lang.String r0 = androidx.appcompat.resources.C1068.m657(r1, r4)     // Catch: java.lang.NumberFormatException -> L7e
        L7d:
            return r0
        L7e:
            r1 = move-exception
            goto L7d
    }

    private void parseVideoInfo(java.lang.ref.WeakReference<android.content.Context> r5, java.lang.String r6) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۡ۠ۤ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56451: goto L13;
                case 1748645: goto L1c;
                case 1753453: goto L24;
                default: goto Lc;
            }
        Lc:
            androidx.activity.C1063.m244(r2, r0)
            java.lang.String r1 = "ۦ۠ۧ"
            r3 = r1
            goto L5
        L13:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda29 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda29
            r0.<init>(r4, r6, r5)
            java.lang.String r1 = "ۥۧ"
            r3 = r1
            goto L5
        L1c:
            java.util.concurrent.ExecutorService r1 = m7016()
            java.lang.String r3 = "ۤۧ"
            r2 = r1
            goto L5
        L24:
            return
    }

    private void performAtlasDownload(java.lang.ref.WeakReference<android.content.Context> r12, kevin.fun.hook.KSHook.AtlasDownloadHolder r13, int r14, java.util.concurrent.atomic.AtomicInteger r15, long r16) {
            r11 = this;
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2350()     // Catch: java.lang.Exception -> L67
            java.io.File r0 = androidx.loader.C1094.m2512(r0)     // Catch: java.lang.Exception -> L67
            short[] r1 = m6972()     // Catch: java.lang.Exception -> L67
            r2 = 3045(0xbe5, float:4.267E-42)
            int r3 = androidx.emoji2.C1080.f106     // Catch: java.lang.Exception -> L67
            r3 = r3 ^ 380(0x17c, float:5.32E-43)
            r4 = 2640(0xa50, float:3.7E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1087.m2008(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L67
            r7.<init>(r0, r1)     // Catch: java.lang.Exception -> L67
            boolean r1 = androidx.vectordrawable.C1105.m3294(r7)     // Catch: java.lang.Exception -> L67
            r0 = 1616(0x650, float:2.264E-42)
        L23:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L29;
                case 49: goto L2c;
                case 204: goto L31;
                case 239: goto L75;
                default: goto L28;
            }     // Catch: java.lang.Exception -> L67
        L28:
            goto L23
        L29:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L23
        L2c:
            if (r1 != 0) goto L29
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L23
        L31:
            boolean r1 = androidx.lifecycle.process.C1090.m2220(r7)     // Catch: java.lang.Exception -> L67
            r0 = 1740(0x6cc, float:2.438E-42)
        L37:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3d;
                case 54: goto L42;
                case 471: goto L51;
                case 500: goto L45;
                default: goto L3c;
            }     // Catch: java.lang.Exception -> L67
        L3c:
            goto L37
        L3d:
            if (r1 == 0) goto L42
            r0 = 1833(0x729, float:2.569E-42)
            goto L37
        L42:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L37
        L45:
            r0 = 1864(0x748, float:2.612E-42)
        L47:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4d;
                case 47483: goto L75;
                default: goto L4c;
            }     // Catch: java.lang.Exception -> L67
        L4c:
            goto L47
        L4d:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L47
        L51:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> L67
            short[] r1 = m6972()     // Catch: java.lang.Exception -> L67
            r2 = 3050(0xbea, float:4.274E-42)
            int r3 = androidx.viewpager.C1108.f134     // Catch: java.lang.Exception -> L67
            r3 = r3 ^ (-496(0xfffffffffffffe10, float:NaN))
            r4 = 475(0x1db, float:6.66E-43)
            java.lang.String r1 = androidx.customview.C1074.m1116(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L67
            r0.<init>(r1)     // Catch: java.lang.Exception -> L67
            throw r0     // Catch: java.lang.Exception -> L67
        L67:
            r0 = move-exception
        L68:
            android.os.Handler r1 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda27 r2 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda27
            r2.<init>(r11, r13, r12, r0)
            androidx.activity.C1062.m178(r1, r2)
        L74:
            return
        L75:
            r0 = 0
            r6 = r0
        L77:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L7a:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L82;
                case 45: goto Lac;
                case 76: goto L8c;
                case 239: goto L86;
                default: goto L81;
            }
        L81:
            goto L7a
        L82:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L7a
        L86:
            if (r6 < r14) goto L82
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L7a
        L8c:
            android.os.Handler r6 = m7088()     // Catch: java.lang.Exception -> L151
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda26 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda26     // Catch: java.lang.Exception -> L151
            r1 = r11
            r2 = r13
            r3 = r12
            r4 = r15
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L151
            androidx.activity.C1062.m178(r6, r0)     // Catch: java.lang.Exception -> L151
            r0 = 48891(0xbefb, float:6.8511E-41)
        La0:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L74;
                case 503: goto La8;
                default: goto La7;
            }     // Catch: java.lang.Exception -> L151
        La7:
            goto La0
        La8:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto La0
        Lac:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r11)     // Catch: java.lang.Exception -> L151
            java.util.List r0 = m7090(r0)     // Catch: java.lang.Exception -> L151
            java.lang.Object r0 = androidx.drawerlayout.C1077.m1311(r0, r6)     // Catch: java.lang.Exception -> L151
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L151
            long r2 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Exception -> L151
            int r1 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Exception -> L151
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L151
            r4.<init>()     // Catch: java.lang.Exception -> L151
            short[] r5 = m6972()     // Catch: java.lang.Exception -> L151
            r8 = 3058(0xbf2, float:4.285E-42)
            int r9 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Exception -> L151
            r9 = r9 ^ (-110(0xffffffffffffff92, float:NaN))
            r10 = 365(0x16d, float:5.11E-43)
            java.lang.String r5 = kevin.fun.hook.audio.C1117.m8169(r5, r8, r9, r10)     // Catch: java.lang.Exception -> L151
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Exception -> L151
            java.lang.StringBuilder r2 = androidx.loader.C1097.m2720(r4, r2)     // Catch: java.lang.Exception -> L151
            short[] r3 = m6972()     // Catch: java.lang.Exception -> L151
            r4 = 3073(0xc01, float:4.306E-42)
            r5 = 1
            r8 = 2222(0x8ae, float:3.114E-42)
            java.lang.String r3 = androidx.startup.C1101.m3014(r3, r4, r5, r8)     // Catch: java.lang.Exception -> L151
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)     // Catch: java.lang.Exception -> L151
            r1 = r1 ^ 359(0x167, float:5.03E-43)
            int r1 = r1 + r6
            java.lang.StringBuilder r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r1)     // Catch: java.lang.Exception -> L151
            short[] r2 = m6972()     // Catch: java.lang.Exception -> L151
            r3 = 3074(0xc02, float:4.308E-42)
            int r4 = androidx.customview.C1075.f101     // Catch: java.lang.Exception -> L151
            r4 = r4 ^ (-98)
            r5 = 2841(0xb19, float:3.981E-42)
            java.lang.String r2 = androidx.core.ktx.C1071.m874(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L151
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Exception -> L151
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Exception -> L151
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L151
            r2.<init>(r7, r1)     // Catch: java.lang.Exception -> L151
            boolean r1 = m7110(r11, r0, r2)     // Catch: java.lang.Exception -> L151
            r0 = 49666(0xc202, float:6.9597E-41)
        L119:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L121;
                case 50: goto L127;
                case 76: goto L12b;
                case 83: goto L12e;
                default: goto L120;
            }     // Catch: java.lang.Exception -> L151
        L120:
            goto L119
        L121:
            if (r1 == 0) goto L127
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L119
        L127:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L119
        L12b:
            androidx.versionedparcelable.C1106.m3387(r15)     // Catch: java.lang.Exception -> L151
        L12e:
            int r2 = androidx.versionedparcelable.C1107.m3429(r15)     // Catch: java.lang.Exception -> L151
            r0 = r11
            r1 = r13
            r3 = r14
            r4 = r16
            m7080(r0, r1, r2, r3, r4)     // Catch: java.lang.Exception -> L151
            int r0 = androidx.viewpager.C1108.f134
            r0 = r0 ^ (-487(0xfffffffffffffe19, float:NaN))
            int r0 = r0 + r6
            r1 = 49790(0xc27e, float:6.977E-41)
        L142:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L14a;
                case 241: goto L14d;
                default: goto L149;
            }
        L149:
            goto L142
        L14a:
            r6 = r0
            goto L77
        L14d:
            r1 = 49821(0xc29d, float:6.9814E-41)
            goto L142
        L151:
            r0 = move-exception
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L155:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 497: goto L15d;
                case 1711: goto L68;
                default: goto L15c;
            }
        L15c:
            goto L155
        L15d:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L155
    }

    private void performDownload(java.lang.ref.WeakReference<android.content.Context> r11, kevin.fun.hook.KSHook.DownloadDialogHolder r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18, java.lang.String r20) {
            r10 = this;
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L63
            java.io.File r2 = androidx.loader.C1094.m2512(r13)     // Catch: java.lang.Exception -> L63
            short[] r4 = m6972()     // Catch: java.lang.Exception -> L63
            r5 = 3078(0xc06, float:4.313E-42)
            int r6 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Exception -> L63
            r6 = r6 ^ 523(0x20b, float:7.33E-43)
            r7 = 595(0x253, float:8.34E-43)
            java.lang.String r4 = androidx.emoji2.viewsintegration.C1079.m1457(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L63
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L63
            boolean r4 = androidx.vectordrawable.C1105.m3294(r3)     // Catch: java.lang.Exception -> L63
            r2 = 1616(0x650, float:2.264E-42)
        L1f:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L25;
                case 49: goto L28;
                case 204: goto L2d;
                case 239: goto L99;
                default: goto L24;
            }     // Catch: java.lang.Exception -> L63
        L24:
            goto L1f
        L25:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L1f
        L28:
            if (r4 != 0) goto L25
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L1f
        L2d:
            boolean r4 = androidx.lifecycle.process.C1090.m2220(r3)     // Catch: java.lang.Exception -> L63
            r2 = 1740(0x6cc, float:2.438E-42)
        L33:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L39;
                case 54: goto L3e;
                case 471: goto L4d;
                case 500: goto L41;
                default: goto L38;
            }     // Catch: java.lang.Exception -> L63
        L38:
            goto L33
        L39:
            if (r4 == 0) goto L3e
            r2 = 1833(0x729, float:2.569E-42)
            goto L33
        L3e:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L33
        L41:
            r2 = 1864(0x748, float:2.612E-42)
        L43:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L49;
                case 47483: goto L99;
                default: goto L48;
            }     // Catch: java.lang.Exception -> L63
        L48:
            goto L43
        L49:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto L43
        L4d:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Exception -> L63
            short[] r3 = m6972()     // Catch: java.lang.Exception -> L63
            r4 = 3083(0xc0b, float:4.32E-42)
            int r5 = androidx.activity.C1065.f91     // Catch: java.lang.Exception -> L63
            r5 = r5 ^ (-51)
            r6 = 2281(0x8e9, float:3.196E-42)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8576(r3, r4, r5, r6)     // Catch: java.lang.Exception -> L63
            r2.<init>(r3)     // Catch: java.lang.Exception -> L63
            throw r2     // Catch: java.lang.Exception -> L63
        L63:
            r2 = move-exception
        L64:
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2209(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            short[] r5 = m6972()
            r6 = 3089(0xc11, float:4.329E-42)
            int r7 = org.luckypray.dexkit.C1123.f433
            r7 = r7 ^ (-969(0xfffffffffffffc37, float:NaN))
            r8 = 2057(0x809, float:2.882E-42)
            java.lang.String r5 = androidx.lifecycle.livedata.C1085.m1814(r5, r6, r7, r8)
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)
            m7099(r3)
            android.os.Handler r3 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda23 r4 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda23
            r4.<init>(r10, r12, r11, r2)
            androidx.activity.C1062.m178(r3, r4)
        L98:
            return
        L99:
            long r4 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r2.<init>()     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r14)     // Catch: java.lang.Exception -> L142
            java.lang.StringBuilder r2 = androidx.loader.C1097.m2720(r2, r4)     // Catch: java.lang.Exception -> L142
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r15)     // Catch: java.lang.Exception -> L132
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Exception -> L132
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L132
            r4.<init>(r3, r2)     // Catch: java.lang.Exception -> L132
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda20 r2 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda20     // Catch: java.lang.Exception -> L132
            r0 = r18
            r2.<init>(r10, r12, r0)     // Catch: java.lang.Exception -> L122
            r0 = r16
            r1 = r17
            m6964(r10, r0, r4, r1, r2)     // Catch: java.lang.Exception -> L112
            java.lang.Object r2 = kevin.fun.hook.audio.C1116.m8047(r11)     // Catch: java.lang.Exception -> L112
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L112
            java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r4)     // Catch: java.lang.Exception -> L112
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L112
            int r5 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Exception -> L112
            r5 = r5 ^ 558(0x22e, float:7.82E-43)
            r4[r5] = r3     // Catch: java.lang.Exception -> L112
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Exception -> L112
            int r5 = androidx.activity.C1062.f88     // Catch: java.lang.Exception -> L112
            r5 = r5 ^ (-75)
            r3[r5] = r17     // Catch: java.lang.Exception -> L112
            r5 = 0
            dev.rikka.ndk.thirdparty.libcxx.C1110.m3659(r2, r4, r3, r5)     // Catch: java.lang.Exception -> L112
            android.os.Handler r2 = m7088()     // Catch: java.lang.Exception -> L112
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda21 r3 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda21     // Catch: java.lang.Exception -> L112
            r0 = r20
            r3.<init>(r10, r12, r11, r0)     // Catch: java.lang.Exception -> L102
            androidx.activity.C1062.m178(r2, r3)     // Catch: java.lang.Exception -> L102
            r2 = 48767(0xbe7f, float:6.8337E-41)
        Lf6:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L98;
                case 239: goto Lfe;
                default: goto Lfd;
            }
        Lfd:
            goto Lf6
        Lfe:
            r2 = 48798(0xbe9e, float:6.838E-41)
            goto Lf6
        L102:
            r2 = move-exception
            r3 = 48891(0xbefb, float:6.8511E-41)
        L106:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 22: goto L64;
                case 503: goto L10e;
                default: goto L10d;
            }
        L10d:
            goto L106
        L10e:
            r3 = 48922(0xbf1a, float:6.8554E-41)
            goto L106
        L112:
            r2 = move-exception
            r3 = 49666(0xc202, float:6.9597E-41)
        L116:
            r4 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L11e;
                case 50: goto L64;
                default: goto L11d;
            }
        L11d:
            goto L116
        L11e:
            r3 = 49697(0xc221, float:6.964E-41)
            goto L116
        L122:
            r2 = move-exception
            r3 = 49790(0xc27e, float:6.977E-41)
        L126:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto L64;
                case 241: goto L12e;
                default: goto L12d;
            }
        L12d:
            goto L126
        L12e:
            r3 = 49821(0xc29d, float:6.9814E-41)
            goto L126
        L132:
            r2 = move-exception
            r3 = 49914(0xc2fa, float:6.9944E-41)
        L136:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 497: goto L13e;
                case 1711: goto L64;
                default: goto L13d;
            }
        L13d:
            goto L136
        L13e:
            r3 = 50596(0xc5a4, float:7.09E-41)
            goto L136
        L142:
            r2 = move-exception
            r3 = 50689(0xc601, float:7.103E-41)
        L146:
            r4 = 50706(0xc612, float:7.1054E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 19: goto L14e;
                case 50: goto L64;
                default: goto L14d;
            }
        L14d:
            goto L146
        L14e:
            r3 = 50720(0xc620, float:7.1074E-41)
            goto L146
    }

    private void playBottomBounceIn(android.view.View r13) {
            r12 = this;
            r0 = 0
            r10 = 0
            r5 = 0
            r11 = 0
            r3 = 0
            r2 = 0
            r6 = 0
            r8 = 0
            r1 = 0
            java.lang.String r4 = "ۨۡۧ"
        Ld:
            int r4 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r4) {
                case 1746819: goto L64;
                case 1747804: goto L20;
                case 1748706: goto L54;
                case 1748764: goto L1b;
                case 1749820: goto L25;
                case 1751560: goto L36;
                case 1752489: goto L3d;
                case 1752554: goto L2b;
                case 1753484: goto L4f;
                case 1753631: goto L73;
                case 1754443: goto L32;
                case 1754626: goto L58;
                case 1755406: goto L48;
                case 1755584: goto L6b;
                case 1755618: goto L5e;
                default: goto L14;
            }
        L14:
            android.view.ViewPropertyAnimator r2 = androidx.emoji2.viewsintegration.C1078.m1396(r3, r1)
            java.lang.String r4 = "ۨۨۢ"
            goto Ld
        L1b:
            int r10 = androidx.interpolator.C1082.f108
            java.lang.String r4 = "۠ۤ۠"
            goto Ld
        L20:
            r5 = r10 ^ 207(0xcf, float:2.9E-43)
            java.lang.String r4 = "ۣ۟ۧ"
            goto Ld
        L25:
            r8 = 32
            long r8 = r8 ^ r6
            java.lang.String r4 = "ۥۢۧ"
            goto Ld
        L2b:
            android.view.ViewPropertyAnimator r3 = androidx.loader.C1099.m2899(r2, r8)
            java.lang.String r4 = "ۥ۠ۤ"
            goto Ld
        L32:
            long r6 = (long) r5
            java.lang.String r4 = "ۢۧۡ"
            goto Ld
        L36:
            android.view.ViewPropertyAnimator r3 = androidx.startup.C1100.m2953(r13)
            java.lang.String r4 = "ۨۧ۟"
            goto Ld
        L3d:
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r4 = 1062836634(0x3f59999a, float:0.85)
            r1.<init>(r4)
            java.lang.String r4 = "۠۠"
            goto Ld
        L48:
            android.content.Context r0 = androidx.activity.C1064.m365(r13)
            java.lang.String r4 = "ۡۤ۟"
            goto Ld
        L4f:
            int r5 = androidx.vectordrawable.C1103.f129
            java.lang.String r4 = "ۧۡۥ"
            goto Ld
        L54:
            float r11 = (float) r10
            java.lang.String r4 = "ۧۧۢ"
            goto Ld
        L58:
            androidx.emoji2.viewsintegration.C1079.m1453(r13, r11)
            java.lang.String r4 = "ۤۡۥ"
            goto Ld
        L5e:
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r2)
            java.lang.String r4 = "ۦۦ۟"
            goto Ld
        L64:
            int r10 = m7045(r12, r0, r5)
            java.lang.String r4 = "ۣۡۢ"
            goto Ld
        L6b:
            r2 = 0
            android.view.ViewPropertyAnimator r2 = androidx.loader.C1094.m2503(r3, r2)
            java.lang.String r4 = "ۦۡۧ"
            goto Ld
        L73:
            return
    }

    private void preHookShareObjectId(java.lang.ClassLoader r8) {
            r7 = this;
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L6a
            r1 = 3103(0xc1f, float:4.348E-42)
            int r2 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> L6a
            r2 = r2 ^ 662(0x296, float:9.28E-43)
            r3 = 1260(0x4ec, float:1.766E-42)
            java.lang.String r0 = androidx.interpolator.C1083.m1723(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L6a
            r1 = 0
            java.lang.String r0 = androidx.interpolator.C1081.m1642(r0, r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r0 = m7102(r0, r8)     // Catch: java.lang.Throwable -> L6a
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L6a
            r2 = 3108(0xc24, float:4.355E-42)
            int r3 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L6a
            r3 = r3 ^ 843(0x34b, float:1.181E-42)
            r4 = 2060(0x80c, float:2.887E-42)
            java.lang.String r1 = androidx.activity.C1062.m170(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6a
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L6a
            r3 = 3124(0xc34, float:4.378E-42)
            int r4 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L6a
            r4 = r4 ^ (-2)
            r5 = 1990(0x7c6, float:2.789E-42)
            java.lang.String r2 = androidx.core.ktx.C1071.m874(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r2 = m7102(r2, r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r3 = androidx.loader.C1095.m2522()     // Catch: java.lang.Throwable -> L6a
            kevin.fun.hook.KSHook$3 r4 = new kevin.fun.hook.KSHook$3     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6a
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6a
            int r6 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> L6a
            r6 = r6 ^ 799(0x31f, float:1.12E-42)
            r5[r6] = r2     // Catch: java.lang.Throwable -> L6a
            int r2 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L6a
            r2 = r2 ^ 242(0xf2, float:3.39E-43)
            r5[r2] = r3     // Catch: java.lang.Throwable -> L6a
            int r2 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L6a
            r2 = r2 ^ (-962(0xfffffffffffffc3e, float:NaN))
            r5[r2] = r4     // Catch: java.lang.Throwable -> L6a
            m6973(r0, r1, r5)     // Catch: java.lang.Throwable -> L6a
            r0 = 1616(0x650, float:2.264E-42)
        L60:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L66;
                case 49: goto L67;
                default: goto L65;
            }
        L65:
            goto L60
        L66:
            return
        L67:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L60
        L6a:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3176(0xc68, float:4.45E-42)
            int r4 = kevin.fun.hook.C1120.f419
            r4 = r4 ^ (-485(0xfffffffffffffe1b, float:NaN))
            r5 = 718(0x2ce, float:1.006E-42)
            java.lang.String r2 = androidx.core.C1073.m1028(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L66
    }

    private java.io.File prepareSoFile(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            r0 = 0
            r1 = 1616(0x650, float:2.264E-42)
        L3:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L11;
                case 239: goto L36;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r10 == 0) goto L9
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L86
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L86
            boolean r2 = androidx.vectordrawable.C1105.m3294(r1)     // Catch: java.lang.Throwable -> L86
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto L36;
                case 500: goto L2a;
                default: goto L21;
            }     // Catch: java.lang.Throwable -> L86
        L21:
            goto L1c
        L22:
            if (r2 == 0) goto L27
            r1 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            r1 = 1864(0x748, float:2.612E-42)
        L2c:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L32;
                case 47483: goto L3a;
                default: goto L31;
            }     // Catch: java.lang.Throwable -> L86
        L31:
            goto L2c
        L32:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L2c
        L36:
            java.lang.String r10 = m6989(r8)     // Catch: java.lang.Throwable -> L86
        L3a:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L3d:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L45;
                case 45: goto L63;
                case 76: goto L4f;
                case 239: goto L49;
                default: goto L44;
            }     // Catch: java.lang.Throwable -> L86
        L44:
            goto L3d
        L45:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L3d
        L49:
            if (r10 != 0) goto L45
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L3d
        L4f:
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L86
            r2 = 3208(0xc88, float:4.495E-42)
            int r3 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L86
            r3 = r3 ^ 498(0x1f2, float:6.98E-43)
            r4 = 3089(0xc11, float:4.329E-42)
            java.lang.String r1 = androidx.interpolator.C1082.m1694(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L86
            m7099(r1)     // Catch: java.lang.Throwable -> L86
        L62:
            return r0
        L63:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L86
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L86
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L86
            java.io.File r3 = androidx.annotation.experimental.C1067.m597(r9)     // Catch: java.lang.Throwable -> L86
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> L86
            r5 = 3232(0xca0, float:4.529E-42)
            int r6 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L86
            r6 = r6 ^ 813(0x32d, float:1.139E-42)
            r7 = 2523(0x9db, float:3.535E-42)
            java.lang.String r4 = androidx.lifecycle.runtime.C1092.m2337(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L86
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L86
            m7079(r8, r2, r1)     // Catch: java.lang.Throwable -> L86
            r0 = r1
            goto L62
        L86:
            r1 = move-exception
            java.lang.String r1 = androidx.loader.C1099.m2895(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r4 = 3247(0xcaf, float:4.55E-42)
            int r5 = kevin.fun.hook.C1120.f419
            r5 = r5 ^ (-467(0xfffffffffffffe2d, float:NaN))
            r6 = 362(0x16a, float:5.07E-43)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8576(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7099(r1)
            goto L62
    }

    private void resetState() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r2)
            r1 = 0
            androidx.vectordrawable.C1105.m3278(r0, r1)
            return
    }

    private void runMmkvTest(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            r1 = 1
            r6 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = m7069()
            boolean r1 = androidx.loader.C1098.m2817(r0, r6, r1)
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L51;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 != 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            short[] r0 = m6972()
            r1 = 3269(0xcc5, float:4.581E-42)
            int r2 = kevin.fun.hook.webdav.C1119.f418
            r2 = r2 ^ 319(0x13f, float:4.47E-43)
            r3 = 2223(0x8af, float:3.115E-42)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            m7099(r0)
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1740(0x6cc, float:2.438E-42)
        L33:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L39;
                case 54: goto L3e;
                case 471: goto L50;
                case 500: goto L41;
                default: goto L38;
            }
        L38:
            goto L33
        L39:
            if (r1 > 0) goto L3e
            r0 = 1833(0x729, float:2.569E-42)
            goto L33
        L3e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L33
        L41:
            java.lang.String r0 = "7Dv"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L50:
            return
        L51:
            java.io.File r1 = m6978(r7, r8, r9)     // Catch: java.lang.Throwable -> La7
            r0 = 1864(0x748, float:2.612E-42)
        L57:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5d;
                case 47384: goto L8b;
                case 47417: goto L67;
                case 47483: goto L63;
                default: goto L5c;
            }     // Catch: java.lang.Throwable -> La7
        L5c:
            goto L57
        L5d:
            if (r1 == 0) goto L63
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L57
        L63:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L57
        L67:
            boolean r2 = androidx.vectordrawable.C1105.m3294(r1)     // Catch: java.lang.Throwable -> La7
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L6e:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L76;
                case 45: goto Le0;
                case 76: goto L80;
                case 239: goto L7a;
                default: goto L75;
            }     // Catch: java.lang.Throwable -> La7
        L75:
            goto L6e
        L76:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L6e
        L7a:
            if (r2 != 0) goto L76
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L6e
        L80:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L83:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L8b;
                case 503: goto Ldc;
                default: goto L8a;
            }     // Catch: java.lang.Throwable -> La7
        L8a:
            goto L83
        L8b:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> La7
            r1 = 3420(0xd5c, float:4.792E-42)
            int r2 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> La7
            r2 = r2 ^ 269(0x10d, float:3.77E-43)
            r3 = 1679(0x68f, float:2.353E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> La7
            m7099(r0)     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.atomic.AtomicBoolean r0 = m7069()     // Catch: java.lang.Throwable -> La7
            r1 = 0
            androidx.drawerlayout.C1077.m1308(r0, r1)     // Catch: java.lang.Throwable -> La7
            goto L50
        La7:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = m7069()
            androidx.drawerlayout.C1077.m1308(r1, r6)
            r1 = 0
            kevin.fun.hook.KSHook.mmkvLoader = r1
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3439(0xd6f, float:4.819E-42)
            int r4 = androidx.loader.C1094.f120
            r4 = r4 ^ 352(0x160, float:4.93E-43)
            r5 = 1687(0x697, float:2.364E-42)
            java.lang.String r2 = androidx.lifecycle.viewmodel.C1093.m2415(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            goto L50
        Ldc:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L83
        Le0:
            java.lang.String r1 = kevin.fun.hook.C1120.m8641(r1)     // Catch: java.lang.Throwable -> La7
            dalvik.system.DexClassLoader r2 = m7097()     // Catch: java.lang.Throwable -> La7
            r0 = 49666(0xc202, float:6.9597E-41)
        Leb:
            r3 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto Lf3;
                case 50: goto Lf9;
                case 76: goto Lfd;
                case 83: goto L145;
                default: goto Lf2;
            }     // Catch: java.lang.Throwable -> La7
        Lf2:
            goto Leb
        Lf3:
            if (r2 != 0) goto Lf9
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Leb
        Lf9:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Leb
        Lfd:
            java.lang.Object r2 = m7091()     // Catch: java.lang.Throwable -> La7
            monitor-enter(r2)     // Catch: java.lang.Throwable -> La7
            dalvik.system.DexClassLoader r3 = m7097()     // Catch: java.lang.Throwable -> L142
            r0 = 49790(0xc27e, float:6.977E-41)
        L109:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto L111;
                case 51: goto L132;
                case 84: goto L11b;
                case 241: goto L115;
                default: goto L110;
            }     // Catch: java.lang.Throwable -> L142
        L110:
            goto L109
        L111:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L109
        L115:
            if (r3 != 0) goto L111
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L109
        L11b:
            dalvik.system.DexClassLoader r0 = new dalvik.system.DexClassLoader     // Catch: java.lang.Throwable -> L142
            java.lang.String r3 = m6993()     // Catch: java.lang.Throwable -> L142
            java.io.File r4 = androidx.versionedparcelable.C1107.m3430(r8)     // Catch: java.lang.Throwable -> L142
            java.lang.String r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r4)     // Catch: java.lang.Throwable -> L142
            java.lang.ClassLoader r5 = androidx.lifecycle.livedata.C1086.m1939(r8)     // Catch: java.lang.Throwable -> L142
            r0.<init>(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L142
            kevin.fun.hook.KSHook.mmkvLoader = r0     // Catch: java.lang.Throwable -> L142
        L132:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L142
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L136:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L13e;
                case 1711: goto L145;
                default: goto L13d;
            }     // Catch: java.lang.Throwable -> L142
        L13d:
            goto L136
        L13e:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L136
        L142:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L142
            throw r0     // Catch: java.lang.Throwable -> La7
        L145:
            dalvik.system.DexClassLoader r0 = m7097()     // Catch: java.lang.Throwable -> La7
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> La7
            r2 = 3294(0xcde, float:4.616E-42)
            int r3 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> La7
            r3 = r3 ^ 267(0x10b, float:3.74E-43)
            r4 = 449(0x1c1, float:6.29E-43)
            java.lang.String r1 = androidx.documentfile.C1076.m1234(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.Class r0 = androidx.lifecycle.viewmodel.C1093.m2433(r0, r1)     // Catch: java.lang.Throwable -> La7
            kevin.fun.hook.KSHook.mmkvClass = r0     // Catch: java.lang.Throwable -> La7
            java.io.File r0 = androidx.annotation.experimental.C1067.m597(r8)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> La7
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> La7
            r2 = 3315(0xcf3, float:4.645E-42)
            int r3 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> La7
            r3 = r3 ^ (-613(0xfffffffffffffd9b, float:NaN))
            r4 = 2720(0xaa0, float:3.812E-42)
            java.lang.String r1 = androidx.lifecycle.runtime.C1092.m2337(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.Class r1 = m6962()     // Catch: java.lang.Throwable -> L1b7
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> L1b7
            r3 = 3326(0xcfe, float:4.661E-42)
            int r4 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L1b7
            r4 = r4 ^ 249(0xf9, float:3.49E-43)
            r5 = 2138(0x85a, float:2.996E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1090.m2213(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1b7
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b7
            int r4 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L1b7
            r4 = r4 ^ 447(0x1bf, float:6.26E-43)
            r3[r4] = r0     // Catch: java.lang.Throwable -> L1b7
            m6966(r1, r2, r3)     // Catch: java.lang.Throwable -> L1b7
            r0 = 50689(0xc601, float:7.103E-41)
        L1ab:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L1b3;
                case 50: goto L1e0;
                default: goto L1b2;
            }
        L1b2:
            goto L1ab
        L1b3:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L1ab
        L1b7:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> La7
            r3 = 3336(0xd08, float:4.675E-42)
            int r4 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> La7
            r4 = r4 ^ 262(0x106, float:3.67E-43)
            r5 = 3100(0xc1c, float:4.344E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> La7
            m7099(r0)     // Catch: java.lang.Throwable -> La7
        L1e0:
            java.lang.Class r0 = m6962()     // Catch: java.lang.Throwable -> La7
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> La7
            r2 = 3360(0xd20, float:4.708E-42)
            int r3 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> La7
            r3 = r3 ^ 548(0x224, float:7.68E-43)
            r4 = 826(0x33a, float:1.157E-42)
            java.lang.String r1 = androidx.annotation.experimental.C1067.m581(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La7
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> La7
            r3 = 3370(0xd2a, float:4.722E-42)
            int r4 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> La7
            r4 = r4 ^ 481(0x1e1, float:6.74E-43)
            r5 = 1705(0x6a9, float:2.389E-42)
            java.lang.String r2 = kevin.fun.hook.webdav.C1118.m8509(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
            int r3 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> La7
            r3 = r3 ^ (-55)
            java.lang.Integer r3 = androidx.activity.C1064.m334(r3)     // Catch: java.lang.Throwable -> La7
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La7
            int r5 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> La7
            r5 = r5 ^ 243(0xf3, float:3.4E-43)
            r4[r5] = r2     // Catch: java.lang.Throwable -> La7
            int r2 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> La7
            r2 = r2 ^ (-487(0xfffffffffffffe19, float:NaN))
            r4[r2] = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r0 = m6966(r0, r1, r4)     // Catch: java.lang.Throwable -> La7
            kevin.fun.hook.KSHook.mmkvInstance = r0     // Catch: java.lang.Throwable -> La7
            java.lang.Object r1 = m7104()     // Catch: java.lang.Throwable -> La7
            r0 = 50813(0xc67d, float:7.1204E-41)
        L228:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L230;
                case 53: goto L264;
                case 243: goto L234;
                case 4075: goto L23a;
                default: goto L22f;
            }     // Catch: java.lang.Throwable -> La7
        L22f:
            goto L228
        L230:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto L228
        L234:
            if (r1 == 0) goto L230
            r0 = 51557(0xc965, float:7.2247E-41)
            goto L228
        L23a:
            java.lang.Class r0 = m6962()     // Catch: java.lang.Throwable -> La7
            java.lang.Object r1 = m7104()     // Catch: java.lang.Throwable -> La7
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> La7
            r3 = 3381(0xd35, float:4.738E-42)
            int r4 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> La7
            r4 = r4 ^ 809(0x329, float:1.134E-42)
            r5 = 2699(0xa8b, float:3.782E-42)
            java.lang.String r2 = androidx.vectordrawable.C1105.m3247(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
            androidx.emoji2.viewsintegration.C1078.m1407(r8, r0, r1, r2)     // Catch: java.lang.Throwable -> La7
            r0 = 51588(0xc984, float:7.229E-41)
        L258:
            r1 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L260;
                case 54: goto L50;
                default: goto L25f;
            }     // Catch: java.lang.Throwable -> La7
        L25f:
            goto L258
        L260:
            r0 = 51619(0xc9a3, float:7.2334E-41)
            goto L258
        L264:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> La7
            r1 = 3392(0xd40, float:4.753E-42)
            int r2 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> La7
            r2 = r2 ^ (-992(0xfffffffffffffc20, float:NaN))
            r3 = 2103(0x837, float:2.947E-42)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> La7
            m7099(r0)     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.atomic.AtomicBoolean r0 = m7069()     // Catch: java.lang.Throwable -> La7
            r1 = 0
            androidx.drawerlayout.C1077.m1308(r0, r1)     // Catch: java.lang.Throwable -> La7
            r0 = 51712(0xca00, float:7.2464E-41)
        L282:
            r1 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L50;
                case 15: goto L289;
                case 16: goto L289;
                case 17: goto L28a;
                default: goto L289;
            }
        L289:
            goto L282
        L28a:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L282
    }

    private void saveVersionInfo(android.content.Context r9) {
            r8 = this;
            android.content.pm.PackageManager r0 = androidx.customview.C1074.m1063(r9)     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = androidx.appcompat.C1069.m719(r9)     // Catch: java.lang.Throwable -> La9
            r2 = 0
            android.content.pm.PackageInfo r1 = androidx.activity.C1062.m194(r0, r1, r2)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = androidx.customview.C1075.m1185(r1)     // Catch: java.lang.Throwable -> La9
            int r2 = androidx.loader.C1095.m2593()     // Catch: java.lang.Throwable -> La9
            r0 = 1616(0x650, float:2.264E-42)
        L17:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1d;
                case 49: goto L20;
                case 204: goto L27;
                case 239: goto L36;
                default: goto L1c;
            }     // Catch: java.lang.Throwable -> La9
        L1c:
            goto L17
        L1d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L17
        L20:
            r0 = 28
            if (r2 < r0) goto L1d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L17
        L27:
            long r0 = androidx.drawerlayout.C1077.m1300(r1)     // Catch: java.lang.Throwable -> La9
            r2 = 1740(0x6cc, float:2.438E-42)
        L2d:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L33;
                case 54: goto L3b;
                default: goto L32;
            }     // Catch: java.lang.Throwable -> La9
        L32:
            goto L2d
        L33:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L2d
        L36:
            int r0 = kevin.fun.hook.audio.C1116.m8090(r1)     // Catch: java.lang.Throwable -> La9
            long r0 = (long) r0     // Catch: java.lang.Throwable -> La9
        L3b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> La9
            r5 = 3459(0xd83, float:4.847E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> La9
            r6 = r6 ^ 667(0x29b, float:9.35E-43)
            r7 = 2006(0x7d6, float:2.811E-42)
            java.lang.String r4 = androidx.vectordrawable.C1104.m3232(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)     // Catch: java.lang.Throwable -> La9
            short[] r4 = m6972()     // Catch: java.lang.Throwable -> La9
            r5 = 3481(0xd99, float:4.878E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> La9
            r6 = r6 ^ (-939(0xfffffffffffffc55, float:NaN))
            r7 = 1628(0x65c, float:2.281E-42)
            java.lang.String r4 = androidx.appcompat.resources.C1068.m652(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r2 = androidx.loader.C1097.m2720(r2, r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> La9
            m7099(r2)     // Catch: java.lang.Throwable -> La9
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> La9
            r4 = 3496(0xda8, float:4.899E-42)
            int r5 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> La9
            r5 = r5 ^ (-250(0xffffffffffffff06, float:NaN))
            r6 = 2055(0x807, float:2.88E-42)
            java.lang.String r2 = androidx.interpolator.C1083.m1723(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> La9
            androidx.core.C1073.m1055(r2, r3)     // Catch: java.lang.Throwable -> La9
            short[] r2 = m6972()     // Catch: java.lang.Throwable -> La9
            r3 = 3517(0xdbd, float:4.928E-42)
            int r4 = androidx.startup.C1100.f126     // Catch: java.lang.Throwable -> La9
            r4 = r4 ^ (-257(0xfffffffffffffeff, float:NaN))
            r5 = 1645(0x66d, float:2.305E-42)
            java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La9
            androidx.loader.C1097.m2736(r2, r0)     // Catch: java.lang.Throwable -> La9
            r0 = 1864(0x748, float:2.612E-42)
        L9f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto La5;
                case 47483: goto Ld2;
                default: goto La4;
            }
        La4:
            goto L9f
        La5:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L9f
        La9:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3538(0xdd2, float:4.958E-42)
            int r4 = androidx.loader.C1094.f120
            r4 = r4 ^ 340(0x154, float:4.76E-43)
            r5 = 684(0x2ac, float:9.58E-43)
            java.lang.String r2 = androidx.startup.C1101.m3014(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        Ld2:
            return
    }

    private void showAtlasProgressDialog(java.lang.ref.WeakReference<android.content.Context> r5, kevin.fun.hook.KSHook.AtlasDownloadHolder r6, int r7) {
            r4 = this;
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r5)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1616(0x650, float:2.264E-42)
        L8:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L68;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 == 0) goto Le
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            boolean r2 = m7024(r4, r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto L36;
                case 500: goto L2a;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            if (r2 == 0) goto L27
            r1 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            r0 = 1864(0x748, float:2.612E-42)
        L2c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L32;
                case 47483: goto L68;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2c
        L36:
            android.app.Dialog r1 = new android.app.Dialog
            r2 = -16974643(0xfffffffffefcfccd, float:-1.6813904E38)
            int r3 = androidx.loader.C1098.f124
            r2 = r2 ^ r3
            r1.<init>(r0, r2)
            r6.dialog = r1
            android.app.Dialog r1 = m7058(r6)
            r2 = 0
            androidx.lifecycle.runtime.C1092.m2297(r1, r2)
            android.widget.FrameLayout r1 = m7087(r4, r0)
            android.widget.LinearLayout r0 = m7047(r4, r0, r6, r7)
            androidx.annotation.experimental.C1067.m579(r1, r0)
            android.app.Dialog r2 = m7058(r6)
            androidx.viewpager.C1108.m3545(r2, r1)
            android.app.Dialog r1 = m7058(r6)
            kevin.fun.hook.audio.C1114.m7909(r1)
            m7057(r4, r0)
        L67:
            return
        L68:
            m7029(r4)
            goto L67
    }

    private void showAtlasResult(android.content.Context r6, int r7, int r8) {
            r5 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L34;
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
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L33;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 < 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            java.lang.String r0 = "awpm4vYTwjFKz3HCPo"
            java.lang.String r0 = androidx.loader.C1096.m2685(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L33:
            return
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m6972()
            r2 = 3570(0xdf2, float:5.003E-42)
            int r3 = org.luckypray.dexkit.C1124.f434
            r3 = r3 ^ 662(0x296, float:9.28E-43)
            r4 = 2464(0x9a0, float:3.453E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1089.m2127(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r0, r7)
            short[] r1 = m6972()
            r2 = 3575(0xdf7, float:5.01E-42)
            int r3 = androidx.appcompat.resources.C1068.f94
            r3 = r3 ^ 522(0x20a, float:7.31E-43)
            r4 = 1287(0x507, float:1.803E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1084.m1796(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            r1 = 1864(0x748, float:2.612E-42)
        L6b:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L71;
                case 47384: goto Lb6;
                case 47417: goto L7b;
                case 47483: goto L77;
                default: goto L70;
            }
        L70:
            goto L6b
        L71:
            if (r7 >= r8) goto L77
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L6b
        L77:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L6b
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            short[] r1 = m6972()
            r2 = 3579(0xdfb, float:5.015E-42)
            int r3 = androidx.activity.C1064.f90
            r3 = r3 ^ 488(0x1e8, float:6.84E-43)
            r4 = 2410(0x96a, float:3.377E-42)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            int r1 = r8 - r7
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r0, r1)
            short[] r1 = m6972()
            r2 = 3581(0xdfd, float:5.018E-42)
            int r3 = androidx.lifecycle.process.C1087.f113
            r3 = r3 ^ (-620(0xfffffffffffffd94, float:NaN))
            r4 = 1581(0x62d, float:2.215E-42)
            java.lang.String r1 = androidx.core.C1072.m957(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
        Lb6:
            m7017(r5, r6, r0)
            goto L33
    }

    private void showDownloadDialog(android.content.Context r7) {
            r6 = this;
            boolean r1 = m7024(r6, r7)
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto La8;
                case 239: goto L14;
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
            android.app.Dialog r0 = new android.app.Dialog     // Catch: java.lang.Throwable -> L57
            r1 = -16974804(0xfffffffffefcfc2c, float:-1.681374E38)
            int r2 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L57
            r1 = r1 ^ r2
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L57
            r1 = 1
            androidx.lifecycle.runtime.C1092.m2297(r0, r1)     // Catch: java.lang.Throwable -> L57
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L57
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L57
            android.widget.FrameLayout r2 = m7087(r6, r7)     // Catch: java.lang.Throwable -> L57
            android.widget.LinearLayout r3 = m6995(r6, r7, r1)     // Catch: java.lang.Throwable -> L57
            androidx.annotation.experimental.C1067.m579(r2, r3)     // Catch: java.lang.Throwable -> L57
            androidx.viewpager.C1108.m3545(r0, r2)     // Catch: java.lang.Throwable -> L57
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda30 r4 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda30     // Catch: java.lang.Throwable -> L57
            r4.<init>(r6, r1)     // Catch: java.lang.Throwable -> L57
            androidx.emoji2.viewsintegration.C1079.m1483(r2, r4)     // Catch: java.lang.Throwable -> L57
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda31 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda31     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            com.tencent.mmkv.C1109.m3617(r3, r1)     // Catch: java.lang.Throwable -> L57
            kevin.fun.hook.audio.C1114.m7909(r0)     // Catch: java.lang.Throwable -> L57
            m6986(r6, r3)     // Catch: java.lang.Throwable -> L57
            r0 = 1740(0x6cc, float:2.438E-42)
        L4e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L54;
                case 54: goto L83;
                default: goto L53;
            }
        L53:
            goto L4e
        L54:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L4e
        L57:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3585(0xe01, float:5.024E-42)
            int r4 = androidx.lifecycle.process.C1088.f114
            r4 = r4 ^ (-118(0xffffffffffffff8a, float:NaN))
            r5 = 3187(0xc73, float:4.466E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            m7029(r6)
        L83:
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1864(0x748, float:2.612E-42)
        L89:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L8f;
                case 47384: goto La8;
                case 47417: goto L99;
                case 47483: goto L95;
                default: goto L8e;
            }
        L8e:
            goto L89
        L8f:
            if (r1 > 0) goto L95
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L89
        L95:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L89
        L99:
            java.lang.String r0 = "PqQzsJw"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        La8:
            return
    }

    private void showDownloadProgressDialog(java.lang.ref.WeakReference<android.content.Context> r5, kevin.fun.hook.KSHook.DownloadDialogHolder r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r5)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1616(0x650, float:2.264E-42)
        L8:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L90;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 == 0) goto Le
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            boolean r2 = m7024(r4, r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto L36;
                case 500: goto L2a;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            if (r2 == 0) goto L27
            r1 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            r0 = 1864(0x748, float:2.612E-42)
        L2c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L32;
                case 47483: goto L90;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2c
        L36:
            android.app.Dialog r1 = new android.app.Dialog
            r2 = -16974067(0xfffffffffefcff0d, float:-1.6814488E38)
            int r3 = org.luckypray.dexkit.C1125.f435
            r2 = r2 ^ r3
            r1.<init>(r0, r2)
            r6.dialog = r1
            android.app.Dialog r1 = m6992(r6)
            r2 = 0
            androidx.lifecycle.runtime.C1092.m2297(r1, r2)
            android.widget.FrameLayout r1 = m7087(r4, r0)
            android.widget.LinearLayout r0 = m6984(r4, r0, r6, r7, r8)
            androidx.annotation.experimental.C1067.m579(r1, r0)
            android.app.Dialog r2 = m6992(r6)
            androidx.viewpager.C1108.m3545(r2, r1)
            android.app.Dialog r1 = m6992(r6)
            kevin.fun.hook.audio.C1114.m7909(r1)
            m7057(r4, r0)
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L6e:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L76;
                case 45: goto L8f;
                case 76: goto L80;
                case 239: goto L7a;
                default: goto L75;
            }
        L75:
            goto L6e
        L76:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L6e
        L7a:
            if (r1 > 0) goto L76
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L6e
        L80:
            java.lang.String r0 = "ySaObMlbZUWZ6gFt"
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2067(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L8f:
            return
        L90:
            m7029(r4)
            goto L8f
    }

    private void showErrorToast(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            r7 = 0
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L11;
                case 239: goto L35;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r9 != 0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1740(0x6cc, float:2.438E-42)
        L17:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1d;
                case 54: goto L22;
                case 471: goto L34;
                case 500: goto L25;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            if (r1 > 0) goto L22
            r0 = 1833(0x729, float:2.569E-42)
            goto L17
        L22:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L17
        L25:
            java.lang.String r0 = "0ME49VYlYpPvE"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L34:
            return
        L35:
            android.widget.Toast r0 = new android.widget.Toast
            r0.<init>(r9)
            androidx.lifecycle.process.C1091.m2266(r0, r7)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            androidx.customview.C1074.m1119(r1, r7)
            int r2 = androidx.vectordrawable.C1103.f129
            r2 = r2 ^ 285(0x11d, float:4.0E-43)
            androidx.emoji2.C1080.m1542(r1, r2)
            int r3 = androidx.lifecycle.process.C1087.f113
            r3 = r3 ^ (-640(0xfffffffffffffd80, float:NaN))
            int r4 = m7045(r8, r9, r3)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r5 = r5 ^ 647(0x287, float:9.07E-43)
            int r6 = m7045(r8, r9, r5)
            int r3 = m7045(r8, r9, r3)
            int r5 = m7045(r8, r9, r5)
            androidx.drawerlayout.C1077.m1314(r1, r4, r6, r3, r5)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r4 = 769155(0xbbc83, float:1.077816E-39)
            int r5 = androidx.activity.C1062.f88
            r4 = r4 ^ r5
            androidx.lifecycle.livedata.C1085.m1879(r3, r4)
            int r4 = androidx.lifecycle.process.C1091.f117
            r4 = r4 ^ (-512(0xfffffffffffffe00, float:NaN))
            int r4 = m7045(r8, r9, r4)
            float r4 = (float) r4
            androidx.lifecycle.process.C1091.m2252(r3, r4)
            androidx.activity.C1065.m397(r1, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r9)
            androidx.lifecycle.process.C1087.m1946(r3, r10)
            int r4 = androidx.lifecycle.livedata.C1085.f111
            r4 = r4 ^ (-782(0xfffffffffffffcf2, float:NaN))
            kevin.fun.hook.webdav.C1118.m8517(r3, r4)
            r4 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r4)
            android.graphics.Typeface r4 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r3, r4)
            androidx.activity.C1064.m372(r1, r3)
            androidx.core.C1073.m1022(r0, r1)
            androidx.interpolator.C1082.m1705(r0, r2, r7, r7)
            androidx.viewpager.C1108.m3524(r0)
            goto L34
    }

    private void showSettingsDialog(android.content.Context r7, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r8) {
            r6 = this;
            boolean r1 = m7024(r6, r7)
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L80;
                case 239: goto L14;
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
            android.app.Dialog r0 = new android.app.Dialog     // Catch: java.lang.Throwable -> L57
            r1 = -16973926(0xfffffffffefcff9a, float:-1.6814631E38)
            int r2 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L57
            r1 = r1 ^ r2
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L57
            r1 = 1
            androidx.lifecycle.runtime.C1092.m2297(r0, r1)     // Catch: java.lang.Throwable -> L57
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L57
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L57
            android.widget.FrameLayout r2 = m7087(r6, r7)     // Catch: java.lang.Throwable -> L57
            android.widget.LinearLayout r3 = m7011(r6, r7, r1, r8)     // Catch: java.lang.Throwable -> L57
            androidx.annotation.experimental.C1067.m579(r2, r3)     // Catch: java.lang.Throwable -> L57
            androidx.viewpager.C1108.m3545(r0, r2)     // Catch: java.lang.Throwable -> L57
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda22 r4 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda22     // Catch: java.lang.Throwable -> L57
            r4.<init>(r6, r1)     // Catch: java.lang.Throwable -> L57
            androidx.emoji2.viewsintegration.C1079.m1483(r2, r4)     // Catch: java.lang.Throwable -> L57
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda33 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda33     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            com.tencent.mmkv.C1109.m3617(r3, r1)     // Catch: java.lang.Throwable -> L57
            kevin.fun.hook.audio.C1114.m7909(r0)     // Catch: java.lang.Throwable -> L57
            m6986(r6, r3)     // Catch: java.lang.Throwable -> L57
            r0 = 1740(0x6cc, float:2.438E-42)
        L4e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L54;
                case 54: goto L80;
                default: goto L53;
            }
        L53:
            goto L4e
        L54:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L4e
        L57:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3608(0xe18, float:5.056E-42)
            int r4 = androidx.emoji2.C1080.f106
            r4 = r4 ^ 359(0x167, float:5.03E-43)
            r5 = 679(0x2a7, float:9.51E-43)
            java.lang.String r2 = androidx.viewpager.C1108.m3518(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        L80:
            return
    }

    private void showSuccessToast(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            r7 = 0
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L11;
                case 239: goto L35;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r9 != 0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            int r1 = androidx.loader.C1096.m2651()
            r0 = 1740(0x6cc, float:2.438E-42)
        L17:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1d;
                case 54: goto L22;
                case 471: goto L34;
                case 500: goto L25;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            if (r1 < 0) goto L22
            r0 = 1833(0x729, float:2.569E-42)
            goto L17
        L22:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L17
        L25:
            java.lang.String r0 = "eLU64"
            java.lang.String r0 = androidx.customview.C1074.m1077(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L34:
            return
        L35:
            android.widget.Toast r0 = new android.widget.Toast
            r0.<init>(r9)
            androidx.lifecycle.process.C1091.m2266(r0, r7)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            androidx.customview.C1074.m1119(r1, r7)
            int r2 = androidx.vectordrawable.C1105.f131
            r2 = r2 ^ 375(0x177, float:5.25E-43)
            androidx.emoji2.C1080.m1542(r1, r2)
            int r3 = androidx.viewpager.C1108.f134
            r3 = r3 ^ (-504(0xfffffffffffffe08, float:NaN))
            int r4 = m7045(r8, r9, r3)
            int r5 = androidx.interpolator.C1081.f107
            r5 = r5 ^ (-259(0xfffffffffffffefd, float:NaN))
            int r6 = m7045(r8, r9, r5)
            int r3 = m7045(r8, r9, r3)
            int r5 = m7045(r8, r9, r5)
            androidx.drawerlayout.C1077.m1314(r1, r4, r6, r3, r5)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r4 = 11752128(0xb352c0, float:1.6468239E-38)
            int r5 = androidx.lifecycle.process.C1087.f113
            r4 = r4 ^ r5
            androidx.lifecycle.livedata.C1085.m1879(r3, r4)
            int r4 = androidx.customview.C1074.f100
            r4 = r4 ^ 231(0xe7, float:3.24E-43)
            int r4 = m7045(r8, r9, r4)
            float r4 = (float) r4
            androidx.lifecycle.process.C1091.m2252(r3, r4)
            androidx.activity.C1065.m397(r1, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r9)
            androidx.lifecycle.process.C1087.m1946(r3, r10)
            int r4 = androidx.lifecycle.process.C1090.f116
            r4 = r4 ^ 431(0x1af, float:6.04E-43)
            kevin.fun.hook.webdav.C1118.m8517(r3, r4)
            r4 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r4)
            android.graphics.Typeface r4 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r3, r4)
            androidx.activity.C1064.m372(r1, r3)
            androidx.core.C1073.m1022(r0, r1)
            androidx.interpolator.C1082.m1705(r0, r2, r7, r7)
            androidx.viewpager.C1108.m3524(r0)
            goto L34
    }

    private void showToast(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L3d;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r4 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            boolean r1 = m7024(r3, r4)
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
            if (r1 == 0) goto L21
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
                case 47483: goto L3d;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            android.os.Handler r0 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda24 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda24
            r1.<init>(r4, r5)
            androidx.activity.C1062.m178(r0, r1)
        L3c:
            return
        L3d:
            int r1 = androidx.interpolator.C1083.m1725()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L44:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L4c;
                case 45: goto L3c;
                case 76: goto L56;
                case 239: goto L50;
                default: goto L4b;
            }
        L4b:
            goto L44
        L4c:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L44
        L50:
            if (r1 < 0) goto L4c
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L44
        L56:
            java.lang.String r0 = "zgfVG8b5cJ"
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2359(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L3c
    }

    private void showVideoQualityDialog(android.content.Context r7) {
            r6 = this;
            boolean r1 = m7024(r6, r7)
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
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            m7029(r6)
            int r1 = androidx.activity.C1062.m182()
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
            java.lang.String r0 = "vcH1Y566Jd3f49w2Lbw9Q"
            java.lang.String r0 = androidx.activity.C1064.m367(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            kevin.fun.hook.KSHook$ParseResult r1 = m6994(r6)     // Catch: java.lang.Throwable -> L98
            java.util.List r1 = m7093(r1)     // Catch: java.lang.Throwable -> L98
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L98
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda38 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda38     // Catch: java.lang.Throwable -> L98
            r1.<init>()     // Catch: java.lang.Throwable -> L98
            androidx.documentfile.C1076.m1257(r0, r1)     // Catch: java.lang.Throwable -> L98
            boolean r1 = m7072(r6, r0)     // Catch: java.lang.Throwable -> L98
            android.app.Dialog r2 = new android.app.Dialog     // Catch: java.lang.Throwable -> L98
            r3 = 16973827(0x1030003, float:2.4060908E-38)
            int r4 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L98
            r3 = r3 ^ r4
            r2.<init>(r7, r3)     // Catch: java.lang.Throwable -> L98
            r3 = 1
            androidx.lifecycle.runtime.C1092.m2297(r2, r3)     // Catch: java.lang.Throwable -> L98
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L98
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L98
            android.widget.FrameLayout r4 = m7087(r6, r7)     // Catch: java.lang.Throwable -> L98
            android.widget.LinearLayout r0 = m6965(r6, r7, r3, r0, r1)     // Catch: java.lang.Throwable -> L98
            androidx.annotation.experimental.C1067.m579(r4, r0)     // Catch: java.lang.Throwable -> L98
            androidx.viewpager.C1108.m3545(r2, r4)     // Catch: java.lang.Throwable -> L98
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda39 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda39     // Catch: java.lang.Throwable -> L98
            r1.<init>(r6, r3)     // Catch: java.lang.Throwable -> L98
            androidx.emoji2.viewsintegration.C1079.m1483(r4, r1)     // Catch: java.lang.Throwable -> L98
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda40 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda40     // Catch: java.lang.Throwable -> L98
            r1.<init>()     // Catch: java.lang.Throwable -> L98
            com.tencent.mmkv.C1109.m3617(r0, r1)     // Catch: java.lang.Throwable -> L98
            kevin.fun.hook.audio.C1114.m7909(r2)     // Catch: java.lang.Throwable -> L98
            m6986(r6, r0)     // Catch: java.lang.Throwable -> L98
            r0 = 1864(0x748, float:2.612E-42)
        L8e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L94;
                case 47483: goto L3a;
                default: goto L93;
            }
        L93:
            goto L8e
        L94:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L8e
        L98:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3638(0xe36, float:5.098E-42)
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ 5
            r5 = 2299(0x8fb, float:3.222E-42)
            java.lang.String r2 = androidx.drawerlayout.C1077.m1343(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            m7029(r6)
            goto L3a
    }

    private void startDexKitAsync(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r5, android.content.Context r6) {
            r4 = this;
            r2 = 0
            java.lang.String r0 = "ۢۥ"
        L4:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1747873: goto L18;
                case 1753697: goto L12;
                default: goto Lb;
            }
        Lb:
            long r2 = m7048(r4, r6)
            java.lang.String r0 = "ۦۣۨ"
            goto L4
        L12:
            m7052(r4, r5, r6, r2)
            java.lang.String r0 = "۠ۦۧ"
            goto L4
        L18:
            return
    }

    private void startDexKitAsync(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4, android.content.Context r5, long r6) {
            r3 = this;
            java.lang.Thread r0 = new java.lang.Thread
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda2 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda2
            r1.<init>(r6, r5, r4)
            r0.<init>(r1)
            androidx.emoji2.viewsintegration.C1078.m1394(r0)
            int r1 = androidx.activity.C1063.m300()
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L30;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r1 > 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            java.lang.String r0 = "4dj"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    private void startDownload(android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r13)
            int r1 = androidx.vectordrawable.C1105.f131
            r1 = r1 ^ 356(0x164, float:4.99E-43)
            r2 = 0
            boolean r2 = kevin.fun.hook.C1120.m8661(r0, r2, r1)
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L5c;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r2 != 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r13)
            r2 = 1
            boolean r1 = kevin.fun.hook.C1120.m8661(r0, r2, r1)
            r0 = 1740(0x6cc, float:2.438E-42)
        L28:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2e;
                case 54: goto L33;
                case 471: goto L5c;
                case 500: goto L36;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            if (r1 != 0) goto L33
            r0 = 1833(0x729, float:2.569E-42)
            goto L28
        L33:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L28
        L36:
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1864(0x748, float:2.612E-42)
        L3c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L42;
                case 47384: goto L5b;
                case 47417: goto L4c;
                case 47483: goto L48;
                default: goto L41;
            }
        L41:
            goto L3c
        L42:
            if (r1 < 0) goto L48
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3c
        L48:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3c
        L4c:
            java.lang.String r0 = "Qy9xR8"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L5b:
            return
        L5c:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r14)
            kevin.fun.hook.KSHook$DownloadDialogHolder r3 = new kevin.fun.hook.KSHook$DownloadDialogHolder
            r0 = 0
            r3.<init>(r0)
            long r9 = androidx.lifecycle.process.C1089.m2100()
            android.os.Handler r6 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda14 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda14
            r1 = r13
            r4 = r20
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.activity.C1062.m178(r6, r0)
            java.util.concurrent.ExecutorService r12 = m7016()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda15 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda15
            r1 = r13
            r4 = r19
            r5 = r17
            r6 = r18
            r7 = r15
            r8 = r16
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            androidx.activity.C1063.m244(r12, r0)
            goto L5b
    }

    private void startVideoInfoFetch(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = m7015(r4)
            r1 = 0
            r2 = 1
            boolean r1 = kevin.fun.hook.C1120.m8661(r0, r1, r2)
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L2e;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 != 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            short[] r0 = m6972()
            r1 = 3660(0xe4c, float:5.129E-42)
            int r2 = androidx.versionedparcelable.C1107.f133
            r2 = r2 ^ 648(0x288, float:9.08E-43)
            r3 = 1040(0x410, float:1.457E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r1, r2, r3)
            m7018(r4, r5, r0)
        L2d:
            return
        L2e:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            java.util.concurrent.ExecutorService r1 = m7016()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda11 r2 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda11
            r2.<init>(r4, r0, r6)
            androidx.activity.C1063.m244(r1, r2)
            int r1 = androidx.interpolator.C1082.m1718()
            r0 = 1740(0x6cc, float:2.438E-42)
        L45:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4b;
                case 54: goto L50;
                case 471: goto L2d;
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
            java.lang.String r0 = "MCa5oZ1flbCn"
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10497(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L2d
    }

    private void updateAtlasProgress(kevin.fun.hook.KSHook.AtlasDownloadHolder r9, int r10, int r11, long r12) {
            r8 = this;
            android.os.Handler r6 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda28 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda28
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4)
            androidx.activity.C1062.m178(r6, r0)
            int r1 = androidx.appcompat.resources.C1068.m612()
            r0 = 1616(0x650, float:2.264E-42)
        L16:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1c;
                case 49: goto L1f;
                case 204: goto L24;
                case 239: goto L33;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L16
        L1f:
            if (r1 < 0) goto L1c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L16
        L24:
            java.lang.String r0 = "5GVgbef1cZXWnFEYNxTlLiA0xCYo"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L33:
            return
    }

    private void updateCachedId(java.lang.String r4) {
            r3 = this;
            java.lang.Object r1 = m6969(r3)
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r0 = m7044(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2c
            boolean r2 = org.luckypray.dexkit.C1125.m10633(r4, r0)     // Catch: java.lang.Throwable -> L2c
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L2a;
                default: goto L1a;
            }     // Catch: java.lang.Throwable -> L2c
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r2 != 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.util.concurrent.atomic.AtomicReference r0 = m7044(r3)     // Catch: java.lang.Throwable -> L2c
            androidx.vectordrawable.C1104.m3224(r0, r4)     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    private void updateCurrentResult(kevin.fun.hook.KSHook.ParseResult r6) {
            r5 = this;
            monitor-enter(r5)
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m7027(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L28;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L236
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
            java.lang.String r0 = m7027(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L25;
                case 54: goto L2c;
                default: goto L24;
            }     // Catch: java.lang.Throwable -> L236
        L24:
            goto L1f
        L25:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1f
        L28:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L236
        L2c:
            r2.userName = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m6975(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 1864(0x748, float:2.612E-42)
        L38:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3e;
                case 47384: goto L7e;
                case 47417: goto L48;
                case 47483: goto L44;
                default: goto L3d;
            }     // Catch: java.lang.Throwable -> L236
        L3d:
            goto L38
        L3e:
            if (r1 == 0) goto L44
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L38
        L44:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L38
        L48:
            java.lang.String r0 = m6975(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L4f:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L57;
                case 239: goto L7a;
                default: goto L56;
            }     // Catch: java.lang.Throwable -> L236
        L56:
            goto L4f
        L57:
            r2.kwaiID = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            long r2 = m7043(r6)     // Catch: java.lang.Throwable -> L236
            r0.viewCount = r2     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m7114(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 48891(0xbefb, float:6.8511E-41)
        L6e:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L76;
                case 53: goto L9c;
                case 503: goto L83;
                case 32495: goto L89;
                default: goto L75;
            }     // Catch: java.lang.Throwable -> L236
        L75:
            goto L6e
        L76:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L6e
        L7a:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L4f
        L7e:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L236
            goto L57
        L83:
            if (r1 == 0) goto L76
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L6e
        L89:
            java.lang.String r0 = m7114(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 49666(0xc202, float:6.9597E-41)
        L90:
            r3 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L98;
                case 50: goto Lac;
                default: goto L97;
            }     // Catch: java.lang.Throwable -> L236
        L97:
            goto L90
        L98:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L90
        L9c:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L236
            r1 = 3672(0xe58, float:5.146E-42)
            int r3 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L236
            r3 = r3 ^ 86
            r4 = 2252(0x8cc, float:3.156E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L236
        Lac:
            r2.publishTime = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m7086(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 49790(0xc27e, float:6.977E-41)
        Lb9:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 18: goto Lc1;
                case 51: goto Lde;
                case 84: goto Lcb;
                case 241: goto Lc5;
                default: goto Lc0;
            }     // Catch: java.lang.Throwable -> L236
        Lc0:
            goto Lb9
        Lc1:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lb9
        Lc5:
            if (r1 == 0) goto Lc1
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lb9
        Lcb:
            java.lang.String r0 = m7086(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 49914(0xc2fa, float:6.9944E-41)
        Ld2:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 497: goto Lda;
                case 1711: goto Lee;
                default: goto Ld9;
            }     // Catch: java.lang.Throwable -> L236
        Ld9:
            goto Ld2
        Lda:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto Ld2
        Lde:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> L236
            r1 = 3676(0xe5c, float:5.151E-42)
            int r3 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L236
            r3 = r3 ^ (-447(0xfffffffffffffe41, float:NaN))
            r4 = 2827(0xb0b, float:3.961E-42)
            java.lang.String r0 = androidx.loader.C1097.m2734(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L236
        Lee:
            r2.videoCaption = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m7030(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 50689(0xc601, float:7.103E-41)
        Lfb:
            r3 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 19: goto L103;
                case 45: goto L13b;
                case 50: goto L109;
                case 76: goto L10d;
                default: goto L102;
            }     // Catch: java.lang.Throwable -> L236
        L102:
            goto Lfb
        L103:
            if (r1 == 0) goto L109
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto Lfb
        L109:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto Lfb
        L10d:
            java.lang.String r0 = m7030(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 50813(0xc67d, float:7.1204E-41)
        L114:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 18: goto L11c;
                case 243: goto L137;
                default: goto L11b;
            }     // Catch: java.lang.Throwable -> L236
        L11b:
            goto L114
        L11c:
            r2.coverImageUrl = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m6970(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 51588(0xc984, float:7.229E-41)
        L129:
            r3 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L131;
                case 54: goto L140;
                case 87: goto L172;
                case 116: goto L144;
                default: goto L130;
            }     // Catch: java.lang.Throwable -> L236
        L130:
            goto L129
        L131:
            if (r1 == 0) goto L140
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L129
        L137:
            r1 = 50844(0xc69c, float:7.1248E-41)
            goto L114
        L13b:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L236
            goto L11c
        L140:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L129
        L144:
            java.lang.String r0 = m6970(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 51712(0xca00, float:7.2464E-41)
        L14b:
            r3 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L153;
                case 15: goto L152;
                case 16: goto L152;
                case 17: goto L16e;
                default: goto L152;
            }     // Catch: java.lang.Throwable -> L236
        L152:
            goto L14b
        L153:
            r2.backgroundMusicUrl = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.lang.String r1 = m7002(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 51836(0xca7c, float:7.2638E-41)
        L160:
            r3 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 241: goto L168;
                case 1963: goto L177;
                case 1992: goto L18e;
                case 2025: goto L17b;
                default: goto L167;
            }     // Catch: java.lang.Throwable -> L236
        L167:
            goto L160
        L168:
            if (r1 == 0) goto L177
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L160
        L16e:
            r1 = 51743(0xca1f, float:7.2507E-41)
            goto L14b
        L172:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L236
            goto L153
        L177:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L160
        L17b:
            java.lang.String r0 = m7002(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 52611(0xcd83, float:7.3724E-41)
        L182:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 23: goto L18a;
                case 54: goto L192;
                default: goto L189;
            }     // Catch: java.lang.Throwable -> L236
        L189:
            goto L182
        L18a:
            r1 = 52642(0xcda2, float:7.3767E-41)
            goto L182
        L18e:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L236
        L192:
            r2.backupVideoUrl = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.util.List r1 = m7093(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 52735(0xcdff, float:7.3897E-41)
        L19f:
            r3 = 52752(0xce10, float:7.3921E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L1a7;
                case 45: goto L1c4;
                case 1007: goto L1ab;
                case 7927: goto L1b1;
                default: goto L1a6;
            }     // Catch: java.lang.Throwable -> L236
        L1a6:
            goto L19f
        L1a7:
            r0 = 52797(0xce3d, float:7.3984E-41)
            goto L19f
        L1ab:
            if (r1 == 0) goto L1a7
            r0 = 53479(0xd0e7, float:7.494E-41)
            goto L19f
        L1b1:
            java.util.List r0 = m7093(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 53510(0xd106, float:7.4983E-41)
        L1b8:
            r3 = 53527(0xd117, float:7.5007E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L1c0;
                case 50: goto L1c9;
                default: goto L1bf;
            }     // Catch: java.lang.Throwable -> L236
        L1bf:
            goto L1b8
        L1c0:
            r1 = 53541(0xd125, float:7.5027E-41)
            goto L1b8
        L1c4:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L236
            r0.<init>()     // Catch: java.lang.Throwable -> L236
        L1c9:
            r2.videoList = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r2 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            java.util.List r1 = m7090(r6)     // Catch: java.lang.Throwable -> L236
            r0 = 53634(0xd182, float:7.5157E-41)
        L1d6:
            r3 = 53651(0xd193, float:7.5181E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L1de;
                case 50: goto L1e4;
                case 76: goto L1e8;
                case 83: goto L1fb;
                default: goto L1dd;
            }     // Catch: java.lang.Throwable -> L236
        L1dd:
            goto L1d6
        L1de:
            if (r1 == 0) goto L1e4
            r0 = 53727(0xd1df, float:7.5288E-41)
            goto L1d6
        L1e4:
            r0 = 53696(0xd1c0, float:7.5244E-41)
            goto L1d6
        L1e8:
            java.util.List r0 = m7090(r6)     // Catch: java.lang.Throwable -> L236
            r1 = 53758(0xd1fe, float:7.5331E-41)
        L1ef:
            r3 = 53775(0xd20f, float:7.5355E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 1009: goto L1f7;
                case 1703: goto L200;
                default: goto L1f6;
            }     // Catch: java.lang.Throwable -> L236
        L1f6:
            goto L1ef
        L1f7:
            r1 = 54440(0xd4a8, float:7.6287E-41)
            goto L1ef
        L1fb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L236
            r0.<init>()     // Catch: java.lang.Throwable -> L236
        L200:
            r2.atlasImageUrls = r0     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r5)     // Catch: java.lang.Throwable -> L236
            kevin.fun.hook.KSHook$MediaType r1 = m7111(r6)     // Catch: java.lang.Throwable -> L236
            r0.currentMediaType = r1     // Catch: java.lang.Throwable -> L236
            monitor-exit(r5)
            int r1 = androidx.emoji2.C1080.m1539()
            r0 = 54533(0xd505, float:7.6417E-41)
        L214:
            r2 = 54550(0xd516, float:7.6441E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 19: goto L21c;
                case 50: goto L222;
                case 85: goto L235;
                case 116: goto L226;
                default: goto L21b;
            }
        L21b:
            goto L214
        L21c:
            if (r1 < 0) goto L222
            r0 = 54626(0xd562, float:7.6547E-41)
            goto L214
        L222:
            r0 = 54595(0xd543, float:7.6504E-41)
            goto L214
        L226:
            java.lang.String r0 = "9bFSLNwqW"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L235:
            return
        L236:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L236
            throw r0
    }

    private void updateDownloadProgress(kevin.fun.hook.KSHook.DownloadDialogHolder r9, int r10, int r11, long r12) {
            r8 = this;
            r1 = 0
            java.lang.String r3 = "ۣۧۧ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746873: goto L14;
                case 1753544: goto L29;
                case 1753601: goto L1b;
                default: goto Lc;
            }
        Lc:
            android.os.Handler r0 = m7088()
            java.lang.String r1 = "ۦۥ۠"
            r3 = r1
            goto L5
        L14:
            androidx.activity.C1062.m178(r0, r2)
            java.lang.String r1 = "ۦۣۥ"
            r3 = r1
            goto L5
        L1b:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda37 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda37
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r3 = "۟ۥ۟"
            r2 = r1
            goto L5
        L29:
            return
    }

    /* JADX INFO: renamed from: ۟۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m6962() {
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
            java.lang.Class<?> r0 = kevin.fun.hook.KSHook.mmkvClass
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

    /* JADX INFO: renamed from: ۟۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m6963(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r3 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r3
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r4 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r4
            r2.handleSharePanelDialog(r3, r4)
        L1d:
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "8jxr7cYqhnwukgaCyuzZJfo0"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3639(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static void m6964(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L45;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = (java.io.File) r4
            java.lang.String r5 = (java.lang.String) r5
            kevin.fun.hook.KSHook$DownloadProgressListener r6 = (kevin.fun.hook.KSHook.DownloadProgressListener) r6
            r2.downloadFileWithRetry(r3, r4, r5, r6)
        L21:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1740(0x6cc, float:2.438E-42)
        L27:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2d;
                case 54: goto L32;
                case 471: goto L44;
                case 500: goto L35;
                default: goto L2c;
            }
        L2c:
            goto L27
        L2d:
            if (r1 < 0) goto L32
            r0 = 1833(0x729, float:2.569E-42)
            goto L27
        L32:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L27
        L35:
            java.lang.String r0 = "DQsOvd7rWvfxwPFqW8BCy5d"
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2259(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L44:
            return
        L45:
            r0 = 1864(0x748, float:2.612E-42)
        L47:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4d;
                case 47483: goto L21;
                default: goto L4c;
            }
        L4c:
            goto L47
        L4d:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L47
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m6965(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, boolean r6) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.util.List r5 = (java.util.List) r5
            android.widget.LinearLayout r0 = r2.createQualityPanel(r3, r4, r5, r6)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m6966(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۟۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static void m6967(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            r2.updateCachedId(r3)
        L1b:
            int r1 = kevin.fun.hook.audio.C1117.m8167()
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
            java.lang.String r0 = "tf0Zs"
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1844(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
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

    /* JADX INFO: renamed from: ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6968(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r2.handleOptionClick(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m6969(java.lang.Object r2) {
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.Object r0 = r2.idLock
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

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6970(java.lang.Object r2) {
            int r1 = androidx.interpolator.C1081.m1643()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.backgroundMusicUrl
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

    /* JADX INFO: renamed from: ۣ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m6971(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.loader.C1096.m2651()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.app.Dialog r4 = (android.app.Dialog) r4
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r5 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r5
            android.widget.LinearLayout r0 = r2.createShareBottomBar(r3, r4, r5)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6972() {
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
            short[] r0 = kevin.fun.hook.KSHook.f365short
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

    /* JADX INFO: renamed from: ۟۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static de.robv.android.xposed.XC_MethodHook.Unhook m6973(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.startup.C1100.m2972()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            de.robv.android.xposed.XC_MethodHook$Unhook r0 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۟۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m6974(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.emoji2.C1080.m1539()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            kevin.fun.hook.KSHook$AtlasDownloadHolder r4 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r4
            r2.showAtlasProgressDialog(r3, r4, r5)
        L1d:
            int r1 = androidx.lifecycle.process.C1089.m2142()
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
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "4f41y9w"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6975(java.lang.Object r2) {
            int r1 = androidx.loader.C1096.m2651()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.kwaiID
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

    /* JADX INFO: renamed from: ۟ۡۤۥۣ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m6976(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            kevin.fun.hook.KSHook$AtlasDownloadHolder r2 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r2
            android.widget.TextView r0 = r2.progressText
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

    /* JADX INFO: renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6977(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r2.fetchHtmlContent(r3)
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

    /* JADX INFO: renamed from: ۟ۡۧۦۤ, reason: not valid java name and contains not printable characters */
    public static java.io.File m6978(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r0 = r2.prepareSoFile(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۢ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m6979(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.C1120.m8652()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.handleParseError(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m6980(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.core.ktx.C1071.m854()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.downloadAtlasImages(r3)
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

    /* JADX INFO: renamed from: ۟ۢ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m6981(java.lang.Object r2) {
            int r1 = androidx.startup.C1101.m2984()
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
            kevin.fun.hook.KSHook$DownloadDialogHolder r2 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r2
            android.widget.TextView r0 = r2.progressText
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

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m6982(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            android.content.Context r4 = (android.content.Context) r4
            kevin.fun.hook.DexKitFinder.findAllKS(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m6983(java.lang.Object r2) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            kevin.fun.hook.KSHook$VideoInfo r2 = (kevin.fun.hook.KSHook.VideoInfo) r2
            int r0 = r2.height
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

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m6984(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L23;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.KSHook$DownloadDialogHolder r4 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            android.widget.LinearLayout r0 = r2.createProgressPanel(r3, r4, r5, r6)
        L22:
            return r0
        L23:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L26:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2c;
                case 54: goto L22;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L26
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m6985(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.appcompat.resources.C1068.m612()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r5 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r5
            android.widget.LinearLayout r0 = r2.createAdaptRow(r3, r4, r5)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6986(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.view.View r3 = (android.view.View) r3
            r2.playBottomBounceIn(r3)
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

    /* JADX INFO: renamed from: ۟ۢۧۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6987(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r0 = r2.hasShareBottomBar(r3)
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

    /* JADX INFO: renamed from: ۟ۢۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m6988(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = org.luckypray.dexkit.C1124.m10581()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L22;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.content.Context r4 = (android.content.Context) r4
            android.app.Dialog r5 = (android.app.Dialog) r5
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r6 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r6
            r2.modifySharePanel(r3, r4, r5, r6)
        L21:
            return
        L22:
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L21;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6989(java.lang.Object r2) {
            int r1 = androidx.loader.C1099.m2876()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r0 = r2.findSoPath()
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

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m6990(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            kevin.fun.hook.KSHook$ParseResult r4 = (kevin.fun.hook.KSHook.ParseResult) r4
            r2.extractSimpleMp4Urls(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m6991(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            r2.initHookEnvironment(r3)
        L1b:
            int r1 = androidx.activity.C1063.m300()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3a;
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
            java.lang.String r0 = "aQyIrzqOCArhb7Rzw"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
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
                case 47483: goto L1b;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m6992(java.lang.Object r2) {
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
            kevin.fun.hook.KSHook$DownloadDialogHolder r2 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r2
            android.app.Dialog r0 = r2.dialog
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

    /* JADX INFO: renamed from: ۣ۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6993() {
            int r1 = androidx.core.ktx.C1071.m854()
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
            java.lang.String r0 = kevin.fun.hook.KSHook.mModulePath
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

    /* JADX INFO: renamed from: ۣ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook.ParseResult m6994(java.lang.Object r2) {
            int r1 = androidx.startup.C1101.m2984()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            kevin.fun.hook.KSHook$ParseResult r0 = r2.currentResult
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

    /* JADX INFO: renamed from: ۣ۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m6995(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            android.widget.LinearLayout r0 = r2.createDownloadPanel(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static de.robv.android.xposed.XC_MethodHook.Unhook m6996(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            de.robv.android.xposed.XC_MethodHook$Unhook r0 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r2, r3, r4, r5)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static void m6997(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L43;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            r2.copyToClipboard(r3, r4, r5)
        L1f:
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L42;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r1 < 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.String r0 = "Too0831bK3QPgETqiSV93esJwzCg"
            java.lang.String r0 = androidx.interpolator.C1081.m1619(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L42:
            return
        L43:
            r0 = 1864(0x748, float:2.612E-42)
        L45:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4b;
                case 47483: goto L1f;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L45
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static void m6998(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.versionedparcelable.C1107.m3467()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            kevin.fun.hook.KSHook$ParseResult r4 = (kevin.fun.hook.KSHook.ParseResult) r4
            r2.extractAtlasUrls(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۤ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m6999(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            r2.preHookShareObjectId(r3)
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

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m7000(java.lang.Object r2, java.lang.Object r3) {
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.downloadCover(r3)
        L1b:
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            java.lang.String r0 = "WPvUTMbOU3i0efhcLsHDiMf"
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2359(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
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

    /* JADX INFO: renamed from: ۟ۤۡۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7001(java.lang.Object r2, int r3, long r4) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r0 = r2.formatSpeed(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۤۢ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7002(java.lang.Object r2) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.backupVideoUrl
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

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7003(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L20;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = (java.io.File) r4
            kevin.fun.hook.KSHook$DownloadProgressListener r5 = (kevin.fun.hook.KSHook.DownloadProgressListener) r5
            r2.downloadFile(r3, r4, r5)
        L1f:
            return
        L20:
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L1f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m7004(java.lang.Object r2, int r3, int r4) {
            int r1 = androidx.startup.C1101.m2984()
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
            kevin.fun.hook.KSHook$DownloadProgressListener r2 = (kevin.fun.hook.KSHook.DownloadProgressListener) r2
            r2.onProgress(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7005(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.app.Dialog r3 = (android.app.Dialog) r3
            r2.dismissDialog(r3)
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

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7006(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.loadDexKitSo(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7007(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            kevin.fun.hook.KSHook$VideoInfo r5 = (kevin.fun.hook.KSHook.VideoInfo) r5
            android.view.View r0 = r2.createVideoQualityItem(r3, r4, r5)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static void m7008(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, long r20, java.lang.Object r22) {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L5d;
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
            r0 = r12
            kevin.fun.hook.KSHook r0 = (kevin.fun.hook.KSHook) r0
            r1 = r13
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            r2 = r14
            kevin.fun.hook.KSHook$DownloadDialogHolder r2 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r2
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            r4 = r16
            java.lang.String r4 = (java.lang.String) r4
            r5 = r17
            java.lang.String r5 = (java.lang.String) r5
            r6 = r18
            java.lang.String r6 = (java.lang.String) r6
            r7 = r19
            java.lang.String r7 = (java.lang.String) r7
            r10 = r22
            java.lang.String r10 = (java.lang.String) r10
            r8 = r20
            r0.performDownload(r1, r2, r3, r4, r5, r6, r7, r8, r10)
        L39:
            int r1 = androidx.interpolator.C1081.m1643()
            r0 = 1740(0x6cc, float:2.438E-42)
        L3f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L45;
                case 54: goto L4a;
                case 471: goto L5c;
                case 500: goto L4d;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            if (r1 > 0) goto L4a
            r0 = 1833(0x729, float:2.569E-42)
            goto L3f
        L4a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3f
        L4d:
            java.lang.String r0 = "yudGhFAspLlU78T"
            java.lang.String r0 = androidx.appcompat.C1069.m702(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L5c:
            return
        L5d:
            r0 = 1864(0x748, float:2.612E-42)
        L5f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L65;
                case 47483: goto L39;
                default: goto L64;
            }
        L64:
            goto L5f
        L65:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L5f
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int m7009(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            java.lang.String r3 = (java.lang.String) r3
            int r0 = de.robv.android.xposed.XposedHelpers.getIntField(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۤۦۦۤ, reason: not valid java name and contains not printable characters */
    public static void m7010(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.showDownloadDialog(r3)
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

    /* JADX INFO: renamed from: ۟ۤۦۧۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7011(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r5 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r5
            android.widget.LinearLayout r0 = r2.createSettingsPanel(r3, r4, r5)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7012(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1096.m2651()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            kevin.fun.hook.KSHook$ParseResult r4 = (kevin.fun.hook.KSHook.ParseResult) r4
            r2.extractVideoUrls(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m7013(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.core.C1073.m1015()
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
            java.lang.String r3 = (java.lang.String) r3
            de.robv.android.xposed.XposedHelpers.setObjectField(r2, r3, r4)
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
            java.lang.String r0 = "e7C"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
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

    /* JADX INFO: renamed from: ۟ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7014(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.emoji2.C1080.m1539()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.KSHook$DownloadDialogHolder r4 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r4
            android.widget.LinearLayout r0 = r2.createProgressContainer(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicInteger m7015(java.lang.Object r2) {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.util.concurrent.atomic.AtomicInteger r0 = r2.currentState
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

    /* JADX INFO: renamed from: ۟ۥۣۢۨ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.ExecutorService m7016() {
            int r1 = androidx.loader.C1098.m2793()
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
            java.util.concurrent.ExecutorService r0 = kevin.fun.hook.KSHook.DOWNLOAD_EXECUTOR
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

    /* JADX INFO: renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static void m7017(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.startup.C1101.m2984()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.showSuccessToast(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static void m7018(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.viewpager.C1108.m3542()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.showToast(r3, r4)
        L1d:
            int r1 = androidx.loader.C1097.m2731()
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
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "5Tc4vVGW"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7019(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r2.decodeUnicode(r3)
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

    /* JADX INFO: renamed from: ۟ۥۦۤ۟, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.BlockingQueue m7020() {
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
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = kevin.fun.hook.KSHook.WORK_QUEUE
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

    /* JADX INFO: renamed from: ۟ۥۨۧۧ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7021(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            android.widget.TextView r0 = r2.buildInfoLine(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۦ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m7022(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1064.m377()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.saveVersionInfo(r3)
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

    /* JADX INFO: renamed from: ۟ۦۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m7023(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L53;
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
            r0 = r8
            kevin.fun.hook.KSHook r0 = (kevin.fun.hook.KSHook) r0
            r1 = r9
            android.content.Context r1 = (android.content.Context) r1
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            r6 = r14
            java.lang.String r6 = (java.lang.String) r6
            r7 = r15
            java.lang.String r7 = (java.lang.String) r7
            r0.startDownload(r1, r2, r3, r4, r5, r6, r7)
        L2f:
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 1740(0x6cc, float:2.438E-42)
        L35:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3b;
                case 54: goto L40;
                case 471: goto L52;
                case 500: goto L43;
                default: goto L3a;
            }
        L3a:
            goto L35
        L3b:
            if (r1 < 0) goto L40
            r0 = 1833(0x729, float:2.569E-42)
            goto L35
        L40:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L35
        L43:
            java.lang.String r0 = "JylaL93ODIiVsES"
            java.lang.String r0 = androidx.loader.C1094.m2472(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L52:
            return
        L53:
            r0 = 1864(0x748, float:2.612E-42)
        L55:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5b;
                case 47483: goto L2f;
                default: goto L5a;
            }
        L5a:
            goto L55
        L5b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L55
    }

    /* JADX INFO: renamed from: ۟ۦۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7024(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            boolean r0 = r2.isActivityFinishing(r3)
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

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7025(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r2.parseTimestamp(r3)
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

    /* JADX INFO: renamed from: ۟ۦۣۨۡ, reason: not valid java name and contains not printable characters */
    public static void m7026(java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            kevin.fun.hook.KSHook r3 = (kevin.fun.hook.KSHook) r3
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r4 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r4
            r3.handleBindViewHolder(r4)
        L1b:
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            java.lang.String r0 = "Yg6ONpfQHS5re5Asco9fNwl5YMY"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
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

    /* JADX INFO: renamed from: ۟ۦۦۣۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7027(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.userName
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

    /* JADX INFO: renamed from: ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7028(java.lang.Object r6, java.lang.Object r7, int r8, int r9, long r10) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r0 = r6
            kevin.fun.hook.KSHook r0 = (kevin.fun.hook.KSHook) r0
            r1 = r7
            kevin.fun.hook.KSHook$DownloadDialogHolder r1 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r0.updateDownloadProgress(r1, r2, r3, r4)
        L20:
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1740(0x6cc, float:2.438E-42)
        L26:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2c;
                case 54: goto L31;
                case 471: goto L43;
                case 500: goto L34;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r1 > 0) goto L31
            r0 = 1833(0x729, float:2.569E-42)
            goto L26
        L31:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L26
        L34:
            java.lang.String r0 = "5XBr94WyI5felXgY7KkxRYA6Qaa"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3639(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L43:
            return
        L44:
            r0 = 1864(0x748, float:2.612E-42)
        L46:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4c;
                case 47483: goto L20;
                default: goto L4b;
            }
        L4b:
            goto L46
        L4c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L46
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m7029(java.lang.Object r2) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            r2.resetState()
        L19:
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            if (r1 < 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "wJYzGCias"
            java.lang.String r0 = androidx.loader.C1096.m2685(r0)
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

    /* JADX INFO: renamed from: ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7030(java.lang.Object r2) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.coverImageUrl
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

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7031(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            android.view.View r0 = r2.createBackupItem(r3, r4)
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

    /* JADX INFO: renamed from: ۣ۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7032(java.lang.Object r2) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r0 = r2.getRandomUserAgent()
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

    /* JADX INFO: renamed from: ۣ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7033(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            r2.hookSharePanel(r3)
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
            java.lang.String r0 = "LGkUg"
            java.lang.String r0 = com.tencent.mmkv.C1109.m3585(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
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

    /* JADX INFO: renamed from: ۟ۧۧۦۢ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7034(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, int r12, java.lang.Object r13) {
            int r1 = androidx.activity.C1064.m377()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2c;
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
            r0 = r7
            kevin.fun.hook.KSHook r0 = (kevin.fun.hook.KSHook) r0
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r6 = r13
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5 = r12
            android.view.View r0 = r0.createIconTextButton(r1, r2, r3, r4, r5, r6)
        L2b:
            return r0
        L2c:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L2f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L35;
                case 54: goto L2b;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L2f
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static android.widget.ProgressBar m7035(java.lang.Object r2) {
            int r1 = androidx.customview.C1075.m1139()
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
            kevin.fun.hook.KSHook$AtlasDownloadHolder r2 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r2
            android.widget.ProgressBar r0 = r2.progressBar
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

    /* JADX INFO: renamed from: ۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.ClassLoader m7036(java.lang.Object r2) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r2 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r2
            java.lang.ClassLoader r0 = r2.classLoader
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

    /* JADX INFO: renamed from: ۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static void m7037(java.lang.Object r2, java.lang.Object r3, int r4) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r3 = (java.lang.String) r3
            de.robv.android.xposed.XposedHelpers.setIntField(r2, r3, r4)
        L19:
            int r1 = androidx.customview.C1075.m1139()
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
            java.lang.String r0 = "sIiu3P"
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3070(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
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

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m7038(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r2 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r2
            r2.setResult(r3)
        L19:
            int r1 = androidx.customview.C1075.m1139()
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
            java.lang.String r0 = "HZ1Eu9HTnfGcXbWl"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
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

    /* JADX INFO: renamed from: ۠ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook.MediaType m7039() {
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
            kevin.fun.hook.KSHook$MediaType r0 = kevin.fun.hook.KSHook.MediaType.ATLAS
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

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7040(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5, java.lang.Object r6) {
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            android.view.View r0 = r2.buildPickItemChecked(r3, r4, r5, r6)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۠ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m7041(java.lang.Object r2, java.lang.Object r3) {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            r2.extractShareObjectId(r3)
        L19:
            int r1 = androidx.appcompat.C1069.m747()
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
            java.lang.String r0 = "SRuKKRMdOpx5TTzcgSfnr"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
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

    /* JADX INFO: renamed from: ۠ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7042(java.lang.Object r2) {
            int r1 = androidx.interpolator.C1083.m1725()
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
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r2 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r2
            java.lang.Object r0 = r2.thisObject
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

    /* JADX INFO: renamed from: ۠ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static long m7043(java.lang.Object r3) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            kevin.fun.hook.KSHook$ParseResult r3 = (kevin.fun.hook.KSHook.ParseResult) r3
            long r0 = r3.viewCount
        L18:
            return r0
        L19:
            r0 = 0
            r2 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L23;
                case 54: goto L18;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L1d
    }

    /* JADX INFO: renamed from: ۠ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicReference m7044(java.lang.Object r2) {
            int r1 = androidx.annotation.experimental.C1067.m596()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r2.cachedShareObjectId
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

    /* JADX INFO: renamed from: ۡ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m7045(java.lang.Object r2, java.lang.Object r3, int r4) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            int r0 = r2.m90dp(r3, r4)
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

    /* JADX INFO: renamed from: ۡ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7046(java.lang.Object r2) {
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
            kevin.fun.hook.KSHook$VideoInfo r2 = (kevin.fun.hook.KSHook.VideoInfo) r2
            java.lang.String r0 = r2.videoCodec
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

    /* JADX INFO: renamed from: ۡۡۡۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7047(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.vectordrawable.C1104.m3230()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.KSHook$AtlasDownloadHolder r4 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r4
            android.widget.LinearLayout r0 = r2.createAtlasProgressPanel(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۡۡۡۧ, reason: not valid java name and contains not printable characters */
    public static long m7048(java.lang.Object r3, java.lang.Object r4) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
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
            kevin.fun.hook.KSHook r3 = (kevin.fun.hook.KSHook) r3
            android.content.Context r4 = (android.content.Context) r4
            long r0 = r3.getVersionCode(r4)
        L1c:
            return r0
        L1d:
            r0 = 0
            r2 = 1740(0x6cc, float:2.438E-42)
        L21:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L27;
                case 54: goto L1c;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L21
    }

    /* JADX INFO: renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean m7049(java.lang.Object r2) {
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isAdSkipped
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

    /* JADX INFO: renamed from: ۡۡۨ۟, reason: not valid java name and contains not printable characters */
    public static void m7050(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.parseVideoInfo(r3, r4)
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

    /* JADX INFO: renamed from: ۡۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7051(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r3 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r3
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r4 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r4
            r2.handleMainActivityCreate(r3, r4)
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

    /* JADX INFO: renamed from: ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m7052(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, long r6) {
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r3 = (kevin.fun.hook.KSHook) r3
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r4 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r4
            android.content.Context r5 = (android.content.Context) r5
            r3.startDexKitAsync(r4, r5, r6)
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

    /* JADX INFO: renamed from: ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7053(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1064.m377()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r2.extractCoverUrl(r3)
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

    /* JADX INFO: renamed from: ۡۦۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7054(java.lang.Object r2) {
            int r1 = androidx.interpolator.C1081.m1643()
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
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2
            r2.close()
        L19:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            java.lang.String r0 = "cLViH9ZxTvu4EmqNFNl9m9D2ha"
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

    /* JADX INFO: renamed from: ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7055(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.startup.C1101.m2984()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.widget.LinearLayout r0 = r2.createShareRootLayout(r3)
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

    /* JADX INFO: renamed from: ۡۧۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7056(java.lang.Object r2) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            boolean r0 = r2.isComplete()
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

    /* JADX INFO: renamed from: ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7057(java.lang.Object r2, java.lang.Object r3) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.view.View r3 = (android.view.View) r3
            r2.animatePanelIn(r3)
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

    /* JADX INFO: renamed from: ۢ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m7058(java.lang.Object r2) {
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            kevin.fun.hook.KSHook$AtlasDownloadHolder r2 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r2
            android.app.Dialog r0 = r2.dialog
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

    /* JADX INFO: renamed from: ۢ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7059(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.widget.TextView r0 = r2.createM3u8Tip(r3)
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

    /* JADX INFO: renamed from: ۢ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7060(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1062.m182()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            kevin.fun.hook.KSHook$ParseResult r3 = (kevin.fun.hook.KSHook.ParseResult) r3
            r2.updateCurrentResult(r3)
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

    /* JADX INFO: renamed from: ۢ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook.ParseResult m7061(java.lang.Object r2, java.lang.Object r3) {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            kevin.fun.hook.KSHook$ParseResult r0 = r2.parseHtmlInOnePass(r3)
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

    /* JADX INFO: renamed from: ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static void m7062(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.activity.C1065.m427()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            android.content.Context r4 = (android.content.Context) r4
            r2.startDexKitAsync(r3, r4)
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

    /* JADX INFO: renamed from: ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static org.luckypray.dexkit.DexKitBridge m7063(java.lang.Object r2) {
            int r1 = androidx.versionedparcelable.C1107.m3467()
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
            java.lang.String r2 = (java.lang.String) r2
            org.luckypray.dexkit.DexKitBridge r0 = org.luckypray.dexkit.DexKitBridge.create(r2)
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

    /* JADX INFO: renamed from: ۢۢۥۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook.MediaType m7064() {
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
            kevin.fun.hook.KSHook$MediaType r0 = kevin.fun.hook.KSHook.MediaType.VIDEO
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

    /* JADX INFO: renamed from: ۣۢ۟۠, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7065(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.KSHook$AtlasDownloadHolder r4 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r4
            android.widget.LinearLayout r0 = r2.createAtlasProgressContainer(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۢۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7066(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.KSHook$DownloadDialogHolder r4 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r4
            android.widget.TextView r0 = r2.createBackgroundButton(r3, r4)
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

    /* JADX INFO: renamed from: ۢۥۦ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7067(java.lang.Object r2) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
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
            kevin.fun.hook.KSHook$VideoInfo r2 = (kevin.fun.hook.KSHook.VideoInfo) r2
            java.lang.String r0 = r2.url
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

    /* JADX INFO: renamed from: ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7068(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.annotation.experimental.C1067.m596()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            android.widget.TextView r0 = r2.createCloseButton(r3, r4)
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

    /* JADX INFO: renamed from: ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean m7069() {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            java.util.concurrent.atomic.AtomicBoolean r0 = kevin.fun.hook.KSHook.mmkvInitialized
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

    /* JADX INFO: renamed from: ۢۨۤۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.ProgressBar m7070(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1116.m8064()
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
            kevin.fun.hook.KSHook$DownloadDialogHolder r2 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r2
            android.widget.ProgressBar r0 = r2.progressBar
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

    /* JADX INFO: renamed from: ۢۨۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7071(java.lang.Object r2) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r2 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r2
            java.lang.String r0 = r2.packageName
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

    /* JADX INFO: renamed from: ۣ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7072(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1066.m518()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r2.hasM3u8Url(r3)
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

    /* JADX INFO: renamed from: ۣۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7073(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r4 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r4
            r2.showSettingsDialog(r3, r4)
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

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static void m7074(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r3 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r3
            r2.clearSplashAdData(r3)
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

    /* JADX INFO: renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7075(java.lang.Object r2, java.lang.Object r3) {
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r2.getFileExtension(r3)
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

    /* JADX INFO: renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m7076(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            r2.hookSplashAd(r3)
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

    /* JADX INFO: renamed from: ۣۥۥۧ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7077(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.core.ktx.C1071.m854()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.view.View r0 = r2.buildInfoBlock(r3)
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

    /* JADX INFO: renamed from: ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m7078(java.lang.Object r2) {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            kevin.fun.hook.KSHook$VideoInfo r2 = (kevin.fun.hook.KSHook.VideoInfo) r2
            int r0 = r2.avgBitrate
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

    /* JADX INFO: renamed from: ۤ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7079(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.io.File r3 = (java.io.File) r3
            java.io.File r4 = (java.io.File) r4
            r2.copyFile(r3, r4)
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

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m7080(java.lang.Object r6, java.lang.Object r7, int r8, int r9, long r10) {
            int r1 = androidx.annotation.experimental.C1067.m596()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            r0 = r6
            kevin.fun.hook.KSHook r0 = (kevin.fun.hook.KSHook) r0
            r1 = r7
            kevin.fun.hook.KSHook$AtlasDownloadHolder r1 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r0.updateAtlasProgress(r1, r2, r3, r4)
        L20:
            return
        L21:
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L20;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L23
    }

    /* JADX INFO: renamed from: ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7081(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.versionedparcelable.C1107.m3467()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L20;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r5 = (java.io.File) r5
            r2.extractSoFromApk(r3, r4, r5)
        L1f:
            return
        L20:
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L1f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۤۧۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7082(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.audio.C1116.m8064()
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
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7083(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, int r12, java.lang.Object r13, long r14) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L26;
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
            r1 = r9
            kevin.fun.hook.KSHook r1 = (kevin.fun.hook.KSHook) r1
            r2 = r10
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r3 = r11
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r3
            r5 = r13
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            r4 = r12
            r6 = r14
            r1.performAtlasDownload(r2, r3, r4, r5, r6)
        L25:
            return
        L26:
            r0 = 1740(0x6cc, float:2.438E-42)
        L28:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2e;
                case 54: goto L25;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L28
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static void m7084(java.lang.Object r2) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            r2.clear()
        L19:
            int r1 = androidx.loader.C1099.m2876()
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
            java.lang.String r0 = "qJSbkRj3jGSnnpowCkoCGWanSaQQ"
            java.lang.String r0 = androidx.activity.C1065.m453(r0)
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

    /* JADX INFO: renamed from: ۥ۠ۨۥ, reason: contains not printable characters */
    public static java.lang.String[] m7085() {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String[] r0 = kevin.fun.hook.KSHook.USER_AGENT_ARRAY
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

    /* JADX INFO: renamed from: ۥۡ۠ۢ, reason: contains not printable characters */
    public static java.lang.String m7086(java.lang.Object r2) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.videoCaption
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

    /* JADX INFO: renamed from: ۥۡۢ۟, reason: contains not printable characters */
    public static android.widget.FrameLayout m7087(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.widget.FrameLayout r0 = r2.createDialogFrame(r3)
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

    /* JADX INFO: renamed from: ۥۡۦ۠, reason: contains not printable characters */
    public static android.os.Handler m7088() {
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            android.os.Handler r0 = kevin.fun.hook.KSHook.MAIN_HANDLER
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

    /* JADX INFO: renamed from: ۥۢ۟, reason: contains not printable characters */
    public static java.lang.String m7089(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = r2.extractValue(r3, r4)
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

    /* JADX INFO: renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static java.util.List m7090(java.lang.Object r2) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.util.List<java.lang.String> r0 = r2.atlasImageUrls
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

    /* JADX INFO: renamed from: ۥۥۤۥ, reason: contains not printable characters */
    public static java.lang.Object m7091() {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Object r0 = kevin.fun.hook.KSHook.MMKV_LOCK
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

    /* JADX INFO: renamed from: ۥۦۡۦ, reason: contains not printable characters */
    public static android.widget.TextView m7092(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.app.Dialog r4 = (android.app.Dialog) r4
            android.widget.TextView r0 = r2.createBackgroundButton(r3, r4)
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

    /* JADX INFO: renamed from: ۥۧ۠ۧ, reason: contains not printable characters */
    public static java.util.List m7093(java.lang.Object r2) {
            int r1 = androidx.core.ktx.C1071.m854()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.util.List<kevin.fun.hook.KSHook$VideoInfo> r0 = r2.videoList
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

    /* JADX INFO: renamed from: ۥۨ۠ۨ, reason: contains not printable characters */
    public static void m7094(java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.showAtlasResult(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۦ۠۟ۢ, reason: contains not printable characters */
    public static void m7095(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r3 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r3
            r2.handleAdEvent(r3)
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

    /* JADX INFO: renamed from: ۦۣۤ, reason: contains not printable characters */
    public static void m7096(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1096.m2651()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.showErrorToast(r3, r4)
        L1d:
            int r1 = androidx.activity.C1065.m427()
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
            java.lang.String r0 = "YtgiM7tpa6NZjyV9nYpMr450X0"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    /* JADX INFO: renamed from: ۦۤۡ۟, reason: contains not printable characters */
    public static dalvik.system.DexClassLoader m7097() {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            dalvik.system.DexClassLoader r0 = kevin.fun.hook.KSHook.mmkvLoader
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

    /* JADX INFO: renamed from: ۦۤۧۡ, reason: contains not printable characters */
    public static void m7098(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1098.m2793()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.startVideoInfoFetch(r3, r4)
        L1d:
            int r1 = androidx.emoji2.C1080.m1539()
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
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "2JeTiWZ4S2F3y3SytdIY3JhqgbbR"
            java.lang.String r0 = androidx.core.C1073.m1027(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    /* JADX INFO: renamed from: ۦۦ۠ۨ, reason: contains not printable characters */
    public static void m7099(java.lang.Object r2) {
            int r1 = androidx.activity.C1064.m377()
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

    /* JADX INFO: renamed from: ۦۨۡ۟, reason: contains not printable characters */
    public static java.lang.Object m7100(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r2, r3)
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

    /* JADX INFO: renamed from: ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7101(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.runMmkvTest(r3, r4)
        L1d:
            int r1 = androidx.loader.C1095.m2562()
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
            java.lang.String r0 = "lmdi"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    /* JADX INFO: renamed from: ۧ۠۠۠, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m7102(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            java.lang.String r2 = (java.lang.String) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r2, r3)
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

    /* JADX INFO: renamed from: ۧۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7103(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1065.m427()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r2.dismissDialog(r3)
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

    /* JADX INFO: renamed from: ۧۢۢۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7104() {
            int r1 = androidx.loader.C1099.m2876()
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
            java.lang.Object r0 = kevin.fun.hook.KSHook.mmkvInstance
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

    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7105(java.lang.Object r2) {
            int r1 = androidx.activity.C1066.m518()
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
            kevin.fun.hook.KSHook$DownloadDialogHolder r2 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r2
            android.widget.TextView r0 = r2.speedText
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

    /* JADX INFO: renamed from: ۧۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m7106(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            r2.hookMainActivity(r3)
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

    /* JADX INFO: renamed from: ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7107(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.core.C1073.m1015()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.downloadMusic(r3)
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

    /* JADX INFO: renamed from: ۧۧۥۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object[] m7108(java.lang.Object r2) {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r2 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r2
            java.lang.Object[] r0 = r2.args
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

    /* JADX INFO: renamed from: ۧۨۥۢ, reason: not valid java name and contains not printable characters */
    public static void m7109(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L22;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            kevin.fun.hook.KSHook$DownloadDialogHolder r4 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            r2.showDownloadProgressDialog(r3, r4, r5, r6)
        L21:
            return
        L22:
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L21;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۧۨۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7110(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = (java.io.File) r4
            boolean r0 = r2.downloadSingleImage(r3, r4)
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

    /* JADX INFO: renamed from: ۨ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook.MediaType m7111(java.lang.Object r2) {
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            kevin.fun.hook.KSHook$MediaType r0 = r2.currentMediaType
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

    /* JADX INFO: renamed from: ۨ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static android.view.View m7112(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r0 = r2.buildTitle(r3, r4)
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

    /* JADX INFO: renamed from: ۨۤۤۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7113(java.lang.Object r2) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
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
            kevin.fun.hook.KSHook$AtlasDownloadHolder r2 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r2
            android.widget.TextView r0 = r2.speedText
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

    /* JADX INFO: renamed from: ۨۦۥۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7114(java.lang.Object r2) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            kevin.fun.hook.KSHook$ParseResult r2 = (kevin.fun.hook.KSHook.ParseResult) r2
            java.lang.String r0 = r2.publishTime
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

    /* JADX INFO: renamed from: ۨۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7115(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.showVideoQualityDialog(r3)
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

    /* JADX INFO: renamed from: ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7116(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.C1120.m8652()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.handleDownloadOption(r3)
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

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r8) {
            r7 = this;
            short[] r0 = m6972()
            r1 = 3679(0xe5f, float:5.155E-42)
            int r2 = kevin.fun.hook.webdav.C1118.f417
            r2 = r2 ^ (-377(0xfffffffffffffe87, float:NaN))
            r3 = 2944(0xb80, float:4.125E-42)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r2, r3)
            java.lang.String r1 = m7071(r8)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 1616(0x650, float:2.264E-42)
        L1a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L20;
                case 49: goto L23;
                case 204: goto La3;
                case 239: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1a
        L23:
            if (r1 != 0) goto L20
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1a
        L28:
            java.lang.ClassLoader r0 = m7036(r8)
            kevin.fun.hook.KSHook$1 r1 = new kevin.fun.hook.KSHook$1
            r1.<init>(r7)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = androidx.customview.C1074.f100
            r3 = r3 ^ 243(0xf3, float:3.4E-43)
            java.lang.Class<android.app.Application> r4 = android.app.Application.class
            r2[r3] = r4
            int r3 = androidx.customview.C1074.f100
            r3 = r3 ^ 242(0xf2, float:3.39E-43)
            r2[r3] = r1
            short[] r1 = m6972()
            r3 = 3697(0xe71, float:5.18E-42)
            int r4 = kevin.fun.hook.webdav.C1118.f417
            r4 = r4 ^ (-370(0xfffffffffffffe8e, float:NaN))
            r5 = 659(0x293, float:9.23E-43)
            java.lang.String r1 = org.luckypray.dexkit.C1123.m10510(r1, r3, r4, r5)
            short[] r3 = m6972()
            r4 = 3724(0xe8c, float:5.218E-42)
            int r5 = kevin.fun.hook.C1120.f419
            r5 = r5 ^ (-468(0xfffffffffffffe2c, float:NaN))
            r6 = 371(0x173, float:5.2E-43)
            java.lang.String r3 = androidx.lifecycle.process.C1088.m2044(r3, r4, r5, r6)
            m6996(r1, r0, r3, r2)
            java.lang.ClassLoader r0 = m7036(r8)     // Catch: java.lang.Throwable -> L7a
            m6991(r7, r0)     // Catch: java.lang.Throwable -> L7a
            m7106(r7, r8)     // Catch: java.lang.Throwable -> L7a
            r0 = 1740(0x6cc, float:2.438E-42)
        L71:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L77;
                case 54: goto La3;
                default: goto L76;
            }
        L76:
            goto L71
        L77:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L71
        L7a:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3747(0xea3, float:5.25E-42)
            int r4 = androidx.startup.C1101.f127
            r4 = r4 ^ 746(0x2ea, float:1.045E-42)
            r5 = 2344(0x928, float:3.285E-42)
            java.lang.String r2 = androidx.vectordrawable.C1105.m3247(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
        La3:
            return
    }

    /* JADX INFO: renamed from: lambda$10$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7117lambda$10$kevinfunhookKSHook(java.lang.ref.WeakReference r3, android.content.Context r4, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r5, android.view.View r6) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "ۢۢ۠"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748641: goto L16;
                case 1749664: goto L10;
                case 1750532: goto L23;
                case 1752673: goto L1d;
                default: goto La;
            }
        La:
            m7006(r2, r4, r0)
            java.lang.String r1 = "ۥۦۢ"
            goto L3
        L10:
            m7103(r2, r3)
            java.lang.String r1 = "ۡ۠۠"
            goto L3
        L16:
            java.lang.String r0 = m7071(r5)
            java.lang.String r1 = "ۧۦۡ"
            goto L3
        L1d:
            m7062(r2, r5, r4)
            java.lang.String r1 = "ۣ۟۠"
            goto L3
        L23:
            return
    }

    /* JADX INFO: renamed from: lambda$11$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7118lambda$11$kevinfunhookKSHook(java.lang.ref.WeakReference r1, android.view.View r2) {
            r0 = this;
            m7103(r0, r1)
            return
    }

    /* JADX INFO: renamed from: lambda$12$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7119lambda$12$kevinfunhookKSHook(java.lang.ref.WeakReference r7, java.lang.String r8) {
            r6 = this;
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r7)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1616(0x650, float:2.264E-42)
        L8:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L1a;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 != 0) goto Le
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            m7029(r6)
        L19:
            return
        L1a:
            short[] r1 = m6972()
            r2 = 3767(0xeb7, float:5.279E-42)
            int r3 = androidx.customview.C1075.f101
            r3 = r3 ^ (-111(0xffffffffffffff91, float:NaN))
            r4 = 2241(0x8c1, float:3.14E-42)
            java.lang.String r1 = androidx.annotation.experimental.C1067.m581(r1, r2, r3, r4)
            m7018(r6, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r0.<init>()     // Catch: java.lang.Throwable -> L5c
            short[] r1 = m6972()     // Catch: java.lang.Throwable -> L5c
            r2 = 3778(0xec2, float:5.294E-42)
            int r3 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L5c
            r3 = r3 ^ (-999(0xfffffffffffffc19, float:NaN))
            r4 = 1277(0x4fd, float:1.79E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L5c
            m7050(r6, r7, r0)     // Catch: java.lang.Throwable -> L5c
            r0 = 1740(0x6cc, float:2.438E-42)
        L53:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L59;
                case 54: goto L19;
                default: goto L58;
            }
        L58:
            goto L53
        L59:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L53
        L5c:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3810(0xee2, float:5.339E-42)
            int r4 = org.luckypray.dexkit.C1123.f433
            r4 = r4 ^ (-979(0xfffffffffffffc2d, float:NaN))
            r5 = 1952(0x7a0, float:2.735E-42)
            java.lang.String r2 = androidx.activity.C1062.m170(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            short[] r0 = m6972()
            r1 = 3830(0xef6, float:5.367E-42)
            int r2 = androidx.appcompat.resources.C1068.f94
            r2 = r2 ^ 518(0x206, float:7.26E-43)
            r3 = 2048(0x800, float:2.87E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r1, r2, r3)
            m6979(r6, r7, r0)
            goto L19
    }

    /* JADX INFO: renamed from: lambda$13$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7120lambda$13$kevinfunhookKSHook(java.lang.String r7, java.lang.ref.WeakReference r8) {
            r6 = this;
            java.lang.String r1 = m6977(r6, r7)     // Catch: java.lang.Throwable -> Lbc
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L114;
                default: goto Lb;
            }     // Catch: java.lang.Throwable -> Lbc
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
            boolean r2 = androidx.activity.C1066.m488(r1)     // Catch: java.lang.Throwable -> Lbc
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L34;
                case 500: goto L28;
                default: goto L1f;
            }     // Catch: java.lang.Throwable -> Lbc
        L1f:
            goto L1a
        L20:
            if (r2 == 0) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            r0 = 1864(0x748, float:2.612E-42)
        L2a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L30;
                case 47483: goto L114;
                default: goto L2f;
            }     // Catch: java.lang.Throwable -> Lbc
        L2f:
            goto L2a
        L30:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2a
        L34:
            kevin.fun.hook.KSHook$ParseResult r1 = m7061(r6, r1)     // Catch: java.lang.Throwable -> Lbc
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3b:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L43;
                case 45: goto L89;
                case 76: goto L4d;
                case 239: goto L47;
                default: goto L42;
            }     // Catch: java.lang.Throwable -> Lbc
        L42:
            goto L3b
        L43:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L3b
        L47:
            if (r1 != 0) goto L43
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L3b
        L4d:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Lbc
            r1 = 3838(0xefe, float:5.378E-42)
            int r2 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> Lbc
            r2 = r2 ^ (-257(0xfffffffffffffeff, float:NaN))
            r3 = 2417(0x971, float:3.387E-42)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lbc
            m6979(r6, r8, r0)     // Catch: java.lang.Throwable -> Lbc
            int r1 = org.luckypray.dexkit.C1125.m10627()     // Catch: java.lang.Throwable -> Lbc
            r0 = 48891(0xbefb, float:6.8511E-41)
        L67:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L6f;
                case 53: goto L88;
                case 503: goto L73;
                case 32495: goto L79;
                default: goto L6e;
            }     // Catch: java.lang.Throwable -> Lbc
        L6e:
            goto L67
        L6f:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L67
        L73:
            if (r1 < 0) goto L6f
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L67
        L79:
            java.lang.String r0 = "hVLikV6vymFSuePx"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Double r0 = java.lang.Double.decode(r0)     // Catch: java.lang.Throwable -> Lbc
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Throwable -> Lbc
            r1.println(r0)     // Catch: java.lang.Throwable -> Lbc
        L88:
            return
        L89:
            m7060(r6, r1)     // Catch: java.lang.Throwable -> Lbc
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r6)     // Catch: java.lang.Throwable -> Lbc
            boolean r1 = m7056(r0)     // Catch: java.lang.Throwable -> Lbc
            r0 = 49666(0xc202, float:6.9597E-41)
        L97:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L9f;
                case 50: goto La5;
                case 76: goto La9;
                case 83: goto Lf9;
                default: goto L9e;
            }     // Catch: java.lang.Throwable -> Lbc
        L9e:
            goto L97
        L9f:
            if (r1 != 0) goto La5
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L97
        La5:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L97
        La9:
            android.os.Handler r0 = m7088()     // Catch: java.lang.Throwable -> Lbc
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda16 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda16     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r6, r8, r7)     // Catch: java.lang.Throwable -> Lbc
            r2 = 1266(0x4f2, double:6.255E-321)
            int r4 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> Lbc
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lbc
            long r2 = r2 ^ r4
            androidx.loader.C1095.m2588(r0, r1, r2)     // Catch: java.lang.Throwable -> Lbc
            goto L88
        Lbc:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m6972()
            r3 = 3854(0xf0e, float:5.4E-42)
            int r4 = androidx.lifecycle.process.C1091.f117
            r4 = r4 ^ (-512(0xfffffffffffffe00, float:NaN))
            r5 = 1322(0x52a, float:1.853E-42)
            java.lang.String r2 = androidx.versionedparcelable.C1107.m3485(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7099(r0)
            short[] r0 = m6972()
            r1 = 3874(0xf22, float:5.429E-42)
            int r2 = kevin.fun.hook.audio.C1114.f403
            r2 = r2 ^ (-24)
            r3 = 1708(0x6ac, float:2.393E-42)
            java.lang.String r0 = androidx.interpolator.C1082.m1694(r0, r1, r2, r3)
            m6979(r6, r8, r0)
            goto L88
        Lf9:
            android.os.Handler r0 = m7088()     // Catch: java.lang.Throwable -> Lbc
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda17 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda17     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lbc
            androidx.activity.C1062.m178(r0, r1)     // Catch: java.lang.Throwable -> Lbc
            r0 = 49790(0xc27e, float:6.977E-41)
        L108:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L88;
                case 241: goto L110;
                default: goto L10f;
            }     // Catch: java.lang.Throwable -> Lbc
        L10f:
            goto L108
        L110:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L108
        L114:
            short[] r0 = m6972()     // Catch: java.lang.Throwable -> Lbc
            r1 = 3846(0xf06, float:5.39E-42)
            int r2 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> Lbc
            r2 = r2 ^ 278(0x116, float:3.9E-43)
            r3 = 3115(0xc2b, float:4.365E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lbc
            m6979(r6, r8, r0)     // Catch: java.lang.Throwable -> Lbc
            goto L88
    }

    /* JADX INFO: renamed from: lambda$14$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7121lambda$14$kevinfunhookKSHook(java.lang.ref.WeakReference r1, java.lang.String r2) {
            r0 = this;
            m7050(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: lambda$15$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7122lambda$15$kevinfunhookKSHook(java.lang.ref.WeakReference r4) {
            r3 = this;
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r4)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1616(0x650, float:2.264E-42)
        L8:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L2d;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 == 0) goto Le
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            boolean r2 = m7024(r3, r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto L2d;
                case 500: goto L2a;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            if (r2 != 0) goto L27
            r1 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            m7010(r3, r0)
        L2d:
            m7029(r3)
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1864(0x748, float:2.612E-42)
        L36:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3c;
                case 47384: goto L51;
                case 47417: goto L46;
                case 47483: goto L42;
                default: goto L3b;
            }
        L3b:
            goto L36
        L3c:
            if (r1 > 0) goto L42
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L36
        L42:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L36
        L46:
            java.lang.String r0 = "ipyPf0xZWUCx8wmbO"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L51:
            return
    }

    /* JADX INFO: renamed from: lambda$17$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7123lambda$17$kevinfunhookKSHook(java.lang.ref.WeakReference r3, android.view.View r4) {
            r2 = this;
            m7103(r2, r3)
            m7029(r2)
            int r1 = androidx.vectordrawable.C1104.m3230()
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L29;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 < 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            java.lang.String r0 = "72651N"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1079.m1451(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L29:
            return
    }

    /* JADX INFO: renamed from: lambda$19$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7124lambda$19$kevinfunhookKSHook(android.content.Context r3, java.lang.ref.WeakReference r4, int r5) {
            r2 = this;
            m6968(r2, r3, r4, r5)
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
            java.lang.String r0 = "ul2QBbdAXIexPl"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1079.m1451(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: lambda$22$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7125lambda$22$kevinfunhookKSHook(java.lang.ref.WeakReference r3, android.view.View r4) {
            r2 = this;
            m7103(r2, r3)
            m7029(r2)
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L29;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 < 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            java.lang.String r0 = "NZXRDvoAZ0OVIAmS"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1079.m1451(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L29:
            return
    }

    /* JADX INFO: renamed from: lambda$24$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7126lambda$24$kevinfunhookKSHook(java.lang.ref.WeakReference r16, android.content.Context r17, kevin.fun.hook.KSHook.VideoInfo r18) {
            r15 = this;
            r2 = 0
            r12 = 0
            r0 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r4 = 0
            r1 = 0
            r6 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            java.lang.String r11 = "ۤۦۥ"
            r8 = r0
            r9 = r1
        L10:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r11)
            switch(r0) {
                case 56388: goto L1e;
                case 56483: goto La7;
                case 56570: goto Le0;
                case 56572: goto L119;
                case 1748896: goto Lea;
                case 1749758: goto Lb1;
                case 1749821: goto Lbe;
                case 1749825: goto L5a;
                case 1751557: goto L8a;
                case 1751715: goto Ld8;
                case 1751746: goto L48;
                case 1751775: goto L28;
                case 1752453: goto L9c;
                case 1752516: goto L82;
                case 1752555: goto Lc7;
                case 1752608: goto Lf2;
                case 1752647: goto L6d;
                case 1753476: goto L79;
                case 1753481: goto L38;
                case 1753539: goto L51;
                case 1753633: goto L111;
                case 1753636: goto L121;
                case 1753671: goto L66;
                case 1754415: goto Lcf;
                case 1754437: goto L12e;
                case 1754593: goto Lfc;
                case 1754629: goto L94;
                case 1754657: goto L104;
                case 1755468: goto L41;
                case 1755531: goto L31;
                default: goto L17;
            }
        L17:
            r1 = r12 ^ 772(0x304, float:1.082E-42)
            java.lang.String r0 = "ۥۥۧ"
            r11 = r0
            r13 = r1
            goto L10
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ۦۡۤ"
            r8 = r0
            r11 = r1
            goto L10
        L28:
            short[] r0 = m6972()
            java.lang.String r1 = "ۧۧۥ"
            r10 = r0
            r11 = r1
            goto L10
        L31:
            r1 = r13 ^ (-280(0xfffffffffffffee8, float:NaN))
            java.lang.String r0 = "ۢۧۦ"
            r11 = r0
            r14 = r1
            goto L10
        L38:
            short[] r0 = m6972()
            java.lang.String r1 = "ۧۦ۠"
            r10 = r0
            r11 = r1
            goto L10
        L41:
            r1 = r13 ^ (-448(0xfffffffffffffe40, float:NaN))
            java.lang.String r0 = "ۦۦۤ"
            r11 = r0
            r14 = r1
            goto L10
        L48:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r8, r4)
            java.lang.String r1 = "ۥۨ"
            r9 = r0
            r11 = r1
            goto L10
        L51:
            short[] r0 = m6972()
            java.lang.String r1 = "ۦۦۡ"
            r10 = r0
            r11 = r1
            goto L10
        L5a:
            r0 = 3893(0xf35, float:5.455E-42)
            r1 = 3020(0xbcc, float:4.232E-42)
            java.lang.String r4 = androidx.activity.C1065.m410(r10, r0, r14, r1)
            java.lang.String r0 = "ۦۡ۟"
            r11 = r0
            goto L10
        L66:
            int r1 = androidx.lifecycle.livedata.C1085.f111
            java.lang.String r0 = "۠ۢ"
            r11 = r0
            r12 = r1
            goto L10
        L6d:
            r0 = 3895(0xf37, float:5.458E-42)
            r1 = 2019(0x7e3, float:2.829E-42)
            java.lang.String r3 = androidx.lifecycle.process.C1087.m2008(r10, r0, r13, r1)
            java.lang.String r0 = "ۣۤۨ"
            r11 = r0
            goto L10
        L79:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r8, r4)
            java.lang.String r1 = "ۢۧۢ"
            r9 = r0
            r11 = r1
            goto L10
        L82:
            java.lang.String r6 = androidx.lifecycle.viewmodel.C1093.m2428()
            java.lang.String r0 = "ۤۡۢ"
            r11 = r0
            goto L10
        L8a:
            short[] r0 = m6972()
            java.lang.String r1 = "ۦۧۨ"
            r10 = r0
            r11 = r1
            goto L10
        L94:
            int r1 = androidx.core.C1072.f98
            java.lang.String r0 = "ۨۤ"
            r11 = r0
            r14 = r1
            goto L10
        L9c:
            r0 = r15
            r1 = r17
            m7023(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۧۡ۟"
            r11 = r0
            goto L10
        La7:
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r9, r12)
            java.lang.String r1 = "ۥۤ۟"
            r8 = r0
            r11 = r1
            goto L10
        Lb1:
            r0 = 3878(0xf26, float:5.434E-42)
            r1 = 1919(0x77f, float:2.689E-42)
            java.lang.String r4 = androidx.lifecycle.livedata.C1086.m1920(r10, r0, r14, r1)
            java.lang.String r0 = "ۤۧۥ"
            r11 = r0
            goto L10
        Lbe:
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r9)
            java.lang.String r0 = "ۥۡ۠"
            r11 = r0
            goto L10
        Lc7:
            int r1 = androidx.startup.C1100.f126
            java.lang.String r0 = "ۨۥۨ"
            r11 = r0
            r13 = r1
            goto L10
        Lcf:
            java.lang.String r2 = m7067(r18)
            java.lang.String r0 = "ۨۢ"
            r11 = r0
            goto L10
        Ld8:
            m7103(r15, r16)
            java.lang.String r0 = "ۧ۠ۨ"
            r11 = r0
            goto L10
        Le0:
            int r1 = m6983(r18)
            java.lang.String r0 = "ۢۦ"
            r11 = r0
            r12 = r1
            goto L10
        Lea:
            r1 = r13 ^ 651(0x28b, float:9.12E-43)
            java.lang.String r0 = "ۢۥۡ"
            r11 = r0
            r14 = r1
            goto L10
        Lf2:
            short[] r0 = m6972()
            java.lang.String r1 = "ۥۢۨ"
            r10 = r0
            r11 = r1
            goto L10
        Lfc:
            int r1 = androidx.versionedparcelable.C1107.f133
            java.lang.String r0 = "ۡۨۧ"
            r11 = r0
            r13 = r1
            goto L10
        L104:
            r0 = 3904(0xf40, float:5.47E-42)
            r1 = 565(0x235, float:7.92E-43)
            java.lang.String r5 = androidx.lifecycle.process.C1090.m2213(r10, r0, r12, r1)
            java.lang.String r0 = "ۦۣ۠"
            r11 = r0
            goto L10
        L111:
            int r1 = androidx.interpolator.C1083.f109
            java.lang.String r0 = "ۣۨۧ"
            r11 = r0
            r13 = r1
            goto L10
        L119:
            r1 = r14 ^ (-540(0xfffffffffffffde4, float:NaN))
            java.lang.String r0 = "ۧۨۢ"
            r11 = r0
            r12 = r1
            goto L10
        L121:
            r0 = 3908(0xf44, float:5.476E-42)
            r1 = 739(0x2e3, float:1.036E-42)
            java.lang.String r7 = androidx.interpolator.C1083.m1723(r10, r0, r14, r1)
            java.lang.String r0 = "ۥ۟۟"
            r11 = r0
            goto L10
        L12e:
            return
    }

    /* JADX INFO: renamed from: lambda$25$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7127lambda$25$kevinfunhookKSHook(java.lang.ref.WeakReference r14, android.content.Context r15) {
            r13 = this;
            r11 = 0
            r0 = 0
            java.lang.String r1 = "ۢۧۨ"
            r7 = r0
            r2 = r0
            r5 = r0
            r8 = r0
            r6 = r0
            r3 = r0
            r4 = r0
            r9 = r0
            r10 = r11
            r12 = r11
        Le:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56323: goto L1b;
                case 56542: goto La1;
                case 1746721: goto L8c;
                case 1746942: goto L21;
                case 1747868: goto L28;
                case 1748610: goto L56;
                case 1748705: goto L86;
                case 1749699: goto L72;
                case 1749732: goto Laa;
                case 1749733: goto Lba;
                case 1749796: goto Lcc;
                case 1749827: goto L5f;
                case 1751656: goto L32;
                case 1751776: goto L7a;
                case 1752609: goto L99;
                case 1752645: goto Lc3;
                case 1752707: goto L66;
                case 1753417: goto L42;
                case 1753418: goto L2c;
                case 1753636: goto Lb2;
                case 1754473: goto L3a;
                case 1755340: goto L4e;
                default: goto L15;
            }
        L15:
            int r10 = androidx.loader.C1094.f120
            java.lang.String r0 = "ۢۤۦ"
            r1 = r0
            goto Le
        L1b:
            int r10 = androidx.customview.C1074.f100
            java.lang.String r0 = "ۦۦۤ"
            r1 = r0
            goto Le
        L21:
            r11 = r10 ^ 790(0x316, float:1.107E-42)
            java.lang.String r0 = "ۥۧۥ"
            r1 = r0
            r12 = r11
            goto Le
        L28:
            java.lang.String r0 = "ۥۥۥ"
            r1 = r0
            goto Le
        L2c:
            int r10 = androidx.versionedparcelable.C1107.f133
            java.lang.String r0 = "ۥۤ۠"
            r1 = r0
            goto Le
        L32:
            short[] r0 = m6972()
            java.lang.String r1 = "ۡۡ"
            r9 = r0
            goto Le
        L3a:
            short[] r0 = m6972()
            java.lang.String r1 = "ۡۢۢ"
            r9 = r0
            goto Le
        L42:
            r0 = 3941(0xf65, float:5.523E-42)
            r1 = 2589(0xa1d, float:3.628E-42)
            java.lang.String r5 = androidx.core.ktx.C1070.m788(r9, r0, r12, r1)
            java.lang.String r0 = "ۣۢۤ"
            r1 = r0
            goto Le
        L4e:
            short[] r0 = m6972()
            java.lang.String r1 = "ۣ۠"
            r9 = r0
            goto Le
        L56:
            r0 = r13
            r1 = r15
            m7023(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۢۦۨ"
            r1 = r0
            goto Le
        L5f:
            m7103(r13, r14)
            java.lang.String r0 = "ۢۤۧ"
            r1 = r0
            goto Le
        L66:
            r0 = 3910(0xf46, float:5.479E-42)
            r1 = 948(0x3b4, float:1.328E-42)
            java.lang.String r3 = androidx.vectordrawable.C1104.m3232(r9, r0, r12, r1)
            java.lang.String r0 = "ۤۤۨ"
            r1 = r0
            goto Le
        L72:
            short[] r0 = m6972()
            java.lang.String r1 = "ۦۣ۟"
            r9 = r0
            goto Le
        L7a:
            r0 = 3945(0xf69, float:5.528E-42)
            r1 = 1497(0x5d9, float:2.098E-42)
            java.lang.String r7 = androidx.versionedparcelable.C1106.m3338(r9, r0, r12, r1)
            java.lang.String r0 = "ۡ۟۠"
            r1 = r0
            goto Le
        L86:
            int r10 = androidx.lifecycle.runtime.C1092.f118
            java.lang.String r0 = "۟ۧۦ"
            r1 = r0
            goto Le
        L8c:
            r0 = 3919(0xf4f, float:5.492E-42)
            r1 = 3044(0xbe4, float:4.266E-42)
            java.lang.String r4 = androidx.vectordrawable.C1103.m3132(r9, r0, r12, r1)
            java.lang.String r0 = "ۣۨ۟"
            r1 = r0
            goto Le
        L99:
            r11 = r10 ^ 646(0x286, float:9.05E-43)
            java.lang.String r0 = "ۤۨۤ"
            r1 = r0
            r12 = r11
            goto Le
        La1:
            java.lang.String r2 = m7002(r8)
            java.lang.String r0 = "۠ۦۢ"
            r1 = r0
            goto Le
        Laa:
            r11 = r10 ^ 354(0x162, float:4.96E-43)
            java.lang.String r0 = "۟۠ۢ"
            r1 = r0
            r12 = r11
            goto Le
        Lb2:
            r11 = r10 ^ 247(0xf7, float:3.46E-43)
            java.lang.String r0 = "ۦ۟ۢ"
            r1 = r0
            r12 = r11
            goto Le
        Lba:
            kevin.fun.hook.KSHook$ParseResult r0 = m6994(r13)
            java.lang.String r1 = "ۧۥ"
            r8 = r0
            goto Le
        Lc3:
            java.lang.String r6 = androidx.lifecycle.viewmodel.C1093.m2428()
            java.lang.String r0 = "ۧۢۤ"
            r1 = r0
            goto Le
        Lcc:
            return
    }

    /* JADX INFO: renamed from: lambda$26$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7128lambda$26$kevinfunhookKSHook(java.lang.ref.WeakReference r2, kevin.fun.hook.KSHook.DownloadDialogHolder r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "ۤۢ۟"
        L2:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1747683: goto La;
                case 1751585: goto L13;
                case 1753632: goto Ld;
                default: goto L9;
            }
        L9:
            return
        La:
            java.lang.String r0 = "ۦۦ۠"
            goto L2
        Ld:
            m7109(r1, r2, r3, r4, r5)
            java.lang.String r0 = "ۨۦۧ"
            goto L2
        L13:
            java.lang.String r0 = "ۣ۠۠"
            goto L2
    }

    /* JADX INFO: renamed from: lambda$27$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7129lambda$27$kevinfunhookKSHook(java.lang.ref.WeakReference r3, kevin.fun.hook.KSHook.DownloadDialogHolder r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, long r10, java.lang.String r12) {
            r2 = this;
            m7008(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L7
            m7029(r2)
            return
        L7:
            r0 = move-exception
            m7029(r2)
            throw r0
    }

    /* JADX INFO: renamed from: lambda$28$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7130lambda$28$kevinfunhookKSHook(kevin.fun.hook.KSHook.DownloadDialogHolder r5, android.content.Context r6, android.view.View r7) {
            r4 = this;
            android.app.Dialog r0 = m6992(r5)
            androidx.customview.C1074.m1118(r0)
            short[] r0 = m6972()
            r1 = 3947(0xf6b, float:5.531E-42)
            int r2 = androidx.startup.C1100.f126
            r2 = r2 ^ (-275(0xfffffffffffffeed, float:NaN))
            r3 = 796(0x31c, float:1.115E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)
            m7018(r4, r6, r0)
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L20:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L26;
                case 49: goto L29;
                case 204: goto L2e;
                case 239: goto L3d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L20
        L29:
            if (r1 > 0) goto L26
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L20
        L2e:
            java.lang.String r0 = "YXUFbX5q90t"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3d:
            return
    }

    /* JADX INFO: renamed from: lambda$29$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7131lambda$29$kevinfunhookKSHook(kevin.fun.hook.KSHook.DownloadDialogHolder r7, long r8, int r10, int r11) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r8
            m7028(r0, r1, r2, r3, r4)
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1616(0x650, float:2.264E-42)
        Le:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L14;
                case 49: goto L17;
                case 204: goto L1c;
                case 239: goto L2b;
                default: goto L13;
            }
        L13:
            goto Le
        L14:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Le
        L17:
            if (r1 > 0) goto L14
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Le
        L1c:
            java.lang.String r0 = "Qu8PXlIXdejpJI38PFb00jsO"
            java.lang.String r0 = kevin.fun.hook.audio.C1115.m8007(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2b:
            return
    }

    /* JADX INFO: renamed from: lambda$3$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7132lambda$3$kevinfunhookKSHook(java.lang.ref.WeakReference r12, android.content.Context r13, android.view.View r14) {
            r11 = this;
            r6 = 0
            r1 = 0
            r3 = 0
            java.lang.String r10 = "ۡ۟ۦ"
            r0 = r1
            r2 = r1
            r4 = r6
            r8 = r6
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r10)
            switch(r1) {
                case 1747810: goto L35;
                case 1748616: goto L23;
                case 1751501: goto L2e;
                case 1751585: goto L3b;
                case 1751774: goto L2a;
                case 1752583: goto L42;
                case 1753419: goto L1a;
                case 1755556: goto L49;
                default: goto L11;
            }
        L11:
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda5 r0 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda5
            r0.<init>(r11, r13)
            java.lang.String r1 = "ۤۨۢ"
            r10 = r1
            goto La
        L1a:
            android.os.Handler r1 = m7088()
            java.lang.String r6 = "۟ۤ۟"
            r2 = r1
            r10 = r6
            goto La
        L23:
            m7103(r11, r12)
            java.lang.String r1 = "ۦ۟ۤ"
            r10 = r1
            goto La
        L2a:
            java.lang.String r1 = "ۤۢ۟"
            r10 = r1
            goto La
        L2e:
            r4 = 129(0x81, double:6.37E-322)
            long r4 = r4 ^ r8
            java.lang.String r1 = "ۥۣۥ"
            r10 = r1
            goto La
        L35:
            long r6 = (long) r3
            java.lang.String r1 = "ۤ۟ۨ"
            r8 = r6
            r10 = r1
            goto La
        L3b:
            int r1 = kevin.fun.hook.audio.C1117.f406
            java.lang.String r6 = "۠ۤۦ"
            r3 = r1
            r10 = r6
            goto La
        L42:
            androidx.loader.C1095.m2588(r2, r0, r4)
            java.lang.String r1 = "ۨۦۢ"
            r10 = r1
            goto La
        L49:
            return
    }

    /* JADX INFO: renamed from: lambda$30$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7133lambda$30$kevinfunhookKSHook(kevin.fun.hook.KSHook.DownloadDialogHolder r7, java.lang.ref.WeakReference r8, java.lang.String r9) {
            r6 = this;
            android.app.Dialog r0 = m6992(r7)
            m7005(r6, r0)
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r8)
            android.content.Context r0 = (android.content.Context) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r9)
            short[] r2 = m6972()
            r3 = 3954(0xf72, float:5.541E-42)
            int r4 = androidx.loader.C1097.f123
            r4 = r4 ^ 116(0x74, float:1.63E-43)
            r5 = 3256(0xcb8, float:4.563E-42)
            java.lang.String r2 = androidx.core.C1073.m1028(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7017(r6, r0, r1)
            int r1 = com.tencent.mmkv.C1109.m3598()
            r0 = 1616(0x650, float:2.264E-42)
        L37:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L3d;
                case 49: goto L40;
                case 204: goto L45;
                case 239: goto L54;
                default: goto L3c;
            }
        L3c:
            goto L37
        L3d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L37
        L40:
            if (r1 < 0) goto L3d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L37
        L45:
            java.lang.String r0 = "vZGStKRRcqUPO"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L54:
            return
    }

    /* JADX INFO: renamed from: lambda$31$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7134lambda$31$kevinfunhookKSHook(kevin.fun.hook.KSHook.DownloadDialogHolder r13, java.lang.ref.WeakReference r14, java.lang.Exception r15) {
            r12 = this;
            r3 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r6 = 0
            r11 = 0
            r10 = 0
            r7 = 0
            r0 = 0
            java.lang.String r9 = "۠۟"
            r2 = r0
        Ld:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r9)
            switch(r0) {
                case 56319: goto L7a;
                case 1746755: goto L82;
                case 1746783: goto L1b;
                case 1746819: goto L54;
                case 1747927: goto L37;
                case 1748706: goto L4b;
                case 1748895: goto L23;
                case 1749640: goto L3e;
                case 1750659: goto L5c;
                case 1751588: goto L74;
                case 1751593: goto L44;
                case 1751772: goto L2b;
                case 1751779: goto L64;
                case 1755622: goto L6c;
                default: goto L14;
            }
        L14:
            m7005(r12, r3)
            java.lang.String r0 = "ۣ۟ۧ"
            r9 = r0
            goto Ld
        L1b:
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r15)
            java.lang.String r9 = "ۣۡۢ"
            r5 = r0
            goto Ld
        L23:
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r8)
            java.lang.String r9 = "ۤۢۧ"
            r7 = r0
            goto Ld
        L2b:
            r0 = 3960(0xf78, float:5.549E-42)
            r7 = 608(0x260, float:8.52E-43)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r6, r0, r10, r7)
            java.lang.String r9 = "ۤۨۧ"
            r7 = r0
            goto Ld
        L37:
            r0 = r1
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r9 = "۟ۢۢ"
            r4 = r0
            goto Ld
        L3e:
            int r11 = androidx.startup.C1101.f127
            java.lang.String r0 = "ۤۢۢ"
            r9 = r0
            goto Ld
        L44:
            m7096(r12, r4, r7)
            java.lang.String r0 = "۟ۡۥ"
            r9 = r0
            goto Ld
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "ۣۣۣ"
            r8 = r0
            goto Ld
        L54:
            java.lang.Object r1 = kevin.fun.hook.audio.C1116.m8047(r14)
            java.lang.String r0 = "۠ۨ۟"
            r9 = r0
            goto Ld
        L5c:
            short[] r0 = m6972()
            java.lang.String r9 = "ۢۡۧ"
            r6 = r0
            goto Ld
        L64:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r8, r7)
            java.lang.String r9 = "ۨۨۦ"
            r2 = r0
            goto Ld
        L6c:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r5)
            java.lang.String r9 = "ۡۨۦ"
            r8 = r0
            goto Ld
        L74:
            r10 = r11 ^ 760(0x2f8, float:1.065E-42)
            java.lang.String r0 = "ۤۨ۠"
            r9 = r0
            goto Ld
        L7a:
            android.app.Dialog r0 = m6992(r13)
            java.lang.String r9 = "ۣۣۨ"
            r3 = r0
            goto Ld
        L82:
            return
    }

    /* JADX INFO: renamed from: lambda$32$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7135lambda$32$kevinfunhookKSHook(kevin.fun.hook.KSHook.DownloadDialogHolder r9, int r10, int r11, long r12) {
            r8 = this;
            r5 = 1
            r6 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            android.app.Dialog r1 = m6992(r9)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L15d;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            android.app.Dialog r0 = m6992(r9)
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3b;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 != 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            r0 = 1864(0x748, float:2.612E-42)
        L31:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L37;
                case 47483: goto L15d;
                default: goto L36;
            }
        L36:
            goto L31
        L37:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L31
        L3b:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3e:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L46;
                case 45: goto L112;
                case 76: goto L50;
                case 239: goto L4a;
                default: goto L45;
            }
        L45:
            goto L3e
        L46:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L3e
        L4a:
            if (r10 <= 0) goto L46
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L3e
        L50:
            int r0 = androidx.drawerlayout.C1077.f103
            r0 = r0 ^ 378(0x17a, float:5.3E-43)
            int r0 = r0 * r11
            int r0 = r0 / r10
            android.widget.ProgressBar r1 = m7070(r9)
            androidx.loader.C1094.m2504(r1, r0)
            android.widget.TextView r1 = m6981(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r0)
            short[] r2 = m6972()
            r3 = 3966(0xf7e, float:5.558E-42)
            r4 = 904(0x388, float:1.267E-42)
            java.lang.String r2 = androidx.loader.C1098.m2787(r2, r3, r5, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r2)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r1, r0)
            long r0 = androidx.lifecycle.process.C1089.m2100()
            long r2 = r0 - r12
            r0 = 48891(0xbefb, float:6.8511E-41)
        L8a:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L92;
                case 53: goto L15d;
                case 503: goto L96;
                case 32495: goto La0;
                default: goto L91;
            }
        L91:
            goto L8a
        L92:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L8a
        L96:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L92
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L8a
        La0:
            java.lang.String r0 = m7001(r8, r11, r2)
            java.util.Locale r1 = androidx.customview.C1075.m1125()
            double r2 = (double) r11
            double r2 = r2 / r6
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r2)
            double r4 = (double) r10
            double r4 = r4 / r6
            java.lang.Double r3 = androidx.core.ktx.C1071.m841(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = androidx.lifecycle.process.C1091.f117
            r5 = r5 ^ (-492(0xfffffffffffffe14, float:NaN))
            r4[r5] = r2
            int r2 = androidx.lifecycle.viewmodel.C1093.f119
            r2 = r2 ^ (-117(0xffffffffffffff8b, float:NaN))
            r4[r2] = r3
            short[] r2 = m6972()
            r3 = 3967(0xf7f, float:5.559E-42)
            int r5 = org.luckypray.dexkit.C1123.f433
            r5 = r5 ^ (-970(0xfffffffffffffc36, float:NaN))
            r6 = 3266(0xcc2, float:4.577E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r5, r6)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8117(r1, r2, r4)
            android.widget.TextView r2 = m7105(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r3, r1)
            short[] r3 = m6972()
            r4 = 3982(0xf8e, float:5.58E-42)
            int r5 = org.luckypray.dexkit.C1123.f433
            r5 = r5 ^ (-966(0xfffffffffffffc3a, float:NaN))
            r6 = 1463(0x5b7, float:2.05E-42)
            java.lang.String r3 = androidx.core.ktx.C1070.m788(r3, r4, r5, r6)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r2, r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        L106:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L10e;
                case 50: goto L15d;
                default: goto L10d;
            }
        L10d:
            goto L106
        L10e:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L106
        L112:
            android.widget.ProgressBar r0 = m7070(r9)
            androidx.lifecycle.livedata.C1085.m1834(r0, r5)
            android.widget.TextView r0 = m6981(r9)
            short[] r1 = m6972()
            r2 = 3985(0xf91, float:5.584E-42)
            int r3 = androidx.vectordrawable.C1104.f130
            r3 = r3 ^ 592(0x250, float:8.3E-43)
            r4 = 646(0x286, float:9.05E-43)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r1, r2, r3, r4)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
            android.widget.TextView r0 = m7105(r9)
            java.util.Locale r1 = androidx.customview.C1075.m1125()
            double r2 = (double) r11
            double r2 = r2 / r6
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r2)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r4 = androidx.lifecycle.process.C1087.f113
            r4 = r4 ^ (-624(0xfffffffffffffd90, float:NaN))
            r3[r4] = r2
            short[] r2 = m6972()
            r4 = 3988(0xf94, float:5.588E-42)
            int r5 = kevin.fun.hook.webdav.C1119.f418
            r5 = r5 ^ 288(0x120, float:4.04E-43)
            r6 = 1624(0x658, float:2.276E-42)
            java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r4, r5, r6)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8117(r1, r2, r3)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
        L15d:
            return
    }

    /* JADX INFO: renamed from: lambda$33$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7136lambda$33$kevinfunhookKSHook(java.lang.ref.WeakReference r4, kevin.fun.hook.KSHook.AtlasDownloadHolder r5, int r6) {
            r3 = this;
            m6974(r3, r4, r5, r6)
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            java.lang.String r0 = "Cl2gnQquLXfp"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: lambda$34$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7137lambda$34$kevinfunhookKSHook(java.lang.ref.WeakReference r2, kevin.fun.hook.KSHook.AtlasDownloadHolder r3, int r4, java.util.concurrent.atomic.AtomicInteger r5, long r6) {
            r1 = this;
            m7083(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7
            m7029(r1)
            return
        L7:
            r0 = move-exception
            m7029(r1)
            throw r0
    }

    /* JADX INFO: renamed from: lambda$35$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7138lambda$35$kevinfunhookKSHook(android.app.Dialog r8, android.content.Context r9, android.view.View r10) {
            r7 = this;
            r1 = 0
            r4 = 0
            java.lang.String r6 = "۠ۤ"
            r0 = r1
            r2 = r1
            r3 = r4
            r5 = r4
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 56382: goto L30;
                case 1746693: goto L39;
                case 1749729: goto L40;
                case 1749794: goto L22;
                case 1752519: goto L29;
                case 1752703: goto L16;
                default: goto Lf;
            }
        Lf:
            androidx.customview.C1074.m1118(r8)
            java.lang.String r1 = "ۢ۠"
            r6 = r1
            goto L8
        L16:
            r0 = 3994(0xf9a, float:5.597E-42)
            r1 = 2598(0xa26, float:3.64E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r2, r0, r5, r1)
            java.lang.String r1 = "ۥۣۡ"
            r6 = r1
            goto L8
        L22:
            r4 = r3 ^ (-607(0xfffffffffffffda1, float:NaN))
            java.lang.String r1 = "ۥۧۡ"
            r5 = r4
            r6 = r1
            goto L8
        L29:
            m7018(r7, r9, r0)
            java.lang.String r1 = "ۣۢۤ"
            r6 = r1
            goto L8
        L30:
            short[] r1 = m6972()
            java.lang.String r4 = "۟۟ۥ"
            r2 = r1
            r6 = r4
            goto L8
        L39:
            int r1 = androidx.documentfile.C1076.f102
            java.lang.String r4 = "ۢۦۦ"
            r3 = r1
            r6 = r4
            goto L8
        L40:
            return
    }

    /* JADX INFO: renamed from: lambda$36$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7139lambda$36$kevinfunhookKSHook(kevin.fun.hook.KSHook.AtlasDownloadHolder r7, java.lang.ref.WeakReference r8, java.util.concurrent.atomic.AtomicInteger r9, int r10) {
            r6 = this;
            r0 = 0
            r5 = 0
            java.lang.String r4 = "ۡۥ"
            r2 = r0
            r1 = r0
            r3 = r0
        L7:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r0) {
                case 1752676: goto L2d;
                case 1752679: goto L3b;
                case 1753509: goto L34;
                case 1753516: goto L25;
                case 1753631: goto L16;
                case 1755372: goto L1d;
                default: goto Le;
            }
        Le:
            android.app.Dialog r0 = m7058(r7)
            java.lang.String r4 = "ۦۢۡ"
            r2 = r0
            goto L7
        L16:
            m7094(r6, r3, r5, r10)
            java.lang.String r0 = "ۥۦۨ"
            r4 = r0
            goto L7
        L1d:
            java.lang.Object r1 = kevin.fun.hook.audio.C1116.m8047(r8)
            java.lang.String r0 = "ۥۦۥ"
            r4 = r0
            goto L7
        L25:
            int r5 = androidx.versionedparcelable.C1107.m3429(r9)
            java.lang.String r0 = "ۦۦ۟"
            r4 = r0
            goto L7
        L2d:
            r0 = r1
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r4 = "ۦۢۨ"
            r3 = r0
            goto L7
        L34:
            androidx.customview.C1074.m1118(r2)
            java.lang.String r0 = "ۨ۠ۤ"
            r4 = r0
            goto L7
        L3b:
            return
    }

    /* JADX INFO: renamed from: lambda$37$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7140lambda$37$kevinfunhookKSHook(kevin.fun.hook.KSHook.AtlasDownloadHolder r8, java.lang.ref.WeakReference r9, java.lang.Exception r10) {
            r7 = this;
            android.app.Dialog r0 = m7058(r8)
            androidx.customview.C1074.m1118(r0)
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r9)
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6972()
            r4 = 4001(0xfa1, float:5.607E-42)
            int r5 = androidx.activity.C1065.f91
            r5 = r5 ^ (-61)
            r6 = 2117(0x845, float:2.967E-42)
            java.lang.String r3 = androidx.activity.C1064.m310(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7096(r7, r0, r1)
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        L3b:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L41;
                case 49: goto L44;
                case 204: goto L49;
                case 239: goto L58;
                default: goto L40;
            }
        L40:
            goto L3b
        L41:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3b
        L44:
            if (r1 < 0) goto L41
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3b
        L49:
            java.lang.String r0 = "25"
            java.lang.String r0 = com.tencent.mmkv.C1109.m3585(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L58:
            return
    }

    /* JADX INFO: renamed from: lambda$4$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7141lambda$4$kevinfunhookKSHook(android.content.Context r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = m7044(r4)
            java.lang.Object r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1616(0x650, float:2.264E-42)
        Lc:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L4d;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r1 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r0 == 0) goto L12
            r1 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            boolean r2 = androidx.activity.C1066.m488(r0)
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L2b;
                case 471: goto L3a;
                case 500: goto L2e;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            if (r2 == 0) goto L2b
            r1 = 1833(0x729, float:2.569E-42)
            goto L20
        L2b:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L20
        L2e:
            r0 = 1864(0x748, float:2.612E-42)
        L30:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L36;
                case 47483: goto L4d;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L30
        L3a:
            m7098(r4, r5, r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L40:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L48;
                case 239: goto L49;
                default: goto L47;
            }
        L47:
            goto L40
        L48:
            return
        L49:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L40
        L4d:
            short[] r0 = m6972()
            r1 = 4009(0xfa9, float:5.618E-42)
            int r2 = androidx.loader.C1097.f123
            r2 = r2 ^ 124(0x7c, float:1.74E-43)
            r3 = 1363(0x553, float:1.91E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r1, r2, r3)
            m7018(r4, r5, r0)
            goto L48
    }

    /* JADX INFO: renamed from: lambda$40$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7142lambda$40$kevinfunhookKSHook(java.lang.ref.WeakReference r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r0 = kevin.fun.hook.audio.C1116.m8047(r4)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1616(0x650, float:2.264E-42)
        L8:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L19;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r0 == 0) goto Le
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            m7018(r3, r0, r5)
        L19:
            m7029(r3)
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L2d;
                case 471: goto L3f;
                case 500: goto L30;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            if (r1 > 0) goto L2d
            r0 = 1833(0x729, float:2.569E-42)
            goto L22
        L2d:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L22
        L30:
            java.lang.String r0 = "9V2DczZtwlm5wrXJupoQ"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3f:
            return
    }

    /* JADX INFO: renamed from: lambda$5$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7143lambda$5$kevinfunhookKSHook(java.lang.ref.WeakReference r7, android.content.Context r8, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r9, android.view.View r10) {
            r6 = this;
            m7103(r6, r7)
            android.os.Handler r0 = m7088()
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda6 r1 = new kevin.fun.hook.KSHook$$ExternalSyntheticLambda6
            r1.<init>(r6, r8, r9)
            r2 = 588(0x24c, double:2.905E-321)
            int r4 = androidx.versionedparcelable.C1107.f133
            long r4 = (long) r4
            long r2 = r2 ^ r4
            androidx.loader.C1095.m2588(r0, r1, r2)
            int r1 = androidx.loader.C1097.m2731()
            r0 = 1616(0x650, float:2.264E-42)
        L1b:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L21;
                case 49: goto L24;
                case 204: goto L29;
                case 239: goto L38;
                default: goto L20;
            }
        L20:
            goto L1b
        L21:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1b
        L24:
            if (r1 < 0) goto L21
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1b
        L29:
            java.lang.String r0 = "Xh8a6CftX4m2qvhKSIaczyE"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L38:
            return
    }

    /* JADX INFO: renamed from: lambda$6$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7144lambda$6$kevinfunhookKSHook(android.content.Context r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
            r0 = this;
            m7073(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: lambda$7$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7145lambda$7$kevinfunhookKSHook(android.app.Activity r8) {
            r7 = this;
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۣ۠ۡ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1750564: goto L2f;
                case 1751655: goto L1c;
                case 1752615: goto L28;
                case 1754414: goto L37;
                case 1755376: goto L16;
                default: goto Lf;
            }
        Lf:
            int r5 = androidx.emoji2.viewsintegration.C1078.f104
            java.lang.String r1 = "ۨ۠ۨ"
            r3 = r1
            r6 = r5
            goto L8
        L16:
            r4 = r6 ^ 631(0x277, float:8.84E-43)
            java.lang.String r1 = "ۤۤۧ"
            r3 = r1
            goto L8
        L1c:
            r0 = 4023(0xfb7, float:5.637E-42)
            r1 = 2234(0x8ba, float:3.13E-42)
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3338(r2, r0, r4, r1)
            java.lang.String r1 = "ۥۤۦ"
            r3 = r1
            goto L8
        L28:
            m7018(r7, r8, r0)
            java.lang.String r1 = "ۧ۠ۧ"
            r3 = r1
            goto L8
        L2f:
            short[] r1 = m6972()
            java.lang.String r3 = "ۧ۠ۡ"
            r2 = r1
            goto L8
        L37:
            return
    }

    /* JADX INFO: renamed from: lambda$8$kevin-fun-hook-KSHook, reason: not valid java name */
    /* synthetic */ void m7146lambda$8$kevinfunhookKSHook(java.lang.ref.WeakReference r3, android.view.View r4) {
            r2 = this;
            m7103(r2, r3)
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            java.lang.String r0 = "jH"
            java.lang.String r0 = androidx.appcompat.C1069.m702(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L22:
            return
    }
}
