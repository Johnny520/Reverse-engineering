package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥۣۢۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8192 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long f24398 = 500;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f24399 = 300;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f24400 = 30;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24401;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24402;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24403;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24404;

    /* JADX INFO: renamed from: ۥ */
    public float f3304;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f3305;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f24405;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f24406 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long f24407 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f24408 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f24409 = false;

    /* JADX INFO: renamed from: Yue.ۥۣۢۧۤ$ۥ */
    public class C1459 extends XC_MethodHook {
        public C1459() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        }
    }

    static {
        NativeUtil.classesInit0(145);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
