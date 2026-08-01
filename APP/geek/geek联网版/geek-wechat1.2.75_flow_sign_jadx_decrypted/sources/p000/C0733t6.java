package p000;

import android.database.Cursor;
import android.graphics.Color;
import com.github.megatronking.stringfog.Base64;
import de.robv.android.xposed.XposedHelpers;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0733t6 extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public final int f4418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C0733t6(p000.InterfaceC0814vd r4, int r5) {
        /*
            r3 = this;
            r3.f4418e = r5
            r3.<init>(r4)
            r0 = 0
            java.lang.String r1 = "ۣۡۧ"
            int r2 = com.google.android.material.carousel.C1027.m3021(r1)
            r1 = r0
        Ld:
            switch(r2) {
                case 1748861: goto L11;
                case 1749609: goto L80;
                case 1750565: goto L42;
                case 1750660: goto L5e;
                case 1750811: goto L1f;
                case 1754657: goto L75;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            int r0 = androidx.coordinatorlayout.widget.C1003.m2923()
            if (r0 < 0) goto L5e
            java.lang.String r0 = "ۣۨ۠"
        L19:
            int r0 = com.google.android.material.snackbar.C1040.m3072(r0)
            r2 = r0
            goto Ld
        L1f:
            java.lang.String r0 = "jUF0hXSA5"
            java.lang.String r0 = kotlinx.coroutines.C1056.m3135(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            int r1 = com.google.android.material.datepicker.C1032.m3040()
            if (r1 < 0) goto L37
            java.lang.String r1 = "ۣۨ۠"
            int r2 = com.google.android.material.sidesheet.C1039.m3067(r1)
            r1 = r0
            goto Ld
        L37:
            int r1 = androidx.legacy.content.C1012.f5659
            int r2 = androidx.legacy.content.C1013.f5660
            r1 = r1 | r2
            r2 = 1750214(0x1ab4c6, float:2.452572E-39)
            int r2 = r2 + r1
            r1 = r0
            goto Ld
        L42:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.datepicker.C1033.m3045()
            if (r0 < 0) goto L53
            androidx.appcompat.view.menu.C0998.m2903()
            java.lang.String r0 = "ۣۣۤ"
            goto L19
        L53:
            int r0 = androidx.appcompat.app.C0997.f5644
            int r2 = com.google.android.material.button.C1025.f5672
            r0 = r0 ^ r2
            r2 = 1748849(0x1aaf71, float:2.45066E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L5e:
            int r0 = androidx.activity.result.C0994.f5641
            if (r0 > 0) goto L6d
            androidx.legacy.content.C1012.m2958()
            java.lang.String r0 = "ۡۢۥ"
            int r0 = androidx.activity.C0996.m2894(r0)
            r2 = r0
            goto Ld
        L6d:
            java.lang.String r0 = "ۢ۠ۧ"
            int r0 = android.app.C0986.m2856(r0)
            r2 = r0
            goto Ld
        L75:
            int r0 = androidx.core.widget.C1011.f5658
            int r2 = androidx.legacy.content.C1013.f5660
            int r0 = r0 / r2
            r2 = 1748862(0x1aaf7e, float:2.450678E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0733t6.<init>(vd, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051 A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.InterfaceC0814vd mo35a(p000.InterfaceC0814vd r3) {
        /*
            r2 = this;
            java.lang.String r0 = "۠ۦۣ"
            int r0 = androidx.core.content.C1008.m2944(r0)
        L6:
            switch(r0) {
                case 1746726: goto La;
                case 1747869: goto L22;
                case 1750656: goto L27;
                case 1751683: goto L18;
                case 1751778: goto L54;
                case 1754377: goto L32;
                case 1754379: goto L5e;
                case 1755438: goto L43;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.ljx.wechatmod.p001ui.C1050.f5697
            if (r0 > 0) goto L3c
            com.google.android.material.transformation.C1045.m3091()
            java.lang.String r0 = "ۨۦۤ"
        L13:
            int r0 = com.google.android.material.datepicker.C1034.m3046(r0)
            goto L6
        L18:
            t6 r0 = new t6
            int r1 = androidx.core.content.C1006.f5653
            r1 = r1 ^ (-79)
            r0.<init>(r3, r1)
        L21:
            return r0
        L22:
            int r0 = r2.f4418e
            switch(r0) {
                case 0: goto L43;
                case 1: goto L54;
                default: goto L27;
            }
        L27:
            int r0 = androidx.coordinatorlayout.widget.C1002.f5649
            if (r0 < 0) goto L39
            java.lang.String r0 = "ۥۥۦ"
        L2d:
            int r0 = androidx.activity.result.C0993.m2885(r0)
            goto L6
        L32:
            t6 r0 = new t6
            r1 = 1
            r0.<init>(r3, r1)
            goto L21
        L39:
            java.lang.String r0 = "ۤۥۤ"
            goto L2d
        L3c:
            java.lang.String r0 = "۠ۦۣ"
            int r0 = io.fastkv.C1052.m3118(r0)
            goto L6
        L43:
            int r0 = com.google.android.material.textfield.C1041.f5688
            if (r0 > 0) goto L51
            com.github.megatronking.stringfog.annotation.C1017.m2979()
            java.lang.String r0 = "۟ۦۧ"
            int r0 = com.google.android.material.button.C1025.m3011(r0)
            goto L6
        L51:
            java.lang.String r0 = "ۣۧ۟"
            goto L13
        L54:
            int r0 = android.window.C0989.f5636
            int r1 = com.google.android.material.floatingactionbutton.C1037.f5684
            int r0 = r0 - r1
            r1 = 1754132(0x1ac414, float:2.458062E-39)
            r0 = r0 ^ r1
            goto L6
        L5e:
            t6 r0 = new t6
            r1 = 0
            r0.<init>(r3, r1)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0733t6.mo35a(vd):vd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00d5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1 A[SYNTHETIC] */
    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo36e(java.lang.Object r8, java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0733t6.mo36e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v100, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v94, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Throwable] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    public final Object mo37g(Object obj) throws Throwable {
        JSONObject jSONObject;
        int color;
        int color2;
        String strM492a;
        Object objCallMethod;
        switch (this.f4418e) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0274gu.m1307M(obj);
                C0770u6 c0770u6 = C0770u6.f4638a;
                c0770u6.getClass();
                if (AbstractC0493mp.m1853c(C0770u6.f4644g, "UNKNOWN_WXID") || C0770u6.f4644g.length() == 0) {
                    return new Integer(-2);
                }
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0770u6.f4642e = jCurrentTimeMillis;
                    String string = UUID.randomUUID().toString();
                    AbstractC0493mp.m1856f("toString(...)", string);
                    String strM1466I = i50.m1466I(string, "-", "");
                    String str = C0770u6.f4644g;
                    int i = C0770u6.f4640c;
                    String strM2439a = C0770u6.m2439a(c0770u6, str + jCurrentTimeMillis + i + strM1466I + "GeekMod_Secret_V4_New");
                    String strEncode = URLEncoder.encode(C0770u6.f4644g, "UTF-8");
                    URLConnection uRLConnectionOpenConnection = new URL("https://geek123.asia/verify" + "?wxid=" + strEncode + "&ts=" + jCurrentTimeMillis + "&ver=" + i + "&nonce=" + strM1466I + "&sign=" + strM2439a).openConnection();
                    AbstractC0493mp.m1855e("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(15000);
                    httpURLConnection.setRequestProperty("User-Agent", "GeekMod-Auth-Client/5.5");
                    httpURLConnection.setRequestProperty("Accept", "application/json");
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200 || responseCode == 403 || responseCode == 426 || responseCode == 503) {
                        InputStream errorStream = responseCode >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                        try {
                            jSONObject = new JSONObject(errorStream != null ? AbstractC0498mu.m1882D(new BufferedReader(new InputStreamReader(errorStream, AbstractC0514n9.f3251a), 8192)) : "{}");
                            break;
                        } catch (Exception e) {
                            jSONObject = new JSONObject("{}");
                        }
                        String strOptString = jSONObject.optString("data", "");
                        String strOptString2 = jSONObject.optString("sign", "");
                        AbstractC0493mp.m1854d(strOptString);
                        if (strOptString.length() != 0) {
                            AbstractC0493mp.m1854d(strOptString2);
                            if (strOptString2.length() != 0 && C0770u6.m2440b(C0770u6.f4638a, strOptString, strOptString2)) {
                                JSONObject jSONObject2 = new JSONObject(strOptString);
                                if (!AbstractC0493mp.m1853c(jSONObject2.optString("nonce", ""), strM1466I)) {
                                    C0770u6.m2443e("auth_token", "");
                                    return new Integer(0);
                                }
                                int iOptInt = jSONObject2.optInt("status", -1);
                                C0770u6.f4641d = jSONObject2.optString("msg", "");
                                if (iOptInt != 200 || !jSONObject2.optBoolean("verified", false)) {
                                    C0770u6.m2443e("auth_token", "");
                                    return new Integer(iOptInt != 426 ? iOptInt != 503 ? 0 : 3 : 2);
                                }
                                String strOptString3 = jSONObject2.optString("kp", "");
                                AbstractC0493mp.m1854d(strOptString3);
                                if (strOptString3.length() > 0) {
                                    C0770u6.m2443e("kp", strOptString3);
                                }
                                try {
                                    ConcurrentHashMap concurrentHashMap = AbstractC0218fb.f1785a;
                                    C0417kn.f2847a.getClass();
                                    g80.m1206u(C0417kn.f2855i, AbstractC0929yg.f5431b, new C0733t6(null, 1), 2);
                                    break;
                                } catch (Throwable th) {
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                C0770u6.f4638a.getClass();
                                C0770u6.m2443e("auth_token", AbstractC0387ju.m1623k(C0770u6.f4644g + "|" + ((jCurrentTimeMillis2 - 5) + 86400000 + 5) + "|" + C0770u6.f4640c));
                                return new Integer(1);
                            }
                        }
                        C0770u6 c0770u62 = C0770u6.f4638a;
                        String strM492a2 = "auth_token";
                        c0770u62.getClass();
                        C0770u6.m2443e(strM492a2, "");
                        return new Integer(0);
                    }
                } catch (Exception e2) {
                    AbstractC0493mp.m1857g(g40.m1148k("ioxU\n", "/u0zZ+lqY9I=\n", "AuthEngine", "KFnE\n", "RSqjPIOV6WI=\n"), g40.m1155r("网络/内部异常: ", e2.getMessage()));
                }
                return new Integer(-1);
            case Base64.NO_PADDING /* 1 */:
                C0893xh c0893xh = C0893xh.f5258n;
                AbstractC0274gu.m1307M(obj);
                try {
                    URLConnection uRLConnectionOpenConnection2 = new URL("https://geek123.asia/api/v1/user_tags").openConnection();
                    AbstractC0493mp.m1855e("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection2);
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setConnectTimeout(5000);
                    if (httpURLConnection2.getResponseCode() == 200) {
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        AbstractC0493mp.m1856f("getInputStream(...)", inputStream);
                        JSONArray jSONArrayOptJSONArray = new JSONObject(AbstractC0498mu.m1882D(new BufferedReader(new InputStreamReader(inputStream, AbstractC0514n9.f3251a), 8192))).optJSONArray("data");
                        if (jSONArrayOptJSONArray != null) {
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i2 = 0; i2 < length; i2 = ((i2 + 2) + 1) - 2) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString4 = jSONObjectOptJSONObject.optString("wxid", "");
                                    AbstractC0493mp.m1854d(strOptString4);
                                    if (strOptString4.length() > 0) {
                                        String strOptString5 = jSONObjectOptJSONObject.optString("text", "Geek Pro");
                                        AbstractC0493mp.m1856f("optString(...)", strOptString5);
                                        try {
                                            try {
                                                color = Color.parseColor(jSONObjectOptJSONObject.optString("bg_color", "#E8F5E9"));
                                            } catch (Exception e3) {
                                                color = Color.parseColor("#E8F5E9");
                                            }
                                        } catch (Exception e4) {
                                        }
                                        try {
                                            color2 = Color.parseColor(jSONObjectOptJSONObject.optString("text_color", "#4CAF50"));
                                        } catch (Exception e5) {
                                            color2 = Color.parseColor("#4CAF50");
                                        }
                                        concurrentHashMap2.put(strOptString4, new C0181eb(strOptString5, color, color2, jSONObjectOptJSONObject.optBoolean("is_dynamic", false)));
                                        break;
                                    }
                                }
                            }
                            ConcurrentHashMap concurrentHashMap3 = AbstractC0218fb.f1785a;
                            concurrentHashMap3.clear();
                            concurrentHashMap3.putAll(concurrentHashMap2);
                            String strM492a3 = "CloudTagManager";
                            String str2 = "✅ 云端标签同步完成，共加载 " + concurrentHashMap3.size() + " 个尊享用户";
                            AbstractC0493mp.m1857g("tag", strM492a3);
                            AbstractC0493mp.m1857g("msg", str2);
                        }
                    }
                    break;
                } catch (Exception e6) {
                    AbstractC0493mp.m1857g(g40.m1148k("ioxU\n", "/u0zZ+lqY9I=\n", "CloudTagManager", "KFnE\n", "RSqjPIOV6WI=\n"), g40.m1155r("⚠️ 标签同步失败: ", e6.getMessage()));
                }
                return c0893xh;
            default:
                AbstractC0274gu.m1307M(obj);
                ArrayList arrayList = new ArrayList();
                if (AbstractC0083bw.f784b != null) {
                    try {
                        strM492a = ub0.f4689E0;
                    } catch (Throwable th2) {
                        strM492a = "rcontact";
                    }
                    Object objCallMethod2 = XposedHelpers.callMethod(AbstractC0083bw.f784b, "rawQuery", new Object[]{g40.m1147j("SELECT username, nickname, conRemark FROM ", strM492a, " WHERE (type & 2 != 0 OR username LIKE '%@chatroom') AND username NOT LIKE 'gh_%' AND username NOT LIKE '%@app' AND username != 'filehelper'"), null});
                    try {
                        if (objCallMethod2 != null) {
                            try {
                                if (objCallMethod2 instanceof Cursor) {
                                    while (((Cursor) objCallMethod2).moveToNext()) {
                                        String string2 = ((Cursor) objCallMethod2).getString(0);
                                        String string3 = ((Cursor) objCallMethod2).getString(1);
                                        if (string3 == null) {
                                            string3 = "";
                                        }
                                        String string4 = ((Cursor) objCallMethod2).getString(2);
                                        if (string4 == null) {
                                            string4 = "";
                                        }
                                        if (string4.length() <= 0) {
                                            string4 = string3;
                                        }
                                        AbstractC0493mp.m1854d(string2);
                                        if (string4.length() <= 0) {
                                            string4 = string2;
                                        }
                                        arrayList.add(new C0870wv(string2, string4, i50.m1458A(string2, "@chatroom") ? 1 : 0));
                                    }
                                } else {
                                    Object objCallMethod3 = XposedHelpers.callMethod(objCallMethod2, "moveToFirst", new Object[0]);
                                    AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.Boolean", objCallMethod3);
                                    if (((Boolean) objCallMethod3).booleanValue()) {
                                        do {
                                            Object objCallMethod4 = XposedHelpers.callMethod(objCallMethod2, "getString", new Object[]{new Integer(0)});
                                            String str3 = objCallMethod4 instanceof String ? (String) objCallMethod4 : null;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            Object objCallMethod5 = XposedHelpers.callMethod(objCallMethod2, "getString", new Object[]{new Integer(1)});
                                            String str4 = objCallMethod5 instanceof String ? (String) objCallMethod5 : null;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            Object objCallMethod6 = XposedHelpers.callMethod(objCallMethod2, "getString", new Object[]{new Integer(2)});
                                            String str5 = objCallMethod6 instanceof String ? (String) objCallMethod6 : null;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            if (str3.length() > 0) {
                                                if (str5.length() <= 0) {
                                                    str5 = str4;
                                                }
                                                if (str5.length() <= 0) {
                                                    str5 = str3;
                                                }
                                                arrayList.add(new C0870wv(str3, str5, i50.m1458A(str3, "@chatroom") ? 1 : 0));
                                            }
                                            objCallMethod = XposedHelpers.callMethod(objCallMethod2, "moveToNext", new Object[0]);
                                            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.Boolean", objCallMethod);
                                        } while (((Boolean) objCallMethod).booleanValue());
                                    }
                                }
                                XposedHelpers.callMethod(objCallMethod2, "close", new Object[0]);
                            } catch (Throwable th3) {
                                try {
                                    AbstractC0493mp.m1857g("tag", "MsgSender_ContactList");
                                    "e";
                                    XposedHelpers.callMethod(objCallMethod2, "close", new Object[0]);
                                } catch (Throwable th4) {
                                    try {
                                        XposedHelpers.callMethod(objCallMethod2, "close", new Object[0]);
                                        break;
                                    } catch (Throwable th5) {
                                    }
                                    throw th4;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                    }
                    break;
                }
                if (arrayList.isEmpty()) {
                    LinkedHashMap linkedHashMap = AbstractC0083bw.f785c;
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str6 = (String) entry.getKey();
                            String strSubstring = (String) entry.getValue();
                            if (i50.m1468K(strSubstring, "\u7fa4\u804a: ")) {
                                strSubstring = strSubstring.substring(4);
                                AbstractC0493mp.m1856f("substring(...)", strSubstring);
                            }
                            arrayList.add(new C0870wv(str6, strSubstring, i50.m1458A(str6, "@chatroom") ? 1 : 0));
                        }
                    }
                }
                return arrayList;
        }
    }
}
