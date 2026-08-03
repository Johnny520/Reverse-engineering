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
        C0237h4.m1090(C0341oa.m915(new byte[]{-116, 109}, new byte[]{-27, 25, -73, -50, 53, -43}), jSONObject2);
        boolean z = C0463y2.f1203;
        int i = 4;
        C0341oa.m915(new byte[]{15, 106, 49, -109}, new byte[]{101, 25, 94, -3, 16, -101});
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0341oa.m915(new byte[]{117, -124, 20, 105}, new byte[]{17, -27, 96, 8, 44, 88}));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(C0341oa.m915(new byte[]{119, 84, 26, 85, -36}, new byte[]{25, 59, 110, 48, -81, 5})) : null;
        if (jSONArrayOptJSONArray != null) {
            int i2 = C0330o.f1000;
            if (C0330o.m1166(jSONArrayOptJSONArray)) {
                int iM1169 = C0330o.m1169(jSONArrayOptJSONArray);
                while (-1 < iM1169) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(iM1169);
                    if (jSONObjectOptJSONObject2 != null) {
                        if (C0463y2.f1873.length() > 0) {
                            byte[] bArr = new byte[i];
                            // fill-array-data instruction
                            bArr[0] = 127;
                            bArr[1] = -121;
                            bArr[2] = 36;
                            bArr[3] = 14;
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C0341oa.m915(bArr, new byte[]{10, -12, 65, 124, 42, 51}));
                            String strOptString = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString(C0341oa.m915(new byte[]{-27, 50, -51, 51, 29, -98, -26, 62}, new byte[]{-117, 91, -82, 88, 115, -1})) : null;
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
                                        String strOptString2 = jSONObjectOptJSONObject2.optString(C0341oa.m915(new byte[]{-9, 66, 123, -87, 59}, new byte[]{-125, 43, 15, -59, 94, 4}));
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
