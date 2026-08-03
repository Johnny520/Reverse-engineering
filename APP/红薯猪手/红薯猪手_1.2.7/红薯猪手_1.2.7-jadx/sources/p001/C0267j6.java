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
        C0237h4.m1090(C0341oa.m915(new byte[]{67, 47}, new byte[]{42, 91, -123, 72, 41, -84}), jSONObject2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0341oa.m915(new byte[]{28, 117, -52, -50}, new byte[]{120, 20, -72, -81, 54, 28}));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(C0341oa.m915(new byte[]{108, -42, 94, 53, 39, 25, 123, -54}, new byte[]{15, -71, 51, 88, 66, 119})) : null;
        boolean z = C0463y2.f1203;
        C0463y2.a.m965(jSONArrayOptJSONArray);
        return jSONObject2;
    }
}
