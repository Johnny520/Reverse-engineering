package gb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: gb.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1394r {

    /* JADX INFO: renamed from: a */
    public final String f4634a;

    /* JADX INFO: renamed from: b */
    public final String f4635b;

    /* JADX INFO: renamed from: c */
    public final String f4636c;

    /* JADX INFO: renamed from: d */
    public final String f4637d;

    /* JADX INFO: renamed from: e */
    public final String f4638e;

    /* JADX INFO: renamed from: f */
    public final String f4639f;

    /* JADX INFO: renamed from: g */
    public final String f4640g;

    /* JADX INFO: renamed from: h */
    public final String f4641h;

    /* JADX INFO: renamed from: i */
    public final String f4642i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f4643j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1394r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList) {
        str6.getClass();
        this.f4634a = str;
        this.f4635b = str2;
        this.f4636c = str3;
        this.f4637d = str4;
        this.f4638e = str5;
        this.f4639f = str6;
        this.f4640g = str7;
        this.f4641h = str8;
        this.f4642i = str9;
        this.f4643j = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final JSONObject m3800a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourcePluginId", this.f4634a);
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            if (str != null) {
                jSONObject.put("pluginId", str);
            }
        }
        jSONObject.put("displayName", this.f4635b);
        jSONObject.put("author", this.f4636c);
        String str2 = this.f4637d;
        if (AbstractC3149m.m6721t0(str2)) {
            str2 = "1.0.0";
        }
        jSONObject.put("versionName", str2);
        jSONObject.put("releaseNotes", this.f4639f);
        jSONObject.put("uploaderWxId", this.f4640g);
        jSONObject.put("uploaderWeChatId", this.f4641h);
        jSONObject.put("uploaderNickname", this.f4642i);
        JSONArray jSONArray = new JSONArray();
        for (C1383g c1383g : this.f4643j) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", c1383g.f4590a);
            jSONObject2.put("content", c1383g.f4591b);
            jSONObject2.put("encoding", c1383g.f4594e);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("files", jSONArray);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1394r)) {
            return false;
        }
        C1394r c1394r = (C1394r) obj;
        return this.f4634a.equals(c1394r.f4634a) && this.f4635b.equals(c1394r.f4635b) && this.f4636c.equals(c1394r.f4636c) && this.f4637d.equals(c1394r.f4637d) && this.f4638e.equals(c1394r.f4638e) && AbstractC1416l.m3825a(this.f4639f, c1394r.f4639f) && this.f4640g.equals(c1394r.f4640g) && this.f4641h.equals(c1394r.f4641h) && this.f4642i.equals(c1394r.f4642i) && this.f4643j.equals(c1394r.f4643j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4643j.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4634a.hashCode() * 31, 31, this.f4635b), 31, this.f4636c), 31, this.f4637d), 31, this.f4638e), 31, this.f4639f), 31, this.f4640g), 31, this.f4641h), 31, this.f4642i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketUploadPackage(localPluginId=", this.f4634a, ", name=", this.f4635b, ", author=");
        AbstractC2091b.m5173t(sbM1027p, this.f4636c, ", version=", this.f4637d, ", updateTime=");
        AbstractC2091b.m5173t(sbM1027p, this.f4638e, ", releaseNotes=", this.f4639f, ", uploaderWxId=");
        AbstractC2091b.m5173t(sbM1027p, this.f4640g, ", uploaderWeChatId=", this.f4641h, ", uploaderNickname=");
        sbM1027p.append(this.f4642i);
        sbM1027p.append(", files=");
        sbM1027p.append(this.f4643j);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
