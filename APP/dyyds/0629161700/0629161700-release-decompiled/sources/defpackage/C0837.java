package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0837 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f3845 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f3846 = null;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f3847 = null;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f3848 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean f3849;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean f3850;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f3851;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f3852;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long f3853;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f3854;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.String f3855;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3856;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f3857;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f3858;

    static {
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.C0837.f3845 = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.C0837.f3846 = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.C0837.f3847 = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.C0837.f3848 = r0
            return
    }

    public C0837(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f3854 = r1
            r0.f3856 = r2
            r0.f3853 = r3
            r0.f3852 = r5
            r0.f3851 = r6
            r0.f3857 = r7
            r0.f3858 = r8
            r0.f3849 = r9
            r0.f3850 = r10
            r0.f3855 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C0837
            if (r0 == 0) goto L5a
            ᛵᛲᛸᛸ r5 = (defpackage.C0837) r5
            java.lang.String r0 = r5.f3854
            java.lang.String r1 = r4.f3854
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.f3856
            java.lang.String r1 = r4.f3856
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            long r0 = r5.f3853
            long r2 = r4.f3853
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5a
            java.lang.String r0 = r5.f3852
            java.lang.String r1 = r4.f3852
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.f3851
            java.lang.String r1 = r4.f3851
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            boolean r0 = r5.f3857
            boolean r1 = r4.f3857
            if (r0 != r1) goto L5a
            boolean r0 = r5.f3858
            boolean r1 = r4.f3858
            if (r0 != r1) goto L5a
            boolean r0 = r5.f3849
            boolean r1 = r4.f3849
            if (r0 != r1) goto L5a
            boolean r0 = r5.f3850
            boolean r1 = r4.f3850
            if (r0 != r1) goto L5a
            java.lang.String r5 = r5.f3855
            java.lang.String r4 = r4.f3855
            boolean r4 = defpackage.AbstractC0498.m1280(r5, r4)
            if (r4 == 0) goto L5a
            r4 = 1
            return r4
        L5a:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f3854
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = defpackage.AbstractC1124.m2153(r0, r1, r2)
            java.lang.String r1 = r5.f3856
            int r0 = defpackage.AbstractC1124.m2153(r1, r0, r2)
            long r3 = r5.f3853
            int r1 = java.lang.Long.hashCode(r3)
            int r1 = r1 + r0
            int r1 = r1 * r2
            java.lang.String r0 = r5.f3852
            int r0 = defpackage.AbstractC1124.m2153(r0, r1, r2)
            java.lang.String r1 = r5.f3851
            int r0 = defpackage.AbstractC1124.m2153(r1, r0, r2)
            boolean r1 = r5.f3857
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * r2
            boolean r0 = r5.f3858
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            boolean r1 = r5.f3849
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * r2
            boolean r0 = r5.f3850
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r5 = r5.f3855
            if (r5 == 0) goto L4d
            int r5 = r5.hashCode()
            goto L4e
        L4d:
            r5 = 0
        L4e:
            int r0 = r0 + r5
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r5.f3854
            r0.<init>(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r5.f3856
            r0.append(r1)
            boolean r1 = r5.f3849
            if (r1 == 0) goto L3c
            r1 = -9223372036854775808
            long r3 = r5.f3853
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L23
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L3c
        L23:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            ᲈᛳᲇᲈ r2 = defpackage.AbstractC0609.f2996
            java.lang.Object r2 = r2.get()
            java.text.DateFormat r2 = (java.text.DateFormat) r2
            java.lang.String r1 = r2.format(r1)
            r0.append(r1)
        L3c:
            boolean r1 = r5.f3850
            if (r1 != 0) goto L4a
            java.lang.String r1 = "; domain="
            r0.append(r1)
            java.lang.String r1 = r5.f3852
            r0.append(r1)
        L4a:
            java.lang.String r1 = "; path="
            r0.append(r1)
            java.lang.String r1 = r5.f3851
            r0.append(r1)
            boolean r1 = r5.f3857
            if (r1 == 0) goto L5d
            java.lang.String r1 = "; secure"
            r0.append(r1)
        L5d:
            boolean r1 = r5.f3858
            if (r1 == 0) goto L66
            java.lang.String r1 = "; httponly"
            r0.append(r1)
        L66:
            java.lang.String r5 = r5.f3855
            if (r5 == 0) goto L72
            java.lang.String r1 = "; samesite="
            r0.append(r1)
            r0.append(r5)
        L72:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
