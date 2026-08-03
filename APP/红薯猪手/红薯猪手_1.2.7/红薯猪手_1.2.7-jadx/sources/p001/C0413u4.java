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
            C0341oa.m915(new byte[]{53, -111, -122, 106}, new byte[]{95, -30, -23, 4, -72, -72});
            JSONObject jSONObject = new JSONObject(str);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0341oa.m915(new byte[]{73, -128, -49, -15, -67, 66}, new byte[]{58, -12, -67, -108, -36, 47}));
                C0426v4 c0426v4M950 = jSONObjectOptJSONObject != null ? C0426v4.a.m950(jSONObjectOptJSONObject) : null;
                jSONObject.optLong(C0341oa.m915(new byte[]{-86, -25, -93, -36, 66, 125, -75, -22}, new byte[]{-36, -114, -57, -71, 45, 34}));
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
