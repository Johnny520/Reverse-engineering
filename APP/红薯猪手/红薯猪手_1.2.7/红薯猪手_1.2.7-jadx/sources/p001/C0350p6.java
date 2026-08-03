package p001;

import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.p6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0350p6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0211f6 f1027;

    public C0350p6(C0211f6 c0211f6) {
        this.f1027 = c0211f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dc A[EDGE_INSN: B:99:0x01dc->B:88:0x01dc BREAK  A[LOOP:1: B:35:0x00f9->B:46:0x0122]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01df A[SYNTHETIC] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo984(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String string;
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090(C0341oa.m915(new byte[]{86, 85}, new byte[]{63, 33, 98, 27, -40, -78}), jSONObject2);
        C0211f6 c0211f6 = this.f1027;
        c0211f6.getClass();
        C0341oa.m915(new byte[]{-84, 119, 126, -55}, new byte[]{-58, 4, 17, -89, -61, 13});
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(C0341oa.m915(new byte[]{122, 70, -108, -118}, new byte[]{30, 39, -32, -21, 18, 87}));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray(C0341oa.m915(new byte[]{-52, -48, -115, -128, 29}, new byte[]{-91, -92, -24, -19, 110, -16})) : null;
        if (jSONArrayOptJSONArray != null) {
            int i = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray)) {
                for (int iM1169 = C0330o.m1169(jSONArrayOptJSONArray); -1 < iM1169; iM1169--) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject3 != null) {
                        String strOptString = jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-109, -56, -23, -109, 75, 57, -118, -34, -3, -109}, new byte[]{-2, -89, -115, -10, 39, 102}));
                        if (!C0237h4.m864(strOptString, C0341oa.m915(new byte[]{-89, -41, -76}, new byte[]{-58, -77, -57, -123, -86, 101}))) {
                            if (c0211f6.f1451) {
                                C0237h4.m865(strOptString);
                                if (C0432va.m1253(strOptString, C0341oa.m915(new byte[]{39, 111, 35, -58}, new byte[]{75, 6, 85, -93, -90, 65}))) {
                                    jSONArrayOptJSONArray.remove(iM1169);
                                } else {
                                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(C0341oa.m915(new byte[]{-75, -93, -1, -108}, new byte[]{-37, -52, -117, -15, 110, 43}));
                                    if (c0211f6.f1452) {
                                        int i2 = C0330o.f1000;
                                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONArray(C0341oa.m915(new byte[]{107, 90, -104, -48, -42, 112, 113, 65, -98, -36, -21, 100, 113, 80, -97}, new byte[]{5, 53, -20, -75, -119, 17})) : null;
                                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                            int length = jSONArrayOptJSONArray2.length();
                                            for (int i3 = 0; i3 < length; i3++) {
                                                Object objOpt = jSONArrayOptJSONArray2.opt(i3);
                                                if (C0237h4.m864((objOpt == null || (string = objOpt.toString()) == null) ? "" : string, C0341oa.m915(new byte[]{47, -31, 31, -1, 12}, new byte[]{72, -114, 112, -101, 127, 125}))) {
                                                    break;
                                                }
                                            }
                                            if (C0463y2.f1203) {
                                            }
                                        } else if (C0463y2.f1203) {
                                            if (C0463y2.f1873.length() > 0) {
                                                String strOptString2 = (jSONObjectOptJSONObject4 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject(C0341oa.m915(new byte[]{-112, 1, -101, -111}, new byte[]{-27, 114, -2, -29, -24, -127}))) == null) ? null : jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{97, 28, -123, 36, 0, -28, 98, 16}, new byte[]{15, 117, -26, 79, 110, -123}));
                                                if (strOptString2 == null) {
                                                    strOptString2 = "";
                                                }
                                                if (strOptString2.length() > 0) {
                                                    String str = C0463y2.f1873;
                                                    EnumC0417u8[] enumC0417u8Arr = EnumC0417u8.f1140;
                                                    C0237h4.m1090("pattern", str);
                                                    Pattern patternCompile = Pattern.compile(str, 66);
                                                    C0237h4.m1089("compile(...)", patternCompile);
                                                    if (patternCompile.matcher(strOptString2).find()) {
                                                        jSONArrayOptJSONArray.remove(iM1169);
                                                    }
                                                }
                                            }
                                            if (C0463y2.f1872.length() > 0) {
                                                String strOptString3 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString(C0341oa.m915(new byte[]{-81, 77, -77, -55, -32}, new byte[]{-37, 36, -57, -91, -123, 126})) : null;
                                                String str2 = strOptString3 != null ? strOptString3 : "";
                                                if (str2.length() > 0) {
                                                    String str3 = C0463y2.f1872;
                                                    EnumC0417u8[] enumC0417u8Arr2 = EnumC0417u8.f1140;
                                                    C0237h4.m1090("pattern", str3);
                                                    Pattern patternCompile2 = Pattern.compile(str3, 66);
                                                    C0237h4.m1089("compile(...)", patternCompile2);
                                                    if (patternCompile2.matcher(str2).find()) {
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
            }
        }
        return jSONObject2;
    }
}
