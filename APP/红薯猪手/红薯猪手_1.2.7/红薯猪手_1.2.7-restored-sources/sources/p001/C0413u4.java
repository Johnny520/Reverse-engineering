package p001;

import org.json.JSONObject;
import p001.C0426v4;

/* JADX INFO: renamed from: ۟.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0413u4 {

    /* JADX INFO: renamed from: ۥ */
    public final C0426v4 f1125;

    /* JADX INFO: renamed from: ۟.u4$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static C0413u4 m946(String str) {
            "json";
            JSONObject jSONObject = new JSONObject(str);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("stream");
                C0426v4 c0426v4M950 = jSONObjectOptJSONObject != null ? C0426v4.a.m950(jSONObjectOptJSONObject) : null;
                jSONObject.optLong("video_id");
                return new C0413u4(c0426v4M950);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public C0413u4(C0426v4 c0426v4) {
        this.f1125 = c0426v4;
    }
}
