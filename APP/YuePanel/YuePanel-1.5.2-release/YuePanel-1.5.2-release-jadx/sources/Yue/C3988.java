package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3988 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f602;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f603;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7930;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7931;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7932;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7933;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7934;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7935;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7936;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۨ$ۥ */
    public class C0302 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7937;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7938;

        public C0302() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7937;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-9194865848243477468L);
                f7937 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f7938;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-9069094350177773554L);
            f7938 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                methodHookParam.setResult(C7817.m24801(((Long) methodHookParam.args[1]).longValue()));
            }
        }
    }

    static {
        NativeUtil.classesInit0(604);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m961(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    private static native /* synthetic */ boolean m962(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();
}
