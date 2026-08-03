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
        C0237h4.m1090("it", jSONObject2);
        C0211f6 c0211f6 = this.f1027;
        c0211f6.getClass();
        "json";
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("items") : null;
        if (jSONArrayOptJSONArray != null) {
            int i = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray)) {
                for (int iM1169 = C0330o.m1169(jSONArrayOptJSONArray); -1 < iM1169; iM1169--) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject3 != null) {
                        String strOptString = jSONObjectOptJSONObject3.optString("model_type");
                        if (!C0237h4.m864(strOptString, "ads")) {
                            if (c0211f6.f1451) {
                                C0237h4.m865(strOptString);
                                if (C0432va.m1253(strOptString, "live")) {
                                    jSONArrayOptJSONArray.remove(iM1169);
                                } else {
                                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("note");
                                    if (c0211f6.f1452) {
                                        int i2 = C0330o.f1000;
                                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONArray("note_attributes") : null;
                                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                            int length = jSONArrayOptJSONArray2.length();
                                            for (int i3 = 0; i3 < length; i3++) {
                                                Object objOpt = jSONArrayOptJSONArray2.opt(i3);
                                                if (C0237h4.m864((objOpt == null || (string = objOpt.toString()) == null) ? "" : string, "goods")) {
                                                    break;
                                                }
                                            }
                                            if (C0463y2.f1203) {
                                            }
                                        } else if (C0463y2.f1203) {
                                            if (C0463y2.f1873.length() > 0) {
                                                String strOptString2 = (jSONObjectOptJSONObject4 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("user")) == null) ? null : jSONObjectOptJSONObject.optString("nickname");
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
                                                String strOptString3 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("title") : null;
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
