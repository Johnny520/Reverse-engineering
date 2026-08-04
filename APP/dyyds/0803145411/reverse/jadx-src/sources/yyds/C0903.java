package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛸᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0903 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f4115;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f4116;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f4117 = false;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f4118;

    public C0903(int i, Class cls, Object obj) {
        this.f4115 = cls;
        this.f4116 = obj;
        this.f4118 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0903)) {
            return false;
        }
        C0903 c0903 = (C0903) obj;
        return AbstractC1544.m3188(this.f4115, c0903.f4115) && AbstractC1544.m3188(this.f4116, c0903.f4116) && this.f4117 == c0903.f4117 && this.f4118 == c0903.f4118;
    }

    public final int hashCode() {
        int iHashCode = this.f4115.hashCode() * 31;
        Object obj = this.f4116;
        return AbstractC2104.m4012(this.f4118) + AbstractC2104.m4021((iHashCode + (obj == null ? 0 : obj.hashCode())) * 961, 31, this.f4117);
    }

    public final String toString() {
        boolean z = this.f4117;
        int i = this.f4118;
        StringBuilder sb = new StringBuilder("Configuration(declaringClass=");
        sb.append(this.f4115);
        sb.append(", memberInstance=");
        sb.append(this.f4116);
        sb.append(", processorResolver=null, superclass=");
        sb.append(z);
        sb.append(", optional=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SILENT" : "NOTICE" : "NO");
        sb.append(")");
        return sb.toString();
    }
}
