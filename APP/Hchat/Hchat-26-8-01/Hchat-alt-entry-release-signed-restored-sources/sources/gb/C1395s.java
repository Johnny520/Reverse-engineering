package gb;

import org.json.JSONException;
import org.json.JSONObject;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: gb.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1395s {

    /* JADX INFO: renamed from: a */
    public final String f4644a;

    /* JADX INFO: renamed from: b */
    public final String f4645b;

    /* JADX INFO: renamed from: c */
    public final String f4646c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1395s(String str, String str2, String str3) {
        this.f4644a = str;
        this.f4645b = str2;
        this.f4646c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final JSONObject m3801a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userWxId", this.f4644a);
        jSONObject.put("userWeChatId", this.f4645b);
        jSONObject.put("userNickname", this.f4646c);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1395s)) {
            return false;
        }
        C1395s c1395s = (C1395s) obj;
        return this.f4644a.equals(c1395s.f4644a) && this.f4645b.equals(c1395s.f4645b) && this.f4646c.equals(c1395s.f4646c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4646c.hashCode() + AbstractC0921a.m2244g(this.f4644a.hashCode() * 31, 31, this.f4645b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("PluginMarketUserIdentity(wxId=", this.f4644a, ", weChatId=", this.f4645b, ", nickname="), this.f4646c, ")");
    }
}
