package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛲᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f9755;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f9756;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f9757;

    public C1939(String str, String str2, boolean z) {
        AbstractC2328.m4341(-692086307980142L);
        this.f9755 = z;
        this.f9756 = str;
        this.f9757 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1939)) {
            return false;
        }
        C1939 c1939 = (C1939) obj;
        return this.f9755 == c1939.f9755 && AbstractC1544.m3188(this.f9756, c1939.f9756) && AbstractC1544.m3188(this.f9757, c1939.f9757);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f9756, Boolean.hashCode(this.f9755) * 31, 31);
        String str = this.f9757;
        return iM1997 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-692155027456878L));
        AbstractC2104.m4017(sb, this.f9755, -692288171443054L);
        AbstractC0897.m2002(sb, this.f9756, -692335416083310L);
        return AbstractC0897.m2000(sb, this.f9757, ')');
    }

    public /* synthetic */ C1939(String str) {
        this(str, null, false);
    }
}
