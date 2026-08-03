package p001;

import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.h6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0239h6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public static final C0239h6 f832 = new C0239h6();

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Object mo984(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090("it", jSONObject2);
        jSONObject2.remove("data");
        return jSONObject2;
    }
}
