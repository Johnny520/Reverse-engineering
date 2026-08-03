package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3800 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f510;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7031;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7032;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7033;

    /* JADX INFO: renamed from: ۥ */
    public long f511 = System.currentTimeMillis();

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۦ$ۥ */
    public class C0256 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7034;

        public C0256() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7034;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(2285824452577172922L);
            f7034 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C3800.m847(C3800.this) + 500 > jCurrentTimeMillis) {
                return;
            }
            C3800.m848(C3800.this, jCurrentTimeMillis);
            C6263.m19285((String) methodHookParam.args[0]);
            C6263.m19286(yue_xin_awa(0));
        }
    }

    static {
        NativeUtil.classesInit0(1064);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ long m847(C3800 c3800);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ long m848(C3800 c3800, long j);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
