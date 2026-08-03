package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۨۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7424 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f2871;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2872;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22412;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22413;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22414;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22415;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22416;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22417;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22418;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22419;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22420;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22421;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22422;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22423;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22424;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22425;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22426;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22427;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22428;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22429;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22430;

    /* JADX INFO: renamed from: Yue.ۥۡۨۧۥ$ۥ */
    public class C1255 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22431;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22432;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22433;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22434;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22435;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22436;

        public C1255() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f22431;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-1103798614969053446L);
                f22431 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f22432;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(3432441020016606841L);
                f22432 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f22433;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(2809088850743332609L);
                f22433 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f22434;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-1626927441897254614L);
                f22434 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f22435;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(1788779141604725767L);
                f22435 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f22436;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(3029741149937057513L);
            f22436 = strM22676;
            return strM22676;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                if (C4093.m11556(yue_xin_awa(1))) {
                    String str = (String) XposedHelpers.callMethod(methodHookParam.args[0], yue_xin_awa(2), new Object[0]);
                    Object[] objArr = methodHookParam.args;
                    String str2 = (String) objArr[2];
                    C7424.m23253(C7424.this, str, str2, ((String) XposedHelpers.callMethod(objArr[0], yue_xin_awa(3), new Object[0])).replace(yue_xin_awa(4), str2));
                } else {
                    C3845.m900((String) methodHookParam.args[2]);
                    C6334.m19807(yue_xin_awa(5), 2);
                }
                methodHookParam.setResult((Object) null);
            }
        }
    }

    static {
        NativeUtil.classesInit0(1110);
        f2871 = new String[]{yue_xin_awa(19)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3618(String str, String str2, String str3, BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m3619(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23253(C7424 c7424, String str, String str2, String str3);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private static native /* synthetic */ boolean m23254(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23255(String str, String str2, String str3, BottomMenu bottomMenu, CharSequence charSequence, int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m23256(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m23257(String str, String str2, String str3);
}
