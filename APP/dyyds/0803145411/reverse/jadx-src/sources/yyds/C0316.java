package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛳᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f1676 = 0;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f1677;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public String f1678;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f1679;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f1680;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f1681;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f1682;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f1683;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean f1684;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean f1685;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean f1686;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f1687;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f1688;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f1689;

    static {
        C0135 c0135 = AbstractC0848.f3910;
        EnumC0426 enumC0426 = EnumC0426.SECONDS;
        long jM1924 = AbstractC0848.m1924(AbstractC1367.m2771(Integer.MAX_VALUE, enumC0426), enumC0426);
        if (jM1924 >= 0) {
            return;
        }
        C0188.m803(jM1924, "maxStale < 0: ");
    }

    public C0316(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f1681 = z;
        this.f1682 = z2;
        this.f1687 = i;
        this.f1689 = i2;
        this.f1680 = z3;
        this.f1688 = z4;
        this.f1683 = z5;
        this.f1677 = i3;
        this.f1679 = i4;
        this.f1686 = z6;
        this.f1684 = z7;
        this.f1685 = z8;
        this.f1678 = str;
    }

    public final String toString() {
        String str = this.f1678;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f1681) {
            sb.append("no-cache, ");
        }
        if (this.f1682) {
            sb.append("no-store, ");
        }
        int i = this.f1687;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f1689;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f1680) {
            sb.append("private, ");
        }
        if (this.f1688) {
            sb.append("public, ");
        }
        if (this.f1683) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f1677;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f1679;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f1686) {
            sb.append("only-if-cached, ");
        }
        if (this.f1684) {
            sb.append("no-transform, ");
        }
        if (this.f1685) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.f1678 = string;
        return string;
    }
}
