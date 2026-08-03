package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1690 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f5298 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f5299 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f5300 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f5301 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5302;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5303;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5304;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5305;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5306;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5307;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5308;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5309;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5310;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.util.LruCache<java.lang.String, java.lang.Object> f5311;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final com.google.gson.Gson f5312;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.database.sqlite.SQLiteDatabase f5313;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> f5314;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.util.concurrent.ExecutorService f5315;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨ۟ۤ$ۥ, reason: contains not printable characters */
    public class C1691 extends android.util.LruCache<java.lang.String, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1690 f5316;

        static {
                r0 = 943(0x3af, float:1.321E-42)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C1691(Yue.C1690 r1, int r2) {
                r0 = this;
                r0.f5316 = r1
                r0.<init>(r2)
                return
        }

        @Override // android.util.LruCache
        public native /* bridge */ /* synthetic */ int sizeOf(java.lang.String r1, java.lang.Object r2);

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public native int m8107(java.lang.String r1, java.lang.Object r2);
    }

    static {
            r0 = 609(0x261, float:8.53E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.C1690.f5298 = r0
            r0 = 1
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.C1690.f5299 = r0
            r0 = 2
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.C1690.f5300 = r0
            return
    }

    public C1690() {
            r3 = this;
            r3.<init>()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            r3.f5312 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.f5314 = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r3.f5315 = r0
            Yue.ۥ۟ۨ۟ۤ$ۥ r0 = new Yue.ۥ۟ۨ۟ۤ$ۥ
            r1 = 100000(0x186a0, float:1.4013E-40)
            r0.<init>(r3, r1)
            r3.f5311 = r0
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = Yue.C0421.m1608()
            r1.append(r2)
            r2 = 3
            java.lang.String r2 = yue_xin_awa(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L47
            r0.mkdirs()
        L47:
            java.io.File r1 = new java.io.File
            r2 = 4
            java.lang.String r2 = yue_xin_awa(r2)
            r1.<init>(r0, r2)
            java.lang.String r0 = r1.getAbsolutePath()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r0, r1)
            r3.f5313 = r0
            r0.enableWriteAheadLogging()
            r1 = 5
            java.lang.String r1 = yue_xin_awa(r1)
            r0.execSQL(r1)
            r3.m8100()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m8098(Yue.C1690 r0, java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public native void m8099();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m8100();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native synchronized void m8101();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native void m8102();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native <T> T m8103(java.lang.String r1, java.lang.Class<T> r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native /* synthetic */ void m8104(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native <T> void m8105(java.lang.String r1, T r2);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native void m8106(java.lang.String r1);
}
