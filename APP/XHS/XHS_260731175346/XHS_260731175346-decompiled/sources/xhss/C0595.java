package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0595 {

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f2056 = null;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f2057 = null;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f2058 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f2059 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f2060;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final long f2061;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f2062;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f2063;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final boolean f2064;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean f2065;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final java.lang.String f2066;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean f2067;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String f2068;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean f2069;

    static {
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xhss.C0595.f2059 = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xhss.C0595.f2056 = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xhss.C0595.f2057 = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xhss.C0595.f2058 = r0
            return
    }

    public C0595(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f2063 = r1
            r0.f2060 = r2
            r0.f2061 = r3
            r0.f2068 = r5
            r0.f2062 = r6
            r0.f2069 = r7
            r0.f2067 = r8
            r0.f2065 = r9
            r0.f2064 = r10
            r0.f2066 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof xhss.C0595
            if (r0 == 0) goto L5a
            xhss.ᛶᲁᛸᲇ r5 = (xhss.C0595) r5
            java.lang.String r0 = r5.f2063
            java.lang.String r1 = r4.f2063
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.f2060
            java.lang.String r1 = r4.f2060
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            long r0 = r5.f2061
            long r2 = r4.f2061
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5a
            java.lang.String r0 = r5.f2068
            java.lang.String r1 = r4.f2068
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.f2062
            java.lang.String r1 = r4.f2062
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            boolean r0 = r5.f2069
            boolean r1 = r4.f2069
            if (r0 != r1) goto L5a
            boolean r0 = r5.f2067
            boolean r1 = r4.f2067
            if (r0 != r1) goto L5a
            boolean r0 = r5.f2065
            boolean r1 = r4.f2065
            if (r0 != r1) goto L5a
            boolean r0 = r5.f2064
            boolean r1 = r4.f2064
            if (r0 != r1) goto L5a
            java.lang.String r5 = r5.f2066
            java.lang.String r4 = r4.f2066
            boolean r4 = xhss.AbstractC0007.m97(r5, r4)
            if (r4 == 0) goto L5a
            r4 = 1
            return r4
        L5a:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f2063
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.lang.String r1 = r4.f2060
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f2061
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f2068
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.f2062
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r4.f2069
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.f2067
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r4.f2065
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.f2064
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r4 = r4.f2066
            if (r4 == 0) goto L5b
            int r4 = r4.hashCode()
            goto L5c
        L5b:
            r4 = 0
        L5c:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r5.f2063
            r0.<init>(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r5.f2060
            r0.append(r1)
            boolean r1 = r5.f2065
            if (r1 == 0) goto L3c
            r1 = -9223372036854775808
            long r3 = r5.f2061
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
            xhss.ᲀᛷᲇᛲ r2 = xhss.AbstractC0736.f2468
            java.lang.Object r2 = r2.get()
            java.text.DateFormat r2 = (java.text.DateFormat) r2
            java.lang.String r1 = r2.format(r1)
            r0.append(r1)
        L3c:
            boolean r1 = r5.f2064
            if (r1 != 0) goto L4a
            java.lang.String r1 = "; domain="
            r0.append(r1)
            java.lang.String r1 = r5.f2068
            r0.append(r1)
        L4a:
            java.lang.String r1 = "; path="
            r0.append(r1)
            java.lang.String r1 = r5.f2062
            r0.append(r1)
            boolean r1 = r5.f2069
            if (r1 == 0) goto L5d
            java.lang.String r1 = "; secure"
            r0.append(r1)
        L5d:
            boolean r1 = r5.f2067
            if (r1 == 0) goto L66
            java.lang.String r1 = "; httponly"
            r0.append(r1)
        L66:
            java.lang.String r5 = r5.f2066
            if (r5 == 0) goto L72
            java.lang.String r1 = "; samesite="
            r0.append(r1)
            r0.append(r5)
        L72:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
