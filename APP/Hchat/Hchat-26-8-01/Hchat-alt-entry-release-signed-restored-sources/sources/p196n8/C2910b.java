package p196n8;

import gg.AbstractC1416l;
import org.json.JSONObject;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: n8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2910b {

    /* JADX INFO: renamed from: a */
    public final int f9401a;

    /* JADX INFO: renamed from: b */
    public final String f9402b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f9403c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2910b(int i9, String str, JSONObject jSONObject) {
        this.f9401a = i9;
        this.f9402b = str;
        this.f9403c = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2910b)) {
            return false;
        }
        C2910b c2910b = (C2910b) obj;
        return this.f9401a == c2910b.f9401a && this.f9402b.equals(c2910b.f9402b) && AbstractC1416l.m3825a(this.f9403c, c2910b.f9403c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(Integer.hashCode(this.f9401a) * 31, 31, this.f9402b);
        JSONObject jSONObject = this.f9403c;
        return iM2244g + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "QueryResult(errorCode=" + this.f9401a + ", errorMessage=" + this.f9402b + ", response=" + this.f9403c + ")";
    }
}
