package Yue;

import android.database.sqlite.SQLiteDatabase;
import android.util.LruCache;
import com.google.gson.Gson;
import com.nmmedit.protect.NativeUtil;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4265 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f8768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f8769;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f8770;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f8771 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8772;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8773;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8774;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8775;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8776;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8777;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8778;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8779;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8780;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final SQLiteDatabase f8781;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Gson f769 = new Gson();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final ConcurrentHashMap<String, String> f8782 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final ExecutorService f8783 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ۥ */
    public final LruCache<String, Object> f768 = new C0374(100000);

    /* JADX INFO: renamed from: Yue.ۥ۟ۨ۟ۤ$ۥ */
    public class C0374 extends LruCache<String, Object> {
        static {
            NativeUtil.classesInit0(943);
        }

        public C0374(int i) {
            super(i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public native /* bridge */ /* synthetic */ int sizeOf(String str, Object obj);

        /* JADX INFO: renamed from: ۥ */
        public native int m1232(String str, Object obj);
    }

    static {
        NativeUtil.classesInit0(609);
        f8768 = yue_xin_awa(0);
        f8769 = yue_xin_awa(1);
        f8770 = yue_xin_awa(2);
    }

    public C4265() {
        File file = new File(C3270.m6708() + yue_xin_awa(3));
        if (!file.exists()) {
            file.mkdirs();
        }
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(new File(file, yue_xin_awa(4)).getAbsolutePath(), (SQLiteDatabase.CursorFactory) null);
        this.f8781 = sQLiteDatabaseOpenOrCreateDatabase;
        sQLiteDatabaseOpenOrCreateDatabase.enableWriteAheadLogging();
        sQLiteDatabaseOpenOrCreateDatabase.execSQL(yue_xin_awa(5));
        m12312();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1230(C4265 c4265, String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public native void m1231();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m12312();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native synchronized void m12313();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native void m12314();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native <T> T m12315(String str, Class<T> cls);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native /* synthetic */ void m12316(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native <T> void m12317(String str, T t);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native void m12318(String str);
}
