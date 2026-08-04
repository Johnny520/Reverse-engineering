package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᲁᛶᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2270 implements Serializable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f11189;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f11190;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f11191;

    public C2270(Object obj, String str, String str2) {
        this.f11190 = obj;
        this.f11191 = str;
        this.f11189 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2270)) {
            return false;
        }
        C2270 c2270 = (C2270) obj;
        return this.f11190.equals(c2270.f11190) && AbstractC1544.m3188(this.f11191, c2270.f11191) && AbstractC1544.m3188(this.f11189, c2270.f11189);
    }

    public final int hashCode() {
        int iHashCode = this.f11190.hashCode() * 31;
        Object obj = this.f11191;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f11189;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f11190 + ", " + this.f11191 + ", " + this.f11189 + ')';
    }
}
