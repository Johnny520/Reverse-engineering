package p080fb;

import org.json.JSONObject;
import p304uf.C4333g;

/* JADX INFO: renamed from: fb.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1190x0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f4000a;

    /* JADX INFO: renamed from: b */
    public final C4333g f4001b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1190x0(JSONObject jSONObject, C4333g c4333g) {
        this.f4000a = jSONObject;
        this.f4001b = c4333g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190x0)) {
            return false;
        }
        C1190x0 c1190x0 = (C1190x0) obj;
        return this.f4000a.equals(c1190x0.f4000a) && this.f4001b.equals(c1190x0.f4001b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4001b.hashCode() + (this.f4000a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PreparedRequest(body=" + this.f4000a + ", headers=" + this.f4001b + ")";
    }
}
