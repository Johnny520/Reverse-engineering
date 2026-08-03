package p000a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.kf */
/* JADX INFO: loaded from: classes.dex */
public final class C0675kf {

    /* JADX INFO: renamed from: m */
    public static final a f2513m = new a();

    /* JADX INFO: renamed from: a */
    public final String f2514a;

    /* JADX INFO: renamed from: b */
    public final String f2515b;

    /* JADX INFO: renamed from: c */
    public final String f2516c;

    /* JADX INFO: renamed from: d */
    public final String f2517d;

    /* JADX INFO: renamed from: e */
    public final String f2518e;

    /* JADX INFO: renamed from: f */
    public final String f2519f;

    /* JADX INFO: renamed from: g */
    public final String f2520g;

    /* JADX INFO: renamed from: h */
    public final String f2521h;

    /* JADX INFO: renamed from: i */
    public final String f2522i;

    /* JADX INFO: renamed from: j */
    public final List<String> f2523j;

    /* JADX INFO: renamed from: k */
    public final long f2524k;

    /* JADX INFO: renamed from: l */
    public final long f2525l;

    /* JADX INFO: renamed from: a.kf$a */
    public static final class a {
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x00e9 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v20, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v24, types: [a.Y5] */
        /* JADX INFO: renamed from: a */
        public static C0675kf m1545a(JSONObject jSONObject) {
            ?? arrayList;
            String strOptString = jSONObject.optString("loaderClass", "");
            C0631i9.m1479b(strOptString);
            String str = (strOptString.length() <= 0 || strOptString.equals("null")) ? null : strOptString;
            String strOptString2 = jSONObject.optString("loaderMethod", "");
            C0631i9.m1479b(strOptString2);
            String str2 = (strOptString2.length() <= 0 || strOptString2.equals("null")) ? null : strOptString2;
            String strOptString3 = jSONObject.optString("loaderParamType", "");
            C0631i9.m1479b(strOptString3);
            String str3 = (strOptString3.length() <= 0 || strOptString3.equals("null")) ? null : strOptString3;
            String strOptString4 = jSONObject.optString("appClass", "");
            C0631i9.m1479b(strOptString4);
            String str4 = (strOptString4.length() <= 0 || strOptString4.equals("null")) ? null : strOptString4;
            String strOptString5 = jSONObject.optString("appEntryMethod", "");
            C0631i9.m1479b(strOptString5);
            String str5 = (strOptString5.length() <= 0 || strOptString5.equals("null")) ? null : strOptString5;
            String strOptString6 = jSONObject.optString("securityClass", "");
            C0631i9.m1479b(strOptString6);
            String str6 = (strOptString6.length() <= 0 || strOptString6.equals("null")) ? null : strOptString6;
            String strOptString7 = jSONObject.optString("securityMethod", "");
            C0631i9.m1479b(strOptString7);
            String str7 = (strOptString7.length() <= 0 || strOptString7.equals("null")) ? null : strOptString7;
            String strOptString8 = jSONObject.optString("patchServiceClass", "");
            C0631i9.m1479b(strOptString8);
            String str8 = (strOptString8.length() <= 0 || strOptString8.equals("null")) ? null : strOptString8;
            String strOptString9 = jSONObject.optString("patchServiceEntry", "");
            C0631i9.m1479b(strOptString9);
            String str9 = (strOptString9.length() <= 0 || strOptString9.equals("null")) ? null : strOptString9;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tinkerPathSegments");
            if (jSONArrayOptJSONArray == null) {
                arrayList = C0439Y5.f1645a;
            } else {
                C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(c0574f9M749D, 10));
                Iterator<Integer> it = c0574f9M749D.iterator();
                while (((C0555e9) it).f2095c) {
                    arrayList2.add(jSONArrayOptJSONArray.optString(((AbstractC0517c9) it).mo1278a(), ""));
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    String str10 = (String) obj;
                    C0631i9.m1479b(str10);
                    if (str10.length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            return new C0675kf(str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, jSONObject.optLong("locatedAtMs", 0L), jSONObject.optLong("wxVersionCode", 0L));
        }
    }

    public C0675kf(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, long j, long j2) {
        this.f2514a = str;
        this.f2515b = str2;
        this.f2516c = str3;
        this.f2517d = str4;
        this.f2518e = str5;
        this.f2519f = str6;
        this.f2520g = str7;
        this.f2521h = str8;
        this.f2522i = str9;
        this.f2523j = list;
        this.f2524k = j;
        this.f2525l = j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1543a() {
        return (this.f2514a == null || this.f2515b == null || this.f2517d == null || this.f2519f == null || this.f2520g == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m1544b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = this.f2514a;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("loaderClass", obj);
        Object obj2 = this.f2515b;
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("loaderMethod", obj2);
        Object obj3 = this.f2516c;
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("loaderParamType", obj3);
        Object obj4 = this.f2517d;
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("appClass", obj4);
        Object obj5 = this.f2518e;
        if (obj5 == null) {
            obj5 = JSONObject.NULL;
        }
        jSONObject.put("appEntryMethod", obj5);
        Object obj6 = this.f2519f;
        if (obj6 == null) {
            obj6 = JSONObject.NULL;
        }
        jSONObject.put("securityClass", obj6);
        Object obj7 = this.f2520g;
        if (obj7 == null) {
            obj7 = JSONObject.NULL;
        }
        jSONObject.put("securityMethod", obj7);
        Object obj8 = this.f2521h;
        if (obj8 == null) {
            obj8 = JSONObject.NULL;
        }
        jSONObject.put("patchServiceClass", obj8);
        Object obj9 = this.f2522i;
        if (obj9 == null) {
            obj9 = JSONObject.NULL;
        }
        jSONObject.put("patchServiceEntry", obj9);
        jSONObject.put("tinkerPathSegments", new JSONArray((Collection) this.f2523j));
        jSONObject.put("locatedAtMs", this.f2524k);
        jSONObject.put("wxVersionCode", this.f2525l);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0675kf)) {
            return false;
        }
        C0675kf c0675kf = (C0675kf) obj;
        return C0631i9.m1478a(this.f2514a, c0675kf.f2514a) && C0631i9.m1478a(this.f2515b, c0675kf.f2515b) && C0631i9.m1478a(this.f2516c, c0675kf.f2516c) && C0631i9.m1478a(this.f2517d, c0675kf.f2517d) && C0631i9.m1478a(this.f2518e, c0675kf.f2518e) && C0631i9.m1478a(this.f2519f, c0675kf.f2519f) && C0631i9.m1478a(this.f2520g, c0675kf.f2520g) && C0631i9.m1478a(this.f2521h, c0675kf.f2521h) && C0631i9.m1478a(this.f2522i, c0675kf.f2522i) && C0631i9.m1478a(this.f2523j, c0675kf.f2523j) && this.f2524k == c0675kf.f2524k && this.f2525l == c0675kf.f2525l;
    }

    public final int hashCode() {
        String str = this.f2514a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2515b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2516c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2517d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2518e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2519f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2520g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f2521h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f2522i;
        return Long.hashCode(this.f2525l) + ((Long.hashCode(this.f2524k) + ((this.f2523j.hashCode() + ((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TinkerSymbols(loaderClass=" + this.f2514a + ", loaderMethod=" + this.f2515b + ", loaderParamType=" + this.f2516c + ", appClass=" + this.f2517d + ", appEntryMethod=" + this.f2518e + ", securityClass=" + this.f2519f + ", securityMethod=" + this.f2520g + ", patchServiceClass=" + this.f2521h + ", patchServiceEntry=" + this.f2522i + ", tinkerPathSegments=" + this.f2523j + ", locatedAtMs=" + this.f2524k + ", wxVersionCode=" + this.f2525l + ")";
    }
}
