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
                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0341oa.m915(new byte[]{102, -48, 45, -58}, new byte[]{19, -93, 72, -76, 109, -77}));
                                    String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-2, 64, -83, -68, 11, 7, -3, 76}, new byte[]{-112, 41, -50, -41, 101, 102})) : null;
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
                                        String strOptString2 = jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{87, -125, 25, -115, 36, -40, 64}, new byte[]{52, -20, 119, -7, 65, -74}));
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
                                    String strOptString3 = jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{120, -70, 28, -61, -82, 88, 111}, new byte[]{27, -43, 114, -73, -53, 54}));
                                    if (strOptString3 == null) {
                                        strOptString3 = "";
                                    }
                                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0341oa.m915(new byte[]{-124, 68, -34, -84, 53, -89, -105, 67}, new byte[]{-27, 48, -127, -39, 70, -62}));
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
                                                            String strOptString4 = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{66, -81, -38, 35, -49, 14}, new byte[]{55, -36, -65, 81, -90, 106}));
                                                            if (!C0237h4.m864(C0463y2.f1874, strOptString4)) {
                                                                byte[] bArr = new byte[i3];
                                                                // fill-array-data instruction
                                                                bArr[0] = 16;
                                                                bArr[1] = -45;
                                                                bArr[2] = -82;
                                                                bArr[3] = 109;
                                                                bArr[4] = 23;
                                                                bArr[5] = -90;
                                                                bArr[6] = 19;
                                                                bArr[7] = -33;
                                                                arrayList.add(new C0364q7(strOptString4, jSONObjectOptJSONObject3.optString(C0341oa.m915(bArr, new byte[]{126, -70, -51, 6, 121, -57}))));
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
                                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0341oa.m915(new byte[]{-91, -61, -22, -51, 57, 43, -69, -37, -19, -4, 46, 55}, new byte[]{-42, -74, -120, -110, 90, 68}));
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
            C0237h4.m1090(C0341oa.m915(new byte[]{74, 19, -113, -10, -39}, new byte[]{60, 114, -29, -125, -68, -93}), str);
            if (str.length() > 0) {
                int i = C0330o.f1000;
                str = C0330o.m1165(str);
            }
            C0463y2.f1872 = str;
        }

        /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
        public static void m1272(String str) {
            C0237h4.m1090(C0341oa.m915(new byte[]{-79, 27, 126, -1, -115}, new byte[]{-57, 122, 18, -118, -24, -53}), str);
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
            C0237h4.m1090(C0341oa.m915(new byte[]{-79, -40}, new byte[]{-40, -84, 126, -16, -120, 18}), methodHookParam2);
            boolean z = C0463y2.f1203;
            if (a.m966()) {
                if (C0237h4.m864(methodHookParam2.args[0], C0341oa.m915(new byte[]{-120, -46, -24, 5, 109, 98, -103, -46, -25, 4, 119, 102, -103, -33, -3}, new byte[]{-36, -117, -72, 64, 50, 42}))) {
                    Object obj = methodHookParam2.thisObject;
                    C0237h4.m1089(C0341oa.m915(new byte[]{-51, 24, -33, -111, 8, -101, -45, 21, -43, -106}, new byte[]{-71, 112, -74, -30, 71, -7}), obj);
                    C0274k c0274k = C0283k8.f1632;
                    Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1563);
                    if (objM1203 == null || (str = (String) C0373r3.m1204(objM1203, C0341oa.m915(new byte[]{28, 19, 82, -5, 116, 110, 31, 31}, new byte[]{114, 122, 49, -112, 26, 15}))) == null) {
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
                        C0330o.m1173(0, C0341oa.m915(new byte[]{-81, 44, 105, -10, 106, -16, -94, 49, 112, -11, 91, -12, -81, 42, 70, -5, 84, -11, -91, 50, 123, -5, 110, -25, -81, 1, 97, -12, 116, -8, -84, 6, 64, -10, 112, -35, -82, 54, 77, -12, 73, -22}, new byte[]{74, -114, -9, 19, -32, 80}));
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
            C0237h4.m1090(C0341oa.m915(new byte[]{-88, -65}, new byte[]{-63, -53, -24, 19, 60, -97}), methodHookParam2);
            boolean z = C0463y2.f1203;
            if (a.m966()) {
                C0274k c0274k = C0283k8.f1632;
                String str = C0283k8.a.m885().f1566;
                C0237h4.m1089(C0341oa.m915(new byte[]{77, -113, 97, 69, 103, -6, 106, -126, 109, 127, 103, -33, 110, -126, 114, 116, 110, -64}, new byte[]{30, -25, 0, 55, 2, -77}), str);
                Object objM1197 = C0373r3.m1197(str, C0283k8.a.m885().f1567, new Object[]{C0341oa.m915(new byte[]{-19, 2, 8, 26, -114, -44, -4, 2, 7, 27, -108, -48, -4, 15, 29}, new byte[]{-71, 91, 88, 95, -47, -100}), C0341oa.m915(new byte[]{57, 28, 2, 117, -99, -56, 59, 33, 39, 123, -128, -2}, new byte[]{-34, -112, -88, -109, 20, 67}), "", ""});
                if (objM1197 != null) {
                    Object result = methodHookParam2.getResult();
                    C0237h4.m1088(C0341oa.m915(new byte[]{-13, -16, 108, 25, -90, -85, -4, -21, 110, 26, -14, -24, -1, -32, 32, 22, -25, -69, -23, -91, 116, 26, -90, -90, -14, -21, 45, 27, -13, -92, -15, -91, 116, 12, -10, -83, -67, -18, 111, 1, -22, -95, -13, -85, 99, 26, -22, -92, -8, -26, 116, 28, -23, -90, -18, -85, 77, 0, -14, -87, -1, -23, 101, 57, -17, -69, -23, -71, 107, 26, -14, -92, -12, -21, 46, 52, -24, -79, -93}, new byte[]{-99, -123, 0, 117, -122, -56}), result);
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
            String strOptString = jSONObjectM905 != null ? jSONObjectM905.optString(C0341oa.m915(new byte[]{40, 58, 42, 46, 94, -51}, new byte[]{93, 73, 79, 92, 55, -87})) : null;
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
            C0341oa.m915(new byte[]{15, 103, 13, -3, -124, 84, 0, 125, 18, -2, -125, 117, 2, 121, 55, -3, -81, 115, 15, 93, 31, -9, -73, 88}, new byte[]{-25, -23, -70, 24, 11, -62});
            int i2 = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{24, 4, 21, 26, -50, -118, 23, 30, 10, 25, -55, -85, 21, 26, 47, 26, -27, -83, 24, 62, 7}, new byte[]{-16, -118, -94, -1, 65, 28}));
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
                String string = C0372r2.m924(C0341oa.m915(new byte[]{52, -49, 30, 38, -118, 108, 58, -24, 12, 36, -87, 118, 57, -4, 19, 41, -95, 67, 58, -37, 31, 36, -106, 83, 52, -63, 19, 37, -90, 105, 51, -36, 33}, new byte[]{-36, 96, -69, -63, 30, -60}), str).toString();
                C0237h4.m1089(C0341oa.m915(new byte[]{-121, -127, 85, -92, 108, 82, -99, -119, 46, -2, 48, 21, -38}, new byte[]{-13, -18, 6, -48, 30, 59}), string);
                C0330o.m1173(1, string);
                return strM847;
            }
        }
        if (strM847.length() > 0) {
            strM847 = strM847 + "|";
        }
        String str2 = strM847 + str;
        int i4 = C0330o.f1000;
        StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{-111, -54, 12, -121, 91, -10, -100, -41, 21, -124, 106, -14, 78, 72}, new byte[]{116, 104, -110, 98, -47, 86}), str);
        sbM924.append(C0341oa.m915(new byte[]{42, 47, -2, -45, -110, -37, 44, 20, -1, -45, -121, -7, 32, 30, -63, -45, -97, -19, 34, 7, -19, -48, -126, -34}, new byte[]{-59, -109, 114, 54, 23, 86}));
        String string2 = sbM924.toString();
        C0237h4.m1089(C0341oa.m915(new byte[]{-69, -78, 97, 8, -87, 71, -95, -70, 26, 82, -11, 0, -26}, new byte[]{-49, -35, 50, 124, -37, 46}), string2);
        C0330o.m1173(1, string2);
        C0286kb c0286kb = C0178d1.f750;
        C0178d1.b.m841().mo850(enumC0164c1.f728, str2);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-118, 27, -50, -81, 5, 91, -119, 39, -64, -95, 5}, new byte[]{-6, 105, -95, -52, 96, 40}), str);
        f1203 = C0192e1.m846(EnumC0164c1.f1382);
        f1204 = C0192e1.m846(EnumC0164c1.f1383);
        f1871 = C0192e1.m846(EnumC0164c1.f1381);
        a.m1271(C0192e1.m847(EnumC0164c1.f1387));
        a.m1272(C0192e1.m847(EnumC0164c1.f1386));
        String str2 = C0283k8.f1632.f1562;
        C0237h4.m1089(C0341oa.m915(new byte[]{-72, 33, 71, 73, -56, -60, -116, 32, 71, 116, -21, -55, -97, 51, 86, 94, -40, -64, -98}, new byte[]{-19, 82, 34, 59, -101, -84}), str2);
        C0386s3.m1225(str2, C0283k8.f1632.f891, new Object[]{String.class}, new b());
        String str3 = C0283k8.f1632.f1564;
        C0237h4.m1089(C0341oa.m915(new byte[]{-65, -80, -72, -25, -109, 95, -117, -79, -72, -42, -84, 68}, new byte[]{-22, -61, -35, -107, -64, 55}), str3);
        String str4 = C0283k8.f1632.f1565;
        ClassLoader classLoader = C0292l3.f938;
        if (classLoader == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-78, 10}, new byte[]{-47, 102, 55, 90, 4, -54}));
            throw null;
        }
        C0341oa.m915(new byte[]{-54, -64, -126, 17, -120, -108}, new byte[]{-10, -76, -22, 120, -5, -86});
        C0341oa.m915(new byte[]{-57, -13}, new byte[]{-92, -97, -85, 6, -59, -40});
        C0341oa.m915(new byte[]{3, 112, 121, -48, -20, 74}, new byte[]{107, 31, 22, -69, -119, 56});
        Class clsM1199 = C0373r3.m1199(str3, classLoader, 2);
        if (clsM1199 != null) {
            C0373r3.m1209(clsM1199, str4, new C0334o3());
        }
    }
}
