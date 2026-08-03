package Yue;

import Yue.C6756;
import android.app.Activity;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.PopTip;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6756 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f2283;

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f2284;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object[] f17331;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final View[] f17332;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17333;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17334;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17335;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17336;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17337;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17338;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17339;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17340;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17341;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17342;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17343;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17344;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17345;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17346;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17347;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17348;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17349;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17350;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17351;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17352;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17353;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17354;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17355;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17356;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17357;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17358;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17359;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17360;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17361;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17362;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17363;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17364;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17365;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17366;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17367;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17368;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17369;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17370;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17371;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17372;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17373;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17374;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17375;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17376;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17377;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17378;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17379;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17380;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17381;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17382;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17383;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17384;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17385;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17386;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17387;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17388;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17389;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17390;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17391;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17392;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17393;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17394;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17395;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17396;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17397;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17398;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17399;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17400;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17401;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17402;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17403;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17404;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17405;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17406;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17407;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17408;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17409;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17410;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17411;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17412;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17413;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17414;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17415;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17416;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17417;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17418;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17419;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17420;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17421;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17422;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17423;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17424;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17425;

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17426;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17427;

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17428;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17429;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17430;

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17431;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17432;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17433;

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17434;

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17435;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ */
    public class C1077 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17436;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17437;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17438;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17439;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17440;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17441;

        public C1077(C3828 c3828) {
            this.f17441 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17436;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(2930651369969043303L);
                f17436 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17437;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(7489709604160414142L);
                f17437 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17438;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17438 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17439;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(6594448779458063468L);
                f17439 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f17440;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-1952166788182932677L);
            f17440 = strM22675;
            return strM22675;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21462(Object obj, C3828 c3828, String str, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
            XposedHelpers.callMethod(obj, c3828.m878(), new Object[]{str});
            return false;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            final Object obj = methodHookParam.thisObject;
            final String str = (String) methodHookParam.args[0];
            if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final C3828 c3828 = this.f17441;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨۢ
                static {
                    NativeUtil.classesInit0(948);
                }

                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final native boolean onClick(BaseDialog baseDialog, View view);
            });
            methodHookParam.setResult((Object) null);
            methodHookParam.setResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟ */
    public class C1078 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17443;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17444;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17445;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17446;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17447;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17448;

        public C1078() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17443;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(3430770661614872424L);
                f17443 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17444;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(7489709604160414142L);
                f17444 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17445;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17445 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17446;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(2708598053435126334L);
                f17446 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f17447;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(6106737580778973606L);
                f17447 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f17448;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(2856921594890674542L);
            f17448 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21463(Object obj, View view, MessageDialog messageDialog, View view2) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
            XposedHelpers.callMethod(obj, yue_xin_awa(5), new Object[]{view});
            return false;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            final Object obj = methodHookParam.thisObject;
            final View view = (View) methodHookParam.args[0];
            if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
            } else {
                MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3)).setOkButton(yue_xin_awa(4), new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨۤ
                    static {
                        NativeUtil.classesInit0(951);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view2);
                });
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟, reason: contains not printable characters */
    public class C6757 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17450;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17451;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17452;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17453;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17454;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17455;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17456;

        public C6757(C3828 c3828) {
            this.f17456 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17450;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-5540668725824821590L);
                f17450 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17451;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(4455362458786641311L);
                f17451 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17452;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-1439278280758068275L);
                f17452 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17453;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-4289022319627751160L);
                f17453 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f17454;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(1205798495015636870L);
                f17454 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f17455;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(-11202067104906392L);
            f17455 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21465(Object obj, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, PopTip popTip, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
                XposedHelpers.callMethod(obj, c3828.m878(), methodHookParam.args);
                return false;
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(5) + th.getMessage());
                return false;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m21466() {
            C7477.m3677(1000L);
            C8269.m27267();
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            final Object obj = methodHookParam.thisObject;
            if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                return;
            }
            PopTip popTipShowLong = PopTip.show(yue_xin_awa(2), yue_xin_awa(3)).showLong();
            final C3828 c3828 = this.f17456;
            popTipShowLong.setButton(new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨۥ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6757.m21465(obj, c3828, methodHookParam, (PopTip) baseDialog, view);
                }
            });
            if (!C4093.m11556(yue_xin_awa(4))) {
                new Thread(new Runnable() { // from class: Yue.ۥۡۤۨۦ
                    static {
                        NativeUtil.classesInit0(922);
                    }

                    @Override // java.lang.Runnable
                    public final native void run();
                }).start();
            }
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟, reason: contains not printable characters */
    public class C6758 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17458;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17459;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17460;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17461;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17462;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17463;

        public C6758(C3828 c3828) {
            this.f17463 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17458;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-5540668725824821590L);
                f17458 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17459;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(4455362458786641311L);
                f17459 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17460;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-1439278280758068275L);
                f17460 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17461;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-4289022319627751160L);
                f17461 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f17462;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-11202067104906392L);
            f17462 = strM22675;
            return strM22675;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21467(Object obj, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, PopTip popTip, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
                XposedHelpers.callMethod(obj, c3828.m878(), methodHookParam.args);
                return false;
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(4) + th.getMessage());
                return false;
            }
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            final Object obj = methodHookParam.thisObject;
            if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                return;
            }
            PopTip popTipShowLong = PopTip.show(yue_xin_awa(2), yue_xin_awa(3)).showLong();
            final C3828 c3828 = this.f17463;
            popTipShowLong.setButton(new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨۧ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6758.m21467(obj, c3828, methodHookParam, (PopTip) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C6759 extends XC_MethodHook {
        public C6759() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C6756.m21444()[0] = methodHookParam.thisObject;
            C6756.m21445()[0] = (View) methodHookParam.args[0];
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C6760 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17466;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17467;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17468;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17469;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17470;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17471;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17472;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17473;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17474;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f17475;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17476;

        public C6760(ClassLoader classLoader, C3828 c3828) {
            this.f17475 = classLoader;
            this.f17476 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f17466;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-1957685398575448692L);
                    f17466 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f17467;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-1261806041666743715L);
                    f17467 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f17468;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(1820962736522380495L);
                    f17468 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f17469;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(4455362458786641311L);
                    f17469 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f17470;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(8330621410826985291L);
                    f17470 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f17471;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(6238913247332928714L);
                    f17471 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f17472;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(961285778634110056L);
                    f17472 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f17473;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(8525375652795944720L);
                    f17473 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f17474;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(-4351838105827861829L);
                    f17474 = strM22679;
                    return strM22679;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21468(Class cls, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(cls, yue_xin_awa(3), Boolean.TRUE);
                XposedHelpers.callStaticMethod(cls, c3828.m878(), methodHookParam.args);
                return false;
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(8) + th.getMessage());
                return false;
            }
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                final Class<?> clsLoadClass = this.f17475.loadClass(this.f17476.m879());
                Object objM18288 = C5898.m18288(this.f17475.loadClass(yue_xin_awa(0)), yue_xin_awa(1));
                if (C6756.m21442(C6756.this, yue_xin_awa(2))) {
                    return;
                }
                if (XposedHelpers.getAdditionalInstanceField(clsLoadClass, yue_xin_awa(3)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(clsLoadClass, yue_xin_awa(3));
                    return;
                }
                MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(4), yue_xin_awa(5));
                String strYue_xin_awa = yue_xin_awa(6);
                final C3828 c3828 = this.f17476;
                messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨۨ
                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final boolean onClick(BaseDialog baseDialog, View view) {
                        return C6756.C6760.m21468(clsLoadClass, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                    }
                });
                methodHookParam.setResult(objM18288);
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(7) + th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C6761 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17478;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17479;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17480;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17481;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17482;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17483;

        public C6761(C3828 c3828) {
            this.f17483 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17478;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(36345888109905069L);
                f17478 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17479;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7924861319728593507L);
                f17479 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17480;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17480 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17481;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(2930207642646432794L);
                f17481 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f17482;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-5083158835033057477L);
            f17482 = strM22675;
            return strM22675;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21469(Object obj, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
            XposedHelpers.callMethod(obj, c3828.m878(), methodHookParam.args);
            return false;
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            final Object obj = methodHookParam.thisObject;
            if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final C3828 c3828 = this.f17483;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨۡ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6761.m21469(obj, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C6762 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17485;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17486;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17487;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17488;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17489;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Method f17490;

        public C6762(Method method) {
            this.f17490 = method;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17485;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(36345888109905069L);
                f17485 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17486;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7924861319728593507L);
                f17486 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17487;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17487 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17488;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(2930207642646432794L);
                f17488 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f17489;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(-5083158835033057477L);
            f17489 = strM22675;
            return strM22675;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21470(Object obj, Method method, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
            XposedHelpers.callMethod(obj, method.getName(), methodHookParam.args);
            return false;
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            final Object obj = methodHookParam.thisObject;
            if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final Method method = this.f17490;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟۟
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6762.m21470(obj, method, methodHookParam, (MessageDialog) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C6763 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17492;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17493;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17494;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17495;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17496;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17497;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f17498;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17499;

        public C6763(Class cls, C3828 c3828) {
            this.f17498 = cls;
            this.f17499 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17492;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(3587613813638772857L);
                f17492 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17493;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(3672920351253529165L);
                f17493 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17494;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17494 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17495;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-4759881894580721918L);
                f17495 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f17496;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(8380686244699306507L);
                f17496 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f17497;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(6588616265613213530L);
            f17497 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21471(Class cls, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(cls, yue_xin_awa(1), Boolean.TRUE);
                XposedHelpers.callStaticMethod(cls, c3828.m878(), methodHookParam.args);
                return false;
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(5) + th);
                return false;
            }
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            if (XposedHelpers.getAdditionalInstanceField(this.f17498, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(this.f17498, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final Class cls = this.f17498;
            final C3828 c3828 = this.f17499;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۡ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6763.m21471(cls, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public class C6764 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17501;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17502;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17503;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17504;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17505;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17506;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f17507;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17508;

        public C6764(Class cls, C3828 c3828) {
            this.f17507 = cls;
            this.f17508 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17501;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-7545141332845676684L);
                f17501 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17502;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-1228399069678867545L);
                f17502 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17503;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17503 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17504;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(5566634091202630809L);
                f17504 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f17505;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(-5083158835033057477L);
                f17505 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f17506;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(-6293351095918003729L);
            f17506 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21472(Class cls, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(cls, yue_xin_awa(1), Boolean.TRUE);
                XposedHelpers.callStaticMethod(cls, c3828.m878(), methodHookParam.args);
                return false;
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(5) + th);
                return false;
            }
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            if (XposedHelpers.getAdditionalInstanceField(this.f17507, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(this.f17507, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final Class cls = this.f17507;
            final C3828 c3828 = this.f17508;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥۣ۟
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6764.m21472(cls, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public class C6765 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17510;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17511;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17512;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17513;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17514;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17515;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f17516;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17517;

        public C6765(Class cls, C3828 c3828) {
            this.f17516 = cls;
            this.f17517 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17510;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7357908021609516596L);
                f17510 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17511;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-8687921866610049765L);
                f17511 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17512;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f17512 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17513;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(933295439933961772L);
                f17513 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f17514;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(8380686244699306507L);
                f17514 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f17515;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(-7532084670702717038L);
            f17515 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21473(Class cls, XC_MethodHook.MethodHookParam methodHookParam, C3828 c3828, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(cls, yue_xin_awa(1), Boolean.TRUE);
                if (C4563.m1512() == 2) {
                    XposedHelpers.callMethod(methodHookParam.thisObject, c3828.m878(), methodHookParam.args);
                } else {
                    XposedHelpers.callStaticMethod(cls, c3828.m878(), methodHookParam.args);
                }
                return false;
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(5) + th);
                return false;
            }
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            if (XposedHelpers.getAdditionalInstanceField(this.f17516, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(this.f17516, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final Class cls = this.f17516;
            final C3828 c3828 = this.f17517;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۤ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C6756.C6765.m21473(cls, methodHookParam, c3828, (MessageDialog) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public class C6766 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17519;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17520;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17521;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17522;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17523;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17524;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17525;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17526;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17527;

        public C6766(C3828 c3828) {
            this.f17527 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f17519;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-1410703191163592873L);
                    f17519 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f17520;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-1036064063095848825L);
                    f17520 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f17521;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(6121621165290997293L);
                    f17521 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f17522;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-1444792681453121344L);
                    f17522 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f17523;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(8330621410826985291L);
                    f17523 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f17524;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(-6137008414287355250L);
                    f17524 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f17525;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(2218572918859107322L);
                    f17525 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f17526;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(-6773262607257815580L);
                    f17526 = strM22678;
                    return strM22678;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21475(Object obj, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(3), Boolean.TRUE);
            XposedHelpers.callMethod(obj, c3828.m878(), methodHookParam.args);
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m21476(MessageDialog messageDialog, View view) {
            C6338.m19833(C8269.m27251().m19648());
            return false;
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            if (((Long) new C4805().m14538(new C4805().m14538(methodHookParam.args[2]).m14540(null).m1709(yue_xin_awa(1))).m14540(null).m1709(yue_xin_awa(2))).longValue() != 1) {
                return;
            }
            try {
                final Object obj = methodHookParam.thisObject;
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(3)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(3));
                    return;
                }
                MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(4), yue_xin_awa(5));
                String strYue_xin_awa = yue_xin_awa(6);
                final C3828 c3828 = this.f17527;
                messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۥ
                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final boolean onClick(BaseDialog baseDialog, View view) {
                        return C6756.C6766.m21475(obj, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                    }
                }).setCancelButton(yue_xin_awa(7), new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۦ
                    static {
                        NativeUtil.classesInit0(521);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
                methodHookParam.setResult(Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public class C6767 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17529;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17530;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17531;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17532;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17533;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17534;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17535;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17536;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17537;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17538;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17539;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f17540;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17541;

        public C6767(ClassLoader classLoader, C3828 c3828) {
            this.f17540 = classLoader;
            this.f17541 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f17529;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-6476030792943731530L);
                    f17529 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f17530;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(8592456161666042567L);
                    f17530 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f17531;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(7385471213579425181L);
                    f17531 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f17532;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(4356121213690294611L);
                    f17532 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f17533;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(-4427756677415157430L);
                    f17533 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f17534;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(8330621410826985291L);
                    f17534 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f17535;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-6508818832575848137L);
                    f17535 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f17536;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(2218572918859107322L);
                    f17536 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f17537;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(-6773262607257815580L);
                    f17537 = strM22679;
                    return strM22679;
                case 9:
                    String str10 = f17538;
                    if (str10 != null) {
                        return str10;
                    }
                    String strM226710 = C5523.m2267(7139754222167825334L);
                    f17538 = strM226710;
                    return strM226710;
                case 10:
                    String str11 = f17539;
                    if (str11 != null) {
                        return str11;
                    }
                    String strM226711 = C5523.m2267(2856921594890674542L);
                    f17539 = strM226711;
                    return strM226711;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21478(Object obj, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(2), Boolean.TRUE);
            XposedHelpers.callMethod(obj, c3828.m878(), methodHookParam.args);
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m21479(Object obj, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(1), Boolean.TRUE);
            Object obj2 = C6756.m21444()[0];
            if (obj2 != null) {
                try {
                    XposedHelpers.callMethod(obj2, yue_xin_awa(10), new Object[]{C6756.m21445()[0]});
                } catch (Throwable unused) {
                    C6338.m19833(C8269.m27251().m19648());
                }
            } else {
                C6338.m19833(C8269.m27251().m19648());
            }
            return false;
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) {
            if (C6756.m21442(C6756.this, yue_xin_awa(0))) {
                return;
            }
            try {
                final Object obj = methodHookParam.thisObject;
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                    methodHookParam.setResult(Boolean.FALSE);
                    return;
                }
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(2)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(2));
                    return;
                }
                Object objectField = XposedHelpers.getObjectField(obj, yue_xin_awa(3));
                int iIntValue = ((Integer) XposedHelpers.callMethod(XposedHelpers.getObjectField(objectField, C6756.m21443(C6756.this, objectField, this.f17540)), yue_xin_awa(4), new Object[0])).intValue();
                if (iIntValue != 3 && iIntValue != 2) {
                    if (C6337.m19825()) {
                        MessageDialog.show(yue_xin_awa(5), iIntValue + yue_xin_awa(9));
                        return;
                    }
                    return;
                }
                MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(5), yue_xin_awa(6));
                String strYue_xin_awa = yue_xin_awa(7);
                final C3828 c3828 = this.f17541;
                messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۧ
                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final boolean onClick(BaseDialog baseDialog, View view) {
                        return C6756.C6767.m21478(obj, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                    }
                }).setCancelButton(yue_xin_awa(8), new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۨ
                    static {
                        NativeUtil.classesInit0(523);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
                methodHookParam.setResult(Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public class C6768 extends XC_MethodHook {
        public C6768() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C6756.m21446()) {
                C6756.m21447(false);
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ۟۟۠, reason: contains not printable characters */
    public class C6769 extends XC_MethodHook {
        public C6769() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (((Boolean) methodHookParam.args[1]).booleanValue()) {
                C6756.m21447(true);
            }
        }
    }

    static {
        NativeUtil.classesInit0(950);
        f2283 = new String[]{yue_xin_awa(90), yue_xin_awa(91), yue_xin_awa(92), yue_xin_awa(93), yue_xin_awa(94), yue_xin_awa(95), yue_xin_awa(96), yue_xin_awa(97), yue_xin_awa(98), yue_xin_awa(99), yue_xin_awa(100), yue_xin_awa(101), yue_xin_awa(102)};
        f2284 = false;
        f17331 = new Object[1];
        f17332 = new View[1];
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3233(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21442(C6756 c6756, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m21443(C6756 c6756, Object obj, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Object[] m21444();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ View[] m21445();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21446();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21447(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    private native boolean m21448(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private void m21449(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), yue_xin_awa(21), new C6768());
            C5309.m16280(yue_xin_awa(22), classLoader, yue_xin_awa(23), Activity.class, Boolean.TYPE, new C6769());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(24), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    private static native /* synthetic */ boolean m21450(String[] strArr, BottomMenu bottomMenu, View view);

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

    /* JADX INFO: renamed from: ۥ۟ */
    public final native void m3234(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final native void m21451(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m21452(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(28));
            C3828 c38282 = c3829.m880().get(yue_xin_awa(29));
            C5309.m16280(c38282.m879(), classLoader, c38282.m878(), classLoader.loadClass(c38282.m10569().get(0)), new C6757(c38282));
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C6758(c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(30), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m21453(C3828 c3828, ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass(c3828.m879());
            C5309.m16287(clsLoadClass, c3828.m878(), new C6764(clsLoadClass, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(17), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native void m21454(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m21455(C3828 c3828, ClassLoader classLoader) {
        try {
            C4728.m14239(c3828);
            Class<?> clsLoadClass = classLoader.loadClass(c3828.m879());
            C5309.m16287(clsLoadClass, c3828.m878(), new C6765(clsLoadClass, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(18), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m21456(C3828 c3828, ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass(c3828.m879());
            C5309.m16287(clsLoadClass, c3828.m878(), new C6763(clsLoadClass, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(16), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m21457(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C6766(c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(19), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m21458(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C6767(classLoader, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(20), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m21459(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C6760(classLoader, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(32), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m21460(C3828 c3828, ClassLoader classLoader) {
        try {
            if (C4563.m1512() == 1) {
                C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C6761(c3828));
                return;
            }
            Class<?> clsLoadClass = classLoader.loadClass(yue_xin_awa(14));
            for (Method method : C8573.m4543(clsLoadClass, Void.TYPE, 6, null)) {
                C5309.m16287(clsLoadClass, method.getName(), new C6762(method));
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(15), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final native String m21461(Object obj, ClassLoader classLoader);
}
