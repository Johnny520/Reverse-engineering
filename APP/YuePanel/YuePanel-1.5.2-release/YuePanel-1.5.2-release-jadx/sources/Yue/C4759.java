package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4759 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1103;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1104;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10689;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10690;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10691;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10692;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۨ$ۥ */
    public class C0485 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10693;

        public C0485() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f10693;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-1501663667051944761L);
            f10693 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                methodHookParam.setResult(Boolean.FALSE);
            }
        }
    }

    static {
        NativeUtil.classesInit0(879);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
