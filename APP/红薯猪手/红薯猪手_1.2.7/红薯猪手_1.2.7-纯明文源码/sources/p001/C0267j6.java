package p001;

import org.json.JSONArray;
import org.json.JSONObject;
import p001.C0463y2;

/* JADX INFO: renamed from: ۟.j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0267j6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0267j6 f876 = new C0267j6();

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Object mo984(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090("it", jSONObject2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("comments") : null;
        boolean z = C0463y2.f1203;
        C0463y2.a.m965(jSONArrayOptJSONArray);
        return jSONObject2;
    }
}
