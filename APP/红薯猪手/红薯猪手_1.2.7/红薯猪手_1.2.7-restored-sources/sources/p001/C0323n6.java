package p001;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0323n6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0211f6 f992;

    public C0323n6(C0211f6 c0211f6) {
        this.f992 = c0211f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo984(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090("it", jSONObject2);
        C0211f6 c0211f6 = this.f992;
        ArrayList<C0250i3> arrayList = C0211f6.f1445;
        c0211f6.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            int i = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray)) {
                for (int iM1169 = C0330o.m1169(jSONArrayOptJSONArray); -1 < iM1169; iM1169--) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject != null && C0463y2.f1203) {
                        if (C0463y2.f1873.length() > 0) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("user");
                            String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("nickname") : null;
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
                                }
                            }
                        } else if (C0463y2.f1872.length() > 0) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("title");
                            String str2 = strOptString2 != null ? strOptString2 : "";
                            if (str2.length() > 0) {
                                String str3 = C0463y2.f1872;
                                EnumC0417u8[] enumC0417u8Arr2 = EnumC0417u8.f1140;
                                C0237h4.m1090("pattern", str3);
                                Pattern patternCompile2 = Pattern.compile(str3, 66);
                                C0237h4.m1089("compile(...)", patternCompile2);
                                if (patternCompile2.matcher(str2).find()) {
                                    jSONArrayOptJSONArray.remove(iM1169);
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
