package Yue;

import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4706 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object f1067;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object f10009;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Object f10010;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String f10011;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10012;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10013;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10014;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10015;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10016;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10017;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10018;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10019;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10020;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10021;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10022;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10023;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10025;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10026;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10027;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10028;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10029;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10030;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10031;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10032;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10033;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10034;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10035;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10036;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10037;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10038;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10039;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10040;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10041;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10042;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10043;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10044;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10045;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10046;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10047;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10048;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10049;

    /* JADX INFO: renamed from: ۥ */
    public String f1068;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ */
    public class C0468 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10050;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10051;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10052;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10053;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10054;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10055;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10056;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10057;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10058;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10059;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10060;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10061;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f10062;

        public C0468(C3828 c3828) {
            this.f10062 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f10050;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-5892969918498628310L);
                    f10050 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f10051;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(6305337972309801340L);
                    f10051 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f10052;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-8272354930314500451L);
                    f10052 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f10053;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-1046243716500911314L);
                    f10053 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f10054;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(932541501788950482L);
                    f10054 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f10055;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(-9217586392301241591L);
                    f10055 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f10056;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-3469792697516477454L);
                    f10056 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f10057;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(8330621410826985291L);
                    f10057 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f10058;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(8738842753505147372L);
                    f10058 = strM22679;
                    return strM22679;
                case 9:
                    String str10 = f10059;
                    if (str10 != null) {
                        return str10;
                    }
                    String strM226710 = C5523.m2267(7716948843518106104L);
                    f10059 = strM226710;
                    return strM226710;
                case 10:
                    String str11 = f10060;
                    if (str11 != null) {
                        return str11;
                    }
                    String strM226711 = C5523.m2267(3610852953512170009L);
                    f10060 = strM226711;
                    return strM226711;
                case 11:
                    String str12 = f10061;
                    if (str12 != null) {
                        return str12;
                    }
                    String strM226712 = C5523.m2267(-2412751436139704553L);
                    f10061 = strM226712;
                    return strM226712;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m14048(C3828 c3828, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(C4706.m1621(), yue_xin_awa(6), Boolean.TRUE);
                XposedHelpers.callMethod(C4706.m1621(), c3828.m878(), new Object[]{C4706.m14032(), C4706.m14034()});
                C6334.m19807(yue_xin_awa(10), 2);
                return false;
            } catch (Throwable th) {
                C6334.m19807(yue_xin_awa(11) + th, 1);
                return false;
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                if (C8269.m27251().m19655().isEmpty()) {
                    C3566.m9556(yue_xin_awa(2));
                } else {
                    C3566.m9556(yue_xin_awa(3));
                }
                methodHookParam.setResult((Object) null);
                return;
            }
            if (C4093.m11556(yue_xin_awa(4)) && C4093.m11556(yue_xin_awa(5))) {
                C4706.m1622(methodHookParam.thisObject);
                C4706.m14033(methodHookParam.args[0]);
                C4706.m14035(methodHookParam.args[1]);
                if (XposedHelpers.getAdditionalInstanceField(C4706.m1621(), yue_xin_awa(6)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(C4706.m1621(), yue_xin_awa(6));
                    return;
                }
                MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(7), yue_xin_awa(8));
                String strYue_xin_awa = yue_xin_awa(9);
                final C3828 c3828 = this.f10062;
                messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥ۠ۡ۠ۨ
                    static {
                        NativeUtil.classesInit0(855);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ۟ */
    public class C0469 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10064;

        public C0469() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f10064;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(9140822359501750777L);
            f10064 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.thisObject;
            if (C4728.m14228() == null) {
                C4728.m14245(obj);
                C4116.f8217 = obj;
            }
            if (C4728.m14228() == obj) {
                return;
            }
            C4728.m14245(obj);
            C4116.f8217 = obj;
            C5863.m2535(yue_xin_awa(0));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ۟۟, reason: contains not printable characters */
    public class C4707 extends XC_MethodHook {
        public C4707() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.thisObject;
            C4728.m14245(obj);
            C4116.f8217 = obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ۟۟۟, reason: contains not printable characters */
    public class C4708 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10067;

        public C4708() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f10067;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(2574457375322254790L);
            f10067 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4728.m14240((String) new C4805().m14538(methodHookParam.args[0]).m14540(null).m1709(yue_xin_awa(0)), methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C4709 extends XC_MethodHook {
        public C4709() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C4728.m14224() != null) {
                return;
            }
            C4728.m14241(methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C4710 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10070;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10071;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10072;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f10073;

        public C4710(ClassLoader classLoader) {
            this.f10073 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f10070;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(1847537194860979568L);
                f10070 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f10071;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-1885930495470145280L);
                f10071 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f10072;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(2574457375322254790L);
            f10072 = strM22673;
            return strM22673;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[0];
            if (C4706.m14036() == null) {
                List<Method> listM4543 = C8573.m4543(this.f10073.loadClass(obj.getClass().getName()), this.f10073.loadClass(yue_xin_awa(0)), 0, new Class[0]);
                C4706.m14037(listM4543.isEmpty() ? yue_xin_awa(1) : listM4543.get(0).getName());
            }
            C4728.m1645((String) new C4805().m14538(XposedHelpers.callMethod(obj, C4706.m14036(), new Object[0])).m14540(null).m1709(yue_xin_awa(2)), methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۡ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C4711 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10075;

        public C4711() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f10075;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(912793601418170428L);
            f10075 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[0];
            if (C4706.m14038(C4706.this) == null) {
                C4706 c4706 = C4706.this;
                C4706.m14039(c4706, C4706.m14040(c4706, obj));
            }
            try {
                int iIntValue = ((Integer) C5898.m18284(obj, C4706.m14038(C4706.this), Integer.TYPE)).intValue();
                if (iIntValue == 1) {
                    C3989.m11300(iIntValue);
                } else {
                    C3989.m963(iIntValue);
                }
            } catch (Throwable th) {
                C4383.m12707(yue_xin_awa(0), th.getMessage());
            }
        }
    }

    static {
        NativeUtil.classesInit0(961);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ Object m1621();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ Object m1622(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Object m14032();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Object m14033(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Object m14034();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ Object m14035(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ String m14036();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ String m14037(String str);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m14038(C4706 c4706);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ String m14039(C4706 c4706, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ String m14040(C4706 c4706, Object obj);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native void m14041(ClassLoader classLoader, C3828 c3828);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native void m14042(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m14043(ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(yue_xin_awa(16)), yue_xin_awa(18), new C4711());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(19), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final native void m14044(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m14045(ClassLoader classLoader, C3828 c3828) {
        try {
            C4728.f10111 = c3828.m878();
            C5309.m16286(XposedHelpers.findClass(c3828.m879(), classLoader), new C4709());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(14), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m14046(ClassLoader classLoader, C3828 c3828) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass(c3828.m879());
            C5309.m16280(c3828.m879(), classLoader, yue_xin_awa(9), MotionEvent.class, new C0469());
            C5309.m16286(clsLoadClass, new C4707());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(10), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final native String m14047(Object obj);
}
