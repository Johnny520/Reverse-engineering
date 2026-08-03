package p000a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.ig */
/* JADX INFO: loaded from: classes.dex */
public final class C0638ig {

    /* JADX INFO: renamed from: m */
    public static final C0638ig f2329m = new C0638ig(0, "", 0, null, null, null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: a */
    public final long f2330a;

    /* JADX INFO: renamed from: b */
    public final String f2331b;

    /* JADX INFO: renamed from: c */
    public final int f2332c;

    /* JADX INFO: renamed from: d */
    public final String f2333d;

    /* JADX INFO: renamed from: e */
    public final String f2334e;

    /* JADX INFO: renamed from: f */
    public final String f2335f;

    /* JADX INFO: renamed from: g */
    public final String f2336g;

    /* JADX INFO: renamed from: h */
    public final String f2337h;

    /* JADX INFO: renamed from: i */
    public final String f2338i;

    /* JADX INFO: renamed from: j */
    public final String f2339j;

    /* JADX INFO: renamed from: k */
    public final String f2340k;

    /* JADX INFO: renamed from: l */
    public final Boolean f2341l;

    /* JADX INFO: renamed from: a.ig$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0638ig m1499a(JSONObject jSONObject) {
            long jOptLong = jSONObject.optLong("captureTimeMs", 0L);
            String strOptString = jSONObject.optString("versionName", "");
            C0631i9.m1481d(strOptString, "optString(...)");
            int iOptInt = jSONObject.optInt("versionCode", 0);
            String strOptString2 = jSONObject.optString("currentTag", "");
            C0631i9.m1479b(strOptString2);
            if (strOptString2.length() <= 0 || strOptString2.equals("null")) {
                strOptString2 = null;
            }
            String strOptString3 = jSONObject.optString("baselineTag", "");
            C0631i9.m1479b(strOptString3);
            String str = (strOptString3.length() <= 0 || strOptString3.equals("null")) ? null : strOptString3;
            String strOptString4 = jSONObject.optString("currentBuildTime", "");
            C0631i9.m1479b(strOptString4);
            String str2 = (strOptString4.length() <= 0 || strOptString4.equals("null")) ? null : strOptString4;
            String strOptString5 = jSONObject.optString("baselineBuildTime", "");
            C0631i9.m1479b(strOptString5);
            String str3 = (strOptString5.length() <= 0 || strOptString5.equals("null")) ? null : strOptString5;
            String strOptString6 = jSONObject.optString("currentRev", "");
            C0631i9.m1479b(strOptString6);
            String str4 = (strOptString6.length() <= 0 || strOptString6.equals("null")) ? null : strOptString6;
            String strOptString7 = jSONObject.optString("baselineRev", "");
            C0631i9.m1479b(strOptString7);
            String str5 = (strOptString7.length() <= 0 || strOptString7.equals("null")) ? null : strOptString7;
            String strOptString8 = jSONObject.optString("patchRev", "");
            C0631i9.m1479b(strOptString8);
            String str6 = (strOptString8.length() <= 0 || strOptString8.equals("null")) ? null : strOptString8;
            String strOptString9 = jSONObject.optString("baselineVersion", "");
            C0631i9.m1479b(strOptString9);
            return new C0638ig(jOptLong, strOptString, iOptInt, strOptString2, str, str2, str3, str4, str5, str6, (strOptString9.length() <= 0 || strOptString9.equals("null")) ? null : strOptString9, jSONObject.has("patchEnabled") ? Boolean.valueOf(jSONObject.optBoolean("patchEnabled")) : null);
        }
    }

    public C0638ig(long j, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
        this.f2330a = j;
        this.f2331b = str;
        this.f2332c = i;
        this.f2333d = str2;
        this.f2334e = str3;
        this.f2335f = str4;
        this.f2336g = str5;
        this.f2337h = str6;
        this.f2338i = str7;
        this.f2339j = str8;
        this.f2340k = str9;
        this.f2341l = bool;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1497a() {
        String str;
        String str2;
        String str3;
        String str4 = this.f2333d;
        if (str4 != null && (str3 = this.f2334e) != null && !C0631i9.m1478a(str4, str3)) {
            return true;
        }
        String str5 = this.f2337h;
        if (str5 != null && (str2 = this.f2338i) != null && !C0631i9.m1478a(str5, str2)) {
            return true;
        }
        String str6 = this.f2335f;
        return (str6 == null || (str = this.f2336g) == null || C0631i9.m1478a(str6, str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m1498b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("captureTimeMs", this.f2330a);
        jSONObject.put("versionName", this.f2331b);
        jSONObject.put("versionCode", this.f2332c);
        Object obj = this.f2333d;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("currentTag", obj);
        Object obj2 = this.f2334e;
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("baselineTag", obj2);
        Object obj3 = this.f2335f;
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("currentBuildTime", obj3);
        Object obj4 = this.f2336g;
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("baselineBuildTime", obj4);
        Object obj5 = this.f2337h;
        if (obj5 == null) {
            obj5 = JSONObject.NULL;
        }
        jSONObject.put("currentRev", obj5);
        Object obj6 = this.f2338i;
        if (obj6 == null) {
            obj6 = JSONObject.NULL;
        }
        jSONObject.put("baselineRev", obj6);
        Object obj7 = this.f2339j;
        if (obj7 == null) {
            obj7 = JSONObject.NULL;
        }
        jSONObject.put("patchRev", obj7);
        Object obj8 = this.f2340k;
        if (obj8 == null) {
            obj8 = JSONObject.NULL;
        }
        jSONObject.put("baselineVersion", obj8);
        Boolean bool = this.f2341l;
        if (bool != null) {
            jSONObject.put("patchEnabled", bool.booleanValue());
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0638ig)) {
            return false;
        }
        C0638ig c0638ig = (C0638ig) obj;
        return this.f2330a == c0638ig.f2330a && C0631i9.m1478a(this.f2331b, c0638ig.f2331b) && this.f2332c == c0638ig.f2332c && C0631i9.m1478a(this.f2333d, c0638ig.f2333d) && C0631i9.m1478a(this.f2334e, c0638ig.f2334e) && C0631i9.m1478a(this.f2335f, c0638ig.f2335f) && C0631i9.m1478a(this.f2336g, c0638ig.f2336g) && C0631i9.m1478a(this.f2337h, c0638ig.f2337h) && C0631i9.m1478a(this.f2338i, c0638ig.f2338i) && C0631i9.m1478a(this.f2339j, c0638ig.f2339j) && C0631i9.m1478a(this.f2340k, c0638ig.f2340k) && C0631i9.m1478a(this.f2341l, c0638ig.f2341l);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f2332c) + C0944z.m2222b(this.f2331b, Long.hashCode(this.f2330a) * 31, 31)) * 31;
        String str = this.f2333d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2334e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2335f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2336g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2337h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2338i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2339j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f2340k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.f2341l;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "VersionSnapshot(captureTimeMs=" + this.f2330a + ", versionName=" + this.f2331b + ", versionCode=" + this.f2332c + ", currentTag=" + this.f2333d + ", baselineTag=" + this.f2334e + ", currentBuildTime=" + this.f2335f + ", baselineBuildTime=" + this.f2336g + ", currentRev=" + this.f2337h + ", baselineRev=" + this.f2338i + ", patchRev=" + this.f2339j + ", baselineVersion=" + this.f2340k + ", patchEnabled=" + this.f2341l + ")";
    }
}
