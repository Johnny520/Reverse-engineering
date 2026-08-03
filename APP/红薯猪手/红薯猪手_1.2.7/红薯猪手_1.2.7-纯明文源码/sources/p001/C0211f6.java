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
            "<set-?>";
            C0211f6.f785 = str;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m854(String str) {
            "<set-?>";
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
            C0237h4.m1090("it", methodHookParam2);
            Object obj = methodHookParam2.args[0];
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList != null) {
                int i = C0330o.f1000;
                C0211f6 c0211f6 = C0211f6.this;
                if (arrayList.isEmpty() ^ true) {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        Object obj2 = arrayList.get(size);
                        if (!(obj2 != null ? C0237h4.m864(C0373r3.m1201(obj2, "isAd"), Boolean.TRUE) : false)) {
                            if (!C0237h4.m864(obj2 != null ? obj2.getClass().getSimpleName() : null, "AdsInfo")) {
                                if (c0211f6.f1447) {
                                    String string = (obj2 == null || (objM1203 = C0373r3.m1203(obj2, "modelType")) == null) ? null : objM1203.toString();
                                    if (string != null && C0406ta.m942(string, "live")) {
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
            C0237h4.m1090("param", methodHookParam2);
            Object result = methodHookParam2.getResult();
            Response response = result instanceof Response ? (Response) result : null;
            Object obj = methodHookParam2.args[0];
            Interceptor.Chain chain = obj instanceof Interceptor.Chain ? (Interceptor.Chain) obj : null;
            Request request = chain != null ? chain.request() : null;
            String strValueOf = String.valueOf(request != null ? request.url() : null);
            if (response == null) {
                int i = C0224g5.f810;
                StringBuilder sbM924 = C0372r2.m924("打印拦截结果为空,url:", strValueOf);
                sbM924.append(", ");
                Object result2 = methodHookParam2.getResult();
                sbM924.append(result2 != null ? result2.getClass() : null);
                String string = sbM924.toString();
                C0237h4.m1089("toString(...)", string);
                C0224g5.m856(string);
            } else {
                String strMethod = request != null ? request.method() : null;
                if (strMethod == null) {
                    strMethod = "";
                }
                if (C0237h4.m864(strMethod, "GET")) {
                    if (C0432va.m1253(strValueOf, "homefeed?")) {
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
                    } else if (C0432va.m1253(strValueOf, "localfeed?")) {
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
                        if (C0432va.m1253(strValueOf, "note/imagefeed?")) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0309m6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, "note/videofeed?")) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0323n6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, "guide/user_banner") && C0211f6.this.f1449) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0337o6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, "search/notes?") && C0211f6.this.f1450) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0350p6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, "store/ps/products/v3?")) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0363q6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, "note/video/save?")) {
                            c0211f6 = C0211f6.this;
                            c0253i6 = new C0376r6(c0211f6);
                        } else if (C0432va.m1253(strValueOf, "page/notes?")) {
                            boolean z3 = C0463y2.f1203;
                            if (C0463y2.a.m966()) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = C0389s6.f1080;
                            } else if (C0432va.m1253(strValueOf, "update/check?") && C0211f6.this.f1453) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = C0225g6.f811;
                            } else if (C0432va.m1253(strValueOf, "system_service/splash_config") && C0211f6.this.f786) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = C0239h6.f832;
                            } else if (C0432va.m1253(strValueOf, "user/info?")) {
                                c0211f6 = C0211f6.this;
                                c0253i6 = new C0253i6(c0211f6);
                            } else {
                                if (C0432va.m1253(strValueOf, "note/comment/list?") || C0432va.m1253(strValueOf, "note/comment/sub_comments?")) {
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
            if (C0406ta.m942(strString, "{")) {
                Object objMo984 = interfaceC0222g3.mo984(new JSONObject(strString));
                if (objMo984 == null || (strM915 = objMo984.toString()) == null) {
                    strM915 = "{}";
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
        C0237h4.m1090("processName", str);
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
        C0373r3.m1210("com.xingin.xhs.homepage.explorefeed.mainfeed.view.ExploreView", C0283k8.f1632.f1557, new Object[]{ArrayList.class}, new b());
        String str2 = C0283k8.f1632.f1556;
        C0237h4.m1089("XhsHttpInterceptorCls", str2);
        C0373r3.m1208(str2, "intercept", new Object[]{C0373r3.m1199("okhttp3.Interceptor$Chain", null, 3)}, new c());
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
        C0237h4.m1090("reqUrl", str);
        C0237h4.m1090("json", jSONObject);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray2 != null) {
            int i = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray2)) {
                for (int iM1169 = C0330o.m1169(jSONArrayOptJSONArray2); -1 < iM1169; iM1169--) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject2 != null) {
                        if (jSONObjectOptJSONObject2.optJSONObject("ads_info") == null && (!this.f1447 || !C0237h4.m864(jSONObjectOptJSONObject2.optString("type"), "live"))) {
                            if (!this.f1448 || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("note_attributes")) == null) {
                                if (C0463y2.f1203) {
                                    if (C0463y2.f1873.length() > 0) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("user");
                                        String strOptString = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("nickname") : null;
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
                                        String strOptString2 = jSONObjectOptJSONObject2.optString("title");
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
                                if (!C0327na.f999 && z && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("user")) != null) {
                                    String strOptString3 = jSONObjectOptJSONObject.optString("images");
                                    C0237h4.m865(strOptString3);
                                    if (strOptString3.length() > 0) {
                                        String strOptString4 = jSONObjectOptJSONObject.optString("userid");
                                        if (C0432va.m1253(strOptString3, "?")) {
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
                                        jSONObjectOptJSONObject.put("images", sbM1039.toString());
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
                                        if (C0237h4.m864(string, "goods")) {
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
