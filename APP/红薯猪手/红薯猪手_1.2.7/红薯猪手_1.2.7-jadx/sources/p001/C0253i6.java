package p001;

import org.json.JSONObject;
import p001.AbstractC0356q;

/* JADX INFO: renamed from: ۟.i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0253i6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0211f6 f858;

    public C0253i6(C0211f6 c0211f6) {
        this.f858 = c0211f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Object mo984(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090(C0341oa.m915(new byte[]{94, 123}, new byte[]{55, 15, -113, 79, 119, -5}), jSONObject2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0341oa.m915(new byte[]{-116, -11, -41, 79}, new byte[]{-24, -108, -93, 46, -15, 77}));
        if (jSONObjectOptJSONObject != null) {
            C0211f6 c0211f6 = this.f858;
            int i = 7;
            if (c0211f6.f1454) {
                jSONObjectOptJSONObject.remove(C0341oa.m915(new byte[]{-25, -61, 35, 118, -87, 47, -21, -56}, new byte[]{-123, -81, 76, 21, -62, 70}));
                jSONObjectOptJSONObject.remove(C0341oa.m915(new byte[]{-50, -33, 94, 82, -79, 37, -56}, new byte[]{-84, -77, 49, 49, -38, 64}));
            }
            if (c0211f6.f1455) {
                String strOptString = jSONObjectOptJSONObject.optString(C0341oa.m915(new byte[]{-75, 82, 100, 111, 56, -55}, new byte[]{-64, 33, 1, 29, 81, -83}));
                C0237h4.m865(strOptString);
                if (strOptString.length() > 0) {
                    C0286kb c0286kb = AbstractC0356q.f1031;
                    AbstractC0356q.c.m1191().execute(new RunnableC0258ib(strOptString, jSONObjectOptJSONObject, i));
                }
            }
        }
        return jSONObject2;
    }
}
