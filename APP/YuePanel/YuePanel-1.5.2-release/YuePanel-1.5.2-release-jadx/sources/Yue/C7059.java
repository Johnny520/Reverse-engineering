package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۦۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7059 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String[] f2658;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21301;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21302;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21303;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21304;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21305;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21306;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21307;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21308;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21309;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21310;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21311;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21312;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21313;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21314;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21315;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21316;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21317;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21318;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21319;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21320;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21321;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21322;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21323;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21324;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21325;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21326;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21327;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21328;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21329;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21330;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21331;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21332;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21333;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21334;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21335;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21336;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21337;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21338;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21339;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21340;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21341;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21342;

    /* JADX INFO: renamed from: ۥ */
    public Class<?> f2659;

    /* JADX INFO: renamed from: Yue.ۥۡۦۢۤ$ۥ */
    public class C1151 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f21343;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f21344;

        public C1151() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f21343;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(511745193059127661L);
                f21343 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f21344;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(3981848314088714492L);
            f21344 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C6263.m2730()) {
                try {
                    C7059.m21982(C7059.this, methodHookParam.args[2], methodHookParam.getResult());
                } catch (Throwable th) {
                    C6334.m19809(yue_xin_awa(1) + th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۢۤ$ۥ۟ */
    public class C1152 extends OnBindView<BottomDialog> {
        static {
            NativeUtil.classesInit0(41);
        }

        public C1152(View view) {
            super(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native void m3347(BottomDialog bottomDialog, View view);
    }

    static {
        NativeUtil.classesInit0(1026);
        f2658 = new String[]{yue_xin_awa(39), yue_xin_awa(40), yue_xin_awa(41)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3345(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m3346(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21980(C7059 c7059, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21981(C7059 c7059, String str, long j, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21982(C7059 c7059, Object obj, Object obj2) throws Throwable;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21983(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21984(InputDialog inputDialog, View view, String str);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(4));
            this.f2659 = classLoader.loadClass(c3829.m880().get(yue_xin_awa(5)).m879());
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C1151());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(0), th.getMessage());
        }
    }

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final native boolean m21985(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native /* synthetic */ boolean m21986(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final /* synthetic */ void m21987(String str, long j, String str2) {
        C7477.m3677(C4093.m11558(yue_xin_awa(21)));
        XposedHelpers.callMethod(XposedHelpers.callMethod(XposedHelpers.callStaticMethod(this.f2659, yue_xin_awa(32), new Object[0]), yue_xin_awa(33), new Object[]{str, yue_xin_awa(34), Long.valueOf(j), 0, 0, yue_xin_awa(35)}), yue_xin_awa(36), new Object[0]);
        C6334.m19810(yue_xin_awa(37) + str2 + yue_xin_awa(38));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m21988(Object obj, Object obj2) throws Throwable {
        final String str = (String) XposedHelpers.callMethod(obj2, yue_xin_awa(6), new Object[0]);
        String str2 = (String) XposedHelpers.callMethod(obj2, yue_xin_awa(6), new Object[0]);
        String strM11561 = C4093.m11561(yue_xin_awa(7));
        if ((strM11561 == null || !strM11561.contains(str2)) && ((Integer) C5898.m18284(obj, yue_xin_awa(8), Integer.class)).intValue() == 74) {
            try {
                final long jLongValue = ((Long) XposedHelpers.callMethod(obj2, yue_xin_awa(9), new Object[0])).longValue();
                JSONObject jSONObject = new JSONObject((String) C5898.m18284(obj, yue_xin_awa(10), String.class));
                final String string = jSONObject.getString(yue_xin_awa(11));
                try {
                    String string2 = jSONObject.getString(yue_xin_awa(12));
                    if (!string2.isEmpty()) {
                        if (m21985(string2)) {
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
                new Thread(new Runnable() { // from class: Yue.ۥۡۦۢۡ
                    static {
                        NativeUtil.classesInit0(C6699.f17265);
                    }

                    @Override // java.lang.Runnable
                    public final native void run();
                }).start();
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(13) + str + yue_xin_awa(14) + th);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native void m21989();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native void m21990();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native void m21991();
}
