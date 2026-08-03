package Yue;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۨۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7426 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f2874;

    /* JADX INFO: renamed from: ۥ۟ */
    public static StringBuilder f2875;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Button f22438;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22439;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22440;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22441;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22442;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22443;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22444;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22445;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22446;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22447;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22448;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22449;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22450;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22451;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22452;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22453;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22454;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22455;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22456;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22457;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22458;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22459;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22460;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22461;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22462;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22463;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22464;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22465;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22466;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22467;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22468;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22469;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22470;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22471;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22472;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22473;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22474;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22475;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22476;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22477;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22478;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22479;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22480;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22481;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22482;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22483;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22484;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22485;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22486;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22487;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22488;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22489;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22490;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22491;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22492;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22493;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22494;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22495;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22496;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22497;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22498;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22499;

    /* JADX INFO: renamed from: Yue.ۥۡۨۧۧ$ۥ */
    public class C1256 extends XC_MethodHook {
        public C1256() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C7426.m23258() != null) {
                C7426.m23258().setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۧۧ$ۥ۟ */
    public class C1257 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22501;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22502;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22503;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f22504;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Class f22505;

        public C1257(Class cls, Class cls2) {
            this.f22504 = cls;
            this.f22505 = cls2;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f22501;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(2007379507167970513L);
                f22501 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f22502;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7867013683416893530L);
                f22502 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f22503;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-1779331298193829272L);
            f22503 = strM22673;
            return strM22673;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m23262(Button button) {
            button.setVisibility(8);
            C7426.m23259(button);
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                Object obj = methodHookParam.thisObject;
                Iterator<Field> it = C4806.m1710(this.f22504, this.f22505, 1).iterator();
                while (it.hasNext()) {
                    Object objectField = XposedHelpers.getObjectField(obj, it.next().getName());
                    if (objectField != null) {
                        final Button button = (Button) objectField;
                        if (button.getText().toString().equals(yue_xin_awa(2))) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥۡۨۧۨ
                                static {
                                    NativeUtil.classesInit0(1113);
                                }

                                @Override // java.lang.Runnable
                                public final native void run();
                            });
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۧۧ$ۥ۟۟, reason: contains not printable characters */
    public class C7427 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22507;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22508;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22509;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22510;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22511;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22512;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22513;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22514;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22515;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22516;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f22517;

        public C7427() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f22507;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-7867013683416893530L);
                    f22507 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f22508;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(4356121213690294611L);
                    f22508 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f22509;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(1930715924581499477L);
                    f22509 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f22510;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-2741116318048406833L);
                    f22510 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f22511;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(4958552215367236498L);
                    f22511 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f22512;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(-5606800512298733972L);
                    f22512 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f22513;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-7240678892018003875L);
                    f22513 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f22514;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(3030896519738004321L);
                    f22514 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f22515;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(-3754427262846629422L);
                    f22515 = strM22679;
                    return strM22679;
                case 9:
                    String str10 = f22516;
                    if (str10 != null) {
                        return str10;
                    }
                    String strM226710 = C5523.m2267(-3902138108228175483L);
                    f22516 = strM226710;
                    return strM226710;
                case 10:
                    String str11 = f22517;
                    if (str11 != null) {
                        return str11;
                    }
                    String strM226711 = C5523.m2267(7139754222167825334L);
                    f22517 = strM226711;
                    return strM226711;
                default:
                    return null;
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            String strYue_xin_awa;
            try {
                C7426.f2875.setLength(0);
                if (C4093.m11556(yue_xin_awa(0))) {
                    List list = (List) methodHookParam.args[0];
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    for (Object obj : arrayList) {
                        Object objectField = XposedHelpers.getObjectField(obj, yue_xin_awa(1));
                        if (objectField != null) {
                            String str = (String) XposedHelpers.callMethod(objectField, yue_xin_awa(2), new Object[0]);
                            if (C6337.m19825()) {
                                try {
                                    strYue_xin_awa = (String) XposedHelpers.callMethod(objectField, yue_xin_awa(3), new Object[0]);
                                } catch (Throwable unused) {
                                    strYue_xin_awa = yue_xin_awa(4);
                                }
                                StringBuilder sb = C7426.f2875;
                                sb.append(yue_xin_awa(5));
                                sb.append(str);
                                sb.append(yue_xin_awa(6));
                                sb.append(strYue_xin_awa);
                                sb.append(yue_xin_awa(7));
                                sb.append(yue_xin_awa(8));
                            }
                            if (C4093.m11556(yue_xin_awa(9) + str)) {
                                list.remove(obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C6334.m19807(th + yue_xin_awa(10), 3);
            }
        }
    }

    static {
        NativeUtil.classesInit0(1112);
        f2874 = new String[]{yue_xin_awa(39), yue_xin_awa(40), yue_xin_awa(41), yue_xin_awa(42), yue_xin_awa(43), yue_xin_awa(44), yue_xin_awa(45), yue_xin_awa(46), yue_xin_awa(47), yue_xin_awa(48), yue_xin_awa(49), yue_xin_awa(50), yue_xin_awa(51), yue_xin_awa(52), yue_xin_awa(53), yue_xin_awa(54), yue_xin_awa(55), yue_xin_awa(56), yue_xin_awa(57), yue_xin_awa(58), yue_xin_awa(59), yue_xin_awa(60)};
        f2875 = new StringBuilder();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3620(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Button m23258();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Button m23259(Button button);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private static native /* synthetic */ boolean m23260(String[] strArr, BottomMenu bottomMenu, View view);

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
    public final native void m3621(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m23261(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(5));
            C3828 c38282 = c3829.m880().get(yue_xin_awa(6));
            Class<?> clsLoadClass = classLoader.loadClass(yue_xin_awa(7));
            List<C3828> listM10568 = c3828.m10568();
            C5309.m16287(classLoader.loadClass(c38282.m879()), c38282.m878(), new C1256());
            for (C3828 c38283 : listM10568) {
                Class<?> clsLoadClass2 = classLoader.loadClass(c38283.m879());
                C5309.m16287(clsLoadClass2, c38283.m878(), new C1257(clsLoadClass2, clsLoadClass));
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(8), th.getMessage());
        }
    }
}
