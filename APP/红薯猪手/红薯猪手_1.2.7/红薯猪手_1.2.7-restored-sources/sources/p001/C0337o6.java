package p001;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0337o6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0211f6 f1009;

    public C0337o6(C0211f6 c0211f6) {
        this.f1009 = c0211f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Object mo984(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090("it", jSONObject2);
        C0211f6 c0211f6 = this.f1009;
        ArrayList<C0250i3> arrayList = C0211f6.f1445;
        c0211f6.getClass();
        jSONObject2.put("data", (Object) null);
        return jSONObject2;
    }
}
