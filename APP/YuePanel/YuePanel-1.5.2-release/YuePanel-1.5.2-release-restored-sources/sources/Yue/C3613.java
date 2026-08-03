package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.RegionInfo;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3613 {

    /* JADX INFO: renamed from: ۥ */
    public static Class<?> f416;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Class<?> f417;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Class<?> f6291;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Class<?> f6292;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Class<?> f6293;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6294;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6295;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6296;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6297;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6298;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6299;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6300;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6301;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6302;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6303;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6304;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6305;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6306;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6307;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6308;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6309;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6310;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6312;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6313;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6314;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6315;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6316;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6317;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6318;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6319;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6320;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6321;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6322;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6323;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6324;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6325;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6326;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6327;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6328;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6329;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6330;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6331;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6332;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6333;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6334;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6335;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6336;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6337;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6338;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6339;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6340;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6341;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6342;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6343;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6344;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6345;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6346;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6347;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6348;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6349;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6350;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6351;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6352;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6353;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6354;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6355;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6356;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6357;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6358;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6359;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6360;

    static {
        NativeUtil.classesInit0(623);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native C6320 m658(Object obj);

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object m659(Object obj) {
        Object objectField;
        ClassLoader classLoaderM6707 = C3270.m6707();
        try {
            Class<?> clsLoadClass = classLoaderM6707.loadClass(yue_xin_awa(59));
            try {
                objectField = XposedHelpers.callMethod(obj, yue_xin_awa(60), new Object[0]);
            } catch (Throwable unused) {
                try {
                    objectField = XposedHelpers.getObjectField(obj, C4806.m1710(classLoaderM6707.loadClass(yue_xin_awa(62)), classLoaderM6707.loadClass(yue_xin_awa(61)), 17).get(0).getName());
                } catch (Throwable unused2) {
                    objectField = XposedHelpers.getObjectField(obj, yue_xin_awa(63));
                }
            }
            if (objectField == null) {
                C6334.m19808(yue_xin_awa(64), 3);
                return null;
            }
            try {
                return XposedHelpers.callMethod(objectField, yue_xin_awa(65), new Object[0]);
            } catch (Throwable unused3) {
                return XposedHelpers.callMethod(objectField, C8573.m4543(classLoaderM6707.loadClass(objectField.getClass().getName()), clsLoadClass, 0, new Class[0]).get(0).getName(), new Object[0]);
            }
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(66) + th.getMessage(), 1);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native List<String> m9741(List list);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m9742(C6320 c6320);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m9743(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m9744(C6320 c6320, ClassLoader classLoader) {
        try {
            String str = (String) XposedHelpers.callMethod(new C4805().m14538(c6320.m19668()).m14540(classLoader.loadClass(yue_xin_awa(2))).m1709(yue_xin_awa(18)), yue_xin_awa(25), new Object[0]);
            List<String> list = (List) new C4805().m14538(XposedHelpers.callStaticMethod(classLoader.loadClass(C8269.f3370.m879()), C8269.f3370.m878(), new Object[]{c6320.m19649(), c6320.m19668()})).m14536(f6292.getName()).m14540(List.class).m1709(yue_xin_awa(9));
            String str2 = list.get(list.size() - 1);
            if (!str.startsWith(yue_xin_awa(26))) {
                str = str2;
            }
            c6320.m19704(str2);
            c6320.m19705(list);
            c6320.m19689(str);
            List list2 = (List) C5898.m18284(c6320.m19649(), yue_xin_awa(13), List.class);
            if (list2 != null) {
                c6320.m19686(m9741(list2));
            } else {
                c6320.m19686(new ArrayList());
            }
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(27) + th.getMessage(), 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m9745(C6320 c6320);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native void m9746(C6320 c6320);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m9747(C6320 c6320);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m9748(C6320 c6320, Object obj) {
        try {
            Object objM18284 = C5898.m18284(obj, yue_xin_awa(56), f417);
            c6320.m19699(XposedHelpers.callMethod(obj, yue_xin_awa(57), new Object[0]));
            c6320.m19680(obj);
            c6320.m19698(objM18284);
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(58) + th.getMessage(), 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m9749(C6320 c6320) {
        String str;
        String string;
        String str2;
        String str3;
        String string2;
        String strYue_xin_awa;
        String strYue_xin_awa2;
        try {
            Object objM19649 = c6320.m19649();
            Object objM19668 = c6320.m19668();
            C4805 c4805M14538 = new C4805().m14538(XposedHelpers.callMethod(objM19649, yue_xin_awa(29), new Object[0]));
            C4805 c4805M145382 = new C4805().m14538(objM19649);
            C4805 c4805M145383 = new C4805().m14538(objM19668);
            C4805 c4805M145384 = new C4805().m14538(c6320.m19667());
            Class<?> cls = Long.TYPE;
            long jLongValue = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(30))).longValue();
            long jLongValue2 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(31))).longValue();
            long jLongValue3 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(32))).longValue();
            long jLongValue4 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(33))).longValue();
            long jLongValue5 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(34))).longValue();
            int iIntValue = ((Integer) XposedHelpers.callMethod(objM19649, yue_xin_awa(35), new Object[0])).intValue();
            String str4 = (String) c4805M145382.m14540(String.class).m1709(yue_xin_awa(36));
            String strYue_xin_awa3 = (String) c4805M145383.m14540(String.class).m1709(yue_xin_awa(37));
            if (strYue_xin_awa3 == null) {
                strYue_xin_awa3 = yue_xin_awa(38);
            }
            int iIntValue2 = ((Integer) c4805M145383.m14540(Integer.TYPE).m1709(yue_xin_awa(39))).intValue();
            String str5 = (String) c4805M145382.m14540(String.class).m1709(yue_xin_awa(40));
            Object objM1709 = c4805M145382.m14540(f6293).m1709(yue_xin_awa(41));
            String str6 = objM1709 != null ? (String) C5898.m18284(objM1709, yue_xin_awa(42), String.class) : null;
            try {
                str = str6;
                try {
                    string = new JSONObject(str6).getString(yue_xin_awa(43));
                } catch (Exception unused) {
                    string = str;
                }
            } catch (Exception unused2) {
                str = str6;
            }
            String str7 = string;
            String str8 = (String) c4805M145384.m14540(String.class).m1709(yue_xin_awa(44));
            String str9 = (String) c4805M145382.m14540(String.class).m1709(yue_xin_awa(45));
            String str10 = (String) c4805M145384.m14540(String.class).m1709(yue_xin_awa(46));
            String strM24801 = C7817.m24801(((Long) c4805M145382.m14540(null).m1709(yue_xin_awa(47))).longValue() * 1000);
            RegionInfo regionInfoM877 = C3826.m877((String) c4805M145382.m14540(String.class).m1709(yue_xin_awa(48)));
            if (regionInfoM877 != null) {
                StringBuilder sb = new StringBuilder();
                str3 = strM24801;
                if (regionInfoM877.province == null) {
                    string2 = yue_xin_awa(49);
                    str2 = str10;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    str2 = str10;
                    sb2.append(regionInfoM877.province);
                    sb2.append(yue_xin_awa(50));
                    string2 = sb2.toString();
                }
                sb.append(string2);
                if (regionInfoM877.city == null) {
                    strYue_xin_awa = yue_xin_awa(49);
                } else {
                    strYue_xin_awa = regionInfoM877.city + yue_xin_awa(50);
                }
                sb.append(strYue_xin_awa);
                if (regionInfoM877.district == null) {
                    strYue_xin_awa2 = yue_xin_awa(49);
                } else {
                    strYue_xin_awa2 = regionInfoM877.district + yue_xin_awa(50);
                }
                sb.append(strYue_xin_awa2);
                c6320.m19681(sb.toString());
            } else {
                str2 = str10;
                str3 = strM24801;
                c6320.m19681(yue_xin_awa(51));
            }
            Object objM17092 = c4805M145382.m14540(null).m1709(yue_xin_awa(52));
            if (objM17092 != null) {
                c6320.m19700((String) XposedHelpers.callMethod(objM17092, yue_xin_awa(53), new Object[0]));
            } else {
                c6320.m19700(yue_xin_awa(54));
            }
            c6320.m19690(jLongValue5);
            c6320.m19687(jLongValue);
            c6320.m19683(jLongValue2);
            c6320.m19691(jLongValue3);
            c6320.m19682(jLongValue4);
            c6320.m19695(iIntValue);
            c6320.m19693(str4);
            c6320.m19702(strYue_xin_awa3);
            long j = iIntValue2;
            c6320.m19701(j);
            c6320.m19685(str5);
            c6320.m19676(str7);
            c6320.m19694(C7817.m24800(j));
            c6320.m19679(str8);
            c6320.m19678(str2);
            c6320.m19703(str9);
            c6320.m19696(str3);
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(55) + th.getMessage(), 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m9750(C6320 c6320) {
        try {
            List list = (List) new C4805().m14538(new C4805().m14538(c6320.m19668()).m14540(f6292).m1709(yue_xin_awa(8))).m14540(List.class).m1709(yue_xin_awa(9));
            c6320.m19677((String) ((List) XposedHelpers.callMethod(C5898.m18284(c6320.m19667(), yue_xin_awa(10), f6292), yue_xin_awa(11), new Object[0])).get(0));
            c6320.m19684((String) list.get(2));
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(12) + th.getMessage(), 1);
        }
    }
}
