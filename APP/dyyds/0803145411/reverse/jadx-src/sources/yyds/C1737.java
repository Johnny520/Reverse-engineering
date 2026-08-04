package yyds;

import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛸᛳᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1737 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final JSONObject f8784;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f8785;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f8786;

    public C1737(JSONObject jSONObject, int i, int i2) {
        AbstractC2328.m4341(-525888253494126L);
        this.f8784 = jSONObject;
        this.f8785 = i;
        this.f8786 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737)) {
            return false;
        }
        C1737 c1737 = (C1737) obj;
        return this.f8784.equals(c1737.f8784) && this.f8785 == c1737.f8785 && this.f8786 == c1737.f8786;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8786) + AbstractC2104.m4018(this.f8785, this.f8784.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-525931203167086L));
        sb.append(this.f8784);
        sb.append(AbstractC2328.m4341(-526004217611118L));
        AbstractC2104.m4007(sb, this.f8785, -526060052185966L);
        return AbstractC0897.m1999(sb, this.f8786, ')');
    }
}
