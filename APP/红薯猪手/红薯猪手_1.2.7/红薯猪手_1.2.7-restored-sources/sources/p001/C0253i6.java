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
        C0237h4.m1090("it", jSONObject2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            C0211f6 c0211f6 = this.f858;
            int i = 7;
            if (c0211f6.f1454) {
                jSONObjectOptJSONObject.remove("blocking");
                jSONObjectOptJSONObject.remove("blocked");
            }
            if (c0211f6.f1455) {
                String strOptString = jSONObjectOptJSONObject.optString("userid");
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
