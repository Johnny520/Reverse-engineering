package Yue;

import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6291 {

    /* JADX INFO: renamed from: ۥ */
    public static C3828 f1983;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1984;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15844;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15845;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15846;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15847;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15848;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15849;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15850;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15851;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15852;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15853;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15854;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15855;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15856;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15857;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15858;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15859;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15860;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15861;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15862;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15863;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15864;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15865;

    static {
        NativeUtil.classesInit0(723);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ Object m2761(String str, String str2, int i, String str3, int i2, Object obj, Method method, Object[] objArr);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m2762(Method method, String str, String str2, int i, String str3, int i2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object m19567() {
        try {
            UUID uuidRandomUUID = UUID.randomUUID();
            Object objM21992 = C7070.m21992(C3270.m6707().loadClass(yue_xin_awa(16)));
            XposedHelpers.callMethod(objM21992, yue_xin_awa(17), new Object[]{uuidRandomUUID.toString()});
            return objM21992;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native C3828 m19568();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native Object m19569();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19570(Method method, String str, String str2, int i, String str3, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ Object m19571(String str, String str2, int i, String str3, int i2, Object obj, Method method, Object[] objArr) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Object m19572(Object obj) {
        Object objM19567 = m19567();
        if (objM19567 == null) {
            return null;
        }
        try {
            String str = (String) XposedHelpers.callMethod(obj, yue_xin_awa(12), new Object[0]);
            Integer num = (Integer) XposedHelpers.callMethod(obj, yue_xin_awa(13), new Object[0]);
            num.intValue();
            String str2 = (String) XposedHelpers.callMethod(obj, yue_xin_awa(14), new Object[0]);
            Integer num2 = (Integer) XposedHelpers.callMethod(obj, yue_xin_awa(15), new Object[0]);
            num2.intValue();
            XposedHelpers.callMethod(objM19567, yue_xin_awa(4), new Object[]{str2});
            XposedHelpers.callMethod(objM19567, yue_xin_awa(5), new Object[]{str});
            XposedHelpers.callMethod(objM19567, yue_xin_awa(6), new Object[]{num2});
            XposedHelpers.callMethod(objM19567, yue_xin_awa(7), new Object[]{num});
            return objM19567;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m19573(String str, String str2, String str3, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m19574(Object obj, Object obj2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object objM19569 = m19569();
            String strM878 = f1983.m878();
            if (obj != null && objM19569 != null) {
                XposedHelpers.callMethod(objM19569, strM878, new Object[]{obj, linkedHashMap, obj2, 0, null});
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(11) + th.getMessage(), 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m19575(String str, int i, Object obj) {
        try {
            Object objM19567 = m19567();
            if (objM19567 == null) {
                return false;
            }
            XposedHelpers.callMethod(objM19567, yue_xin_awa(4), new Object[]{str});
            XposedHelpers.callMethod(objM19567, yue_xin_awa(5), new Object[]{C6263.m19271()});
            XposedHelpers.callMethod(objM19567, yue_xin_awa(6), new Object[]{Integer.valueOf(C6263.m19270())});
            XposedHelpers.callMethod(objM19567, yue_xin_awa(7), new Object[]{Integer.valueOf(i)});
            m19574(objM19567, obj);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m19576(String str, String str2, Object obj, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(yue_xin_awa(8), 0);
            jSONObject.put(yue_xin_awa(9), str2);
            jSONObject.put(yue_xin_awa(10), 700);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object objM19567 = m19567();
            Object objM19569 = m19569();
            String strM878 = f1983.m878();
            if (objM19567 != null && objM19569 != null) {
                XposedHelpers.callMethod(objM19567, yue_xin_awa(4), new Object[]{jSONObject.toString()});
                XposedHelpers.callMethod(objM19567, yue_xin_awa(5), new Object[]{str});
                XposedHelpers.callMethod(objM19567, yue_xin_awa(6), new Object[]{Integer.valueOf(i)});
                XposedHelpers.callMethod(objM19567, yue_xin_awa(7), new Object[]{7});
                XposedHelpers.callMethod(objM19569, strM878, new Object[]{objM19567, linkedHashMap, obj, 0, null});
                return true;
            }
            return false;
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(11) + th.getMessage(), 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native void m19577(C3828 c3828);
}
