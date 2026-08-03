package p001;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p001.C0439w4;

/* JADX INFO: renamed from: ۟.v4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426v4 {

    /* JADX INFO: renamed from: ۥ */
    public final List<C0439w4> f1148;

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<C0439w4> f1149;

    /* JADX INFO: renamed from: ۟.v4$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static C0426v4 m950(JSONObject jSONObject) {
            "json";
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("h264");
            if (jSONArrayOptJSONArray != null) {
                int i = C0330o.f1000;
                if (jSONArrayOptJSONArray.length() > 0) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList.add(C0439w4.a.m956(jSONObjectOptJSONObject));
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("h265");
            if (jSONArrayOptJSONArray2 != null) {
                int i3 = C0330o.f1000;
                if (jSONArrayOptJSONArray2.length() > 0) {
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i4);
                        if (jSONObjectOptJSONObject2 != null) {
                            arrayList2.add(C0439w4.a.m956(jSONObjectOptJSONObject2));
                        }
                    }
                }
            }
            return new C0426v4(arrayList, arrayList2);
        }
    }

    public C0426v4(ArrayList arrayList, ArrayList arrayList2) {
        this.f1148 = arrayList;
        this.f1149 = arrayList2;
    }
}
