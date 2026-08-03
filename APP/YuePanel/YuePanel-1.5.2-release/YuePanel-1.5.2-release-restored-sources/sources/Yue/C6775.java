package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6775 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2293;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2294;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17548;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17549;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17550;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17551;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17552;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17553;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17554;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17555;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17556;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17557;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17558;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17559;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17560;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17561;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17562;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17563;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17564;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17565;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17566;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17567;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17568;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17569;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17570;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17571;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17572;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17573;

    /* JADX INFO: renamed from: Yue.ۥۡۥ$ۥ */
    public class C1079 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17574;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17575;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17576;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17577;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17578;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17579;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17580;

        public C1079() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f17574;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(932541501788950482L);
                    f17574 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f17575;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(3430770661614872424L);
                    f17575 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f17576;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(7489709604160414142L);
                    f17576 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f17577;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(8330621410826985291L);
                    f17577 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f17578;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(2708598053435126334L);
                    f17578 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f17579;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(6106737580778973606L);
                    f17579 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f17580;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(2856921594890674542L);
                    f17580 = strM22677;
                    return strM22677;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21480(Object obj, View view, MessageDialog messageDialog, View view2) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(2), Boolean.TRUE);
            XposedHelpers.callMethod(obj, yue_xin_awa(6), new Object[]{view});
            return false;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                final Object obj = methodHookParam.thisObject;
                final View view = (View) methodHookParam.args[0];
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(2)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(2));
                } else {
                    MessageDialog.show(yue_xin_awa(3), yue_xin_awa(4)).setOkButton(yue_xin_awa(5), new OnDialogButtonClickListener() { // from class: Yue.ۥۡۤۨ۠
                        static {
                            NativeUtil.classesInit0(946);
                        }

                        @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                        public final native boolean onClick(BaseDialog baseDialog, View view2);
                    });
                    methodHookParam.setResult((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ$ۥ۟ */
    public class C1080 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17582;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17583;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17584;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17585;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17586;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17587;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17588;

        public C1080(C3828 c3828) {
            this.f17588 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f17582;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(932541501788950482L);
                f17582 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f17583;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-9217586392301241591L);
                f17583 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f17584;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(7489709604160414142L);
                f17584 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f17585;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(8330621410826985291L);
                f17585 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f17586;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(-5105157665214041895L);
                f17586 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f17587;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(-4544144604250045835L);
            f17587 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21481(Object obj, C3828 c3828, View view, MessageDialog messageDialog, View view2) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(2), Boolean.TRUE);
            XposedHelpers.callMethod(obj, c3828.m878(), new Object[]{view});
            return false;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                final Object obj = methodHookParam.thisObject;
                final View view = (View) methodHookParam.args[0];
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(2)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(2));
                    return;
                }
                MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(3), yue_xin_awa(4));
                String strYue_xin_awa = yue_xin_awa(5);
                final C3828 c3828 = this.f17588;
                messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟
                    static {
                        NativeUtil.classesInit0(471);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view2);
                });
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ$ۥ۟۟, reason: contains not printable characters */
    public class C6776 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17590;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17591;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17592;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17593;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17594;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17595;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17596;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f17597;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f17598;

        public C6776(C3828 c3828) {
            this.f17598 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f17590;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(932541501788950482L);
                    f17590 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f17591;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-4374595539250246792L);
                    f17591 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f17592;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(7489709604160414142L);
                    f17592 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f17593;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(8330621410826985291L);
                    f17593 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f17594;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(3435831171797393220L);
                    f17594 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f17595;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(-1952166788182932677L);
                    f17595 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f17596;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-1427366544525735100L);
                    f17596 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f17597;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(5266232753261247077L);
                    f17597 = strM22678;
                    return strM22678;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21483(Object obj, C3828 c3828, MessageDialog messageDialog, View view) {
            XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(2), Boolean.TRUE);
            XposedHelpers.callMethod(obj, c3828.m878(), new Object[0]);
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m21484(MessageDialog messageDialog, View view) {
            C6334.m19811(yue_xin_awa(7));
            return false;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                final Object obj = methodHookParam.thisObject;
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(2)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(2));
                    return;
                }
                MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(3), yue_xin_awa(4));
                String strYue_xin_awa = yue_xin_awa(5);
                final C3828 c3828 = this.f17598;
                messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟۠
                    static {
                        NativeUtil.classesInit0(512);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                }).setCancelButton(yue_xin_awa(6), new OnDialogButtonClickListener() { // from class: Yue.ۥۡۥ۟ۢ
                    static {
                        NativeUtil.classesInit0(516);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
                methodHookParam.setResult((Object) null);
            }
        }
    }

    static {
        NativeUtil.classesInit0(229);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3247(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    private static native /* synthetic */ boolean m3248(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();
}
