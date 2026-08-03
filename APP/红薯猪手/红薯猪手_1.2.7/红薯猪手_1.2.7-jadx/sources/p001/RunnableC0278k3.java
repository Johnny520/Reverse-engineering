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
                C0237h4.m1090(C0341oa.m915(new byte[]{111, 59, -72, -103, 19, -2, 37}, new byte[]{75, 90, -37, -19, 122, -111}), interfaceC0222g33);
                interfaceC0222g33.mo984(C0292l3.m893());
                break;
            case 1:
                InterfaceC0222g3 interfaceC0222g34 = this.f904;
                C0237h4.m1090(C0341oa.m915(new byte[]{-26, -3, 76, -112, 70, -117, -93, -3, 70}, new byte[]{-62, -98, 45, -4, 42, -23}), interfaceC0222g34);
                C0235h2.f823.getClass();
                String strM949 = C0415u6.m949(C0272jb.m1099(C0235h2.a.m862()) + "config-26.json", null, 6);
                if ((strM949.length() > 0) != false) {
                    String str = C0134a.f671;
                    strM949 = C0272jb.m1099(C0134a.m799(strM949, C0341oa.m915(new byte[]{62, -102, 97, 2, 30, -9, 109, -59, 61, 82, 65, -90, 107, -61, 57, 82}, new byte[]{93, -11, 15, 100, 119, -112})));
                }
                if (C0406ta.m942(strM949, C0341oa.m915(new byte[]{-28}, new byte[]{-97, 100, 105, 103, -10, 85}))) {
                    if ((C0406ta.m942(strM949, C0341oa.m915(new byte[]{-16}, new byte[]{-117, 76, -55, -55, -72, 19}))) == true) {
                        JSONObject jSONObject = new JSONObject(strM949);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0341oa.m915(new byte[]{0, -93, -88, 37, 16, -91}, new byte[]{110, -52, -36, 76, 115, -64}));
                        c0345p1 = jSONObjectOptJSONObject != null ? new C0345p1(Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(C0341oa.m915(new byte[]{-8, 63, 49, -73, 26}, new byte[]{-103, 83, 70, -42, 99, -48}))), jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{18, -120, -70, 100, 70}, new byte[]{102, -31, -50, 8, 35, -85})), jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{85, -32, -55, -57, 9}, new byte[]{60, -114, -67, -75, 102, -67})), Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(C0341oa.m915(new byte[]{-120, -71, 90, -78}, new byte[]{-19, -63, 51, -58, 0, -87}))), Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(C0341oa.m915(new byte[]{10, -77, 35, -113}, new byte[]{121, -37, 76, -8, 71, 13}))), Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(C0341oa.m915(new byte[]{-104}, new byte[]{-2, 88, 59, -19, -89, 96}))), jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{113, 95, 71}, new byte[]{4, 45, 43, -1, -76, 48})), Integer.valueOf(jSONObjectOptJSONObject.optInt(C0341oa.m915(new byte[]{114, -114, 95, -68}, new byte[]{6, -25, 50, -39, -19, 108}))), Integer.valueOf(jSONObjectOptJSONObject.optInt(C0341oa.m915(new byte[]{-120}, new byte[]{-2, 108, 40, 100, 43, -112})))) : null;
                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C0341oa.m915(new byte[]{100, 95, 46, -128}, new byte[]{7, 48, 64, -26, -22, 59}));
                        C0332o1 c0332o1 = jSONObjectOptJSONObject2 == null ? null : new C0332o1(Integer.valueOf(jSONObjectOptJSONObject2.optInt(C0341oa.m915(new byte[]{-117, 125}, new byte[]{-23, 11, 14, -1, 43, 68}))), Boolean.valueOf(jSONObjectOptJSONObject2.optBoolean(C0341oa.m915(new byte[]{63, -14, 118, 115, -42, 18, 59, -5, 107, 96}, new byte[]{76, -102, 25, 4, -124, 119}))), Boolean.valueOf(jSONObjectOptJSONObject2.optBoolean(C0341oa.m915(new byte[]{12, 122, -35, 54, 119, 66, 49, 111, -49, 57}, new byte[]{126, 31, -86, 87, 5, 38}))), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-105, -76, 82, -66, 93, 50, -125, -128, 89, -121}, new byte[]{-25, -43, 43, -21, 46, 87})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-2, 3, -91, 14, 5, 8, -25}, new byte[]{-117, 112, -64, 106, 80, 122})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-26, -112, 40, 40, -3, -73, -3, -110}, new byte[]{-113, -2, 92, 90, -110, -30})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{117, 14, 6, 121, -53, -13, 82, 27, 1, 119, -51, -14}, new byte[]{0, 126, 98, 24, -65, -106})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{91, 64, 81, -89, -114, -13, 124, 87, 74}, new byte[]{41, 37, 38, -58, -4, -105})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-56, 76, -32, 55, 118, 95, -39, 72}, new byte[]{-85, 36, -123, 84, 29, 10})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{60, 59}, new byte[]{72, 92, 84, 27, -86, 6})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-17, -70, 10, -14, -6, 103, -18}, new byte[]{-98, -53, 77, -128, -107, 18})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{73, -70}, new byte[]{45, -39, -78, -88, 100, 81})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{24, -125, 107, 106, -111, -71, 5}, new byte[]{117, -30, 2, 4, -59, -48})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{61, -48, 63, 7, 26, -115, 27, -36, 56}, new byte[]{79, -75, 72, 102, 104, -23})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-53, -77, 79, -78, 14, 28}, new byte[]{-92, -33, 43, -26, 103, 108})), jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{112, 68, -62, 19, -96, -15, 74, 66, -64}, new byte[]{30, 43, -80, 126, -63, -99})));
                        String strOptString = jSONObject.optString(C0341oa.m915(new byte[]{92, 61, -17, 30, -23, 84, 73}, new byte[]{61, 77, -97, 74, -116, 44}));
                        Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean(C0341oa.m915(new byte[]{11, 84, 21, 39, 98, 3}, new byte[]{120, 60, 122, 80, 47, 115})));
                        Integer numValueOf = Integer.valueOf(jSONObject.optInt(C0341oa.m915(new byte[]{8, -7, 13, -22, -19, -89}, new byte[]{123, -115, 108, -98, -104, -44})));
                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(C0341oa.m915(new byte[]{-96, -110, -110, -108, 81, -10}, new byte[]{-43, -30, -10, -11, 37, -109}));
                        if (jSONObjectOptJSONObject3 == null) {
                            interfaceC0222g32 = interfaceC0222g34;
                            c0446wb = null;
                        } else {
                            boolean zOptBoolean = jSONObjectOptJSONObject3.optBoolean(C0341oa.m915(new byte[]{64}, new byte[]{53, -15, -62, 52, 51, 92}));
                            boolean zOptBoolean2 = jSONObjectOptJSONObject3.optBoolean(C0341oa.m915(new byte[]{118}, new byte[]{16, 112, 7, 89, -50, -55}));
                            String strOptString2 = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-25, -82}, new byte[]{-111, -64, 44, -45, -86, 117}));
                            C0237h4.m1089(C0341oa.m915(new byte[]{-38, -74, 37, 92, -105, -97, -36, -88, 54, 39, -51, -61, -101, -17}, new byte[]{-75, -58, 81, 15, -29, -19}), strOptString2);
                            int iOptInt = jSONObjectOptJSONObject3.optInt(C0341oa.m915(new byte[]{93, -111}, new byte[]{43, -14, -125, -70, -78, -71}));
                            String strOptString3 = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-67, -106}, new byte[]{-39, -29, 24, 28, -13, 90}));
                            C0237h4.m1089(C0341oa.m915(new byte[]{61, -57, -16, -98, -91, 82, 59, -39, -29, -27, -1, 14, 124, -98}, new byte[]{82, -73, -124, -51, -47, 32}), strOptString3);
                            String strOptString4 = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-124, -51}, new byte[]{-32, -71, 124, -17, -21, 63}));
                            C0237h4.m1089(C0341oa.m915(new byte[]{84, 67, -40, 107, 119, 89, 82, 93, -53, 16, 45, 5, 21, 26}, new byte[]{59, 51, -84, 56, 3, 43}), strOptString4);
                            String strOptString5 = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-47, -94, -127, -57, -85}, new byte[]{-91, -53, -11, -85, -50, 31}));
                            C0237h4.m1089(C0341oa.m915(new byte[]{16, -8, -13, 60, 11, 72, 22, -26, -32, 71, 81, 20, 81, -95}, new byte[]{127, -120, -121, 111, 127, 58}), strOptString5);
                            String strOptString6 = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-68, 98, -17, -49, 71}, new byte[]{-43, 12, -101, -67, 40, 123}));
                            interfaceC0222g32 = interfaceC0222g34;
                            C0237h4.m1089(C0341oa.m915(new byte[]{-43, -2, -10, -117, -83, -55, -45, -32, -27, -16, -9, -107, -108, -89}, new byte[]{-70, -114, -126, -40, -39, -69}), strOptString6);
                            c0446wb = new C0446wb(zOptBoolean, zOptBoolean2, strOptString2, iOptInt, strOptString3, strOptString4, strOptString5, strOptString6, jSONObjectOptJSONObject3.optInt(C0341oa.m915(new byte[]{127, 24, 117, -120}, new byte[]{11, 113, 24, -19, 127, 25})), Boolean.valueOf(jSONObjectOptJSONObject3.optBoolean(C0341oa.m915(new byte[]{-110, 58}, new byte[]{-32, 74, -125, 99, -109, 26}))));
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
                C0237h4.m1090(C0341oa.m915(new byte[]{-112, -94, -124, -116, -47, 32, -43, -94, -114}, new byte[]{-76, -63, -27, -32, -67, 66}), interfaceC0222g35);
                Thread.sleep(2000L);
                C0235h2.f823.getClass();
                C0135a0 c0135a0 = null;
                ArrayList arrayList = null;
                c0135a0 = null;
                String strM9492 = C0415u6.m949(C0272jb.m1099(C0235h2.a.m862()) + "bul.json", null, 6);
                C0341oa.m915(new byte[]{41, 14, 35, -18, 41, -39, 56, 42, 51, -13, 62}, new byte[]{76, 96, 64, -100, 80, -87});
                if ((strM9492.length() > 0) != false) {
                    String str2 = C0134a.f671;
                    String strM1099 = C0272jb.m1099(C0134a.m799(strM9492, C0341oa.m915(new byte[]{-13, -45, 59, 87, 0, -97, -13, -121, 108, 15, 0, -97, -13, -45, 59, 87}, new byte[]{-59, -27, 13, 97, 54, -87})));
                    if (C0406ta.m942(strM1099, C0341oa.m915(new byte[]{-15}, new byte[]{-118, -117, 82, 97, -71, 58}))) {
                        JSONObject jSONObject2 = new JSONObject(strM1099);
                        Integer numValueOf2 = Integer.valueOf(jSONObject2.optInt(C0341oa.m915(new byte[]{22, 88, -1}, new byte[]{119, 52, -109, -107, 36, -85})));
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(C0341oa.m915(new byte[]{-101, 41, -103, 8}, new byte[]{-9, 64, -22, 124, 90, -10}));
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
