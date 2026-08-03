package Yue;

import com.google.gson.Gson;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3801 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f512;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f513;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7036;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7037;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7038;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7039;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7040;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7041;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7042;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7043;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7044;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7045;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۧ$ۥ */
    public class C0257 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7046;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7047;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f7048;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f7049;

        public C0257(C3828 c3828, C3828 c38282) {
            this.f7048 = c3828;
            this.f7049 = c38282;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7046;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-7146900696298624833L);
                f7046 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f7047;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(1431720363704310272L);
            f7047 = strM22672;
            return strM22672;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                C3801.m849(C3801.this, this.f7048.m10569().isEmpty() ? (List) C5898.m18284(methodHookParam.thisObject, yue_xin_awa(0), List.class) : this.f7048.m10569().size() > 1 ? (List) XposedHelpers.callMethod(methodHookParam.args[1], yue_xin_awa(1), new Object[0]) : (List) XposedHelpers.callMethod(methodHookParam.args[0], yue_xin_awa(1), new Object[0]), this.f7049.m879());
            } catch (Throwable th) {
                C6334.m19808(th.getMessage(), 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(1062);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m849(C3801 c3801, List list, String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native List<String> m10505(String str);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
        try {
            C3828 c3828 = c3829.m880().get(yue_xin_awa(2));
            C3828 c38282 = c3829.m880().get(yue_xin_awa(3));
            C5309.m16287(classLoader.loadClass(c38282.m879()), c38282.m878(), new C0257(c38282, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(0), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m850(List list, String str) {
        C4119.f689.clear();
        for (Object obj : list) {
            if (!obj.getClass().getName().equals(str)) {
                String json = new Gson().toJson(obj);
                C6321 c6321 = new C6321();
                String str2 = (String) XposedHelpers.callMethod(obj, yue_xin_awa(4), new Object[0]);
                String str3 = (String) XposedHelpers.callMethod(obj, yue_xin_awa(5), new Object[0]);
                List<String> listM10505 = m10505(json);
                if (!listM10505.isEmpty()) {
                    c6321.m19707(listM10505.get(listM10505.size() - 1));
                }
                c6321.m19708(str3);
                c6321.m19709(str2);
                C4119.f689.add(c6321);
            }
        }
    }
}
