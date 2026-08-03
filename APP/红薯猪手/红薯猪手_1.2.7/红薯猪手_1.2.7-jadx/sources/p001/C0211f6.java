package p001;

import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.regex.Pattern;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001.C0463y2;

/* JADX INFO: renamed from: ۟.f6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211f6 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static ArrayList<C0250i3> f1445 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۠ */
    public static String f785 = "";

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static String f1446 = "";

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public boolean f1448;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public boolean f1452;

    /* JADX INFO: renamed from: ۥ */
    public boolean f786 = true;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f787 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1447 = true;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f1449 = true;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public boolean f1450 = true;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f1451 = true;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public boolean f1453 = true;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public boolean f1454 = true;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public boolean f1455 = true;

    /* JADX INFO: renamed from: ۟.f6$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static void m853(String str) {
            C0341oa.m915(new byte[]{-43, -18, 38, -79, -54, 16, -41}, new byte[]{-23, -99, 67, -59, -25, 47});
            C0211f6.f785 = str;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m854(String str) {
            C0341oa.m915(new byte[]{-18, -62, 110, -27, 92, -80, -20}, new byte[]{-46, -79, 11, -111, 113, -113});
            C0211f6.f1446 = str;
        }
    }

    /* JADX INFO: renamed from: ۟.f6$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            Object objM1203;
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{-21, -47}, new byte[]{-126, -91, -119, 73, -21, 27}), methodHookParam2);
            Object obj = methodHookParam2.args[0];
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList != null) {
                int i = C0330o.f1000;
                C0211f6 c0211f6 = C0211f6.this;
                if (arrayList.isEmpty() ^ true) {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        Object obj2 = arrayList.get(size);
                        if (!(obj2 != null ? C0237h4.m864(C0373r3.m1201(obj2, C0341oa.m915(new byte[]{-46, -65, -13, -64}, new byte[]{-69, -52, -78, -92, 19, -84})), Boolean.TRUE) : false)) {
                            if (!C0237h4.m864(obj2 != null ? obj2.getClass().getSimpleName() : null, C0341oa.m915(new byte[]{-59, -54, -101, -113, 16, -34, -21}, new byte[]{-124, -82, -24, -58, 126, -72}))) {
                                if (c0211f6.f1447) {
                                    String string = (obj2 == null || (objM1203 = C0373r3.m1203(obj2, C0341oa.m915(new byte[]{-45, 95, -30, -12, -46, 101, -57, 64, -29}, new byte[]{-66, 48, -122, -111, -66, 49}))) == null) ? null : objM1203.toString();
                                    if (string != null && C0406ta.m942(string, C0341oa.m915(new byte[]{-11, 78, -22, -13}, new byte[]{-103, 39, -100, -106, -110, -56}))) {
                                        arrayList.remove(size);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۟.f6$c */
    public static final class c extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
            C0211f6 c0211f6;
            InterfaceC0222g3 c0253i6;
            XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
            C0237h4.m1090(C0341oa.m915(new byte[]{-36, 69, 39, -27, -45}, new byte[]{-84, 36, 85, -124, -66, 8}), methodHookParam2);
            Object result = methodHookParam2.getResult();
            Response response = result instanceof Response ? (Response) result : null;
            Object obj = methodHookParam2.args[0];
            Interceptor.Chain chain = obj instanceof Interceptor.Chain ? (Interceptor.Chain) obj : null;
            Request request = chain != null ? chain.request() : null;
            String strValueOf = String.valueOf(request != null ? request.url() : null);
            if (response == null) {
                int i = C0224g5.f810;
                StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{110, 39, -117, -57, 64, -122, 110, 37, -66, -60, 69, -100, 111, 21, -117, -60, 83, -86, 108, 22, -94, -59, 100, -116, -92, -37, 106, 78, -9}, new byte[]{-120, -82, 24, 34, -51, 54}), strValueOf);
                sbM924.append(C0341oa.m915(new byte[]{-56, -21}, new byte[]{-28, -53, 85, 79, -14, 54}));
                Object result2 = methodHookParam2.getResult();
                sbM924.append(result2 != null ? result2.getClass() : null);
                String string = sbM924.toString();
                C0237h4.m1089(C0341oa.m915(new byte[]{125, 53, -106, 108, -92, 69, 103, 61, -19, 54, -8, 2, 32}, new byte[]{9, 90, -59, 24, -42, 44}), string);
                C0224g5.m856(string);
            } else {
                String strMethod = request != null ? request.method() : null;
                if (strMethod == null) {
                    strMethod = "";
                }
                if (C0237h4.m864(strMethod, C0341oa.m915(new byte[]{45, 124, 62}, new byte[]{106, 57, 106, -24, -98, -44}))) {
                    if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-58, -105, -15, 0, -4, -1, -53, -100, -93}, new byte[]{-82, -8, -100, 101, -102, -102}))) {
                        if (!C0211f6.this.f787) {
                            boolean z = C0463y2.f1203;
                            if (C0463y2.a.m966()) {
                            }
                            clsM1069 = C0211f6.m1069(c0211f6, response, c0253i6);
                            if (clsM1069 != null) {
                            }
                        }
                        c0211f6 = C0211f6.this;
                        c0253i6 = new C0281k6(c0211f6, strValueOf);
                        clsM1069 = C0211f6.m1069(c0211f6, response, c0253i6);
                        if (clsM1069 != null) {
                        }
                    } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-70, 70, 114, 61, 29, 23, -77, 76, 117, 99}, new byte[]{-42, 41, 17, 92, 113, 113}))) {
                        if (!C0211f6.this.f787) {
                            boolean z2 = C0463y2.f1203;
                            if (C0463y2.a.m966()) {
                            }
                            clsM1069 = C0211f6.m1069(c0211f6, response, c0253i6);
                            if (clsM1069 != null) {
                            }
                        }
                        c0211f6 = C0211f6.this;
                        c0253i6 = new C0295l6(c0211f6, strValueOf);
                        clsM1069 = C0211f6.m1069(c0211f6, response, c0253i6);
                        if (clsM1069 != null) {
                        }
                    } else {
                        if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-61, 99, -127, 74, 63, -4, -64, 109, -110, 74, 118, -16, -56, 104, -54}, new byte[]{-83, 12, -11, 47, 16, -107}))) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0309m6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-116, -102, -120, -75, 68, 2, -117, -111, -103, -65, 13, 17, -121, -111, -61}, new byte[]{-30, -11, -4, -48, 107, 116}))) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0323n6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-75, 72, -73, 59, -100, -63, -89, 78, -69, 45, -90, -116, -77, 83, -80, 58, -117}, new byte[]{-46, 61, -34, 95, -7, -18})) && C0211f6.this.f1449) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0337o6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-84, 94, -90, -84, 37, -18, -16, 85, -88, -86, 35, -11, -32}, new byte[]{-33, 59, -57, -34, 70, -122})) && C0211f6.this.f1450) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0350p6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-11, 90, -96, -110, 59, 71, -10, 93, -32, -112, 44, 7, -30, 91, -84, -108, 45, 71, -16, 29, -16}, new byte[]{-122, 46, -49, -32, 94, 104}))) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0363q6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-43, -89, -10, -97, 124, 114, -46, -84, -25, -107, 124, 119, -38, -66, -25, -59}, new byte[]{-69, -56, -126, -6, 83, 4}))) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0376r6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{100, -70, -22, 107, 88, -3, 123, -81, -24, 125, 72}, new byte[]{20, -37, -115, 14, 119, -109}))) {
                            boolean z3 = C0463y2.f1203;
                            if (C0463y2.a.m966()) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = C0389s6.f1080;
                            } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-86, 121, -53, -18, -83, 61, -16, 106, -57, -22, -70, 51, -32}, new byte[]{-33, 9, -81, -113, -39, 88})) && C0211f6.this.f1453) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = C0225g6.f811;
                            } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{87, 12, 40, 89, -18, 62, 123, 6, 62, 95, -3, 58, 71, 16, 116, 94, -5, 63, 69, 6, 51, 114, -24, 60, 74, 19, 50, 74}, new byte[]{36, 117, 91, 45, -117, 83})) && C0211f6.this.f786) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = C0239h6.f832;
                            } else if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{114, 9, 8, 7, 57, -64, 105, 28, 2, 74}, new byte[]{7, 122, 109, 117, 22, -87}))) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = new C0253i6(c0211f6);
                            } else {
                                if (C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{-85, 78, -103, -28, 19, 115, -86, 76, -128, -28, 82, 100, -22, 77, -124, -14, 72, 47}, new byte[]{-59, 33, -19, -127, 60, 16})) || C0432va.m1253(strValueOf, C0341oa.m915(new byte[]{108, 111, 66, 13, 106, -25, 109, 109, 91, 13, 43, -16, 45, 115, 67, 10, 26, -25, 109, 109, 91, 13, 43, -16, 113, 63}, new byte[]{2, 0, 54, 104, 69, -124}))) {
                                    boolean z4 = C0463y2.f1203;
                                    if (C0463y2.a.m1270() || C0463y2.a.m1269()) {
                                        c0211f6 = C0211f6.this;
                                        c0253i6 = C0267j6.f876;
                                    }
                                }
                                if (clsM1069 != null) {
                                    methodHookParam2.setResult(clsM1069);
                                }
                            }
                        }
                        clsM1069 = C0211f6.m1069(c0211f6, response, c0253i6);
                        if (clsM1069 != null) {
                        }
                    }
                }
            }
            return C0433vb.f1163;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final Response m1069(C0211f6 c0211f6, Response response, InterfaceC0222g3 interfaceC0222g3) {
        String strM915;
        c0211f6.getClass();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            String strString = responseBodyBody.string();
            C0237h4.m865(strString);
            if (C0406ta.m942(strString, C0341oa.m915(new byte[]{-106}, new byte[]{-19, -104, 110, 45, 88, -111}))) {
                Object objMo984 = interfaceC0222g3.mo984(new JSONObject(strString));
                if (objMo984 == null || (strM915 = objMo984.toString()) == null) {
                    strM915 = C0341oa.m915(new byte[]{5, -64}, new byte[]{126, -67, 115, -24, 24, -87});
                }
                return response.newBuilder().body(ResponseBody.create(responseBodyBody.contentType(), strM915)).build();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-30, -13, 5, 2, 113, 0, -31, -49, 11, 12, 113}, new byte[]{-110, -127, 106, 97, 20, 115}), str);
        this.f786 = C0192e1.m846(EnumC0164c1.f1362);
        this.f787 = C0192e1.m846(EnumC0164c1.f1363);
        this.f1447 = C0192e1.m846(EnumC0164c1.f1364);
        this.f1448 = C0192e1.m846(EnumC0164c1.f1365);
        this.f1450 = C0192e1.m846(EnumC0164c1.f1366);
        this.f1451 = C0192e1.m846(EnumC0164c1.f1367);
        this.f1452 = C0192e1.m846(EnumC0164c1.f1368);
        this.f1453 = C0192e1.m846(EnumC0164c1.f1378);
        this.f1454 = C0192e1.m846(EnumC0164c1.f1375);
        this.f1455 = C0192e1.m846(EnumC0164c1.f1384);
        this.f1449 = C0192e1.m846(EnumC0164c1.f1380);
        C0373r3.m1210(C0341oa.m915(new byte[]{82, -110, -49, -67, 106, 94, 95, -102, -53, -3, 60, 79, 89, -114, -116, -5, 125, 90, 84, -115, -61, -12, 119, 25, 84, -123, -46, -1, 125, 69, 84, -101, -57, -10, 118, 25, 92, -100, -53, -3, 116, 82, 84, -103, -116, -27, 123, 82, 70, -45, -25, -21, 98, 91, 94, -113, -57, -59, 123, 82, 70}, new byte[]{49, -3, -94, -109, 18, 55}), C0283k8.f1632.f1557, new Object[]{ArrayList.class}, new b());
        String str2 = C0283k8.f1632.f1556;
        C0237h4.m1089(C0341oa.m915(new byte[]{30, 93, -58, 71, 101, -65, 54, 124, -37, 123, 116, -71, 37, 80, -59, 123, 126, -71, 5, 89, -58}, new byte[]{70, 53, -75, 15, 17, -53}), str2);
        C0373r3.m1208(str2, C0341oa.m915(new byte[]{104, 44, 102, 44, 78, -123, 100, 50, 102}, new byte[]{1, 66, 18, 73, 60, -26}), new Object[]{C0373r3.m1199(C0341oa.m915(new byte[]{-35, -62, -124, 68, -63, 106, -127, -121, -91, 94, -63, 127, -64, -54, -119, 64, -63, 117, -64, -115, -81, 88, -44, 115, -36}, new byte[]{-78, -87, -20, 48, -75, 26}), null, 3)}, new c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a A[EDGE_INSN: B:102:0x019a->B:76:0x019a BREAK  A[LOOP:1: B:29:0x00c7->B:38:0x00ec]] */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1070(String str, JSONObject jSONObject, boolean z) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String str2;
        StringBuilder sbM1039;
        String str3;
        JSONArray jSONArrayOptJSONArray;
        String string;
        C0237h4.m1090(C0341oa.m915(new byte[]{56, 48, -60, 33, -54, 5}, new byte[]{74, 85, -75, 116, -72, 105}), str);
        C0237h4.m1090(C0341oa.m915(new byte[]{59, -54, 77, 40}, new byte[]{81, -71, 34, 70, -109, -102}), jSONObject);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C0341oa.m915(new byte[]{81, -13, -21, 4}, new byte[]{53, -110, -97, 101, 55, 22}));
        if (jSONArrayOptJSONArray2 != null) {
            int i = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray2)) {
                for (int iM1169 = C0330o.m1169(jSONArrayOptJSONArray2); -1 < iM1169; iM1169--) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject2 != null) {
                        if (jSONObjectOptJSONObject2.optJSONObject(C0341oa.m915(new byte[]{17, -32, -26, 127, 54, 54, 22, -21}, new byte[]{112, -124, -107, 32, 95, 88})) == null && (!this.f1447 || !C0237h4.m864(jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{79, -59, -14, -26}, new byte[]{59, -68, -126, -125, 12, 92})), C0341oa.m915(new byte[]{26, 127, -73, -92}, new byte[]{118, 22, -63, -63, -113, -62})))) {
                            if (!this.f1448 || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(C0341oa.m915(new byte[]{20, -53, -80, 112, 25, 22, 14, -48, -74, 124, 36, 2, 14, -63, -73}, new byte[]{122, -92, -60, 21, 70, 119}))) == null) {
                                if (C0463y2.f1203) {
                                    if (C0463y2.f1873.length() > 0) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C0341oa.m915(new byte[]{82, 42, 102, 42}, new byte[]{39, 89, 3, 88, 116, -105}));
                                        String strOptString = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{67, 71, 3, -6, 5, -23, 64, 75}, new byte[]{45, 46, 96, -111, 107, -120})) : null;
                                        if (strOptString == null) {
                                            strOptString = "";
                                        }
                                        if (strOptString.length() > 0) {
                                            String str4 = C0463y2.f1873;
                                            EnumC0417u8[] enumC0417u8Arr = EnumC0417u8.f1140;
                                            C0237h4.m1090("pattern", str4);
                                            Pattern patternCompile = Pattern.compile(str4, 66);
                                            C0237h4.m1089("compile(...)", patternCompile);
                                            if (!patternCompile.matcher(strOptString).find()) {
                                            }
                                            jSONArrayOptJSONArray2.remove(iM1169);
                                        }
                                    } else if (C0463y2.f1872.length() > 0) {
                                        String strOptString2 = jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-63, 45, 90, 122, 100}, new byte[]{-75, 68, 46, 22, 1, 21}));
                                        String str5 = strOptString2 != null ? strOptString2 : "";
                                        if (str5.length() > 0) {
                                            String str6 = C0463y2.f1872;
                                            EnumC0417u8[] enumC0417u8Arr2 = EnumC0417u8.f1140;
                                            C0237h4.m1090("pattern", str6);
                                            Pattern patternCompile2 = Pattern.compile(str6, 66);
                                            C0237h4.m1089("compile(...)", patternCompile2);
                                            if (patternCompile2.matcher(str5).find()) {
                                                jSONArrayOptJSONArray2.remove(iM1169);
                                            }
                                        }
                                    }
                                }
                                if (!C0327na.f999 && z && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(C0341oa.m915(new byte[]{91, -44, 43, 68}, new byte[]{46, -89, 78, 54, 62, -117}))) != null) {
                                    String strOptString3 = jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{1, 87, -10, 48, 122, -82}, new byte[]{104, 58, -105, 87, 31, -35}));
                                    C0237h4.m865(strOptString3);
                                    if (strOptString3.length() > 0) {
                                        String strOptString4 = jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{-57, -10, -23, 16, 11, 73}, new byte[]{-78, -123, -116, 98, 98, 45}));
                                        if (C0432va.m1253(strOptString3, C0341oa.m915(new byte[]{62}, new byte[]{1, -72, -9, 116, 59, 125}))) {
                                            str2 = C0327na.f998;
                                            sbM1039 = C0167c4.m1039(strOptString3);
                                            str3 = "&";
                                        } else {
                                            str2 = C0327na.f998;
                                            sbM1039 = C0167c4.m1039(strOptString3);
                                            str3 = "?";
                                        }
                                        sbM1039.append(str3);
                                        sbM1039.append(str2);
                                        sbM1039.append("=");
                                        sbM1039.append(strOptString4);
                                        jSONObjectOptJSONObject.put(C0341oa.m915(new byte[]{-1, 62, -95, 123, -72, -108}, new byte[]{-106, 83, -64, 28, -35, -25}), sbM1039.toString());
                                    }
                                }
                            } else {
                                int i2 = C0330o.f1000;
                                if (jSONArrayOptJSONArray.length() > 0) {
                                    int length = jSONArrayOptJSONArray.length();
                                    for (int i3 = 0; i3 < length; i3++) {
                                        Object objOpt = jSONArrayOptJSONArray.opt(i3);
                                        if (objOpt == null || (string = objOpt.toString()) == null) {
                                            string = "";
                                        }
                                        if (C0237h4.m864(string, C0341oa.m915(new byte[]{-52, -124, -12, -83, -70}, new byte[]{-85, -21, -101, -55, -55, 118}))) {
                                            break;
                                        }
                                    }
                                    if (C0463y2.f1203) {
                                    }
                                    if (!C0327na.f999) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
