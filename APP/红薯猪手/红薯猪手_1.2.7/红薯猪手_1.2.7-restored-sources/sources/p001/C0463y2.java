package p001;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p001.C0178d1;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0463y2 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f1203 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f1204 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f1871 = false;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String f1872 = "";

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static String f1873 = "";

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static String f1874;

    /* JADX INFO: renamed from: ۟.y2$a */
    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01fb A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void m965(JSONArray jSONArray) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (jSONArray != null) {
                int i = C0330o.f1000;
                z = C0330o.m1166(jSONArray);
            }
            if (z) {
                int length = jSONArray.length();
                int i2 = C0330o.f1000;
                if (C0330o.m1166(jSONArray)) {
                    int iM1169 = C0330o.m1169(jSONArray);
                    while (-1 < iM1169) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(iM1169);
                        if (jSONObjectOptJSONObject != null) {
                            int i3 = 8;
                            if (C0463y2.f1203 && m1270()) {
                                if (C0463y2.f1873.length() > 0 ? z4 : false) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("user");
                                    String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("nickname") : null;
                                    if (strOptString == null) {
                                        strOptString = "";
                                    }
                                    if (strOptString.length() > 0 ? z4 : false) {
                                        String str = C0463y2.f1873;
                                        EnumC0417u8[] enumC0417u8Arr = EnumC0417u8.f1140;
                                        C0237h4.m1090("pattern", str);
                                        Pattern patternCompile = Pattern.compile(str, 66);
                                        C0237h4.m1089("compile(...)", patternCompile);
                                        if (!patternCompile.matcher(strOptString).find()) {
                                        }
                                        jSONArray.remove(iM1169);
                                        z2 = true;
                                    }
                                } else {
                                    if (C0463y2.f1872.length() > 0 ? z4 : false) {
                                        String strOptString2 = jSONObjectOptJSONObject.optString("content");
                                        if (strOptString2 == null) {
                                            strOptString2 = "";
                                        }
                                        if (strOptString2.length() > 0 ? z4 : false) {
                                            String str2 = C0463y2.f1872;
                                            EnumC0417u8[] enumC0417u8Arr2 = EnumC0417u8.f1140;
                                            C0237h4.m1090("pattern", str2);
                                            Pattern patternCompile2 = Pattern.compile(str2, 66);
                                            C0237h4.m1089("compile(...)", patternCompile2);
                                            if (patternCompile2.matcher(strOptString2).find()) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (C0463y2.f1871) {
                                    String strOptString3 = jSONObjectOptJSONObject.optString("content");
                                    if (strOptString3 == null) {
                                        strOptString3 = "";
                                    }
                                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("at_users");
                                    if (strOptString3.length() > 0 ? z4 : false) {
                                        if (jSONArrayOptJSONArray != null) {
                                            int i4 = C0330o.f1000;
                                            boolean z5 = C0330o.m1166(jSONArrayOptJSONArray) == z4 ? z4 : false;
                                            if (z5) {
                                                ArrayList arrayList = new ArrayList();
                                                int i5 = C0330o.f1000;
                                                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                                    int length2 = jSONArrayOptJSONArray.length();
                                                    int i6 = 0;
                                                    while (i6 < length2) {
                                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i6);
                                                        if (jSONObjectOptJSONObject3 != null) {
                                                            String strOptString4 = jSONObjectOptJSONObject3.optString("userid");
                                                            if (!C0237h4.m864(C0463y2.f1874, strOptString4)) {
                                                                arrayList.add(new C0364q7(strOptString4, jSONObjectOptJSONObject3.optString("nickname")));
                                                            }
                                                        }
                                                        i6++;
                                                        i3 = 8;
                                                    }
                                                }
                                                int i7 = C0330o.f1000;
                                                if (C0330o.m1166(jSONArrayOptJSONArray)) {
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        strOptString3 = C0406ta.m1247(strOptString3, "@" + ((C0364q7) it.next()).f1046, "");
                                                    }
                                                    if (C0432va.m1260(strOptString3).toString().length() == 0) {
                                                        jSONArray.remove(iM1169);
                                                        z2 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("sub_comments");
                                if (jSONArrayOptJSONArray2 != null) {
                                    int i8 = C0330o.f1000;
                                    z2 = true;
                                    z3 = C0330o.m1166(jSONArrayOptJSONArray2);
                                    if (!z3) {
                                        boolean z6 = C0463y2.f1203;
                                        m965(jSONArrayOptJSONArray2);
                                    }
                                } else {
                                    z2 = true;
                                }
                                if (!z3) {
                                }
                            }
                        } else {
                            z2 = z4;
                        }
                        iM1169--;
                        z4 = z2;
                    }
                }
                if (length > 6) {
                    jSONArray.length();
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m966() {
            return C0463y2.f1203;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m1269() {
            return C0463y2.f1871;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static boolean m1270() {
            if (C0463y2.f1203) {
                return C0463y2.f1204;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public static void m1271(String str) {
            C0237h4.m1090("value", str);
            if (str.length() > 0) {
                int i = C0330o.f1000;
                str = C0330o.m1165(str);
            }
            C0463y2.f1872 = str;
        }

        /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
        public static void m1272(String str) {
            C0237h4.m1090("value", str);
            if (str.length() > 0) {
                int i = C0330o.f1000;
                str = C0330o.m1165(str);
            }
            C0463y2.f1873 = str;
        }

        /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
        public static void m1273() {
            C0463y2.f1203 = true;
        }
    }

    /* JADX INFO: renamed from: ۟.y2$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, Object> {
        public b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final Object mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            String str;
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090("it", methodHookParam2);
            boolean z = C0463y2.f1203;
            if (a.m966()) {
                if (C0237h4.m864(methodHookParam2.args[0], "TYPE_HEY_DELETE")) {
                    Object obj = methodHookParam2.thisObject;
                    C0237h4.m1089("thisObject", obj);
                    C0274k c0274k = C0283k8.f1632;
                    Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1563);
                    if (objM1203 == null || (str = (String) C0373r3.m1204(objM1203, "nickname")) == null) {
                        str = "";
                    }
                    if (str.length() > 0) {
                        String strM1268 = C0463y2.m1268(C0463y2.this, str);
                        String str2 = strM1268 != null ? strM1268 : "";
                        a.m1273();
                        int i = C0330o.f1000;
                        a.m1272(C0330o.m1165(str2));
                    } else {
                        int i2 = C0330o.f1000;
                        C0330o.m1173(0, "增加过滤失败，获取用户名为空");
                    }
                    return C0433vb.f1163;
                }
            }
            return C0373r3.m1213(methodHookParam2);
        }
    }

    /* JADX INFO: renamed from: ۟.y2$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public static final c f1206 = new c();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090("it", methodHookParam2);
            boolean z = C0463y2.f1203;
            if (a.m966()) {
                C0274k c0274k = C0283k8.f1632;
                String str = C0283k8.a.m885().f1566;
                C0237h4.m1089("ShareItemHelperCls", str);
                Object objM1197 = C0373r3.m1197(str, C0283k8.a.m885().f1567, new Object[]{"TYPE_HEY_DELETE", "猪手屏蔽", "", ""});
                if (objM1197 != null) {
                    Object result = methodHookParam2.getResult();
                    C0237h4.m1088("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>", result);
                    C0394sb.m940(result).add(objM1197);
                }
            }
            return C0433vb.f1163;
        }
    }

    static {
        String str = "";
        if ("".length() == 0) {
            C0325n8.f994.getClass();
            JSONObject jSONObjectM905 = C0325n8.m905();
            String strOptString = jSONObjectM905 != null ? jSONObjectM905.optString("userid") : null;
            if (strOptString != null) {
                str = strOptString;
            }
        }
        f1874 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m1268(C0463y2 c0463y2, String str) {
        c0463y2.getClass();
        if (str.length() == 0) {
            int i = C0224g5.f810;
            "获取用户名失败：";
            int i2 = C0330o.f1000;
            C0330o.m1173(0, "获取用户名失败");
            return null;
        }
        EnumC0164c1 enumC0164c1 = EnumC0164c1.f1386;
        String strM847 = C0192e1.m847(enumC0164c1);
        if (strM847.length() > 0) {
            int i3 = C0330o.f1000;
            String strM1165 = C0330o.m1165(strM847);
            EnumC0417u8[] enumC0417u8Arr = EnumC0417u8.f1140;
            Pattern patternCompile = Pattern.compile(strM1165, 66);
            C0237h4.m1089("compile(...)", patternCompile);
            if (patternCompile.matcher(str).find()) {
                String string = C0372r2.m924("该用户已在过滤列表中：", str).toString();
                C0237h4.m1089("toString(...)", string);
                C0330o.m1173(1, string);
                return strM847;
            }
        }
        if (strM847.length() > 0) {
            strM847 = strM847 + "|";
        }
        String str2 = strM847 + str;
        int i4 = C0330o.f1000;
        StringBuilder sbM924 = C0372r2.m924("增加过滤: ", str);
        sbM924.append("，免重启即刻生效");
        String string2 = sbM924.toString();
        C0237h4.m1089("toString(...)", string2);
        C0330o.m1173(1, string2);
        C0286kb c0286kb = C0178d1.f750;
        C0178d1.b.m841().mo850(enumC0164c1.f728, str2);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090("processName", str);
        f1203 = C0192e1.m846(EnumC0164c1.f1382);
        f1204 = C0192e1.m846(EnumC0164c1.f1383);
        f1871 = C0192e1.m846(EnumC0164c1.f1381);
        a.m1271(C0192e1.m847(EnumC0164c1.f1387));
        a.m1272(C0192e1.m847(EnumC0164c1.f1386));
        String str2 = C0283k8.f1632.f1562;
        C0237h4.m1089("UserShareOperateCls", str2);
        C0386s3.m1225(str2, C0283k8.f1632.f891, new Object[]{String.class}, new b());
        String str3 = C0283k8.f1632.f1564;
        C0237h4.m1089("UserShareCls", str3);
        String str4 = C0283k8.f1632.f1565;
        ClassLoader classLoader = C0292l3.f938;
        if (classLoader == null) {
            C0237h4.m1092("cl");
            throw null;
        }
        "<this>";
        "cl";
        "hooker";
        Class clsM1199 = C0373r3.m1199(str3, classLoader, 2);
        if (clsM1199 != null) {
            C0373r3.m1209(clsM1199, str4, new C0334o3());
        }
    }
}
