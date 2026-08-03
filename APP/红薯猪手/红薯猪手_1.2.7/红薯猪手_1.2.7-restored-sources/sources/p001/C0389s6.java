package p001;

import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.s6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0389s6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0389s6 f1080 = new C0389s6();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo984(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090("it", jSONObject2);
        boolean z = C0463y2.f1203;
        int i = 4;
        "json";
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("notes") : null;
        if (jSONArrayOptJSONArray != null) {
            int i2 = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray)) {
                int iM1169 = C0330o.m1169(jSONArrayOptJSONArray);
                while (-1 < iM1169) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject2 != null) {
                        if (C0463y2.f1873.length() > 0) {
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("user");
                            String strOptString = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("nickname") : null;
                            if (strOptString == null) {
                                strOptString = "";
                            }
                            if (strOptString.length() > 0) {
                                String str = C0463y2.f1873;
                                EnumC0417u8[] enumC0417u8Arr = EnumC0417u8.f1140;
                                C0237h4.m1090("pattern", str);
                                Pattern patternCompile = Pattern.compile(str, 66);
                                C0237h4.m1089("compile(...)", patternCompile);
                                if (patternCompile.matcher(strOptString).find()) {
                                    jSONArrayOptJSONArray.remove(iM1169);
                                } else {
                                    if (C0463y2.f1872.length() > 0) {
                                        String strOptString2 = jSONObjectOptJSONObject2.optString("title");
                                        String str2 = strOptString2 != null ? strOptString2 : "";
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
                    iM1169--;
                    i = 4;
                }
            }
        }
        return jSONObject2;
    }
}
