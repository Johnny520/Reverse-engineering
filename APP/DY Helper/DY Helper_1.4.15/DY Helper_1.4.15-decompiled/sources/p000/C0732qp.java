package p000;

/* JADX INFO: renamed from: qp */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0732qp {

    /* JADX INFO: renamed from: λ */
    public static final java.util.regex.Pattern f9060 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.util.regex.Pattern f9061 = null;

    /* JADX INFO: renamed from: ν */
    public static final java.util.regex.Pattern f9062 = null;

    /* JADX INFO: renamed from: ξ */
    public static final java.util.regex.Pattern f9063 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.String f9064;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f9065;

    /* JADX INFO: renamed from: γ */
    public final long f9066;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9067;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f9068;

    /* JADX INFO: renamed from: ζ */
    public final boolean f9069;

    /* JADX INFO: renamed from: η */
    public final boolean f9070;

    /* JADX INFO: renamed from: θ */
    public final boolean f9071;

    /* JADX INFO: renamed from: ι */
    public final boolean f9072;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f9073;

    static {
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p000.C0732qp.f9060 = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p000.C0732qp.f9061 = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p000.C0732qp.f9062 = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p000.C0732qp.f9063 = r0
            return
    }

    public C0732qp(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f9064 = r1
            r0.f9065 = r2
            r0.f9066 = r3
            r0.f9067 = r5
            r0.f9068 = r6
            r0.f9069 = r7
            r0.f9070 = r8
            r0.f9071 = r9
            r0.f9072 = r10
            r0.f9073 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof p000.C0732qp
            if (r0 == 0) goto L5a
            qp r5 = (p000.C0732qp) r5
            java.lang.String r0 = r5.f9064
            java.lang.String r1 = r4.f9064
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.f9065
            java.lang.String r1 = r4.f9065
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            long r0 = r5.f9066
            long r2 = r4.f9066
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5a
            java.lang.String r0 = r5.f9067
            java.lang.String r1 = r4.f9067
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.f9068
            java.lang.String r1 = r4.f9068
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            boolean r0 = r5.f9069
            boolean r1 = r4.f9069
            if (r0 != r1) goto L5a
            boolean r0 = r5.f9070
            boolean r1 = r4.f9070
            if (r0 != r1) goto L5a
            boolean r0 = r5.f9071
            boolean r1 = r4.f9071
            if (r0 != r1) goto L5a
            boolean r0 = r5.f9072
            boolean r1 = r4.f9072
            if (r0 != r1) goto L5a
            java.lang.String r5 = r5.f9073
            java.lang.String r4 = r4.f9073
            boolean r4 = p000.ln0.m3626(r5, r4)
            if (r4 == 0) goto L5a
            r4 = 1
            return r4
        L5a:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            r0 = 527(0x20f, float:7.38E-43)
            r1 = 31
            java.lang.String r2 = r4.f9064
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f9065
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.f9066
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f9067
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f9068
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f9069
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f9070
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f9071
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f9072
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r4 = r4.f9073
            if (r4 == 0) goto L43
            int r4 = r4.hashCode()
            goto L44
        L43:
            r4 = 0
        L44:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f9064
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r5.f9065
            r0.append(r1)
            boolean r1 = r5.f9071
            if (r1 == 0) goto L42
            r1 = -9223372036854775808
            long r3 = r5.f9066
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L26
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L42
        L26:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            f3 r2 = p000.AbstractC0919vq.f11362
            java.lang.Object r2 = r2.get()
            java.text.DateFormat r2 = (java.text.DateFormat) r2
            java.lang.String r1 = r2.format(r1)
            r1.getClass()
            r0.append(r1)
        L42:
            boolean r1 = r5.f9072
            if (r1 != 0) goto L50
            java.lang.String r1 = "; domain="
            r0.append(r1)
            java.lang.String r1 = r5.f9067
            r0.append(r1)
        L50:
            java.lang.String r1 = "; path="
            r0.append(r1)
            java.lang.String r1 = r5.f9068
            r0.append(r1)
            boolean r1 = r5.f9069
            if (r1 == 0) goto L63
            java.lang.String r1 = "; secure"
            r0.append(r1)
        L63:
            boolean r1 = r5.f9070
            if (r1 == 0) goto L6c
            java.lang.String r1 = "; httponly"
            r0.append(r1)
        L6c:
            java.lang.String r5 = r5.f9073
            if (r5 == 0) goto L78
            java.lang.String r1 = "; samesite="
            r0.append(r1)
            r0.append(r5)
        L78:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
