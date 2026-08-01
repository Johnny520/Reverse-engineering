package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public class DownloadManager {
    private static final java.lang.String DEFAULT_FILE_NAME_FORMAT = null;
    private static final java.util.concurrent.ExecutorService DOWNLOAD_EXECUTOR = null;
    private static final java.lang.String KEY_FILE_NAME_FORMAT = null;
    private static final android.os.Handler MAIN_HANDLER = null;
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = null;
    private static final java.lang.String NOTIFICATION_CHANNEL_NAME = null;
    private static final int NOTIFICATION_ID_DOWNLOAD = 10001;
    private static final okhttp3.OkHttpClient OK_HTTP_CLIENT = null;
    private static final java.lang.String TAG = null;
    private static kevin.fun.hook.download.DownloadManager instance;
    private static androidx.core.app.NotificationCompat.Builder notificationBuilder;
    private static android.app.NotificationManager notificationManager;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f407short = null;
    private kevin.fun.hook.download.DownloadManager.BatchDownloadManager batchManager;
    byte[] buffer;
    private java.lang.String currentCommentAuthorAccount;
    private java.lang.String currentCommentAuthorName;
    private java.lang.String currentCommentAuthorUid;
    private long currentCommentCreateTime;
    private java.lang.String currentCommentId;
    private java.lang.String currentCommentText;
    private java.lang.String currentWorkAuthorAccount;
    private java.lang.String currentWorkAuthorName;
    private java.lang.String currentWorkAuthorUid;
    private long currentWorkCreateTime;
    private java.lang.String currentWorkVideoDesc;
    private java.lang.String currentWorkVideoId;


    public class BatchDownloadManager {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f408short = null;
        private java.util.concurrent.atomic.AtomicInteger failedCount;
        private java.util.concurrent.atomic.AtomicInteger finishedCount;
        private boolean isCompleted;
        private boolean isRunning;
        private android.app.Dialog progressDialog;
        private kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder progressHolder;
        private java.util.concurrent.atomic.AtomicInteger successCount;
        final kevin.fun.hook.download.DownloadManager this$0;
        private int totalCount;

        private class ProgressViewHolder {

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f409short = null;
            android.app.Dialog dialog;
            android.widget.TextView hintText;
            android.widget.ProgressBar progressBar;
            android.widget.TextView progressInfo;
            final kevin.fun.hook.download.DownloadManager.BatchDownloadManager this$1;

            static {
                    r0 = 35
                    short[] r0 = new short[r0]
                    r0 = {x000a: FILL_ARRAY_DATA , data: [379, 314, 382, 369, 382, 379, 314, 382, 374, 25422, 21441, 356, 379, 314, 382, 22639, -29573, 356, 379, 314, 375, 25241, 24274, 18417, -31097, 2522, 2527, 2462, 2517, 2527, 2462, 24214, 29588, 23582, 25986} // fill-array
                    kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder.f409short = r0
                    return
            }

            ProgressViewHolder(kevin.fun.hook.download.DownloadManager.BatchDownloadManager r3, android.widget.ProgressBar r4, android.widget.TextView r5, android.widget.TextView r6, android.app.Dialog r7) {
                    r2 = this;
                    r2.this$1 = r3
                    r2.<init>()
                    r2.progressBar = r4
                    r2.progressInfo = r5
                    r2.hintText = r6
                    r2.dialog = r7
                    int r1 = androidx.customview.C1074.m1071()
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
                    if (r1 < 0) goto L19
                    r0 = 1709(0x6ad, float:2.395E-42)
                    goto L13
                L21:
                    java.lang.String r0 = "0vd3DP"
                    java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1925(r0)
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    java.io.PrintStream r1 = java.lang.System.out
                    r1.println(r0)
                L30:
                    return
            }

            /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
            public static short[] m8309() {
                    int r1 = org.luckypray.dexkit.C1125.m10627()
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
                    short[] r0 = kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder.f409short
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

            /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
            public static android.widget.TextView m8310(java.lang.Object r2) {
                    int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
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
                    kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder) r2
                    android.widget.TextView r0 = r2.progressInfo
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

            /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
            public static android.widget.ProgressBar m8311(java.lang.Object r2) {
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
                    if (r1 > 0) goto Lc
                    r0 = 1709(0x6ad, float:2.395E-42)
                    goto L6
                L14:
                    kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder) r2
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

            /* JADX INFO: renamed from: ۧۦۥۧ, reason: not valid java name and contains not printable characters */
            public static android.widget.TextView m8312(java.lang.Object r2) {
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
                    kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder) r2
                    android.widget.TextView r0 = r2.hintText
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

            void update(int r8, int r9, int r10, int r11) {
                    r7 = this;
                    android.widget.ProgressBar r1 = m8311(r7)
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
                    if (r1 == 0) goto Lc
                    r0 = 1709(0x6ad, float:2.395E-42)
                    goto L6
                L14:
                    android.widget.ProgressBar r0 = m8311(r7)
                    androidx.loader.C1094.m2504(r0, r8)
                    android.widget.ProgressBar r0 = m8311(r7)
                    dev.rikka.ndk.thirdparty.libcxx.C1111.m3733(r0, r9)
                L22:
                    android.widget.TextView r1 = m8310(r7)
                    r0 = 1740(0x6cc, float:2.438E-42)
                L28:
                    r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                    switch(r0) {
                        case 17: goto L2e;
                        case 54: goto L33;
                        case 471: goto L7b;
                        case 500: goto L36;
                        default: goto L2d;
                    }
                L2d:
                    goto L28
                L2e:
                    if (r1 == 0) goto L33
                    r0 = 1833(0x729, float:2.569E-42)
                    goto L28
                L33:
                    r0 = 1802(0x70a, float:2.525E-42)
                    goto L28
                L36:
                    android.widget.TextView r0 = m8310(r7)
                    java.lang.Integer r1 = androidx.activity.C1064.m334(r8)
                    java.lang.Integer r2 = androidx.activity.C1064.m334(r9)
                    java.lang.Integer r3 = androidx.activity.C1064.m334(r10)
                    java.lang.Integer r4 = androidx.activity.C1064.m334(r11)
                    r5 = 4
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    int r6 = kevin.fun.hook.audio.C1115.f404
                    r6 = r6 ^ 802(0x322, float:1.124E-42)
                    r5[r6] = r1
                    int r1 = androidx.loader.C1097.f123
                    r1 = r1 ^ 115(0x73, float:1.61E-43)
                    r5[r1] = r2
                    int r1 = androidx.loader.C1094.f120
                    r1 = r1 ^ 374(0x176, float:5.24E-43)
                    r5[r1] = r3
                    int r1 = androidx.drawerlayout.C1077.f103
                    r1 = r1 ^ 285(0x11d, float:4.0E-43)
                    r5[r1] = r4
                    short[] r1 = m8309()
                    r2 = 0
                    int r3 = androidx.lifecycle.livedata.C1085.f111
                    r3 = r3 ^ 792(0x318, float:1.11E-42)
                    r4 = 350(0x15e, float:4.9E-43)
                    java.lang.String r1 = androidx.loader.C1096.m2645(r1, r2, r3, r4)
                    java.lang.String r1 = androidx.versionedparcelable.C1106.m3391(r1, r5)
                    androidx.lifecycle.process.C1087.m1946(r0, r1)
                L7b:
                    android.widget.TextView r1 = m8312(r7)
                    r0 = 1864(0x748, float:2.612E-42)
                L81:
                    r0 = r0 ^ 1881(0x759, float:2.636E-42)
                    switch(r0) {
                        case 17: goto L87;
                        case 47384: goto Le3;
                        case 47417: goto L91;
                        case 47483: goto L8d;
                        default: goto L86;
                    }
                L86:
                    goto L81
                L87:
                    if (r1 == 0) goto L8d
                    r0 = 48736(0xbe60, float:6.8294E-41)
                    goto L81
                L8d:
                    r0 = 48705(0xbe41, float:6.825E-41)
                    goto L81
                L91:
                    android.widget.TextView r2 = m8312(r7)
                    r0 = 48767(0xbe7f, float:6.8337E-41)
                L98:
                    r1 = 48784(0xbe90, float:6.8361E-41)
                    r0 = r0 ^ r1
                    switch(r0) {
                        case 14: goto La0;
                        case 45: goto Le8;
                        case 76: goto Laa;
                        case 239: goto La4;
                        default: goto L9f;
                    }
                L9f:
                    goto L98
                La0:
                    r0 = 48829(0xbebd, float:6.8424E-41)
                    goto L98
                La4:
                    if (r8 >= r9) goto La0
                    r0 = 48860(0xbedc, float:6.8467E-41)
                    goto L98
                Laa:
                    java.lang.Integer r0 = androidx.activity.C1064.m334(r8)
                    java.lang.Integer r1 = androidx.activity.C1064.m334(r9)
                    r3 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    int r4 = androidx.lifecycle.viewmodel.C1093.f119
                    r4 = r4 ^ (-118(0xffffffffffffff8a, float:NaN))
                    r3[r4] = r0
                    int r0 = androidx.emoji2.viewsintegration.C1078.f104
                    r0 = r0 ^ 614(0x266, float:8.6E-43)
                    r3[r0] = r1
                    short[] r0 = m8309()
                    r1 = 21
                    int r4 = androidx.core.ktx.C1071.f97
                    r4 = r4 ^ 904(0x388, float:1.267E-42)
                    r5 = 2554(0x9fa, float:3.579E-42)
                    java.lang.String r0 = androidx.appcompat.C1069.m751(r0, r1, r4, r5)
                    java.lang.String r0 = androidx.versionedparcelable.C1106.m3391(r0, r3)
                    r1 = 48891(0xbefb, float:6.8511E-41)
                Ld8:
                    r3 = 48908(0xbf0c, float:6.8535E-41)
                    r1 = r1 ^ r3
                    switch(r1) {
                        case 22: goto Le0;
                        case 503: goto Le4;
                        default: goto Ldf;
                    }
                Ldf:
                    goto Ld8
                Le0:
                    androidx.lifecycle.process.C1087.m1946(r2, r0)
                Le3:
                    return
                Le4:
                    r1 = 48922(0xbf1a, float:6.8554E-41)
                    goto Ld8
                Le8:
                    short[] r0 = m8309()
                    r1 = 31
                    int r3 = kevin.fun.hook.webdav.C1118.f417
                    r3 = r3 ^ (-367(0xfffffffffffffe91, float:NaN))
                    r4 = 1938(0x792, float:2.716E-42)
                    java.lang.String r0 = androidx.vectordrawable.C1103.m3132(r0, r1, r3, r4)
                    goto Le0
            }
        }

        static {
                r0 = 60
                short[] r0 = new short[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [14488, 2243, 2285, 2302, 2273, 2278, 2213, 2252, 2279, 2303, 2278, 2276, 2279, 2281, 2284, 14489, 2216, 23035, -25243, -30893, 22062, 21361, -31915, 24782, 20921, -31315, 2226, 2216, 17642, -31332, 20845, 26865, 2753, 11762, 2795, 26865, 22654, 2779, 2753, 2756, 2693, 2753, 2753, 21456, -30780, 2779, 2753, 2756, 2693, 2062, 2078, 2065, 2078, 28655, 21412, 23944, 28810, 1186, 1186, 1186} // fill-array
                kevin.fun.hook.download.DownloadManager.BatchDownloadManager.f408short = r0
                return
        }

        public BatchDownloadManager(kevin.fun.hook.download.DownloadManager r3) {
                r2 = this;
                r1 = 0
                r2.this$0 = r3
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>(r1)
                r2.finishedCount = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>(r1)
                r2.successCount = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>(r1)
                r2.failedCount = r0
                r2.totalCount = r1
                r2.isRunning = r1
                r2.isCompleted = r1
                int r1 = androidx.core.C1072.m980()
                r0 = 1616(0x650, float:2.264E-42)
            L27:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L2d;
                    case 49: goto L30;
                    case 204: goto L35;
                    case 239: goto L44;
                    default: goto L2c;
                }
            L2c:
                goto L27
            L2d:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L27
            L30:
                if (r1 > 0) goto L2d
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L27
            L35:
                java.lang.String r0 = "WOajshmhSyL"
                java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L44:
                return
        }

        private void dismissProgressDialog() {
                r7 = this;
                r6 = 0
                android.app.Dialog r1 = m8300(r7)     // Catch: java.lang.Throwable -> L44
                r0 = 1616(0x650, float:2.264E-42)
            L7:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Ld;
                    case 49: goto L10;
                    case 204: goto L15;
                    case 239: goto L34;
                    default: goto Lc;
                }     // Catch: java.lang.Throwable -> L44
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
                android.app.Dialog r0 = m8300(r7)     // Catch: java.lang.Throwable -> L44
                boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)     // Catch: java.lang.Throwable -> L44
                r0 = 1740(0x6cc, float:2.438E-42)
            L1f:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L25;
                    case 54: goto L2a;
                    case 471: goto L34;
                    case 500: goto L2d;
                    default: goto L24;
                }     // Catch: java.lang.Throwable -> L44
            L24:
                goto L1f
            L25:
                if (r1 == 0) goto L2a
                r0 = 1833(0x729, float:2.569E-42)
                goto L1f
            L2a:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L1f
            L2d:
                android.app.Dialog r0 = m8300(r7)     // Catch: java.lang.Throwable -> L44
                androidx.customview.C1074.m1118(r0)     // Catch: java.lang.Throwable -> L44
            L34:
                r7.progressDialog = r6
                r7.progressHolder = r6
                r0 = 1864(0x748, float:2.612E-42)
            L3a:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L40;
                    case 47483: goto L7b;
                    default: goto L3f;
                }
            L3f:
                goto L3a
            L40:
                r0 = 48674(0xbe22, float:6.8207E-41)
                goto L3a
            L44:
                r0 = move-exception
                java.lang.String r0 = androidx.loader.C1099.m2895(r0)     // Catch: java.lang.Throwable -> La0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
                r1.<init>()     // Catch: java.lang.Throwable -> La0
                short[] r2 = m8294()     // Catch: java.lang.Throwable -> La0
                r3 = 0
                int r4 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> La0
                r4 = r4 ^ 771(0x303, float:1.08E-42)
                r5 = 2184(0x888, float:3.06E-42)
                java.lang.String r2 = androidx.customview.C1075.m1138(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La0
                java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> La0
                java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> La0
                java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> La0
                m8290(r0)     // Catch: java.lang.Throwable -> La0
                r0 = 48767(0xbe7f, float:6.8337E-41)
            L6f:
                r1 = 48784(0xbe90, float:6.8361E-41)
                r0 = r0 ^ r1
                switch(r0) {
                    case 14: goto L34;
                    case 239: goto L77;
                    default: goto L76;
                }
            L76:
                goto L6f
            L77:
                r0 = 48798(0xbe9e, float:6.838E-41)
                goto L6f
            L7b:
                int r1 = androidx.annotation.experimental.C1067.m596()
                r0 = 48891(0xbefb, float:6.8511E-41)
            L82:
                r2 = 48908(0xbf0c, float:6.8535E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 22: goto L8a;
                    case 53: goto L9f;
                    case 503: goto L8e;
                    case 32495: goto L94;
                    default: goto L89;
                }
            L89:
                goto L82
            L8a:
                r0 = 48953(0xbf39, float:6.8598E-41)
                goto L82
            L8e:
                if (r1 < 0) goto L8a
                r0 = 49635(0xc1e3, float:6.9553E-41)
                goto L82
            L94:
                java.lang.String r0 = "kwdjs2Z8KMTtAzFwdyMI"
                java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L9f:
                return
            La0:
                r0 = move-exception
                r7.progressDialog = r6
                r7.progressHolder = r6
                throw r0
        }

        private void updateProgress() {
                r2 = this;
                android.os.Handler r0 = m8296()
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda0 r1 = new kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda0
                r1.<init>(r2)
                androidx.activity.C1062.m178(r0, r1)
                return
        }

        /* JADX INFO: renamed from: ۟۟ۡۡ۟, reason: not valid java name and contains not printable characters */
        public static kevin.fun.hook.download.DownloadManager m8289(java.lang.Object r2) {
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                kevin.fun.hook.download.DownloadManager r0 = r2.this$0
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

        /* JADX INFO: renamed from: ۟۟ۢۧۧ, reason: not valid java name and contains not printable characters */
        public static void m8290(java.lang.Object r2) {
                int r1 = kevin.fun.hook.webdav.C1118.m8486()
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

        /* JADX INFO: renamed from: ۟۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
        public static void m8291(java.lang.Object r2) {
                int r1 = androidx.startup.C1100.m2972()
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                r2.dismissProgressDialog()
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

        /* JADX INFO: renamed from: ۣ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
        public static java.util.concurrent.atomic.AtomicInteger m8292(java.lang.Object r2) {
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                java.util.concurrent.atomic.AtomicInteger r0 = r2.failedCount
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

        /* JADX INFO: renamed from: ۟۠ۨۥۡ, reason: not valid java name and contains not printable characters */
        public static void m8293(java.lang.Object r2, int r3, int r4, int r5, int r6) {
                int r1 = androidx.activity.C1066.m518()
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder) r2
                r2.update(r3, r4, r5, r6)
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

        /* JADX INFO: renamed from: ۟ۢۡۤ۟, reason: not valid java name and contains not printable characters */
        public static short[] m8294() {
                int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
                short[] r0 = kevin.fun.hook.download.DownloadManager.BatchDownloadManager.f408short
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

        /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
        public static int m8295(java.lang.Object r2) {
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
                if (r1 < 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                int r0 = r2.totalCount
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

        /* JADX INFO: renamed from: ۟ۦ۟۠ۤ, reason: not valid java name and contains not printable characters */
        public static android.os.Handler m8296() {
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
                android.os.Handler r0 = kevin.fun.hook.download.DownloadManager._$$Nest$sfgetMAIN_HANDLER()
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

        /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
        public static boolean m8297(java.lang.Object r2) {
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                boolean r0 = r2.isRunning
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

        /* JADX INFO: renamed from: ۡۥ۠ۡ, reason: not valid java name and contains not printable characters */
        public static java.util.concurrent.atomic.AtomicInteger m8298(java.lang.Object r2) {
                int r1 = androidx.activity.C1063.m300()
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                java.util.concurrent.atomic.AtomicInteger r0 = r2.successCount
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

        /* JADX INFO: renamed from: ۡۨۦۡ, reason: not valid java name and contains not printable characters */
        public static int m8299(java.lang.Object r2, java.lang.Object r3, float r4) {
                int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
                kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
                android.content.Context r3 = (android.content.Context) r3
                int r0 = kevin.fun.hook.download.DownloadManager._$$Nest$mdp(r2, r3, r4)
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

        /* JADX INFO: renamed from: ۢۥ۠ۦ, reason: not valid java name and contains not printable characters */
        public static android.app.Dialog m8300(java.lang.Object r2) {
                int r1 = com.tencent.mmkv.C1109.m3598()
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                android.app.Dialog r0 = r2.progressDialog
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

        /* JADX INFO: renamed from: ۣۧ۠, reason: not valid java name and contains not printable characters */
        public static boolean m8301(java.lang.Object r2) {
                int r1 = androidx.activity.C1064.m377()
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                boolean r0 = r2.isCompleted
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

        /* JADX INFO: renamed from: ۦ۠ۧۡ, reason: contains not printable characters */
        public static java.util.concurrent.atomic.AtomicInteger m8302(java.lang.Object r2) {
                int r1 = com.tencent.mmkv.C1109.m3598()
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                java.util.concurrent.atomic.AtomicInteger r0 = r2.finishedCount
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

        /* JADX INFO: renamed from: ۦۤ۟ۢ, reason: contains not printable characters */
        public static void m8303(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
                int r1 = org.luckypray.dexkit.C1123.m10509()
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
                kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
                android.content.Context r3 = (android.content.Context) r3
                java.lang.String r4 = (java.lang.String) r4
                kevin.fun.hook.download.DownloadManager._$$Nest$mshowSuccessToast(r2, r3, r4)
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

        /* JADX INFO: renamed from: ۧۧۢۧ, reason: not valid java name and contains not printable characters */
        public static kevin.fun.hook.download.DownloadManager.BatchDownloadManager.ProgressViewHolder m8304(java.lang.Object r2) {
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r0 = r2.progressHolder
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

        public boolean isRunning() {
                r1 = this;
                boolean r0 = m8297(r1)
                return r0
        }

        /* JADX INFO: renamed from: lambda$0$kevin-fun-hook-download-DownloadManager$BatchDownloadManager */
        /* synthetic */ void m102x95c48e30(int r5) {
                r4 = this;
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r1 = m8304(r4)
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L2f;
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
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r0 = m8304(r4)
                int r1 = m8295(r4)
                java.util.concurrent.atomic.AtomicInteger r2 = m8298(r4)
                int r2 = androidx.versionedparcelable.C1107.m3429(r2)
                java.util.concurrent.atomic.AtomicInteger r3 = m8292(r4)
                int r3 = androidx.versionedparcelable.C1107.m3429(r3)
                m8293(r0, r5, r1, r2, r3)
            L2f:
                int r1 = kevin.fun.hook.audio.C1114.m7895()
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
                if (r1 > 0) goto L40
                r0 = 1833(0x729, float:2.569E-42)
                goto L35
            L40:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L35
            L43:
                java.lang.String r0 = "bEzfwrnJ307IFsQOqqkhUAwFnk"
                java.lang.String r0 = androidx.activity.C1063.m233(r0)
                long r0 = java.lang.Long.parseLong(r0)
                java.io.PrintStream r2 = java.lang.System.out
                r2.println(r0)
            L52:
                return
        }

        /* JADX INFO: renamed from: lambda$1$kevin-fun-hook-download-DownloadManager$BatchDownloadManager */
        /* synthetic */ void m103x2a02fdcf(android.content.Context r6, int r7, int r8) {
                r5 = this;
                m8291(r5)
                r0 = 1616(0x650, float:2.264E-42)
            L5:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lb;
                    case 49: goto Le;
                    case 204: goto L13;
                    case 239: goto L70;
                    default: goto La;
                }
            La:
                goto L5
            Lb:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L5
            Le:
                if (r6 == 0) goto Lb
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L5
            L13:
                boolean r1 = r6 instanceof android.app.Activity
                r0 = 1740(0x6cc, float:2.438E-42)
            L17:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L1d;
                    case 54: goto L22;
                    case 471: goto L3e;
                    case 500: goto L25;
                    default: goto L1c;
                }
            L1c:
                goto L17
            L1d:
                if (r1 == 0) goto L22
                r0 = 1833(0x729, float:2.569E-42)
                goto L17
            L22:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L17
            L25:
                r0 = r6
                android.app.Activity r0 = (android.app.Activity) r0
                boolean r1 = androidx.loader.C1098.m2818(r0)
                r0 = 1864(0x748, float:2.612E-42)
            L2e:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L34;
                    case 47384: goto L70;
                    case 47417: goto L3e;
                    case 47483: goto L3a;
                    default: goto L33;
                }
            L33:
                goto L2e
            L34:
                if (r1 != 0) goto L3a
                r0 = 48736(0xbe60, float:6.8294E-41)
                goto L2e
            L3a:
                r0 = 48705(0xbe41, float:6.825E-41)
                goto L2e
            L3e:
                java.lang.Integer r0 = androidx.activity.C1064.m334(r7)
                java.lang.Integer r1 = androidx.activity.C1064.m334(r8)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                int r3 = androidx.vectordrawable.C1105.f131
                r3 = r3 ^ 358(0x166, float:5.02E-43)
                r2[r3] = r0
                int r0 = androidx.lifecycle.process.C1089.f115
                r0 = r0 ^ 929(0x3a1, float:1.302E-42)
                r2[r0] = r1
                short[] r0 = m8294()
                r1 = 28
                int r3 = androidx.activity.C1062.f88
                r3 = r3 ^ (-96)
                r4 = 2785(0xae1, float:3.903E-42)
                java.lang.String r0 = kevin.fun.hook.C1120.m8645(r0, r1, r3, r4)
                java.lang.String r0 = androidx.versionedparcelable.C1106.m3391(r0, r2)
                kevin.fun.hook.download.DownloadManager r1 = m8289(r5)
                m8303(r1, r6, r0)
            L70:
                androidx.emoji2.viewsintegration.C1078.m1389(r5)
                return
        }

        /* JADX INFO: renamed from: lambda$2$kevin-fun-hook-download-DownloadManager$BatchDownloadManager */
        /* synthetic */ void m104xbe416d6e() {
                r5 = this;
                boolean r1 = m8297(r5)
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L4d;
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
                android.app.Dialog r1 = m8300(r5)
                r0 = 1740(0x6cc, float:2.438E-42)
            L1a:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L20;
                    case 54: goto L25;
                    case 471: goto L4d;
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
                android.app.Dialog r0 = m8300(r5)
                boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
                r0 = 1864(0x748, float:2.612E-42)
            L32:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L38;
                    case 47384: goto L52;
                    case 47417: goto L42;
                    case 47483: goto L3e;
                    default: goto L37;
                }
            L37:
                goto L32
            L38:
                if (r1 != 0) goto L3e
                r0 = 48736(0xbe60, float:6.8294E-41)
                goto L32
            L3e:
                r0 = 48705(0xbe41, float:6.825E-41)
                goto L32
            L42:
                r0 = 48767(0xbe7f, float:6.8337E-41)
            L45:
                r1 = 48784(0xbe90, float:6.8361E-41)
                r0 = r0 ^ r1
                switch(r0) {
                    case 14: goto L4d;
                    case 239: goto L4e;
                    default: goto L4c;
                }
            L4c:
                goto L45
            L4d:
                return
            L4e:
                r0 = 48798(0xbe9e, float:6.838E-41)
                goto L45
            L52:
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r1 = m8304(r5)
                r0 = 48891(0xbefb, float:6.8511E-41)
            L59:
                r2 = 48908(0xbf0c, float:6.8535E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 22: goto L61;
                    case 53: goto L4d;
                    case 503: goto L65;
                    case 32495: goto L6b;
                    default: goto L60;
                }
            L60:
                goto L59
            L61:
                r0 = 48953(0xbf39, float:6.8598E-41)
                goto L59
            L65:
                if (r1 == 0) goto L61
                r0 = 49635(0xc1e3, float:6.9553E-41)
                goto L59
            L6b:
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r0 = m8304(r5)
                java.util.concurrent.atomic.AtomicInteger r1 = m8302(r5)
                int r1 = androidx.versionedparcelable.C1107.m3429(r1)
                int r2 = m8295(r5)
                java.util.concurrent.atomic.AtomicInteger r3 = m8298(r5)
                int r3 = androidx.versionedparcelable.C1107.m3429(r3)
                java.util.concurrent.atomic.AtomicInteger r4 = m8292(r5)
                int r4 = androidx.versionedparcelable.C1107.m3429(r4)
                m8293(r0, r1, r2, r3, r4)
                goto L4d
        }

        /* JADX INFO: renamed from: lambda$3$kevin-fun-hook-download-DownloadManager$BatchDownloadManager */
        /* synthetic */ void m105x527fdd0d(android.content.Context r11, java.lang.String r12, int r13) {
                r10 = this;
                android.app.Dialog r1 = m8300(r10)
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L33;
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
                android.app.Dialog r0 = m8300(r10)
                boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
                r0 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L24;
                    case 54: goto L29;
                    case 471: goto L33;
                    case 500: goto L2c;
                    default: goto L23;
                }
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
                android.app.Dialog r0 = m8300(r10)
                androidx.customview.C1074.m1118(r0)
            L33:
                android.app.Dialog r0 = new android.app.Dialog
                r1 = 16973922(0x1030062, float:2.4061175E-38)
                int r2 = androidx.loader.C1097.f123
                r1 = r1 ^ r2
                r0.<init>(r11, r1)
                r10.progressDialog = r0
                android.app.Dialog r0 = m8300(r10)
                r1 = 0
                androidx.lifecycle.runtime.C1092.m2297(r0, r1)
                android.widget.FrameLayout r0 = new android.widget.FrameLayout
                r0.<init>(r11)
                int r1 = androidx.core.ktx.C1071.f97
                r1 = r1 ^ (-899(0xfffffffffffffc7d, float:NaN))
                android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
                r2.<init>(r1, r1)
                androidx.lifecycle.process.C1091.m2273(r0, r2)
                r2 = -1711276966(0xffffffff99fffc5a, float:-2.6468306E-23)
                int r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
                r2 = r2 ^ r3
                androidx.lifecycle.livedata.C1084.m1783(r0, r2)
                android.widget.LinearLayout r6 = new android.widget.LinearLayout
                r6.<init>(r11)
                r2 = 1
                androidx.customview.C1074.m1119(r6, r2)
                int r2 = androidx.customview.C1075.f101
                r5 = r2 ^ (-117(0xffffffffffffff8b, float:NaN))
                androidx.emoji2.C1080.m1542(r6, r5)
                kevin.fun.hook.download.DownloadManager r2 = m8289(r10)
                r3 = 1103101952(0x41c00000, float:24.0)
                int r2 = m8299(r2, r11, r3)
                kevin.fun.hook.download.DownloadManager r3 = m8289(r10)
                r4 = 1103101952(0x41c00000, float:24.0)
                int r3 = m8299(r3, r11, r4)
                kevin.fun.hook.download.DownloadManager r4 = m8289(r10)
                r7 = 1103101952(0x41c00000, float:24.0)
                int r4 = m8299(r4, r11, r7)
                kevin.fun.hook.download.DownloadManager r7 = m8289(r10)
                r8 = 1103101952(0x41c00000, float:24.0)
                int r7 = m8299(r7, r11, r8)
                androidx.drawerlayout.C1077.m1314(r6, r2, r3, r4, r7)
                android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
                kevin.fun.hook.download.DownloadManager r3 = m8289(r10)
                r4 = 1133903872(0x43960000, float:300.0)
                int r3 = m8299(r3, r11, r4)
                int r4 = androidx.loader.C1097.f123
                r4 = r4 ^ (-116(0xffffffffffffff8c, float:NaN))
                r2.<init>(r3, r4)
                r2.gravity = r5
                androidx.vectordrawable.C1105.m3296(r6, r2)
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                androidx.lifecycle.livedata.C1085.m1879(r2, r1)
                kevin.fun.hook.download.DownloadManager r3 = m8289(r10)
                r4 = 1101004800(0x41a00000, float:20.0)
                int r3 = m8299(r3, r11, r4)
                float r3 = (float) r3
                androidx.lifecycle.process.C1091.m2252(r2, r3)
                androidx.activity.C1065.m397(r6, r2)
                android.widget.TextView r2 = new android.widget.TextView
                r2.<init>(r11)
                androidx.lifecycle.process.C1087.m1946(r2, r12)
                r3 = 1098907648(0x41800000, float:16.0)
                androidx.vectordrawable.animated.C1102.m3105(r2, r3)
                android.graphics.Typeface r3 = androidx.emoji2.C1080.m1508()
                androidx.customview.C1074.m47(r2, r3)
                r3 = -13422445(0xffffffffff333093, float:-2.3818402E38)
                int r4 = androidx.lifecycle.process.C1089.f115
                r3 = r3 ^ r4
                kevin.fun.hook.webdav.C1118.m8517(r2, r3)
                androidx.documentfile.C1076.m1233(r2, r5)
                r3 = 0
                r4 = 0
                r7 = 0
                kevin.fun.hook.download.DownloadManager r8 = m8289(r10)
                r9 = 1098907648(0x41800000, float:16.0)
                int r8 = m8299(r8, r11, r9)
                kevin.fun.hook.audio.C1117.m8126(r2, r3, r4, r7, r8)
                androidx.activity.C1064.m372(r6, r2)
                android.widget.ProgressBar r2 = new android.widget.ProgressBar
                r3 = 0
                r4 = -16842860(0xfffffffffefeff94, float:-1.6947547E38)
                int r7 = kevin.fun.hook.audio.C1114.f403
                r4 = r4 ^ r7
                r2.<init>(r11, r3, r4)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                kevin.fun.hook.download.DownloadManager r4 = m8289(r10)
                r7 = 1082130432(0x40800000, float:4.0)
                int r4 = m8299(r4, r11, r7)
                r3.<init>(r1, r4)
                dev.rikka.ndk.thirdparty.libcxx.C1111.m3778(r2, r3)
                dev.rikka.ndk.thirdparty.libcxx.C1111.m3733(r2, r13)
                r1 = 0
                androidx.loader.C1094.m2504(r2, r1)
                androidx.activity.C1064.m372(r6, r2)
                android.widget.TextView r3 = new android.widget.TextView
                r3.<init>(r11)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                short[] r4 = m8294()
                r7 = 49
                int r8 = org.luckypray.dexkit.C1123.f433
                r8 = r8 ^ (-963(0xfffffffffffffc3d, float:NaN))
                r9 = 2110(0x83e, float:2.957E-42)
                java.lang.String r4 = androidx.lifecycle.process.C1088.m2044(r4, r7, r8, r9)
                java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)
                java.lang.StringBuilder r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r1, r13)
                java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
                androidx.lifecycle.process.C1087.m1946(r3, r1)
                r1 = 1096810496(0x41600000, float:14.0)
                androidx.vectordrawable.animated.C1102.m3105(r3, r1)
                r1 = 43218(0xa8d2, float:6.0561E-41)
                int r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
                r1 = r1 ^ r4
                kevin.fun.hook.webdav.C1118.m8517(r3, r1)
                android.graphics.Typeface r1 = androidx.emoji2.C1080.m1508()
                androidx.customview.C1074.m47(r3, r1)
                androidx.documentfile.C1076.m1233(r3, r5)
                r1 = 0
                kevin.fun.hook.download.DownloadManager r4 = m8289(r10)
                r7 = 1094713344(0x41400000, float:12.0)
                int r4 = m8299(r4, r11, r7)
                r7 = 0
                r8 = 0
                kevin.fun.hook.audio.C1117.m8126(r3, r1, r4, r7, r8)
                androidx.activity.C1064.m372(r6, r3)
                android.widget.TextView r4 = new android.widget.TextView
                r4.<init>(r11)
                short[] r1 = m8294()
                r7 = 53
                int r8 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
                r8 = r8 ^ (-931(0xfffffffffffffc5d, float:NaN))
                r9 = 1164(0x48c, float:1.631E-42)
                java.lang.String r1 = androidx.lifecycle.livedata.C1086.m1920(r1, r7, r8, r9)
                androidx.lifecycle.process.C1087.m1946(r4, r1)
                r1 = 1094713344(0x41400000, float:12.0)
                androidx.vectordrawable.animated.C1102.m3105(r4, r1)
                r1 = -6710832(0xffffffffff9999d0, float:NaN)
                int r7 = kevin.fun.hook.audio.C1117.f406
                r1 = r1 ^ r7
                kevin.fun.hook.webdav.C1118.m8517(r4, r1)
                androidx.documentfile.C1076.m1233(r4, r5)
                r1 = 0
                kevin.fun.hook.download.DownloadManager r5 = m8289(r10)
                r7 = 1090519040(0x41000000, float:8.0)
                int r5 = m8299(r5, r11, r7)
                r7 = 0
                r8 = 0
                kevin.fun.hook.audio.C1117.m8126(r4, r1, r5, r7, r8)
                androidx.activity.C1064.m372(r6, r4)
                androidx.annotation.experimental.C1067.m579(r0, r6)
                android.app.Dialog r1 = m8300(r10)
                androidx.viewpager.C1108.m3545(r1, r0)
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder r0 = new kevin.fun.hook.download.DownloadManager$BatchDownloadManager$ProgressViewHolder
                android.app.Dialog r5 = m8300(r10)
                r1 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r10.progressHolder = r0
                android.app.Dialog r0 = m8300(r10)
                kevin.fun.hook.audio.C1114.m7909(r0)
                r0 = 1063675494(0x3f666666, float:0.9)
                com.tencent.mmkv.C1109.m3569(r6, r0)
                r0 = 1063675494(0x3f666666, float:0.9)
                androidx.vectordrawable.animated.C1102.m3064(r6, r0)
                r0 = 0
                androidx.lifecycle.livedata.C1084.m1764(r6, r0)
                android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r6)
                r1 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r1)
                r1 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r1)
                r1 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r1)
                r2 = -878(0xfffffffffffffc92, double:NaN)
                int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
                long r4 = (long) r1
                long r2 = r2 ^ r4
                android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)
                android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
                r1.<init>()
                android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r1)
                dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)
                return
        }

        public void onTaskComplete(boolean r9) {
                r8 = this;
                boolean r1 = m8297(r8)
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L11e;
                    case 239: goto L14;
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
                java.util.concurrent.atomic.AtomicInteger r0 = m8302(r8)
                androidx.versionedparcelable.C1106.m3387(r0)
                r0 = 1740(0x6cc, float:2.438E-42)
            L1d:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L23;
                    case 54: goto L28;
                    case 471: goto L3e;
                    case 500: goto L2b;
                    default: goto L22;
                }
            L22:
                goto L1d
            L23:
                if (r9 == 0) goto L28
                r0 = 1833(0x729, float:2.569E-42)
                goto L1d
            L28:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L1d
            L2b:
                java.util.concurrent.atomic.AtomicInteger r0 = m8298(r8)
                androidx.versionedparcelable.C1106.m3387(r0)
                r0 = 1864(0x748, float:2.612E-42)
            L34:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L3a;
                    case 47483: goto L45;
                    default: goto L39;
                }
            L39:
                goto L34
            L3a:
                r0 = 48674(0xbe22, float:6.8207E-41)
                goto L34
            L3e:
                java.util.concurrent.atomic.AtomicInteger r0 = m8292(r8)
                androidx.versionedparcelable.C1106.m3387(r0)
            L45:
                java.util.concurrent.atomic.AtomicInteger r0 = m8302(r8)
                int r1 = androidx.versionedparcelable.C1107.m3429(r0)
                android.os.Handler r0 = m8296()
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda1 r2 = new kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda1
                r2.<init>(r8, r1)
                androidx.activity.C1062.m178(r0, r2)
                int r2 = m8295(r8)
                r0 = 48767(0xbe7f, float:6.8337E-41)
            L60:
                r3 = 48784(0xbe90, float:6.8361E-41)
                r0 = r0 ^ r3
                switch(r0) {
                    case 14: goto L68;
                    case 45: goto Lfa;
                    case 76: goto L72;
                    case 239: goto L6c;
                    default: goto L67;
                }
            L67:
                goto L60
            L68:
                r0 = 48829(0xbebd, float:6.8424E-41)
                goto L60
            L6c:
                if (r1 < r2) goto L68
                r0 = 48860(0xbedc, float:6.8467E-41)
                goto L60
            L72:
                int r1 = m8295(r8)
                r0 = 48891(0xbefb, float:6.8511E-41)
            L79:
                r2 = 48908(0xbf0c, float:6.8535E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 22: goto L81;
                    case 53: goto Lfa;
                    case 503: goto L85;
                    case 32495: goto L8b;
                    default: goto L80;
                }
            L80:
                goto L79
            L81:
                r0 = 48953(0xbf39, float:6.8598E-41)
                goto L79
            L85:
                if (r1 <= 0) goto L81
                r0 = 49635(0xc1e3, float:6.9553E-41)
                goto L79
            L8b:
                boolean r1 = m8301(r8)
                r0 = 49666(0xc202, float:6.9597E-41)
            L92:
                r2 = 49683(0xc213, float:6.9621E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 17: goto L9a;
                    case 50: goto La0;
                    case 76: goto La4;
                    case 83: goto Lfa;
                    default: goto L99;
                }
            L99:
                goto L92
            L9a:
                if (r1 != 0) goto La0
                r0 = 49759(0xc25f, float:6.9727E-41)
                goto L92
            La0:
                r0 = 49728(0xc240, float:6.9684E-41)
                goto L92
            La4:
                r0 = 1
                r8.isCompleted = r0
                android.app.Dialog r1 = m8300(r8)
                r0 = 49790(0xc27e, float:6.977E-41)
            Lae:
                r2 = 49807(0xc28f, float:6.9794E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 18: goto Lb6;
                    case 51: goto Ld7;
                    case 84: goto Lc0;
                    case 241: goto Lba;
                    default: goto Lb5;
                }
            Lb5:
                goto Lae
            Lb6:
                r0 = 49852(0xc2bc, float:6.9858E-41)
                goto Lae
            Lba:
                if (r1 == 0) goto Lb6
                r0 = 49883(0xc2db, float:6.9901E-41)
                goto Lae
            Lc0:
                android.app.Dialog r0 = m8300(r8)
                android.content.Context r0 = kevin.fun.hook.C1120.m8630(r0)
                r1 = 49914(0xc2fa, float:6.9944E-41)
            Lcb:
                r2 = 49931(0xc30b, float:6.9968E-41)
                r1 = r1 ^ r2
                switch(r1) {
                    case 497: goto Ld3;
                    case 1711: goto Ld8;
                    default: goto Ld2;
                }
            Ld2:
                goto Lcb
            Ld3:
                r1 = 50596(0xc5a4, float:7.09E-41)
                goto Lcb
            Ld7:
                r0 = 0
            Ld8:
                java.util.concurrent.atomic.AtomicInteger r1 = m8298(r8)
                int r1 = androidx.versionedparcelable.C1107.m3429(r1)
                java.util.concurrent.atomic.AtomicInteger r2 = m8292(r8)
                int r2 = androidx.versionedparcelable.C1107.m3429(r2)
                android.os.Handler r3 = m8296()
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2 r4 = new kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2
                r4.<init>(r8, r0, r1, r2)
                r0 = 502(0x1f6, double:2.48E-321)
                int r2 = androidx.activity.C1063.f89
                long r6 = (long) r2
                long r0 = r0 ^ r6
                androidx.loader.C1095.m2588(r3, r4, r0)
            Lfa:
                int r1 = androidx.vectordrawable.C1104.m3230()
                r0 = 50689(0xc601, float:7.103E-41)
            L101:
                r2 = 50706(0xc612, float:7.1054E-41)
                r0 = r0 ^ r2
                switch(r0) {
                    case 19: goto L109;
                    case 45: goto L11e;
                    case 50: goto L10f;
                    case 76: goto L113;
                    default: goto L108;
                }
            L108:
                goto L101
            L109:
                if (r1 < 0) goto L10f
                r0 = 50782(0xc65e, float:7.1161E-41)
                goto L101
            L10f:
                r0 = 50751(0xc63f, float:7.1117E-41)
                goto L101
            L113:
                java.lang.String r0 = "99JsA1EJCAtaZK"
                java.lang.String r0 = androidx.interpolator.C1083.m1724(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L11e:
                return
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.isRunning = r0
                r1.isCompleted = r0
                m8291(r1)
                return
        }

        public void showProgressDialog(android.content.Context r3, int r4, java.lang.String r5) {
                r2 = this;
                android.os.Handler r0 = m8296()
                kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda3 r1 = new kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda3
                r1.<init>(r2, r3, r5, r4)
                androidx.activity.C1062.m178(r0, r1)
                int r1 = kevin.fun.hook.audio.C1116.m8064()
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
                java.lang.String r0 = "oeSw5t3Z8DnC1QLTKpsfoQ"
                java.lang.String r0 = androidx.activity.C1066.m487(r0)
                float r0 = java.lang.Float.parseFloat(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L2f:
                return
        }

        public void startBatch(int r4) {
                r3 = this;
                r2 = 0
                r0 = 0
                java.lang.String r1 = "ۢۨۨ"
            L4:
                int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
                switch(r1) {
                    case 1746912: goto L24;
                    case 1747685: goto L38;
                    case 1747929: goto Lc;
                    case 1748773: goto L3e;
                    case 1749858: goto L1f;
                    case 1750719: goto L12;
                    case 1750724: goto L32;
                    case 1753414: goto L2b;
                    case 1753693: goto L19;
                    default: goto Lb;
                }
            Lb:
                return
            Lc:
                r1 = 1
                r3.isRunning = r1
                java.lang.String r1 = "ۡۤۨ"
                goto L4
            L12:
                java.util.concurrent.atomic.AtomicInteger r0 = m8298(r3)
                java.lang.String r1 = "ۣۥۦ"
                goto L4
            L19:
                androidx.vectordrawable.C1105.m3278(r0, r2)
                java.lang.String r1 = "ۣۥۡ"
                goto L4
            L1f:
                r3.totalCount = r4
                java.lang.String r1 = "۟ۦۧ"
                goto L4
            L24:
                java.util.concurrent.atomic.AtomicInteger r0 = m8302(r3)
                java.lang.String r1 = "ۦۨ۟"
                goto L4
            L2b:
                java.util.concurrent.atomic.AtomicInteger r0 = m8292(r3)
                java.lang.String r1 = "۠۠ۥ"
                goto L4
            L32:
                androidx.vectordrawable.C1105.m3278(r0, r2)
                java.lang.String r1 = "ۦ۟۟"
                goto L4
            L38:
                androidx.vectordrawable.C1105.m3278(r0, r2)
                java.lang.String r1 = "۠ۨۡ"
                goto L4
            L3e:
                r3.isCompleted = r2
                java.lang.String r1 = "۟۟ۨ"
                goto L4
        }
    }

    public interface ProgressCallback {
        static {
                return
        }

        void onProgress(long r1, long r3);
    }

    private static class ViewTags {
        static int background_btn;
        static int cancel_btn;

        static {
                r0 = 536870913(0x20000001, float:1.0842023E-19)
                kevin.fun.hook.download.DownloadManager.ViewTags.background_btn = r0
                r0 = 536870914(0x20000002, float:1.0842024E-19)
                kevin.fun.hook.download.DownloadManager.ViewTags.cancel_btn = r0
                return
        }

        private ViewTags() {
                r3 = this;
                r3.<init>()
                int r1 = androidx.loader.C1099.m2876()
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
                java.lang.String r0 = "1cmK86v3EkgO1X9hYhy"
                java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
                double r0 = java.lang.Double.parseDouble(r0)
                java.io.PrintStream r2 = java.lang.System.out
                r2.println(r0)
            L26:
                return
        }
    }

    static {
            r10 = 0
            r9 = 1
            r8 = 0
            r0 = 1887(0x75f, float:2.644E-42)
            short[] r0 = new short[r0]
            r0 = {x00d6: FILL_ARRAY_DATA , data: [1820, 29263, 25936, 21354, 1818, 1848, 1820, 26097, -28524, 21648, 1818, 1848, 1820, 18491, 21414, 1838, 1827, 1818, 843, 836, 833, 840, 882, 835, 844, 832, 840, 882, 843, 834, 863, 832, 844, 857, 1009, 1023, 1004, 1011, 1012, 965, 1022, 1013, 1005, 1012, 1014, 1013, 1019, 1022, 965, 1017, 1010, 1019, 1012, 1012, 1023, 1014, 3173, 3147, 3160, 3143, 3136, 14432, 2107, 2069, 2054, 2073, 2078, 2141, 2100, 2079, 2055, 2078, 2076, 2079, 2065, 2068, 14433, 13703, 1500, 1522, 1505, 1534, 1529, 1466, 1491, 1528, 1504, 1529, 1531, 1528, 1526, 1523, 13702, 1463, 22081, 26655, -27251, 29298, 23718, -30542, 1453, 1463, 26314, 28671, 24953, 23594, -29511, 21200, 28267, 20638, 23679, 26370, 19571, 23476, -28768, 32760, 22083, 27894, 27742, 27392, 18203, 23289, 22671, -31755, 22858, -31812, 30572, 17929, -30849, 32492, 22359, 26711, 21532, 19775, -29623, 3193, 3193, 3193, 3074, 3095, -31818, 28621, 16965, 3142, 3142, 3142, 23597, 23507, 17960, -30882, 22918, 26584, 17499, -31443, 1222, 1157, 1176, 1244, 2436, 2440, 2442, 2442, 2434, 2441, 2451, 2488, 2449, 2446, 2435, 2434, 2440, -28995, -28989, -29505, -25112, 2813, 2786, 2799, 2798, 2788, 2724, 2790, 2811, 2751, 1974, 2037, 2024, 1964, 2263, 2267, 2265, 2265, 2257, 2266, 2240, 2283, 2242, 2269, 2256, 2257, 2267, -30851, -30973, -31361, -27608, 1346, 1373, 1360, 1361, 1371, 1307, 1369, 1348, 1280, 2916, 2882, 2900, 2883, 2844, 2928, 2902, 2900, 2911, 2885, 878, 844, 857, 842, 847, 847, 834, 780, 790, 781, 787, 771, 779, 879, 842, 845, 854, 859, 792, 771, 866, 845, 839, 849, 844, 842, 839, 771, 786, 787, 778, 771, 866, 851, 851, 847, 838, 884, 838, 833, 872, 842, 855, 780, 790, 784, 788, 781, 784, 789, 21256, 22865, 18582, 18943, 32191, 973, 977, 977, 981, -26980, -30614, 31620, 959, 933, 12613, 286, 304, 291, 316, 315, 376, 273, 314, 290, 315, 313, 314, 308, 305, 12612, 373, 20318, -29144, 22628, -29584, -423, 31353, 25025, -25811, -32459, 2778, 2752, 18428, -31094, -32420, 18394, 27738, 20339, -29179, 22601, -29603, -396, -29443, -28993, 26232, 22623, -28491, -30035, 27225, 25608, 1097, 1135, 1145, 1134, 1073, 1117, 1147, 1145, 1138, 1128, 2269, 2303, 2282, 2297, 2300, 2300, 2289, 2239, 2213, 2238, 2208, 21352, 22833, 18678, 18847, 32223, 285, 257, 257, 261, -27572, -30022, 31060, 367, 373, 3012, 3042, 3060, 3043, 3004, 3024, 3062, 3060, 3071, 3045, 1057, 1027, 1046, 1029, 1024, 1024, 1037, 1091, 1113, 1090, 1116, 1100, 1092, 1083, 1029, 1026, 1032, 1027, 1051, 1055, 1100, 1058, 1080, 1100, 1117, 1116, 1090, 1116, 1111, 1100, 1083, 1029, 1026, 1114, 1112, 1111, 1100, 1044, 1114, 1112, 1093, 1100, 1069, 1052, 1052, 1024, 1033, 1083, 1033, 1038, 1063, 1029, 1048, 1091, 1113, 1119, 1115, 1090, 1119, 1114, 687, 653, 653, 651, 670, 666, 1498, 1503, 1498, 590, 620, 620, 618, 639, 635, 546, 579, 622, 609, 616, 634, 622, 616, 618, 317, 303, 362, 260, 265, 363, 317, 303, 380, 310, 378, 375, 361, 382, 1703, 1684, 1691, 1682, 1680, 3040, 3067, 3062, 3047, 3057, 3007, 2994, 2991, 1568, 1548, 1549, 1549, 1542, 1536, 1559, 1546, 1548, 1549, 596, 602, 602, 591, 530, 606, 595, 598, 585, 602, 1098, 1121, 1145, 1120, 1122, 1121, 1135, 1130, 1070, 1133, 1135, 1120, 1133, 1131, 1122, 1122, 1131, 1130, 25653, 27904, 25478, 24277, -29114, 20527, 27796, 1811, 1828, 1842, 1841, 1838, 1839, 1842, 1828, 1795, 1838, 1829, 1848, 18811, 32059, 3062, 3050, 3050, 3054, 2974, 2708, 2693, 2701, 2704, 2751, 2697, 2701, 2689, 2695, 2693, 2707, 28356, 26609, 22847, 21982, 17680, 28370, 32202, 21617, 2094, 2111, 2103, 2090, 2053, 2099, 2103, 2107, 2109, 2111, 2053, 3175, 3107, 3129, 3118, 2143, 2138, 2117, 2134, 2156, 2115, 2139, 2140, 2119, 2140, 2156, 2135, 2140, 2116, 2141, 2143, 2140, 2130, 2135, 2156, 2117, 2138, 2135, 2134, 2140, 1611, 1614, 1617, 1602, 1656, 1623, 1615, 1608, 1619, 1608, 1656, 1603, 1608, 1616, 1609, 1611, 1608, 1606, 1603, 1656, 1614, 1610, 1606, 1600, 1602, 28149, 20926, 18589, -30229, 23816, 22307, 22291, 23855, 2362, 2367, 2336, 2355, 2313, 2342, 2366, 2361, 2338, 2361, 2313, 3303, 3235, 3257, 3246, 14086, 1885, 1907, 1888, 1919, 1912, 1851, 1874, 1913, 1889, 1912, 1914, 1913, 1911, 1906, 14087, 1846, 24819, 25960, -30587, 22252, 25233, 18912, 24103, -30157, 1836, 1846, 661, 685, 738, 748, 2321, 2334, 2978, 2987, -29719, 26514, 18970, 2429, 2418, 2423, 2430, 2372, 2421, 2426, 2422, 2430, 2372, 2429, 2420, 2409, 2422, 2426, 2415, 414, 29901, 25554, 21992, 408, 442, 414, 25459, -27114, 21010, 408, 442, 414, 20153, 21796, 428, 417, 408, 2388, 2388, 2388, 2388, 2400, 2400, 2377, 2377, 2418, 2405, 2405, 2368, 2368, 2398, 2398, 1868, 18748, -30646, 25281, -27965, 1866, 1379, 22217, 23323, 24814, -28436, 1381, 3318, 26890, 25797, 3312, 3189, 17234, 22735, 3143, 3146, 3187, 1533, 28846, 26545, 1491, 1487, 1474, 1531, 25577, 29478, 26197, -27856, 22324, 2657, 26764, -25111, 23021, 2663, 24697, 28854, 29307, 25956, 812, 30335, 24928, 22362, 810, 1670, 1670, 1670, 2644, 2643, 2643, 2592, 2613, 2597, 2608, 2605, 2611, 2609, 2675, 2642, 540, 2383, 2369, 2386, 2381, 2378, 2427, 2305, 2391, 2427, 2305, 2391, 2427, 2305, 2391, 1421, 1486, 1491, 1424, 2144, 2105, 2091, 2092, 2110, 1035, 1090, 1100, 1091, 1246, 1152, 1182, 1175, 936, 1004, 1014, 993, 1622, 1557, 1544, 1612, 455, 474, 414, 1167, 1168, 1181, 1180, 1174, 3107, 3129, 3116, 3118, 423, 445, 426, 2700, 2706, 2715, 509, 499, 508, 262, 276, 275, 257, 1258, 1271, 1204, 1346, 1366, 1351, 1354, 1356, 1558, 1618, 1608, 1629, 1631, 2385, 2333, 2326, 2321, 3036, 3039, 3038, 3033, 3032, 3035, 3034, 3029, 3028, 3031, 3030, 3025, 3024, 3027, 3026, 3021, 3020, 3023, 3022, 3017, 3016, 3019, 3018, 3013, 3012, 3015, 2989, 2988, 2991, 2990, 2985, 2984, 2987, 2986, 2981, 2980, 1262, 1262, 1262, 1262, 1242, 1242, 1267, 1267, 1224, 1247, 1247, 1274, 1274, 1252, 1252, 2832, 2833, 2826, 2839, 2840, 2839, 2845, 2847, 2826, 2839, 2833, 2832, 1201, 1215, 1196, 1203, 1204, 1157, 1214, 1205, 1197, 1204, 1206, 1205, 1211, 1214, 1157, 1209, 1202, 1211, 1204, 1204, 1215, 1206, 3045, 3019, 3032, 3015, 3008, 18743, -30655, -30489, 22938, -26842, 28889, 2193, 810, 801, 830, 873, 815, 834, 845, 800, 892, 2290, 2297, 2278, 2225, 2295, 2204, 2197, 2296, 2212, 2807, 2812, 2786, 2740, 2802, 2704, 2813, 2721, 1714, 1721, 1702, 1777, 1754, 1749, 1719, 1720, 1719, 1714, 1721, 1702, 1777, 1754, 1749, 576, 727, 576, 2470, 2472, 2491, 2468, 2467, 2450, 2473, 2466, 2490, 2467, 2465, 2466, 2476, 2473, 2450, 2478, 2469, 2476, 2467, 2467, 2472, 2465, 19704, -29298, 22911, 24803, 19053, -29925, 23895, -30397, 12815, 596, 634, 617, 630, 625, 562, 603, 624, 616, 625, 627, 624, 638, 635, 12814, 575, 25633, 31525, 22931, 24591, -28155, 30202, 23342, -28870, 549, 575, 2219, 2213, 2230, 2217, 2222, 2207, 2212, 2223, 2231, 2222, 2220, 2223, 2209, 2212, 2207, 2211, 2216, 2209, 2222, 2222, 2213, 2220, 26967, 21788, 19519, -29367, 1161, 1163, 1174, 1182, 1163, 1180, 1162, 1162, 2858, 2940, 2863, 2850, 2863, 2858, 2923, 2858, 2858, 2463, 2452, 2443, 2524, 2551, 2552, 2458, 2453, 2458, 2463, 2452, 2443, 2524, 2551, 2552, 13342, 1093, 1131, 1144, 1127, 1120, 1059, 1098, 1121, 1145, 1120, 1122, 1121, 1135, 1130, 13343, 1070, 25136, 32052, -27628, 29675, 23871, -30421, 1076, 1070, 1826, 1894, 1896, 1915, 1892, 1891, 1874, 1889, 1892, 1915, 1896, 1874, 1913, 1896, 1888, 1917, 1826, 26616, 28365, 20483, 23778, 19500, 26606, 29942, 23885, 546, 568, 385, 400, 408, 389, 426, 412, 408, 404, 402, 400, 426, 3292, 1845, 1905, 1899, 1916, 2948, 2965, 2973, 2944, 2991, 2950, 2969, 2964, 2965, 2975, 2991, 2722, 2785, 2812, 2744, 1797, 1792, 1823, 1804, 1846, 1817, 1793, 1798, 1821, 1798, 1846, 1369, 1373, 1361, 1367, 1365, 1311, 1370, 1344, 1365, 1367, 21486, 26102, 25185, 18704, 18923, 23742, 20686, 2012, 1990, -29762, -25879, 19571, -29435, 23369, -28835, 578, 600, 20634, 29731, 18543, -30439, 24405, -29887, 1630, 1604, 2962, 2952, 2953, 2989, 2972, 2953, 2965, 3008, 2982, 2695, 2722, 2749, 2734, 2712, 2738, 2725, 2751, 2723, 2734, 2744, 2722, 2744, 2708, 2696, 2695, 2698, 2712, 2712, 1892, 1889, 1906, 1889, 1906, 1647, 1642, 1657, 13404, 1031, 1065, 1082, 1061, 1058, 1121, 1032, 1059, 1083, 1058, 1056, 1059, 1069, 1064, 13405, 1132, 19074, 1132, 1024, 1029, 1046, 1132, -30725, 22426, -30301, 23496, 23933, -30359, 1142, 1132, 1562, 2502, 2498, 2510, 2504, 2506, 2432, 2501, 2527, 2506, 2504, 28632, 26349, -30321, 23022, 32551, 26664, 31932, 20902, 23437, 23750, 30847, -30761, 21948, -2764, 17452, -31317, 23490, 28607, 17614, 17461, 20832, 23824, 27853, 27033, 22999, 20601, 23122, 23833, 31136, 24559, 27127, 30620, 28061, 25768, 18038, -30976, -24796, 26748, 24195, 31290, 23618, 22121, 20770, 30107, 21460, 26060, 24301, -29959, 2022, 2044, 25236, 24287, 27534, -26568, 18428, -31094, 25407, 24436, 27173, -26221, 18007, -30943, 2010, 1945, 1924, 1991, 498, 510, 508, 508, 500, 511, 485, 462, 496, 484, 501, 504, 510, -31896, -31978, -31935, -24737, 2316, 2328, 2313, 2308, 2306, 2370, 2304, 2333, 2393, 503, 435, 425, 446, 2031, 2019, 2017, 2017, 2025, 2018, 2040, 2003, 2021, 2017, 2029, 2027, 2025, -30809, -30759, 23197, 32292, 2556, 2552, 2548, 2546, 2544, 2490, 2559, 2533, 2544, 2546, 1272, 1212, 1190, 1201, 2790, 2794, 2792, 2792, 2784, 2795, 2801, 2778, 2796, 2792, 2788, 2786, 2784, -30508, -30550, 21998, 29015, 1764, 1760, 1772, 1770, 1768, 1698, 1767, 1789, 1768, 1770, 2789, 2721, 2747, 2732, 2479, 2474, 2485, 2470, 2460, 2483, 2475, 2476, 2487, 2476, 3191, 3199, 3197, 3192, 3195, 2708, 2765, 2783, 2776, 2762, -29653, 25734, 22342, 2761, 2765, 2753, 2759, 2757, 2703, 2775, 2757, 2754, 2768, 1120, 1060, 1086, 1065, 2432, 2444, 2453, 2438, 2449, 23399, -28668, 3095, 3091, 3103, 3097, 3099, 3153, 3092, 3086, 3099, 3097, 644, 704, 730, 717, 1885, 1881, 1877, 1875, 1873, 21073, 30440, 1682, 1686, 1690, 1692, 1694, 1748, 1681, 1675, 1694, 1692, 833, 773, 799, 776, 1967, 1963, 1959, 1953, 1955, 24290, 31323, 1378, 1382, 1386, 1388, 1390, 1316, 1377, 1403, 1390, 1388, 2034, 1974, 1964, 1979, 2556, 2553, 2534, 2549, 2511, 2528, 2552, 2559, 2532, 2559, 409, 474, 455, 388, 994, 1018, 1020, 998, 1004, -27873, 19132, 2240, 2260, 2245, 2248, 2254, 2190, 2252, 2257, 2194, 1633, 1570, 1599, 1659, 1458, 1453, 1440, 1441, 1451, -30684, -26253, 773, 794, 791, 790, 796, 860, 798, 771, 839, 561, 626, 623, 555, 2766, 2769, 2780, 2781, 2775, -28690, -24903, 1348, 1371, 1366, 1367, 1373, 1309, 1375, 1346, 1286, 14986, 2769, 2815, 2796, 2803, 2804, 2743, 2782, 2805, 2797, 2804, 2806, 2805, 2811, 2814, 14987, 2746, 26851, -25771, 17553, -31257, 17505, 22587, 21912, 21666, 2720, 2746, -28704, -28770, 24506, 21905, 21210, 30307, 19449, 24444, 26164, 22203, 1028, 9015, 17555, 24334, 20561, 23162, 23857, 31112, 17426, 20631, 27103, 22864, 3055, 11484, 15474, 3113, 3079, 3092, 3083, 3084, 3151, 3110, 3085, 3093, 3084, 3086, 3085, 3075, 3078, 15475, 17001, -31969, -31324, -27405, 21843, -32441, 3160, 3138, 15481, 3106, 3084, 3103, 3072, 3079, 3140, 3117, 3078, 3102, 3079, 3077, 3078, 3080, 3085, 15480, 16994, -31980, -25808, 23191, 21848, -32436, 3155, 3145, -30527, -30529, 22683, 21168, 22011, 28994, 19672, 22621, 24853, 20890, 805, 9238, 18045, 24032, 21183, 22676, 24543, 31590, 18172, 21113, 27441, 23486, 2305, 11826, 22153, -31721, 17729, 24437, 22667, 17776, -31738, -2953, -31584, 21981, 22397, 23635, -25759, 31902, 25460, 27973, 29249, 22504, 22988, 26514, 17425, -31385, 1940, 1974, 1977, 1972, 1970, 1979, 1970, 1971, 1213, 1153, 1165, 1157, 1163, 1178, 1230, 1165, 1154, 1153, 1181, 1163, 1162, 18424, -31090, 27619, 23404, 2515, 12000, 17442, -31404, 21272, -30964, 2579, 2569, 12990, 741, 715, 728, 711, 704, 643, 746, 705, 729, 704, 706, 705, 719, 714, 12991, 19621, -29229, 22832, 21275, 21584, 23455, -28789, 660, 654} // fill-array
            kevin.fun.hook.download.DownloadManager.f407short = r0
            short[] r0 = m8183()
            int r1 = org.luckypray.dexkit.C1124.f434
            r1 = r1 ^ 641(0x281, float:8.98E-43)
            r2 = 1895(0x767, float:2.655E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10615(r0, r8, r1, r2)
            kevin.fun.hook.download.DownloadManager.DEFAULT_FILE_NAME_FORMAT = r0
            short[] r0 = m8183()
            r1 = 18
            int r2 = androidx.activity.C1065.f91
            r2 = r2 ^ (-37)
            r3 = 813(0x32d, float:1.139E-42)
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1413(r0, r1, r2, r3)
            kevin.fun.hook.download.DownloadManager.KEY_FILE_NAME_FORMAT = r0
            short[] r0 = m8183()
            r1 = 34
            int r2 = androidx.lifecycle.viewmodel.C1093.f119
            r2 = r2 ^ (-100)
            r3 = 922(0x39a, float:1.292E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r1, r2, r3)
            kevin.fun.hook.download.DownloadManager.NOTIFICATION_CHANNEL_ID = r0
            short[] r0 = m8183()
            r1 = 56
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-967(0xfffffffffffffc39, float:NaN))
            r3 = 3118(0xc2e, float:4.369E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            kevin.fun.hook.download.DownloadManager.NOTIFICATION_CHANNEL_NAME = r0
            short[] r0 = m8183()
            r1 = 61
            int r2 = kevin.fun.hook.audio.C1114.f403
            r2 = r2 ^ (-4)
            r3 = 2160(0x870, float:3.027E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2127(r0, r1, r2, r3)
            kevin.fun.hook.download.DownloadManager.TAG = r0
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = androidx.interpolator.C1081.m1572()
            r2 = 13
            int r4 = androidx.lifecycle.livedata.C1084.f110
            long r4 = (long) r4
            long r2 = r2 ^ r4
            okhttp3.OkHttpClient$Builder r0 = m8232(r0, r2, r1)
            java.util.concurrent.TimeUnit r1 = androidx.interpolator.C1081.m1572()
            okhttp3.OkHttpClient$Builder r0 = m8229(r0, r2, r1)
            java.util.concurrent.TimeUnit r1 = androidx.interpolator.C1081.m1572()
            okhttp3.OkHttpClient$Builder r0 = m8174(r0, r2, r1)
            okhttp3.OkHttpClient$Builder r0 = m8219(r0, r9)
            int r1 = androidx.vectordrawable.animated.C1102.f128
            long r2 = (long) r1
            java.util.concurrent.TimeUnit r1 = androidx.activity.C1065.m1()
            int r4 = androidx.annotation.experimental.C1067.f93
            r4 = r4 ^ (-49)
            okhttp3.ConnectionPool r5 = new okhttp3.ConnectionPool
            r6 = 198(0xc6, double:9.8E-322)
            long r2 = r2 ^ r6
            r5.<init>(r4, r2, r1)
            okhttp3.OkHttpClient$Builder r0 = m8196(r0, r5)
            r1 = 2
            okhttp3.Protocol[] r1 = new okhttp3.Protocol[r1]
            okhttp3.Protocol r2 = com.tencent.mmkv.C1109.m3616()
            r1[r8] = r2
            okhttp3.Protocol r2 = androidx.loader.C1094.m2491()
            r1[r9] = r2
            java.util.List r1 = androidx.startup.C1101.m65(r1)
            okhttp3.OkHttpClient$Builder r0 = m8206(r0, r1)
            okhttp3.OkHttpClient r0 = m8216(r0)
            kevin.fun.hook.download.DownloadManager.OK_HTTP_CLIENT = r0
            java.util.concurrent.ExecutorService r0 = androidx.interpolator.C1082.m1650(r4)
            kevin.fun.hook.download.DownloadManager.DOWNLOAD_EXECUTOR = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.download.DownloadManager.MAIN_HANDLER = r0
            kevin.fun.hook.download.DownloadManager.notificationManager = r10
            kevin.fun.hook.download.DownloadManager.notificationBuilder = r10
            return
    }

    private DownloadManager() {
            r4 = this;
            r2 = 0
            r4.<init>()
            r0 = 262144(0x40000, float:3.67342E-40)
            byte[] r0 = new byte[r0]
            r4.buffer = r0
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            r4.currentWorkAuthorName = r0
            r4.currentWorkAuthorAccount = r0
            r4.currentWorkAuthorUid = r0
            r4.currentWorkVideoId = r0
            r4.currentWorkVideoDesc = r0
            r4.currentWorkCreateTime = r2
            r4.currentCommentAuthorName = r0
            r4.currentCommentAuthorAccount = r0
            r4.currentCommentAuthorUid = r0
            r4.currentCommentId = r0
            r4.currentCommentText = r0
            r4.currentCommentCreateTime = r2
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = new kevin.fun.hook.download.DownloadManager$BatchDownloadManager
            r0.<init>(r4)
            r4.batchManager = r0
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1616(0x650, float:2.264E-42)
        L34:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L3a;
                case 49: goto L3d;
                case 204: goto L42;
                case 239: goto L51;
                default: goto L39;
            }
        L39:
            goto L34
        L3a:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L34
        L3d:
            if (r1 > 0) goto L3a
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L34
        L42:
            java.lang.String r0 = "AMHLi2vmDlYEvrvNayH1Ytfq"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L51:
            return
    }

    static /* bridge */ /* synthetic */ int _$$Nest$mdp(kevin.fun.hook.download.DownloadManager r1, android.content.Context r2, float r3) {
            int r0 = m8172(r1, r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mshowDownloadProgressNotification(kevin.fun.hook.download.DownloadManager r0, android.content.Context r1, java.lang.String r2, int r3, long r4, long r6) {
            m8170(r0, r1, r2, r3, r4, r6)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mshowSuccessToast(kevin.fun.hook.download.DownloadManager r0, android.content.Context r1, java.lang.String r2) {
            m8176(r0, r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$mupdateProgressUI(kevin.fun.hook.download.DownloadManager r0, android.app.Dialog r1, android.widget.TextView[] r2, android.widget.ProgressBar[] r3, android.widget.TextView[] r4, int r5, long r6, long r8, long r10) {
            m8171(r0, r1, r2, r3, r4, r5, r6, r8, r10)
            return
    }

    static /* bridge */ /* synthetic */ android.os.Handler _$$Nest$sfgetMAIN_HANDLER() {
            android.os.Handler r0 = m8230()
            return r0
    }

    private void cancelDownloadNotification() {
            r6 = this;
            android.app.NotificationManager r1 = m8242()     // Catch: java.lang.Throwable -> L2d
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }     // Catch: java.lang.Throwable -> L2d
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
            android.app.NotificationManager r0 = m8242()     // Catch: java.lang.Throwable -> L2d
            int r1 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L2d
            r1 = r1 ^ 9252(0x2424, float:1.2965E-41)
            androidx.interpolator.C1081.m1622(r0, r1)     // Catch: java.lang.Throwable -> L2d
        L1f:
            r0 = 0
            kevin.fun.hook.download.DownloadManager.notificationBuilder = r0     // Catch: java.lang.Throwable -> L2d
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L56;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L24
        L2d:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8183()
            r3 = 77
            int r4 = androidx.lifecycle.process.C1090.f116
            r4 = r4 ^ (-439(0xfffffffffffffe49, float:NaN))
            r5 = 1431(0x597, float:2.005E-42)
            java.lang.String r2 = androidx.activity.C1062.m170(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8215(r0)
        L56:
            return
    }

    private void copyFileToUri(android.content.Context r8, java.io.File r9, android.net.Uri r10) throws java.lang.Exception {
            r7 = this;
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L129
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L129
            android.content.ContentResolver r0 = androidx.activity.C1063.m246(r8)     // Catch: java.lang.Throwable -> L12c
            java.io.OutputStream r4 = androidx.vectordrawable.C1104.m3206(r0, r10)     // Catch: java.lang.Throwable -> L12c
            r0 = 1616(0x650, float:2.264E-42)
        L10:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L16;
                case 49: goto L19;
                case 204: goto L1e;
                case 239: goto L87;
                default: goto L15;
            }
        L15:
            goto L10
        L16:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L10
        L19:
            if (r4 == 0) goto L16
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L10
        L1e:
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L66
        L22:
            int r5 = kevin.fun.hook.audio.C1117.m8114(r3, r1)     // Catch: java.lang.Throwable -> L66
            r0 = 1740(0x6cc, float:2.438E-42)
        L28:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2e;
                case 54: goto L34;
                case 471: goto L53;
                case 500: goto L37;
                default: goto L2d;
            }     // Catch: java.lang.Throwable -> L66
        L2d:
            goto L28
        L2e:
            r0 = -1
            if (r5 != r0) goto L34
            r0 = 1833(0x729, float:2.569E-42)
            goto L28
        L34:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L28
        L37:
            androidx.drawerlayout.C1077.m1331(r4)     // Catch: java.lang.Throwable -> L66
            r0 = 1864(0x748, float:2.612E-42)
        L3c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L42;
                case 47384: goto L4f;
                case 47417: goto L4c;
                case 47483: goto L48;
                default: goto L41;
            }
        L41:
            goto L3c
        L42:
            if (r4 == 0) goto L48
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3c
        L48:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3c
        L4c:
            androidx.lifecycle.process.C1091.m2267(r4)     // Catch: java.lang.Throwable -> L12c
        L4f:
            kevin.fun.hook.audio.C1116.m8073(r3)     // Catch: java.lang.Throwable -> L129
            return
        L53:
            r0 = 0
            androidx.activity.C1063.m286(r4, r1, r0, r5)     // Catch: java.lang.Throwable -> L66
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L5a:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto L22;
                case 239: goto L62;
                default: goto L61;
            }     // Catch: java.lang.Throwable -> L66
        L61:
            goto L5a
        L62:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L5a
        L66:
            r0 = move-exception
            r1 = 48891(0xbefb, float:6.8511E-41)
        L6a:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L72;
                case 503: goto L83;
                default: goto L71;
            }     // Catch: java.lang.Throwable -> L66
        L71:
            goto L6a
        L72:
            r1 = 49666(0xc202, float:6.9597E-41)
        L75:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L7d;
                case 50: goto L9d;
                case 76: goto La1;
                case 83: goto La4;
                default: goto L7c;
            }     // Catch: java.lang.Throwable -> L66
        L7c:
            goto L75
        L7d:
            if (r4 == 0) goto L9d
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L75
        L83:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto L6a
        L87:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L66
            short[] r1 = m8183()     // Catch: java.lang.Throwable -> L66
            r2 = 102(0x66, float:1.43E-43)
            int r5 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L66
            r5 = r5 ^ 608(0x260, float:8.52E-43)
            r6 = 810(0x32a, float:1.135E-42)
            java.lang.String r1 = androidx.interpolator.C1081.m1616(r1, r2, r5, r6)     // Catch: java.lang.Throwable -> L66
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L9d:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L75
        La1:
            androidx.lifecycle.process.C1091.m2267(r4)     // Catch: java.lang.Throwable -> La5
        La4:
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r1 = move-exception
            r2 = r0
        La7:
            r0 = 49790(0xc27e, float:6.977E-41)
        Laa:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto Lb2;
                case 51: goto Le3;
                case 84: goto Lbc;
                case 241: goto Lb6;
                default: goto Lb1;
            }
        Lb1:
            goto Laa
        Lb2:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Laa
        Lb6:
            if (r2 == 0) goto Lb2
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Laa
        Lbc:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lbf:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 497: goto Lc7;
                case 1711: goto Lcd;
                case 1736: goto Le4;
                case 1769: goto Ld1;
                default: goto Lc6;
            }
        Lc6:
            goto Lbf
        Lc7:
            if (r2 == r1) goto Lcd
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Lbf
        Lcd:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Lbf
        Ld1:
            kevin.fun.hook.audio.C1116.m8088(r2, r1)     // Catch: java.lang.Throwable -> Le8
            r0 = 50689(0xc601, float:7.103E-41)
        Ld7:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto Ldf;
                case 50: goto Le4;
                default: goto Lde;
            }     // Catch: java.lang.Throwable -> Le8
        Lde:
            goto Ld7
        Ldf:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto Ld7
        Le3:
            r2 = r1
        Le4:
            kevin.fun.hook.audio.C1116.m8073(r3)     // Catch: java.lang.Throwable -> Le8
            throw r2     // Catch: java.lang.Throwable -> Le8
        Le8:
            r1 = move-exception
            r0 = r2
        Lea:
            r2 = 50813(0xc67d, float:7.1204E-41)
        Led:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto Lf5;
                case 53: goto L127;
                case 243: goto Lf9;
                case 4075: goto Lff;
                default: goto Lf4;
            }
        Lf4:
            goto Led
        Lf5:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto Led
        Lf9:
            if (r0 == 0) goto Lf5
            r2 = 51557(0xc965, float:7.2247E-41)
            goto Led
        Lff:
            r2 = 51588(0xc984, float:7.229E-41)
        L102:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L10a;
                case 54: goto L110;
                case 87: goto L122;
                case 116: goto L114;
                default: goto L109;
            }
        L109:
            goto L102
        L10a:
            if (r0 == r1) goto L110
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L102
        L110:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L102
        L114:
            kevin.fun.hook.audio.C1116.m8088(r0, r1)
            r1 = 51712(0xca00, float:7.2464E-41)
        L11a:
            r2 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L122;
                case 15: goto L121;
                case 16: goto L121;
                case 17: goto L123;
                default: goto L121;
            }
        L121:
            goto L11a
        L122:
            throw r0
        L123:
            r1 = 51743(0xca1f, float:7.2507E-41)
            goto L11a
        L127:
            r0 = r1
            goto L122
        L129:
            r1 = move-exception
            r0 = r2
            goto Lea
        L12c:
            r0 = move-exception
            r1 = r0
            goto La7
    }

    private android.net.Uri createOutputUri(android.content.Context r6, java.lang.String r7, java.lang.String r8) throws java.lang.Exception {
            r5 = this;
            kevin.fun.hook.DownloadPathConfig r0 = new kevin.fun.hook.DownloadPathConfig
            r0.<init>(r6)
            android.net.Uri r1 = kevin.fun.hook.audio.C1116.m8042(r0)
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L8d;
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
            androidx.documentfile.provider.DocumentFile r1 = androidx.versionedparcelable.C1106.m3416(r6, r1)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L77;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 == 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            boolean r2 = androidx.lifecycle.process.C1088.m2031(r1)
            r0 = 1864(0x748, float:2.612E-42)
        L33:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L39;
                case 47384: goto L77;
                case 47417: goto L43;
                case 47483: goto L3f;
                default: goto L38;
            }
        L38:
            goto L33
        L39:
            if (r2 == 0) goto L3f
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L33
        L3f:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L33
        L43:
            androidx.documentfile.provider.DocumentFile r1 = androidx.startup.C1101.m3012(r1, r8, r7)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L4a:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L52;
                case 45: goto L61;
                case 76: goto L5c;
                case 239: goto L56;
                default: goto L51;
            }
        L51:
            goto L4a
        L52:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L4a
        L56:
            if (r1 == 0) goto L52
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L4a
        L5c:
            android.net.Uri r0 = androidx.annotation.experimental.C1067.m543(r1)
            return r0
        L61:
            java.lang.Exception r0 = new java.lang.Exception
            short[] r1 = m8183()
            r2 = 109(0x6d, float:1.53E-43)
            int r3 = androidx.customview.C1075.f101
            r3 = r3 ^ (-100)
            r4 = 645(0x285, float:9.04E-43)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r2, r3, r4)
            r0.<init>(r1)
            throw r0
        L77:
            java.lang.Exception r0 = new java.lang.Exception
            short[] r1 = m8183()
            r2 = 115(0x73, float:1.61E-43)
            int r3 = androidx.annotation.experimental.C1067.f93
            r3 = r3 ^ (-62)
            r4 = 2326(0x916, float:3.26E-42)
            java.lang.String r1 = androidx.interpolator.C1081.m1616(r1, r2, r3, r4)
            r0.<init>(r1)
            throw r0
        L8d:
            java.lang.Exception r0 = new java.lang.Exception
            short[] r1 = m8183()
            r2 = 123(0x7b, float:1.72E-43)
            int r3 = androidx.appcompat.C1069.f95
            r3 = r3 ^ (-229(0xffffffffffffff1b, float:NaN))
            r4 = 2050(0x802, float:2.873E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r1, r2, r3, r4)
            r0.<init>(r1)
            throw r0
    }

    private android.app.Dialog createProgressDialog(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
            r10 = this;
            android.app.Dialog r1 = new android.app.Dialog
            r0 = 16974667(0x103034b, float:2.4063263E-38)
            int r2 = androidx.loader.C1099.f125
            r0 = r0 ^ r2
            r1.<init>(r11, r0)
            r0 = 0
            androidx.lifecycle.runtime.C1092.m2297(r1, r0)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r11)
            int r0 = androidx.appcompat.resources.C1068.f94
            r0 = r0 ^ (-527(0xfffffffffffffdf1, float:NaN))
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r0)
            androidx.lifecycle.process.C1091.m2273(r2, r3)
            r3 = 1711276522(0x660001ea, float:1.5112455E23)
            int r4 = androidx.activity.C1064.f90
            r3 = r3 ^ r4
            androidx.lifecycle.livedata.C1084.m1783(r2, r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r11)
            r4 = 1
            androidx.customview.C1074.m1119(r3, r4)
            int r4 = kevin.fun.hook.webdav.C1118.f417
            r4 = r4 ^ (-380(0xfffffffffffffe84, float:NaN))
            androidx.emoji2.C1080.m1542(r3, r4)
            r5 = 1103101952(0x41c00000, float:24.0)
            int r5 = m8172(r10, r11, r5)
            r6 = 1103101952(0x41c00000, float:24.0)
            int r6 = m8172(r10, r11, r6)
            r7 = 1103101952(0x41c00000, float:24.0)
            int r7 = m8172(r10, r11, r7)
            r8 = 1103101952(0x41c00000, float:24.0)
            int r8 = m8172(r10, r11, r8)
            androidx.drawerlayout.C1077.m1314(r3, r5, r6, r7, r8)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 1133903872(0x43960000, float:300.0)
            int r6 = m8172(r10, r11, r6)
            int r7 = androidx.activity.C1062.f88
            r7 = r7 ^ 75
            r5.<init>(r6, r7)
            r5.gravity = r4
            androidx.vectordrawable.C1105.m3296(r3, r5)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r5, r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = m8172(r10, r11, r0)
            float r0 = (float) r0
            androidx.lifecycle.process.C1091.m2252(r5, r0)
            androidx.activity.C1065.m397(r3, r5)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            short[] r6 = m8183()
            r7 = 131(0x83, float:1.84E-43)
            int r8 = androidx.customview.C1074.f100
            r8 = r8 ^ 247(0xf7, float:3.46E-43)
            r9 = 820(0x334, float:1.149E-42)
            java.lang.String r6 = org.luckypray.dexkit.C1123.m10510(r6, r7, r8, r9)
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r12)
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8573(r5)
            androidx.lifecycle.process.C1087.m1946(r0, r5)
            r5 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r5)
            android.graphics.Typeface r5 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r0, r5)
            r5 = -13422275(0xffffffffff33313d, float:-2.3818747E38)
            int r6 = androidx.appcompat.resources.C1068.f94
            r5 = r5 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r0, r5)
            androidx.documentfile.C1076.m1233(r0, r4)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1094713344(0x41400000, float:12.0)
            int r8 = m8172(r10, r11, r8)
            kevin.fun.hook.audio.C1117.m8126(r0, r5, r6, r7, r8)
            androidx.activity.C1064.m372(r3, r0)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r11)
            int r6 = androidx.emoji2.C1080.m1552(r13)
            r0 = 1616(0x650, float:2.264E-42)
        Ld8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lde;
                case 49: goto Le1;
                case 204: goto Le8;
                case 239: goto L11d;
                default: goto Ldd;
            }
        Ldd:
            goto Ld8
        Lde:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld8
        Le1:
            r0 = 30
            if (r6 <= r0) goto Lde
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld8
        Le8:
            r0 = 0
            int r6 = kevin.fun.hook.audio.C1117.f406
            r6 = r6 ^ 82
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2028(r13, r0, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r6, r0)
            short[] r6 = m8183()
            r7 = 135(0x87, float:1.89E-43)
            int r8 = kevin.fun.hook.C1120.f419
            r8 = r8 ^ (-456(0xfffffffffffffe38, float:NaN))
            r9 = 3159(0xc57, float:4.427E-42)
            java.lang.String r6 = androidx.viewpager.C1108.m3518(r6, r7, r8, r9)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r6)
            java.lang.String r13 = kevin.fun.hook.webdav.C1119.m8573(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L114:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L11a;
                case 54: goto L11d;
                default: goto L119;
            }
        L119:
            goto L114
        L11a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L114
        L11d:
            androidx.lifecycle.process.C1087.m1946(r5, r13)
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r0)
            r0 = 10066348(0x9999ac, float:1.4105958E-38)
            int r6 = androidx.annotation.experimental.C1067.f93
            r0 = r0 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r5, r0)
            androidx.documentfile.C1076.m1233(r5, r4)
            r0 = 0
            r4 = 0
            r6 = 0
            r7 = 1098907648(0x41800000, float:16.0)
            int r7 = m8172(r10, r11, r7)
            kevin.fun.hook.audio.C1117.m8126(r5, r0, r4, r6, r7)
            androidx.activity.C1064.m372(r3, r5)
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            r4 = 0
            r5 = -16843711(0xfffffffffefefc41, float:-1.6946684E38)
            int r6 = org.luckypray.dexkit.C1123.f433
            r5 = r5 ^ r6
            r0.<init>(r11, r4, r5)
            r4 = 1082130432(0x40800000, float:4.0)
            int r4 = m8172(r10, r11, r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            int r6 = androidx.loader.C1098.f124
            r6 = r6 ^ 802(0x322, float:1.124E-42)
            r5.<init>(r6, r4)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3778(r0, r5)
            int r4 = androidx.lifecycle.runtime.C1092.f118
            r4 = r4 ^ 891(0x37b, float:1.249E-42)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3733(r0, r4)
            androidx.activity.C1064.m372(r3, r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            short[] r4 = m8183()
            r5 = 138(0x8a, float:1.93E-43)
            int r6 = androidx.viewpager.C1108.f134
            r6 = r6 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r7 = 3122(0xc32, float:4.375E-42)
            java.lang.String r4 = androidx.appcompat.C1069.m751(r4, r5, r6, r7)
            androidx.lifecycle.process.C1087.m1946(r0, r4)
            r4 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r4)
            r4 = 43165(0xa89d, float:6.0487E-41)
            int r5 = androidx.annotation.experimental.C1067.f93
            r4 = r4 ^ r5
            kevin.fun.hook.webdav.C1118.m8517(r0, r4)
            android.graphics.Typeface r4 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r0, r4)
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ 2
            androidx.documentfile.C1076.m1233(r0, r4)
            r4 = 0
            r5 = 1090519040(0x41000000, float:8.0)
            int r5 = m8172(r10, r11, r5)
            r6 = 0
            r7 = 0
            kevin.fun.hook.audio.C1117.m8126(r0, r4, r5, r6, r7)
            androidx.activity.C1064.m372(r3, r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            short[] r4 = m8183()
            r5 = 140(0x8c, float:1.96E-43)
            int r6 = kevin.fun.hook.audio.C1115.f404
            r6 = r6 ^ 804(0x324, float:1.127E-42)
            r7 = 3176(0xc68, float:4.45E-42)
            java.lang.String r4 = androidx.versionedparcelable.C1107.m3485(r4, r5, r6, r7)
            androidx.lifecycle.process.C1087.m1946(r0, r4)
            r4 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r4)
            r4 = -6710950(0xffffffffff99995a, float:NaN)
            int r5 = androidx.vectordrawable.animated.C1102.f128
            r4 = r4 ^ r5
            kevin.fun.hook.webdav.C1118.m8517(r0, r4)
            int r4 = androidx.vectordrawable.C1103.f129
            r4 = r4 ^ 285(0x11d, float:4.0E-43)
            androidx.documentfile.C1076.m1233(r0, r4)
            androidx.activity.C1064.m372(r3, r0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r11)
            r4 = 0
            androidx.customview.C1074.m1119(r0, r4)
            r4 = 0
            r5 = 1098907648(0x41800000, float:16.0)
            int r5 = m8172(r10, r11, r5)
            r6 = 0
            r7 = 0
            androidx.drawerlayout.C1077.m1314(r0, r4, r5, r6, r7)
            int r4 = androidx.emoji2.viewsintegration.C1079.f105
            r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
            androidx.emoji2.C1080.m1542(r0, r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r11)
            short[] r5 = m8183()
            r6 = 146(0x92, float:2.05E-43)
            int r7 = androidx.customview.C1074.f100
            r7 = r7 ^ 247(0xf7, float:3.46E-43)
            r8 = 2083(0x823, float:2.919E-42)
            java.lang.String r5 = com.tencent.mmkv.C1109.m3629(r5, r6, r7, r8)
            androidx.lifecycle.process.C1087.m1946(r4, r5)
            r5 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r5)
            r5 = 10066412(0x9999ec, float:1.4106048E-38)
            int r6 = androidx.lifecycle.viewmodel.C1093.f119
            r5 = r5 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r4, r5)
            int r5 = androidx.activity.C1065.f91
            r5 = r5 ^ (-38)
            androidx.documentfile.C1076.m1233(r4, r5)
            r5 = 1098907648(0x41800000, float:16.0)
            int r5 = m8172(r10, r11, r5)
            r6 = 1094713344(0x41400000, float:12.0)
            int r6 = m8172(r10, r11, r6)
            r7 = 1098907648(0x41800000, float:16.0)
            int r7 = m8172(r10, r11, r7)
            r8 = 1094713344(0x41400000, float:12.0)
            int r8 = m8172(r10, r11, r8)
            kevin.fun.hook.audio.C1117.m8126(r4, r5, r6, r7, r8)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 0
            int r7 = androidx.core.C1072.f98
            r7 = r7 ^ 542(0x21e, float:7.6E-43)
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6, r7, r8)
            androidx.lifecycle.livedata.C1085.m1822(r4, r5)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r6 = -658292(0xfffffffffff5f48c, float:NaN)
            int r7 = androidx.emoji2.C1080.f106
            r6 = r6 ^ r7
            androidx.lifecycle.livedata.C1085.m1879(r5, r6)
            r6 = 1103626240(0x41c80000, float:25.0)
            int r6 = m8172(r10, r11, r6)
            float r6 = (float) r6
            androidx.lifecycle.process.C1091.m2252(r5, r6)
            androidx.core.C1073.m999(r4, r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r11)
            short[] r6 = m8183()
            r7 = 150(0x96, float:2.1E-43)
            int r8 = androidx.vectordrawable.C1103.f129
            r8 = r8 ^ 264(0x108, float:3.7E-43)
            r9 = 2640(0xa50, float:3.7E-42)
            java.lang.String r6 = androidx.vectordrawable.C1104.m3232(r6, r7, r8, r9)
            androidx.lifecycle.process.C1087.m1946(r5, r6)
            r6 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r6)
            r6 = 43886(0xab6e, float:6.1497E-41)
            int r7 = org.luckypray.dexkit.C1123.f433
            r6 = r6 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r5, r6)
            android.graphics.Typeface r6 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r5, r6)
            int r6 = androidx.documentfile.C1076.f102
            r6 = r6 ^ (-585(0xfffffffffffffdb7, float:NaN))
            androidx.documentfile.C1076.m1233(r5, r6)
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m8172(r10, r11, r6)
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = m8172(r10, r11, r7)
            r8 = 1098907648(0x41800000, float:16.0)
            int r8 = m8172(r10, r11, r8)
            r9 = 1094713344(0x41400000, float:12.0)
            int r9 = m8172(r10, r11, r9)
            kevin.fun.hook.audio.C1117.m8126(r5, r6, r7, r8, r9)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = 0
            int r8 = androidx.interpolator.C1081.f107
            r8 = r8 ^ 265(0x109, float:3.71E-43)
            r9 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r7, r8, r9)
            androidx.lifecycle.livedata.C1085.m1822(r5, r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r7 = -658262(0xfffffffffff5f4aa, float:NaN)
            int r8 = androidx.interpolator.C1082.f108
            r7 = r7 ^ r8
            androidx.lifecycle.livedata.C1085.m1879(r6, r7)
            r7 = 1103626240(0x41c80000, float:25.0)
            int r7 = m8172(r10, r11, r7)
            float r7 = (float) r7
            androidx.lifecycle.process.C1091.m2252(r6, r7)
            androidx.core.C1073.m999(r5, r6)
            android.view.View r6 = new android.view.View
            r6.<init>(r11)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = m8172(r10, r11, r8)
            int r9 = androidx.core.C1073.f99
            r9 = r9 ^ (-448(0xfffffffffffffe40, float:NaN))
            r7.<init>(r8, r9)
            androidx.lifecycle.livedata.C1085.m1843(r6, r7)
            r7 = -1119008(0xffffffffffeeece0, float:NaN)
            int r8 = androidx.appcompat.resources.C1068.f94
            r7 = r7 ^ r8
            androidx.loader.C1099.m2849(r6, r7)
            androidx.activity.C1064.m372(r0, r4)
            androidx.activity.C1064.m372(r0, r6)
            androidx.activity.C1064.m372(r0, r5)
            androidx.activity.C1064.m372(r3, r0)
            androidx.annotation.experimental.C1067.m579(r2, r3)
            androidx.viewpager.C1108.m3545(r1, r2)
            int r0 = m8189()
            androidx.loader.C1099.m2859(r2, r0, r4)
            int r0 = m8225()
            androidx.loader.C1099.m2859(r2, r0, r5)
            android.view.Window r2 = androidx.lifecycle.process.C1089.m2157(r1)
            r0 = 1864(0x748, float:2.612E-42)
        L328:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L32e;
                case 47384: goto L356;
                case 47417: goto L338;
                case 47483: goto L334;
                default: goto L32d;
            }
        L32d:
            goto L328
        L32e:
            if (r2 == 0) goto L334
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L328
        L334:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L328
        L338:
            android.view.Window r0 = androidx.lifecycle.process.C1089.m2157(r1)
            android.view.View r0 = androidx.viewpager.C1108.m3492(r0)
            int r2 = m8189()
            androidx.loader.C1098.m2820(r0, r2, r4)
            android.view.Window r0 = androidx.lifecycle.process.C1089.m2157(r1)
            android.view.View r0 = androidx.viewpager.C1108.m3492(r0)
            int r2 = m8225()
            androidx.loader.C1098.m2820(r0, r2, r5)
        L356:
            r0 = 1063675494(0x3f666666, float:0.9)
            com.tencent.mmkv.C1109.m3569(r3, r0)
            r0 = 1063675494(0x3f666666, float:0.9)
            androidx.vectordrawable.animated.C1102.m3064(r3, r0)
            r0 = 0
            androidx.lifecycle.livedata.C1084.m1764(r3, r0)
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r2)
            r2 = 983(0x3d7, double:4.857E-321)
            int r4 = androidx.lifecycle.runtime.C1092.f118
            long r4 = (long) r4
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r2)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)
            return r1
    }

    private void deletePartialFile(android.content.Context r4, android.net.Uri r5) {
            r3 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L48;
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
            androidx.documentfile.provider.DocumentFile r1 = androidx.customview.C1075.m1187(r4, r5)     // Catch: java.lang.Throwable -> L65
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L4d;
                case 500: goto L24;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L65
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
            boolean r2 = androidx.lifecycle.process.C1090.m2160(r1)     // Catch: java.lang.Throwable -> L65
            r0 = 1864(0x748, float:2.612E-42)
        L2a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L30;
                case 47384: goto L4d;
                case 47417: goto L3a;
                case 47483: goto L36;
                default: goto L2f;
            }     // Catch: java.lang.Throwable -> L65
        L2f:
            goto L2a
        L30:
            if (r2 == 0) goto L36
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2a
        L36:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2a
        L3a:
            androidx.drawerlayout.C1077.m1333(r1)     // Catch: java.lang.Throwable -> L65
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L40:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L48;
                case 239: goto L49;
                default: goto L47;
            }     // Catch: java.lang.Throwable -> L65
        L47:
            goto L40
        L48:
            return
        L49:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L40
        L4d:
            android.content.ContentResolver r0 = androidx.activity.C1063.m246(r4)     // Catch: java.lang.Throwable -> L65
            r1 = 0
            r2 = 0
            androidx.lifecycle.process.C1088.m2046(r0, r5, r1, r2)     // Catch: java.lang.Throwable -> L65
            r0 = 48891(0xbefb, float:6.8511E-41)
        L59:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L48;
                case 503: goto L61;
                default: goto L60;
            }
        L60:
            goto L59
        L61:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L59
        L65:
            r0 = move-exception
            goto L48
    }

    private void downloadCommentVideo(android.content.Context r12, java.lang.String r13) {
            r11 = this;
            r7 = 1
            r2 = 0
            r0 = 0
            java.lang.String r1 = "۟ۡۢ"
            r4 = r0
            r3 = r0
            r6 = r0
            r5 = r0
            r8 = r0
            r9 = r2
            r10 = r2
        Lc:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56359: goto L3e;
                case 1746724: goto L93;
                case 1746752: goto L73;
                case 1746756: goto L9b;
                case 1746909: goto L37;
                case 1746911: goto L21;
                case 1747649: goto L7b;
                case 1747655: goto L8b;
                case 1747779: goto L60;
                case 1747838: goto L1a;
                case 1748860: goto L2d;
                case 1750595: goto Lba;
                case 1750632: goto L59;
                case 1750755: goto L67;
                case 1751656: goto L4d;
                case 1752453: goto Lad;
                case 1752548: goto La4;
                case 1752647: goto L83;
                case 1755530: goto L45;
                default: goto L13;
            }
        L13:
            r2 = r9 ^ 850(0x352, float:1.191E-42)
            java.lang.String r0 = "ۣۦۦ"
            r1 = r0
            r10 = r2
            goto Lc
        L1a:
            r2 = r9 ^ 23
            java.lang.String r0 = "۟ۦۦ"
            r1 = r0
            r10 = r2
            goto Lc
        L21:
            r0 = 154(0x9a, float:2.16E-43)
            r1 = 1256(0x4e8, float:1.76E-42)
            java.lang.String r6 = androidx.appcompat.C1069.m751(r8, r0, r10, r1)
            java.lang.String r0 = "ۨۥۧ"
            r1 = r0
            goto Lc
        L2d:
            r0 = r11
            r1 = r12
            r2 = r13
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۣۡۡ"
            r1 = r0
            goto Lc
        L37:
            int r2 = androidx.lifecycle.livedata.C1084.f110
            java.lang.String r0 = "۠ۥۣ"
            r1 = r0
            r9 = r2
            goto Lc
        L3e:
            int r2 = androidx.startup.C1100.f126
            java.lang.String r0 = "۟۠ۥ"
            r1 = r0
            r9 = r2
            goto Lc
        L45:
            short[] r0 = m8183()
            java.lang.String r1 = "ۡۨ"
            r8 = r0
            goto Lc
        L4d:
            r0 = 158(0x9e, float:2.21E-43)
            r1 = 2535(0x9e7, float:3.552E-42)
            java.lang.String r5 = androidx.interpolator.C1082.m1694(r8, r0, r10, r1)
            java.lang.String r0 = "۟ۡۦ"
            r1 = r0
            goto Lc
        L59:
            int r2 = androidx.loader.C1099.f125
            java.lang.String r0 = "ۥۥ"
            r1 = r0
            r9 = r2
            goto Lc
        L60:
            r2 = r9 ^ 795(0x31b, float:1.114E-42)
            java.lang.String r0 = "ۥ۟۟"
            r1 = r0
            r10 = r2
            goto Lc
        L67:
            r0 = 175(0xaf, float:2.45E-43)
            r1 = 2699(0xa8b, float:3.782E-42)
            java.lang.String r3 = org.luckypray.dexkit.C1124.m10545(r8, r0, r10, r1)
            java.lang.String r0 = "ۡۧۢ"
            r1 = r0
            goto Lc
        L73:
            short[] r0 = m8183()
            java.lang.String r1 = "۟ۦۤ"
            r8 = r0
            goto Lc
        L7b:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۢۧ"
            r8 = r0
            goto Lc
        L83:
            short[] r0 = m8183()
            java.lang.String r1 = "۠۟ۦ"
            r8 = r0
            goto Lc
        L8b:
            int r2 = androidx.lifecycle.runtime.C1092.f118
            java.lang.String r0 = "ۣ۠ۦ"
            r1 = r0
            r9 = r2
            goto Lc
        L93:
            r2 = r9 ^ (-281(0xfffffffffffffee7, float:NaN))
            java.lang.String r0 = "ۤۤۨ"
            r1 = r0
            r10 = r2
            goto Lc
        L9b:
            java.lang.String r4 = m8173(r11, r5, r7, r6)
            java.lang.String r0 = "ۥۢۡ"
            r1 = r0
            goto Lc
        La4:
            java.lang.String r5 = androidx.lifecycle.viewmodel.C1093.m2428()
            java.lang.String r0 = "ۥۥۧ"
            r1 = r0
            goto Lc
        Lad:
            r0 = 171(0xab, float:2.4E-43)
            r1 = 1401(0x579, float:1.963E-42)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r8, r0, r10, r1)
            java.lang.String r0 = "۠۟۠"
            r1 = r0
            goto Lc
        Lba:
            return
    }

    private void downloadCommentVideoSilent(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            short[] r0 = m8183()
            r1 = 184(0xb8, float:2.58E-43)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 932(0x3a4, float:1.306E-42)
            r3 = 1944(0x798, float:2.724E-42)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r2, r3)
            short[] r1 = m8183()
            r2 = 188(0xbc, float:2.63E-43)
            int r3 = androidx.lifecycle.runtime.C1092.f118
            r3 = r3 ^ 786(0x312, float:1.101E-42)
            r4 = 2228(0x8b4, float:3.122E-42)
            java.lang.String r1 = androidx.activity.C1063.m241(r1, r2, r3, r4)
            r2 = 1
            java.lang.String r4 = m8173(r8, r1, r2, r0)
            java.lang.String r5 = androidx.lifecycle.viewmodel.C1093.m2428()
            short[] r0 = m8183()
            r1 = 201(0xc9, float:2.82E-43)
            int r2 = androidx.activity.C1062.f88
            r2 = r2 ^ (-79)
            r3 = 3257(0xcb9, float:4.564E-42)
            java.lang.String r6 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            short[] r0 = m8183()
            r1 = 205(0xcd, float:2.87E-43)
            int r2 = androidx.customview.C1074.f100
            r2 = r2 ^ 250(0xfa, float:3.5E-43)
            r3 = 1332(0x534, float:1.867E-42)
            java.lang.String r3 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1616(0x650, float:2.264E-42)
        L56:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L5c;
                case 49: goto L5f;
                case 204: goto L64;
                case 239: goto L73;
                default: goto L5b;
            }
        L5b:
            goto L56
        L5c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L56
        L5f:
            if (r1 > 0) goto L5c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L56
        L64:
            java.lang.String r0 = "fbSQKRzVHnX2vR9k"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L73:
            return
    }

    private void downloadFile(java.lang.String r12, java.io.File r13) throws java.io.IOException {
            r11 = this;
            r10 = 3
            r4 = 0
            r0 = 1
        L3:
            r1 = 1616(0x650, float:2.264E-42)
        L5:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L2c3;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r0 > r10) goto Lb
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            r1.<init>()     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            okhttp3.Request$Builder r1 = m8201(r1, r12)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            short[] r2 = m8183()     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            r3 = 214(0xd6, float:3.0E-43)
            int r5 = androidx.documentfile.C1076.f102     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            r5 = r5 ^ (-596(0xfffffffffffffdac, float:NaN))
            r6 = 2865(0xb31, float:4.015E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r5, r6)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            short[] r3 = m8183()     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            r5 = 224(0xe0, float:3.14E-43)
            int r6 = androidx.interpolator.C1082.f108     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            r6 = r6 ^ 365(0x16d, float:5.11E-43)
            r7 = 803(0x323, float:1.125E-42)
            java.lang.String r3 = androidx.lifecycle.process.C1087.m2008(r3, r5, r6, r7)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            okhttp3.Request$Builder r1 = m8214(r1, r2, r3)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            okhttp3.Request r1 = m8224(r1)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            okhttp3.OkHttpClient r2 = m8180()     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            okhttp3.Call r1 = m101(r2, r1)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            okhttp3.Response r5 = m8205(r1)     // Catch: java.io.IOException -> L2d9 java.lang.Throwable -> L2dd
            boolean r2 = m8226(r5)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r1 = 1740(0x6cc, float:2.438E-42)
        L56:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L5c;
                case 54: goto L61;
                case 471: goto L1cb;
                case 500: goto L64;
                default: goto L5b;
            }     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
        L5b:
            goto L56
        L5c:
            if (r2 == 0) goto L61
            r1 = 1833(0x729, float:2.569E-42)
            goto L56
        L61:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L56
        L64:
            okhttp3.ResponseBody r2 = m8228(r5)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r1 = 1864(0x748, float:2.612E-42)
        L6a:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L70;
                case 47384: goto L1a4;
                case 47417: goto L7a;
                case 47483: goto L76;
                default: goto L6f;
            }
        L6f:
            goto L6a
        L70:
            if (r2 == 0) goto L76
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L6a
        L76:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L6a
        L7a:
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2e0
            java.io.InputStream r1 = m8223(r2)     // Catch: java.lang.Throwable -> L2e0
            r2 = 33666(0x8382, float:4.7176E-41)
            int r3 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L2e0
            r2 = r2 ^ r3
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2e0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e4
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L2e4
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L107
        L90:
            int r7 = androidx.loader.C1099.m2896(r6, r2)     // Catch: java.lang.Throwable -> L107
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L97:
            r8 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 14: goto L9f;
                case 45: goto Lf4;
                case 76: goto Laa;
                case 239: goto La3;
                default: goto L9e;
            }     // Catch: java.lang.Throwable -> L107
        L9e:
            goto L97
        L9f:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L97
        La3:
            r1 = -1
            if (r7 != r1) goto L9f
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L97
        Laa:
            kevin.fun.hook.audio.C1117.m8156(r3)     // Catch: java.lang.Throwable -> L107
            kevin.fun.hook.audio.C1117.m8104(r3)     // Catch: java.lang.Throwable -> L2e4
            androidx.versionedparcelable.C1107.m3447(r6)     // Catch: java.lang.Throwable -> L2e0
            r0 = 48891(0xbefb, float:6.8511E-41)
        Lb6:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto Lbe;
                case 53: goto Lcb;
                case 503: goto Lc2;
                case 32495: goto Lc8;
                default: goto Lbd;
            }
        Lbd:
            goto Lb6
        Lbe:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Lb6
        Lc2:
            if (r5 == 0) goto Lbe
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Lb6
        Lc8:
            m8186(r5)
        Lcb:
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
            r0 = 49666(0xc202, float:6.9597E-41)
        Ld2:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Lda;
                case 50: goto Le0;
                case 76: goto Le4;
                case 83: goto Lf3;
                default: goto Ld9;
            }
        Ld9:
            goto Ld2
        Lda:
            if (r1 > 0) goto Le0
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Ld2
        Le0:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Ld2
        Le4:
            java.lang.String r0 = "pgdl9CHbYKnrT"
            java.lang.String r0 = androidx.emoji2.C1080.m1544(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lf3:
            return
        Lf4:
            r1 = 0
            androidx.drawerlayout.C1077.m1285(r3, r2, r1, r7)     // Catch: java.lang.Throwable -> L107
            r1 = 49790(0xc27e, float:6.977E-41)
        Lfb:
            r7 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 18: goto L90;
                case 241: goto L103;
                default: goto L102;
            }
        L102:
            goto Lfb
        L103:
            r1 = 49821(0xc29d, float:6.9814E-41)
            goto Lfb
        L107:
            r1 = move-exception
            kevin.fun.hook.audio.C1117.m8104(r3)     // Catch: java.lang.Throwable -> L10c
            throw r1     // Catch: java.lang.Throwable -> L10c
        L10c:
            r2 = move-exception
            r3 = r1
        L10e:
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L111:
            r7 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 497: goto L119;
                case 1711: goto L11f;
                case 1736: goto L160;
                case 1769: goto L123;
                default: goto L118;
            }
        L118:
            goto L111
        L119:
            if (r3 == 0) goto L11f
            r1 = 50658(0xc5e2, float:7.0987E-41)
            goto L111
        L11f:
            r1 = 50627(0xc5c3, float:7.0944E-41)
            goto L111
        L123:
            r1 = 50689(0xc601, float:7.103E-41)
        L126:
            r7 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 19: goto L12e;
                case 45: goto L146;
                case 50: goto L134;
                case 76: goto L138;
                default: goto L12d;
            }
        L12d:
            goto L126
        L12e:
            if (r3 == r2) goto L134
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto L126
        L134:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto L126
        L138:
            kevin.fun.hook.audio.C1116.m8088(r3, r2)     // Catch: java.lang.Throwable -> L14a
            r1 = 50813(0xc67d, float:7.1204E-41)
        L13e:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L146;
                case 243: goto L15c;
                default: goto L145;
            }     // Catch: java.lang.Throwable -> L14a
        L145:
            goto L13e
        L146:
            androidx.versionedparcelable.C1107.m3447(r6)     // Catch: java.lang.Throwable -> L14a
            throw r3     // Catch: java.lang.Throwable -> L14a
        L14a:
            r1 = move-exception
        L14b:
            r2 = 51588(0xc984, float:7.229E-41)
        L14e:
            r6 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L156;
                case 54: goto L162;
                case 87: goto L18d;
                case 116: goto L166;
                default: goto L155;
            }
        L155:
            goto L14e
        L156:
            if (r3 == 0) goto L162
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L14e
        L15c:
            r1 = 50844(0xc69c, float:7.1248E-41)
            goto L13e
        L160:
            r3 = r2
            goto L146
        L162:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L14e
        L166:
            r2 = 51712(0xca00, float:7.2464E-41)
        L169:
            r6 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 14: goto L171;
                case 17: goto L175;
                case 47: goto L18e;
                case 76: goto L17b;
                default: goto L170;
            }
        L170:
            goto L169
        L171:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L169
        L175:
            if (r3 == r1) goto L171
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L169
        L17b:
            kevin.fun.hook.audio.C1116.m8088(r3, r1)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r1 = 51836(0xca7c, float:7.2638E-41)
        L181:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 241: goto L189;
                case 1963: goto L18e;
                default: goto L188;
            }     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
        L188:
            goto L181
        L189:
            r1 = 52518(0xcd26, float:7.3593E-41)
            goto L181
        L18d:
            r3 = r1
        L18e:
            throw r3     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
        L18f:
            r2 = move-exception
            r1 = r5
        L191:
            boolean r5 = androidx.vectordrawable.C1105.m3294(r13)     // Catch: java.lang.Throwable -> L2a5
            r3 = 52735(0xcdff, float:7.3897E-41)
        L198:
            r6 = 52752(0xce10, float:7.3921E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 14: goto L1a0;
                case 45: goto L1ff;
                case 1007: goto L1f6;
                case 7927: goto L1fc;
                default: goto L19f;
            }
        L19f:
            goto L198
        L1a0:
            r3 = 52797(0xce3d, float:7.3984E-41)
            goto L198
        L1a4:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            short[] r2 = m8183()     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r3 = 274(0x112, float:3.84E-43)
            int r6 = androidx.interpolator.C1082.f108     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r6 = r6 ^ 346(0x15a, float:4.85E-43)
            r7 = 1989(0x7c5, float:2.787E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r3, r6, r7)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r1.<init>(r2)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            throw r1     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
        L1ba:
            r0 = move-exception
            r4 = r5
        L1bc:
            r1 = 52611(0xcd83, float:7.3724E-41)
        L1bf:
            r2 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 23: goto L1c7;
                case 54: goto L2aa;
                default: goto L1c6;
            }     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
        L1c6:
            goto L1bf
        L1c7:
            r1 = 52642(0xcda2, float:7.3767E-41)
            goto L1bf
        L1cb:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            int r2 = m8179(r5)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r3.<init>()     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            short[] r6 = m8183()     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r7 = 279(0x117, float:3.91E-43)
            int r8 = androidx.activity.C1066.f92     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r8 = r8 ^ 828(0x33c, float:1.16E-42)
            r9 = 901(0x385, float:1.263E-42)
            java.lang.String r6 = androidx.core.C1073.m1028(r6, r7, r8, r9)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r6)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r3, r2)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            r1.<init>(r2)     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
            throw r1     // Catch: java.io.IOException -> L18f java.lang.Throwable -> L1ba
        L1f6:
            if (r5 == 0) goto L1a0
            r3 = 53479(0xd0e7, float:7.494E-41)
            goto L198
        L1fc:
            androidx.loader.C1095.m2548(r13)     // Catch: java.lang.Throwable -> L2a5
        L1ff:
            java.lang.String r3 = androidx.emoji2.viewsintegration.C1078.m1366(r2)     // Catch: java.lang.Throwable -> L2a5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a5
            r5.<init>()     // Catch: java.lang.Throwable -> L2a5
            short[] r6 = m8183()     // Catch: java.lang.Throwable -> L2a5
            r7 = 288(0x120, float:4.04E-43)
            int r8 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L2a5
            r8 = r8 ^ 844(0x34c, float:1.183E-42)
            r9 = 341(0x155, float:4.78E-43)
            java.lang.String r6 = androidx.vectordrawable.C1104.m3232(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a5
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L2a5
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r0)     // Catch: java.lang.Throwable -> L2a5
            short[] r6 = m8183()     // Catch: java.lang.Throwable -> L2a5
            r7 = 311(0x137, float:4.36E-43)
            int r8 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L2a5
            r8 = r8 ^ (-427(0xfffffffffffffe55, float:NaN))
            r9 = 2784(0xae0, float:3.901E-42)
            java.lang.String r6 = androidx.loader.C1099.m2843(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a5
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L2a5
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r5, r3)     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L2a5
            m8215(r3)     // Catch: java.lang.Throwable -> L2a5
            r3 = 53510(0xd106, float:7.4983E-41)
        L242:
            r5 = 53527(0xd117, float:7.5007E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L24a;
                case 50: goto L250;
                case 83: goto L2a9;
                case 116: goto L254;
                default: goto L249;
            }
        L249:
            goto L242
        L24a:
            if (r0 == r10) goto L250
            r3 = 53603(0xd163, float:7.5114E-41)
            goto L242
        L250:
            r3 = 53572(0xd144, float:7.507E-41)
            goto L242
        L254:
            long r2 = (long) r0
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            androidx.vectordrawable.C1105.m3252(r2)     // Catch: java.lang.InterruptedException -> L287 java.lang.Throwable -> L2a5
            r2 = 53634(0xd182, float:7.5157E-41)
        L25e:
            r3 = 53651(0xd193, float:7.5181E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L266;
                case 50: goto L26c;
                case 76: goto L270;
                case 83: goto L273;
                default: goto L265;
            }
        L265:
            goto L25e
        L266:
            if (r1 == 0) goto L26c
            r2 = 53727(0xd1df, float:7.5288E-41)
            goto L25e
        L26c:
            r2 = 53696(0xd1c0, float:7.5244E-41)
            goto L25e
        L270:
            m8186(r1)
        L273:
            int r1 = androidx.startup.C1101.f127
            r1 = r1 ^ 767(0x2ff, float:1.075E-42)
            int r0 = r0 + r1
            r1 = 53758(0xd1fe, float:7.5331E-41)
        L27b:
            r2 = 53775(0xd20f, float:7.5355E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 1009: goto L283;
                case 1703: goto L3;
                default: goto L282;
            }
        L282:
            goto L27b
        L283:
            r1 = 54440(0xd4a8, float:7.6287E-41)
            goto L27b
        L287:
            r0 = move-exception
            java.lang.Thread r2 = androidx.lifecycle.process.C1088.m2063()     // Catch: java.lang.Throwable -> L2a5
            androidx.lifecycle.livedata.C1085.m1849(r2)     // Catch: java.lang.Throwable -> L2a5
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a5
            short[] r3 = m8183()     // Catch: java.lang.Throwable -> L2a5
            r4 = 316(0x13c, float:4.43E-43)
            int r5 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L2a5
            r5 = r5 ^ 555(0x22b, float:7.78E-43)
            r6 = 2551(0x9f7, float:3.575E-42)
            java.lang.String r3 = androidx.lifecycle.viewmodel.C1093.m2415(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a5
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2a5
            throw r2     // Catch: java.lang.Throwable -> L2a5
        L2a5:
            r0 = move-exception
            r4 = r1
            goto L1bc
        L2a9:
            throw r2     // Catch: java.lang.Throwable -> L2a5
        L2aa:
            r1 = 54533(0xd505, float:7.6417E-41)
        L2ad:
            r2 = 54550(0xd516, float:7.6441E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 19: goto L2b5;
                case 50: goto L2bb;
                case 85: goto L2c2;
                case 116: goto L2bf;
                default: goto L2b4;
            }
        L2b4:
            goto L2ad
        L2b5:
            if (r4 == 0) goto L2bb
            r1 = 54626(0xd562, float:7.6547E-41)
            goto L2ad
        L2bb:
            r1 = 54595(0xd543, float:7.6504E-41)
            goto L2ad
        L2bf:
            m8186(r4)
        L2c2:
            throw r0
        L2c3:
            java.io.IOException r0 = new java.io.IOException
            short[] r1 = m8183()
            r2 = 321(0x141, float:4.5E-43)
            int r3 = androidx.lifecycle.livedata.C1084.f110
            r3 = r3 ^ 30
            r4 = 376(0x178, float:5.27E-43)
            java.lang.String r1 = kevin.fun.hook.audio.C1116.m8020(r1, r2, r3, r4)
            r0.<init>(r1)
            throw r0
        L2d9:
            r2 = move-exception
            r1 = r4
            goto L191
        L2dd:
            r0 = move-exception
            goto L1bc
        L2e0:
            r1 = move-exception
            r3 = r4
            goto L14b
        L2e4:
            r1 = move-exception
            r2 = r1
            r3 = r4
            goto L10e
    }

    private void downloadFileSync(java.lang.String r9, java.io.File r10) throws java.io.IOException {
            r8 = this;
            r3 = 0
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r0 = m8201(r0, r9)
            short[] r1 = m8183()
            r2 = 334(0x14e, float:4.68E-43)
            int r4 = androidx.vectordrawable.animated.C1102.f128
            r4 = r4 ^ 201(0xc9, float:2.82E-43)
            r5 = 1052(0x41c, float:1.474E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r1, r2, r4, r5)
            short[] r2 = m8183()
            r4 = 344(0x158, float:4.82E-43)
            int r5 = androidx.vectordrawable.C1105.f131
            r5 = r5 ^ 365(0x16d, float:5.11E-43)
            r6 = 2192(0x890, float:3.072E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1091.m2229(r2, r4, r5, r6)
            okhttp3.Request$Builder r0 = m8214(r0, r1, r2)
            okhttp3.Request r0 = m8224(r0)
            okhttp3.OkHttpClient r1 = m8180()     // Catch: java.lang.Throwable -> L20a
            okhttp3.Call r0 = m101(r1, r0)     // Catch: java.lang.Throwable -> L20a
            okhttp3.Response r4 = m8205(r0)     // Catch: java.lang.Throwable -> L20a
            boolean r1 = m8226(r4)     // Catch: java.lang.Throwable -> L170
            r0 = 1616(0x650, float:2.264E-42)
        L44:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L4a;
                case 49: goto L4d;
                case 204: goto L52;
                case 239: goto L198;
                default: goto L49;
            }     // Catch: java.lang.Throwable -> L170
        L49:
            goto L44
        L4a:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L44
        L4d:
            if (r1 == 0) goto L4a
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L44
        L52:
            okhttp3.ResponseBody r1 = m8228(r4)     // Catch: java.lang.Throwable -> L170
            r0 = 1740(0x6cc, float:2.438E-42)
        L58:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L5e;
                case 54: goto L63;
                case 471: goto L182;
                case 500: goto L66;
                default: goto L5d;
            }
        L5d:
            goto L58
        L5e:
            if (r1 == 0) goto L63
            r0 = 1833(0x729, float:2.569E-42)
            goto L58
        L63:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L58
        L66:
            java.io.InputStream r5 = m8223(r1)     // Catch: java.lang.Throwable -> L20d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L215
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L215
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> Ld4
        L73:
            int r6 = androidx.loader.C1099.m2896(r5, r1)     // Catch: java.lang.Throwable -> Ld4
            r0 = 1864(0x748, float:2.612E-42)
        L79:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L7f;
                case 47384: goto Lc1;
                case 47417: goto L8a;
                case 47483: goto L86;
                default: goto L7e;
            }     // Catch: java.lang.Throwable -> Ld4
        L7e:
            goto L79
        L7f:
            r0 = -1
            if (r6 != r0) goto L86
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L79
        L86:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L79
        L8a:
            kevin.fun.hook.audio.C1117.m8156(r2)     // Catch: java.lang.Throwable -> Ld4
            kevin.fun.hook.audio.C1117.m8104(r2)     // Catch: java.lang.Throwable -> L215
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L93:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L9b;
                case 45: goto La8;
                case 76: goto La5;
                case 239: goto L9f;
                default: goto L9a;
            }
        L9a:
            goto L93
        L9b:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L93
        L9f:
            if (r5 == 0) goto L9b
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L93
        La5:
            androidx.versionedparcelable.C1107.m3447(r5)     // Catch: java.lang.Throwable -> L20d
        La8:
            r0 = 48891(0xbefb, float:6.8511E-41)
        Lab:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto Lb3;
                case 53: goto Lc0;
                case 503: goto Lb7;
                case 32495: goto Lbd;
                default: goto Lb2;
            }
        Lb2:
            goto Lab
        Lb3:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Lab
        Lb7:
            if (r4 == 0) goto Lb3
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Lab
        Lbd:
            m8186(r4)     // Catch: java.lang.Throwable -> L20a
        Lc0:
            return
        Lc1:
            r0 = 0
            androidx.drawerlayout.C1077.m1285(r2, r1, r0, r6)     // Catch: java.lang.Throwable -> Ld4
            r0 = 49666(0xc202, float:6.9597E-41)
        Lc8:
            r6 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 17: goto Ld0;
                case 50: goto L73;
                default: goto Lcf;
            }
        Lcf:
            goto Lc8
        Ld0:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lc8
        Ld4:
            r0 = move-exception
            r1 = r0
            kevin.fun.hook.audio.C1117.m8104(r2)     // Catch: java.lang.Throwable -> Lda
            throw r1     // Catch: java.lang.Throwable -> Lda
        Lda:
            r0 = move-exception
        Ldb:
            r2 = 49790(0xc27e, float:6.977E-41)
        Lde:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto Le6;
                case 51: goto Lff;
                case 84: goto Lf0;
                case 241: goto Lea;
                default: goto Le5;
            }
        Le5:
            goto Lde
        Le6:
            r2 = 49852(0xc2bc, float:6.9858E-41)
            goto Lde
        Lea:
            if (r1 != 0) goto Le6
            r2 = 49883(0xc2db, float:6.9901E-41)
            goto Lde
        Lf0:
            r1 = 49914(0xc2fa, float:6.9944E-41)
        Lf3:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 497: goto Lfb;
                case 1711: goto L118;
                default: goto Lfa;
            }
        Lfa:
            goto Lf3
        Lfb:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto Lf3
        Lff:
            r2 = 50689(0xc601, float:7.103E-41)
        L102:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L10a;
                case 45: goto L219;
                case 50: goto L110;
                case 76: goto L114;
                default: goto L109;
            }
        L109:
            goto L102
        L10a:
            if (r1 == r0) goto L110
            r2 = 50782(0xc65e, float:7.1161E-41)
            goto L102
        L110:
            r2 = 50751(0xc63f, float:7.1117E-41)
            goto L102
        L114:
            kevin.fun.hook.audio.C1116.m8088(r1, r0)     // Catch: java.lang.Throwable -> L211
            r0 = r1
        L118:
            r1 = 50813(0xc67d, float:7.1204E-41)
        L11b:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L123;
                case 53: goto L130;
                case 243: goto L127;
                case 4075: goto L12d;
                default: goto L122;
            }
        L122:
            goto L11b
        L123:
            r1 = 50875(0xc6bb, float:7.1291E-41)
            goto L11b
        L127:
            if (r5 == 0) goto L123
            r1 = 51557(0xc965, float:7.2247E-41)
            goto L11b
        L12d:
            androidx.versionedparcelable.C1107.m3447(r5)     // Catch: java.lang.Throwable -> L131
        L130:
            throw r0     // Catch: java.lang.Throwable -> L131
        L131:
            r2 = move-exception
        L132:
            r1 = 51588(0xc984, float:7.229E-41)
        L135:
            r3 = 51605(0xc995, float:7.2314E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L13d;
                case 54: goto L143;
                case 87: goto L16e;
                case 116: goto L147;
                default: goto L13c;
            }
        L13c:
            goto L135
        L13d:
            if (r0 == 0) goto L143
            r1 = 51681(0xc9e1, float:7.242E-41)
            goto L135
        L143:
            r1 = 51650(0xc9c2, float:7.2377E-41)
            goto L135
        L147:
            r1 = 51712(0xca00, float:7.2464E-41)
        L14a:
            r3 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L152;
                case 17: goto L156;
                case 47: goto L16f;
                case 76: goto L15c;
                default: goto L151;
            }
        L151:
            goto L14a
        L152:
            r1 = 51774(0xca3e, float:7.2551E-41)
            goto L14a
        L156:
            if (r0 == r2) goto L152
            r1 = 51805(0xca5d, float:7.2594E-41)
            goto L14a
        L15c:
            kevin.fun.hook.audio.C1116.m8088(r0, r2)     // Catch: java.lang.Throwable -> L170
            r1 = 51836(0xca7c, float:7.2638E-41)
        L162:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 241: goto L16a;
                case 1963: goto L16f;
                default: goto L169;
            }     // Catch: java.lang.Throwable -> L170
        L169:
            goto L162
        L16a:
            r1 = 52518(0xcd26, float:7.3593E-41)
            goto L162
        L16e:
            r0 = r2
        L16f:
            throw r0     // Catch: java.lang.Throwable -> L170
        L170:
            r0 = move-exception
            r1 = 52611(0xcd83, float:7.3724E-41)
        L174:
            r2 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 23: goto L17c;
                case 54: goto L1c3;
                case 85: goto L1ca;
                case 116: goto L1c7;
                default: goto L17b;
            }     // Catch: java.lang.Throwable -> L170
        L17b:
            goto L174
        L17c:
            if (r4 == 0) goto L1c3
            r1 = 52704(0xcde0, float:7.3854E-41)
            goto L174
        L182:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L170
            short[] r1 = m8183()     // Catch: java.lang.Throwable -> L170
            r2 = 355(0x163, float:4.97E-43)
            int r3 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L170
            r3 = r3 ^ 807(0x327, float:1.131E-42)
            r5 = 1957(0x7a5, float:2.742E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L170
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L170
            throw r0     // Catch: java.lang.Throwable -> L170
        L198:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L170
            int r1 = m8179(r4)     // Catch: java.lang.Throwable -> L170
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L170
            r2.<init>()     // Catch: java.lang.Throwable -> L170
            short[] r3 = m8183()     // Catch: java.lang.Throwable -> L170
            r5 = 360(0x168, float:5.04E-43)
            int r6 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L170
            r6 = r6 ^ (-593(0xfffffffffffffdaf, float:NaN))
            r7 = 341(0x155, float:4.78E-43)
            java.lang.String r3 = kevin.fun.hook.C1120.m8645(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L170
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)     // Catch: java.lang.Throwable -> L170
            java.lang.StringBuilder r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r1)     // Catch: java.lang.Throwable -> L170
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Throwable -> L170
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L170
            throw r0     // Catch: java.lang.Throwable -> L170
        L1c3:
            r1 = 52673(0xcdc1, float:7.381E-41)
            goto L174
        L1c7:
            m8186(r4)     // Catch: java.lang.Throwable -> L1cb
        L1ca:
            throw r0     // Catch: java.lang.Throwable -> L1cb
        L1cb:
            r1 = move-exception
        L1cc:
            r2 = 52735(0xcdff, float:7.3897E-41)
        L1cf:
            r3 = 52752(0xce10, float:7.3921E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1d7;
                case 45: goto L208;
                case 1007: goto L1db;
                case 7927: goto L1e1;
                default: goto L1d6;
            }
        L1d6:
            goto L1cf
        L1d7:
            r2 = 52797(0xce3d, float:7.3984E-41)
            goto L1cf
        L1db:
            if (r0 == 0) goto L1d7
            r2 = 53479(0xd0e7, float:7.494E-41)
            goto L1cf
        L1e1:
            r2 = 53510(0xd106, float:7.4983E-41)
        L1e4:
            r3 = 53527(0xd117, float:7.5007E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L1ec;
                case 50: goto L1f2;
                case 83: goto L209;
                case 116: goto L1f6;
                default: goto L1eb;
            }
        L1eb:
            goto L1e4
        L1ec:
            if (r0 == r1) goto L1f2
            r2 = 53603(0xd163, float:7.5114E-41)
            goto L1e4
        L1f2:
            r2 = 53572(0xd144, float:7.507E-41)
            goto L1e4
        L1f6:
            kevin.fun.hook.audio.C1116.m8088(r0, r1)
            r1 = 53634(0xd182, float:7.5157E-41)
        L1fc:
            r2 = 53651(0xd193, float:7.5181E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L204;
                case 50: goto L209;
                default: goto L203;
            }
        L203:
            goto L1fc
        L204:
            r1 = 53665(0xd1a1, float:7.52E-41)
            goto L1fc
        L208:
            r0 = r1
        L209:
            throw r0
        L20a:
            r1 = move-exception
            r0 = r3
            goto L1cc
        L20d:
            r2 = move-exception
            r0 = r3
            goto L132
        L211:
            r2 = move-exception
            r0 = r1
            goto L132
        L215:
            r0 = move-exception
            r1 = r3
            goto Ldb
        L219:
            r0 = r1
            goto L118
    }

    private void downloadFileWithProgress(android.content.Context r15, java.lang.String r16, android.net.Uri r17, kevin.fun.hook.download.DownloadManager.ProgressCallback r18, okhttp3.Call[] r19) throws java.lang.Exception {
            r14 = this;
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
            r2.<init>()
            r0 = r16
            okhttp3.Request$Builder r2 = m8201(r2, r0)
            short[] r3 = m8183()
            r4 = 369(0x171, float:5.17E-43)
            int r5 = androidx.lifecycle.livedata.C1084.f110
            r5 = r5 ^ 25
            r6 = 2961(0xb91, float:4.149E-42)
            java.lang.String r3 = kevin.fun.hook.audio.C1114.m7940(r3, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 379(0x17b, float:5.31E-43)
            int r6 = androidx.vectordrawable.C1104.f130
            r6 = r6 ^ 623(0x26f, float:8.73E-43)
            r7 = 1132(0x46c, float:1.586E-42)
            java.lang.String r4 = androidx.core.C1073.m1028(r4, r5, r6, r7)
            okhttp3.Request$Builder r2 = m8214(r2, r3, r4)
            short[] r3 = m8183()
            r4 = 439(0x1b7, float:6.15E-43)
            int r5 = androidx.documentfile.C1076.f102
            r5 = r5 ^ (-608(0xfffffffffffffda0, float:NaN))
            r6 = 750(0x2ee, float:1.051E-42)
            java.lang.String r3 = androidx.annotation.experimental.C1067.m581(r3, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 445(0x1bd, float:6.24E-43)
            int r6 = kevin.fun.hook.audio.C1117.f406
            r6 = r6 ^ 74
            r7 = 1520(0x5f0, float:2.13E-42)
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8576(r4, r5, r6, r7)
            okhttp3.Request$Builder r2 = m8214(r2, r3, r4)
            short[] r3 = m8183()
            r4 = 448(0x1c0, float:6.28E-43)
            int r5 = kevin.fun.hook.audio.C1114.f403
            r5 = r5 ^ (-29)
            r6 = 527(0x20f, float:7.38E-43)
            java.lang.String r3 = androidx.emoji2.C1080.m1525(r3, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 463(0x1cf, float:6.49E-43)
            int r6 = androidx.customview.C1075.f101
            r6 = r6 ^ (-108(0xffffffffffffff94, float:NaN))
            r7 = 327(0x147, float:4.58E-43)
            java.lang.String r4 = com.tencent.mmkv.C1109.m3629(r4, r5, r6, r7)
            okhttp3.Request$Builder r2 = m8214(r2, r3, r4)
            short[] r3 = m8183()
            r4 = 477(0x1dd, float:6.68E-43)
            int r5 = androidx.lifecycle.livedata.C1086.f112
            r5 = r5 ^ 956(0x3bc, float:1.34E-42)
            r6 = 1781(0x6f5, float:2.496E-42)
            java.lang.String r3 = androidx.core.C1073.m1028(r3, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 482(0x1e2, float:6.75E-43)
            int r6 = kevin.fun.hook.audio.C1114.f403
            r6 = r6 ^ (-28)
            r7 = 2946(0xb82, float:4.128E-42)
            java.lang.String r4 = androidx.core.C1072.m957(r4, r5, r6, r7)
            okhttp3.Request$Builder r2 = m8214(r2, r3, r4)
            short[] r3 = m8183()
            r4 = 490(0x1ea, float:6.87E-43)
            int r5 = androidx.customview.C1074.f100
            r5 = r5 ^ 249(0xf9, float:3.49E-43)
            r6 = 1635(0x663, float:2.291E-42)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8576(r3, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 500(0x1f4, float:7.0E-43)
            int r6 = androidx.startup.C1101.f127
            r6 = r6 ^ 756(0x2f4, float:1.06E-42)
            r7 = 575(0x23f, float:8.06E-43)
            java.lang.String r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r4, r5, r6, r7)
            okhttp3.Request$Builder r2 = m8214(r2, r3, r4)
            okhttp3.Request r2 = m8224(r2)
            okhttp3.OkHttpClient r3 = m8180()
            okhttp3.Call r3 = m101(r3, r2)
            r2 = 1616(0x650, float:2.264E-42)
        Lcd:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto Ld3;
                case 49: goto Ld6;
                case 204: goto Ldb;
                case 239: goto Lde;
                default: goto Ld2;
            }
        Ld2:
            goto Lcd
        Ld3:
            r2 = 1678(0x68e, float:2.351E-42)
            goto Lcd
        Ld6:
            if (r19 == 0) goto Ld3
            r2 = 1709(0x6ad, float:2.395E-42)
            goto Lcd
        Ldb:
            r2 = 0
            r19[r2] = r3
        Lde:
            okhttp3.Response r8 = m8205(r3)
            boolean r3 = m8226(r8)
            r2 = 1740(0x6cc, float:2.438E-42)
        Le8:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto Lee;
                case 54: goto Lf3;
                case 471: goto L3a8;
                case 500: goto Lf6;
                default: goto Led;
            }
        Led:
            goto Le8
        Lee:
            if (r3 == 0) goto Lf3
            r2 = 1833(0x729, float:2.569E-42)
            goto Le8
        Lf3:
            r2 = 1802(0x70a, float:2.525E-42)
            goto Le8
        Lf6:
            okhttp3.ResponseBody r9 = m8228(r8)
            r2 = 1864(0x748, float:2.612E-42)
        Lfc:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L102;
                case 47384: goto L392;
                case 47417: goto L10c;
                case 47483: goto L108;
                default: goto L101;
            }
        L101:
            goto Lfc
        L102:
            if (r9 == 0) goto L108
            r2 = 48736(0xbe60, float:6.8294E-41)
            goto Lfc
        L108:
            r2 = 48705(0xbe41, float:6.825E-41)
            goto Lfc
        L10c:
            long r10 = m8188(r9)
            r6 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r3 = 0
            java.io.InputStream r3 = m8223(r9)     // Catch: java.lang.Throwable -> L304 java.io.InterruptedIOException -> L314
            android.content.ContentResolver r2 = androidx.activity.C1063.m246(r15)     // Catch: java.lang.Throwable -> L304 java.io.InterruptedIOException -> L3d3
            r0 = r17
            java.io.OutputStream r2 = androidx.vectordrawable.C1104.m3206(r2, r0)     // Catch: java.lang.Throwable -> L2ce java.io.InterruptedIOException -> L2df
            r4 = 48767(0xbe7f, float:6.8337E-41)
        L127:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 14: goto L12f;
                case 45: goto L2a8;
                case 76: goto L139;
                case 239: goto L133;
                default: goto L12e;
            }
        L12e:
            goto L127
        L12f:
            r4 = 48829(0xbebd, float:6.8424E-41)
            goto L127
        L133:
            if (r2 == 0) goto L12f
            r4 = 48860(0xbedc, float:6.8467E-41)
            goto L127
        L139:
            r4 = 262144(0x40000, float:3.67342E-40)
            byte[] r9 = new byte[r4]     // Catch: java.io.InterruptedIOException -> L3d6 java.lang.Throwable -> L3d9
            r4 = 0
            r6 = r4
        L140:
            int r5 = androidx.loader.C1099.m2896(r3, r9)     // Catch: java.io.InterruptedIOException -> L3d6 java.lang.Throwable -> L3d9
            r4 = 48891(0xbefb, float:6.8511E-41)
        L147:
            r12 = 48908(0xbf0c, float:6.8535E-41)
            r4 = r4 ^ r12
            switch(r4) {
                case 22: goto L14f;
                case 53: goto L208;
                case 503: goto L153;
                case 32495: goto L15a;
                default: goto L14e;
            }
        L14e:
            goto L147
        L14f:
            r4 = 48953(0xbf39, float:6.8598E-41)
            goto L147
        L153:
            r4 = -1
            if (r5 != r4) goto L14f
            r4 = 49635(0xc1e3, float:6.9553E-41)
            goto L147
        L15a:
            androidx.drawerlayout.C1077.m1331(r2)     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            r4 = 49666(0xc202, float:6.9597E-41)
        L160:
            r5 = 49683(0xc213, float:6.9621E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L168;
                case 50: goto L16e;
                case 76: goto L172;
                case 83: goto L180;
                default: goto L167;
            }
        L167:
            goto L160
        L168:
            if (r2 == 0) goto L16e
            r4 = 49759(0xc25f, float:6.9727E-41)
            goto L160
        L16e:
            r4 = 49728(0xc240, float:6.9684E-41)
            goto L160
        L172:
            androidx.lifecycle.process.C1091.m2267(r2)     // Catch: java.lang.Throwable -> L195
        L175:
            r2 = 49790(0xc27e, float:6.977E-41)
        L178:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 18: goto L180;
                case 241: goto L191;
                default: goto L17f;
            }
        L17f:
            goto L178
        L180:
            r2 = 50689(0xc601, float:7.103E-41)
        L183:
            r4 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 19: goto L18b;
                case 45: goto L1b7;
                case 50: goto L1a5;
                case 76: goto L1a9;
                default: goto L18a;
            }
        L18a:
            goto L183
        L18b:
            if (r3 == 0) goto L1a5
            r2 = 50782(0xc65e, float:7.1161E-41)
            goto L183
        L191:
            r2 = 49821(0xc29d, float:6.9814E-41)
            goto L178
        L195:
            r2 = move-exception
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L199:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 497: goto L1a1;
                case 1711: goto L175;
                default: goto L1a0;
            }
        L1a0:
            goto L199
        L1a1:
            r2 = 50596(0xc5a4, float:7.09E-41)
            goto L199
        L1a5:
            r2 = 50751(0xc63f, float:7.1117E-41)
            goto L183
        L1a9:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L1cd
        L1ac:
            r2 = 50813(0xc67d, float:7.1204E-41)
        L1af:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L1b7;
                case 243: goto L1c9;
                default: goto L1b6;
            }
        L1b6:
            goto L1af
        L1b7:
            m8186(r8)
            r2 = 51712(0xca00, float:7.2464E-41)
        L1bd:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1c5;
                case 17: goto L1dd;
                case 47: goto L1e7;
                case 76: goto L1e3;
                default: goto L1c4;
            }
        L1c4:
            goto L1bd
        L1c5:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L1bd
        L1c9:
            r2 = 50844(0xc69c, float:7.1248E-41)
            goto L1af
        L1cd:
            r2 = move-exception
            r2 = 51588(0xc984, float:7.229E-41)
        L1d1:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L1d9;
                case 54: goto L1ac;
                default: goto L1d8;
            }
        L1d8:
            goto L1d1
        L1d9:
            r2 = 51619(0xc9a3, float:7.2334E-41)
            goto L1d1
        L1dd:
            if (r19 == 0) goto L1c5
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L1bd
        L1e3:
            r2 = 0
            r3 = 0
            r19[r2] = r3
        L1e7:
            return
        L1e8:
            r4 = move-exception
            r5 = 51836(0xca7c, float:7.2638E-41)
        L1ec:
            r6 = 51853(0xca8d, float:7.2662E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 241: goto L1f4;
                case 1963: goto L2f3;
                default: goto L1f3;
            }
        L1f3:
            goto L1ec
        L1f4:
            r5 = 52518(0xcd26, float:7.3593E-41)
            goto L1ec
        L1f8:
            r5 = move-exception
            r4 = 52611(0xcd83, float:7.3724E-41)
        L1fc:
            r6 = 52628(0xcd94, float:7.3748E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 23: goto L204;
                case 54: goto L2f1;
                default: goto L203;
            }
        L203:
            goto L1fc
        L204:
            r4 = 52642(0xcda2, float:7.3767E-41)
            goto L1fc
        L208:
            r4 = 52735(0xcdff, float:7.3897E-41)
        L20b:
            r12 = 52752(0xce10, float:7.3921E-41)
            r4 = r4 ^ r12
            switch(r4) {
                case 14: goto L213;
                case 45: goto L276;
                case 1007: goto L217;
                case 7927: goto L21d;
                default: goto L212;
            }
        L212:
            goto L20b
        L213:
            r4 = 52797(0xce3d, float:7.3984E-41)
            goto L20b
        L217:
            if (r19 == 0) goto L213
            r4 = 53479(0xd0e7, float:7.494E-41)
            goto L20b
        L21d:
            r4 = 0
            r12 = r19[r4]     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            r4 = 53510(0xd106, float:7.4983E-41)
        L223:
            r13 = 53527(0xd117, float:7.5007E-41)
            r4 = r4 ^ r13
            switch(r4) {
                case 17: goto L22b;
                case 50: goto L231;
                case 83: goto L276;
                case 116: goto L235;
                default: goto L22a;
            }     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
        L22a:
            goto L223
        L22b:
            if (r12 == 0) goto L231
            r4 = 53603(0xd163, float:7.5114E-41)
            goto L223
        L231:
            r4 = 53572(0xd144, float:7.507E-41)
            goto L223
        L235:
            r4 = 0
            r4 = r19[r4]     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            boolean r12 = m8217(r4)     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            r4 = 53634(0xd182, float:7.5157E-41)
        L23f:
            r13 = 53651(0xd193, float:7.5181E-41)
            r4 = r4 ^ r13
            switch(r4) {
                case 17: goto L247;
                case 50: goto L24d;
                case 76: goto L251;
                case 83: goto L260;
                default: goto L246;
            }     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
        L246:
            goto L23f
        L247:
            if (r12 != 0) goto L24d
            r4 = 53727(0xd1df, float:7.5288E-41)
            goto L23f
        L24d:
            r4 = 53696(0xd1c0, float:7.5244E-41)
            goto L23f
        L251:
            r4 = 53758(0xd1fe, float:7.5331E-41)
        L254:
            r12 = 53775(0xd20f, float:7.5355E-41)
            r4 = r4 ^ r12
            switch(r4) {
                case 1009: goto L25c;
                case 1703: goto L276;
                default: goto L25b;
            }     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
        L25b:
            goto L254
        L25c:
            r4 = 54440(0xd4a8, float:7.6287E-41)
            goto L254
        L260:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            short[] r5 = m8183()     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            r6 = 510(0x1fe, float:7.15E-43)
            int r7 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            r7 = r7 ^ (-638(0xfffffffffffffd82, float:NaN))
            r9 = 1038(0x40e, float:1.455E-42)
            java.lang.String r5 = androidx.lifecycle.process.C1090.m2213(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
            throw r4     // Catch: java.lang.Throwable -> L1e8 java.io.InterruptedIOException -> L1f8
        L276:
            r4 = 0
            androidx.activity.C1063.m286(r2, r9, r4, r5)     // Catch: java.io.InterruptedIOException -> L3d6 java.lang.Throwable -> L3d9
            long r4 = (long) r5
            long r4 = r4 + r6
            r6 = 54533(0xd505, float:7.6417E-41)
        L27f:
            r7 = 54550(0xd516, float:7.6441E-41)
            r6 = r6 ^ r7
            switch(r6) {
                case 19: goto L287;
                case 50: goto L28d;
                case 85: goto L296;
                case 116: goto L291;
                default: goto L286;
            }
        L286:
            goto L27f
        L287:
            if (r18 == 0) goto L28d
            r6 = 54626(0xd562, float:7.6547E-41)
            goto L27f
        L28d:
            r6 = 54595(0xd543, float:7.6504E-41)
            goto L27f
        L291:
            r0 = r18
            androidx.lifecycle.process.C1090.m2173(r0, r4, r10)     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
        L296:
            r6 = 54657(0xd581, float:7.6591E-41)
        L299:
            r7 = 54674(0xd592, float:7.6615E-41)
            r6 = r6 ^ r7
            switch(r6) {
                case 19: goto L2a1;
                case 50: goto L2a5;
                default: goto L2a0;
            }     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
        L2a0:
            goto L299
        L2a1:
            r6 = 54688(0xd5a0, float:7.6634E-41)
            goto L299
        L2a5:
            r6 = r4
            goto L140
        L2a8:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
            short[] r5 = m8183()     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
            r6 = 528(0x210, float:7.4E-43)
            int r7 = androidx.documentfile.C1076.f102     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
            r7 = r7 ^ (-607(0xfffffffffffffda1, float:NaN))
            r9 = 469(0x1d5, float:6.57E-43)
            java.lang.String r5 = androidx.activity.C1065.m410(r5, r6, r7, r9)     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
            r4.<init>(r5)     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
            throw r4     // Catch: java.io.InterruptedIOException -> L2be java.lang.Throwable -> L2f2
        L2be:
            r5 = move-exception
            r4 = 55432(0xd888, float:7.7677E-41)
        L2c2:
            r6 = 55449(0xd899, float:7.77E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L2ca;
                case 62: goto L2f1;
                default: goto L2c9;
            }
        L2c9:
            goto L2c2
        L2ca:
            r4 = 55463(0xd8a7, float:7.772E-41)
            goto L2c2
        L2ce:
            r4 = move-exception
            r2 = r5
        L2d0:
            r5 = 55556(0xd904, float:7.785E-41)
        L2d3:
            r6 = 55573(0xd915, float:7.7874E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 17: goto L2db;
                case 54: goto L305;
                default: goto L2da;
            }
        L2da:
            goto L2d3
        L2db:
            r5 = 55587(0xd923, float:7.7894E-41)
            goto L2d3
        L2df:
            r4 = move-exception
            r2 = r6
        L2e1:
            r5 = 55680(0xd980, float:7.8024E-41)
        L2e4:
            r6 = 55697(0xd991, float:7.8048E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 17: goto L2ec;
                case 1467: goto L2f0;
                default: goto L2eb;
            }
        L2eb:
            goto L2e4
        L2ec:
            r5 = 56362(0xdc2a, float:7.898E-41)
            goto L2e4
        L2f0:
            r5 = r4
        L2f1:
            throw r5     // Catch: java.lang.Throwable -> L2f2
        L2f2:
            r4 = move-exception
        L2f3:
            r5 = 56579(0xdd03, float:7.9284E-41)
        L2f6:
            r6 = 56596(0xdd14, float:7.9308E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 23: goto L2fe;
                case 54: goto L318;
                case 85: goto L32a;
                case 1564036: goto L31c;
                default: goto L2fd;
            }
        L2fd:
            goto L2f6
        L2fe:
            if (r2 == 0) goto L318
            r5 = 1507472(0x170090, float:2.112418E-39)
            goto L2f6
        L304:
            r4 = move-exception
        L305:
            r5 = 56455(0xdc87, float:7.911E-41)
        L308:
            r6 = 56472(0xdc98, float:7.9134E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 31: goto L310;
                case 62: goto L2f3;
                default: goto L30f;
            }
        L30f:
            goto L308
        L310:
            r5 = 56486(0xdca6, float:7.9154E-41)
            goto L308
        L314:
            r5 = move-exception
            r3 = r7
        L316:
            r2 = r4
            goto L2f1
        L318:
            r5 = 56641(0xdd41, float:7.9371E-41)
            goto L2f6
        L31c:
            androidx.lifecycle.process.C1091.m2267(r2)     // Catch: java.lang.Throwable -> L33f
        L31f:
            r2 = 1507503(0x1700af, float:2.112462E-39)
        L322:
            r5 = 1507520(0x1700c0, float:2.112485E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L32a;
                case 111: goto L33b;
                default: goto L329;
            }
        L329:
            goto L322
        L32a:
            r2 = 1507751(0x1701a7, float:2.112809E-39)
        L32d:
            r5 = 1507768(0x1701b8, float:2.112833E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 31: goto L335;
                case 1335: goto L353;
                case 1480: goto L375;
                case 1513: goto L34f;
                default: goto L334;
            }
        L334:
            goto L32d
        L335:
            if (r3 == 0) goto L34f
            r2 = 1508495(0x17048f, float:2.113852E-39)
            goto L32d
        L33b:
            r2 = 1507534(0x1700ce, float:2.112505E-39)
            goto L322
        L33f:
            r2 = move-exception
            r2 = 1507627(0x17012b, float:2.112635E-39)
        L343:
            r5 = 1507644(0x17013c, float:2.112659E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 23: goto L34b;
                case 118: goto L31f;
                default: goto L34a;
            }
        L34a:
            goto L343
        L34b:
            r2 = 1507658(0x17014a, float:2.112679E-39)
            goto L343
        L34f:
            r2 = 1508464(0x170470, float:2.113808E-39)
            goto L32d
        L353:
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Throwable -> L365
        L356:
            r2 = 1508526(0x1704ae, float:2.113895E-39)
        L359:
            r3 = 1508543(0x1704bf, float:2.113919E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L361;
                case 114: goto L375;
                default: goto L360;
            }
        L360:
            goto L359
        L361:
            r2 = 1508557(0x1704cd, float:2.113939E-39)
            goto L359
        L365:
            r2 = move-exception
            r2 = 1508650(0x17052a, float:2.114069E-39)
        L369:
            r3 = 1508667(0x17053b, float:2.114093E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L371;
                case 114: goto L356;
                default: goto L370;
            }
        L370:
            goto L369
        L371:
            r2 = 1508681(0x170549, float:2.114112E-39)
            goto L369
        L375:
            m8186(r8)
            r2 = 1509425(0x170831, float:2.115155E-39)
        L37b:
            r3 = 1509442(0x170842, float:2.115179E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L383;
                case 45: goto L391;
                case 115: goto L387;
                case 204: goto L38d;
                default: goto L382;
            }
        L382:
            goto L37b
        L383:
            r2 = 1509487(0x17086f, float:2.115242E-39)
            goto L37b
        L387:
            if (r19 == 0) goto L383
            r2 = 1509518(0x17088e, float:2.115285E-39)
            goto L37b
        L38d:
            r2 = 0
            r3 = 0
            r19[r2] = r3
        L391:
            throw r4
        L392:
            java.io.IOException r2 = new java.io.IOException
            short[] r3 = m8183()
            r4 = 535(0x217, float:7.5E-43)
            int r5 = androidx.lifecycle.process.C1091.f117
            r5 = r5 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r6 = 1857(0x741, float:2.602E-42)
            java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r3, r4, r5, r6)
            r2.<init>(r3)
            throw r2
        L3a8:
            int r2 = m8179(r8)
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            short[] r5 = m8183()
            r6 = 549(0x225, float:7.7E-43)
            int r7 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r7 = r7 ^ (-128(0xffffffffffffff80, float:NaN))
            r8 = 3006(0xbbe, float:4.212E-42)
            java.lang.String r5 = androidx.emoji2.viewsintegration.C1078.m1413(r5, r6, r7, r8)
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r4, r2)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            r3.<init>(r2)
            throw r3
        L3d3:
            r5 = move-exception
            goto L316
        L3d6:
            r4 = move-exception
            goto L2e1
        L3d9:
            r4 = move-exception
            goto L2d0
    }

    private java.io.File downloadImageToTempFile(android.content.Context r10, java.lang.String r11) throws java.io.IOException {
            r9 = this;
            java.io.File r1 = new java.io.File
            java.io.File r0 = androidx.emoji2.viewsintegration.C1079.m1489(r10)
            short[] r2 = m8183()
            r3 = 554(0x22a, float:7.76E-43)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r4 = r4 ^ (-114(0xffffffffffffff8e, float:NaN))
            r5 = 2784(0xae0, float:3.901E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1079.m1457(r2, r3, r4, r5)
            r1.<init>(r0, r2)
            boolean r2 = androidx.vectordrawable.C1105.m3294(r1)
            r0 = 1616(0x650, float:2.264E-42)
        L1f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L25;
                case 49: goto L28;
                case 204: goto L2d;
                case 239: goto L63;
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
            boolean r2 = androidx.lifecycle.process.C1090.m2220(r1)
            r0 = 1740(0x6cc, float:2.438E-42)
        L33:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L39;
                case 54: goto L3e;
                case 471: goto L4d;
                case 500: goto L41;
                default: goto L38;
            }
        L38:
            goto L33
        L39:
            if (r2 == 0) goto L3e
            r0 = 1833(0x729, float:2.569E-42)
            goto L33
        L3e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L33
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L63;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
        L4d:
            java.io.IOException r0 = new java.io.IOException
            short[] r1 = m8183()
            r2 = 565(0x235, float:7.92E-43)
            int r3 = androidx.emoji2.viewsintegration.C1079.f105
            r3 = r3 ^ (-103(0xffffffffffffff99, float:NaN))
            r4 = 2852(0xb24, float:3.997E-42)
            java.lang.String r1 = androidx.loader.C1098.m2787(r1, r2, r3, r4)
            r0.<init>(r1)
            throw r0
        L63:
            long r2 = androidx.lifecycle.process.C1089.m2100()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            short[] r5 = m8183()
            r6 = 573(0x23d, float:8.03E-43)
            int r7 = kevin.fun.hook.audio.C1114.f403
            r7 = r7 ^ (-25)
            r8 = 2138(0x85a, float:2.996E-42)
            java.lang.String r5 = androidx.annotation.experimental.C1067.m581(r5, r6, r7, r8)
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.StringBuilder r2 = androidx.loader.C1097.m2720(r4, r2)
            short[] r3 = m8183()
            r4 = 584(0x248, float:8.18E-43)
            int r5 = androidx.core.C1073.f99
            r5 = r5 ^ 443(0x1bb, float:6.21E-43)
            r6 = 3145(0xc49, float:4.407E-42)
            java.lang.String r3 = androidx.interpolator.C1082.m1694(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            r0.<init>(r1, r2)
            m8182(r9, r11, r0)
            return r0
    }

    private void downloadLivePhoto(android.content.Context r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, java.lang.String r20) {
            r14 = this;
            short[] r2 = m8183()
            r3 = 588(0x24c, float:8.24E-43)
            int r4 = androidx.versionedparcelable.C1106.f132
            r4 = r4 ^ 149(0x95, float:2.09E-43)
            r5 = 2099(0x833, float:2.941E-42)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r3, r4, r5)
            r3 = 0
            boolean r11 = kevin.fun.hook.audio.C1114.m7905(r2, r3)
            short[] r2 = m8183()
            r3 = 613(0x265, float:8.59E-43)
            int r4 = androidx.vectordrawable.animated.C1102.f128
            r4 = r4 ^ 218(0xda, float:3.05E-43)
            r5 = 1575(0x627, float:2.207E-42)
            java.lang.String r2 = androidx.vectordrawable.animated.C1102.m3116(r2, r3, r4, r5)
            r3 = 0
            boolean r12 = kevin.fun.hook.audio.C1114.m7905(r2, r3)
            r5 = r18 ^ 1
            r2 = 1
            r3 = 1616(0x650, float:2.264E-42)
        L2f:
            r3 = r3 ^ 1633(0x661, float:2.288E-42)
            switch(r3) {
                case 14: goto L35;
                case 49: goto L38;
                case 204: goto L3d;
                case 239: goto L43;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            r3 = 1678(0x68e, float:2.351E-42)
            goto L2f
        L38:
            if (r11 == 0) goto L35
            r3 = 1709(0x6ad, float:2.395E-42)
            goto L2f
        L3d:
            int r2 = com.tencent.mmkv.C1109.f135
            r2 = r2 ^ (-487(0xfffffffffffffe19, float:NaN))
            int r2 = r2 + 1
        L43:
            r3 = 1740(0x6cc, float:2.438E-42)
        L45:
            r3 = r3 ^ 1757(0x6dd, float:2.462E-42)
            switch(r3) {
                case 17: goto L4b;
                case 54: goto L50;
                case 471: goto L58;
                case 500: goto L53;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            if (r12 == 0) goto L50
            r3 = 1833(0x729, float:2.569E-42)
            goto L45
        L50:
            r3 = 1802(0x70a, float:2.525E-42)
            goto L45
        L53:
            int r3 = androidx.core.ktx.C1071.f97
            r3 = r3 ^ 899(0x383, float:1.26E-42)
            int r2 = r2 + r3
        L58:
            r3 = 1864(0x748, float:2.612E-42)
        L5a:
            r3 = r3 ^ 1881(0x759, float:2.636E-42)
            switch(r3) {
                case 17: goto L60;
                case 47384: goto Lca;
                case 47417: goto L6a;
                case 47483: goto L66;
                default: goto L5f;
            }
        L5f:
            goto L5a
        L60:
            if (r5 == 0) goto L66
            r3 = 48736(0xbe60, float:6.8294E-41)
            goto L5a
        L66:
            r3 = 48705(0xbe41, float:6.825E-41)
            goto L5a
        L6a:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r3 = m8177(r14)
            boolean r4 = androidx.vectordrawable.animated.C1102.m3111(r3)
            r3 = 48767(0xbe7f, float:6.8337E-41)
        L75:
            r6 = 48784(0xbe90, float:6.8361E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 14: goto L7d;
                case 45: goto Lca;
                case 76: goto L87;
                case 239: goto L81;
                default: goto L7c;
            }
        L7c:
            goto L75
        L7d:
            r3 = 48829(0xbebd, float:6.8424E-41)
            goto L75
        L81:
            if (r4 != 0) goto L7d
            r3 = 48860(0xbedc, float:6.8467E-41)
            goto L75
        L87:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r3 = m8177(r14)
            org.luckypray.dexkit.C1123.m10519(r3, r2)
            r2 = 48891(0xbefb, float:6.8511E-41)
        L91:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto L99;
                case 503: goto Lc6;
                default: goto L98;
            }
        L98:
            goto L91
        L99:
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r4.<init>(r2)
            java.util.concurrent.ExecutorService r13 = m8239()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda0 r2 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda0
            r3 = r14
            r6 = r19
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.activity.C1063.m244(r13, r2)
            r2 = 50689(0xc601, float:7.103E-41)
        Lb8:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto Lc0;
                case 45: goto L140;
                case 50: goto L121;
                case 76: goto L125;
                default: goto Lbf;
            }
        Lbf:
            goto Lb8
        Lc0:
            if (r11 == 0) goto L121
            r2 = 50782(0xc65e, float:7.1161E-41)
            goto Lb8
        Lc6:
            r2 = 48922(0xbf1a, float:6.8554E-41)
            goto L91
        Lca:
            r3 = 49666(0xc202, float:6.9597E-41)
        Lcd:
            r4 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto Ld5;
                case 50: goto Ldb;
                case 76: goto Ldf;
                case 83: goto L99;
                default: goto Ld4;
            }
        Ld4:
            goto Lcd
        Ld5:
            if (r5 != 0) goto Ldb
            r3 = 49759(0xc25f, float:6.9727E-41)
            goto Lcd
        Ldb:
            r3 = 49728(0xc240, float:6.9684E-41)
            goto Lcd
        Ldf:
            r3 = 49790(0xc27e, float:6.977E-41)
        Le2:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto Lea;
                case 51: goto L99;
                case 84: goto Lf4;
                case 241: goto Lee;
                default: goto Le9;
            }
        Le9:
            goto Le2
        Lea:
            r3 = 49852(0xc2bc, float:6.9858E-41)
            goto Le2
        Lee:
            if (r18 == 0) goto Lea
            r3 = 49883(0xc2db, float:6.9901E-41)
            goto Le2
        Lf4:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r3 = m8177(r14)
            org.luckypray.dexkit.C1123.m10519(r3, r2)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r3 = m8177(r14)
            short[] r4 = m8183()
            r6 = 638(0x27e, float:8.94E-43)
            int r7 = androidx.core.ktx.C1070.f96
            r7 = r7 ^ 550(0x226, float:7.71E-43)
            r8 = 1686(0x696, float:2.363E-42)
            java.lang.String r4 = androidx.appcompat.resources.C1068.m652(r4, r6, r7, r8)
            androidx.viewpager.C1108.m3526(r3, r15, r2, r4)
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L115:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 497: goto L11d;
                case 1711: goto L99;
                default: goto L11c;
            }
        L11c:
            goto L115
        L11d:
            r2 = 50596(0xc5a4, float:7.09E-41)
            goto L115
        L121:
            r2 = 50751(0xc63f, float:7.1117E-41)
            goto Lb8
        L125:
            java.util.concurrent.ExecutorService r2 = m8239()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda8 r3 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda8
            r0 = r19
            r1 = r17
            r3.<init>(r14, r0, r15, r1)
            androidx.activity.C1063.m244(r2, r3)
            r2 = 50813(0xc67d, float:7.1204E-41)
        L138:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L140;
                case 243: goto L151;
                default: goto L13f;
            }
        L13f:
            goto L138
        L140:
            r2 = 51588(0xc984, float:7.229E-41)
        L143:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L14b;
                case 54: goto L155;
                case 87: goto L174;
                case 116: goto L159;
                default: goto L14a;
            }
        L14a:
            goto L143
        L14b:
            if (r12 == 0) goto L155
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L143
        L151:
            r2 = 50844(0xc69c, float:7.1248E-41)
            goto L138
        L155:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L143
        L159:
            java.util.concurrent.ExecutorService r2 = m8239()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda9 r3 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda9
            r0 = r19
            r1 = r16
            r3.<init>(r14, r0, r15, r1)
            androidx.activity.C1063.m244(r2, r3)
            r2 = 51712(0xca00, float:7.2464E-41)
        L16c:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L174;
                case 15: goto L173;
                case 16: goto L173;
                case 17: goto L189;
                default: goto L173;
            }
        L173:
            goto L16c
        L174:
            int r3 = androidx.loader.C1095.m2562()
            r2 = 51836(0xca7c, float:7.2638E-41)
        L17b:
            r4 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 241: goto L183;
                case 1963: goto L18d;
                case 1992: goto L1a0;
                case 2025: goto L191;
                default: goto L182;
            }
        L182:
            goto L17b
        L183:
            if (r3 > 0) goto L18d
            r2 = 52580(0xcd64, float:7.368E-41)
            goto L17b
        L189:
            r2 = 51743(0xca1f, float:7.2507E-41)
            goto L16c
        L18d:
            r2 = 52549(0xcd45, float:7.3637E-41)
            goto L17b
        L191:
            java.lang.String r2 = "dbz"
            java.lang.String r2 = androidx.lifecycle.process.C1091.m2259(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
        L1a0:
            return
    }

    /* JADX INFO: renamed from: dp */
    private int m100dp(android.content.Context r3, float r4) {
            r2 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L15;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r3 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r4
            int r0 = (int) r0
        L14:
            return r0
        L15:
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r3)
            android.util.DisplayMetrics r0 = androidx.activity.C1062.m159(r0)
            float r0 = androidx.vectordrawable.animated.C1102.m3118(r0)
            float r0 = r0 * r4
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            goto L14
    }

    private java.io.File findOutputFileFromCache(java.lang.String r15, long r16) {
            r14 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lcf
            r0.<init>(r15)     // Catch: java.lang.Throwable -> Lcf
            java.io.File[] r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3644(r0)     // Catch: java.lang.Throwable -> Lcf
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L1b;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> Lcf
        L10:
            goto Lb
        L11:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lb
        L14:
            if (r3 != 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            long r4 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Throwable -> Lcf
            int r6 = r3.length     // Catch: java.lang.Throwable -> Lcf
            r0 = 0
        L21:
            r1 = 1740(0x6cc, float:2.438E-42)
        L23:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L3d;
                case 500: goto L31;
                default: goto L28;
            }     // Catch: java.lang.Throwable -> Lcf
        L28:
            goto L23
        L29:
            if (r0 < r6) goto L2e
            r1 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            r0 = 1864(0x748, float:2.612E-42)
        L33:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L39;
                case 47483: goto Lf8;
                default: goto L38;
            }     // Catch: java.lang.Throwable -> Lcf
        L38:
            goto L33
        L39:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L33
        L3d:
            r1 = r3[r0]     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = androidx.loader.C1099.m2847(r1)     // Catch: java.lang.Throwable -> Lcf
            short[] r7 = m8183()     // Catch: java.lang.Throwable -> Lcf
            r8 = 646(0x286, float:9.05E-43)
            int r9 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> Lcf
            r9 = r9 ^ (-533(0xfffffffffffffdeb, float:NaN))
            r10 = 2390(0x956, float:3.349E-42)
            java.lang.String r7 = androidx.loader.C1095.m2574(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcf
            boolean r7 = androidx.core.C1073.m1059(r2, r7)     // Catch: java.lang.Throwable -> Lcf
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L5a:
            r8 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 14: goto L62;
                case 45: goto Lbb;
                case 76: goto L6c;
                case 239: goto L66;
                default: goto L61;
            }     // Catch: java.lang.Throwable -> Lcf
        L61:
            goto L5a
        L62:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L5a
        L66:
            if (r7 == 0) goto L62
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L5a
        L6c:
            java.lang.String r2 = androidx.loader.C1099.m2847(r1)     // Catch: java.lang.Throwable -> Lcf
            short[] r7 = m8183()     // Catch: java.lang.Throwable -> Lcf
            r8 = 657(0x291, float:9.2E-43)
            int r9 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> Lcf
            r9 = r9 ^ (-496(0xfffffffffffffe10, float:NaN))
            r10 = 3273(0xcc9, float:4.586E-42)
            java.lang.String r7 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcf
            boolean r7 = androidx.activity.C1064.m311(r2, r7)     // Catch: java.lang.Throwable -> Lcf
            r2 = 48891(0xbefb, float:6.8511E-41)
        L87:
            r8 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 22: goto L8f;
                case 53: goto Lbb;
                case 503: goto L93;
                case 32495: goto L99;
                default: goto L8e;
            }     // Catch: java.lang.Throwable -> Lcf
        L8e:
            goto L87
        L8f:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L87
        L93:
            if (r7 == 0) goto L8f
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L87
        L99:
            long r8 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3810(r1)     // Catch: java.lang.Throwable -> Lcf
            r2 = 49666(0xc202, float:6.9597E-41)
        La0:
            r7 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 17: goto La8;
                case 50: goto Lb4;
                case 76: goto Lb8;
                case 83: goto Lbb;
                default: goto La7;
            }
        La7:
            goto La0
        La8:
            long r10 = r4 - r8
            r12 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto Lb4
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto La0
        Lb4:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto La0
        Lb8:
            r0 = r1
            goto L1a
        Lbb:
            int r1 = androidx.versionedparcelable.C1106.f132
            r1 = r1 ^ 141(0x8d, float:1.98E-43)
            int r0 = r0 + r1
            r1 = 49790(0xc27e, float:6.977E-41)
        Lc3:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L21;
                case 241: goto Lcb;
                default: goto Lca;
            }
        Lca:
            goto Lc3
        Lcb:
            r1 = 49821(0xc29d, float:6.9814E-41)
            goto Lc3
        Lcf:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8183()
            r3 = 661(0x295, float:9.26E-43)
            int r4 = androidx.emoji2.viewsintegration.C1079.f105
            r4 = r4 ^ (-118(0xffffffffffffff8a, float:NaN))
            r5 = 1814(0x716, float:2.542E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8215(r0)
        Lf8:
            r0 = 0
            goto L1a
    }

    private void findProgressViews(android.view.View r7, android.widget.TextView[] r8, android.widget.ProgressBar[] r9, android.widget.TextView[] r10) {
            r6 = this;
            r1 = 0
            boolean r2 = r7 instanceof android.widget.TextView
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L133;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r2 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = androidx.documentfile.C1076.m1260(r0)
            java.lang.String r2 = androidx.loader.C1095.m2551(r0)
            short[] r0 = m8183()
            r3 = 688(0x2b0, float:9.64E-43)
            int r4 = androidx.activity.C1062.f88
            r4 = r4 ^ (-79)
            r5 = 713(0x2c9, float:9.99E-43)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r3, r4, r5)
            boolean r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3718(r2, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L34:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3a;
                case 54: goto L3f;
                case 471: goto L88;
                case 500: goto L42;
                default: goto L39;
            }
        L39:
            goto L34
        L3a:
            if (r3 == 0) goto L3f
            r0 = 1833(0x729, float:2.569E-42)
            goto L34
        L3f:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L34
        L42:
            r3 = r8[r1]
            r0 = 1864(0x748, float:2.612E-42)
        L46:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4c;
                case 47384: goto L88;
                case 47417: goto L56;
                case 47483: goto L52;
                default: goto L4b;
            }
        L4b:
            goto L46
        L4c:
            if (r3 != 0) goto L52
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L46
        L52:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L46
        L56:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8[r1] = r0
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L5e:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L66;
                case 239: goto L84;
                default: goto L65;
            }
        L65:
            goto L5e
        L66:
            r0 = 50813(0xc67d, float:7.1204E-41)
        L69:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L71;
                case 243: goto L12e;
                default: goto L70;
            }
        L70:
            goto L69
        L71:
            boolean r2 = r7 instanceof android.view.ViewGroup
            r0 = 52611(0xcd83, float:7.3724E-41)
        L76:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 23: goto L7e;
                case 54: goto L175;
                case 85: goto L1c0;
                case 116: goto L17a;
                default: goto L7d;
            }
        L7d:
            goto L76
        L7e:
            if (r2 == 0) goto L175
            r0 = 52704(0xcde0, float:7.3854E-41)
            goto L76
        L84:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L5e
        L88:
            short[] r0 = m8183()
            r3 = 692(0x2b4, float:9.7E-43)
            int r4 = androidx.lifecycle.process.C1087.f113
            r4 = r4 ^ (-622(0xfffffffffffffd92, float:NaN))
            r5 = 2396(0x95c, float:3.358E-42)
            java.lang.String r0 = androidx.appcompat.C1069.m751(r0, r3, r4, r5)
            boolean r3 = androidx.emoji2.C1080.m1554(r2, r0)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L9f:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 22: goto La7;
                case 53: goto L103;
                case 503: goto Lab;
                case 32495: goto Lb1;
                default: goto La6;
            }
        La6:
            goto L9f
        La7:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L9f
        Lab:
            if (r3 != 0) goto La7
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L9f
        Lb1:
            short[] r0 = m8183()
            r3 = 694(0x2b6, float:9.73E-43)
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ 17
            r5 = 3049(0xbe9, float:4.273E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r3, r4, r5)
            boolean r3 = androidx.emoji2.C1080.m1554(r2, r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        Lc8:
            r4 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto Ld0;
                case 50: goto Ld6;
                case 76: goto Lda;
                case 83: goto L103;
                default: goto Lcf;
            }
        Lcf:
            goto Lc8
        Ld0:
            if (r3 != 0) goto Ld6
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lc8
        Ld6:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lc8
        Lda:
            short[] r0 = m8183()
            r3 = 696(0x2b8, float:9.75E-43)
            int r4 = androidx.interpolator.C1083.f109
            r4 = r4 ^ (-447(0xfffffffffffffe41, float:NaN))
            r5 = 1079(0x437, float:1.512E-42)
            java.lang.String r0 = androidx.interpolator.C1082.m1694(r0, r3, r4, r5)
            boolean r2 = androidx.emoji2.C1080.m1554(r2, r0)
            r0 = 49790(0xc27e, float:6.977E-41)
        Lf1:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 18: goto Lf9;
                case 51: goto L66;
                case 84: goto L103;
                case 241: goto Lfd;
                default: goto Lf8;
            }
        Lf8:
            goto Lf1
        Lf9:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lf1
        Lfd:
            if (r2 == 0) goto Lf9
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lf1
        L103:
            r2 = r10[r1]
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L108:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 497: goto L110;
                case 1711: goto L116;
                case 1736: goto L66;
                case 1769: goto L11a;
                default: goto L10f;
            }
        L10f:
            goto L108
        L110:
            if (r2 != 0) goto L116
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L108
        L116:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L108
        L11a:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10[r1] = r0
            r0 = 50689(0xc601, float:7.103E-41)
        L122:
            r2 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 19: goto L12a;
                case 50: goto L71;
                default: goto L129;
            }
        L129:
            goto L122
        L12a:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L122
        L12e:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L69
        L133:
            boolean r2 = r7 instanceof android.widget.ProgressBar
            r0 = 51588(0xc984, float:7.229E-41)
        L138:
            r3 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L140;
                case 54: goto L146;
                case 87: goto L71;
                case 116: goto L14a;
                default: goto L13f;
            }
        L13f:
            goto L138
        L140:
            if (r2 == 0) goto L146
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L138
        L146:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L138
        L14a:
            r2 = r9[r1]
            r0 = 51712(0xca00, float:7.2464E-41)
        L14f:
            r3 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L157;
                case 17: goto L15b;
                case 47: goto L71;
                case 76: goto L161;
                default: goto L156;
            }
        L156:
            goto L14f
        L157:
            r0 = 51774(0xca3e, float:7.2551E-41)
            goto L14f
        L15b:
            if (r2 != 0) goto L157
            r0 = 51805(0xca5d, float:7.2594E-41)
            goto L14f
        L161:
            r0 = r7
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9[r1] = r0
            r0 = 51836(0xca7c, float:7.2638E-41)
        L169:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 241: goto L171;
                case 1963: goto L71;
                default: goto L170;
            }
        L170:
            goto L169
        L171:
            r0 = 52518(0xcd26, float:7.3593E-41)
            goto L169
        L175:
            r0 = 52673(0xcdc1, float:7.381E-41)
            goto L76
        L17a:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = r1
        L17d:
            int r2 = androidx.loader.C1095.m2579(r7)
            r1 = 52735(0xcdff, float:7.3897E-41)
        L184:
            r3 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L18c;
                case 45: goto L1a5;
                case 1007: goto L190;
                case 7927: goto L196;
                default: goto L18b;
            }
        L18b:
            goto L184
        L18c:
            r1 = 52797(0xce3d, float:7.3984E-41)
            goto L184
        L190:
            if (r0 < r2) goto L18c
            r1 = 53479(0xd0e7, float:7.494E-41)
            goto L184
        L196:
            r0 = 53510(0xd106, float:7.4983E-41)
        L199:
            r1 = 53527(0xd117, float:7.5007E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L1a1;
                case 50: goto L1c0;
                default: goto L1a0;
            }
        L1a0:
            goto L199
        L1a1:
            r0 = 53541(0xd125, float:7.5027E-41)
            goto L199
        L1a5:
            android.view.View r1 = androidx.loader.C1096.m2666(r7, r0)
            m8194(r6, r1, r8, r9, r10)
            int r1 = androidx.drawerlayout.C1077.f103
            r1 = r1 ^ 287(0x11f, float:4.02E-43)
            int r0 = r0 + r1
            r1 = 53634(0xd182, float:7.5157E-41)
        L1b4:
            r2 = 53651(0xd193, float:7.5181E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L1bc;
                case 50: goto L17d;
                default: goto L1bb;
            }
        L1bb:
            goto L1b4
        L1bc:
            r1 = 53665(0xd1a1, float:7.52E-41)
            goto L1b4
        L1c0:
            int r1 = androidx.interpolator.C1083.m1725()
            r0 = 53758(0xd1fe, float:7.5331E-41)
        L1c7:
            r2 = 53775(0xd20f, float:7.5355E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 1009: goto L1cf;
                case 1703: goto L1d5;
                case 1736: goto L1e8;
                case 1769: goto L1d9;
                default: goto L1ce;
            }
        L1ce:
            goto L1c7
        L1cf:
            if (r1 < 0) goto L1d5
            r0 = 54502(0xd4e6, float:7.6374E-41)
            goto L1c7
        L1d5:
            r0 = 54471(0xd4c7, float:7.633E-41)
            goto L1c7
        L1d9:
            java.lang.String r0 = "2SVDciCwgA52BGyMxixun"
            java.lang.String r0 = androidx.loader.C1099.m2832(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L1e8:
            return
    }

    private java.lang.String generateFileName(java.lang.String r20, boolean r21, java.lang.String r22) {
            r19 = this;
            short[] r2 = m8183()
            r3 = 699(0x2bb, float:9.8E-43)
            int r4 = androidx.customview.C1074.f100
            r4 = r4 ^ 227(0xe3, float:3.18E-43)
            r5 = 2331(0x91b, float:3.266E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r3, r4, r5)
            short[] r3 = m8183()
            r4 = 715(0x2cb, float:1.002E-42)
            int r5 = androidx.lifecycle.viewmodel.C1093.f119
            r5 = r5 ^ (-104(0xffffffffffffff98, float:NaN))
            r6 = 485(0x1e5, float:6.8E-43)
            java.lang.String r3 = androidx.loader.C1099.m2843(r3, r4, r5, r6)
            java.lang.String r6 = androidx.interpolator.C1081.m1642(r2, r3)
            java.util.Locale r2 = androidx.activity.C1064.m382()
            short[] r3 = m8183()
            r4 = 733(0x2dd, float:1.027E-42)
            int r5 = kevin.fun.hook.webdav.C1118.f417
            r5 = r5 ^ (-358(0xfffffffffffffe9a, float:NaN))
            r7 = 2349(0x92d, float:3.292E-42)
            java.lang.String r7 = androidx.startup.C1101.m3014(r3, r4, r5, r7)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r7, r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r8 = androidx.appcompat.resources.C1068.m657(r3, r2)
            short[] r2 = m8183()
            r3 = 748(0x2ec, float:1.048E-42)
            int r4 = org.luckypray.dexkit.C1123.f433
            r4 = r4 ^ (-961(0xfffffffffffffc3f, float:NaN))
            r5 = 1847(0x737, float:2.588E-42)
            java.lang.String r9 = kevin.fun.hook.audio.C1114.m7940(r2, r3, r4, r5)
            short[] r2 = m8183()
            r3 = 754(0x2f2, float:1.057E-42)
            int r4 = androidx.interpolator.C1081.f107
            r4 = r4 ^ (-271(0xfffffffffffffef1, float:NaN))
            r5 = 1304(0x518, float:1.827E-42)
            java.lang.String r10 = androidx.startup.C1101.m3014(r2, r3, r4, r5)
            short[] r2 = m8183()
            r3 = 760(0x2f8, float:1.065E-42)
            int r4 = androidx.versionedparcelable.C1107.f133
            r4 = r4 ^ 640(0x280, float:8.97E-43)
            r5 = 3213(0xc8d, float:4.502E-42)
            java.lang.String r11 = androidx.loader.C1095.m2574(r2, r3, r4, r5)
            short[] r2 = m8183()
            r3 = 764(0x2fc, float:1.07E-42)
            int r4 = androidx.loader.C1098.f124
            r4 = r4 ^ (-805(0xfffffffffffffcdb, float:NaN))
            r5 = 3086(0xc0e, float:4.324E-42)
            java.lang.String r12 = androidx.interpolator.C1083.m1723(r2, r3, r4, r5)
            short[] r2 = m8183()
            r3 = 770(0x302, float:1.079E-42)
            int r4 = androidx.lifecycle.viewmodel.C1093.f119
            r4 = r4 ^ (-115(0xffffffffffffff8d, float:NaN))
            r5 = 1414(0x586, float:1.981E-42)
            java.lang.String r13 = androidx.appcompat.C1069.m751(r2, r3, r4, r5)
            short[] r2 = m8183()
            r3 = 777(0x309, float:1.089E-42)
            int r4 = androidx.vectordrawable.C1105.f131
            r4 = r4 ^ 355(0x163, float:4.97E-43)
            r5 = 1219(0x4c3, float:1.708E-42)
            java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r2, r3, r4, r5)
            short[] r2 = m8183()
            r4 = 782(0x30e, float:1.096E-42)
            int r5 = kevin.fun.hook.C1120.f419
            r5 = r5 ^ (-450(0xfffffffffffffe3e, float:NaN))
            r14 = 2586(0xa1a, float:3.624E-42)
            java.lang.String r14 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r2, r4, r5, r14)
            short[] r2 = m8183()
            r4 = 787(0x313, float:1.103E-42)
            int r5 = androidx.activity.C1062.f88
            r5 = r5 ^ (-79)
            r15 = 1875(0x753, float:2.627E-42)
            java.lang.String r2 = androidx.core.ktx.C1070.m788(r2, r4, r5, r15)
            short[] r4 = m8183()
            r5 = 791(0x317, float:1.108E-42)
            int r15 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r15 = r15 ^ (-128(0xffffffffffffff80, float:NaN))
            r16 = 855(0x357, float:1.198E-42)
            r0 = r16
            java.lang.String r15 = kevin.fun.hook.audio.C1117.m8169(r4, r5, r15, r0)
            short[] r4 = m8183()
            r5 = 796(0x31c, float:1.115E-42)
            int r16 = androidx.loader.C1096.f122
            r0 = r16
            r0 = r0 ^ (-958(0xfffffffffffffc42, float:NaN))
            r16 = r0
            r17 = 1704(0x6a8, float:2.388E-42)
            r0 = r16
            r1 = r17
            java.lang.String r16 = androidx.core.C1072.m957(r4, r5, r0, r1)
            java.lang.String r4 = androidx.emoji2.C1080.m1562()
            r5 = 1616(0x650, float:2.264E-42)
        Lf6:
            r5 = r5 ^ 1633(0x661, float:2.288E-42)
            switch(r5) {
                case 14: goto Lfc;
                case 49: goto Lff;
                case 204: goto L104;
                case 239: goto L2cc;
                default: goto Lfb;
            }
        Lfb:
            goto Lf6
        Lfc:
            r5 = 1678(0x68e, float:2.351E-42)
            goto Lf6
        Lff:
            if (r21 == 0) goto Lfc
            r5 = 1709(0x6ad, float:2.395E-42)
            goto Lf6
        L104:
            java.lang.String r5 = m8233(r19)
            boolean r17 = androidx.activity.C1066.m488(r5)
            r5 = 1740(0x6cc, float:2.438E-42)
        L10e:
            r5 = r5 ^ 1757(0x6dd, float:2.462E-42)
            switch(r5) {
                case 17: goto L114;
                case 54: goto L119;
                case 471: goto L128;
                case 500: goto L11c;
                default: goto L113;
            }
        L113:
            goto L10e
        L114:
            if (r17 == 0) goto L119
            r5 = 1833(0x729, float:2.569E-42)
            goto L10e
        L119:
            r5 = 1802(0x70a, float:2.525E-42)
            goto L10e
        L11c:
            r5 = 1864(0x748, float:2.612E-42)
        L11e:
            r5 = r5 ^ 1881(0x759, float:2.636E-42)
            switch(r5) {
                case 17: goto L124;
                case 47483: goto L12c;
                default: goto L123;
            }
        L123:
            goto L11e
        L124:
            r5 = 48674(0xbe22, float:6.8207E-41)
            goto L11e
        L128:
            java.lang.String r2 = m8233(r19)
        L12c:
            java.lang.String r5 = androidx.loader.C1096.m2667(r6, r15, r2)
            java.lang.String r2 = m8211(r19)
            boolean r6 = androidx.activity.C1066.m488(r2)
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L13b:
            r15 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r15
            switch(r2) {
                case 14: goto L143;
                case 45: goto L17a;
                case 76: goto L14d;
                case 239: goto L147;
                default: goto L142;
            }
        L142:
            goto L13b
        L143:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L13b
        L147:
            if (r6 == 0) goto L143
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L13b
        L14d:
            r2 = 48891(0xbefb, float:6.8511E-41)
        L150:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 22: goto L158;
                case 503: goto L176;
                default: goto L157;
            }
        L157:
            goto L150
        L158:
            r2 = r3
        L159:
            java.lang.String r3 = androidx.loader.C1096.m2667(r5, r14, r2)
            java.lang.String r2 = m8199(r19)
            boolean r5 = androidx.activity.C1066.m488(r2)
            r2 = 49666(0xc202, float:6.9597E-41)
        L168:
            r6 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L170;
                case 50: goto L17f;
                case 76: goto L183;
                case 83: goto L1b0;
                default: goto L16f;
            }
        L16f:
            goto L168
        L170:
            if (r5 == 0) goto L17f
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto L168
        L176:
            r2 = 48922(0xbf1a, float:6.8554E-41)
            goto L150
        L17a:
            java.lang.String r2 = m8211(r19)
            goto L159
        L17f:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto L168
        L183:
            r2 = 49790(0xc27e, float:6.977E-41)
        L186:
            r5 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 18: goto L18e;
                case 241: goto L1ac;
                default: goto L18d;
            }
        L18d:
            goto L186
        L18e:
            r2 = r4
        L18f:
            java.lang.String r5 = androidx.loader.C1096.m2667(r3, r13, r2)
            java.lang.String r2 = m8200(r19)
            boolean r3 = androidx.activity.C1066.m488(r2)
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L19e:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 497: goto L1a6;
                case 1711: goto L1b5;
                case 1736: goto L1d0;
                case 1769: goto L1b9;
                default: goto L1a5;
            }
        L1a5:
            goto L19e
        L1a6:
            if (r3 == 0) goto L1b5
            r2 = 50658(0xc5e2, float:7.0987E-41)
            goto L19e
        L1ac:
            r2 = 49821(0xc29d, float:6.9814E-41)
            goto L186
        L1b0:
            java.lang.String r2 = m8199(r19)
            goto L18f
        L1b5:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto L19e
        L1b9:
            long r2 = androidx.lifecycle.process.C1089.m2100()
            java.lang.String r2 = kevin.fun.hook.audio.C1117.m8127(r2)
            r3 = 50689(0xc601, float:7.103E-41)
        L1c4:
            r6 = 50706(0xc612, float:7.1054E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 19: goto L1cc;
                case 50: goto L1d4;
                default: goto L1cb;
            }
        L1cb:
            goto L1c4
        L1cc:
            r3 = 50720(0xc620, float:7.1074E-41)
            goto L1c4
        L1d0:
            java.lang.String r2 = m8200(r19)
        L1d4:
            java.lang.String r3 = androidx.loader.C1096.m2667(r5, r12, r2)
            java.lang.String r2 = m8204(r19)
            boolean r5 = androidx.activity.C1066.m488(r2)
            r2 = 50813(0xc67d, float:7.1204E-41)
        L1e3:
            r6 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 18: goto L1eb;
                case 53: goto L204;
                case 243: goto L1ef;
                case 4075: goto L1f5;
                default: goto L1ea;
            }
        L1ea:
            goto L1e3
        L1eb:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L1e3
        L1ef:
            if (r5 == 0) goto L1eb
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L1e3
        L1f5:
            r2 = 51588(0xc984, float:7.229E-41)
        L1f8:
            r5 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L200;
                case 54: goto L256;
                default: goto L1ff;
            }
        L1ff:
            goto L1f8
        L200:
            r2 = 51619(0xc9a3, float:7.2334E-41)
            goto L1f8
        L204:
            java.lang.String r2 = m8204(r19)
            int r4 = androidx.emoji2.C1080.m1552(r2)
            r2 = 51712(0xca00, float:7.2464E-41)
        L20f:
            r5 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L217;
                case 17: goto L21b;
                case 47: goto L252;
                case 76: goto L223;
                default: goto L216;
            }
        L216:
            goto L20f
        L217:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L20f
        L21b:
            r2 = 20
            if (r4 <= r2) goto L217
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L20f
        L223:
            java.lang.String r2 = m8204(r19)
            r4 = 0
            int r5 = androidx.lifecycle.livedata.C1085.f111
            r5 = r5 ^ 796(0x31c, float:1.115E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1088.m2028(r2, r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r4, r2)
            r0 = r16
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r2)
            r2 = 51836(0xca7c, float:7.2638E-41)
        L246:
            r5 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 241: goto L24e;
                case 1963: goto L256;
                default: goto L24d;
            }
        L24d:
            goto L246
        L24e:
            r2 = 52518(0xcd26, float:7.3593E-41)
            goto L246
        L252:
            java.lang.String r4 = m8204(r19)
        L256:
            java.lang.String r4 = androidx.loader.C1096.m2667(r3, r11, r4)
            androidx.emoji2.C1080.m1562()
            long r12 = m8207(r19)
            r2 = 52611(0xcd83, float:7.3724E-41)
        L264:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 23: goto L26c;
                case 54: goto L276;
                case 85: goto L2b9;
                case 116: goto L27a;
                default: goto L26b;
            }
        L26b:
            goto L264
        L26c:
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L276
            r2 = 52704(0xcde0, float:7.3854E-41)
            goto L264
        L276:
            r2 = 52673(0xcdc1, float:7.381E-41)
            goto L264
        L27a:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = androidx.activity.C1064.m382()
            r2.<init>(r7, r3)
            java.util.Date r3 = new java.util.Date
            long r6 = m8207(r19)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r12
            r3.<init>(r6)
            java.lang.String r2 = androidx.appcompat.resources.C1068.m657(r2, r3)
            r3 = 52735(0xcdff, float:7.3897E-41)
        L296:
            r5 = 52752(0xce10, float:7.3921E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 14: goto L29e;
                case 1007: goto L2b5;
                default: goto L29d;
            }
        L29d:
            goto L296
        L29e:
            java.lang.String r2 = androidx.loader.C1096.m2667(r4, r10, r2)
            java.lang.String r2 = androidx.loader.C1096.m2667(r2, r9, r8)
            r3 = 53510(0xd106, float:7.4983E-41)
        L2a9:
            r4 = 53527(0xd117, float:7.5007E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L2b1;
                case 50: goto L48d;
                default: goto L2b0;
            }
        L2b0:
            goto L2a9
        L2b1:
            r3 = 53541(0xd125, float:7.5027E-41)
            goto L2a9
        L2b5:
            r3 = 52766(0xce1e, float:7.3941E-41)
            goto L296
        L2b9:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = androidx.activity.C1064.m382()
            r2.<init>(r7, r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = androidx.appcompat.resources.C1068.m657(r2, r3)
            goto L29e
        L2cc:
            java.lang.String r5 = m8197(r19)
            boolean r17 = androidx.activity.C1066.m488(r5)
            r5 = 53634(0xd182, float:7.5157E-41)
        L2d7:
            r18 = 53651(0xd193, float:7.5181E-41)
            r5 = r5 ^ r18
            switch(r5) {
                case 17: goto L2e0;
                case 50: goto L2e6;
                case 76: goto L2ea;
                case 83: goto L2fa;
                default: goto L2df;
            }
        L2df:
            goto L2d7
        L2e0:
            if (r17 == 0) goto L2e6
            r5 = 53727(0xd1df, float:7.5288E-41)
            goto L2d7
        L2e6:
            r5 = 53696(0xd1c0, float:7.5244E-41)
            goto L2d7
        L2ea:
            r5 = 53758(0xd1fe, float:7.5331E-41)
        L2ed:
            r17 = 53775(0xd20f, float:7.5355E-41)
            r5 = r5 ^ r17
            switch(r5) {
                case 1009: goto L2f6;
                case 1703: goto L2fe;
                default: goto L2f5;
            }
        L2f5:
            goto L2ed
        L2f6:
            r5 = 54440(0xd4a8, float:7.6287E-41)
            goto L2ed
        L2fa:
            java.lang.String r2 = m8197(r19)
        L2fe:
            java.lang.String r5 = androidx.loader.C1096.m2667(r6, r15, r2)
            java.lang.String r2 = m8231(r19)
            boolean r6 = androidx.activity.C1066.m488(r2)
            r2 = 54533(0xd505, float:7.6417E-41)
        L30d:
            r15 = 54550(0xd516, float:7.6441E-41)
            r2 = r2 ^ r15
            switch(r2) {
                case 19: goto L315;
                case 50: goto L31b;
                case 85: goto L32e;
                case 116: goto L31f;
                default: goto L314;
            }
        L314:
            goto L30d
        L315:
            if (r6 == 0) goto L31b
            r2 = 54626(0xd562, float:7.6547E-41)
            goto L30d
        L31b:
            r2 = 54595(0xd543, float:7.6504E-41)
            goto L30d
        L31f:
            r2 = 54657(0xd581, float:7.6591E-41)
        L322:
            r6 = 54674(0xd592, float:7.6615E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto L32a;
                case 50: goto L332;
                default: goto L329;
            }
        L329:
            goto L322
        L32a:
            r2 = 54688(0xd5a0, float:7.6634E-41)
            goto L322
        L32e:
            java.lang.String r3 = m8231(r19)
        L332:
            java.lang.String r3 = androidx.loader.C1096.m2667(r5, r14, r3)
            java.lang.String r2 = m8210(r19)
            boolean r5 = androidx.activity.C1066.m488(r2)
            r2 = 55432(0xd888, float:7.7677E-41)
        L341:
            r6 = 55449(0xd899, float:7.77E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L349;
                case 62: goto L34f;
                case 95: goto L380;
                case 124: goto L353;
                default: goto L348;
            }
        L348:
            goto L341
        L349:
            if (r5 == 0) goto L34f
            r2 = 55525(0xd8e5, float:7.7807E-41)
            goto L341
        L34f:
            r2 = 55494(0xd8c6, float:7.7764E-41)
            goto L341
        L353:
            r2 = 55556(0xd904, float:7.785E-41)
        L356:
            r5 = 55573(0xd915, float:7.7874E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L35e;
                case 54: goto L362;
                default: goto L35d;
            }
        L35d:
            goto L356
        L35e:
            r2 = 55587(0xd923, float:7.7894E-41)
            goto L356
        L362:
            r2 = r4
        L363:
            java.lang.String r5 = androidx.loader.C1096.m2667(r3, r13, r2)
            java.lang.String r2 = m8191(r19)
            boolean r3 = androidx.activity.C1066.m488(r2)
            r2 = 55680(0xd980, float:7.8024E-41)
        L372:
            r6 = 55697(0xd991, float:7.8048E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L37a;
                case 1467: goto L385;
                case 1496: goto L3a0;
                case 1529: goto L389;
                default: goto L379;
            }
        L379:
            goto L372
        L37a:
            if (r3 == 0) goto L385
            r2 = 56424(0xdc68, float:7.9067E-41)
            goto L372
        L380:
            java.lang.String r2 = m8210(r19)
            goto L363
        L385:
            r2 = 56393(0xdc49, float:7.9023E-41)
            goto L372
        L389:
            long r2 = androidx.lifecycle.process.C1089.m2100()
            java.lang.String r2 = kevin.fun.hook.audio.C1117.m8127(r2)
            r3 = 56455(0xdc87, float:7.911E-41)
        L394:
            r6 = 56472(0xdc98, float:7.9134E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 31: goto L39c;
                case 62: goto L3a4;
                default: goto L39b;
            }
        L39b:
            goto L394
        L39c:
            r3 = 56486(0xdca6, float:7.9154E-41)
            goto L394
        L3a0:
            java.lang.String r2 = m8191(r19)
        L3a4:
            java.lang.String r3 = androidx.loader.C1096.m2667(r5, r12, r2)
            java.lang.String r2 = m8212(r19)
            boolean r5 = androidx.activity.C1066.m488(r2)
            r2 = 56579(0xdd03, float:7.9284E-41)
        L3b3:
            r6 = 56596(0xdd14, float:7.9308E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 23: goto L3bb;
                case 54: goto L3c1;
                case 85: goto L3f4;
                case 1564036: goto L3c5;
                default: goto L3ba;
            }
        L3ba:
            goto L3b3
        L3bb:
            if (r5 == 0) goto L3c1
            r2 = 1507472(0x170090, float:2.112418E-39)
            goto L3b3
        L3c1:
            r2 = 56641(0xdd41, float:7.9371E-41)
            goto L3b3
        L3c5:
            r2 = 1507503(0x1700af, float:2.112462E-39)
        L3c8:
            r5 = 1507520(0x1700c0, float:2.112485E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L3d0;
                case 111: goto L3f0;
                default: goto L3cf;
            }
        L3cf:
            goto L3c8
        L3d0:
            java.lang.String r4 = androidx.loader.C1096.m2667(r3, r11, r4)
            androidx.emoji2.C1080.m1562()
            long r12 = m8192(r19)
            r2 = 1508526(0x1704ae, float:2.113895E-39)
        L3de:
            r3 = 1508543(0x1704bf, float:2.113919E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L3e6;
                case 83: goto L473;
                case 114: goto L447;
                case 436: goto L44b;
                default: goto L3e5;
            }
        L3e5:
            goto L3de
        L3e6:
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L447
            r2 = 1508619(0x17050b, float:2.114025E-39)
            goto L3de
        L3f0:
            r2 = 1507534(0x1700ce, float:2.112505E-39)
            goto L3c8
        L3f4:
            java.lang.String r2 = m8212(r19)
            int r4 = androidx.emoji2.C1080.m1552(r2)
            r2 = 1507627(0x17012b, float:2.112635E-39)
        L3ff:
            r5 = 1507644(0x17013c, float:2.112659E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 23: goto L407;
                case 85: goto L442;
                case 118: goto L40f;
                case 180: goto L413;
                default: goto L406;
            }
        L406:
            goto L3ff
        L407:
            r2 = 20
            if (r4 <= r2) goto L40f
            r2 = 1507720(0x170188, float:2.112766E-39)
            goto L3ff
        L40f:
            r2 = 1507689(0x170169, float:2.112722E-39)
            goto L3ff
        L413:
            java.lang.String r2 = m8212(r19)
            r4 = 0
            int r5 = androidx.viewpager.C1108.f134
            r5 = r5 ^ (-503(0xfffffffffffffe09, float:NaN))
            java.lang.String r2 = androidx.lifecycle.process.C1088.m2028(r2, r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r4, r2)
            r0 = r16
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r2)
            r2 = 1507751(0x1701a7, float:2.112809E-39)
        L436:
            r5 = 1507768(0x1701b8, float:2.112833E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 31: goto L43e;
                case 1513: goto L3d0;
                default: goto L43d;
            }
        L43d:
            goto L436
        L43e:
            r2 = 1508433(0x170451, float:2.113765E-39)
            goto L436
        L442:
            java.lang.String r4 = m8212(r19)
            goto L3d0
        L447:
            r2 = 1508588(0x1704ec, float:2.113982E-39)
            goto L3de
        L44b:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = androidx.activity.C1064.m382()
            r2.<init>(r7, r3)
            java.util.Date r3 = new java.util.Date
            long r6 = m8192(r19)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r12
            r3.<init>(r6)
            java.lang.String r2 = androidx.appcompat.resources.C1068.m657(r2, r3)
            r3 = 1508650(0x17052a, float:2.114069E-39)
        L467:
            r5 = 1508667(0x17053b, float:2.114093E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L46f;
                case 114: goto L485;
                default: goto L46e;
            }
        L46e:
            goto L467
        L46f:
            r3 = 1508681(0x170549, float:2.114112E-39)
            goto L467
        L473:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = androidx.activity.C1064.m382()
            r2.<init>(r7, r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = androidx.appcompat.resources.C1068.m657(r2, r3)
        L485:
            java.lang.String r2 = androidx.loader.C1096.m2667(r4, r10, r2)
            java.lang.String r2 = androidx.loader.C1096.m2667(r2, r9, r8)
        L48d:
            short[] r3 = m8183()
            r4 = 799(0x31f, float:1.12E-42)
            int r5 = androidx.startup.C1101.f127
            r5 = r5 ^ 754(0x2f2, float:1.057E-42)
            r6 = 2575(0xa0f, float:3.608E-42)
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2213(r3, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 811(0x32b, float:1.136E-42)
            r6 = 1
            r7 = 579(0x243, float:8.11E-43)
            java.lang.String r4 = androidx.emoji2.C1080.m1525(r4, r5, r6, r7)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8557(r2, r3, r4)
            int r5 = androidx.emoji2.C1080.m1552(r2)
            r3 = 1509425(0x170831, float:2.115155E-39)
        L4b5:
            r6 = 1509442(0x170842, float:2.115179E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 18: goto L4bd;
                case 45: goto L4e5;
                case 115: goto L4c1;
                case 204: goto L4c9;
                default: goto L4bc;
            }
        L4bc:
            goto L4b5
        L4bd:
            r3 = 1509487(0x17086f, float:2.115242E-39)
            goto L4b5
        L4c1:
            r3 = 80
            if (r5 <= r3) goto L4bd
            r3 = 1509518(0x17088e, float:2.115285E-39)
            goto L4b5
        L4c9:
            r3 = 0
            int r5 = androidx.startup.C1101.f127
            r5 = r5 ^ 691(0x2b3, float:9.68E-43)
            java.lang.String r2 = androidx.lifecycle.process.C1088.m2028(r2, r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)
            r0 = r16
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
        L4e5:
            java.util.UUID r3 = androidx.lifecycle.livedata.C1084.m1737()
            java.lang.String r3 = androidx.lifecycle.process.C1087.m1991(r3)
            r5 = 0
            int r6 = androidx.activity.C1063.f89
            r6 = r6 ^ 6
            java.lang.String r3 = androidx.lifecycle.process.C1088.m2028(r3, r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r5, r4)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r4, r2)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            r0 = r22
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            return r2
    }

    private java.lang.String generateSimpleFileName(java.lang.String r12) {
            r11 = this;
            r9 = 0
            r1 = 0
            java.lang.String r7 = "۟ۡۤ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r9
            r10 = r9
        Lc:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r7)
            switch(r1) {
                case 1746754: goto L3c;
                case 1746905: goto L1a;
                case 1747749: goto L8d;
                case 1748613: goto L86;
                case 1748677: goto L94;
                case 1749602: goto L44;
                case 1749665: goto L5c;
                case 1750749: goto L9b;
                case 1750816: goto L56;
                case 1752460: goto L35;
                case 1752555: goto L27;
                case 1752577: goto L62;
                case 1752580: goto L7e;
                case 1752641: goto L6a;
                case 1752643: goto L4a;
                case 1752708: goto L77;
                case 1753422: goto L2f;
                case 1753702: goto L71;
                case 1755434: goto L20;
                default: goto L13;
            }
        L13:
            int r9 = androidx.annotation.experimental.C1067.f93
            java.lang.String r1 = "ۦۨۨ"
            r7 = r1
            r10 = r9
            goto Lc
        L1a:
            r2[r8] = r12
            java.lang.String r1 = "۠ۡ"
            r7 = r1
            goto Lc
        L20:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = "ۥ۟ۦ"
            r2 = r1
            goto Lc
        L27:
            java.lang.String r1 = m8187(r11, r8)
            java.lang.String r7 = "ۥۣ۟"
            r5 = r1
            goto Lc
        L2f:
            r8 = r10 ^ 650(0x28a, float:9.11E-43)
            java.lang.String r1 = "ۥۥۣ"
            r7 = r1
            goto Lc
        L35:
            int r9 = kevin.fun.hook.audio.C1114.f403
            java.lang.String r1 = "۠ۢۧ"
            r7 = r1
            r10 = r9
            goto Lc
        L3c:
            java.lang.String r0 = m8184(r11)
            java.lang.String r1 = "ۥۧۦ"
            r7 = r1
            goto Lc
        L44:
            r2[r8] = r0
            java.lang.String r1 = "ۥۥۡ"
            r7 = r1
            goto Lc
        L4a:
            r1 = 812(0x32c, float:1.138E-42)
            r3 = 2340(0x924, float:3.279E-42)
            java.lang.String r1 = androidx.lifecycle.viewmodel.C1093.m2415(r6, r1, r8, r3)
            java.lang.String r7 = "ۨۢۤ"
            r3 = r1
            goto Lc
        L56:
            r8 = r10 ^ 857(0x359, float:1.201E-42)
            java.lang.String r1 = "ۡۡۥ"
            r7 = r1
            goto Lc
        L5c:
            r8 = r10 ^ 610(0x262, float:8.55E-43)
            java.lang.String r1 = "ۥۢۨ"
            r7 = r1
            goto Lc
        L62:
            short[] r1 = m8183()
            java.lang.String r7 = "ۣۡ۟"
            r6 = r1
            goto Lc
        L6a:
            int r9 = androidx.loader.C1099.f125
            java.lang.String r1 = "ۣۨۥ"
            r7 = r1
            r10 = r9
            goto Lc
        L71:
            r8 = r10 ^ (-53)
            java.lang.String r1 = "ۢ۠۠"
            r7 = r1
            goto Lc
        L77:
            int r9 = androidx.emoji2.viewsintegration.C1078.f104
            java.lang.String r1 = "ۢۢۡ"
            r7 = r1
            r10 = r9
            goto Lc
        L7e:
            java.lang.String r1 = androidx.versionedparcelable.C1106.m3391(r3, r2)
            java.lang.String r7 = "ۣۦ۠"
            r4 = r1
            goto Lc
        L86:
            int r9 = androidx.versionedparcelable.C1107.f133
            java.lang.String r1 = "ۦ۟ۧ"
            r7 = r1
            r10 = r9
            goto Lc
        L8d:
            r8 = r10 ^ (-20)
            java.lang.String r1 = "۟ۦ۠"
            r7 = r1
            goto Lc
        L94:
            r2[r8] = r5
            java.lang.String r1 = "ۥۣۢ"
            r7 = r1
            goto Lc
        L9b:
            return r4
    }

    private java.lang.String getFileExtension(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            short[] r0 = m8183()
            r1 = 826(0x33a, float:1.157E-42)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-968(0xfffffffffffffc38, float:NaN))
            r3 = 1443(0x5a3, float:2.022E-42)
            java.lang.String r3 = androidx.loader.C1094.m2495(r0, r1, r2, r3)
            short[] r0 = m8183()
            r1 = 830(0x33e, float:1.163E-42)
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-808(0xfffffffffffffcd8, float:NaN))
            r4 = 2126(0x84e, float:2.979E-42)
            java.lang.String r2 = androidx.documentfile.C1076.m1234(r0, r1, r2, r4)
            short[] r0 = m8183()
            r1 = 835(0x343, float:1.17E-42)
            int r4 = androidx.interpolator.C1083.f109
            r4 = r4 ^ (-442(0xfffffffffffffe46, float:NaN))
            r5 = 1061(0x425, float:1.487E-42)
            java.lang.String r1 = androidx.activity.C1063.m241(r0, r1, r4, r5)
            short[] r0 = m8183()
            r4 = 839(0x347, float:1.176E-42)
            int r5 = androidx.lifecycle.process.C1090.f116
            r5 = r5 ^ (-428(0xfffffffffffffe54, float:NaN))
            r6 = 1264(0x4f0, float:1.771E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r4, r5, r6)
            short[] r4 = m8183()
            r5 = 843(0x34b, float:1.181E-42)
            int r6 = kevin.fun.hook.audio.C1114.f403
            r6 = r6 ^ (-24)
            r7 = 902(0x386, float:1.264E-42)
            java.lang.String r4 = androidx.customview.C1075.m1138(r4, r5, r6, r7)
            short[] r5 = m8183()
            r6 = 847(0x34f, float:1.187E-42)
            int r7 = org.luckypray.dexkit.C1124.f434
            r7 = r7 ^ 663(0x297, float:9.29E-43)
            r8 = 1656(0x678, float:2.32E-42)
            java.lang.String r5 = androidx.lifecycle.livedata.C1086.m1920(r5, r6, r7, r8)
            r6 = 1616(0x650, float:2.264E-42)
        L62:
            r6 = r6 ^ 1633(0x661, float:2.288E-42)
            switch(r6) {
                case 14: goto L68;
                case 49: goto L6b;
                case 204: goto L70;
                case 239: goto L204;
                default: goto L67;
            }
        L67:
            goto L62
        L68:
            r6 = 1678(0x68e, float:2.351E-42)
            goto L62
        L6b:
            if (r12 == 0) goto L68
            r6 = 1709(0x6ad, float:2.395E-42)
            goto L62
        L70:
            short[] r6 = m8183()
            r7 = 851(0x353, float:1.193E-42)
            int r8 = androidx.loader.C1096.f122
            r8 = r8 ^ (-958(0xfffffffffffffc42, float:NaN))
            r9 = 426(0x1aa, float:5.97E-43)
            java.lang.String r6 = androidx.core.ktx.C1070.m788(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 1740(0x6cc, float:2.438E-42)
        L86:
            r6 = r6 ^ 1757(0x6dd, float:2.462E-42)
            switch(r6) {
                case 17: goto L8c;
                case 54: goto L91;
                case 471: goto Lc5;
                case 500: goto L94;
                default: goto L8b;
            }
        L8b:
            goto L86
        L8c:
            if (r7 != 0) goto L91
            r6 = 1833(0x729, float:2.569E-42)
            goto L86
        L91:
            r6 = 1802(0x70a, float:2.525E-42)
            goto L86
        L94:
            short[] r6 = m8183()
            r7 = 854(0x356, float:1.197E-42)
            int r8 = androidx.appcompat.C1069.f95
            r8 = r8 ^ (-234(0xffffffffffffff16, float:NaN))
            r9 = 1273(0x4f9, float:1.784E-42)
            java.lang.String r6 = org.luckypray.dexkit.C1123.m10510(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 1864(0x748, float:2.612E-42)
        Laa:
            r6 = r6 ^ 1881(0x759, float:2.636E-42)
            switch(r6) {
                case 17: goto Lb0;
                case 47384: goto Lcb;
                case 47417: goto Lba;
                case 47483: goto Lb6;
                default: goto Laf;
            }
        Laf:
            goto Laa
        Lb0:
            if (r7 == 0) goto Lb6
            r6 = 48736(0xbe60, float:6.8294E-41)
            goto Laa
        Lb6:
            r6 = 48705(0xbe41, float:6.825E-41)
            goto Laa
        Lba:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lbd:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto Lc5;
                case 239: goto Lc7;
                default: goto Lc4;
            }
        Lc4:
            goto Lbd
        Lc5:
            r0 = r5
        Lc6:
            return r0
        Lc7:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto Lbd
        Lcb:
            short[] r6 = m8183()
            r7 = 859(0x35b, float:1.204E-42)
            int r8 = androidx.activity.C1066.f92
            r8 = r8 ^ 817(0x331, float:1.145E-42)
            r9 = 3145(0xc49, float:4.407E-42)
            java.lang.String r6 = androidx.annotation.experimental.C1067.m581(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 48891(0xbefb, float:6.8511E-41)
        Le2:
            r8 = 48908(0xbf0c, float:6.8535E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 22: goto Lea;
                case 53: goto L128;
                case 503: goto Lee;
                case 32495: goto Lf4;
                default: goto Le9;
            }
        Le9:
            goto Le2
        Lea:
            r6 = 48953(0xbf39, float:6.8598E-41)
            goto Le2
        Lee:
            if (r7 != 0) goto Lea
            r6 = 49635(0xc1e3, float:6.9553E-41)
            goto Le2
        Lf4:
            short[] r6 = m8183()
            r7 = 863(0x35f, float:1.21E-42)
            int r8 = androidx.interpolator.C1081.f107
            r8 = r8 ^ (-268(0xfffffffffffffef4, float:NaN))
            r9 = 461(0x1cd, float:6.46E-43)
            java.lang.String r6 = androidx.lifecycle.process.C1087.m2008(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 49666(0xc202, float:6.9597E-41)
        L10b:
            r8 = 49683(0xc213, float:6.9621E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 17: goto L113;
                case 50: goto L119;
                case 76: goto L11d;
                case 83: goto L12e;
                default: goto L112;
            }
        L112:
            goto L10b
        L113:
            if (r7 == 0) goto L119
            r6 = 49759(0xc25f, float:6.9727E-41)
            goto L10b
        L119:
            r6 = 49728(0xc240, float:6.9684E-41)
            goto L10b
        L11d:
            r0 = 49790(0xc27e, float:6.977E-41)
        L120:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L128;
                case 241: goto L12a;
                default: goto L127;
            }
        L127:
            goto L120
        L128:
            r0 = r4
            goto Lc6
        L12a:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L120
        L12e:
            short[] r6 = m8183()
            r7 = 866(0x362, float:1.214E-42)
            int r8 = androidx.versionedparcelable.C1106.f132
            r8 = r8 ^ 143(0x8f, float:2.0E-43)
            r9 = 2812(0xafc, float:3.94E-42)
            java.lang.String r6 = androidx.activity.C1065.m410(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 49914(0xc2fa, float:6.9944E-41)
        L145:
            r8 = 49931(0xc30b, float:6.9968E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 497: goto L14d;
                case 1711: goto L153;
                case 1736: goto L157;
                case 1769: goto Lc6;
                default: goto L14c;
            }
        L14c:
            goto L145
        L14d:
            if (r7 == 0) goto L153
            r6 = 50658(0xc5e2, float:7.0987E-41)
            goto L145
        L153:
            r6 = 50627(0xc5c3, float:7.0944E-41)
            goto L145
        L157:
            short[] r6 = m8183()
            r7 = 869(0x365, float:1.218E-42)
            int r8 = androidx.customview.C1074.f100
            r8 = r8 ^ 240(0xf0, float:3.36E-43)
            r9 = 410(0x19a, float:5.75E-43)
            java.lang.String r6 = androidx.loader.C1098.m2787(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 50689(0xc601, float:7.103E-41)
        L16e:
            r8 = 50706(0xc612, float:7.1054E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 19: goto L176;
                case 45: goto L183;
                case 50: goto L17c;
                case 76: goto L180;
                default: goto L175;
            }
        L175:
            goto L16e
        L176:
            if (r7 == 0) goto L17c
            r6 = 50782(0xc65e, float:7.1161E-41)
            goto L16e
        L17c:
            r6 = 50751(0xc63f, float:7.1117E-41)
            goto L16e
        L180:
            r0 = r1
            goto Lc6
        L183:
            short[] r6 = m8183()
            r7 = 872(0x368, float:1.222E-42)
            int r8 = androidx.vectordrawable.animated.C1102.f128
            r8 = r8 ^ 199(0xc7, float:2.79E-43)
            r9 = 369(0x171, float:5.17E-43)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 50813(0xc67d, float:7.1204E-41)
        L19a:
            r8 = 50830(0xc68e, float:7.1228E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 18: goto L1a2;
                case 53: goto L1af;
                case 243: goto L1a6;
                case 4075: goto L1ac;
                default: goto L1a1;
            }
        L1a1:
            goto L19a
        L1a2:
            r6 = 50875(0xc6bb, float:7.1291E-41)
            goto L19a
        L1a6:
            if (r7 == 0) goto L1a2
            r6 = 51557(0xc965, float:7.2247E-41)
            goto L19a
        L1ac:
            r0 = r2
            goto Lc6
        L1af:
            short[] r6 = m8183()
            r7 = 876(0x36c, float:1.228E-42)
            int r8 = androidx.activity.C1066.f92
            r8 = r8 ^ 822(0x336, float:1.152E-42)
            r9 = 1159(0x487, float:1.624E-42)
            java.lang.String r6 = androidx.interpolator.C1082.m1694(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 51588(0xc984, float:7.229E-41)
        L1c6:
            r8 = 51605(0xc995, float:7.2314E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 17: goto L1ce;
                case 54: goto L1d4;
                case 87: goto L201;
                case 116: goto L1d8;
                default: goto L1cd;
            }
        L1cd:
            goto L1c6
        L1ce:
            if (r7 != 0) goto L1d4
            r6 = 51681(0xc9e1, float:7.242E-41)
            goto L1c6
        L1d4:
            r6 = 51650(0xc9c2, float:7.2377E-41)
            goto L1c6
        L1d8:
            short[] r6 = m8183()
            r7 = 879(0x36f, float:1.232E-42)
            int r8 = kevin.fun.hook.webdav.C1119.f418
            r8 = r8 ^ 291(0x123, float:4.08E-43)
            r9 = 1315(0x523, float:1.843E-42)
            java.lang.String r6 = org.luckypray.dexkit.C1124.m10545(r6, r7, r8, r9)
            boolean r7 = androidx.emoji2.C1080.m1554(r12, r6)
            r6 = 51712(0xca00, float:7.2464E-41)
        L1ef:
            r8 = 51729(0xca11, float:7.2488E-41)
            r6 = r6 ^ r8
            switch(r6) {
                case 14: goto L1f7;
                case 17: goto L1fb;
                case 47: goto L204;
                case 76: goto L201;
                default: goto L1f6;
            }
        L1f6:
            goto L1ef
        L1f7:
            r6 = 51774(0xca3e, float:7.2551E-41)
            goto L1ef
        L1fb:
            if (r7 == 0) goto L1f7
            r6 = 51805(0xca5d, float:7.2594E-41)
            goto L1ef
        L201:
            r0 = r3
            goto Lc6
        L204:
            r6 = 51836(0xca7c, float:7.2638E-41)
        L207:
            r7 = 51853(0xca8d, float:7.2662E-41)
            r6 = r6 ^ r7
            switch(r6) {
                case 241: goto L20f;
                case 1963: goto L215;
                case 1992: goto L2fa;
                case 2025: goto L219;
                default: goto L20e;
            }
        L20e:
            goto L207
        L20f:
            if (r11 == 0) goto L215
            r6 = 52580(0xcd64, float:7.368E-41)
            goto L207
        L215:
            r6 = 52549(0xcd45, float:7.3637E-41)
            goto L207
        L219:
            java.lang.String r7 = androidx.appcompat.resources.C1068.m696(r11)
            boolean r8 = androidx.emoji2.C1080.m1554(r7, r5)
            r6 = 52611(0xcd83, float:7.3724E-41)
        L224:
            r9 = 52628(0xcd94, float:7.3748E-41)
            r6 = r6 ^ r9
            switch(r6) {
                case 23: goto L22c;
                case 54: goto L232;
                case 85: goto L239;
                case 116: goto L236;
                default: goto L22b;
            }
        L22b:
            goto L224
        L22c:
            if (r8 == 0) goto L232
            r6 = 52704(0xcde0, float:7.3854E-41)
            goto L224
        L232:
            r6 = 52673(0xcdc1, float:7.381E-41)
            goto L224
        L236:
            r0 = r5
            goto Lc6
        L239:
            boolean r6 = androidx.emoji2.C1080.m1554(r7, r4)
            r5 = 52735(0xcdff, float:7.3897E-41)
        L240:
            r8 = 52752(0xce10, float:7.3921E-41)
            r5 = r5 ^ r8
            switch(r5) {
                case 14: goto L248;
                case 45: goto L2f7;
                case 1007: goto L24c;
                case 7927: goto L252;
                default: goto L247;
            }
        L247:
            goto L240
        L248:
            r5 = 52797(0xce3d, float:7.3984E-41)
            goto L240
        L24c:
            if (r6 != 0) goto L248
            r5 = 53479(0xd0e7, float:7.494E-41)
            goto L240
        L252:
            short[] r5 = m8183()
            r6 = 884(0x374, float:1.239E-42)
            int r8 = kevin.fun.hook.audio.C1116.f405
            r8 = r8 ^ 87
            r9 = 1592(0x638, float:2.231E-42)
            java.lang.String r5 = androidx.activity.C1065.m410(r5, r6, r8, r9)
            boolean r6 = androidx.emoji2.C1080.m1554(r7, r5)
            r5 = 53510(0xd106, float:7.4983E-41)
        L269:
            r8 = 53527(0xd117, float:7.5007E-41)
            r5 = r5 ^ r8
            switch(r5) {
                case 17: goto L271;
                case 50: goto L277;
                case 83: goto L28a;
                case 116: goto L27b;
                default: goto L270;
            }
        L270:
            goto L269
        L271:
            if (r6 == 0) goto L277
            r5 = 53603(0xd163, float:7.5114E-41)
            goto L269
        L277:
            r5 = 53572(0xd144, float:7.507E-41)
            goto L269
        L27b:
            r0 = 53634(0xd182, float:7.5157E-41)
        L27e:
            r1 = 53651(0xd193, float:7.5181E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L286;
                case 50: goto L2f7;
                default: goto L285;
            }
        L285:
            goto L27e
        L286:
            r0 = 53665(0xd1a1, float:7.52E-41)
            goto L27e
        L28a:
            boolean r5 = androidx.emoji2.C1080.m1554(r7, r0)
            r4 = 53758(0xd1fe, float:7.5331E-41)
        L291:
            r6 = 53775(0xd20f, float:7.5355E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 1009: goto L299;
                case 1703: goto L29f;
                case 1736: goto L2a3;
                case 1769: goto Lc6;
                default: goto L298;
            }
        L298:
            goto L291
        L299:
            if (r5 == 0) goto L29f
            r4 = 54502(0xd4e6, float:7.6374E-41)
            goto L291
        L29f:
            r4 = 54471(0xd4c7, float:7.633E-41)
            goto L291
        L2a3:
            boolean r4 = androidx.emoji2.C1080.m1554(r7, r1)
            r0 = 54533(0xd505, float:7.6417E-41)
        L2aa:
            r5 = 54550(0xd516, float:7.6441E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 19: goto L2b2;
                case 50: goto L2b8;
                case 85: goto L2bf;
                case 116: goto L2bc;
                default: goto L2b1;
            }
        L2b1:
            goto L2aa
        L2b2:
            if (r4 == 0) goto L2b8
            r0 = 54626(0xd562, float:7.6547E-41)
            goto L2aa
        L2b8:
            r0 = 54595(0xd543, float:7.6504E-41)
            goto L2aa
        L2bc:
            r0 = r1
            goto Lc6
        L2bf:
            boolean r1 = androidx.emoji2.C1080.m1554(r7, r2)
            r0 = 54657(0xd581, float:7.6591E-41)
        L2c6:
            r4 = 54674(0xd592, float:7.6615E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 19: goto L2ce;
                case 45: goto L2db;
                case 50: goto L2d4;
                case 3579: goto L2d8;
                default: goto L2cd;
            }
        L2cd:
            goto L2c6
        L2ce:
            if (r1 == 0) goto L2d4
            r0 = 55401(0xd869, float:7.7633E-41)
            goto L2c6
        L2d4:
            r0 = 54719(0xd5bf, float:7.6678E-41)
            goto L2c6
        L2d8:
            r0 = r2
            goto Lc6
        L2db:
            boolean r1 = androidx.emoji2.C1080.m1554(r7, r3)
            r0 = 55432(0xd888, float:7.7677E-41)
        L2e2:
            r2 = 55449(0xd899, float:7.77E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L2ea;
                case 62: goto L2f0;
                case 95: goto L2fa;
                case 124: goto L2f4;
                default: goto L2e9;
            }
        L2e9:
            goto L2e2
        L2ea:
            if (r1 == 0) goto L2f0
            r0 = 55525(0xd8e5, float:7.7807E-41)
            goto L2e2
        L2f0:
            r0 = 55494(0xd8c6, float:7.7764E-41)
            goto L2e2
        L2f4:
            r0 = r3
            goto Lc6
        L2f7:
            r0 = r4
            goto Lc6
        L2fa:
            short[] r0 = m8183()
            r1 = 889(0x379, float:1.246E-42)
            int r2 = androidx.appcompat.C1069.f95
            r2 = r2 ^ (-233(0xffffffffffffff17, float:NaN))
            r3 = 2431(0x97f, float:3.407E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r2, r3)
            goto Lc6
    }

    public static kevin.fun.hook.download.DownloadManager getInstance() {
            java.lang.Class<kevin.fun.hook.download.DownloadManager> r1 = kevin.fun.hook.download.DownloadManager.class
            monitor-enter(r1)
            kevin.fun.hook.download.DownloadManager r2 = m8238()     // Catch: java.lang.Throwable -> L24
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L1e;
                default: goto Le;
            }     // Catch: java.lang.Throwable -> L24
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r2 != 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            kevin.fun.hook.download.DownloadManager r0 = new kevin.fun.hook.download.DownloadManager     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            kevin.fun.hook.download.DownloadManager.instance = r0     // Catch: java.lang.Throwable -> L24
        L1e:
            kevin.fun.hook.download.DownloadManager r0 = m8238()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    private java.lang.String getRandomString(int r6) {
            r5 = this;
            short[] r0 = m8183()
            r1 = 893(0x37d, float:1.251E-42)
            int r2 = androidx.interpolator.C1083.f109
            r2 = r2 ^ (-410(0xfffffffffffffe66, float:NaN))
            r3 = 2973(0xb9d, float:4.166E-42)
            java.lang.String r2 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            r0 = 0
        L1b:
            r1 = 1616(0x650, float:2.264E-42)
        L1d:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L23;
                case 49: goto L26;
                case 204: goto L2b;
                case 239: goto L30;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L1d
        L26:
            if (r0 < r6) goto L23
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L1d
        L2b:
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r3)
            return r0
        L30:
            int r1 = androidx.emoji2.C1080.m1552(r2)
            int r1 = androidx.vectordrawable.C1103.m3150(r4, r1)
            char r1 = androidx.versionedparcelable.C1106.m3404(r2, r1)
            androidx.annotation.experimental.C1067.m601(r3, r1)
            int r1 = com.tencent.mmkv.C1109.f135
            r1 = r1 ^ (-487(0xfffffffffffffe19, float:NaN))
            int r0 = r0 + r1
            r1 = 1740(0x6cc, float:2.438E-42)
        L46:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L4c;
                case 54: goto L1b;
                default: goto L4b;
            }
        L4b:
            goto L46
        L4c:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L46
    }

    private java.lang.String getTimestamp() {
            r10 = this;
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۨۧۨ"
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
                case 1746815: goto L2e;
                case 1746940: goto L3f;
                case 1747867: goto L1e;
                case 1751650: goto L55;
                case 1753571: goto L48;
                case 1753695: goto L36;
                case 1754631: goto L4e;
                case 1755593: goto L26;
                default: goto L12;
            }
        L12:
            r1 = 929(0x3a1, float:1.302E-42)
            r5 = 1175(0x497, float:1.647E-42)
            java.lang.String r1 = androidx.drawerlayout.C1077.m1343(r0, r1, r7, r5)
            java.lang.String r6 = "ۣۣ۟"
            r5 = r1
            goto Lb
        L1e:
            java.lang.String r1 = androidx.appcompat.resources.C1068.m657(r4, r3)
            java.lang.String r6 = "ۤۤۢ"
            r5 = r1
            goto Lb
        L26:
            short[] r0 = m8183()
            java.lang.String r1 = "ۧۧۧ"
            r6 = r1
            goto Lb
        L2e:
            java.util.Locale r1 = androidx.activity.C1064.m382()
            java.lang.String r6 = "ۦۨۡ"
            r2 = r1
            goto Lb
        L36:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r5, r2)
            java.lang.String r6 = "۟ۧۤ"
            r4 = r1
            goto Lb
        L3f:
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r6 = "۠ۦۡ"
            r3 = r1
            goto Lb
        L48:
            r7 = r9 ^ 273(0x111, float:3.83E-43)
            java.lang.String r1 = "۠ۧۡ"
            r6 = r1
            goto Lb
        L4e:
            int r8 = androidx.drawerlayout.C1077.f103
            java.lang.String r1 = "ۦۤۡ"
            r6 = r1
            r9 = r8
            goto Lb
        L55:
            return r5
    }

    private void initNotificationChannel(android.content.Context r8) {
            r7 = this;
            r6 = 0
            android.app.NotificationManager r1 = m8242()
            r0 = 1616(0x650, float:2.264E-42)
        L7:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L15;
                case 239: goto L2d;
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
            short[] r0 = m8183()
            r1 = 944(0x3b0, float:1.323E-42)
            int r2 = androidx.core.ktx.C1070.f96
            r2 = r2 ^ 546(0x222, float:7.65E-43)
            r3 = 2942(0xb7e, float:4.123E-42)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            java.lang.Object r0 = androidx.customview.C1074.m1104(r8, r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            kevin.fun.hook.download.DownloadManager.notificationManager = r0
        L2d:
            android.app.NotificationManager r0 = m8242()
            short[] r1 = m8183()
            r2 = 956(0x3bc, float:1.34E-42)
            int r3 = androidx.interpolator.C1082.f108
            r3 = r3 ^ 329(0x149, float:4.61E-43)
            r4 = 1242(0x4da, float:1.74E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1114.m7940(r1, r2, r3, r4)
            android.app.NotificationChannel r2 = androidx.customview.C1074.m1114(r0, r1)
            r0 = 1740(0x6cc, float:2.438E-42)
        L47:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4d;
                case 54: goto L52;
                case 471: goto L8f;
                case 500: goto L55;
                default: goto L4c;
            }
        L4c:
            goto L47
        L4d:
            if (r2 != 0) goto L52
            r0 = 1833(0x729, float:2.569E-42)
            goto L47
        L52:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L47
        L55:
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            short[] r2 = m8183()
            r3 = 978(0x3d2, float:1.37E-42)
            int r4 = androidx.vectordrawable.animated.C1102.f128
            r4 = r4 ^ 198(0xc6, float:2.77E-43)
            r5 = 2990(0xbae, float:4.19E-42)
            java.lang.String r2 = androidx.loader.C1099.m2843(r2, r3, r4, r5)
            int r3 = androidx.loader.C1099.f125
            r3 = r3 ^ 857(0x359, float:1.201E-42)
            r0.<init>(r1, r2, r3)
            short[] r1 = m8183()
            r2 = 983(0x3d7, float:1.377E-42)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r3 = r3 ^ (-125(0xffffffffffffff83, float:NaN))
            r4 = 1852(0x73c, float:2.595E-42)
            java.lang.String r1 = androidx.vectordrawable.C1104.m3232(r1, r2, r3, r4)
            androidx.core.C1072.m979(r0, r1)
            androidx.lifecycle.viewmodel.C1093.m2372(r0, r6, r6)
            r1 = 0
            androidx.loader.C1097.m2692(r0, r1)
            android.app.NotificationManager r1 = m8242()
            androidx.emoji2.C1080.m1565(r1, r0)
        L8f:
            return
    }

    static /* synthetic */ void lambda$14(android.app.Dialog r9, android.widget.ProgressBar[] r10, int r11, android.widget.TextView[] r12, android.widget.TextView[] r13, long r14, long r16, long r18) {
            r2 = 1616(0x650, float:2.264E-42)
        L2:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L202;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r9 == 0) goto L8
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            boolean r3 = kevin.fun.hook.webdav.C1118.m8498(r9)
            r2 = 1740(0x6cc, float:2.438E-42)
        L16:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L30;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r3 != 0) goto L21
            r2 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            r2 = 1864(0x748, float:2.612E-42)
        L26:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L2c;
                case 47483: goto L202;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            r2 = 0
            r3 = r10[r2]
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L36:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L3e;
                case 45: goto L4e;
                case 76: goto L48;
                case 239: goto L42;
                default: goto L3d;
            }
        L3d:
            goto L36
        L3e:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L36
        L42:
            if (r3 == 0) goto L3e
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L36
        L48:
            r2 = 0
            r2 = r10[r2]
            androidx.loader.C1094.m2504(r2, r11)
        L4e:
            r2 = 0
            r3 = r12[r2]
            r2 = 48891(0xbefb, float:6.8511E-41)
        L54:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 22: goto L5c;
                case 53: goto L8a;
                case 503: goto L60;
                case 32495: goto L66;
                default: goto L5b;
            }
        L5b:
            goto L54
        L5c:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L54
        L60:
            if (r3 == 0) goto L5c
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L54
        L66:
            r2 = 0
            r2 = r12[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r3, r11)
            short[] r4 = m8183()
            r5 = 989(0x3dd, float:1.386E-42)
            r6 = 1
            r7 = 2228(0x8b4, float:3.122E-42)
            java.lang.String r4 = kevin.fun.hook.webdav.C1118.m8509(r4, r5, r6, r7)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)
            androidx.lifecycle.process.C1087.m1946(r2, r3)
        L8a:
            r2 = 0
            r3 = r13[r2]
            r2 = 49666(0xc202, float:6.9597E-41)
        L90:
            r4 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L98;
                case 50: goto L9e;
                case 76: goto La2;
                case 83: goto L18d;
                default: goto L97;
            }
        L97:
            goto L90
        L98:
            if (r3 == 0) goto L9e
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto L90
        L9e:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto L90
        La2:
            r2 = 49790(0xc27e, float:6.977E-41)
        La5:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto Lad;
                case 51: goto L18d;
                case 84: goto Lbb;
                case 241: goto Lb1;
                default: goto Lac;
            }
        Lac:
            goto La5
        Lad:
            r2 = 49852(0xc2bc, float:6.9858E-41)
            goto La5
        Lb1:
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lad
            r2 = 49883(0xc2db, float:6.9901E-41)
            goto La5
        Lbb:
            long r2 = androidx.lifecycle.process.C1089.m2100()
            long r4 = r2 - r16
            r2 = 49914(0xc2fa, float:6.9944E-41)
        Lc4:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 497: goto Lcc;
                case 1711: goto Ld6;
                case 1736: goto L18d;
                case 1769: goto Lda;
                default: goto Lcb;
            }
        Lcb:
            goto Lc4
        Lcc:
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Ld6
            r2 = 50658(0xc5e2, float:7.0987E-41)
            goto Lc4
        Ld6:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto Lc4
        Lda:
            r0 = r18
            double r6 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r6
            double r4 = (double) r4
            double r4 = r2 / r4
            r2 = 50689(0xc601, float:7.103E-41)
        Le9:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto Lf1;
                case 45: goto L192;
                case 50: goto Lfb;
                case 76: goto Lff;
                default: goto Lf0;
            }
        Lf0:
            goto Le9
        Lf1:
            r2 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lfb
            r2 = 50782(0xc65e, float:7.1161E-41)
            goto Le9
        Lfb:
            r2 = 50751(0xc63f, float:7.1117E-41)
            goto Le9
        Lff:
            r2 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r2 = r4 / r2
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = androidx.appcompat.C1069.f95
            r4 = r4 ^ (-237(0xffffffffffffff13, float:NaN))
            r3[r4] = r2
            short[] r2 = m8183()
            r4 = 990(0x3de, float:1.387E-42)
            int r5 = androidx.versionedparcelable.C1106.f132
            r5 = r5 ^ 133(0x85, float:1.86E-43)
            r8 = 783(0x30f, float:1.097E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r4, r5, r8)
            java.lang.String r2 = androidx.versionedparcelable.C1106.m3391(r2, r3)
            r3 = 50813(0xc67d, float:7.1204E-41)
        L127:
            r4 = 50830(0xc68e, float:7.1228E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto L12f;
                case 243: goto L18e;
                default: goto L12e;
            }
        L12e:
            goto L127
        L12f:
            r4 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r4 = r6 / r4
            java.lang.Double r3 = androidx.core.ktx.C1071.m841(r4)
            double r4 = (double) r14
            r6 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r4 = r4 / r6
            java.lang.Double r4 = androidx.core.ktx.C1071.m841(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = org.luckypray.dexkit.C1123.f433
            r6 = r6 ^ (-967(0xfffffffffffffc39, float:NaN))
            r5[r6] = r3
            int r3 = androidx.customview.C1074.f100
            r3 = r3 ^ 242(0xf2, float:3.39E-43)
            r5[r3] = r4
            short[] r3 = m8183()
            r4 = 1016(0x3f8, float:1.424E-42)
            int r6 = androidx.lifecycle.process.C1087.f113
            r6 = r6 ^ (-609(0xfffffffffffffd9f, float:NaN))
            r7 = 1687(0x697, float:2.364E-42)
            java.lang.String r3 = androidx.documentfile.C1076.m1234(r3, r4, r6, r7)
            java.lang.String r3 = androidx.versionedparcelable.C1106.m3391(r3, r5)
            r4 = 0
            r4 = r13[r4]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r5, r3)
            short[] r5 = m8183()
            r6 = 1031(0x407, float:1.445E-42)
            int r7 = com.tencent.mmkv.C1109.f135
            r7 = r7 ^ (-485(0xfffffffffffffe1b, float:NaN))
            r8 = 608(0x260, float:8.52E-43)
            java.lang.String r5 = com.tencent.mmkv.C1109.m3629(r5, r6, r7, r8)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            androidx.lifecycle.process.C1087.m1946(r4, r2)
        L18d:
            return
        L18e:
            r3 = 50844(0xc69c, float:7.1248E-41)
            goto L127
        L192:
            r2 = 51588(0xc984, float:7.229E-41)
        L195:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L19d;
                case 54: goto L1a7;
                case 87: goto L1df;
                case 116: goto L1ab;
                default: goto L19c;
            }
        L19c:
            goto L195
        L19d:
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a7
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L195
        L1a7:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L195
        L1ab:
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r4 / r2
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = androidx.appcompat.resources.C1068.f94
            r4 = r4 ^ 526(0x20e, float:7.37E-43)
            r3[r4] = r2
            short[] r2 = m8183()
            r4 = 999(0x3e7, float:1.4E-42)
            int r5 = androidx.emoji2.viewsintegration.C1078.f104
            r5 = r5 ^ 622(0x26e, float:8.72E-43)
            r8 = 2263(0x8d7, float:3.171E-42)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r4, r5, r8)
            java.lang.String r2 = androidx.versionedparcelable.C1106.m3391(r2, r3)
            r3 = 51712(0xca00, float:7.2464E-41)
        L1d3:
            r4 = 51729(0xca11, float:7.2488E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 14: goto L12f;
                case 15: goto L1da;
                case 16: goto L1da;
                case 17: goto L1db;
                default: goto L1da;
            }
        L1da:
            goto L1d3
        L1db:
            r3 = 51743(0xca1f, float:7.2507E-41)
            goto L1d3
        L1df:
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r4)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = kevin.fun.hook.webdav.C1118.f417
            r4 = r4 ^ (-363(0xfffffffffffffe95, float:NaN))
            r3[r4] = r2
            short[] r2 = m8183()
            r4 = 1008(0x3f0, float:1.413E-42)
            int r5 = kevin.fun.hook.audio.C1117.f406
            r5 = r5 ^ 65
            r8 = 2770(0xad2, float:3.882E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1084.m1796(r2, r4, r5, r8)
            java.lang.String r2 = androidx.versionedparcelable.C1106.m3391(r2, r3)
            goto L12f
        L202:
            int r3 = androidx.emoji2.viewsintegration.C1079.m1471()
            r2 = 51836(0xca7c, float:7.2638E-41)
        L209:
            r4 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 241: goto L211;
                case 1963: goto L217;
                case 1992: goto L18d;
                case 2025: goto L21b;
                default: goto L210;
            }
        L210:
            goto L209
        L211:
            if (r3 < 0) goto L217
            r2 = 52580(0xcd64, float:7.368E-41)
            goto L209
        L217:
            r2 = 52549(0xcd45, float:7.3637E-41)
            goto L209
        L21b:
            java.lang.String r2 = "wGTlUgdm3wOoqstw"
            java.lang.String r2 = androidx.loader.C1099.m2832(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            goto L18d
    }

    static /* synthetic */ void lambda$16() {
            android.app.NotificationManager r1 = m8242()
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
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.NotificationManager r0 = m8242()
            int r1 = androidx.versionedparcelable.C1106.f132
            r1 = r1 ^ 10141(0x279d, float:1.421E-41)
            androidx.interpolator.C1081.m1622(r0, r1)
        L1f:
            return
    }

    static /* synthetic */ void lambda$7(android.app.Dialog[] r3) {
            r2 = 0
            r1 = r3[r2]
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L2e;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r1 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = r3[r2]
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L21;
                case 54: goto L26;
                case 471: goto L2e;
                case 500: goto L29;
                default: goto L20;
            }
        L20:
            goto L1b
        L21:
            if (r1 == 0) goto L26
            r0 = 1833(0x729, float:2.569E-42)
            goto L1b
        L26:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1b
        L29:
            r0 = r3[r2]
            androidx.customview.C1074.m1118(r0)
        L2e:
            return
    }

    private void showBatchProgressDialog(android.content.Context r5, int r6, java.lang.String r7) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۣ۟ۤ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746691: goto L1d;
                case 1746966: goto L24;
                case 1749858: goto L14;
                default: goto Lc;
            }
        Lc:
            android.os.Handler r1 = m8230()
            java.lang.String r3 = "ۢۨۨ"
            r2 = r1
            goto L5
        L14:
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda6 r0 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda6
            r0.<init>(r4, r5, r6, r7)
            java.lang.String r1 = "ۣ۟۟"
            r3 = r1
            goto L5
        L1d:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "۟ۨ۟"
            r3 = r1
            goto L5
        L24:
            return
    }

    private void showCustomToast(android.content.Context r9, java.lang.String r10, int r11) {
            r8 = this;
            r5 = 1101004800(0x41a00000, float:20.0)
            r6 = 1094713344(0x41400000, float:12.0)
            r7 = 0
            r0 = 1616(0x650, float:2.264E-42)
        L7:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L7b;
                case 239: goto L15;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r9 != 0) goto Ld
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            android.widget.Toast r0 = new android.widget.Toast
            r0.<init>(r9)
            androidx.lifecycle.process.C1091.m2266(r0, r7)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            androidx.customview.C1074.m1119(r1, r7)
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-116(0xffffffffffffff8c, float:NaN))
            androidx.emoji2.C1080.m1542(r1, r2)
            int r3 = m8172(r8, r9, r5)
            int r4 = m8172(r8, r9, r6)
            int r5 = m8172(r8, r9, r5)
            int r6 = m8172(r8, r9, r6)
            androidx.drawerlayout.C1077.m1314(r1, r3, r4, r5, r6)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r3, r11)
            r4 = 1103626240(0x41c80000, float:25.0)
            int r4 = m8172(r8, r9, r4)
            float r4 = (float) r4
            androidx.lifecycle.process.C1091.m2252(r3, r4)
            androidx.activity.C1065.m397(r1, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r9)
            androidx.lifecycle.process.C1087.m1946(r3, r10)
            int r4 = androidx.vectordrawable.C1105.f131
            r4 = r4 ^ (-359(0xfffffffffffffe99, float:NaN))
            kevin.fun.hook.webdav.C1118.m8517(r3, r4)
            r4 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r4)
            android.graphics.Typeface r4 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r3, r4)
            androidx.activity.C1064.m372(r1, r3)
            androidx.core.C1073.m1022(r0, r1)
            androidx.interpolator.C1082.m1705(r0, r2, r7, r7)
            androidx.viewpager.C1108.m3524(r0)
        L7b:
            return
    }

    private void showDownloadCompleteNotification(android.content.Context r7, java.lang.String r8, boolean r9) {
            r6 = this;
            android.app.NotificationManager r1 = m8242()     // Catch: java.lang.Throwable -> Ld9
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }     // Catch: java.lang.Throwable -> Ld9
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
            m8213(r6, r7)     // Catch: java.lang.Throwable -> Ld9
        L17:
            androidx.core.app.NotificationCompat$Builder r2 = new androidx.core.app.NotificationCompat$Builder     // Catch: java.lang.Throwable -> Ld9
            short[] r0 = m8183()     // Catch: java.lang.Throwable -> Ld9
            r1 = 1034(0x40a, float:1.449E-42)
            int r3 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> Ld9
            r3 = r3 ^ 777(0x309, float:1.089E-42)
            r4 = 2509(0x9cd, float:3.516E-42)
            java.lang.String r0 = androidx.core.ktx.C1071.m874(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> Ld9
            r2.<init>(r7, r0)     // Catch: java.lang.Throwable -> Ld9
            r0 = 1740(0x6cc, float:2.438E-42)
        L2e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L34;
                case 54: goto L39;
                case 471: goto L4b;
                case 500: goto L3c;
                default: goto L33;
            }     // Catch: java.lang.Throwable -> Ld9
        L33:
            goto L2e
        L34:
            if (r9 == 0) goto L39
            r0 = 1833(0x729, float:2.569E-42)
            goto L2e
        L39:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2e
        L3c:
            r0 = 17301634(0x1080082, float:2.497962E-38)
            r1 = 1864(0x748, float:2.612E-42)
        L41:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L47;
                case 47483: goto L4e;
                default: goto L46;
            }     // Catch: java.lang.Throwable -> Ld9
        L46:
            goto L41
        L47:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L41
        L4b:
            r0 = 17301624(0x1080078, float:2.497959E-38)
        L4e:
            androidx.core.app.NotificationCompat$Builder r2 = androidx.documentfile.C1076.m1221(r2, r0)     // Catch: java.lang.Throwable -> Ld9
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L55:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L5d;
                case 45: goto Lc8;
                case 76: goto L67;
                case 239: goto L61;
                default: goto L5c;
            }     // Catch: java.lang.Throwable -> Ld9
        L5c:
            goto L55
        L5d:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L55
        L61:
            if (r9 == 0) goto L5d
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L55
        L67:
            short[] r0 = m8183()     // Catch: java.lang.Throwable -> Ld9
            r1 = 1056(0x420, float:1.48E-42)
            int r3 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> Ld9
            r3 = r3 ^ (-269(0xfffffffffffffef3, float:NaN))
            r4 = 755(0x2f3, float:1.058E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1796(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> Ld9
            r1 = 48891(0xbefb, float:6.8511E-41)
        L7a:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 22: goto L82;
                case 503: goto Lc4;
                default: goto L81;
            }     // Catch: java.lang.Throwable -> Ld9
        L81:
            goto L7a
        L82:
            androidx.core.app.NotificationCompat$Builder r0 = androidx.versionedparcelable.C1106.m3365(r2, r0)     // Catch: java.lang.Throwable -> Ld9
            androidx.core.app.NotificationCompat$Builder r0 = androidx.lifecycle.process.C1090.m2205(r0, r8)     // Catch: java.lang.Throwable -> Ld9
            r1 = 1
            androidx.core.app.NotificationCompat$Builder r0 = kevin.fun.hook.audio.C1115.m7998(r0, r1)     // Catch: java.lang.Throwable -> Ld9
            r1 = 0
            androidx.core.app.NotificationCompat$Builder r0 = androidx.lifecycle.process.C1089.m2144(r0, r1)     // Catch: java.lang.Throwable -> Ld9
            android.app.NotificationManager r1 = m8242()     // Catch: java.lang.Throwable -> Ld9
            android.app.Notification r0 = androidx.lifecycle.process.C1088.m2048(r0)     // Catch: java.lang.Throwable -> Ld9
            int r2 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> Ld9
            r2 = r2 ^ 9230(0x240e, float:1.2934E-41)
            androidx.lifecycle.viewmodel.C1093.m2394(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld9
            android.os.Handler r0 = m8230()     // Catch: java.lang.Throwable -> Ld9
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda1 r1 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> Ld9
            r1.<init>()     // Catch: java.lang.Throwable -> Ld9
            r2 = -2472(0xfffffffffffff658, double:NaN)
            int r4 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> Ld9
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Ld9
            long r2 = r2 ^ r4
            androidx.loader.C1095.m2588(r0, r1, r2)     // Catch: java.lang.Throwable -> Ld9
            r0 = 49666(0xc202, float:6.9597E-41)
        Lb8:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Lc0;
                case 50: goto L102;
                default: goto Lbf;
            }     // Catch: java.lang.Throwable -> Ld9
        Lbf:
            goto Lb8
        Lc0:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lb8
        Lc4:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto L7a
        Lc8:
            short[] r0 = m8183()     // Catch: java.lang.Throwable -> Ld9
            r1 = 1060(0x424, float:1.485E-42)
            int r3 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> Ld9
            r3 = r3 ^ (-367(0xfffffffffffffe91, float:NaN))
            r4 = 1126(0x466, float:1.578E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> Ld9
            goto L82
        Ld9:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8183()
            r3 = 1064(0x428, float:1.491E-42)
            int r4 = androidx.customview.C1075.f101
            r4 = r4 ^ (-127(0xffffffffffffff81, float:NaN))
            r5 = 543(0x21f, float:7.61E-43)
            java.lang.String r2 = kevin.fun.hook.webdav.C1118.m8509(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8215(r0)
        L102:
            return
    }

    private void showDownloadProgressNotification(android.content.Context r7, java.lang.String r8, int r9, long r10, long r12) {
            r6 = this;
            android.app.NotificationManager r1 = m8242()     // Catch: java.lang.Throwable -> L178
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }     // Catch: java.lang.Throwable -> L178
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
            m8213(r6, r7)     // Catch: java.lang.Throwable -> L178
        L17:
            androidx.core.app.NotificationCompat$Builder r1 = m8241()     // Catch: java.lang.Throwable -> L178
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L9e;
                case 500: goto L2b;
                default: goto L22;
            }     // Catch: java.lang.Throwable -> L178
        L22:
            goto L1d
        L23:
            if (r1 != 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L178
            r0.<init>()     // Catch: java.lang.Throwable -> L178
            r1 = 0
            r2 = 201326943(0xc00015f, float:9.861174E-32)
            int r3 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L178
            r2 = r2 ^ r3
            android.app.PendingIntent r0 = androidx.viewpager.C1108.m3530(r7, r1, r0, r2)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder     // Catch: java.lang.Throwable -> L178
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L178
            r3 = 1091(0x443, float:1.529E-42)
            int r4 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L178
            r4 = r4 ^ (-522(0xfffffffffffffdf6, float:NaN))
            r5 = 2240(0x8c0, float:3.139E-42)
            java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L178
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L178
            r2 = -17301898(0xfffffffffef7fe76, float:-1.6482028E38)
            int r3 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L178
            r2 = r2 ^ r3
            androidx.core.app.NotificationCompat$Builder r1 = androidx.documentfile.C1076.m1221(r1, r2)     // Catch: java.lang.Throwable -> L178
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L178
            r3 = 1113(0x459, float:1.56E-42)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L178
            r4 = r4 ^ (-930(0xfffffffffffffc5e, float:NaN))
            r5 = 564(0x234, float:7.9E-43)
            java.lang.String r2 = androidx.documentfile.C1076.m1234(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r1 = androidx.versionedparcelable.C1106.m3365(r1, r2)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r1 = androidx.lifecycle.process.C1090.m2205(r1, r8)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r0 = androidx.activity.C1062.m226(r1, r0)     // Catch: java.lang.Throwable -> L178
            r1 = 1
            androidx.core.app.NotificationCompat$Builder r0 = kevin.fun.hook.webdav.C1118.m8473(r0, r1)     // Catch: java.lang.Throwable -> L178
            int r1 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L178
            r1 = r1 ^ 958(0x3be, float:1.342E-42)
            androidx.core.app.NotificationCompat$Builder r0 = androidx.lifecycle.process.C1089.m2144(r0, r1)     // Catch: java.lang.Throwable -> L178
            r1 = 1
            androidx.core.app.NotificationCompat$Builder r0 = androidx.lifecycle.livedata.C1085.m1854(r0, r1)     // Catch: java.lang.Throwable -> L178
            short[] r1 = m8183()     // Catch: java.lang.Throwable -> L178
            r2 = 1117(0x45d, float:1.565E-42)
            int r3 = com.tencent.mmkv.C1109.f135     // Catch: java.lang.Throwable -> L178
            r3 = r3 ^ (-496(0xfffffffffffffe10, float:NaN))
            r4 = 1273(0x4f9, float:1.784E-42)
            java.lang.String r1 = androidx.lifecycle.viewmodel.C1093.m2415(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r0 = androidx.lifecycle.livedata.C1085.m1825(r0, r1)     // Catch: java.lang.Throwable -> L178
            kevin.fun.hook.download.DownloadManager.notificationBuilder = r0     // Catch: java.lang.Throwable -> L178
        L9e:
            androidx.core.app.NotificationCompat$Builder r0 = m8241()     // Catch: java.lang.Throwable -> L178
            int r1 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L178
            r1 = r1 ^ 378(0x17a, float:5.3E-43)
            r2 = 0
            androidx.vectordrawable.C1105.m3266(r0, r1, r9, r2)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r0 = m8241()     // Catch: java.lang.Throwable -> L178
            short[] r1 = m8183()     // Catch: java.lang.Throwable -> L178
            r2 = 1125(0x465, float:1.576E-42)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L178
            r3 = r3 ^ 644(0x284, float:9.02E-43)
            r4 = 2831(0xb0f, float:3.967E-42)
            java.lang.String r1 = kevin.fun.hook.webdav.C1118.m8509(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L178
            java.lang.Integer r2 = androidx.activity.C1064.m334(r9)     // Catch: java.lang.Throwable -> L178
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L178
            int r4 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L178
            r4 = r4 ^ 595(0x253, float:8.34E-43)
            r3[r4] = r8     // Catch: java.lang.Throwable -> L178
            int r4 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L178
            r4 = r4 ^ (-445(0xfffffffffffffe43, float:NaN))
            r3[r4] = r2     // Catch: java.lang.Throwable -> L178
            java.lang.String r1 = androidx.versionedparcelable.C1106.m3391(r1, r3)     // Catch: java.lang.Throwable -> L178
            androidx.lifecycle.process.C1090.m2205(r0, r1)     // Catch: java.lang.Throwable -> L178
            r0 = 1864(0x748, float:2.612E-42)
        Lda:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto Le0;
                case 47384: goto L141;
                case 47417: goto Lee;
                case 47483: goto Lea;
                default: goto Ldf;
            }     // Catch: java.lang.Throwable -> L178
        Ldf:
            goto Lda
        Le0:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lea
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto Lda
        Lea:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto Lda
        Lee:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lf1:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto Lf9;
                case 45: goto L141;
                case 76: goto L107;
                case 239: goto Lfd;
                default: goto Lf8;
            }     // Catch: java.lang.Throwable -> L178
        Lf8:
            goto Lf1
        Lf9:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lf1
        Lfd:
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf9
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lf1
        L107:
            short[] r0 = m8183()     // Catch: java.lang.Throwable -> L178
            r1 = 1134(0x46e, float:1.589E-42)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L178
            r2 = r2 ^ (-118(0xffffffffffffff8a, float:NaN))
            r3 = 2490(0x9ba, float:3.489E-42)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L178
            double r2 = (double) r10     // Catch: java.lang.Throwable -> L178
            r4 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r2 = r2 / r4
            java.lang.Double r1 = androidx.core.ktx.C1071.m841(r2)     // Catch: java.lang.Throwable -> L178
            double r2 = (double) r12     // Catch: java.lang.Throwable -> L178
            r4 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r2 = r2 / r4
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r2)     // Catch: java.lang.Throwable -> L178
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L178
            int r4 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L178
            r4 = r4 ^ 243(0xf3, float:3.4E-43)
            r3[r4] = r1     // Catch: java.lang.Throwable -> L178
            int r1 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L178
            r1 = r1 ^ 899(0x383, float:1.26E-42)
            r3[r1] = r2     // Catch: java.lang.Throwable -> L178
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3391(r0, r3)     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r1 = m8241()     // Catch: java.lang.Throwable -> L178
            androidx.activity.C1064.m360(r1, r0)     // Catch: java.lang.Throwable -> L178
        L141:
            android.app.NotificationManager r0 = m8242()     // Catch: java.lang.Throwable -> L178
            androidx.core.app.NotificationCompat$Builder r1 = m8241()     // Catch: java.lang.Throwable -> L178
            android.app.Notification r1 = androidx.lifecycle.process.C1088.m2048(r1)     // Catch: java.lang.Throwable -> L178
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L178
            r2 = r2 ^ 9628(0x259c, float:1.3492E-41)
            androidx.lifecycle.viewmodel.C1093.m2394(r0, r2, r1)     // Catch: java.lang.Throwable -> L178
            r0 = 48891(0xbefb, float:6.8511E-41)
        L157:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L15f;
                case 503: goto L174;
                default: goto L15e;
            }
        L15e:
            goto L157
        L15f:
            int r1 = androidx.annotation.experimental.C1067.m596()
            r0 = 49666(0xc202, float:6.9597E-41)
        L166:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L16e;
                case 50: goto L1a2;
                case 76: goto L1a6;
                case 83: goto L1b5;
                default: goto L16d;
            }
        L16d:
            goto L166
        L16e:
            if (r1 < 0) goto L1a2
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L166
        L174:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L157
        L178:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8183()
            r3 = 1149(0x47d, float:1.61E-42)
            int r4 = kevin.fun.hook.webdav.C1118.f417
            r4 = r4 ^ (-372(0xfffffffffffffe8c, float:NaN))
            r5 = 1038(0x40e, float:1.455E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1087.m2008(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8215(r0)
            goto L15f
        L1a2:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L166
        L1a6:
            java.lang.String r0 = "qMdBntlSV9e19bRaDUxJG3L0uP6Gq"
            java.lang.String r0 = androidx.interpolator.C1083.m1724(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L1b5:
            return
    }

    private void showErrorToast(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r0 = -769496(0xfffffffffff44228, float:NaN)
            int r1 = androidx.drawerlayout.C1077.f103
            r0 = r0 ^ r1
            m8234(r2, r3, r4, r0)
            int r1 = com.tencent.mmkv.C1109.m3598()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L2c;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "4Xj5ZTpIln4bXeIulyLOB7wI06J"
            java.lang.String r0 = androidx.core.C1072.m925(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    private void showSuccessToast(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            r2 = 0
            java.lang.String r0 = "ۣۣۧ"
            r1 = r2
            r3 = r2
        L5:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1747902: goto Ld;
                case 1750663: goto L1c;
                case 1753453: goto L16;
                default: goto Lc;
            }
        Lc:
            return
        Ld:
            r0 = 11751491(0xb35043, float:1.6467346E-38)
            r2 = r0 ^ r1
            java.lang.String r0 = "ۦ۠ۧ"
            r3 = r2
            goto L5
        L16:
            m8234(r4, r5, r6, r3)
            java.lang.String r0 = "ۥۧ"
            goto L5
        L1c:
            int r1 = androidx.appcompat.C1069.f95
            java.lang.String r0 = "۠ۧۥ"
            goto L5
    }

    private void startDownload(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r8 = this;
            r7 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.loader.C1098.m2793()
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
            if (r1 < 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "9HxB"
            java.lang.String r0 = androidx.loader.C1099.m2832(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2e:
            return
    }

    private void startDownload(android.content.Context r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, boolean r42) {
            r35 = this;
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r0 = r36
            r4.<init>(r0)
            r2 = 1
            android.app.Dialog[] r5 = new android.app.Dialog[r2]
            r2 = 1
            android.widget.TextView[] r13 = new android.widget.TextView[r2]
            r2 = 1
            android.widget.ProgressBar[] r14 = new android.widget.ProgressBar[r2]
            r2 = 1
            android.widget.TextView[] r15 = new android.widget.TextView[r2]
            long r32 = androidx.lifecycle.process.C1089.m2100()
            r2 = 1
            boolean[] r9 = new boolean[r2]
            r2 = 1
            okhttp3.Call[] r10 = new okhttp3.Call[r2]
            r2 = 1
            android.net.Uri[] r11 = new android.net.Uri[r2]
            r2 = 1
            boolean[] r8 = new boolean[r2]
            r2 = 1616(0x650, float:2.264E-42)
        L25:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L2b;
                case 49: goto L2e;
                case 204: goto L33;
                case 239: goto L49;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L25
        L2e:
            if (r42 == 0) goto L2b
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L25
        L33:
            android.os.Handler r16 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda14 r2 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda14
            r3 = r35
            r6 = r41
            r7 = r39
            r12 = r36
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            androidx.activity.C1062.m178(r0, r2)
        L49:
            java.util.concurrent.ExecutorService r2 = m8239()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15 r17 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15
            r18 = r35
            r19 = r9
            r20 = r39
            r21 = r37
            r22 = r38
            r23 = r36
            r24 = r11
            r25 = r10
            r26 = r42
            r27 = r8
            r28 = r5
            r29 = r13
            r30 = r14
            r31 = r15
            r34 = r41
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
            r0 = r17
            androidx.activity.C1063.m244(r2, r0)
            return
    }

    private void synthesizeAndSaveLivePhoto(android.content.Context r16, java.lang.String r17, java.lang.String r18, boolean r19, java.lang.String r20) throws java.lang.Exception {
            r15 = this;
            java.io.File r2 = androidx.emoji2.viewsintegration.C1079.m1489(r16)
            java.lang.String r2 = androidx.loader.C1099.m2839(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)
            short[] r3 = m8183()
            r4 = 1174(0x496, float:1.645E-42)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r5 = r5 ^ 668(0x29c, float:9.36E-43)
            r6 = 1805(0x70d, float:2.53E-42)
            java.lang.String r3 = androidx.core.ktx.C1071.m874(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8573(r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r5)
            boolean r4 = androidx.vectordrawable.C1105.m3294(r3)
            r2 = 1616(0x650, float:2.264E-42)
        L34:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L3a;
                case 49: goto L3d;
                case 204: goto L42;
                case 239: goto L89;
                default: goto L39;
            }
        L39:
            goto L34
        L3a:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L34
        L3d:
            if (r4 != 0) goto L3a
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L34
        L42:
            boolean r3 = androidx.lifecycle.process.C1090.m2220(r3)
            r2 = 1740(0x6cc, float:2.438E-42)
        L48:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L4e;
                case 54: goto L53;
                case 471: goto L62;
                case 500: goto L56;
                default: goto L4d;
            }
        L4d:
            goto L48
        L4e:
            if (r3 == 0) goto L53
            r2 = 1833(0x729, float:2.569E-42)
            goto L48
        L53:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L48
        L56:
            r2 = 1864(0x748, float:2.612E-42)
        L58:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L5e;
                case 47483: goto L89;
                default: goto L5d;
            }
        L5d:
            goto L58
        L5e:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto L58
        L62:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            short[] r4 = m8183()
            r6 = 1191(0x4a7, float:1.669E-42)
            int r7 = kevin.fun.hook.audio.C1114.f403
            r7 = r7 ^ (-26)
            r8 = 536(0x218, float:7.51E-43)
            java.lang.String r4 = androidx.vectordrawable.C1105.m3247(r4, r6, r7, r8)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)
            r2.<init>(r3)
            throw r2
        L89:
            long r2 = androidx.lifecycle.process.C1089.m2100()
            int r4 = androidx.loader.C1097.f123
            r4 = r4 ^ 119(0x77, float:1.67E-43)
            java.lang.String r6 = m8187(r15, r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = androidx.lifecycle.livedata.C1085.m1859(r7, r5)
            short[] r8 = m8183()
            r9 = 1201(0x4b1, float:1.683E-42)
            int r10 = androidx.interpolator.C1083.f109
            r10 = r10 ^ (-439(0xfffffffffffffe49, float:NaN))
            r11 = 501(0x1f5, float:7.02E-43)
            java.lang.String r8 = androidx.activity.C1065.m410(r8, r9, r10, r11)
            java.lang.StringBuilder r7 = androidx.lifecycle.livedata.C1085.m1859(r7, r8)
            java.lang.StringBuilder r2 = androidx.loader.C1097.m2720(r7, r2)
            short[] r3 = m8183()
            r7 = 1212(0x4bc, float:1.698E-42)
            r8 = 1
            r9 = 3203(0xc83, float:4.488E-42)
            java.lang.String r3 = androidx.vectordrawable.C1104.m3232(r3, r7, r8, r9)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)
            short[] r6 = m8183()
            r7 = 1213(0x4bd, float:1.7E-42)
            int r8 = androidx.lifecycle.process.C1087.f113
            r8 = r8 ^ (-620(0xfffffffffffffd94, float:NaN))
            r9 = 1819(0x71b, float:2.549E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1087.m2008(r6, r7, r8, r9)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)
            java.lang.String r7 = kevin.fun.hook.webdav.C1119.m8573(r2)
            long r8 = androidx.lifecycle.process.C1089.m2100()
            java.lang.String r2 = m8187(r15, r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = androidx.lifecycle.livedata.C1085.m1859(r10, r5)
            short[] r11 = m8183()
            r12 = 1217(0x4c1, float:1.705E-42)
            int r13 = org.luckypray.dexkit.C1124.f434
            r13 = r13 ^ 664(0x298, float:9.3E-43)
            r14 = 3056(0xbf0, float:4.282E-42)
            java.lang.String r11 = androidx.lifecycle.livedata.C1084.m1796(r11, r12, r13, r14)
            java.lang.StringBuilder r10 = androidx.lifecycle.livedata.C1085.m1859(r10, r11)
            java.lang.StringBuilder r8 = androidx.loader.C1097.m2720(r10, r8)
            java.lang.StringBuilder r8 = androidx.lifecycle.livedata.C1085.m1859(r8, r3)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r8, r2)
            short[] r8 = m8183()
            r9 = 1228(0x4cc, float:1.721E-42)
            int r10 = androidx.vectordrawable.C1105.f131
            r10 = r10 ^ 354(0x162, float:4.96E-43)
            r11 = 2700(0xa8c, float:3.784E-42)
            java.lang.String r8 = androidx.lifecycle.process.C1089.m2127(r8, r9, r10, r11)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r8)
            java.lang.String r8 = kevin.fun.hook.webdav.C1119.m8573(r2)
            long r10 = androidx.lifecycle.process.C1089.m2100()
            java.lang.String r2 = m8187(r15, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            short[] r9 = m8183()
            r12 = 1232(0x4d0, float:1.726E-42)
            int r13 = kevin.fun.hook.audio.C1117.f406
            r13 = r13 ^ 66
            r14 = 1897(0x769, float:2.658E-42)
            java.lang.String r9 = androidx.loader.C1098.m2787(r9, r12, r13, r14)
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r9)
            java.lang.StringBuilder r4 = androidx.loader.C1097.m2720(r4, r10)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r7)
            r0 = r17
            m8178(r15, r0, r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r8)
            r0 = r18
            m8178(r15, r0, r3)
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            java.io.File r9 = new java.io.File
            r9.<init>(r8)
            boolean r4 = androidx.vectordrawable.C1105.m3294(r6)
            r3 = 48767(0xbe7f, float:6.8337E-41)
        L18a:
            r10 = 48784(0xbe90, float:6.8361E-41)
            r3 = r3 ^ r10
            switch(r3) {
                case 14: goto L192;
                case 45: goto L321;
                case 76: goto L19c;
                case 239: goto L196;
                default: goto L191;
            }
        L191:
            goto L18a
        L192:
            r3 = 48829(0xbebd, float:6.8424E-41)
            goto L18a
        L196:
            if (r4 == 0) goto L192
            r3 = 48860(0xbedc, float:6.8467E-41)
            goto L18a
        L19c:
            long r10 = androidx.interpolator.C1081.m1571(r6)
            r3 = 48891(0xbefb, float:6.8511E-41)
        L1a3:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 22: goto L1ab;
                case 53: goto L321;
                case 503: goto L1af;
                case 32495: goto L1b9;
                default: goto L1aa;
            }
        L1aa:
            goto L1a3
        L1ab:
            r3 = 48953(0xbf39, float:6.8598E-41)
            goto L1a3
        L1af:
            r12 = 0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L1ab
            r3 = 49635(0xc1e3, float:6.9553E-41)
            goto L1a3
        L1b9:
            boolean r4 = androidx.vectordrawable.C1105.m3294(r9)
            r3 = 49666(0xc202, float:6.9597E-41)
        L1c0:
            r7 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r7
            switch(r3) {
                case 17: goto L1c8;
                case 50: goto L1ce;
                case 76: goto L1d2;
                case 83: goto L2fa;
                default: goto L1c7;
            }
        L1c7:
            goto L1c0
        L1c8:
            if (r4 == 0) goto L1ce
            r3 = 49759(0xc25f, float:6.9727E-41)
            goto L1c0
        L1ce:
            r3 = 49728(0xc240, float:6.9684E-41)
            goto L1c0
        L1d2:
            long r10 = androidx.interpolator.C1081.m1571(r9)
            r3 = 49790(0xc27e, float:6.977E-41)
        L1d9:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto L1e1;
                case 51: goto L2fa;
                case 84: goto L1ef;
                case 241: goto L1e5;
                default: goto L1e0;
            }
        L1e0:
            goto L1d9
        L1e1:
            r3 = 49852(0xc2bc, float:6.9858E-41)
            goto L1d9
        L1e5:
            r12 = 0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L1e1
            r3 = 49883(0xc2db, float:6.9901E-41)
            goto L1d9
        L1ef:
            r0 = r16
            r1 = r17
            m8220(r15, r0, r1, r8, r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r7 = androidx.vectordrawable.C1105.m3294(r3)
            r4 = 49914(0xc2fa, float:6.9944E-41)
        L202:
            r8 = 49931(0xc30b, float:6.9968E-41)
            r4 = r4 ^ r8
            switch(r4) {
                case 497: goto L20a;
                case 1711: goto L210;
                case 1736: goto L231;
                case 1769: goto L214;
                default: goto L209;
            }
        L209:
            goto L202
        L20a:
            if (r7 == 0) goto L210
            r4 = 50658(0xc5e2, float:7.0987E-41)
            goto L202
        L210:
            r4 = 50627(0xc5c3, float:7.0944E-41)
            goto L202
        L214:
            long r10 = androidx.interpolator.C1081.m1571(r3)
            r4 = 50689(0xc601, float:7.103E-41)
        L21b:
            r7 = 50706(0xc612, float:7.1054E-41)
            r4 = r4 ^ r7
            switch(r4) {
                case 19: goto L223;
                case 45: goto L26b;
                case 50: goto L22d;
                case 76: goto L231;
                default: goto L222;
            }
        L222:
            goto L21b
        L223:
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 != 0) goto L22d
            r4 = 50782(0xc65e, float:7.1161E-41)
            goto L21b
        L22d:
            r4 = 50751(0xc63f, float:7.1117E-41)
            goto L21b
        L231:
            long r10 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3810(r3)
            java.io.File r3 = m8235(r15, r5, r10)
            r4 = 50813(0xc67d, float:7.1204E-41)
        L23c:
            r5 = 50830(0xc68e, float:7.1228E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 18: goto L244;
                case 53: goto L2d3;
                case 243: goto L248;
                case 4075: goto L24e;
                default: goto L243;
            }
        L243:
            goto L23c
        L244:
            r4 = 50875(0xc6bb, float:7.1291E-41)
            goto L23c
        L248:
            if (r3 == 0) goto L244
            r4 = 51557(0xc965, float:7.2247E-41)
            goto L23c
        L24e:
            boolean r5 = androidx.vectordrawable.C1105.m3294(r3)
            r4 = 51588(0xc984, float:7.229E-41)
        L255:
            r7 = 51605(0xc995, float:7.2314E-41)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto L25d;
                case 54: goto L263;
                case 87: goto L2d3;
                case 116: goto L267;
                default: goto L25c;
            }
        L25c:
            goto L255
        L25d:
            if (r5 == 0) goto L263
            r4 = 51681(0xc9e1, float:7.242E-41)
            goto L255
        L263:
            r4 = 51650(0xc9c2, float:7.2377E-41)
            goto L255
        L267:
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r3)
        L26b:
            short[] r4 = m8183()
            r5 = 1243(0x4db, float:1.742E-42)
            int r7 = androidx.appcompat.C1069.f95
            r7 = r7 ^ (-231(0xffffffffffffff19, float:NaN))
            r8 = 1328(0x530, float:1.861E-42)
            java.lang.String r4 = androidx.interpolator.C1081.m1616(r4, r5, r7, r8)
            r0 = r16
            r1 = r20
            android.net.Uri r4 = m8202(r15, r0, r1, r4)
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            r0 = r16
            m8236(r15, r0, r5, r4)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = m8177(r15)
            boolean r4 = androidx.vectordrawable.animated.C1102.m3111(r2)
            r2 = 51712(0xca00, float:7.2464E-41)
        L298:
            r5 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L2a0;
                case 17: goto L2a4;
                case 47: goto L2c9;
                case 76: goto L2aa;
                default: goto L29f;
            }
        L29f:
            goto L298
        L2a0:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L298
        L2a4:
            if (r4 != 0) goto L2a0
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L298
        L2aa:
            android.os.Handler r2 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda16 r4 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda16
            r0 = r19
            r1 = r16
            r4.<init>(r15, r0, r1)
            androidx.activity.C1062.m178(r2, r4)
            r2 = 51836(0xca7c, float:7.2638E-41)
        L2bd:
            r4 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 241: goto L2c5;
                case 1963: goto L2c9;
                default: goto L2c4;
            }
        L2c4:
            goto L2bd
        L2c5:
            r2 = 52518(0xcd26, float:7.3593E-41)
            goto L2bd
        L2c9:
            androidx.loader.C1095.m2548(r6)
            androidx.loader.C1095.m2548(r9)
            androidx.loader.C1095.m2548(r3)
            return
        L2d3:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            short[] r5 = m8183()
            r6 = 1253(0x4e5, float:1.756E-42)
            int r7 = androidx.loader.C1099.f125
            r7 = r7 ^ 850(0x352, float:1.191E-42)
            r8 = 2022(0x7e6, float:2.833E-42)
            java.lang.String r5 = androidx.vectordrawable.C1104.m3232(r5, r6, r7, r8)
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r4, r2)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            r3.<init>(r2)
            throw r3
        L2fa:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            short[] r4 = m8183()
            r5 = 1262(0x4ee, float:1.768E-42)
            int r6 = androidx.annotation.experimental.C1067.f93
            r6 = r6 ^ (-62)
            r7 = 632(0x278, float:8.86E-43)
            java.lang.String r4 = androidx.lifecycle.livedata.C1086.m1920(r4, r5, r6, r7)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r8)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)
            r2.<init>(r3)
            throw r2
        L321:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            short[] r4 = m8183()
            r5 = 1270(0x4f6, float:1.78E-42)
            int r6 = androidx.loader.C1094.f120
            r6 = r6 ^ 380(0x17c, float:5.32E-43)
            r8 = 1636(0x664, float:2.293E-42)
            java.lang.String r4 = androidx.customview.C1074.m1116(r4, r5, r6, r8)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r7)
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)
            r2.<init>(r3)
            throw r2
    }

    private void synthesizeLivePhoto(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r11 = this;
            r3 = 0
            short[] r1 = m8183()
            r2 = 1278(0x4fe, float:1.791E-42)
            int r4 = androidx.loader.C1097.f123
            r4 = r4 ^ 123(0x7b, float:1.72E-43)
            r5 = 3069(0xbfd, float:4.3E-42)
            java.lang.String r5 = androidx.vectordrawable.C1103.m3132(r1, r2, r4, r5)
            java.io.File r4 = m8237(r11, r12, r13)     // Catch: java.lang.Throwable -> L484
            r1 = 1616(0x650, float:2.264E-42)
        L17:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L1d;
                case 49: goto L20;
                case 204: goto L25;
                case 239: goto L46e;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L17
        L20:
            if (r4 == 0) goto L1d
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L17
        L25:
            boolean r2 = androidx.vectordrawable.C1105.m3294(r4)     // Catch: java.lang.Throwable -> L4aa
            r1 = 1740(0x6cc, float:2.438E-42)
        L2b:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L31;
                case 54: goto L36;
                case 471: goto L46e;
                case 500: goto L39;
                default: goto L30;
            }     // Catch: java.lang.Throwable -> L4aa
        L30:
            goto L2b
        L31:
            if (r2 == 0) goto L36
            r1 = 1833(0x729, float:2.569E-42)
            goto L2b
        L36:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L2b
        L39:
            short[] r1 = m8183()     // Catch: java.lang.Throwable -> L4aa
            r2 = 1287(0x507, float:1.803E-42)
            int r6 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L4aa
            r6 = r6 ^ (-119(0xffffffffffffff89, float:NaN))
            r7 = 2763(0xacb, float:3.872E-42)
            java.lang.String r1 = androidx.loader.C1097.m2734(r1, r2, r6, r7)     // Catch: java.lang.Throwable -> L4aa
            r2 = 0
            java.lang.String r2 = androidx.interpolator.C1081.m1642(r1, r2)     // Catch: java.lang.Throwable -> L4aa
            r1 = 1864(0x748, float:2.612E-42)
        L50:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L56;
                case 47384: goto L458;
                case 47417: goto L60;
                case 47483: goto L5c;
                default: goto L55;
            }     // Catch: java.lang.Throwable -> L4aa
        L55:
            goto L50
        L56:
            if (r2 == 0) goto L5c
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L50
        L5c:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L50
        L60:
            java.lang.ClassLoader r1 = androidx.lifecycle.livedata.C1086.m1939(r12)     // Catch: java.lang.Throwable -> L4aa
            java.lang.Class r1 = m8222(r2, r1)     // Catch: java.lang.Throwable -> L4aa
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L4aa
            r6 = 1306(0x51a, float:1.83E-42)
            int r7 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L4aa
            r7 = r7 ^ 380(0x17c, float:5.32E-43)
            r8 = 1832(0x728, float:2.567E-42)
            java.lang.String r2 = androidx.activity.C1065.m410(r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L4aa
            r6 = 3
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L4aa
            int r7 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L4aa
            r7 = r7 ^ 859(0x35b, float:1.204E-42)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4aa
            int r7 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L4aa
            r7 = r7 ^ 269(0x10d, float:3.77E-43)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4aa
            int r7 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L4aa
            r7 = r7 ^ 241(0xf1, float:3.38E-43)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4aa
            java.lang.reflect.Method r1 = androidx.activity.C1065.m425(r1, r2, r6)     // Catch: java.lang.Throwable -> L4aa
            r2 = 1
            androidx.lifecycle.process.C1088.m2070(r1, r2)     // Catch: java.lang.Throwable -> L4aa
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r4)     // Catch: java.lang.Throwable -> L4aa
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L340
            int r7 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L340
            r7 = r7 ^ 821(0x335, float:1.15E-42)
            r6[r7] = r2     // Catch: java.lang.Throwable -> L340
            int r2 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L340
            r2 = r2 ^ (-54)
            r6[r2] = r14     // Catch: java.lang.Throwable -> L340
            int r2 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L340
            r2 = r2 ^ 241(0xf1, float:3.38E-43)
            r6[r2] = r15     // Catch: java.lang.Throwable -> L340
            r2 = 0
            java.lang.Object r6 = androidx.loader.C1097.m2712(r1, r2, r6)     // Catch: java.lang.Throwable -> L340
            r1 = 48767(0xbe7f, float:6.8337E-41)
        Lbc:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto Lc4;
                case 45: goto L4b3;
                case 76: goto Lce;
                case 239: goto Lc8;
                default: goto Lc3;
            }
        Lc3:
            goto Lbc
        Lc4:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto Lbc
        Lc8:
            if (r6 == 0) goto Lc4
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto Lbc
        Lce:
            short[] r1 = m8183()     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r2 = 1311(0x51f, float:1.837E-42)
            int r7 = androidx.documentfile.C1076.f102     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r7 = r7 ^ (-603(0xfffffffffffffda5, float:NaN))
            r8 = 1571(0x623, float:2.201E-42)
            java.lang.String r1 = androidx.startup.C1101.m3014(r1, r2, r7, r8)     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            java.lang.Object r2 = m8175(r6, r1)     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            boolean r7 = r2 instanceof java.util.List     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r1 = 48891(0xbefb, float:6.8511E-41)
        Le7:
            r8 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 22: goto Lef;
                case 53: goto L4b0;
                case 503: goto Lf3;
                case 32495: goto Lf9;
                default: goto Lee;
            }     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
        Lee:
            goto Le7
        Lef:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto Le7
        Lf3:
            if (r7 == 0) goto Lef
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto Le7
        Lf9:
            r0 = r2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r1 = r0
            int r7 = androidx.lifecycle.livedata.C1086.m1931(r1)     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r1 = 49666(0xc202, float:6.9597E-41)
        L104:
            r8 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 17: goto L10c;
                case 50: goto L112;
                case 76: goto L116;
                case 83: goto L4b0;
                default: goto L10b;
            }     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
        L10b:
            goto L104
        L10c:
            if (r7 <= 0) goto L112
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L104
        L112:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L104
        L116:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r1 = 0
            java.lang.Object r1 = androidx.drawerlayout.C1077.m1311(r2, r1)     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L13f java.lang.Throwable -> L340
            r2 = 49790(0xc27e, float:6.977E-41)
        L122:
            r7 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 18: goto L12a;
                case 241: goto L13b;
                default: goto L129;
            }
        L129:
            goto L122
        L12a:
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L12d:
            r7 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 497: goto L135;
                case 1711: goto L16a;
                case 1736: goto L187;
                case 1769: goto L16e;
                default: goto L134;
            }
        L134:
            goto L12d
        L135:
            if (r1 == 0) goto L16a
            r2 = 50658(0xc5e2, float:7.0987E-41)
            goto L12d
        L13b:
            r2 = 49821(0xc29d, float:6.9814E-41)
            goto L122
        L13f:
            r1 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2209(r1)     // Catch: java.lang.Throwable -> L340
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L340
            r2.<init>()     // Catch: java.lang.Throwable -> L340
            short[] r7 = m8183()     // Catch: java.lang.Throwable -> L340
            r8 = 1314(0x522, float:1.841E-42)
            int r9 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L340
            r9 = r9 ^ (-43)
            r10 = 1100(0x44c, float:1.541E-42)
            java.lang.String r7 = org.luckypray.dexkit.C1123.m10510(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L340
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r7)     // Catch: java.lang.Throwable -> L340
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)     // Catch: java.lang.Throwable -> L340
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Throwable -> L340
            m8215(r1)     // Catch: java.lang.Throwable -> L340
            r1 = r3
            goto L12a
        L16a:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto L12d
        L16e:
            boolean r7 = androidx.activity.C1066.m488(r1)     // Catch: java.lang.Throwable -> L340
            r2 = 50689(0xc601, float:7.103E-41)
        L175:
            r8 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 19: goto L17d;
                case 45: goto L1d7;
                case 50: goto L183;
                case 76: goto L187;
                default: goto L17c;
            }     // Catch: java.lang.Throwable -> L340
        L17c:
            goto L175
        L17d:
            if (r7 == 0) goto L183
            r2 = 50782(0xc65e, float:7.1161E-41)
            goto L175
        L183:
            r2 = 50751(0xc63f, float:7.1117E-41)
            goto L175
        L187:
            java.lang.String r6 = androidx.loader.C1099.m2839(r6)     // Catch: java.lang.Throwable -> L340
            boolean r7 = androidx.emoji2.C1080.m1554(r6, r5)     // Catch: java.lang.Throwable -> L340
            r2 = 50813(0xc67d, float:7.1204E-41)
        L192:
            r8 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 18: goto L19a;
                case 53: goto L1d7;
                case 243: goto L19e;
                case 4075: goto L1a4;
                default: goto L199;
            }     // Catch: java.lang.Throwable -> L340
        L199:
            goto L192
        L19a:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto L192
        L19e:
            if (r7 == 0) goto L19a
            r2 = 51557(0xc965, float:7.2247E-41)
            goto L192
        L1a4:
            int r2 = androidx.appcompat.resources.C1068.m685(r6, r5)     // Catch: java.lang.Throwable -> L340
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L340
            r5 = r5 ^ (-116(0xffffffffffffff8c, float:NaN))
            int r5 = r5 + r2
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L340
            r7 = 1345(0x541, float:1.885E-42)
            r8 = 1
            r9 = 1607(0x647, float:2.252E-42)
            java.lang.String r2 = androidx.core.C1072.m957(r2, r7, r8, r9)     // Catch: java.lang.Throwable -> L340
            int r7 = kevin.fun.hook.webdav.C1118.m8488(r6, r2, r5)     // Catch: java.lang.Throwable -> L340
            r2 = 51588(0xc984, float:7.229E-41)
        L1c1:
            r8 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 17: goto L1c9;
                case 54: goto L1cf;
                case 87: goto L1d7;
                case 116: goto L1d3;
                default: goto L1c8;
            }     // Catch: java.lang.Throwable -> L340
        L1c8:
            goto L1c1
        L1c9:
            if (r7 <= r5) goto L1cf
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L1c1
        L1cf:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L1c1
        L1d3:
            java.lang.String r1 = androidx.lifecycle.process.C1088.m2028(r6, r5, r7)     // Catch: java.lang.Throwable -> L340
        L1d7:
            r2 = 51712(0xca00, float:7.2464E-41)
        L1da:
            r5 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L1e2;
                case 17: goto L1e6;
                case 47: goto L38f;
                case 76: goto L1ec;
                default: goto L1e1;
            }     // Catch: java.lang.Throwable -> L340
        L1e1:
            goto L1da
        L1e2:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L1da
        L1e6:
            if (r1 == 0) goto L1e2
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L1da
        L1ec:
            boolean r5 = androidx.activity.C1066.m488(r1)     // Catch: java.lang.Throwable -> L340
            r2 = 51836(0xca7c, float:7.2638E-41)
        L1f3:
            r6 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 241: goto L1fb;
                case 1963: goto L201;
                case 1992: goto L38f;
                case 2025: goto L205;
                default: goto L1fa;
            }     // Catch: java.lang.Throwable -> L340
        L1fa:
            goto L1f3
        L1fb:
            if (r5 != 0) goto L201
            r2 = 52580(0xcd64, float:7.368E-41)
            goto L1f3
        L201:
            r2 = 52549(0xcd45, float:7.3637E-41)
            goto L1f3
        L205:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L340
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L340
            boolean r5 = androidx.vectordrawable.C1105.m3294(r2)     // Catch: java.lang.Throwable -> L340
            r2 = 52611(0xcd83, float:7.3724E-41)
        L211:
            r6 = 52628(0xcd94, float:7.3748E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 23: goto L219;
                case 54: goto L21f;
                case 85: goto L38f;
                case 116: goto L223;
                default: goto L218;
            }     // Catch: java.lang.Throwable -> L340
        L218:
            goto L211
        L219:
            if (r5 == 0) goto L21f
            r2 = 52704(0xcde0, float:7.3854E-41)
            goto L211
        L21f:
            r2 = 52673(0xcdc1, float:7.381E-41)
            goto L211
        L223:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L340
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L340
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L340
            r5.<init>(r15)     // Catch: java.lang.Throwable -> L340
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r2)     // Catch: java.lang.Throwable -> L340
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3775(r5)     // Catch: java.lang.Throwable -> L340
            boolean r6 = org.luckypray.dexkit.C1125.m10633(r1, r6)     // Catch: java.lang.Throwable -> L340
            r1 = 52735(0xcdff, float:7.3897E-41)
        L23c:
            r7 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 14: goto L244;
                case 45: goto L3ad;
                case 1007: goto L248;
                case 7927: goto L24e;
                default: goto L243;
            }
        L243:
            goto L23c
        L244:
            r1 = 52797(0xce3d, float:7.3984E-41)
            goto L23c
        L248:
            if (r6 != 0) goto L244
            r1 = 53479(0xd0e7, float:7.494E-41)
            goto L23c
        L24e:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L306
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L306
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b4
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L2b4
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L29d
        L25c:
            int r5 = kevin.fun.hook.audio.C1117.m8114(r6, r2)     // Catch: java.lang.Throwable -> L29d
            r1 = 53510(0xd106, float:7.4983E-41)
        L263:
            r8 = 53527(0xd117, float:7.5007E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 17: goto L26b;
                case 50: goto L271;
                case 83: goto L28a;
                case 116: goto L275;
                default: goto L26a;
            }
        L26a:
            goto L263
        L26b:
            if (r5 > 0) goto L271
            r1 = 53603(0xd163, float:7.5114E-41)
            goto L263
        L271:
            r1 = 53572(0xd144, float:7.507E-41)
            goto L263
        L275:
            kevin.fun.hook.audio.C1117.m8104(r7)     // Catch: java.lang.Throwable -> L4ad
            kevin.fun.hook.audio.C1116.m8073(r6)     // Catch: java.lang.Throwable -> L2f1
            r1 = 53634(0xd182, float:7.5157E-41)
        L27e:
            r2 = 53651(0xd193, float:7.5181E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L286;
                case 50: goto L3ad;
                default: goto L285;
            }
        L285:
            goto L27e
        L286:
            r1 = 53665(0xd1a1, float:7.52E-41)
            goto L27e
        L28a:
            r1 = 0
            androidx.drawerlayout.C1077.m1285(r7, r2, r1, r5)     // Catch: java.lang.Throwable -> L29d
            r1 = 53758(0xd1fe, float:7.5331E-41)
        L291:
            r5 = 53775(0xd20f, float:7.5355E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 1009: goto L299;
                case 1703: goto L25c;
                default: goto L298;
            }
        L298:
            goto L291
        L299:
            r1 = 54440(0xd4a8, float:7.6287E-41)
            goto L291
        L29d:
            r1 = move-exception
            r2 = r1
            kevin.fun.hook.audio.C1117.m8104(r7)     // Catch: java.lang.Throwable -> L2a3
            throw r2     // Catch: java.lang.Throwable -> L2a3
        L2a3:
            r1 = move-exception
            r3 = r2
        L2a5:
            r2 = 54533(0xd505, float:7.6417E-41)
        L2a8:
            r5 = 54550(0xd516, float:7.6441E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L2b0;
                case 50: goto L2b5;
                default: goto L2af;
            }
        L2af:
            goto L2a8
        L2b0:
            r2 = 54564(0xd524, float:7.646E-41)
            goto L2a8
        L2b4:
            r1 = move-exception
        L2b5:
            r2 = 54657(0xd581, float:7.6591E-41)
        L2b8:
            r5 = 54674(0xd592, float:7.6615E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L2c0;
                case 45: goto L301;
                case 50: goto L2c6;
                case 3579: goto L2ca;
                default: goto L2bf;
            }
        L2bf:
            goto L2b8
        L2c0:
            if (r3 == 0) goto L2c6
            r2 = 55401(0xd869, float:7.7633E-41)
            goto L2b8
        L2c6:
            r2 = 54719(0xd5bf, float:7.6678E-41)
            goto L2b8
        L2ca:
            r2 = 55432(0xd888, float:7.7677E-41)
        L2cd:
            r5 = 55449(0xd899, float:7.77E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L2d5;
                case 62: goto L2db;
                case 95: goto L302;
                case 124: goto L2df;
                default: goto L2d4;
            }
        L2d4:
            goto L2cd
        L2d5:
            if (r3 == r1) goto L2db
            r2 = 55525(0xd8e5, float:7.7807E-41)
            goto L2cd
        L2db:
            r2 = 55494(0xd8c6, float:7.7764E-41)
            goto L2cd
        L2df:
            kevin.fun.hook.audio.C1116.m8088(r3, r1)     // Catch: java.lang.Throwable -> L2f1
            r1 = 55556(0xd904, float:7.785E-41)
        L2e5:
            r2 = 55573(0xd915, float:7.7874E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L2ed;
                case 54: goto L302;
                default: goto L2ec;
            }     // Catch: java.lang.Throwable -> L2f1
        L2ec:
            goto L2e5
        L2ed:
            r1 = 55587(0xd923, float:7.7894E-41)
            goto L2e5
        L2f1:
            r1 = move-exception
            r2 = 55680(0xd980, float:7.8024E-41)
        L2f5:
            r5 = 55697(0xd991, float:7.8048E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L2fd;
                case 1467: goto L307;
                default: goto L2fc;
            }     // Catch: java.lang.Throwable -> L2f1
        L2fc:
            goto L2f5
        L2fd:
            r2 = 56362(0xdc2a, float:7.898E-41)
            goto L2f5
        L301:
            r3 = r1
        L302:
            kevin.fun.hook.audio.C1116.m8073(r6)     // Catch: java.lang.Throwable -> L2f1
            throw r3     // Catch: java.lang.Throwable -> L2f1
        L306:
            r1 = move-exception
        L307:
            r2 = 56455(0xdc87, float:7.911E-41)
        L30a:
            r5 = 56472(0xdc98, float:7.9134E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 31: goto L312;
                case 62: goto L318;
                case 93: goto L38d;
                case 124: goto L31c;
                default: goto L311;
            }
        L311:
            goto L30a
        L312:
            if (r3 == 0) goto L318
            r2 = 56548(0xdce4, float:7.924E-41)
            goto L30a
        L318:
            r2 = 56517(0xdcc5, float:7.9197E-41)
            goto L30a
        L31c:
            r2 = 56579(0xdd03, float:7.9284E-41)
        L31f:
            r5 = 56596(0xdd14, float:7.9308E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 23: goto L327;
                case 54: goto L32d;
                case 85: goto L33f;
                case 1564036: goto L331;
                default: goto L326;
            }
        L326:
            goto L31f
        L327:
            if (r3 == r1) goto L32d
            r2 = 1507472(0x170090, float:2.112418E-39)
            goto L31f
        L32d:
            r2 = 56641(0xdd41, float:7.9371E-41)
            goto L31f
        L331:
            kevin.fun.hook.audio.C1116.m8088(r3, r1)     // Catch: java.lang.Throwable -> L340
            r1 = 1507503(0x1700af, float:2.112462E-39)
        L337:
            r2 = 1507520(0x1700c0, float:2.112485E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L33f;
                case 111: goto L389;
                default: goto L33e;
            }     // Catch: java.lang.Throwable -> L340
        L33e:
            goto L337
        L33f:
            throw r3     // Catch: java.lang.Throwable -> L340
        L340:
            r1 = move-exception
            r2 = 1509425(0x170831, float:2.115155E-39)
        L344:
            r3 = 1509442(0x170842, float:2.115179E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L34c;
                case 115: goto L453;
                default: goto L34b;
            }
        L34b:
            goto L344
        L34c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L377
            java.lang.String r3 = androidx.loader.C1099.m2895(r1)     // Catch: java.lang.Throwable -> L377
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L377
            r5.<init>()     // Catch: java.lang.Throwable -> L377
            short[] r6 = m8183()     // Catch: java.lang.Throwable -> L377
            r7 = 1396(0x574, float:1.956E-42)
            int r8 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L377
            r8 = r8 ^ 120(0x78, float:1.68E-43)
            r9 = 2012(0x7dc, float:2.82E-42)
            java.lang.String r6 = androidx.annotation.experimental.C1067.m581(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L377
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L377
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r5, r3)     // Catch: java.lang.Throwable -> L377
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L377
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L377
            throw r2     // Catch: java.lang.Throwable -> L377
        L377:
            r1 = move-exception
            r2 = 1509673(0x170929, float:2.115502E-39)
        L37b:
            r3 = 1509690(0x17093a, float:2.115526E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L383;
                case 712: goto L4a9;
                case 745: goto L488;
                case 1323: goto L48d;
                default: goto L382;
            }
        L382:
            goto L37b
        L383:
            if (r4 == 0) goto L488
            r2 = 1510417(0x170c11, float:2.116545E-39)
            goto L37b
        L389:
            r1 = 1507534(0x1700ce, float:2.112505E-39)
            goto L337
        L38d:
            r3 = r1
            goto L33f
        L38f:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L340
            r1.<init>(r15)     // Catch: java.lang.Throwable -> L340
            boolean r2 = androidx.vectordrawable.C1105.m3294(r1)     // Catch: java.lang.Throwable -> L340
            r1 = 1507627(0x17012b, float:2.112635E-39)
        L39b:
            r3 = 1507644(0x17013c, float:2.112659E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 23: goto L3a3;
                case 85: goto L42d;
                case 118: goto L3a9;
                case 180: goto L3ad;
                default: goto L3a2;
            }     // Catch: java.lang.Throwable -> L340
        L3a2:
            goto L39b
        L3a3:
            if (r2 == 0) goto L3a9
            r1 = 1507720(0x170188, float:2.112766E-39)
            goto L39b
        L3a9:
            r1 = 1507689(0x170169, float:2.112722E-39)
            goto L39b
        L3ad:
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L340
            int r2 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L340
            r2 = r2 ^ (-54)
            r1[r2] = r15     // Catch: java.lang.Throwable -> L340
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L340
            r3 = 1346(0x542, float:1.886E-42)
            int r5 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L340
            r5 = r5 ^ (-614(0xfffffffffffffd9a, float:NaN))
            r6 = 2479(0x9af, float:3.474E-42)
            java.lang.String r2 = androidx.customview.C1075.m1138(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L340
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L340
            int r5 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L340
            r5 = r5 ^ (-544(0xfffffffffffffde0, float:NaN))
            r3[r5] = r2     // Catch: java.lang.Throwable -> L340
            r2 = 0
            dev.rikka.ndk.thirdparty.libcxx.C1110.m3659(r12, r1, r3, r2)     // Catch: java.lang.Throwable -> L443
            r1 = 1507751(0x1701a7, float:2.112809E-39)
        L3d6:
            r2 = 1507768(0x1701b8, float:2.112833E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 31: goto L3de;
                case 1335: goto L3e8;
                case 1480: goto L404;
                case 1513: goto L3e4;
                default: goto L3dd;
            }
        L3dd:
            goto L3d6
        L3de:
            if (r4 == 0) goto L3e4
            r1 = 1508495(0x17048f, float:2.113852E-39)
            goto L3d6
        L3e4:
            r1 = 1508464(0x170470, float:2.113808E-39)
            goto L3d6
        L3e8:
            boolean r2 = androidx.vectordrawable.C1105.m3294(r4)
            r1 = 1508526(0x1704ae, float:2.113895E-39)
        L3ef:
            r3 = 1508543(0x1704bf, float:2.113919E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L3f7;
                case 83: goto L404;
                case 114: goto L3fd;
                case 436: goto L401;
                default: goto L3f6;
            }
        L3f6:
            goto L3ef
        L3f7:
            if (r2 == 0) goto L3fd
            r1 = 1508619(0x17050b, float:2.114025E-39)
            goto L3ef
        L3fd:
            r1 = 1508588(0x1704ec, float:2.113982E-39)
            goto L3ef
        L401:
            androidx.loader.C1095.m2548(r4)
        L404:
            int r2 = androidx.activity.C1062.m182()
            r1 = 1508650(0x17052a, float:2.114069E-39)
        L40b:
            r3 = 1508667(0x17053b, float:2.114093E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L413;
                case 83: goto L42c;
                case 114: goto L419;
                case 3369: goto L41d;
                default: goto L412;
            }
        L412:
            goto L40b
        L413:
            if (r2 < 0) goto L419
            r1 = 1509394(0x170812, float:2.115111E-39)
            goto L40b
        L419:
            r1 = 1508712(0x170568, float:2.114156E-39)
            goto L40b
        L41d:
            java.lang.String r1 = "JRVxisynCgKw8z71GCBPW6xOfzTW"
            java.lang.String r1 = androidx.lifecycle.runtime.C1092.m2359(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
        L42c:
            return
        L42d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L443
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L443
            r3 = 1356(0x54c, float:1.9E-42)
            int r5 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L443
            r5 = r5 ^ 916(0x394, float:1.284E-42)
            r6 = 2616(0xa38, float:3.666E-42)
            java.lang.String r2 = androidx.vectordrawable.animated.C1102.m3116(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L443
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L443
            throw r1     // Catch: java.lang.Throwable -> L443
        L443:
            r1 = move-exception
            r2 = 1509549(0x1708ad, float:2.115329E-39)
        L447:
            r3 = 1509566(0x1708be, float:2.115353E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L44f;
                case 114: goto L34c;
                default: goto L44e;
            }     // Catch: java.lang.Throwable -> L443
        L44e:
            goto L447
        L44f:
            r2 = 1509580(0x1708cc, float:2.115372E-39)
            goto L447
        L453:
            r2 = 1509456(0x170850, float:2.115198E-39)
            goto L344
        L458:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L443
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L443
            r3 = 1378(0x562, float:1.931E-42)
            int r5 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L443
            r5 = r5 ^ (-949(0xfffffffffffffc4b, float:NaN))
            r6 = 3047(0xbe7, float:4.27E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1125.m10615(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L443
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L443
            throw r1     // Catch: java.lang.Throwable -> L443
        L46e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L443
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L443
            r3 = 1388(0x56c, float:1.945E-42)
            int r5 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L443
            r5 = r5 ^ (-126(0xffffffffffffff82, float:NaN))
            r6 = 2173(0x87d, float:3.045E-42)
            java.lang.String r2 = androidx.loader.C1099.m2843(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L443
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L443
            throw r1     // Catch: java.lang.Throwable -> L443
        L484:
            r1 = move-exception
        L485:
            r4 = r3
            goto L34c
        L488:
            r2 = 1510386(0x170bf2, float:2.116502E-39)
            goto L37b
        L48d:
            boolean r3 = androidx.vectordrawable.C1105.m3294(r4)
            r2 = 1510448(0x170c30, float:2.116588E-39)
        L494:
            r5 = 1510465(0x170c41, float:2.116612E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L49c;
                case 47: goto L4a9;
                case 113: goto L4a0;
                case 204: goto L4a6;
                default: goto L49b;
            }
        L49b:
            goto L494
        L49c:
            r2 = 1510510(0x170c6e, float:2.116675E-39)
            goto L494
        L4a0:
            if (r3 == 0) goto L49c
            r2 = 1510541(0x170c8d, float:2.116719E-39)
            goto L494
        L4a6:
            androidx.loader.C1095.m2548(r4)
        L4a9:
            throw r1
        L4aa:
            r1 = move-exception
            r3 = r4
            goto L485
        L4ad:
            r1 = move-exception
            goto L2a5
        L4b0:
            r1 = r3
            goto L12a
        L4b3:
            r1 = r3
            goto L1d7
    }

    private void updateProgressUI(android.app.Dialog r15, android.widget.TextView[] r16, android.widget.ProgressBar[] r17, android.widget.TextView[] r18, int r19, long r20, long r22, long r24) {
            r14 = this;
            android.os.Handler r12 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda2 r0 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda2
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r16
            r5 = r18
            r6 = r22
            r8 = r24
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            androidx.activity.C1062.m178(r12, r0)
            int r1 = androidx.startup.C1100.m2972()
            r0 = 1616(0x650, float:2.264E-42)
        L21:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L27;
                case 49: goto L2a;
                case 204: goto L2f;
                case 239: goto L3e;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L21
        L2a:
            if (r1 < 0) goto L27
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L21
        L2f:
            java.lang.String r0 = "0CzGj9W0xf5vdUfFYlLjDG7w9V"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۟۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m8170(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, int r11, long r12, long r14) {
            int r1 = androidx.lifecycle.process.C1089.m2142()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L24;
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
            r0 = r8
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
            r1 = r9
            android.content.Context r1 = (android.content.Context) r1
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r3 = r11
            r4 = r12
            r6 = r14
            r0.showDownloadProgressNotification(r1, r2, r3, r4, r6)
        L23:
            return
        L24:
            r0 = 1740(0x6cc, float:2.438E-42)
        L26:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2c;
                case 54: goto L23;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L26
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8171(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, int r17, long r18, long r20, long r22) {
            int r1 = androidx.interpolator.C1082.m1718()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r0 = r12
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
            r1 = r13
            android.app.Dialog r1 = (android.app.Dialog) r1
            r2 = r14
            android.widget.TextView[] r2 = (android.widget.TextView[]) r2
            r3 = r15
            android.widget.ProgressBar[] r3 = (android.widget.ProgressBar[]) r3
            r4 = r16
            android.widget.TextView[] r4 = (android.widget.TextView[]) r4
            r5 = r17
            r6 = r18
            r8 = r20
            r10 = r22
            r0.updateProgressUI(r1, r2, r3, r4, r5, r6, r8, r10)
        L2f:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            if (r1 > 0) goto L40
            r0 = 1833(0x729, float:2.569E-42)
            goto L35
        L40:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L35
        L43:
            java.lang.String r0 = "RoG"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
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

    /* JADX INFO: renamed from: ۟۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m8172(java.lang.Object r2, java.lang.Object r3, float r4) {
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            int r0 = r2.m100dp(r3, r4)
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

    /* JADX INFO: renamed from: ۟۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8173(java.lang.Object r2, java.lang.Object r3, boolean r4, java.lang.Object r5) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = r2.generateFileName(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۟۟ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static okhttp3.OkHttpClient.Builder m8174(java.lang.Object r3, long r4, java.lang.Object r6) {
            int r1 = androidx.interpolator.C1083.m1725()
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
            okhttp3.OkHttpClient$Builder r3 = (okhttp3.OkHttpClient.Builder) r3
            java.util.concurrent.TimeUnit r6 = (java.util.concurrent.TimeUnit) r6
            okhttp3.OkHttpClient$Builder r0 = r3.writeTimeout(r4, r6)
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

    /* JADX INFO: renamed from: ۟۠۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m8175(java.lang.Object r2, java.lang.Object r3) {
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

    /* JADX INFO: renamed from: ۟۠۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8176(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
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

    /* JADX INFO: renamed from: ۟ۡۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.download.DownloadManager.BatchDownloadManager m8177(java.lang.Object r2) {
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = r2.batchManager
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

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8178(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            kevin.fun.hook.download.DownloadManager r3 = (kevin.fun.hook.download.DownloadManager) r3
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r5 = (java.io.File) r5
            r3.downloadFile(r4, r5)
        L1d:
            int r1 = androidx.customview.C1074.m1071()
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
            java.lang.String r0 = "qacrT1P"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
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

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m8179(java.lang.Object r2) {
            int r1 = androidx.vectordrawable.C1104.m3230()
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
            okhttp3.Response r2 = (okhttp3.Response) r2
            int r0 = r2.code()
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

    /* JADX INFO: renamed from: ۟ۡۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static okhttp3.OkHttpClient m8180() {
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
            okhttp3.OkHttpClient r0 = kevin.fun.hook.download.DownloadManager.OK_HTTP_CLIENT
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

    /* JADX INFO: renamed from: ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m8181(java.lang.Object r2) {
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
            okhttp3.Call r2 = (okhttp3.Call) r2
            r2.cancel()
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

    /* JADX INFO: renamed from: ۟ۢۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m8182(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.activity.C1066.m518()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = (java.io.File) r4
            r2.downloadFileSync(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8183() {
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
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
            short[] r0 = kevin.fun.hook.download.DownloadManager.f407short
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

    /* JADX INFO: renamed from: ۟ۢۤۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8184(java.lang.Object r2) {
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.getTimestamp()
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

    /* JADX INFO: renamed from: ۣ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m8185(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            android.app.Dialog r0 = r2.createProgressDialog(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۟ۢۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8186(java.lang.Object r2) {
            int r1 = androidx.activity.C1066.m518()
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
            okhttp3.Response r2 = (okhttp3.Response) r2
            r2.close()
        L19:
            int r1 = androidx.documentfile.C1076.m1211()
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
            java.lang.String r0 = "LJ2u4u142OE9ArC4SeuYbMI"
            java.lang.String r0 = androidx.vectordrawable.C1105.m3273(r0)
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

    /* JADX INFO: renamed from: ۣ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8187(java.lang.Object r2, int r3) {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.getRandomString(r3)
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

    /* JADX INFO: renamed from: ۣ۟۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static long m8188(java.lang.Object r3) {
            int r1 = androidx.interpolator.C1081.m1643()
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
            okhttp3.ResponseBody r3 = (okhttp3.ResponseBody) r3
            long r0 = r3.contentLength()
        L1a:
            return r0
        L1b:
            r0 = 0
            r2 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L25;
                case 54: goto L1a;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L1f
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m8189() {
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int r0 = kevin.fun.hook.download.DownloadManager.ViewTags.background_btn
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

    /* JADX INFO: renamed from: ۟ۥ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m8190(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, boolean r15) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2e;
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
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
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
            r0.startDownload(r1, r2, r3, r4, r5, r6, r7)
        L2d:
            return
        L2e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L30:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L36;
                case 54: goto L2d;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L30
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8191(java.lang.Object r2) {
            int r1 = androidx.loader.C1099.m2876()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentWorkVideoId
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

    /* JADX INFO: renamed from: ۟ۥۧۡۤ, reason: not valid java name and contains not printable characters */
    public static long m8192(java.lang.Object r3) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            kevin.fun.hook.download.DownloadManager r3 = (kevin.fun.hook.download.DownloadManager) r3
            long r0 = r3.currentWorkCreateTime
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

    /* JADX INFO: renamed from: ۟ۦۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8193(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.downloadCommentVideoSilent(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m8194(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.view.View r3 = (android.view.View) r3
            android.widget.TextView[] r4 = (android.widget.TextView[]) r4
            android.widget.ProgressBar[] r5 = (android.widget.ProgressBar[]) r5
            android.widget.TextView[] r6 = (android.widget.TextView[]) r6
            r2.findProgressViews(r3, r4, r5, r6)
        L21:
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            java.lang.String r0 = "YgMDqG"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
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

    /* JADX INFO: renamed from: ۟ۦۣۦ۠, reason: not valid java name and contains not printable characters */
    public static void m8195(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.showErrorToast(r3, r4)
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

    /* JADX INFO: renamed from: ۟ۦۤۤ۠, reason: not valid java name and contains not printable characters */
    public static okhttp3.OkHttpClient.Builder m8196(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            okhttp3.OkHttpClient$Builder r2 = (okhttp3.OkHttpClient.Builder) r2
            okhttp3.ConnectionPool r3 = (okhttp3.ConnectionPool) r3
            okhttp3.OkHttpClient$Builder r0 = r2.connectionPool(r3)
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

    /* JADX INFO: renamed from: ۟ۦۥۦۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8197(java.lang.Object r2) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentWorkAuthorName
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

    /* JADX INFO: renamed from: ۟ۦۧۦۦ, reason: not valid java name and contains not printable characters */
    public static void m8198(java.lang.Object r2) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            r2.cancelDownloadNotification()
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

    /* JADX INFO: renamed from: ۟ۦۧۧ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8199(java.lang.Object r2) {
            int r1 = androidx.loader.C1095.m2562()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentCommentAuthorUid
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

    /* JADX INFO: renamed from: ۟ۧ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8200(java.lang.Object r2) {
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentCommentId
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

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static okhttp3.Request.Builder m8201(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.interpolator.C1081.m1643()
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

    /* JADX INFO: renamed from: ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m8202(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.vectordrawable.C1104.m3230()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri r0 = r2.createOutputUri(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8203(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, boolean r10, java.lang.Object r11) {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L4b;
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
            r0 = r6
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            r4 = r10
            r0.synthesizeAndSaveLivePhoto(r1, r2, r3, r4, r5)
        L27:
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1740(0x6cc, float:2.438E-42)
        L2d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L33;
                case 54: goto L38;
                case 471: goto L4a;
                case 500: goto L3b;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            if (r1 > 0) goto L38
            r0 = 1833(0x729, float:2.569E-42)
            goto L2d
        L38:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2d
        L3b:
            java.lang.String r0 = "fddJtfaMmKkBP76C"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L4a:
            return
        L4b:
            r0 = 1864(0x748, float:2.612E-42)
        L4d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L53;
                case 47483: goto L27;
                default: goto L52;
            }
        L52:
            goto L4d
        L53:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L4d
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8204(java.lang.Object r2) {
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentCommentText
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

    /* JADX INFO: renamed from: ۟ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static okhttp3.Response m8205(java.lang.Object r2) {
            int r1 = androidx.core.C1072.m980()
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

    /* JADX INFO: renamed from: ۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static okhttp3.OkHttpClient.Builder m8206(java.lang.Object r2, java.lang.Object r3) {
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            okhttp3.OkHttpClient$Builder r2 = (okhttp3.OkHttpClient.Builder) r2
            java.util.List r3 = (java.util.List) r3
            okhttp3.OkHttpClient$Builder r0 = r2.protocols(r3)
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

    /* JADX INFO: renamed from: ۠۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static long m8207(java.lang.Object r3) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r3 = (kevin.fun.hook.download.DownloadManager) r3
            long r0 = r3.currentCommentCreateTime
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

    /* JADX INFO: renamed from: ۡۡۦۨ, reason: not valid java name and contains not printable characters */
    public static void m8208(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, boolean r11, boolean r12, java.lang.Object r13) {
            int r1 = androidx.loader.C1096.m2651()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r0 = r7
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            r4 = r11
            r5 = r12
            r0.downloadLivePhoto(r1, r2, r3, r4, r5, r6)
        L28:
            return
        L29:
            r0 = 1740(0x6cc, float:2.438E-42)
        L2b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L31;
                case 54: goto L28;
                default: goto L30;
            }
        L30:
            goto L2b
        L31:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2b
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8209(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            int r1 = androidx.viewpager.C1108.m3542()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L4d;
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
            kevin.fun.hook.download.DownloadManager r0 = (kevin.fun.hook.download.DownloadManager) r0
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            r4 = r10
            kevin.fun.hook.download.DownloadManager$ProgressCallback r4 = (kevin.fun.hook.download.DownloadManager.ProgressCallback) r4
            r5 = r11
            okhttp3.Call[] r5 = (okhttp3.Call[]) r5
            r0.downloadFileWithProgress(r1, r2, r3, r4, r5)
        L29:
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
            r0 = 1740(0x6cc, float:2.438E-42)
        L2f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L35;
                case 54: goto L3a;
                case 471: goto L4c;
                case 500: goto L3d;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            if (r1 > 0) goto L3a
            r0 = 1833(0x729, float:2.569E-42)
            goto L2f
        L3a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2f
        L3d:
            java.lang.String r0 = "fd"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L4c:
            return
        L4d:
            r0 = 1864(0x748, float:2.612E-42)
        L4f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L55;
                case 47483: goto L29;
                default: goto L54;
            }
        L54:
            goto L4f
        L55:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L4f
    }

    /* JADX INFO: renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8210(java.lang.Object r2) {
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentWorkAuthorUid
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

    /* JADX INFO: renamed from: ۡۥۢۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8211(java.lang.Object r2) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentCommentAuthorAccount
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

    /* JADX INFO: renamed from: ۡۥۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8212(java.lang.Object r2) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentWorkVideoDesc
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

    /* JADX INFO: renamed from: ۡۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8213(java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.startup.C1101.m2984()
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
            kevin.fun.hook.download.DownloadManager r3 = (kevin.fun.hook.download.DownloadManager) r3
            android.content.Context r4 = (android.content.Context) r4
            r3.initNotificationChannel(r4)
        L1b:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            java.lang.String r0 = "9OB0a3"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            long r0 = java.lang.Long.parseLong(r0)
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

    /* JADX INFO: renamed from: ۡۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static okhttp3.Request.Builder m8214(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            okhttp3.Request$Builder r2 = (okhttp3.Request.Builder) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            okhttp3.Request$Builder r0 = r2.header(r3, r4)
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

    /* JADX INFO: renamed from: ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static void m8215(java.lang.Object r2) {
            int r1 = androidx.interpolator.C1082.m1718()
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
            java.lang.String r2 = (java.lang.String) r2
            de.robv.android.xposed.XposedBridge.log(r2)
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
            java.lang.String r0 = "8yMbRbcFHhR6Svid3CKLGotWpf"
            java.lang.String r0 = androidx.loader.C1098.m2778(r0)
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

    /* JADX INFO: renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static okhttp3.OkHttpClient m8216(java.lang.Object r2) {
            int r1 = androidx.interpolator.C1081.m1643()
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

    /* JADX INFO: renamed from: ۢۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8217(java.lang.Object r2) {
            int r1 = androidx.core.ktx.C1070.m822()
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
            okhttp3.Call r2 = (okhttp3.Call) r2
            boolean r0 = r2.isCanceled()
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

    /* JADX INFO: renamed from: ۢۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m8218(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.showDownloadCompleteNotification(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۣۢۥۡ, reason: not valid java name and contains not printable characters */
    public static okhttp3.OkHttpClient.Builder m8219(java.lang.Object r2, boolean r3) {
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            okhttp3.OkHttpClient$Builder r2 = (okhttp3.OkHttpClient.Builder) r2
            okhttp3.OkHttpClient$Builder r0 = r2.retryOnConnectionFailure(r3)
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

    /* JADX INFO: renamed from: ۢۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8220(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r3 = (kevin.fun.hook.download.DownloadManager) r3
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r3.synthesizeLivePhoto(r4, r5, r6, r7)
        L21:
            int r1 = androidx.loader.C1099.m2876()
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
            java.lang.String r0 = "16KX55yhHa01nJE1bZlzhuY7n99"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
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

    /* JADX INFO: renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8221(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = r2.getFileExtension(r3, r4)
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

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m8222(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.C1120.m8652()
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

    /* JADX INFO: renamed from: ۣۧۦ, reason: not valid java name and contains not printable characters */
    public static java.io.InputStream m8223(java.lang.Object r2) {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            okhttp3.ResponseBody r2 = (okhttp3.ResponseBody) r2
            java.io.InputStream r0 = r2.byteStream()
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

    /* JADX INFO: renamed from: ۤۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static okhttp3.Request m8224(java.lang.Object r2) {
            int r1 = androidx.customview.C1074.m1071()
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

    /* JADX INFO: renamed from: ۣۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8225() {
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            int r0 = kevin.fun.hook.download.DownloadManager.ViewTags.cancel_btn
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

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8226(java.lang.Object r2) {
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
            okhttp3.Response r2 = (okhttp3.Response) r2
            boolean r0 = r2.isSuccessful()
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

    /* JADX INFO: renamed from: ۥۨۨۢ, reason: contains not printable characters */
    public static void m8227(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1094.m2490()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            android.net.Uri r4 = (android.net.Uri) r4
            r2.deletePartialFile(r3, r4)
        L1d:
            int r1 = kevin.fun.hook.audio.C1116.m8064()
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
            java.lang.String r0 = "X1L3pLWZ2FyljtTYG"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
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

    /* JADX INFO: renamed from: ۦۡۢ۠, reason: contains not printable characters */
    public static okhttp3.ResponseBody m8228(java.lang.Object r2) {
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

    /* JADX INFO: renamed from: ۦۡۦ۟, reason: contains not printable characters */
    public static okhttp3.OkHttpClient.Builder m8229(java.lang.Object r3, long r4, java.lang.Object r6) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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

    /* JADX INFO: renamed from: ۦۡۦۧ, reason: contains not printable characters */
    public static android.os.Handler m8230() {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.os.Handler r0 = kevin.fun.hook.download.DownloadManager.MAIN_HANDLER
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

    /* JADX INFO: renamed from: ۦۢۢ۠, reason: contains not printable characters */
    public static java.lang.String m8231(java.lang.Object r2) {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentWorkAuthorAccount
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

    /* JADX INFO: renamed from: ۦۣۦ۟, reason: contains not printable characters */
    public static okhttp3.OkHttpClient.Builder m8232(java.lang.Object r3, long r4, java.lang.Object r6) {
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

    /* JADX INFO: renamed from: ۦۤۨ۟, reason: contains not printable characters */
    public static java.lang.String m8233(java.lang.Object r2) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r0 = r2.currentCommentAuthorName
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

    /* JADX INFO: renamed from: ۦۦ۟ۤ, reason: contains not printable characters */
    public static void m8234(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.customview.C1074.m1071()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.showCustomToast(r3, r4, r5)
        L1d:
            int r1 = androidx.activity.C1066.m518()
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
            java.lang.String r0 = "La"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            float r0 = java.lang.Float.parseFloat(r0)
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

    /* JADX INFO: renamed from: ۧۨ */
    public static okhttp3.Call m101(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.annotation.experimental.C1067.m596()
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

    /* JADX INFO: renamed from: ۨ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static java.io.File m8235(java.lang.Object r2, java.lang.Object r3, long r4) {
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r0 = r2.findOutputFileFromCache(r3, r4)
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

    /* JADX INFO: renamed from: ۨۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8236(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.lifecycle.process.C1089.m2142()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.io.File r4 = (java.io.File) r4
            android.net.Uri r5 = (android.net.Uri) r5
            r2.copyFileToUri(r3, r4, r5)
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

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static java.io.File m8237(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.interpolator.C1082.m1718()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r0 = r2.downloadImageToTempFile(r3, r4)
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

    /* JADX INFO: renamed from: ۨۤۡۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.download.DownloadManager m8238() {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            kevin.fun.hook.download.DownloadManager r0 = kevin.fun.hook.download.DownloadManager.instance
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

    /* JADX INFO: renamed from: ۨۥۣ۟, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.ExecutorService m8239() {
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
            java.util.concurrent.ExecutorService r0 = kevin.fun.hook.download.DownloadManager.DOWNLOAD_EXECUTOR
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

    /* JADX INFO: renamed from: ۨۧۡۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8240(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.core.C1072.m980()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r2.generateSimpleFileName(r3)
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

    /* JADX INFO: renamed from: ۨۧۥۦ, reason: not valid java name and contains not printable characters */
    public static androidx.core.app.NotificationCompat.Builder m8241() {
            int r1 = androidx.interpolator.C1083.m1725()
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
            androidx.core.app.NotificationCompat$Builder r0 = kevin.fun.hook.download.DownloadManager.notificationBuilder
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

    /* JADX INFO: renamed from: ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static android.app.NotificationManager m8242() {
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
            android.app.NotificationManager r0 = kevin.fun.hook.download.DownloadManager.notificationManager
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

    public void batchDownloadCommentImages(android.content.Context r7, java.util.List<java.lang.String> r8) {
            r6 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L9b;
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
            boolean r1 = androidx.activity.C1064.m359(r8)
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
                case 47483: goto L9b;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            androidx.emoji2.viewsintegration.C1078.m1389(r0)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            int r1 = androidx.lifecycle.livedata.C1086.m1931(r8)
            org.luckypray.dexkit.C1123.m10519(r0, r1)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            int r1 = androidx.lifecycle.livedata.C1086.m1931(r8)
            short[] r2 = m8183()
            r3 = 1406(0x57e, float:1.97E-42)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r4 = r4 ^ (-932(0xfffffffffffffc5c, float:NaN))
            r5 = 2551(0x9f7, float:3.575E-42)
            java.lang.String r2 = androidx.activity.C1064.m310(r2, r3, r4, r5)
            androidx.viewpager.C1108.m3526(r0, r7, r1, r2)
            java.util.Iterator r1 = androidx.core.ktx.C1071.m904(r8)
        L61:
            boolean r2 = androidx.activity.C1063.m269(r1)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L68:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L70;
                case 45: goto L7a;
                case 76: goto Lc3;
                case 239: goto L74;
                default: goto L6f;
            }
        L6f:
            goto L68
        L70:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L68
        L74:
            if (r2 != 0) goto L70
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L68
        L7a:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.ExecutorService r2 = m8239()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda7 r3 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda7
            r3.<init>(r6, r7, r0)
            androidx.activity.C1063.m244(r2, r3)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L8f:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L61;
                case 503: goto L97;
                default: goto L96;
            }
        L96:
            goto L8f
        L97:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L8f
        L9b:
            int r1 = kevin.fun.hook.audio.C1116.m8064()
            r0 = 49666(0xc202, float:6.9597E-41)
        La2:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Laa;
                case 50: goto Lb0;
                case 76: goto Lb4;
                case 83: goto Lc3;
                default: goto La9;
            }
        La9:
            goto La2
        Laa:
            if (r1 < 0) goto Lb0
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto La2
        Lb0:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto La2
        Lb4:
            java.lang.String r0 = "aJ"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lc3:
            return
    }

    public void batchDownloadWorkImages(android.content.Context r7, java.util.List<java.lang.String> r8) {
            r6 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L9b;
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
            boolean r1 = androidx.activity.C1064.m359(r8)
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
                case 47483: goto L9b;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            androidx.emoji2.viewsintegration.C1078.m1389(r0)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            int r1 = androidx.lifecycle.livedata.C1086.m1931(r8)
            org.luckypray.dexkit.C1123.m10519(r0, r1)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            int r1 = androidx.lifecycle.livedata.C1086.m1931(r8)
            short[] r2 = m8183()
            r3 = 1412(0x584, float:1.979E-42)
            int r4 = org.luckypray.dexkit.C1125.f435
            r4 = r4 ^ (-229(0xffffffffffffff1b, float:NaN))
            r5 = 2140(0x85c, float:2.999E-42)
            java.lang.String r2 = androidx.vectordrawable.C1105.m3247(r2, r3, r4, r5)
            androidx.viewpager.C1108.m3526(r0, r7, r1, r2)
            java.util.Iterator r1 = androidx.core.ktx.C1071.m904(r8)
        L61:
            boolean r2 = androidx.activity.C1063.m269(r1)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L68:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L70;
                case 45: goto L7a;
                case 76: goto Lc3;
                case 239: goto L74;
                default: goto L6f;
            }
        L6f:
            goto L68
        L70:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L68
        L74:
            if (r2 != 0) goto L70
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L68
        L7a:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.ExecutorService r2 = m8239()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda13 r3 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda13
            r3.<init>(r6, r7, r0)
            androidx.activity.C1063.m244(r2, r3)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L8f:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L61;
                case 503: goto L97;
                default: goto L96;
            }
        L96:
            goto L8f
        L97:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L8f
        L9b:
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 49666(0xc202, float:6.9597E-41)
        La2:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Laa;
                case 50: goto Lb0;
                case 76: goto Lb4;
                case 83: goto Lc3;
                default: goto La9;
            }
        La9:
            goto La2
        Laa:
            if (r1 > 0) goto Lb0
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto La2
        Lb0:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto La2
        Lb4:
            java.lang.String r0 = "l6uNjP"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lc3:
            return
    }

    public void clearCommentInfo() {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "ۣۨۨ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1747688: goto L10;
                case 1747745: goto L23;
                case 1750689: goto L28;
                case 1751560: goto Lb;
                case 1755469: goto L17;
                case 1755525: goto L2d;
                case 1755619: goto L1e;
                default: goto La;
            }
        La:
            return
        Lb:
            r4.currentCommentId = r0
            java.lang.String r1 = "ۣۤۢ"
            goto L3
        L10:
            r2 = 0
            r4.currentCommentCreateTime = r2
            java.lang.String r1 = "۠ۡ"
            goto L3
        L17:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            java.lang.String r1 = "ۣۨۨ"
            goto L3
        L1e:
            r4.currentCommentAuthorName = r0
            java.lang.String r1 = "ۣ۠ۢ"
            goto L3
        L23:
            r4.currentCommentAuthorAccount = r0
            java.lang.String r1 = "ۨۥۢ"
            goto L3
        L28:
            r4.currentCommentText = r0
            java.lang.String r1 = "۠۠ۨ"
            goto L3
        L2d:
            r4.currentCommentAuthorUid = r0
            java.lang.String r1 = "ۤۡۥ"
            goto L3
    }

    public void clearWorkInfo() {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "ۨۦۣ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1746967: goto L31;
                case 1747777: goto L14;
                case 1749606: goto L1e;
                case 1752673: goto L19;
                case 1753511: goto L23;
                case 1754530: goto Lf;
                case 1755557: goto L2a;
                default: goto La;
            }
        La:
            r4.currentWorkVideoId = r0
            java.lang.String r1 = "ۥۦۢ"
            goto L3
        Lf:
            r4.currentWorkAuthorAccount = r0
            java.lang.String r1 = "ۣ۠ۤ"
            goto L3
        L14:
            r4.currentWorkAuthorUid = r0
            java.lang.String r1 = "۟ۦۢ"
            goto L3
        L19:
            r4.currentWorkVideoDesc = r0
            java.lang.String r1 = "ۦۣۢ"
            goto L3
        L1e:
            r4.currentWorkAuthorName = r0
            java.lang.String r1 = "ۧۤ۟"
            goto L3
        L23:
            r2 = 0
            r4.currentWorkCreateTime = r2
            java.lang.String r1 = "۟ۨ۠"
            goto L3
        L2a:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            java.lang.String r1 = "ۢ۠ۤ"
            goto L3
        L31:
            return
    }

    public void downloadCommentAudio(android.content.Context r12, java.lang.String r13) {
            r11 = this;
            r7 = 1
            r2 = 0
            r0 = 0
            java.lang.String r1 = "ۧ۟ۤ"
            r4 = r0
            r3 = r0
            r5 = r0
            r6 = r0
            r8 = r0
            r9 = r2
            r10 = r2
        Lc:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56293: goto L2e;
                case 56451: goto L1f;
                case 56476: goto L99;
                case 56505: goto L81;
                case 1746818: goto L77;
                case 1748866: goto L68;
                case 1749703: goto Laa;
                case 1750633: goto L52;
                case 1750655: goto L3a;
                case 1751527: goto La2;
                case 1751586: goto L70;
                case 1751748: goto Lb2;
                case 1753695: goto L27;
                case 1754380: goto L59;
                case 1754625: goto L88;
                case 1755376: goto L46;
                case 1755404: goto L61;
                case 1755431: goto Lbb;
                case 1755526: goto L91;
                default: goto L13;
            }
        L13:
            r0 = 1418(0x58a, float:1.987E-42)
            r1 = 2036(0x7f4, float:2.853E-42)
            java.lang.String r6 = androidx.vectordrawable.C1103.m3132(r8, r0, r9, r1)
            java.lang.String r0 = "ۧۧۡ"
            r1 = r0
            goto Lc
        L1f:
            java.lang.String r5 = androidx.lifecycle.livedata.C1085.m1870()
            java.lang.String r0 = "ۡۧۨ"
            r1 = r0
            goto Lc
        L27:
            r2 = r10 ^ 290(0x122, float:4.06E-43)
            java.lang.String r0 = "۟ۤ"
            r1 = r0
            r9 = r2
            goto Lc
        L2e:
            r0 = 1435(0x59b, float:2.011E-42)
            r1 = 2220(0x8ac, float:3.111E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1091.m2229(r8, r0, r9, r1)
            java.lang.String r0 = "ۤۧۧ"
            r1 = r0
            goto Lc
        L3a:
            r0 = 1439(0x59f, float:2.016E-42)
            r1 = 2413(0x96d, float:3.381E-42)
            java.lang.String r3 = androidx.lifecycle.livedata.C1086.m1920(r8, r0, r9, r1)
            java.lang.String r0 = "ۣ۟ۦ"
            r1 = r0
            goto Lc
        L46:
            r0 = 1422(0x58e, float:1.993E-42)
            r1 = 401(0x191, float:5.62E-43)
            java.lang.String r5 = com.tencent.mmkv.C1109.m3629(r8, r0, r9, r1)
            java.lang.String r0 = "ۥۡ"
            r1 = r0
            goto Lc
        L52:
            int r2 = androidx.lifecycle.process.C1089.f115
            java.lang.String r0 = "ۣۤ۠"
            r1 = r0
            r10 = r2
            goto Lc
        L59:
            short[] r0 = m8183()
            java.lang.String r1 = "ۨۡۥ"
            r8 = r0
            goto Lc
        L61:
            int r2 = androidx.lifecycle.process.C1090.f116
            java.lang.String r0 = "ۨۥۣ"
            r1 = r0
            r10 = r2
            goto Lc
        L68:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۢۨ"
            r8 = r0
            goto Lc
        L70:
            r2 = r10 ^ 519(0x207, float:7.27E-43)
            java.lang.String r0 = "ۣۣ۟"
            r1 = r0
            r9 = r2
            goto Lc
        L77:
            r0 = r11
            r1 = r12
            r2 = r13
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۨۢۡ"
            r1 = r0
            goto Lc
        L81:
            int r2 = androidx.appcompat.resources.C1068.f94
            java.lang.String r0 = "ۤۢ۠"
            r1 = r0
            r10 = r2
            goto Lc
        L88:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۢۨ"
            r8 = r0
            goto Lc
        L91:
            r2 = r10 ^ (-428(0xfffffffffffffe54, float:NaN))
            java.lang.String r0 = "ۦۦ"
            r1 = r0
            r9 = r2
            goto Lc
        L99:
            java.lang.String r4 = m8173(r11, r5, r7, r6)
            java.lang.String r0 = "ۤۧ"
            r1 = r0
            goto Lc
        La2:
            r2 = r10 ^ 941(0x3ad, float:1.319E-42)
            java.lang.String r0 = "ۨ۠ۨ"
            r1 = r0
            r9 = r2
            goto Lc
        Laa:
            int r2 = kevin.fun.hook.webdav.C1119.f418
            java.lang.String r0 = "ۦۨۡ"
            r1 = r0
            r10 = r2
            goto Lc
        Lb2:
            short[] r0 = m8183()
            java.lang.String r1 = "ۦ۟"
            r8 = r0
            goto Lc
        Lbb:
            return
    }

    public void downloadCommentImage(android.content.Context r12, java.lang.String r13) {
            r11 = this;
            r7 = 1
            r2 = 0
            r0 = 0
            java.lang.String r1 = "ۡۤۡ"
            r4 = r0
            r3 = r0
            r5 = r0
            r6 = r0
            r8 = r0
            r9 = r2
            r10 = r2
        Lc:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56478: goto L9d;
                case 56479: goto Lba;
                case 1746756: goto Laa;
                case 1746813: goto L45;
                case 1746910: goto L1b;
                case 1747746: goto L70;
                case 1747750: goto L95;
                case 1748797: goto L36;
                case 1748862: goto L23;
                case 1749731: goto L81;
                case 1750627: goto L7a;
                case 1750781: goto L3e;
                case 1752639: goto L2a;
                case 1754377: goto L61;
                case 1754408: goto L51;
                case 1754441: goto L59;
                case 1755342: goto L68;
                case 1755430: goto L8d;
                case 1755621: goto Lb2;
                default: goto L13;
            }
        L13:
            short[] r0 = m8183()
            java.lang.String r1 = "ۨۢ۠"
            r8 = r0
            goto Lc
        L1b:
            short[] r0 = m8183()
            java.lang.String r1 = "ۡۧۤ"
            r8 = r0
            goto Lc
        L23:
            int r2 = androidx.loader.C1094.f120
            java.lang.String r0 = "ۣۧۡ"
            r1 = r0
            r10 = r2
            goto Lc
        L2a:
            r0 = 1465(0x5b9, float:2.053E-42)
            r1 = 3171(0xc63, float:4.444E-42)
            java.lang.String r6 = androidx.emoji2.C1080.m1525(r8, r0, r9, r1)
            java.lang.String r0 = "ۧ۠ۡ"
            r1 = r0
            goto Lc
        L36:
            java.lang.String r4 = m8173(r11, r5, r7, r6)
            java.lang.String r0 = "ۨ۟ۥ"
            r1 = r0
            goto Lc
        L3e:
            r2 = r10 ^ 368(0x170, float:5.16E-43)
            java.lang.String r0 = "ۥۥ۟"
            r1 = r0
            r9 = r2
            goto Lc
        L45:
            r0 = 1469(0x5bd, float:2.059E-42)
            r1 = 2453(0x995, float:3.437E-42)
            java.lang.String r3 = kevin.fun.hook.audio.C1117.m8169(r8, r0, r9, r1)
            java.lang.String r0 = "۠ۢۤ"
            r1 = r0
            goto Lc
        L51:
            short[] r0 = m8183()
            java.lang.String r1 = "ۧ۟ۡ"
            r8 = r0
            goto Lc
        L59:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۢۢ"
            r8 = r0
            goto Lc
        L61:
            int r2 = androidx.annotation.experimental.C1067.f93
            java.lang.String r0 = "۟ۡۦ"
            r1 = r0
            r10 = r2
            goto Lc
        L68:
            java.lang.String r5 = androidx.lifecycle.runtime.C1092.m2350()
            java.lang.String r0 = "۟ۦۥ"
            r1 = r0
            goto Lc
        L70:
            r0 = r11
            r1 = r12
            r2 = r13
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۥۤ"
            r1 = r0
            goto Lc
        L7a:
            int r2 = androidx.versionedparcelable.C1106.f132
            java.lang.String r0 = "ۨۨۥ"
            r1 = r0
            r10 = r2
            goto Lc
        L81:
            r0 = 1452(0x5ac, float:2.035E-42)
            r1 = 1932(0x78c, float:2.707E-42)
            java.lang.String r5 = androidx.lifecycle.process.C1089.m2127(r8, r0, r9, r1)
            java.lang.String r0 = "ۡۥۡ"
            r1 = r0
            goto Lc
        L8d:
            int r2 = kevin.fun.hook.audio.C1115.f404
            java.lang.String r0 = "۠ۢۨ"
            r1 = r0
            r10 = r2
            goto Lc
        L95:
            r2 = r10 ^ 806(0x326, float:1.13E-42)
            java.lang.String r0 = "ۥۣ"
            r1 = r0
            r9 = r2
            goto Lc
        L9d:
            r0 = 1448(0x5a8, float:2.029E-42)
            r1 = 473(0x1d9, float:6.63E-43)
            java.lang.String r6 = kevin.fun.hook.audio.C1114.m7940(r8, r0, r9, r1)
            java.lang.String r0 = "ۣۧۡ"
            r1 = r0
            goto Lc
        Laa:
            r2 = r10 ^ (-64)
            java.lang.String r0 = "ۣ۟ۡ"
            r1 = r0
            r9 = r2
            goto Lc
        Lb2:
            r2 = r10 ^ 129(0x81, float:1.81E-43)
            java.lang.String r0 = "ۢۤۥ"
            r1 = r0
            r9 = r2
            goto Lc
        Lba:
            return
    }

    public void downloadCommentImageSilent(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            short[] r0 = m8183()
            r1 = 1479(0x5c7, float:2.073E-42)
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-807(0xfffffffffffffcd9, float:NaN))
            r3 = 1238(0x4d6, float:1.735E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r1, r2, r3)
            short[] r1 = m8183()
            r2 = 1483(0x5cb, float:2.078E-42)
            int r3 = androidx.activity.C1066.f92
            r3 = r3 ^ 824(0x338, float:1.155E-42)
            r4 = 2693(0xa85, float:3.774E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1079.m1457(r1, r2, r3, r4)
            r2 = 1
            java.lang.String r4 = m8173(r8, r1, r2, r0)
            java.lang.String r5 = androidx.lifecycle.runtime.C1092.m2350()
            short[] r0 = m8183()
            r1 = 1496(0x5d8, float:2.096E-42)
            int r2 = androidx.interpolator.C1083.f109
            r2 = r2 ^ (-442(0xfffffffffffffe46, float:NaN))
            r3 = 784(0x310, float:1.099E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1089.m2127(r0, r1, r2, r3)
            short[] r0 = m8183()
            r1 = 1500(0x5dc, float:2.102E-42)
            int r2 = androidx.core.C1072.f98
            r2 = r2 ^ (-534(0xfffffffffffffdea, float:NaN))
            r3 = 1677(0x68d, float:2.35E-42)
            java.lang.String r3 = androidx.activity.C1064.m310(r0, r1, r2, r3)
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.startup.C1100.m2972()
            r0 = 1616(0x650, float:2.264E-42)
        L56:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L5c;
                case 49: goto L5f;
                case 204: goto L64;
                case 239: goto L73;
                default: goto L5b;
            }
        L5b:
            goto L56
        L5c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L56
        L5f:
            if (r1 < 0) goto L5c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L56
        L64:
            java.lang.String r0 = "Sue4dP6oMw7c8BTQbIW0l2Ev"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L73:
            return
    }

    public void downloadCommentLivePhoto(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r5 = 1
            short[] r0 = m8183()
            r1 = 1510(0x5e6, float:2.116E-42)
            int r2 = androidx.startup.C1100.f126
            r2 = r2 ^ (-274(0xfffffffffffffeee, float:NaN))
            r3 = 2763(0xacb, float:3.872E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8020(r0, r1, r2, r3)
            short[] r1 = m8183()
            r2 = 1514(0x5ea, float:2.122E-42)
            int r3 = kevin.fun.hook.audio.C1117.f406
            r3 = r3 ^ 67
            r4 = 2499(0x9c3, float:3.502E-42)
            java.lang.String r1 = androidx.loader.C1098.m2787(r1, r2, r3, r4)
            java.lang.String r6 = m8173(r7, r1, r5, r0)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            m8208(r0, r1, r2, r3, r4, r5, r6)
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            if (r1 > 0) goto L39
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L33
        L41:
            java.lang.String r0 = "mcYTz2eK8QwV"
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8480(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L50:
            return
    }

    public void downloadEmoji(android.content.Context r14, java.lang.String r15) {
            r13 = this;
            r2 = 0
            r0 = 0
            java.lang.String r1 = "ۣۦۨ"
            r8 = r0
            r3 = r0
            r6 = r0
            r9 = r0
            r4 = r0
            r5 = r0
            r10 = r0
            r11 = r2
            r12 = r2
        Ld:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56475: goto L6e;
                case 1747653: goto Lbc;
                case 1749669: goto Lcf;
                case 1749670: goto L95;
                case 1749756: goto L1b;
                case 1749763: goto L5b;
                case 1749795: goto L53;
                case 1749857: goto L81;
                case 1750626: goto L48;
                case 1750656: goto L62;
                case 1750756: goto Laa;
                case 1750757: goto Lb3;
                case 1751495: goto L9d;
                case 1751585: goto L7a;
                case 1751589: goto Le1;
                case 1752517: goto Ld8;
                case 1752585: goto L2a;
                case 1753577: goto L31;
                case 1754505: goto L38;
                case 1754533: goto Lc5;
                case 1754658: goto L40;
                case 1755430: goto L8d;
                case 1755435: goto L22;
                default: goto L14;
            }
        L14:
            int r2 = com.tencent.mmkv.C1109.f135
            java.lang.String r0 = "ۤۢ۟"
            r1 = r0
            r11 = r2
            goto Ld
        L1b:
            r2 = r11 ^ (-621(0xfffffffffffffd93, float:NaN))
            java.lang.String r0 = "ۣۣ۠"
            r1 = r0
            r12 = r2
            goto Ld
        L22:
            short[] r0 = m8183()
            java.lang.String r1 = "ۦۤۧ"
            r10 = r0
            goto Ld
        L2a:
            r2 = r11 ^ (-104(0xffffffffffffff98, float:NaN))
            java.lang.String r0 = "ۤ۟ۢ"
            r1 = r0
            r12 = r2
            goto Ld
        L31:
            int r2 = androidx.lifecycle.process.C1091.f117
            java.lang.String r0 = "ۢۢۦ"
            r1 = r0
            r11 = r2
            goto Ld
        L38:
            short[] r0 = m8183()
            java.lang.String r1 = "ۢۥۦ"
            r10 = r0
            goto Ld
        L40:
            short[] r0 = m8183()
            java.lang.String r1 = "ۤۧۡ"
            r10 = r0
            goto Ld
        L48:
            r7 = 1
            r0 = r13
            r1 = r14
            r2 = r15
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۣۤۢ"
            r1 = r0
            goto Ld
        L53:
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r9)
            java.lang.String r0 = "ۥۡۡ"
            r1 = r0
            goto Ld
        L5b:
            int r2 = androidx.lifecycle.process.C1087.f113
            java.lang.String r0 = "ۢۥ۟"
            r1 = r0
            r11 = r2
            goto Ld
        L62:
            r0 = 1534(0x5fe, float:2.15E-42)
            r1 = 1091(0x443, float:1.529E-42)
            java.lang.String r6 = kevin.fun.hook.webdav.C1118.m8509(r10, r0, r12, r1)
            java.lang.String r0 = "ۣۧۨ"
            r1 = r0
            goto Ld
        L6e:
            r0 = 1529(0x5f9, float:2.143E-42)
            r1 = 2746(0xaba, float:3.848E-42)
            java.lang.String r5 = androidx.interpolator.C1083.m1723(r10, r0, r12, r1)
            java.lang.String r0 = "ۣۦۧ"
            r1 = r0
            goto Ld
        L7a:
            r2 = r11 ^ (-494(0xfffffffffffffe12, float:NaN))
            java.lang.String r0 = "ۢۨۧ"
            r1 = r0
            r12 = r2
            goto Ld
        L81:
            r0 = 1537(0x601, float:2.154E-42)
            r1 = 2720(0xaa0, float:3.812E-42)
            java.lang.String r3 = androidx.vectordrawable.C1105.m3247(r10, r0, r12, r1)
            java.lang.String r0 = "ۣۢۡ"
            r1 = r0
            goto Ld
        L8d:
            int r2 = androidx.lifecycle.process.C1088.f114
            java.lang.String r0 = "ۥۣۧ"
            r1 = r0
            r11 = r2
            goto Ld
        L95:
            r2 = r11 ^ (-495(0xfffffffffffffe11, float:NaN))
            java.lang.String r0 = "ۥ۠"
            r1 = r0
            r12 = r2
            goto Ld
        L9d:
            r0 = 1524(0x5f4, float:2.136E-42)
            r1 = 3090(0xc12, float:4.33E-42)
            java.lang.String r5 = androidx.versionedparcelable.C1107.m3485(r10, r0, r12, r1)
            java.lang.String r0 = "۠۟ۤ"
            r1 = r0
            goto Ld
        Laa:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r8, r5)
            java.lang.String r1 = "ۢۦۧ"
            r9 = r0
            goto Ld
        Lb3:
            short[] r0 = m8183()
            java.lang.String r1 = "ۨۢ۠"
            r10 = r0
            goto Ld
        Lbc:
            java.lang.String r4 = m8240(r13, r5)
            java.lang.String r0 = "ۧۤۢ"
            r1 = r0
            goto Ld
        Lc5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ۢۢۥ"
            r9 = r0
            goto Ld
        Lcf:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r9, r4)
            java.lang.String r1 = "ۨۢۥ"
            r8 = r0
            goto Ld
        Ld8:
            java.lang.String r5 = androidx.lifecycle.runtime.C1092.m2350()
            java.lang.String r0 = "ۣۧۥ"
            r1 = r0
            goto Ld
        Le1:
            return
    }

    public void downloadWorkCover(android.content.Context r13, java.lang.String r14) {
            r12 = this;
            r10 = 0
            r0 = 0
            java.lang.String r1 = "ۢ۟ۥ"
            r3 = r0
            r4 = r0
            r5 = r0
            r6 = r0
            r8 = r0
            r9 = r10
            r11 = r10
        Lb:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56415: goto Lbb;
                case 1748707: goto L52;
                case 1749574: goto L7c;
                case 1749576: goto L2d;
                case 1749795: goto L4a;
                case 1750600: goto L43;
                case 1750661: goto Lb3;
                case 1750752: goto L65;
                case 1751656: goto L35;
                case 1751743: goto L1e;
                case 1752647: goto L90;
                case 1752732: goto L25;
                case 1753416: goto L3c;
                case 1754563: goto L59;
                case 1754565: goto La2;
                case 1754598: goto L83;
                case 1754657: goto L71;
                case 1755367: goto L99;
                case 1755429: goto Lab;
                default: goto L12;
            }
        L12:
            r0 = 1547(0x60b, float:2.168E-42)
            r1 = 1102(0x44e, float:1.544E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1087.m2008(r8, r0, r11, r1)
            java.lang.String r0 = "ۧۥۣ"
            r1 = r0
            goto Lb
        L1e:
            r2 = r9 ^ 379(0x17b, float:5.31E-43)
            java.lang.String r0 = "ۧۥۡ"
            r1 = r0
            r11 = r2
            goto Lb
        L25:
            short[] r0 = m8183()
            java.lang.String r1 = "ۨۢ۟"
            r8 = r0
            goto Lb
        L2d:
            short[] r0 = m8183()
            java.lang.String r1 = "ۤۤۨ"
            r8 = r0
            goto Lb
        L35:
            int r2 = androidx.emoji2.viewsintegration.C1078.f104
            java.lang.String r0 = "ۦ۟ۡ"
            r1 = r0
            r9 = r2
            goto Lb
        L3c:
            r2 = r9 ^ 611(0x263, float:8.56E-43)
            java.lang.String r0 = "ۢۢ"
            r1 = r0
            r11 = r2
            goto Lb
        L43:
            int r2 = kevin.fun.hook.audio.C1114.f403
            java.lang.String r0 = "ۣۢ۟"
            r1 = r0
            r9 = r2
            goto Lb
        L4a:
            short[] r0 = m8183()
            java.lang.String r1 = "ۡۢۤ"
            r8 = r0
            goto Lb
        L52:
            int r2 = androidx.emoji2.C1080.f106
            java.lang.String r0 = "ۤۧۢ"
            r1 = r0
            r9 = r2
            goto Lb
        L59:
            r0 = 1556(0x614, float:2.18E-42)
            r1 = 1894(0x766, float:2.654E-42)
            java.lang.String r6 = kevin.fun.hook.audio.C1114.m7940(r8, r0, r11, r1)
            java.lang.String r0 = "ۥۨ۟"
            r1 = r0
            goto Lb
        L65:
            r0 = 1558(0x616, float:2.183E-42)
            r1 = 3198(0xc7e, float:4.481E-42)
            java.lang.String r3 = androidx.lifecycle.viewmodel.C1093.m2415(r8, r0, r11, r1)
            java.lang.String r0 = "ۧۨۢ"
            r1 = r0
            goto Lb
        L71:
            r7 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۣۢ"
            r1 = r0
            goto Lb
        L7c:
            r2 = r9 ^ (-23)
            java.lang.String r0 = "ۧۦۥ"
            r1 = r0
            r11 = r2
            goto Lb
        L83:
            r0 = 1551(0x60f, float:2.173E-42)
            r1 = 2531(0x9e3, float:3.547E-42)
            java.lang.String r5 = androidx.versionedparcelable.C1106.m3338(r8, r0, r11, r1)
            java.lang.String r0 = "ۥۥۧ"
            r1 = r0
            goto Lb
        L90:
            java.lang.String r4 = m8173(r12, r5, r10, r6)
            java.lang.String r0 = "ۨ۠۟"
            r1 = r0
            goto Lb
        L99:
            java.lang.String r5 = androidx.lifecycle.viewmodel.C1093.m2428()
            java.lang.String r0 = "ۢۦۧ"
            r1 = r0
            goto Lb
        La2:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۡۦ"
            r8 = r0
            goto Lb
        Lab:
            int r2 = androidx.lifecycle.runtime.C1092.f118
            java.lang.String r0 = "ۣۣۥ"
            r1 = r0
            r9 = r2
            goto Lb
        Lb3:
            r2 = r9 ^ 789(0x315, float:1.106E-42)
            java.lang.String r0 = "ۣۦۣ"
            r1 = r0
            r11 = r2
            goto Lb
        Lbb:
            return
    }

    public void downloadWorkImage(android.content.Context r13, java.lang.String r14) {
            r12 = this;
            r10 = 0
            r0 = 0
            java.lang.String r1 = "ۣۤۢ"
            r3 = r0
            r4 = r0
            r6 = r0
            r5 = r0
            r8 = r0
            r9 = r10
            r11 = r10
        Lb:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56568: goto L74;
                case 1747686: goto L8a;
                case 1748738: goto L65;
                case 1748835: goto L7b;
                case 1748866: goto L6c;
                case 1749572: goto L9f;
                case 1749573: goto La8;
                case 1749610: goto L30;
                case 1749663: goto L24;
                case 1750537: goto L56;
                case 1750689: goto L82;
                case 1750692: goto L92;
                case 1751685: goto Lb1;
                case 1751743: goto L1d;
                case 1752583: goto Lba;
                case 1753480: goto L3c;
                case 1753545: goto L4a;
                case 1754446: goto L5d;
                case 1754505: goto L43;
                default: goto L12;
            }
        L12:
            r7 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۥۣۥ"
            r1 = r0
            goto Lb
        L1d:
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            java.lang.String r0 = "ۣۡۤ"
            r1 = r0
            r9 = r2
            goto Lb
        L24:
            r0 = 1577(0x629, float:2.21E-42)
            r1 = 1199(0x4af, float:1.68E-42)
            java.lang.String r6 = androidx.appcompat.C1069.m751(r8, r0, r11, r1)
            java.lang.String r0 = "ۧۡۨ"
            r1 = r0
            goto Lb
        L30:
            r0 = 1579(0x62b, float:2.213E-42)
            r1 = 1787(0x6fb, float:2.504E-42)
            java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r8, r0, r11, r1)
            java.lang.String r0 = "۠ۧۢ"
            r1 = r0
            goto Lb
        L3c:
            r2 = r9 ^ (-231(0xffffffffffffff19, float:NaN))
            java.lang.String r0 = "ۦۣۦ"
            r1 = r0
            r11 = r2
            goto Lb
        L43:
            int r2 = org.luckypray.dexkit.C1125.f435
            java.lang.String r0 = "ۦۣۡ"
            r1 = r0
            r9 = r2
            goto Lb
        L4a:
            r0 = 1568(0x620, float:2.197E-42)
            r1 = 682(0x2aa, float:9.56E-43)
            java.lang.String r6 = org.luckypray.dexkit.C1124.m10545(r8, r0, r11, r1)
            java.lang.String r0 = "ۢ۟ۢ"
            r1 = r0
            goto Lb
        L56:
            r2 = r9 ^ (-97)
            java.lang.String r0 = "ۢۢ۟"
            r1 = r0
            r11 = r2
            goto Lb
        L5d:
            short[] r0 = m8183()
            java.lang.String r1 = "۠۠ۦ"
            r8 = r0
            goto Lb
        L65:
            r2 = r9 ^ (-929(0xfffffffffffffc5f, float:NaN))
            java.lang.String r0 = "ۣۤۥ"
            r1 = r0
            r11 = r2
            goto Lb
        L6c:
            java.lang.String r5 = androidx.lifecycle.runtime.C1092.m2350()
            java.lang.String r0 = "ۢ۟ۡ"
            r1 = r0
            goto Lb
        L74:
            int r2 = androidx.lifecycle.process.C1088.f114
            java.lang.String r0 = "ۣ۟ۥ"
            r1 = r0
            r9 = r2
            goto Lb
        L7b:
            r2 = r9 ^ (-63)
            java.lang.String r0 = "ۢ۠ۨ"
            r1 = r0
            r11 = r2
            goto Lb
        L82:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۧۥ"
            r8 = r0
            goto Lb
        L8a:
            int r2 = androidx.activity.C1065.f91
            java.lang.String r0 = "ۡۦۨ"
            r1 = r0
            r9 = r2
            goto Lb
        L92:
            r0 = 1572(0x624, float:2.203E-42)
            r1 = 1844(0x734, float:2.584E-42)
            java.lang.String r5 = androidx.core.C1073.m1028(r8, r0, r11, r1)
            java.lang.String r0 = "ۤۥۦ"
            r1 = r0
            goto Lb
        L9f:
            short[] r0 = m8183()
            java.lang.String r1 = "ۨ۠"
            r8 = r0
            goto Lb
        La8:
            short[] r0 = m8183()
            java.lang.String r1 = "ۤۧۢ"
            r8 = r0
            goto Lb
        Lb1:
            java.lang.String r4 = m8173(r12, r5, r10, r6)
            java.lang.String r0 = "ۡۧۨ"
            r1 = r0
            goto Lb
        Lba:
            return
    }

    public void downloadWorkImageSilent(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            r7 = 0
            short[] r0 = m8183()
            r1 = 1589(0x635, float:2.227E-42)
            int r2 = androidx.vectordrawable.C1104.f130
            r2 = r2 ^ 599(0x257, float:8.4E-43)
            r3 = 879(0x36f, float:1.232E-42)
            java.lang.String r0 = androidx.loader.C1095.m2574(r0, r1, r2, r3)
            short[] r1 = m8183()
            r2 = 1593(0x639, float:2.232E-42)
            int r3 = androidx.customview.C1074.f100
            r3 = r3 ^ 246(0xf6, float:3.45E-43)
            r4 = 1990(0x7c6, float:2.789E-42)
            java.lang.String r1 = androidx.versionedparcelable.C1107.m3485(r1, r2, r3, r4)
            java.lang.String r4 = m8173(r8, r1, r7, r0)
            java.lang.String r5 = androidx.lifecycle.runtime.C1092.m2350()
            short[] r0 = m8183()
            r1 = 1598(0x63e, float:2.239E-42)
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 783(0x30f, float:1.097E-42)
            r3 = 2076(0x81c, float:2.909E-42)
            java.lang.String r6 = androidx.versionedparcelable.C1107.m3485(r0, r1, r2, r3)
            short[] r0 = m8183()
            r1 = 1600(0x640, float:2.242E-42)
            int r2 = androidx.emoji2.viewsintegration.C1079.f105
            r2 = r2 ^ (-101(0xffffffffffffff9b, float:NaN))
            r3 = 1291(0x50b, float:1.809E-42)
            java.lang.String r3 = androidx.vectordrawable.C1104.m3232(r0, r1, r2, r3)
            r0 = r8
            r1 = r9
            r2 = r10
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L55:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L5b;
                case 49: goto L5e;
                case 204: goto L63;
                case 239: goto L72;
                default: goto L5a;
            }
        L5a:
            goto L55
        L5b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L55
        L5e:
            if (r1 > 0) goto L5b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L55
        L63:
            java.lang.String r0 = "e6bGj5"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1079.m1451(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L72:
            return
    }

    public void downloadWorkLivePhoto(android.content.Context r13, java.lang.String r14, java.lang.String r15, boolean r16) {
            r12 = this;
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = 0
            r1 = 0
            r6 = 0
            java.lang.String r3 = "۟ۦۤ"
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r4
            r11 = r5
        Ld:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r0) {
                case 56389: goto L22;
                case 1746845: goto L3f;
                case 1746880: goto L56;
                case 1746909: goto L36;
                case 1748833: goto L63;
                case 1749604: goto L6a;
                case 1749856: goto L4f;
                case 1751587: goto L46;
                case 1751649: goto L73;
                case 1753452: goto L2f;
                default: goto L14;
            }
        L14:
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            m8208(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "ۤۤۡ"
            r3 = r0
            goto Ld
        L22:
            r0 = 1610(0x64a, float:2.256E-42)
            r1 = 2012(0x7dc, float:2.82E-42)
            java.lang.String r0 = androidx.startup.C1100.m2931(r9, r0, r11, r1)
            java.lang.String r1 = "ۢ۠ۢ"
            r7 = r0
            r3 = r1
            goto Ld
        L2f:
            int r1 = androidx.lifecycle.process.C1091.f117
            java.lang.String r0 = "ۢۨۦ"
            r3 = r0
            r10 = r1
            goto Ld
        L36:
            short[] r0 = m8183()
            java.lang.String r1 = "ۦ۠ۦ"
            r9 = r0
            r3 = r1
            goto Ld
        L3f:
            r1 = r10 ^ 654(0x28e, float:9.16E-43)
            java.lang.String r0 = "۟ۥۦ"
            r3 = r0
            r11 = r1
            goto Ld
        L46:
            r0 = 0
            java.lang.String r6 = m8173(r12, r8, r0, r7)
            java.lang.String r0 = "ۢۦۢ"
            r3 = r0
            goto Ld
        L4f:
            r1 = r10 ^ (-496(0xfffffffffffffe10, float:NaN))
            java.lang.String r0 = "ۢۧ"
            r3 = r0
            r11 = r1
            goto Ld
        L56:
            r0 = 1614(0x64e, float:2.262E-42)
            r1 = 2448(0x990, float:3.43E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r9, r0, r11, r1)
            java.lang.String r1 = "ۤۢۡ"
            r8 = r0
            r3 = r1
            goto Ld
        L63:
            int r1 = androidx.versionedparcelable.C1107.f133
            java.lang.String r0 = "۟ۤۢ"
            r3 = r0
            r10 = r1
            goto Ld
        L6a:
            short[] r0 = m8183()
            java.lang.String r1 = "ۡۦۦ"
            r9 = r0
            r3 = r1
            goto Ld
        L73:
            return
    }

    public void downloadWorkMusic(android.content.Context r13, java.lang.String r14) {
            r12 = this;
            r10 = 0
            r0 = 0
            java.lang.String r1 = "ۢۢۨ"
            r4 = r0
            r3 = r0
            r5 = r0
            r6 = r0
            r8 = r0
            r9 = r10
            r11 = r10
        Lb:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 1746882: goto Lba;
                case 1747713: goto L78;
                case 1747777: goto L71;
                case 1748710: goto L7f;
                case 1749604: goto L98;
                case 1749672: goto L3b;
                case 1750570: goto L34;
                case 1750626: goto L5e;
                case 1750629: goto La5;
                case 1750693: goto Lae;
                case 1751530: goto L2c;
                case 1751532: goto L56;
                case 1752733: goto L19;
                case 1753423: goto L4a;
                case 1753607: goto L87;
                case 1754538: goto L20;
                case 1754593: goto L65;
                case 1755460: goto L90;
                case 1755496: goto L43;
                default: goto L12;
            }
        L12:
            int r2 = androidx.documentfile.C1076.f102
            java.lang.String r0 = "ۥۨ۠"
            r1 = r0
            r9 = r2
            goto Lb
        L19:
            r2 = r9 ^ (-606(0xfffffffffffffda2, float:NaN))
            java.lang.String r0 = "ۧۦ۠"
            r1 = r0
            r11 = r2
            goto Lb
        L20:
            r0 = 1628(0x65c, float:2.281E-42)
            r1 = 911(0x38f, float:1.277E-42)
            java.lang.String r5 = androidx.activity.C1062.m170(r8, r0, r11, r1)
            java.lang.String r0 = "ۤ۠ۦ"
            r1 = r0
            goto Lb
        L2c:
            java.lang.String r4 = m8173(r12, r5, r10, r6)
            java.lang.String r0 = "ۦۥۦ"
            r1 = r0
            goto Lb
        L34:
            r2 = r9 ^ 279(0x117, float:3.91E-43)
            java.lang.String r0 = "ۦ۟ۨ"
            r1 = r0
            r11 = r2
            goto Lb
        L3b:
            short[] r0 = m8183()
            java.lang.String r1 = "۠ۦۣ"
            r8 = r0
            goto Lb
        L43:
            int r2 = androidx.drawerlayout.C1077.f103
            java.lang.String r0 = "ۣ۠ۧ"
            r1 = r0
            r9 = r2
            goto Lb
        L4a:
            r0 = 1635(0x663, float:2.291E-42)
            r1 = 2209(0x8a1, float:3.095E-42)
            java.lang.String r3 = androidx.interpolator.C1082.m1694(r8, r0, r11, r1)
            java.lang.String r0 = "ۣۤۦ"
            r1 = r0
            goto Lb
        L56:
            short[] r0 = m8183()
            java.lang.String r1 = "ۨۤۤ"
            r8 = r0
            goto Lb
        L5e:
            int r2 = kevin.fun.hook.audio.C1115.f404
            java.lang.String r0 = "ۣ۠ۤ"
            r1 = r0
            r9 = r2
            goto Lb
        L65:
            r0 = 1624(0x658, float:2.276E-42)
            r1 = 439(0x1b7, float:6.15E-43)
            java.lang.String r6 = androidx.lifecycle.process.C1089.m2127(r8, r0, r11, r1)
            java.lang.String r0 = "ۣۢۤ"
            r1 = r0
            goto Lb
        L71:
            r2 = r9 ^ 807(0x327, float:1.131E-42)
            java.lang.String r0 = "ۧۤۧ"
            r1 = r0
            r11 = r2
            goto Lb
        L78:
            int r2 = androidx.vectordrawable.C1104.f130
            java.lang.String r0 = "ۣۨ۟"
            r1 = r0
            r9 = r2
            goto Lb
        L7f:
            short[] r0 = m8183()
            java.lang.String r1 = "۠ۡۢ"
            r8 = r0
            goto Lb
        L87:
            java.lang.String r5 = androidx.lifecycle.livedata.C1085.m1870()
            java.lang.String r0 = "ۡۢۧ"
            r1 = r0
            goto Lb
        L90:
            r2 = r9 ^ 593(0x251, float:8.31E-43)
            java.lang.String r0 = "ۢ۠ۢ"
            r1 = r0
            r11 = r2
            goto Lb
        L98:
            r0 = 1633(0x661, float:2.288E-42)
            r1 = 1260(0x4ec, float:1.766E-42)
            java.lang.String r6 = androidx.vectordrawable.C1104.m3232(r8, r0, r11, r1)
            java.lang.String r0 = "ۤ۠ۨ"
            r1 = r0
            goto Lb
        La5:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۢۡ"
            r8 = r0
            goto Lb
        Lae:
            r7 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "۟ۥۨ"
            r1 = r0
            goto Lb
        Lba:
            return
    }

    public void downloadWorkVideo(android.content.Context r13, java.lang.String r14) {
            r12 = this;
            r10 = 0
            r0 = 0
            java.lang.String r1 = "ۨ۠۟"
            r3 = r0
            r4 = r0
            r6 = r0
            r5 = r0
            r8 = r0
            r9 = r10
            r11 = r10
        Lb:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r0) {
                case 56289: goto L20;
                case 56295: goto L36;
                case 56507: goto L93;
                case 1747650: goto L77;
                case 1747804: goto L2e;
                case 1748733: goto L42;
                case 1749818: goto L19;
                case 1750719: goto L27;
                case 1751493: goto Lb2;
                case 1751500: goto Lba;
                case 1751616: goto L8b;
                case 1751651: goto L7f;
                case 1753419: goto L5c;
                case 1753538: goto L6f;
                case 1754438: goto L9c;
                case 1754444: goto L68;
                case 1754474: goto L54;
                case 1754506: goto L4d;
                case 1755367: goto La9;
                default: goto L12;
            }
        L12:
            r2 = r9 ^ 118(0x76, float:1.65E-43)
            java.lang.String r0 = "۟ۦ"
            r1 = r0
            r11 = r2
            goto Lb
        L19:
            int r2 = androidx.drawerlayout.C1077.f103
            java.lang.String r0 = "ۧۡۦ"
            r1 = r0
            r9 = r2
            goto Lb
        L20:
            int r2 = androidx.interpolator.C1083.f109
            java.lang.String r0 = "ۣۥۡ"
            r1 = r0
            r9 = r2
            goto Lb
        L27:
            r2 = r9 ^ (-441(0xfffffffffffffe47, float:NaN))
            java.lang.String r0 = "ۦ۟ۤ"
            r1 = r0
            r11 = r2
            goto Lb
        L2e:
            short[] r0 = m8183()
            java.lang.String r1 = "۟۠"
            r8 = r0
            goto Lb
        L36:
            r0 = 1644(0x66c, float:2.304E-42)
            r1 = 1615(0x64f, float:2.263E-42)
            java.lang.String r6 = androidx.core.ktx.C1071.m874(r8, r0, r11, r1)
            java.lang.String r0 = "۠ۤ۠"
            r1 = r0
            goto Lb
        L42:
            r7 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ۤ۟ۧ"
            r1 = r0
            goto Lb
        L4d:
            int r2 = androidx.loader.C1097.f123
            java.lang.String r0 = "۟ۥ۠"
            r1 = r0
            r9 = r2
            goto Lb
        L54:
            short[] r0 = m8183()
            java.lang.String r1 = "ۢۧ۟"
            r8 = r0
            goto Lb
        L5c:
            r0 = 1648(0x670, float:2.31E-42)
            r1 = 1476(0x5c4, float:2.068E-42)
            java.lang.String r5 = androidx.loader.C1099.m2843(r8, r0, r11, r1)
            java.lang.String r0 = "ۦۣ۟"
            r1 = r0
            goto Lb
        L68:
            r2 = r9 ^ 279(0x117, float:3.91E-43)
            java.lang.String r0 = "ۧۡ۠"
            r1 = r0
            r11 = r2
            goto Lb
        L6f:
            java.lang.String r4 = m8173(r12, r5, r10, r6)
            java.lang.String r0 = "ۦۡ"
            r1 = r0
            goto Lb
        L77:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۤ۟"
            r8 = r0
            goto Lb
        L7f:
            r0 = 1653(0x675, float:2.316E-42)
            r1 = 482(0x1e2, float:6.75E-43)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r8, r0, r11, r1)
            java.lang.String r0 = "ۧۢۥ"
            r1 = r0
            goto Lb
        L8b:
            int r2 = androidx.lifecycle.viewmodel.C1093.f119
            java.lang.String r0 = "ۤ۟۠"
            r1 = r0
            r9 = r2
            goto Lb
        L93:
            java.lang.String r5 = androidx.lifecycle.viewmodel.C1093.m2428()
            java.lang.String r0 = "۠۟ۡ"
            r1 = r0
            goto Lb
        L9c:
            r0 = 1655(0x677, float:2.319E-42)
            r1 = 883(0x373, float:1.237E-42)
            java.lang.String r3 = androidx.appcompat.C1069.m751(r8, r0, r11, r1)
            java.lang.String r0 = "ۣۡ۟"
            r1 = r0
            goto Lb
        La9:
            short[] r0 = m8183()
            java.lang.String r1 = "ۣۧۦ"
            r8 = r0
            goto Lb
        Lb2:
            r2 = r9 ^ (-120(0xffffffffffffff88, float:NaN))
            java.lang.String r0 = "ۣۤۤ"
            r1 = r0
            r11 = r2
            goto Lb
        Lba:
            return
    }

    public void downloadWorkVideoSilent(android.content.Context r9, java.lang.String r10) {
            r8 = this;
            r7 = 0
            short[] r0 = m8183()
            r1 = 1664(0x680, float:2.332E-42)
            int r2 = androidx.vectordrawable.C1105.f131
            r2 = r2 ^ 354(0x162, float:4.96E-43)
            r3 = 543(0x21f, float:7.61E-43)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
            short[] r1 = m8183()
            r2 = 1668(0x684, float:2.337E-42)
            int r3 = kevin.fun.hook.audio.C1116.f405
            r3 = r3 ^ 87
            r4 = 2744(0xab8, float:3.845E-42)
            java.lang.String r1 = androidx.loader.C1098.m2787(r1, r2, r3, r4)
            java.lang.String r4 = m8173(r8, r1, r7, r0)
            java.lang.String r5 = androidx.lifecycle.viewmodel.C1093.m2428()
            short[] r0 = m8183()
            r1 = 1673(0x689, float:2.344E-42)
            int r2 = com.tencent.mmkv.C1109.f135
            r2 = r2 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r3 = 1576(0x628, float:2.208E-42)
            java.lang.String r6 = androidx.interpolator.C1082.m1694(r0, r1, r2, r3)
            short[] r0 = m8183()
            r1 = 1675(0x68b, float:2.347E-42)
            int r2 = androidx.loader.C1099.f125
            r2 = r2 ^ 850(0x352, float:1.191E-42)
            r3 = 1330(0x532, float:1.864E-42)
            java.lang.String r3 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            r0 = r8
            r1 = r9
            r2 = r10
            m8190(r0, r1, r2, r3, r4, r5, r6, r7)
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1616(0x650, float:2.264E-42)
        L55:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L5b;
                case 49: goto L5e;
                case 204: goto L63;
                case 239: goto L72;
                default: goto L5a;
            }
        L5a:
            goto L55
        L5b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L55
        L5e:
            if (r1 < 0) goto L5b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L55
        L63:
            java.lang.String r0 = "ntCoFQBDZrN"
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10497(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L72:
            return
    }

    public kevin.fun.hook.download.DownloadManager.BatchDownloadManager getBatchManager() {
            r1 = this;
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r1)
            return r0
    }

    /* JADX INFO: renamed from: lambda$0$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8243lambda$0$kevinfunhookdownloadDownloadManager(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            kevin.fun.hook.audio.C1116.m8030(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: lambda$1$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8244lambda$1$kevinfunhookdownloadDownloadManager(android.content.Context r7, java.lang.String r8) {
            r6 = this;
            kevin.fun.hook.audio.C1117.m8157(r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            androidx.lifecycle.process.C1090.m2197(r0, r1)     // Catch: java.lang.Throwable -> L27
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L24;
                default: goto L12;
            }
        L12:
            goto Ld
        L13:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1740(0x6cc, float:2.438E-42)
        L19:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1f;
                case 54: goto L59;
                case 471: goto L6b;
                case 500: goto L5c;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            if (r1 > 0) goto L59
            r0 = 1833(0x729, float:2.569E-42)
            goto L19
        L24:
            r0 = 1647(0x66f, float:2.308E-42)
            goto Ld
        L27:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8183()
            r3 = 1684(0x694, float:2.36E-42)
            int r4 = androidx.emoji2.viewsintegration.C1079.f105
            r4 = r4 ^ (-118(0xffffffffffffff8a, float:NaN))
            r5 = 2714(0xa9a, float:3.803E-42)
            java.lang.String r2 = androidx.documentfile.C1076.m1234(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8215(r0)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r6)
            r1 = 0
            androidx.lifecycle.process.C1090.m2197(r0, r1)
            goto L13
        L59:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L19
        L5c:
            java.lang.String r0 = "vVfEUg6MdF58UFd9Vmml8jCD0tZ"
            java.lang.String r0 = androidx.emoji2.C1080.m1544(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L6b:
            return
    }

    /* JADX INFO: renamed from: lambda$10$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8245lambda$10$kevinfunhookdownloadDownloadManager(boolean r5, android.content.Context r6) {
            r4 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L2b;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r5 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            short[] r0 = m8183()
            r1 = 1711(0x6af, float:2.398E-42)
            int r2 = androidx.core.ktx.C1071.f97
            r2 = r2 ^ 910(0x38e, float:1.275E-42)
            r3 = 1060(0x424, float:1.485E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r1, r2, r3)
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L3b;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
        L2b:
            short[] r0 = m8183()
            r1 = 1723(0x6bb, float:2.414E-42)
            int r2 = androidx.documentfile.C1076.f102
            r2 = r2 ^ (-598(0xfffffffffffffdaa, float:NaN))
            r3 = 3023(0xbcf, float:4.236E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r1, r2, r3)
        L3b:
            m8176(r4, r6, r0)
            return
    }

    /* JADX INFO: renamed from: lambda$11$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8246lambda$11$kevinfunhookdownloadDownloadManager(boolean r8, android.content.Context r9, java.lang.String r10) {
            r7 = this;
            r6 = 1
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L11;
                case 239: goto L1f;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r8 == 0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            m8193(r7, r9, r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L7c
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L22;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L7c
        L1b:
            goto L16
        L1c:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L16
        L1f:
            androidx.lifecycle.viewmodel.C1093.m2414(r7, r9, r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L7c
        L22:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L2c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L32;
                case 47384: goto L4e;
                case 47417: goto L3c;
                case 47483: goto L38;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            if (r1 == 0) goto L38
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2c
        L38:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2c
        L3c:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            androidx.lifecycle.process.C1090.m2197(r0, r6)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L46:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L4e;
                case 239: goto L4f;
                default: goto L4d;
            }
        L4d:
            goto L46
        L4e:
            return
        L4f:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L46
        L53:
            r0 = move-exception
            r1 = 48891(0xbefb, float:6.8511E-41)
        L57:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L5f;
                case 503: goto L78;
                default: goto L5e;
            }
        L5e:
            goto L57
        L5f:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r1 = m8177(r7)
            boolean r2 = androidx.vectordrawable.animated.C1102.m3111(r1)
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L6a:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 497: goto L72;
                case 1711: goto Ld1;
                case 1736: goto Ldc;
                case 1769: goto Ld5;
                default: goto L71;
            }
        L71:
            goto L6a
        L72:
            if (r2 == 0) goto Ld1
            r1 = 50658(0xc5e2, float:7.0987E-41)
            goto L6a
        L78:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto L57
        L7c:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L53
            r3 = 1735(0x6c7, float:2.431E-42)
            int r4 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L53
            r4 = r4 ^ 789(0x315, float:1.106E-42)
            r5 = 3170(0xc62, float:4.442E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1125.m10615(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L53
            m8215(r0)     // Catch: java.lang.Throwable -> L53
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        Lb0:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Lb8;
                case 50: goto Lbe;
                case 76: goto Lc2;
                case 83: goto L4e;
                default: goto Lb7;
            }
        Lb7:
            goto Lb0
        Lb8:
            if (r1 == 0) goto Lbe
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lb0
        Lbe:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lb0
        Lc2:
            r0 = 49790(0xc27e, float:6.977E-41)
        Lc5:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L3c;
                case 241: goto Lcd;
                default: goto Lcc;
            }
        Lcc:
            goto Lc5
        Lcd:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Lc5
        Ld1:
            r1 = 50627(0xc5c3, float:7.0944E-41)
            goto L6a
        Ld5:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r1 = m8177(r7)
            androidx.lifecycle.process.C1090.m2197(r1, r6)
        Ldc:
            throw r0
    }

    /* JADX INFO: renamed from: lambda$12$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8247lambda$12$kevinfunhookdownloadDownloadManager(boolean r8, android.content.Context r9, java.lang.String r10) {
            r7 = this;
            r6 = 1
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L11;
                case 239: goto L1f;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r8 == 0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            kevin.fun.hook.audio.C1117.m8157(r7, r9, r10)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L90
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L22;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L90
        L1b:
            goto L16
        L1c:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L16
        L1f:
            kevin.fun.hook.audio.C1116.m8030(r7, r9, r10)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L90
        L22:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L2c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L32;
                case 47384: goto L4e;
                case 47417: goto L3c;
                case 47483: goto L38;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            if (r1 == 0) goto L38
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2c
        L38:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2c
        L3c:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            androidx.lifecycle.process.C1090.m2197(r0, r6)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L46:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L4e;
                case 239: goto L63;
                default: goto L4d;
            }
        L4d:
            goto L46
        L4e:
            int r1 = androidx.loader.C1099.m2876()
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L55:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L5d;
                case 1711: goto Le5;
                case 1736: goto Lf9;
                case 1769: goto Lea;
                default: goto L5c;
            }
        L5c:
            goto L55
        L5d:
            if (r1 < 0) goto Le5
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L55
        L63:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L46
        L67:
            r0 = move-exception
            r1 = 48891(0xbefb, float:6.8511E-41)
        L6b:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L73;
                case 503: goto L8c;
                default: goto L72;
            }
        L72:
            goto L6b
        L73:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r1 = m8177(r7)
            boolean r2 = androidx.vectordrawable.animated.C1102.m3111(r1)
            r1 = 50689(0xc601, float:7.103E-41)
        L7e:
            r3 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L86;
                case 45: goto L105;
                case 50: goto Lfa;
                case 76: goto Lfe;
                default: goto L85;
            }
        L85:
            goto L7e
        L86:
            if (r2 == 0) goto Lfa
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto L7e
        L8c:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto L6b
        L90:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L67
            r3 = 1759(0x6df, float:2.465E-42)
            int r4 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L67
            r4 = r4 ^ 318(0x13e, float:4.46E-43)
            r5 = 3177(0xc69, float:4.452E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1088.m2044(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L67
            m8215(r0)     // Catch: java.lang.Throwable -> L67
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        Lc4:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Lcc;
                case 50: goto Ld2;
                case 76: goto Ld6;
                case 83: goto L4e;
                default: goto Lcb;
            }
        Lcb:
            goto Lc4
        Lcc:
            if (r1 == 0) goto Ld2
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lc4
        Ld2:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lc4
        Ld6:
            r0 = 49790(0xc27e, float:6.977E-41)
        Ld9:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L3c;
                case 241: goto Le1;
                default: goto Le0;
            }
        Le0:
            goto Ld9
        Le1:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Ld9
        Le5:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L55
        Lea:
            java.lang.String r0 = "gmB5B47qtQO"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lf9:
            return
        Lfa:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto L7e
        Lfe:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r1 = m8177(r7)
            androidx.lifecycle.process.C1090.m2197(r1, r6)
        L105:
            throw r0
    }

    /* JADX INFO: renamed from: lambda$13$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8248lambda$13$kevinfunhookdownloadDownloadManager(boolean r5, android.content.Context r6) {
            r4 = this;
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L2b;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r5 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            short[] r0 = m8183()
            r1 = 1783(0x6f7, float:2.499E-42)
            int r2 = androidx.documentfile.C1076.f102
            r2 = r2 ^ (-598(0xfffffffffffffdaa, float:NaN))
            r3 = 773(0x305, float:1.083E-42)
            java.lang.String r0 = androidx.core.C1073.m1028(r0, r1, r2, r3)
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L3b;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
        L2b:
            short[] r0 = m8183()
            r1 = 1795(0x703, float:2.515E-42)
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-111(0xffffffffffffff91, float:NaN))
            r3 = 2337(0x921, float:3.275E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r1, r2, r3)
        L3b:
            m8176(r4, r6, r0)
            return
    }

    /* JADX INFO: renamed from: lambda$15$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8249lambda$15$kevinfunhookdownloadDownloadManager(android.content.Context r3, int r4, java.lang.String r5) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "ۦۢۦ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748640: goto L11;
                case 1755343: goto L17;
                default: goto La;
            }
        La:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r2)
            java.lang.String r1 = "ۡ۠۟"
            goto L3
        L11:
            androidx.viewpager.C1108.m3526(r0, r3, r4, r5)
            java.lang.String r1 = "ۨ۟ۦ"
            goto L3
        L17:
            return
    }

    /* JADX INFO: renamed from: lambda$2$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8250lambda$2$kevinfunhookdownloadDownloadManager(java.lang.ref.WeakReference r13, android.app.Dialog[] r14, java.lang.String r15, java.lang.String r16, boolean[] r17, boolean[] r18, okhttp3.Call[] r19, android.net.Uri[] r20, android.content.Context r21, android.widget.TextView[] r22, android.widget.ProgressBar[] r23, android.widget.TextView[] r24) {
            r12 = this;
            java.lang.Object r10 = kevin.fun.hook.audio.C1116.m8047(r13)
            android.content.Context r10 = (android.content.Context) r10
            r3 = 1616(0x650, float:2.264E-42)
        L8:
            r3 = r3 ^ 1633(0x661, float:2.288E-42)
            switch(r3) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L3a;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r3 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r10 != 0) goto Le
            r3 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            int r4 = androidx.startup.C1101.m2984()
            r3 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r3 = r3 ^ 1757(0x6dd, float:2.462E-42)
            switch(r3) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto L39;
                case 500: goto L2a;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            if (r4 > 0) goto L27
            r3 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r3 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            java.lang.String r3 = "iYNUGLldEcRKeqqGul"
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2222(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            java.io.PrintStream r4 = java.lang.System.out
            r4.println(r3)
        L39:
            return
        L3a:
            r3 = 0
            r0 = r16
            android.app.Dialog r4 = m8185(r12, r10, r15, r0)
            r14[r3] = r4
            r3 = 0
            r3 = r14[r3]
            kevin.fun.hook.audio.C1114.m7909(r3)
            r3 = 0
            r3 = r14[r3]
            android.view.Window r3 = androidx.lifecycle.process.C1089.m2157(r3)
            android.view.View r4 = androidx.viewpager.C1108.m3492(r3)
            int r3 = m8189()
            java.lang.Object r3 = androidx.core.C1072.m966(r4, r3)
            android.view.View r3 = (android.view.View) r3
            int r5 = m8225()
            java.lang.Object r4 = androidx.core.C1072.m966(r4, r5)
            r11 = r4
            android.view.View r11 = (android.view.View) r11
            r4 = 1864(0x748, float:2.612E-42)
        L6b:
            r4 = r4 ^ 1881(0x759, float:2.636E-42)
            switch(r4) {
                case 17: goto L71;
                case 47384: goto L85;
                case 47417: goto L7b;
                case 47483: goto L77;
                default: goto L70;
            }
        L70:
            goto L6b
        L71:
            if (r3 == 0) goto L77
            r4 = 48736(0xbe60, float:6.8294E-41)
            goto L6b
        L77:
            r4 = 48705(0xbe41, float:6.825E-41)
            goto L6b
        L7b:
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda4 r4 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda4
            r0 = r17
            r4.<init>(r12, r0, r14, r10)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3728(r3, r4)
        L85:
            r3 = 48767(0xbe7f, float:6.8337E-41)
        L88:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 14: goto L90;
                case 45: goto Lac;
                case 76: goto L9a;
                case 239: goto L94;
                default: goto L8f;
            }
        L8f:
            goto L88
        L90:
            r3 = 48829(0xbebd, float:6.8424E-41)
            goto L88
        L94:
            if (r11 == 0) goto L90
            r3 = 48860(0xbedc, float:6.8467E-41)
            goto L88
        L9a:
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda5 r3 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda5
            r4 = r12
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3728(r11, r3)
        Lac:
            r3 = 0
            r3 = r14[r3]
            android.view.Window r3 = androidx.lifecycle.process.C1089.m2157(r3)
            android.view.View r3 = androidx.viewpager.C1108.m3492(r3)
            r0 = r22
            r1 = r23
            r2 = r24
            m8194(r12, r3, r0, r1, r2)
            goto L39
    }

    /* JADX INFO: renamed from: lambda$3$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8251lambda$3$kevinfunhookdownloadDownloadManager(boolean[] r5, android.app.Dialog[] r6, android.content.Context r7, android.view.View r8) {
            r4 = this;
            r2 = 0
            r0 = 1
            r5[r2] = r0
            r1 = r6[r2]
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L31;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r1 == 0) goto Le
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            r0 = r6[r2]
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L31;
                case 500: goto L2c;
                default: goto L23;
            }
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
            r0 = r6[r2]
            androidx.customview.C1074.m1118(r0)
        L31:
            short[] r0 = m8183()
            r1 = 1807(0x70f, float:2.532E-42)
            int r2 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ 2
            r3 = 2939(0xb7b, float:4.118E-42)
            java.lang.String r0 = androidx.activity.C1063.m241(r0, r1, r2, r3)
            m8176(r4, r7, r0)
            return
    }

    /* JADX INFO: renamed from: lambda$4$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8252lambda$4$kevinfunhookdownloadDownloadManager(boolean[] r6, okhttp3.Call[] r7, android.net.Uri[] r8, android.content.Context r9, android.app.Dialog[] r10, android.content.Context r11, android.view.View r12) {
            r5 = this;
            r4 = 0
            r0 = 1
            r6[r4] = r0
            r1 = r7[r4]
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L1b;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r1 == 0) goto Le
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            r0 = r7[r4]
            m8181(r0)
        L1b:
            m8198(r5)
            r1 = r8[r4]
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L2d;
                case 471: goto L35;
                case 500: goto L30;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            if (r1 == 0) goto L2d
            r0 = 1833(0x729, float:2.569E-42)
            goto L22
        L2d:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L22
        L30:
            r0 = r8[r4]
            m8227(r5, r9, r0)
        L35:
            r1 = r10[r4]
            r0 = 1864(0x748, float:2.612E-42)
        L39:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3f;
                case 47384: goto L69;
                case 47417: goto L49;
                case 47483: goto L45;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            if (r1 == 0) goto L45
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L39
        L45:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L39
        L49:
            r0 = r10[r4]
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L52:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L5a;
                case 45: goto L69;
                case 76: goto L64;
                case 239: goto L5e;
                default: goto L59;
            }
        L59:
            goto L52
        L5a:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L52
        L5e:
            if (r1 == 0) goto L5a
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L52
        L64:
            r0 = r10[r4]
            androidx.customview.C1074.m1118(r0)
        L69:
            short[] r0 = m8183()
            r1 = 1824(0x720, float:2.556E-42)
            int r2 = androidx.vectordrawable.C1104.f130
            r2 = r2 ^ 598(0x256, float:8.38E-43)
            r3 = 2586(0xa1a, float:3.624E-42)
            java.lang.String r0 = androidx.vectordrawable.C1104.m3232(r0, r1, r2, r3)
            m8195(r5, r11, r0)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r5)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L87:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L8f;
                case 53: goto La0;
                case 503: goto L93;
                case 32495: goto L99;
                default: goto L8e;
            }
        L8e:
            goto L87
        L8f:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L87
        L93:
            if (r1 == 0) goto L8f
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L87
        L99:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r5)
            androidx.lifecycle.process.C1090.m2197(r0, r4)
        La0:
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 49666(0xc202, float:6.9597E-41)
        La7:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Laf;
                case 50: goto Lb5;
                case 76: goto Lb9;
                case 83: goto Lc8;
                default: goto Lae;
            }
        Lae:
            goto La7
        Laf:
            if (r1 < 0) goto Lb5
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto La7
        Lb5:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto La7
        Lb9:
            java.lang.String r0 = "XfNT8pMK"
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2359(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lc8:
            return
    }

    /* JADX INFO: renamed from: lambda$5$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8253lambda$5$kevinfunhookdownloadDownloadManager(boolean[] r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, android.content.Context r25, android.net.Uri[] r26, okhttp3.Call[] r27, boolean r28, boolean[] r29, android.app.Dialog[] r30, android.widget.TextView[] r31, android.widget.ProgressBar[] r32, android.widget.TextView[] r33, long r34, java.lang.String r36) {
            r20 = this;
            r4 = 0
            boolean r5 = r21[r4]     // Catch: java.lang.Exception -> L21e
            r4 = 1616(0x650, float:2.264E-42)
        L5:
            r4 = r4 ^ 1633(0x661, float:2.288E-42)
            switch(r4) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L34;
                default: goto La;
            }     // Catch: java.lang.Exception -> L21e
        La:
            goto L5
        Lb:
            r4 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r5 == 0) goto Lb
            r4 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)     // Catch: java.lang.Exception -> L21e
            boolean r5 = androidx.vectordrawable.animated.C1102.m3111(r4)     // Catch: java.lang.Exception -> L21e
            r4 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r4 = r4 ^ 1757(0x6dd, float:2.462E-42)
            switch(r4) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L33;
                case 500: goto L2b;
                default: goto L22;
            }     // Catch: java.lang.Exception -> L21e
        L22:
            goto L1d
        L23:
            if (r5 == 0) goto L28
            r4 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r4 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)     // Catch: java.lang.Exception -> L21e
            r5 = 0
            androidx.lifecycle.process.C1090.m2197(r4, r5)     // Catch: java.lang.Exception -> L21e
        L33:
            return
        L34:
            r0 = r20
            r1 = r23
            r2 = r24
            java.lang.String r4 = m8221(r0, r1, r2)     // Catch: java.lang.Exception -> L21e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21e
            r5.<init>()     // Catch: java.lang.Exception -> L21e
            r0 = r22
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r0)     // Catch: java.lang.Exception -> L21e
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r5, r4)     // Catch: java.lang.Exception -> L21e
            java.lang.String r4 = kevin.fun.hook.webdav.C1119.m8573(r4)     // Catch: java.lang.Exception -> L21e
            r0 = r20
            r1 = r25
            r2 = r24
            android.net.Uri r18 = m8202(r0, r1, r4, r2)     // Catch: java.lang.Exception -> L21e
            r4 = 0
            r26[r4] = r18     // Catch: java.lang.Exception -> L21e
            kevin.fun.hook.download.DownloadManager$1 r4 = new kevin.fun.hook.download.DownloadManager$1     // Catch: java.lang.Exception -> L21e
            r5 = r20
            r6 = r21
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r25
            r17 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17)     // Catch: java.lang.Exception -> L20e
            r5 = r20
            r6 = r25
            r7 = r23
            r8 = r18
            r9 = r4
            r10 = r27
            m8209(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L20e
            r4 = 0
            boolean r5 = r21[r4]     // Catch: java.lang.Exception -> L20e
            r4 = 1864(0x748, float:2.612E-42)
        L8e:
            r4 = r4 ^ 1881(0x759, float:2.636E-42)
            switch(r4) {
                case 17: goto L94;
                case 47384: goto L115;
                case 47417: goto L9e;
                case 47483: goto L9a;
                default: goto L93;
            }
        L93:
            goto L8e
        L94:
            if (r5 == 0) goto L9a
            r4 = 48736(0xbe60, float:6.8294E-41)
            goto L8e
        L9a:
            r4 = 48705(0xbe41, float:6.825E-41)
            goto L8e
        L9e:
            r4 = 0
            r5 = r26[r4]
            r4 = 48767(0xbe7f, float:6.8337E-41)
        La4:
            r6 = 48784(0xbe90, float:6.8361E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 14: goto Lac;
                case 45: goto Lcb;
                case 76: goto Lb6;
                case 239: goto Lb0;
                default: goto Lab;
            }
        Lab:
            goto La4
        Lac:
            r4 = 48829(0xbebd, float:6.8424E-41)
            goto La4
        Lb0:
            if (r5 == 0) goto Lac
            r4 = 48860(0xbedc, float:6.8467E-41)
            goto La4
        Lb6:
            r4 = 0
            r4 = r26[r4]
            r0 = r20
            r1 = r25
            m8227(r0, r1, r4)     // Catch: java.lang.Exception -> Lf6
            r4 = 48891(0xbefb, float:6.8511E-41)
        Lc3:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 22: goto Lcb;
                case 503: goto Le4;
                default: goto Lca;
            }     // Catch: java.lang.Exception -> Lf6
        Lca:
            goto Lc3
        Lcb:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)     // Catch: java.lang.Exception -> Lf6
            boolean r5 = androidx.vectordrawable.animated.C1102.m3111(r4)     // Catch: java.lang.Exception -> Lf6
            r4 = 49666(0xc202, float:6.9597E-41)
        Ld6:
            r6 = 49683(0xc213, float:6.9621E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto Lde;
                case 50: goto Le8;
                case 76: goto Lec;
                case 83: goto L33;
                default: goto Ldd;
            }     // Catch: java.lang.Exception -> Lf6
        Ldd:
            goto Ld6
        Lde:
            if (r5 == 0) goto Le8
            r4 = 49759(0xc25f, float:6.9727E-41)
            goto Ld6
        Le4:
            r4 = 48922(0xbf1a, float:6.8554E-41)
            goto Lc3
        Le8:
            r4 = 49728(0xc240, float:6.9684E-41)
            goto Ld6
        Lec:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)     // Catch: java.lang.Exception -> Lf6
            r5 = 0
            androidx.lifecycle.process.C1090.m2197(r4, r5)     // Catch: java.lang.Exception -> Lf6
            goto L33
        Lf6:
            r4 = move-exception
            r5 = 49790(0xc27e, float:6.977E-41)
        Lfa:
            r6 = 49807(0xc28f, float:6.9794E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 18: goto L102;
                case 241: goto L111;
                default: goto L101;
            }
        L101:
            goto Lfa
        L102:
            r5 = 49914(0xc2fa, float:6.9944E-41)
        L105:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 497: goto L10d;
                case 1711: goto L20f;
                default: goto L10c;
            }
        L10c:
            goto L105
        L10d:
            r5 = 50596(0xc5a4, float:7.09E-41)
            goto L105
        L111:
            r5 = 49821(0xc29d, float:6.9814E-41)
            goto Lfa
        L115:
            r4 = 50689(0xc601, float:7.103E-41)
        L118:
            r5 = 50706(0xc612, float:7.1054E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 19: goto L120;
                case 45: goto L184;
                case 50: goto L126;
                case 76: goto L12a;
                default: goto L11f;
            }
        L11f:
            goto L118
        L120:
            if (r28 == 0) goto L126
            r4 = 50782(0xc65e, float:7.1161E-41)
            goto L118
        L126:
            r4 = 50751(0xc63f, float:7.1117E-41)
            goto L118
        L12a:
            r4 = 0
            boolean r5 = r29[r4]     // Catch: java.lang.Exception -> L165
            r4 = 50813(0xc67d, float:7.1204E-41)
        L130:
            r6 = 50830(0xc68e, float:7.1228E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 18: goto L138;
                case 53: goto L184;
                case 243: goto L13c;
                case 4075: goto L142;
                default: goto L137;
            }     // Catch: java.lang.Exception -> L165
        L137:
            goto L130
        L138:
            r4 = 50875(0xc6bb, float:7.1291E-41)
            goto L130
        L13c:
            if (r5 != 0) goto L138
            r4 = 51557(0xc965, float:7.2247E-41)
            goto L130
        L142:
            android.os.Handler r4 = m8230()     // Catch: java.lang.Exception -> L165
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda10 r5 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda10     // Catch: java.lang.Exception -> L165
            r0 = r20
            r1 = r30
            r2 = r25
            r3 = r36
            r5.<init>(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L396
            androidx.activity.C1062.m178(r4, r5)     // Catch: java.lang.Exception -> L396
            r4 = 51588(0xc984, float:7.229E-41)
        L159:
            r5 = 51605(0xc995, float:7.2314E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L161;
                case 54: goto L1e5;
                default: goto L160;
            }     // Catch: java.lang.Exception -> L396
        L160:
            goto L159
        L161:
            r4 = 51619(0xc9a3, float:7.2334E-41)
            goto L159
        L165:
            r4 = move-exception
            r5 = 51712(0xca00, float:7.2464E-41)
        L169:
            r6 = 51729(0xca11, float:7.2488E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 14: goto L171;
                case 15: goto L170;
                case 16: goto L170;
                case 17: goto L180;
                default: goto L170;
            }     // Catch: java.lang.Exception -> L396
        L170:
            goto L169
        L171:
            r5 = 54533(0xd505, float:7.6417E-41)
        L174:
            r6 = 54550(0xd516, float:7.6441E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 19: goto L17c;
                case 50: goto L20f;
                default: goto L17b;
            }     // Catch: java.lang.Exception -> L396
        L17b:
            goto L174
        L17c:
            r5 = 54564(0xd524, float:7.646E-41)
            goto L174
        L180:
            r5 = 51743(0xca1f, float:7.2507E-41)
            goto L169
        L184:
            android.os.Handler r4 = m8230()     // Catch: java.lang.Exception -> L396
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda11 r5 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda11     // Catch: java.lang.Exception -> L396
            r0 = r30
            r5.<init>(r0)     // Catch: java.lang.Exception -> L396
            androidx.activity.C1062.m178(r4, r5)     // Catch: java.lang.Exception -> L396
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)     // Catch: java.lang.Exception -> L396
            boolean r5 = androidx.vectordrawable.animated.C1102.m3111(r4)     // Catch: java.lang.Exception -> L396
            r4 = 51836(0xca7c, float:7.2638E-41)
        L19d:
            r6 = 51853(0xca8d, float:7.2662E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 241: goto L1a5;
                case 1963: goto L1ab;
                case 1992: goto L1e5;
                case 2025: goto L1af;
                default: goto L1a4;
            }
        L1a4:
            goto L19d
        L1a5:
            if (r5 == 0) goto L1ab
            r4 = 52580(0xcd64, float:7.368E-41)
            goto L19d
        L1ab:
            r4 = 52549(0xcd45, float:7.3637E-41)
            goto L19d
        L1af:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)     // Catch: java.lang.Exception -> L393
            r5 = 1
            androidx.lifecycle.process.C1090.m2197(r4, r5)     // Catch: java.lang.Exception -> L1c6
            r4 = 52611(0xcd83, float:7.3724E-41)
        L1ba:
            r5 = 52628(0xcd94, float:7.3748E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 23: goto L1c2;
                case 54: goto L1e5;
                default: goto L1c1;
            }
        L1c1:
            goto L1ba
        L1c2:
            r4 = 52642(0xcda2, float:7.3767E-41)
            goto L1ba
        L1c6:
            r4 = move-exception
            r5 = 52735(0xcdff, float:7.3897E-41)
        L1ca:
            r6 = 52752(0xce10, float:7.3921E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 14: goto L1d2;
                case 1007: goto L1e1;
                default: goto L1d1;
            }
        L1d1:
            goto L1ca
        L1d2:
            r5 = 53510(0xd106, float:7.4983E-41)
        L1d5:
            r6 = 53527(0xd117, float:7.5007E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 17: goto L1dd;
                case 50: goto L21f;
                default: goto L1dc;
            }
        L1dc:
            goto L1d5
        L1dd:
            r5 = 53541(0xd125, float:7.5027E-41)
            goto L1d5
        L1e1:
            r5 = 52766(0xce1e, float:7.3941E-41)
            goto L1ca
        L1e5:
            r4 = 1
            r0 = r20
            r1 = r25
            r2 = r22
            m8218(r0, r1, r2, r4)     // Catch: java.lang.Exception -> L1fe
            r4 = 53634(0xd182, float:7.5157E-41)
        L1f2:
            r5 = 53651(0xd193, float:7.5181E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L1fa;
                case 50: goto L33;
                default: goto L1f9;
            }
        L1f9:
            goto L1f2
        L1fa:
            r4 = 53665(0xd1a1, float:7.52E-41)
            goto L1f2
        L1fe:
            r4 = move-exception
            r5 = 53758(0xd1fe, float:7.5331E-41)
        L202:
            r6 = 53775(0xd20f, float:7.5355E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 1009: goto L20a;
                case 1703: goto L21f;
                default: goto L209;
            }
        L209:
            goto L202
        L20a:
            r5 = 54440(0xd4a8, float:7.6287E-41)
            goto L202
        L20e:
            r4 = move-exception
        L20f:
            r5 = 54657(0xd581, float:7.6591E-41)
        L212:
            r6 = 54674(0xd592, float:7.6615E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 19: goto L21a;
                case 50: goto L21f;
                default: goto L219;
            }
        L219:
            goto L212
        L21a:
            r5 = 54688(0xd5a0, float:7.6634E-41)
            goto L212
        L21e:
            r4 = move-exception
        L21f:
            java.lang.String r9 = androidx.lifecycle.process.C1090.m2209(r4)
            r4 = 0
            boolean r5 = r21[r4]
            r4 = 55432(0xd888, float:7.7677E-41)
        L229:
            r6 = 55449(0xd899, float:7.77E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L231;
                case 62: goto L237;
                case 95: goto L2b2;
                case 124: goto L23b;
                default: goto L230;
            }
        L230:
            goto L229
        L231:
            if (r5 != 0) goto L237
            r4 = 55525(0xd8e5, float:7.7807E-41)
            goto L229
        L237:
            r4 = 55494(0xd8c6, float:7.7764E-41)
            goto L229
        L23b:
            r4 = 55556(0xd904, float:7.785E-41)
        L23e:
            r5 = 55573(0xd915, float:7.7874E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L246;
                case 54: goto L24c;
                case 87: goto L2a2;
                case 116: goto L250;
                default: goto L245;
            }
        L245:
            goto L23e
        L246:
            if (r9 == 0) goto L24c
            r4 = 55649(0xd961, float:7.7981E-41)
            goto L23e
        L24c:
            r4 = 55618(0xd942, float:7.7937E-41)
            goto L23e
        L250:
            short[] r4 = m8183()
            r5 = 1829(0x725, float:2.563E-42)
            int r6 = androidx.interpolator.C1082.f108
            r6 = r6 ^ 343(0x157, float:4.8E-43)
            r7 = 2007(0x7d7, float:2.812E-42)
            java.lang.String r4 = androidx.loader.C1094.m2495(r4, r5, r6, r7)
            boolean r5 = androidx.emoji2.C1080.m1554(r9, r4)
            r4 = 55680(0xd980, float:7.8024E-41)
        L267:
            r6 = 55697(0xd991, float:7.8048E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L26f;
                case 1467: goto L275;
                case 1496: goto L2b2;
                case 1529: goto L279;
                default: goto L26e;
            }
        L26e:
            goto L267
        L26f:
            if (r5 != 0) goto L275
            r4 = 56424(0xdc68, float:7.9067E-41)
            goto L267
        L275:
            r4 = 56393(0xdc49, float:7.9023E-41)
            goto L267
        L279:
            short[] r4 = m8183()
            r5 = 1837(0x72d, float:2.574E-42)
            int r6 = androidx.vectordrawable.C1104.f130
            r6 = r6 ^ 606(0x25e, float:8.49E-43)
            r7 = 1262(0x4ee, float:1.768E-42)
            java.lang.String r4 = androidx.interpolator.C1083.m1723(r4, r5, r6, r7)
            boolean r5 = androidx.emoji2.C1080.m1554(r9, r4)
            r4 = 56455(0xdc87, float:7.911E-41)
        L290:
            r6 = 56472(0xdc98, float:7.9134E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 31: goto L298;
                case 62: goto L29e;
                case 93: goto L2b2;
                case 124: goto L2a2;
                default: goto L297;
            }
        L297:
            goto L290
        L298:
            if (r5 != 0) goto L29e
            r4 = 56548(0xdce4, float:7.924E-41)
            goto L290
        L29e:
            r4 = 56517(0xdcc5, float:7.9197E-41)
            goto L290
        L2a2:
            r7 = 0
            r4 = 56579(0xdd03, float:7.9284E-41)
        L2a6:
            r5 = 56596(0xdd14, float:7.9308E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 23: goto L2ae;
                case 54: goto L2b3;
                default: goto L2ad;
            }
        L2ad:
            goto L2a6
        L2ae:
            r4 = 56610(0xdd22, float:7.9328E-41)
            goto L2a6
        L2b2:
            r7 = 1
        L2b3:
            r4 = 1507503(0x1700af, float:2.112462E-39)
        L2b6:
            r5 = 1507520(0x1700c0, float:2.112485E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 14: goto L2be;
                case 45: goto L2ea;
                case 111: goto L2c2;
                case 460: goto L2c8;
                default: goto L2bd;
            }
        L2bd:
            goto L2b6
        L2be:
            r4 = 1507565(0x1700ed, float:2.112549E-39)
            goto L2b6
        L2c2:
            if (r7 == 0) goto L2be
            r4 = 1507596(0x17010c, float:2.112592E-39)
            goto L2b6
        L2c8:
            r4 = 0
            r5 = r26[r4]
            r4 = 1507627(0x17012b, float:2.112635E-39)
        L2ce:
            r6 = 1507644(0x17013c, float:2.112659E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 23: goto L2d6;
                case 85: goto L2ea;
                case 118: goto L2dc;
                case 180: goto L2e0;
                default: goto L2d5;
            }
        L2d5:
            goto L2ce
        L2d6:
            if (r5 == 0) goto L2dc
            r4 = 1507720(0x170188, float:2.112766E-39)
            goto L2ce
        L2dc:
            r4 = 1507689(0x170169, float:2.112722E-39)
            goto L2ce
        L2e0:
            r4 = 0
            r4 = r26[r4]
            r0 = r20
            r1 = r25
            m8227(r0, r1, r4)
        L2ea:
            r4 = 1507751(0x1701a7, float:2.112809E-39)
        L2ed:
            r5 = 1507768(0x1701b8, float:2.112833E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 31: goto L2f5;
                case 1335: goto L2ff;
                case 1480: goto L338;
                case 1513: goto L2fb;
                default: goto L2f4;
            }
        L2f4:
            goto L2ed
        L2f5:
            if (r28 == 0) goto L2fb
            r4 = 1508495(0x17048f, float:2.113852E-39)
            goto L2ed
        L2fb:
            r4 = 1508464(0x170470, float:2.113808E-39)
            goto L2ed
        L2ff:
            r4 = 0
            boolean r5 = r29[r4]
            r4 = 1508526(0x1704ae, float:2.113895E-39)
        L305:
            r6 = 1508543(0x1704bf, float:2.113919E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L30d;
                case 83: goto L338;
                case 114: goto L313;
                case 436: goto L317;
                default: goto L30c;
            }
        L30c:
            goto L305
        L30d:
            if (r5 != 0) goto L313
            r4 = 1508619(0x17050b, float:2.114025E-39)
            goto L305
        L313:
            r4 = 1508588(0x1704ec, float:2.113982E-39)
            goto L305
        L317:
            android.os.Handler r10 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda12 r4 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda12
            r5 = r20
            r6 = r30
            r8 = r25
            r4.<init>(r5, r6, r7, r8, r9)
            androidx.activity.C1062.m178(r10, r4)
            r4 = 1508650(0x17052a, float:2.114069E-39)
        L32c:
            r5 = 1508667(0x17053b, float:2.114093E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L334;
                case 114: goto L372;
                default: goto L333;
            }
        L333:
            goto L32c
        L334:
            r4 = 1508681(0x170549, float:2.114112E-39)
            goto L32c
        L338:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)
            boolean r5 = androidx.vectordrawable.animated.C1102.m3111(r4)
            r4 = 1509425(0x170831, float:2.115155E-39)
        L343:
            r6 = 1509442(0x170842, float:2.115179E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 18: goto L34b;
                case 45: goto L372;
                case 115: goto L34f;
                case 204: goto L355;
                default: goto L34a;
            }
        L34a:
            goto L343
        L34b:
            r4 = 1509487(0x17086f, float:2.115242E-39)
            goto L343
        L34f:
            if (r5 == 0) goto L34b
            r4 = 1509518(0x17088e, float:2.115285E-39)
            goto L343
        L355:
            r4 = 1509549(0x1708ad, float:2.115329E-39)
        L358:
            r5 = 1509566(0x1708be, float:2.115353E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 19: goto L360;
                case 85: goto L372;
                case 114: goto L366;
                case 436: goto L36a;
                default: goto L35f;
            }
        L35f:
            goto L358
        L360:
            if (r7 != 0) goto L366
            r4 = 1509642(0x17090a, float:2.115459E-39)
            goto L358
        L366:
            r4 = 1509611(0x1708eb, float:2.115416E-39)
            goto L358
        L36a:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r4 = m8177(r20)
            r5 = 0
            androidx.lifecycle.process.C1090.m2197(r4, r5)
        L372:
            r4 = 1509673(0x170929, float:2.115502E-39)
        L375:
            r5 = 1509690(0x17093a, float:2.115526E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 19: goto L37d;
                case 712: goto L33;
                case 745: goto L383;
                case 1323: goto L387;
                default: goto L37c;
            }
        L37c:
            goto L375
        L37d:
            if (r7 != 0) goto L383
            r4 = 1510417(0x170c11, float:2.116545E-39)
            goto L375
        L383:
            r4 = 1510386(0x170bf2, float:2.116502E-39)
            goto L375
        L387:
            r4 = 0
            r0 = r20
            r1 = r25
            r2 = r22
            m8218(r0, r1, r2, r4)
            goto L33
        L393:
            r4 = move-exception
            goto L1d2
        L396:
            r4 = move-exception
            goto L171
    }

    /* JADX INFO: renamed from: lambda$6$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8254lambda$6$kevinfunhookdownloadDownloadManager(android.app.Dialog[] r6, android.content.Context r7, java.lang.String r8) {
            r5 = this;
            r2 = 0
            r1 = r6[r2]
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L2e;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r1 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = r6[r2]
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L21;
                case 54: goto L26;
                case 471: goto L2e;
                case 500: goto L29;
                default: goto L20;
            }
        L20:
            goto L1b
        L21:
            if (r1 == 0) goto L26
            r0 = 1833(0x729, float:2.569E-42)
            goto L1b
        L26:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1b
        L29:
            r0 = r6[r2]
            androidx.customview.C1074.m1118(r0)
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r8)
            short[] r1 = m8183()
            r2 = 1850(0x73a, float:2.592E-42)
            int r3 = androidx.lifecycle.livedata.C1084.f110
            r3 = r3 ^ 21
            r4 = 2547(0x9f3, float:3.569E-42)
            java.lang.String r1 = androidx.documentfile.C1076.m1234(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8176(r5, r7, r0)
            return
    }

    /* JADX INFO: renamed from: lambda$8$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8255lambda$8$kevinfunhookdownloadDownloadManager(android.app.Dialog[] r6, boolean r7, android.content.Context r8, java.lang.String r9) {
            r5 = this;
            r2 = 0
            r1 = r6[r2]
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L2e;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r1 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = r6[r2]
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L21;
                case 54: goto L26;
                case 471: goto L2e;
                case 500: goto L29;
                default: goto L20;
            }
        L20:
            goto L1b
        L21:
            if (r1 == 0) goto L26
            r0 = 1833(0x729, float:2.569E-42)
            goto L1b
        L26:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1b
        L29:
            r0 = r6[r2]
            androidx.customview.C1074.m1118(r0)
        L2e:
            r0 = 1864(0x748, float:2.612E-42)
        L30:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L36;
                case 47384: goto L64;
                case 47417: goto L40;
                case 47483: goto L3c;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            if (r7 != 0) goto L3c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L30
        L3c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L30
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m8183()
            r2 = 1856(0x740, float:2.601E-42)
            int r3 = androidx.activity.C1064.f90
            r3 = r3 ^ 492(0x1ec, float:6.9E-43)
            r4 = 2601(0xa29, float:3.645E-42)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r9)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m8195(r5, r8, r0)
        L64:
            return
    }

    /* JADX INFO: renamed from: lambda$9$kevin-fun-hook-download-DownloadManager, reason: not valid java name */
    /* synthetic */ void m8256lambda$9$kevinfunhookdownloadDownloadManager(java.util.concurrent.atomic.AtomicInteger r8, boolean r9, boolean r10, android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r7 = this;
            r6 = 1
            r0 = r7
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r10
            r5 = r14
            m8203(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L98
            androidx.versionedparcelable.C1106.m3387(r8)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L17:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1d;
                case 49: goto L20;
                case 204: goto L25;
                case 239: goto L37;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L17
        L20:
            if (r1 == 0) goto L1d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L17
        L25:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            androidx.lifecycle.process.C1090.m2197(r0, r6)
            r0 = 1740(0x6cc, float:2.438E-42)
        L2e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L34;
                case 54: goto L79;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2e
        L37:
            r0 = 1864(0x748, float:2.612E-42)
        L39:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3f;
                case 47384: goto L79;
                case 47417: goto L49;
                case 47483: goto L45;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            if (r9 != 0) goto L45
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L39
        L45:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L39
        L49:
            android.os.Handler r0 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda3 r1 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda3
            r1.<init>(r7, r10, r11)
        L52:
            androidx.activity.C1062.m178(r0, r1)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L58:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L60;
                case 239: goto L75;
                default: goto L5f;
            }
        L5f:
            goto L58
        L60:
            int r1 = org.luckypray.dexkit.C1124.m10581()
            r0 = 51588(0xc984, float:7.229E-41)
        L67:
            r2 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L6f;
                case 54: goto L11d;
                case 87: goto L131;
                case 116: goto L122;
                default: goto L6e;
            }
        L6e:
            goto L67
        L6f:
            if (r1 < 0) goto L11d
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L67
        L75:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L58
        L79:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7c:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L60;
                case 503: goto L84;
                default: goto L83;
            }
        L83:
            goto L7c
        L84:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L7c
        L88:
            r0 = move-exception
            r1 = 49666(0xc202, float:6.9597E-41)
        L8c:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L94;
                case 50: goto L132;
                default: goto L93;
            }
        L93:
            goto L8c
        L94:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L8c
        L98:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r1.<init>()     // Catch: java.lang.Throwable -> L88
            short[] r2 = m8183()     // Catch: java.lang.Throwable -> L88
            r3 = 1862(0x746, float:2.609E-42)
            int r4 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L88
            r4 = r4 ^ (-252(0xffffffffffffff04, float:NaN))
            r5 = 686(0x2ae, float:9.61E-43)
            java.lang.String r2 = androidx.lifecycle.process.C1091.m2229(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L88
            m8215(r0)     // Catch: java.lang.Throwable -> L88
            androidx.versionedparcelable.C1106.m3387(r8)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = m8177(r7)
            boolean r1 = androidx.vectordrawable.animated.C1102.m3111(r0)
            r0 = 49790(0xc27e, float:6.977E-41)
        Lcf:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto Ld7;
                case 51: goto Lf0;
                case 84: goto Le1;
                case 241: goto Ldb;
                default: goto Ld6;
            }
        Ld6:
            goto Lcf
        Ld7:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lcf
        Ldb:
            if (r1 == 0) goto Ld7
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lcf
        Le1:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Le4:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto Lec;
                case 1711: goto L25;
                default: goto Leb;
            }
        Leb:
            goto Le4
        Lec:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto Le4
        Lf0:
            r0 = 50689(0xc601, float:7.103E-41)
        Lf3:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto Lfb;
                case 45: goto L79;
                case 50: goto L101;
                case 76: goto L105;
                default: goto Lfa;
            }
        Lfa:
            goto Lf3
        Lfb:
            if (r9 != 0) goto L101
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto Lf3
        L101:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto Lf3
        L105:
            android.os.Handler r0 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda3 r1 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda3
            r1.<init>(r7, r10, r11)
            r2 = 50813(0xc67d, float:7.1204E-41)
        L111:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L52;
                case 243: goto L119;
                default: goto L118;
            }
        L118:
            goto L111
        L119:
            r2 = 50844(0xc69c, float:7.1248E-41)
            goto L111
        L11d:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L67
        L122:
            java.lang.String r0 = "aSQzOzCahstl0J0Hc2ZEdt"
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3070(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L131:
            return
        L132:
            androidx.versionedparcelable.C1106.m3387(r8)
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r1 = m8177(r7)
            boolean r2 = androidx.vectordrawable.animated.C1102.m3111(r1)
            r1 = 51712(0xca00, float:7.2464E-41)
        L140:
            r3 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L148;
                case 17: goto L14c;
                case 47: goto L192;
                case 76: goto L152;
                default: goto L147;
            }
        L147:
            goto L140
        L148:
            r1 = 51774(0xca3e, float:7.2551E-41)
            goto L140
        L14c:
            if (r2 != 0) goto L148
            r1 = 51805(0xca5d, float:7.2594E-41)
            goto L140
        L152:
            r1 = 51836(0xca7c, float:7.2638E-41)
        L155:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 241: goto L15d;
                case 1963: goto L163;
                case 1992: goto L182;
                case 2025: goto L167;
                default: goto L15c;
            }
        L15c:
            goto L155
        L15d:
            if (r9 != 0) goto L163
            r1 = 52580(0xcd64, float:7.368E-41)
            goto L155
        L163:
            r1 = 52549(0xcd45, float:7.3637E-41)
            goto L155
        L167:
            android.os.Handler r1 = m8230()
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda3 r2 = new kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda3
            r2.<init>(r7, r10, r11)
            androidx.activity.C1062.m178(r1, r2)
            r1 = 52611(0xcd83, float:7.3724E-41)
        L176:
            r2 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 23: goto L17e;
                case 54: goto L18d;
                default: goto L17d;
            }
        L17d:
            goto L176
        L17e:
            r1 = 52642(0xcda2, float:7.3767E-41)
            goto L176
        L182:
            r1 = 52735(0xcdff, float:7.3897E-41)
        L185:
            r2 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L18d;
                case 1007: goto L18e;
                default: goto L18c;
            }
        L18c:
            goto L185
        L18d:
            throw r0
        L18e:
            r1 = 52766(0xce1e, float:7.3941E-41)
            goto L185
        L192:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r1 = m8177(r7)
            androidx.lifecycle.process.C1090.m2197(r1, r6)
            r1 = 53510(0xd106, float:7.4983E-41)
        L19c:
            r2 = 53527(0xd117, float:7.5007E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L1a4;
                case 50: goto L182;
                default: goto L1a3;
            }
        L1a3:
            goto L19c
        L1a4:
            r1 = 53541(0xd125, float:7.5027E-41)
            goto L19c
    }

    public void setCommentInfo(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, long r10) {
            r4 = this;
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            r1 = 1616(0x650, float:2.264E-42)
        L6:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r5 == 0) goto Lc
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r1 = 1740(0x6cc, float:2.438E-42)
        L16:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L1c;
                case 54: goto L20;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L16
        L1f:
            r5 = r0
        L20:
            r4.currentCommentAuthorName = r5
            r1 = 1864(0x748, float:2.612E-42)
        L24:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L2a;
                case 47384: goto L54;
                case 47417: goto L34;
                case 47483: goto L30;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            if (r6 == 0) goto L30
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L24
        L30:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L24
        L34:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L37:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L3f;
                case 239: goto L50;
                default: goto L3e;
            }
        L3e:
            goto L37
        L3f:
            r4.currentCommentAuthorAccount = r6
            r1 = 48891(0xbefb, float:6.8511E-41)
        L44:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L4c;
                case 53: goto L6b;
                case 503: goto L56;
                case 32495: goto L5c;
                default: goto L4b;
            }
        L4b:
            goto L44
        L4c:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L44
        L50:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L37
        L54:
            r6 = r0
            goto L3f
        L56:
            if (r7 == 0) goto L4c
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L44
        L5c:
            r1 = 49666(0xc202, float:6.9597E-41)
        L5f:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L67;
                case 50: goto L6c;
                default: goto L66;
            }
        L66:
            goto L5f
        L67:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L5f
        L6b:
            r7 = r0
        L6c:
            r4.currentCommentAuthorUid = r7
            r1 = 49790(0xc27e, float:6.977E-41)
        L71:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L79;
                case 51: goto L92;
                case 84: goto L83;
                case 241: goto L7d;
                default: goto L78;
            }
        L78:
            goto L71
        L79:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto L71
        L7d:
            if (r8 == 0) goto L79
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto L71
        L83:
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L86:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 497: goto L8e;
                case 1711: goto L93;
                default: goto L8d;
            }
        L8d:
            goto L86
        L8e:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L86
        L92:
            r8 = r0
        L93:
            r4.currentCommentId = r8
            r1 = 50689(0xc601, float:7.103E-41)
        L98:
            r2 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 19: goto La0;
                case 45: goto Laa;
                case 50: goto La6;
                case 76: goto Lab;
                default: goto L9f;
            }
        L9f:
            goto L98
        La0:
            if (r9 == 0) goto La6
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto L98
        La6:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto L98
        Laa:
            r9 = r0
        Lab:
            r4.currentCommentText = r9
            r4.currentCommentCreateTime = r10
            return
    }

    public void setWorkInfo(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, long r10) {
            r4 = this;
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            r1 = 1616(0x650, float:2.264E-42)
        L6:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r5 == 0) goto Lc
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r1 = 1740(0x6cc, float:2.438E-42)
        L16:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L1c;
                case 54: goto L20;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L16
        L1f:
            r5 = r0
        L20:
            r4.currentWorkAuthorName = r5
            r1 = 1864(0x748, float:2.612E-42)
        L24:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L2a;
                case 47384: goto L54;
                case 47417: goto L34;
                case 47483: goto L30;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            if (r6 == 0) goto L30
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L24
        L30:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L24
        L34:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L37:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L3f;
                case 239: goto L50;
                default: goto L3e;
            }
        L3e:
            goto L37
        L3f:
            r4.currentWorkAuthorAccount = r6
            r1 = 48891(0xbefb, float:6.8511E-41)
        L44:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L4c;
                case 53: goto L6b;
                case 503: goto L56;
                case 32495: goto L5c;
                default: goto L4b;
            }
        L4b:
            goto L44
        L4c:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L44
        L50:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L37
        L54:
            r6 = r0
            goto L3f
        L56:
            if (r7 == 0) goto L4c
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L44
        L5c:
            r1 = 49666(0xc202, float:6.9597E-41)
        L5f:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L67;
                case 50: goto L6c;
                default: goto L66;
            }
        L66:
            goto L5f
        L67:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L5f
        L6b:
            r7 = r0
        L6c:
            r4.currentWorkAuthorUid = r7
            r1 = 49790(0xc27e, float:6.977E-41)
        L71:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L79;
                case 51: goto L92;
                case 84: goto L83;
                case 241: goto L7d;
                default: goto L78;
            }
        L78:
            goto L71
        L79:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto L71
        L7d:
            if (r8 == 0) goto L79
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto L71
        L83:
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L86:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 497: goto L8e;
                case 1711: goto L93;
                default: goto L8d;
            }
        L8d:
            goto L86
        L8e:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L86
        L92:
            r8 = r0
        L93:
            r4.currentWorkVideoId = r8
            r1 = 50689(0xc601, float:7.103E-41)
        L98:
            r2 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 19: goto La0;
                case 45: goto Laa;
                case 50: goto La6;
                case 76: goto Lab;
                default: goto L9f;
            }
        L9f:
            goto L98
        La0:
            if (r9 == 0) goto La6
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto L98
        La6:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto L98
        Laa:
            r9 = r0
        Lab:
            r4.currentWorkVideoDesc = r9
            r4.currentWorkCreateTime = r10
            int r1 = org.luckypray.dexkit.C1123.m10509()
            r0 = 50813(0xc67d, float:7.1204E-41)
        Lb6:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto Lbe;
                case 53: goto Ld7;
                case 243: goto Lc2;
                case 4075: goto Lc8;
                default: goto Lbd;
            }
        Lbd:
            goto Lb6
        Lbe:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto Lb6
        Lc2:
            if (r1 > 0) goto Lbe
            r0 = 51557(0xc965, float:7.2247E-41)
            goto Lb6
        Lc8:
            java.lang.String r0 = "iQpZhI2"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Ld7:
            return
    }
}
