package p001;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p001.C0235h2;

/* JADX INFO: renamed from: ۟.k3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0278k3 implements Runnable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f903;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ InterfaceC0222g3 f904;

    public /* synthetic */ RunnableC0278k3(InterfaceC0222g3 interfaceC0222g3, int i) {
        this.f903 = i;
        this.f904 = interfaceC0222g3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v23, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v40, resolved type: ۟.p1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v16, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v19, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws InterruptedException {
        InterfaceC0222g3 interfaceC0222g3;
        InterfaceC0222g3 interfaceC0222g32;
        C0446wb c0446wb;
        switch (this.f903) {
            case 0:
                InterfaceC0222g3 interfaceC0222g33 = this.f904;
                C0237h4.m1090("$action", interfaceC0222g33);
                interfaceC0222g33.mo984(C0292l3.m893());
                break;
            case 1:
                InterfaceC0222g3 interfaceC0222g34 = this.f904;
                C0237h4.m1090("$callback", interfaceC0222g34);
                C0235h2.f823.getClass();
                String strM949 = C0415u6.m949(C0235h2.a.m862() + "config-26.json", null, 6);
                if ((strM949.length() > 0) != false) {
                    String str = C0134a.f671;
                    strM949 = C0272jb.m1099(C0134a.m799(strM949, "config0026666666"));
                }
                if (C0406ta.m942(strM949, "{")) {
                    if ((C0406ta.m942(strM949, "{")) == true) {
                        JSONObject jSONObject = new JSONObject(strM949);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("notice");
                        c0345p1 = jSONObjectOptJSONObject != null ? new C0345p1(Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("alway")), jSONObjectOptJSONObject.optString("title"), jSONObjectOptJSONObject.optString("intro"), Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("exit")), Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("show")), Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("f")), jSONObjectOptJSONObject.optString("url"), Integer.valueOf(jSONObjectOptJSONObject.optInt("time")), Integer.valueOf(jSONObjectOptJSONObject.optInt("v"))) : null;
                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("conf");
                        C0332o1 c0332o1 = jSONObjectOptJSONObject2 == null ? null : new C0332o1(Integer.valueOf(jSONObjectOptJSONObject2.optInt("bv")), Boolean.valueOf(jSONObjectOptJSONObject2.optBoolean("showReward")), Boolean.valueOf(jSONObjectOptJSONObject2.optBoolean("rewardOpen")), jSONObjectOptJSONObject2.optString("payUsedUrl"), jSONObjectOptJSONObject2.optString("usedUrl"), jSONObjectOptJSONObject2.optString("introUrl"), jSONObjectOptJSONObject2.optString("updateRecord"), jSONObjectOptJSONObject2.optString("rewardUrl"), jSONObjectOptJSONObject2.optString("checkUrl"), jSONObjectOptJSONObject2.optString("tg"), jSONObjectOptJSONObject2.optString("qqGroup"), jSONObjectOptJSONObject2.optString("dc"), jSONObjectOptJSONObject2.optString("mainTip"), jSONObjectOptJSONObject2.optString("rewardTip"), jSONObjectOptJSONObject2.optString("oldTip"), jSONObjectOptJSONObject2.optString("normalTip"));
                        String strOptString = jSONObject.optString("appText");
                        Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean("showMp"));
                        Integer numValueOf = Integer.valueOf(jSONObject.optInt("status"));
                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("update");
                        if (jSONObjectOptJSONObject3 == null) {
                            interfaceC0222g32 = interfaceC0222g34;
                            c0446wb = null;
                        } else {
                            boolean zOptBoolean = jSONObjectOptJSONObject3.optBoolean("u");
                            boolean zOptBoolean2 = jSONObjectOptJSONObject3.optBoolean("f");
                            String strOptString2 = jSONObjectOptJSONObject3.optString("vn");
                            C0237h4.m1089("optString(...)", strOptString2);
                            int iOptInt = jSONObjectOptJSONObject3.optInt("vc");
                            String strOptString3 = jSONObjectOptJSONObject3.optString("du");
                            C0237h4.m1089("optString(...)", strOptString3);
                            String strOptString4 = jSONObjectOptJSONObject3.optString("dt");
                            C0237h4.m1089("optString(...)", strOptString4);
                            String strOptString5 = jSONObjectOptJSONObject3.optString("title");
                            C0237h4.m1089("optString(...)", strOptString5);
                            String strOptString6 = jSONObjectOptJSONObject3.optString("intro");
                            interfaceC0222g32 = interfaceC0222g34;
                            C0237h4.m1089("optString(...)", strOptString6);
                            c0446wb = new C0446wb(zOptBoolean, zOptBoolean2, strOptString2, iOptInt, strOptString3, strOptString4, strOptString5, strOptString6, jSONObjectOptJSONObject3.optInt("time"), Boolean.valueOf(jSONObjectOptJSONObject3.optBoolean("rp")));
                        }
                        c0345p1 = new C0336o5(c0345p1, c0332o1, strOptString, boolValueOf, numValueOf, c0446wb);
                        interfaceC0222g3 = interfaceC0222g32;
                    } else {
                        interfaceC0222g3 = interfaceC0222g34;
                    }
                }
                interfaceC0222g3.mo984(c0345p1);
                break;
            default:
                InterfaceC0222g3 interfaceC0222g35 = this.f904;
                C0237h4.m1090("$callback", interfaceC0222g35);
                Thread.sleep(2000L);
                C0235h2.f823.getClass();
                C0135a0 c0135a0 = null;
                ArrayList arrayList = null;
                c0135a0 = null;
                String strM9492 = C0415u6.m949(C0235h2.a.m862() + "bul.json", null, 6);
                "encryptJson";
                if ((strM9492.length() > 0) != false) {
                    String str2 = C0134a.f671;
                    String strM1099 = C0272jb.m1099(C0134a.m799(strM9492, "6666666ban666666"));
                    if (C0406ta.m942(strM1099, "{")) {
                        JSONObject jSONObject2 = new JSONObject(strM1099);
                        Integer numValueOf2 = Integer.valueOf(jSONObject2.optInt("all"));
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("list");
                        if (jSONArrayOptJSONArray != null) {
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                arrayList.add(jSONArrayOptJSONArray.getString(i));
                            }
                        }
                        c0135a0 = new C0135a0(numValueOf2, arrayList);
                    }
                }
                interfaceC0222g35.mo984(c0135a0);
                break;
        }
    }
}
