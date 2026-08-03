package Yue;

import Yue.C7311;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.WaitDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.hook.p005dy.utils.VideoReplace;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3996 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static Class<?> f611;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f612;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f7946;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7947;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7948;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7949;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7950;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7951;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7952;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7953;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7954;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7955;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7956;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7957;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7958;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7959;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7960;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7961;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7962;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7963;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7964;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7965;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7966;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7967;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7968;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7969;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7970;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7971;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7972;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7973;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦ۟۟$ۥ */
    public class C0304 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7974;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7975;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7976;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7977;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7978;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7979;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7980;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7981;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7982;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7983;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7984;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7985;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f7986;

        public C0304(ClassLoader classLoader, C3828 c3828) {
            this.f7985 = classLoader;
            this.f7986 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f7974;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(2579111645021645601L);
                    f7974 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f7975;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(5151754681516008488L);
                    f7975 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f7976;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-8061551710064007134L);
                    f7976 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f7977;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(5974337490966971997L);
                    f7977 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f7978;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(8330621410826985291L);
                    f7978 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f7979;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(6697281094000685012L);
                    f7979 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f7980;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(7891749377780555931L);
                    f7980 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f7981;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(430036651619547368L);
                    f7981 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f7982;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(7525915036204643732L);
                    f7982 = strM22679;
                    return strM22679;
                case 9:
                    String str10 = f7983;
                    if (str10 != null) {
                        return str10;
                    }
                    String strM226710 = C5523.m2267(8411700283159541296L);
                    f7983 = strM226710;
                    return strM226710;
                case 10:
                    String str11 = f7984;
                    if (str11 != null) {
                        return str11;
                    }
                    String strM226711 = C5523.m2267(-5250813875248605926L);
                    f7984 = strM226711;
                    return strM226711;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m11313(MessageDialog messageDialog, View view) {
            VideoReplace.m31074(1);
            VideoReplace.m31076();
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m11314(Object obj, C3828 c3828, Object obj2, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(obj, yue_xin_awa(3), Boolean.TRUE);
                XposedHelpers.callMethod(obj, c3828.m878(), new Object[]{obj2});
                C6334.m19807(yue_xin_awa(9), 2);
                return false;
            } catch (Throwable th) {
                C6334.m19807(yue_xin_awa(10) + th, 1);
                return false;
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object objectField;
            C3998.m11315(methodHookParam, this.f7985);
            if (C4093.m11556(yue_xin_awa(0))) {
                try {
                    VideoReplace.f4198 = methodHookParam.thisObject;
                    final Object obj = methodHookParam.args[0];
                    VideoReplace.f30783 = obj;
                    final Object obj2 = VideoReplace.f4198;
                    try {
                        C3996.m11305(yue_xin_awa(1));
                        objectField = XposedHelpers.getObjectField(obj, C3996.m11304());
                    } catch (Throwable unused) {
                        C3996.m11305(yue_xin_awa(2));
                        objectField = XposedHelpers.getObjectField(obj, C3996.m11304());
                    }
                    if (C3996.m11306() == null) {
                        C3996.m11307(C4806.m1710(this.f7985.loadClass(objectField.getClass().getName()), C3996.m11308(), 1).get(0).getName());
                    }
                    if (C5898.m18284(objectField, C3996.m11306(), C3996.m11308()) == null) {
                        return;
                    }
                    if (XposedHelpers.getAdditionalInstanceField(obj2, yue_xin_awa(3)) != null) {
                        XposedHelpers.removeAdditionalInstanceField(obj2, yue_xin_awa(3));
                        return;
                    }
                    MessageDialog cancelButton = MessageDialog.show(yue_xin_awa(4), yue_xin_awa(5)).setCancelButton(yue_xin_awa(6), new OnDialogButtonClickListener() { // from class: Yue.ۥ۟ۦ
                        static {
                            NativeUtil.classesInit0(279);
                        }

                        @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                        public final native boolean onClick(BaseDialog baseDialog, View view);
                    });
                    String strYue_xin_awa = yue_xin_awa(7);
                    final C3828 c3828 = this.f7986;
                    cancelButton.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥ۟ۦ۟
                        static {
                            NativeUtil.classesInit0(676);
                        }

                        @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                        public final native boolean onClick(BaseDialog baseDialog, View view);
                    });
                    methodHookParam.setResult((Object) null);
                } catch (Throwable th) {
                    C6334.m19809(yue_xin_awa(8) + th);
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(638);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m968(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m969(String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m11304();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m11305(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m11306();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ String m11307(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ Class m11308();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11309(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m11310(String str) {
        C7311.C1229 c1229M22830;
        try {
            WaitDialog.show(yue_xin_awa(17));
            C7477.m3677(1000L);
            if (C4093.m11556(yue_xin_awa(8))) {
                WaitDialog.show(yue_xin_awa(18));
                C7311.C1229 c1229M22831 = C7311.m22831(str, null);
                WaitDialog.show(yue_xin_awa(19));
                c1229M22830 = c1229M22831.m3562() ? C7311.m22830(c1229M22831.m3561(), null) : C7311.m22830(str, null);
            } else {
                C7311.C1229 c1229 = new C7311.C1229();
                c1229.m22847(true);
                c1229.m22846(str);
                c1229M22830 = c1229;
            }
            Object objM18284 = C5898.m18284(XposedHelpers.getObjectField(VideoReplace.f30783, f7946), f612, f611);
            long jM9234 = C3464.m9234(c1229M22830.m3561());
            if (objM18284 == null || !c1229M22830.m3562()) {
                C6334.m19807(yue_xin_awa(24) + c1229M22830.m3561() + yue_xin_awa(25) + c1229M22830.m3562(), 1);
            } else {
                C5898.m18291(objM18284, yue_xin_awa(20), Long.valueOf(jM9234));
                C5898.m18291(objM18284, yue_xin_awa(21), new File(c1229M22830.m3561()));
                if (jM9234 >= C5812.f1701) {
                    C6334.m19807(yue_xin_awa(22), 3);
                } else {
                    C6334.m19807(yue_xin_awa(23), 2);
                }
            }
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(26) + th, 1);
        }
        WaitDialog.dismiss();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native void m11311(String str);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();
}
