package p001;

import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.w4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439w4 {

    /* JADX INFO: renamed from: ۥ */
    public final String f1168;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f1169;

    /* JADX INFO: renamed from: ۟.w4$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static C0439w4 m956(JSONObject jSONObject) {
            "json";
            return new C0439w4(jSONObject.optString("master_url"), jSONObject.optString("format"));
        }
    }

    public C0439w4(String str, String str2) {
        this.f1168 = str;
        this.f1169 = str2;
    }
}
