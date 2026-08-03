package p001;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۟.k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0281k6 extends AbstractC0335o4 implements InterfaceC0222g3<JSONObject, Object> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0211f6 f911;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f912;

    public C0281k6(C0211f6 c0211f6, String str) {
        this.f911 = c0211f6;
        this.f912 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Object mo984(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        C0237h4.m1090(C0341oa.m915(new byte[]{79, -75}, new byte[]{38, -63, -14, 41, 87, 123}), jSONObject2);
        C0211f6 c0211f6 = this.f911;
        String str = this.f912;
        ArrayList<C0250i3> arrayList = C0211f6.f1445;
        c0211f6.m1070(str, jSONObject2, false);
        return jSONObject2;
    }
}
